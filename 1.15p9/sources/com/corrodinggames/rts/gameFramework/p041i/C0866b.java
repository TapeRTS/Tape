package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.gameFramework.i.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/b.class */
public class C0866b {

    /* renamed from: a */
    int f5753a;

    /* renamed from: b */
    String f5754b;

    /* renamed from: c */
    String f5755c;

    /* renamed from: d */
    Connection f5756d;

    /* renamed from: e */
    long f5757e = System.nanoTime();

    /* renamed from: f */
    final /* synthetic */ C0827a f5758f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0866b(C0827a c0827a, int i, String str, String str2, Connection connection) {
        this.f5758f = c0827a;
        this.f5753a = i;
        this.f5754b = str;
        this.f5755c = str2;
        this.f5756d = connection;
    }

    /* renamed from: a */
    public String m1514a() {
        String str;
        if (this.f5754b != null) {
            str = this.f5754b + ": " + this.f5755c;
        } else {
            str = this.f5755c;
        }
        return str;
    }

    /* renamed from: b */
    public String m1513b() {
        String str = VariableScope.nullOrMissingString;
        if (this.f5754b != null) {
            int i = -1;
            if (this.f5753a != -1) {
                i = Team.m6321i(this.f5753a);
            }
            str = "<strong> <font color='" + CommonUtils.m2252h(i) + "'>" + this.f5758f.m1814a(this.f5754b) + ": </font></strong>";
        }
        boolean z = true;
        for (String str2 : this.f5755c.split("\n")) {
            if (!str2.trim().equals(VariableScope.nullOrMissingString)) {
                if (z) {
                    z = false;
                } else {
                    str = str + "<br/>";
                }
                str = str + this.f5758f.m1814a(str2);
            }
        }
        return str;
    }
}
