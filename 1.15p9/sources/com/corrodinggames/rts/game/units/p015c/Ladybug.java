package com.corrodinggames.rts.game.units.p015c;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p026e.AbstractC0529j;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/c/a.class */
public class Ladybug extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f1898a = null;

    /* renamed from: b */
    static C0934e f1899b = null;

    /* renamed from: c */
    static C0934e f1900c = null;

    /* renamed from: d */
    static C0934e[] f1901d = new C0934e[10];

    /* renamed from: e */
    int f1902e;

    /* renamed from: f */
    float f1903f;

    /* renamed from: g */
    Rect f1904g;

    /* renamed from: h */
    Rect f1905h;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6641r() {
        return UnitType.ladybug;
    }

    /* renamed from: c */
    public static void load() {
        f1899b = GameEngine.m1234A().f6107bO.mo930a(C0067R.drawable.ladybug);
        f1901d = AbstractC0197n.m5522a(f1899b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f1898a;
        }
        return f1901d[this.f1608bV.m5545O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3411e() {
        GameEngine m1234A = GameEngine.m1234A();
        if (m1234A.f6110bR.m2532b(this.f6951ek, this.f6952el, this.f6953em, EnumC0744d.f4710i, false, EnumC0748h.f4828c) != null) {
        }
        m1234A.f6105bM.m2997a(C0631e.f4056A, 0.8f, this.f6951ek, this.f6952el);
        C0195l.m5570a(this, 1);
        return false;
    }

    public Ladybug(boolean z) {
        super(z);
        this.f1902e = 0;
        this.f1903f = 0.0f;
        this.f1904g = new Rect();
        this.f1905h = new Rect();
        m2879T(17);
        m2878U(26);
        this.f1620ch = 5.0f;
        this.f1621ci = this.f1620ch + 3.0f;
        this.f1632ct = 130.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f1899b;
        this.f3889O = EnumC0205a.f1417a;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect mo3586a_(boolean z) {
        int i = this.f1902e * this.f4223eo;
        this.f1904g.m6331a(i, 0, i + this.f4223eo, 0 + this.f4224ep);
        return this.f1904g;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bP */
    public boolean mo4364bP() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bO */
    public boolean mo4365bO() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (this.f1647cI) {
            if (this.f1902e == 0) {
                this.f1902e = 1;
            } else {
                this.f1902e = 0;
            }
        }
        if (this.f1903f != 0.0f) {
            this.f1903f = C0758f.m2363a(this.f1903f, f);
            this.f1902e = 2;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        C0188f.m5646a((Unit) this, unit, 14.0f, (C0188f) null, false);
        this.f1903f = 4.0f;
        PointF E = mo3241E(i);
        GameEngine.m1234A().f6105bM.m2997a(C0631e.f4057B, 0.3f, E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 43.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 17.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 5.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        return super.mo3445c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3410l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo3140af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3052g(int i) {
        return 7.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo3242E() {
        return true;
    }
}
