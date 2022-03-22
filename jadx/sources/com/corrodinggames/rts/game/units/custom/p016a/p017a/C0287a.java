package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/a.class */
public class C0287a extends AbstractC0286a {

    /* renamed from: a */
    C0345a f1759a;

    /* renamed from: c */
    C0345a f1761c;

    /* renamed from: b */
    double f1760b = Double.MIN_VALUE;

    /* renamed from: d */
    float f1762d = 1.0f;

    /* renamed from: a */
    public static void m3207a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        C0345a a = abVar.m610a(lVar, str, str2 + "resourceAmount", null, true);
        if (a != null) {
            C0287a aVar = new C0287a();
            aVar.f1759a = a;
            aVar.f1760b = abVar.m600a(str, str2 + "resourceAmount_setValue", Double.MIN_VALUE);
            aVar.f1761c = abVar.m610a(lVar, str, str2 + "resourceAmount_addOtherResource", null, true);
            aVar.f1762d = abVar.m592a(str, str2 + "resourceAmount_multiplyBy", Float.valueOf(1.0f)).floatValue();
            cVar.f1920W.add(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [double] */
    /* JADX WARN: Type inference failed for: r0v19, types: [double] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        ?? r11;
        if (this.f1759a == null) {
            return true;
        }
        if (this.f1760b != Double.MIN_VALUE) {
            r11 = this.f1760b;
        } else {
            r11 = this.f1759a.mo3007a(kVar);
        }
        boolean z = r11;
        if (this.f1761c != null) {
            z = (r11 == true ? 1.0d : 0.0d) + this.f1761c.mo3007a(kVar);
        }
        double d = z ? 1.0d : 0.0d;
        double d2 = z ? 1.0d : 0.0d;
        this.f1759a.mo3006a(kVar, d * this.f1762d);
        return true;
    }
}
