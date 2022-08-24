package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ad.class */
public class C0785ad {

    /* renamed from: a */
    static C1101m f5069a = new C1101m();

    /* renamed from: b */
    static final C0812t f5070b = new C0812t();

    /* renamed from: a */
    public static C0786ae m2114a(long j) {
        Object[] m559a = f5069a.m559a();
        for (int i = f5069a.f6888a - 1; i >= 0; i--) {
            C0786ae c0786ae = (C0786ae) m559a[i];
            if (c0786ae.f5071a == j) {
                return c0786ae;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0786ae m2113a(Unit unit) {
        C0786ae m2114a = m2114a(unit.f6945ed);
        if (m2114a == null) {
            m2114a = new C0786ae();
            m2114a.f5071a = unit.f6945ed;
            m2114a.f5072b = unit.f1641cC;
            m2114a.f5073c = unit.f1642cD;
            m2114a.f5074d = GameEngine.getInstance().networkEngine.f5574X;
            f5069a.add(m2114a);
        }
        return m2114a;
    }

    /* renamed from: a */
    public static void m2112a(Unit unit, C0424b c0424b) {
        if (!GameEngine.getInstance().networkEngine.f5564B) {
            return;
        }
        C0786ae m2113a = m2113a(unit);
        m2113a.f5072b += c0424b.f2702f;
        m2113a.f5073c = c0424b.m5196c(m2113a.f5073c);
        if (!c0424b.f2707k.m5100c()) {
            m2113a.f5075e = C0439f.m5101b(m2113a.f5075e, c0424b.f2707k);
        }
    }

    /* renamed from: b */
    public static void m2109b(Unit unit, C0424b c0424b) {
        if (!GameEngine.getInstance().networkEngine.f5564B) {
            return;
        }
        C0786ae m2113a = m2113a(unit);
        m2113a.f5072b -= c0424b.f2702f;
        m2113a.f5073c = c0424b.m5196c(m2113a.f5073c);
        if (!c0424b.f2707k.m5100c()) {
            m2113a.f5075e = C0439f.m5115a(m2113a.f5075e, c0424b.f2707k);
        }
        if (f5069a.f6888a > 0) {
        }
    }

    /* renamed from: c */
    public static boolean m2108c(Unit unit, C0424b c0424b) {
        C0786ae m2114a = m2114a(unit.f6945ed);
        if (m2114a != null) {
            f5070b.team = unit.team;
            f5070b.f1641cC = m2114a.f5072b;
            f5070b.f1642cD = m2114a.f5073c;
            C0439f m1917dd = f5070b.m1917dd();
            f5070b.m1919a(m2114a.f5075e);
            boolean mo5235b = c0424b.mo5235b(f5070b);
            f5070b.m1919a(m1917dd);
            return mo5235b;
        }
        return c0424b.mo5235b(unit);
    }

    /* renamed from: a */
    public static boolean m2111a(LogicBoolean logicBoolean, AbstractC0623y abstractC0623y) {
        C0786ae m2114a = m2114a(abstractC0623y.f6945ed);
        if (m2114a != null) {
            int i = abstractC0623y.f1641cC;
            int i2 = abstractC0623y.f1642cD;
            abstractC0623y.f1641cC = m2114a.f5072b;
            abstractC0623y.f1642cD = m2114a.f5073c;
            boolean read = logicBoolean.read(abstractC0623y);
            abstractC0623y.f1641cC = i;
            abstractC0623y.f1642cD = i2;
            return read;
        }
        return logicBoolean.read(abstractC0623y);
    }

    /* renamed from: a */
    public static void m2115a() {
        if (f5069a.f6888a > 0) {
            GameEngine.PrintLog("LagHiding: clearing: " + f5069a.f6888a);
        }
        f5069a.clear();
    }

    /* renamed from: a */
    public static void m2110a(AbstractC0623y abstractC0623y, Action action) {
        if (f5069a.size() == 0) {
            return;
        }
        int i = GameEngine.getInstance().networkEngine.f5574X;
        for (int size = f5069a.size() - 1; size >= 0; size--) {
            C0786ae c0786ae = (C0786ae) f5069a.get(size);
            if (c0786ae.f5071a == abstractC0623y.f6945ed) {
                f5069a.remove(size);
                return;
            } else if (c0786ae.f5074d < i + 80) {
                f5069a.remove(size);
                return;
            }
        }
    }
}
