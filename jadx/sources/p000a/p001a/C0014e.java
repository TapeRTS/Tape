package p000a.p001a;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.ArrayList;
import p000a.p001a.p002a.AbstractC0008h;

/* renamed from: a.a.e */
/* loaded from: game-lib.jar:a/a/e.class */
class C0014e extends C0017h {

    /* renamed from: a */
    boolean f41a;

    /* renamed from: i */
    private ArrayList f42i;

    /* renamed from: b */
    final /* synthetic */ C0010b f43b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014e(C0010b bVar, DatagramSocket datagramSocket, SocketAddress socketAddress) {
        super(datagramSocket);
        this.f43b = bVar;
        this.f48d = socketAddress;
    }

    @Override // p000a.p001a.C0017h
    /* renamed from: a */
    protected void mo4365a(DatagramSocket datagramSocket, C0028r rVar) {
        this.f42i = new ArrayList();
        this.f47c = datagramSocket;
        this.f65g = rVar;
    }

    @Override // p000a.p001a.C0017h
    /* renamed from: a */
    protected AbstractC0008h mo4376a() {
        AbstractC0008h hVar;
        synchronized (this.f42i) {
            while (this.f42i.isEmpty()) {
                try {
                    this.f42i.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            hVar = (AbstractC0008h) this.f42i.remove(0);
        }
        return hVar;
    }

    /* renamed from: a */
    protected void m4377a(AbstractC0008h hVar) {
        synchronized (this.f42i) {
            if (!this.f41a) {
                this.f41a = true;
                super.mo4365a(this.f47c, this.f65g);
            }
            this.f42i.add(hVar);
            this.f42i.notify();
        }
    }

    @Override // p000a.p001a.C0017h
    /* renamed from: b */
    protected void mo4362b() {
        synchronized (this.f42i) {
            this.f42i.clear();
            this.f42i.add(null);
            this.f42i.notify();
        }
    }

    @Override // p000a.p001a.C0017h
    /* renamed from: a */
    protected void mo4366a(String str) {
        System.out.println(getPort() + ": " + str);
    }
}
