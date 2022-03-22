package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.gameFramework.g.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/b.class */
public class C0697b {

    /* renamed from: a */
    int f4909a;

    /* renamed from: b */
    String f4910b;

    /* renamed from: c */
    String f4911c;

    /* renamed from: d */
    C0698c f4912d;

    /* renamed from: e */
    long f4913e = System.nanoTime();

    /* renamed from: f */
    final /* synthetic */ C0660a f4914f;

    C0697b(C0660a aVar, int i, String str, String str2, C0698c cVar) {
        this.f4914f = aVar;
        this.f4909a = i;
        this.f4910b = str;
        this.f4911c = str2;
        this.f4912d = cVar;
    }

    /* renamed from: a */
    public String m1121a() {
        String str;
        if (this.f4910b != null) {
            str = this.f4910b + ": " + this.f4911c;
        } else {
            str = this.f4911c;
        }
        return str;
    }

    /* renamed from: b */
    public String m1120b() {
        String str = "";
        if (this.f4910b != null) {
            int i = -1;
            if (this.f4909a != -1) {
                i = AbstractC0171m.m3438m(this.f4909a);
            }
            str = "<strong> <font color='" + C0654f.m1432f(i) + "'>" + this.f4914f.m1360a(this.f4910b) + ": </font></strong>";
        }
        boolean z = true;
        for (String str2 : this.f4911c.split("\n")) {
            if (!str2.trim().equals("")) {
                if (z) {
                    z = false;
                } else {
                    str = str + "<br/>";
                }
                str = str + this.f4914f.m1360a(str2);
            }
        }
        return str;
    }
}
