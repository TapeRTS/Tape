package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/h.class */
public class C0329h extends AbstractC0321a {

    /* renamed from: a */
    VariableScope.CachedWriter f1972a;

    /* renamed from: b */
    boolean f1973b;

    /* renamed from: c */
    LogicBoolean f1974c;

    /* renamed from: d */
    LogicBoolean f1975d;

    /* renamed from: a */
    public static void m5513a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m700a(str, str2 + "swapCustomTarget1And2", (Boolean) false).booleanValue();
        LogicBoolean m686b = c1072ab.m686b(c0453l, str, str2 + "setCustomTarget1", null);
        LogicBoolean m686b2 = c1072ab.m686b(c0453l, str, str2 + "setCustomTarget2", null);
        VariableScope.MemoryWriter memoryWriter = null;
        String m681b = c1072ab.m681b(str, str2 + "setUnitMemory", (String) null);
        if (m681b != null) {
            memoryWriter = VariableScope.createMemoryWriter(m681b, c0453l, str, str2 + "setUnitMemory");
        }
        if (booleanValue || m686b != null || m686b2 != null || memoryWriter != null) {
            C0329h c0329h = new C0329h();
            c0329h.f1972a = memoryWriter;
            c0329h.f1973b = booleanValue;
            c0329h.f1974c = m686b;
            c0329h.f1975d = m686b2;
            c0339d.f2132ab.add(c0329h);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        if (this.f1972a != null) {
            this.f1972a.writeToUnit(c0451j);
        }
        if (this.f1973b) {
            Unit unit2 = c0451j.f1579bt;
            c0451j.f1579bt = c0451j.f1580bu;
            c0451j.f1580bu = unit2;
        }
        if (this.f1974c != null) {
            c0451j.f1579bt = VariableScope.getSafeUnitReferenceForStorage(this.f1974c.readUnit(c0451j));
        }
        if (this.f1975d != null) {
            c0451j.f1580bu = VariableScope.getSafeUnitReferenceForStorage(this.f1975d.readUnit(c0451j));
            return true;
        }
        return true;
    }
}
