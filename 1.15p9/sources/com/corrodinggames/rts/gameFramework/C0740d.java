package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p042j.C0906k;

/* renamed from: com.corrodinggames.rts.gameFramework.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d.class */
public class C0740d {

    /* renamed from: a */
    public C0906k f4633a;

    /* renamed from: b */
    public long f4634b;

    /* renamed from: c */
    public float f4635c;

    /* renamed from: d */
    public float f4636d;

    /* renamed from: e */
    public float f4637e;

    /* renamed from: f */
    public float f4638f;

    /* renamed from: g */
    public int f4639g;

    /* renamed from: h */
    public EnumC0246ao f4640h;

    /* renamed from: a */
    public void m2581a(C0859ar c0859ar) {
        c0859ar.m1571a(this.f4634b);
        c0859ar.mo1482a(this.f4635c);
        c0859ar.mo1482a(this.f4636d);
        c0859ar.mo1482a(this.f4637e);
        c0859ar.mo1482a(this.f4638f);
        c0859ar.mo1481a(this.f4639g);
        c0859ar.m1558a(this.f4640h);
        c0859ar.mo1476a(this.f4633a != null);
        if (this.f4633a != null) {
            this.f4633a.m1323a(c0859ar);
        }
    }

    /* renamed from: a */
    public void m2580a(C0876k c0876k) {
        this.f4634b = c0876k.m1445i();
        this.f4635c = c0876k.m1447g();
        this.f4636d = c0876k.m1447g();
        this.f4637e = c0876k.m1447g();
        this.f4638f = c0876k.m1447g();
        this.f4639g = c0876k.m1448f();
        this.f4640h = (EnumC0246ao) c0876k.m1455b(EnumC0246ao.class);
        if (c0876k.m1449e()) {
            this.f4633a = new C0906k(null, false);
            this.f4633a.m1322a(c0876k);
        }
    }
}
