package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;

/* renamed from: com.corrodinggames.rts.game.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/d.class */
public class C0152d {

    /* renamed from: a */
    public AbstractC0755l f806a;

    /* renamed from: b */
    int f807b;

    /* renamed from: c */
    int f808c;

    /* renamed from: d */
    public C0748e f809d;

    /* renamed from: e */
    public C0748e f810e;

    /* renamed from: f */
    public AbstractC0755l f811f;

    /* renamed from: g */
    public float f812g;

    /* renamed from: i */
    public int f814i;

    /* renamed from: j */
    public int f815j;

    /* renamed from: s */
    final /* synthetic */ C0151c f824s;

    /* renamed from: h */
    public Paint f813h = new C0760q();

    /* renamed from: k */
    public boolean f816k = true;

    /* renamed from: l */
    public boolean f817l = true;

    /* renamed from: m */
    public int f818m = 0;

    /* renamed from: n */
    public boolean f819n = false;

    /* renamed from: o */
    public final Rect f820o = new Rect();

    /* renamed from: p */
    public final Rect f821p = new Rect();

    /* renamed from: q */
    public final RectF f822q = new RectF();

    /* renamed from: r */
    public final Rect f823r = new Rect();

    /* renamed from: a */
    public void m3622a() {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f810e = u.f5514bw.mo192a(this.f809d.f5245k, this.f809d.f5246l, true);
        this.f811f = u.f5514bw.mo177a(this.f810e);
    }

    /* renamed from: b */
    public Rect m3621b() {
        this.f823r.m4136a(m3620c(), m3619d(), m3620c() + this.f824s.f798i, m3619d() + this.f824s.f798i);
        return this.f823r;
    }

    public C0152d(C0151c cVar, int i, int i2) {
        this.f824s = cVar;
        this.f814i = i;
        this.f815j = i2;
    }

    /* renamed from: c */
    public int m3620c() {
        return this.f824s.f795f + (this.f814i * this.f824s.f800k);
    }

    /* renamed from: d */
    public int m3619d() {
        return this.f824s.f796g + (this.f815j * this.f824s.f800k);
    }
}
