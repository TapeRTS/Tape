package android.p003os;

import android.os.Parcelable;

/* renamed from: android.os.Message */
/* loaded from: game-lib.jar:android/os/Message.class */
public final class Message implements Parcelable {

    /* renamed from: a */
    public int f277a;

    /* renamed from: b */
    public int f278b;

    /* renamed from: c */
    public int f279c;

    /* renamed from: d */
    public Object f280d;

    /* renamed from: e */
    public Messenger f281e;

    /* renamed from: f */
    public int f282f = -1;

    /* renamed from: g */
    int f283g;

    /* renamed from: h */
    long f284h;

    /* renamed from: i */
    Bundle f285i;

    /* renamed from: j */
    Handler f286j;

    /* renamed from: k */
    Runnable f287k;

    /* renamed from: l */
    Message f288l;

    /* renamed from: o */
    private static Message f290o;

    /* renamed from: n */
    private static final Object f289n = new Object();

    /* renamed from: p */
    private static int f291p = 0;

    /* renamed from: q */
    private static boolean f292q = true;

    /* renamed from: m */
    public static final Parcelable.Creator f293m = new Parcelable.Creator() { // from class: android.os.Message.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Message createFromParcel(Parcel parcel) {
            Message m6380a = Message.m6380a();
            m6380a.m6376a(parcel);
            return m6380a;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Message[] newArray(int i) {
            return new Message[i];
        }
    };

    /* renamed from: a */
    public static Message m6380a() {
        synchronized (f289n) {
            if (f290o != null) {
                Message message = f290o;
                f290o = message.f288l;
                message.f288l = null;
                message.f283g = 0;
                f291p--;
                return message;
            }
            return new Message();
        }
    }

    /* renamed from: a */
    public static Message m6378a(Handler handler) {
        Message m6380a = m6380a();
        m6380a.f286j = handler;
        return m6380a;
    }

    /* renamed from: b */
    public void m6374b() {
        if (m6370f()) {
            if (f292q) {
                throw new IllegalStateException("This message cannot be recycled because it is still in use.");
            }
            return;
        }
        m6373c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m6373c() {
        this.f283g = 1;
        this.f277a = 0;
        this.f278b = 0;
        this.f279c = 0;
        this.f280d = null;
        this.f281e = null;
        this.f282f = -1;
        this.f284h = 0L;
        this.f286j = null;
        this.f287k = null;
        this.f285i = null;
        synchronized (f289n) {
            if (f291p < 50) {
                this.f288l = f290o;
                f290o = this;
                f291p++;
            }
        }
    }

    /* renamed from: d */
    public Bundle m6372d() {
        if (this.f285i == null) {
            this.f285i = new Bundle();
        }
        return this.f285i;
    }

    /* renamed from: e */
    public boolean m6371e() {
        return (this.f283g & 2) != 0;
    }

    /* renamed from: a */
    public void m6375a(boolean z) {
        if (z) {
            this.f283g |= 2;
        } else {
            this.f283g &= -3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m6370f() {
        return (this.f283g & 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m6369g() {
        this.f283g |= 1;
    }

    public String toString() {
        return m6379a(SystemClock.m6358a());
    }

    /* renamed from: a */
    String m6379a(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ when=");
        sb.append("corrodinggames-unsupported");
        if (this.f286j != null) {
            if (this.f287k != null) {
                sb.append(" callback=");
                sb.append(this.f287k.getClass().getName());
            } else {
                sb.append(" what=");
                sb.append(this.f277a);
            }
            if (this.f278b != 0) {
                sb.append(" arg1=");
                sb.append(this.f278b);
            }
            if (this.f279c != 0) {
                sb.append(" arg2=");
                sb.append(this.f279c);
            }
            if (this.f280d != null) {
                sb.append(" obj=");
                sb.append(this.f280d);
            }
            sb.append(" target=");
            sb.append(this.f286j.getClass().getName());
        } else {
            sb.append(" barrier=");
            sb.append(this.f278b);
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
        if (this.f287k != null) {
            throw new RuntimeException("Can't marshal callbacks across processes.");
        }
        parcel.writeInt(this.f277a);
        parcel.writeInt(this.f278b);
        parcel.writeInt(this.f279c);
        if (this.f280d != null) {
            try {
                parcel.writeInt(1);
                parcel.writeParcelable((Parcelable) this.f280d, i);
            } catch (ClassCastException e) {
                throw new RuntimeException("Can't marshal non-Parcelable objects across processes.");
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.f284h);
        parcel.writeBundle(this.f285i);
        Messenger.writeMessengerOrNullToParcel(this.f281e, parcel);
        parcel.writeInt(this.f282f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6376a(Parcel parcel) {
        this.f277a = parcel.readInt();
        this.f278b = parcel.readInt();
        this.f279c = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.f280d = parcel.readParcelable(getClass().getClassLoader());
        }
        this.f284h = parcel.readLong();
        this.f285i = parcel.readBundle();
        this.f281e = Messenger.readMessengerOrNullFromParcel(parcel);
        this.f282f = parcel.readInt();
    }
}
