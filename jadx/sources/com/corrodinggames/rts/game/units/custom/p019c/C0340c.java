package com.corrodinggames.rts.game.units.custom.p019c;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.EnumC0709m;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/c.class */
public class C0340c {

    /* renamed from: d */
    C0835m f2320d = new C0835m();

    /* renamed from: a */
    static final Rect f2317a = new Rect();

    /* renamed from: b */
    static final RectF f2318b = new RectF();

    /* renamed from: c */
    static final Paint f2319c = new Paint();

    /* renamed from: e */
    static Paint f2321e = new Paint();

    /* renamed from: f */
    public static C0343f f2322f = new C0343f();

    static {
        f2321e.m4189a(255, 0, 0, 200);
    }

    /* renamed from: a */
    public void m3023a(C0368l lVar) {
        Object[] a = this.f2320d.m490a();
        for (int i = this.f2320d.f5778a - 1; i >= 0; i--) {
            C0342e eVar = (C0342e) a[i];
            C0338a a2 = lVar.m2791a(eVar.f2327a.f2316g);
            if (a2 != null) {
                eVar.f2327a = a2;
                while (eVar.f2328b.size() > eVar.f2327a.f2313d) {
                    eVar.f2328b.remove(eVar.f2328b.size() - 1);
                }
            } else {
                this.f2320d.remove(i);
            }
        }
    }

    /* renamed from: a */
    public C0342e m3024a(C0338a aVar, boolean z) {
        int i = this.f2320d.f5778a;
        Object[] a = this.f2320d.m490a();
        for (int i2 = 0; i2 < i; i2++) {
            C0342e eVar = (C0342e) a[i2];
            if (eVar.f2327a == aVar) {
                return eVar;
            }
        }
        if (!z) {
            return null;
        }
        C0342e eVar2 = new C0342e(aVar);
        this.f2320d.add(eVar2);
        return eVar2;
    }

    /* renamed from: a */
    public int m3025a(C0338a aVar) {
        C0342e a = m3024a(aVar, false);
        if (a == null) {
            return 0;
        }
        return a.f2328b.f5778a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [android.graphics.Paint] */
    /* renamed from: a */
    public void m3027a(float f, AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        int i = this.f2320d.f5778a;
        if (i != 0) {
            Object[] a = this.f2320d.m490a();
            for (int i2 = 0; i2 < i; i2++) {
                C0342e eVar = (C0342e) a[i2];
                C0338a aVar = eVar.f2327a;
                int i3 = eVar.f2328b.f5778a;
                Object[] a2 = eVar.f2328b.m490a();
                for (int i4 = i3 - 1; i4 >= 0; i4--) {
                    C0341d dVar = (C0341d) a2[i4];
                    if (dVar.f2325c) {
                        AbstractC0210af afVar2 = dVar.f2323a;
                        if (aVar.f2314e != null) {
                            C0748e eVar2 = aVar.f2314e;
                            float f2 = afVar.f5842dH - AbstractC0789l.m638u().f5547cd;
                            float f3 = ((afVar.f5843dI - AbstractC0789l.m638u().f5548ce) - afVar.f5844dJ) - 10.0f;
                            float f4 = eVar2.f5250p;
                            float d = C0654f.m1446d(afVar.f5842dH, afVar.f5843dI - afVar.f5844dJ, afVar2.f5842dH, afVar2.f5843dI - afVar2.f5844dJ);
                            float a3 = C0654f.m1520a(afVar.f5842dH, afVar.f5843dI - afVar.f5844dJ, afVar2.f5842dH, afVar2.f5843dI - afVar2.f5844dJ);
                            if (a3 < (eVar2.f5246l - 2) * (eVar2.f5246l - 2)) {
                                f4 = C0654f.m1515a((int) a3);
                            }
                            u.f5514bw.mo125j();
                            u.f5514bw.mo199a(d + 90.0f, f2, f3);
                            f2317a.m4136a(0, (int) (eVar2.f5246l - f4), eVar2.f5245k, eVar2.f5246l);
                            f2318b.m4122a(f2 - eVar2.f5247m, f3 - f4, f2 + eVar2.f5247m, f3);
                            C0760q qVar = C0760q.f5309r;
                            if (dVar.f2326d != 0.0f) {
                                qVar = f2319c;
                                int abs = (int) Math.abs(dVar.f2326d * 5.0f);
                                if (abs > 250) {
                                    abs = 250;
                                }
                                qVar.m4189a(255, 255, 255 - abs, 255 - abs);
                            }
                            u.f5514bw.mo169a(eVar2, f2317a, f2318b, qVar);
                            u.f5514bw.mo124k();
                        }
                        if (aVar.f2315f != null) {
                            u.f5514bw.mo197a(afVar.f5842dH - u.f5547cd, (afVar.f5843dI - u.f5548ce) - afVar.f5844dJ, afVar2.f5842dH - u.f5547cd, (afVar2.f5843dI - u.f5548ce) - afVar2.f5844dJ, aVar.f2315f);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3022a(C0690ap apVar) {
        if (this.f2320d.f5778a == 0) {
            apVar.mo1130c(-1);
            return;
        }
        apVar.mo1130c(0);
        short size = (short) this.f2320d.size();
        apVar.mo1091a(size);
        Object[] a = this.f2320d.m490a();
        for (int i = 0; i < size; i++) {
            C0342e eVar = (C0342e) a[i];
            apVar.m1158a(eVar.f2327a.f2316g);
            apVar.mo1091a((short) eVar.f2328b.size());
            Iterator it = eVar.f2328b.iterator();
            while (it.hasNext()) {
                C0341d dVar = (C0341d) it.next();
                apVar.mo1094a(dVar.f2323a);
                apVar.mo1090a(dVar.f2324b);
                apVar.mo1090a(dVar.f2325c);
            }
        }
    }

    /* renamed from: a */
    public void m3026a(AbstractC0210af afVar, C0707k kVar) {
        if (kVar.m1065d() != -1) {
            short t = kVar.m1048t();
            this.f2320d.clear();
            for (int i = 0; i < t; i++) {
                C0364h l = kVar.m1056l();
                C0338a aVar = null;
                if (afVar instanceof C0367k) {
                    aVar = ((C0367k) afVar).f2460v.m2791a(l);
                }
                C0342e eVar = null;
                if (aVar != null) {
                    eVar = new C0342e(aVar);
                    this.f2320d.add(eVar);
                }
                short t2 = kVar.m1048t();
                for (int i2 = 0; i2 < t2; i2++) {
                    C0341d dVar = new C0341d();
                    dVar.f2323a = kVar.m1078a(EnumC0709m.expected);
                    dVar.f2324b = kVar.m1063e();
                    dVar.f2325c = kVar.m1063e();
                    if (!(dVar.f2323a == null || eVar == null)) {
                        eVar.f2328b.add(dVar);
                    }
                }
            }
        }
    }
}
