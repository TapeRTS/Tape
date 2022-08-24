package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0452k;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.CompareJoinerBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean.class */
public abstract class LogicBoolean implements Cloneable {
    public static final boolean not = false;
    static C0452k activeEvent;
    static AbstractC0623y outerUnitParameterContext;
    public static final StaticBoolean trueBoolean = new StaticBooleanTrue();
    public static final StaticBoolean falseBoolean = new StaticBooleanFalse();
    static CallContext_self callContext_self = new CallContext_self();
    static CallContext_selfAndTarget callContext_selfAndTarget = new CallContext_selfAndTarget();
    static final HashMap parameterMappings = new HashMap();
    static HashMap booleans = new HashMap();

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$CallContext.class */
    public class CallContext {
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$CallContext_self.class */
    public class CallContext_self extends CallContext {
        public C0451j self;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$CallContext_selfAndTarget.class */
    public class CallContext_selfAndTarget extends CallContext_self {
        public Unit target;
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$Parameter.class */
    public @interface Parameter {
        ReturnType type() default ReturnType.undefined;

        boolean required() default false;

        int positional() default -1;

        String key() default "";
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$ReturnType.class */
    public enum ReturnType {
        undefined,
        voidReturn,
        bool,
        number,
        unit,
        string,
        point
    }

    public abstract boolean read(AbstractC0623y abstractC0623y);

    public abstract String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y);

    static {
        LogicBooleanGameFunctions.loadTypes();
        addBooleanType(new VariableScope.KnownMemoryScopeLogicBoolean(), "memory");
        addBooleanType(new VariableScope.ReadUnitMemoryLogicBoolean(), "self.readUnitMemory");
        addBooleanType(new VariableScope.ReadEventMemoryLogicBoolean(), "eventData");
        addBooleanType(new LogicString.Playername(), "self.playername");
        addBooleanType(new LogicString.TeamName(), "self.teamname");
        addBooleanType(new LogicString.Debug(), "debug");
        addBooleanType(new LogicString.DebugPassthrough(), "debugPassthrough");
        addBooleanType(new LogicString.Select(), "select");
        addBooleanType(new LogicString.StringCast(), "str");
        addBooleanType(new LogicString.Substring(), "substring");
        addBooleanType(new LogicString.LowerString(), "lowercase");
        addBooleanType(new LogicString.UpperString(), "uppercase");
        addBooleanType(new LogicNumberFunction.FunctionInt(), "int");
        addBooleanType(new LogicNumberFunction.FunctionRnd(), "rnd");
        addBooleanType(new LogicNumberFunction.FunctionMax(), "max");
        addBooleanType(new LogicNumberFunction.FunctionMin(), "min");
        addBooleanType(new LogicNumberFunction.FunctionLength(), "length");
        addBooleanType(new LogicNumberFunction.FunctionSquareRoot(), "squareRoot");
        addBooleanType(new LogicNumberFunction.FunctionDistanceSquared(), "distanceSquared");
        addBooleanType(new LogicNumberFunction.FunctionCos(), "cos");
        addBooleanType(new LogicNumberFunction.FunctionSin(), "sin");
        addBooleanType(new LogicNumberFunction.FunctionDistance(), "distance");
        addBooleanType(new LogicNumberFunction.FunctionDirection(), "direction");
        addBooleanType(new LogicNumberFunction.FunctionDistanceBetweenSquared(), "distanceBetweenSquared");
        addBooleanType(new LogicNumberFunction.FunctionDistanceBetween(), "distanceBetween");
        addBooleanType(new LogicNumberFunction.FunctionDirectionBetween(), "directionBetween");
        addBooleanType(new LogicNumberFunction.CreateMarker(), "createMarker");
        addBooleanType(trueBoolean, "true");
        addBooleanType(falseBoolean, "false");
    }

    public static final AbstractC0623y getParameterContext(AbstractC0623y abstractC0623y) {
        AbstractC0623y abstractC0623y2 = outerUnitParameterContext;
        if (abstractC0623y2 != null) {
            return abstractC0623y2;
        }
        return abstractC0623y;
    }

    public static final void setOuterUnitParameterContext(AbstractC0623y abstractC0623y) {
        outerUnitParameterContext = abstractC0623y;
    }

    public static final void clearOuterUnitParameterContext() {
        outerUnitParameterContext = null;
    }

    public static void enableContextEventSource() {
    }

    public static void setContextEventSource(C0452k c0452k) {
        activeEvent = c0452k;
    }

    public static void clearContext() {
        activeEvent = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void addBooleanType(LogicBoolean logicBoolean, String... strArr) {
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (booleans.get(lowerCase) != null) {
                throw new RuntimeException("logicBoolean: " + lowerCase + " already exists");
            }
            booleans.put(lowerCase, logicBoolean);
        }
    }

    public void setArgumentsRaw(String str, C0453l c0453l, String str2) {
        LogicBooleanLoader.setArgumentsWithMapping(getParameters(), this, str, c0453l, str2);
    }

    public LogicBooleanLoader.ParameterMapping getParameters() {
        LogicBooleanLoader.ParameterMapping parameterMapping = (LogicBooleanLoader.ParameterMapping) parameterMappings.get(getClass());
        if (parameterMapping == null) {
            parameterMapping = new LogicBooleanLoader.ParameterMapping(getClass());
            parameterMappings.put(parameterMapping.type, parameterMapping);
        }
        return parameterMapping;
    }

    public boolean isLocked() {
        return false;
    }

    public LogicBoolean createLocked() {
        throw new RuntimeException("Not implemented");
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$LogicBooleanCommon.class */
    public abstract class LogicBooleanCommon extends LogicBoolean {
        public abstract String getName();

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return getName() + "=" + (read(abstractC0623y) ? "true" : "false") + VariableScope.nullOrMissingString;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$LogicBooleanCommonLocking.class */
    public abstract class LogicBooleanCommonLocking extends LogicBoolean {
        boolean locked = false;

        public LogicBoolean createLocked() {
            try {
                LogicBooleanCommonLocking logicBooleanCommonLocking = (LogicBooleanCommonLocking) clone();
                logicBooleanCommonLocking.locked = true;
                return logicBooleanCommonLocking;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean isLocked() {
            return this.locked;
        }
    }

    public void forMeta(C0453l c0453l) {
    }

    /* renamed from: with */
    public LogicBoolean mo7380with(String str) {
        return mo7381with(null, str, null);
    }

    /* renamed from: with */
    public LogicBoolean mo7381with(C0453l c0453l, String str, String str2) {
        try {
            LogicBoolean logicBoolean = (LogicBoolean) clone();
            logicBoolean.forMeta(c0453l);
            if (isLocked()) {
                if (str != null && !str.trim().equals(VariableScope.nullOrMissingString)) {
                    throw new BooleanParseException("No parameters accepted for " + getClass().getSimpleName());
                }
            } else {
                logicBoolean.setArgumentsRaw(str, c0453l, str2);
            }
            return logicBoolean;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static LogicBoolean convertAlwaysTrueToNull(LogicBoolean logicBoolean) {
        if (logicBoolean == trueBoolean) {
            return null;
        }
        return logicBoolean;
    }

    public static boolean isStaticFalse(LogicBoolean logicBoolean) {
        return logicBoolean == falseBoolean;
    }

    public static boolean isStaticTrue(LogicBoolean logicBoolean) {
        return logicBoolean == trueBoolean;
    }

    public static boolean isStaticNull(LogicBoolean logicBoolean) {
        return logicBoolean instanceof UnitReference.NullUnitReference;
    }

    public static boolean isStaticNumber(LogicBoolean logicBoolean) {
        return logicBoolean instanceof StaticValueBoolean;
    }

    public static Float getStaticNumber(LogicBoolean logicBoolean) {
        if (logicBoolean instanceof StaticValueBoolean) {
            return Float.valueOf(((StaticValueBoolean) logicBoolean).staticNumber);
        }
        return null;
    }

    public static float getKnownStaticNumber(LogicBoolean logicBoolean) {
        return ((StaticValueBoolean) logicBoolean).staticNumber;
    }

    public static LogicBoolean create(C0453l c0453l, String str) {
        return create(c0453l, str, null);
    }

    public static LogicBoolean create(C0453l c0453l, String str, LogicBoolean logicBoolean) {
        if (str == null) {
            return logicBoolean;
        }
        try {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (lowerCase.equals("true")) {
                return trueBoolean;
            }
            if (lowerCase.equals("false")) {
                return falseBoolean;
            }
            if (lowerCase.startsWith("if ")) {
                return LogicBooleanLoader.parseBooleanBlock(c0453l, str.substring("if ".length()), true);
            }
            throw new BooleanParseException("Cannot parse:'" + str + "' expected true, false or statement starting with 'if'");
        } catch (RuntimeException e) {
            throw new RuntimeException("LogicBoolean - Error: " + e.getMessage() + ", [parsing: '" + str + "']", e);
        }
    }

    public ReturnType getReturnType() {
        return ReturnType.bool;
    }

    public String valueToStringDebug(AbstractC0623y abstractC0623y) {
        ReturnType returnType = getReturnType();
        if (returnType == ReturnType.number) {
            return CommonUtils.m2363a(readNumber(abstractC0623y), 2);
        }
        if (returnType == ReturnType.unit) {
            return Unit.m5908A(readUnit(abstractC0623y));
        }
        if (returnType == ReturnType.string) {
            return readString(abstractC0623y);
        }
        return read(abstractC0623y) ? "true" : "false";
    }

    public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
    }

    public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
        validate(str, str2, str3, logicBooleanContext, z);
        return this;
    }

    public float readNumber(AbstractC0623y abstractC0623y) {
        return -9999.0f;
    }

    public String readString(AbstractC0623y abstractC0623y) {
        return null;
    }

    public Unit readUnit(AbstractC0623y abstractC0623y) {
        return null;
    }

    public String getDebugDetails(C0451j c0451j) {
        return getMatchFailReasonForPlayer(c0451j) + "==" + (read(c0451j) ? "true" : "false");
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$StaticBoolean.class */
    public abstract class StaticBoolean extends LogicBoolean {
        /* renamed from: with */
        public LogicBoolean mo5336with(String str) {
            return this;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$StaticBooleanTrue.class */
    public final class StaticBooleanTrue extends StaticBoolean {
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "true";
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$StaticBooleanFalse.class */
    public final class StaticBooleanFalse extends StaticBoolean {
        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "false";
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return false;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$JoinerBoolean.class */
    public abstract class JoinerBoolean extends LogicBoolean {
        LogicBoolean[] children;

        public abstract String type();

        public static JoinerBoolean getNewJoiner(String str) {
            JoinerBoolean mathDivideJoinerBoolean;
            if (str.equals("or")) {
                mathDivideJoinerBoolean = new OrBoolean();
            } else if (str.equals("and")) {
                mathDivideJoinerBoolean = new AndBoolean();
            } else if (str.equals("==")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.CompareEqualBoolean();
            } else if (str.equals("!=")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.CompareNotEqualBoolean();
            } else if (str.equals(">")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.CompareGreaterThanNumbers();
            } else if (str.equals(">=")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.CompareGreaterThanOrEqualNumbers();
            } else if (str.equals("<")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.CompareLessThanNumbers();
            } else if (str.equals("<=")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.CompareLessThanOrEqualNumbers();
            } else if (str.equals("%")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.MathModulusJoinerBoolean();
            } else if (str.equals("+")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.MathAddJoinerBoolean();
            } else if (str.equals("-")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.MathSubtractJoinerBoolean();
            } else if (str.equals("*")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.MathMultiplyJoinerBoolean();
            } else if (str.equals("/")) {
                mathDivideJoinerBoolean = new CompareJoinerBoolean.MathDivideJoinerBoolean();
            } else {
                throw new BooleanParseException("Unknown joiner:'" + str + "'");
            }
            return mathDivideJoinerBoolean;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr;
            String str = "(";
            boolean z = true;
            for (LogicBoolean logicBoolean : this.children) {
                if (z) {
                    z = false;
                } else {
                    str = str + " " + type() + " ";
                }
                str = str + logicBoolean.getMatchFailReasonForPlayer(abstractC0623y);
            }
            return str + ")";
        }

        public String getDebugDetails(C0451j c0451j) {
            LogicBoolean[] logicBooleanArr;
            String str = "(";
            boolean z = true;
            for (LogicBoolean logicBoolean : this.children) {
                if (z) {
                    z = false;
                } else {
                    str = str + " " + type() + " ";
                }
                str = str + logicBoolean.getDebugDetails(c0451j);
            }
            return str + ")";
        }

        public final void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
        }

        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return this;
        }

        public boolean requireBooleanChildren() {
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$OrBoolean.class */
    public final class OrBoolean extends JoinerBoolean {
        public String type() {
            return "or";
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            for (LogicBoolean logicBoolean : this.children) {
                if (logicBoolean.read(abstractC0623y)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$AndBoolean.class */
    public final class AndBoolean extends JoinerBoolean {
        public String type() {
            return "and";
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            for (LogicBoolean logicBoolean : this.children) {
                if (!logicBoolean.read(abstractC0623y)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$NotBoolean.class */
    public final class NotBoolean extends LogicBoolean {
        LogicBoolean child;

        public NotBoolean(LogicBoolean logicBoolean) {
            this.child = logicBoolean;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return !this.child.read(abstractC0623y);
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "not(" + this.child.getMatchFailReasonForPlayer(abstractC0623y) + ")";
        }
    }

    public static String getAllParametersDebug(LogicBoolean logicBoolean, AbstractC0623y abstractC0623y) {
        String str = VariableScope.nullOrMissingString;
        LogicBooleanLoader.ParameterMapping parameters = logicBoolean.getParameters();
        for (String str2 : parameters.parameters.keySet()) {
            LogicBooleanLoader.ParameterMapping.FieldOrMethod fieldOrMethod = (LogicBooleanLoader.ParameterMapping.FieldOrMethod) parameters.parameters.get(str2);
            if (fieldOrMethod.field != null) {
                if (!str.equals(VariableScope.nullOrMissingString)) {
                    str = str + ",";
                }
                String str3 = null;
                Object argumentTextWithMapping = LogicBooleanLoader.getArgumentTextWithMapping(fieldOrMethod, logicBoolean);
                if (argumentTextWithMapping instanceof String) {
                    str3 = argumentTextWithMapping.toString();
                }
                if (argumentTextWithMapping instanceof LogicBoolean) {
                    str3 = ((LogicBoolean) argumentTextWithMapping).valueToStringDebug(abstractC0623y);
                }
                str = str + str2 + "=" + str3;
            }
        }
        return str;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$LogicNumberOnly.class */
    public abstract class LogicNumberOnly extends LogicBoolean {
        public abstract String getName();

        public abstract float readNumber(AbstractC0623y abstractC0623y);

        public ReturnType getReturnType() {
            return ReturnType.number;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return false;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return getName() + "(" + getAllParametersDebug(this, abstractC0623y) + ")=" + CommonUtils.m2363a(readNumber(abstractC0623y), 3) + VariableScope.nullOrMissingString;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$AbstractNumberBoolean.class */
    public abstract class AbstractNumberBoolean extends LogicBoolean {
        @Parameter
        public boolean full;
        @Parameter
        public boolean empty;
        @Parameter
        public float greaterThan = -1.0f;
        @Parameter
        public float lessThan = -1.0f;

        public abstract String getName();

        public abstract float getValue(AbstractC0623y abstractC0623y);

        public abstract float getMaxValue(AbstractC0623y abstractC0623y);

        @Parameter
        public void equalTo(float f) {
            this.greaterThan = f - 1.0E-4f;
            this.lessThan = f + 1.0E-4f;
        }

        public ReturnType getReturnType() {
            if (this.greaterThan == -1.0f && this.lessThan == -1.0f && !this.full && !this.empty) {
                return ReturnType.number;
            }
            return ReturnType.bool;
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (z && this.greaterThan == -1.0f && this.lessThan == -1.0f && !this.full && !this.empty) {
                throw new BooleanParseException("Expected greaterThan, lessThan, full, and/or empty to be set for function:" + str + " to return a boolean");
            }
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            return getValue(abstractC0623y);
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = getName() + "=" + CommonUtils.m2363a(getValue(abstractC0623y), 3) + VariableScope.nullOrMissingString;
            if (this.full) {
                str = str + "(full)";
            }
            if (this.empty) {
                str = str + "(empty)";
            }
            if (this.greaterThan != -1.0f) {
                str = str + ">" + CommonUtils.m2363a(this.greaterThan, 3);
            }
            if (this.lessThan != -1.0f) {
                str = str + "<" + CommonUtils.m2363a(this.lessThan, 3);
            }
            return str;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            float value = getValue(abstractC0623y);
            boolean z = true;
            if (this.full && value < getMaxValue(abstractC0623y)) {
                z = false;
            }
            if (this.empty && value > 0.0f) {
                z = false;
            }
            if (this.greaterThan != -1.0f && value <= this.greaterThan) {
                z = false;
            }
            if (this.lessThan != -1.0f && value >= this.lessThan) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$TimeBoolean.class */
    public abstract class TimeBoolean extends LogicBoolean {
        @Parameter
        public float laterThanSeconds = -1.0f;
        @Parameter
        public float withinSeconds = -1.0f;

        public abstract String getName();

        public abstract int getTime(AbstractC0623y abstractC0623y);

        public ReturnType getReturnType() {
            if (this.laterThanSeconds == -1.0f && this.withinSeconds == -1.0f) {
                return ReturnType.number;
            }
            return ReturnType.bool;
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (z && this.laterThanSeconds == -1.0f && this.withinSeconds == -1.0f) {
                throw new BooleanParseException("Expended laterThanSeconds, or withinSeconds argument for function:" + str + " to return a boolean");
            }
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = getName() + "=" + msToSecondsString(GameEngine.getInstance().f6096by - getTime(abstractC0623y));
            if (this.laterThanSeconds != -1.0f) {
                str = str + ">" + msToSecondsString(this.laterThanSeconds * 1000.0f);
            }
            if (this.withinSeconds != -1.0f) {
                str = str + "<" + msToSecondsString(this.withinSeconds * 1000.0f);
            }
            return str;
        }

        private String msToSecondsString(float f) {
            return CommonUtils.m2266f(f / 1000.0f) + "s";
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            return (GameEngine.getInstance().f6096by - getTime(abstractC0623y)) * 0.001f;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            int time = getTime(abstractC0623y);
            boolean z = true;
            GameEngine gameEngine = GameEngine.getInstance();
            if (this.withinSeconds > 0.0f && gameEngine.f6096by - (this.withinSeconds * 1000.0f) > time) {
                z = false;
            }
            if (this.laterThanSeconds > 0.0f && gameEngine.f6096by - (this.laterThanSeconds * 1000.0f) < time) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$StaticValueBoolean.class */
    public final class StaticValueBoolean extends LogicNumberOnly {
        public static final StaticValueBoolean static_0 = new StaticValueBoolean(0.0f);
        public static final StaticValueBoolean static_neg1 = new StaticValueBoolean(-1.0f);
        public static final StaticValueBoolean static_1 = new StaticValueBoolean(1.0f);
        float staticNumber;

        public static StaticValueBoolean getStaticNumber(String str) {
            try {
                return getStaticNumber(Float.parseFloat(str));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Error reading number: " + str, e);
            }
        }

        public static StaticValueBoolean getStaticNumber(float f) {
            return f == 0.0f ? static_0 : f == 1.0f ? static_1 : f == -1.0f ? static_neg1 : new StaticValueBoolean(f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public StaticValueBoolean(float f) {
            this.staticNumber = f;
        }

        public String getName() {
            return VariableScope.nullOrMissingString + this.staticNumber;
        }

        public final float readNumber(AbstractC0623y abstractC0623y) {
            return this.staticNumber;
        }

        public float getStaticValue() {
            return this.staticNumber;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return CommonUtils.m2363a(this.staticNumber, 3);
        }
    }

    public LogicBooleanLoader.LogicBooleanContext createContext() {
        return LogicBooleanLoader.voidContextReader;
    }

    public void throwVoidReturnError(String str) {
        throw new RuntimeException("Function or object:'" + str + "' cannot be returned");
    }

    public LogicBoolean setChild(LogicBoolean logicBoolean) {
        throw new RuntimeException("setChild not supported");
    }
}
