package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EditorOrBuilder;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/z.class */
public class C0231z extends Action {

    /* renamed from: a */
    InterfaceC0303as f1491a;

    /* renamed from: b */
    ArrayList f1492b;

    /* renamed from: c */
    int f1493c;

    /* renamed from: d */
    boolean f1494d;

    /* renamed from: e */
    AbstractC0623y f1495e;

    /* renamed from: f */
    int f1496f;

    public C0231z(InterfaceC0303as interfaceC0303as) {
        super("s_" + interfaceC0303as.mo5696v());
        this.f1492b = new ArrayList();
        this.f1493c = 0;
        this.f1495e = null;
        this.f1459g = -9999.0f;
        this.f1491a = interfaceC0303as;
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
        return this.f1491a;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return EnumC0226u.f1482i;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        if (GameEngine.m1159as() && !C0797f.f5187bA) {
            return EnumC0225t.f1471h;
        }
        return EnumC0225t.f1470g;
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return false;
    }

    /* renamed from: c */
    public boolean m5979c(Unit unit, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!z) {
            if (gameEngine.f6111bS.m1969p() == 1) {
                return false;
            }
            boolean z2 = false;
            Iterator it = Unit.f1589bD.iterator();
            while (it.hasNext()) {
                Unit unit2 = (Unit) it.next();
                if (unit2.f1643cE && unit2.getUnitType() != this.f1491a) {
                    gameEngine.f6111bS.m1976l(unit2);
                    z2 = true;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        Iterator it2 = Unit.f1589bD.iterator();
        while (it2.hasNext()) {
            Unit unit3 = (Unit) it2.next();
            if (unit3.f1643cE && unit3.getUnitType() == this.f1491a) {
                gameEngine.f6111bS.m1976l(unit3);
            }
        }
        return true;
    }

    /* renamed from: d */
    public String m5978d() {
        GameEngine.getInstance();
        if (this.f1495e instanceof EditorOrBuilder) {
            return "Editor";
        }
        return VariableScope.nullOrMissingString + this.f1491a.mo5710e() + " x" + this.f1493c;
    }

    /* renamed from: b */
    public String mo6187b() {
        return "UnitInfo";
    }

    /* renamed from: w */
    public String m5968w(Unit unit) {
        if (this.f1495e instanceof EditorOrBuilder) {
            return "Editor";
        }
        return this.f1491a.mo5710e();
    }

    /* renamed from: e_ */
    public boolean mo6183e_() {
        return true;
    }

    /* renamed from: s */
    public boolean mo6178s() {
        return true;
    }

    /* renamed from: u */
    public boolean m5969u() {
        return true;
    }

    /* renamed from: C */
    public boolean m5986C() {
        return true;
    }

    /* renamed from: a */
    public String mo6189a() {
        String str = VariableScope.nullOrMissingString;
        if (this.f1495e instanceof EditorOrBuilder) {
            return VariableScope.nullOrMissingString;
        }
        if (this.f1494d) {
            str = "(Left click to exclusively select / Right click to unselect)\n";
        }
        return str + this.f1491a.mo5709f();
    }

    /* renamed from: K */
    public void m5984K() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1496f == gameEngine.f6111bS.f5117S) {
            return;
        }
        this.f1496f = gameEngine.f6111bS.f5117S;
        this.f1493c = 0;
        this.f1494d = false;
        this.f1495e = null;
        Unit[] m523a = gameEngine.f6111bS.f5255bL.m523a();
        int size = gameEngine.f6111bS.f5255bL.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE) {
                    if (abstractC0623y.getUnitType() == this.f1491a) {
                        this.f1493c++;
                        if (this.f1495e == null) {
                            this.f1495e = abstractC0623y;
                        }
                    } else {
                        this.f1494d = true;
                    }
                }
            }
        }
    }

    /* renamed from: j_ */
    public float m5972j_() {
        return this.f1459g - this.f1493c;
    }

    /* renamed from: G */
    public boolean m5985G() {
        return true;
    }

    /* renamed from: l_ */
    public boolean m5971l_() {
        return true;
    }
}
