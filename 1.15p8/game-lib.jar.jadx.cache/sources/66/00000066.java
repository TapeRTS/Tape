package com.corrodinggames.rts.game.units.buildings.Turrets;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/c.class */
public abstract class AbstractC0460c {

    /* renamed from: a */
    final /* synthetic */ Turret f3224a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract float mo3001a();

    /* renamed from: a */
    public abstract float mo2999a(int i);

    /* renamed from: b */
    public abstract float mo2995b(int i);

    /* renamed from: a */
    public abstract void mo2998a(Unit unit, int i);

    /* renamed from: d */
    public abstract BitmapOrTexture mo2992d(int i);

    /* renamed from: b */
    public abstract int mo2996b();

    /* renamed from: c */
    public abstract String mo2994c();

    /* renamed from: a */
    public abstract void mo2997a(AbstractC0460c abstractC0460c);

    /* renamed from: d */
    public abstract int mo2993d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0460c(Turret turret) {
        this.f3224a = turret;
    }

    /* renamed from: c */
    public PointF mo3002c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.getTurretEnd(i);
        return E;
    }

    /* renamed from: a */
    public boolean m3006a(String str) {
        return mo2994c().equals(str);
    }

    /* renamed from: a */
    public void mo3000a(float f) {
    }

    /* renamed from: e */
    public float mo3005e(int i) {
        return 5.0f;
    }

    /* renamed from: f */
    public float mo3004f(int i) {
        return 0.5f;
    }

    /* renamed from: g */
    public float mo2991g(int i) {
        return 23.0f;
    }

    /* renamed from: h */
    public float mo3003h(int i) {
        return -1.0f;
    }
}