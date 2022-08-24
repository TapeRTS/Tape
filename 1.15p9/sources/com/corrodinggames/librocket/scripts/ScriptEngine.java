package com.corrodinggames.librocket.scripts;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.p008a.RunnableC0069a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/ScriptEngine.class */
public class ScriptEngine {
    AbstractC0048b slickLibRocket;
    static ScriptEngine scriptEngine;
    public static boolean inDebugScript;
    static boolean mainScriptThreadMarked;
    static ThreadLocal isMainScriptThread = new C00661();
    static Throwable scriptError;
    static String scriptErrorMessage;
    ArrayList queuedScripts = new ArrayList();
    ArrayList runningScripts = new ArrayList();
    HashMap globals = new HashMap();
    private Root root = new Root();

    public static boolean isStrict() {
        if (RunnableC0069a.m7033a()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.corrodinggames.librocket.scripts.ScriptEngine$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/ScriptEngine$1.class */
    final class C00661 extends ThreadLocal {
        C00661() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: initialValue */
        public Boolean m7553initialValue() {
            return false;
        }
    }

    public static void checkThreadAccess() {
        if (!((Boolean) isMainScriptThread.get()).booleanValue()) {
            GameEngine.m1145b("ScriptEngine: thread is not marked as main script thread!");
            GameEngine.m1216S();
        }
    }

    public Root getRoot() {
        checkThreadAccess();
        return this.root;
    }

    public Root getRootNoCheck() {
        return this.root;
    }

    public static ScriptEngine getInstance() {
        return scriptEngine;
    }

    public static ScriptEngine createScriptEngine(AbstractC0048b abstractC0048b) {
        if (scriptEngine != null) {
            throw new RuntimeException("scriptEngine already exists");
        }
        scriptEngine = new ScriptEngine(abstractC0048b);
        return scriptEngine;
    }

    private ScriptEngine(AbstractC0048b abstractC0048b) {
        this.slickLibRocket = abstractC0048b;
        setupScriptContext(this.root);
        setGlobalVariable("root", this.root);
        Multiplayer multiplayer = new Multiplayer(this.root);
        setupScriptContext(multiplayer);
        setGlobalVariable("multiplayer", multiplayer);
        setGlobalVariable("mp", multiplayer);
        this.root.multiplayer = multiplayer;
        Mods mods = new Mods(this.root);
        setupScriptContext(mods);
        setGlobalVariable("mods", mods);
        this.root.mods = mods;
        if (RunnableC0069a.m7033a()) {
            ScriptContext debug = new Debug(this.root);
            setupScriptContext(debug);
            setGlobalVariable("debug", debug);
        }
    }

    public void setupScriptContext(ScriptContext scriptContext) {
        Method[] methods;
        scriptContext.libRocket = this.slickLibRocket;
        scriptContext.guiEngine = AbstractC0043a.m7083a();
        scriptContext.scriptEngine = this;
        for (Method method : scriptContext.getClass().getMethods()) {
            String name = method.getName();
            if (!name.equals("wait") && !name.equals("getClass")) {
                if (scriptContext.methods.get(name) != null) {
                    logError("method: " + name + " already exists");
                }
                scriptContext.methods.put(name, method);
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/ScriptEngine$Action.class */
    public class Action {
        public String script;
        public boolean tryToCatchCrash;
        public String caughtCrash;
        public boolean completed;
        public int framesDelay;

        public void run(ScriptEngine scriptEngine) {
            try {
                scriptEngine.processScript(this.script);
            } catch (Exception e) {
                if (this.tryToCatchCrash) {
                    GameEngine.m1188a("caught script crash", (Throwable) e);
                    this.caughtCrash = CommonUtils.m2339a(e);
                    return;
                }
                throw new RuntimeException(e);
            } finally {
                this.completed = true;
            }
        }

        public String waitForCompletionOrCrash(boolean z) {
            int i = 0;
            while (i < 3000) {
                if (this.completed) {
                    return this.caughtCrash;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (z) {
                    i = 0;
                }
                i++;
            }
            return "Time Out";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/ScriptEngine$RunnableAction.class */
    public class RunnableAction extends Action {
        Runnable runnable;

        RunnableAction(Runnable runnable) {
            this.runnable = runnable;
        }

        public void run(ScriptEngine scriptEngine) {
            try {
                this.runnable.run();
            } catch (Exception e) {
                if (this.tryToCatchCrash) {
                    GameEngine.m1188a("caught script crash", (Throwable) e);
                    this.caughtCrash = CommonUtils.m2339a(e);
                    return;
                }
                throw new RuntimeException(e);
            } finally {
                this.completed = true;
            }
        }
    }

    public void update(float f) {
        if (!mainScriptThreadMarked) {
            mainScriptThreadMarked = true;
            isMainScriptThread.set(true);
        }
        if (this.queuedScripts.size() != 0) {
            synchronized (this.queuedScripts) {
                Iterator it = this.queuedScripts.iterator();
                while (it.hasNext()) {
                    Action action = (Action) it.next();
                    if (action.framesDelay > 0) {
                        action.framesDelay--;
                    } else {
                        this.runningScripts.add(action);
                        it.remove();
                    }
                }
            }
            Iterator it2 = this.runningScripts.iterator();
            while (it2.hasNext()) {
                ((Action) it2.next()).run(this);
            }
            this.runningScripts.clear();
        }
        this.root.onFrameUpdate(f);
    }

    public Action addScriptToQueue(String str, boolean z) {
        Action action;
        synchronized (this.queuedScripts) {
            action = new Action();
            action.script = str;
            action.tryToCatchCrash = z;
            this.queuedScripts.add(action);
        }
        return action;
    }

    public Action addScriptToQueueIfNotAlreadyQueued(String str) {
        synchronized (this.queuedScripts) {
            Iterator it = this.queuedScripts.iterator();
            while (it.hasNext()) {
                if (str.equals(((Action) it.next()).script)) {
                    return null;
                }
            }
            return addScriptToQueue(str, false);
        }
    }

    public Action addScriptToQueue(String str) {
        return addScriptToQueue(str, false);
    }

    public Action addRunnableToQueue(Runnable runnable) {
        RunnableAction runnableAction;
        synchronized (this.queuedScripts) {
            runnableAction = new RunnableAction(runnable);
            this.queuedScripts.add(runnableAction);
        }
        return runnableAction;
    }

    public void processScript(String str) {
        if (!"mp.refreshUI()".equals(str)) {
            System.out.println("ScriptEngine:HandleEvent:" + str);
        }
        try {
            for (String str2 : CommonUtils.m2269e(str, ';')) {
                processArg(str2);
            }
        } catch (Exception e) {
            throwDelayedException("Found error running:" + str, e);
            throw new RuntimeException(e);
        }
    }

    public static void throwDelayedException(String str, Throwable th) {
        GameEngine.m1188a("throwDelayedException", th);
        if (scriptError == null) {
            scriptError = th;
            scriptErrorMessage = str;
        }
    }

    public void checkForErrors() {
        if (scriptError != null) {
            throw new RuntimeException(scriptErrorMessage, scriptError);
        }
    }

    public Matcher match(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public Object processArg(String str) {
        String trim = str.trim();
        if (trim.length() == 0 || trim.equals("null")) {
            return null;
        }
        Matcher match = match("'(.*)'", trim);
        if (match != null) {
            return CommonUtils.m2240o(match.group(1));
        }
        Matcher match2 = match("(-?\\d*)", trim);
        if (match2 != null) {
            return Integer.valueOf(Integer.parseInt(match2.group(1)));
        }
        Matcher match3 = match("(-?\\d*\\.\\d*)", trim);
        if (match3 != null) {
            return Float.valueOf(Float.parseFloat(match3.group(1)));
        }
        Matcher match4 = match("\\s*([^\\s\"']*)\\s*=(.*)", trim);
        if (match4 != null) {
            String group = match4.group(1);
            String group2 = match4.group(2);
            System.out.println("processArg: setting: " + group + "=" + group2);
            Object processArg = processArg(group2);
            setLocalVariable(group, processArg);
            return processArg;
        }
        Matcher match5 = match("\\s*([\\w\\.]+)\\((.*)\\)\\s*", trim);
        if (match5 != null) {
            return processFunction(trim, match5);
        }
        if ("false".equalsIgnoreCase(trim)) {
            return Boolean.FALSE;
        }
        if ("true".equalsIgnoreCase(trim)) {
            return Boolean.TRUE;
        }
        Object scriptVariable = getScriptVariable(trim, false);
        if (scriptVariable != null) {
            return scriptVariable;
        }
        System.out.println("processArg: no variable:" + trim);
        getScriptVariable(trim, true);
        System.out.println("SlickLibRocket:HandleEvent: failed to match:" + trim);
        return null;
    }

    public void printMetadata(HashMap hashMap) {
        Iterator it;
        if (hashMap == null) {
            System.out.println("No metadata");
            return;
        }
        String str = VariableScope.nullOrMissingString;
        while (hashMap.keySet().iterator().hasNext()) {
            str = str + ((String) it.next()) + ",";
        }
        System.out.println("metadata:" + str);
    }

    public Object getScriptVariable(String str, boolean z) {
        if (this.slickLibRocket.m7045d() != null) {
            Object metadata = this.slickLibRocket.m7045d().getMetadata(str);
            if (metadata != null) {
                return metadata;
            }
            if (z) {
                System.out.println("getScriptVariable: alert");
                printMetadata(this.slickLibRocket.m7045d().metadata);
            }
        }
        if (this.slickLibRocket.m7048c() != null) {
            Object metadata2 = this.slickLibRocket.m7048c().getMetadata(str);
            if (metadata2 != null) {
                return metadata2;
            }
            if (z) {
                System.out.println("getScriptVariable: popup");
                printMetadata(this.slickLibRocket.m7048c().metadata);
            }
        }
        Object m7050b = this.slickLibRocket.m7050b(str);
        if (m7050b != null) {
            return m7050b;
        }
        if (z) {
            System.out.println("getScriptVariable: document");
            printMetadata(this.slickLibRocket.getActiveDocumentMetadata());
        }
        Object obj = this.globals.get(str);
        if (obj != null) {
            return obj;
        }
        if (z) {
            System.out.println("getScriptVariable: globals");
            printMetadata(this.globals);
            return null;
        }
        return null;
    }

    public void setLocalVariable(String str, Object obj) {
        this.slickLibRocket.getActiveDocumentMetadata().put(str, obj);
    }

    public void setGlobalVariable(String str, Object obj) {
        this.globals.put(str, obj);
    }

    public Object processFunction(String str, Matcher matcher) {
        String[] m2269e;
        GameEngine.getInstance();
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        if (group2.equals(VariableScope.nullOrMissingString)) {
            m2269e = new String[0];
        } else {
            m2269e = CommonUtils.m2269e(group2, ',');
        }
        Object[] objArr = new Object[m2269e.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = processArg(m2269e[i]);
        }
        return runFunction(group, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73, types: [com.corrodinggames.librocket.scripts.ScriptContext] */
    public Object runFunction(String str, Object[] objArr) {
        Object next;
        String[] split = str.split("\\.");
        Root root = this.root;
        if (split.length > 2) {
            logCritical("Unsupported nameParts: " + str);
            return null;
        }
        if (split.length == 2) {
            Object scriptVariable = getScriptVariable(split[0], false);
            if (!(scriptVariable instanceof ScriptContext)) {
                logCritical("Could not find context for: " + str);
                return null;
            }
            root = (ScriptContext) scriptVariable;
            str = split[1];
        }
        Method method = (Method) root.methods.get(str);
        if (method == null) {
            logCritical("Could not find function: " + str);
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        ArrayList arrayList = new ArrayList();
        if (objArr.length > parameterTypes.length) {
            logCritical("function: " + str + " does not accept " + objArr.length + " parameters");
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            Object obj = null;
            if (i < objArr.length) {
                obj = objArr[i];
            }
            if (obj == null || cls.isInstance(obj) || cls.equals(Float.class)) {
                arrayList.add(obj);
            } else {
                arrayList.add(obj);
            }
        }
        try {
            return method.invoke(root, arrayList.toArray());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            GameEngine.m1145b("convertedParameters:");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    GameEngine.m1145b("=null");
                } else {
                    GameEngine.m1145b("=" + next.getClass().getName());
                }
            }
            GameEngine.m1145b("-----");
            e2.printStackTrace();
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            throw new RuntimeException(e3);
        }
    }

    public static void logError(String str) {
        GameEngine.PrintLog("ScriptEngine - error: " + str);
    }

    public static void logCritical(String str) {
        GameEngine.PrintLog("ScriptEngine - critical: " + str);
        if (isStrict()) {
            throw new RuntimeException("ScriptEngine - critical:" + str);
        }
    }
}
