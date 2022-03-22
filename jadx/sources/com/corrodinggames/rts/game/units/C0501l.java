package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0202x;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;

/* renamed from: com.corrodinggames.rts.game.units.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/l.class */
class C0501l extends AbstractC0202x {

    /* renamed from: a */
    boolean f3374a;

    /* renamed from: b */
    boolean f3375b;

    public C0501l(boolean z, boolean z2) {
        super("changeUnitTab" + z + "d:" + z2);
        this.f3374a = z;
        this.f3375b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        return mo2378d();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        C0465h K = C0465h.m2434K();
        if (K == null) {
            return "<NULL>";
        }
        if (this.f3375b) {
            return K.f3318B.m2372a();
        }
        String str = "";
        if (this.f3374a) {
            str = str + "<- ";
        }
        if (!this.f3374a) {
            str = str + " ->";
        }
        return str;
    }

    /* renamed from: l */
    public void m2373l() {
        C0465h K = C0465h.m2434K();
        if (K == null) {
            AbstractC0789l.m682b("Editor not active");
        } else if (!this.f3375b) {
            K.f3318B = K.f3318B.m2370a(this.f3374a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return "Change unit tab in editor";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j */
    public float mo2375j() {
        if (!C0623f.f4404bx) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: k */
    public int mo2374k() {
        if (this.f3375b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0202x, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        if (this.f3375b) {
            return EnumC0198t.infoOnly;
        }
        return super.mo2376f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0202x, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        if (this.f3375b) {
            return EnumC0199u.infoOnly;
        }
        return super.mo2377e();
    }
}
