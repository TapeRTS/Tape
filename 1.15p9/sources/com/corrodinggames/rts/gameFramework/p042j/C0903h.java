package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Point;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.C0237af;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.j.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/h.class */
public class C0903h extends AbstractC0898c {

    /* renamed from: a */
    C0901f f5947a;

    /* renamed from: b */
    C0237af f5948b = new C0237af();

    /* renamed from: c */
    static Point f5949c = new Point();

    public C0903h(C0901f c0901f) {
        this.f5947a = c0901f;
    }

    /* renamed from: a */
    public C0237af mo1377a(AbstractC0244am abstractC0244am) {
        C0237af m1348a = m1348a(abstractC0244am.f6951ek, abstractC0244am.f6952el);
        if (m1348a == null) {
            return null;
        }
        C0237af m1348a2 = m1348a(m1348a.f1527a, m1348a.f1528b);
        if (m1348a2 == null) {
            return m1348a;
        }
        C0237af m1348a3 = m1348a(m1348a2.f1527a, m1348a2.f1528b);
        if (m1348a3 == null) {
            return m1348a2;
        }
        return m1348a3;
    }

    /* renamed from: d */
    public void mo1374d(AbstractC0244am abstractC0244am) {
        if (this.f5947a != null) {
            this.f5947a.m1355d();
        }
        GameEngine m1228A = GameEngine.m1228A();
        float f = m1228A.f6138cv;
        float f2 = m1228A.f6139cw;
        C0237af m1343e = m1343e(abstractC0244am);
        if (m1343e != null) {
            float f3 = m1343e.f1527a;
            float f4 = m1343e.f1528b;
            C0901f.f5939c.m6481b(-16776961);
            m1228A.f6107bO.mo926a(abstractC0244am.f6951ek - f, abstractC0244am.f6952el - f2, f3 - f, f4 - f2, C0901f.f5939c);
            C0237af mo1376b = mo1376b(abstractC0244am);
            if (mo1376b != null) {
                C0901f.f5939c.m6481b(-7829368);
                m1228A.f6107bO.mo926a(f3 - f, f4 - f2, mo1376b.f1527a - f, mo1376b.f1528b - f2, C0901f.f5939c);
            }
        }
        C0237af mo1377a = mo1377a(abstractC0244am);
        if (mo1377a != null) {
            float f5 = mo1377a.f1527a;
            float f6 = mo1377a.f1528b;
            C0901f.f5939c.m6481b(-256);
            m1228A.f6107bO.mo926a(abstractC0244am.f6951ek - f, abstractC0244am.f6952el - f2, f5 - f, f6 - f2, C0901f.f5939c);
        }
    }

    /* renamed from: e */
    public C0237af m1343e(AbstractC0244am abstractC0244am) {
        return m1348a(abstractC0244am.f6951ek, abstractC0244am.f6952el);
    }

    /* renamed from: b */
    public C0237af mo1376b(AbstractC0244am abstractC0244am) {
        C0237af m1348a = m1348a(abstractC0244am.f6951ek, abstractC0244am.f6952el);
        if (m1348a == null) {
            return null;
        }
        return m1348a(m1348a.f1527a, m1348a.f1528b);
    }

    /* renamed from: c */
    public void mo1375c(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: a */
    public C0237af m1348a(float f, float f2) {
        byte m1360a;
        if (this.f5947a.f5938b == null) {
            return null;
        }
        C0173b c0173b = GameEngine.m1228A().f6104bL;
        int i = (int) (f * c0173b.f788r);
        int i2 = (int) (f2 * c0173b.f789s);
        if (!c0173b.m5852c(i, i2) || (m1360a = this.f5947a.m1360a(i, i2)) == 0) {
            return null;
        }
        C0901f.m1361a(m1360a, f5949c);
        int i3 = i - f5949c.f224a;
        int i4 = i2 - f5949c.f225b;
        this.f5948b.f1527a = (i3 * c0173b.f784n) + c0173b.f786p;
        this.f5948b.f1528b = (i4 * c0173b.f785o) + c0173b.f787q;
        return this.f5948b;
    }
}
