package com.corrodinggames.rts.game.p012b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;

/* renamed from: com.corrodinggames.rts.game.b.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/h.class */
public class C0181h {

    /* renamed from: b */
    public C0934e f928b;

    /* renamed from: c */
    InterfaceC1027y f929c;

    /* renamed from: e */
    int f931e;

    /* renamed from: f */
    int f932f;

    /* renamed from: g */
    int f933g;

    /* renamed from: h */
    int f934h;

    /* renamed from: i */
    float f935i;

    /* renamed from: j */
    boolean f936j;

    /* renamed from: k */
    C0181h f937k;

    /* renamed from: l */
    static final Rect f938l = new Rect();

    /* renamed from: m */
    static final Rect f939m = new Rect();

    /* renamed from: n */
    static final Rect f940n = new Rect();

    /* renamed from: a */
    int f927a = 0;

    /* renamed from: d */
    Paint f930d = new Paint();

    /* renamed from: o */
    Rect f941o = new Rect();

    /* renamed from: p */
    int f942p = -1;

    public C0181h(float f, boolean z) {
        this.f935i = 1.0f;
        this.f935i = f;
        this.f936j = z;
        this.f931e = (int) (20.0f * f);
        this.f932f = (int) (20.0f * f);
        this.f933g = this.f931e + 2;
        this.f934h = this.f932f + 2;
        if (!z) {
            this.f937k = new C0181h(f, true);
        }
    }

    /* renamed from: a */
    public void m5791a() {
        GameEngine m1228A = GameEngine.m1228A();
        this.f928b = m1228A.f6107bO.mo887b(20 * this.f933g, 20 * this.f934h, this.f936j);
        this.f929c = m1228A.f6107bO.mo885b(this.f928b);
        if (this.f936j) {
            this.f928b.f6394m = true;
        }
        if (this.f937k != null) {
            this.f937k.m5791a();
        }
    }

    /* renamed from: b */
    public void m5782b() {
        this.f927a = 0;
        this.f929c.mo888b(-16777216);
        this.f929c.mo868o();
        this.f928b.mo386r();
        if (this.f937k != null) {
            this.f937k.m5782b();
        }
    }

    /* renamed from: a */
    public int m5785a(C0183j c0183j, int i) {
        int m5785a;
        c0183j.m5775a(i, f938l);
        if (this.f927a >= 400) {
            return -1;
        }
        boolean z = true;
        if (!this.f936j) {
            z = !m5784a(c0183j.f950b, f938l);
        }
        if (z) {
            int i2 = this.f927a;
            this.f927a++;
            m5788a(i2, c0183j.f950b, f938l);
            return i2;
        } else if (this.f937k != null && (m5785a = this.f937k.m5785a(c0183j, i)) != -1) {
            return m5785a + 500;
        } else {
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m5784a(C0934e c0934e, Rect rect) {
        int i = rect.f230a;
        int i2 = rect.f232c;
        int i3 = rect.f231b;
        int i4 = rect.f233d;
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
        if (i > c0934e.mo390m()) {
            i = c0934e.mo390m();
        }
        if (i2 > c0934e.mo390m()) {
            i2 = c0934e.mo390m();
        }
        if (i3 > c0934e.mo391l()) {
            i3 = c0934e.mo391l();
        }
        if (i4 > c0934e.mo391l()) {
            i4 = c0934e.mo391l();
        }
        if (!c0934e.m1029k()) {
            GameEngine.PrintLog("hasImageAlpha: Cannot get pixel data for: " + c0934e.mo407a());
            return true;
        }
        c0934e.m1026x();
        for (int i5 = i3; i5 < i4; i5++) {
            for (int i6 = i; i6 < i2; i6++) {
                if (Color.m6523a(c0934e.mo406a(i6, i5)) != 255) {
                    return true;
                }
            }
        }
        c0934e.m1025y();
        return false;
    }

    /* renamed from: c */
    public void m5780c() {
        this.f929c.mo867p();
        if (this.f937k != null) {
            this.f937k.m5780c();
        }
    }

    /* renamed from: a */
    public void m5788a(int i, C0934e c0934e, Rect rect) {
        Rect rect2 = new Rect();
        m5789a(i, rect2);
        boolean z = false;
        if (this.f935i < 1.0f) {
            z = true;
        }
        this.f930d.mo6487a(z);
        this.f930d.m6470d(z);
        this.f930d.m6478b(z);
        m5783a(this.f929c, c0934e, rect, rect2, this.f930d);
    }

    /* renamed from: a */
    public static void m5783a(InterfaceC1027y interfaceC1027y, C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        for (int i = 0; i <= 3; i++) {
            m5787a(rect, f939m, i, 0);
            m5787a(rect2, f940n, i, 1);
            interfaceC1027y.mo904a(c0934e, f939m, f940n, paint);
        }
        for (int i2 = 0; i2 <= 3; i2++) {
            m5786a(rect, f939m, i2, 1, -1);
            m5786a(rect2, f940n, i2, 1, 0);
            interfaceC1027y.mo904a(c0934e, f939m, f940n, paint);
        }
        interfaceC1027y.mo904a(c0934e, rect, rect2, paint);
    }

    /* renamed from: a */
    public static Rect m5786a(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 0) {
            rect2.f230a = rect.f230a - 0;
            rect2.f232c = rect.f232c + 0;
            rect2.f231b = (rect.f231b - i2) - i3;
            rect2.f233d = rect.f231b - i3;
        } else if (i == 1) {
            rect2.f230a = rect.f232c + i3;
            rect2.f232c = rect.f232c + i2 + i3;
            rect2.f231b = rect.f231b - 0;
            rect2.f233d = rect.f233d + 0;
        } else if (i == 2) {
            rect2.f230a = rect.f230a - 0;
            rect2.f232c = rect.f232c + 0;
            rect2.f231b = rect.f233d + i3;
            rect2.f233d = rect.f233d + i2 + i3;
        } else {
            rect2.f230a = rect.f230a - i3;
            rect2.f232c = (rect.f230a - i2) - i3;
            rect2.f231b = rect.f231b - 0;
            rect2.f233d = rect.f233d + 0;
        }
        return rect2;
    }

    /* renamed from: a */
    public static Rect m5787a(Rect rect, Rect rect2, int i, int i2) {
        if (i == 0) {
            rect2.f230a = (rect.f232c - 1) + i2;
            rect2.f231b = rect.f231b - i2;
        } else if (i == 1) {
            rect2.f230a = (rect.f232c - 1) + i2;
            rect2.f231b = (rect.f233d - 1) + i2;
        } else if (i == 2) {
            rect2.f230a = rect.f230a - i2;
            rect2.f231b = (rect.f233d - 1) + i2;
        } else {
            rect2.f230a = rect.f230a - i2;
            rect2.f231b = rect.f231b - i2;
        }
        rect2.f232c = rect2.f230a + 1;
        rect2.f233d = rect2.f231b + 1;
        return rect2;
    }

    /* renamed from: a */
    public final C0934e m5790a(int i) {
        if (i >= 500) {
            return this.f937k.m5790a(i - 500);
        }
        return this.f928b;
    }

    /* renamed from: b */
    public final Rect m5781b(int i) {
        if (i >= 500) {
            return this.f937k.m5781b(i - 500);
        }
        if (this.f942p == i) {
            return this.f941o;
        }
        this.f942p = i;
        m5789a(i, this.f941o);
        return this.f941o;
    }

    /* renamed from: a */
    public void m5789a(int i, Rect rect) {
        int i2 = ((i % 20) * this.f933g) + 1;
        int i3 = (((int) (i * 0.05f)) * this.f934h) + 1;
        rect.f230a = i2;
        rect.f231b = i3;
        rect.f232c = i2 + this.f931e;
        rect.f233d = i3 + this.f932f;
    }
}
