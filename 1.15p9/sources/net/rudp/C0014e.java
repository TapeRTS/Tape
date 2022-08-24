package net.rudp;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.ArrayList;
import net.rudp.impl.Segment;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.e */
/* loaded from: game-lib.jar:a/a/e.class */
public class C0014e extends C0017h {

    /* renamed from: a */
    boolean f41a;

    /* renamed from: i */
    private ArrayList f42i;

    /* renamed from: b */
    final /* synthetic */ C0010b f43b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014e(C0010b c0010b, DatagramSocket datagramSocket, SocketAddress socketAddress) {
        super(datagramSocket);
        this.f43b = c0010b;
        this.f48d = socketAddress;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.rudp.C0017h
    /* renamed from: a */
    public void m5283a(DatagramSocket datagramSocket, C0028r c0028r) {
        this.f42i = new ArrayList();
        this.f47c = datagramSocket;
        this.f65g = c0028r;
    }

    @Override // net.rudp.C0017h
    /* renamed from: a */
    protected Segment m5286a() {
        Segment segment;
        synchronized (this.f42i) {
            while (this.f42i.isEmpty()) {
                try {
                    this.f42i.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            segment = (Segment) this.f42i.remove(0);
        }
        return segment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5285a(Segment segment) {
        synchronized (this.f42i) {
            if (!this.f41a) {
                this.f41a = true;
                super.m5265a(this.f47c, this.f65g);
            }
            this.f42i.add(segment);
            this.f42i.notify();
        }
    }

    @Override // net.rudp.C0017h
    /* renamed from: b */
    protected void m5282b() {
        synchronized (this.f42i) {
            this.f42i.clear();
            this.f42i.add(null);
            this.f42i.notify();
        }
    }

    @Override // net.rudp.C0017h
    /* renamed from: a */
    protected void m5284a(String str) {
        System.out.println(getPort() + ": " + str);
    }
}
