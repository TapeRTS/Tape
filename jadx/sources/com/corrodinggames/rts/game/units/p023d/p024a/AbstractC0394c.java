package com.corrodinggames.rts.game.units.p023d.p024a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.d.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/c.class */
abstract class AbstractC0394c {

    /* renamed from: a */
    final /* synthetic */ C0389b f2946a;

    /* renamed from: a */
    abstract float mo2669a();

    /* renamed from: a */
    public abstract float mo2667a(int i);

    /* renamed from: b */
    public abstract float mo2663b(int i);

    /* renamed from: a */
    public abstract void mo2666a(AbstractC0210af afVar, int i);

    /* renamed from: d */
    public abstract C0748e mo2661d(int i);

    /* renamed from: b */
    public abstract int mo2664b();

    /* renamed from: c */
    public abstract String mo2662c();

    /* renamed from: a */
    public abstract void mo2665a(AbstractC0394c cVar);

    AbstractC0394c(C0389b bVar) {
        this.f2946a = bVar;
    }

    /* renamed from: c */
    public PointF mo2670c(int i) {
        PointF E;
        E = AbstractC0394c.super.mo2345E(i);
        return E;
    }

    /* renamed from: a */
    public boolean m2674a(String str) {
        return mo2662c().equals(str);
    }

    /* renamed from: a */
    public void mo2668a(float f) {
    }

    /* renamed from: e */
    public float mo2673e(int i) {
        return 5.0f;
    }

    /* renamed from: f */
    public float mo2672f(int i) {
        return 0.5f;
    }

    /* renamed from: g */
    public float mo2660g(int i) {
        return 23.0f;
    }

    /* renamed from: h */
    public float mo2671h(int i) {
        return -1.0f;
    }
}
