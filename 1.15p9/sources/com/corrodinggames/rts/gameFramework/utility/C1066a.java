package com.corrodinggames.rts.gameFramework.utility;

import android.p003os.Looper;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a.class */
public class C1066a extends Error {
    private C1066a(C1086c c1086c) {
        super("Application Not Responding", c1086c);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1066a m749a(String str, boolean z) {
        final Thread m6381e = Looper.m6384b().m6381e();
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: com.corrodinggames.rts.gameFramework.utility.a.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int mo747a(Thread thread, Thread thread2) {
                if (thread == thread2) {
                    return 0;
                }
                if (thread == m6381e) {
                    return 1;
                }
                if (thread2 == m6381e) {
                    return -1;
                }
                return thread2.getName().compareTo(thread.getName());
            }
        });
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == m6381e || (entry.getKey().getName().startsWith(str) && (z || entry.getValue().length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(m6381e)) {
            treeMap.put(m6381e, m6381e.getStackTrace());
        }
        C1086c c1086c = null;
        for (Map.Entry entry2 : treeMap.entrySet()) {
            C1085b c1085b = new C1085b(m748a((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue());
            c1085b.getClass();
            c1086c = new C1086c(c1085b, c1086c);
        }
        return new C1066a(c1086c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1066a m750a() {
        Thread m6381e = Looper.m6384b().m6381e();
        C1085b c1085b = new C1085b(m748a(m6381e), m6381e.getStackTrace());
        c1085b.getClass();
        return new C1066a(new C1086c(c1085b, null));
    }

    /* renamed from: a */
    private static String m748a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }
}
