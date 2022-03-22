package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.PointF;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0317am;
import com.corrodinggames.rts.game.units.custom.C0323as;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p023d.C0420n;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/f.class */
public class C0333f extends AbstractC0328a {

    /* renamed from: a */
    public static final AbstractC0328a f2256a = new C0333f();

    /* renamed from: b */
    static final PointF f2257b = new PointF();

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a
    /* renamed from: b */
    public void mo3039b(C0367k kVar, float f) {
        C0368l lVar = kVar.f2460v;
        int bg = kVar.mo2205bg();
        for (int i = 0; i < bg; i++) {
            C0323as asVar = lVar.f2825fE[i];
            if (asVar.f2172ai != null && kVar.f1491cf > 0.0f && !kVar.f2458t) {
                float floatValue = asVar.f2172ai.floatValue();
                f2257b.m4140a(kVar.mo2345E(i));
                float m = kVar.mo2152m();
                if (asVar.f2164aa < 99999.0f) {
                    m = asVar.f2164aa;
                }
                if (C0420n.m2575a(kVar, f2257b.f224a, f2257b.f225b, kVar.f5844dJ, m, floatValue)) {
                }
                if (kVar.f1491cf < 0.0f) {
                    kVar.f1491cf = 0.0f;
                    kVar.f2458t = true;
                }
            }
            if (asVar.f2173aj != null) {
                m3054a(kVar, asVar);
            }
        }
    }

    /* renamed from: a */
    public static void m3054a(C0367k kVar, C0323as asVar) {
        if (kVar.m2874a(asVar)) {
            float f = asVar.f2174ak;
            float f2 = asVar.f2175al;
            float f3 = asVar.f2176am;
            C0163f fVar = null;
            C0365i iVar = asVar.f2173aj;
            Object[] a = C0163f.f915a.m490a();
            int i = C0163f.f915a.f5778a;
            for (int i2 = 0; i2 < i; i2++) {
                C0163f fVar2 = (C0163f) a[i2];
                if (fVar2.f998aE != null && fVar2.f5844dJ > f3 && C0364h.m2904a(fVar2.f998aE, iVar) && C0654f.m1520a(kVar.f5842dH, kVar.f5843dI, fVar2.f5842dH, fVar2.f5843dI) < f2 * f2 && ((C0654f.m1520a(kVar.f5842dH, kVar.f5843dI, fVar2.f929n, fVar2.f930o) < f * f || f < 0.0f) && ((fVar2.f925j == null || (!fVar2.f925j.f1461bB.m3464d(kVar.f1461bB) && fVar2.f925j.f1461bB != kVar.f1461bB)) && !m3055a(fVar2)))) {
                    fVar = fVar2;
                }
            }
            if (fVar != null) {
                kVar.m2864b(asVar);
                C0163f a2 = kVar.m2878a((AbstractC0210af) null, fVar.f5842dH, fVar.f5843dI, asVar.f2116e, (C0317am) null, 0);
                a2.f996aC = true;
                a2.f932q = fVar;
            }
        }
    }

    /* renamed from: a */
    public static boolean m3055a(C0163f fVar) {
        Object[] a = C0163f.f915a.m490a();
        int i = C0163f.f915a.f5778a;
        for (int i2 = 0; i2 < i; i2++) {
            C0163f fVar2 = (C0163f) a[i2];
            if (fVar2 != fVar && fVar2.f932q == fVar) {
                return true;
            }
        }
        return false;
    }
}
