package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/h.class */
public class C0186h extends AbstractC0197s {

    /* renamed from: a */
    AbstractC0197s f1334a;

    /* renamed from: b */
    C0180b f1335b;

    /* renamed from: c */
    boolean f1336c;

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j_ */
    public float mo3363j_() {
        return this.f1334a.mo3363j_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public int compareTo(AbstractC0197s sVar) {
        return this.f1334a.compareTo(sVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        return this.f1334a.mo2379b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public String mo3171e(AbstractC0210af afVar) {
        return this.f1334a.mo3171e(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return this.f1334a.mo2380a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public String mo3170f(AbstractC0210af afVar) {
        return this.f1334a.mo3170f(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public int mo2415c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public int mo2416b(AbstractC0210af afVar, boolean z) {
        return this.f1334a.mo2416b(afVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: k_ */
    public boolean mo3370k_() {
        return this.f1334a.mo3370k_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo2386a(AbstractC0210af afVar, boolean z) {
        if (this.f1336c) {
            return this.f1334a.mo2386a(afVar, z);
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: p */
    public int mo3369p() {
        return this.f1334a.mo3369p();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public void mo2675g(AbstractC0210af afVar) {
        this.f1334a.mo2675g(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    public boolean equals(Object obj) {
        if (obj instanceof C0186h) {
            return this.f1334a.equals(((C0186h) obj).f1334a);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: h */
    public boolean mo3169h(AbstractC0210af afVar) {
        return this.f1334a.mo3169h(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo2381a(AbstractC0210af afVar) {
        if (!this.f1335b.isAvailable(this, afVar)) {
            return false;
        }
        return this.f1334a.mo2381a(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: q */
    public boolean mo3161q() {
        return this.f1334a.mo3161q();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: h */
    public boolean mo2382h() {
        return this.f1334a.mo2382h();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: i */
    public AbstractC0268al mo2412i() {
        return this.f1334a.mo2412i();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        return this.f1334a.mo2413g();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return this.f1334a.mo2377e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        return this.f1334a.mo2376f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        return this.f1334a.mo2378d();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public String mo2414c(AbstractC0210af afVar) {
        C0368l lVar;
        String c = this.f1334a.mo2414c(afVar);
        AbstractC0268al i = this.f1334a.mo2412i();
        if (i != null && (i instanceof C0368l)) {
            if (((C0368l) i).f2510B != null) {
                c = c + "\n(mod: " + C0654f.m1488a(lVar.f2510B.m1388a(), 30) + ")";
            }
        }
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: r */
    public C0748e mo3160r() {
        return this.f1334a.mo3160r();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: i */
    public C0748e mo3168i(AbstractC0210af afVar) {
        return this.f1334a.mo3168i(afVar);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: s */
    public Rect mo3374s() {
        return this.f1334a.mo3374s();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j */
    public AbstractC0210af mo3167j(AbstractC0210af afVar) {
        return this.f1334a.mo3167j(afVar);
    }

    public int hashCode() {
        return this.f1334a.hashCode();
    }

    public String toString() {
        return this.f1334a.toString();
    }

    public C0186h(AbstractC0197s sVar, C0180b bVar) {
        this(sVar, bVar, false);
    }

    public C0186h(AbstractC0197s sVar, C0180b bVar, boolean z) {
        super(sVar.m3387J());
        this.f1335b = C0180b.emptyActionFilter;
        this.f1334a = sVar;
        this.f1335b = bVar;
        m3377e(this.f1334a.m3387J());
        this.f1354f = this.f1334a.f1354f;
        this.f1336c = z;
    }

    /* renamed from: t */
    public AbstractC0197s m3401t() {
        return this.f1334a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: u */
    public boolean mo3373u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: o */
    public boolean mo3361o() {
        if (!this.f1335b.isAvailable(this, null)) {
            return false;
        }
        if (this.f1336c) {
            return this.f1334a.mo3361o();
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: v */
    public AbstractC0268al mo3156v() {
        return this.f1334a.mo3156v();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public boolean mo2409c(AbstractC0210af afVar, boolean z) {
        return this.f1334a.mo2409c(afVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public boolean mo2410b(AbstractC0210af afVar) {
        return this.f1334a.mo2410b(afVar);
    }
}
