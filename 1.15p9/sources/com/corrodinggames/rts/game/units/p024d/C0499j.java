package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;

/* renamed from: com.corrodinggames.rts.game.units.d.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/j.class */
public class C0499j extends AbstractC0726bk {

    /* renamed from: a */
    public int f3480a;

    /* renamed from: b */
    public float f3481b;

    /* renamed from: e */
    public C0449h f3482e;

    /* renamed from: f */
    public boolean f3483f;

    /* renamed from: g */
    public InterfaceC0303as f3484g;

    /* renamed from: h */
    public PointF f3485h;

    /* renamed from: i */
    public Unit f3486i;

    /* renamed from: k */
    public boolean f3487k;

    /* renamed from: l */
    public boolean f3488l;

    /* renamed from: c */
    public C0424b f3489c = C0424b.f2709a;

    /* renamed from: d */
    public C0424b f3490d = null;

    /* renamed from: j */
    public C0208c f3491j = Action.f1461i;

    /* renamed from: m */
    public float f3492m = -1.0f;

    /* renamed from: n */
    public double f3493n = 0.0d;

    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1487a(-1);
        c0859ar.mo1487a(this.f3480a);
        c0859ar.mo1488a(this.f3481b);
        c0859ar.mo1487a(-1);
        c0859ar.mo1487a(this.f3489c.m4332a());
        c0859ar.mo1482a(this.f3483f);
        c0859ar.m1553c(this.f3491j.m5146a());
        c0859ar.m1553c(this.f3491j.m5146a());
        c0859ar.m1559b(this.f3486i);
        c0859ar.m1576a(this.f3485h);
        c0859ar.mo1482a(this.f3488l);
        c0859ar.mo1488a(this.f3492m);
        c0859ar.m1574a(this.f3484g);
        this.f3489c.m4314a(c0859ar);
        C0424b.m4313a(c0859ar, this.f3490d);
        C0448g.m4161a(this.f3482e, c0859ar);
    }

    /* renamed from: a */
    public void m3766a(C0876k c0876k) {
        String.valueOf(c0876k.m1454f());
        this.f3480a = c0876k.m1454f();
        this.f3481b = c0876k.m1453g();
        int i = 0;
        if (c0876k.m1463b() >= 4) {
            this.f3491j = C0208c.m5142a(String.valueOf(c0876k.m1454f()));
        }
        if (c0876k.m1463b() >= 6) {
            i = c0876k.m1454f();
        }
        if (c0876k.m1463b() >= 25) {
            this.f3483f = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 33) {
            c0876k.m1448l();
            this.f3491j = C0208c.m5142a(c0876k.m1448l());
        }
        if (c0876k.m1463b() >= 61) {
            this.f3486i = c0876k.m1445o();
            this.f3485h = c0876k.m1435y();
        }
        if (c0876k.m1463b() >= 64) {
            this.f3488l = c0876k.m1455e();
            this.f3492m = c0876k.m1453g();
        }
        if (c0876k.m1463b() >= 71) {
            this.f3484g = c0876k.m1443q();
        }
        if (c0876k.m1463b() >= 73) {
            this.f3489c = C0424b.m4299b(c0876k);
        } else {
            this.f3489c = C0424b.m4331a(i);
        }
        if (c0876k.m1463b() >= 91) {
            this.f3490d = C0424b.m4312a(c0876k);
        }
        if (c0876k.m1463b() >= 95) {
            this.f3482e = C0448g.m4160a(c0876k);
        }
    }
}
