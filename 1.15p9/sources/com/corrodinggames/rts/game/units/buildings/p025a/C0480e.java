package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/e.class */
public class C0480e extends AbstractC0478c {

    /* renamed from: b */
    final /* synthetic */ Turret f3404b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0480e(Turret turret) {
        super(turret);
        this.f3404b = turret;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public String mo4184c() {
        return Turret.f3391x;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public int mo4182d() {
        return UnitType.turret.getPrice() + Turret.f3400dN.mo5705c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public C0934e mo4181d(int i) {
        C0934e c0934e;
        c0934e = Turret.f3384e;
        return c0934e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo4192a() {
        return 155.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo4190a(int i) {
        return 5.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public float mo4185b(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4189a(Unit unit, int i) {
        PointF c = mo4183c(i);
        C0188f m6025a = C0188f.m6025a(this.f3404b, c.f227a, c.f228b);
        m6025a.f981h = 60.0f;
        m6025a.f993t = 3.0f + ((this.f3404b.f3372k * 13) % 2.0f);
        m6025a.f1068aR = false;
        m6025a.f1006G = true;
        m6025a.f1042ar = Color.m6779a(105, 255, 255, 255);
        m6025a.f1015P = (short) 3;
        m6025a.f997x = 1.3f;
        PointF m5435a = unit.m5435a(c.f227a, c.f228b, m6025a.f993t, m6025a.f981h, mo4192a());
        m6025a.f1053aC = true;
        m6025a.f986m = true;
        m6025a.f987n = m5435a.f227a;
        m6025a.f988o = m5435a.f228b;
        m6025a.f987n += (-15) + ((this.f3404b.f3372k * 13) % 30);
        m6025a.f988o += (-15) + ((63 + (this.f3404b.f3372k * 33)) % 30);
        m6025a.f6949ei = 3;
        m6025a.f1024Y = mo4185b(i);
        m6025a.f1025Z = 65.0f;
        m6025a.f1026aa = true;
        m6025a.f1002C = true;
        GameEngine m1234A = GameEngine.m1234A();
        this.f3404b.f3372k++;
        if (this.f3404b.f3372k > 10) {
            this.f3404b.f3372k = 0;
            m1234A.f6110bR.m2557a(c.f227a, c.f228b, this.f3404b.f6953em, this.f3404b.f1648cJ[i].f1711a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public int mo4186b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4188a(AbstractC0478c abstractC0478c) {
        this.f3404b.f1632ct += 900.0f;
        this.f3404b.f1631cs += 900.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4191a(float f) {
        if (this.f3404b.f1631cs < this.f3404b.f1632ct) {
            this.f3404b.f1631cs += 0.15f * f;
            if (this.f3404b.f1631cs > this.f3404b.f1632ct) {
                this.f3404b.f1631cs = this.f3404b.f1632ct;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: e */
    public float mo4180e(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: f */
    public float mo4179f(int i) {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: g */
    public float mo4178g(int i) {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: h */
    public float mo4177h(int i) {
        return 0.0f;
    }
}
