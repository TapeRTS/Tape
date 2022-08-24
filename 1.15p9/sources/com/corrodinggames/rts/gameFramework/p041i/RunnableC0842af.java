package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/af.class */
public final class RunnableC0842af implements Runnable {

    /* renamed from: a */
    boolean f5641a;

    /* renamed from: b */
    DatagramSocket f5642b;

    /* renamed from: c */
    Timer f5643c;

    /* renamed from: d */
    final /* synthetic */ C0831ad f5644d;

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f5644d.m1663d("starting socket for broadcast..");
            this.f5642b = new DatagramSocket((SocketAddress) null);
            this.f5642b.setReuseAddress(true);
            this.f5642b.bind(new InetSocketAddress(this.f5644d.f5559t));
            this.f5644d.m1663d("reading..");
            byte[] bArr = new byte[1500];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            TimerTask timerTask = new TimerTask() { // from class: com.corrodinggames.rts.gameFramework.i.af.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (!RunnableC0842af.this.f5644d.f5485C) {
                        RunnableC0842af.this.m1598a();
                    }
                }
            };
            this.f5643c = new Timer();
            this.f5643c.scheduleAtFixedRate(timerTask, 20L, 5000L);
            while (this.f5641a) {
                this.f5642b.receive(datagramPacket);
                String str = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
                this.f5644d.m1663d("accepted udp socket..");
                C0876k c0876k = new C0876k(str);
                if (!c0876k.m1442l().equals("com.corrodinggames.rts")) {
                    this.f5644d.m1663d("ignoring udp packet: MAGIC_GAME_ID doesn't match");
                } else {
                    int m1448f = c0876k.m1448f();
                    c0876k.m1448f();
                    String m1442l = c0876k.m1442l();
                    if (m1442l.equals("ping")) {
                        this.f5644d.m1663d("got ping");
                        if (this.f5644d.f5485C) {
                            C0859ar c0859ar = new C0859ar();
                            c0859ar.m1547c("com.corrodinggames.rts");
                            c0859ar.mo1481a(this.f5644d.f5618e);
                            c0859ar.mo1481a(0);
                            c0859ar.m1547c("pong");
                            c0859ar.mo1481a(this.f5644d.f5474m);
                            String m1549c = c0859ar.m1549c();
                            this.f5642b.send(new DatagramPacket(m1549c.getBytes(), m1549c.length(), datagramPacket.getAddress(), this.f5644d.f5559t));
                        } else {
                            this.f5644d.m1663d("not server");
                        }
                    } else if (!m1442l.equals("pong")) {
                        this.f5644d.m1663d("got pong");
                        C0872g c0872g = new C0872g();
                        c0872g.f5817a = true;
                        c0872g.f5823g = c0876k.m1448f();
                        c0872g.f5819c = datagramPacket.getAddress().toString();
                        c0872g.f5825j = VariableScope.nullOrMissingString + m1448f;
                        this.f5644d.m1741a(c0872g);
                    } else {
                        this.f5644d.m1663d("ignoring udp packet: unknown mode:" + m1442l);
                    }
                }
            }
        } catch (SocketException e) {
            if (this.f5641a) {
                throw new RuntimeException(e);
            }
            e.printStackTrace();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public void m1598a() {
        this.f5644d.m1663d("sending ping");
        if (this.f5642b == null) {
            this.f5644d.m1663d("failed to send a broadcast ping: datagramSocket is null");
            return;
        }
        InetAddress m1711al = this.f5644d.m1711al();
        if (m1711al == null) {
            this.f5644d.m1663d("failed to send a broadcast ping: could not get a broadcast address");
            return;
        }
        try {
            C0859ar c0859ar = new C0859ar();
            c0859ar.m1547c("com.corrodinggames.rts");
            c0859ar.mo1481a(this.f5644d.f5618e);
            c0859ar.mo1481a(0);
            c0859ar.m1547c("ping");
            String m1549c = c0859ar.m1549c();
            this.f5644d.m1663d("sending ping on :" + m1711al.toString());
            this.f5642b.send(new DatagramPacket(m1549c.getBytes(), m1549c.length(), m1711al, this.f5644d.f5559t));
        } catch (IOException e) {
            e.printStackTrace();
            this.f5644d.m1663d("failed to send a broadcast ping, IOException");
        }
    }

    /* renamed from: b */
    public void m1597b() {
        this.f5641a = false;
        if (this.f5642b != null) {
            this.f5642b.close();
        }
        if (this.f5643c != null) {
            this.f5643c.cancel();
        }
    }
}
