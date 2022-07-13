package com.corrodinggames.rts.p007a.p008a;

import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/d.class */
public class C0074d extends AbstractC0079i {
    /* renamed from: a */
    public void m4470a() {
        GameEngine.PrintLOG("Running unit tests - maths (v3)");
        CommonUtils.m1628i(100.0f, 100.0f);
        CommonUtils.m1628i(0.0f, 100.0f);
        CommonUtils.m1628i(100.0f, 0.0f);
        CommonUtils.m1628i(0.0f, -100.0f);
        CommonUtils.m1628i(-100.0f, 0.0f);
        CommonUtils.m1628i(0.0f, 0.0f);
        GameEngine.PrintLOG("fast_atan2 - NaN");
        CommonUtils.m1628i(Float.NaN, 0.0f);
        CommonUtils.m1628i(0.0f, Float.NaN);
        CommonUtils.m1628i(Float.NaN, Float.NaN);
        GameEngine.PrintLOG("fast_atan2 - Max");
        CommonUtils.m1628i(Float.MAX_VALUE, 0.0f);
        CommonUtils.m1628i(Float.MIN_VALUE, 0.0f);
        CommonUtils.m1628i(0.0f, Float.MAX_VALUE);
        CommonUtils.m1628i(0.0f, Float.MIN_VALUE);
        GameEngine.PrintLOG("fast_atan2 - NaN+Max");
        CommonUtils.m1628i(Float.MAX_VALUE, Float.NaN);
        CommonUtils.m1628i(Float.MIN_VALUE, Float.MAX_VALUE);
        CommonUtils.m1628i(Float.MAX_VALUE, Float.MIN_VALUE);
        CommonUtils.m1628i(900000.0f, 900000.0f);
        CommonUtils.m1628i(3.4028236E33f, 3.4028236E33f);
        CommonUtils.m1628i(3.4028236E34f, 3.4028236E34f);
        CommonUtils.m1628i(3.4028234E35f, 3.4028234E35f);
        CommonUtils.m1628i(3.4028236E36f, 3.4028236E36f);
        CommonUtils.m1628i(3.4028235E37f, 3.4028235E37f);
        CommonUtils.m1628i(Float.MAX_VALUE, Float.MAX_VALUE);
        GameEngine.PrintLOG("fast_atan2 - max,max");
        CommonUtils.m1628i(Float.MAX_VALUE, Float.MAX_VALUE);
        CommonUtils.m1628i(Float.MIN_VALUE, Float.MIN_VALUE);
        GameEngine.PrintLOG("cos/sin");
        C0081k.m4454a(CommonUtils.cos(0.0f), 1.0f);
        C0081k.m4454a(CommonUtils.cos(360.0f), 1.0f);
        C0081k.m4454a(CommonUtils.cos(10800.0f), 1.0f);
        C0081k.m4454a(CommonUtils.cos(45.0f), 0.70710677f);
        C0081k.m4454a(CommonUtils.cos(90.0f), 0.0f);
        C0081k.m4454a(CommonUtils.cos(450.0f), 0.0f);
        C0081k.m4454a(CommonUtils.cos(10890.0f), 0.0f);
        C0081k.m4454a(CommonUtils.sin(0.0f), 0.0f);
        C0081k.m4454a(CommonUtils.sin(90.0f), 1.0f);
        CommonUtils.cos(-999999.0f);
        CommonUtils.cos(999999.0f);
        CommonUtils.cos(Float.MAX_VALUE);
        CommonUtils.cos(Float.MIN_VALUE);
        CommonUtils.sin(Float.MAX_VALUE);
        CommonUtils.sin(Float.MIN_VALUE);
        GameEngine.PrintLOG("Testing squareroot");
        for (int i = 0; i < 1005; i++) {
            C0081k.m4454a(CommonUtils.m1738a(i), CommonUtils.ceil(CommonUtils.m1746a(i)));
        }
    }
}