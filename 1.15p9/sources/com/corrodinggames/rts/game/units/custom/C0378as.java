package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.game.units.custom.as */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/as.class */
public class C0378as extends VariableScope.CachedWriter.WriterFactory {

    /* renamed from: a */
    C0453l f2257a;

    public C0378as(C0453l c0453l) {
        this.f2257a = c0453l;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterFactory
    public VariableScope.CachedWriter.WriterElement createWriterElement(String str, String str2, String str3) {
        if (!str2.equals("=") && !str2.equals("+=") && !str2.equals("-=")) {
            throw new C0412bm("Only '=','+=','-='  is supported here, got:" + str2);
        }
        VariableScope.CachedWriter.Operator operator = VariableScope.CachedWriter.Operator.set;
        if (str2.equals("+=")) {
            operator = VariableScope.CachedWriter.Operator.add;
        }
        if (str2.equals("-=")) {
            operator = VariableScope.CachedWriter.Operator.subtract;
        }
        try {
            LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(this.f2257a, str3, false);
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) C0359aq.f2253q.get(str);
            if (abstractC0377ar == null) {
                abstractC0377ar = (AbstractC0377ar) C0359aq.f2253q.get("core." + str);
            }
            if (abstractC0377ar == null) {
                throw new C0412bm("Unknown key: " + str + VariableScope.nullOrMissingString);
            }
            C0379at c0379at = new C0379at();
            c0379at.f2258a = abstractC0377ar;
            c0379at.f2259b = parseBooleanBlock;
            c0379at.f2260c = operator;
            if (parseBooleanBlock.getReturnType() != abstractC0377ar.m4706a()) {
                throw new C0412bm("Field: " + str + " expects " + abstractC0377ar.m4706a() + " type getting: " + parseBooleanBlock.getReturnType() + " from: " + str3);
            }
            return c0379at;
        } catch (RuntimeException e) {
            throw new RuntimeException("LogicBoolean - Error: " + e.getMessage() + ", [parsing: '" + str3 + "']", e);
        }
    }
}
