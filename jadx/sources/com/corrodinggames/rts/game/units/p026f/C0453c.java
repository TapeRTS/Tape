package com.corrodinggames.rts.game.units.p026f;

import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0846u;

/* renamed from: com.corrodinggames.rts.game.units.f.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/c.class */
public final class C0453c {

    /* renamed from: a */
    int f3246a;

    /* renamed from: b */
    int f3247b;

    /* renamed from: c */
    float f3248c;

    /* renamed from: d */
    float f3249d;

    /* renamed from: e */
    public C0451a[][] f3250e = null;

    /* renamed from: f */
    C0454d f3251f = new C0454d();

    /* renamed from: g */
    C0457g f3252g = new C0457g();

    /* renamed from: h */
    C0458h f3253h = new C0458h();

    /* renamed from: i */
    final C0846u f3254i = new C0846u();

    /* renamed from: j */
    final C0456f f3255j = new C0456f();

    /* renamed from: k */
    final Rect f3256k = new Rect();

    /* renamed from: l */
    final int f3257l = 32;

    /* renamed from: a */
    public void m2462a(float f, float f2, float f3, AbstractC0515r rVar, float f4, AbstractC0459i iVar) {
        this.f3252g.m2450a(f - f3, f2 - f3, f + f3, f2 + f3);
        m2460a(this.f3252g.f3268a, this.f3252g, rVar, f4, iVar);
    }

    /* renamed from: a */
    public final C0456f m2463a(float f, float f2, float f3) {
        C0846u uVar = this.f3254i;
        uVar.clear();
        m2461a(f, f2, f3, uVar);
        this.f3255j.m2451a(uVar);
        return this.f3255j;
    }

    /* renamed from: a */
    public final void m2461a(float f, float f2, float f3, C0846u uVar) {
        C0451a[][] aVarArr = this.f3250e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        Rect rect = this.f3256k;
        rect.f227a = m2464a(f4);
        rect.f229c = m2464a(f5);
        rect.f228b = m2456b(f6);
        rect.f230d = m2456b(f7);
        for (int i = rect.f227a; i <= rect.f229c; i++) {
            for (int i2 = rect.f228b; i2 <= rect.f230d; i2++) {
                C0846u uVar2 = aVarArr[i][i2].f3240a.f3245a;
                AbstractC0210af[] a = uVar2.m456a();
                int i3 = uVar2.f5806b;
                for (int i4 = 0; i4 < i3; i4++) {
                    AbstractC0210af afVar = a[i4];
                    float f8 = afVar.f5842dH;
                    float f9 = afVar.f5843dI;
                    if (f4 <= f8 && f8 <= f5 && f6 <= f9 && f9 <= f7) {
                        uVar.add(afVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final C0456f m2455b(float f, float f2, float f3) {
        C0846u uVar = this.f3254i;
        uVar.clear();
        m2454b(f, f2, f3, uVar);
        this.f3255j.m2451a(uVar);
        return this.f3255j;
    }

    /* renamed from: b */
    public final void m2454b(float f, float f2, float f3, C0846u uVar) {
        C0451a[][] aVarArr = this.f3250e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int a = m2464a(f4 - 50.0f);
        int a2 = m2464a(f5 + 50.0f);
        int b = m2456b(f6 - 50.0f);
        int b2 = m2456b(f7 + 50.0f);
        for (int i = a; i <= a2; i++) {
            for (int i2 = b; i2 <= b2; i2++) {
                C0846u uVar2 = aVarArr[i][i2].f3240a.f3245a;
                AbstractC0210af[] a3 = uVar2.m456a();
                int i3 = uVar2.f5806b;
                for (int i4 = 0; i4 < i3; i4++) {
                    AbstractC0210af afVar = a3[i4];
                    float f8 = afVar.f5842dH;
                    float f9 = afVar.f5843dI;
                    float f10 = afVar.f1474bO;
                    if (f4 - f10 <= f8 && f8 <= f5 + f10 && f6 - f10 <= f9 && f9 <= f7 + f10) {
                        uVar.m448b(afVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m2460a(RectF rectF, AbstractC0455e eVar, AbstractC0515r rVar, float f, AbstractC0459i iVar) {
        C0451a[][] aVarArr = this.f3250e;
        Rect rect = this.f3256k;
        rect.f227a = m2464a(rectF.f231a);
        rect.f229c = m2464a(rectF.f233c);
        rect.f228b = m2456b(rectF.f232b);
        rect.f230d = m2456b(rectF.f234d);
        AbstractC0171m mVar = null;
        int excludeTeam = iVar.excludeTeam(rVar);
        if (excludeTeam != -2) {
            mVar = AbstractC0171m.m3436n(excludeTeam);
        }
        AbstractC0171m onlyEnemiesOfTeam = iVar.onlyEnemiesOfTeam(rVar);
        AbstractC0171m onlyTeam = iVar.onlyTeam(rVar);
        iVar.setup(rVar, f);
        if (onlyEnemiesOfTeam == null && onlyTeam == null) {
            for (int i = rect.f227a; i <= rect.f229c; i++) {
                for (int i2 = rect.f228b; i2 <= rect.f230d; i2++) {
                    C0846u uVar = aVarArr[i][i2].f3240a.f3245a;
                    AbstractC0210af[] a = uVar.m456a();
                    int i3 = uVar.f5806b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        AbstractC0210af afVar = a[i4];
                        if ((mVar == null || afVar.f1461bB != mVar) && eVar.mo2449a(afVar)) {
                            iVar.callback(rVar, f, afVar);
                        }
                    }
                }
            }
        } else if (onlyTeam != null) {
            int i5 = onlyTeam.f1239i;
            if (i5 == -1) {
                for (int i6 = rect.f227a; i6 <= rect.f229c; i6++) {
                    for (int i7 = rect.f228b; i7 <= rect.f230d; i7++) {
                        C0846u uVar2 = aVarArr[i6][i7].f3243d.f3245a;
                        if (uVar2.f5806b > 0) {
                            AbstractC0210af[] a2 = uVar2.m456a();
                            int i8 = uVar2.f5806b;
                            for (int i9 = 0; i9 < i8; i9++) {
                                AbstractC0210af afVar2 = a2[i9];
                                if (eVar.mo2449a(afVar2)) {
                                    iVar.callback(rVar, f, afVar2);
                                }
                            }
                        }
                    }
                }
            } else if (i5 == -2) {
                for (int i10 = rect.f227a; i10 <= rect.f229c; i10++) {
                    for (int i11 = rect.f228b; i11 <= rect.f230d; i11++) {
                        C0846u uVar3 = aVarArr[i10][i11].f3242c.f3245a;
                        if (uVar3.f5806b > 0) {
                            AbstractC0210af[] a3 = uVar3.m456a();
                            int i12 = uVar3.f5806b;
                            for (int i13 = 0; i13 < i12; i13++) {
                                AbstractC0210af afVar3 = a3[i13];
                                if (eVar.mo2449a(afVar3)) {
                                    iVar.callback(rVar, f, afVar3);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i14 = rect.f227a; i14 <= rect.f229c; i14++) {
                    for (int i15 = rect.f228b; i15 <= rect.f230d; i15++) {
                        C0846u uVar4 = aVarArr[i14][i15].f3241b[i5].f3245a;
                        if (uVar4.f5806b > 0) {
                            AbstractC0210af[] a4 = uVar4.m456a();
                            int i16 = uVar4.f5806b;
                            for (int i17 = 0; i17 < i16; i17++) {
                                AbstractC0210af afVar4 = a4[i17];
                                if (eVar.mo2449a(afVar4)) {
                                    iVar.callback(rVar, f, afVar4);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (onlyEnemiesOfTeam != AbstractC0171m.f1235f) {
                for (int i18 = rect.f227a; i18 <= rect.f229c; i18++) {
                    for (int i19 = rect.f228b; i19 <= rect.f230d; i19++) {
                        C0846u uVar5 = aVarArr[i18][i19].f3242c.f3245a;
                        if (uVar5.f5806b > 0) {
                            AbstractC0210af[] a5 = uVar5.m456a();
                            int i20 = uVar5.f5806b;
                            for (int i21 = 0; i21 < i20; i21++) {
                                AbstractC0210af afVar5 = a5[i21];
                                if (eVar.mo2449a(afVar5)) {
                                    iVar.callback(rVar, f, afVar5);
                                }
                            }
                        }
                    }
                }
            }
            for (int i22 = 0; i22 < AbstractC0171m.f1230a; i22++) {
                AbstractC0171m n = AbstractC0171m.m3436n(i22);
                if (!(n == null || onlyEnemiesOfTeam == n || !onlyEnemiesOfTeam.m3474c(n))) {
                    for (int i23 = rect.f227a; i23 <= rect.f229c; i23++) {
                        for (int i24 = rect.f228b; i24 <= rect.f230d; i24++) {
                            C0846u uVar6 = aVarArr[i23][i24].f3241b[i22].f3245a;
                            if (uVar6.f5806b > 0) {
                                AbstractC0210af[] a6 = uVar6.m456a();
                                int i25 = uVar6.f5806b;
                                for (int i26 = 0; i26 < i25; i26++) {
                                    AbstractC0210af afVar6 = a6[i26];
                                    if (eVar.mo2449a(afVar6)) {
                                        iVar.callback(rVar, f, afVar6);
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
    public final int m2464a(float f) {
        int i = (int) (f * this.f3248c);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    /* renamed from: b */
    public final int m2456b(float f) {
        int i = (int) (f * this.f3249d);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    /* renamed from: a */
    public void m2465a() {
        float f = this.f3248c;
        float f2 = this.f3249d;
        AbstractC0210af[] a = AbstractC0210af.f1442bj.m456a();
        int size = AbstractC0210af.f1442bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1459bz || ((int) (afVar.f5842dH * f)) != afVar.f1525cN || ((int) (afVar.f5843dI * f2)) != afVar.f1526cO || afVar.f1461bB == null || afVar.f1527cP != afVar.f1461bB.f1239i) {
                m2458a(afVar);
            }
        }
    }

    /* renamed from: a */
    public void m2458a(AbstractC0210af afVar) {
        if (this.f3250e == null) {
            if (AbstractC0789l.m638u().f5498bg != 0) {
                AbstractC0789l.m682b("updateUnitGeoIndex: areaList not active");
            }
            afVar.f1525cN = -1;
            afVar.f1526cO = -1;
        } else if (!afVar.f1459bz) {
            int a = m2464a(afVar.f5842dH);
            int b = m2456b(afVar.f5843dI);
            int i = -2;
            if (afVar.f1461bB != null) {
                i = afVar.f1461bB.f1239i;
            }
            if (afVar.f1525cN != a || afVar.f1526cO != b || afVar.f1527cP != i) {
                if (!(afVar.f1525cN == -1 || afVar.f1526cO == -1)) {
                    this.f3250e[afVar.f1525cN][afVar.f1526cO].m2466b(afVar);
                }
                afVar.f1525cN = a;
                afVar.f1526cO = b;
                afVar.f1527cP = i;
                this.f3250e[afVar.f1525cN][afVar.f1526cO].m2467a(afVar);
            }
        } else if (afVar.f1525cN != -1 && afVar.f1526cO != -1) {
            this.f3250e[afVar.f1525cN][afVar.f1526cO].m2466b(afVar);
            afVar.f1525cN = -1;
            afVar.f1526cO = -1;
        }
    }

    /* renamed from: a */
    public void m2459a(C0148b bVar) {
        this.f3250e = new C0451a[32][32];
        for (int i = 0; i < 32; i++) {
            for (int i2 = 0; i2 < 32; i2++) {
                this.f3250e[i][i2] = new C0451a();
            }
        }
        this.f3246a = (bVar.f750y * bVar.f735k) / 32;
        this.f3247b = (bVar.f751z * bVar.f736l) / 32;
        this.f3248c = 1.0f / this.f3246a;
        this.f3249d = 1.0f / this.f3247b;
    }

    /* renamed from: b */
    public void m2457b() {
        this.f3250e = null;
    }

    /* renamed from: c */
    public void m2453c(float f) {
    }
}
