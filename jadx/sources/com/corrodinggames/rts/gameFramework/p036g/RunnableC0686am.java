package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p001a.AbstractC0012c;
import p000a.p001a.C0010b;

/* renamed from: com.corrodinggames.rts.gameFramework.g.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/am.class */
public class RunnableC0686am implements Runnable {

    /* renamed from: b */
    public static boolean f4845b = true;

    /* renamed from: r */
    private final Hcat_Multiplaye f4846r;

    /* renamed from: d */
    ServerSocket f4847d;

    /* renamed from: e */
    int f4848e;

    /* renamed from: f */
    boolean f4849f;

    /* renamed from: o */
    boolean f4850o;

    /* renamed from: p */
    boolean f4851p;

    /* renamed from: q */
    boolean f4852q;

    /* renamed from: a */
    public final boolean f4853a = false;

    /* renamed from: c */
    volatile boolean f4854c = true;

    /* renamed from: g */
    long f4855g = -1;

    /* renamed from: h */
    final boolean f4856h = false;

    /* renamed from: i */
    final boolean f4857i = true;

    /* renamed from: j */
    final Object f4858j = new Object();

    /* renamed from: k */
    ArrayList f4859k = new ArrayList();

    /* renamed from: l */
    final Object f4860l = new Object();

    /* renamed from: m */
    int f4861m = 0;

    /* renamed from: n */
    int f4862n = 0;

    RunnableC0686am(Hcat_Multiplaye adVar) {
        this.f4846r = adVar;
    }

    /* renamed from: a */
    public boolean m1207a(InetAddress inetAddress, boolean z) {
        if (inetAddress == null) {
            AbstractC0789l.m683d("isIpAllowed: inetAddress==null");
            return true;
        } else if (!f4845b) {
            return true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f4855g + 60000) {
                this.f4855g = currentTimeMillis;
                synchronized (this.f4860l) {
                    this.f4859k.clear();
                }
                this.f4861m = 0;
                this.f4862n = 0;
                this.f4850o = false;
                this.f4851p = false;
                this.f4852q = false;
            }
            synchronized (this.f4860l) {
                boolean z2 = false;
                Iterator it = this.f4859k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0688an anVar = (C0688an) it.next();
                    if (inetAddress.equals(anVar.f4864a)) {
                        anVar.f4865b++;
                        int i = 30;
                        if (this.f4862n > 100) {
                            i = 10;
                        }
                        if (this.f4862n > 250) {
                            i = 5;
                        }
                        if (anVar.f4865b > i) {
                            if (!anVar.f4866c) {
                                anVar.f4866c = true;
                                AbstractC0789l.m683d("DOS: Too many attempts:" + anVar.f4865b + " ip:" + inetAddress.toString());
                            }
                            if (anVar.f4865b > 300 && !anVar.f4867d) {
                                anVar.f4867d = true;
                                AbstractC0789l.m683d("DOS: Excessive attempts:" + anVar.f4865b + " ip:" + inetAddress.toString());
                            }
                            return false;
                        }
                        z2 = true;
                    }
                }
                if (!z2) {
                    if (z) {
                        this.f4861m++;
                    }
                    if (this.f4859k.size() > 200) {
                        C0688an anVar2 = null;
                        Iterator it2 = this.f4859k.iterator();
                        while (it2.hasNext()) {
                            C0688an anVar3 = (C0688an) it2.next();
                            if (anVar2 == null || anVar2.f4865b > anVar3.f4865b) {
                                anVar2 = anVar3;
                            }
                        }
                        if (anVar2 != null) {
                            this.f4859k.remove(anVar2);
                        }
                    }
                    C0688an anVar4 = new C0688an(this);
                    anVar4.f4864a = inetAddress;
                    this.f4859k.add(anVar4);
                }
                if (this.f4861m <= 500) {
                    int i2 = 0;
                    int i3 = 0;
                    Iterator it3 = this.f4846r.f4766aV.iterator();
                    while (it3.hasNext()) {
                        C0698c cVar = (C0698c) it3.next();
                        i3++;
                        if (cVar.f4918e != null && inetAddress.equals(cVar.f4918e)) {
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
                        if (this.f4852q) {
                            return false;
                        }
                        this.f4852q = true;
                        AbstractC0789l.m683d("DOS: Too open connections from same ip:" + inetAddress.toString() + " (count:" + i2 + ") max:" + i4);
                        return false;
                    } else if (i3 <= 300) {
                        this.f4862n++;
                        return true;
                    } else if (this.f4850o) {
                        return false;
                    } else {
                        this.f4850o = true;
                        AbstractC0789l.m683d("DOS: Too open connections locking down:" + inetAddress.toString() + " (count:" + i3 + ")");
                        return false;
                    }
                } else if (this.f4851p) {
                    return false;
                } else {
                    this.f4851p = true;
                    AbstractC0789l.m683d("DOS: Too many unique attempts: " + this.f4861m + ". udp:" + this.f4849f);
                    return false;
                }
            }
        }
    }

    /* renamed from: a */
    public void m1208a() {
        this.f4846r.m1284c("Recreating server socket " + (this.f4849f ? "udp" : "tcp"));
        synchronized (this.f4858j) {
            if (this.f4847d != null) {
                try {
                    this.f4847d.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f4847d = null;
            }
            if (!this.f4854c) {
                throw new IOException("recreate on non-active socket");
            }
            m1206a(this.f4849f);
        }
    }

    /* renamed from: a */
    public void m1206a(boolean z) {
        this.f4848e = this.f4846r.f4653l;
        this.f4846r.m1284c("starting socket.. " + (z ? "udp" : "tcp") + " port: " + this.f4848e);
        this.f4849f = z;
        if (!z) {
            this.f4847d = new ServerSocket(this.f4848e);
            return;
        }
        C0010b bVar = new C0010b(this.f4846r.f4653l, 0, null, true);
        bVar.m4721a(new C06871());
        this.f4847d = bVar;
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.g.am$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/am$1.class */
    class C06871 extends AbstractC0012c {
        C06871() {
        }

        /* renamed from: a */
        public boolean mo4712a(SocketAddress socketAddress) {
            if (socketAddress instanceof InetSocketAddress) {
                return RunnableC0686am.this.m1207a(((InetSocketAddress) socketAddress).getAddress(), false);
            }
            AbstractC0789l.m683d("AcceptFilter: Unhandled SocketAddress type:" + socketAddress.getClass().getName());
            return true;
        }
    }

    public void run() {
        AbstractC0789l.m715ag();
        Thread.currentThread().setName("NewConnectionWorker-" + (this.f4849f ? "udp" : "tcp") + " - " + this.f4848e);
        int i = 0;
        int i2 = 0;
        this.f4846r.m1284c("reading..");
        while (this.f4854c) {
            try {
                Socket accept = this.f4847d.accept();
                try {
                    accept.setTcpNoDelay(true);
                    accept.setSoTimeout(15000);
                    String str = "<unknown>";
                    InetAddress inetAddress = accept.getInetAddress();
                    if (inetAddress != null) {
                        str = inetAddress.getHostAddress();
                    }
                    if (!m1207a(inetAddress, true)) {
                        accept.close();
                    } else {
                        C0698c cVar = new C0698c(this.f4846r, accept);
                        String str2 = "Accepted new connection id:" + cVar.f4916c + ".. (ip:" + str + ")";
                        if (this.f4849f) {
                            str2 = str2 + " (udp)";
                        }
                        this.f4846r.m1284c(str2);
                        cVar.f4920h = this.f4849f;
                        cVar.f4918e = inetAddress;
                        cVar.m1121d();
                        this.f4846r.f4766aV.add(cVar);
                    }
                } catch (IOException e) {
                    AbstractC0789l.m683d("Got IOException on new player connection");
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                if (!this.f4854c) {
                    AbstractC0789l.m683d("ServerSocket-accept(" + (this.f4849f ? "udp" : "tcp") + "): Got expected IOException after closed socket");
                    return;
                }
                AbstractC0789l u = AbstractC0789l.m651u();
                i++;
                AbstractC0789l.m683d("ServerSocket-accept(" + (this.f4849f ? "udp" : "tcp") + ") failed: " + e2.getMessage() + " (closed:" + this.f4847d.isClosed() + ")");
                if (i > 100) {
                    AbstractC0789l.m683d("Too many server socket fails");
                    m1205b();
                    return;
                }
                try {
                    m1208a();
                    if (i2 < 3 && u.f5486bF.m1227w() > 0) {
                        String str3 = "Warning: server socket got closed and needed to be recreated, players were likely disconnected (but can rejoin).";
                        if (AbstractC0789l.f5560aJ) {
                            str3 = str3 + "\n This likely due to iOS removing sockets of background apps. Avoid minimising the game when hosting.";
                        }
                        AbstractC0789l.m651u().m670h(str3);
                        i2++;
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                    AbstractC0789l.m651u().m670h("Warning server socket got closed and could not be recreated");
                    m1205b();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void m1205b() {
        synchronized (this.f4858j) {
            this.f4854c = false;
            if (this.f4847d != null) {
                try {
                    this.f4847d.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f4847d = null;
            }
        }
    }
}
