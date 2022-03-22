package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/aa.class */
public class C0535aa extends AbstractC0585bi {

    /* renamed from: a */
    int f3598a;

    /* renamed from: b */
    PointF f3599b = new PointF();

    /* renamed from: a */
    public void m2106a() {
        this.f3598a = 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(0);
        apVar.mo1095a(this.f3598a);
    }

    /* renamed from: a */
    public void m2103a(C0707k kVar) {
        kVar.m1062f();
        this.f3598a = kVar.m1062f();
    }

    /* renamed from: a */
    public void m2105a(float f) {
    }

    /* renamed from: b */
    public C0536ab m2100b() {
        C0536ab abVar = new C0536ab(this);
        abVar.f3604e = this.f3598a;
        this.f3598a++;
        return abVar;
    }

    /* renamed from: c */
    public C0536ab m2099c() {
        C0536ab abVar = new C0536ab(this);
        abVar.f3604e = -1;
        abVar.f3601b = true;
        return abVar;
    }

    /* renamed from: a */
    public void m2101a(C0835m mVar, AbstractC0515r rVar, C0835m mVar2, float f, int i) {
        int i2 = 0;
        while (!mVar2.isEmpty()) {
            AbstractC0515r rVar2 = null;
            float f2 = -1.0f;
            PointF pointF = null;
            int i3 = -1;
            Object[] a = mVar2.m490a();
            Object[] a2 = mVar.m490a();
            int size = mVar.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0515r rVar3 = (AbstractC0515r) a2[i4];
                if (rVar3.f3423U == rVar && !rVar3.f3429aa) {
                    float f3 = -1.0f;
                    PointF pointF2 = null;
                    int i5 = -1;
                    for (int i6 = 0; i6 < mVar2.f5778a; i6++) {
                        PointF pointF3 = (PointF) a[i6];
                        float a3 = C0654f.m1520a(rVar3.f5842dH, rVar3.f5843dI, rVar.f5842dH + pointF3.f224a, rVar.f5843dI + pointF3.f225b);
                        if (f3 == -1.0f || a3 < f3) {
                            f3 = a3;
                            pointF2 = pointF3;
                            i5 = i6;
                        }
                    }
                    if (f3 > f2) {
                        rVar2 = rVar3;
                        f2 = f3;
                        pointF = pointF2;
                        i3 = i5;
                    }
                }
            }
            if (rVar2 != null) {
                i2++;
                rVar2.f3429aa = true;
                rVar2.f3430ab = pointF.f224a;
                rVar2.f3431ac = pointF.f225b;
                rVar2.f3432ad = f;
                rVar2.f3434af = f2;
                rVar2.f3427Y = (short) (i + 1);
                mVar2.remove(i3);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m2102a(C0835m mVar, AbstractC0515r rVar) {
        while (true) {
            AbstractC0515r rVar2 = null;
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                AbstractC0515r rVar3 = (AbstractC0515r) it.next();
                if (rVar3.f3423U == rVar && rVar3.f3434af > 0.0f && (rVar2 == null || rVar3.f3434af > rVar2.f3434af)) {
                    if (rVar3.f3429aa && rVar3.f3434af > 100.0f) {
                        rVar2 = rVar3;
                    }
                }
            }
            if (rVar2 != null) {
                rVar2.f3429aa = false;
                AbstractC0515r rVar4 = null;
                float f = 0.0f;
                int a = C0654f.m1515a((int) rVar2.f3434af);
                Iterator it2 = mVar.iterator();
                while (it2.hasNext()) {
                    AbstractC0515r rVar5 = (AbstractC0515r) it2.next();
                    if (rVar5.f3423U == rVar && rVar5.f3434af > 0.0f && rVar5 != rVar2) {
                        float c = ((0 + C0654f.m1456c(rVar2.f5842dH, rVar2.f5843dI, rVar.f5842dH + rVar5.f3430ab, rVar.f5843dI + rVar5.f3431ac)) + C0654f.m1456c(rVar5.f5842dH, rVar5.f5843dI, rVar.f5842dH + rVar2.f3430ab, rVar.f5843dI + rVar2.f3431ac)) - (C0654f.m1515a((int) rVar5.f3434af) + a);
                        if (c < f) {
                            f = c;
                            rVar4 = rVar5;
                        }
                    }
                }
                if (rVar4 != null) {
                    float f2 = rVar2.f3430ab;
                    float f3 = rVar2.f3431ac;
                    rVar2.f3430ab = rVar4.f3430ab;
                    rVar2.f3431ac = rVar4.f3431ac;
                    rVar2.f3434af = C0654f.m1520a(rVar2.f5842dH, rVar2.f5843dI, rVar.f5842dH + rVar2.f3430ab, rVar.f5843dI + rVar2.f3431ac);
                    rVar4.f3430ab = f2;
                    rVar4.f3431ac = f3;
                    rVar4.f3434af = C0654f.m1520a(rVar4.f5842dH, rVar4.f5843dI, rVar.f5842dH + rVar4.f3430ab, rVar.f5843dI + rVar4.f3431ac);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C0835m m2104a(int i, float f, float f2) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        int i5 = 6 / 2;
        float f3 = 2.0f + (f * 2.0f * 1.5f);
        C0835m mVar = new C0835m();
        int i6 = i;
        if (i6 % 2 != 0) {
            i6++;
        }
        float i7 = C0654f.m1421i(f2);
        float h = C0654f.m1425h(f2);
        for (int i8 = 0; i8 < i6; i8++) {
            if (i3 % 2 == 0) {
                i2 = i5 + (i3 / 2);
            } else {
                i2 = i5 - ((i3 + 1) / 2);
            }
            float f4 = (i2 - i5) * f3;
            float f5 = (-i4) * f3;
            mVar.add(new PointF((f5 * i7) - (f4 * h), (f4 * i7) + (f5 * h)));
            i3++;
            if (i3 > 6) {
                i3 = 0;
                i4++;
            }
        }
        return mVar;
    }
}
