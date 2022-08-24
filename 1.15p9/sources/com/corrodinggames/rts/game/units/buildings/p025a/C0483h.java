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
/* renamed from: com.corrodinggames.rts.game.units.d.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/h.class */
public class C0483h extends AbstractC0478c {

    /* renamed from: b */
    final /* synthetic */ Turret f3407b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0483h(Turret turret) {
        super(turret);
        this.f3407b = turret;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public String mo4184c() {
        return Turret.f3387t;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public int mo4182d() {
        return UnitType.turret.getPrice();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public C0934e mo4181d(int i) {
        C0934e c0934e;
        c0934e = Turret.f3380a;
        return c0934e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo4192a() {
        return 165.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public float mo4185b(int i) {
        return 41.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo4190a(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: g */
    public float mo4178g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4189a(Unit unit, int i) {
        PointF c = mo4183c(i);
        C0188f m6025a = C0188f.m6025a(this.f3407b, c.f227a, c.f228b);
        PointF K = this.f3407b.m3232K(i);
        m6025a.f1010K = K.f227a;
        m6025a.f1011L = K.f228b;
        m6025a.f985l = unit;
        m6025a.f981h = 60.0f;
        m6025a.f993t = 5.0f;
        m6025a.f1042ar = Color.m6779a(255, 100, 30, 30);
        m6025a.f1020U = mo4185b(i);
        m6025a.f1015P = (short) 5;
        m6025a.f997x = 1.0f;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2552a(c.f227a, c.f228b, this.f3407b.f6953em, -1127220);
        m1234A.f6110bR.m2557a(c.f227a, c.f228b, this.f3407b.f6953em, this.f3407b.f1648cJ[i].f1711a);
        m1234A.f6105bM.m2996a(C0631e.f4049t, 0.3f, 1.0f + C0758f.m2288c(-0.07f, 0.07f), c.f227a, c.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public int mo4186b() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4188a(AbstractC0478c abstractC0478c) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4191a(float f) {
        this.f3407b.m4238s(f);
    }
}
