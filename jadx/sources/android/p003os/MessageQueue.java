package android.p003os;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.os.MessageQueue */
/* loaded from: game-lib.jar:android/os/MessageQueue.class */
public final class MessageQueue {

    /* renamed from: c */
    private final boolean f291c;

    /* renamed from: a */
    Message f292a;

    /* renamed from: f */
    private IdleHandler[] f293f;

    /* renamed from: g */
    private boolean f294g;

    /* renamed from: h */
    private boolean f295h;

    /* renamed from: b */
    static Object f296b = new Object();

    /* renamed from: e */
    private final ArrayList f297e = new ArrayList();

    /* renamed from: d */
    private long f298d = m4309b();

    /* renamed from: android.os.MessageQueue$IdleHandler */
    /* loaded from: game-lib.jar:android/os/MessageQueue$IdleHandler.class */
    public interface IdleHandler {
        /* renamed from: a */
        boolean m4306a();
    }

    /* renamed from: b */
    private long m4309b() {
        return 100L;
    }

    /* renamed from: a */
    private void m4312a(long j) {
    }

    /* renamed from: a */
    private void m4311a(long j, int i) {
        synchronized (f296b) {
            try {
                f296b.wait(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m4308b(long j) {
        synchronized (f296b) {
            f296b.notifyAll();
        }
    }

    MessageQueue(boolean z) {
        this.f291c = z;
    }

    protected void finalize() {
        try {
            m4307c();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: c */
    private void m4307c() {
        if (this.f298d != 0) {
            m4312a(this.f298d);
            this.f298d = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0147, code lost:
        if (r10 >= r8) goto L_0x019e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
        r0 = r5.f295f[r10];
        r5.f295f[r10] = null;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015e, code lost:
        r12 = r0.m4047a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016a, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
        android.util.Log.m4034c("MessageQueue", "IdleHandler threw exception", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019e, code lost:
        r8 = 0;
        r9 = 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Message m4313a() {
        IdleHandler idleHandler;
        boolean z;
        long j = this.f298d;
        if (j == 0) {
            return null;
        }
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 != 0) {
                Binder.flushPendingCommands();
            }
            System.out.println("corroding: nativePollOnce:" + j + "," + i2);
            m4311a(j, i2);
            synchronized (this) {
                long a = SystemClock.m4305a();
                Message message = null;
                Message message2 = this.f292a;
                if (message2 != null && message2.f283j == null) {
                    do {
                        message = message2;
                        message2 = message2.f285l;
                        if (message2 == null) {
                            break;
                        }
                    } while (!message2.m4318e());
                }
                if (message2 == null) {
                    i2 = -1;
                } else if (a < message2.f281h) {
                    i2 = (int) Math.min(message2.f281h - a, 2147483647L);
                } else {
                    this.f295h = false;
                    if (message != null) {
                        message.f285l = message2.f285l;
                    } else {
                        this.f292a = message2.f285l;
                    }
                    message2.f285l = null;
                    return message2;
                }
                if (this.f294g) {
                    m4307c();
                    return null;
                }
                if (i < 0 && (this.f292a == null || a < this.f292a.f281h)) {
                    i = this.f297e.size();
                }
                if (i <= 0) {
                    this.f295h = true;
                } else {
                    if (this.f293f == null) {
                        this.f293f = new IdleHandler[Math.max(i, 4)];
                    }
                    this.f293f = (IdleHandler[]) this.f297e.toArray(this.f293f);
                }
            }
        }
        if (!z) {
            synchronized (this) {
                this.f297e.remove(idleHandler);
            }
        }
        int i3 = i3 + 1;
    }

    /* renamed from: a */
    boolean m4310a(Message message, long j) {
        if (message.f283j == null) {
            throw new IllegalArgumentException("Message must have a target.");
        } else if (message.m4317f()) {
            throw new IllegalStateException(message + " This message is already in use.");
        } else {
            synchronized (this) {
                if (this.f294g) {
                    IllegalStateException illegalStateException = new IllegalStateException(message.f283j + " sending message to a Handler on a dead thread");
                    Log.m4298a("MessageQueue", illegalStateException.getMessage(), illegalStateException);
                    message.m4321b();
                    return false;
                }
                message.m4316g();
                message.f281h = j;
                Message message2 = this.f292a;
                if (message2 == null || j == 0 || j < message2.f281h) {
                    message.f285l = message2;
                    this.f292a = message;
                    boolean z = this.f295h;
                } else {
                    boolean z2 = this.f295h && message2.f283j == null && message.m4318e();
                    while (true) {
                        message2 = message2.f285l;
                        if (message2 == null || j < message2.f281h) {
                            break;
                        } else if (z2 && message2.m4318e()) {
                            z2 = false;
                        }
                    }
                    message.f285l = message2;
                    message2.f285l = message;
                }
                m4308b(this.f298d);
                return true;
            }
        }
    }
}
