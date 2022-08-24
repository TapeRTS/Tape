package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.DummyNonUnitWithTeam;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0452k;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope.class */
public class VariableScope {
    public static final String nullOrMissingString = "";
    VariableName[] variableNames = emptyNames;
    VariableData[] variableData = emptyData;
    public static final VariableScope emptyVariableScope = new EmptyVariableScope();
    static final VariableName[] emptyNames = new VariableName[0];
    static final VariableData[] emptyData = new VariableData[0];
    public static final VariableDataNull variableDataNull = new VariableDataNull();

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDefinition.class */
    public class VariableDefinition {
        public VariableName name;
        public LogicBoolean.ReturnType type;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$EmptyVariableScope.class */
    public class EmptyVariableScope extends VariableScope {
        EmptyVariableScope() {
        }

        public void setDataRaw(VariableName variableName, VariableData variableData) {
            throw new RuntimeException("Not allowed");
        }
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableData[i] != null) {
                return false;
            }
        }
        return true;
    }

    public String debugMemory(boolean z, boolean z2) {
        VariableData variableData;
        String str = nullOrMissingString;
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableData[i] != null) {
                String str2 = str + VariableName.access$000(this.variableNames[i]) + "=" + variableData.valueToStringDebug(null);
                if (z2) {
                    str2 = str2 + " (" + variableData.getReturnType().name() + ")";
                }
                if (z) {
                    str = str2 + "\n";
                } else {
                    str = str2 + "|";
                }
            }
        }
        return str;
    }

    public VariableData getDataObjectRaw(VariableName variableName) {
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableNames[i] == variableName) {
                return this.variableData[i];
            }
        }
        return variableDataNull;
    }

    public void setDataRaw(VariableName variableName, VariableData variableData) {
        if (variableData == null) {
            variableData = variableDataNull;
        }
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableNames[i] == variableName) {
                this.variableData[i] = variableData;
                return;
            }
        }
        VariableName[] variableNameArr = new VariableName[this.variableData.length + 1];
        VariableData[] variableDataArr = new VariableData[this.variableData.length + 1];
        for (int i2 = 0; i2 < this.variableData.length; i2++) {
            variableDataArr[i2] = this.variableData[i2];
            variableNameArr[i2] = this.variableNames[i2];
        }
        variableDataArr[variableDataArr.length - 1] = variableData;
        variableNameArr[variableNameArr.length - 1] = variableName;
        this.variableData = variableDataArr;
        this.variableNames = variableNameArr;
    }

    public void clearAllData() {
        this.variableData = emptyData;
        this.variableNames = emptyNames;
    }

    public void setUnit(VariableDefinition variableDefinition, Unit unit) {
        if (variableDefinition.type != LogicBoolean.ReturnType.unit) {
        }
        setDataRaw(variableDefinition.name, new VariableDataUnit(unit));
    }

    Unit getUnit(VariableName variableName) {
        return getDataObjectRaw(variableName).readUnit(null);
    }

    LogicBoolean getAsLogicBoolean(VariableName variableName) {
        return getDataObjectRaw(variableName);
    }

    public void setFromLogicBoolean(VariableName variableName, AbstractC0623y abstractC0623y, LogicBoolean logicBoolean) {
        VariableDataBoolean variableDataBoolean = null;
        if (logicBoolean != null) {
            LogicBoolean.ReturnType returnType = logicBoolean.getReturnType();
            if (returnType == LogicBoolean.ReturnType.bool) {
                variableDataBoolean = new VariableDataBoolean(logicBoolean.read(abstractC0623y));
            } else if (returnType == LogicBoolean.ReturnType.unit) {
                variableDataBoolean = new VariableDataUnit(getSafeUnitReferenceForStorage(logicBoolean.readUnit(abstractC0623y)));
            } else if (returnType == LogicBoolean.ReturnType.number) {
                variableDataBoolean = new VariableDataNumber(logicBoolean.readNumber(abstractC0623y));
            } else if (returnType == LogicBoolean.ReturnType.string) {
                variableDataBoolean = new VariableDataString(logicBoolean.readString(abstractC0623y));
            }
        }
        setDataRaw(variableName, variableDataBoolean);
    }

    double getNumber(VariableName variableName) {
        return getDataObjectRaw(variableName).readNumber(null);
    }

    String getString(VariableName variableName) {
        return getDataObjectRaw(variableName).readString(null);
    }

    boolean getBoolean(VariableName variableName) {
        return getDataObjectRaw(variableName).read(null);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableMapping.class */
    public class VariableMapping {
        C0453l meta;
        C1101m mapping = new C1101m();

        public VariableDefinition create(String str, LogicBoolean.ReturnType returnType) {
            VariableName variableName = VariableName.get(str);
            if (get(variableName) != null) {
                throw new RuntimeException("A variable already exists with the name: " + str);
            }
            VariableDefinition variableDefinition = new VariableDefinition();
            variableDefinition.name = variableName;
            variableDefinition.type = returnType;
            this.mapping.add(variableDefinition);
            return variableDefinition;
        }

        public VariableDefinition get(String str) {
            VariableName variableName = VariableName.get(str);
            Iterator it = this.mapping.iterator();
            while (it.hasNext()) {
                VariableDefinition variableDefinition = (VariableDefinition) it.next();
                if (variableDefinition.name == variableName) {
                    return variableDefinition;
                }
            }
            return null;
        }

        public VariableDefinition get(VariableName variableName) {
            Iterator it = this.mapping.iterator();
            while (it.hasNext()) {
                VariableDefinition variableDefinition = (VariableDefinition) it.next();
                if (variableDefinition.name == variableName) {
                    return variableDefinition;
                }
            }
            return null;
        }

        public void addDefineKey(C1072ab c1072ab, C0453l c0453l, String str, String str2, String str3) {
            String m681b = c1072ab.m681b(str2, str3, (String) null);
            if (m681b != null && !m681b.equals(VariableScope.nullOrMissingString)) {
                throw new RuntimeException("[" + str2 + "]" + str + ": Unexpected format");
            }
            defineVariablesRaw(str, str2, str3);
        }

        public void addDefineValue(C0453l c0453l, String str, String str2, String str3) {
            defineVariablesRaw(str2, str, str3);
        }

        public void defineVariables(C0453l c0453l, String str) {
            defineVariablesRaw("define", VariableScope.nullOrMissingString, str);
        }

        public void addSingleDefine(C0453l c0453l, String str, String str2, String str3, String str4) {
            String lowerCase = str2.trim().toLowerCase(Locale.ROOT);
            String trim = str.toLowerCase(Locale.ROOT).trim();
            LogicBoolean.ReturnType userType = VariableScope.getUserType(lowerCase);
            if (userType == null) {
                throw new RuntimeException("[" + str3 + "]" + str4 + ": Unknown type: " + lowerCase);
            }
            checkNameReserved(trim, str3, str4);
            VariableDefinition variableDefinition = get(trim);
            if (variableDefinition != null) {
                if (variableDefinition.type == userType) {
                    return;
                }
                throw new RuntimeException("[" + str3 + "]" + str4 + ": A memory variable already exists with the name: " + trim + " and is a different type: " + variableDefinition.type.name());
            }
            create(trim, userType);
        }

        public void defineVariablesRaw(String str, String str2, String str3) {
            for (String str4 : CommonUtils.m2287c(str3, ',')) {
                String trim = str4.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    int indexOf = trim.indexOf(" ");
                    if (indexOf == -1) {
                        throw new RuntimeException("[" + str2 + "]" + str + ": Expected 'type name' in each section, got: " + trim);
                    }
                    addSingleDefine(this.meta, trim.substring(indexOf, trim.length()).toLowerCase(Locale.ROOT).trim(), trim.substring(0, indexOf).toLowerCase(Locale.ROOT).trim(), str2, str);
                }
            }
        }

        public void checkNameReserved(String str, String str2, String str3) {
            boolean z = false;
            if (str.equals(VariableScope.nullOrMissingString)) {
                z = true;
            }
            if (str.equals("game") || str.equals("parent") || str.equals("self") || str.equals("this")) {
                z = true;
            }
            if (str.equals("boolean") || str.equals("bool") || str.equals("unit") || str.equals("void") || str.equals("null") || str.equals("number") || str.equals("float")) {
                z = true;
            }
            if (z) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Variable cannot be named: '" + str + "'");
            }
            if (str.contains(".") || str.contains("=") || str.contains("(") || str.contains(")") || str.contains("'") || str.contains("\"") || str.contains("?") || str.contains("|") || str.contains("\\") || str.contains("/") || str.contains("[") || str.contains("]") || str.contains(":") || str.contains(";")) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Variable name has reserved symbols: '" + str + "'");
            }
            if (str.contains(" ")) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Variable name cannot have a space: '" + str + "'");
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableName.class */
    public class VariableName {
        private static HashMap existingVariableName = new HashMap();

        /* renamed from: id */
        private String f3305id;

        static /* synthetic */ String access$000(VariableName variableName) {
            return variableName.f3305id;
        }

        public static VariableName get(String str) {
            synchronized (existingVariableName) {
                VariableName variableName = (VariableName) existingVariableName.get(str);
                if (variableName != null) {
                    return variableName;
                }
                VariableName variableName2 = new VariableName();
                variableName2.f3305id = str;
                existingVariableName.put(str, variableName2);
                return variableName2;
            }
        }

        public String getId() {
            return this.f3305id;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableData.class */
    public abstract class VariableData extends LogicBoolean {
        public abstract LogicBoolean.ReturnType getReturnType();

        public boolean read(AbstractC0623y abstractC0623y) {
            return false;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Data(" + valueToStringDebug(null) + ")";
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            return 0.0f;
        }

        public String readString(AbstractC0623y abstractC0623y) {
            return VariableScope.nullOrMissingString;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataNull.class */
    public class VariableDataNull extends VariableData {
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.voidReturn;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "null";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataUnit.class */
    public class VariableDataUnit extends VariableData {
        Unit unit;

        public VariableDataUnit(Unit unit) {
            this.unit = unit;
        }

        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.unit;
        }

        public Unit readUnit(AbstractC0623y abstractC0623y) {
            return this.unit;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataBoolean.class */
    public class VariableDataBoolean extends VariableData {
        boolean bool;

        public VariableDataBoolean(boolean z) {
            this.bool = z;
        }

        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.bool;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return this.bool;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataString.class */
    public class VariableDataString extends VariableData {
        String text;

        public VariableDataString(String str) {
            this.text = str;
        }

        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.string;
        }

        public String readString(AbstractC0623y abstractC0623y) {
            return this.text;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataNumber.class */
    public class VariableDataNumber extends VariableData {
        double number;

        public VariableDataNumber(double d) {
            this.number = d;
        }

        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.number;
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            return (float) this.number;
        }
    }

    public static void writeOut(C0859ar c0859ar, VariableScope variableScope) {
        if (variableScope == null) {
            c0859ar.m1554c(-2);
        } else if (variableScope.variableData.length == 0) {
            c0859ar.m1554c(-1);
        } else {
            c0859ar.m1554c(0);
            c0859ar.mo1483a((short) variableScope.variableData.length);
            int length = variableScope.variableData.length;
            for (int i = 0; i < length; i++) {
                VariableData variableData = variableScope.variableData[i];
                c0859ar.m1553c(VariableName.access$000(variableScope.variableNames[i]));
                c0859ar.mo1482a(false);
                if (0 == 0) {
                    writeOutDynamicData(c0859ar, variableData);
                }
            }
        }
    }

    public static VariableScope readIn(C0876k c0876k) {
        byte m1457d = c0876k.m1457d();
        if (m1457d == -2 || m1457d == -1) {
            return null;
        }
        int m1438v = c0876k.m1438v();
        VariableScope variableScope = new VariableScope();
        for (int i = 0; i < m1438v; i++) {
            VariableName variableName = VariableName.get(c0876k.m1448l());
            if (!c0876k.m1455e()) {
                variableScope.setDataRaw(variableName, readInDynamicData(c0876k));
            }
        }
        return variableScope;
    }

    public static void writeOutUnitOrPlaceholder(C0859ar c0859ar, Unit unit) {
        if (unit instanceof DummyNonUnitWithTeam) {
            c0859ar.m1554c(1);
            c0859ar.mo1488a(unit.f6951ek);
            c0859ar.mo1488a(unit.f6952el);
            c0859ar.mo1488a(unit.height);
            c0859ar.mo1488a(unit.direction);
            c0859ar.m1575a(unit.team);
            return;
        }
        c0859ar.m1554c(0);
        c0859ar.m1559b(unit);
    }

    public static void writeOutDynamicData(C0859ar c0859ar, VariableData variableData) {
        if (variableData == null) {
            c0859ar.m1564a((Enum) null);
            return;
        }
        LogicBoolean.ReturnType returnType = variableData.getReturnType();
        c0859ar.m1564a(returnType);
        if (variableData instanceof VariableDataUnit) {
            writeOutUnitOrPlaceholder(c0859ar, ((VariableDataUnit) variableData).unit);
        } else if (variableData instanceof VariableDataBoolean) {
            c0859ar.mo1482a(((VariableDataBoolean) variableData).bool);
        } else if (variableData instanceof VariableDataString) {
            c0859ar.m1557b(((VariableDataString) variableData).text);
        } else if (variableData instanceof VariableDataNumber) {
            c0859ar.m1579a(((VariableDataNumber) variableData).number);
        } else if (returnType != LogicBoolean.ReturnType.undefined) {
            throw new RuntimeException("Unhandled type: " + returnType.name());
        }
    }

    public static Unit readInUnitOrPlaceholder(C0876k c0876k) {
        DummyNonUnitWithTeam m1445o;
        byte m1457d = c0876k.m1457d();
        if (m1457d == 1) {
            float m1453g = c0876k.m1453g();
            float m1453g2 = c0876k.m1453g();
            float m1453g3 = c0876k.m1453g();
            float m1453g4 = c0876k.m1453g();
            m1445o = DummyNonUnitWithTeam.m3305a(c0876k.m1441s());
            m1445o.f6951ek = m1453g;
            m1445o.f6952el = m1453g2;
            m1445o.height = m1453g3;
            m1445o.direction = m1453g4;
        } else if (m1457d == 0) {
            m1445o = c0876k.m1445o();
        } else {
            throw new IOException("Unhandled unit type: " + ((int) m1457d));
        }
        return m1445o;
    }

    public static VariableData readInDynamicData(C0876k c0876k) {
        LogicBoolean.ReturnType returnType = (LogicBoolean.ReturnType) c0876k.m1461b(LogicBoolean.ReturnType.class);
        if (returnType == null) {
            return null;
        }
        if (returnType == LogicBoolean.ReturnType.unit) {
            return new VariableDataUnit(readInUnitOrPlaceholder(c0876k));
        }
        if (returnType == LogicBoolean.ReturnType.bool) {
            return new VariableDataBoolean(c0876k.m1455e());
        }
        if (returnType == LogicBoolean.ReturnType.string) {
            return new VariableDataString(c0876k.m1450j());
        }
        if (returnType == LogicBoolean.ReturnType.number) {
            return new VariableDataNumber(c0876k.m1452h());
        }
        if (returnType == LogicBoolean.ReturnType.undefined) {
            throw new RuntimeException("Undefined type: " + returnType.name());
        }
        throw new RuntimeException("Unhandled type: " + returnType.name());
    }

    public static LogicBoolean.ReturnType getUserType(String str) {
        LogicBoolean.ReturnType returnType = null;
        if (str.equals("boolean")) {
            returnType = LogicBoolean.ReturnType.bool;
        } else if (str.equals("bool")) {
            returnType = LogicBoolean.ReturnType.bool;
        } else if (str.equals("unit")) {
            returnType = LogicBoolean.ReturnType.unit;
        } else if (str.equals("number")) {
            returnType = LogicBoolean.ReturnType.number;
        } else if (str.equals("float")) {
            returnType = LogicBoolean.ReturnType.number;
        } else if (str.equals("text")) {
            returnType = LogicBoolean.ReturnType.string;
        } else if (str.equals("string")) {
            returnType = LogicBoolean.ReturnType.string;
        }
        return returnType;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$AbstractMemoryLogicBoolean.class */
    public abstract class AbstractMemoryLogicBoolean extends LogicBoolean {
        public LogicBooleanLoader.LogicBooleanContext createContext() {
            if (getReturnType() == LogicBoolean.ReturnType.unit) {
                return UnitReference.unitContextChangingContext;
            }
            return super.createContext();
        }

        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return UnitReference.UnitContextChangingBooleanByLogic.create(this, logicBoolean);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$KnownMemoryReadLogicBoolean.class */
    public class KnownMemoryReadLogicBoolean extends AbstractMemoryLogicBoolean {
        VariableName name;
        LogicBoolean.ReturnType type;

        public KnownMemoryReadLogicBoolean(VariableDefinition variableDefinition) {
            this.name = variableDefinition.name;
            this.type = variableDefinition.type;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1581bv == null) {
                return false;
            }
            return abstractC0623y.f1581bv.getBoolean(this.name);
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1581bv == null) {
                return 0.0f;
            }
            return (float) abstractC0623y.f1581bv.getNumber(this.name);
        }

        public String readString(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1581bv == null ? VariableScope.nullOrMissingString : abstractC0623y.f1581bv.getString(this.name);
        }

        public Unit readUnit(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1581bv == null) {
                return null;
            }
            return abstractC0623y.f1581bv.getUnit(this.name);
        }

        public LogicBoolean readAsLogicBoolean(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1581bv == null) {
                return null;
            }
            return abstractC0623y.f1581bv.getAsLogicBoolean(this.name);
        }

        public LogicBoolean.ReturnType getReturnType() {
            return this.type;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            LogicBoolean readAsLogicBoolean = readAsLogicBoolean(abstractC0623y);
            if (readAsLogicBoolean != null) {
                String str = VariableScope.nullOrMissingString;
                if (this.type != readAsLogicBoolean.getReturnType() && readAsLogicBoolean.getReturnType() != LogicBoolean.ReturnType.voidReturn) {
                    str = "(TYPE MISMATCH GOT: " + readAsLogicBoolean.getReturnType().name() + ")";
                }
                return "memory(" + VariableName.access$000(this.name) + "=" + readAsLogicBoolean.getMatchFailReasonForPlayer(abstractC0623y) + str + ")";
            }
            return "memory(" + VariableName.access$000(this.name) + "=null)";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$ReadEventMemoryLogicBoolean.class */
    public class ReadEventMemoryLogicBoolean extends ReadUnitMemoryLogicBoolean {
        public LogicBoolean getUnitMemory(AbstractC0623y abstractC0623y) {
            C0452k c0452k = LogicBoolean.activeEvent;
            VariableScope variableScope = null;
            if (c0452k != null) {
                variableScope = c0452k.f2900e;
            }
            if (variableScope == null) {
                return this.defaultValue;
            }
            LogicBoolean asLogicBoolean = variableScope.getAsLogicBoolean(this._name);
            if (asLogicBoolean == null) {
                return this.defaultValue;
            }
            return asLogicBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$ReadUnitMemoryLogicBoolean.class */
    public class ReadUnitMemoryLogicBoolean extends AbstractMemoryLogicBoolean {
        VariableName _name;
        LogicBoolean.ReturnType _type;
        @LogicBoolean.Parameter(key = "default")
        public LogicBoolean defaultValue;

        @LogicBoolean.Parameter(required = true, positional = 0)
        public void name(String str) {
            this._name = VariableName.get(str.toLowerCase(Locale.ROOT).trim());
        }

        @LogicBoolean.Parameter(required = true)
        public void type(String str) {
            this._type = VariableScope.getUserType(str);
            if (this._type == null) {
                throw new RuntimeException("Unknown type: " + str);
            }
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.defaultValue != null && this.defaultValue.getReturnType() != this._type) {
                throw new BooleanParseException("defaultValue type:" + this.defaultValue.getReturnType() + " does not match requested type: " + this._type);
            }
            if (this.defaultValue == null) {
                this.defaultValue = VariableScope.variableDataNull;
            }
        }

        public LogicBoolean getUnitMemory(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.f1581bv == null) {
                return this.defaultValue;
            }
            LogicBoolean asLogicBoolean = abstractC0623y.f1581bv.getAsLogicBoolean(this._name);
            if (asLogicBoolean == null) {
                return this.defaultValue;
            }
            return asLogicBoolean;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return getUnitMemory(abstractC0623y).read(abstractC0623y);
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            return getUnitMemory(abstractC0623y).readNumber(abstractC0623y);
        }

        public String readString(AbstractC0623y abstractC0623y) {
            LogicBoolean unitMemory = getUnitMemory(abstractC0623y);
            return LogicString.StringCast.castToString(unitMemory.getReturnType(), unitMemory, abstractC0623y);
        }

        public Unit readUnit(AbstractC0623y abstractC0623y) {
            return getUnitMemory(abstractC0623y).readUnit(abstractC0623y);
        }

        public LogicBoolean.ReturnType getReturnType() {
            return this._type;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            if (this._type == null || this._name == null) {
                return "<memory with type/name == null>";
            }
            LogicBoolean asLogicBoolean = abstractC0623y.f1581bv.getAsLogicBoolean(this._name);
            if (asLogicBoolean != null) {
                String str = VariableScope.nullOrMissingString;
                if (this._type != asLogicBoolean.getReturnType() && asLogicBoolean.getReturnType() != LogicBoolean.ReturnType.voidReturn) {
                    str = "(TYPE MISMATCH GOT: " + asLogicBoolean.getReturnType().name() + ")";
                }
                return "memory(" + VariableName.access$000(this._name) + " as " + this._type.name() + "=" + asLogicBoolean.getMatchFailReasonForPlayer(abstractC0623y) + str + ")";
            }
            return "memory(" + VariableName.access$000(this._name) + " as " + this._type.name() + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$KnownMemoryScopeLogicBoolean.class */
    public class KnownMemoryScopeLogicBoolean extends LogicBooleanLoader.LogicBooleanScopeOnly {
        public LogicBoolean parseNextElementInChain(String str, C0453l c0453l, String str2, boolean z, String str3, String str4) {
            VariableDefinition variableDefinition = c0453l.f3202q.get(str2.toLowerCase(Locale.ROOT));
            if (variableDefinition == null) {
                throw new RuntimeException("Unknown variable:'" + str2 + "' in '" + str4 + "'");
            }
            return new KnownMemoryReadLogicBoolean(variableDefinition);
        }
    }

    public static MemoryWriter createGenericKeyValueWriter(String str, C0453l c0453l, String str2, String str3) {
        try {
            MemoryWriter memoryWriter = new MemoryWriter();
            memoryWriter.addWriterElements(str, new MemoryWriterFactory(c0453l, null));
            return memoryWriter;
        } catch (C0412bm e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    public static MemoryWriter createMemoryWriter(String str, C0453l c0453l, String str2, String str3) {
        try {
            MemoryWriter memoryWriter = new MemoryWriter();
            memoryWriter.addWriterElements(str, new MemoryWriterFactory(c0453l));
            return memoryWriter;
        } catch (C0412bm e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriter.class */
    public class MemoryWriter extends CachedWriter {
        public void writeToMemory(VariableScope variableScope, AbstractC0623y abstractC0623y) {
            Iterator it = this.writers.iterator();
            while (it.hasNext()) {
                ((MemoryWriterFactory.MemoryWriterElement) ((CachedWriter.WriterElement) it.next())).writeToMemory(variableScope, abstractC0623y);
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriterFactory.class */
    public class MemoryWriterFactory extends CachedWriter.WriterFactory {
        C0453l meta;
        VariableMapping target;

        public MemoryWriterFactory(C0453l c0453l, VariableMapping variableMapping) {
            this.meta = c0453l;
            this.target = variableMapping;
        }

        public MemoryWriterFactory(C0453l c0453l) {
            this.meta = c0453l;
            if (c0453l != null) {
                this.target = c0453l.f3202q;
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriterFactory$MemoryWriterElement.class */
        public class MemoryWriterElement extends CachedWriter.WriterElement {
            public VariableName name;
            public LogicBoolean value;

            public void writeToUnit(AbstractC0623y abstractC0623y) {
                if (abstractC0623y.f1581bv == null) {
                    abstractC0623y.f1581bv = new VariableScope();
                }
                abstractC0623y.f1581bv.setFromLogicBoolean(this.name, abstractC0623y, this.value);
            }

            public void writeToMemory(VariableScope variableScope, AbstractC0623y abstractC0623y) {
                variableScope.setFromLogicBoolean(this.name, abstractC0623y, this.value);
            }
        }

        public CachedWriter.WriterElement createWriterElement(String str, String str2, String str3) {
            VariableName variableName;
            LogicBoolean.ReturnType returnType;
            if (!str2.equals("=")) {
                throw new C0412bm("Only '=' is supported here, got:" + str2);
            }
            try {
                LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(this.meta, str3, false);
                if (this.target != null) {
                    VariableDefinition variableDefinition = this.target.get(str);
                    if (variableDefinition == null) {
                        throw new C0412bm("Unknown variable: " + str + " (has it been defined.)");
                    }
                    variableName = variableDefinition.name;
                    returnType = variableDefinition.type;
                } else {
                    variableName = VariableName.get(str);
                    returnType = LogicBoolean.ReturnType.undefined;
                }
                MemoryWriterElement memoryWriterElement = new MemoryWriterElement();
                memoryWriterElement.name = variableName;
                memoryWriterElement.value = parseBooleanBlock;
                if (returnType != LogicBoolean.ReturnType.undefined && parseBooleanBlock.getReturnType() != returnType) {
                    if (LogicBoolean.isStaticNull(parseBooleanBlock)) {
                        boolean z = false;
                        if (returnType == LogicBoolean.ReturnType.string) {
                            z = true;
                        }
                        if (returnType == LogicBoolean.ReturnType.point) {
                            z = true;
                        }
                        if (returnType == LogicBoolean.ReturnType.unit) {
                            z = true;
                        }
                        if (!z) {
                            throw new C0412bm("Variable: " + str + " of type " + returnType + " cannot be set to null.");
                        }
                    } else {
                        throw new C0412bm("Variable: " + str + " expects " + returnType + " type getting: " + parseBooleanBlock.getReturnType() + " from: " + str3);
                    }
                }
                return memoryWriterElement;
            } catch (RuntimeException e) {
                throw new RuntimeException("LogicBoolean - Error: " + e.getMessage() + ", [parsing: '" + str3 + "']", e);
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter.class */
    public class CachedWriter {
        C1101m writers = new C1101m();

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$Operator.class */
        public enum Operator {
            set,
            add,
            subtract
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$WriterElement.class */
        public abstract class WriterElement {
            public abstract void writeToUnit(AbstractC0623y abstractC0623y);
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$WriterFactory.class */
        public abstract class WriterFactory {
            public abstract WriterElement createWriterElement(String str, String str2, String str3);
        }

        public void writeToUnit(AbstractC0623y abstractC0623y) {
            Iterator it = this.writers.iterator();
            while (it.hasNext()) {
                ((WriterElement) it.next()).writeToUnit(abstractC0623y);
            }
        }

        public static CachedWriter create(String str, WriterFactory writerFactory) {
            CachedWriter cachedWriter = new CachedWriter();
            cachedWriter.addWriterElements(str, writerFactory);
            return cachedWriter;
        }

        public void addWriterElements(String str, WriterFactory writerFactory) {
            Iterator it = CommonUtils.m2326a(str, ",", false, false).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String[] m2260f = CommonUtils.m2260f(str2, "=");
                if (m2260f == null) {
                    throw new C0412bm("Unexpected format for: " + str2);
                }
                String trim = m2260f[0].toLowerCase(Locale.ROOT).trim();
                String str3 = m2260f[1];
                String str4 = "=";
                if (trim.endsWith("+") || trim.endsWith("-") || trim.endsWith("*") || trim.endsWith("/")) {
                    str4 = trim.substring(trim.length() - 1, trim.length()) + "=";
                    trim = trim.substring(0, trim.length() - 1).trim();
                }
                if (trim.contains(" ")) {
                    throw new C0412bm("Key cannot contain spaces for: " + str2);
                }
                this.writers.add(writerFactory.createWriterElement(trim, str4, str3));
            }
        }
    }

    public static Unit getSafeUnitReferenceForStorage(Unit unit) {
        if (unit == null) {
            return null;
        }
        if (unit instanceof DummyNonUnitWithTeam) {
            DummyNonUnitWithTeam m3305a = DummyNonUnitWithTeam.m3305a(unit.team);
            m3305a.f6951ek = unit.f6951ek;
            m3305a.f6952el = unit.f6952el;
            m3305a.height = unit.height;
            m3305a.direction = unit.direction;
            return m3305a;
        }
        return unit;
    }
}
