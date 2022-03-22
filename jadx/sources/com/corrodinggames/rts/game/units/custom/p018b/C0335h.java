package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0325au;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0185g;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p032d.C0647w;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/h.class */
public final class C0335h extends AbstractC0328a {

    /* renamed from: a */
    public static final C0335h f2262a = new C0335h();

    /* renamed from: a */
    public static void m3041a(C0368l lVar, C0809ab abVar) {
        C0835m e = abVar.m569e("attachment_");
        if (e.size() > 0) {
            lVar.m2794a(f2262a);
            short s = 0;
            Iterator it = e.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String substring = str.substring("attachment_".length());
                C0336i iVar = new C0336i();
                m3051a(iVar, lVar, abVar, str, substring);
                iVar.f2264b = substring;
                iVar.f2263a = s;
                s = (short) (s + 1);
                lVar.f2550ap.add(iVar);
            }
        }
    }

    /* renamed from: a */
    public static void m3051a(C0336i iVar, C0368l lVar, C0809ab abVar, String str, String str2) {
        iVar.f2265c = abVar.m560h(str, "x");
        iVar.f2266d = abVar.m560h(str, "y");
        iVar.f2267e = abVar.m592a(str, "height", Float.valueOf(iVar.f2267e)).floatValue();
        iVar.f2271i = abVar.m594a(str, "lockDir", Boolean.valueOf(iVar.f2271i)).booleanValue();
        iVar.f2272j = abVar.m594a(str, "redirectDamageToParent", Boolean.valueOf(iVar.f2272j)).booleanValue();
        iVar.f2273k = abVar.m594a(str, "redirectDamageToParent_shieldOnly", Boolean.valueOf(iVar.f2273k)).booleanValue();
        if (iVar.f2272j || !iVar.f2273k) {
            iVar.f2274l = abVar.m594a(str, "canBeAttackedAndDamaged", Boolean.valueOf(iVar.f2274l)).booleanValue();
            iVar.f2275m = abVar.m594a(str, "isUnselectable", Boolean.valueOf(iVar.f2275m)).booleanValue();
            iVar.f2276n = abVar.m594a(str, "isUnselectableAsTarget", Boolean.valueOf(iVar.f2275m)).booleanValue();
            iVar.f2277o = abVar.m594a(str, "isVisible", Boolean.valueOf(iVar.f2277o)).booleanValue();
            iVar.f2278p = abVar.m594a(str, "showMiniHp", Boolean.valueOf(iVar.f2278p)).booleanValue();
            iVar.f2279q = abVar.m594a(str, "hideHp", Boolean.valueOf(iVar.f2279q)).booleanValue();
            iVar.f2302N = abVar.m608a(lVar, str, "showAllActionsFrom", (LogicBoolean) null);
            if (LogicBoolean.isStaticFalse(iVar.f2302N)) {
                iVar.f2302N = null;
            }
            Float a = abVar.m592a(str, "idleDir", (Float) null);
            Float a2 = abVar.m592a(str, "idleDirReversing", (Float) null);
            if (a != null) {
                iVar.f2268f = a.floatValue();
                iVar.f2269g = a.floatValue();
            }
            if (a2 != null) {
                iVar.f2269g = a2.floatValue();
            } else {
                iVar.f2269g = iVar.f2268f;
            }
            iVar.f2270h = abVar.m594a(str, "resetRotationWhenNotAttacking", (Boolean) false).booleanValue();
            iVar.f2280r = abVar.m594a(str, "rotateWithParent", Boolean.valueOf(iVar.f2280r)).booleanValue();
            iVar.f2281s = abVar.m594a(str, "lockLegMovement", Boolean.valueOf(iVar.f2281s)).booleanValue();
            iVar.f2282t = abVar.m594a(str, "freezeLegMovement", Boolean.valueOf(iVar.f2282t)).booleanValue();
            iVar.f2283u = abVar.m594a(str, "lockRotation", Boolean.valueOf(iVar.f2283u)).booleanValue();
            if (!iVar.f2283u || !iVar.f2270h) {
                iVar.f2284v = abVar.m594a(str, "keepAliveWhenParentDies", Boolean.valueOf(iVar.f2284v)).booleanValue();
                iVar.f2285w = C0325au.m3062b(lVar, abVar, str, "onCreateSpawnUnitOf");
                if (iVar.f2285w.m3063b()) {
                    iVar.f2285w = null;
                }
                iVar.f2286x = abVar.m594a(str, "createIncompleteIfParentIs", Boolean.valueOf(iVar.f2286x)).booleanValue();
                iVar.f2287y = abVar.m594a(str, "onConvertKeepExistingUnitInSameSlot", Boolean.valueOf(iVar.f2287y)).booleanValue();
                iVar.f2288z = abVar.m594a(str, "onParentTeamChangeKeepCurrentTeam", Boolean.valueOf(iVar.f2288z)).booleanValue();
                iVar.f2290B = abVar.m594a(str, "setDrawLayerOnBottom", Boolean.valueOf(iVar.f2290B)).booleanValue();
                if (iVar.f2290B) {
                    iVar.f2289A = false;
                }
                iVar.f2289A = abVar.m594a(str, "setDrawLayerOnTop", Boolean.valueOf(iVar.f2289A)).booleanValue();
                if (!iVar.f2289A || !iVar.f2290B) {
                    iVar.f2292D = abVar.m594a(str, "addTransportedUnits", Boolean.valueOf(iVar.f2292D)).booleanValue();
                    iVar.f2293E = abVar.m594a(str, "unloadInCurrentPosition", Boolean.valueOf(iVar.f2293E)).booleanValue();
                    iVar.f2294F = abVar.m594a(str, "smoothlyBlendPositionWhenExistingUnitAdded", Boolean.valueOf(iVar.f2294F)).booleanValue();
                    if (iVar.f2294F) {
                        iVar.f2295G = 500.0f;
                    } else {
                        iVar.f2295G = 0.0f;
                    }
                    iVar.f2296H = abVar.m594a(str, "deattachIfWantingToMove", Boolean.valueOf(iVar.f2296H)).booleanValue();
                    iVar.f2297I = abVar.m594a(str, "hidden", Boolean.valueOf(iVar.f2297I)).booleanValue();
                    iVar.f2298J = abVar.m594a(str, "prioritizeParentsMainTarget", Boolean.valueOf(iVar.f2298J)).booleanValue();
                    iVar.f2299K = abVar.m594a(str, "onlyAttackParentsMainTarget", Boolean.valueOf(iVar.f2299K)).booleanValue();
                    iVar.f2300L = abVar.m594a(str, "alwaysAllowedToAttackParentsMainTarget", Boolean.valueOf(iVar.f2300L)).booleanValue();
                    iVar.f2301M = abVar.m594a(str, "canAttack", Boolean.valueOf(iVar.f2301M)).booleanValue();
                    iVar.f2303O = abVar.m594a(str, "keepWaypointsNeedingMovement", Boolean.valueOf(iVar.f2303O)).booleanValue();
                    if (iVar.f2292D) {
                        lVar.f2551aq = true;
                        return;
                    }
                    return;
                }
                throw new C0324at("[" + str + "] Cannot use setDrawLayerOnTop and setDrawLayerOnBottom at same time");
            }
            throw new C0324at("[" + str + "] Cannot use lockRotation and resetRotationWhenIdle at same time");
        }
        throw new C0324at("[" + str + "] redirectDamageToParent_shieldOnly requires redirectDamageToParent");
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: a */
    public void mo3049a(C0367k kVar, float f) {
        mo3039b(kVar, f);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: b */
    public void mo3039b(C0367k kVar, float f) {
        float f2;
        AbstractC0789l u = AbstractC0789l.m638u();
        C0368l lVar = kVar.f2460v;
        C0835m mVar = lVar.f2550ap;
        if (mVar.f5778a != 0) {
            if (lVar.f2551aq) {
                Object[] a = mVar.m490a();
                for (int i = 0; i < mVar.f5778a; i++) {
                    C0336i iVar = (C0336i) a[i];
                    if (iVar.f2292D && kVar.f2462x.f5778a > 0 && m3047a(kVar, iVar) == null) {
                        Iterator it = kVar.f2462x.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                AbstractC0210af afVar = (AbstractC0210af) it.next();
                                if ((afVar instanceof AbstractC0515r) && afVar.f1502cq == null && kVar.mo2289a((AbstractC0515r) afVar, iVar)) {
                                    afVar.f1501cp = null;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C0835m mVar2 = kVar.f2463y;
            if (mVar2 != null) {
                float f3 = kVar.f1471bL - kVar.f2464z;
                kVar.f2464z = kVar.f1471bL;
                Object[] a2 = mVar2.m490a();
                for (int i2 = mVar2.f5778a - 1; i2 >= 0; i2--) {
                    AbstractC0515r rVar = (AbstractC0515r) a2[i2];
                    if (rVar != null) {
                        if (rVar.f1459bz) {
                            rVar.m2193bs();
                            a2[i2] = null;
                        } else {
                            if (kVar.f1501cp != null) {
                                if (rVar.f1501cp == null) {
                                    rVar.f1501cp = kVar.f1501cp;
                                    u.f5518bA.m1666l(rVar);
                                }
                            } else if (!(rVar.f1501cp == null || rVar.f1501cp == kVar)) {
                                rVar.f1501cp = null;
                            }
                            C0336i iVar2 = (C0336i) mVar.get(i2);
                            float i3 = C0654f.m1421i(kVar.f1471bL);
                            float h = C0654f.m1425h(kVar.f1471bL);
                            float f4 = (i3 * iVar2.f2266d) - (h * iVar2.f2265c);
                            float f5 = (h * iVar2.f2266d) + (i3 * iVar2.f2265c);
                            float f6 = f4 + kVar.f5842dH;
                            float f7 = f5 + kVar.f5843dI;
                            float f8 = kVar.f5844dJ + iVar2.f2267e;
                            if (C0851y.m412b(rVar.f1504cs, (int) iVar2.f2295G)) {
                                rVar.f5842dH += (f6 - rVar.f5842dH) * 0.05f;
                                rVar.f5843dI += (f7 - rVar.f5843dI) * 0.05f;
                                rVar.f5844dJ += (f8 - rVar.f5844dJ) * 0.05f;
                            } else {
                                rVar.f5842dH = f6;
                                rVar.f5843dI = f7;
                                rVar.f5844dJ = f8;
                            }
                            if (rVar.f1477bR < 1.0f && iVar2.f2286x) {
                                rVar.m3291q(kVar.f1477bR);
                            }
                            if (iVar2.f2289A) {
                                if (rVar.f5840dF <= kVar.f5840dF) {
                                    int i4 = 0;
                                    if (rVar instanceof C0367k) {
                                        i4 = ((C0367k) rVar).f2460v.f2654cp;
                                    }
                                    rVar.f5840dF = kVar.f5840dF;
                                    rVar.f5841dG = kVar.f5841dG + 1 + i4;
                                }
                            } else if (iVar2.f2290B && rVar.f5840dF >= kVar.f5840dF) {
                                rVar.f5840dF = kVar.f5840dF;
                                rVar.f5841dG = kVar.f5841dG - 1;
                            }
                            if (kVar.f1473bN) {
                                f2 = kVar.f1471bL + iVar2.f2269g;
                            } else {
                                f2 = kVar.f1471bL + iVar2.f2268f;
                            }
                            if (!rVar.mo2643bw()) {
                                if (iVar2.f2283u) {
                                    rVar.mo2171h(f2);
                                } else {
                                    if (f3 != 0.0f && iVar2.f2280r) {
                                        rVar.mo2167i(f3);
                                    }
                                    if (iVar2.f2270h && rVar.f3399I == null) {
                                        rVar.m2192c(f, f2);
                                    }
                                }
                            }
                            if (iVar2.f2299K) {
                                rVar.f3399I = kVar.f3399I;
                                rVar.f3400J = 5.0f;
                            }
                            if (iVar2.f2300L && rVar.f3399I == null) {
                                rVar.f3399I = kVar.f3399I;
                            }
                            if (!(!iVar2.f2298J || kVar.f3399I == null || rVar.f3399I == kVar.f3399I)) {
                                boolean z = false;
                                if (iVar2.f2300L) {
                                    z = true;
                                }
                                if (rVar.m2298a(kVar.f3399I, z)) {
                                    rVar.f3399I = kVar.f3399I;
                                    rVar.f3400J = 5.0f;
                                }
                            }
                            if (rVar instanceof C0367k) {
                                C0367k kVar2 = (C0367k) rVar;
                                if (iVar2.f2281s) {
                                    kVar2.f2472dp = kVar2.f5842dH;
                                    kVar2.f2472dp = kVar2.f5843dI;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3042a(C0367k kVar, boolean z) {
        C0835m mVar = kVar.f2463y;
        if (mVar != null) {
            C0835m mVar2 = kVar.f2460v.f2550ap;
            Object[] a = mVar.m490a();
            for (int i = mVar.f5778a - 1; i >= 0; i--) {
                AbstractC0515r rVar = (AbstractC0515r) a[i];
                if (rVar != null) {
                    C0336i iVar = (C0336i) mVar2.get(i);
                    rVar.m2193bs();
                    a[i] = null;
                    if (z && !iVar.f2284v) {
                        rVar.m3319bU();
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: b */
    public void mo3040b(C0367k kVar) {
        m3042a(kVar, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: c */
    public void mo3038c(C0367k kVar) {
        m3042a(kVar, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: a */
    public void mo3050a(C0367k kVar) {
        boolean z = false;
        C0835m mVar = kVar.f2460v.f2550ap;
        Object[] a = mVar.m490a();
        for (int i = mVar.f5778a - 1; i >= 0; i--) {
            C0336i iVar = (C0336i) a[i];
            if (iVar.f2285w != null) {
                AbstractC0515r a2 = m3047a(kVar, iVar);
                if (a2 != null) {
                    if (!iVar.f2287y) {
                        a2.m3319bU();
                    }
                }
                C0835m mVar2 = new C0835m();
                iVar.f2285w.m3065a(mVar2, kVar.f1461bB, (AbstractC0210af) kVar, true);
                if (mVar2.size() > 1) {
                    AbstractC0789l.m682b("onCreateSpawnUnitOf: created an extra " + (mVar2.size() - 1) + " units");
                    for (int i2 = 1; i2 < mVar2.size(); i2++) {
                        ((AbstractC0210af) mVar2.get(i2)).m3319bU();
                    }
                }
                if (mVar2.size() == 0) {
                    AbstractC0789l.m682b("onCreateSpawnUnitOf: Warning no units created");
                } else {
                    AbstractC0210af afVar = (AbstractC0210af) mVar2.get(0);
                    if (!(afVar instanceof AbstractC0515r)) {
                        AbstractC0789l.m682b("onCreateSpawnUnitOf: Warning " + afVar.mo1606r().mo2754i() + " not an orderable unit type, cannot attach");
                        afVar.m3319bU();
                    } else {
                        AbstractC0515r rVar = (AbstractC0515r) afVar;
                        if (kVar.mo2289a(rVar, iVar)) {
                            rVar.f1504cs = -9999;
                            if (kVar.f1477bR < 1.0f && iVar.f2286x) {
                                rVar.m3291q(kVar.f1477bR);
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            mo3039b(kVar, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: a */
    public void mo3045a(C0367k kVar, C0368l lVar) {
        C0835m mVar = kVar.f2463y;
        C0835m mVar2 = kVar.f2460v.f2550ap;
        if (mVar2.size() == 0) {
            kVar.f2463y = null;
        } else if (mVar != null) {
            for (int size = mVar.size() - 1; size >= 0; size--) {
                AbstractC0515r rVar = (AbstractC0515r) mVar.get(size);
                if (rVar != null && size >= mVar2.size()) {
                    rVar.m3319bU();
                    mVar.remove(size);
                }
            }
            for (int size2 = mVar.size() - 1; size2 >= 0; size2--) {
                AbstractC0515r rVar2 = (AbstractC0515r) mVar.get(size2);
                if (rVar2 != null) {
                    rVar2.f1503cr = (C0336i) mVar2.get(size2);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0336i m3043a(C0367k kVar, short s) {
        C0835m mVar = kVar.f2460v.f2550ap;
        if (mVar.f5778a <= s) {
            return null;
        }
        return (C0336i) mVar.get(s);
    }

    /* renamed from: a */
    public static AbstractC0515r m3047a(C0367k kVar, C0336i iVar) {
        short s;
        C0835m mVar = kVar.f2463y;
        if (mVar != null && mVar.f5778a > (s = iVar.f2263a)) {
            return (AbstractC0515r) mVar.get(s);
        }
        return null;
    }

    /* renamed from: a */
    public static AbstractC0515r m3048a(C0367k kVar, int i) {
        C0835m mVar = kVar.f2463y;
        if (mVar != null && mVar.f5778a > i) {
            return (AbstractC0515r) mVar.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3046a(C0367k kVar, C0336i iVar, AbstractC0515r rVar) {
        C0368l lVar = kVar.f2460v;
        short s = iVar.f2263a;
        if (lVar.f2550ap.f5778a > s || rVar == null) {
            if (kVar.f2463y == null) {
                kVar.f2463y = new C0835m();
            }
            C0835m mVar = kVar.f2463y;
            if (mVar.size() == 0) {
                kVar.f2464z = kVar.f1471bL;
            }
            if (rVar == null && s >= mVar.size()) {
                return true;
            }
            while (mVar.size() <= s) {
                mVar.add(null);
            }
            mVar.set(s, rVar);
            return true;
        }
        AbstractC0789l.m682b("setAttachedUnitLookup: slot:" + ((int) s) + " larger than max slot size:" + lVar.f2550ap.f5778a);
        return false;
    }

    /* renamed from: a */
    public static void m3044a(C0367k kVar, C0835m mVar, boolean z) {
        C0336i cV;
        boolean z2;
        C0835m mVar2 = kVar.f2463y;
        if (mVar2 != null) {
            Iterator it = mVar2.iterator();
            while (it.hasNext()) {
                AbstractC0210af afVar = (AbstractC0210af) it.next();
                if (!(afVar == null || !(afVar instanceof AbstractC0515r) || (cV = afVar.m3306cV()) == null || cV.f2302N == null)) {
                    Iterator it2 = afVar.mo2390M().iterator();
                    while (it2.hasNext()) {
                        AbstractC0197s sVar = (AbstractC0197s) it2.next();
                        if (z) {
                            z2 = C0647w.m1591a(cV.f2302N, kVar);
                        } else {
                            z2 = cV.f2302N.read(kVar);
                        }
                        if (z2) {
                            mVar.add(new C0185g(sVar, (AbstractC0515r) afVar, sVar.m3387J()));
                        }
                    }
                }
            }
        }
    }
}
