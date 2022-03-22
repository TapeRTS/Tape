package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0202x;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;

/* renamed from: com.corrodinggames.rts.game.units.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/j.class */
class C0499j extends AbstractC0202x {

    /* renamed from: a */
    boolean f3370a;

    /* renamed from: b */
    boolean f3371b;

    public C0499j(boolean z, boolean z2) {
        super("changeModFilter" + z + "d:" + z2);
        this.f3370a = z;
        this.f3371b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public boolean mo2381a(AbstractC0210af afVar) {
        C0465h K = C0465h.m2434K();
        return K == null || K.f3318B == EnumC0502m.modded;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        if (this.f3371b) {
            C0465h K = C0465h.m2434K();
            if (K == null) {
                return "Mod Filter";
            }
            if (K.f3317A != null) {
                return K.f3317A.m1388a();
            }
            return "All mods";
        } else if (this.f3370a) {
            return "<- Set mod";
        } else {
            return "Set mod ->";
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        if (this.f3371b) {
            C0465h K = C0465h.m2434K();
            if (K == null) {
                return "NA";
            }
            if (K.f3317A == null) {
                return "All mods";
            }
            return K.f3317A.m1384b();
        } else if (this.f3370a) {
            return "<-";
        } else {
            return "->";
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return "Change filtered mod";
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
        if (this.f3371b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0202x, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        if (this.f3371b) {
            return EnumC0198t.infoOnly;
        }
        return super.mo2376f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0202x, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        if (this.f3371b) {
            return EnumC0199u.infoOnly;
        }
        return super.mo2377e();
    }
}
