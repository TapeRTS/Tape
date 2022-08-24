package com.corrodinggames.rts.game.units.custom;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/t.class */
public class C0462t {

    /* renamed from: a */
    C1101m f3339a = new C1101m();

    /* renamed from: b */
    C1101m f3340b;

    /* renamed from: c */
    String f3341c;

    /* renamed from: d */
    String f3342d;

    /* renamed from: a */
    public void m4686a(C0453l c0453l) {
    }

    /* renamed from: b */
    public void m4685b(C0453l c0453l) {
        C1101m c1101m = new C1101m();
        Iterator it = this.f3339a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Action m4725h = c0453l.m4725h(str);
            if (m4725h == null) {
                throw new C0412bm("[" + this.f3342d + "]" + this.f3341c + " Could not find action:" + str + " on unit: " + c0453l.m4746b());
            }
            if (m4725h instanceof AbstractC0228w) {
                c1101m.add((AbstractC0228w) m4725h);
            } else {
                throw new C0412bm("[" + this.f3342d + "]" + this.f3341c + " Action:" + str + " on unit: " + c0453l.m4746b() + " doesn't have the right type");
            }
        }
        this.f3340b = c1101m;
    }

    /* renamed from: a */
    public void m4687a(C0451j c0451j, PointF pointF, Unit unit, int i) {
        if (this.f3340b == null) {
            C0831ad.m1648g("Action on " + c0451j.m4802r().m4724i() + " has not been linked");
            return;
        }
        Iterator it = this.f3340b.iterator();
        while (it.hasNext()) {
            c0451j.m5003a((Action) it.next(), pointF, unit, i);
        }
    }

    /* renamed from: a */
    public C1101m m4689a() {
        if (this.f3340b == null) {
            C0831ad.m1648g("Action on [" + this.f3342d + "]" + this.f3341c + " has not been linked");
            return new C1101m();
        }
        return this.f3340b;
    }

    /* renamed from: a */
    public void m4688a(C0451j c0451j, PointF pointF, Unit unit) {
        if (this.f3340b == null) {
            C0831ad.m1648g("Action on " + c0451j.m4802r().m4724i() + " has not been linked");
            return;
        }
        Iterator it = this.f3340b.iterator();
        while (it.hasNext()) {
            c0451j.f2876dJ.m4397a((AbstractC0228w) ((Action) it.next()), false, pointF, unit);
        }
    }
}
