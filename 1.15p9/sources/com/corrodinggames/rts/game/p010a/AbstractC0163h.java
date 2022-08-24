package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/h.class */
public abstract class AbstractC0163h extends AbstractC0170o {

    /* renamed from: F */
    ArrayList f686F;

    /* renamed from: G */
    ArrayList f687G;

    /* renamed from: c */
    public abstract void m6744c(float f);

    /* renamed from: l */
    public int m6743l() {
        return this.f686F.size();
    }

    /* renamed from: a */
    public boolean m6749a() {
        return false;
    }

    /* renamed from: b */
    public boolean m6747b() {
        return false;
    }

    public AbstractC0163h(C0136a c0136a) {
        super(c0136a);
        this.f686F = new ArrayList();
        this.f687G = new ArrayList();
    }

    /* renamed from: m */
    public boolean m6742m() {
        Iterator it = this.f759R.f598bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0169n) && ((C0169n) abstractC0170o).f751m == this) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void m6741n() {
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y == null || abstractC0623y.isDead) {
                if (abstractC0623y != null && abstractC0623y.f3942aA == this) {
                    abstractC0623y.f3942aA = null;
                }
                if (abstractC0623y != null) {
                    this.f687G.remove(abstractC0623y);
                }
                it.remove();
            }
        }
    }

    /* renamed from: o */
    public void m6740o() {
        Iterator it = this.f687G.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y == null || abstractC0623y.isDead || abstractC0623y.f1650cL != null || abstractC0623y.f1651cM != null) {
                it.remove();
            }
        }
    }

    /* renamed from: p */
    public void m6739p() {
        m6738q();
        this.f687G.clear();
        super.m6666p();
    }

    /* renamed from: a */
    public void m6748a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y.f3942aA != null) {
            abstractC0623y.f3942aA.m6745b(abstractC0623y);
        }
        if (abstractC0623y.team != null && abstractC0623y.team != this.f759R) {
            GameEngine.m1120g("unit.team:" + abstractC0623y.team.f1305k + ", ai:" + this.f759R.f1305k);
        }
        this.f686F.add(abstractC0623y);
        abstractC0623y.f3942aA = this;
    }

    /* renamed from: b */
    public void m6745b(AbstractC0623y abstractC0623y) {
        this.f686F.remove(abstractC0623y);
        this.f687G.remove(abstractC0623y);
        if (abstractC0623y.f3942aA == this) {
            abstractC0623y.f3942aA = null;
        }
    }

    /* renamed from: q */
    public void m6738q() {
        Iterator it = this.f686F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y != null && abstractC0623y.f3942aA == this) {
                abstractC0623y.f3942aA = null;
            }
        }
        this.f686F.clear();
    }

    /* renamed from: b */
    public void m6746b(float f) {
    }
}
