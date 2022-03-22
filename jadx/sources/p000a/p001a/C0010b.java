package p000a.p001a;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: a.a.b */
/* loaded from: game-lib.jar:a/a/b.class */
public class C0010b extends ServerSocket {

    /* renamed from: a */
    AbstractC0012c f28a;

    /* renamed from: d */
    private DatagramSocket f29d;

    /* renamed from: e */
    private int f30e;

    /* renamed from: f */
    private int f31f;

    /* renamed from: g */
    private boolean f32g;

    /* renamed from: h */
    private ArrayList f33h;

    /* renamed from: i */
    private HashMap f34i;

    /* renamed from: j */
    private HashMap f35j;

    /* renamed from: k */
    private HashMap f36k;

    /* renamed from: b */
    long f37b;

    /* renamed from: c */
    int f38c;

    /* renamed from: l */
    private AbstractC0029s f39l;

    public C0010b() {
        this(new DatagramSocket((SocketAddress) null), 0);
    }

    public C0010b(int i, int i2, InetAddress inetAddress, boolean z) {
        DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
        datagramSocket.setReuseAddress(z);
        datagramSocket.bind(new InetSocketAddress(inetAddress, i));
        m4384a(datagramSocket, i2);
    }

    public C0010b(DatagramSocket datagramSocket, int i) {
        m4384a(datagramSocket, i);
    }

    /* renamed from: a */
    public void m4384a(DatagramSocket datagramSocket, int i) {
        if (datagramSocket == null) {
            throw new NullPointerException("sock");
        }
        this.f29d = datagramSocket;
        this.f31f = i <= 0 ? 50 : i;
        this.f33h = new ArrayList(this.f31f);
        this.f34i = new HashMap();
        this.f35j = new HashMap();
        this.f36k = new HashMap();
        this.f39l = new C0015f(this, null);
        this.f30e = 0;
        this.f32g = false;
        new C0013d(this).start();
    }

    /* renamed from: a */
    public void m4386a(AbstractC0012c cVar) {
        this.f28a = cVar;
    }

    @Override // java.net.ServerSocket
    public Socket accept() {
        Socket socket;
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        synchronized (this.f33h) {
            do {
                if (this.f33h.isEmpty()) {
                    try {
                        if (this.f30e != 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            this.f33h.wait(this.f30e);
                            if (System.currentTimeMillis() - currentTimeMillis >= this.f30e) {
                                throw new SocketTimeoutException();
                                break;
                            }
                        } else {
                            this.f33h.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    socket = (Socket) this.f33h.remove(0);
                }
            } while (!isClosed());
            throw new SocketException("Socket is closed");
        }
        return socket;
    }

    @Override // java.net.ServerSocket
    public synchronized void bind(SocketAddress socketAddress) {
        bind(socketAddress, 0);
    }

    @Override // java.net.ServerSocket
    public synchronized void bind(SocketAddress socketAddress, int i) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        this.f29d.setReuseAddress(true);
        this.f29d.bind(socketAddress);
    }

    @Override // java.net.ServerSocket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!isClosed()) {
            this.f32g = true;
            synchronized (this.f33h) {
                this.f33h.clear();
                this.f33h.notify();
            }
            synchronized (this.f34i) {
                if (this.f34i.isEmpty()) {
                    this.f29d.close();
                }
            }
        }
    }

    @Override // java.net.ServerSocket
    public InetAddress getInetAddress() {
        return this.f29d.getInetAddress();
    }

    @Override // java.net.ServerSocket
    public int getLocalPort() {
        return this.f29d.getLocalPort();
    }

    @Override // java.net.ServerSocket
    public SocketAddress getLocalSocketAddress() {
        return this.f29d.getLocalSocketAddress();
    }

    @Override // java.net.ServerSocket
    public boolean isBound() {
        return this.f29d.isBound();
    }

    @Override // java.net.ServerSocket
    public boolean isClosed() {
        return this.f32g;
    }

    @Override // java.net.ServerSocket
    public void setSoTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        this.f30e = i;
    }

    @Override // java.net.ServerSocket
    public int getSoTimeout() {
        return this.f30e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4382a(SocketAddress socketAddress, C0014e eVar) {
        synchronized (this.f34i) {
            eVar.m4367a(this.f39l);
            this.f34i.put(socketAddress, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C0014e m4383a(SocketAddress socketAddress) {
        C0014e eVar;
        synchronized (this.f34i) {
            eVar = (C0014e) this.f34i.remove(socketAddress);
            if (this.f34i.isEmpty() && isClosed()) {
                this.f29d.close();
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4385a(String str) {
        if (this.f37b + 5000 < System.currentTimeMillis()) {
            this.f37b = System.currentTimeMillis();
            this.f38c = 0;
        }
        if (this.f38c <= 20) {
            this.f38c++;
            System.out.println(str);
        }
    }
}
