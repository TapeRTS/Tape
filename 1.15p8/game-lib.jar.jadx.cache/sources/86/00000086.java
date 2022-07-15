package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.DummyNonUnitWithTeam;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0395bl;
import com.corrodinggames.rts.game.units.custom.C0434k;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
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

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope
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
                String str2 = str + this.variableNames[i].f3127id + "=" + variableData.valueToStringDebug(null);
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

    public void setFromLogicBoolean(VariableName variableName, OrderableUnit orderableUnit, LogicBoolean logicBoolean) {
        VariableDataBoolean variableDataBoolean = null;
        if (logicBoolean != null) {
            LogicBoolean.ReturnType returnType = logicBoolean.getReturnType();
            if (returnType == LogicBoolean.ReturnType.bool) {
                variableDataBoolean = new VariableDataBoolean(logicBoolean.read(orderableUnit));
            } else if (returnType == LogicBoolean.ReturnType.unit) {
                variableDataBoolean = new VariableDataUnit(getSafeUnitReferenceForStorage(logicBoolean.readUnit(orderableUnit)));
            } else if (returnType == LogicBoolean.ReturnType.number) {
                variableDataBoolean = new VariableDataNumber(logicBoolean.readNumber(orderableUnit));
            } else if (returnType == LogicBoolean.ReturnType.string) {
                variableDataBoolean = new VariableDataString(logicBoolean.readString(orderableUnit));
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
        CustomUnitMetadata meta;
        ObjectVector mapping = new ObjectVector();

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

        public void addDefineKey(UnitConfig unitConfig, CustomUnitMetadata customUnitMetadata, String str, String str2, String str3) {
            String staticStringValue = unitConfig.getStaticStringValue(str2, str3, (String) null);
            if (staticStringValue != null && !staticStringValue.equals(VariableScope.nullOrMissingString)) {
                throw new RuntimeException("[" + str2 + "]" + str + ": Unexpected format");
            }
            defineVariablesRaw(str, str2, str3);
        }

        public void addDefineValue(CustomUnitMetadata customUnitMetadata, String str, String str2, String str3) {
            defineVariablesRaw(str2, str, str3);
        }

        public void defineVariables(CustomUnitMetadata customUnitMetadata, String str) {
            defineVariablesRaw("define", VariableScope.nullOrMissingString, str);
        }

        public void addSingleDefine(CustomUnitMetadata customUnitMetadata, String str, String str2, String str3, String str4) {
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
            for (String str4 : CommonUtils.m1665c(str3, ',')) {
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
        private String f3127id;

        public static VariableName get(String str) {
            synchronized (existingVariableName) {
                VariableName variableName = (VariableName) existingVariableName.get(str);
                if (variableName != null) {
                    return variableName;
                }
                VariableName variableName2 = new VariableName();
                variableName2.f3127id = str;
                existingVariableName.put(str, variableName2);
                return variableName2;
            }
        }

        public String getId() {
            return this.f3127id;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableData.class */
    public abstract class VariableData extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public abstract LogicBoolean.ReturnType getReturnType();

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(OrderableUnit orderableUnit) {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(OrderableUnit orderableUnit) {
            return "Data(" + valueToStringDebug(null) + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(OrderableUnit orderableUnit) {
            return 0.0f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(OrderableUnit orderableUnit) {
            return VariableScope.nullOrMissingString;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataNull.class */
    public class VariableDataNull extends VariableData {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.voidReturn;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(OrderableUnit orderableUnit) {
            return "null";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataUnit.class */
    public class VariableDataUnit extends VariableData {
        Unit unit;

        public VariableDataUnit(Unit unit) {
            this.unit = unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public Unit readUnit(OrderableUnit orderableUnit) {
            return this.unit;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataBoolean.class */
    public class VariableDataBoolean extends VariableData {
        boolean bool;

        public VariableDataBoolean(boolean z) {
            this.bool = z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.bool;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(OrderableUnit orderableUnit) {
            return this.bool;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataString.class */
    public class VariableDataString extends VariableData {
        String text;

        public VariableDataString(String str) {
            this.text = str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.string;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(OrderableUnit orderableUnit) {
            return this.text;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataNumber.class */
    public class VariableDataNumber extends VariableData {
        double number;

        public VariableDataNumber(double d) {
            this.number = d;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.number;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(OrderableUnit orderableUnit) {
            return (float) this.number;
        }
    }

    public static void writeOut(OutputNetStream outputNetStream, VariableScope variableScope) {
        if (variableScope == null) {
            outputNetStream.writeByte(-2);
        } else if (variableScope.variableData.length == 0) {
            outputNetStream.writeByte(-1);
        } else {
            outputNetStream.writeByte(0);
            outputNetStream.mo1257a((short) variableScope.variableData.length);
            int length = variableScope.variableData.length;
            for (int i = 0; i < length; i++) {
                VariableData variableData = variableScope.variableData[i];
                outputNetStream.writeString(variableScope.variableNames[i].f3127id);
                outputNetStream.writeBoolean(false);
                if (0 == 0) {
                    writeOutDynamicData(outputNetStream, variableData);
                }
            }
        }
    }

    public static VariableScope readIn(InputNetStream inputNetStream) {
        byte readByte = inputNetStream.readByte();
        if (readByte == -2 || readByte == -1) {
            return null;
        }
        int m1212v = inputNetStream.m1212v();
        VariableScope variableScope = new VariableScope();
        for (int i = 0; i < m1212v; i++) {
            VariableName variableName = VariableName.get(inputNetStream.readString());
            if (!inputNetStream.readBoolean()) {
                variableScope.setDataRaw(variableName, readInDynamicData(inputNetStream));
            }
        }
        return variableScope;
    }

    public static void writeOutUnitOrPlaceholder(OutputNetStream outputNetStream, Unit unit) {
        if (unit instanceof DummyNonUnitWithTeam) {
            outputNetStream.writeByte(1);
            outputNetStream.writeFloat(unit.x);
            outputNetStream.writeFloat(unit.y);
            outputNetStream.writeFloat(unit.height);
            outputNetStream.writeFloat(unit.direction);
            outputNetStream.mo1312a(unit.team);
            return;
        }
        outputNetStream.writeByte(0);
        outputNetStream.mo1300b(unit);
    }

    public static void writeOutDynamicData(OutputNetStream outputNetStream, VariableData variableData) {
        if (variableData == null) {
            outputNetStream.writeEnum((Enum) null);
            return;
        }
        LogicBoolean.ReturnType returnType = variableData.getReturnType();
        outputNetStream.writeEnum(returnType);
        if (variableData instanceof VariableDataUnit) {
            writeOutUnitOrPlaceholder(outputNetStream, ((VariableDataUnit) variableData).unit);
        } else if (variableData instanceof VariableDataBoolean) {
            outputNetStream.writeBoolean(((VariableDataBoolean) variableData).bool);
        } else if (variableData instanceof VariableDataString) {
            outputNetStream.m_writeString(((VariableDataString) variableData).text);
        } else if (variableData instanceof VariableDataNumber) {
            outputNetStream.writeDouble(((VariableDataNumber) variableData).number);
        } else if (returnType != LogicBoolean.ReturnType.undefined) {
            throw new RuntimeException("Unhandled type: " + returnType.name());
        }
    }

    public static Unit readInUnitOrPlaceholder(InputNetStream inputNetStream) {
        DummyNonUnitWithTeam dummyNonUnitWithTeam;
        byte readByte = inputNetStream.readByte();
        if (readByte == 1) {
            float readFloat = inputNetStream.readFloat();
            float readFloat2 = inputNetStream.readFloat();
            float readFloat3 = inputNetStream.readFloat();
            float readFloat4 = inputNetStream.readFloat();
            dummyNonUnitWithTeam = DummyNonUnitWithTeam.m2688a(inputNetStream.m1215s());
            dummyNonUnitWithTeam.x = readFloat;
            dummyNonUnitWithTeam.y = readFloat2;
            dummyNonUnitWithTeam.height = readFloat3;
            dummyNonUnitWithTeam.direction = readFloat4;
        } else if (readByte == 0) {
            dummyNonUnitWithTeam = inputNetStream.m1219o();
        } else {
            throw new IOException("Unhandled unit type: " + ((int) readByte));
        }
        return dummyNonUnitWithTeam;
    }

    public static VariableData readInDynamicData(InputNetStream inputNetStream) {
        LogicBoolean.ReturnType returnType = (LogicBoolean.ReturnType) inputNetStream.readEnum(LogicBoolean.ReturnType.class);
        if (returnType == null) {
            return null;
        }
        if (returnType == LogicBoolean.ReturnType.unit) {
            return new VariableDataUnit(readInUnitOrPlaceholder(inputNetStream));
        }
        if (returnType == LogicBoolean.ReturnType.bool) {
            return new VariableDataBoolean(inputNetStream.readBoolean());
        }
        if (returnType == LogicBoolean.ReturnType.string) {
            return new VariableDataString(inputNetStream.m1224j());
        }
        if (returnType == LogicBoolean.ReturnType.number) {
            return new VariableDataNumber(inputNetStream.readDouble());
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
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBooleanLoader.LogicBooleanContext createContext() {
            if (getReturnType() == LogicBoolean.ReturnType.unit) {
                return UnitReference.unitContextChangingContext;
            }
            return super.createContext();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            UnitReference.UnitContextChangingBooleanByLogic unitContextChangingBooleanByLogic = new UnitReference.UnitContextChangingBooleanByLogic(this);
            unitContextChangingBooleanByLogic.targetBoolean = logicBoolean;
            return unitContextChangingBooleanByLogic;
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

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(OrderableUnit orderableUnit) {
            if (orderableUnit.f1526bo == null) {
                return false;
            }
            return orderableUnit.f1526bo.getBoolean(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(OrderableUnit orderableUnit) {
            if (orderableUnit.f1526bo == null) {
                return 0.0f;
            }
            return (float) orderableUnit.f1526bo.getNumber(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(OrderableUnit orderableUnit) {
            return orderableUnit.f1526bo == null ? VariableScope.nullOrMissingString : orderableUnit.f1526bo.getString(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public Unit readUnit(OrderableUnit orderableUnit) {
            if (orderableUnit.f1526bo == null) {
                return null;
            }
            return orderableUnit.f1526bo.getUnit(this.name);
        }

        public LogicBoolean readAsLogicBoolean(OrderableUnit orderableUnit) {
            if (orderableUnit.f1526bo == null) {
                return null;
            }
            return orderableUnit.f1526bo.getAsLogicBoolean(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.type;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(OrderableUnit orderableUnit) {
            LogicBoolean readAsLogicBoolean = readAsLogicBoolean(orderableUnit);
            if (readAsLogicBoolean == null) {
                return "memory(" + this.name.f3127id + "=null)";
            }
            String str = VariableScope.nullOrMissingString;
            if (this.type != readAsLogicBoolean.getReturnType() && readAsLogicBoolean.getReturnType() != LogicBoolean.ReturnType.voidReturn) {
                str = "(TYPE MISMATCH GOT: " + readAsLogicBoolean.getReturnType().name() + ")";
            }
            return "memory(" + this.name.f3127id + "=" + readAsLogicBoolean.getMatchFailReasonForPlayer(orderableUnit) + str + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$ReadEventMemoryLogicBoolean.class */
    public class ReadEventMemoryLogicBoolean extends ReadUnitMemoryLogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.ReadUnitMemoryLogicBoolean
        public LogicBoolean getUnitMemory(OrderableUnit orderableUnit) {
            C0434k c0434k = LogicBoolean.activeEvent;
            VariableScope variableScope = null;
            if (c0434k != null) {
                variableScope = c0434k.f2729e;
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

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.defaultValue != null && this.defaultValue.getReturnType() != this._type) {
                throw new BooleanParseException("defaultValue type:" + this.defaultValue.getReturnType() + " does not match requested type: " + this._type);
            }
            if (this.defaultValue == null) {
                this.defaultValue = VariableScope.variableDataNull;
            }
        }

        public LogicBoolean getUnitMemory(OrderableUnit orderableUnit) {
            if (orderableUnit.f1526bo == null) {
                return this.defaultValue;
            }
            LogicBoolean asLogicBoolean = orderableUnit.f1526bo.getAsLogicBoolean(this._name);
            if (asLogicBoolean == null) {
                return this.defaultValue;
            }
            return asLogicBoolean;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(OrderableUnit orderableUnit) {
            return getUnitMemory(orderableUnit).read(orderableUnit);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(OrderableUnit orderableUnit) {
            return getUnitMemory(orderableUnit).readNumber(orderableUnit);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(OrderableUnit orderableUnit) {
            LogicBoolean unitMemory = getUnitMemory(orderableUnit);
            return LogicString.StringCast.castToString(unitMemory.getReturnType(), unitMemory, orderableUnit);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public Unit readUnit(OrderableUnit orderableUnit) {
            return getUnitMemory(orderableUnit).readUnit(orderableUnit);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this._type;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(OrderableUnit orderableUnit) {
            if (this._type == null || this._name == null) {
                return "<memory with type/name == null>";
            }
            LogicBoolean asLogicBoolean = orderableUnit.f1526bo.getAsLogicBoolean(this._name);
            if (asLogicBoolean == null) {
                return "memory(" + this._name.f3127id + " as " + this._type.name() + ")";
            }
            String str = VariableScope.nullOrMissingString;
            if (this._type != asLogicBoolean.getReturnType() && asLogicBoolean.getReturnType() != LogicBoolean.ReturnType.voidReturn) {
                str = "(TYPE MISMATCH GOT: " + asLogicBoolean.getReturnType().name() + ")";
            }
            return "memory(" + this._name.f3127id + " as " + this._type.name() + "=" + asLogicBoolean.getMatchFailReasonForPlayer(orderableUnit) + str + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$KnownMemoryScopeLogicBoolean.class */
    public class KnownMemoryScopeLogicBoolean extends LogicBooleanLoader.LogicBooleanScopeOnly {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContext
        public LogicBoolean parseNextElementInChain(String str, CustomUnitMetadata customUnitMetadata, String str2, boolean z, String str3, String str4) {
            VariableDefinition variableDefinition = customUnitMetadata.f3027q.get(str2.toLowerCase(Locale.ROOT));
            if (variableDefinition == null) {
                throw new RuntimeException("Unknown variable:'" + str2 + "' in '" + str4 + "'");
            }
            return new KnownMemoryReadLogicBoolean(variableDefinition);
        }
    }

    public static MemoryWriter createGenericKeyValueWriter(String str, CustomUnitMetadata customUnitMetadata, String str2, String str3) {
        try {
            MemoryWriter memoryWriter = new MemoryWriter();
            memoryWriter.addWriterElements(str, new MemoryWriterFactory(customUnitMetadata, null));
            return memoryWriter;
        } catch (C0395bl e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    public static MemoryWriter createMemoryWriter(String str, CustomUnitMetadata customUnitMetadata, String str2, String str3) {
        try {
            MemoryWriter memoryWriter = new MemoryWriter();
            memoryWriter.addWriterElements(str, new MemoryWriterFactory(customUnitMetadata));
            return memoryWriter;
        } catch (C0395bl e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriter.class */
    public class MemoryWriter extends CachedWriter {
        public void writeToMemory(VariableScope variableScope, OrderableUnit orderableUnit) {
            Iterator it = this.writers.iterator();
            while (it.hasNext()) {
                ((MemoryWriterFactory.MemoryWriterElement) ((CachedWriter.WriterElement) it.next())).writeToMemory(variableScope, orderableUnit);
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriterFactory.class */
    public class MemoryWriterFactory extends CachedWriter.WriterFactory {
        CustomUnitMetadata meta;
        VariableMapping target;

        public MemoryWriterFactory(CustomUnitMetadata customUnitMetadata, VariableMapping variableMapping) {
            this.meta = customUnitMetadata;
            this.target = variableMapping;
        }

        public MemoryWriterFactory(CustomUnitMetadata customUnitMetadata) {
            this.meta = customUnitMetadata;
            if (customUnitMetadata != null) {
                this.target = customUnitMetadata.f3027q;
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriterFactory$MemoryWriterElement.class */
        public class MemoryWriterElement extends CachedWriter.WriterElement {
            public VariableName name;
            public LogicBoolean value;

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterElement
            public void writeToUnit(OrderableUnit orderableUnit) {
                if (orderableUnit.f1526bo == null) {
                    orderableUnit.f1526bo = new VariableScope();
                }
                orderableUnit.f1526bo.setFromLogicBoolean(this.name, orderableUnit, this.value);
            }

            public void writeToMemory(VariableScope variableScope, OrderableUnit orderableUnit) {
                variableScope.setFromLogicBoolean(this.name, orderableUnit, this.value);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterFactory
        public CachedWriter.WriterElement createWriterElement(String str, String str2, String str3) {
            LogicBoolean.ReturnType returnType;
            VariableName variableName;
            if (!str2.equals("=")) {
                throw new C0395bl("Only '=' is supported here, got:" + str2);
            }
            try {
                LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(this.meta, str3, false);
                if (this.target != null) {
                    VariableDefinition variableDefinition = this.target.get(str);
                    if (variableDefinition == null) {
                        throw new C0395bl("Unknown variable: " + str + " (has it been defined.)");
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
                            throw new C0395bl("Variable: " + str + " of type " + returnType + " cannot be set to null.");
                        }
                    } else {
                        throw new C0395bl("Variable: " + str + " expects " + returnType + " type getting: " + parseBooleanBlock.getReturnType() + " from: " + str3);
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
        ObjectVector writers = new ObjectVector();

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$Operator.class */
        public enum Operator {
            set,
            add,
            subtract
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$WriterElement.class */
        public abstract class WriterElement {
            public abstract void writeToUnit(OrderableUnit orderableUnit);
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$WriterFactory.class */
        public abstract class WriterFactory {
            public abstract WriterElement createWriterElement(String str, String str2, String str3);
        }

        public void writeToUnit(OrderableUnit orderableUnit) {
            Iterator it = this.writers.iterator();
            while (it.hasNext()) {
                ((WriterElement) it.next()).writeToUnit(orderableUnit);
            }
        }

        public static CachedWriter create(String str, WriterFactory writerFactory) {
            CachedWriter cachedWriter = new CachedWriter();
            cachedWriter.addWriterElements(str, writerFactory);
            return cachedWriter;
        }

        public void addWriterElements(String str, WriterFactory writerFactory) {
            Iterator it = CommonUtils.m1703a(str, ",", false, false).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String[] m1639f = CommonUtils.m1639f(str2, "=");
                if (m1639f == null) {
                    throw new C0395bl("Unexpected format for: " + str2);
                }
                String trim = m1639f[0].toLowerCase(Locale.ROOT).trim();
                String str3 = m1639f[1];
                String str4 = "=";
                if (trim.endsWith("+") || trim.endsWith("-") || trim.endsWith("*") || trim.endsWith("/")) {
                    str4 = trim.substring(trim.length() - 1, trim.length()) + "=";
                    trim = trim.substring(0, trim.length() - 1).trim();
                }
                if (trim.contains(" ")) {
                    throw new C0395bl("Key cannot contain spaces for: " + str2);
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
            DummyNonUnitWithTeam m2688a = DummyNonUnitWithTeam.m2688a(unit.team);
            m2688a.x = unit.x;
            m2688a.y = unit.y;
            m2688a.height = unit.height;
            m2688a.direction = unit.direction;
            return m2688a;
        }
        return unit;
    }
}