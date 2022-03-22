package com.corrodinggames.rts.p009b.p010a;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p037h.AbstractC0732f;
import com.corrodinggames.rts.gameFramework.p037h.C0729c;
import com.corrodinggames.rts.gameFramework.p037h.C0730d;
import com.corrodinggames.rts.gameFramework.p037h.C0736j;

/* renamed from: com.corrodinggames.rts.b.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/b/a/g.class */
public class C0112g extends AbstractC0113h {
    /* renamed from: a */
    public C0736j m3893a(int i) {
        C0736j jVar = new C0736j();
        jVar.m923a((short) i, (short) 0);
        jVar.m925a(0, 0, 0);
        return jVar;
    }

    /* renamed from: a */
    public void m3894a() {
        AbstractC0789l.m670d("== Testing FastNodeQueue ==");
        m3892a(new C0729c());
        AbstractC0789l.m670d("== Testing FastNodeQueue2 ==");
        m3892a(new C0730d());
    }

    /* renamed from: a */
    public void m3892a(AbstractC0732f fVar) {
        C0736j a = m3893a(1);
        C0736j a2 = m3893a(2);
        C0736j a3 = m3893a(3);
        C0736j a4 = m3893a(4);
        AbstractC0789l.m670d("sequential");
        fVar.mo975b();
        fVar.mo976a(a);
        fVar.mo976a(a2);
        fVar.mo976a(a3);
        fVar.mo976a(a4);
        C0114i.m3888a(fVar.mo977a(), a);
        C0114i.m3888a(fVar.mo977a(), a2);
        C0114i.m3888a(fVar.mo977a(), a3);
        C0114i.m3888a(fVar.mo977a(), a4);
        AbstractC0789l.m670d("reverse sequence");
        fVar.mo975b();
        fVar.mo976a(a4);
        fVar.mo976a(a3);
        fVar.mo976a(a2);
        fVar.mo976a(a);
        C0114i.m3888a(fVar.mo977a(), a);
        C0114i.m3888a(fVar.mo977a(), a2);
        C0114i.m3888a(fVar.mo977a(), a3);
        C0114i.m3888a(fVar.mo977a(), a4);
        AbstractC0789l.m670d("sequential with noise");
        fVar.mo975b();
        fVar.mo976a(a);
        for (int i = 0; i < 1000; i++) {
            fVar.mo976a(m3893a(100 + i));
        }
        C0114i.m3888a(fVar.mo977a(), a);
        fVar.mo976a(a2);
        fVar.mo976a(a3);
        for (int i2 = 0; i2 < 1000; i2++) {
            fVar.mo976a(m3893a(100 + i2));
        }
        C0114i.m3888a(fVar.mo977a(), a2);
        fVar.mo976a(a4);
        C0114i.m3888a(fVar.mo977a(), a3);
        C0114i.m3888a(fVar.mo977a(), a4);
        AbstractC0789l.m670d("reverse sequence with noise");
        fVar.mo975b();
        fVar.mo976a(a4);
        fVar.mo976a(a3);
        for (int i3 = 0; i3 < 1000; i3++) {
            fVar.mo976a(m3893a(100 + i3));
        }
        fVar.mo976a(a2);
        for (int i4 = 0; i4 < 1000; i4++) {
            fVar.mo976a(m3893a(100 + i4));
        }
        fVar.mo976a(a);
        C0114i.m3888a(fVar.mo977a(), a);
        C0114i.m3888a(fVar.mo977a(), a2);
        C0114i.m3888a(fVar.mo977a(), a3);
        C0114i.m3888a(fVar.mo977a(), a4);
    }
}
