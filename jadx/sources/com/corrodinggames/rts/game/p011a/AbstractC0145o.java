package com.corrodinggames.rts.game.p011a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p023d.AbstractC0403c;
import com.corrodinggames.rts.gameFramework.AbstractC0585bi;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/o.class */
public abstract class AbstractC0145o extends AbstractC0585bi {

    /* renamed from: Q */
    public int f702Q;

    /* renamed from: R */
    protected final C0118a f703R;

    /* renamed from: S */
    public float f704S;

    /* renamed from: T */
    public float f705T;

    /* renamed from: U */
    public float f706U;

    /* renamed from: V */
    public boolean f707V;

    /* renamed from: W */
    static final ArrayList f708W = new ArrayList();

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f704S);
        apVar.mo1096a(this.f705T);
        apVar.mo1096a(this.f706U);
    }

    /* renamed from: a */
    public void mo3722a(C0707k kVar) {
        this.f704S = kVar.m1061g();
        this.f705T = kVar.m1061g();
        this.f706U = kVar.m1061g();
    }

    public AbstractC0145o(C0118a aVar) {
        aVar.f525ar++;
        this.f702Q = aVar.f525ar;
        this.f703R = aVar;
        this.f703R.f554aU.add(this);
        this.f703R.f555aV.add(this);
    }

    public AbstractC0145o(C0118a aVar, float f, float f2) {
        this(aVar);
        this.f704S = f;
        this.f705T = f2;
    }

    /* renamed from: k */
    public void mo3716k() {
        this.f703R.f554aU.remove(this);
        this.f703R.f555aV.remove(this);
        this.f707V = true;
    }

    /* renamed from: c */
    public boolean m3720c(float f, float f2) {
        float a = C0654f.m1520a(this.f704S, this.f705T, f, f2);
        float f3 = this.f706U;
        if (a < f3 * f3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m3721b(AbstractC0210af afVar) {
        float a = C0654f.m1520a(this.f704S, this.f705T, afVar.f5842dH, afVar.f5843dI);
        float f = this.f706U + afVar.f1474bO;
        if (a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3723a(AbstractC0210af afVar, float f) {
        float a = C0654f.m1520a(this.f704S, this.f705T, afVar.f5842dH, afVar.f5843dI);
        float f2 = this.f706U + afVar.f1474bO + f;
        if (a < f2 * f2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public float m3719c(AbstractC0210af afVar) {
        return C0654f.m1520a(this.f704S, this.f705T, afVar.f5842dH, afVar.f5843dI);
    }

    /* renamed from: a */
    public float m3724a(C0139i iVar) {
        return C0654f.m1520a(this.f704S, this.f705T, iVar.f704S, iVar.f705T);
    }

    /* renamed from: d */
    public float m3718d(float f, float f2) {
        return C0654f.m1520a(this.f704S, this.f705T, f, f2);
    }

    /* renamed from: w */
    public PointF m3715w() {
        PointF pointF = new PointF();
        float random = (float) (Math.random() * 360.0d);
        float random2 = (float) (Math.random() * this.f706U);
        pointF.m4141a(this.f704S + (C0654f.m1421i(random) * random2), this.f705T + (C0654f.m1425h(random) * random2));
        return pointF;
    }

    /* renamed from: e */
    public PointF m3717e(AbstractC0268al alVar) {
        int c;
        AbstractC0789l u = AbstractC0789l.m638u();
        PointF pointF = new PointF();
        float f = this.f706U;
        EnumC0212ah ahVar = EnumC0212ah.LAND;
        AbstractC0854w wVar = null;
        if (alVar == EnumC0215ak.seaFactory) {
            f = 600.0f;
            ahVar = EnumC0212ah.WATER;
        }
        for (int i = 0; i < 15; i++) {
            EnumC0215ak akVar = null;
            boolean z = false;
            boolean z2 = false;
            if (this instanceof C0139i) {
                C0139i iVar = (C0139i) this;
                if (i < 6 && alVar == EnumC0215ak.fabricator) {
                    akVar = EnumC0215ak.fabricator;
                }
                if (akVar != null) {
                    AbstractC0515r rVar = null;
                    if (wVar == null) {
                        wVar = AbstractC0210af.m3310c(alVar);
                    }
                    if (wVar instanceof AbstractC0515r) {
                        rVar = (AbstractC0515r) wVar;
                    }
                    int c2 = iVar.m3759c(akVar);
                    if (rVar != null && c2 > 1) {
                        int i2 = -1;
                        int a = C0654f.m1514a(0, c2 - 1);
                        AbstractC0210af[] a2 = AbstractC0210af.f1442bj.m456a();
                        int size = AbstractC0210af.f1442bj.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            AbstractC0210af afVar = a2[i3];
                            if (afVar.f1461bB == this.f703R && iVar.m3778a(afVar) && afVar.m3321bG() && this.f703R.m3824i(afVar) && afVar.mo1606r() == akVar) {
                                i2++;
                                if (i2 == a) {
                                    float f2 = afVar.f5842dH;
                                    float f3 = afVar.f5843dI;
                                    float f4 = f2;
                                    float f5 = f3;
                                    if (C0654f.m1514a(0, 1) == 0) {
                                        f5 += C0654f.m1458c(-150.0f, 150.0f);
                                    } else {
                                        f4 += C0654f.m1458c(-150.0f, 150.0f);
                                    }
                                    f708W.clear();
                                    u.f5518bA.m1723a(rVar, f2, f3, f4, f5, false, f708W, (AbstractC0210af) null);
                                    if (f708W.size() > 0) {
                                        PointF pointF2 = (PointF) f708W.get(0);
                                        pointF.m4141a(pointF2.f224a, pointF2.f225b);
                                        z = true;
                                    } else {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2) {
                if (!z) {
                    float random = (float) (Math.random() * 360.0d);
                    float random2 = (float) (Math.random() * f);
                    pointF.m4141a(this.f704S + (C0654f.m1421i(random) * random2), this.f705T + (C0654f.m1425h(random) * random2));
                }
                u.f5511bt.m3703a(pointF.f224a, pointF.f225b);
                int i4 = u.f5511bt.f764M;
                int i5 = u.f5511bt.f765N;
                if (u.f5511bt.m3661c(i4, i5) && (((c = C0851y.m408c(i4, i5, ahVar)) > 5 || c == 0) && AbstractC0403c.m2650a(alVar, pointF.f224a, pointF.f225b, this.f703R))) {
                    return pointF;
                }
                if (alVar == EnumC0215ak.seaFactory) {
                    f += 100.0f;
                }
            }
        }
        return null;
    }
}
