package com.corrodinggames.rts.gameFramework.p039j;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.gameFramework.j.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/q.class */
public class C0760q extends Paint {

    /* renamed from: r */
    public static final C0760q f5309r = new C0760q();

    /* renamed from: s */
    boolean f5310s = false;

    static {
        f5309r.m4169b(-1);
        f5309r.m833n();
    }

    /* renamed from: n */
    public void m833n() {
        this.f5310s = true;
    }

    /* renamed from: c */
    public void m834c(float f) {
        super.mo836b(f);
    }

    @Override // android.graphics.Paint
    /* renamed from: b */
    public void mo836b(float f) {
        if (this.f5310s) {
            AbstractC0789l.m682b("UniquePaint changed when locked down:");
            AbstractC0789l.m682b("from:" + m4149k() + " to: " + f);
            AbstractC0789l.m748M();
        }
        super.mo836b(f);
    }

    @Override // android.graphics.Paint
    /* renamed from: a */
    public Typeface mo837a(Typeface typeface) {
        if (this.f5310s) {
            AbstractC0789l.m682b("UniquePaint changed when locked down:");
            AbstractC0789l.m748M();
        }
        return super.mo837a(typeface);
    }

    /* renamed from: b */
    public static void m835b(Paint paint) {
        ((C0760q) paint).m833n();
    }
}
