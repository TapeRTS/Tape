package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.C0499j;
import com.corrodinggames.rts.game.units.buildings.InterfaceC0501l;

/* renamed from: com.corrodinggames.rts.game.units.a.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/w.class */
public abstract class AbstractC0228w extends Action {
    public AbstractC0228w(int i) {
        super(i);
    }

    public AbstractC0228w(String str) {
        super(str);
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        if (!(unit instanceof InterfaceC0501l)) {
            return 99;
        }
        return ((InterfaceC0501l) unit).mo4376a(m6095N(), z);
    }

    /* renamed from: p */
    public float m6013p(Unit unit) {
        C0499j mo4372dt;
        if (!(unit instanceof InterfaceC0501l) || (mo4372dt = ((InterfaceC0501l) unit).mo4372dt()) == null || !m6076d(mo4372dt.f3491j)) {
            return -1.0f;
        }
        float f = mo4372dt.f3492m;
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: K */
    public float mo4250K() {
        return 0.01f;
    }

    /* renamed from: u */
    public boolean m6012u() {
        return true;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return EnumC0226u.f1476c;
    }
}
