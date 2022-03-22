package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0465h;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/z.class */
public class C0204z extends AbstractC0197s {

    /* renamed from: a */
    AbstractC0268al f1386a;

    /* renamed from: d */
    boolean f1389d;

    /* renamed from: i */
    int f1391i;

    /* renamed from: b */
    ArrayList f1387b = new ArrayList();

    /* renamed from: c */
    int f1388c = 0;

    /* renamed from: e */
    AbstractC0515r f1390e = null;

    public C0204z(AbstractC0268al alVar) {
        super("s_" + alVar.mo2734v());
        this.f1354f = -9999.0f;
        this.f1386a = alVar;
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

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: i */
    public AbstractC0268al mo2412i() {
        return this.f1386a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return EnumC0199u.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        if (!AbstractC0789l.m699aj() || C0623f.f4403bw) {
            return EnumC0198t.infoOnly;
        }
        return EnumC0198t.infoOnlyNoBox;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public boolean mo2409c(AbstractC0210af afVar, boolean z) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (z) {
            Iterator it = AbstractC0210af.f1442bj.iterator();
            while (it.hasNext()) {
                AbstractC0210af afVar2 = (AbstractC0210af) it.next();
                if (afVar2.f1494ci && afVar2.mo1606r() == this.f1386a) {
                    u.f5518bA.m1666l(afVar2);
                }
            }
            return true;
        } else if (u.f5518bA.m1659p() == 1) {
            return false;
        } else {
            Iterator it2 = AbstractC0210af.f1442bj.iterator();
            while (it2.hasNext()) {
                AbstractC0210af afVar3 = (AbstractC0210af) it2.next();
                if (afVar3.f1494ci && afVar3.mo1606r() != this.f1386a) {
                    u.f5518bA.m1666l(afVar3);
                }
            }
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        AbstractC0789l.m638u();
        if (this.f1390e instanceof C0465h) {
            return "Editor";
        }
        return "" + this.f1386a.mo2762e() + " x" + this.f1388c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public String mo2414c(AbstractC0210af afVar) {
        return mo2380a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: o */
    public boolean mo3361o() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: q */
    public boolean mo3161q() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: z */
    public boolean mo3359z() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        String str = "";
        if (this.f1390e instanceof C0465h) {
            return "Editor";
        }
        if (this.f1389d) {
            str = "(Left click to exclusively select / Right click to unselect)\n";
        }
        return this.f1386a.mo2762e() + "\n" + str + this.f1386a.mo2760f();
    }

    /* renamed from: t */
    public void m3360t() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f1391i != u.f5518bA.f4320S) {
            this.f1391i = u.f5518bA.f4320S;
            this.f1388c = 0;
            this.f1389d = false;
            this.f1390e = null;
            AbstractC0210af[] a = u.f5518bA.f4412bF.m456a();
            int size = u.f5518bA.f4412bF.size();
            for (int i = 0; i < size; i++) {
                AbstractC0210af afVar = a[i];
                if (afVar instanceof AbstractC0515r) {
                    AbstractC0515r rVar = (AbstractC0515r) afVar;
                    if (rVar.f1494ci) {
                        if (rVar.mo1606r() == this.f1386a) {
                            this.f1388c++;
                            if (this.f1390e == null) {
                                this.f1390e = rVar;
                            }
                        } else {
                            this.f1389d = true;
                        }
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j_ */
    public float mo3363j_() {
        return this.f1354f - this.f1388c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: D */
    public boolean mo3364D() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: l_ */
    public boolean mo3362l_() {
        return true;
    }
}
