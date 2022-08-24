package android.p003os;

import android.util.Printer;

/* renamed from: android.os.Looper */
/* loaded from: game-lib.jar:android/os/Looper.class */
public final class Looper {

    /* renamed from: a */
    static final ThreadLocal f272a = new ThreadLocal();

    /* renamed from: d */
    private static Looper f273d;

    /* renamed from: b */
    final MessageQueue f274b;

    /* renamed from: c */
    final Thread f275c = Thread.currentThread();

    /* renamed from: e */
    private Printer f276e;

    /* renamed from: a */
    private static void m6385a(boolean z) {
        if (f272a.get() != null) {
            throw new RuntimeException("Only one Looper may be created per thread");
        }
        f272a.set(new Looper(z));
    }

    /* renamed from: a */
    public static void m6386a() {
        m6385a(false);
        synchronized (Looper.class) {
            if (f273d != null) {
                throw new IllegalStateException("The main Looper has already been prepared.");
            }
            f273d = m6382d();
        }
    }

    /* renamed from: b */
    public static Looper m6384b() {
        Looper looper;
        synchronized (Looper.class) {
            looper = f273d;
        }
        return looper;
    }

    /* renamed from: c */
    public static void m6383c() {
        Looper m6382d = m6382d();
        if (m6382d == null) {
            throw new RuntimeException("No Looper; Looper.prepare() wasn't called on this thread.");
        }
        MessageQueue messageQueue = m6382d.f274b;
        while (true) {
            Message m6366a = messageQueue.m6366a();
            if (m6366a == null) {
                return;
            }
            Printer printer = m6382d.f276e;
            if (printer != null) {
                printer.println(">>>>> Dispatching to " + m6366a.f286j + " " + m6366a.f287k + ": " + m6366a.f277a);
            }
            m6366a.f286j.m6393b(m6366a);
            if (printer != null) {
                printer.println("<<<<< Finished to " + m6366a.f286j + " " + m6366a.f287k);
            }
            m6366a.m6373c();
        }
    }

    /* renamed from: d */
    public static Looper m6382d() {
        return (Looper) f272a.get();
    }

    private Looper(boolean z) {
        this.f274b = new MessageQueue(z);
    }

    /* renamed from: e */
    public Thread m6381e() {
        return this.f275c;
    }

    public String toString() {
        return "Looper (" + this.f275c.getName() + ", tid " + this.f275c.getId() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }
}
