package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/m.class */
public class C0084m extends AbstractC0083l {
    /* renamed from: a */
    public void m6238a() {
        GameEngine.PrintLog("Unit Reference tests");
        C0453l c0453l = C0453l.f2901b;
        AbstractC0623y m4127a = C0453l.m4127a(false, c0453l);
        m4127a.m3119b(AbstractC0197n.f1370i);
        C0451j m4127a2 = C0453l.m4127a(false, c0453l);
        m4127a2.m3119b(AbstractC0197n.f1370i);
        m4127a2.f6951ek = 2.0f;
        C0451j m4127a3 = C0453l.m4127a(false, c0453l);
        m4127a3.m3119b(AbstractC0197n.f1370i);
        m4127a3.f6951ek = 3.0f;
        C0451j m4127a4 = C0453l.m4127a(false, c0453l);
        m4127a4.m3119b(AbstractC0197n.f1370i);
        m4127a4.f6951ek = 3.0f;
        m4127a2.m4395C(m4127a3);
        m4127a2.m4395C(m4127a4);
        C0451j m4127a5 = C0453l.m4127a(false, c0453l);
        m4127a5.m3119b(AbstractC0197n.f1370i);
        C0451j m4127a6 = C0453l.m4127a(false, c0453l);
        m4127a6.m3119b(AbstractC0197n.f1370i);
        C0451j m4127a7 = C0453l.m4127a(false, c0453l);
        m4127a7.m3119b(AbstractC0197n.f1370i);
        m4127a.f1579bt = m4127a5;
        m4127a5.f1580bu = m4127a6;
        m4127a3.f1580bu = m4127a6;
        m4127a2.f1579bt = m4127a7;
        GameEngine.PrintLog("=== unit reference tests == (runs:2)");
        Long valueOf = Long.valueOf(C0727bl.m2610a());
        for (int i = 0; i < 2; i++) {
            m6236a(m4127a, m6235a("self"), m4127a);
            m6236a(m4127a, m6235a("self.parent"), null);
            m6234a("self.unknown", true);
            m6236a(m4127a, m6235a("self.parent"), null);
            m6236a(m4127a, m6235a("nullUnit"), null);
            m6236a(m4127a, m6235a("self.customTarget1"), m4127a5);
            m6236a(m4127a, m6235a("self.customTarget1.customTarget2"), m4127a6);
            m6236a(m4127a, m6235a("self.customTarget2"), null);
            m6236a(m4127a, m6235a("self.nullUnit"), null);
            m6236a(m4127a, m6235a("nullUnit.nullUnit"), null);
            m6236a(m4127a3, m6235a("self.parent.customTarget1"), m4127a7);
            m6236a(m4127a2, m6235a("self.transporting(slot=0)"), m4127a3);
            m6236a(m4127a2, m6235a("self.transporting(SLOT=0)"), m4127a3);
            m6234a("self.transporting(MISS=0)", true);
            m6236a(m4127a2, m6235a("self.transporting(slot=3)"), null);
            m6236a(m4127a2, m6235a("self.transporting"), m4127a3);
            m6236a(m4127a2, m6235a("self.transporting(slot=0).customTarget2"), m4127a6);
            m6236a(m4127a2, m6235a("self.self.transporting(slot=0).customTarget2"), m4127a6);
            m6236a(m4127a2, m6235a("self.SELF.TRANsporting(slot=0).customTarget2"), m4127a6);
            m6236a(m4127a2, m6235a("self.SELF.transporting(slot=0).customTarget2"), m4127a6);
            m6237a(m4127a, m6235a("self.nearestUnit(withinRange=500, withTag='test', relation='any')"));
            m6234a(VariableScope.nullOrMissingString, true);
        }
        GameEngine.PrintLog("Took: " + C0727bl.m2607a(valueOf.longValue(), Long.valueOf(C0727bl.m2610a()).longValue()));
    }

    /* renamed from: a */
    public void m6234a(String str, boolean z) {
        try {
            UnitReference.parseSingleUnitReferenceBlock(C0453l.f2901b, str);
            throw new RuntimeException("assertCreateError got no error for: " + str);
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class && e.getClass() != BooleanParseException.class) {
                throw new RuntimeException(e);
            }
            if (z) {
                GameEngine.PrintLog("(debug)assertCreateError: " + str + " expected-error:" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public UnitReference m6235a(String str) {
        try {
            UnitReference parseSingleUnitReferenceBlock = UnitReference.parseSingleUnitReferenceBlock(C0453l.f2901b, str);
            if (parseSingleUnitReferenceBlock == null) {
                throw new RuntimeException("Null when parsing [" + str + "]");
            }
            return parseSingleUnitReferenceBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage() + " parsing [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public void m6236a(AbstractC0623y abstractC0623y, UnitReference unitReference, AbstractC0244am abstractC0244am) {
        AbstractC0244am abstractC0244am2 = unitReference.get(abstractC0623y);
        if (abstractC0244am2 != abstractC0244am) {
            throw new RuntimeException("assertSame type expected:" + AbstractC0244am.m5329A(abstractC0244am) + " got: " + AbstractC0244am.m5329A(abstractC0244am2));
        }
    }

    /* renamed from: a */
    public void m6237a(AbstractC0623y abstractC0623y, UnitReference unitReference) {
        unitReference.get(abstractC0623y);
    }
}
