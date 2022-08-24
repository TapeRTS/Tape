package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;

/* renamed from: com.corrodinggames.rts.game.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/d.class */
public class C0177d {

    /* renamed from: a */
    public InterfaceC1027y f870a;

    /* renamed from: b */
    int f871b;

    /* renamed from: c */
    int f872c;

    /* renamed from: d */
    public C0934e f873d;

    /* renamed from: e */
    public C0934e f874e;

    /* renamed from: f */
    public InterfaceC1027y f875f;

    /* renamed from: g */
    public float f876g;

    /* renamed from: i */
    public int f878i;

    /* renamed from: j */
    public int f879j;

    /* renamed from: s */
    final /* synthetic */ C0176c f888s;

    /* renamed from: h */
    public Paint f877h = new C0930ag();

    /* renamed from: k */
    public boolean f880k = true;

    /* renamed from: l */
    public boolean f881l = true;

    /* renamed from: m */
    public int f882m = 0;

    /* renamed from: n */
    public boolean f883n = false;

    /* renamed from: o */
    public final Rect f884o = new Rect();

    /* renamed from: p */
    public final Rect f885p = new Rect();

    /* renamed from: q */
    public final RectF f886q = new RectF();

    /* renamed from: r */
    public final Rect f887r = new Rect();

    /* renamed from: a */
    public void m5809a() {
        GameEngine m1228A = GameEngine.m1228A();
        this.f874e = m1228A.f6107bO.mo922a(this.f873d.f6396p, this.f873d.f6397q, true);
        if (this.f874e != null && !this.f874e.mo413A()) {
            this.f874e.m1035a("fadeOutBitmap");
        }
        if (this.f874e == null || this.f874e.mo413A()) {
            throw new OutOfMemoryError("Failed to create fade out bitmap");
        }
        this.f874e.m1034b(true);
        this.f875f = m1228A.f6107bO.mo885b(this.f874e);
    }

    /* renamed from: b */
    public Rect m5808b() {
        this.f887r.m6447a(m5807c(), m5806d(), m5807c() + this.f888s.f857i, m5806d() + this.f888s.f857i);
        return this.f887r;
    }

    public C0177d(C0176c c0176c, int i, int i2) {
        this.f888s = c0176c;
        this.f878i = i;
        this.f879j = i2;
    }

    /* renamed from: c */
    public int m5807c() {
        return this.f888s.f854f + (this.f878i * this.f888s.f859k);
    }

    /* renamed from: d */
    public int m5806d() {
        return this.f888s.f855g + (this.f879j * this.f888s.f859k);
    }
}
