package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p026e.Builder;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/b.class */
public class C0584b extends AbstractC0590f implements InterfaceC0469d {

    /* renamed from: f */
    PointF[] f3808f;

    /* renamed from: g */
    PointF[] f3809g;

    /* renamed from: h */
    Rect f3810h;

    /* renamed from: a */
    static C0934e f3811a = null;

    /* renamed from: b */
    static C0934e f3812b = null;

    /* renamed from: c */
    static C0934e f3813c = null;

    /* renamed from: d */
    static C0934e f3814d = null;

    /* renamed from: e */
    static C0934e[] f3815e = new C0934e[10];

    /* renamed from: i */
    static Action f3816i = new C0218m(false);

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3253v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return Builder.f3588h[this.f1608bV.m5779O()];
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: q_ */
    public UnitType mo6869r() {
        return UnitType.f1771L;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3431b() {
        return this.f3808f;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3428c() {
        return this.f3809g;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3430bN() {
        return 6000.0f;
    }

    /* renamed from: K */
    public static void m3436K() {
        GameEngine m1234A = GameEngine.m1234A();
        f3812b = m1234A.f6107bO.mo930a(C0067R.drawable.builder_ship);
        f3811a = m1234A.f6107bO.mo930a(C0067R.drawable.builder_ship_dead);
        f3813c = m1234A.f6107bO.mo930a(C0067R.drawable.builder_ship_turret);
        f3815e = AbstractC0197n.m5756a(f3812b);
        f3814d = m5273a(f3812b, f3812b.mo396m(), f3812b.mo397l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3266d() {
        if (this.f1606bT) {
            return f3811a;
        }
        return f3815e[this.f1608bV.m5779O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3265d(int i) {
        return f3813c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3257k() {
        return f3814d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3281F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && this.f6953em > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3280G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3279H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3263e() {
        GameEngine.m1234A().f6110bR.m2537b(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3811a;
        m472S(0);
        this.f1605bS = false;
        return true;
    }

    public C0584b(boolean z) {
        super(z);
        this.f3808f = new PointF[6];
        this.f3809g = new PointF[this.f3808f.length];
        this.f3810h = new Rect();
        m2873b(f3812b);
        this.f1620ch = 13.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 500.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3812b;
        for (int i = 0; i < this.f3808f.length; i++) {
            this.f3808f[i] = new PointF();
            this.f3809g[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3255m() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3252z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3286A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3285B() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3268c(int i) {
        return 3.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3421w(int i) {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3284C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3283D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo3274a(float f) {
        super.mo3274a(f);
        if (!this.f1606bT) {
            Builder.m3808a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo3273a(float f, boolean z) {
        super.mo3273a(f, z);
        if (!this.f1606bT) {
            Builder.m3804b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo3269c(float f) {
        if (!super.mo3269c(f)) {
            return false;
        }
        GameEngine m1234A = GameEngine.m1234A();
        C1117y.m487a((AbstractC0623y) this);
        if (!this.f1606bT) {
            float mo3262e = this.f1648cJ[0].f1716f / mo3262e(0);
            if (mo3262e != 0.0f) {
                PointF E = mo3242E(0);
                m1234A.f6107bO.mo880i();
                m1234A.f6107bO.mo896b(E.f227a - m1234A.f6138cv, (E.f228b - m1234A.f6139cw) - this.f6953em);
                m1234A.f6107bO.mo935a(mo3262e, mo3262e);
                if (m3221Y()) {
                    m1234A.f6107bO.mo915a(Builder.f3586f, 0.0f, 0.0f, (Paint) null);
                } else {
                    m1234A.f6107bO.mo915a(Builder.f3585e, 0.0f, 0.0f, (Paint) null);
                }
                m1234A.f6107bO.mo879j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3256l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3260g(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bl */
    public int mo3429bl() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo3437G(int i) {
        f3981bg.m6564a(this.f6951ek + (C0758f.m2244i(this.f1617ce) * 8.0f), this.f6952el + (C0758f.m2249h(this.f1617ce) * 8.0f));
        return f3981bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3270b(int i) {
        return 120 - (i * 28);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3262e(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: f */
    public float mo3261f(int i) {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo3433a(Unit unit) {
        if (!unit.m5142q() && unit.m5255bI()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3434a(Action action, boolean z) {
    }

    /* renamed from: a */
    public static void m3432a(ArrayList arrayList, int i) {
        arrayList.add(f3816i);
        arrayList.add(new C0227v(UnitType.f1734a, 1, 1));
        arrayList.add(new C0227v(UnitType.f1739f, 1, 2));
        arrayList.add(new C0227v(UnitType.f1740g, 1, 3));
        arrayList.add(new C0227v(UnitType.f1735b, 1, 4));
        arrayList.add(new C0227v(UnitType.f1736c, 1, 5));
        arrayList.add(new C0227v(UnitType.f1737d, 1, 6));
        arrayList.add(new C0227v(UnitType.f1769J, 1, 7));
        arrayList.add(new C0227v(UnitType.f1758y, 1, 8));
        arrayList.add(new C0227v(UnitType.f1761B, 1, 9));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3435N() {
        return mo6869r().mo4265a(mo3224V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3271a(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: y */
    public int mo3420y() {
        return 145;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: g */
    public boolean mo3426g(Unit unit, boolean z) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: f */
    public float mo3427f(InterfaceC0303as interfaceC0303as) {
        int mo3420y = mo3420y();
        int mo4263a = interfaceC0303as.mo4263a(this);
        if (mo4263a == 0 && interfaceC0303as.mo4202p()) {
            mo4263a = 110;
        }
        return mo3420y + mo4263a;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: u */
    public int mo3423u(Unit unit) {
        return (int) mo3427f(unit.mo6873r());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public int mo3422v(Unit unit) {
        return (int) mo3427f(unit.mo6873r());
    }
}
