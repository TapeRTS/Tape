package net.rudp;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.i */
/* loaded from: game-lib.jar:a/a/i.class */
public class C0019i {

    /* renamed from: a */
    private int f83a;

    /* renamed from: b */
    private int f84b;

    /* renamed from: c */
    private int f85c;

    /* renamed from: d */
    private int f86d;

    /* renamed from: e */
    private int f87e;

    /* renamed from: a */
    public synchronized int m6638a() {
        int m6688a = C0017h.m6688a(this.f83a);
        this.f83a = m6688a;
        return m6688a;
    }

    /* renamed from: a */
    public synchronized int m6637a(int i) {
        this.f83a = i;
        return this.f83a;
    }

    /* renamed from: b */
    public synchronized int m6635b(int i) {
        this.f84b = i;
        return this.f84b;
    }

    /* renamed from: b */
    public synchronized int m6636b() {
        return this.f84b;
    }

    /* renamed from: c */
    public synchronized void m6634c() {
        this.f85c++;
    }

    /* renamed from: d */
    public synchronized int m6633d() {
        return this.f85c;
    }

    /* renamed from: e */
    public synchronized int m6632e() {
        int i = this.f85c;
        this.f85c = 0;
        return i;
    }

    /* renamed from: f */
    public synchronized void m6631f() {
        this.f86d++;
    }

    /* renamed from: g */
    public synchronized int m6630g() {
        return this.f86d;
    }

    /* renamed from: h */
    public synchronized int m6629h() {
        int i = this.f86d;
        this.f86d = 0;
        return i;
    }

    /* renamed from: i */
    public synchronized void m6628i() {
        this.f87e++;
    }

    /* renamed from: j */
    public synchronized int m6627j() {
        return this.f87e;
    }

    /* renamed from: k */
    public synchronized int m6626k() {
        int i = this.f87e;
        this.f87e = 0;
        return i;
    }

    /* renamed from: l */
    public synchronized void m6625l() {
        this.f86d = 0;
        this.f87e = 0;
        this.f85c = 0;
    }
}
