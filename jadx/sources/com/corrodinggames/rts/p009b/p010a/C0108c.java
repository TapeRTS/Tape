package com.corrodinggames.rts.p009b.p010a;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.b.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/b/a/c.class */
public class C0108c extends AbstractC0113h {
    /* renamed from: a */
    public void m3897a() {
        AbstractC0789l.m670d("Running unit tests - maths (v3)");
        C0654f.m1420i(100.0f, 100.0f);
        C0654f.m1420i(0.0f, 100.0f);
        C0654f.m1420i(100.0f, 0.0f);
        C0654f.m1420i(0.0f, -100.0f);
        C0654f.m1420i(-100.0f, 0.0f);
        C0654f.m1420i(0.0f, 0.0f);
        AbstractC0789l.m670d("fast_atan2 - NaN");
        C0654f.m1420i(Float.NaN, 0.0f);
        C0654f.m1420i(0.0f, Float.NaN);
        C0654f.m1420i(Float.NaN, Float.NaN);
        AbstractC0789l.m670d("fast_atan2 - Max");
        C0654f.m1420i(Float.MAX_VALUE, 0.0f);
        C0654f.m1420i(Float.MIN_VALUE, 0.0f);
        C0654f.m1420i(0.0f, Float.MAX_VALUE);
        C0654f.m1420i(0.0f, Float.MIN_VALUE);
        AbstractC0789l.m670d("fast_atan2 - NaN+Max");
        C0654f.m1420i(Float.MAX_VALUE, Float.NaN);
        C0654f.m1420i(Float.MIN_VALUE, Float.MAX_VALUE);
        C0654f.m1420i(Float.MAX_VALUE, Float.MIN_VALUE);
        C0654f.m1420i(900000.0f, 900000.0f);
        C0654f.m1420i(3.4028236E33f, 3.4028236E33f);
        C0654f.m1420i(3.4028236E34f, 3.4028236E34f);
        C0654f.m1420i(3.4028234E35f, 3.4028234E35f);
        C0654f.m1420i(3.4028236E36f, 3.4028236E36f);
        C0654f.m1420i(3.4028235E37f, 3.4028235E37f);
        C0654f.m1420i(Float.MAX_VALUE, Float.MAX_VALUE);
        AbstractC0789l.m670d("fast_atan2 - max,max");
        C0654f.m1420i(Float.MAX_VALUE, Float.MAX_VALUE);
        C0654f.m1420i(Float.MIN_VALUE, Float.MIN_VALUE);
        AbstractC0789l.m670d("cos/sin");
        C0114i.m3890a(C0654f.m1421i(0.0f), 1.0f);
        C0114i.m3890a(C0654f.m1421i(360.0f), 1.0f);
        C0114i.m3890a(C0654f.m1421i(10800.0f), 1.0f);
        C0114i.m3890a(C0654f.m1421i(45.0f), 0.70710677f);
        C0114i.m3890a(C0654f.m1421i(90.0f), 0.0f);
        C0114i.m3890a(C0654f.m1421i(450.0f), 0.0f);
        C0114i.m3890a(C0654f.m1421i(10890.0f), 0.0f);
        C0114i.m3890a(C0654f.m1425h(0.0f), 0.0f);
        C0114i.m3890a(C0654f.m1425h(90.0f), 1.0f);
        C0654f.m1421i(-999999.0f);
        C0654f.m1421i(999999.0f);
        C0654f.m1421i(Float.MAX_VALUE);
        C0654f.m1421i(Float.MIN_VALUE);
        C0654f.m1425h(Float.MAX_VALUE);
        C0654f.m1425h(Float.MIN_VALUE);
        AbstractC0789l.m670d("Testing squareroot");
        for (int i = 0; i < 1005; i++) {
            C0114i.m3890a(C0654f.m1515a(i), C0654f.m1449d(C0654f.m1523a(i)));
        }
    }
}
