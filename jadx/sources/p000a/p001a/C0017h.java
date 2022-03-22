package p000a.p001a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import p000a.p001a.p002a.AbstractC0008h;
import p000a.p001a.p002a.C0001a;
import p000a.p001a.p002a.C0002b;
import p000a.p001a.p002a.C0003c;
import p000a.p001a.p002a.C0004d;
import p000a.p001a.p002a.C0005e;
import p000a.p001a.p002a.C0006f;
import p000a.p001a.p002a.C0007g;
import p000a.p001a.p002a.RunnableC0009i;

/* renamed from: a.a.h */
/* loaded from: game-lib.jar:a/a/h.class */
public class C0017h extends Socket {

    /* renamed from: c */
    protected DatagramSocket f47c;

    /* renamed from: d */
    protected SocketAddress f48d;

    /* renamed from: e */
    protected C0025o f49e;

    /* renamed from: f */
    protected C0027q f50f;

    /* renamed from: a */
    private byte[] f51a;

    /* renamed from: b */
    private boolean f52b;

    /* renamed from: i */
    private boolean f53i;

    /* renamed from: j */
    private boolean f54j;

    /* renamed from: k */
    private boolean f55k;

    /* renamed from: l */
    private int f56l;

    /* renamed from: m */
    private int f57m;

    /* renamed from: n */
    private boolean f58n;

    /* renamed from: o */
    private boolean f59o;

    /* renamed from: p */
    private int f60p;

    /* renamed from: q */
    private Object f61q;

    /* renamed from: r */
    private Object f62r;

    /* renamed from: s */
    private ArrayList f63s;

    /* renamed from: t */
    private ArrayList f64t;

    /* renamed from: g */
    protected C0028r f65g;

    /* renamed from: u */
    private ArrayList f66u;

    /* renamed from: v */
    private ArrayList f67v;

    /* renamed from: w */
    private ArrayList f68w;

    /* renamed from: x */
    private Object f69x;

    /* renamed from: y */
    private C0019i f70y;

    /* renamed from: z */
    private Thread f71z;

    /* renamed from: A */
    private int f72A;

    /* renamed from: B */
    private int f73B;

    /* renamed from: C */
    private int f74C;

    /* renamed from: D */
    private int f75D;

    /* renamed from: h */
    public boolean f76h;

    /* renamed from: E */
    private RunnableC0009i f77E;

    /* renamed from: F */
    private RunnableC0009i f78F;

    /* renamed from: G */
    private RunnableC0009i f79G;

    /* renamed from: H */
    private RunnableC0009i f80H;

    /* renamed from: I */
    private static final boolean f81I = Boolean.getBoolean("net.rudp.debug");

    public C0017h() {
        this(new C0028r());
    }

    public C0017h(C0028r rVar) {
        this(new DatagramSocket(), rVar);
    }

    protected C0017h(DatagramSocket datagramSocket) {
        this(datagramSocket, new C0028r());
    }

    protected C0017h(DatagramSocket datagramSocket, C0028r rVar) {
        this.f52b = false;
        this.f53i = false;
        this.f54j = false;
        this.f55k = true;
        this.f56l = 0;
        this.f57m = 0;
        this.f58n = false;
        this.f59o = false;
        this.f60p = -1;
        this.f61q = new Object();
        this.f62r = new Object();
        this.f63s = new ArrayList();
        this.f64t = new ArrayList();
        this.f65g = C0028r.f101a;
        this.f66u = new ArrayList();
        this.f67v = new ArrayList();
        this.f68w = new ArrayList();
        this.f69x = new Object();
        this.f70y = new C0019i(this);
        this.f72A = 32;
        this.f73B = 32;
        this.f76h = false;
        this.f77E = new RunnableC0009i("rudp-NullSegmentTimer", new RunnableC0022l(this, null));
        this.f78F = new RunnableC0009i("rudp-RetransmissionTimer", new RunnableC0024n(this, null));
        this.f79G = new RunnableC0009i("rudp-CumulativeAckTimer", new RunnableC0020j(this));
        this.f80H = new RunnableC0009i("rudp-KeepAliveTimer", new RunnableC0021k(this));
        if (datagramSocket == null) {
            throw new NullPointerException("sock");
        }
        mo4365a(datagramSocket, rVar);
    }

    /* renamed from: a */
    protected void mo4365a(DatagramSocket datagramSocket, C0028r rVar) {
        this.f47c = datagramSocket;
        this.f65g = rVar;
        this.f74C = (this.f65g.m4308a() - 6) * 32;
        this.f75D = (this.f65g.m4308a() - 6) * 32;
        if (this.f71z == null) {
            this.f71z = new C0023m(this);
            this.f71z.start();
        }
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        this.f47c.bind(socketAddress);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        connect(socketAddress, 0);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        if (socketAddress == null) {
            throw new IllegalArgumentException("connect: The address can't be null");
        } else if (i < 0) {
            throw new IllegalArgumentException("connect: timeout can't be negative");
        } else if (isClosed()) {
            throw new SocketException("Socket is closed");
        } else if (isConnected()) {
            throw new SocketException("already connected");
        } else if (!(socketAddress instanceof InetSocketAddress)) {
            throw new IllegalArgumentException("Unsupported address type");
        } else {
            this.f48d = (InetSocketAddress) socketAddress;
            m4352d();
            this.f56l = 2;
            m4348e(new C0007g(this.f70y.m4326a(new Random(System.currentTimeMillis()).nextInt(255)), this.f65g.m4305b(), this.f65g.m4308a(), this.f65g.m4299h(), this.f65g.m4298i(), this.f65g.m4300g(), this.f65g.m4304c(), this.f65g.m4303d(), this.f65g.m4302e(), this.f65g.m4301f()));
            boolean z = false;
            synchronized (this) {
                if (!isConnected()) {
                    try {
                        if (i == 0) {
                            wait();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            wait(i);
                            if (System.currentTimeMillis() - currentTimeMillis >= i) {
                                z = true;
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.f56l != 3) {
                synchronized (this.f66u) {
                    this.f66u.clear();
                    this.f66u.notifyAll();
                }
                this.f70y.m4314l();
                this.f78F.m4392e();
                switch (this.f56l) {
                    case 0:
                    case 4:
                        this.f56l = 0;
                        throw new SocketException("Socket closed");
                    case 1:
                    case 3:
                    default:
                        return;
                    case 2:
                        m4337i();
                        this.f56l = 0;
                        if (z) {
                            throw new SocketTimeoutException();
                        }
                        throw new SocketException("Connection refused");
                }
            }
        }
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return null;
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        if (!isConnected()) {
            return null;
        }
        return ((InetSocketAddress) this.f48d).getAddress();
    }

    @Override // java.net.Socket
    public int getPort() {
        if (!isConnected()) {
            return 0;
        }
        return ((InetSocketAddress) this.f48d).getPort();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        if (!isConnected()) {
            return null;
        }
        return new InetSocketAddress(getInetAddress(), getPort());
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.f47c.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.f47c.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.f47c.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public synchronized InputStream getInputStream() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        } else if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        } else if (isInputShutdown()) {
            throw new SocketException("Socket input is shutdown");
        } else {
            if (this.f49e == null) {
                this.f49e = new C0025o(this);
            }
            return this.f49e;
        }
    }

    @Override // java.net.Socket
    public synchronized OutputStream getOutputStream() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        } else if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        } else if (isOutputShutdown()) {
            throw new SocketException("Socket output is shutdown");
        } else {
            if (this.f50f == null) {
                this.f50f = new C0027q(this);
            }
            return this.f50f;
        }
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        synchronized (this.f61q) {
            if (!isClosed()) {
                m4349e();
                switch (this.f56l) {
                    case 0:
                        this.f47c.close();
                        break;
                    case 1:
                    case 3:
                    case 4:
                        m4371a(new C0004d(this.f70y.m4327a()));
                        m4356c();
                        break;
                    case 2:
                        synchronized (this) {
                            notify();
                        }
                        break;
                }
                if (this.f56l != 0) {
                    this.f60p = this.f56l;
                }
                this.f52b = true;
                this.f56l = 0;
                synchronized (this.f66u) {
                    this.f66u.notify();
                }
                synchronized (this.f68w) {
                    this.f68w.notify();
                }
            }
        }
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.f47c.isBound();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.f53i;
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        boolean z;
        synchronized (this.f61q) {
            z = this.f52b;
        }
        return z;
    }

    @Override // java.net.Socket
    public void setSoTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        this.f57m = i;
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("negative receive size");
        } else if (isClosed()) {
            throw new SocketException("Socket is closed");
        } else if (!isConnected()) {
            this.f74C = i;
        }
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        if (!isClosed()) {
            return this.f74C;
        }
        throw new SocketException("Socket is closed");
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("negative send size");
        } else if (isClosed()) {
            throw new SocketException("Socket is closed");
        } else if (!isConnected()) {
            this.f75D = i;
        }
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        if (!isClosed()) {
            return this.f75D;
        }
        throw new SocketException("Socket is closed");
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return false;
    }

    @Override // java.net.Socket
    public synchronized void setKeepAlive(boolean z) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        } else if (this.f55k ^ z) {
            this.f55k = z;
            if (!isConnected()) {
                return;
            }
            if (this.f55k) {
                this.f80H.m4396a(this.f65g.m4300g() * 6, this.f65g.m4300g() * 6);
            } else {
                this.f80H.m4392e();
            }
        }
    }

    @Override // java.net.Socket
    public synchronized boolean getKeepAlive() {
        if (!isClosed()) {
            return this.f55k;
        }
        throw new SocketException("Socket is closed");
    }

    @Override // java.net.Socket
    public void shutdownInput() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        } else if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        } else if (isInputShutdown()) {
            throw new SocketException("Socket input is already shutdown");
        } else {
            this.f58n = true;
            synchronized (this.f69x) {
                this.f69x.notify();
            }
        }
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        } else if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        } else if (isOutputShutdown()) {
            throw new SocketException("Socket output is already shutdown");
        } else {
            this.f59o = true;
            synchronized (this.f66u) {
                this.f66u.notifyAll();
            }
        }
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.f58n;
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.f59o;
    }

    /* renamed from: a */
    protected void m4364a(byte[] bArr, int i, int i2) {
        m4363a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public void m4363a(byte[] bArr, int i, int i2, boolean z) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        } else if (isOutputShutdown()) {
            throw new IOException("Socket output is shutdown");
        } else if (!isConnected()) {
            throw new SocketException("Connection reset");
        } else {
            int i3 = 0;
            while (i3 < i2) {
                synchronized (this.f62r) {
                    while (this.f54j) {
                        try {
                            this.f62r.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int min = Math.min(this.f65g.m4308a() - 6, i2 - i3);
                    C0002b bVar = new C0002b(this.f70y.m4327a(), this.f70y.m4325b(), bArr, i + i3, min);
                    m4348e(bVar);
                    if (z) {
                        m4371a(bVar);
                    }
                    i3 += min;
                }
            }
        }
    }

    /* renamed from: b */
    protected int m4357b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        synchronized (this.f69x) {
            while (true) {
                if (!this.f68w.isEmpty()) {
                    Iterator it = this.f68w.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AbstractC0008h hVar = (AbstractC0008h) it.next();
                        if (hVar instanceof C0006f) {
                            it.remove();
                            break;
                        } else if (hVar instanceof C0004d) {
                            if (i3 <= 0) {
                                it.remove();
                                return -1;
                            }
                        } else if (hVar instanceof C0002b) {
                            byte[] c = ((C0002b) hVar).m4420c();
                            if (c.length + i3 <= i2) {
                                System.arraycopy(c, 0, bArr, i + i3, c.length);
                                i3 += c.length;
                                it.remove();
                            } else if (i3 <= 0) {
                                throw new IOException("insufficient buffer space");
                            }
                        }
                    }
                    if (i3 > 0) {
                        return i3;
                    }
                } else if (isClosed()) {
                    throw new SocketException("Socket is closed");
                } else if (isInputShutdown()) {
                    throw new EOFException();
                } else if (!isConnected()) {
                    throw new SocketException("Connection reset");
                } else {
                    try {
                        if (this.f57m == 0) {
                            this.f69x.wait();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            this.f69x.wait(this.f57m);
                            if (System.currentTimeMillis() - currentTimeMillis >= this.f57m) {
                                throw new SocketTimeoutException();
                                break;
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m4367a(AbstractC0029s sVar) {
        if (sVar == null) {
            throw new NullPointerException("stateListener");
        }
        synchronized (this.f64t) {
            if (!this.f64t.contains(sVar)) {
                this.f64t.add(sVar);
            }
        }
    }

    /* renamed from: a */
    private void m4371a(AbstractC0008h hVar) {
        if ((hVar instanceof C0002b) || (hVar instanceof C0006f) || (hVar instanceof C0004d) || (hVar instanceof C0005e)) {
            m4339h(hVar);
        }
        if ((hVar instanceof C0002b) || (hVar instanceof C0006f) || (hVar instanceof C0004d)) {
            this.f77E.m4393d();
        }
        if (f81I) {
            mo4366a("sent " + hVar);
        }
        m4351d(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public AbstractC0008h m4343g() {
        AbstractC0008h a = mo4376a();
        if (a != null) {
            if (f81I) {
                mo4366a("recv " + a);
            }
            if ((a instanceof C0002b) || (a instanceof C0005e) || (a instanceof C0006f) || (a instanceof C0004d) || (a instanceof C0007g)) {
                this.f70y.m4323c();
            }
            if (this.f55k) {
                this.f80H.m4393d();
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m4348e(AbstractC0008h hVar) {
        synchronized (this.f66u) {
            while (true) {
                if (this.f66u.size() < this.f72A && this.f70y.m4316j() <= this.f65g.m4305b()) {
                    this.f70y.m4317i();
                    this.f66u.add(hVar);
                } else if (this.f52b) {
                    throw new SocketException("Socket is closed");
                } else {
                    try {
                        this.f66u.wait(10000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.f52b) {
            throw new SocketException("Socket is closed");
        }
        if (!(hVar instanceof C0003c) && !(hVar instanceof C0001a)) {
            synchronized (this.f78F) {
                if (this.f78F.m4394c()) {
                    this.f78F.m4396a(this.f65g.m4299h(), this.f65g.m4299h());
                }
            }
        }
        m4371a(hVar);
        if (hVar instanceof C0002b) {
            synchronized (this.f63s) {
                Iterator it = this.f63s.iterator();
                while (it.hasNext()) {
                    ((AbstractC0026p) it.next()).m4312a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m4345f(AbstractC0008h hVar) {
        if (this.f65g.m4304c() > 0) {
            hVar.m4404b(hVar.m4399o() + 1);
        }
        if (this.f65g.m4304c() == 0 || hVar.m4399o() <= this.f65g.m4304c()) {
            m4371a(hVar);
            if (hVar instanceof C0002b) {
                synchronized (this.f63s) {
                    Iterator it = this.f63s.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0026p) it.next()).m4311b();
                    }
                }
                return;
            }
            return;
        }
        m4333k();
    }

    /* renamed from: h */
    private void m4340h() {
        if (isConnected()) {
            this.f77E.m4392e();
            if (this.f55k) {
                this.f80H.m4392e();
            }
            synchronized (this.f62r) {
                this.f54j = false;
                this.f62r.notify();
            }
        } else {
            synchronized (this) {
                m4352d();
                this.f53i = true;
                this.f56l = 3;
                notify();
            }
            synchronized (this.f64t) {
                Iterator it = this.f64t.iterator();
                while (it.hasNext()) {
                    ((AbstractC0029s) it.next()).mo4297a(this);
                }
            }
        }
        this.f77E.m4396a(0L, this.f65g.m4300g());
        if (this.f55k) {
            this.f80H.m4396a(this.f65g.m4300g() * 6, this.f65g.m4300g() * 6);
        }
    }

    /* renamed from: i */
    private void m4337i() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((AbstractC0029s) it.next()).mo4296b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m4335j() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((AbstractC0029s) it.next()).mo4295c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m4333k() {
        synchronized (this.f61q) {
            if (!isClosed()) {
                switch (this.f56l) {
                    case 1:
                    case 3:
                    case 4:
                        this.f53i = false;
                        synchronized (this.f66u) {
                            this.f66u.notifyAll();
                        }
                        synchronized (this.f69x) {
                            this.f69x.notify();
                        }
                        m4356c();
                        break;
                    case 2:
                        synchronized (this) {
                            notify();
                        }
                        break;
                }
                this.f56l = 0;
                this.f52b = true;
                synchronized (this.f64t) {
                    Iterator it = this.f64t.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0029s) it.next()).mo4294d(this);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    private void m4332l() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((AbstractC0029s) it.next()).mo4293e(this);
            }
        }
    }

    /* renamed from: a */
    protected void m4372a(C0007g gVar) {
        switch (this.f56l) {
            case 0:
                this.f56l = 1;
                this.f65g = new C0028r(this.f72A, this.f73B, gVar.m4417e(), gVar.m4418c(), gVar.m4413i(), gVar.m4412j(), gVar.m4411k(), gVar.m4410l(), gVar.m4414h(), gVar.m4416f(), gVar.m4415g());
                this.f70y.m4324b(gVar.m4401m());
                C0007g gVar2 = new C0007g(this.f70y.m4326a(new Random(System.currentTimeMillis()).nextInt(255)), this.f65g.m4305b(), this.f65g.m4308a(), this.f65g.m4299h(), this.f65g.m4298i(), this.f65g.m4300g(), this.f65g.m4304c(), this.f65g.m4303d(), this.f65g.m4302e(), this.f65g.m4301f());
                gVar2.m4408a(gVar.m4401m());
                m4348e(gVar2);
                return;
            case 1:
                synchronized (this.f66u) {
                    Iterator it = this.f66u.iterator();
                    while (it.hasNext()) {
                        try {
                            m4345f((AbstractC0008h) it.next());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
            case 2:
                this.f70y.m4324b(gVar.m4401m());
                this.f56l = 3;
                m4331m();
                m4340h();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4373a(C0003c cVar) {
        int[] c = cVar.m4419c();
        int n = cVar.m4400n();
        int i = c[c.length - 1];
        synchronized (this.f66u) {
            Iterator it = this.f66u.iterator();
            while (it.hasNext()) {
                AbstractC0008h hVar = (AbstractC0008h) it.next();
                if (m4374a(hVar.m4401m(), n) <= 0) {
                    it.remove();
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= c.length) {
                            break;
                        } else if (m4374a(hVar.m4401m(), c[i2]) == 0) {
                            it.remove();
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            Iterator it2 = this.f66u.iterator();
            while (it2.hasNext()) {
                AbstractC0008h hVar2 = (AbstractC0008h) it2.next();
                if (m4374a(n, hVar2.m4401m()) < 0 && m4374a(i, hVar2.m4401m()) > 0) {
                    try {
                        m4345f(hVar2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            this.f66u.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m4342g(AbstractC0008h hVar) {
        if (hVar instanceof C0006f) {
            synchronized (this.f62r) {
                this.f54j = true;
            }
            m4332l();
        }
        if (hVar instanceof C0004d) {
            switch (this.f56l) {
                case 0:
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
                default:
                    this.f56l = 4;
                    break;
            }
        }
        boolean z = false;
        synchronized (this.f69x) {
            if (m4374a(hVar.m4401m(), this.f70y.m4325b()) > 0) {
                if (m4374a(hVar.m4401m(), m4361b(this.f70y.m4325b())) == 0) {
                    z = true;
                    if (this.f68w.size() == 0 || this.f68w.size() + this.f67v.size() < this.f73B) {
                        this.f70y.m4324b(hVar.m4401m());
                        if ((hVar instanceof C0002b) || (hVar instanceof C0006f) || (hVar instanceof C0004d)) {
                            this.f68w.add(hVar);
                        }
                        if (hVar instanceof C0002b) {
                            synchronized (this.f63s) {
                                Iterator it = this.f63s.iterator();
                                while (it.hasNext()) {
                                    ((AbstractC0026p) it.next()).m4310c();
                                }
                            }
                        }
                        m4328p();
                    }
                } else if (this.f68w.size() + this.f67v.size() < this.f73B) {
                    boolean z2 = false;
                    for (int i = 0; i < this.f67v.size() && !z2; i++) {
                        int a = m4374a(hVar.m4401m(), ((AbstractC0008h) this.f67v.get(i)).m4401m());
                        if (a == 0) {
                            z2 = true;
                        } else if (a < 0) {
                            this.f67v.add(i, hVar);
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        this.f67v.add(hVar);
                    }
                    this.f70y.m4320f();
                    if (hVar instanceof C0002b) {
                        synchronized (this.f63s) {
                            Iterator it2 = this.f63s.iterator();
                            while (it2.hasNext()) {
                                ((AbstractC0026p) it2.next()).m4309d();
                            }
                        }
                    }
                }
            }
            if (z && ((hVar instanceof C0006f) || (hVar instanceof C0005e) || (hVar instanceof C0004d))) {
                m4331m();
            } else if (this.f70y.m4319g() > 0 && (this.f65g.m4302e() == 0 || this.f70y.m4319g() > this.f65g.m4302e())) {
                m4330n();
            } else if (this.f70y.m4322d() <= 0 || (this.f65g.m4303d() != 0 && this.f70y.m4322d() <= this.f65g.m4303d())) {
                synchronized (this.f79G) {
                    if (this.f79G.m4394c()) {
                        this.f79G.m4397a(this.f65g.m4298i());
                    }
                }
            } else {
                m4329o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m4331m() {
        synchronized (this.f69x) {
            if (!this.f67v.isEmpty()) {
                m4330n();
            } else {
                m4329o();
            }
        }
    }

    /* renamed from: n */
    private void m4330n() {
        synchronized (this.f69x) {
            if (!this.f67v.isEmpty()) {
                this.f70y.m4321e();
                this.f70y.m4318h();
                int[] iArr = new int[this.f67v.size()];
                for (int i = 0; i < iArr.length; i++) {
                    iArr[i] = ((AbstractC0008h) this.f67v.get(i)).m4401m();
                }
                try {
                    int b = this.f70y.m4325b();
                    m4371a((AbstractC0008h) new C0003c(m4361b(b), b, iArr));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: o */
    private void m4329o() {
        if (this.f70y.m4321e() != 0) {
            try {
                int b = this.f70y.m4325b();
                m4371a(new C0001a(m4361b(b), b));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    private void m4339h(AbstractC0008h hVar) {
        if (this.f70y.m4321e() != 0) {
            hVar.m4408a(this.f70y.m4325b());
        }
    }

    /* renamed from: b */
    protected boolean m4360b(AbstractC0008h hVar) {
        int n = hVar.m4400n();
        if (n < 0) {
            return false;
        }
        Iterator it = this.f66u.iterator();
        while (it.hasNext()) {
            if (m4374a(((AbstractC0008h) it.next()).m4401m(), n) <= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    protected void m4355c(AbstractC0008h hVar) {
        int n = hVar.m4400n();
        if (n >= 0) {
            this.f70y.m4315k();
            synchronized (this.f66u) {
                Iterator it = this.f66u.iterator();
                while (it.hasNext()) {
                    if (m4374a(((AbstractC0008h) it.next()).m4401m(), n) <= 0) {
                        it.remove();
                    }
                }
                if (this.f56l == 1) {
                    boolean z = false;
                    if (!this.f66u.isEmpty()) {
                        Iterator it2 = this.f66u.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0008h) it2.next()) instanceof C0007g) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        mo4366a("Bad first ack: " + n);
                        return;
                    } else {
                        this.f56l = 3;
                        m4340h();
                    }
                }
                if (this.f66u.isEmpty()) {
                    this.f78F.m4392e();
                }
                this.f66u.notifyAll();
            }
        }
    }

    /* renamed from: p */
    private void m4328p() {
        synchronized (this.f69x) {
            Iterator it = this.f67v.iterator();
            while (it.hasNext()) {
                AbstractC0008h hVar = (AbstractC0008h) it.next();
                if (m4374a(hVar.m4401m(), m4361b(this.f70y.m4325b())) == 0) {
                    this.f70y.m4324b(hVar.m4401m());
                    if ((hVar instanceof C0002b) || (hVar instanceof C0006f) || (hVar instanceof C0004d)) {
                        this.f68w.add(hVar);
                    }
                    it.remove();
                }
            }
            this.f69x.notify();
        }
    }

    /* renamed from: d */
    protected void m4351d(AbstractC0008h hVar) {
        try {
            this.f47c.send(new DatagramPacket(hVar.mo4402d(), hVar.mo4405b(), this.f48d));
        } catch (IOException e) {
            if (!isClosed()) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    protected AbstractC0008h mo4376a() {
        try {
            if (this.f51a == null) {
                this.f51a = new byte[65535];
            }
            DatagramPacket datagramPacket = new DatagramPacket(this.f51a, this.f51a.length);
            this.f47c.receive(datagramPacket);
            return AbstractC0008h.m4403b(datagramPacket.getData(), 0, datagramPacket.getLength());
        } catch (IOException e) {
            if (isClosed()) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    protected void mo4362b() {
        this.f47c.close();
    }

    /* renamed from: c */
    protected void m4356c() {
        this.f77E.m4392e();
        this.f80H.m4392e();
        this.f56l = 4;
        Thread thread = new Thread() { // from class: a.a.h.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                C0017h.this.f80H.m4391f();
                C0017h.this.f77E.m4391f();
                try {
                    Thread.sleep(C0017h.this.f65g.m4300g() * 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C0017h.this.f78F.m4391f();
                C0017h.this.f79G.m4391f();
                C0017h.this.mo4362b();
                C0017h.this.m4335j();
            }
        };
        thread.setName("ReliableSocket-Closing");
        thread.setDaemon(true);
        thread.start();
    }

    /* renamed from: a */
    protected synchronized void mo4366a(String str) {
        System.out.println(getLocalPort() + ": " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m4361b(int i) {
        return (i + 1) % 255;
    }

    /* renamed from: a */
    private int m4374a(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        if (i < i2 && i2 - i > 127) {
            return 1;
        }
        if (i <= i2 || i - i2 >= 127) {
            return -1;
        }
        return 1;
    }

    /* renamed from: d */
    public synchronized void m4352d() {
        if (!this.f76h) {
            this.f76h = true;
            this.f77E.m4398a();
            this.f78F.m4398a();
            this.f79G.m4398a();
            this.f80H.m4398a();
        }
    }

    /* renamed from: e */
    public synchronized void m4349e() {
        if (this.f76h) {
            this.f76h = false;
            this.f78F.m4391f();
            this.f79G.m4391f();
            this.f80H.m4391f();
            this.f77E.m4391f();
        }
    }
}
