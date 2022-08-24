package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0457o;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/d.class */
public class C0325d extends AbstractC0321a {

    /* renamed from: a */
    boolean f1947a;

    /* renamed from: b */
    boolean f1948b;

    /* renamed from: c */
    C0457o f1949c;

    /* renamed from: d */
    C0457o f1950d;

    /* renamed from: e */
    boolean f1951e;

    /* renamed from: f */
    int f1952f = Integer.MIN_VALUE;

    /* renamed from: g */
    int f1953g = Integer.MIN_VALUE;

    /* renamed from: a */
    public static void m5522a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m700a(str, str2 + "finishPlayingLastAnimation", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1072ab.m700a(str, str2 + "stopLastAnimation", (Boolean) false).booleanValue();
        C0457o m4754a = c0453l.m4754a(c1072ab.m681b(str, str2 + "playAnimation", (String) null), (C0457o) null);
        C0457o m4754a2 = c0453l.m4754a(c1072ab.m681b(str, str2 + "playAnimationIfNotPlaying", (String) null), (C0457o) null);
        if (m4754a != null && m4754a2 != null) {
            throw new RuntimeException("Cannot use playAnimation and playAnimationIfNotPlaying at same time");
        }
        if (booleanValue2 && booleanValue) {
            throw new RuntimeException("Cannot use stopLastAnimation and finishPlayingLastAnimation at same time");
        }
        if (m4754a != null || m4754a2 != null || booleanValue || booleanValue2) {
            C0325d c0325d = new C0325d();
            c0325d.f1947a = booleanValue;
            c0325d.f1948b = booleanValue2;
            c0325d.f1949c = m4754a;
            c0325d.f1950d = m4754a2;
            c0325d.f1951e = c1072ab.m700a(str, str2 + "playAnimation_lowPriority", (Boolean) false).booleanValue();
            c0339d.f2132ab.add(c0325d);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        if (this.f1947a) {
            c0451j.f2840b.m5164b();
        }
        if (this.f1948b) {
            c0451j.f2840b.m5170a();
        }
        if (this.f1949c != null) {
            int i2 = 15;
            if (this.f1951e) {
                i2 = 4;
            }
            c0451j.f2840b.m5166a(this.f1949c.m4691b(), i2, true);
        }
        if (this.f1950d != null) {
            int i3 = 15;
            if (this.f1951e) {
                i3 = 4;
            }
            if (!c0451j.f2840b.m5168a(this.f1950d.m4691b())) {
                c0451j.f2840b.m5166a(this.f1950d.m4691b(), i3, true);
                return true;
            }
            return true;
        }
        return true;
    }
}
