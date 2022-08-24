package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.e.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/b.class */
public class Builder extends AbstractC0529j implements InterfaceC0469d {

    /* renamed from: i */
    PointF[] f3576i;

    /* renamed from: j */
    PointF[] f3577j;

    /* renamed from: k */
    static Paint f3578k;

    /* renamed from: l */
    static Paint f3579l;

    /* renamed from: m */
    static Paint f3580m;

    /* renamed from: a */
    static C0934e f3581a = null;

    /* renamed from: b */
    public static C0934e f3582b = null;

    /* renamed from: c */
    static C0934e f3583c = null;

    /* renamed from: d */
    public static C0934e[] f3584d = new C0934e[10];

    /* renamed from: e */
    public static C0934e f3585e = null;

    /* renamed from: f */
    public static C0934e f3586f = null;

    /* renamed from: g */
    static C0934e f3587g = null;

    /* renamed from: h */
    public static C0934e[] f3588h = new C0934e[10];

    /* renamed from: n */
    static Action f3589n = new C0218m(false);

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: f */
    public UnitType mo6961r() {
        return UnitType.builder;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3470b() {
        return this.f3576i;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3468c() {
        return this.f3577j;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3251v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3588h[this.f1608bV.m5858O()];
    }

    /* renamed from: K */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3581a = m1234A.f6107bO.mo930a(C0067R.drawable.builder);
        f3582b = m1234A.f6107bO.mo930a(C0067R.drawable.builder_dead);
        f3583c = m5357a(f3581a, f3581a.mo396m(), f3581a.mo397l());
        f3584d = AbstractC0197n.m5835a(f3581a);
        f3585e = m1234A.f6107bO.mo930a(C0067R.drawable.builder_charge);
        f3586f = m1234A.f6107bO.mo930a(C0067R.drawable.builder_decharge);
        f3587g = m1234A.f6107bO.mo930a(C0067R.drawable.unit_icon_builder);
        f3588h = AbstractC0197n.m5835a(f3587g);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo3196a(Unit unit) {
        if (!unit.mo4484q() && unit.mo4567bI()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3582b;
        }
        return f3584d[this.f1608bV.m5858O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3583c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3256e() {
        GameEngine.m1234A();
        this.f3880L = f3582b;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1502b);
        return true;
    }

    public Builder(boolean z) {
        super(z);
        this.f3576i = new PointF[6];
        this.f3577j = new PointF[this.f3576i.length];
        f3578k = new Paint();
        f3578k.m6703a(40, 0, 255, 0);
        f3578k.mo6684a(true);
        f3578k.m6706a(2.0f);
        f3578k.m6698a(Paint.Cap.f201b);
        f3579l = new Paint();
        f3579l.m6695a(f3578k);
        f3579l.m6703a(55, 255, 60, 60);
        f3580m = new Paint();
        f3580m.m6703a(60, 255, 255, 255);
        m2879T(20);
        m2878U(20);
        this.f1620ch = 10.0f;
        this.f1621ci = this.f1620ch + 2.0f;
        this.f1632ct = 170.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3581a;
        for (int i = 0; i < this.f3576i.length; i++) {
            this.f3576i[i] = new PointF();
            this.f3577j[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3959a(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        PointF[] mo3470b = interfaceC0469d.mo3470b();
        PointF[] mo3468c = interfaceC0469d.mo3468c();
        Unit m3221X = abstractC0623y.m3221X();
        abstractC0623y.f3961aM = m3221X != null;
        if (m3221X != null) {
            for (int i = 0; i < mo3470b.length; i++) {
                PointF pointF = mo3470b[i];
                PointF pointF2 = mo3468c[i];
                pointF.f227a = C0758f.m2362a(pointF.f227a, pointF2.f227a, 0.1f * f);
                pointF.f228b = C0758f.m2362a(pointF.f228b, pointF2.f228b, 0.1f * f);
                pointF.f227a += (pointF2.f227a - pointF.f227a) * 0.04f * f;
                pointF.f228b += (pointF2.f228b - pointF.f228b) * 0.04f * f;
                float f2 = m3221X.f1620ch * 0.75f;
                if (C0758f.m2289c(pointF.f227a - pointF2.f227a) < 1.0f) {
                    pointF2.f227a = C0758f.m2277d(-f2, f2);
                }
                if (C0758f.m2289c(pointF.f228b - pointF2.f228b) < 1.0f) {
                    pointF2.f228b = C0758f.m2277d(-f2, f2);
                }
            }
        } else if (mo3470b[0].f227a != 0.0f || mo3470b[0].f228b != 0.0f) {
            for (int i2 = 0; i2 < mo3470b.length; i2++) {
                PointF pointF3 = mo3470b[i2];
                PointF pointF4 = mo3468c[i2];
                pointF3.f227a = 0.0f;
                pointF3.f228b = 0.0f;
                pointF4.f227a = 0.0f;
                pointF4.f228b = 0.0f;
            }
        }
    }

    /* renamed from: b */
    public static void m3957b(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        Unit m3221X = abstractC0623y.m3221X();
        if (m3221X != null) {
            boolean m3220Y = abstractC0623y.m3220Y();
            if (!m3220Y && abstractC0623y.f3962aN) {
                return;
            }
            GameEngine m1234A = GameEngine.m1234A();
            PointF[] mo3470b = interfaceC0469d.mo3470b();
            Paint paint = f3578k;
            if (m3220Y) {
                paint = f3579l;
            }
            C1080ai m3084bn = abstractC0623y.m3084bn();
            for (PointF pointF : mo3470b) {
                float f2 = (m3221X.f6951ek + pointF.f227a) - m1234A.f6138cv;
                float f3 = ((m3221X.f6952el - m3221X.f6953em) + pointF.f228b) - m1234A.f6139cw;
                m1234A.f6107bO.mo932a((m3084bn.f6843a + (pointF.f227a * 0.15f)) - m1234A.f6138cv, (((m3084bn.f6844b - m3084bn.f6845c) + (pointF.f228b * 0.15f)) - m1234A.f6139cw) - abstractC0623y.f6953em, f2, f3, paint);
                m1234A.f6107bO.mo878k();
                m1234A.f6107bO.mo896b(f2, f3);
                m1234A.f6107bO.mo935a(0.5f, 0.5f);
                if (m3220Y) {
                    m1234A.f6107bO.mo915a(f3586f, 0.0f, 0.0f, f3580m);
                } else {
                    m1234A.f6107bO.mo915a(f3585e, 0.0f, 0.0f, f3580m);
                }
                m1234A.f6107bO.mo877l();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (!this.f1606bT) {
            m3959a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo469a(float f, boolean z) {
        super.mo469a(f, z);
        if (!this.f1606bT) {
            m3957b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3058e(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: f */
    public float mo3056f(int i) {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        if (!super.mo3489c(f)) {
            return false;
        }
        GameEngine m1234A = GameEngine.m1234A();
        if (!this.f1606bT) {
            float mo3058e = this.f1648cJ[0].f1716f / mo3058e(0);
            if (mo3058e != 0.0f) {
                C1080ai bn = m3084bn();
                m1234A.f6107bO.mo880i();
                m1234A.f6107bO.mo896b(bn.f6843a - m1234A.f6138cv, (bn.f6844b - bn.f6845c) - m1234A.f6139cw);
                m1234A.f6107bO.mo935a(mo3058e, mo3058e);
                if (m3220Y()) {
                    m1234A.f6107bO.mo915a(f3586f, 0.0f, 0.0f, (Paint) null);
                } else {
                    m1234A.f6107bO.mo915a(f3585e, 0.0f, 0.0f, (Paint) null);
                }
                m1234A.f6107bO.mo879j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        if (m5329cJ()) {
            return 0.6f;
        }
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        if (m5329cJ()) {
            return 1.7f;
        }
        return 3.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3253l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3472a(Action action, boolean z) {
    }

    /* renamed from: a */
    public static void m3958a(ArrayList arrayList, int i) {
        arrayList.add(f3589n);
        arrayList.add(new C0227v(UnitType.extractor, 1, 1));
        arrayList.add(new C0227v(UnitType.turret, 1, 2));
        arrayList.add(new C0227v(UnitType.antiAirTurret, 1, 3));
        arrayList.add(new C0227v(UnitType.landFactory, 1, 4));
        arrayList.add(new C0227v(UnitType.airFactory, 1, 5));
        arrayList.add(new C0227v(UnitType.seaFactory, 1, 6));
        arrayList.add(new C0227v(UnitType.laserDefence, 1, 7));
        arrayList.add(new C0227v(UnitType.repairbay, 1, 8));
        arrayList.add(new C0227v(UnitType.fabricator, 1, 9));
        arrayList.add(new C0227v(UnitType.experimentalLandFactory, 1, 10));
        arrayList.add(new C0227v(UnitType.NukeLaucher, 1, 14));
        arrayList.add(new C0227v(UnitType.AntiNukeLaucher, 1, 15));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3473N() {
        return mo6961r().mo4470a(mo3223V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo3242E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3052g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3240F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && !this.f1606bT;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3238G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3236H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: g */
    public boolean mo3466g(Unit unit, boolean z) {
        return true;
    }
}
