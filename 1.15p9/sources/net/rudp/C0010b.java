package net.rudp;

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
    private InterfaceC0029s f39l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ DatagramSocket m6709a(C0010b c0010b) {
        return c0010b.f29d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m6708a(C0010b c0010b, String str) {
        c0010b.m6704a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ HashMap m6700b(C0010b c0010b) {
        return c0010b.f34i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ HashMap m6699c(C0010b c0010b) {
        return c0010b.f36k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ HashMap m6698d(C0010b c0010b) {
        return c0010b.f35j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m6706a(C0010b c0010b, SocketAddress socketAddress, C0014e c0014e) {
        c0010b.m6701a(socketAddress, c0014e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ ArrayList m6697e(C0010b c0010b) {
        return c0010b.f33h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ C0014e m6707a(C0010b c0010b, SocketAddress socketAddress) {
        return c0010b.m6702a(socketAddress);
    }

    public C0010b() {
        this(new DatagramSocket((SocketAddress) null), 0);
    }

    public C0010b(int i, int i2, InetAddress inetAddress, boolean z) {
        DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
        datagramSocket.setReuseAddress(z);
        datagramSocket.bind(new InetSocketAddress(inetAddress, i));
        m6703a(datagramSocket, i2);
    }

    public C0010b(DatagramSocket datagramSocket, int i) {
        m6703a(datagramSocket, i);
    }

    /* renamed from: a */
    public void m6703a(DatagramSocket datagramSocket, int i) {
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
    public void m6705a(AbstractC0012c abstractC0012c) {
        this.f28a = abstractC0012c;
    }

    public Socket accept() {
        Socket socket;
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        synchronized (this.f33h) {
            do {
                if (this.f33h.isEmpty()) {
                    try {
                        if (this.f30e == 0) {
                            this.f33h.wait();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            this.f33h.wait(this.f30e);
                            if (System.currentTimeMillis() - currentTimeMillis >= this.f30e) {
                                throw new SocketTimeoutException();
                                break;
                            }
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

    public synchronized void bind(SocketAddress socketAddress) {
        bind(socketAddress, 0);
    }

    public synchronized void bind(SocketAddress socketAddress, int i) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        this.f29d.setReuseAddress(true);
        this.f29d.bind(socketAddress);
    }

    public synchronized void close() {
        if (isClosed()) {
            return;
        }
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

    public InetAddress getInetAddress() {
        return this.f29d.getInetAddress();
    }

    public int getLocalPort() {
        return this.f29d.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.f29d.getLocalSocketAddress();
    }

    public boolean isBound() {
        return this.f29d.isBound();
    }

    public boolean isClosed() {
        return this.f32g;
    }

    public void setSoTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        this.f30e = i;
    }

    public int getSoTimeout() {
        return this.f30e;
    }

    /* renamed from: a */
    private void m6701a(SocketAddress socketAddress, C0014e c0014e) {
        synchronized (this.f34i) {
            c0014e.m6680a(this.f39l);
            this.f34i.put(socketAddress, c0014e);
        }
    }

    /* renamed from: a */
    private C0014e m6702a(SocketAddress socketAddress) {
        C0014e c0014e;
        synchronized (this.f34i) {
            c0014e = (C0014e) this.f34i.remove(socketAddress);
            if (this.f34i.isEmpty() && isClosed()) {
                this.f29d.close();
            }
        }
        return c0014e;
    }

    /* renamed from: a */
    private void m6704a(String str) {
        if (this.f37b + 5000 < System.currentTimeMillis()) {
            this.f37b = System.currentTimeMillis();
            this.f38c = 0;
        }
        if (this.f38c > 20) {
            return;
        }
        this.f38c++;
        System.out.println(str);
    }
}
