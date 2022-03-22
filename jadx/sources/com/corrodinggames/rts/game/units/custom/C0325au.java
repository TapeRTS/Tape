package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/au.class */
public class C0325au {

    /* renamed from: a */
    C0835m f2202a;

    /* renamed from: a */
    public static C0325au m3064a(String str, String str2, String str3) {
        return m3061b(null, str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0325au m3068a(C0368l lVar, C0809ab abVar, String str, String str2) {
        return m3067a(lVar, abVar.m579b(str, str2, (String) null), str, str2, false);
    }

    /* renamed from: b */
    public static C0325au m3062b(C0368l lVar, C0809ab abVar, String str, String str2) {
        return m3067a(lVar, abVar.m579b(str, str2, (String) null), str, str2, true);
    }

    /* renamed from: a */
    public static C0325au m3067a(C0368l lVar, String str, String str2, String str3, boolean z) {
        if (lVar != null) {
            return m3061b(lVar, str, str2, str3, z);
        }
        throw new RuntimeException("meta==null");
    }

    /* renamed from: b */
    public static C0325au m3061b(C0368l lVar, String str, String str2, String str3, boolean z) {
        int a;
        String[] split;
        C0325au auVar = new C0325au();
        if (str == null || "".equals(str) || "NONE".equalsIgnoreCase(str)) {
            return auVar;
        }
        Iterator it = C0654f.m1484a(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!"".equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] split2 = trim.split("\\(");
                    if (split2.length != 2) {
                        throw new C0324at("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
                    }
                    trim = split2[0];
                    str4 = split2[1].trim();
                }
                String[] split3 = trim.split("\\*");
                String str5 = split3[0];
                int i = 1;
                if (split3.length >= 2) {
                    i = Integer.parseInt(split3[1]);
                }
                C0377t tVar = new C0377t();
                tVar.f2882a = str3;
                tVar.f2883b = str2;
                tVar.f2884c = str5;
                if (lVar != null) {
                    lVar.f2497o.add(tVar);
                } else {
                    tVar.mo2715a();
                }
                C0326av avVar = new C0326av(tVar);
                if (auVar.f2202a == null) {
                    auVar.f2202a = new C0835m();
                }
                avVar.f2204b = i;
                if (str4 != null) {
                    if (str4.endsWith(")")) {
                        for (String str6 : str4.substring(0, str4.length() - 1).split("\\,")) {
                            if (!str6.trim().equals("")) {
                                String[] split4 = str6.split("\\=");
                                if (split4.length != 2) {
                                    throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                                }
                                String trim2 = split4[0].trim();
                                String trim3 = split4[1].trim();
                                if (trim2.equalsIgnoreCase("neutralTeam")) {
                                    avVar.f2205c = C0809ab.m561g(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("setToTeamOfLastAttacker")) {
                                    avVar.f2206d = C0809ab.m561g(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("spawnChance")) {
                                    avVar.f2207e = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                    avVar.f2208f = C0809ab.m557i(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("techLevel")) {
                                    avVar.f2212j = C0809ab.m557i(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("gridAlign")) {
                                    avVar.f2209g = C0809ab.m561g(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("skipIfOverlapping")) {
                                    avVar.f2210h = C0809ab.m561g(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("falling")) {
                                    avVar.f2211i = C0809ab.m561g(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("transportedUnitsToTransfer")) {
                                    avVar.f2222t = (short) C0809ab.m557i(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("alwayStartDirAtZero")) {
                                    avVar.f2213k = C0809ab.m561g(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetX")) {
                                    avVar.f2214l = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetY")) {
                                    avVar.f2215m = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                    float h = C0809ab.m559h(str2, str3, trim3);
                                    avVar.f2218p = h;
                                    avVar.f2219q = h;
                                } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                    avVar.f2218p = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                    avVar.f2219q = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                    avVar.f2216n = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                    avVar.f2220r = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                    avVar.f2217o = C0809ab.m559h(str2, str3, trim3);
                                } else if (!trim2.equalsIgnoreCase("addResources")) {
                                    throw new C0324at("[" + str2 + "]" + str3 + " UnitList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                                } else if (lVar == null) {
                                    throw new C0324at("[" + str2 + "]" + str3 + " addResources not supported from here");
                                } else {
                                    try {
                                        avVar.f2221s = C0363g.m2929a(lVar, trim3);
                                    } catch (C0324at e) {
                                        e.printStackTrace();
                                        throw new C0324at("[" + str2 + "]" + str3 + " addResources:" + e.getMessage());
                                    }
                                }
                            }
                        }
                        if (avVar.f2206d && avVar.f2205c) {
                            throw new C0324at("[" + str2 + "]" + str3 + " Cannot set setToTeamOfLastAttacker and neutralTeam at same time in " + str);
                        }
                    } else {
                        throw new C0324at("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                }
                auVar.f2202a.add(avVar);
            }
        }
        if (!z || (a = auVar.m3071a()) <= 1) {
            return auVar;
        }
        throw new C0324at("[" + str2 + "]" + str3 + " Too many units: " + a + ", only single unit is allowed here");
    }

    /* renamed from: a */
    public int m3071a() {
        if (this.f2202a == null || this.f2202a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f2202a.iterator();
        while (it.hasNext()) {
            i += ((C0326av) it.next()).f2204b;
        }
        return i;
    }

    /* renamed from: b */
    public boolean m3063b() {
        if (this.f2202a == null || this.f2202a.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m3065a(C0835m mVar, AbstractC0171m mVar2, AbstractC0210af afVar, boolean z) {
        m3069a(0.0f, 0.0f, 0.0f, 0.0f, mVar2, false, afVar, mVar, z);
    }

    /* renamed from: a */
    public void m3070a(float f, float f2, float f3, float f4, AbstractC0171m mVar, boolean z, AbstractC0210af afVar) {
        m3069a(f, f2, f3, f4, mVar, z, afVar, null, false);
    }

    /* renamed from: a */
    public void m3069a(float f, float f2, float f3, float f4, AbstractC0171m mVar, boolean z, AbstractC0210af afVar, C0835m mVar2, boolean z2) {
        if (this.f2202a != null && this.f2202a.size() != 0) {
            boolean z3 = false;
            if (!z2) {
                if (mVar.m3431s() > mVar.m3430t() + 300) {
                    z3 = true;
                }
            } else if (mVar.m3494a(true, false) > mVar.m3430t() + 20000) {
                z3 = true;
            }
            if (z3) {
                String str = "";
                if (afVar != null) {
                    str = str + "source:" + afVar.m3304cl();
                }
                AbstractC0789l.m682b("spawnUnitsAt: Skipping, too many units already on team:" + mVar.f1239i + " count:" + mVar.m3431s() + " " + str);
                if (AbstractC0789l.m638u().f5487aV) {
                    mVar.m3514Q();
                }
            } else if (mVar.m3434p() > mVar.m3430t() + 25000) {
                String str2 = "";
                if (afVar != null) {
                    str2 = str2 + "source:" + afVar.m3304cl();
                }
                AbstractC0789l.m682b("spawnUnitsAt: Failsafe, too many units already on team (including ignored):" + mVar.f1239i + " total count:" + mVar.m3434p() + " " + str2);
                if (AbstractC0789l.m638u().f5487aV) {
                    mVar.m3514Q();
                }
            } else {
                AbstractC0789l u = AbstractC0789l.m638u();
                int i = 0;
                int i2 = 0;
                Iterator it = this.f2202a.iterator();
                while (it.hasNext()) {
                    C0326av avVar = (C0326av) it.next();
                    AbstractC0268al c = avVar.f2203a.mo2717c();
                    if (c != null) {
                        for (int i3 = 0; i3 < avVar.f2204b; i3++) {
                            i2++;
                            AbstractC0171m mVar3 = mVar;
                            if (avVar.f2207e >= 1.0f || C0654f.m1501a(afVar, 0.0f, 1.0f, i2) <= avVar.f2207e) {
                                if (avVar.f2206d) {
                                    if (!(afVar == null || afVar.f1437be == null)) {
                                        mVar3 = afVar.f1437be.f1461bB;
                                        if (mVar3 == null) {
                                            throw new RuntimeException("setToTeamOfLastAttacker targetTeam==null");
                                        }
                                    }
                                }
                                if (i >= avVar.f2208f) {
                                    continue;
                                } else {
                                    AbstractC0210af a = c.mo2799a();
                                    if (avVar.f2205c) {
                                        mVar3 = AbstractC0171m.f1236g;
                                    }
                                    if (mVar3 == null) {
                                        throw new RuntimeException("Team==null");
                                    }
                                    a.mo2825d(mVar3);
                                    a.mo2828cx();
                                    a.f5842dH = f;
                                    a.f5843dI = f2;
                                    if (avVar.f2209g) {
                                        u.f5511bt.m3670b(a.f5842dH, a.f5843dI);
                                        a.f5842dH = u.f5511bt.f764M;
                                        a.f5843dI = u.f5511bt.f765N;
                                        a.f5842dH += a.mo2572cH();
                                        a.f5843dI += a.mo2571cI();
                                    }
                                    a.f5844dJ = f3;
                                    if (!a.mo2643bw() && !avVar.f2213k) {
                                        a.f1471bL = f4;
                                    }
                                    a.f5842dH += avVar.f2214l;
                                    a.f5843dI += avVar.f2215m;
                                    a.f5844dJ += avVar.f2216n;
                                    if (avVar.f2212j != -1 && (a instanceof AbstractC0515r)) {
                                        ((AbstractC0515r) a).mo2310a(avVar.f2212j);
                                    }
                                    float f5 = avVar.f2217o;
                                    if (avVar.f2220r != 0.0f) {
                                        f5 += C0654f.m1501a(afVar, -avVar.f2220r, avVar.f2220r, (i2 * 4) + 3);
                                    }
                                    if (f5 != 0.0f) {
                                        if (a instanceof AbstractC0515r) {
                                            ((AbstractC0515r) a).mo2167i(f5);
                                        } else {
                                            a.f1471bL += f5;
                                        }
                                    }
                                    a.f5842dH += i3;
                                    if (avVar.f2218p != 0.0f) {
                                        a.f5842dH += C0654f.m1501a(afVar, -avVar.f2218p, avVar.f2218p, (i2 * 2) + 1);
                                    }
                                    if (avVar.f2219q != 0.0f) {
                                        a.f5843dI += C0654f.m1501a(afVar, -avVar.f2219q, avVar.f2219q, (i2 * 3) + 2);
                                    }
                                    i++;
                                    if (!avVar.f2210h || !(a instanceof AbstractC0515r) || ((AbstractC0515r) a).mo2198bn()) {
                                        if (avVar.f2211i && (a instanceof AbstractC0515r)) {
                                            a.mo2847cK();
                                        }
                                        if (avVar.f2221s != null) {
                                            avVar.f2221s.m2909f(a);
                                        }
                                        if (avVar.f2222t > 0 && afVar != null && (afVar instanceof C0367k)) {
                                            C0367k kVar = (C0367k) afVar;
                                            if (kVar.f2462x != null) {
                                                for (int i4 = avVar.f2222t; i4 > 0; i4--) {
                                                    int i5 = -1;
                                                    int size = kVar.f2462x.size() - 1;
                                                    while (true) {
                                                        if (size < 0) {
                                                            break;
                                                        } else if (a.m3311c((AbstractC0210af) kVar.f2462x.get(size), true)) {
                                                            i5 = size;
                                                            break;
                                                        } else {
                                                            size--;
                                                        }
                                                    }
                                                    if (i5 == -1) {
                                                        break;
                                                    }
                                                    AbstractC0210af afVar2 = (AbstractC0210af) kVar.f2462x.remove(i5);
                                                    C0851y.m422a(afVar2, kVar);
                                                    kVar.m2804z(afVar2);
                                                    afVar2.f5842dH = a.f5842dH;
                                                    afVar2.f5843dI = a.f5843dI;
                                                    afVar2.f1471bL = a.f1471bL;
                                                    if (afVar2 instanceof AbstractC0515r) {
                                                        ((AbstractC0515r) afVar2).m2229ax();
                                                    }
                                                    if (!a.mo2495e(afVar2, true)) {
                                                        AbstractC0789l.m682b("transportedUnitsToTransfer failed for: " + afVar2.m3304cl() + " to: " + a.m3304cl());
                                                        afVar2.m3319bU();
                                                    }
                                                }
                                            }
                                        }
                                        AbstractC0171m.m3473c(a);
                                        if (a.mo2643bw() && (a instanceof AbstractC0515r)) {
                                            u.f5520bC.m957a((AbstractC0515r) a);
                                        }
                                        if (z && !a.mo1607o_()) {
                                            AbstractC0789l.m638u().f5518bA.m1668k(a);
                                        }
                                        if (mVar2 != null) {
                                            mVar2.add(a);
                                        }
                                    } else {
                                        a.m3319bU();
                                    }
                                }
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C0325au m3066a(C0707k kVar, boolean z) {
        int f = kVar.m1062f();
        if (z && f == 0) {
            return null;
        }
        C0325au auVar = new C0325au();
        for (int i = 0; i < f; i++) {
            C0326av avVar = new C0326av(null);
            AbstractC0268al p = kVar.m1052p();
            if (p != null) {
                if (auVar.f2202a == null) {
                    auVar.f2202a = new C0835m();
                }
                avVar.f2203a = C0368l.m2795a(p);
            }
            if (kVar.m1071b() >= 75 && kVar.m1063e()) {
                avVar.f2204b = kVar.m1062f();
                avVar.f2205c = kVar.m1063e();
                avVar.f2206d = kVar.m1063e();
                if (kVar.m1071b() >= 76) {
                    avVar.f2207e = kVar.m1061g();
                }
            }
            if (p != null) {
                auVar.f2202a.add(avVar);
            }
        }
        return auVar;
    }
}
