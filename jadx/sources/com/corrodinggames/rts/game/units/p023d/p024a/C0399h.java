package com.corrodinggames.rts.game.units.p023d.p024a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.d.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/h.class */
class C0399h extends AbstractC0394c {

    /* renamed from: b */
    final /* synthetic */ C0389b f2951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0399h(C0389b bVar) {
        super(bVar);
        this.f2951b = bVar;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: c */
    public String mo2662c() {
        return C0389b.f2926t;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: d */
    public C0748e mo2661d(int i) {
        C0748e eVar;
        eVar = C0389b.f2916a;
        return eVar;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    float mo2669a() {
        return 165.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: b */
    public float mo2663b(int i) {
        return 41.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public float mo2667a(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: g */
    public float mo2660g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2666a(AbstractC0210af afVar, int i) {
        PointF c = mo2670c(i);
        C0163f a = C0163f.m3575a(this.f2951b, c.f224a, c.f225b);
        PointF J = this.f2951b.mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f927l = afVar;
        a.f923h = 60.0f;
        a.f935t = 5.0f;
        a.f985ar = Color.m4213a(255, 100, 30, 30);
        a.f962U = mo2663b(i);
        a.f957P = (short) 5;
        a.f939x = 1.0f;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2009a(c.f224a, c.f225b, this.f2951b.f5844dJ, -1127220);
        u.f5517bz.m2014a(c.f224a, c.f225b, this.f2951b.f5844dJ, this.f2951b.f1499cn[i].f1561a);
        u.f5512bu.m2114a(C0530e.f3581s, 0.3f, 1.0f + C0654f.m1458c(-0.07f, 0.07f), c.f224a, c.f225b);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: b */
    public int mo2664b() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2665a(AbstractC0394c cVar) {
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2668a(float f) {
        this.f2951b.mo2680r(f);
    }
}
