package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EditorOrBuilder;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;
import com.corrodinggames.rts.gameFramework.p041i.C0871f;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.units.a.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/y.class */
public class C0230y extends Action {

    /* renamed from: a */
    public boolean f1490a;

    public C0230y(boolean z) {
        super("c_5");
        this.f1459g = -9990.0f;
        this.f1490a = z;
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        return -1;
    }

    /* renamed from: c */
    public int mo6185c() {
        return 0;
    }

    /* renamed from: i */
    public InterfaceC0303as mo7517i() {
        return null;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return EnumC0226u.f1482i;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return EnumC0225t.f1470g;
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return false;
    }

    /* renamed from: K */
    public AbstractC0623y m6001K() {
        GameEngine gameEngine = GameEngine.getInstance();
        Unit[] m523a = gameEngine.f6111bS.f5255bL.m523a();
        int size = gameEngine.f6111bS.f5255bL.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* renamed from: L */
    public boolean m6000L() {
        GameEngine gameEngine = GameEngine.getInstance();
        AbstractC0623y m6001K = m6001K();
        if (m6001K != null) {
            return (m6001K instanceof EditorOrBuilder) || gameEngine.f6093bs == m6001K.team;
        }
        return false;
    }

    /* renamed from: d */
    public String m5995d() {
        String str = "UnitInfo";
        GameEngine gameEngine = GameEngine.getInstance();
        AbstractC0623y m6001K = m6001K();
        if (m6001K != null) {
            if (m6001K instanceof EditorOrBuilder) {
                return "Editor";
            }
            if (!this.f1490a) {
                str = gameEngine.f6111bS.f5106d.m2217a((Unit) m6001K, false);
            } else {
                str = gameEngine.f6111bS.f5106d.m2224a(m6001K.team);
            }
        }
        return str;
    }

    /* renamed from: e_ */
    public boolean mo6183e_() {
        return true;
    }

    /* renamed from: b */
    public String mo6187b() {
        return "UnitInfo";
    }

    /* renamed from: d */
    public String m5994d(Unit unit) {
        if (this.f1490a) {
            return VariableScope.nullOrMissingString;
        }
        if (unit != null) {
            return unit.getUnitType().mo5710e();
        }
        return "UnitInfo";
    }

    /* renamed from: s */
    public boolean mo6178s() {
        if (!this.f1490a || !m6000L()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public boolean m5987u() {
        if (this.f1490a) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public boolean m6003C() {
        return true;
    }

    /* renamed from: a */
    public String mo6189a() {
        C0871f c0871f;
        if (this.f1490a) {
            return VariableScope.nullOrMissingString;
        }
        AbstractC0623y m6001K = m6001K();
        if (m6001K != null) {
            String m2216a = C0760a.m2216a(m6001K, false, true, false);
            if (0 != 0) {
                try {
                    m6001K.mo466a(new C0871f());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                m2216a = m2216a + "\n" + c0871f.f5816a;
            }
            return m2216a;
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: G */
    public boolean m6002G() {
        return true;
    }
}
