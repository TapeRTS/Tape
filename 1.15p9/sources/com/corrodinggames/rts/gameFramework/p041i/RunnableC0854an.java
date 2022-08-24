package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import net.rudp.AbstractC0012c;
import net.rudp.C0010b;

/* renamed from: com.corrodinggames.rts.gameFramework.i.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/an.class */
public class RunnableC0854an implements Runnable {

    /* renamed from: b */
    public static boolean f5688b = true;

    /* renamed from: r */
    private final C0831ad f5689r;

    /* renamed from: d */
    ServerSocket f5691d;

    /* renamed from: e */
    int f5692e;

    /* renamed from: f */
    boolean f5693f;

    /* renamed from: o */
    boolean f5702o;

    /* renamed from: p */
    boolean f5703p;

    /* renamed from: q */
    boolean f5704q;

    /* renamed from: a */
    public final boolean f5687a = false;

    /* renamed from: c */
    volatile boolean f5690c = true;

    /* renamed from: g */
    long f5694g = -1;

    /* renamed from: h */
    final boolean f5695h = false;

    /* renamed from: i */
    final boolean f5696i = true;

    /* renamed from: j */
    final Object f5697j = new Object();

    /* renamed from: k */
    ArrayList f5698k = new ArrayList();

    /* renamed from: l */
    final Object f5699l = new Object();

    /* renamed from: m */
    int f5700m = 0;

    /* renamed from: n */
    int f5701n = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0854an(C0831ad c0831ad) {
        this.f5689r = c0831ad;
    }

    /* renamed from: a */
    public boolean m1585a(InetAddress inetAddress, boolean z) {
        if (inetAddress == null) {
            GameEngine.PrintLog("isIpAllowed: inetAddress==null");
            return true;
        } else if (!f5688b) {
            return true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f5694g + 60000) {
                this.f5694g = currentTimeMillis;
                synchronized (this.f5699l) {
                    this.f5698k.clear();
                }
                this.f5700m = 0;
                this.f5701n = 0;
                this.f5702o = false;
                this.f5703p = false;
                this.f5704q = false;
            }
            synchronized (this.f5699l) {
                boolean z2 = false;
                Iterator it = this.f5698k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0856ao c0856ao = (C0856ao) it.next();
                    if (inetAddress.equals(c0856ao.f5706a)) {
                        c0856ao.f5707b++;
                        int i = 30;
                        if (this.f5701n > 100) {
                            i = 10;
                        }
                        if (this.f5701n > 250) {
                            i = 5;
                        }
                        if (c0856ao.f5707b > i) {
                            if (!c0856ao.f5708c) {
                                c0856ao.f5708c = true;
                                GameEngine.PrintLog("DOS: Too many attempts:" + c0856ao.f5707b + " ip:" + inetAddress.toString());
                            }
                            if (c0856ao.f5707b > 300 && !c0856ao.f5709d) {
                                c0856ao.f5709d = true;
                                GameEngine.PrintLog("DOS: Excessive attempts:" + c0856ao.f5707b + " ip:" + inetAddress.toString());
                            }
                            return false;
                        }
                        z2 = true;
                    }
                }
                if (!z2) {
                    if (z) {
                        this.f5700m++;
                    }
                    if (this.f5698k.size() > 200) {
                        C0856ao c0856ao2 = null;
                        Iterator it2 = this.f5698k.iterator();
                        while (it2.hasNext()) {
                            C0856ao c0856ao3 = (C0856ao) it2.next();
                            if (c0856ao2 == null || c0856ao2.f5707b > c0856ao3.f5707b) {
                                c0856ao2 = c0856ao3;
                            }
                        }
                        if (c0856ao2 != null) {
                            this.f5698k.remove(c0856ao2);
                        }
                    }
                    C0856ao c0856ao4 = new C0856ao(this);
                    c0856ao4.f5706a = inetAddress;
                    this.f5698k.add(c0856ao4);
                }
                if (this.f5700m > 500) {
                    if (!this.f5703p) {
                        this.f5703p = true;
                        GameEngine.PrintLog("DOS: Too many unique attempts: " + this.f5700m + ". udp:" + this.f5693f);
                        return false;
                    }
                    return false;
                }
                int i2 = 0;
                int i3 = 0;
                Iterator it3 = this.f5689r.f5600bc.iterator();
                while (it3.hasNext()) {
                    Connection connection = (Connection) it3.next();
                    i3++;
                    if (connection.f5762e != null && inetAddress.equals(connection.f5762e)) {
                        i2++;
                    }
                }
                int i4 = 20;
                if (i3 > 150) {
                    i4 = 10;
                }
                if (i3 > 200) {
                    i4 = 5;
                }
                if (i2 > i4) {
                    if (!this.f5704q) {
                        this.f5704q = true;
                        GameEngine.PrintLog("DOS: Too open connections from same ip:" + inetAddress.toString() + " (count:" + i2 + ") max:" + i4);
                        return false;
                    }
                    return false;
                } else if (i3 > 300) {
                    if (!this.f5702o) {
                        this.f5702o = true;
                        GameEngine.PrintLog("DOS: Too open connections locking down:" + inetAddress.toString() + " (count:" + i3 + ")");
                        return false;
                    }
                    return false;
                } else {
                    this.f5701n++;
                    return true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m1586a() {
        this.f5689r.m1663d("Recreating server socket " + (this.f5693f ? "udp" : "tcp"));
        synchronized (this.f5697j) {
            if (this.f5691d != null) {
                try {
                    this.f5691d.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f5691d = null;
            }
            if (!this.f5690c) {
                throw new IOException("recreate on non-active socket");
            }
            m1584a(this.f5693f);
        }
    }

    /* renamed from: a */
    public void m1584a(boolean z) {
        this.f5692e = this.f5689r.f5474m;
        this.f5689r.m1663d("starting socket.. " + (z ? "udp" : "tcp") + " port: " + this.f5692e);
        this.f5693f = z;
        if (!z) {
            this.f5691d = new ServerSocket(this.f5692e);
            return;
        }
        C0010b c0010b = new C0010b(this.f5689r.f5474m, 0, null, true);
        c0010b.m6705a(new C08551());
        this.f5691d = c0010b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.an$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/an$1.class */
    public class C08551 extends AbstractC0012c {
        C08551() {
        }

        /* renamed from: a */
        public boolean m1582a(SocketAddress socketAddress) {
            if (socketAddress instanceof InetSocketAddress) {
                return RunnableC0854an.this.m1585a(((InetSocketAddress) socketAddress).getAddress(), false);
            }
            GameEngine.PrintLog("AcceptFilter: Unhandled SocketAddress type:" + socketAddress.getClass().getName());
            return true;
        }
    }

    public void run() {
        GameEngine.m1156ap();
        Thread.currentThread().setName("NewConnectionWorker-" + (this.f5693f ? "udp" : "tcp") + " - " + this.f5692e);
        int i = 0;
        int i2 = 0;
        this.f5689r.m1663d("reading..");
        while (this.f5690c) {
            try {
                Socket accept = this.f5691d.accept();
                try {
                    accept.setTcpNoDelay(true);
                    accept.setSoTimeout(15000);
                    String str = "<unknown>";
                    InetAddress inetAddress = accept.getInetAddress();
                    if (inetAddress != null) {
                        str = inetAddress.getHostAddress();
                    }
                    if (!m1585a(inetAddress, true)) {
                        accept.close();
                    } else {
                        Connection connection = new Connection(this.f5689r, accept);
                        String str2 = "Accepted new connection id:" + connection.f5760c + ".. (ip:" + str + ")";
                        if (this.f5693f) {
                            str2 = str2 + " (udp)";
                        }
                        this.f5689r.m1663d(str2);
                        connection.f5764h = this.f5693f;
                        connection.f5762e = inetAddress;
                        connection.m1494d();
                        this.f5689r.f5600bc.add(connection);
                    }
                } catch (IOException e) {
                    GameEngine.PrintLog("Got IOException on new player connection");
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                if (this.f5690c) {
                    GameEngine m1228A = GameEngine.m1228A();
                    i++;
                    GameEngine.PrintLog("ServerSocket-accept(" + (this.f5693f ? "udp" : "tcp") + ") failed: " + e2.getMessage() + " (closed:" + this.f5691d.isClosed() + ")");
                    if (i > 100) {
                        GameEngine.PrintLog("Too many server socket fails");
                        m1583b();
                        return;
                    }
                    try {
                        m1586a();
                        if (i2 < 3 && m1228A.networkEngine.m1794C() > 0) {
                            String str3 = "Warning: server socket got closed and needed to be recreated, players were likely disconnected (but can rejoin).";
                            if (GameEngine.f6204aZ) {
                                str3 = str3 + "\n This likely due to iOS removing sockets of background apps. Avoid minimising the game when hosting.";
                            }
                            GameEngine.m1228A().m1110i(str3);
                            i2++;
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        GameEngine.m1228A().m1110i("Warning server socket got closed and could not be recreated");
                        m1583b();
                        return;
                    }
                } else {
                    GameEngine.PrintLog("ServerSocket-accept(" + (this.f5693f ? "udp" : "tcp") + "): Got expected IOException after closed socket");
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void m1583b() {
        synchronized (this.f5697j) {
            this.f5690c = false;
            if (this.f5691d != null) {
                try {
                    this.f5691d.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f5691d = null;
            }
        }
    }
}
