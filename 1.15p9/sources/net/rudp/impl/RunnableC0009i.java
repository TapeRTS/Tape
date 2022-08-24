package net.rudp.impl;

/* renamed from: a.a.a.i */
/* loaded from: game-lib.jar:a/a/a/i.class */
public class RunnableC0009i implements Runnable {

    /* renamed from: a */
    boolean f18a;

    /* renamed from: b */
    String f19b;

    /* renamed from: c */
    private Runnable f20c;

    /* renamed from: f */
    private boolean f23f;

    /* renamed from: g */
    private boolean f24g;

    /* renamed from: h */
    private boolean f25h;

    /* renamed from: i */
    private boolean f26i;

    /* renamed from: j */
    private Object f27j = new Object();

    /* renamed from: d */
    private long f21d = 0;

    /* renamed from: e */
    private long f22e = 0;

    public RunnableC0009i(String str, Runnable runnable) {
        this.f19b = str;
        this.f20c = runnable;
    }

    /* renamed from: a */
    public void m5308a() {
        this.f18a = true;
        Thread thread = new Thread(this, this.f19b);
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
        r0 = r5.f27j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
        r5.f25h = false;
        r5.f23f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r5.f21d <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        r5.f27j.wait(r5.f21d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        r7.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c2 A[EDGE_INSN: B:107:0x00c2->B:59:0x00c2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7 A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #3 {, blocks: (B:53:0x00a3, B:54:0x00a8, B:57:0x00bb, B:60:0x00c3, B:62:0x00c7, B:65:0x00cf, B:68:0x00d4, B:56:0x00b7), top: B:86:0x00a3, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.rudp.impl.RunnableC0009i.run():void");
    }

    /* renamed from: a */
    public synchronized void m5307a(long j) {
        m5306a(j, 0L);
    }

    /* renamed from: a */
    public synchronized void m5306a(long j, long j2) {
        this.f21d = j;
        this.f22e = j2;
        if (this.f24g) {
            throw new IllegalStateException("already scheduled");
        }
        this.f24g = true;
        notify();
        synchronized (this.f27j) {
            this.f27j.notify();
        }
    }

    /* renamed from: b */
    public synchronized boolean m5305b() {
        return this.f24g;
    }

    /* renamed from: c */
    public synchronized boolean m5304c() {
        return !m5305b();
    }

    /* renamed from: d */
    public synchronized void m5303d() {
        synchronized (this.f27j) {
            this.f25h = true;
            this.f27j.notify();
        }
    }

    /* renamed from: e */
    public synchronized void m5302e() {
        this.f24g = false;
        synchronized (this.f27j) {
            this.f23f = true;
            this.f27j.notify();
        }
    }

    /* renamed from: f */
    public synchronized void m5301f() {
        m5302e();
        this.f26i = true;
        notify();
    }
}
