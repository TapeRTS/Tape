package com.corrodinggames.rts.java.audio.p044a;

import java.util.Random;

/* renamed from: com.corrodinggames.rts.java.audio.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/m.class */
public final class C0876m {

    /* renamed from: a */
    public static Random f5940a = new Random();

    /* renamed from: a */
    public static float m293a(float f) {
        return C0877n.f5941a[((int) (f * 2607.5945f)) & 16383];
    }

    /* renamed from: b */
    public static float m290b(float f) {
        return C0877n.f5941a[((int) ((f + 1.5707964f) * 2607.5945f)) & 16383];
    }

    /* renamed from: a */
    public static int m291a(int i) {
        return f5940a.nextInt(i + 1);
    }

    /* renamed from: b */
    public static int m289b(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    /* renamed from: a */
    public static float m292a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }
}
