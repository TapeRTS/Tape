package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.g.ao */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/ao.class */
public class C0689ao {

    /* renamed from: a */
    public static C0689ao f4869a = new C0689ao();

    /* renamed from: b */
    static int f4870b = 2;

    /* renamed from: c */
    static int f4871c = 3;

    /* renamed from: d */
    static int f4872d = 2;

    /* renamed from: e */
    static int f4873e = 3;

    /* renamed from: f */
    static int f4874f = 4;

    /* renamed from: g */
    static String f4875g = "tx";

    /* renamed from: h */
    static String f4876h = "_";

    /* renamed from: i */
    public static int f4877i = 55;

    /* renamed from: j */
    public static int f4878j = 66;

    /* renamed from: a */
    public void m1162a(String str, List list) {
        long N = AbstractC0789l.m747N();
        C0710n.m1034a(list, f4876h + "1", "" + N);
        C0710n.m1034a(list, f4875g + "2", C0654f.m1444d("_" + str + (f4870b + f4871c)));
        C0710n.m1034a(list, f4875g + "3", C0654f.m1444d("_" + str + (f4870b + f4871c + N)));
    }

    /* renamed from: b */
    public void m1161b(String str, List list) {
        C0710n.m1034a(list, f4875g + "3", C0654f.m1444d("-" + str + (f4872d + f4873e) + f4874f));
    }

    /* renamed from: c */
    public void m1160c(String str, List list) {
        if (f4874f > 1000) {
            C0710n.m1034a(list, f4875g + "4", C0654f.m1444d("+" + str + (f4872d + f4873e) + f4874f));
        }
    }
}
