package com.corrodinggames.rts.appFramework;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* renamed from: com.corrodinggames.rts.appFramework.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/l.class */
public class C0120l {

    /* renamed from: a */
    public static final boolean f477a;

    /* renamed from: b */
    public static final boolean f478b;

    /* renamed from: c */
    private static Method f479c;

    /* renamed from: d */
    private static Method f480d;

    /* renamed from: e */
    private static Method f481e;

    /* renamed from: f */
    private static Method f482f;

    /* renamed from: g */
    private static Method f483g;

    /* renamed from: h */
    private static Method f484h;

    /* renamed from: i */
    private static Method f485i;

    /* renamed from: j */
    private static Method f486j;

    /* renamed from: k */
    private static Method f487k;

    /* renamed from: l */
    private static int f488l;

    /* renamed from: m */
    private static int f489m;

    /* renamed from: n */
    private static final float[] f490n;

    /* renamed from: o */
    private static final float[] f491o;

    /* renamed from: p */
    private static final float[] f492p;

    /* renamed from: q */
    private static final int[] f493q;

    /* renamed from: r */
    private static final int[] f494r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ int[] m6164a() {
        return f494r;
    }

    static {
        f488l = 6;
        f489m = 8;
        boolean z = false;
        try {
            f480d = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            f481e = MotionEvent.class.getMethod("findPointerIndex", Integer.TYPE);
            f482f = MotionEvent.class.getMethod("getPressure", Integer.TYPE);
            f483g = MotionEvent.class.getMethod("getHistoricalX", Integer.TYPE, Integer.TYPE);
            f484h = MotionEvent.class.getMethod("getHistoricalY", Integer.TYPE, Integer.TYPE);
            f485i = MotionEvent.class.getMethod("getHistoricalPressure", Integer.TYPE, Integer.TYPE);
            f486j = MotionEvent.class.getMethod("getX", Integer.TYPE);
            f487k = MotionEvent.class.getMethod("getY", Integer.TYPE);
            z = true;
        } catch (Exception e) {
            Log.m6348b("MultiTouchController", "static initializer failed", e);
        }
        f477a = z;
        if (f477a) {
            try {
                f488l = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                f489m = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception e2) {
            }
        }
        boolean z2 = false;
        try {
            f479c = MotionEvent.class.getMethod("getButtonState", new Class[0]);
            z2 = true;
            Log.m6349b("MultiTouchController", "--- Mouse API succeeded");
        } catch (Exception e3) {
            Log.m6348b("MultiTouchController", "static initializer for mouse failed", e3);
        }
        f478b = z2;
        f490n = new float[10];
        f491o = new float[10];
        f492p = new float[10];
        f493q = new int[10];
        f494r = new int[10];
    }
}
