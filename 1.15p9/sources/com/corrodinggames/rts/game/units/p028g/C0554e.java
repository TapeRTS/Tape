package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.g.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/e.class */
public class C0554e extends AbstractC0547a {

    /* renamed from: b */
    int f3755b;

    /* renamed from: c */
    C0208c f3756c;

    public C0554e() {
        this.f3756c = C0208c.f1427a;
    }

    public C0554e(int i, C0208c c0208c) {
        super(i);
        this.f3756c = C0208c.f1427a;
        this.f3756c = c0208c;
        this.f3755b = GameEngine.getInstance().f6096by;
    }

    /* renamed from: b */
    public EnumC0549b mo3730b() {
        return EnumC0549b.specialActionBlock;
    }

    /* renamed from: a */
    public boolean m3729a(C0208c c0208c) {
        return this.f3756c == C0208c.f1427a || this.f3756c == c0208c;
    }

    /* renamed from: c */
    public float m3722c() {
        int i = this.f3750a - this.f3755b;
        if (i <= 0) {
            return 1.0f;
        }
        return (this.f3750a - GameEngine.getInstance().f6096by) / i;
    }

    /* renamed from: a */
    public static void m3727a(AbstractC0623y abstractC0623y, C0208c c0208c, int i) {
        C0552c.m3735a(abstractC0623y, new C0554e(GameEngine.getInstance().f6096by + i, c0208c));
    }

    /* renamed from: a */
    public static int m3728a(Unit unit, C0208c c0208c) {
        C0554e m3723b;
        if (!(unit instanceof AbstractC0623y) || ((AbstractC0623y) unit).f3989bo == null || (m3723b = m3723b(unit, c0208c)) == null) {
            return 0;
        }
        return m3723b.m3720d();
    }

    /* renamed from: d */
    public int m3720d() {
        return this.f3750a - GameEngine.getInstance().f6096by;
    }

    /* renamed from: b */
    public static C0554e m3723b(Unit unit, C0208c c0208c) {
        C1101m c1101m;
        if (!(unit instanceof AbstractC0623y) || (c1101m = ((AbstractC0623y) unit).f3989bo) == null) {
            return null;
        }
        int i = GameEngine.getInstance().f6096by;
        C0554e c0554e = null;
        Object[] m559a = c1101m.m559a();
        for (int i2 = c1101m.f6888a - 1; i2 >= 0; i2--) {
            AbstractC0547a abstractC0547a = (AbstractC0547a) m559a[i2];
            if (abstractC0547a instanceof C0554e) {
                C0554e c0554e2 = (C0554e) abstractC0547a;
                if (c0554e2.m3729a(c0208c) && c0554e2.f3750a > i) {
                    i = c0554e2.f3750a;
                    c0554e = c0554e2;
                }
            }
        }
        if (c0554e == null) {
            return null;
        }
        return c0554e;
    }

    /* renamed from: a */
    public void mo3732a(AbstractC0623y abstractC0623y, C0859ar c0859ar) {
        C0208c.m6282a(c0859ar, this.f3756c);
        c0859ar.mo1487a(this.f3755b);
        super.mo3732a(abstractC0623y, c0859ar);
    }

    /* renamed from: a */
    public void mo3731a(AbstractC0623y abstractC0623y, C0876k c0876k) {
        this.f3756c = C0208c.m6281a(c0876k);
        if (this.f3756c == null) {
            this.f3756c = C0208c.f1427a;
        }
        this.f3755b = c0876k.m1454f();
        super.mo3731a(abstractC0623y, c0876k);
    }

    /* renamed from: c */
    public static void m3721c(Unit unit, C0208c c0208c) {
        C1101m c1101m;
        if (!(unit instanceof AbstractC0623y) || (c1101m = ((AbstractC0623y) unit).f3989bo) == null) {
            return;
        }
        int i = GameEngine.getInstance().f6096by;
        Object[] m559a = c1101m.m559a();
        for (int i2 = c1101m.f6888a - 1; i2 >= 0; i2--) {
            AbstractC0547a abstractC0547a = (AbstractC0547a) m559a[i2];
            if (abstractC0547a instanceof C0554e) {
                C0554e c0554e = (C0554e) abstractC0547a;
                if (c0208c == C0208c.f1427a || c0554e.m3729a(c0208c)) {
                    c0554e.f3750a = i - 1;
                }
            }
        }
    }
}
