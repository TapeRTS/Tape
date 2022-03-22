package com.corrodinggames.rts.gameFramework.p040k.p041a;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.gameFramework.p040k.C0762a;

/* renamed from: com.corrodinggames.rts.gameFramework.k.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/a/c.class */
public class C0765c extends AbstractC0763a {

    /* renamed from: a */
    Integer f5342a;

    /* renamed from: b */
    Integer f5343b;

    /* renamed from: c */
    AbstractC0171m f5344c;

    /* renamed from: d */
    AbstractC0268al f5345d;

    /* renamed from: e */
    boolean f5346e;

    /* renamed from: f */
    boolean f5347f;

    /* renamed from: g */
    boolean f5348g;

    /* renamed from: h */
    boolean f5349h;

    /* renamed from: i */
    boolean f5350i;

    /* renamed from: j */
    boolean f5351j;

    /* renamed from: k */
    int f5352k;

    /* renamed from: l */
    boolean f5353l;

    /* renamed from: m */
    boolean f5354m;

    /* renamed from: n */
    C0364h f5355n;

    /* renamed from: o */
    boolean f5356o;

    /* renamed from: b */
    public static C0765c m806b(C0762a aVar) {
        C0765c cVar = new C0765c();
        cVar.f5342a = aVar.m813d("maxUnits");
        int i = 1;
        if (cVar.f5342a != null) {
            i = 0;
        }
        cVar.f5343b = Integer.valueOf(aVar.m827a("minUnits", i));
        cVar.f5344c = aVar.m832a();
        AbstractC0268al alVar = null;
        String b = aVar.m819b("unitType");
        if (b != null) {
            alVar = EnumC0215ak.m3273a(b);
            if (alVar == null) {
                aVar.m810g("Cound not find unitType:" + b);
            }
        }
        cVar.f5345d = alVar;
        cVar.f5346e = aVar.m823a("onlybuildings", "onlyBuildings", false);
        cVar.f5348g = aVar.m822a("onlyMainBuildings", false);
        cVar.f5349h = aVar.m822a("onlyOnResourcePool", false);
        cVar.f5347f = aVar.m823a("onlyidle", "onlyIdle", false);
        cVar.f5352k = aVar.m827a("onlyTechLevel", -1);
        cVar.f5351j = aVar.m822a("onlyBuilders", false);
        cVar.f5350i = aVar.m822a("onlyEmptyQueue", false);
        cVar.f5353l = aVar.m822a("onlyAttack", false);
        cVar.f5354m = aVar.m822a("onlyAttackAir", false);
        String b2 = aVar.m819b("onlyWithTag");
        if (b2 != null && !b2.equals("")) {
            try {
                cVar.f5355n = C0364h.m2898b(b2);
            } catch (C0324at e) {
                throw new C0154f(e.getMessage());
            }
        }
        cVar.f5356o = aVar.m822a("includeIncomplete", false);
        return cVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p040k.p041a.AbstractC0763a
    /* renamed from: a */
    public boolean mo807a(C0762a aVar) {
        return m805c(aVar);
    }

    /* renamed from: c */
    public boolean m805c(C0762a aVar) {
        int i = 0;
        AbstractC0210af[] a = AbstractC0210af.f1442bj.m456a();
        int size = AbstractC0210af.f1442bj.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if ((this.f5344c == null || afVar.f1461bB == this.f5344c) && (afVar instanceof AbstractC0515r) && afVar.f1501cp == null && aVar.m831a(afVar) && (this.f5345d == null || afVar.mo1606r() == this.f5345d)) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if ((this.f5356o || afVar.m3321bG()) && ((!this.f5353l || afVar.mo2356l()) && ((!this.f5354m || (afVar.mo2356l() && rVar.mo2249ad())) && ((!this.f5346e || afVar.mo2643bw()) && ((!this.f5348g || (afVar.mo2643bw() && afVar.mo2554bx())) && ((!this.f5349h || afVar.mo1606r().mo2740p()) && ((!this.f5351j || afVar.mo2244ai()) && ((!this.f5347f || rVar.m2238ao()) && ((!this.f5350i || rVar.mo2617cW() <= 0) && ((this.f5352k == -1 || afVar.mo2329T() == this.f5352k) && (this.f5355n == null || C0364h.m2905a(this.f5355n, afVar.mo2846cM())))))))))))) {
                    i++;
                }
            }
        }
        if (i < this.f5343b.intValue()) {
            return false;
        }
        if (this.f5342a == null || i <= this.f5342a.intValue()) {
            return true;
        }
        return false;
    }
}
