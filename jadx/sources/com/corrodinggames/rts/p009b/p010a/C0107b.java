package com.corrodinggames.rts.p009b.p010a;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.b.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/b/a/b.class */
public class C0107b extends AbstractC0113h {
    /* renamed from: a */
    public void m4229a() {
        m4228b();
    }

    /* renamed from: b */
    public void m4228b() {
        AbstractC0789l.m683d("networkSocks");
        AbstractC0789l u = AbstractC0789l.m651u();
        for (int i = 0; i < 10000; i++) {
            u.f5486bF.m1292b(false);
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            u.f5486bF.m1295b("test");
        }
        AbstractC0789l.m683d("done");
        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
