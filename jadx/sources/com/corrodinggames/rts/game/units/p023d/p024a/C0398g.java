package com.corrodinggames.rts.game.units.p023d.p024a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.d.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/g.class */
class C0398g extends AbstractC0394c {

    /* renamed from: b */
    final /* synthetic */ C0389b f2950b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0398g(C0389b bVar) {
        super(bVar);
        this.f2950b = bVar;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: c */
    public String mo2662c() {
        return C0389b.f2928v;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: d */
    public C0748e mo2661d(int i) {
        C0748e eVar;
        eVar = C0389b.f2918c;
        return eVar;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    float mo2669a() {
        return 320.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public float mo2667a(int i) {
        return 13.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: b */
    public float mo2663b(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: c */
    public PointF mo2670c(int i) {
        PointF E;
        E = C0398g.super.mo2345E(i);
        float f = (this.f2950b.mo2346E() ? this.f2950b.f1471bL : this.f2950b.f1499cn[i].f1561a) + (this.f2950b.f2924k == 1 ? -90 : 90);
        E.f224a += C0654f.m1421i(f) * 4.0f;
        E.f225b += C0654f.m1425h(f) * 4.0f;
        return E;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2666a(AbstractC0210af afVar, int i) {
        PointF c = mo2670c(i);
        C0163f a = C0163f.m3575a(this.f2950b, c.f224a, c.f225b);
        PointF J = this.f2950b.mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f927l = afVar;
        a.f923h = 60.0f;
        a.f935t = 9.0f;
        a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 30, 30);
        a.f962U = mo2663b(i);
        a.f957P = (short) 5;
        a.f939x = 1.0f;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m2009a(c.f224a, c.f225b, this.f2950b.f5844dJ, -1127220);
        u.f5517bz.m2014a(c.f224a, c.f225b, this.f2950b.f5844dJ, this.f2950b.f1499cn[i].f1561a);
        u.f5512bu.m2114a(C0530e.f3581s, 0.15f, 1.0f + C0654f.m1458c(-0.07f, 0.07f), c.f224a, c.f225b);
        this.f2950b.f2924k = this.f2950b.f2924k == 1 ? 0 : 1;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2668a(float f) {
        if (this.f2950b.f1484bY < this.f2950b.f1485bZ) {
            this.f2950b.f1484bY += 0.1f * f;
            if (this.f2950b.f1484bY > this.f2950b.f1485bZ) {
                this.f2950b.f1484bY = this.f2950b.f1485bZ;
            }
        }
        this.f2950b.mo2680r(f);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: b */
    public int mo2664b() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2665a(AbstractC0394c cVar) {
        if (!(cVar instanceof C0397f)) {
            this.f2950b.f1485bZ += 400.0f;
            this.f2950b.f1484bY += 400.0f;
        }
        this.f2950b.f1485bZ += 2800.0f;
        this.f2950b.f1484bY += 2800.0f;
    }
}
