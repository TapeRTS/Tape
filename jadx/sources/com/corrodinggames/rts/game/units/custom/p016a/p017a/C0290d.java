package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.C0372o;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/d.class */
public class C0290d extends AbstractC0286a {

    /* renamed from: a */
    boolean f1793a;

    /* renamed from: b */
    boolean f1794b;

    /* renamed from: c */
    C0372o f1795c;

    /* renamed from: d */
    C0372o f1796d;

    /* renamed from: e */
    boolean f1797e;

    /* renamed from: f */
    int f1798f = Integer.MIN_VALUE;

    /* renamed from: g */
    int f1799g = Integer.MIN_VALUE;

    /* renamed from: a */
    public static void m3204a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        boolean booleanValue = abVar.m594a(str, str2 + "finishPlayingLastAnimation", (Boolean) false).booleanValue();
        boolean booleanValue2 = abVar.m594a(str, str2 + "stopLastAnimation", (Boolean) false).booleanValue();
        C0372o a = lVar.m2781a(abVar.m579b(str, str2 + "playAnimation", (String) null), (C0372o) null);
        C0372o a2 = lVar.m2781a(abVar.m579b(str, str2 + "playAnimationIfNotPlaying", (String) null), (C0372o) null);
        if (a != null && a2 != null) {
            throw new RuntimeException("Cannot use playAnimation and playAnimationIfNotPlaying at same time");
        } else if (booleanValue2 && booleanValue) {
            throw new RuntimeException("Cannot use stopLastAnimation and finishPlayingLastAnimation at same time");
        } else if (a != null || a2 != null || booleanValue || booleanValue2) {
            C0290d dVar = new C0290d();
            dVar.f1793a = booleanValue;
            dVar.f1794b = booleanValue2;
            dVar.f1795c = a;
            dVar.f1796d = a2;
            dVar.f1797e = abVar.m594a(str, str2 + "playAnimation_lowPriority", (Boolean) false).booleanValue();
            cVar.f1920W.add(dVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        if (this.f1793a) {
            kVar.f2440b.m2967b();
        }
        if (this.f1794b) {
            kVar.f2440b.m2973a();
        }
        if (this.f1795c != null) {
            int i2 = 15;
            if (this.f1797e) {
                i2 = 4;
            }
            kVar.f2440b.m2969a(this.f1795c.m2725b(), i2, true);
        }
        if (this.f1796d == null) {
            return true;
        }
        int i3 = 15;
        if (this.f1797e) {
            i3 = 4;
        }
        if (kVar.f2440b.m2971a(this.f1796d.m2725b())) {
            return true;
        }
        kVar.f2440b.m2969a(this.f1796d.m2725b(), i3, true);
        return true;
    }
}
