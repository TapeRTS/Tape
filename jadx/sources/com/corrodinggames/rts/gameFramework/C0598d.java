package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p037h.C0733g;

/* renamed from: com.corrodinggames.rts.gameFramework.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d.class */
public class C0598d {

    /* renamed from: a */
    public C0733g f4097a;

    /* renamed from: b */
    public long f4098b;

    /* renamed from: c */
    public float f4099c;

    /* renamed from: d */
    public float f4100d;

    /* renamed from: e */
    public float f4101e;

    /* renamed from: f */
    public float f4102f;

    /* renamed from: g */
    public int f4103g;

    /* renamed from: h */
    public EnumC0212ah f4104h;

    /* renamed from: a */
    public void m1868a(C0690ap apVar) {
        apVar.mo1148a(this.f4098b);
        apVar.mo1096a(this.f4099c);
        apVar.mo1096a(this.f4100d);
        apVar.mo1096a(this.f4101e);
        apVar.mo1096a(this.f4102f);
        apVar.mo1095a(this.f4103g);
        apVar.mo1138a(this.f4104h);
        apVar.mo1090a(this.f4097a != null);
        if (this.f4097a != null) {
            this.f4097a.m972a(apVar);
        }
    }

    /* renamed from: a */
    public void m1867a(C0707k kVar) {
        this.f4098b = kVar.m1059i();
        this.f4099c = kVar.m1061g();
        this.f4100d = kVar.m1061g();
        this.f4101e = kVar.m1061g();
        this.f4102f = kVar.m1061g();
        this.f4103g = kVar.m1062f();
        this.f4104h = (EnumC0212ah) kVar.m1069b(EnumC0212ah.class);
        if (kVar.m1063e()) {
            this.f4097a = new C0733g(null, false);
            this.f4097a.m971a(kVar);
        }
    }
}
