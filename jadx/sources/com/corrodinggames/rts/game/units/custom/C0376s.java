package com.corrodinggames.rts.game.units.custom;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/s.class */
public class C0376s {

    /* renamed from: a */
    C0835m f2878a = new C0835m();

    /* renamed from: b */
    C0835m f2879b;

    /* renamed from: c */
    String f2880c;

    /* renamed from: d */
    String f2881d;

    /* renamed from: a */
    public void m2885a(C0368l lVar) {
    }

    /* renamed from: b */
    public void m2884b(C0368l lVar) {
        C0835m mVar = new C0835m();
        Iterator it = this.f2878a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC0197s f = lVar.m2924f(str);
            if (f == null) {
                throw new C0324at("[" + this.f2881d + "]" + this.f2880c + " Could not find action:" + str + " on unit: " + lVar.m2939b());
            } else if (f instanceof AbstractC0201w) {
                mVar.add((AbstractC0201w) f);
            } else {
                throw new C0324at("[" + this.f2881d + "]" + this.f2880c + " Action:" + str + " on unit: " + lVar.m2939b() + " doesn't have the right type");
            }
        }
        this.f2879b = mVar;
    }

    /* renamed from: a */
    public void m2886a(C0367k kVar, PointF pointF, AbstractC0210af afVar, int i) {
        if (this.f2879b == null) {
            Hcat_Multiplaye.m1261f("Action on " + kVar.mo1660r().mo3494i() + " has not been linked");
            return;
        }
        Iterator it = this.f2879b.iterator();
        while (it.hasNext()) {
            kVar.m3086a((AbstractC0197s) it.next(), pointF, afVar, i);
        }
    }

    /* renamed from: a */
    public C0835m m2888a() {
        if (this.f2879b != null) {
            return this.f2879b;
        }
        Hcat_Multiplaye.m1261f("Action on [" + this.f2881d + "]" + this.f2880c + " has not been linked");
        return new C0835m();
    }

    /* renamed from: a */
    public void m2887a(C0367k kVar, PointF pointF, AbstractC0210af afVar) {
        if (this.f2879b == null) {
            Hcat_Multiplaye.m1261f("Action on " + kVar.mo1660r().mo3494i() + " has not been linked");
            return;
        }
        Iterator it = this.f2879b.iterator();
        while (it.hasNext()) {
            kVar.f2480do.m2758a((AbstractC0201w) ((AbstractC0197s) it.next()), false, pointF, afVar);
        }
    }
}
