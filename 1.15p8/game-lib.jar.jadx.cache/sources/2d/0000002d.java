package com.corrodinggames.rts.game.units.custom.p015a.p016a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0395bl;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.p015a.AbstractC0309a;
import com.corrodinggames.rts.game.units.custom.p015a.C0327d;
import com.corrodinggames.rts.game.units.custom.p020e.C0411a;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/g.class */
public class C0316g extends AbstractC0309a {

    /* renamed from: a */
    C0411a f1908a;

    /* renamed from: b */
    C0411a f1909b;

    /* renamed from: c */
    double f1910c;

    /* renamed from: d */
    double f1911d;

    /* renamed from: e */
    float f1912e;

    /* renamed from: a */
    public static void m3636a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, C0327d c0327d, String str3, boolean z) {
        C0411a m667a = unitConfig.m667a(customUnitMetadata, str, "convertResource_from", (C0411a) null, true);
        C0411a m667a2 = unitConfig.m667a(customUnitMetadata, str, "convertResource_to", (C0411a) null, true);
        if ((m667a != null || m667a2 != null) && (m667a == null || m667a2 == null)) {
            throw new C0395bl("[" + str + "] Both convertResource_from and convertResource_to are required together");
        }
        if (m667a != null && m667a2 != null) {
            C0316g c0316g = new C0316g();
            c0316g.f1908a = m667a;
            c0316g.f1909b = m667a2;
            c0316g.f1910c = unitConfig.m652a(str, "convertResource_minAmount", 0.0d);
            c0316g.f1911d = unitConfig.m605j(str, "convertResource_maxAmount");
            if (c0316g.f1910c < 0.0d) {
                throw new C0395bl("[" + str + "] convertResource_minAmount cannot be < 0");
            }
            if (c0316g.f1911d < 0.0d) {
                throw new C0395bl("[" + str + "] convertResource_maxAmount cannot be < 0");
            }
            if (c0316g.f1911d < c0316g.f1910c) {
                throw new C0395bl("[" + str + "] convertResource_maxAmount cannot be < convertResource_minAmount");
            }
            c0316g.f1912e = unitConfig.getStaticFloatValue(str, "convertResource_multiplyAmountBy", Float.valueOf(1.0f)).floatValue();
            c0327d.f2069Z.add(c0316g);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p015a.AbstractC0309a
    /* renamed from: a */
    public boolean mo3629a(C0433j c0433j, Action action, PointF pointF, Unit unit, int i) {
        double mo3326a = this.f1908a.mo3326a(c0433j);
        if (mo3326a > this.f1910c) {
            double mind = CommonUtils.mind(mo3326a, this.f1911d);
            this.f1908a.mo3324b(c0433j, -mind);
            this.f1909b.mo3324b(c0433j, mind * this.f1912e);
            return true;
        }
        return true;
    }
}