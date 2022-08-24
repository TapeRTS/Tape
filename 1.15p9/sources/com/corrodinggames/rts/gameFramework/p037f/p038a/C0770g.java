package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/g.class */
public class C0770g {

    /* renamed from: a */
    public static final C0770g f5011a;

    /* renamed from: b */
    public static final C0770g f5012b;

    /* renamed from: c */
    public static final C0770g f5013c;

    /* renamed from: d */
    public static final C0770g f5014d;

    /* renamed from: e */
    public static final C0770g f5015e;

    /* renamed from: g */
    C0934e f5016g;

    /* renamed from: f */
    Paint f5017f = new C0930ag();

    /* renamed from: h */
    Paint f5018h = new C0930ag();

    /* renamed from: a */
    public C0770g clone() {
        C0770g c0770g = new C0770g();
        c0770g.f5016g = this.f5016g;
        if (this.f5017f != null) {
            c0770g.f5017f = new Paint(c0770g.f5017f);
        } else {
            c0770g.f5017f = null;
        }
        if (this.f5018h != null) {
            c0770g.f5018h = new Paint(c0770g.f5018h);
        } else {
            c0770g.f5018h = null;
        }
        return c0770g;
    }

    static {
        C0770g c0770g = new C0770g();
        f5011a = c0770g;
        c0770g.f5017f.m6481b(Color.m6521a(140, 100, 100, 100));
        c0770g.f5018h.m6481b(-16777216);
        c0770g.f5018h.m6499a(Paint.Style.STROKE);
        C0770g c0770g2 = new C0770g();
        f5012b = c0770g2;
        c0770g2.f5017f.m6481b(Color.m6521a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3));
        c0770g2.f5018h.m6481b(-16777216);
        c0770g2.f5018h.m6499a(Paint.Style.STROKE);
        C0770g c0770g3 = new C0770g();
        f5013c = c0770g3;
        c0770g3.f5017f = null;
        c0770g3.f5018h = null;
        C0770g c0770g4 = new C0770g();
        f5014d = c0770g4;
        c0770g4.f5017f = null;
        c0770g4.f5018h.m6481b(-65536);
        c0770g4.f5018h.m6476c(127);
        c0770g4.f5018h.m6499a(Paint.Style.STROKE);
        C0770g c0770g5 = new C0770g();
        f5015e = c0770g5;
        c0770g5.f5017f.m6476c(255);
        c0770g5.f5016g = GameEngine.m1228A().f6111bS.f5235bf;
        c0770g5.f5018h.m6481b(-7829368);
        c0770g5.f5018h.m6476c(255);
        c0770g5.f5018h.m6499a(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void m2162a(InterfaceC1027y interfaceC1027y, RectF rectF) {
        m2161a(interfaceC1027y, rectF, null);
    }

    /* renamed from: a */
    public void m2161a(InterfaceC1027y interfaceC1027y, RectF rectF, String str) {
        GameEngine m1228A = GameEngine.m1228A();
        if (this.f5016g != null) {
            m1228A.f6107bO.mo902a(this.f5016g, rectF, this.f5017f, 0.0f, 0.0f, 0, 0);
        } else if (this.f5017f != null) {
            interfaceC1027y.mo914a(rectF, this.f5017f);
        }
        if (this.f5018h != null) {
            interfaceC1027y.mo914a(rectF, this.f5018h);
        }
        if (str != null) {
        }
    }
}
