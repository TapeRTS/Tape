package net.rudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketAddress;
import java.util.Iterator;
import java.util.Map;
import net.rudp.impl.C0001a;
import net.rudp.impl.C0007g;
import net.rudp.impl.Segment;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.d */
/* loaded from: game-lib.jar:a/a/d.class */
public class C0013d extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0010b f40a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013d(C0010b c0010b) {
        super("ReliableServerSocket");
        this.f40a = c0010b;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C0014e c0014e;
        C0016g c0016g;
        AbstractC0012c abstractC0012c;
        byte[] bArr = new byte[65535];
        while (true) {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            try {
                try {
                    C0010b.m5300a(this.f40a).receive(datagramPacket);
                    SocketAddress socketAddress = datagramPacket.getSocketAddress();
                    synchronized (C0010b.m5291b(this.f40a)) {
                        AbstractC0000a abstractC0000a = (AbstractC0000a) C0010b.m5290c(this.f40a).get(socketAddress);
                        if (abstractC0000a != null) {
                            abstractC0000a.m5345a(datagramPacket.getData(), datagramPacket.getLength());
                        } else {
                            synchronized (C0010b.m5291b(this.f40a)) {
                                c0014e = (C0014e) C0010b.m5291b(this.f40a).get(socketAddress);
                            }
                            if (c0014e != null || (abstractC0012c = this.f40a.f28a) == null || abstractC0012c.m5287a(socketAddress)) {
                                Segment m5313b = Segment.m5313b(datagramPacket.getData(), 0, datagramPacket.getLength());
                                if (!this.f40a.isClosed() && c0014e == null) {
                                    if (m5313b instanceof C0007g) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (C0010b.m5289d(this.f40a).size() > 0) {
                                            int i = 10000;
                                            if (C0010b.m5289d(this.f40a).size() > 20) {
                                                i = 5000;
                                            }
                                            if (C0010b.m5289d(this.f40a).size() > 200) {
                                                i = 3000;
                                            }
                                            Iterator it = C0010b.m5289d(this.f40a).entrySet().iterator();
                                            while (it.hasNext()) {
                                                if (((C0016g) ((Map.Entry) it.next()).getValue()).f45a + i < currentTimeMillis) {
                                                    it.remove();
                                                }
                                            }
                                        }
                                        C0016g c0016g2 = (C0016g) C0010b.m5289d(this.f40a).get(socketAddress);
                                        if (c0016g2 != null) {
                                            c0016g2.f46b.m5272a((C0007g) m5313b);
                                        } else {
                                            C0016g c0016g3 = new C0016g();
                                            c0016g3.f45a = currentTimeMillis;
                                            c0016g3.f46b = new C0014e(this.f40a, C0010b.m5300a(this.f40a), socketAddress);
                                            c0016g3.f46b.m5272a((C0007g) m5313b);
                                            C0010b.m5289d(this.f40a).put(socketAddress, c0016g3);
                                        }
                                    }
                                    if ((m5313b instanceof C0001a) && (c0016g = (C0016g) C0010b.m5289d(this.f40a).get(socketAddress)) != null) {
                                        C0014e c0014e2 = c0016g.f46b;
                                        if (!c0014e2.m5260b(m5313b)) {
                                            C0010b.m5299a(this.f40a, "lightweight ack failed ack:" + m5313b.m5310n());
                                        } else {
                                            C0010b.m5297a(this.f40a, socketAddress, c0014e2);
                                            c0014e = c0014e2;
                                            C0010b.m5289d(this.f40a).remove(socketAddress);
                                        }
                                    }
                                }
                                if (c0014e != null) {
                                    c0014e.m5285a(m5313b);
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    C0010b.m5299a(this.f40a, "IOException receiving packet:" + e.getMessage() + " isConnected:" + C0010b.m5300a(this.f40a).isConnected());
                    if (!C0010b.m5300a(this.f40a).isConnected()) {
                        this.f40a.close();
                    }
                    throw new IOException(e);
                    break;
                }
            } catch (IOException e2) {
                if (!this.f40a.isClosed()) {
                    C0010b.m5299a(this.f40a, "IOException client " + ((Object) null) + " - " + e2.getMessage());
                } else {
                    return;
                }
            } catch (IllegalArgumentException e3) {
                if (!this.f40a.isClosed()) {
                    C0010b.m5299a(this.f40a, "IllegalArgumentException " + ((Object) null) + " - " + e3.getMessage());
                } else {
                    return;
                }
            }
        }
    }
}
