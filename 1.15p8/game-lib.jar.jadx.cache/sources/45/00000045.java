package com.corrodinggames.rts.game.ai;

import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/d.class */
public abstract class AbstractC0153d {

    /* renamed from: b */
    String name;

    /* renamed from: c */
    public ArrayList unitMix = new ArrayList();

    /* renamed from: a */
    private ArrayList f634a = new ArrayList();

    /* renamed from: d */
    final /* synthetic */ AI f632d;

    /* renamed from: a */
    public abstract boolean mo4289a(UnitType unitType);

    public AbstractC0153d(AI ai, String str) {
        this.f632d = ai;
        this.name = str;
        ai.f591bn.add(this);
    }

    /* renamed from: b */
    public boolean m4286b(UnitType unitType) {
        Iterator it = this.unitMix.iterator();
        while (it.hasNext()) {
            if (((C0154e) it.next()).f635a == unitType) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public float m4284c(UnitType unitType) {
        return 10.0f;
    }

    /* renamed from: a */
    public ArrayList m4292a() {
        Collections.shuffle(this.f634a);
        return this.f634a;
    }

    /* renamed from: b */
    public void rebuildUnitMix() {
        this.unitMix = new ArrayList();
        float f = 0.0f;
        Iterator it = com.corrodinggames.rts.game.units.UnitType.f1702ae.iterator();
        while (it.hasNext()) {
            UnitType unitType = (UnitType) it.next();
            if (mo4289a(unitType)) {
                float m4284c = m4284c(unitType);
                f += m4284c;
                this.unitMix.add(new C0154e(this, unitType, m4284c));
            }
        }
        this.f634a = new ArrayList(this.unitMix);
        if (this.unitMix.size() == 0) {
            GameEngine.PrintLOG("AI: rebuildUnitMix: no units in unitMix:" + this.name);
        }
    }

    /* renamed from: c */
    public UnitType m4285c() {
        return getRandomUnitType((MovementType) null, -1);
    }

    /* renamed from: a */
    public UnitType m4291a(MovementType movementType) {
        return getRandomUnitType(movementType, -1);
    }

    /* renamed from: a */
    public boolean m4288a(UnitType unitType, MovementType movementType) {
        if (movementType == null) {
            return true;
        }
        MovementType mo3075o = unitType.mo3075o();
        if (mo3075o == MovementType.f1649g) {
            mo3075o = MovementType.f1644b;
        }
        if (mo3075o == MovementType.f1650h) {
            mo3075o = MovementType.f1648f;
        }
        if (mo3075o == movementType) {
            return true;
        }
        return false;
    }

    // 取随机单位类型
    /* renamed from: a */
    public UnitType getRandomUnitType(MovementType movementType, int minPrice) {
        if (this.unitMix.size() == 0) {
            GameEngine.PrintLOG("AI: getRandomUnitType: no units in unitMix:" + this.name);
            return null;
        }
        float f = 0.0f;
        int totalUnits = 0;
        Iterator it = this.unitMix.iterator();
        while (it.hasNext()) {
            C0154e c0154e = (C0154e) it.next();
            if (m4288a(c0154e.f635a, movementType) && (minPrice == -1 || c0154e.f635a.getPrice() <= minPrice)) {
                f += c0154e.f636b;
                totalUnits++;
            }
        }
        if (totalUnits == 0) {
            return null;
        }
        float rnd = CommonUtils.rnd(0.0f, f);
        float f2 = 0.0f;
        Iterator it2 = this.unitMix.iterator();
        while (it2.hasNext()) {
            C0154e c0154e2 = (C0154e) it2.next();
            if (m4288a(c0154e2.f635a, movementType) && (minPrice == -1 || c0154e2.f635a.getPrice() <= minPrice)) {
                f2 += c0154e2.f636b;
                if (f2 > rnd) {
                    return c0154e2.f635a;
                }
            }
        }
        GameEngine.PrintLOG("Did not find getRandomUnit, this should only happen very rarely, name:" + this.name + " unitMix.size:" + this.unitMix.size() + " minPrice:" + minPrice + " movementType:" + movementType + " totalUnits:" + totalUnits);
        return ((C0154e) this.unitMix.get(this.unitMix.size() - 1)).f635a;
    }
}