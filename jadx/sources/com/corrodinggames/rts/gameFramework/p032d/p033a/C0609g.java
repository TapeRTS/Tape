package com.corrodinggames.rts.gameFramework.p032d.p033a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a/g.class */
public class C0609g {

    /* renamed from: a */
    public static final C0609g f4213a;

    /* renamed from: b */
    public static final C0609g f4214b;

    /* renamed from: c */
    public static final C0609g f4215c;

    /* renamed from: d */
    public static final C0609g f4216d;

    /* renamed from: e */
    public static final C0609g f4217e;

    /* renamed from: g */
    C0748e f4219g;

    /* renamed from: f */
    Paint f4218f = new C0760q();

    /* renamed from: h */
    Paint f4220h = new C0760q();

    /* renamed from: a */
    public C0609g clone() {
        C0609g gVar = new C0609g();
        gVar.f4219g = this.f4219g;
        if (this.f4218f != null) {
            gVar.f4218f = new Paint(gVar.f4218f);
        } else {
            gVar.f4218f = null;
        }
        if (this.f4220h != null) {
            gVar.f4220h = new Paint(gVar.f4220h);
        } else {
            gVar.f4220h = null;
        }
        return gVar;
    }

    static {
        C0609g gVar = new C0609g();
        f4213a = gVar;
        gVar.f4218f.m4169b(Color.m4213a(140, 100, 100, 100));
        gVar.f4220h.m4169b(-16777216);
        gVar.f4220h.m4184a(Paint.Style.STROKE);
        C0609g gVar2 = new C0609g();
        f4214b = gVar2;
        gVar2.f4218f.m4169b(Color.m4213a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3));
        gVar2.f4220h.m4169b(-16777216);
        gVar2.f4220h.m4184a(Paint.Style.STROKE);
        C0609g gVar3 = new C0609g();
        f4215c = gVar3;
        gVar3.f4218f = null;
        gVar3.f4220h = null;
        C0609g gVar4 = new C0609g();
        f4216d = gVar4;
        gVar4.f4218f = null;
        gVar4.f4220h.m4169b(-65536);
        gVar4.f4220h.m4164c(127);
        gVar4.f4220h.m4184a(Paint.Style.STROKE);
        C0609g gVar5 = new C0609g();
        f4217e = gVar5;
        gVar5.f4218f.m4164c(255);
        gVar5.f4219g = AbstractC0789l.m638u().f5518bA.f4384be;
        gVar5.f4220h.m4169b(-7829368);
        gVar5.f4220h.m4164c(255);
        gVar5.f4220h.m4184a(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void m1806a(AbstractC0755l lVar, RectF rectF) {
        m1805a(lVar, rectF, null);
    }

    /* renamed from: a */
    public void m1805a(AbstractC0755l lVar, RectF rectF, String str) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f4219g != null) {
            u.f5514bw.mo168a(this.f4219g, rectF, this.f4218f, 0.0f, 0.0f, 0, 0);
        } else if (this.f4218f != null) {
            lVar.mo179a(rectF, this.f4218f);
        }
        if (this.f4220h != null) {
            lVar.mo179a(rectF, this.f4220h);
        }
        if (str != null) {
        }
    }
}
