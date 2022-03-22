package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0465h;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p032d.C0599a;
import com.corrodinggames.rts.gameFramework.p036g.C0702f;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.units.a.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/y.class */
public class C0203y extends AbstractC0197s {

    /* renamed from: a */
    public boolean f1385a;

    public C0203y(boolean z) {
        super("c_5");
        this.f1354f = -9990.0f;
        this.f1385a = z;
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
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return EnumC0199u.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        return EnumC0198t.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        return false;
    }

    /* renamed from: t */
    public AbstractC0515r m3365t() {
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0210af[] a = u.f5518bA.f4412bF.m456a();
        int size = u.f5518bA.f4412bF.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1494ci) {
                    return rVar;
                }
            }
        }
        return null;
    }

    /* renamed from: H */
    public boolean m3366H() {
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0515r t = m3365t();
        if (t != null) {
            return (t instanceof C0465h) || u.f5493bb == t.f1461bB;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        String str = "UnitInfo";
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0515r t = m3365t();
        if (t != null) {
            if (t instanceof C0465h) {
                return "Editor";
            }
            if (!this.f1385a) {
                str = u.f5518bA.f4279d.m1853a((AbstractC0210af) t, false);
            } else {
                str = u.f5518bA.f4279d.m1860a(t.f1461bB);
            }
        }
        return str;
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
        if (!this.f1385a || !m3366H()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: q */
    public boolean mo3161q() {
        if (this.f1385a) {
            return false;
        }
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
        AbstractC0515r t;
        C0702f fVar;
        if (this.f1385a || (t = m3365t()) == null) {
            return "";
        }
        String a = C0599a.m1852a(t, true, true, false);
        if (0 != 0) {
            try {
                t.mo400a(new C0702f());
            } catch (IOException e) {
                e.printStackTrace();
            }
            a = a + "\n" + fVar.f4967a;
        }
        return a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: D */
    public boolean mo3364D() {
        return true;
    }
}
