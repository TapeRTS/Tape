package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ac.class */
public class C0784ac extends AbstractC0726bk {

    /* renamed from: i */
    private final C0760a f5060i;

    /* renamed from: a */
    public ArrayList f5061a = new ArrayList();

    /* renamed from: b */
    public float f5062b;

    /* renamed from: c */
    public long f5063c;

    /* renamed from: d */
    public float f5064d;

    /* renamed from: e */
    public float f5065e;

    /* renamed from: f */
    public float f5066f;

    /* renamed from: g */
    public boolean f5067g;

    /* renamed from: h */
    public boolean f5068h;

    public C0784ac(C0760a c0760a, boolean z) {
        this.f5060i = c0760a;
        this.f5067g = z;
    }

    /* renamed from: a */
    public void m2121a() {
        Unit unit = null;
        Iterator it = this.f5061a.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (!unit2.isDead && unit2.f1650cL == null && this.f5060i.f4903a.m1980j(unit2) && unit2.m5815ce()) {
                unit = unit2;
            }
        }
        if (this.f5063c > GameEngine.m1214U() - 700 && unit != null) {
            this.f5060i.f4904b.m1150b(unit.f6951ek, unit.f6952el);
        }
        this.f5063c = GameEngine.m1214U();
    }

    /* renamed from: b */
    public void m2119b() {
        this.f5061a.clear();
    }

    /* renamed from: c */
    public void m2118c() {
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y.f1643cE && !this.f5061a.contains(abstractC0623y)) {
                    this.f5061a.add(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        m2117d();
        c0859ar.mo1488a(this.f5062b);
        c0859ar.m1577a(this.f5063c);
        c0859ar.mo1487a(this.f5061a.size());
        Iterator it = this.f5061a.iterator();
        while (it.hasNext()) {
            c0859ar.mo1486a((Unit) it.next());
        }
        c0859ar.m1554c(0);
    }

    /* renamed from: a */
    public void m2120a(C0876k c0876k) {
        this.f5062b = c0876k.m1453g();
        this.f5063c = c0876k.m1451i();
        this.f5061a.clear();
        int m1454f = c0876k.m1454f();
        for (int i = 0; i < m1454f; i++) {
            Unit m1445o = c0876k.m1445o();
            if (m1445o != null) {
                this.f5061a.add(m1445o);
            }
        }
        c0876k.m1457d();
    }

    /* renamed from: d */
    public void m2117d() {
        if (this.f5061a.size() == 0) {
            return;
        }
        Iterator it = this.f5061a.iterator();
        while (it.hasNext()) {
            if (((Unit) it.next()).isDead) {
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public void m2116e() {
        if (this.f5061a.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5061a.iterator();
        while (it.hasNext()) {
            Unit m467a = AbstractC1120w.m467a(((Unit) it.next()).f6945ed, true);
            if (m467a != null && !m467a.isDead) {
                arrayList.add(m467a);
            }
        }
        this.f5061a = arrayList;
    }
}
