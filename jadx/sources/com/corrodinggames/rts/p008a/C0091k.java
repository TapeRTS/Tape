package com.corrodinggames.rts.p008a;

/* renamed from: com.corrodinggames.rts.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/k.class */
public class C0091k {

    /* renamed from: a */
    private int f434a;

    /* renamed from: b */
    private float[] f435b = new float[10];

    /* renamed from: c */
    private float[] f436c = new float[10];

    /* renamed from: d */
    private float[] f437d = new float[10];

    /* renamed from: e */
    private int[] f438e = new int[10];

    /* renamed from: f */
    private float f439f;

    /* renamed from: g */
    private float f440g;

    /* renamed from: h */
    private float f441h;

    /* renamed from: i */
    private float f442i;

    /* renamed from: j */
    private float f443j;

    /* renamed from: k */
    private boolean f444k;

    /* renamed from: l */
    private boolean f445l;

    /* renamed from: m */
    private boolean f446m;

    /* renamed from: n */
    private int f447n;

    /* renamed from: o */
    private boolean f448o;

    /* renamed from: p */
    private boolean f449p;

    /* renamed from: q */
    private boolean f450q;

    /* renamed from: r */
    private int f451r;

    public C0091k() {
        for (int i = 0; i < this.f435b.length; i++) {
            this.f435b[i] = 40.0f;
        }
        for (int i2 = 0; i2 < this.f436c.length; i2++) {
            this.f436c[i2] = 40.0f;
        }
    }

    /* renamed from: a */
    public int m3931a() {
        return this.f447n;
    }

    /* renamed from: b */
    public boolean m3928b() {
        return this.f446m;
    }

    /* renamed from: c */
    public void m3927c() {
        this.f446m = this.f444k;
        this.f447n = this.f434a;
    }

    /* renamed from: a */
    public void m3930a(float f, float f2) {
        this.f435b[0] = f;
        this.f436c[0] = f2;
        this.f439f = this.f435b[0];
        this.f440g = this.f436c[0];
        this.f443j = 0.0f;
        this.f442i = 0.0f;
    }

    /* renamed from: a */
    public void m3929a(float f, float f2, boolean z, int i) {
        this.f451r = 0;
        this.f434a = z ? 1 : 0;
        if (i != -1) {
            C0090j.m3932a()[0] = i;
        }
        this.f435b[0] = f;
        this.f436c[0] = f2;
        this.f437d[0] = 0.0f;
        this.f438e[0] = 0;
        this.f444k = z;
        this.f445l = false;
        if (this.f444k) {
            this.f446m = this.f444k;
        }
        if (this.f434a > 0) {
            this.f447n = this.f434a;
        }
        this.f439f = this.f435b[0];
        this.f440g = this.f436c[0];
        this.f441h = this.f437d[0];
        this.f443j = 0.0f;
        this.f442i = 0.0f;
        this.f450q = false;
        this.f449p = false;
        this.f448o = false;
    }

    /* renamed from: d */
    public float[] m3926d() {
        return this.f435b;
    }

    /* renamed from: e */
    public int[] m3925e() {
        return C0090j.m3932a();
    }

    /* renamed from: f */
    public float[] m3924f() {
        return this.f436c;
    }
}
