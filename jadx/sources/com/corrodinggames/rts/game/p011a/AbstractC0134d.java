package com.corrodinggames.rts.game.p011a;

import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/d.class */
public abstract class AbstractC0134d {

    /* renamed from: b */
    String f596b;

    /* renamed from: c */
    public ArrayList f597c;

    /* renamed from: a */
    private ArrayList f598a;

    /* renamed from: d */
    final /* synthetic */ C0118a f599d;

    /* renamed from: a */
    public abstract boolean mo3811a(AbstractC0268al alVar);

    public AbstractC0134d(C0118a aVar, String str) {
        this.f599d = aVar;
        this.f596b = str;
        aVar.f558aY.add(this);
    }

    /* renamed from: b */
    public boolean m3808b(AbstractC0268al alVar) {
        Iterator it = this.f597c.iterator();
        while (it.hasNext()) {
            if (((C0135e) it.next()).f600a == alVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public float m3806c(AbstractC0268al alVar) {
        return 10.0f;
    }

    /* renamed from: a */
    public ArrayList m3814a() {
        Collections.shuffle(this.f598a);
        return this.f598a;
    }

    /* renamed from: b */
    public void m3809b() {
        this.f597c = new ArrayList();
        float f = 0.0f;
        Iterator it = EnumC0215ak.f1639ad.iterator();
        while (it.hasNext()) {
            AbstractC0268al alVar = (AbstractC0268al) it.next();
            if (mo3811a(alVar)) {
                float c = m3806c(alVar);
                f += c;
                this.f597c.add(new C0135e(this, alVar, c));
            }
        }
        this.f598a = new ArrayList(this.f597c);
        if (this.f597c.size() == 0) {
            AbstractC0789l.m670d("AI: rebuildUnitMix: no units in unitMix:" + this.f596b);
        }
    }

    /* renamed from: c */
    public AbstractC0268al m3807c() {
        return m3812a((EnumC0212ah) null, -1);
    }

    /* renamed from: a */
    public AbstractC0268al m3813a(EnumC0212ah ahVar) {
        return m3812a(ahVar, -1);
    }

    /* renamed from: a */
    public boolean m3810a(AbstractC0268al alVar, EnumC0212ah ahVar) {
        if (ahVar == null) {
            return true;
        }
        EnumC0212ah o = alVar.mo2742o();
        if (o == EnumC0212ah.OVER_CLIFF) {
            o = EnumC0212ah.LAND;
        }
        if (o == EnumC0212ah.OVER_CLIFF_WATER) {
            o = EnumC0212ah.HOVER;
        }
        if (o == ahVar) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0268al m3812a(EnumC0212ah ahVar, int i) {
        if (this.f597c.size() == 0) {
            AbstractC0789l.m670d("AI: getRandomUnitType: no units in unitMix:" + this.f596b);
            return null;
        }
        float f = 0.0f;
        int i2 = 0;
        Iterator it = this.f597c.iterator();
        while (it.hasNext()) {
            C0135e eVar = (C0135e) it.next();
            if (m3810a(eVar.f600a, ahVar) && (i == -1 || eVar.f600a.mo2769c() <= i)) {
                f += eVar.f601b;
                i2++;
            }
        }
        if (i2 == 0) {
            return null;
        }
        float c = C0654f.m1458c(0.0f, f);
        float f2 = 0.0f;
        Iterator it2 = this.f597c.iterator();
        while (it2.hasNext()) {
            C0135e eVar2 = (C0135e) it2.next();
            if (m3810a(eVar2.f600a, ahVar) && (i == -1 || eVar2.f600a.mo2769c() <= i)) {
                f2 += eVar2.f601b;
                if (f2 > c) {
                    return eVar2.f600a;
                }
            }
        }
        AbstractC0789l.m670d("Did not find getRandomUnit, this should only happen very rarely, name:" + this.f596b + " unitMix.size:" + this.f597c.size() + " minPrice:" + i + " movementType:" + ahVar + " totalUnits:" + i2);
        return ((C0135e) this.f597c.get(this.f597c.size() - 1)).f600a;
    }
}
