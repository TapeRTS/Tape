package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* renamed from: com.corrodinggames.rts.game.units.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/m.class */
public class C0218m extends Action {

    /* renamed from: a */
    boolean f1458a;

    public C0218m(boolean z) {
        super("c_2");
        this.f1458a = z;
    }

    /* renamed from: a */
    public String mo6189a() {
        if (!this.f1458a) {
            return C0820a.m1886a("gui.actions.reclaimBuildingTarget.description", new Object[0]);
        }
        return C0820a.m1886a("gui.actions.reclaimTarget.description", new Object[0]);
    }

    /* renamed from: b */
    public String mo6187b() {
        if (!this.f1458a) {
            return C0820a.m1886a("gui.actions.reclaimBuildingTarget", new Object[0]);
        }
        return C0820a.m1886a("gui.actions.reclaimTarget", new Object[0]);
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
        return EnumC0226u.f1478e;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return EnumC0225t.f1469f;
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return false;
    }

    /* renamed from: h */
    public boolean m6153h() {
        return true;
    }

    /* renamed from: o */
    public boolean m6150o(Unit unit) {
        if (unit != null && !this.f1458a) {
            return unit.m5867bI();
        }
        return true;
    }

    /* renamed from: l */
    public float m6151l() {
        if (!C0797f.f5188bB) {
            return 0.6f;
        }
        return 1.0f;
    }
}
