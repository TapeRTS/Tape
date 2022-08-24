package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ap.class */
public class C0857ap {

    /* renamed from: a */
    public static C0857ap f5711a = new C0857ap();

    /* renamed from: b */
    public static int f5712b = 2;

    /* renamed from: c */
    static int f5713c = 3;

    /* renamed from: d */
    static int f5714d = 2;

    /* renamed from: e */
    static int f5715e = 3;

    /* renamed from: f */
    public static int f5716f = 4;

    /* renamed from: g */
    static String f5717g = "tx";

    /* renamed from: h */
    static String f5718h = "_";

    /* renamed from: i */
    public static int f5719i = 55;

    /* renamed from: j */
    public static int f5720j = 66;

    /* renamed from: k */
    public static int f5721k = 100;

    /* renamed from: l */
    public static boolean f5722l = true;

    /* renamed from: a */
    public static float m1581a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public void m1579a(String str, List list) {
        long m1208U = GameEngine.m1208U();
        C0879n.m1418a(list, f5718h + "1", VariableScope.nullOrMissingString + m1208U);
        C0879n.m1418a(list, f5717g + "2", C0758f.m2275d("_" + str + (f5712b + f5713c)));
        C0879n.m1418a(list, f5717g + "3", C0758f.m2275d("_" + str + (f5712b + f5713c + m1208U)));
    }

    /* renamed from: b */
    public void m1578b(String str, List list) {
        C0879n.m1418a(list, f5717g + "3", C0758f.m2275d("-" + str + (f5714d + f5715e) + f5716f));
    }

    /* renamed from: c */
    public void m1577c(String str, List list) {
        if (f5716f > 1000) {
            C0879n.m1418a(list, f5717g + "4", C0758f.m2275d("+" + str + (f5714d + f5715e) + f5716f));
        }
    }

    /* renamed from: a */
    public static void m1580a(Connection connection) {
        if (connection.f5788N) {
            GameEngine.m1208U();
            if (GameEngine.m1228A().f6233bx > -5) {
                connection.f5789O = C0758f.m2363a(0.0f, 0.0f, (float) f5721k, 0.0f) > 10.0f;
            }
        }
    }
}
