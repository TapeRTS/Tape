package com.corrodinggames.rts.game.units.custom.logicBooleans;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.DummyNonUnitWithTeam;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0452k;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0463u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1084am;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference.class */
public abstract class UnitReference extends LogicBoolean implements Cloneable {
    public static final SelfUnitReference selfUnitReference = new SelfUnitReference();
    static HashMap referenceTypes = new HashMap();
    static final LogicBooleanLoader.LogicBooleanContext unitContextChangingContext;
    static final LogicBooleanLoader.LogicBooleanContext placeholderUnitContext;

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitContextChangingContext.class */
    public class UnitContextChangingContext extends LogicBooleanLoader.LogicBooleanContextWithDefault {
    }

    public abstract Unit getSingleRaw(AbstractC0623y abstractC0623y);

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
        unitContextChangingContext = new UnitContextChangingContext();
        placeholderUnitContext = new UnitContextChangingContext();
    }

    public final Unit get(Unit unit) {
        if (!(unit instanceof AbstractC0623y)) {
            return null;
        }
        return getSingleRaw((AbstractC0623y) unit);
    }

    public final Unit get(AbstractC0623y abstractC0623y) {
        return getSingleRaw(abstractC0623y);
    }

    public final Unit getRealUnitOnly(AbstractC0623y abstractC0623y) {
        Unit singleRaw = getSingleRaw(abstractC0623y);
        if (singleRaw instanceof DummyNonUnitWithTeam) {
            return null;
        }
        return singleRaw;
    }

    public void forMeta(C0453l c0453l) {
    }

    static void addUnitReferenceType(UnitReference unitReference, String... strArr) {
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            referenceTypes.put(lowerCase, unitReference);
            if (!lowerCase.replace("self.", "subject.").equals(lowerCase)) {
            }
        }
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReferenceFromConf(C0453l c0453l, C1072ab c1072ab, String str, String str2, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        return parseUnitTypeOrReference(c0453l, c1072ab.m681b(str, str2, (String) null), str, str2, unitReferenceOrUnitType);
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReference(C0453l c0453l, String str, String str2, String str3, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        if (str == null) {
            return unitReferenceOrUnitType;
        }
        String trim = str.trim();
        if (VariableScope.nullOrMissingString.equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReferenceOrUnitType;
        }
        if (trim.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
            return new UnitReferenceOrUnitType(parseUnitReference(c0453l, trim, str2, str3, null, true));
        }
        C0463u m4752a = c0453l.m4752a(trim, str3, str2);
        if (m4752a != null) {
            m4752a.f3348f = true;
        }
        return new UnitReferenceOrUnitType(m4752a);
    }

    public static UnitReference parseUnitReferenceFromConf(C0453l c0453l, C1072ab c1072ab, String str, String str2, UnitReference unitReference) {
        return parseUnitReference(c0453l, c1072ab.m681b(str, str2, (String) null), str, str2, unitReference, false);
    }

    public static UnitReference parseUnitReference(C0453l c0453l, String str, String str2, String str3, UnitReference unitReference, boolean z) {
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
            throw new C0412bm("[" + str2 + "]" + str3 + " UnitReference: Unexpected format for: '" + lowerCase + "'");
        }
        try {
            UnitReference parseSingleUnitReferenceBlock = parseSingleUnitReferenceBlock(c0453l, lowerCase);
            if (parseSingleUnitReferenceBlock == null) {
                throw new RuntimeException("Unknown function:'" + lowerCase + "'");
            }
            return parseSingleUnitReferenceBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + " UnitReference error: " + e.getMessage() + ", [parsing: '" + lowerCase + "']", e);
        }
    }

    public static UnitReference parseSingleUnitReferenceElement(C0453l c0453l, String str) {
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
        UnitReference m7516with = unitReference.m7516with(c0453l, trim.substring(1, trim.length() - 1).trim(), lowerCase);
        if (m7516with instanceof NullUnitReference) {
        }
        return m7516with;
    }

    public static UnitReference parseSingleUnitReferenceBlock(C0453l c0453l, String str) {
        int m2236s = CommonUtils.m2236s(str);
        if (m2236s != 0) {
            if (m2236s > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. A '(' was not closed.");
            }
            if (m2236s < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. Too many ')'.");
            }
        }
        String breakOuterLayerBrackets = LogicBooleanLoader.breakOuterLayerBrackets(str.trim());
        String[] m2327a = CommonUtils.m2327a(breakOuterLayerBrackets, ".", false);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str2 : m2327a) {
            if (str2.equalsIgnoreCase("self")) {
                z = true;
            } else {
                UnitReference parseSingleUnitReferenceElement = parseSingleUnitReferenceElement(c0453l, str2);
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

    /* renamed from: with */
    public UnitReference m7517with(String str) {
        return m7516with((C0453l) null, str, (String) null);
    }

    /* renamed from: with */
    public UnitReference m7516with(C0453l c0453l, String str, String str2) {
        try {
            UnitReference unitReference = (UnitReference) clone();
            unitReference.forMeta(c0453l);
            unitReference.setArgumentsRaw(str, c0453l, str2);
            return unitReference;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean read(AbstractC0623y abstractC0623y) {
        return false;
    }

    public Unit readUnit(AbstractC0623y abstractC0623y) {
        return getSingleRaw(abstractC0623y);
    }

    public LogicBoolean.ReturnType getReturnType() {
        return LogicBoolean.ReturnType.unit;
    }

    public String getClassDebugName() {
        return "<unit reference>";
    }

    public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
        return getClassDebugName() + "(" + Unit.m5908A(getSingleRaw(abstractC0623y)) + ")";
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ChainedUnitReference.class */
    public class ChainedUnitReference extends UnitReference {
        UnitReference[] chain;

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        ChainedUnitReference(UnitReference[] unitReferenceArr) {
            this.chain = unitReferenceArr;
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            UnitReference[] unitReferenceArr = this.chain;
            AbstractC0623y abstractC0623y2 = abstractC0623y;
            LogicBoolean.outerUnitParameterContext = abstractC0623y;
            for (UnitReference unitReference : unitReferenceArr) {
                abstractC0623y2 = unitReference.get((Unit) abstractC0623y2);
                if (abstractC0623y2 == null) {
                    return null;
                }
            }
            LogicBoolean.outerUnitParameterContext = null;
            return abstractC0623y2;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            UnitReference[] unitReferenceArr = this.chain;
            AbstractC0623y abstractC0623y2 = abstractC0623y;
            if (abstractC0623y2 instanceof AbstractC0623y) {
                LogicBoolean.outerUnitParameterContext = abstractC0623y2;
            }
            String str = VariableScope.nullOrMissingString + "[";
            int i = 0;
            while (true) {
                if (i >= unitReferenceArr.length) {
                    break;
                }
                str = str + unitReferenceArr[i].getMatchFailReasonForPlayer(abstractC0623y);
                if (i != unitReferenceArr.length - 1) {
                    str = str + ",";
                }
                abstractC0623y2 = unitReferenceArr[i].get((Unit) abstractC0623y2);
                if (abstractC0623y2 != null) {
                    i++;
                } else {
                    str = str + "<null>";
                    break;
                }
            }
            LogicBoolean.outerUnitParameterContext = null;
            return str + "]";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttachmentUnitReference.class */
    public class AttachmentUnitReference extends UnitReference {
        C0453l meta;
        C0448g _withTag;
        short attachmentId = -1;

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader && this.attachmentId != -1) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.' when using 'slot'");
            }
        }

        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new C1084am("AttachmentUnitReference requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m5054c(str);
        }

        @LogicBoolean.Parameter
        public void slot(String str) {
            C0399m m4723i = this.meta.m4723i(str);
            if (m4723i == null) {
                throw new C1084am("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = m4723i.m5293a();
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            if (!(abstractC0623y instanceof C0451j)) {
                return null;
            }
            C0451j c0451j = (C0451j) abstractC0623y;
            if (c0451j.f2866B == null) {
                return null;
            }
            Object[] m559a = c0451j.f2866B.m559a();
            for (int i = c0451j.f2866B.f6888a - 1; i >= 0; i--) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m559a[i];
                if (abstractC0623y2 != null && (this.attachmentId == -1 || i == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!C0448g.m5062a(this._withTag, abstractC0623y2.m5787dc())) {
                        }
                    }
                    return abstractC0623y2;
                }
            }
            return null;
        }

        public String getClassDebugName() {
            return "attachment";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$TransportingUnitReference.class */
    public class TransportingUnitReference extends UnitReference {
        C0453l meta;
        @LogicBoolean.Parameter
        public int slot = -1;

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new C1084am("TransportingUnitReference requires metadata");
            }
            this.meta = c0453l;
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            Unit unit = null;
            C1101m m3079bz = abstractC0623y.m3079bz();
            if (m3079bz != null) {
                if (this.slot == -1) {
                    if (m3079bz.size() > 0) {
                        unit = (Unit) m3079bz.get(0);
                    }
                } else if (this.slot >= 0 && this.slot < m3079bz.size()) {
                    unit = (Unit) m3079bz.get(this.slot);
                }
            }
            return unit;
        }

        public String getClassDebugName() {
            return "transporting";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ParentUnitReference.class */
    public class ParentUnitReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            return abstractC0623y.m5774dp();
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "parent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory1UnitReference.class */
    public class Memory1UnitReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            Unit unit = abstractC0623y.f1579bt;
            if (unit == null || unit.isDead) {
                return null;
            }
            return unit;
        }

        public String getClassDebugName() {
            return "customTarget1";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory2UnitReference.class */
    public class Memory2UnitReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            Unit unit = abstractC0623y.f1580bu;
            if (unit == null || unit.isDead) {
                return null;
            }
            return unit;
        }

        public String getClassDebugName() {
            return "customTarget2";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LastDamagedByUnitReference.class */
    public class LastDamagedByUnitReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            Unit unit = abstractC0623y.f1578bs;
            if (unit == null || unit.isDead) {
                return null;
            }
            return unit;
        }

        public String getClassDebugName() {
            return "lastDamagedBy";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference.class */
    public class NearestUnitReference extends UnitReference {
        public C0448g _withTag;
        public C0448g _withoutTag;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        public static final HandleCallbackNearest handleCallbackNearest = new HandleCallbackNearest();
        public float withinRange = 500.0f;
        public float withinRangeSq = this.withinRange * this.withinRange;
        public EnumC0200q relation = EnumC0200q.f1394f;

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public String getClassDebugName() {
            return "NearestUnit";
        }

        @LogicBoolean.Parameter
        public void withinRange(float f) {
            if (f > 1500.0f) {
                throw new C1084am("NearestUnit distance cannot be over 1500 is: " + f);
            }
            this.withinRange = f;
            this.withinRangeSq = f * f;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m5054c(str);
        }

        @LogicBoolean.Parameter
        public void withoutTag(String str) {
            this._withoutTag = C0448g.m5054c(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (EnumC0200q) C1072ab.m708a(str, EnumC0200q.f1394f, EnumC0200q.class);
            } catch (C0412bm e) {
                throw new C1084am(e.getMessage(), e);
            }
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            handleCallbackNearest.nearest = null;
            handleCallbackNearest.withinRangeSq = this.withinRangeSq;
            handleCallbackNearest.tag = this._withTag;
            handleCallbackNearest.withoutTag = this._withoutTag;
            handleCallbackNearest.incompleteBuildings = this.incompleteBuildings;
            handleCallbackNearest.relation = this.relation;
            GameEngine.getInstance().f6121cc.m3792a(abstractC0623y.f6951ek, abstractC0623y.f6952el, this.withinRange, abstractC0623y, 0.0f, handleCallbackNearest);
            return handleCallbackNearest.nearest;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference$HandleCallbackNearest.class */
        public class HandleCallbackNearest extends AbstractC0544i {
            public C0448g tag;
            public C0448g withoutTag;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public EnumC0200q relation = EnumC0200q.f1394f;
            public Unit nearest;

            public void setup(AbstractC0623y abstractC0623y, float f) {
            }

            public int excludeTeam(AbstractC0623y abstractC0623y) {
                return -3;
            }

            public Team onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            public Team onlyTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            public void callback(AbstractC0623y abstractC0623y, float f, Unit unit) {
                if ((this.relation != EnumC0200q.f1394f && !abstractC0623y.team.m6390a(this.relation, unit.team)) || abstractC0623y == unit) {
                    return;
                }
                C0449h m5787dc = unit.m5787dc();
                if (this.tag == null || (m5787dc != null && C0448g.m5062a(this.tag, m5787dc))) {
                    float m2366a = CommonUtils.m2366a(abstractC0623y.f6951ek, abstractC0623y.f6952el, unit.f6951ek, unit.f6952el);
                    if (m2366a < this.withinRangeSq) {
                        if (unit.f1623ck < 1.0f && !this.incompleteBuildings) {
                            return;
                        }
                        if (this.withoutTag != null && m5787dc != null && C0448g.m5062a(this.withoutTag, m5787dc)) {
                            return;
                        }
                        this.withinRangeSq = m2366a;
                        this.nearest = unit;
                    }
                }
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$FirstUnitReference.class */
    public class FirstUnitReference extends UnitReference {
        public C0448g _withTag;
        public EnumC0200q relation = EnumC0200q.f1394f;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public String getClassDebugName() {
            return "globalSearchForFirstUnit";
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m5054c(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (EnumC0200q) C1072ab.m708a(str, (Enum) null, EnumC0200q.class);
            } catch (C0412bm e) {
                throw new C1084am(e.getMessage(), e);
            }
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            Unit[] m523a = Unit.f1589bD.m523a();
            int size = Unit.f1589bD.size();
            for (int i = 0; i < size; i++) {
                Unit unit = m523a[i];
                if ((this.relation == EnumC0200q.f1394f || abstractC0623y.team.m6390a(this.relation, unit.team)) && abstractC0623y != unit) {
                    C0449h m5787dc = unit.m5787dc();
                    if ((this._withTag == null || (m5787dc != null && C0448g.m5062a(this._withTag, m5787dc))) && (unit.f1623ck >= 1.0f || this.incompleteBuildings)) {
                        return unit;
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$PlaceholderUnitReference.class */
    public abstract class PlaceholderUnitReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public LogicBooleanLoader.LogicBooleanContext createContext() {
            return UnitReference.placeholderUnitContext;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetAbsolute.class */
    public class GetOffsetAbsolute extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: x */
        public LogicBoolean f3299x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)

        /* renamed from: y */
        public LogicBoolean f3300y = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean height = LogicBoolean.StaticValueBoolean.static_0;

        public String getClassDebugName() {
            return "getOffsetAbsolute";
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0623y abstractC0623y2 = abstractC0623y.team.f1313s;
            AbstractC0623y parameterContext = getParameterContext(abstractC0623y);
            abstractC0623y2.direction = abstractC0623y.direction;
            abstractC0623y2.f6951ek = abstractC0623y.f6951ek + this.f3299x.readNumber(parameterContext);
            abstractC0623y2.f6952el = abstractC0623y.f6952el + this.f3300y.readNumber(parameterContext);
            abstractC0623y2.height = abstractC0623y.height + this.height.readNumber(parameterContext);
            return abstractC0623y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelative.class */
    public class GetOffsetRelative extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: x */
        public LogicBoolean f3301x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)

        /* renamed from: y */
        public LogicBoolean f3302y = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean height = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean dirOffset = LogicBoolean.StaticValueBoolean.static_0;

        public String getClassDebugName() {
            return "getOffsetRelative";
        }

        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0623y abstractC0623y2 = abstractC0623y.team.f1313s;
            AbstractC0623y parameterContext = getParameterContext(abstractC0623y);
            float readNumber = abstractC0623y.direction + this.dirOffset.readNumber(parameterContext);
            float m2249i = CommonUtils.m2249i(readNumber);
            float sin = CommonUtils.sin(readNumber);
            float readNumber2 = this.f3301x.readNumber(parameterContext);
            float readNumber3 = this.f3302y.readNumber(parameterContext);
            float f = (m2249i * readNumber3) - (sin * readNumber2);
            abstractC0623y2.direction = readNumber;
            abstractC0623y2.f6951ek = abstractC0623y.f6951ek + f;
            abstractC0623y2.f6952el = abstractC0623y.f6952el + (sin * readNumber3) + (m2249i * readNumber2);
            abstractC0623y2.height = abstractC0623y.height + this.height.readNumber(parameterContext);
            return abstractC0623y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelativeStatic.class */
    public class GetOffsetRelativeStatic extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(positional = 0)

        /* renamed from: x */
        public float f3303x;
        @LogicBoolean.Parameter(positional = 1)

        /* renamed from: y */
        public float f3304y;
        @LogicBoolean.Parameter
        public float height;
        @LogicBoolean.Parameter
        public float dirOffset;

        public String getClassDebugName() {
            return "getOffsetRelativeStatic";
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0623y abstractC0623y2 = abstractC0623y.team.f1313s;
            float f = abstractC0623y.direction + this.dirOffset;
            float m2249i = CommonUtils.m2249i(f);
            float sin = CommonUtils.sin(f);
            float f2 = this.f3303x;
            float f3 = this.f3304y;
            float f4 = (m2249i * f3) - (sin * f2);
            abstractC0623y2.direction = f;
            abstractC0623y2.f6951ek = abstractC0623y.f6951ek + f4;
            abstractC0623y2.f6952el = abstractC0623y.f6952el + (sin * f3) + (m2249i * f2);
            abstractC0623y2.height = abstractC0623y.height + this.height;
            return abstractC0623y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetAsMarker.class */
    public class GetAsMarker extends PlaceholderUnitReference {
        public String getClassDebugName() {
            return "getAsMarker";
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            AbstractC0623y abstractC0623y2 = abstractC0623y.team.f1313s;
            abstractC0623y2.direction = abstractC0623y.direction;
            abstractC0623y2.f6951ek = abstractC0623y.f6951ek;
            abstractC0623y2.f6952el = abstractC0623y.f6952el;
            abstractC0623y2.height = abstractC0623y.height;
            return abstractC0623y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ThisActionTargetReference.class */
    public class ThisActionTargetReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            Unit unit = C0451j.f2878dL;
            if (unit != null) {
                return unit;
            }
            PointF pointF = C0451j.f2877dK;
            if (pointF != null) {
                AbstractC0623y abstractC0623y2 = Team.f1370i.f1313s;
                abstractC0623y2.direction = 0.0f;
                abstractC0623y2.f6951ek = pointF.x;
                abstractC0623y2.f6952el = pointF.y;
                abstractC0623y2.height = 0.0f;
                return abstractC0623y2;
            }
            return null;
        }

        public String getClassDebugName() {
            return "ThisActionTarget";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$EventSourceReference.class */
    public class EventSourceReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            C0452k c0452k = LogicBoolean.activeEvent;
            if (c0452k == null) {
                return null;
            }
            return c0452k.f2898c;
        }

        public String getClassDebugName() {
            return "EventSource";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ActiveWaypointTargetReference.class */
    public class ActiveWaypointTargetReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            C0305au m3135ar = abstractC0623y.m3135ar();
            if (m3135ar == null) {
                return null;
            }
            return m3135ar.m5663l();
        }

        public String getClassDebugName() {
            return "ActiveWaypointTarget";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttackingReference.class */
    public class AttackingReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f3891Q;
        }

        public String getClassDebugName() {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NullUnitReference.class */
    public class NullUnitReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            return null;
        }

        public String getClassDebugName() {
            return "NULL";
        }

        public String readString(AbstractC0623y abstractC0623y) {
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$SelfUnitReference.class */
    public class SelfUnitReference extends UnitReference {
        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            return abstractC0623y;
        }

        public String getClassDebugName() {
            return "self";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LockedUnitReference.class */
    public class LockedUnitReference extends UnitReference {
        Unit target;

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
            return super.m7516with(c0453l, str, str2);
        }

        /* renamed from: with */
        public /* bridge */ /* synthetic */ LogicBoolean mo7380with(String str) {
            return super.m7517with(str);
        }

        public LockedUnitReference(Unit unit) {
            this.target = unit;
        }

        public Unit getSingleRaw(AbstractC0623y abstractC0623y) {
            return this.target;
        }

        public String getClassDebugName() {
            return "unit";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitReferenceOrUnitType.class */
    public class UnitReferenceOrUnitType {
        C0463u unitType;
        UnitReference unitReference;

        UnitReferenceOrUnitType(C0463u c0463u) {
            this.unitType = c0463u;
        }

        UnitReferenceOrUnitType(UnitReference unitReference) {
            this.unitReference = unitReference;
        }

        public Unit getUnitOrSharedUnit(Unit unit) {
            Unit unit2;
            if (this.unitType != null) {
                return Unit.m5847c(this.unitType.mo7518c());
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

        public InterfaceC0303as getTypeOrNull(Unit unit) {
            Unit unit2;
            if (this.unitType != null) {
                return this.unitType.mo7518c();
            }
            if (this.unitReference != null && (unit2 = this.unitReference.get(unit)) != null) {
                return unit2.getUnitType();
            }
            return null;
        }
    }

    public LogicBooleanLoader.LogicBooleanContext createContext() {
        return unitContextChangingContext;
    }

    public LogicBoolean setChild(LogicBoolean logicBoolean) {
        return UnitContextChangingBooleanByLogic.create(this, logicBoolean);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitContextChangingBooleanByLogic.class */
    public class UnitContextChangingBooleanByLogic extends LogicBoolean {
        LogicBoolean targetBoolean;
        LogicBoolean dynamicContext;
        LogicBoolean[] dynamicContextChain;

        public static UnitContextChangingBooleanByLogic create(LogicBoolean logicBoolean, LogicBoolean logicBoolean2) {
            ArrayList arrayList = null;
            if (logicBoolean2 instanceof UnitContextChangingBooleanByLogic) {
                UnitContextChangingBooleanByLogic unitContextChangingBooleanByLogic = (UnitContextChangingBooleanByLogic) logicBoolean2;
                arrayList = new ArrayList();
                arrayList.add(logicBoolean);
                if (unitContextChangingBooleanByLogic.dynamicContextChain != null) {
                    for (LogicBoolean logicBoolean3 : unitContextChangingBooleanByLogic.dynamicContextChain) {
                        arrayList.add(logicBoolean3);
                    }
                } else {
                    arrayList.add(unitContextChangingBooleanByLogic.dynamicContext);
                }
                logicBoolean2 = unitContextChangingBooleanByLogic.targetBoolean;
            }
            UnitContextChangingBooleanByLogic unitContextChangingBooleanByLogic2 = new UnitContextChangingBooleanByLogic();
            if (arrayList != null) {
                unitContextChangingBooleanByLogic2.dynamicContextChain = (LogicBoolean[]) arrayList.toArray(new LogicBoolean[0]);
            } else {
                unitContextChangingBooleanByLogic2.dynamicContext = logicBoolean;
            }
            unitContextChangingBooleanByLogic2.targetBoolean = logicBoolean2;
            if (logicBoolean == null) {
                throw new RuntimeException("dynamicContext==null");
            }
            if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.unit) {
                throw new RuntimeException("dynamicContext type!=unit. Got:" + logicBoolean.getReturnType());
            }
            return unitContextChangingBooleanByLogic2;
        }

        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return super.setChild(logicBoolean);
        }

        public AbstractC0623y getUnitContext(AbstractC0623y abstractC0623y) {
            if (this.dynamicContextChain != null) {
                AbstractC0623y abstractC0623y2 = abstractC0623y;
                for (LogicBoolean logicBoolean : this.dynamicContextChain) {
                    Unit readUnit = logicBoolean.readUnit(abstractC0623y2);
                    if (!(readUnit instanceof AbstractC0623y)) {
                        return null;
                    }
                    abstractC0623y2 = (AbstractC0623y) readUnit;
                }
                return abstractC0623y2;
            }
            Unit readUnit2 = this.dynamicContext.readUnit(abstractC0623y);
            if (!(readUnit2 instanceof AbstractC0623y)) {
                return null;
            }
            return (AbstractC0623y) readUnit2;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                AbstractC0623y unitContext = getUnitContext(abstractC0623y);
                if (unitContext != null) {
                    boolean read = this.targetBoolean.read(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return read;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return false;
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                AbstractC0623y unitContext = getUnitContext(abstractC0623y);
                if (unitContext != null) {
                    float readNumber = this.targetBoolean.readNumber(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return readNumber;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return 0.0f;
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        public String readString(AbstractC0623y abstractC0623y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                AbstractC0623y unitContext = getUnitContext(abstractC0623y);
                if (unitContext != null) {
                    String readString = this.targetBoolean.readString(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return readString;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return "<unit not found>";
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        public Unit readUnit(AbstractC0623y abstractC0623y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                AbstractC0623y unitContext = getUnitContext(abstractC0623y);
                if (unitContext != null) {
                    Unit readUnit = this.targetBoolean.readUnit(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return readUnit;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return null;
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        public void forMeta(C0453l c0453l) {
        }

        /* renamed from: with */
        public UnitContextChangingBooleanByLogic m7518with(C0453l c0453l, String str, String str2) {
            return this;
        }

        public LogicBoolean.ReturnType getReturnType() {
            return this.targetBoolean.getReturnType();
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            Unit readUnit;
            LogicBoolean[] logicBooleanArr;
            if (this.dynamicContextChain != null) {
                String str = VariableScope.nullOrMissingString;
                AbstractC0623y abstractC0623y2 = abstractC0623y;
                LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
                try {
                    for (LogicBoolean logicBoolean : this.dynamicContextChain) {
                        String str2 = str + logicBoolean.getMatchFailReasonForPlayer(abstractC0623y2);
                        Unit readUnit2 = logicBoolean.readUnit(abstractC0623y2);
                        if (readUnit2 instanceof AbstractC0623y) {
                            str = str2 + ".";
                            abstractC0623y2 = (AbstractC0623y) readUnit2;
                        } else {
                            return str2 + "<unit not found>";
                        }
                    }
                    return str + this.targetBoolean.getMatchFailReasonForPlayer(abstractC0623y2);
                } finally {
                }
            }
            LogicBoolean.setOuterUnitParameterContext(abstractC0623y);
            try {
                if (!(this.dynamicContext.readUnit(abstractC0623y) instanceof AbstractC0623y)) {
                    return "<unit not found>";
                }
                return this.dynamicContext.getMatchFailReasonForPlayer(abstractC0623y) + "." + this.targetBoolean.getMatchFailReasonForPlayer((AbstractC0623y) readUnit);
            } finally {
            }
        }
    }
}
