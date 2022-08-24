package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p020d.C0425c;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/a.class */
public class C0322a extends AbstractC0321a {

    /* renamed from: a */
    C0428a f1910a;

    /* renamed from: c */
    C0428a f1911c;

    /* renamed from: e */
    C0425c f1912e;

    /* renamed from: f */
    C0425c f1913f;

    /* renamed from: b */
    double f1914b = -1.7976931348623157E308d;

    /* renamed from: d */
    float f1915d = 1.0f;

    /* renamed from: a */
    public static void m5527a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0428a m721a = c1072ab.m721a(c0453l, str, str2 + "resourceAmount", (C0428a) null, true);
        if (m721a != null) {
            C0322a c0322a = new C0322a();
            c0322a.f1910a = m721a;
            c0322a.f1914b = c1072ab.m706a(str, str2 + "resourceAmount_setValue", -1.7976931348623157E308d);
            c0322a.f1911c = c1072ab.m721a(c0453l, str, str2 + "resourceAmount_addOtherResource", (C0428a) null, true);
            c0322a.f1915d = c1072ab.m698a(str, str2 + "resourceAmount_multiplyBy", Float.valueOf(1.0f)).floatValue();
            c0339d.f2132ab.add(c0322a);
        }
        C0425c m5180a = C0425c.m5180a(c0453l, c1072ab, str, str2 + "addResourcesWithLogic", null);
        C0425c m5180a2 = C0425c.m5180a(c0453l, c1072ab, str, str2 + "setResourcesWithLogic", null);
        if (m5180a != null || m5180a2 != null) {
            C0322a c0322a2 = new C0322a();
            c0322a2.f1913f = m5180a2;
            c0322a2.f1912e = m5180a;
            c0339d.f2132ab.add(c0322a2);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        double mo5140a;
        if (this.f1910a != null) {
            if (this.f1914b != -1.7976931348623157E308d) {
                mo5140a = this.f1914b;
            } else {
                mo5140a = this.f1910a.mo5140a(c0451j);
            }
            if (this.f1911c != null) {
                mo5140a += this.f1911c.mo5140a(c0451j);
            }
            this.f1910a.mo5139a(c0451j, mo5140a * this.f1915d);
        }
        if (this.f1913f != null) {
            this.f1913f.m5174d(c0451j);
        }
        if (this.f1912e != null) {
            this.f1912e.m5173e(c0451j);
            return true;
        }
        return true;
    }
}
