package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.C0377t;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p018b.C0335h;
import com.corrodinggames.rts.game.units.custom.p018b.C0336i;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0818ak;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference.class */
public abstract class UnitReference implements Cloneable {
    boolean locked;
    public static final UnitReference nullReference = new LockedUnitReference(null);
    public static final SelfUnitReference selfUnitReference = new SelfUnitReference();
    static final HashMap parameterMappings = new HashMap();
    static HashMap referenceTypes = new HashMap();

    public abstract AbstractC0210af getSingleRaw(C0367k kVar);

    static {
        addUnitReferenceType(new AttachmentUnitReference(), "self.attachment");
        addUnitReferenceType(new ParentUnitReference(), "self.parent");
        addUnitReferenceType(new TransportingUnitReference(), "self.transporting");
    }

    public final AbstractC0210af get(AbstractC0210af afVar) {
        if (!(afVar instanceof C0367k)) {
            return null;
        }
        return getSingleRaw((C0367k) afVar);
    }

    public final AbstractC0210af get(C0367k kVar) {
        return getSingleRaw(kVar);
    }

    public void forMeta(C0368l lVar) {
    }

    static void addUnitReferenceType(UnitReference unitReference, String... strArr) {
        for (String str : strArr) {
            referenceTypes.put(str, unitReference);
            if (!str.replace("self.", "subject.").equals(str)) {
            }
        }
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReferenceFromConf(C0368l lVar, C0809ab abVar, String str, String str2, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        return parseUnitTypeOrReference(lVar, abVar.m579b(str, str2, (String) null), str, str2, unitReferenceOrUnitType);
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReference(C0368l lVar, String str, String str2, String str3, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        if (str == null) {
            return unitReferenceOrUnitType;
        }
        String trim = str.trim();
        if ("".equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReferenceOrUnitType;
        }
        if (trim.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
            return new UnitReferenceOrUnitType(parseUnitReference(lVar, trim, str2, str3, null, true));
        }
        return new UnitReferenceOrUnitType(lVar.m2779a(trim, str3, str2));
    }

    public static UnitReference parseUnitReferenceFromConf(C0368l lVar, C0809ab abVar, String str, String str2, UnitReference unitReference) {
        return parseUnitReference(lVar, abVar.m579b(str, str2, (String) null), str, str2, unitReference, false);
    }

    public static UnitReference parseUnitReference(C0368l lVar, String str, String str2, String str3, UnitReference unitReference, boolean z) {
        if (str == null) {
            return unitReference;
        }
        String trim = str.trim();
        if ("".equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReference;
        }
        String lowerCase = trim.toLowerCase(Locale.ROOT);
        if (lowerCase.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
            lowerCase = lowerCase.substring("unitref ".length()).trim();
        }
        if (lowerCase.equals("self")) {
            return selfUnitReference;
        }
        if (lowerCase.indexOf("(") == -1) {
            lowerCase.length();
        } else if (lowerCase.indexOf(")") != lowerCase.length() - 1) {
            throw new C0324at("[" + str2 + "]" + str3 + " UnitReference: Unexpected format for: '" + lowerCase + "'");
        }
        try {
            UnitReference parseUnitReferenceBlock = parseUnitReferenceBlock(lVar, lowerCase);
            if (parseUnitReferenceBlock != null) {
                return parseUnitReferenceBlock;
            }
            throw new RuntimeException("Unknown function:'" + lowerCase + "'");
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + " UnitReference error: " + e.getMessage() + ", [parsing: '" + lowerCase + "']", e);
        }
    }

    public static UnitReference parseUnitReferenceBlock(C0368l lVar, String str) {
        int p = C0654f.m1411p(str);
        if (p != 0) {
            if (p > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. A '(' was not closed.");
            } else if (p < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. Too many ')'.");
            }
        }
        String breakOuterLayerBrackets = LogicBooleanLoader.breakOuterLayerBrackets(str.trim());
        String trim = breakOuterLayerBrackets.split("\\(")[0].trim();
        for (Map.Entry entry : referenceTypes.entrySet()) {
            String str2 = (String) entry.getKey();
            UnitReference unitReference = (UnitReference) entry.getValue();
            if (trim.equals(str2.toLowerCase(Locale.ROOT))) {
                String trim2 = breakOuterLayerBrackets.substring(str2.length()).trim();
                if (trim2.equals("")) {
                    trim2 = "()";
                }
                if (trim2.startsWith("(") && trim2.endsWith(")")) {
                    return unitReference.with(lVar, trim2.substring(1, trim2.length() - 1).trim());
                }
                throw new RuntimeException("Failed to parse function arguments in:'" + breakOuterLayerBrackets + "'");
            }
        }
        return null;
    }

    public void setArgumentsRaw(String str) {
        LogicBooleanLoader.ParameterMapping parameterMapping = (LogicBooleanLoader.ParameterMapping) parameterMappings.get(getClass());
        if (parameterMapping == null) {
            parameterMapping = new LogicBooleanLoader.ParameterMapping(getClass());
            parameterMappings.put(parameterMapping.type, parameterMapping);
        }
        LogicBooleanLoader.setArgumentsWithMapping(parameterMapping, this, str);
    }

    public UnitReference with(String str) {
        return with(null, str);
    }

    public UnitReference with(C0368l lVar, String str) {
        try {
            UnitReference unitReference = (UnitReference) clone();
            unitReference.forMeta(lVar);
            if (!this.locked) {
                unitReference.setArgumentsRaw(str);
            } else if (str != null && !str.trim().equals("")) {
                throw new BooleanParseException("No parameters accepted for " + getClass().getSimpleName());
            }
            return unitReference;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttachmentUnitReference.class */
    public class AttachmentUnitReference extends UnitReference {
        C0368l meta;
        short attachmentId;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public void forMeta(C0368l lVar) {
            if (lVar == null) {
                throw new C0818ak("AttachmentUnitReference requires metadata");
            }
            this.meta = lVar;
        }

        @LogicBoolean.Parameter
        public void slot(String str) {
            C0336i g = this.meta.m2757g(str);
            if (g == null) {
                throw new C0818ak("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = g.m3037a();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0210af getSingleRaw(C0367k kVar) {
            return C0335h.m3048a(kVar, (int) this.attachmentId);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$TransportingUnitReference.class */
    public class TransportingUnitReference extends UnitReference {
        C0368l meta;
        @LogicBoolean.Parameter
        public int slot = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public void forMeta(C0368l lVar) {
            if (lVar == null) {
                throw new C0818ak("TransportingUnitReference requires metadata");
            }
            this.meta = lVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0210af getSingleRaw(C0367k kVar) {
            AbstractC0210af afVar = null;
            if (this.slot == -1) {
                if (kVar.f2462x.size() > 0) {
                    afVar = (AbstractC0210af) kVar.f2462x.get(0);
                }
            } else if (this.slot >= 0 && this.slot < kVar.f2462x.size()) {
                afVar = (AbstractC0210af) kVar.f2462x.get(this.slot);
            }
            return afVar;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ParentUnitReference.class */
    public class ParentUnitReference extends UnitReference {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [com.corrodinggames.rts.game.units.af] */
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0210af getSingleRaw(C0367k kVar) {
            AbstractC0515r rVar = kVar.f1502cq;
            if (rVar == null && kVar.f1501cp != null) {
                rVar = kVar.f1501cp;
            }
            return rVar;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$SelfUnitReference.class */
    public class SelfUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0210af getSingleRaw(C0367k kVar) {
            return kVar;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LockedUnitReference.class */
    public class LockedUnitReference extends UnitReference {
        AbstractC0210af target;

        public LockedUnitReference(AbstractC0210af afVar) {
            this.target = afVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0210af getSingleRaw(C0367k kVar) {
            return this.target;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitReferenceOrUnitType.class */
    public class UnitReferenceOrUnitType {
        C0377t unitType;
        UnitReference unitReference;

        UnitReferenceOrUnitType(C0377t tVar) {
            this.unitType = tVar;
        }

        UnitReferenceOrUnitType(UnitReference unitReference) {
            this.unitReference = unitReference;
        }

        public AbstractC0210af getUnitOrSharedUnit(AbstractC0210af afVar) {
            AbstractC0210af afVar2;
            if (this.unitType != null) {
                return AbstractC0210af.m3310c(this.unitType.mo2717c());
            }
            if (this.unitReference == null || (afVar2 = this.unitReference.get(afVar)) == null) {
                return null;
            }
            return afVar2;
        }

        public AbstractC0210af getUnitReferenceOrNull(AbstractC0210af afVar) {
            AbstractC0210af afVar2;
            if (this.unitReference == null || (afVar2 = this.unitReference.get(afVar)) == null) {
                return null;
            }
            return afVar2;
        }

        public AbstractC0268al getTypeOrNull(AbstractC0210af afVar) {
            AbstractC0210af afVar2;
            if (this.unitType != null) {
                return this.unitType.mo2717c();
            }
            if (this.unitReference == null || (afVar2 = this.unitReference.get(afVar)) == null) {
                return null;
            }
            return afVar2.mo1606r();
        }
    }
}
