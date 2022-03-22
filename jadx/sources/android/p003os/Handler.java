package android.p003os;

import android.util.Log;

/* renamed from: android.os.Handler */
/* loaded from: game-lib.jar:android/os/Handler.class */
public class Handler {

    /* renamed from: a */
    final MessageQueue f265a;

    /* renamed from: b */
    final Looper f266b;

    /* renamed from: c */
    final Callback f267c;

    /* renamed from: d */
    final boolean f268d;

    /* renamed from: android.os.Handler$Callback */
    /* loaded from: game-lib.jar:android/os/Handler$Callback.class */
    public interface Callback {
        /* renamed from: a */
        boolean m4076a(Message message);
    }

    /* renamed from: a */
    public void m4085a(Message message) {
    }

    /* renamed from: b */
    public void m4081b(Message message) {
        if (message.f284k != null) {
            m4077d(message);
        } else if (this.f267c == null || !this.f267c.m4076a(message)) {
            m4085a(message);
        }
    }

    public Handler() {
        this(null, false);
    }

    public Handler(Looper looper) {
        this(looper, null, false);
    }

    public Handler(Callback callback, boolean z) {
        this.f266b = Looper.m4070d();
        if (this.f266b == null) {
            throw new RuntimeException("Can't create handler inside thread that has not called Looper.prepare()");
        }
        this.f265a = this.f266b.f271b;
        this.f267c = callback;
        this.f268d = z;
    }

    public Handler(Looper looper, Callback callback, boolean z) {
        this.f266b = looper;
        this.f265a = looper.f271b;
        this.f267c = callback;
        this.f268d = z;
    }

    /* renamed from: a */
    public final Message m4086a() {
        return Message.m4066a(this);
    }

    /* renamed from: a */
    public final boolean m4082a(Runnable runnable) {
        return m4084a(m4079b(runnable), 0L);
    }

    /* renamed from: c */
    public final boolean m4078c(Message message) {
        return m4084a(message, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4084a(Message message, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ?? r9 = j;
        if (i < 0) {
            r9 = 0;
        }
        return m4080b(message, SystemClock.m4046a() + (r9 == true ? 1L : 0L));
    }

    /* renamed from: b */
    public boolean m4080b(Message message, long j) {
        MessageQueue messageQueue = this.f265a;
        if (messageQueue != null) {
            return m4083a(messageQueue, message, j);
        }
        RuntimeException runtimeException = new RuntimeException(this + " sendMessageAtTime() called with no mQueue");
        Log.m4039a("Looper", runtimeException.getMessage(), runtimeException);
        return false;
    }

    /* renamed from: a */
    private boolean m4083a(MessageQueue messageQueue, Message message, long j) {
        message.f283j = this;
        if (this.f268d) {
            message.m4063a(true);
        }
        return messageQueue.m4051a(message, j);
    }

    public String toString() {
        return "Handler (" + getClass().getName() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }

    /* renamed from: b */
    private static Message m4079b(Runnable runnable) {
        Message a = Message.m4068a();
        a.f284k = runnable;
        return a;
    }

    /* renamed from: d */
    private static void m4077d(Message message) {
        message.f284k.run();
    }
}
