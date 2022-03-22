package com.corrodinggames.rts.game.units.p023d.p024a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.d.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/d.class */
class C0395d extends AbstractC0394c {

    /* renamed from: b */
    final /* synthetic */ C0389b f2947b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0395d(C0389b bVar) {
        super(bVar);
        this.f2947b = bVar;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: c */
    public String mo2662c() {
        return C0389b.f2929w;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: d */
    public C0748e mo2661d(int i) {
        C0748e eVar;
        eVar = C0389b.f2919d;
        return eVar;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    float mo2669a() {
        return 350.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public float mo2667a(int i) {
        return 220.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: b */
    public float mo2663b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: a */
    public void mo2666a(AbstractC0210af afVar, int i) {
        PointF c = mo2670c(i);
        C0163f a = C0163f.m3575a(this.f2947b, c.f224a, c.f225b);
        PointF J = this.f2947b.mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f923h = 150.0f;
        a.f935t = 4.0f;
        a.f1010aQ = true;
        a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        a.f959R = (short) 2;
        a.f957P = (short) 0;
        a.f939x = 0.9f;
        PointF a2 = afVar.m3340a(c.f224a, c.f225b, a.f935t, a.f923h, mo2669a());
        a.f996aC = true;
        a.f928m = true;
        a.f929n = a2.f224a;
        a.f930o = a2.f225b;
        a.f966Y = mo2663b(i);
        a.f967Z = 55.0f;
        a.f968aa = true;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5512bu.m2115a(C0530e.f3579q, 0.3f, c.f224a, c.f225b);
        u.f5517bz.m2014a(c.f224a, c.f225b, this.f2947b.f5844dJ, this.f2947b.f1499cn[i].f1561a);
        u.f5517bz.m2001a(a, -1118482);
        C0573e a3 = u.f5517bz.m2009a(c.f224a, c.f225b, this.f2947b.f5844dJ, -1118482);
        if (a3 != null) {
            a3.f3875W = 15.0f;
            a3.f3876X = a3.f3875W;
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
        this.f2947b.f1485bZ += 300.0f;
        this.f2947b.f1484bY += 300.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: e */
    public float mo2673e(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: f */
    public float mo2672f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.AbstractC0394c
    /* renamed from: h */
    public float mo2671h(int i) {
        return -2.0f;
    }
}
