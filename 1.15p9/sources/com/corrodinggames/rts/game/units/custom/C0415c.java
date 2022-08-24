package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c.class */
public final class C0415c {

    /* renamed from: a */
    EnumC0422d f2657a;

    /* renamed from: b */
    int f2658b;

    /* renamed from: c */
    String f2659c;

    /* renamed from: d */
    float f2660d;

    /* renamed from: e */
    public C0320a[] f2661e;

    /* renamed from: g */
    private C1101m f2662g = new C1101m();

    /* renamed from: f */
    public final boolean f2663f = true;

    /* renamed from: a */
    public C0386b m4601a() {
        C0386b c0386b = null;
        if (this.f2662g.size() > 0) {
            c0386b = (C0386b) this.f2662g.get(this.f2662g.size() - 1);
            if (c0386b.f2325h) {
                c0386b = null;
            }
        }
        return c0386b;
    }

    /* renamed from: a */
    public void m4598a(C0451j c0451j, float f, float f2, boolean z) {
        if (z || f2 <= f) {
            return;
        }
        C0320a[] c0320aArr = this.f2661e;
        int length = c0320aArr.length;
        int i = -1;
        while (i + 1 < length && f > c0320aArr[i + 1].f1906a) {
            i++;
        }
        int i2 = i;
        while (i2 + 1 < length && f2 > c0320aArr[i2 + 1].f1906a) {
            i2++;
        }
        if (i2 <= i) {
            return;
        }
        GameEngine.PrintLog("last:" + i + " new:" + i2 + " lastTime:" + f + " time:" + f2);
        for (int i3 = i + 1; i3 <= i2; i3++) {
            C0386b c0386b = (C0386b) c0320aArr[i3];
            if (c0386b.f2322e != null) {
                GameEngine.PrintLog("triggering effect " + i3 + ": " + c0386b.f1906a + " " + c0386b.f2322e.f3352a);
            }
            c0386b.m4686a(c0451j);
        }
    }

    /* renamed from: b */
    public void m4596b() {
        C0386b m4601a;
        if (this.f2657a == EnumC0422d.event && (m4601a = m4601a()) != null) {
            m4601a.finalize();
        }
    }

    /* renamed from: a */
    public void m4597a(C0453l c0453l, float f, String str, String str2) {
        if (this.f2657a == EnumC0422d.event) {
            C0386b m4601a = m4601a();
            if (m4601a == null) {
                m4601a = new C0386b(f, 0.0f);
                this.f2662g.add(m4601a);
            }
            m4601a.m4685a(c0453l, str, str2);
            return;
        }
        try {
            m4599a(f, Float.parseFloat(str2));
        } catch (NumberFormatException e) {
            throw new C0412bm("Failed to parse float:" + str2);
        }
    }

    /* renamed from: a */
    public void m4599a(float f, float f2) {
        if (this.f2657a == EnumC0422d.event) {
            throw new C0412bm("Adding key frame value to event set");
        }
        if (this.f2662g.size() == 0 && f > 0.0f && f2 != 0.0f) {
            this.f2662g.add(new C0320a(0.0f, 0.0f));
        }
        this.f2662g.add(new C0320a(f, f2));
    }

    /* renamed from: a */
    public void m4600a(float f) {
        Iterator it = this.f2662g.iterator();
        while (it.hasNext()) {
            ((C0320a) it.next()).f1906a *= f;
        }
    }

    /* renamed from: c */
    public void m4594c() {
        Collections.sort(this.f2662g);
        C0320a c0320a = null;
        Iterator it = this.f2662g.iterator();
        while (it.hasNext()) {
            C0320a c0320a2 = (C0320a) it.next();
            if (c0320a != null) {
                c0320a2.f1908c = 1.0f / (c0320a2.f1906a - c0320a.f1906a);
                c0320a2.f1909d = c0320a2.f1907b - c0320a.f1907b;
            }
            c0320a = c0320a2;
            this.f2660d = c0320a2.f1906a;
        }
        this.f2661e = (C0320a[]) this.f2662g.toArray(new C0320a[0]);
        this.f2662g = null;
    }

    /* renamed from: b */
    public float m4595b(float f) {
        C0320a[] c0320aArr = this.f2661e;
        int length = c0320aArr.length;
        if (length == 1 || f <= c0320aArr[0].f1906a) {
            return c0320aArr[0].f1907b;
        }
        if (f >= this.f2660d) {
            return c0320aArr[length - 1].f1907b;
        }
        int i = 1;
        while (f > c0320aArr[i].f1906a) {
            i++;
            if (i >= length) {
                return c0320aArr[length - 1].f1907b;
            }
        }
        C0320a c0320a = c0320aArr[i - 1];
        C0320a c0320a2 = c0320aArr[i];
        return c0320a.f1907b + (c0320a2.f1909d * (f - c0320a.f1906a) * c0320a2.f1908c);
    }
}
