package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Color;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.p027g.C0464c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0538ad;
import com.corrodinggames.rts.gameFramework.p032d.C0599a;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.a.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/s.class */
public abstract class AbstractC0197s implements Comparable {

    /* renamed from: f */
    public float f1354f = -999.0f;

    /* renamed from: g */
    public C0179a f1355g = C0179a.f1323a;

    /* renamed from: h */
    public static final C0181c f1356h = C0181c.f1325a;

    /* renamed from: a */
    private C0181c f1357a;

    /* renamed from: b */
    private C0363g f1358b;

    /* renamed from: b */
    public abstract String mo2379b();

    /* renamed from: a */
    public abstract String mo2380a();

    /* renamed from: c */
    public abstract int mo2415c();

    /* renamed from: b */
    public abstract int mo2416b(AbstractC0210af afVar, boolean z);

    /* renamed from: i */
    public abstract AbstractC0268al mo2412i();

    /* renamed from: g */
    public abstract boolean mo2413g();

    /* renamed from: e */
    public abstract EnumC0199u mo2377e();

    /* renamed from: f */
    public abstract EnumC0198t mo2376f();

    /* renamed from: j_ */
    public float mo3363j_() {
        if (this instanceof C0193o) {
            return -100.0f;
        }
        if (this.f1354f != -999.0f) {
            return this.f1354f;
        }
        AbstractC0268al i = mo2412i();
        if (i == null || !mo2413g()) {
            return 1.0f;
        }
        return i.mo2758g();
    }

    /* renamed from: a */
    public int compareTo(AbstractC0197s sVar) {
        if (sVar == null) {
            return 0;
        }
        float j_ = mo3363j_() - sVar.mo3363j_();
        if (j_ < 0.0f) {
            return -1;
        }
        return j_ > 0.0f ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass() || !this.f1357a.equals(((AbstractC0197s) obj).f1357a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m3381b(C0181c cVar) {
        if (cVar == null || cVar == f1356h) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m3380c(C0181c cVar) {
        return !m3381b(cVar);
    }

    /* renamed from: a */
    public static boolean m3384a(AbstractC0197s sVar, AbstractC0197s sVar2) {
        return sVar == sVar2;
    }

    /* renamed from: d */
    public final boolean m3379d(C0181c cVar) {
        return this.f1357a == cVar;
    }

    public AbstractC0197s(int i) {
        m3382a(String.valueOf(i));
    }

    public AbstractC0197s(String str) {
        m3382a(str);
    }

    public AbstractC0197s(C0181c cVar) {
        m3377e(cVar);
    }

    /* renamed from: a */
    public final void m3382a(String str) {
        this.f1357a = C0181c.m3412a(str);
    }

    /* renamed from: e */
    public final void m3377e(C0181c cVar) {
        this.f1357a = cVar;
    }

    /* renamed from: J */
    public final C0181c m3387J() {
        return this.f1357a;
    }

    /* renamed from: w */
    public C0181c mo3372w() {
        return m3387J();
    }

    /* renamed from: K */
    public final String m3386K() {
        if (this.f1357a == null) {
            return "<null index>";
        }
        return this.f1357a.m3415a();
    }

    /* renamed from: e */
    public String mo3171e(AbstractC0210af afVar) {
        return mo2379b();
    }

    /* renamed from: f */
    public String mo3170f(AbstractC0210af afVar) {
        return mo2380a();
    }

    /* renamed from: y */
    public C0363g mo3154y() {
        C0363g a = this.f1355g.mo3192a();
        if (a != null) {
            return a;
        }
        int c = mo2415c();
        if (c == 0) {
            return C0363g.f2422a;
        }
        if (this.f1358b == null || this.f1358b.m2942a() != c) {
            this.f1358b = C0363g.m2941a(c);
        }
        return this.f1358b;
    }

    /* renamed from: k_ */
    public boolean mo3370k_() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3169h(AbstractC0210af afVar) {
        return this.f1355g.mo3191a(afVar);
    }

    /* renamed from: k */
    public String mo3166k(AbstractC0210af afVar) {
        return this.f1355g.mo3185b(afVar);
    }

    /* renamed from: a */
    public void mo3383a(AbstractC0210af afVar, AbstractC0210af afVar2) {
        this.f1355g.mo3189a(afVar, afVar2);
    }

    /* renamed from: d */
    public boolean mo3172d(AbstractC0210af afVar, boolean z) {
        return true;
    }

    /* renamed from: l */
    public boolean mo3165l(AbstractC0210af afVar) {
        return false;
    }

    /* renamed from: m */
    public boolean mo3164m(AbstractC0210af afVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo2386a(AbstractC0210af afVar, boolean z) {
        if (mo3169h(afVar) || C0464c.m2440a(afVar, m3387J()) > 0) {
            return false;
        }
        if (z) {
            return mo3154y().m2910e(afVar, mo3176L());
        }
        return mo3154y().m2921b(afVar, false);
    }

    /* renamed from: s */
    public boolean mo3159s(AbstractC0210af afVar) {
        return mo2381a(afVar);
    }

    /* renamed from: a */
    public boolean mo2381a(AbstractC0210af afVar) {
        return this.f1355g.mo3188a(afVar, false);
    }

    /* renamed from: a */
    public boolean mo3174a(AbstractC0210af afVar, AbstractC0171m mVar) {
        return false;
    }

    /* renamed from: q */
    public boolean mo3161q() {
        return false;
    }

    /* renamed from: h */
    public boolean mo2382h() {
        return false;
    }

    /* renamed from: z */
    public boolean mo3359z() {
        return false;
    }

    /* renamed from: A */
    public boolean mo3371A() {
        return true;
    }

    /* renamed from: x */
    public boolean mo3155x() {
        return false;
    }

    /* renamed from: v */
    public AbstractC0268al mo3156v() {
        return null;
    }

    /* renamed from: B */
    public AbstractC0268al mo3182B() {
        return null;
    }

    /* renamed from: C */
    public boolean mo3181C() {
        return false;
    }

    /* renamed from: p */
    public int mo3369p() {
        return 1;
    }

    /* renamed from: n */
    public boolean mo3163n(AbstractC0210af afVar) {
        return false;
    }

    /* renamed from: o */
    public boolean mo3162o(AbstractC0210af afVar) {
        return false;
    }

    /* renamed from: d */
    public String mo2378d() {
        String str = null;
        AbstractC0789l u = AbstractC0789l.m638u();
        int i = 0;
        AbstractC0210af[] a = u.f5518bA.f4412bF.m456a();
        int size = u.f5518bA.f4412bF.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0210af afVar = a[i2];
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (str == null) {
                    str = mo3171e(rVar);
                }
                int b = mo2416b(rVar, true);
                if (!(b == -1 || b == 0)) {
                    i += b;
                }
            }
        }
        if (str == null) {
            str = mo2379b();
        }
        if (!(i == -1 || i == 0)) {
            str = str + " (" + i + ")";
        }
        return str;
    }

    /* renamed from: c */
    public String mo2414c(AbstractC0210af afVar) {
        C0363g y;
        String e = mo3171e(afVar);
        EnumC0198t f = mo2376f();
        if (!mo3154y().m2925b() && f != EnumC0198t.infoOnlyStockpile) {
            e = e + " (" + y.m2926a(false, true, 5, true) + ")";
        }
        String a = C0599a.m1856a(this, false);
        if (a != null && !"".equals(a)) {
            e = e + "\n" + a;
        }
        String f2 = mo3170f(afVar);
        if (f2 != null && !"".equals(f2)) {
            e = (e + "\n") + f2;
        }
        return e.trim();
    }

    /* renamed from: c */
    public boolean mo2409c(AbstractC0210af afVar, boolean z) {
        return false;
    }

    /* renamed from: g */
    public void mo2675g(AbstractC0210af afVar) {
    }

    /* renamed from: r */
    public C0748e mo3160r() {
        if (mo2376f() == EnumC0198t.upgrade) {
            return AbstractC0789l.m638u().f5518bA.f4383bd;
        }
        return null;
    }

    /* renamed from: i */
    public C0748e mo3168i(AbstractC0210af afVar) {
        return null;
    }

    /* renamed from: G */
    public int mo3178G() {
        return Color.m4213a(100, 255, 255, 255);
    }

    /* renamed from: s */
    public Rect mo3374s() {
        return null;
    }

    /* renamed from: j */
    public AbstractC0210af mo3167j(AbstractC0210af afVar) {
        return null;
    }

    /* renamed from: t */
    public boolean mo3158t(AbstractC0210af afVar) {
        return true;
    }

    /* renamed from: u */
    public boolean mo3157u(AbstractC0210af afVar) {
        return true;
    }

    /* renamed from: b */
    public boolean mo2410b(AbstractC0210af afVar) {
        return this.f1355g.mo3184c(afVar);
    }

    /* renamed from: o */
    public boolean mo3361o() {
        return false;
    }

    /* renamed from: p */
    public boolean mo3376p(AbstractC0210af afVar) {
        return true;
    }

    /* renamed from: D */
    public boolean mo3364D() {
        return false;
    }

    /* renamed from: d */
    public void mo3378d(AbstractC0210af afVar) {
    }

    /* renamed from: j */
    public float mo2375j() {
        return 1.0f;
    }

    /* renamed from: k */
    public int mo2374k() {
        return -1;
    }

    /* renamed from: E */
    public boolean mo3180E() {
        return false;
    }

    /* renamed from: F */
    public boolean mo3179F() {
        return false;
    }

    /* renamed from: u */
    public boolean mo3373u() {
        return false;
    }

    /* renamed from: q */
    public float mo3368q(AbstractC0210af afVar) {
        return -1.0f;
    }

    /* renamed from: r */
    public ArrayList mo3375r(AbstractC0210af afVar) {
        return null;
    }

    /* renamed from: I */
    public C0538ad mo3388I() {
        return null;
    }

    /* renamed from: l_ */
    public boolean mo3362l_() {
        return false;
    }

    /* renamed from: L */
    public boolean mo3176L() {
        return false;
    }

    /* renamed from: a */
    public void mo3173a(AbstractC0515r rVar) {
    }
}
