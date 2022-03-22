package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.io.BufferedReader;
import java.net.UnknownHostException;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.g.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/u.class */
class RunnableC0719u implements Runnable {

    /* renamed from: a */
    int f5036a;

    /* renamed from: b */
    List f5037b;

    /* renamed from: c */
    AbstractC0717s f5038c;

    /* renamed from: d */
    String f5039d;

    /* renamed from: e */
    boolean f5040e;

    public RunnableC0719u(List list, AbstractC0717s sVar, String str, boolean z, int i) {
        this.f5036a = i;
        this.f5037b = list;
        this.f5038c = sVar;
        this.f5039d = str;
        this.f5040e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0789l u = AbstractC0789l.m638u();
        try {
            AbstractC0789l.m681b("LoadFromMasterServer", this.f5036a + ": Started doSingleRequest");
            BufferedReader bufferedReader = C0710n.m1033a(this.f5037b, this.f5039d, this.f5040e).f5033a;
            AbstractC0789l.m681b("LoadFromMasterServer", this.f5036a + ": Ended doSingleRequest");
            this.f5038c.mo1019a(bufferedReader, this.f5036a, this.f5039d);
        } catch (Exception e) {
            e.printStackTrace();
            String a = C0654f.m1492a(e, true);
            if (e instanceof UnknownHostException) {
                a = "DNS lookup failed, check your internet connection";
            }
            if (a != null && a.contains("Cleartext HTTP traffic")) {
                a = a + " ( Broken apk file? - " + u.mo659h() + ")";
            }
            this.f5038c.f5030d = "#" + this.f5036a + ": " + a;
            AbstractC0789l.m670d("Error getting game list from server #" + this.f5036a);
            if (u.mo647l()) {
                u.m718a("Error getting game list from server #" + this.f5036a, 1);
            }
        }
        synchronized (this.f5038c) {
            this.f5038c.f5032f--;
            if (this.f5038c.f5032f == 0) {
                this.f5038c.mo1020a();
            }
        }
    }
}
