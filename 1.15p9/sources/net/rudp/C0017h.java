package net.rudp;

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
import net.rudp.impl.C0001a;
import net.rudp.impl.C0002b;
import net.rudp.impl.C0003c;
import net.rudp.impl.C0004d;
import net.rudp.impl.C0005e;
import net.rudp.impl.C0006f;
import net.rudp.impl.C0007g;
import net.rudp.impl.RunnableC0009i;
import net.rudp.impl.Segment;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* synthetic */ ArrayList m5241g(C0017h c0017h) {
        return c0017h.f66u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ C0019i m5238h(C0017h c0017h) {
        return c0017h.f70y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m5258b(C0017h c0017h, Segment segment) {
        c0017h.m5248e(segment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ boolean m5240h() {
        return f81I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m5253c(C0017h c0017h, Segment segment) {
        c0017h.m5245f(segment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m5236i(C0017h c0017h) {
        c0017h.m5229o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ void m5234j(C0017h c0017h) {
        c0017h.m5231m();
    }

    public C0017h() {
        this(new C0028r());
    }

    public C0017h(C0028r c0028r) {
        this(new DatagramSocket(), c0028r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C0017h(DatagramSocket datagramSocket) {
        this(datagramSocket, new C0028r());
    }

    protected C0017h(DatagramSocket datagramSocket, C0028r c0028r) {
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
        this.f65g = C0028r.f100a;
        this.f66u = new ArrayList();
        this.f67v = new ArrayList();
        this.f68w = new ArrayList();
        this.f69x = new Object();
        this.f70y = new C0019i();
        this.f72A = 32;
        this.f73B = 32;
        this.f76h = false;
        this.f77E = new RunnableC0009i("rudp-NullSegmentTimer", new RunnableC0022l(this, null));
        this.f78F = new RunnableC0009i("rudp-RetransmissionTimer", new RunnableC0024n(this, null));
        this.f79G = new RunnableC0009i("rudp-CumulativeAckTimer", new RunnableC0020j(this, null));
        this.f80H = new RunnableC0009i("rudp-KeepAliveTimer", new RunnableC0021k(this, null));
        if (datagramSocket == null) {
            throw new NullPointerException("sock");
        }
        m5265a(datagramSocket, c0028r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5265a(DatagramSocket datagramSocket, C0028r c0028r) {
        this.f47c = datagramSocket;
        this.f65g = c0028r;
        this.f74C = (this.f65g.m5206a() - 6) * 32;
        this.f75D = (this.f65g.m5206a() - 6) * 32;
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
        }
        if (i < 0) {
            throw new IllegalArgumentException("connect: timeout can't be negative");
        }
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isConnected()) {
            throw new SocketException("already connected");
        }
        if (!(socketAddress instanceof InetSocketAddress)) {
            throw new IllegalArgumentException("Unsupported address type");
        }
        this.f48d = (InetSocketAddress) socketAddress;
        m5246f();
        this.f56l = 2;
        m5248e(new C0007g(this.f70y.m5224a(new Random(System.currentTimeMillis()).nextInt(255)), this.f65g.m5203b(), this.f65g.m5206a(), this.f65g.m5197h(), this.f65g.m5196i(), this.f65g.m5198g(), this.f65g.m5202c(), this.f65g.m5201d(), this.f65g.m5200e(), this.f65g.m5199f()));
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
        if (this.f56l == 3) {
            return;
        }
        synchronized (this.f66u) {
            this.f66u.clear();
            this.f66u.notifyAll();
        }
        this.f70y.m5212l();
        this.f78F.m5302e();
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
                m5233k();
                this.f56l = 0;
                if (z) {
                    throw new SocketTimeoutException();
                }
                throw new SocketException("Connection refused");
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

    /* renamed from: c */
    public SocketAddress m5256c() {
        return this.f48d;
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
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isInputShutdown()) {
            throw new SocketException("Socket input is shutdown");
        }
        if (this.f49e == null) {
            this.f49e = new C0025o(this);
        }
        return this.f49e;
    }

    @Override // java.net.Socket
    public synchronized OutputStream getOutputStream() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isOutputShutdown()) {
            throw new SocketException("Socket output is shutdown");
        }
        if (this.f50f == null) {
            this.f50f = new C0027q(this);
        }
        return this.f50f;
    }

    /* renamed from: d */
    public void m5252d() {
        this.f52b = true;
        this.f56l = 0;
        this.f47c.close();
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        synchronized (this.f61q) {
            if (isClosed()) {
                return;
            }
            m5243g();
            switch (this.f56l) {
                case 0:
                    this.f47c.close();
                    break;
                case 1:
                case 3:
                case 4:
                    m5271a(new C0004d(this.f70y.m5225a()));
                    m5249e();
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
            m5232l();
            synchronized (this.f66u) {
                this.f66u.notify();
            }
            synchronized (this.f68w) {
                this.f68w.notify();
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
        }
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isConnected()) {
            return;
        }
        this.f74C = i;
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.f74C;
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("negative send size");
        }
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isConnected()) {
            return;
        }
        this.f75D = i;
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.f75D;
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
        }
        if (!(this.f55k ^ z)) {
            return;
        }
        this.f55k = z;
        if (isConnected()) {
            if (this.f55k) {
                this.f80H.m5306a(this.f65g.m5198g() * 6, this.f65g.m5198g() * 6);
            } else {
                this.f80H.m5302e();
            }
        }
    }

    @Override // java.net.Socket
    public synchronized boolean getKeepAlive() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.f55k;
    }

    @Override // java.net.Socket
    public void shutdownInput() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isInputShutdown()) {
            throw new SocketException("Socket input is already shutdown");
        }
        this.f58n = true;
        synchronized (this.f69x) {
            this.f69x.notify();
        }
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isOutputShutdown()) {
            throw new SocketException("Socket output is already shutdown");
        }
        this.f59o = true;
        synchronized (this.f66u) {
            this.f66u.notifyAll();
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5264a(byte[] bArr, int i, int i2) {
        m5263a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public void m5263a(byte[] bArr, int i, int i2, boolean z) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isOutputShutdown()) {
            throw new IOException("Socket output is shutdown");
        }
        if (!isConnected()) {
            throw new SocketException("Connection reset");
        }
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
                int min = Math.min(this.f65g.m5206a() - 6, i2 - i3);
                C0002b c0002b = new C0002b(this.f70y.m5225a(), this.f70y.m5223b(), bArr, i + i3, min);
                m5248e(c0002b);
                if (z) {
                    m5271a(c0002b);
                }
                i3 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m5257b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        synchronized (this.f69x) {
            while (true) {
                if (this.f68w.isEmpty()) {
                    if (isClosed()) {
                        throw new SocketException("Socket is closed");
                    }
                    if (isInputShutdown()) {
                        throw new EOFException();
                    }
                    if (!isConnected()) {
                        throw new SocketException("Connection reset");
                    }
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
                        if (f81I) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    Iterator it = this.f68w.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Segment segment = (Segment) it.next();
                        if (segment instanceof C0006f) {
                            it.remove();
                            break;
                        } else if (segment instanceof C0004d) {
                            if (i3 <= 0) {
                                it.remove();
                                return -1;
                            }
                        } else if (segment instanceof C0002b) {
                            byte[] m5340c = ((C0002b) segment).m5340c();
                            if (m5340c.length + i3 > i2) {
                                if (i3 <= 0) {
                                    throw new IOException("insufficient buffer space");
                                }
                            } else {
                                System.arraycopy(m5340c, 0, bArr, i + i3, m5340c.length);
                                i3 += m5340c.length;
                                it.remove();
                            }
                        }
                    }
                    if (i3 > 0) {
                        return i3;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m5267a(InterfaceC0029s interfaceC0029s) {
        if (interfaceC0029s == null) {
            throw new NullPointerException("stateListener");
        }
        synchronized (this.f64t) {
            if (!this.f64t.contains(interfaceC0029s)) {
                this.f64t.add(interfaceC0029s);
            }
        }
    }

    /* renamed from: a */
    private void m5271a(Segment segment) {
        if ((segment instanceof C0002b) || (segment instanceof C0006f) || (segment instanceof C0004d) || (segment instanceof C0005e)) {
            m5239h(segment);
        }
        if ((segment instanceof C0002b) || (segment instanceof C0006f) || (segment instanceof C0004d)) {
            this.f77E.m5303d();
        }
        if (f81I) {
            m5266a("sent " + segment);
        }
        m5251d(segment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public Segment m5237i() {
        Segment m5276a = m5276a();
        if (m5276a != null) {
            if (f81I) {
                m5266a("recv " + m5276a);
            }
            if ((m5276a instanceof C0002b) || (m5276a instanceof C0005e) || (m5276a instanceof C0006f) || (m5276a instanceof C0004d) || (m5276a instanceof C0007g)) {
                this.f70y.m5221c();
            }
            if (this.f55k) {
                this.f80H.m5303d();
            }
        }
        return m5276a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5248e(Segment segment) {
        synchronized (this.f66u) {
            while (true) {
                if (this.f66u.size() >= this.f72A || this.f70y.m5214j() > this.f65g.m5203b()) {
                    if (this.f52b) {
                        throw new SocketException("Socket is closed");
                    }
                    try {
                        this.f66u.wait(10000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    this.f70y.m5215i();
                    this.f66u.add(segment);
                }
            }
        }
        if (this.f52b) {
            throw new SocketException("Socket is closed");
        }
        if (!(segment instanceof C0003c) && !(segment instanceof C0001a)) {
            synchronized (this.f78F) {
                if (this.f78F.m5304c()) {
                    this.f78F.m5306a(this.f65g.m5197h(), this.f65g.m5197h());
                }
            }
        }
        m5271a(segment);
        if (segment instanceof C0002b) {
            synchronized (this.f63s) {
                Iterator it = this.f63s.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0026p) it.next()).m5210a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m5245f(Segment segment) {
        if (this.f65g.m5202c() > 0) {
            segment.m5314b(segment.m5309o() + 1);
        }
        if (this.f65g.m5202c() != 0 && segment.m5309o() > this.f65g.m5202c()) {
            m5231m();
            return;
        }
        m5271a(segment);
        if (segment instanceof C0002b) {
            synchronized (this.f63s) {
                Iterator it = this.f63s.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0026p) it.next()).m5209b();
                }
            }
        }
    }

    /* renamed from: j */
    private void m5235j() {
        if (isConnected()) {
            this.f77E.m5302e();
            if (this.f55k) {
                this.f80H.m5302e();
            }
            synchronized (this.f62r) {
                this.f54j = false;
                this.f62r.notify();
            }
        } else {
            synchronized (this) {
                m5246f();
                this.f53i = true;
                this.f56l = 3;
                notify();
            }
            synchronized (this.f64t) {
                Iterator it = this.f64t.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0029s) it.next()).m5195a(this);
                }
            }
        }
        this.f77E.m5306a(0L, this.f65g.m5198g());
        if (this.f55k) {
            this.f80H.m5306a(this.f65g.m5198g() * 6, this.f65g.m5198g() * 6);
        }
    }

    /* renamed from: k */
    private void m5233k() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((InterfaceC0029s) it.next()).m5194b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m5232l() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((InterfaceC0029s) it.next()).m5193c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m5231m() {
        synchronized (this.f61q) {
            if (isClosed()) {
                return;
            }
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
                    m5249e();
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
                    ((InterfaceC0029s) it.next()).m5192d(this);
                }
            }
        }
    }

    /* renamed from: n */
    private void m5230n() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((InterfaceC0029s) it.next()).m5191e(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5272a(C0007g c0007g) {
        switch (this.f56l) {
            case 0:
                this.f56l = 1;
                this.f65g = new C0028r(this.f72A, this.f73B, c0007g.m5327e(), c0007g.m5329c(), c0007g.m5323i(), c0007g.m5322j(), c0007g.m5321k(), c0007g.m5320l(), c0007g.m5324h(), c0007g.m5326f(), c0007g.m5325g());
                this.f70y.m5222b(c0007g.m5311m());
                C0007g c0007g2 = new C0007g(this.f70y.m5224a(new Random(System.currentTimeMillis()).nextInt(255)), this.f65g.m5203b(), this.f65g.m5206a(), this.f65g.m5197h(), this.f65g.m5196i(), this.f65g.m5198g(), this.f65g.m5202c(), this.f65g.m5201d(), this.f65g.m5200e(), this.f65g.m5199f());
                c0007g2.m5318a(c0007g.m5311m());
                m5248e(c0007g2);
                return;
            case 1:
                synchronized (this.f66u) {
                    Iterator it = this.f66u.iterator();
                    while (it.hasNext()) {
                        try {
                            m5245f((Segment) it.next());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
            case 2:
                this.f70y.m5222b(c0007g.m5311m());
                this.f56l = 3;
                m5229o();
                m5235j();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5273a(C0003c c0003c) {
        int[] m5336c = c0003c.m5336c();
        int n = c0003c.m5310n();
        int i = m5336c[m5336c.length - 1];
        synchronized (this.f66u) {
            Iterator it = this.f66u.iterator();
            while (it.hasNext()) {
                Segment segment = (Segment) it.next();
                if (m5274a(segment.m5311m(), n) <= 0) {
                    it.remove();
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= m5336c.length) {
                            break;
                        } else if (m5274a(segment.m5311m(), m5336c[i2]) != 0) {
                            i2++;
                        } else {
                            it.remove();
                            break;
                        }
                    }
                }
            }
            Iterator it2 = this.f66u.iterator();
            while (it2.hasNext()) {
                Segment segment2 = (Segment) it2.next();
                if (m5274a(n, segment2.m5311m()) < 0 && m5274a(i, segment2.m5311m()) > 0) {
                    try {
                        m5245f(segment2);
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
    public void m5242g(Segment segment) {
        if (segment instanceof C0006f) {
            synchronized (this.f62r) {
                this.f54j = true;
            }
            m5230n();
        }
        if (segment instanceof C0004d) {
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
            if (m5274a(segment.m5311m(), this.f70y.m5223b()) > 0) {
                if (m5274a(segment.m5311m(), m5261b(this.f70y.m5223b())) == 0) {
                    z = true;
                    if (this.f68w.size() == 0 || this.f68w.size() + this.f67v.size() < this.f73B) {
                        this.f70y.m5222b(segment.m5311m());
                        if ((segment instanceof C0002b) || (segment instanceof C0006f) || (segment instanceof C0004d)) {
                            this.f68w.add(segment);
                        }
                        if (segment instanceof C0002b) {
                            synchronized (this.f63s) {
                                Iterator it = this.f63s.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC0026p) it.next()).m5208c();
                                }
                            }
                        }
                        m5226r();
                    }
                } else if (this.f68w.size() + this.f67v.size() < this.f73B) {
                    boolean z2 = false;
                    for (int i = 0; i < this.f67v.size() && !z2; i++) {
                        int m5274a = m5274a(segment.m5311m(), ((Segment) this.f67v.get(i)).m5311m());
                        if (m5274a == 0) {
                            z2 = true;
                        } else if (m5274a < 0) {
                            this.f67v.add(i, segment);
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        this.f67v.add(segment);
                    }
                    this.f70y.m5218f();
                    if (segment instanceof C0002b) {
                        synchronized (this.f63s) {
                            Iterator it2 = this.f63s.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC0026p) it2.next()).m5207d();
                            }
                        }
                    }
                }
            }
            if (z && ((segment instanceof C0006f) || (segment instanceof C0005e) || (segment instanceof C0004d))) {
                m5229o();
            } else if (this.f70y.m5217g() > 0 && (this.f65g.m5200e() == 0 || this.f70y.m5217g() > this.f65g.m5200e())) {
                m5228p();
            } else if (this.f70y.m5220d() > 0 && (this.f65g.m5201d() == 0 || this.f70y.m5220d() > this.f65g.m5201d())) {
                m5227q();
            } else {
                synchronized (this.f79G) {
                    if (this.f79G.m5304c()) {
                        this.f79G.m5307a(this.f65g.m5196i());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m5229o() {
        synchronized (this.f69x) {
            if (!this.f67v.isEmpty()) {
                m5228p();
            } else {
                m5227q();
            }
        }
    }

    /* renamed from: p */
    private void m5228p() {
        synchronized (this.f69x) {
            if (this.f67v.isEmpty()) {
                return;
            }
            this.f70y.m5219e();
            this.f70y.m5216h();
            int[] iArr = new int[this.f67v.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = ((Segment) this.f67v.get(i)).m5311m();
            }
            try {
                int m5223b = this.f70y.m5223b();
                m5271a((Segment) new C0003c(m5261b(m5223b), m5223b, iArr));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: q */
    private void m5227q() {
        if (this.f70y.m5219e() == 0) {
            return;
        }
        try {
            int m5223b = this.f70y.m5223b();
            m5271a(new C0001a(m5261b(m5223b), m5223b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    private void m5239h(Segment segment) {
        if (this.f70y.m5219e() == 0) {
            return;
        }
        segment.m5318a(this.f70y.m5223b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public boolean m5260b(Segment segment) {
        int m5310n = segment.m5310n();
        if (m5310n < 0) {
            return false;
        }
        Iterator it = this.f66u.iterator();
        while (it.hasNext()) {
            if (m5274a(((Segment) it.next()).m5311m(), m5310n) <= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m5255c(Segment segment) {
        int m5310n = segment.m5310n();
        if (m5310n < 0) {
            return;
        }
        this.f70y.m5213k();
        synchronized (this.f66u) {
            Iterator it = this.f66u.iterator();
            while (it.hasNext()) {
                if (m5274a(((Segment) it.next()).m5311m(), m5310n) <= 0) {
                    it.remove();
                }
            }
            if (this.f56l == 1) {
                boolean z = false;
                if (!this.f66u.isEmpty()) {
                    Iterator it2 = this.f66u.iterator();
                    while (it2.hasNext()) {
                        if (((Segment) it2.next()) instanceof C0007g) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    m5266a("Bad first ack: " + m5310n);
                    return;
                } else {
                    this.f56l = 3;
                    m5235j();
                }
            }
            if (this.f66u.isEmpty()) {
                this.f78F.m5302e();
            }
            this.f66u.notifyAll();
        }
    }

    /* renamed from: r */
    private void m5226r() {
        synchronized (this.f69x) {
            Iterator it = this.f67v.iterator();
            while (it.hasNext()) {
                Segment segment = (Segment) it.next();
                if (m5274a(segment.m5311m(), m5261b(this.f70y.m5223b())) == 0) {
                    this.f70y.m5222b(segment.m5311m());
                    if ((segment instanceof C0002b) || (segment instanceof C0006f) || (segment instanceof C0004d)) {
                        this.f68w.add(segment);
                    }
                    it.remove();
                }
            }
            this.f69x.notify();
        }
    }

    /* renamed from: d */
    protected void m5251d(Segment segment) {
        try {
            this.f47c.send(new DatagramPacket(segment.m5312d(), segment.m5315b(), this.f48d));
        } catch (IOException e) {
            if (!isClosed()) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    protected Segment m5276a() {
        try {
            if (this.f51a == null) {
                this.f51a = new byte[65535];
            }
            DatagramPacket datagramPacket = new DatagramPacket(this.f51a, this.f51a.length);
            this.f47c.receive(datagramPacket);
            return Segment.m5313b(datagramPacket.getData(), 0, datagramPacket.getLength());
        } catch (IOException e) {
            if (!isClosed()) {
                e.printStackTrace();
                return null;
            }
            return null;
        }
    }

    /* renamed from: b */
    protected void m5262b() {
        this.f47c.close();
    }

    /* renamed from: e */
    protected void m5249e() {
        this.f77E.m5302e();
        this.f80H.m5302e();
        this.f56l = 4;
        Thread thread = new Thread() { // from class: a.a.h.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                C0017h.this.f80H.m5301f();
                C0017h.this.f77E.m5301f();
                try {
                    Thread.sleep(C0017h.this.f65g.m5198g() * 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C0017h.this.f78F.m5301f();
                C0017h.this.f79G.m5301f();
                C0017h.this.m5262b();
                C0017h.this.m5232l();
            }
        };
        thread.setName("ReliableSocket-Closing");
        thread.setDaemon(true);
        thread.start();
    }

    /* renamed from: a */
    protected synchronized void m5266a(String str) {
        System.out.println(getLocalPort() + ": " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m5261b(int i) {
        return (i + 1) % 255;
    }

    /* renamed from: a */
    private int m5274a(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        if (i < i2 && i2 - i > 127) {
            return 1;
        }
        if (i > i2 && i - i2 < 127) {
            return 1;
        }
        return -1;
    }

    /* renamed from: f */
    public synchronized void m5246f() {
        if (!this.f76h) {
            this.f76h = true;
            this.f77E.m5308a();
            this.f78F.m5308a();
            this.f79G.m5308a();
            this.f80H.m5308a();
        }
    }

    /* renamed from: g */
    public synchronized void m5243g() {
        if (this.f76h) {
            this.f76h = false;
            this.f78F.m5301f();
            this.f79G.m5301f();
            this.f80H.m5301f();
            this.f77E.m5301f();
        }
    }
}
