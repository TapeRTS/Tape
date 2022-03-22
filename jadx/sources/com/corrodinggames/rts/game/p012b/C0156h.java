package com.corrodinggames.rts.game.p012b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.b.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/h.class */
public class C0156h {

    /* renamed from: b */
    public C0748e f864b;

    /* renamed from: c */
    AbstractC0755l f865c;

    /* renamed from: e */
    int f867e;

    /* renamed from: f */
    int f868f;

    /* renamed from: g */
    int f869g;

    /* renamed from: h */
    int f870h;

    /* renamed from: i */
    float f871i;

    /* renamed from: j */
    boolean f872j;

    /* renamed from: k */
    C0156h f873k;

    /* renamed from: l */
    static final Rect f874l = new Rect();

    /* renamed from: m */
    static final Rect f875m = new Rect();

    /* renamed from: n */
    static final Rect f876n = new Rect();

    /* renamed from: a */
    int f863a = 0;

    /* renamed from: d */
    Paint f866d = new Paint();

    /* renamed from: o */
    Rect f877o = new Rect();

    /* renamed from: p */
    int f878p = -1;

    public C0156h(float f, boolean z) {
        this.f871i = 1.0f;
        this.f871i = f;
        this.f872j = z;
        this.f867e = (int) (20.0f * f);
        this.f868f = (int) (20.0f * f);
        this.f869g = this.f867e + 2;
        this.f870h = this.f868f + 2;
        if (!z) {
            this.f873k = new C0156h(f, true);
        }
    }

    /* renamed from: a */
    public void m3606a() {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f864b = u.f5514bw.mo145b(20 * this.f869g, 20 * this.f870h, this.f872j);
        this.f865c = u.f5514bw.mo177a(this.f864b);
        if (this.f872j) {
            this.f864b.f5243i = true;
        }
        if (this.f873k != null) {
            this.f873k.m3606a();
        }
    }

    /* renamed from: b */
    public void m3597b() {
        this.f863a = 0;
        this.f865c.mo146b(-16777216);
        this.f865c.mo123l();
        this.f864b.mo45q();
        if (this.f873k != null) {
            this.f873k.m3597b();
        }
    }

    /* renamed from: a */
    public int m3600a(C0158j jVar, int i) {
        int a;
        jVar.m3591a(i, f874l);
        if (this.f863a >= 400) {
            return -1;
        }
        boolean z = true;
        if (!this.f872j) {
            z = !m3599a(jVar.f885a, f874l);
        }
        if (z) {
            int i2 = this.f863a;
            this.f863a++;
            m3603a(i2, jVar.f885a, f874l);
            return i2;
        } else if (this.f873k == null || (a = this.f873k.m3600a(jVar, i)) == -1) {
            return -1;
        } else {
            return a + 500;
        }
    }

    /* renamed from: a */
    public static boolean m3599a(C0748e eVar, Rect rect) {
        int i = rect.f227a;
        int i2 = rect.f229c;
        int i3 = rect.f228b;
        int i4 = rect.f230d;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i > eVar.mo349l()) {
            i = eVar.mo349l();
        }
        if (i2 > eVar.mo349l()) {
            i2 = eVar.mo349l();
        }
        if (i3 > eVar.mo350k()) {
            i3 = eVar.mo350k();
        }
        if (i4 > eVar.mo350k()) {
            i4 = eVar.mo350k();
        }
        if (!eVar.mo50j()) {
            AbstractC0789l.m670d("hasImageAlpha: Cannot get pixel data for: " + eVar.mo63a());
            return true;
        }
        eVar.mo42w();
        for (int i5 = i3; i5 < i4; i5++) {
            for (int i6 = i; i6 < i2; i6++) {
                if (Color.m4215a(eVar.mo62a(i6, i5)) != 255) {
                    return true;
                }
            }
        }
        eVar.mo41x();
        return false;
    }

    /* renamed from: c */
    public void m3595c() {
        this.f865c.mo122m();
        if (this.f873k != null) {
            this.f873k.m3595c();
        }
    }

    /* renamed from: a */
    public void m3603a(int i, C0748e eVar, Rect rect) {
        Rect rect2 = new Rect();
        m3604a(i, rect2);
        boolean z = false;
        if (this.f871i < 1.0f) {
            z = true;
        }
        this.f866d.m4173a(z);
        this.f866d.m4158d(z);
        this.f866d.m4166b(z);
        m3598a(this.f865c, eVar, rect, rect2, this.f866d);
    }

    /* renamed from: a */
    public static void m3598a(AbstractC0755l lVar, C0748e eVar, Rect rect, Rect rect2, Paint paint) {
        for (int i = 0; i <= 3; i++) {
            m3602a(rect, f875m, i, 0);
            m3602a(rect2, f876n, i, 1);
            lVar.mo170a(eVar, f875m, f876n, paint);
        }
        for (int i2 = 0; i2 <= 3; i2++) {
            m3601a(rect, f875m, i2, 1, -1);
            m3601a(rect2, f876n, i2, 1, 0);
            lVar.mo170a(eVar, f875m, f876n, paint);
        }
        lVar.mo170a(eVar, rect, rect2, paint);
    }

    /* renamed from: a */
    public static Rect m3601a(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 0) {
            rect2.f227a = rect.f227a - 0;
            rect2.f229c = rect.f229c + 0;
            rect2.f228b = (rect.f228b - i2) - i3;
            rect2.f230d = rect.f228b - i3;
        } else if (i == 1) {
            rect2.f227a = rect.f229c + i3;
            rect2.f229c = rect.f229c + i2 + i3;
            rect2.f228b = rect.f228b - 0;
            rect2.f230d = rect.f230d + 0;
        } else if (i == 2) {
            rect2.f227a = rect.f227a - 0;
            rect2.f229c = rect.f229c + 0;
            rect2.f228b = rect.f230d + i3;
            rect2.f230d = rect.f230d + i2 + i3;
        } else {
            rect2.f227a = rect.f227a - i3;
            rect2.f229c = (rect.f227a - i2) - i3;
            rect2.f228b = rect.f228b - 0;
            rect2.f230d = rect.f230d + 0;
        }
        return rect2;
    }

    /* renamed from: a */
    public static Rect m3602a(Rect rect, Rect rect2, int i, int i2) {
        if (i == 0) {
            rect2.f227a = (rect.f229c - 1) + i2;
            rect2.f228b = rect.f228b - i2;
        } else if (i == 1) {
            rect2.f227a = (rect.f229c - 1) + i2;
            rect2.f228b = (rect.f230d - 1) + i2;
        } else if (i == 2) {
            rect2.f227a = rect.f227a - i2;
            rect2.f228b = (rect.f230d - 1) + i2;
        } else {
            rect2.f227a = rect.f227a - i2;
            rect2.f228b = rect.f228b - i2;
        }
        rect2.f229c = rect2.f227a + 1;
        rect2.f230d = rect2.f228b + 1;
        return rect2;
    }

    /* renamed from: a */
    public final C0748e m3605a(int i) {
        if (i >= 500) {
            return this.f873k.m3605a(i - 500);
        }
        return this.f864b;
    }

    /* renamed from: b */
    public final Rect m3596b(int i) {
        if (i >= 500) {
            return this.f873k.m3596b(i - 500);
        }
        if (this.f878p == i) {
            return this.f877o;
        }
        this.f878p = i;
        m3604a(i, this.f877o);
        return this.f877o;
    }

    /* renamed from: a */
    public void m3604a(int i, Rect rect) {
        int i2 = ((i % 20) * this.f869g) + 1;
        int i3 = (((int) (i * 0.05f)) * this.f870h) + 1;
        rect.f227a = i2;
        rect.f228b = i3;
        rect.f229c = i2 + this.f867e;
        rect.f230d = i3 + this.f868f;
    }
}
