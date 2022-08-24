package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.EnumC0347ae;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/i.class */
public class C0330i extends AbstractC0321a {

    /* renamed from: a */
    VariableScope.MemoryWriter f1976a;

    /* renamed from: b */
    LogicBoolean f1977b;

    /* renamed from: c */
    C0449h f1978c;

    /* renamed from: a */
    public static void m5511a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        LogicBoolean m686b = c1072ab.m686b(c0453l, str, str2 + "sendMessageTo", null);
        VariableScope.MemoryWriter memoryWriter = null;
        String m681b = c1072ab.m681b(str, str2 + "sendMessageWithData", (String) null);
        if (m681b != null) {
            memoryWriter = VariableScope.createGenericKeyValueWriter(m681b, c0453l, str, str2 + "sendMessageWithData");
        }
        C0449h m720a = c1072ab.m720a(c0453l, str, str2 + "sendMessageWithTags", (C0449h) null);
        if (m686b != null) {
            C0330i c0330i = new C0330i();
            c0330i.f1977b = m686b;
            c0330i.f1976a = memoryWriter;
            c0330i.f1978c = m720a;
            c0339d.f2132ab.add(c0330i);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        Unit readUnit;
        if (this.f1977b != null && (readUnit = this.f1977b.readUnit(c0451j)) != null) {
            VariableScope variableScope = null;
            if (this.f1976a != null) {
                variableScope = new VariableScope();
                this.f1976a.writeToMemory(variableScope, c0451j);
            }
            readUnit.m5887a(EnumC0347ae.f2187q, c0451j, this.f1978c, variableScope);
            return true;
        }
        return true;
    }
}
