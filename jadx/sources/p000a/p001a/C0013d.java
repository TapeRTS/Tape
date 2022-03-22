package p000a.p001a;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000a.p001a.p002a.AbstractC0008h;
import p000a.p001a.p002a.C0001a;
import p000a.p001a.p002a.C0007g;

/* renamed from: a.a.d */
/* loaded from: game-lib.jar:a/a/d.class */
class C0013d extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0010b f40a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013d(C0010b bVar) {
        super("ReliableServerSocket");
        this.f40a = bVar;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2;
        DatagramSocket datagramSocket3;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        C0014e eVar;
        HashMap hashMap5;
        HashMap hashMap6;
        HashMap hashMap7;
        HashMap hashMap8;
        DatagramSocket datagramSocket4;
        HashMap hashMap9;
        HashMap hashMap10;
        HashMap hashMap11;
        HashMap hashMap12;
        AbstractC0012c cVar;
        byte[] bArr = new byte[65535];
        while (true) {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            try {
                try {
                    datagramSocket3 = this.f40a.f29d;
                    datagramSocket3.receive(datagramPacket);
                    SocketAddress socketAddress = datagramPacket.getSocketAddress();
                    hashMap = this.f40a.f34i;
                    synchronized (hashMap) {
                        hashMap2 = this.f40a.f36k;
                        AbstractC0000a aVar = (AbstractC0000a) hashMap2.get(socketAddress);
                        if (aVar != null) {
                            aVar.m4421a(datagramPacket.getData(), datagramPacket.getLength());
                        } else {
                            hashMap3 = this.f40a.f34i;
                            synchronized (hashMap3) {
                                hashMap4 = this.f40a.f34i;
                                eVar = (C0014e) hashMap4.get(socketAddress);
                            }
                            if (eVar != null || (cVar = this.f40a.f28a) == null || cVar.mo1163a(socketAddress)) {
                                AbstractC0008h b = AbstractC0008h.m4403b(datagramPacket.getData(), 0, datagramPacket.getLength());
                                if (!this.f40a.isClosed() && eVar == null) {
                                    if (b instanceof C0007g) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        hashMap7 = this.f40a.f35j;
                                        if (hashMap7.size() > 0) {
                                            int i = 10000;
                                            hashMap10 = this.f40a.f35j;
                                            if (hashMap10.size() > 20) {
                                                i = 5000;
                                            }
                                            hashMap11 = this.f40a.f35j;
                                            if (hashMap11.size() > 200) {
                                                i = 3000;
                                            }
                                            hashMap12 = this.f40a.f35j;
                                            Iterator it = hashMap12.entrySet().iterator();
                                            while (it.hasNext()) {
                                                if (((C0016g) ((Map.Entry) it.next()).getValue()).f45a + i < currentTimeMillis) {
                                                    it.remove();
                                                }
                                            }
                                        }
                                        hashMap8 = this.f40a.f35j;
                                        C0016g gVar = (C0016g) hashMap8.get(socketAddress);
                                        if (gVar != null) {
                                            gVar.f46b.m4372a((C0007g) b);
                                        } else {
                                            C0016g gVar2 = new C0016g();
                                            gVar2.f45a = currentTimeMillis;
                                            C0010b bVar = this.f40a;
                                            datagramSocket4 = this.f40a.f29d;
                                            gVar2.f46b = new C0014e(bVar, datagramSocket4, socketAddress);
                                            gVar2.f46b.m4372a((C0007g) b);
                                            hashMap9 = this.f40a.f35j;
                                            hashMap9.put(socketAddress, gVar2);
                                        }
                                    }
                                    if (b instanceof C0001a) {
                                        hashMap5 = this.f40a.f35j;
                                        C0016g gVar3 = (C0016g) hashMap5.get(socketAddress);
                                        if (gVar3 != null) {
                                            C0014e eVar2 = gVar3.f46b;
                                            if (!eVar2.m4360b(b)) {
                                                this.f40a.m4385a("lightweight ack failed ack:" + b.m4400n());
                                            } else {
                                                this.f40a.m4382a(socketAddress, eVar2);
                                                eVar = eVar2;
                                                hashMap6 = this.f40a.f35j;
                                                hashMap6.remove(socketAddress);
                                            }
                                        }
                                    }
                                }
                                if (eVar != null) {
                                    eVar.m4377a(b);
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    C0010b bVar2 = this.f40a;
                    StringBuilder append = new StringBuilder().append("IOException receiving packet:").append(e.getMessage()).append(" isConnected:");
                    datagramSocket = this.f40a.f29d;
                    bVar2.m4385a(append.append(datagramSocket.isConnected()).toString());
                    datagramSocket2 = this.f40a.f29d;
                    if (!datagramSocket2.isConnected()) {
                        this.f40a.close();
                    }
                    throw new IOException(e);
                    break;
                }
            } catch (IOException e2) {
                if (!this.f40a.isClosed()) {
                    this.f40a.m4385a("IOException client " + ((Object) null) + " - " + e2.getMessage());
                } else {
                    return;
                }
            } catch (IllegalArgumentException e3) {
                if (!this.f40a.isClosed()) {
                    this.f40a.m4385a("IllegalArgumentException " + ((Object) null) + " - " + e3.getMessage());
                } else {
                    return;
                }
            }
        }
    }
}
