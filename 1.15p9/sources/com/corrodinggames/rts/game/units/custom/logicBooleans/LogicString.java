package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString.class */
public abstract class LogicString extends LogicBoolean {
    public LogicBoolean.ReturnType getReturnType() {
        return LogicBoolean.ReturnType.string;
    }

    public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
        super.validate(str, str2, str3, logicBooleanContext, z);
    }

    public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
        return "TEXT";
    }

    public boolean read(AbstractC0623y abstractC0623y) {
        return false;
    }

    public float readNumber(AbstractC0623y abstractC0623y) {
        return 0.0f;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$StaticString.class */
    public class StaticString extends LogicString {
        String text;

        public StaticString(String str) {
            this.text = str;
        }

        public String readString(AbstractC0623y abstractC0623y) {
            return this.text;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$Playername.class */
    public class Playername extends LogicString {
        public String readString(AbstractC0623y abstractC0623y) {
            return abstractC0623y.team.f1315u;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$TeamName.class */
    public class TeamName extends LogicString {
        public String readString(AbstractC0623y abstractC0623y) {
            return abstractC0623y.team.m6325h();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$WrappingLogicString.class */
    public class WrappingLogicString extends LogicString {
        LogicBoolean[] children;

        public void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList m2298b = CommonUtils.m2298b(str, ",", false);
            validateNumberOfArguments(m2298b.size());
            this.children = new LogicBoolean[m2298b.size()];
            for (int i = 0; i < m2298b.size(); i++) {
                this.children[i] = LogicBooleanLoader.parseBooleanBlock(c0453l, (String) m2298b.get(i), false);
                if (this.children == null) {
                    throw new BooleanParseException("Expected non-null argument");
                }
            }
        }

        public void validateNumberOfArguments(int i) {
            if (i != 1) {
                throw new BooleanParseException("Expected 1 argument");
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$Debug.class */
    public class Debug extends WrappingLogicString {
        public String readString(AbstractC0623y abstractC0623y) {
            return this.children[0].getMatchFailReasonForPlayer(abstractC0623y);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$DebugPassthrough.class */
    public class DebugPassthrough extends WrappingLogicString {
        public void addMessage(AbstractC0623y abstractC0623y) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.f6094bv && gameEngine.f6225bl) {
                String str = VariableScope.nullOrMissingString;
                if (abstractC0623y != null) {
                    str = abstractC0623y.getUnitType().mo5706i() + "(" + abstractC0623y.f6945ed + ") ";
                }
                C0831ad.m1743a((String) null, str + "DebugPassthrough: " + this.children[0].getMatchFailReasonForPlayer(abstractC0623y));
            }
        }

        public LogicBoolean.ReturnType getReturnType() {
            return this.children[0].getReturnType();
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            addMessage(abstractC0623y);
            return this.children[0].read(abstractC0623y);
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            addMessage(abstractC0623y);
            return this.children[0].readNumber(abstractC0623y);
        }

        public String readString(AbstractC0623y abstractC0623y) {
            addMessage(abstractC0623y);
            return this.children[0].readString(abstractC0623y);
        }

        public Unit readUnit(AbstractC0623y abstractC0623y) {
            addMessage(abstractC0623y);
            return this.children[0].readUnit(abstractC0623y);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$Substring.class */
    public class Substring extends LogicString {
        @LogicBoolean.Parameter(required = true, positional = 0)
        public LogicBoolean text;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, required = true, positional = 1)
        public LogicBoolean start;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, required = true, positional = 2)
        public LogicBoolean end;

        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            if (this.text == null) {
                throw new BooleanParseException("Expected argument text");
            }
            if (this.text.getReturnType() != LogicBoolean.ReturnType.string) {
                this.text = StringCast.createStringCast(this.text);
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        public String readString(AbstractC0623y abstractC0623y) {
            String readString = this.text.readString(abstractC0623y);
            int readNumber = (int) this.start.readNumber(abstractC0623y);
            int readNumber2 = (int) this.end.readNumber(abstractC0623y);
            if (readNumber < 0) {
                readNumber = 0;
            }
            if (readNumber2 < 0) {
                readNumber2 = 0;
            }
            if (readNumber > readString.length()) {
                readNumber = readString.length();
            }
            if (readNumber2 > readString.length()) {
                readNumber2 = readString.length();
            }
            return readString.substring(readNumber, readNumber2);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$LowerString.class */
    public class LowerString extends LogicString {
        @LogicBoolean.Parameter(required = true, positional = 0)
        public LogicBoolean text;

        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            if (this.text == null) {
                throw new BooleanParseException("Expected argument text");
            }
            if (this.text.getReturnType() != LogicBoolean.ReturnType.string) {
                throw new BooleanParseException("Expected string argument");
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        public String readString(AbstractC0623y abstractC0623y) {
            return this.text.readString(abstractC0623y).toLowerCase(Locale.ROOT);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$UpperString.class */
    public class UpperString extends LogicString {
        @LogicBoolean.Parameter(required = true, positional = 0)
        public LogicBoolean text;

        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            if (this.text == null) {
                throw new BooleanParseException("Expected argument text");
            }
            if (this.text.getReturnType() != LogicBoolean.ReturnType.string) {
                throw new BooleanParseException("Expected string argument");
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        public String readString(AbstractC0623y abstractC0623y) {
            return this.text.readString(abstractC0623y).toUpperCase(Locale.ROOT);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$StringCast.class */
    public class StringCast extends LogicString {
        LogicBoolean child;
        LogicBoolean.ReturnType sourceType;

        public void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList m2298b = CommonUtils.m2298b(str, ",", false);
            validateNumberOfArguments(m2298b.size());
            this.child = LogicBooleanLoader.parseBooleanBlock(c0453l, (String) m2298b.get(0), false);
            if (this.child == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
        }

        public void validateNumberOfArguments(int i) {
            if (i != 1) {
                throw new BooleanParseException("Expected 1 argument");
            }
        }

        public static LogicBoolean createStringCast(LogicBoolean logicBoolean) {
            StringCast stringCast = new StringCast();
            stringCast.child = logicBoolean;
            return stringCast.validateAndOptimize("cast", VariableScope.nullOrMissingString, VariableScope.nullOrMissingString, null, false);
        }

        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            this.sourceType = this.child.getReturnType();
            if (this.child instanceof StaticString) {
                return this.child;
            }
            if (this.child instanceof LogicBoolean.StaticBoolean) {
                return new StaticString(readString(null));
            }
            if (this.child instanceof LogicBoolean.StaticValueBoolean) {
                return new StaticString(readString(null));
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        public String readString(AbstractC0623y abstractC0623y) {
            return castToString(this.sourceType, this.child, abstractC0623y);
        }

        public static String castToString(LogicBoolean.ReturnType returnType, LogicBoolean logicBoolean, AbstractC0623y abstractC0623y) {
            if (returnType == LogicBoolean.ReturnType.number) {
                return CommonUtils.m2363a(logicBoolean.readNumber(abstractC0623y), 2);
            }
            if (returnType == LogicBoolean.ReturnType.unit) {
                return Unit.m5908A(logicBoolean.readUnit(abstractC0623y));
            }
            if (returnType == LogicBoolean.ReturnType.string) {
                return logicBoolean.readString(abstractC0623y);
            }
            return logicBoolean.read(abstractC0623y) ? "true" : "false";
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$StringCast$NumberToStringCast.class */
        public class NumberToStringCast extends StringCast {
            public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
                return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
            }

            public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
                super.validateNumberOfArguments(i);
            }

            public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0453l c0453l, String str2) {
                super.setArgumentsRaw(str, c0453l, str2);
            }

            public String readString(AbstractC0623y abstractC0623y) {
                return CommonUtils.m2363a(this.child.readNumber(abstractC0623y), 2);
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$Select.class */
    public class Select extends LogicString {
        LogicBoolean.ReturnType commonType;
        LogicBoolean selector;
        LogicBoolean childA;
        LogicBoolean childB;

        public void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList m2298b = CommonUtils.m2298b(str, ",", false);
            validateNumberOfArguments(m2298b.size());
            this.selector = LogicBooleanLoader.parseBooleanBlock(c0453l, (String) m2298b.get(0), true);
            if (this.selector == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
            this.childA = LogicBooleanLoader.parseBooleanBlock(c0453l, (String) m2298b.get(1), false);
            if (this.childA == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
            this.childB = LogicBooleanLoader.parseBooleanBlock(c0453l, (String) m2298b.get(2), false);
            if (this.childB == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
            this.commonType = this.childA.getReturnType();
            if (this.commonType != this.childB.getReturnType()) {
                throw new BooleanParseException("Select() expected 2 and 3 argument to be the same type, got: " + this.commonType.name() + " and " + this.childB.getReturnType().name());
            }
        }

        public void validateNumberOfArguments(int i) {
            if (i != 3) {
                throw new BooleanParseException("Expected 3 arguments");
            }
        }

        public LogicBoolean.ReturnType getReturnType() {
            return this.commonType;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "(selector if:(" + this.selector.getMatchFailReasonForPlayer(abstractC0623y) + ") then:(" + this.childA.getMatchFailReasonForPlayer(abstractC0623y) + ") ) else:(" + this.childB.getMatchFailReasonForPlayer(abstractC0623y) + ") )";
        }

        public String readString(AbstractC0623y abstractC0623y) {
            if (this.selector.read(abstractC0623y)) {
                return this.childA.readString(abstractC0623y);
            }
            return this.childB.readString(abstractC0623y);
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            if (this.selector.read(abstractC0623y)) {
                return this.childA.read(abstractC0623y);
            }
            return this.childB.read(abstractC0623y);
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            if (this.selector.read(abstractC0623y)) {
                return this.childA.readNumber(abstractC0623y);
            }
            return this.childB.readNumber(abstractC0623y);
        }
    }
}
