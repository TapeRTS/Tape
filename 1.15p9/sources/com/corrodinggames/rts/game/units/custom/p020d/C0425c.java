package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/c.class */
public class C0425c extends AbstractC0423a {

    /* renamed from: a */
    public final C1101m f2711a = new C1101m();

    /* renamed from: b */
    boolean f2712b;

    /* renamed from: c */
    public int f2713c;

    /* renamed from: d */
    public int f2714d;

    /* renamed from: e */
    public int f2715e;

    /* renamed from: f */
    public int f2716f;

    /* renamed from: a */
    public static C0425c m4533a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0425c c0425c) {
        String m675b = c1072ab.m675b(str, str2, (String) null);
        if (m675b == null) {
            return c0425c;
        }
        try {
            return m4532a(c0453l, m675b);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static C0425c m4532a(C0453l c0453l, String str) {
        return m4531a(c0453l, str, false);
    }

    /* renamed from: a */
    public static C0425c m4531a(C0453l c0453l, String str, boolean z) {
        String trim;
        String substring;
        C0425c c0425c = new C0425c();
        Iterator it = C0758f.m2325a(str, ",", "|", false).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int m2296b = C0758f.m2296b(str2, "=", ":");
            if (m2296b == -1) {
                if (!z) {
                    throw new C0412bm("Unknown price format:" + str);
                }
                trim = "credits";
                substring = str2;
            } else {
                trim = str2.substring(0, m2296b).trim();
                substring = str2.substring(m2296b + 1);
            }
            if (trim.equals("hasFlag")) {
                c0425c.f2715e = C0424b.m4581a(c0425c.f2715e, substring);
            } else if (trim.equals("hasMissingFlag")) {
                c0425c.f2716f = C0424b.m4581a(c0425c.f2716f, substring);
            } else if (trim.equals("setFlag")) {
                c0425c.f2713c = C0424b.m4581a(c0425c.f2713c, substring);
            } else if (trim.equals("unsetFlag")) {
                c0425c.f2714d = C0424b.m4581a(c0425c.f2714d, substring);
            } else {
                C0428a m4101j = c0453l.m4101j(trim);
                if (m4101j == null) {
                    throw new C0412bm("Could not find resource type:" + trim + " from [" + str + "]");
                }
                LogicBoolean parseNumberBlock = LogicBooleanLoader.parseNumberBlock(c0453l, substring);
                if (parseNumberBlock == null) {
                    throw new C0412bm("Value missing for:" + trim + " from [" + str + "]");
                }
                if (!(parseNumberBlock instanceof LogicBoolean.StaticValueBoolean)) {
                    c0425c.f2712b = true;
                }
                c0425c.f2711a.add(new C0426d(m4101j, parseNumberBlock));
            }
        }
        return c0425c;
    }

    /* renamed from: b */
    public boolean mo4559b(AbstractC0244am abstractC0244am) {
        return mo4558b(abstractC0244am, 1.0d);
    }

    /* renamed from: b */
    public boolean mo4558b(AbstractC0244am abstractC0244am, double d) {
        double d2;
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            return false;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        int i = this.f2711a.f6888a;
        Object[] m553a = this.f2711a.m553a();
        for (int i2 = 0; i2 < i; i2++) {
            C0426d c0426d = (C0426d) m553a[i2];
            if (c0426d.f2719c != null) {
                d2 = c0426d.f2719c.readNumber(abstractC0623y) * d;
            } else {
                d2 = c0426d.f2718b * d;
            }
            if (d2 > 0.0d && c0426d.f2717a.mo4493a(abstractC0623y) < d2) {
                return false;
            }
        }
        if (!m4524g(abstractC0623y)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void m4527d(AbstractC0244am abstractC0244am) {
        double d;
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            GameEngine.m1100n("DynamicResourcePrice doesn't work on: " + abstractC0244am.m5252cA());
            return;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        int i = this.f2711a.f6888a;
        Object[] m553a = this.f2711a.m553a();
        for (int i2 = 0; i2 < i; i2++) {
            C0426d c0426d = (C0426d) m553a[i2];
            if (c0426d.f2719c != null) {
                d = c0426d.f2719c.readNumber(abstractC0623y);
            } else {
                d = c0426d.f2718b;
            }
            c0426d.f2717a.mo4492a(abstractC0623y, d);
        }
        m4525f(abstractC0623y);
        C0424b.m4544d(abstractC0623y);
    }

    /* renamed from: a */
    public void mo4580a(AbstractC0244am abstractC0244am) {
        mo4579a(abstractC0244am, 1.0d);
    }

    /* renamed from: a */
    public void mo4579a(AbstractC0244am abstractC0244am, double d) {
        double d2;
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            GameEngine.m1100n("DynamicResourcePrice doesn't work on: " + abstractC0244am.m5252cA());
            return;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        int i = this.f2711a.f6888a;
        Object[] m553a = this.f2711a.m553a();
        for (int i2 = 0; i2 < i; i2++) {
            C0426d c0426d = (C0426d) m553a[i2];
            if (c0426d.f2719c != null) {
                d2 = c0426d.f2719c.readNumber(abstractC0623y);
            } else {
                d2 = c0426d.f2718b;
            }
            c0426d.f2717a.mo4491b(abstractC0623y, (-d2) * d);
        }
        m4525f(abstractC0623y);
        C0424b.m4544d(abstractC0623y);
    }

    /* renamed from: e */
    public void m4526e(AbstractC0244am abstractC0244am) {
        double d;
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            GameEngine.m1100n("DynamicResourcePrice doesn't work on: " + abstractC0244am.m5252cA());
            return;
        }
        GameEngine.PrintLog("Refunding");
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        int i = this.f2711a.f6888a;
        Object[] m553a = this.f2711a.m553a();
        for (int i2 = 0; i2 < i; i2++) {
            C0426d c0426d = (C0426d) m553a[i2];
            if (c0426d.f2719c != null) {
                d = c0426d.f2719c.readNumber(abstractC0623y);
            } else {
                d = c0426d.f2718b;
            }
            double d2 = d;
            GameEngine.PrintLog("Refunding: " + d2 + " of " + c0426d.f2717a.m4497h());
            c0426d.f2717a.mo4491b(abstractC0623y, d2);
        }
        m4525f(abstractC0623y);
        C0424b.m4544d(abstractC0623y);
    }

    /* renamed from: f */
    public void m4525f(AbstractC0244am abstractC0244am) {
        if (this.f2714d != 0) {
            abstractC0244am.f1642cD &= this.f2714d ^ (-1);
        }
        if (this.f2713c != 0) {
            abstractC0244am.f1642cD |= this.f2713c;
        }
    }

    /* renamed from: g */
    public boolean m4524g(AbstractC0244am abstractC0244am) {
        if (this.f2715e != 0 && !m4536a(abstractC0244am.f1642cD, this.f2715e)) {
            return false;
        }
        if (this.f2716f != 0 && m4530b(abstractC0244am.f1642cD, this.f2716f)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m4536a(int i, int i2) {
        return (i2 & i) == i2;
    }

    /* renamed from: b */
    public static boolean m4530b(int i, int i2) {
        return (i2 & i) != 0;
    }
}
