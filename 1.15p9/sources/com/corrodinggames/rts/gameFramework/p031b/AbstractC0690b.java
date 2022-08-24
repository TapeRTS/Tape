package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;
import android.util.Log;
import java.util.WeakHashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/b.class */
public abstract class AbstractC0690b implements InterfaceC0681ab {

    /* renamed from: a */
    protected int f4346a;

    /* renamed from: b */
    protected int f4347b;

    /* renamed from: c */
    protected int f4348c;

    /* renamed from: d */
    protected int f4349d;

    /* renamed from: e */
    protected int f4350e;

    /* renamed from: f */
    protected int f4351f;

    /* renamed from: g */
    protected float f4352g;

    /* renamed from: h */
    protected float f4353h;

    /* renamed from: l */
    private boolean f4354l;

    /* renamed from: m */
    private boolean f4355m;

    /* renamed from: i */
    public int f4356i;

    /* renamed from: j */
    public boolean f4357j;

    /* renamed from: k */
    protected InterfaceC0700k f4358k;

    /* renamed from: n */
    private static WeakHashMap f4359n = new WeakHashMap();

    /* renamed from: o */
    private static ThreadLocal f4360o = new ThreadLocal();

    /* renamed from: b */
    public abstract void mo2671b(InterfaceC0700k interfaceC0700k);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo2670c(InterfaceC0700k interfaceC0700k);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo2669g();

    /* renamed from: b */
    public abstract void mo2672b(int i);

    /* renamed from: h */
    public abstract int mo2668h();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0690b(InterfaceC0700k interfaceC0700k, int i, int i2) {
        this.f4346a = -1;
        this.f4348c = -1;
        this.f4349d = -1;
        this.f4358k = null;
        m2809a(interfaceC0700k);
        this.f4346a = i;
        this.f4347b = i2;
        synchronized (f4359n) {
            f4359n.put(this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0690b() {
        this(null, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m2809a(InterfaceC0700k interfaceC0700k) {
        this.f4358k = interfaceC0700k;
    }

    /* renamed from: a */
    public void m2812a(int i, int i2) {
        this.f4348c = i;
        this.f4349d = i2;
        this.f4350e = i > 0 ? m2813a(i) : 0;
        this.f4351f = i2 > 0 ? m2813a(i2) : 0;
        if (this.f4350e == 0) {
            this.f4352g = 0.0f;
        } else {
            this.f4352g = 1.0f / this.f4350e;
        }
        if (this.f4351f == 0) {
            this.f4353h = 0.0f;
        } else {
            this.f4353h = 1.0f / this.f4351f;
        }
        if (this.f4350e > 4096 || this.f4351f > 4096) {
            Log.m6351a("BasicTexture", String.format("secondBitmap is too large: %d x %d", Integer.valueOf(this.f4350e), Integer.valueOf(this.f4351f)), new Exception());
        }
    }

    /* renamed from: a */
    public static int m2813a(int i) {
        if (i <= 0 || i > 1073741824) {
            throw new IllegalArgumentException("n is invalid: " + i);
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 16);
        int i4 = i3 | (i3 >> 8);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 2);
        return (i6 | (i6 >> 1)) + 1;
    }

    /* renamed from: a */
    public int m2814a() {
        return this.f4346a;
    }

    /* renamed from: b */
    public int mo2807b() {
        return this.f4348c;
    }

    /* renamed from: c */
    public int mo2806c() {
        return this.f4349d;
    }

    /* renamed from: d */
    public int m2805d() {
        return this.f4350e;
    }

    /* renamed from: e */
    public int m2804e() {
        return this.f4351f;
    }

    /* renamed from: f */
    public boolean m2803f() {
        return this.f4354l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m2808a(boolean z) {
        this.f4354l = z;
    }

    /* renamed from: i */
    public boolean m2802i() {
        return this.f4347b == 1;
    }

    /* renamed from: j */
    public void mo2801j() {
        this.f4355m = true;
        m2800k();
    }

    /* renamed from: k */
    private void m2800k() {
        InterfaceC0700k interfaceC0700k = this.f4358k;
        if (interfaceC0700k != null && this.f4346a != -1) {
            interfaceC0700k.mo2770a(this);
            this.f4346a = -1;
        }
        this.f4347b = 0;
        m2809a((InterfaceC0700k) null);
    }

    protected void finalize() {
        f4360o.set(AbstractC0690b.class);
        mo2801j();
        f4360o.set(null);
    }

    /* renamed from: a */
    public void mo2811a(RectF rectF) {
        int mo2807b = mo2807b();
        int mo2806c = mo2806c();
        int m2805d = m2805d();
        int m2804e = m2804e();
        rectF.f234a /= m2805d;
        rectF.f236c /= m2805d;
        rectF.f235b /= m2804e;
        rectF.f237d /= m2804e;
        float f = mo2807b / m2805d;
        if (rectF.f236c > f) {
            rectF.f236c = f;
        }
        float f2 = mo2806c / m2804e;
        if (rectF.f237d > f2) {
            rectF.f237d = f2;
        }
    }

    /* renamed from: a */
    public void mo2810a(RectF rectF, RectF rectF2) {
        float mo2806c = mo2806c() / m2804e();
        float mo2807b = mo2807b() / m2805d();
        if (rectF.f236c > mo2807b) {
            rectF2.f236c = rectF2.f234a + ((rectF2.m6429b() * (mo2807b - rectF.f234a)) / rectF.m6429b());
        }
        if (rectF.f237d > mo2806c) {
            rectF2.f237d = rectF2.f235b + ((rectF2.m6425c() * (mo2806c - rectF.f235b)) / rectF.m6425c());
        }
    }
}
