package com.corrodinggames.rts.game.units.p023d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.gameFramework.AbstractC0585bi;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;

/* renamed from: com.corrodinggames.rts.game.units.d.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/i.class */
public class C0414i extends AbstractC0585bi {

    /* renamed from: a */
    public int f3024a;

    /* renamed from: b */
    public float f3025b;

    /* renamed from: d */
    public boolean f3027d;

    /* renamed from: e */
    public AbstractC0268al f3028e;

    /* renamed from: f */
    public PointF f3029f;

    /* renamed from: g */
    public AbstractC0210af f3030g;

    /* renamed from: i */
    public boolean f3032i;

    /* renamed from: j */
    public boolean f3033j;

    /* renamed from: c */
    public C0363g f3026c = C0363g.f2422a;

    /* renamed from: h */
    public C0181c f3031h = AbstractC0197s.f1356h;

    /* renamed from: k */
    public float f3034k = -1.0f;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(-1);
        apVar.mo1095a(this.f3024a);
        apVar.mo1096a(this.f3025b);
        apVar.mo1095a(-1);
        apVar.mo1095a(this.f3026c.m2942a());
        apVar.mo1090a(this.f3027d);
        apVar.mo1129c(this.f3031h.m3415a());
        apVar.mo1129c(this.f3031h.m3415a());
        apVar.mo1134b(this.f3030g);
        apVar.mo1147a(this.f3029f);
        apVar.mo1090a(this.f3033j);
        apVar.mo1096a(this.f3034k);
        apVar.mo1145a(this.f3028e);
        this.f3026c.m2928a(apVar);
    }

    /* renamed from: a */
    public void m2615a(C0707k kVar) {
        String.valueOf(kVar.m1062f());
        this.f3024a = kVar.m1062f();
        this.f3025b = kVar.m1061g();
        int i = 0;
        if (kVar.m1071b() >= 4) {
            this.f3031h = C0181c.m3412a(String.valueOf(kVar.m1062f()));
        }
        if (kVar.m1071b() >= 6) {
            i = kVar.m1062f();
        }
        if (kVar.m1071b() >= 25) {
            this.f3027d = kVar.m1063e();
        }
        if (kVar.m1071b() >= 33) {
            kVar.m1057k();
            this.f3031h = C0181c.m3412a(kVar.m1057k());
        }
        if (kVar.m1071b() >= 61) {
            this.f3030g = kVar.m1054n();
            this.f3029f = kVar.m1045w();
        }
        if (kVar.m1071b() >= 64) {
            this.f3033j = kVar.m1063e();
            this.f3034k = kVar.m1061g();
        }
        if (kVar.m1071b() >= 71) {
            this.f3028e = kVar.m1052p();
        }
        if (kVar.m1071b() >= 73) {
            this.f3026c = C0363g.m2927a(kVar);
        } else {
            this.f3026c = C0363g.m2941a(i);
        }
    }
}
