package android.p003os;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.os.MessageQueue */
/* loaded from: game-lib.jar:android/os/MessageQueue.class */
public final class MessageQueue {

    /* renamed from: c */
    private final boolean f294c;

    /* renamed from: a */
    Message f296a;

    /* renamed from: f */
    private IdleHandler[] f298f;

    /* renamed from: g */
    private boolean f299g;

    /* renamed from: h */
    private boolean f300h;

    /* renamed from: b */
    static Object f301b = new Object();

    /* renamed from: e */
    private final ArrayList f297e = new ArrayList();

    /* renamed from: d */
    private long f295d = m6362b();

    /* renamed from: android.os.MessageQueue$IdleHandler */
    /* loaded from: game-lib.jar:android/os/MessageQueue$IdleHandler.class */
    public interface IdleHandler {
        /* renamed from: a */
        boolean m6359a();
    }

    /* renamed from: b */
    private long m6362b() {
        return 100L;
    }

    /* renamed from: a */
    private void m6365a(long j) {
    }

    /* renamed from: a */
    private void m6364a(long j, int i) {
        synchronized (f301b) {
            try {
                f301b.wait(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m6361b(long j) {
        synchronized (f301b) {
            f301b.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageQueue(boolean z) {
        this.f294c = z;
    }

    protected void finalize() {
        try {
            m6360c();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: c */
    private void m6360c() {
        if (this.f295d != 0) {
            m6365a(this.f295d);
            this.f295d = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r10 >= r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
        r0 = r5.f298f[r10];
        r5.f298f[r10] = null;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
        r12 = r0.m6359a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016a, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016c, code lost:
        android.util.Log.m6346c("MessageQueue", "IdleHandler threw exception", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
        r8 = 0;
        r9 = 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.p003os.Message m6366a() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p003os.MessageQueue.m6366a():android.os.Message");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m6363a(Message message, long j) {
        Message message2;
        if (message.f286j == null) {
            throw new IllegalArgumentException("Message must have a target.");
        }
        if (message.m6370f()) {
            throw new IllegalStateException(message + " This message is already in use.");
        }
        synchronized (this) {
            if (this.f299g) {
                IllegalStateException illegalStateException = new IllegalStateException(message.f286j + " sending message to a Handler on a dead thread");
                Log.m6351a("MessageQueue", illegalStateException.getMessage(), illegalStateException);
                message.m6374b();
                return false;
            }
            message.m6369g();
            message.f284h = j;
            Message message3 = this.f296a;
            if (message3 == null || j == 0 || j < message3.f284h) {
                message.f288l = message3;
                this.f296a = message;
                boolean z = this.f300h;
            } else {
                boolean z2 = this.f300h && message3.f286j == null && message.m6371e();
                while (true) {
                    message2 = message3;
                    message3 = message3.f288l;
                    if (message3 == null || j < message3.f284h) {
                        break;
                    } else if (z2 && message3.m6371e()) {
                        z2 = false;
                    }
                }
                message.f288l = message3;
                message2.f288l = message;
            }
            m6361b(this.f295d);
            return true;
        }
    }
}
