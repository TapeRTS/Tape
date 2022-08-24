package com.corrodinggames.rts.game.units.p027f;

import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1112u;

/* renamed from: com.corrodinggames.rts.game.units.f.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/c.class */
public final class C0538c {

    /* renamed from: a */
    int f3707a;

    /* renamed from: b */
    int f3708b;

    /* renamed from: c */
    float f3709c;

    /* renamed from: d */
    float f3710d;

    /* renamed from: e */
    public C0536a[][] f3711e = null;

    /* renamed from: f */
    C0539d f3712f = new C0539d();

    /* renamed from: g */
    C0542g f3713g = new C0542g();

    /* renamed from: h */
    C0543h f3714h = new C0543h();

    /* renamed from: i */
    final C1112u f3715i = new C1112u();

    /* renamed from: j */
    final C0541f f3716j = new C0541f();

    /* renamed from: k */
    final Rect f3717k = new Rect();

    /* renamed from: l */
    final int f3718l = 32;

    /* renamed from: m */
    int f3719m;

    /* renamed from: a */
    public void m3792a(float f, float f2, float f3, AbstractC0623y abstractC0623y, float f4, AbstractC0544i abstractC0544i) {
        this.f3713g.m3779a(f - f3, f2 - f3, f + f3, f2 + f3);
        m3790a(this.f3713g.f3730a, this.f3713g, abstractC0623y, f4, abstractC0544i);
    }

    /* renamed from: a */
    public final C0541f m3793a(float f, float f2, float f3) {
        C1112u c1112u = this.f3715i;
        c1112u.clear();
        m3791a(f, f2, f3, c1112u);
        this.f3716j.m3780a(c1112u);
        return this.f3716j;
    }

    /* renamed from: a */
    public final void m3791a(float f, float f2, float f3, C1112u c1112u) {
        C0536a[][] c0536aArr = this.f3711e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int m3794a = m3794a(f4);
        int m3794a2 = m3794a(f5);
        int m3785b = m3785b(f6);
        int m3785b2 = m3785b(f7);
        for (int i = m3794a; i <= m3794a2; i++) {
            for (int i2 = m3785b; i2 <= m3785b2; i2++) {
                C0537b c0537b = c0536aArr[i][i2].f3699a;
                Unit[] m3798a = c0537b.m3798a();
                int i3 = c0537b.f3705b;
                for (int i4 = 0; i4 < i3; i4++) {
                    Unit unit = m3798a[i4];
                    float f8 = unit.f6951ek;
                    float f9 = unit.f6952el;
                    if (f4 <= f8 && f8 <= f5 && f6 <= f9 && f9 <= f7) {
                        c1112u.m519a(unit);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final C0541f m3784b(float f, float f2, float f3) {
        C1112u c1112u = this.f3715i;
        c1112u.clear();
        m3783b(f, f2, f3, c1112u);
        this.f3716j.m3780a(c1112u);
        return this.f3716j;
    }

    /* renamed from: b */
    public final void m3783b(float f, float f2, float f3, C1112u c1112u) {
        C0536a[][] c0536aArr = this.f3711e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int m3794a = m3794a(f4 - 50.0f);
        int m3794a2 = m3794a(f5 + 50.0f);
        int m3785b = m3785b(f6 - 50.0f);
        int m3785b2 = m3785b(f7 + 50.0f);
        for (int i = m3794a; i <= m3794a2; i++) {
            for (int i2 = m3785b; i2 <= m3785b2; i2++) {
                C0537b c0537b = c0536aArr[i][i2].f3699a;
                Unit[] m3798a = c0537b.m3798a();
                int i3 = c0537b.f3705b;
                for (int i4 = 0; i4 < i3; i4++) {
                    Unit unit = m3798a[i4];
                    float f8 = unit.f6951ek;
                    float f9 = unit.f6952el;
                    float f10 = unit.radius;
                    if (f4 - f10 <= f8 && f8 <= f5 + f10 && f6 - f10 <= f9 && f9 <= f7 + f10) {
                        c1112u.m515b(unit);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3788a(Team team, float f, float f2, float f3, C1112u c1112u) {
        C0536a[][] c0536aArr = this.f3711e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int m3794a = m3794a(f4 - 50.0f);
        int m3794a2 = m3794a(f5 + 50.0f);
        int m3785b = m3785b(f6 - 50.0f);
        int m3785b2 = m3785b(f7 + 50.0f);
        int i = team.f1305k;
        for (int i2 = m3794a; i2 <= m3794a2; i2++) {
            for (int i3 = m3785b; i3 <= m3785b2; i3++) {
                C0537b c0537b = c0536aArr[i2][i3].f3700b[i];
                Unit[] m3798a = c0537b.m3798a();
                int i4 = c0537b.f3705b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Unit unit = m3798a[i5];
                    float f8 = unit.f6951ek;
                    float f9 = unit.f6952el;
                    float f10 = unit.radius;
                    if (f4 - f10 <= f8 && f8 <= f5 + f10 && f6 - f10 <= f9 && f9 <= f7 + f10) {
                        c1112u.m515b(unit);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3790a(RectF rectF, AbstractC0540e abstractC0540e, AbstractC0623y abstractC0623y, float f, AbstractC0544i abstractC0544i) {
        C0536a[][] c0536aArr = this.f3711e;
        int m3794a = m3794a(rectF.f234a);
        int m3794a2 = m3794a(rectF.f236c);
        int m3785b = m3785b(rectF.f235b);
        int m3785b2 = m3785b(rectF.f237d);
        Team team = null;
        int excludeTeam = abstractC0544i.excludeTeam(abstractC0623y);
        if (excludeTeam != -2 && excludeTeam != -3) {
            team = Team.m6317k(excludeTeam);
        }
        Team onlyEnemiesOfTeam = abstractC0544i.onlyEnemiesOfTeam(abstractC0623y);
        Team onlyTeam = abstractC0544i.onlyTeam(abstractC0623y);
        abstractC0544i.setup(abstractC0623y, f);
        if (onlyEnemiesOfTeam == null && onlyTeam == null) {
            for (int i = m3794a; i <= m3794a2; i++) {
                for (int i2 = m3785b; i2 <= m3785b2; i2++) {
                    C0537b c0537b = c0536aArr[i][i2].f3699a;
                    Unit[] m3798a = c0537b.m3798a();
                    int i3 = c0537b.f3705b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        Unit unit = m3798a[i4];
                        if ((team == null || unit.team != team) && abstractC0540e.mo3778a(unit)) {
                            abstractC0544i.callback(abstractC0623y, f, unit);
                        }
                    }
                }
            }
        } else if (onlyTeam != null) {
            int i5 = onlyTeam.f1305k;
            if (i5 == -1) {
                for (int i6 = m3794a; i6 <= m3794a2; i6++) {
                    for (int i7 = m3785b; i7 <= m3785b2; i7++) {
                        C0537b c0537b2 = c0536aArr[i6][i7].f3702d;
                        if (c0537b2.f3705b > 0) {
                            Unit[] m3798a2 = c0537b2.m3798a();
                            int i8 = c0537b2.f3705b;
                            for (int i9 = 0; i9 < i8; i9++) {
                                Unit unit2 = m3798a2[i9];
                                if (abstractC0540e.mo3778a(unit2)) {
                                    abstractC0544i.callback(abstractC0623y, f, unit2);
                                }
                            }
                        }
                    }
                }
            } else if (i5 == -2) {
                for (int i10 = m3794a; i10 <= m3794a2; i10++) {
                    for (int i11 = m3785b; i11 <= m3785b2; i11++) {
                        C0537b c0537b3 = c0536aArr[i10][i11].f3701c;
                        if (c0537b3.f3705b > 0) {
                            Unit[] m3798a3 = c0537b3.m3798a();
                            int i12 = c0537b3.f3705b;
                            for (int i13 = 0; i13 < i12; i13++) {
                                Unit unit3 = m3798a3[i13];
                                if (abstractC0540e.mo3778a(unit3)) {
                                    abstractC0544i.callback(abstractC0623y, f, unit3);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i14 = m3794a; i14 <= m3794a2; i14++) {
                    for (int i15 = m3785b; i15 <= m3785b2; i15++) {
                        C0537b c0537b4 = c0536aArr[i14][i15].f3700b[i5];
                        if (c0537b4.f3705b > 0) {
                            Unit[] m3798a4 = c0537b4.m3798a();
                            int i16 = c0537b4.f3705b;
                            for (int i17 = 0; i17 < i16; i17++) {
                                Unit unit4 = m3798a4[i17];
                                if (abstractC0540e.mo3778a(unit4)) {
                                    abstractC0544i.callback(abstractC0623y, f, unit4);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (onlyEnemiesOfTeam != Team.f1369h) {
                for (int i18 = m3794a; i18 <= m3794a2; i18++) {
                    for (int i19 = m3785b; i19 <= m3785b2; i19++) {
                        C0537b c0537b5 = c0536aArr[i18][i19].f3701c;
                        if (c0537b5.f3705b > 0) {
                            Unit[] m3798a5 = c0537b5.m3798a();
                            int i20 = c0537b5.f3705b;
                            for (int i21 = 0; i21 < i20; i21++) {
                                Unit unit5 = m3798a5[i21];
                                if (abstractC0540e.mo3778a(unit5)) {
                                    abstractC0544i.callback(abstractC0623y, f, unit5);
                                }
                            }
                        }
                    }
                }
            }
            int i22 = this.f3719m;
            for (int i23 = 0; i23 <= i22; i23++) {
                Team m6317k = Team.m6317k(i23);
                if (m6317k != null && onlyEnemiesOfTeam != m6317k && onlyEnemiesOfTeam.m6354c(m6317k)) {
                    for (int i24 = m3794a; i24 <= m3794a2; i24++) {
                        for (int i25 = m3785b; i25 <= m3785b2; i25++) {
                            C0537b c0537b6 = c0536aArr[i24][i25].f3700b[i23];
                            if (c0537b6.f3705b > 0) {
                                Unit[] m3798a6 = c0537b6.m3798a();
                                int i26 = c0537b6.f3705b;
                                for (int i27 = 0; i27 < i26; i27++) {
                                    Unit unit6 = m3798a6[i27];
                                    if (abstractC0540e.mo3778a(unit6)) {
                                        abstractC0544i.callback(abstractC0623y, f, unit6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int m3794a(float f) {
        int i = (int) (f * this.f3709c);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    /* renamed from: b */
    public final int m3785b(float f) {
        int i = (int) (f * this.f3710d);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    /* renamed from: a */
    public void m3795a() {
        float f = this.f3709c;
        float f2 = this.f3710d;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.isDead || ((int) (unit.f6951ek * f)) != unit.f1674dj || ((int) (unit.f6952el * f2)) != unit.f1675dk || unit.team == null || unit.f1676dl != unit.team.f1305k) {
                m3787a(unit);
            }
        }
    }

    /* renamed from: a */
    public void m3787a(Unit unit) {
        if (this.f3711e == null) {
            if (GameEngine.getInstance().f6233bx != 0) {
                GameEngine.m1145b("updateUnitGeoIndex: areaList not active");
            }
            unit.f1674dj = -1;
            unit.f1675dk = -1;
        } else if (unit.isDead) {
            if (unit.f1674dj != -1 && unit.f1675dk != -1) {
                this.f3711e[unit.f1674dj][unit.f1675dk].m3799b(unit);
                unit.f1674dj = -1;
                unit.f1675dk = -1;
            }
        } else {
            int m3794a = m3794a(unit.f6951ek);
            int m3785b = m3785b(unit.f6952el);
            int i = -2;
            if (unit.team != null) {
                i = unit.team.f1305k;
            }
            if (unit.f1674dj == m3794a && unit.f1675dk == m3785b && unit.f1676dl == i) {
                return;
            }
            if (unit.f1674dj != -1 && unit.f1675dk != -1) {
                this.f3711e[unit.f1674dj][unit.f1675dk].m3799b(unit);
            }
            unit.f1674dj = m3794a;
            unit.f1675dk = m3785b;
            unit.f1676dl = i;
            if (i > this.f3719m && this.f3719m < Team.f1364c) {
                this.f3719m = i;
            }
            this.f3711e[unit.f1674dj][unit.f1675dk].m3800a(unit);
        }
    }

    /* renamed from: a */
    public void m3789a(C0173b c0173b) {
        this.f3711e = new C0536a[32][32];
        this.f3719m = 0;
        for (int i = 0; i < 32; i++) {
            for (int i2 = 0; i2 < 32; i2++) {
                this.f3711e[i][i2] = new C0536a();
            }
        }
        this.f3707a = (c0173b.f791C * c0173b.f784n) / 32;
        this.f3708b = (c0173b.f792D * c0173b.f785o) / 32;
        this.f3709c = 1.0f / this.f3707a;
        this.f3710d = 1.0f / this.f3708b;
    }

    /* renamed from: b */
    public void m3786b() {
        this.f3711e = null;
    }

    /* renamed from: c */
    public void m3782c(float f) {
    }
}
