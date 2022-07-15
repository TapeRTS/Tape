package com.corrodinggames.rts.game.units.custom.logicBooleans;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.TeamCamp;
import com.corrodinggames.rts.game.units.DummyNonUnitWithTeam;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.game.units.custom.C0395bl;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.C0434k;
import com.corrodinggames.rts.game.units.custom.C0445u;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.ValueListSource;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p017b.C0383i;
import com.corrodinggames.rts.game.units.p026f.AbstractC0526i;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C0922am;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference.class */
public abstract class UnitReference extends LogicBoolean implements Cloneable {
    public static final SelfUnitReference selfUnitReference = new SelfUnitReference();
    static HashMap referenceTypes = new HashMap();
    static final LogicBooleanLoader.LogicBooleanContext unitContextChangingContext = new UnitContextChangingContext();
    static final LogicBooleanLoader.LogicBooleanContext placeholderUnitContext = new UnitContextChangingContext();

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitContextChangingContext.class */
    public class UnitContextChangingContext extends LogicBooleanLoader.LogicBooleanContextWithDefault {
    }

    public abstract Unit getSingleRaw(OrderableUnit orderableUnit);

    static {
        addUnitReferenceType(new AttachmentUnitReference(), "attachment");
        addUnitReferenceType(new ParentUnitReference(), "parent");
        addUnitReferenceType(new TransportingUnitReference(), "transporting");
        addUnitReferenceType(new ActiveWaypointTargetReference(), "activeWaypointTarget");
        addUnitReferenceType(new AttackingReference(), "attacking");
        addUnitReferenceType(new Memory1UnitReference(), "customTarget1");
        addUnitReferenceType(new Memory2UnitReference(), "customTarget2");
        addUnitReferenceType(new LastDamagedByUnitReference(), "lastDamagedBy");
        addUnitReferenceType(new NearestUnitReference(), "nearestUnit");
        addUnitReferenceType(new FirstUnitReference(), "globalSearchForFirstUnit");
        addUnitReferenceType(new NullUnitReference(), "nullUnit");
        addUnitReferenceType(new NullUnitReference(), "null");
        addUnitReferenceType(new GetOffsetAbsolute(), "getOffsetAbsolute");
        addUnitReferenceType(new GetOffsetRelative(), "getOffsetRelative");
        addUnitReferenceType(new GetAsMarker(), "getAsMarker");
        addUnitReferenceType(new ThisActionTargetReference(), "thisActionTarget");
        addUnitReferenceType(new EventSourceReference(), "eventSource");
    }

    public final Unit get(Unit unit) {
        if (!(unit instanceof OrderableUnit)) {
            return null;
        }
        return getSingleRaw((OrderableUnit) unit);
    }

    public final Unit get(OrderableUnit orderableUnit) {
        return getSingleRaw(orderableUnit);
    }

    public final Unit getRealUnitOnly(OrderableUnit orderableUnit) {
        Unit singleRaw = getSingleRaw(orderableUnit);
        if (singleRaw instanceof DummyNonUnitWithTeam) {
            return null;
        }
        return singleRaw;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public void forMeta(CustomUnitMetadata customUnitMetadata) {
    }

    static void addUnitReferenceType(UnitReference unitReference, String... strArr) {
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            referenceTypes.put(lowerCase, unitReference);
            if (!lowerCase.replace("self.", "subject.").equals(lowerCase)) {
            }
        }
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReferenceFromConf(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        return parseUnitTypeOrReference(customUnitMetadata, unitConfig.getStaticStringValue(str, str2, (String) null), str, str2, unitReferenceOrUnitType);
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReference(CustomUnitMetadata customUnitMetadata, String str, String str2, String str3, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        if (str == null) {
            return unitReferenceOrUnitType;
        }
        String trim = str.trim();
        if (VariableScope.nullOrMissingString.equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReferenceOrUnitType;
        }
        if (trim.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
            return new UnitReferenceOrUnitType(parseUnitReference(customUnitMetadata, trim, str2, str3, null, true));
        }
        C0445u m3113a = customUnitMetadata.m3113a(trim, str3, str2);
        if (m3113a != null) {
            m3113a.f3170f = true;
        }
        return new UnitReferenceOrUnitType(m3113a);
    }

    public static UnitReference parseUnitReferenceFromConf(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, UnitReference unitReference) {
        return parseUnitReference(customUnitMetadata, unitConfig.getStaticStringValue(str, str2, (String) null), str, str2, unitReference, false);
    }

    public static UnitReference parseUnitReference(CustomUnitMetadata customUnitMetadata, String str, String str2, String str3, UnitReference unitReference, boolean z) {
        if (str == null) {
            return unitReference;
        }
        String trim = str.trim();
        if (VariableScope.nullOrMissingString.equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReference;
        }
        String lowerCase = trim.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("unitref ")) {
            lowerCase = lowerCase.substring("unitref ".length()).trim();
        }
        if (lowerCase.equals("self")) {
            return selfUnitReference;
        }
        if (lowerCase.indexOf("(") == -1) {
            lowerCase.length();
        } else if (lowerCase.indexOf(")") != lowerCase.length() - 1) {
            throw new C0395bl("[" + str2 + "]" + str3 + " UnitReference: Unexpected format for: '" + lowerCase + "'");
        }
        try {
            UnitReference parseSingleUnitReferenceBlock = parseSingleUnitReferenceBlock(customUnitMetadata, lowerCase);
            if (parseSingleUnitReferenceBlock == null) {
                throw new RuntimeException("Unknown function:'" + lowerCase + "'");
            }
            return parseSingleUnitReferenceBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + " UnitReference error: " + e.getMessage() + ", [parsing: '" + lowerCase + "']", e);
        }
    }

    public static UnitReference parseSingleUnitReferenceElement(CustomUnitMetadata customUnitMetadata, String str) {
        String lowerCase = str.split("\\(")[0].trim().toLowerCase(Locale.ROOT);
        UnitReference unitReference = (UnitReference) referenceTypes.get(lowerCase);
        if (unitReference == null) {
            return null;
        }
        String trim = str.substring(lowerCase.length()).trim();
        if (trim.equals(VariableScope.nullOrMissingString)) {
            trim = "()";
        }
        if (!trim.startsWith("(") || !trim.endsWith(")")) {
            throw new RuntimeException("Failed to parse unit reference arguments for:'" + str + "'");
        }
        UnitReference with = unitReference.with(customUnitMetadata, trim.substring(1, trim.length() - 1).trim(), lowerCase);
        if (with instanceof NullUnitReference) {
        }
        return with;
    }

    public static UnitReference parseSingleUnitReferenceBlock(CustomUnitMetadata customUnitMetadata, String str) {
        int m1616s = CommonUtils.m1616s(str);
        if (m1616s != 0) {
            if (m1616s > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. A '(' was not closed.");
            }
            if (m1616s < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. Too many ')'.");
            }
        }
        String breakOuterLayerBrackets = LogicBooleanLoader.breakOuterLayerBrackets(str.trim());
        String[] m1704a = CommonUtils.m1704a(breakOuterLayerBrackets, ".", false);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str2 : m1704a) {
            if (str2.equalsIgnoreCase("self")) {
                z = true;
            } else {
                UnitReference parseSingleUnitReferenceElement = parseSingleUnitReferenceElement(customUnitMetadata, str2);
                if (parseSingleUnitReferenceElement == null) {
                    throw new RuntimeException("Unknown unit reference:'" + str2 + "'");
                }
                arrayList.add(parseSingleUnitReferenceElement);
            }
        }
        if (arrayList.size() == 0) {
            if (z) {
                return selfUnitReference;
            }
            throw new RuntimeException("Unexpected unit reference:'" + breakOuterLayerBrackets + "'");
        } else if (arrayList.size() == 1) {
            return (UnitReference) arrayList.get(0);
        } else {
            return new ChainedUnitReference((UnitReference[]) arrayList.toArray(new UnitReference[0]));
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public UnitReference with(String str) {
        return with((CustomUnitMetadata) null, str, (String) null);
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public UnitReference with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
        try {
            UnitReference unitReference = (UnitReference) clone();
            unitReference.forMeta(customUnitMetadata);
            unitReference.setArgumentsRaw(str, customUnitMetadata, str2);
            return unitReference;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public boolean read(OrderableUnit orderableUnit) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public Unit readUnit(OrderableUnit orderableUnit) {
        return getSingleRaw(orderableUnit);
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBoolean.ReturnType getReturnType() {
        return LogicBoolean.ReturnType.unit;
    }

    public String getClassDebugName() {
        return "<unit reference>";
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public String getMatchFailReasonForPlayer(OrderableUnit orderableUnit) {
        return getClassDebugName() + "(" + Unit.m3788A(getSingleRaw(orderableUnit)) + ")";
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ChainedUnitReference.class */
    public class ChainedUnitReference extends UnitReference {
        UnitReference[] chain;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        ChainedUnitReference(UnitReference[] unitReferenceArr) {
            this.chain = unitReferenceArr;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            OrderableUnit orderableUnit2 = orderableUnit;
            for (UnitReference unitReference : this.chain) {
                orderableUnit2 = unitReference.get((Unit) orderableUnit2);
                if (orderableUnit2 == null) {
                    return null;
                }
            }
            return orderableUnit2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(OrderableUnit orderableUnit) {
            UnitReference[] unitReferenceArr = this.chain;
            OrderableUnit orderableUnit2 = orderableUnit;
            String str = VariableScope.nullOrMissingString + "[";
            int i = 0;
            while (true) {
                if (i >= unitReferenceArr.length) {
                    break;
                }
                str = str + unitReferenceArr[i].getMatchFailReasonForPlayer(orderableUnit);
                if (i != unitReferenceArr.length - 1) {
                    str = str + ",";
                }
                orderableUnit2 = unitReferenceArr[i].get((Unit) orderableUnit2);
                if (orderableUnit2 != null) {
                    i++;
                } else {
                    str = str + "<null>";
                    break;
                }
            }
            return str + "]";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttachmentUnitReference.class */
    public class AttachmentUnitReference extends UnitReference {
        CustomUnitMetadata meta;
        ValueListSource _withTag;
        short attachmentId = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader && this.attachmentId != -1) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.' when using 'slot'");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(CustomUnitMetadata customUnitMetadata) {
            if (customUnitMetadata == null) {
                throw new C0922am("AttachmentUnitReference requires metadata");
            }
            this.meta = customUnitMetadata;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = ValueListSource.getValueListSource(str);
        }

        @LogicBoolean.Parameter
        public void slot(String str) {
            C0383i m3090g = this.meta.m3090g(str);
            if (m3090g == null) {
                throw new C0922am("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = m3090g.m3463a();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            if (!(orderableUnit instanceof C0433j)) {
                return null;
            }
            C0433j c0433j = (C0433j) orderableUnit;
            if (c0433j.f2719B == null) {
                return null;
            }
            Object[] items = c0433j.f2719B.getItems();
            for (int i = c0433j.f2719B.size - 1; i >= 0; i--) {
                OrderableUnit orderableUnit2 = (OrderableUnit) items[i];
                if (orderableUnit2 != null && (this.attachmentId == -1 || i == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!ValueListSource.m3249a(this._withTag, orderableUnit2.mo3167da())) {
                        }
                    }
                    return orderableUnit2;
                }
            }
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "attachment";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$TransportingUnitReference.class */
    public class TransportingUnitReference extends UnitReference {
        CustomUnitMetadata meta;
        @LogicBoolean.Parameter
        public int slot = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(CustomUnitMetadata customUnitMetadata) {
            if (customUnitMetadata == null) {
                throw new C0922am("TransportingUnitReference requires metadata");
            }
            this.meta = customUnitMetadata;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            Unit unit = null;
            ObjectVector mo2498by = orderableUnit.mo2498by();
            if (mo2498by != null) {
                if (this.slot == -1) {
                    if (mo2498by.size() > 0) {
                        unit = (Unit) mo2498by.get(0);
                    }
                } else if (this.slot >= 0 && this.slot < mo2498by.size()) {
                    unit = (Unit) mo2498by.get(this.slot);
                }
            }
            return unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "transporting";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ParentUnitReference.class */
    public class ParentUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [com.corrodinggames.rts.game.units.ag] */
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            OrderableUnit orderableUnit2 = orderableUnit.f1630cF;
            if (orderableUnit2 == null && orderableUnit.transportedBy != null) {
                orderableUnit2 = orderableUnit.transportedBy;
            }
            return orderableUnit2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(OrderableUnit orderableUnit) {
            return "parent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory1UnitReference.class */
    public class Memory1UnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            Unit unit = orderableUnit.f1599bm;
            if (unit == null || unit.dead) {
                return null;
            }
            return unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "customTarget1";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory2UnitReference.class */
    public class Memory2UnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            Unit unit = orderableUnit.f1600bn;
            if (unit == null || unit.dead) {
                return null;
            }
            return unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "customTarget2";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LastDamagedByUnitReference.class */
    public class LastDamagedByUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            Unit unit = orderableUnit.f1598bl;
            if (unit == null || unit.dead) {
                return null;
            }
            return unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "lastDamagedBy";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference.class */
    public class NearestUnitReference extends UnitReference {
        public ValueListSource _withTag;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        public static final HandleCallbackNearest handleCallbackNearest = new HandleCallbackNearest();
        public float withinRange = 500.0f;
        public float withinRangeSq = this.withinRange * this.withinRange;
        public TeamCamp relation = TeamCamp.any;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "NearestUnit";
        }

        @LogicBoolean.Parameter
        public void withinRange(float f) {
            if (f > 1500.0f) {
                throw new C0922am("NearestUnit distance cannot be over 1500 is: " + f);
            }
            this.withinRange = f;
            this.withinRangeSq = f * f;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = ValueListSource.getValueListSource(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (TeamCamp) UnitConfig.m654a(str, TeamCamp.any, TeamCamp.class);
            } catch (C0395bl e) {
                throw new C0922am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            handleCallbackNearest.nearest = null;
            handleCallbackNearest.withinRangeSq = this.withinRangeSq;
            handleCallbackNearest.tag = this._withTag;
            handleCallbackNearest.incompleteBuildings = this.incompleteBuildings;
            handleCallbackNearest.relation = this.relation;
            GameEngine.getInstance().UnitGeoIndex.m2786a(orderableUnit.x, orderableUnit.y, this.withinRange, orderableUnit, 0.0f, handleCallbackNearest);
            return handleCallbackNearest.nearest;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference$HandleCallbackNearest.class */
        public class HandleCallbackNearest extends AbstractC0526i {
            public ValueListSource tag;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public TeamCamp relation = TeamCamp.any;
            public Unit nearest;

            @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
            public void setup(OrderableUnit orderableUnit, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
            public int excludeTeam(OrderableUnit orderableUnit) {
                return -3;
            }

            @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
            public Team onlyEnemiesOfTeam(OrderableUnit orderableUnit) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0526i
            public Team onlyTeam(OrderableUnit orderableUnit) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0527j
            public void callback(OrderableUnit orderableUnit, float f, Unit unit) {
                if ((this.relation != TeamCamp.any && !orderableUnit.team.m3961a(this.relation, unit.team)) || orderableUnit == unit) {
                    return;
                }
                ValueList mo3167da = unit.mo3167da();
                if (this.tag == null || (mo3167da != null && ValueListSource.m3249a(this.tag, mo3167da))) {
                    float distanceSq = CommonUtils.distanceSq(orderableUnit.x, orderableUnit.y, unit.x, unit.y);
                    if (distanceSq < this.withinRangeSq) {
                        if (unit.built < 1.0f && !this.incompleteBuildings) {
                            return;
                        }
                        this.withinRangeSq = distanceSq;
                        this.nearest = unit;
                    }
                }
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$FirstUnitReference.class */
    public class FirstUnitReference extends UnitReference {
        public ValueListSource _withTag;
        public TeamCamp relation = TeamCamp.any;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "globalSearchForFirstUnit";
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = ValueListSource.getValueListSource(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (TeamCamp) UnitConfig.m654a(str, (Enum) null, TeamCamp.class);
            } catch (C0395bl e) {
                throw new C0922am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            Unit[] m485a = Unit.fastUnitList.m485a();
            int size = Unit.fastUnitList.size();
            for (int i = 0; i < size; i++) {
                Unit unit = m485a[i];
                if ((this.relation == TeamCamp.any || orderableUnit.team.m3961a(this.relation, unit.team)) && orderableUnit != unit) {
                    ValueList mo3167da = unit.mo3167da();
                    if ((this._withTag == null || (mo3167da != null && ValueListSource.m3249a(this._withTag, mo3167da))) && (unit.built >= 1.0f || this.incompleteBuildings)) {
                        return unit;
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$PlaceholderUnitReference.class */
    public abstract class PlaceholderUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBooleanLoader.LogicBooleanContext createContext() {
            return UnitReference.placeholderUnitContext;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetAbsolute.class */
    public class GetOffsetAbsolute extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: x */
        public LogicBoolean f3121x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)

        /* renamed from: y */
        public LogicBoolean f3122y = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean height = LogicBoolean.StaticValueBoolean.static_0;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetAbsolute";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            OrderableUnit orderableUnit2 = orderableUnit.team.f1330q;
            orderableUnit2.direction = orderableUnit.direction;
            orderableUnit2.x = orderableUnit.x + this.f3121x.readNumber(orderableUnit);
            orderableUnit2.y = orderableUnit.y + this.f3122y.readNumber(orderableUnit);
            orderableUnit2.height = orderableUnit.height + this.height.readNumber(orderableUnit);
            return orderableUnit2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelative.class */
    public class GetOffsetRelative extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: x */
        public LogicBoolean f3123x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)

        /* renamed from: y */
        public LogicBoolean f3124y = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean height = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean dirOffset = LogicBoolean.StaticValueBoolean.static_0;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetRelative";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            OrderableUnit orderableUnit2 = orderableUnit.team.f1330q;
            float readNumber = orderableUnit.direction + this.dirOffset.readNumber(orderableUnit);
            float cos = CommonUtils.cos(readNumber);
            float sin = CommonUtils.sin(readNumber);
            float readNumber2 = this.f3123x.readNumber(orderableUnit);
            float readNumber3 = this.f3124y.readNumber(orderableUnit);
            float f = (cos * readNumber3) - (sin * readNumber2);
            orderableUnit2.direction = readNumber;
            orderableUnit2.x = orderableUnit.x + f;
            orderableUnit2.y = orderableUnit.y + (sin * readNumber3) + (cos * readNumber2);
            orderableUnit2.height = orderableUnit.height + this.height.readNumber(orderableUnit);
            return orderableUnit2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelativeStatic.class */
    public class GetOffsetRelativeStatic extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(positional = 0)

        /* renamed from: x */
        public float f3125x;
        @LogicBoolean.Parameter(positional = 1)

        /* renamed from: y */
        public float f3126y;
        @LogicBoolean.Parameter
        public float height;
        @LogicBoolean.Parameter
        public float dirOffset;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetRelativeStatic";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            OrderableUnit orderableUnit2 = orderableUnit.team.f1330q;
            float f = orderableUnit.direction + this.dirOffset;
            float cos = CommonUtils.cos(f);
            float sin = CommonUtils.sin(f);
            float f2 = this.f3125x;
            float f3 = this.f3126y;
            float f4 = (cos * f3) - (sin * f2);
            orderableUnit2.direction = f;
            orderableUnit2.x = orderableUnit.x + f4;
            orderableUnit2.y = orderableUnit.y + (sin * f3) + (cos * f2);
            orderableUnit2.height = orderableUnit.height + this.height;
            return orderableUnit2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetAsMarker.class */
    public class GetAsMarker extends PlaceholderUnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getAsMarker";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            OrderableUnit orderableUnit2 = orderableUnit.team.f1330q;
            orderableUnit2.direction = orderableUnit.direction;
            orderableUnit2.x = orderableUnit.x;
            orderableUnit2.y = orderableUnit.y;
            orderableUnit2.height = orderableUnit.height;
            return orderableUnit2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ThisActionTargetReference.class */
    public class ThisActionTargetReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            Unit unit = C0433j.f2673dI;
            if (unit != null) {
                return unit;
            }
            PointF pointF = C0433j.f2672dH;
            if (pointF != null) {
                OrderableUnit orderableUnit2 = Team.f1346g.f1330q;
                orderableUnit2.direction = 0.0f;
                orderableUnit2.x = pointF.x;
                orderableUnit2.y = pointF.y;
                orderableUnit2.height = 0.0f;
                return orderableUnit2;
            }
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "ThisActionTarget";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$EventSourceReference.class */
    public class EventSourceReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            C0434k c0434k = LogicBoolean.activeEvent;
            if (c0434k == null) {
                return null;
            }
            return c0434k.f2727c;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "EventSource";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ActiveWaypointTargetReference.class */
    public class ActiveWaypointTargetReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            Waypoint activeWaypoint = orderableUnit.getActiveWaypoint();
            if (activeWaypoint == null) {
                return null;
            }
            return activeWaypoint.m3667l();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "ActiveWaypointTarget";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttackingReference.class */
    public class AttackingReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            return orderableUnit.f3674K;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NullUnitReference.class */
    public class NullUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "NULL";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(OrderableUnit orderableUnit) {
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$SelfUnitReference.class */
    public class SelfUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            return orderableUnit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "self";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LockedUnitReference.class */
    public class LockedUnitReference extends UnitReference {
        Unit target;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return super.with(customUnitMetadata, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        public LockedUnitReference(Unit unit) {
            this.target = unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public Unit getSingleRaw(OrderableUnit orderableUnit) {
            return this.target;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "unit";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitReferenceOrUnitType.class */
    public class UnitReferenceOrUnitType {
        C0445u unitType;
        UnitReference unitReference;

        UnitReferenceOrUnitType(C0445u c0445u) {
            this.unitType = c0445u;
        }

        UnitReferenceOrUnitType(UnitReference unitReference) {
            this.unitReference = unitReference;
        }

        public Unit getUnitOrSharedUnit(Unit unit) {
            Unit unit2;
            if (this.unitType != null) {
                return Unit.m3756c(this.unitType.mo3049c());
            }
            if (this.unitReference != null && (unit2 = this.unitReference.get(unit)) != null) {
                return unit2;
            }
            return null;
        }

        public Unit getUnitReferenceOrNull(Unit unit) {
            Unit unit2;
            if (this.unitReference != null && (unit2 = this.unitReference.get(unit)) != null) {
                return unit2;
            }
            return null;
        }

        public UnitType getTypeOrNull(Unit unit) {
            Unit unit2;
            if (this.unitType != null) {
                return this.unitType.mo3049c();
            }
            if (this.unitReference != null && (unit2 = this.unitReference.get(unit)) != null) {
                return unit2.getUnitType();
            }
            return null;
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBooleanLoader.LogicBooleanContext createContext() {
        return unitContextChangingContext;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBoolean setChild(LogicBoolean logicBoolean) {
        UnitContextChangingBooleanByLogic unitContextChangingBooleanByLogic = new UnitContextChangingBooleanByLogic(this);
        unitContextChangingBooleanByLogic.targetBoolean = logicBoolean;
        return unitContextChangingBooleanByLogic;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitContextChangingBooleanByLogic.class */
    public class UnitContextChangingBooleanByLogic extends LogicBoolean {
        LogicBoolean targetBoolean;
        LogicBoolean dynamicContext;

        public UnitContextChangingBooleanByLogic(LogicBoolean logicBoolean) {
            this.dynamicContext = logicBoolean;
            if (logicBoolean == null) {
                throw new RuntimeException("dynamicContext==null");
            }
            if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.unit) {
                throw new RuntimeException("dynamicContext type!=unit. Got:" + logicBoolean.getReturnType());
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return super.setChild(logicBoolean);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(OrderableUnit orderableUnit) {
            Unit readUnit = this.dynamicContext.readUnit(orderableUnit);
            if (!(readUnit instanceof OrderableUnit)) {
                return false;
            }
            return this.targetBoolean.read((OrderableUnit) readUnit);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(OrderableUnit orderableUnit) {
            Unit readUnit = this.dynamicContext.readUnit(orderableUnit);
            if (!(readUnit instanceof OrderableUnit)) {
                return 0.0f;
            }
            return this.targetBoolean.readNumber((OrderableUnit) readUnit);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(OrderableUnit orderableUnit) {
            Unit readUnit = this.dynamicContext.readUnit(orderableUnit);
            if (!(readUnit instanceof OrderableUnit)) {
                return "<unit not found>";
            }
            return this.targetBoolean.readString((OrderableUnit) readUnit);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public Unit readUnit(OrderableUnit orderableUnit) {
            Unit readUnit = this.dynamicContext.readUnit(orderableUnit);
            if (!(readUnit instanceof OrderableUnit)) {
                return null;
            }
            return this.targetBoolean.readUnit((OrderableUnit) readUnit);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(CustomUnitMetadata customUnitMetadata) {
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public UnitContextChangingBooleanByLogic with(CustomUnitMetadata customUnitMetadata, String str, String str2) {
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.targetBoolean.getReturnType();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(OrderableUnit orderableUnit) {
            Unit readUnit = this.dynamicContext.readUnit(orderableUnit);
            if (!(readUnit instanceof OrderableUnit)) {
                return "<unit not found>";
            }
            return this.dynamicContext.getMatchFailReasonForPlayer(orderableUnit) + "." + this.targetBoolean.getMatchFailReasonForPlayer((OrderableUnit) readUnit);
        }
    }
}