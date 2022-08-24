package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.bl */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bl.class */
public final class C0727bl {

    /* renamed from: a */
    GameEngine f4564a;

    /* renamed from: c */
    public static int f4565c = 40;

    /* renamed from: b */
    public int f4566b = 0;

    /* renamed from: d */
    public int f4567d = 0;

    /* renamed from: e */
    C0735bo f4568e = new C0735bo(this);

    /* renamed from: f */
    Paint f4569f = new Paint();

    /* renamed from: g */
    Rect f4570g = new Rect();

    /* renamed from: h */
    int f4571h = -1;

    public C0727bl(GameEngine gameEngine) {
        this.f4564a = gameEngine;
    }

    /* renamed from: a */
    public static final long m2612a() {
        return System.nanoTime();
    }

    /* renamed from: a */
    public static final float m2610a(long j) {
        return ((float) (System.nanoTime() - j)) / 1000000.0f;
    }

    /* renamed from: a */
    public static final double m2609a(long j, long j2) {
        return (j2 - j) / 1000000.0d;
    }

    /* renamed from: a */
    public static final void m2607a(String str, long j) {
        GameEngine.PrintLog(str + VariableScope.nullOrMissingString + m2611a(m2610a(j)));
    }

    /* renamed from: a */
    public final void m2608a(EnumC0729bm enumC0729bm) {
    }

    /* renamed from: b */
    public final void m2603b(EnumC0729bm enumC0729bm) {
    }

    /* renamed from: a */
    public static final String m2611a(double d) {
        return VariableScope.nullOrMissingString + CommonUtils.m2370a(d, 3) + "ms";
    }

    /* renamed from: b */
    public static final String m2604b(double d) {
        return VariableScope.nullOrMissingString + (d / 1000000.0d) + "ms";
    }

    /* renamed from: b */
    public final void m2605b() {
    }

    /* renamed from: c */
    public final void m2602c() {
    }

    /* renamed from: a */
    public final void m2606a(boolean z, boolean z2) {
    }
}
