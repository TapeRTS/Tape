package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a.class */
public class C0626a {

    /* renamed from: n */
    ArrayList f3999n = new ArrayList();

    /* renamed from: a */
    public C0669b f4000a = m3008a((byte) 1);

    /* renamed from: b */
    public C0669b f4001b = m3008a((byte) 2);

    /* renamed from: c */
    public C0669b f4002c = m3008a((byte) 3);

    /* renamed from: d */
    public C0669b f4003d = m3008a((byte) 4);

    /* renamed from: e */
    public C0669b f4004e = m3008a((byte) 10);

    /* renamed from: f */
    public C0669b f4005f = m3008a((byte) 11);

    /* renamed from: g */
    public C0669b f4006g = m3008a((byte) 13);

    /* renamed from: h */
    public C0669b f4007h = m3008a((byte) 21);

    /* renamed from: i */
    public C0669b f4008i = m3008a((byte) 35);

    /* renamed from: j */
    public C0669b f4009j = m3008a((byte) 40);

    /* renamed from: k */
    public C0669b f4010k = m3008a((byte) 45);

    /* renamed from: l */
    public C0669b f4011l = m3008a((byte) 52);

    /* renamed from: m */
    public C0669b f4012m = m3008a((byte) 60);

    public C0626a() {
        C0669b c0669b = this.f4000a;
        c0669b.m2875a(c0669b);
        c0669b.m2875a(m3008a((byte) 3));
        c0669b.m2875a(m3008a((byte) 4));
        c0669b.m2875a(m3008a((byte) 10));
        c0669b.m2875a(m3008a((byte) 11));
        c0669b.m2875a(m3008a((byte) 13));
        c0669b.m2875a(m3008a((byte) 21));
        this.f4010k.m2875a(m3008a((byte) 52));
        C0669b c0669b2 = this.f4012m;
        c0669b2.m2875a(c0669b2);
        c0669b2.m2875a(m3008a((byte) 3));
        c0669b2.m2875a(m3008a((byte) 4));
        c0669b2.m2875a(m3008a((byte) 10));
        c0669b2.m2875a(m3008a((byte) 11));
        c0669b2.m2875a(m3008a((byte) 13));
        c0669b2.m2875a(m3008a((byte) 21));
        C0669b m3008a = m3008a((byte) 10);
        m3008a.m2875a(m3008a((byte) 3));
        m3008a.m2875a(m3008a((byte) 4));
        m3008a.m2875a(m3008a((byte) 10));
        m3008a.m2875a(m3008a((byte) 13));
        m3008a.m2875a(m3008a((byte) 40));
        C0669b m3008a2 = m3008a((byte) 11);
        m3008a2.m2875a(m3008a((byte) 3));
        m3008a2.m2875a(m3008a((byte) 10));
        m3008a2.m2875a(m3008a((byte) 13));
        m3008a2.m2875a(m3008a((byte) 40));
        C0669b m3008a3 = m3008a((byte) 3);
        m3008a3.m2875a(m3008a((byte) 3));
        m3008a3.m2875a(m3008a((byte) 4));
        m3008a3.m2875a(m3008a((byte) 10));
        m3008a3.m2875a(m3008a((byte) 13));
        C0669b m3008a4 = m3008a((byte) 4);
        m3008a4.m2875a(m3008a((byte) 3));
        m3008a4.m2875a(m3008a((byte) 4));
        m3008a4.m2875a(m3008a((byte) 10));
        m3008a4.m2875a(m3008a((byte) 13));
        C0669b m3008a5 = m3008a((byte) 13);
        m3008a5.m2875a(m3008a((byte) 3));
        m3008a5.m2875a(m3008a((byte) 4));
        m3008a5.m2875a(m3008a((byte) 10));
        m3008a5.m2875a(m3008a((byte) 13));
        C0669b m3008a6 = m3008a((byte) 21);
        m3008a6.m2875a(m3008a((byte) 3));
        m3008a6.m2875a(m3008a((byte) 4));
        m3008a6.m2875a(m3008a((byte) 10));
        m3008a6.m2875a(m3008a((byte) 13));
        C0669b c0669b3 = this.f4008i;
        c0669b3.m2875a(m3008a((byte) 10));
        c0669b3.m2875a(m3008a((byte) 13));
    }

    /* renamed from: a */
    public C0669b m3008a(byte b) {
        Iterator it = this.f3999n.iterator();
        while (it.hasNext()) {
            C0669b c0669b = (C0669b) it.next();
            if (c0669b.f4229a == b) {
                return c0669b;
            }
        }
        C0669b c0669b2 = new C0669b();
        c0669b2.f4229a = b;
        this.f3999n.add(c0669b2);
        return c0669b2;
    }
}
