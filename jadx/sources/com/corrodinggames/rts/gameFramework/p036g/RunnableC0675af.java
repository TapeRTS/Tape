package com.corrodinggames.rts.gameFramework.p036g;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.corrodinggames.rts.gameFramework.g.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/af.class */
final class RunnableC0675af implements Runnable {

    /* renamed from: a */
    boolean f4804a;

    /* renamed from: b */
    DatagramSocket f4805b;

    /* renamed from: c */
    Timer f4806c;

    /* renamed from: d */
    final /* synthetic */ Hcat_Multiplaye f4807d;

    public void run() {
        try {
            this.f4807d.m1284c("starting socket for broadcast..");
            this.f4805b = new DatagramSocket((SocketAddress) null);
            this.f4805b.setReuseAddress(true);
            this.f4805b.bind(new InetSocketAddress(this.f4807d.f4729r));
            this.f4807d.m1284c("reading..");
            byte[] bArr = new byte[1500];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            C06761 r0 = new C06761();
            this.f4806c = new Timer();
            this.f4806c.scheduleAtFixedRate(r0, 20L, 5000L);
            while (this.f4804a) {
                this.f4805b.receive(datagramPacket);
                String str = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
                this.f4807d.m1284c("accepted udp socket..");
                C0707k kVar = new C0707k(str);
                if (!kVar.m1071k().equals("com.corrodinggames.rts")) {
                    this.f4807d.m1284c("ignoring udp packet: MAGIC_GAME_ID doesn't match");
                } else {
                    int f = kVar.m1076f();
                    kVar.m1076f();
                    String k = kVar.m1071k();
                    if (k.equals("ping")) {
                        this.f4807d.m1284c("got ping");
                        if (this.f4807d.f4664A) {
                            C0690ap apVar = new C0690ap();
                            apVar.m1174c("com.corrodinggames.rts");
                            apVar.mo1109a(this.f4807d.f4782d);
                            apVar.mo1109a(0);
                            apVar.m1174c("pong");
                            apVar.mo1109a(this.f4807d.f4653l);
                            String c = apVar.m1176c();
                            this.f4805b.send(new DatagramPacket(c.getBytes(), c.length(), datagramPacket.getAddress(), this.f4807d.f4729r));
                        } else {
                            this.f4807d.m1284c("not server");
                        }
                    } else if (!k.equals("pong")) {
                        this.f4807d.m1284c("got pong");
                        C0703g gVar = new C0703g();
                        gVar.f4968a = true;
                        gVar.f4974g = kVar.m1076f();
                        gVar.f4970c = datagramPacket.getAddress().toString();
                        gVar.f4976j = "" + f;
                        this.f4807d.m1339a(gVar);
                    } else {
                        this.f4807d.m1284c("ignoring udp packet: unknown mode:" + k);
                    }
                }
            }
        } catch (SocketException e) {
            if (this.f4804a) {
                throw new RuntimeException(e);
            }
            e.printStackTrace();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.g.af$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/af$1.class */
    class C06761 extends TimerTask {
        C06761() {
        }

        public void run() {
            if (!RunnableC0675af.this.f4807d.f4664A) {
                RunnableC0675af.this.m1218a();
            }
        }
    }

    /* renamed from: a */
    public void m1218a() {
        this.f4807d.m1284c("sending ping");
        if (this.f4805b == null) {
            this.f4807d.m1284c("failed to send a broadcast ping: datagramSocket is null");
            return;
        }
        InetAddress ac = this.f4807d.m1323ac();
        if (ac == null) {
            this.f4807d.m1284c("failed to send a broadcast ping: could not get a broadcast address");
            return;
        }
        try {
            C0690ap apVar = new C0690ap();
            apVar.m1174c("com.corrodinggames.rts");
            apVar.mo1109a(this.f4807d.f4782d);
            apVar.mo1109a(0);
            apVar.m1174c("ping");
            String c = apVar.m1176c();
            this.f4807d.m1284c("sending ping on :" + ac.toString());
            this.f4805b.send(new DatagramPacket(c.getBytes(), c.length(), ac, this.f4807d.f4729r));
        } catch (IOException e) {
            e.printStackTrace();
            this.f4807d.m1284c("failed to send a broadcast ping, IOException");
        }
    }

    /* renamed from: b */
    public void m1217b() {
        this.f4804a = false;
        if (this.f4805b != null) {
            this.f4805b.close();
        }
        if (this.f4806c != null) {
            this.f4806c.cancel();
        }
    }
}
