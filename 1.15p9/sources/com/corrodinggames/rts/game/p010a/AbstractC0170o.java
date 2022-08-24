package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/o.class */
public abstract class AbstractC0170o extends AbstractC0726bk {

    /* renamed from: Q */
    public int f758Q;

    /* renamed from: R */
    protected final C0136a f759R;

    /* renamed from: S */
    public float f760S;

    /* renamed from: T */
    public float f761T;

    /* renamed from: U */
    public float f762U;

    /* renamed from: V */
    public boolean f763V;

    /* renamed from: W */
    static final ArrayList f764W = new ArrayList();

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f760S);
        c0859ar.mo1488a(this.f761T);
        c0859ar.mo1488a(this.f762U);
    }

    /* renamed from: a */
    public void m6672a(C0876k c0876k) {
        this.f760S = c0876k.m1453g();
        this.f761T = c0876k.m1453g();
        this.f762U = c0876k.m1453g();
    }

    public AbstractC0170o(C0136a c0136a) {
        c0136a.f568aH++;
        this.f758Q = c0136a.f568aH;
        this.f759R = c0136a;
        this.f759R.f598bl.add(this);
        this.f759R.f599bm.add(this);
    }

    public AbstractC0170o(C0136a c0136a, float f, float f2) {
        this(c0136a);
        this.f760S = f;
        this.f761T = f2;
    }

    /* renamed from: p */
    public void m6666p() {
        this.f759R.f598bl.remove(this);
        this.f759R.f599bm.remove(this);
        this.f763V = true;
    }

    /* renamed from: c */
    public boolean m6670c(float f, float f2) {
        float m2366a = CommonUtils.m2366a(this.f760S, this.f761T, f, f2);
        float f3 = this.f762U;
        if (m2366a < f3 * f3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m6671b(Unit unit) {
        float m2366a = CommonUtils.m2366a(this.f760S, this.f761T, unit.f6951ek, unit.f6952el);
        float f = this.f762U + unit.radius;
        if (m2366a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6673a(Unit unit, float f) {
        float m2366a = CommonUtils.m2366a(this.f760S, this.f761T, unit.f6951ek, unit.f6952el);
        float f2 = this.f762U + unit.radius + f;
        if (m2366a < f2 * f2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public float m6669c(Unit unit) {
        return CommonUtils.m2366a(this.f760S, this.f761T, unit.f6951ek, unit.f6952el);
    }

    /* renamed from: a */
    public float m6674a(C0164i c0164i) {
        return CommonUtils.m2366a(this.f760S, this.f761T, c0164i.f760S, c0164i.f761T);
    }

    /* renamed from: d */
    public float m6668d(float f, float f2) {
        return CommonUtils.m2366a(this.f760S, this.f761T, f, f2);
    }

    /* renamed from: w */
    public PointF m6665w() {
        PointF pointF = new PointF();
        float random = (float) (Math.random() * 360.0d);
        float random2 = (float) (Math.random() * this.f762U);
        pointF.m7213a(this.f760S + (CommonUtils.m2249i(random) * random2), this.f761T + (CommonUtils.sin(random) * random2));
        return pointF;
    }

    /* renamed from: e */
    public PointF m6667e(InterfaceC0303as interfaceC0303as) {
        int m475c;
        GameEngine gameEngine = GameEngine.getInstance();
        PointF pointF = new PointF();
        float f = this.f762U;
        EnumC0246ao enumC0246ao = EnumC0246ao.f1703b;
        AbstractC1120w abstractC1120w = null;
        if (interfaceC0303as == UnitType.f1737d) {
            f = 600.0f;
            enumC0246ao = EnumC0246ao.f1706e;
        }
        for (int i = 0; i < 15; i++) {
            UnitType unitType = null;
            boolean z = false;
            boolean z2 = false;
            if (this instanceof C0164i) {
                C0164i c0164i = (C0164i) this;
                if (i < 6 && interfaceC0303as == UnitType.f1769J) {
                    unitType = UnitType.f1769J;
                }
                if (unitType != null) {
                    AbstractC0623y abstractC0623y = null;
                    if (abstractC1120w == null) {
                        abstractC1120w = Unit.m5847c(interfaceC0303as);
                    }
                    if (abstractC1120w instanceof AbstractC0623y) {
                        abstractC0623y = (AbstractC0623y) abstractC1120w;
                    }
                    int m6712c = c0164i.m6712c(unitType);
                    if (abstractC0623y != null && m6712c > 1) {
                        int i2 = -1;
                        int m2360a = CommonUtils.m2360a(0, m6712c - 1);
                        Unit[] m523a = Unit.f1589bD.m523a();
                        int size = Unit.f1589bD.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Unit unit = m523a[i3];
                            if (unit.team == this.f759R && c0164i.m6732a(unit) && unit.isActive() && this.f759R.m6829i(unit) && unit.getUnitType() == unitType) {
                                i2++;
                                if (i2 == m2360a) {
                                    float f2 = unit.f6951ek;
                                    float f3 = unit.f6952el;
                                    float f4 = f2;
                                    float f5 = f3;
                                    if (CommonUtils.m2360a(0, 1) == 0) {
                                        f5 += CommonUtils.rnd(-150.0f, 150.0f);
                                    } else {
                                        f4 += CommonUtils.rnd(-150.0f, 150.0f);
                                    }
                                    f764W.clear();
                                    gameEngine.f6111bS.m2035a(abstractC0623y, f2, f3, f4, f5, false, f764W, (Unit) null);
                                    if (f764W.size() > 0) {
                                        PointF pointF2 = (PointF) f764W.get(0);
                                        pointF.m7213a(pointF2.x, pointF2.y);
                                        z = true;
                                    } else {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2) {
                if (!z) {
                    float random = (float) (Math.random() * 360.0d);
                    float random2 = (float) (Math.random() * f);
                    pointF.m7213a(this.f760S + (CommonUtils.m2249i(random) * random2), this.f761T + (CommonUtils.sin(random) * random2));
                }
                gameEngine.f6104bL.m6652a(pointF.x, pointF.y);
                int i4 = gameEngine.f6104bL.f800T;
                int i5 = gameEngine.f6104bL.f801U;
                if (gameEngine.f6104bL.m6608c(i4, i5) && (((m475c = C1117y.m475c(i4, i5, enumC0246ao)) > 5 || m475c == 0) && AbstractC0488d.m4518a(interfaceC0303as, pointF.x, pointF.y, this.f759R))) {
                    return pointF;
                }
                if (interfaceC0303as == UnitType.f1737d) {
                    f += 100.0f;
                }
            }
        }
        return null;
    }
}
