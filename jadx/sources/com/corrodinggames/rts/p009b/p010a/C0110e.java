package com.corrodinggames.rts.p009b.p010a;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.C0214aj;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0366j;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;
import java.util.Random;

/* renamed from: com.corrodinggames.rts.b.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/b/a/e.class */
public class C0110e extends AbstractC0113h {

    /* renamed from: b */
    int f488b;

    /* renamed from: e */
    static final Point f491e = new Point();

    /* renamed from: a */
    int f487a = 1;

    /* renamed from: c */
    final Rect f489c = new Rect();

    /* renamed from: d */
    final PointF f490d = new PointF();

    /* renamed from: a */
    public void m3895a() {
        AbstractC0789l.m670d("Misc Performance test");
        int i = 0;
        AbstractC0789l.m670d("=== isLineClear tests (runs:5)");
        Long valueOf = Long.valueOf(C0586bj.m1919a());
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 = 0; i3 < 1000; i3++) {
                if (C0214aj.m3279b(EnumC0212ah.LAND, i3, 1000 - i3, 50, 50, 1000, 1, 1)) {
                    i++;
                }
            }
        }
        double a = C0586bj.m1916a(valueOf.longValue(), Long.valueOf(C0586bj.m1919a()).longValue());
        this.f487a += i;
        AbstractC0789l.m670d("Took: " + a);
        int i4 = 0;
        AbstractC0789l.m670d("=== maths tests == (runs:5)");
        Long valueOf2 = Long.valueOf(C0586bj.m1919a());
        for (int i5 = 0; i5 < 5; i5++) {
            for (int i6 = 0; i6 < 10000; i6++) {
                Point point = f491e;
                point.f221a += i6;
                point.f221a += i6;
                point.f221a += i6;
                point.f221a += i6;
                point.f221a += i6;
                point.f221a += i6;
                point.f221a += i6;
                point.f221a += i6;
                point.f221a += i6;
                this.f488b++;
                i4 += 0;
            }
        }
        double a2 = C0586bj.m1916a(valueOf2.longValue(), Long.valueOf(C0586bj.m1919a()).longValue());
        this.f487a += i4;
        AbstractC0789l.m670d("Took: " + a2);
        C0835m mVar = new C0835m();
        int i7 = 0;
        for (int i8 = 0; i8 < 20000; i8++) {
            C0366j jVar = new C0366j();
            if (i8 % 10 != 0) {
                jVar.m2892a(C0364h.m2897c("test"));
                jVar.m2892a(C0364h.m2897c("test1"));
            }
            if (i8 % 2 == 0) {
                jVar.m2892a(C0364h.m2897c("test2"));
                i7++;
            }
            if (i8 % 3 == 0) {
                jVar.m2892a(C0364h.m2897c("test3"));
            }
            if (i8 % 4 == 0) {
                jVar.m2892a(C0364h.m2897c("test4"));
            }
            if (i8 % 5 == 0) {
                mVar.add(null);
            }
            mVar.add(jVar.m2893a());
        }
        C0365i a3 = C0364h.m2901a("test2");
        AbstractC0789l.m670d("=== CustomTagList tests == (runs:5)");
        for (int i9 = 0; i9 < 14; i9++) {
            Long valueOf3 = Long.valueOf(C0586bj.m1919a());
            for (int i10 = 0; i10 < 5; i10++) {
                int i11 = 0;
                Iterator it = mVar.iterator();
                while (it.hasNext()) {
                    if (C0364h.m2904a(a3, (C0365i) it.next())) {
                        i11++;
                    }
                }
                C0114i.m3889a(i7, i11);
            }
            AbstractC0789l.m670d("test2Expected:" + i7);
            double a4 = C0586bj.m1916a(valueOf3.longValue(), Long.valueOf(C0586bj.m1919a()).longValue());
            this.f487a += 0;
            AbstractC0789l.m670d("Took: " + a4);
        }
        for (int i12 = 0; i12 < 2; i12++) {
            AbstractC0789l.m670d("=== [Write]/comparison tests == (runs:100)");
            for (int i13 = 0; i13 < 14; i13++) {
                Random random = new Random();
                C0111f[] fVarArr = new C0111f[10000];
                for (int i14 = 0; i14 < fVarArr.length; i14++) {
                    fVarArr[i14] = new C0111f();
                    fVarArr[i14].f495d = ((double) random.nextFloat()) > 0.5d;
                }
                Long valueOf4 = Long.valueOf(C0586bj.m1919a());
                for (int i15 = 0; i15 < 100; i15++) {
                    for (C0111f fVar : fVarArr) {
                        fVar.f495d = false;
                    }
                }
                double a5 = C0586bj.m1916a(valueOf4.longValue(), Long.valueOf(C0586bj.m1919a()).longValue());
                this.f487a += 0;
                AbstractC0789l.m670d("Took: " + a5);
            }
            AbstractC0789l.m670d("=== Write/[comparison] tests == (runs:100)");
            for (int i16 = 0; i16 < 14; i16++) {
                Random random2 = new Random();
                C0111f[] fVarArr2 = new C0111f[10000];
                for (int i17 = 0; i17 < fVarArr2.length; i17++) {
                    fVarArr2[i17] = new C0111f();
                    fVarArr2[i17].f495d = ((double) random2.nextFloat()) > 0.5d;
                }
                Long valueOf5 = Long.valueOf(C0586bj.m1919a());
                for (int i18 = 0; i18 < 100; i18++) {
                    for (C0111f fVar2 : fVarArr2) {
                        if (fVar2.f495d) {
                            fVar2.f495d = false;
                        }
                    }
                }
                double a6 = C0586bj.m1916a(valueOf5.longValue(), Long.valueOf(C0586bj.m1919a()).longValue());
                this.f487a += 0;
                AbstractC0789l.m670d("Took: " + a6);
            }
        }
        int i19 = 0;
        AbstractC0789l.m670d("=== comparison tests 1 == (runs:100)");
        for (int i20 = 0; i20 < 14; i20++) {
            Random random3 = new Random();
            float[] fArr = new float[600 * 600];
            for (int i21 = 0; i21 < 600; i21++) {
                for (int i22 = 0; i22 < 600; i22++) {
                    fArr[(i21 * 600) + i22] = random3.nextFloat();
                }
            }
            Long valueOf6 = Long.valueOf(C0586bj.m1919a());
            for (int i23 = 0; i23 < 100; i23++) {
                for (int i24 = 0; i24 < 600; i24++) {
                    for (int i25 = 0; i25 < 600; i25++) {
                        i19 = (int) (i19 + fArr[(i24 * 600) + i25]);
                    }
                }
            }
            double a7 = C0586bj.m1916a(valueOf6.longValue(), Long.valueOf(C0586bj.m1919a()).longValue());
            this.f487a += i19;
            AbstractC0789l.m670d("Took: " + a7);
        }
        int i26 = 0;
        AbstractC0789l.m670d("=== comparison tests 2 == (runs:100)");
        for (int i27 = 0; i27 < 14; i27++) {
            Random random4 = new Random();
            float[][] fArr2 = new float[600][600];
            for (int i28 = 0; i28 < 600; i28++) {
                for (int i29 = 0; i29 < 600; i29++) {
                    fArr2[i28][i29] = random4.nextFloat();
                }
            }
            Long valueOf7 = Long.valueOf(C0586bj.m1919a());
            for (int i30 = 0; i30 < 100; i30++) {
                for (int i31 = 0; i31 < 600; i31++) {
                    for (int i32 = 0; i32 < 600; i32++) {
                        i26 = (int) (i26 + fArr2[i31][i32]);
                    }
                }
            }
            double a8 = C0586bj.m1916a(valueOf7.longValue(), Long.valueOf(C0586bj.m1919a()).longValue());
            this.f487a += i26;
            AbstractC0789l.m670d("Took: " + a8);
        }
    }
}
