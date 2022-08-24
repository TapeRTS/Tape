package com.corrodinggames.rts.appFramework;

/* renamed from: com.corrodinggames.rts.appFramework.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/m.class */
public class C0121m {

    /* renamed from: a */
    private int f495a;

    /* renamed from: b */
    private float[] f496b = new float[10];

    /* renamed from: c */
    private float[] f497c = new float[10];

    /* renamed from: d */
    private float[] f498d = new float[10];

    /* renamed from: e */
    private int[] f499e = new int[10];

    /* renamed from: f */
    private float f500f;

    /* renamed from: g */
    private float f501g;

    /* renamed from: h */
    private float f502h;

    /* renamed from: i */
    private float f503i;

    /* renamed from: j */
    private float f504j;

    /* renamed from: k */
    private boolean f505k;

    /* renamed from: l */
    private boolean f506l;

    /* renamed from: m */
    private boolean f507m;

    /* renamed from: n */
    private int f508n;

    /* renamed from: o */
    private boolean f509o;

    /* renamed from: p */
    private boolean f510p;

    /* renamed from: q */
    private boolean f511q;

    /* renamed from: r */
    private int f512r;

    public C0121m() {
        for (int i = 0; i < this.f496b.length; i++) {
            this.f496b[i] = 40.0f;
        }
        for (int i2 = 0; i2 < this.f497c.length; i2++) {
            this.f497c[i2] = 40.0f;
        }
    }

    /* renamed from: a */
    public int m6163a() {
        return this.f508n;
    }

    /* renamed from: b */
    public boolean m6160b() {
        return this.f507m;
    }

    /* renamed from: c */
    public void m6159c() {
        this.f507m = this.f505k;
        this.f508n = this.f495a;
    }

    /* renamed from: a */
    public void m6162a(float f, float f2) {
        this.f496b[0] = f;
        this.f497c[0] = f2;
        this.f500f = this.f496b[0];
        this.f501g = this.f497c[0];
        this.f504j = 0.0f;
        this.f503i = 0.0f;
    }

    /* renamed from: a */
    public void m6161a(float f, float f2, boolean z, int i) {
        this.f512r = 0;
        this.f495a = z ? 1 : 0;
        if (i != -1) {
            C0120l.m6164a()[0] = i;
        }
        this.f496b[0] = f;
        this.f497c[0] = f2;
        this.f498d[0] = 0.0f;
        this.f499e[0] = 0;
        this.f505k = z;
        this.f506l = false;
        if (this.f505k) {
            this.f507m = this.f505k;
        }
        if (this.f495a > 0) {
            this.f508n = this.f495a;
        }
        this.f500f = this.f496b[0];
        this.f501g = this.f497c[0];
        this.f502h = this.f498d[0];
        this.f504j = 0.0f;
        this.f503i = 0.0f;
        this.f511q = false;
        this.f510p = false;
        this.f509o = false;
    }

    /* renamed from: d */
    public float[] m6158d() {
        return this.f496b;
    }

    /* renamed from: e */
    public int[] m6157e() {
        return C0120l.m6164a();
    }

    /* renamed from: f */
    public float[] m6156f() {
        return this.f497c;
    }
}
