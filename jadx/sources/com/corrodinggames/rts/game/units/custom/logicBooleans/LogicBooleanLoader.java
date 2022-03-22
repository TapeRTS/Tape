package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader.class */
public class LogicBooleanLoader {
    static Pattern patternSingleQuote = Pattern.compile("'(.*)'");
    static Pattern patternDoubleQuote = Pattern.compile("\"(.*)\"");
    static Pattern patternInteger = Pattern.compile("(-?\\d*)");
    static Pattern patternFloat = Pattern.compile("(-?\\d*\\.\\d*)");

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ParameterMapping.class */
    public class ParameterMapping {
        public Class type;
        public HashMap parameters = new HashMap();
        public String allParametersString = "";

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ParameterMapping$FieldOrMethod.class */
        public class FieldOrMethod {
            Field field;
            Method method;
            Class type;

            public FieldOrMethod(Field field) {
                this.field = field;
                this.type = field.getType();
            }

            public FieldOrMethod(Method method) {
                this.method = method;
                this.type = method.getParameterTypes()[0];
            }
        }

        public ParameterMapping(Class cls) {
            Method[] methods;
            this.type = cls;
            ArrayList arrayList = new ArrayList();
            LogicBooleanLoader.getAllFieldsInherited(arrayList, cls);
            if (cls == LogicBoolean.IsResourceLargerThan.class) {
                AbstractC0789l.m670d("========== IsResourceLargerThan ===========");
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                if (cls == LogicBoolean.IsResourceLargerThan.class) {
                    AbstractC0789l.m670d("Found: " + field);
                }
                if (field.isAnnotationPresent(LogicBoolean.Parameter.class)) {
                    if (cls == LogicBoolean.IsResourceLargerThan.class) {
                        AbstractC0789l.m670d("Found: " + field + " (isAnnotationPresent)");
                    }
                    this.parameters.put(field.getName().toLowerCase(Locale.ROOT), new FieldOrMethod(field));
                    if (!this.allParametersString.equals("")) {
                        this.allParametersString += ", ";
                    }
                    this.allParametersString += field.getName();
                }
            }
            for (Method method : cls.getMethods()) {
                if (method.isAnnotationPresent(LogicBoolean.Parameter.class)) {
                    this.parameters.put(method.getName().toLowerCase(Locale.ROOT), new FieldOrMethod(method));
                    if (!this.allParametersString.equals("")) {
                        this.allParametersString += ", ";
                    }
                    this.allParametersString += method.getName();
                }
            }
        }
    }

    public static LogicBoolean parseBooleanBlock(C0368l lVar, String str) {
        String[] strArr;
        int p = C0654f.m1411p(str);
        if (p != 0) {
            if (p > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. A '(' was not closed.");
            } else if (p < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. Too many ')'.");
            }
        }
        String breakOuterLayerBrackets = breakOuterLayerBrackets(str.trim());
        for (String str2 : new String[]{"or", "and"}) {
            ArrayList a = C0654f.m1484a(breakOuterLayerBrackets, str2, true);
            if (a.size() != 1) {
                ArrayList arrayList = new ArrayList();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    LogicBoolean parseBooleanBlock = parseBooleanBlock(lVar, (String) it.next());
                    if (parseBooleanBlock == null) {
                        throw new RuntimeException("null on:'" + breakOuterLayerBrackets + "'");
                    }
                    arrayList.add(parseBooleanBlock);
                }
                return LogicBoolean.JoinerBoolean.createJoiner(str2, (LogicBoolean[]) arrayList.toArray(new LogicBoolean[0]));
            }
        }
        boolean z = false;
        if (breakOuterLayerBrackets.startsWith("not ")) {
            z = true;
            breakOuterLayerBrackets = breakOuterLayerBrackets.substring("not ".length());
        }
        String trim = breakOuterLayerBrackets.split("\\(")[0].trim();
        for (Map.Entry entry : LogicBoolean.booleans.entrySet()) {
            String str3 = (String) entry.getKey();
            LogicBoolean logicBoolean = (LogicBoolean) entry.getValue();
            if (trim.equals(str3.toLowerCase(Locale.ROOT))) {
                String trim2 = breakOuterLayerBrackets.substring(str3.length()).trim();
                if (trim2.equals("")) {
                    trim2 = "()";
                }
                if (!trim2.startsWith("(") || !trim2.endsWith(")")) {
                    throw new RuntimeException("Failed to parse function arguments in:'" + breakOuterLayerBrackets + "'");
                }
                String trim3 = trim2.substring(1, trim2.length() - 1).trim();
                LogicBoolean.NotBoolean with = logicBoolean.with(lVar, trim3);
                with.validateArguments(str3, trim3, breakOuterLayerBrackets);
                if (z) {
                    with = new LogicBoolean.NotBoolean(with);
                }
                return with;
            }
        }
        throw new RuntimeException("Unknown function:'" + breakOuterLayerBrackets + "'");
    }

    public static Matcher match(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public static void setArgumentsWithMapping(ParameterMapping parameterMapping, Object obj, String str) {
        String str2;
        String str3;
        if (str != null && !"".equals(str)) {
            ArrayList a = C0654f.m1484a(str, ",", false);
            ArrayList arrayList = new ArrayList();
            Iterator it = a.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                int indexOf = str4.indexOf("=");
                if (indexOf > 0) {
                    str3 = str4.substring(0, indexOf);
                    str2 = str4.substring(indexOf + 1);
                } else {
                    str3 = str4;
                    str2 = null;
                }
                String lowerCase = str3.trim().toLowerCase(Locale.ROOT);
                if (arrayList.contains(lowerCase)) {
                    throw new BooleanParseException("argument '" + str3 + "' has been listed more than once");
                }
                arrayList.add(lowerCase);
                try {
                    setArgumentWithMapping(parameterMapping, obj, lowerCase, str2);
                } catch (BooleanParseException e) {
                    AbstractC0789l.m670d("key:" + lowerCase);
                    AbstractC0789l.m670d("element:" + str4);
                    AbstractC0789l.m670d("arguments:" + str);
                    throw e;
                }
            }
        }
    }

    public static void setArgumentWithMapping(ParameterMapping parameterMapping, Object obj, String str, String str2) {
        ParameterMapping.FieldOrMethod fieldOrMethod = (ParameterMapping.FieldOrMethod) parameterMapping.parameters.get(str);
        if (fieldOrMethod != null && fieldOrMethod.field != null) {
            try {
                fieldOrMethod.field.set(obj, convertParameterData(str2, fieldOrMethod.type));
            } catch (IllegalAccessException e) {
                throw new BooleanParseException("Error parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e);
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                String message = e2.getMessage();
                if (message == null) {
                    throw new BooleanParseException("Error parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e2);
                }
                throw new BooleanParseException("Error parameter:'" + str + "': " + message.replace("com.corrodinggames.rts.game.units.custom.logicBooleans.", "").replace("java.lang.", ""));
            }
        } else if (fieldOrMethod == null || fieldOrMethod.method == null) {
            throw new BooleanParseException("No parameter:'" + str + "' on " + obj.getClass().getSimpleName() + " (Possible parameters:" + parameterMapping.allParametersString + ")");
        } else {
            try {
                fieldOrMethod.method.invoke(obj, convertParameterData(str2, fieldOrMethod.type));
            } catch (IllegalAccessException e3) {
                throw new BooleanParseException("Error parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e3);
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
                String message2 = e4.getMessage();
                if (message2 == null) {
                    throw new BooleanParseException("Error parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e4);
                }
                throw new BooleanParseException("Error parameter:'" + str + "': " + message2.replace("com.corrodinggames.rts.game.units.custom.logicBooleans.", "").replace("java.lang.", ""));
            } catch (InvocationTargetException e5) {
                throw new BooleanParseException("Error parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e5);
            }
        }
    }

    public static List getAllFieldsInherited(List list, Class cls) {
        list.addAll(Arrays.asList(cls.getFields()));
        return list;
    }

    public static Object convertParameterData(String str, Class cls) {
        String trim = str.trim();
        if (trim.length() == 0 || trim.equals("null")) {
            return null;
        }
        String lowerCase = trim.toLowerCase(Locale.ENGLISH);
        if ("false".equals(lowerCase)) {
            return Boolean.FALSE;
        }
        if ("true".equals(lowerCase)) {
            return Boolean.TRUE;
        }
        Matcher match = match(patternSingleQuote, trim);
        if (match != null) {
            return C0654f.m1412o(match.group(1));
        }
        Matcher match2 = match(patternDoubleQuote, trim);
        if (match2 != null) {
            return C0654f.m1412o(match2.group(1));
        }
        Matcher match3 = match(patternInteger, trim);
        if (match3 == null) {
            Matcher match4 = match(patternFloat, trim);
            if (match4 == null) {
                String str2 = "Failed to read parameter:" + trim + "";
                if (cls == String.class) {
                    str2 = str2 + " (A quoted string was expected)";
                }
                throw new BooleanParseException(str2);
            } else if (cls == String.class) {
                return match4.group(1);
            } else {
                return Float.valueOf(Float.parseFloat(match4.group(1)));
            }
        } else if (cls == String.class) {
            return match3.group(1);
        } else {
            return Integer.valueOf(Integer.parseInt(match3.group(1)));
        }
    }

    public static String breakOuterLayerBrackets(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            int g = C0654f.m1426g(str, 0);
            if (g == -1) {
                throw new RuntimeException("Brackets unbalanced. Starting '(' in '" + str + "' was not closed.");
            } else if (g == str.length() - 1) {
                str = breakOuterLayerBrackets(str.substring(1, str.length() - 1).trim());
            }
        }
        return str;
    }
}
