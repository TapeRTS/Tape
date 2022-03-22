package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0849w;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p000a.p001a.C0017h;

/* renamed from: com.corrodinggames.rts.gameFramework.g.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/e.class */
final class RunnableC0701e implements Runnable {

    /* renamed from: b */
    OutputStream f4962b;

    /* renamed from: c */
    BufferedOutputStream f4963c;

    /* renamed from: d */
    DataOutputStream f4964d;

    /* renamed from: f */
    final /* synthetic */ C0698c f4966f;

    /* renamed from: a */
    Boolean f4961a = true;

    /* renamed from: e */
    C0849w f4965e = new C0849w();

    /* renamed from: a */
    public synchronized void m1098a(C0692ar arVar) {
        if (!this.f4966f.f4916a) {
            this.f4966f.f4921f.add(arVar);
            notifyAll();
        }
    }

    /* renamed from: a */
    public synchronized void m1099a() {
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void m1097b() {
        try {
            if (this.f4966f.f4921f.isEmpty() && !this.f4966f.f4916a && !this.f4966f.f4917b) {
                wait(10000L);
            }
        } catch (InterruptedException e) {
        }
    }

    RunnableC0701e(C0698c cVar) {
        this.f4966f = cVar;
        this.f4962b = cVar.f4919d.getOutputStream();
        this.f4963c = new BufferedOutputStream(this.f4962b);
        this.f4964d = new DataOutputStream(this.f4963c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
        r6.f4966f.f4916a = true;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        C0849w wVar;
        AbstractC0789l.m702ag();
        Thread.currentThread().setName("SendWorker-" + this.f4966f.m1104f());
        while (true) {
            try {
                if (!this.f4961a.booleanValue() || this.f4966f.f4916a) {
                    break;
                }
                while (!this.f4966f.f4921f.isEmpty() && !this.f4966f.f4916a) {
                    C0692ar arVar = (C0692ar) this.f4966f.f4921f.remove();
                    if (arVar instanceof C0696av) {
                        C0696av avVar = (C0696av) arVar;
                        if (this.f4966f.f4927l != avVar.f4907f || !this.f4966f.f4931p) {
                            C0690ap apVar = new C0690ap();
                            apVar.mo1095a(avVar.f4908g);
                            apVar.mo1095a(avVar.f4907f.f4891b);
                            apVar.mo1137a(avVar.f4907f.f4892c);
                            arVar = apVar.mo1135b(175);
                        } else {
                            C0690ap apVar2 = new C0690ap();
                            apVar2.mo1095a(avVar.f4908g);
                            arVar = apVar2.mo1135b(176);
                        }
                        this.f4966f.f4927l = avVar.f4907f;
                    } else if (this.f4966f.f4930o) {
                        this.f4966f.f4927l = arVar;
                    }
                    if (this.f4966f.f4919d instanceof C0704h) {
                        ((C0704h) this.f4966f.f4919d).m1082a(arVar);
                    } else if (this.f4966f.f4919d instanceof C0017h) {
                        boolean z = false;
                        if (arVar.f4892c.length > 500) {
                            wVar = new C0849w(8 + arVar.f4892c.length);
                            z = true;
                        } else {
                            wVar = this.f4965e;
                            wVar.m442a();
                        }
                        boolean z2 = arVar.f4894e;
                        DataOutputStream dataOutputStream = new DataOutputStream(wVar);
                        dataOutputStream.writeInt(arVar.f4892c.length);
                        dataOutputStream.writeInt(arVar.f4891b);
                        dataOutputStream.write(arVar.f4892c);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        ((C0017h) this.f4966f.f4919d).m4363a(wVar.f5812a, 0, wVar.m439b(), z2);
                        if (z) {
                            wVar.close();
                        }
                    } else {
                        this.f4964d.writeInt(arVar.f4892c.length);
                        this.f4964d.writeInt(arVar.f4891b);
                        this.f4964d.write(arVar.f4892c);
                        this.f4964d.flush();
                    }
                    if (arVar.f4893d != -1) {
                        try {
                            Thread.sleep(arVar.f4893d);
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (this.f4966f.f4917b) {
                    break;
                }
                m1097b();
            } catch (IOException e2) {
                e2.printStackTrace();
                AbstractC0789l.m681b("network:SendWorker", e2.getMessage());
            }
        }
        this.f4966f.m1110b(false, true);
    }
}
