package p000a.p001a;

/* renamed from: a.a.i */
/* loaded from: game-lib.jar:a/a/i.class */
class C0019i {

    /* renamed from: b */
    private int f83b;

    /* renamed from: c */
    private int f84c;

    /* renamed from: d */
    private int f85d;

    /* renamed from: e */
    private int f86e;

    /* renamed from: f */
    private int f87f;

    /* renamed from: a */
    final /* synthetic */ C0017h f88a;

    public C0019i(C0017h hVar) {
        this.f88a = hVar;
    }

    /* renamed from: a */
    public synchronized int m4327a() {
        int b;
        b = C0017h.m4361b(this.f83b);
        this.f83b = b;
        return b;
    }

    /* renamed from: a */
    public synchronized int m4326a(int i) {
        this.f83b = i;
        return this.f83b;
    }

    /* renamed from: b */
    public synchronized int m4324b(int i) {
        this.f84c = i;
        return this.f84c;
    }

    /* renamed from: b */
    public synchronized int m4325b() {
        return this.f84c;
    }

    /* renamed from: c */
    public synchronized void m4323c() {
        this.f85d++;
    }

    /* renamed from: d */
    public synchronized int m4322d() {
        return this.f85d;
    }

    /* renamed from: e */
    public synchronized int m4321e() {
        int i = this.f85d;
        this.f85d = 0;
        return i;
    }

    /* renamed from: f */
    public synchronized void m4320f() {
        this.f86e++;
    }

    /* renamed from: g */
    public synchronized int m4319g() {
        return this.f86e;
    }

    /* renamed from: h */
    public synchronized int m4318h() {
        int i = this.f86e;
        this.f86e = 0;
        return i;
    }

    /* renamed from: i */
    public synchronized void m4317i() {
        this.f87f++;
    }

    /* renamed from: j */
    public synchronized int m4316j() {
        return this.f87f;
    }

    /* renamed from: k */
    public synchronized int m4315k() {
        int i = this.f87f;
        this.f87f = 0;
        return i;
    }

    /* renamed from: l */
    public synchronized void m4314l() {
        this.f86e = 0;
        this.f87f = 0;
        this.f85d = 0;
    }
}
