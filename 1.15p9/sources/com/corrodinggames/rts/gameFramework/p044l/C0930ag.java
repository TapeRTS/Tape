package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.l.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/ag.class */
public class C0930ag extends Paint {

    /* renamed from: r */
    public static final C0930ag f6366r = new C0930ag();

    /* renamed from: t */
    C0928ae f6367t;

    /* renamed from: s */
    boolean f6368s = false;

    /* renamed from: u */
    boolean f6369u = false;

    static {
        f6366r.m6481b(-1);
        f6366r.m1043o();
    }

    /* renamed from: o */
    public void m1043o() {
        this.f6369u = true;
    }

    /* renamed from: c */
    public void m1044c(float f) {
        super.mo6482b(f);
    }

    /* renamed from: b */
    public void mo6482b(float f) {
        if (this.f6369u) {
            GameEngine.m1139b("UniquePaint changed when locked down:");
            GameEngine.m1139b("from:" + m6461k() + " to: " + f);
            GameEngine.m1210S();
        }
        super.mo6482b(f);
    }

    /* renamed from: a */
    public Typeface mo6497a(Typeface typeface) {
        if (this.f6369u) {
            GameEngine.m1139b("UniquePaint changed when locked down:");
            GameEngine.m1210S();
        }
        return super.mo6497a(typeface);
    }

    /* renamed from: b */
    public static void m1045b(Paint paint) {
        ((C0930ag) paint).m1043o();
    }

    /* renamed from: p */
    public boolean m1042p() {
        return this.f6368s;
    }

    /* renamed from: a */
    public void mo6487a(boolean z) {
        this.f6368s = z;
        super.mo6487a(z);
    }

    /* renamed from: q */
    public C0928ae m1041q() {
        return this.f6367t;
    }

    /* renamed from: a */
    public void m1048a(C0928ae c0928ae) {
        this.f6367t = c0928ae;
    }
}
