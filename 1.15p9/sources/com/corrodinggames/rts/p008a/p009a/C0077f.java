package com.corrodinggames.rts.p008a.p009a;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0450i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.EnumC0435b;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;
import java.util.Random;

/* renamed from: com.corrodinggames.rts.a.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/f.class */
public class C0077f extends AbstractC0083l {

    /* renamed from: b */
    int f395b;

    /* renamed from: e */
    static final Point f398e = new Point();

    /* renamed from: a */
    int f394a = 1;

    /* renamed from: c */
    final Rect f396c = new Rect();

    /* renamed from: d */
    final PointF f397d = new PointF();

    /* renamed from: a */
    public void m6244a() {
        GameEngine.PrintLog("Misc Performance test");
        int i = 0;
        GameEngine.PrintLog("=== applyDigitGroupingStyle tests (runs:5)");
        Long valueOf = Long.valueOf(C0727bl.m2610a());
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 = 0; i3 < 100; i3++) {
                if (!C0428a.m4507a(i3 + "9870000001.67", EnumC0435b.comma).equals(VariableScope.nullOrMissingString)) {
                    i++;
                }
            }
        }
        double m2607a = C0727bl.m2607a(valueOf.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
        this.f394a += i;
        GameEngine.PrintLog("Took: " + m2607a);
        int i4 = 0;
        GameEngine.PrintLog("=== applyDigitGroupingStyle_systemLibraryVersion tests (runs:5)");
        Long valueOf2 = Long.valueOf(C0727bl.m2610a());
        for (int i5 = 0; i5 < 5; i5++) {
            for (int i6 = 0; i6 < 100; i6++) {
                if (!C0428a.m4510a(i6 + 9870000001L, EnumC0435b.comma).equals(VariableScope.nullOrMissingString)) {
                    i4++;
                }
            }
        }
        double m2607a2 = C0727bl.m2607a(valueOf2.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
        this.f394a += i4;
        GameEngine.PrintLog("Took: " + m2607a2);
        int i7 = 0;
        GameEngine.PrintLog("=== isLineClear tests (runs:3)");
        Long valueOf3 = Long.valueOf(C0727bl.m2610a());
        for (int i8 = 0; i8 < 3; i8++) {
            for (int i9 = 0; i9 < 100; i9++) {
                if (C0248aq.m5132b(EnumC0246ao.LAND, i9, 1000 - i9, 50, 50, 1000, 1, 1)) {
                    i7++;
                }
            }
        }
        double m2607a3 = C0727bl.m2607a(valueOf3.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
        this.f394a += i7;
        GameEngine.PrintLog("Took: " + m2607a3);
        int i10 = 0;
        GameEngine.PrintLog("=== maths tests == (runs:3)");
        Long valueOf4 = Long.valueOf(C0727bl.m2610a());
        for (int i11 = 0; i11 < 3; i11++) {
            for (int i12 = 0; i12 < 1000; i12++) {
                Point point = f398e;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                this.f395b++;
                i10 += 0;
            }
        }
        double m2607a4 = C0727bl.m2607a(valueOf4.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
        this.f394a += i10;
        GameEngine.PrintLog("Took: " + m2607a4);
        C1101m c1101m = new C1101m();
        int i13 = 0;
        for (int i14 = 0; i14 < 20000; i14++) {
            C0450i c0450i = new C0450i();
            if (i14 % 10 != 0) {
                c0450i.m4402a(C0448g.m4407c("test"));
                c0450i.m4402a(C0448g.m4407c("test1"));
            }
            if (i14 % 2 == 0) {
                c0450i.m4402a(C0448g.m4407c("test2"));
                i13++;
            }
            if (i14 % 3 == 0) {
                c0450i.m4402a(C0448g.m4407c("test3"));
            }
            if (i14 % 4 == 0) {
                c0450i.m4402a(C0448g.m4407c("test4"));
            }
            if (i14 % 5 == 0) {
                c1101m.add(null);
            }
            c1101m.add(c0450i.m4403a());
        }
        C0449h m4411a = C0448g.m4411a("test2");
        GameEngine.PrintLog("=== CustomTagList tests == (runs:5)");
        for (int i15 = 0; i15 < 14; i15++) {
            Long valueOf5 = Long.valueOf(C0727bl.m2610a());
            for (int i16 = 0; i16 < 5; i16++) {
                int i17 = 0;
                Iterator it = c1101m.iterator();
                while (it.hasNext()) {
                    if (C0448g.m4414a(m4411a, (C0449h) it.next())) {
                        i17++;
                    }
                }
                C0085n.m6231a(i13, i17);
            }
            GameEngine.PrintLog("test2Expected:" + i13);
            double m2607a5 = C0727bl.m2607a(valueOf5.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += 0;
            GameEngine.PrintLog("Took: " + m2607a5);
        }
        for (int i18 = 0; i18 < 2; i18++) {
            GameEngine.PrintLog("=== [Write]/comparison tests == (runs:5)");
            for (int i19 = 0; i19 < 5; i19++) {
                Random random = new Random();
                C0079h[] c0079hArr = new C0079h[5000000];
                for (int i20 = 0; i20 < c0079hArr.length; i20++) {
                    c0079hArr[i20] = new C0079h();
                    c0079hArr[i20].f406d = random.nextFloat() < 0.5f;
                }
                Long valueOf6 = Long.valueOf(C0727bl.m2610a());
                for (int i21 = 0; i21 < 5; i21++) {
                    for (C0079h c0079h : c0079hArr) {
                        c0079h.f406d = false;
                    }
                }
                double m2607a6 = C0727bl.m2607a(valueOf6.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
                this.f394a += 0;
                GameEngine.PrintLog("Took: " + m2607a6);
            }
            GameEngine.PrintLog("=== Write/[comparison] tests == (runs:5)");
            for (int i22 = 0; i22 < 5; i22++) {
                Random random2 = new Random();
                C0079h[] c0079hArr2 = new C0079h[5000000];
                for (int i23 = 0; i23 < c0079hArr2.length; i23++) {
                    c0079hArr2[i23] = new C0079h();
                    c0079hArr2[i23].f406d = random2.nextFloat() < 0.5f;
                }
                Long valueOf7 = Long.valueOf(C0727bl.m2610a());
                for (int i24 = 0; i24 < 5; i24++) {
                    for (C0079h c0079h2 : c0079hArr2) {
                        if (c0079h2.f406d) {
                            c0079h2.f406d = false;
                        }
                    }
                }
                double m2607a7 = C0727bl.m2607a(valueOf7.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
                this.f394a += 0;
                GameEngine.PrintLog("Took: " + m2607a7);
            }
        }
        int i25 = 0;
        GameEngine.PrintLog("=== [Virtual method]/if tests == (runs:5)");
        for (int i26 = 0; i26 < 7; i26++) {
            Random random3 = new Random();
            C0080i[] c0080iArr = new C0080i[1000];
            for (int i27 = 0; i27 < c0080iArr.length; i27++) {
                if (random3.nextFloat() < 0.3f) {
                    C0081j c0081j = new C0081j(this);
                    c0081j.f415c = random3.nextInt(1000);
                    c0080iArr[i27] = c0081j;
                } else {
                    c0080iArr[i27] = new C0080i(this);
                    c0080iArr[i27].f413a = random3.nextInt(1000);
                }
            }
            Long valueOf8 = Long.valueOf(C0727bl.m2610a());
            for (int i28 = 0; i28 < 5; i28++) {
                for (C0080i c0080i : c0080iArr) {
                    if (c0080i.mo6242a() == 0) {
                        i25++;
                    }
                }
            }
            double m2607a8 = C0727bl.m2607a(valueOf8.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i25;
            GameEngine.PrintLog("Took: " + m2607a8);
        }
        int i29 = 0;
        GameEngine.PrintLog("=== Virtual method/[if tests] == (runs:5)");
        for (int i30 = 0; i30 < 7; i30++) {
            Random random4 = new Random();
            C0078g[] c0078gArr = new C0078g[1000];
            for (int i31 = 0; i31 < c0078gArr.length; i31++) {
                boolean z = random4.nextFloat() < 0.3f;
                C0078g c0078g = new C0078g(this);
                c0078g.f400b = random4.nextInt(1000);
                c0078g.f399a = random4.nextInt(1000);
                c0078g.f401c = z;
                c0078gArr[i31] = c0078g;
            }
            Long valueOf9 = Long.valueOf(C0727bl.m2610a());
            for (int i32 = 0; i32 < 5; i32++) {
                for (C0078g c0078g2 : c0078gArr) {
                    if (c0078g2.m6243a() == 0) {
                        i29++;
                    }
                }
            }
            double m2607a9 = C0727bl.m2607a(valueOf9.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i29;
            GameEngine.PrintLog("Took: " + m2607a9);
        }
        int i33 = 0;
        GameEngine.PrintLog("=== comparison tests 1 == (runs:10)");
        for (int i34 = 0; i34 < 14; i34++) {
            Random random5 = new Random();
            float[] fArr = new float[600 * 600];
            for (int i35 = 0; i35 < 600; i35++) {
                for (int i36 = 0; i36 < 600; i36++) {
                    fArr[(i35 * 600) + i36] = random5.nextFloat();
                }
            }
            Long valueOf10 = Long.valueOf(C0727bl.m2610a());
            for (int i37 = 0; i37 < 10; i37++) {
                for (int i38 = 0; i38 < 600; i38++) {
                    for (int i39 = 0; i39 < 600; i39++) {
                        i33 = (int) (i33 + fArr[(i38 * 600) + i39]);
                    }
                }
            }
            double m2607a10 = C0727bl.m2607a(valueOf10.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i33;
            GameEngine.PrintLog("Took: " + m2607a10);
        }
        int i40 = 0;
        GameEngine.PrintLog("=== comparison tests 2 == (runs:10)");
        for (int i41 = 0; i41 < 14; i41++) {
            Random random6 = new Random();
            float[][] fArr2 = new float[600][600];
            for (int i42 = 0; i42 < 600; i42++) {
                for (int i43 = 0; i43 < 600; i43++) {
                    fArr2[i42][i43] = random6.nextFloat();
                }
            }
            Long valueOf11 = Long.valueOf(C0727bl.m2610a());
            for (int i44 = 0; i44 < 10; i44++) {
                for (int i45 = 0; i45 < 600; i45++) {
                    for (int i46 = 0; i46 < 600; i46++) {
                        i40 = (int) (i40 + fArr2[i45][i46]);
                    }
                }
            }
            double m2607a11 = C0727bl.m2607a(valueOf11.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i40;
            GameEngine.PrintLog("Took: " + m2607a11);
        }
        int i47 = 0;
        GameEngine.PrintLog("=== [divide]/multiply float tests == (runs:5)");
        for (int i48 = 0; i48 < 5; i48++) {
            Random random7 = new Random();
            float[] fArr3 = new float[5000000];
            float[] fArr4 = new float[5000000];
            for (int i49 = 0; i49 < fArr3.length; i49++) {
                fArr3[i49] = random7.nextFloat();
                fArr4[i49] = random7.nextFloat();
            }
            Long valueOf12 = Long.valueOf(C0727bl.m2610a());
            for (int i50 = 0; i50 < 5; i50++) {
                for (int i51 = 0; i51 < fArr3.length; i51++) {
                    if (fArr3[i51] / fArr4[i51] == 0.0f) {
                        i47++;
                    }
                }
            }
            double m2607a12 = C0727bl.m2607a(valueOf12.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i47;
            GameEngine.PrintLog("Took: " + m2607a12);
        }
        int i52 = 0;
        GameEngine.PrintLog("=== divide/[multiply] float tests == (runs:5)");
        for (int i53 = 0; i53 < 5; i53++) {
            Random random8 = new Random();
            float[] fArr5 = new float[5000000];
            float[] fArr6 = new float[5000000];
            for (int i54 = 0; i54 < fArr5.length; i54++) {
                fArr5[i54] = random8.nextFloat();
                fArr6[i54] = random8.nextFloat();
            }
            Long valueOf13 = Long.valueOf(C0727bl.m2610a());
            for (int i55 = 0; i55 < 5; i55++) {
                for (int i56 = 0; i56 < fArr5.length; i56++) {
                    if (fArr5[i56] * fArr6[i56] == 0.0f) {
                        i52++;
                    }
                }
            }
            double m2607a13 = C0727bl.m2607a(valueOf13.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i52;
            GameEngine.PrintLog("Took: " + m2607a13);
        }
        int i57 = 0;
        GameEngine.PrintLog("=== [divide]/multiply int tests == (runs:5)");
        for (int i58 = 0; i58 < 5; i58++) {
            Random random9 = new Random();
            int[] iArr = new int[5000000];
            int[] iArr2 = new int[5000000];
            for (int i59 = 0; i59 < iArr.length; i59++) {
                iArr[i59] = random9.nextInt();
                iArr2[i59] = random9.nextInt();
            }
            Long valueOf14 = Long.valueOf(C0727bl.m2610a());
            for (int i60 = 0; i60 < 5; i60++) {
                for (int i61 = 0; i61 < iArr.length; i61++) {
                    if (iArr[i61] / iArr2[i61] == 0) {
                        i57++;
                    }
                }
            }
            double m2607a14 = C0727bl.m2607a(valueOf14.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i57;
            GameEngine.PrintLog("Took: " + m2607a14);
        }
        int i62 = 0;
        GameEngine.PrintLog("=== [float cast and divide]/multiply int tests == (runs:5)");
        for (int i63 = 0; i63 < 5; i63++) {
            Random random10 = new Random();
            int[] iArr3 = new int[5000000];
            int[] iArr4 = new int[5000000];
            for (int i64 = 0; i64 < iArr3.length; i64++) {
                iArr3[i64] = random10.nextInt();
                iArr4[i64] = random10.nextInt();
            }
            Long valueOf15 = Long.valueOf(C0727bl.m2610a());
            for (int i65 = 0; i65 < 5; i65++) {
                for (int i66 = 0; i66 < iArr3.length; i66++) {
                    if (iArr3[i66] / iArr4[i66] == 0.0f) {
                        i62++;
                    }
                }
            }
            double m2607a15 = C0727bl.m2607a(valueOf15.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i62;
            GameEngine.PrintLog("Took: " + m2607a15);
        }
        int i67 = 0;
        GameEngine.PrintLog("=== [mixed float and divide]/multiply int tests == (runs:5)");
        for (int i68 = 0; i68 < 5; i68++) {
            Random random11 = new Random();
            int[] iArr5 = new int[5000000];
            float[] fArr7 = new float[5000000];
            for (int i69 = 0; i69 < iArr5.length; i69++) {
                iArr5[i69] = random11.nextInt();
                fArr7[i69] = random11.nextFloat();
            }
            Long valueOf16 = Long.valueOf(C0727bl.m2610a());
            for (int i70 = 0; i70 < 5; i70++) {
                for (int i71 = 0; i71 < iArr5.length; i71++) {
                    if (iArr5[i71] / fArr7[i71] == 0.0f) {
                        i67++;
                    }
                }
            }
            double m2607a16 = C0727bl.m2607a(valueOf16.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i67;
            GameEngine.PrintLog("Took: " + m2607a16);
        }
        int i72 = 0;
        GameEngine.PrintLog("=== divide/[multiply] int tests == (runs:5)");
        for (int i73 = 0; i73 < 5; i73++) {
            Random random12 = new Random();
            int[] iArr6 = new int[5000000];
            int[] iArr7 = new int[5000000];
            for (int i74 = 0; i74 < iArr6.length; i74++) {
                iArr6[i74] = random12.nextInt();
                iArr7[i74] = random12.nextInt();
            }
            Long valueOf17 = Long.valueOf(C0727bl.m2610a());
            for (int i75 = 0; i75 < 5; i75++) {
                for (int i76 = 0; i76 < iArr6.length; i76++) {
                    if (iArr6[i76] * iArr7[i76] == 0) {
                        i72++;
                    }
                }
            }
            double m2607a17 = C0727bl.m2607a(valueOf17.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
            this.f394a += i72;
            GameEngine.PrintLog("Took: " + m2607a17);
        }
    }
}
