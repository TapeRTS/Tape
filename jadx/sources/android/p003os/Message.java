package android.p003os;

import android.os.Parcelable;

/* renamed from: android.os.Message */
/* loaded from: game-lib.jar:android/os/Message.class */
public final class Message implements Parcelable {

    /* renamed from: a */
    public int f274a;

    /* renamed from: b */
    public int f275b;

    /* renamed from: c */
    public int f276c;

    /* renamed from: d */
    public Object f277d;

    /* renamed from: e */
    public Messenger f278e;

    /* renamed from: f */
    public int f279f = -1;

    /* renamed from: g */
    int f280g;

    /* renamed from: h */
    long f281h;

    /* renamed from: i */
    Bundle f282i;

    /* renamed from: j */
    Handler f283j;

    /* renamed from: k */
    Runnable f284k;

    /* renamed from: l */
    Message f285l;

    /* renamed from: o */
    private static Message f287o;

    /* renamed from: n */
    private static final Object f286n = new Object();

    /* renamed from: p */
    private static int f288p = 0;

    /* renamed from: q */
    private static boolean f289q = true;

    /* renamed from: m */
    public static final Parcelable.Creator f290m = new Parcelable.Creator() { // from class: android.os.Message.1
        /* renamed from: a */
        public Message createFromParcel(Parcel parcel) {
            Message a = Message.m4068a();
            a.m4064a(parcel);
            return a;
        }

        /* renamed from: a */
        public Message[] newArray(int i) {
            return new Message[i];
        }
    };

    /* renamed from: a */
    public static Message m4068a() {
        synchronized (f286n) {
            if (f287o == null) {
                return new Message();
            }
            Message message = f287o;
            f287o = message.f285l;
            message.f285l = null;
            message.f280g = 0;
            f288p--;
            return message;
        }
    }

    /* renamed from: a */
    public static Message m4066a(Handler handler) {
        Message a = m4068a();
        a.f283j = handler;
        return a;
    }

    /* renamed from: b */
    public void m4062b() {
        if (!m4058f()) {
            m4061c();
        } else if (f289q) {
            throw new IllegalStateException("This message cannot be recycled because it is still in use.");
        }
    }

    /* renamed from: c */
    void m4061c() {
        this.f280g = 1;
        this.f274a = 0;
        this.f275b = 0;
        this.f276c = 0;
        this.f277d = null;
        this.f278e = null;
        this.f279f = -1;
        this.f281h = 0L;
        this.f283j = null;
        this.f284k = null;
        this.f282i = null;
        synchronized (f286n) {
            if (f288p < 50) {
                this.f285l = f287o;
                f287o = this;
                f288p++;
            }
        }
    }

    /* renamed from: d */
    public Bundle m4060d() {
        if (this.f282i == null) {
            this.f282i = new Bundle();
        }
        return this.f282i;
    }

    /* renamed from: e */
    public boolean m4059e() {
        return (this.f280g & 2) != 0;
    }

    /* renamed from: a */
    public void m4063a(boolean z) {
        if (z) {
            this.f280g |= 2;
        } else {
            this.f280g &= -3;
        }
    }

    /* renamed from: f */
    boolean m4058f() {
        return (this.f280g & 1) == 1;
    }

    /* renamed from: g */
    void m4057g() {
        this.f280g |= 1;
    }

    public String toString() {
        return m4067a(SystemClock.m4046a());
    }

    /* renamed from: a */
    String m4067a(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ when=");
        sb.append("corrodinggames-unsupported");
        if (this.f283j != null) {
            if (this.f284k != null) {
                sb.append(" callback=");
                sb.append(this.f284k.getClass().getName());
            } else {
                sb.append(" what=");
                sb.append(this.f274a);
            }
            if (this.f275b != 0) {
                sb.append(" arg1=");
                sb.append(this.f275b);
            }
            if (this.f276c != 0) {
                sb.append(" arg2=");
                sb.append(this.f276c);
            }
            if (this.f277d != null) {
                sb.append(" obj=");
                sb.append(this.f277d);
            }
            sb.append(" target=");
            sb.append(this.f283j.getClass().getName());
        } else {
            sb.append(" barrier=");
            sb.append(this.f275b);
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f284k != null) {
            throw new RuntimeException("Can't marshal callbacks across processes.");
        }
        parcel.writeInt(this.f274a);
        parcel.writeInt(this.f275b);
        parcel.writeInt(this.f276c);
        if (this.f277d != null) {
            try {
                parcel.writeInt(1);
                parcel.writeParcelable((Parcelable) this.f277d, i);
            } catch (ClassCastException e) {
                throw new RuntimeException("Can't marshal non-Parcelable objects across processes.");
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.f281h);
        parcel.writeBundle(this.f282i);
        Messenger.writeMessengerOrNullToParcel(this.f278e, parcel);
        parcel.writeInt(this.f279f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4064a(Parcel parcel) {
        this.f274a = parcel.readInt();
        this.f275b = parcel.readInt();
        this.f276c = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.f277d = parcel.readParcelable(getClass().getClassLoader());
        }
        this.f281h = parcel.readLong();
        this.f282i = parcel.readBundle();
        this.f278e = Messenger.readMessengerOrNullFromParcel(parcel);
        this.f279f = parcel.readInt();
    }
}
