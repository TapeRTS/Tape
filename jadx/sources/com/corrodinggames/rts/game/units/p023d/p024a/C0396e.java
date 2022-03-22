package com.corrodinggames.rts.game.units.p023d.p024a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.d.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/e.class */
class C0396e extends AbstractC0394c {

    /* renamed from: b */
    final /* synthetic */ C0389b f2948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0396e(C0389b bVar) {
        super(bVar);
        this.f2948b = bVar;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: c */
    public String mo2662c() {
        return C0389b.f2930x;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: d */
    public C0748e mo2661d(int i) {
        C0748e eVar;
        eVar = C0389b.f2920e;
        return eVar;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    float mo2669a() {
        return 155.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public float mo2667a(int i) {
        return 5.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: b */
    public float mo2663b(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2666a(AbstractC0210af afVar, int i) {
        PointF c = mo2670c(i);
        C0163f a = C0163f.m3575a(this.f2948b, c.f224a, c.f225b);
        a.f923h = 60.0f;
        a.f935t = 3.0f + ((this.f2948b.f2924k * 13) % 2.0f);
        a.f1011aR = false;
        a.f948G = true;
        a.f985ar = Color.m4213a(105, 255, 255, 255);
        a.f957P = (short) 3;
        a.f939x = 1.3f;
        PointF a2 = afVar.m3340a(c.f224a, c.f225b, a.f935t, a.f923h, mo2669a());
        a.f996aC = true;
        a.f928m = true;
        a.f929n = a2.f224a;
        a.f930o = a2.f225b;
        a.f929n += (-15) + ((this.f2948b.f2924k * 13) % 30);
        a.f930o += (-15) + ((63 + (this.f2948b.f2924k * 33)) % 30);
        a.f5840dF = 3;
        a.f966Y = mo2663b(i);
        a.f967Z = 65.0f;
        a.f968aa = true;
        a.f944C = true;
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f2948b.f2924k++;
        if (this.f2948b.f2924k > 10) {
            this.f2948b.f2924k = 0;
            u.f5517bz.m2014a(c.f224a, c.f225b, this.f2948b.f5844dJ, this.f2948b.f1499cn[i].f1561a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: b */
    public int mo2664b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2665a(AbstractC0394c cVar) {
        this.f2948b.f1485bZ += 900.0f;
        this.f2948b.f1484bY += 900.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2668a(float f) {
        if (this.f2948b.f1484bY < this.f2948b.f1485bZ) {
            this.f2948b.f1484bY += 0.15f * f;
            if (this.f2948b.f1484bY > this.f2948b.f1485bZ) {
                this.f2948b.f1484bY = this.f2948b.f1485bZ;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: e */
    public float mo2673e(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: f */
    public float mo2672f(int i) {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: g */
    public float mo2660g(int i) {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: h */
    public float mo2671h(int i) {
        return 0.0f;
    }
}
