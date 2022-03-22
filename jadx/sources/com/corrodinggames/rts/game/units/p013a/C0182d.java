package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0178a;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0651e;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/d.class */
public class C0182d extends AbstractC0197s {

    /* renamed from: a */
    int f1327a;

    /* renamed from: b */
    EnumC0178a f1328b;

    public C0182d() {
        super("c_7");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public int mo2416b(AbstractC0210af afVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public int mo2415c() {
        return 0;
    }

    /* renamed from: l */
    public EnumC0215ak mo2412i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return EnumC0199u.directToAction;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        return EnumC0198t.none;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return "Attack Mode";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        EnumC0178a m = m3409m();
        if (m != null) {
            return m.name();
        }
        return "NA";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public String mo2414c(AbstractC0210af afVar) {
        return mo2380a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public void mo3378d(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        EnumC0178a a = m3411a(m3408n());
        C0651e b = u.f5531bN.m1899b(afVar.f1461bB);
        Iterator it = AbstractC0210af.f1442bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if (afVar2 instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar2;
                if (rVar.f1494ci) {
                    b.m1563a(rVar);
                }
            }
        }
        b.m1566a(a);
        this.f1327a = u.f5518bA.f4320S;
        this.f1328b = a;
    }

    /* renamed from: a */
    public EnumC0178a m3411a(EnumC0178a aVar) {
        if (aVar == EnumC0178a.onlyInRange) {
            return EnumC0178a.guardArea;
        }
        if (aVar == EnumC0178a.onlyInRange) {
            return EnumC0178a.aggressive;
        }
        return EnumC0178a.onlyInRange;
    }

    /* renamed from: m */
    public EnumC0178a m3409m() {
        AbstractC0789l u = AbstractC0789l.m638u();
        EnumC0178a n = m3408n();
        this.f1327a = u.f5518bA.f4320S;
        this.f1328b = n;
        return n;
    }

    /* renamed from: n */
    public EnumC0178a m3408n() {
        if (this.f1327a == AbstractC0789l.m638u().f5518bA.f4320S && this.f1328b != null) {
            return this.f1328b;
        }
        EnumC0178a aVar = null;
        Iterator it = AbstractC0210af.f1442bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1494ci) {
                    if (aVar == null || aVar == rVar.f3397G) {
                        aVar = rVar.f3397G;
                    } else {
                        aVar = EnumC0178a.mixed;
                    }
                }
            }
        }
        return aVar;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo2381a(AbstractC0210af afVar) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        return mo2379b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: o */
    public boolean mo3361o() {
        return true;
    }
}
