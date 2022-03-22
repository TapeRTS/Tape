package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a.class */
public class C0525a {

    /* renamed from: n */
    ArrayList f3546n = new ArrayList();

    /* renamed from: a */
    public C0568b f3533a = m2122a((byte) 1);

    /* renamed from: b */
    public C0568b f3534b = m2122a((byte) 2);

    /* renamed from: c */
    public C0568b f3535c = m2122a((byte) 3);

    /* renamed from: d */
    public C0568b f3536d = m2122a((byte) 4);

    /* renamed from: e */
    public C0568b f3537e = m2122a((byte) 10);

    /* renamed from: f */
    public C0568b f3538f = m2122a((byte) 11);

    /* renamed from: g */
    public C0568b f3539g = m2122a((byte) 13);

    /* renamed from: h */
    public C0568b f3540h = m2122a((byte) 21);

    /* renamed from: i */
    public C0568b f3541i = m2122a((byte) 35);

    /* renamed from: j */
    public C0568b f3542j = m2122a((byte) 40);

    /* renamed from: k */
    public C0568b f3543k = m2122a((byte) 45);

    /* renamed from: l */
    public C0568b f3544l = m2122a((byte) 52);

    /* renamed from: m */
    public C0568b f3545m = m2122a((byte) 60);

    public C0525a() {
        C0568b bVar = this.f3533a;
        bVar.m2034a(bVar);
        bVar.m2034a(m2122a((byte) 3));
        bVar.m2034a(m2122a((byte) 4));
        bVar.m2034a(m2122a((byte) 10));
        bVar.m2034a(m2122a((byte) 11));
        bVar.m2034a(m2122a((byte) 13));
        bVar.m2034a(m2122a((byte) 21));
        this.f3543k.m2034a(m2122a((byte) 52));
        C0568b bVar2 = this.f3545m;
        bVar2.m2034a(bVar2);
        bVar2.m2034a(m2122a((byte) 3));
        bVar2.m2034a(m2122a((byte) 4));
        bVar2.m2034a(m2122a((byte) 10));
        bVar2.m2034a(m2122a((byte) 11));
        bVar2.m2034a(m2122a((byte) 13));
        bVar2.m2034a(m2122a((byte) 21));
        C0568b a = m2122a((byte) 10);
        a.m2034a(m2122a((byte) 3));
        a.m2034a(m2122a((byte) 4));
        a.m2034a(m2122a((byte) 10));
        a.m2034a(m2122a((byte) 13));
        a.m2034a(m2122a((byte) 40));
        C0568b a2 = m2122a((byte) 11);
        a2.m2034a(m2122a((byte) 3));
        a2.m2034a(m2122a((byte) 10));
        a2.m2034a(m2122a((byte) 13));
        a2.m2034a(m2122a((byte) 40));
        C0568b a3 = m2122a((byte) 3);
        a3.m2034a(m2122a((byte) 3));
        a3.m2034a(m2122a((byte) 4));
        a3.m2034a(m2122a((byte) 10));
        a3.m2034a(m2122a((byte) 13));
        C0568b a4 = m2122a((byte) 4);
        a4.m2034a(m2122a((byte) 3));
        a4.m2034a(m2122a((byte) 4));
        a4.m2034a(m2122a((byte) 10));
        a4.m2034a(m2122a((byte) 13));
        C0568b a5 = m2122a((byte) 13);
        a5.m2034a(m2122a((byte) 3));
        a5.m2034a(m2122a((byte) 4));
        a5.m2034a(m2122a((byte) 10));
        a5.m2034a(m2122a((byte) 13));
        C0568b a6 = m2122a((byte) 21);
        a6.m2034a(m2122a((byte) 3));
        a6.m2034a(m2122a((byte) 4));
        a6.m2034a(m2122a((byte) 10));
        a6.m2034a(m2122a((byte) 13));
        C0568b bVar3 = this.f3541i;
        bVar3.m2034a(m2122a((byte) 10));
        bVar3.m2034a(m2122a((byte) 13));
    }

    /* renamed from: a */
    public C0568b m2122a(byte b) {
        Iterator it = this.f3546n.iterator();
        while (it.hasNext()) {
            C0568b bVar = (C0568b) it.next();
            if (bVar.f3758a == b) {
                return bVar;
            }
        }
        C0568b bVar2 = new C0568b();
        bVar2.f3758a = b;
        this.f3546n.add(bVar2);
        return bVar2;
    }
}
