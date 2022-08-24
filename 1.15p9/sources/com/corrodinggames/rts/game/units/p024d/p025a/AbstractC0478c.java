package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/c.class */
public abstract class AbstractC0478c {

    /* renamed from: a */
    final /* synthetic */ Turret f3402a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract float mo4192a();

    /* renamed from: a */
    public abstract float mo4190a(int i);

    /* renamed from: b */
    public abstract float mo4185b(int i);

    /* renamed from: a */
    public abstract void mo4189a(Unit unit, int i);

    /* renamed from: d */
    public abstract C0934e mo4181d(int i);

    /* renamed from: b */
    public abstract int mo4186b();

    /* renamed from: c */
    public abstract String mo4184c();

    /* renamed from: a */
    public abstract void mo4188a(AbstractC0478c abstractC0478c);

    /* renamed from: d */
    public abstract int mo4182d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0478c(Turret turret) {
        this.f3402a = turret;
    }

    /* renamed from: c */
    public PointF mo4183c(int i) {
        return Turret.m4267a(this.f3402a, i);
    }

    /* renamed from: a */
    public boolean m4187a(String str) {
        return mo4184c().equals(str);
    }

    /* renamed from: a */
    public void mo4191a(float f) {
    }

    /* renamed from: e */
    public float mo4180e(int i) {
        return 5.0f;
    }

    /* renamed from: f */
    public float mo4179f(int i) {
        return 0.5f;
    }

    /* renamed from: g */
    public float mo4178g(int i) {
        return 23.0f;
    }

    /* renamed from: h */
    public float mo4177h(int i) {
        return -1.0f;
    }
}
