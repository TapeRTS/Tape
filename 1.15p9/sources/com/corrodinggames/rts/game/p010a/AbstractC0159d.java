package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/d.class */
public abstract class AbstractC0159d {

    /* renamed from: b */
    String f648b;

    /* renamed from: c */
    public ArrayList f649c = new ArrayList();

    /* renamed from: a */
    private ArrayList f650a = new ArrayList();

    /* renamed from: d */
    final /* synthetic */ C0136a f651d;

    /* renamed from: a */
    public abstract boolean m6785a(InterfaceC0303as interfaceC0303as);

    public AbstractC0159d(C0136a c0136a, String str) {
        this.f651d = c0136a;
        this.f648b = str;
        c0136a.f602bp.add(this);
    }

    /* renamed from: b */
    public boolean m6782b(InterfaceC0303as interfaceC0303as) {
        Iterator it = this.f649c.iterator();
        while (it.hasNext()) {
            if (((C0160e) it.next()).f652a == interfaceC0303as) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public float m6780c(InterfaceC0303as interfaceC0303as) {
        return 10.0f;
    }

    /* renamed from: a */
    public ArrayList m6788a() {
        Collections.shuffle(this.f650a);
        return this.f650a;
    }

    /* renamed from: b */
    public void m6783b() {
        this.f649c = new ArrayList();
        float f = 0.0f;
        Iterator it = UnitType.f1790ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it.next();
            if (m6785a(interfaceC0303as)) {
                float m6780c = m6780c(interfaceC0303as);
                f += m6780c;
                this.f649c.add(new C0160e(this, interfaceC0303as, m6780c));
            }
        }
        this.f650a = new ArrayList(this.f649c);
        if (this.f649c.size() == 0) {
            GameEngine.PrintLog("AI: rebuildUnitMix: no units in unitMix:" + this.f648b);
        }
    }

    /* renamed from: c */
    public InterfaceC0303as m6781c() {
        return m6786a((EnumC0246ao) null, -1);
    }

    /* renamed from: a */
    public InterfaceC0303as m6787a(EnumC0246ao enumC0246ao) {
        return m6786a(enumC0246ao, -1);
    }

    /* renamed from: a */
    public boolean m6784a(InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao) {
        if (enumC0246ao == null) {
            return true;
        }
        EnumC0246ao mo5700o = interfaceC0303as.mo5700o();
        if (mo5700o == EnumC0246ao.f1708g) {
            mo5700o = EnumC0246ao.f1703b;
        }
        if (mo5700o == EnumC0246ao.f1709h) {
            mo5700o = EnumC0246ao.f1707f;
        }
        if (mo5700o == enumC0246ao) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public InterfaceC0303as m6786a(EnumC0246ao enumC0246ao, int i) {
        if (this.f649c.size() == 0) {
            GameEngine.PrintLog("AI: getRandomUnitType: no units in unitMix:" + this.f648b);
            return null;
        }
        float f = 0.0f;
        int i2 = 0;
        Iterator it = this.f649c.iterator();
        while (it.hasNext()) {
            C0160e c0160e = (C0160e) it.next();
            if (m6784a(c0160e.f652a, enumC0246ao) && (i == -1 || c0160e.f652a.getPrice() <= i)) {
                f += c0160e.f653b;
                i2++;
            }
        }
        if (i2 == 0) {
            return null;
        }
        float rnd = CommonUtils.rnd(0.0f, f);
        float f2 = 0.0f;
        Iterator it2 = this.f649c.iterator();
        while (it2.hasNext()) {
            C0160e c0160e2 = (C0160e) it2.next();
            if (m6784a(c0160e2.f652a, enumC0246ao) && (i == -1 || c0160e2.f652a.getPrice() <= i)) {
                f2 += c0160e2.f653b;
                if (f2 > rnd) {
                    return c0160e2.f652a;
                }
            }
        }
        GameEngine.PrintLog("Did not find getRandomUnit, this should only happen very rarely, name:" + this.f648b + " unitMix.size:" + this.f649c.size() + " minPrice:" + i + " movementType:" + enumC0246ao + " totalUnits:" + i2);
        return ((C0160e) this.f649c.get(this.f649c.size() - 1)).f652a;
    }
}
