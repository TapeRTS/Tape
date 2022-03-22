package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0373p;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.p013a.C0179a;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p032d.C0647w;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/b.class */
public class C0300b extends C0179a {

    /* renamed from: b */
    public LogicBoolean f1862b;

    /* renamed from: c */
    public LogicBoolean f1863c;

    /* renamed from: d */
    public C0311ag f1864d;

    /* renamed from: e */
    public LogicBoolean f1865e;

    /* renamed from: f */
    public C0311ag f1866f;

    /* renamed from: g */
    public LogicBoolean f1867g;

    /* renamed from: h */
    public C0311ag f1868h;

    /* renamed from: i */
    public LogicBoolean f1869i;

    /* renamed from: j */
    public C0363g f1870j;

    /* renamed from: k */
    public C0363g f1871k;

    /* renamed from: a */
    public static C0179a m3187a(C0301c cVar) {
        boolean z = false;
        if (!(cVar.f1892u == null || cVar.f1892u == LogicBoolean.falseBoolean)) {
            z = true;
        }
        if (!(cVar.f1894w == null || cVar.f1894w == LogicBoolean.falseBoolean)) {
            z = true;
        }
        if (!(cVar.f1896y == null || cVar.f1896y == LogicBoolean.falseBoolean)) {
            z = true;
        }
        if (!(cVar.f1889r == null || cVar.f1889r == LogicBoolean.trueBoolean)) {
            z = true;
        }
        if (!(cVar.f1945av == null || cVar.f1945av == LogicBoolean.falseBoolean)) {
            z = true;
        }
        if (cVar.f1922Y != null) {
            z = true;
        }
        if (cVar.f1886o != null) {
            z = true;
        }
        if (!z) {
            return C0179a.f1323a;
        }
        C0300b bVar = new C0300b();
        bVar.f1863c = cVar.f1892u;
        bVar.f1864d = cVar.f1893v;
        bVar.f1865e = cVar.f1894w;
        bVar.f1866f = cVar.f1895x;
        bVar.f1867g = cVar.f1896y;
        bVar.f1868h = cVar.f1897z;
        bVar.f1862b = cVar.f1889r;
        bVar.f1869i = cVar.f1945av;
        bVar.f1871k = cVar.f1922Y;
        bVar.f1870j = cVar.f1886o;
        return bVar;
    }

    /* renamed from: a */
    public static C0179a m3186a(C0373p pVar) {
        boolean z = false;
        if (!(pVar.f2874f == null || pVar.f2874f == LogicBoolean.falseBoolean)) {
            z = true;
        }
        if (!z) {
            return C0179a.f1323a;
        }
        C0300b bVar = new C0300b();
        bVar.f1863c = pVar.f2874f;
        bVar.f1864d = pVar.f2875g;
        return bVar;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0179a
    /* renamed from: a */
    public boolean mo3191a(AbstractC0210af afVar) {
        return m3190a(afVar, -1);
    }

    /* renamed from: a */
    public boolean m3190a(AbstractC0210af afVar, int i) {
        if (this.f1863c != null && (i == -1 || i == 1)) {
            if (!(afVar instanceof C0367k)) {
                AbstractC0789l.m644m("CustomActionConfig lockedInGame:" + afVar.mo1606r().mo2754i() + " is not a custom unit");
                return false;
            } else if (this.f1863c.read((C0367k) afVar)) {
                return true;
            }
        }
        if (this.f1865e != null && (i == -1 || i == 2)) {
            if (!(afVar instanceof C0367k)) {
                AbstractC0789l.m644m("CustomActionConfig lockedInGame:" + afVar.mo1606r().mo2754i() + " is not a custom unit");
                return false;
            } else if (this.f1865e.read((C0367k) afVar)) {
                return true;
            }
        }
        if (this.f1867g == null) {
            return false;
        }
        if (i != -1 && i != 3) {
            return false;
        }
        if (!(afVar instanceof C0367k)) {
            AbstractC0789l.m644m("CustomActionConfig lockedInGame:" + afVar.mo1606r().mo2754i() + " is not a custom unit");
            return false;
        } else if (this.f1867g.read((C0367k) afVar)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0179a
    /* renamed from: b */
    public String mo3185b(AbstractC0210af afVar) {
        if (m3190a(afVar, 1) && this.f1864d != null) {
            return this.f1864d.m3100b();
        }
        if (m3190a(afVar, 2) && this.f1866f != null) {
            return this.f1866f.m3100b();
        }
        if (!m3190a(afVar, 3) || this.f1868h == null) {
            return null;
        }
        return this.f1868h.m3100b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0179a
    /* renamed from: a */
    public boolean mo3188a(AbstractC0210af afVar, boolean z) {
        if (this.f1862b == null) {
            return true;
        }
        if (!(afVar instanceof C0367k)) {
            AbstractC0789l.m644m("CustomActionConfig isAvailable:" + afVar.mo1606r().mo2754i() + " is not a custom unit");
            return true;
        } else if (z) {
            return C0647w.m1591a(this.f1862b, (C0367k) afVar);
        } else {
            return this.f1862b.read((C0367k) afVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0179a
    /* renamed from: c */
    public boolean mo3184c(AbstractC0210af afVar) {
        if (this.f1869i == null) {
            return false;
        }
        if (afVar instanceof C0367k) {
            return this.f1869i.read((C0367k) afVar);
        }
        AbstractC0789l.m644m("CustomActionConfig isGuiBlinking:" + afVar.mo1606r().mo2754i() + " is not a custom unit");
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0179a
    /* renamed from: a */
    public void mo3189a(AbstractC0210af afVar, AbstractC0210af afVar2) {
        if (this.f1871k != null) {
            this.f1871k.m2909f(afVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0179a
    /* renamed from: a */
    public C0363g mo3192a() {
        return this.f1870j;
    }
}
