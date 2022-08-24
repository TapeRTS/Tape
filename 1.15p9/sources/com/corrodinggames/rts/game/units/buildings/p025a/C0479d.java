package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/d.class */
public class C0479d extends AbstractC0478c {

    /* renamed from: b */
    final /* synthetic */ Turret f3403b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479d(Turret turret) {
        super(turret);
        this.f3403b = turret;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public String mo4184c() {
        return Turret.f3390w;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public int mo4182d() {
        return UnitType.turret.getPrice() + Turret.f3399dM.mo5705c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public C0934e mo4181d(int i) {
        C0934e c0934e;
        c0934e = Turret.f3383d;
        return c0934e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo4192a() {
        return 350.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo4190a(int i) {
        return 220.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public float mo4185b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo4189a(Unit unit, int i) {
        PointF c = mo4183c(i);
        C0188f m6025a = C0188f.m6025a(this.f3403b, c.f227a, c.f228b);
        PointF K = this.f3403b.m3232K(i);
        m6025a.f1010K = K.f227a;
        m6025a.f1011L = K.f228b;
        m6025a.f981h = 150.0f;
        m6025a.f993t = 4.0f;
        m6025a.f1067aQ = true;
        m6025a.f1042ar = Color.m6779a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        m6025a.f1017R = (short) 2;
        m6025a.f1015P = (short) 0;
        m6025a.f997x = 0.9f;
        PointF m5435a = unit.m5435a(c.f227a, c.f228b, m6025a.f993t, m6025a.f981h, mo4192a());
        m6025a.f1053aC = true;
        m6025a.f986m = true;
        m6025a.f987n = m5435a.f227a;
        m6025a.f988o = m5435a.f228b;
        m6025a.f1024Y = mo4185b(i);
        m6025a.f1025Z = 55.0f;
        m6025a.f1026aa = true;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6105bM.m2997a(C0631e.f4047r, 0.3f, c.f227a, c.f228b);
        m1234A.f6110bR.m2557a(c.f227a, c.f228b, this.f3403b.f6953em, this.f3403b.f1648cJ[i].f1711a);
        m1234A.f6110bR.m2544a(m6025a, -1118482);
        C0745e m2552a = m1234A.f6110bR.m2552a(c.f227a, c.f228b, this.f3403b.f6953em, -1118482);
        if (m2552a != null) {
            m2552a.f4745W = 15.0f;
            m2552a.f4746X = m2552a.f4745W;
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
        this.f3403b.f1632ct += 300.0f;
        this.f3403b.f1631cs += 300.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: e */
    public float mo4180e(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: f */
    public float mo4179f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: h */
    public float mo4177h(int i) {
        return -2.0f;
    }
}
