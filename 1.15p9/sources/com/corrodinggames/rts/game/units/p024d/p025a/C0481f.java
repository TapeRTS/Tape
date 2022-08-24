package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/f.class */
public class C0481f extends AbstractC0478c {

    /* renamed from: b */
    final /* synthetic */ Turret f3405b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0481f(Turret turret) {
        super(turret);
        this.f3405b = turret;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public String mo4184c() {
        return Turret.f3388u;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public int mo4182d() {
        return UnitType.turret.getPrice() + Turret.f3397dK.mo5705c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public C0934e mo4181d(int i) {
        C0934e c0934e;
        c0934e = Turret.f3381b;
        return c0934e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo4192a() {
        return 185.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo4190a(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public float mo4185b(int i) {
        return 44.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: g */
    public float mo4178g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public PointF mo4183c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.m3242E(i);
        float f = (this.f3405b.mo3282E() ? this.f3405b.f1617ce : this.f3405b.f1648cJ[i].f1711a) + (this.f3405b.f3372k == 1 ? -90 : 90);
        E.f227a += C0758f.m2244i(f) * 4.0f;
        E.f228b += C0758f.m2249h(f) * 4.0f;
        return E;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4189a(Unit unit, int i) {
        PointF mo4183c = mo4183c(i);
        C0188f m6025a = C0188f.m6025a(this.f3405b, mo4183c.f227a, mo4183c.f228b);
        PointF K = this.f3405b.m3232K(i);
        m6025a.f1010K = K.f227a;
        m6025a.f1011L = K.f228b;
        m6025a.f985l = unit;
        m6025a.f981h = 60.0f;
        m6025a.f993t = 6.0f;
        m6025a.f1042ar = Color.m6779a(255, 40, 30, 110);
        m6025a.f1020U = mo4185b(i);
        m6025a.f1015P = (short) 5;
        m6025a.f997x = 1.0f;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2552a(mo4183c.f227a, mo4183c.f228b, this.f3405b.f6953em, -1127220);
        m1234A.f6110bR.m2557a(mo4183c.f227a, mo4183c.f228b, this.f3405b.f6953em, this.f3405b.f1648cJ[i].f1711a);
        m1234A.f6105bM.m2996a(C0631e.f4049t, 0.3f, 1.0f + C0758f.m2288c(-0.07f, 0.07f), mo4183c.f227a, mo4183c.f228b);
        this.f3405b.f3372k = this.f3405b.f3372k == 1 ? 0 : 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public int mo4186b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4188a(AbstractC0478c abstractC0478c) {
        this.f3405b.f1632ct += 400.0f;
        this.f3405b.f1631cs += 400.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4191a(float f) {
        this.f3405b.m4238s(f);
    }
}
