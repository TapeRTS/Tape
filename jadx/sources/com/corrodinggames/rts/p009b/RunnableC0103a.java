package com.corrodinggames.rts.p009b;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/b/a.class */
public class RunnableC0103a implements Runnable {

    /* renamed from: a */
    public ServerSocket f480a;

    /* renamed from: b */
    public boolean f481b = true;

    /* renamed from: c */
    public static boolean f482c = false;

    /* renamed from: d */
    static ArrayList f483d = new ArrayList();

    /* renamed from: a */
    public static boolean m3905a() {
        return f482c;
    }

    /* renamed from: a */
    public static void m3903a(String str) {
        f482c = true;
        f483d.add(str);
    }

    /* renamed from: b */
    public static void m3902b() {
        if (f483d.size() != 0) {
            new Thread(new Runnable() { // from class: com.corrodinggames.rts.b.a.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = RunnableC0103a.f483d.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        AbstractC0789l.m670d("Running debug script:" + str);
                        try {
                            FileReader fileReader = new FileReader(str);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                String trim = readLine.trim();
                                if (!trim.equals("") && !trim.startsWith("#")) {
                                    AbstractC0789l.m670d("Running: " + trim);
                                    AbstractC0789l.m670d("got: " + RunnableC0103a.m3901b("script " + trim).trim());
                                }
                            }
                            bufferedReader.close();
                            fileReader.close();
                            AbstractC0789l.m670d("End of:" + str);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }).start();
        }
    }

    /* renamed from: a */
    public static void m3904a(int i, String str) {
        try {
            f482c = true;
            AbstractC0789l.f5470aE = true;
            AbstractC0789l.m670d("");
            AbstractC0789l.m670d("----- createDebugSocket ----");
            AbstractC0789l.m670d("port: " + i);
            AbstractC0789l.m670d("password: " + str);
            AbstractC0789l.m670d("------------------");
            AbstractC0789l.m670d("");
            RunnableC0103a aVar = new RunnableC0103a();
            if (i != -1) {
                aVar.f480a = new ServerSocket(i);
                new Thread(aVar).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private RunnableC0103a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f481b) {
            try {
                Socket accept = this.f480a.accept();
                try {
                    accept.setTcpNoDelay(true);
                    new Thread(new RunnableC0115b(this, accept)).run();
                } catch (IOException e) {
                    AbstractC0789l.m670d("Got IOException on debugSocket connection");
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: b */
    public static String m3901b(String str) {
        String waitForCompletionOrCrash;
        final String str2 = null;
        int indexOf = str.indexOf(" ");
        if (indexOf == -1) {
            indexOf = str.length();
        }
        String lowerCase = str.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
        if (indexOf != -1 && str.length() >= indexOf + 1) {
            str2 = str.substring(indexOf + 1);
            str2.split(" ");
        }
        if (ScriptEngine.getInstance() == null) {
            AbstractC0789l.m682b("DebugSocketConnection: waiting for ScriptEngine to start....");
            int i = 0;
            while (true) {
                if (i >= 100) {
                    break;
                } else if (ScriptEngine.getInstance() != null) {
                    AbstractC0789l.m682b("started");
                    break;
                } else {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                }
            }
        }
        if (lowerCase.equalsIgnoreCase("ping")) {
            return "pong";
        }
        if (lowerCase.equalsIgnoreCase("script")) {
            if (str2 == null) {
                return "argString==null";
            }
            String waitForCompletionOrCrash2 = ScriptEngine.getInstance().addScriptToQueue(str2).waitForCompletionOrCrash(false);
            if (waitForCompletionOrCrash2 == null) {
                return "done";
            }
            return waitForCompletionOrCrash2;
        } else if (!lowerCase.equalsIgnoreCase("function") && !lowerCase.equalsIgnoreCase("functionNoTimeout")) {
            return "unknown command";
        } else {
            if (str2 == null) {
                return "argString==null";
            }
            final ScriptEngine instance = ScriptEngine.getInstance();
            AbstractRunnableC0116c cVar = new AbstractRunnableC0116c() { // from class: com.corrodinggames.rts.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    this.f504c = ScriptEngine.this.processArg(str2);
                }
            };
            ScriptEngine.Action addRunnableToQueue = instance.addRunnableToQueue(cVar);
            addRunnableToQueue.tryToCatchCrash = true;
            boolean z = false;
            if (lowerCase.equalsIgnoreCase("functionNoTimeout")) {
                z = true;
            }
            if (addRunnableToQueue.waitForCompletionOrCrash(z) == null) {
                return (cVar.f504c == null ? "ok\n<NULL>" : "ok\n" + cVar.f504c) + "��";
            }
            return ("crash\n" + waitForCompletionOrCrash) + "��";
        }
    }
}
