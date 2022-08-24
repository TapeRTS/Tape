package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/o.class */
public class C0220o extends Action {
    public C0220o() {
        super("c_1");
    }

    /* renamed from: a */
    public String mo6189a() {
        return C0820a.m1886a("gui.actions.setRally.description", new Object[0]);
    }

    /* renamed from: b */
    public String mo6187b() {
        return C0820a.m1886a("gui.actions.setRally", new Object[0]);
    }

    /* renamed from: c */
    public int mo6185c() {
        return 0;
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        return -1;
    }

    /* renamed from: K */
    public UnitType mo7517i() {
        return null;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return EnumC0226u.f1477d;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return EnumC0225t.f1465b;
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return false;
    }

    /* renamed from: j */
    public BitmapOrTexture mo6180j() {
        return GameEngine.getInstance().f6111bS.f5233bd;
    }

    /* renamed from: h */
    public boolean m6130h() {
        return true;
    }
}
