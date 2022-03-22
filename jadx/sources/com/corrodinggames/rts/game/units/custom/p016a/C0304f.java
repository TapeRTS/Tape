package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0377t;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p032d.C0599a;
import com.corrodinggames.rts.gameFramework.p032d.C0647w;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/f.class */
public class C0304f extends AbstractC0201w {

    /* renamed from: a */
    public C0301c f1964a;

    /* renamed from: b */
    public C0377t f1965b;

    /* renamed from: c */
    public EnumC0302d f1966c;

    public C0304f(C0301c cVar, C0377t tVar) {
        super((String) null);
        this.f1966c = EnumC0302d.disabled;
        String str = "";
        m3382a((cVar.f1881j != null ? str + cVar.f1881j : str) + "_" + cVar.f1872a);
        this.f1964a = cVar;
        this.f1965b = tVar;
        if (cVar.f1902E != null) {
            this.f1965b = cVar.f1902E;
        }
        this.f1966c = cVar.f1953aD;
        if (this.f1966c == EnumC0302d.auto) {
            boolean z = false;
            boolean z2 = false;
            if (cVar.f1924aa != null && cVar.f1925ab == null) {
                z2 = true;
            }
            if (cVar.f1886o.m2918c()) {
                z = true;
                this.f1966c = EnumC0302d.upgrade;
            }
            if (!z || z2) {
                this.f1966c = EnumC0302d.movementChange;
            } else {
                this.f1966c = EnumC0302d.upgrade;
            }
        }
        if (cVar.f1901D != null) {
            this.f1966c = EnumC0302d.sameAsBuilding;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: C */
    public boolean mo3181C() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public boolean mo3172d(AbstractC0210af afVar, boolean z) {
        return this.f1964a.f1905H;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: l */
    public boolean mo3165l(AbstractC0210af afVar) {
        return this.f1964a.f1907J;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: m */
    public boolean mo3164m(AbstractC0210af afVar) {
        return this.f1964a.f1908K;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: q */
    public boolean mo3161q() {
        return super.mo3161q();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo2386a(AbstractC0210af afVar, boolean z) {
        C0367k kVar = (C0367k) afVar;
        if (!this.f1964a.f1906I && kVar.mo2589a(m3387J(), z) > 0) {
            return false;
        }
        if (this.f1964a.f1888q != null) {
            if (!z || !mo3176L()) {
                if (!this.f1964a.f1888q.read(kVar)) {
                    return false;
                }
            } else if (!C0647w.m1591a(this.f1964a.f1888q, kVar)) {
                return false;
            }
        }
        return super.mo2386a(afVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: h */
    public boolean mo3169h(AbstractC0210af afVar) {
        if (m3175a(afVar, -1)) {
            return true;
        }
        return super.mo3169h(afVar);
    }

    /* renamed from: a */
    public boolean m3175a(AbstractC0210af afVar, int i) {
        if (this.f1964a.f1892u != null && (i == -1 || i == 1)) {
            if (!(afVar instanceof C0367k)) {
                AbstractC0789l.m644m("CustomActionConfig lockedInGame:" + afVar.mo1606r().mo2754i() + " is not a custom unit");
                return false;
            } else if (this.f1964a.f1892u.read((C0367k) afVar)) {
                return true;
            }
        }
        if (this.f1964a.f1894w != null && (i == -1 || i == 2)) {
            if (!(afVar instanceof C0367k)) {
                AbstractC0789l.m644m("CustomActionConfig lockedInGame:" + afVar.mo1606r().mo2754i() + " is not a custom unit");
                return false;
            } else if (this.f1964a.f1894w.read((C0367k) afVar)) {
                return true;
            }
        }
        if (this.f1964a.f1896y == null) {
            return false;
        }
        if (i != -1 && i != 3) {
            return false;
        }
        if (!(afVar instanceof C0367k)) {
            AbstractC0789l.m644m("CustomActionConfig lockedInGame:" + afVar.mo1606r().mo2754i() + " is not a custom unit");
            return false;
        } else if (this.f1964a.f1896y.read((C0367k) afVar)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: k */
    public String mo3166k(AbstractC0210af afVar) {
        if (m3175a(afVar, 1) && this.f1964a.f1893v != null) {
            return this.f1964a.f1893v.m3100b();
        }
        if (m3175a(afVar, 2) && this.f1964a.f1895x != null) {
            return this.f1964a.f1895x.m3100b();
        }
        if (!m3175a(afVar, 3) || this.f1964a.f1897z == null) {
            return super.mo3166k(afVar);
        }
        return this.f1964a.f1897z.m3100b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: s */
    public boolean mo3159s(AbstractC0210af afVar) {
        C0367k kVar = (C0367k) afVar;
        if (this.f1964a.f1889r == null) {
            return super.mo2381a(afVar);
        }
        if (mo3176L()) {
            return C0647w.m1591a(this.f1964a.f1889r, kVar);
        }
        return this.f1964a.f1889r.read(kVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo2381a(AbstractC0210af afVar) {
        C0367k kVar = (C0367k) afVar;
        if (this.f1964a.f1889r != null) {
            return this.f1964a.f1889r.read(kVar);
        }
        return super.mo2381a(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo3174a(AbstractC0210af afVar, AbstractC0171m mVar) {
        if (!this.f1964a.f1890s && !this.f1964a.f1891t) {
            return false;
        }
        if (afVar.f1461bB.m3464d(mVar)) {
            return this.f1964a.f1890s;
        }
        return this.f1964a.f1891t;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public int mo2416b(AbstractC0210af afVar, boolean z) {
        if (this.f1964a.f1948ay) {
            return this.f1964a.f1886o.m2935a(afVar, true);
        }
        return super.mo2416b(afVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        return super.mo2378d();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        String str = null;
        if (this.f1964a.f1874c != null) {
            str = this.f1964a.f1874c.m3100b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public String mo3171e(AbstractC0210af afVar) {
        AbstractC0268al typeOrNull;
        String str = null;
        if (this.f1964a.f1874c != null) {
            str = this.f1964a.f1874c.m3100b();
        }
        if (!(this.f1964a.f1875d == null || (typeOrNull = this.f1964a.f1875d.getTypeOrNull(afVar)) == null)) {
            if (str == null) {
                str = "";
            } else if (!str.equals("")) {
                str = str + " ";
            }
            str = str + typeOrNull.mo2762e();
        }
        if (this.f1964a.f1878g != null) {
            if (str == null) {
                str = "";
            } else if (!str.equals("")) {
                str = str + " ";
            }
            str = str + this.f1964a.f1878g.m3100b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        String str = null;
        if (this.f1964a.f1879h != null) {
            str = this.f1964a.f1879h.m3100b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public String mo3170f(AbstractC0210af afVar) {
        AbstractC0210af unitReferenceOrNull;
        AbstractC0210af unitOrSharedUnit;
        AbstractC0268al typeOrNull;
        String str = null;
        if (this.f1964a.f1879h != null) {
            str = this.f1964a.f1879h.m3100b();
        }
        if (!(this.f1964a.f1876e == null || (typeOrNull = this.f1964a.f1876e.getTypeOrNull(afVar)) == null)) {
            if (str == null) {
                str = "";
            } else if (!str.equals("")) {
                str = str + " ";
            }
            str = str + typeOrNull.mo2760f();
        }
        if (this.f1964a.f1877f != null) {
            if (this.f1964a.f1877f.getUnitReferenceOrNull(afVar) != null) {
                if (str == null) {
                    str = "";
                } else if (!str.equals("")) {
                    str = str + "\n\n";
                }
                str = str + C0599a.m1852a(unitReferenceOrNull, false, false, false);
            } else {
                if (this.f1964a.f1877f.getUnitOrSharedUnit(afVar) != null) {
                    if (str == null) {
                        str = "";
                    } else if (!str.equals("")) {
                        str = str + "\n\n";
                    }
                    str = str + C0599a.m1852a(unitOrSharedUnit, false, false, true);
                }
            }
        }
        return str;
    }

    /* renamed from: H */
    public boolean m3177H() {
        return this.f1964a.f1912O;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
    /* renamed from: t */
    public float mo2543t() {
        if (this.f1964a.f1910M >= 1.0f) {
            return 1000.0f;
        }
        return this.f1964a.f1910M;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return this.f1964a.f1880i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: y */
    public C0363g mo3154y() {
        return this.f1964a.f1886o;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public int mo2415c() {
        return this.f1964a.f1886o.m2942a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: i */
    public AbstractC0268al mo2412i() {
        if (this.f1965b == null) {
            return null;
        }
        return this.f1965b.mo2717c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: v */
    public AbstractC0268al mo3156v() {
        if (this.f1964a.f1902E != null) {
            return this.f1964a.f1902E.mo2717c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: B */
    public AbstractC0268al mo3182B() {
        if (this.f1964a.f1901D != null) {
            return this.f1964a.f1901D.mo2717c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: x */
    public boolean mo3155x() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        if (this.f1964a.f1902E != null) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        return this.f1964a.f1946aw;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: n */
    public boolean mo3163n(AbstractC0210af afVar) {
        return this.f1964a.f1899B.read((C0367k) afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: o */
    public boolean mo3162o(AbstractC0210af afVar) {
        if (this.f1964a.f1898A == null) {
            return false;
        }
        if (afVar instanceof C0367k) {
            return this.f1964a.f1898A.read((C0367k) afVar);
        }
        AbstractC0789l.m682b("ai_isHighPriority non customUnit:" + afVar.mo1606r().mo2754i());
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: E */
    public boolean mo3180E() {
        return this.f1964a.f1903F;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: F */
    public boolean mo3179F() {
        return this.f1964a.f1904G;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: r */
    public C0748e mo3160r() {
        return this.f1964a.f1938ao;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: i */
    public C0748e mo3168i(AbstractC0210af afVar) {
        if (this.f1964a.f1941ar == null || !(afVar instanceof C0367k) || C0647w.m1591a(this.f1964a.f1941ar, (C0367k) afVar)) {
            return this.f1964a.f1939ap;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: G */
    public int mo3178G() {
        return this.f1964a.f1940aq;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j */
    public AbstractC0210af mo3167j(AbstractC0210af afVar) {
        if (this.f1964a.f1942as != null) {
            return this.f1964a.f1942as.getUnitOrSharedUnit(afVar);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: t */
    public boolean mo3158t(AbstractC0210af afVar) {
        return this.f1964a.f1943at;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: u */
    public boolean mo3157u(AbstractC0210af afVar) {
        return this.f1964a.f1944au;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public boolean mo2410b(AbstractC0210af afVar) {
        if (this.f1964a.f1945av != null) {
            return C0647w.m1591a(this.f1964a.f1945av, (C0367k) afVar);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: L */
    public boolean mo3176L() {
        return this.f1964a.f1884m;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public void mo3173a(AbstractC0515r rVar) {
        if (this.f1964a.f1922Y != null) {
            C0647w.m1589b(rVar, this.f1964a.f1922Y);
        }
    }
}
