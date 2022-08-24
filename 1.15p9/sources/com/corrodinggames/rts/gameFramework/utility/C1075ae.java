package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.p048a.C1068a;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ae.class */
public class C1075ae {

    /* renamed from: a */
    static Object f6832a = new Object();

    /* renamed from: b */
    static C1077ag f6833b = new C1077ag();

    /* renamed from: c */
    static AbstractC1076af f6834c;

    /* renamed from: a */
    public static boolean m640a() {
        if (GameEngine.m1153as()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static AbstractC1076af m639a(String str) {
        if (C1077ag.m608i(str)) {
            return f6833b;
        }
        if (m640a() && C1068a.m739l(str)) {
            if (f6834c == null) {
                synchronized (f6832a) {
                    if (f6834c == null) {
                        f6834c = new C1068a();
                    }
                }
            }
            return f6834c;
        }
        return null;
    }

    /* renamed from: b */
    public static AbstractC1076af m637b(String str) {
        if (m640a() && C1068a.m739l(str)) {
            if (f6834c == null) {
                synchronized (f6832a) {
                    if (f6834c == null) {
                        f6834c = new C1068a();
                    }
                }
            }
            return f6834c;
        }
        return null;
    }

    /* renamed from: c */
    public static void m636c(String str) {
        if (f6833b != null && C1077ag.m608i(str)) {
            f6833b.m606k(str);
        }
    }

    /* renamed from: b */
    public static void m638b() {
        if (f6833b != null) {
            f6833b.mo635a();
        }
        if (f6834c != null) {
            f6834c.mo635a();
        }
    }
}
