package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/d.class */
public class C0075d extends AbstractC0083l {

    /* renamed from: a */
    int f392a;

    /* renamed from: a */
    public void m6250a() {
        GameEngine.PrintLog("Running unit tests - maths (v3)");
        C0758f.m2245i(100.0f, 100.0f);
        C0758f.m2245i(0.0f, 100.0f);
        C0758f.m2245i(100.0f, 0.0f);
        C0758f.m2245i(0.0f, -100.0f);
        C0758f.m2245i(-100.0f, 0.0f);
        C0758f.m2245i(0.0f, 0.0f);
        GameEngine.PrintLog("fast_atan2 - NaN");
        C0758f.m2245i(Float.NaN, 0.0f);
        C0758f.m2245i(0.0f, Float.NaN);
        C0758f.m2245i(Float.NaN, Float.NaN);
        GameEngine.PrintLog("fast_atan2 - Max");
        C0758f.m2245i(Float.MAX_VALUE, 0.0f);
        C0758f.m2245i(Float.MIN_VALUE, 0.0f);
        C0758f.m2245i(0.0f, Float.MAX_VALUE);
        C0758f.m2245i(0.0f, Float.MIN_VALUE);
        GameEngine.PrintLog("fast_atan2 - NaN+Max");
        C0758f.m2245i(Float.MAX_VALUE, Float.NaN);
        C0758f.m2245i(Float.MIN_VALUE, Float.MAX_VALUE);
        C0758f.m2245i(Float.MAX_VALUE, Float.MIN_VALUE);
        C0758f.m2245i(900000.0f, 900000.0f);
        C0758f.m2245i(3.4028236E33f, 3.4028236E33f);
        C0758f.m2245i(3.4028236E34f, 3.4028236E34f);
        C0758f.m2245i(3.4028234E35f, 3.4028234E35f);
        C0758f.m2245i(3.4028236E36f, 3.4028236E36f);
        C0758f.m2245i(3.4028235E37f, 3.4028235E37f);
        C0758f.m2245i(Float.MAX_VALUE, Float.MAX_VALUE);
        GameEngine.PrintLog("fast_atan2 - max,max");
        C0758f.m2245i(Float.MAX_VALUE, Float.MAX_VALUE);
        C0758f.m2245i(Float.MIN_VALUE, Float.MIN_VALUE);
        GameEngine.PrintLog("cos/sin");
        C0085n.m6232a(C0758f.m2246i(0.0f), 1.0f);
        C0085n.m6232a(C0758f.m2246i(360.0f), 1.0f);
        C0085n.m6232a(C0758f.m2246i(10800.0f), 1.0f);
        C0085n.m6232a(C0758f.m2246i(45.0f), 0.70710677f);
        C0085n.m6232a(C0758f.m2246i(90.0f), 0.0f);
        C0085n.m6232a(C0758f.m2246i(450.0f), 0.0f);
        C0085n.m6232a(C0758f.m2246i(10890.0f), 0.0f);
        C0085n.m6232a(C0758f.m2251h(0.0f), 0.0f);
        C0085n.m6232a(C0758f.m2251h(90.0f), 1.0f);
        C0758f.m2246i(-999999.0f);
        C0758f.m2246i(999999.0f);
        C0758f.m2246i(Float.MAX_VALUE);
        C0758f.m2246i(Float.MIN_VALUE);
        C0758f.m2251h(Float.MAX_VALUE);
        C0758f.m2251h(Float.MIN_VALUE);
        GameEngine.PrintLog("diff sin(0):  " + String.format("%.12f", Float.valueOf(C0758f.m2251h(0.0f) - ((float) StrictMath.sin(0.0d)))));
        GameEngine.PrintLog("diff sin(45): " + String.format("%.12f", Float.valueOf(C0758f.m2251h(45.0f) - ((float) StrictMath.sin(0.7853981633974483d)))));
        GameEngine.PrintLog("diff sin(90): " + String.format("%.12f", Float.valueOf(C0758f.m2251h(90.0f) - ((float) StrictMath.sin(1.5707963267948966d)))));
        GameEngine.PrintLog("diff sin(180):" + String.format("%.12f", Float.valueOf(C0758f.m2251h(180.0f) - ((float) StrictMath.sin(3.141592653589793d)))));
        GameEngine.PrintLog("diff sin(360):" + String.format("%.12f", Float.valueOf(C0758f.m2251h(360.0f) - ((float) StrictMath.sin(6.283185307179586d)))));
        GameEngine.PrintLog("Testing squareroot");
        for (int i = 0; i < 1005; i++) {
            C0085n.m6232a(C0758f.m2358a(i), C0758f.m2280d(C0758f.m2366a(i)));
        }
        int i2 = 0;
        GameEngine.PrintLog("=== cos/sin tests (runs:5)");
        Long valueOf = Long.valueOf(C0727bl.m2610a());
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 2000; i4++) {
                if (C0758f.m2246i(i4) == 0.0f) {
                    i2++;
                }
                if (C0758f.m2251h(i4) == 0.0f) {
                    i2++;
                }
            }
        }
        double m2607a = C0727bl.m2607a(valueOf.longValue(), Long.valueOf(C0727bl.m2610a()).longValue());
        this.f392a += i2;
        GameEngine.PrintLog("Took: " + m2607a);
    }
}
