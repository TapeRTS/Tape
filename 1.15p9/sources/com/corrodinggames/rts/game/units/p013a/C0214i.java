package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* renamed from: com.corrodinggames.rts.game.units.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/i.class */
public class C0214i extends Action {
    public C0214i() {
        super("c_9");
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        return -1;
    }

    /* renamed from: c */
    public int mo6185c() {
        return 0;
    }

    /* renamed from: w */
    public UnitType mo7517i() {
        return null;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return EnumC0226u.f1486m;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return EnumC0225t.f1464a;
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return false;
    }

    /* renamed from: a */
    public String mo6189a() {
        return C0820a.m1886a("gui.actions.patrol.description", new Object[0]);
    }

    /* renamed from: b */
    public String mo6187b() {
        return C0820a.m1886a("gui.actions.patrol", new Object[0]);
    }

    /* renamed from: s */
    public boolean mo6178s() {
        return true;
    }

    /* renamed from: l */
    public float m6193l() {
        if (!C0797f.f5188bB) {
            return 0.6f;
        }
        return 0.5f;
    }

    /* renamed from: h */
    public boolean m6194h() {
        return true;
    }

    /* renamed from: l_ */
    public boolean m6192l_() {
        return true;
    }
}
