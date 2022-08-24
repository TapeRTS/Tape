package android.p003os;

import android.util.Log;

/* renamed from: android.os.Handler */
/* loaded from: game-lib.jar:android/os/Handler.class */
public class Handler {

    /* renamed from: a */
    final MessageQueue f268a;

    /* renamed from: b */
    final Looper f269b;

    /* renamed from: c */
    final Callback f270c;

    /* renamed from: d */
    final boolean f271d;

    /* renamed from: android.os.Handler$Callback */
    /* loaded from: game-lib.jar:android/os/Handler$Callback.class */
    public interface Callback {
        /* renamed from: a */
        boolean m6388a(Message message);
    }

    /* renamed from: a */
    public void m6397a(Message message) {
    }

    /* renamed from: b */
    public void m6393b(Message message) {
        if (message.f287k != null) {
            m6389d(message);
        } else if (this.f270c != null && this.f270c.m6388a(message)) {
        } else {
            m6397a(message);
        }
    }

    public Handler() {
        this(null, false);
    }

    public Handler(Looper looper) {
        this(looper, null, false);
    }

    public Handler(Callback callback, boolean z) {
        this.f269b = Looper.m6382d();
        if (this.f269b == null) {
            throw new RuntimeException("Can't create handler inside thread that has not called Looper.prepare()");
        }
        this.f268a = this.f269b.f274b;
        this.f270c = callback;
        this.f271d = z;
    }

    public Handler(Looper looper, Callback callback, boolean z) {
        this.f269b = looper;
        this.f268a = looper.f274b;
        this.f270c = callback;
        this.f271d = z;
    }

    /* renamed from: a */
    public final Message m6398a() {
        return Message.m6378a(this);
    }

    /* renamed from: a */
    public final boolean m6394a(Runnable runnable) {
        return m6396a(m6391b(runnable), 0L);
    }

    /* renamed from: c */
    public final boolean m6390c(Message message) {
        return m6396a(message, 0L);
    }

    /* renamed from: a */
    public final boolean m6396a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m6392b(message, SystemClock.m6358a() + j);
    }

    /* renamed from: b */
    public boolean m6392b(Message message, long j) {
        MessageQueue messageQueue = this.f268a;
        if (messageQueue == null) {
            RuntimeException runtimeException = new RuntimeException(this + " sendMessageAtTime() called with no mQueue");
            Log.m6351a("Looper", runtimeException.getMessage(), runtimeException);
            return false;
        }
        return m6395a(messageQueue, message, j);
    }

    /* renamed from: a */
    private boolean m6395a(MessageQueue messageQueue, Message message, long j) {
        message.f286j = this;
        if (this.f271d) {
            message.m6375a(true);
        }
        return messageQueue.m6363a(message, j);
    }

    public String toString() {
        return "Handler (" + getClass().getName() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }

    /* renamed from: b */
    private static Message m6391b(Runnable runnable) {
        Message m6380a = Message.m6380a();
        m6380a.f287k = runnable;
        return m6380a;
    }

    /* renamed from: d */
    private static void m6389d(Message message) {
        message.f287k.run();
    }
}
