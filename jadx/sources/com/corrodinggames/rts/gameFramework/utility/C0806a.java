package com.corrodinggames.rts.gameFramework.utility;

import android.p003os.Looper;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a.class */
public class C0806a extends Error {
    private C0806a(C0820c cVar) {
        super("Application Not Responding", cVar);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* renamed from: a */
    static C0806a m615a(String str, boolean z) {
        final Thread e = Looper.m4072b().m4069e();
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: com.corrodinggames.rts.gameFramework.utility.a.1
            /* renamed from: a */
            public int compare(Thread thread, Thread thread2) {
                if (thread == thread2) {
                    return 0;
                }
                if (thread == e) {
                    return 1;
                }
                if (thread2 == e) {
                    return -1;
                }
                return thread2.getName().compareTo(thread.getName());
            }
        });
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == e || (entry.getKey().getName().startsWith(str) && (z || entry.getValue().length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(e)) {
            treeMap.put(e, e.getStackTrace());
        }
        C0820c cVar = null;
        for (Map.Entry entry2 : treeMap.entrySet()) {
            C0819b bVar = new C0819b(m614a((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue());
            bVar.getClass();
            cVar = new C0820c(bVar, cVar);
        }
        return new C0806a(cVar);
    }

    /* renamed from: a */
    static C0806a m616a() {
        Thread e = Looper.m4072b().m4069e();
        C0819b bVar = new C0819b(m614a(e), e.getStackTrace());
        bVar.getClass();
        return new C0806a(new C0820c(bVar, null));
    }

    /* renamed from: a */
    private static String m614a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }
}
