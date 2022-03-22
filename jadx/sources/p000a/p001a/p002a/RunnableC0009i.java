package p000a.p001a.p002a;

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
    public void m4398a() {
        this.f18a = true;
        Thread thread = new Thread(this, this.f19b);
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00df, code lost:
        r5.f20c.run();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        while (!this.f26i) {
            synchronized (this) {
                while (!this.f24g && !this.f26i) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (this.f26i) {
                    return;
                }
            }
            synchronized (this.f27j) {
                this.f25h = false;
                this.f23f = false;
                if (this.f21d > 0) {
                    try {
                        this.f27j.wait(this.f21d);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
                if (!this.f23f) {
                    if (!this.f25h) {
                        this.f20c.run();
                    }
                    if (this.f22e > 0) {
                        while (true) {
                            synchronized (this.f27j) {
                                this.f25h = false;
                                try {
                                    this.f27j.wait(this.f22e);
                                } catch (InterruptedException e3) {
                                    e3.printStackTrace();
                                }
                                if (this.f23f) {
                                    break;
                                } else if (this.f25h) {
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m4397a(long j) {
        m4396a(j, 0L);
    }

    /* renamed from: a */
    public synchronized void m4396a(long j, long j2) {
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
    public synchronized boolean m4395b() {
        return this.f24g;
    }

    /* renamed from: c */
    public synchronized boolean m4394c() {
        return !m4395b();
    }

    /* renamed from: d */
    public synchronized void m4393d() {
        synchronized (this.f27j) {
            this.f25h = true;
            this.f27j.notify();
        }
    }

    /* renamed from: e */
    public synchronized void m4392e() {
        this.f24g = false;
        synchronized (this.f27j) {
            this.f23f = true;
            this.f27j.notify();
        }
    }

    /* renamed from: f */
    public synchronized void m4391f() {
        m4392e();
        this.f26i = true;
        notify();
    }
}
