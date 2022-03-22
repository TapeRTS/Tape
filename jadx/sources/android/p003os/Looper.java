package android.p003os;

import android.util.Printer;

/* renamed from: android.os.Looper */
/* loaded from: game-lib.jar:android/os/Looper.class */
public final class Looper {

    /* renamed from: a */
    static final ThreadLocal f269a = new ThreadLocal();

    /* renamed from: d */
    private static Looper f270d;

    /* renamed from: b */
    final MessageQueue f271b;

    /* renamed from: c */
    final Thread f272c = Thread.currentThread();

    /* renamed from: e */
    private Printer f273e;

    /* renamed from: a */
    private static void m4073a(boolean z) {
        if (f269a.get() != null) {
            throw new RuntimeException("Only one Looper may be created per thread");
        }
        f269a.set(new Looper(z));
    }

    /* renamed from: a */
    public static void m4074a() {
        m4073a(false);
        synchronized (Looper.class) {
            if (f270d != null) {
                throw new IllegalStateException("The main Looper has already been prepared.");
            }
            f270d = m4070d();
        }
    }

    /* renamed from: b */
    public static Looper m4072b() {
        Looper looper;
        synchronized (Looper.class) {
            looper = f270d;
        }
        return looper;
    }

    /* renamed from: c */
    public static void m4071c() {
        Looper d = m4070d();
        if (d == null) {
            throw new RuntimeException("No Looper; Looper.prepare() wasn't called on this thread.");
        }
        MessageQueue messageQueue = d.f271b;
        while (true) {
            Message a = messageQueue.m4054a();
            if (a != null) {
                Printer printer = d.f273e;
                if (printer != null) {
                    printer.println(">>>>> Dispatching to " + a.f283j + " " + a.f284k + ": " + a.f274a);
                }
                a.f283j.m4081b(a);
                if (printer != null) {
                    printer.println("<<<<< Finished to " + a.f283j + " " + a.f284k);
                }
                a.m4061c();
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public static Looper m4070d() {
        return (Looper) f269a.get();
    }

    private Looper(boolean z) {
        this.f271b = new MessageQueue(z);
    }

    /* renamed from: e */
    public Thread m4069e() {
        return this.f272c;
    }

    public String toString() {
        return "Looper (" + this.f272c.getName() + ", tid " + this.f272c.getId() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }
}
