package com.corrodinggames.rts.p008a;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* renamed from: com.corrodinggames.rts.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/j.class */
public class C0090j {

    /* renamed from: a */
    public static final boolean f416a;

    /* renamed from: b */
    public static final boolean f417b;

    /* renamed from: c */
    private static Method f418c;

    /* renamed from: d */
    private static Method f419d;

    /* renamed from: e */
    private static Method f420e;

    /* renamed from: f */
    private static Method f421f;

    /* renamed from: g */
    private static Method f422g;

    /* renamed from: h */
    private static Method f423h;

    /* renamed from: i */
    private static Method f424i;

    /* renamed from: j */
    private static Method f425j;

    /* renamed from: k */
    private static Method f426k;

    /* renamed from: l */
    private static int f427l;

    /* renamed from: m */
    private static int f428m;

    /* renamed from: n */
    private static final float[] f429n;

    /* renamed from: o */
    private static final float[] f430o;

    /* renamed from: p */
    private static final float[] f431p;

    /* renamed from: q */
    private static final int[] f432q;

    /* renamed from: r */
    private static final int[] f433r;

    /* renamed from: a */
    static /* synthetic */ int[] m3932a() {
        return f433r;
    }

    static {
        f427l = 6;
        f428m = 8;
        boolean z = false;
        try {
            f419d = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            f420e = MotionEvent.class.getMethod("findPointerIndex", Integer.TYPE);
            f421f = MotionEvent.class.getMethod("getPressure", Integer.TYPE);
            f422g = MotionEvent.class.getMethod("getHistoricalX", Integer.TYPE, Integer.TYPE);
            f423h = MotionEvent.class.getMethod("getHistoricalY", Integer.TYPE, Integer.TYPE);
            f424i = MotionEvent.class.getMethod("getHistoricalPressure", Integer.TYPE, Integer.TYPE);
            f425j = MotionEvent.class.getMethod("getX", Integer.TYPE);
            f426k = MotionEvent.class.getMethod("getY", Integer.TYPE);
            z = true;
        } catch (Exception e) {
            Log.m4036b("MultiTouchController", "static initializer failed", e);
        }
        f416a = z;
        if (f416a) {
            try {
                f427l = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                f428m = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception e2) {
            }
        }
        boolean z2 = false;
        try {
            f418c = MotionEvent.class.getMethod("getButtonState", new Class[0]);
            z2 = true;
            Log.m4037b("MultiTouchController", "--- Mouse API succeeded");
        } catch (Exception e3) {
            Log.m4036b("MultiTouchController", "static initializer for mouse failed", e3);
        }
        f417b = z2;
        f429n = new float[10];
        f430o = new float[10];
        f431p = new float[10];
        f432q = new int[10];
        f433r = new int[10];
    }
}
