package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean.class */
public abstract class CompareJoinerBoolean extends LogicBoolean.JoinerBoolean {
    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
    public boolean requireBooleanChildren() {
        return false;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareBooleanOnly.class */
    public abstract class CompareBooleanOnly extends CompareJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.CompareJoinerBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public boolean requireBooleanChildren() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            LogicBoolean[] logicBooleanArr;
            LogicBoolean[] logicBooleanArr2;
            if (this.children.length < 2) {
                throw new BooleanParseException("Expected 2 or more elements while using " + type() + " have: " + this.children.length);
            }
            boolean z2 = false;
            LogicBoolean.ReturnType returnType = null;
            LogicBoolean[] logicBooleanArr3 = this.children;
            int length = logicBooleanArr3.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                LogicBoolean logicBoolean = logicBooleanArr3[i];
                if (!LogicBoolean.isStaticNull(logicBoolean)) {
                    returnType = logicBoolean.getReturnType();
                    break;
                }
                z2 = true;
                i++;
            }
            if (returnType == null) {
                returnType = LogicBoolean.ReturnType.unit;
            }
            if (z2 && returnType != LogicBoolean.ReturnType.string && returnType != LogicBoolean.ReturnType.unit) {
                throw new BooleanParseException(returnType + " cannot be compared to null using " + type());
            }
            for (LogicBoolean logicBoolean2 : this.children) {
                LogicBoolean.ReturnType returnType2 = logicBoolean2.getReturnType();
                if (returnType != returnType2 && !LogicBoolean.isStaticNull(logicBoolean2)) {
                    throw new BooleanParseException("Mixing types: " + returnType + " and " + returnType2 + " while using " + type());
                }
            }
            if (returnType == LogicBoolean.ReturnType.number) {
                if (this instanceof CompareEqualBoolean) {
                    CompareEqualNumbers compareEqualNumbers = new CompareEqualNumbers();
                    compareEqualNumbers.children = this.children;
                    return compareEqualNumbers.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
                } else if (this instanceof CompareNotEqualBoolean) {
                    CompareNotEqualNumbers compareNotEqualNumbers = new CompareNotEqualNumbers();
                    compareNotEqualNumbers.children = this.children;
                    return compareNotEqualNumbers.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
                } else {
                    throw new BooleanParseException("Unhandled compare type: " + type() + " while using numbers");
                }
            } else if (returnType == LogicBoolean.ReturnType.bool) {
                LogicBoolean.StaticBoolean staticBoolean = null;
                for (LogicBoolean logicBoolean3 : this.children) {
                    if (logicBoolean3 instanceof LogicBoolean.StaticBoolean) {
                        staticBoolean = (LogicBoolean.StaticBoolean) logicBoolean3;
                    }
                }
                if (staticBoolean == null || (this instanceof CompareEqualBoolean)) {
                }
                return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
            } else if (returnType == LogicBoolean.ReturnType.string) {
                if (this instanceof CompareEqualBoolean) {
                    CompareEqualStrings compareEqualStrings = new CompareEqualStrings();
                    compareEqualStrings.children = this.children;
                    return compareEqualStrings.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
                } else if (this instanceof CompareNotEqualBoolean) {
                    CompareNotEqualStrings compareNotEqualStrings = new CompareNotEqualStrings();
                    compareNotEqualStrings.children = this.children;
                    return compareNotEqualStrings.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
                } else {
                    throw new BooleanParseException("Unhandled compare type: " + type() + " while using numbers");
                }
            } else if (returnType == LogicBoolean.ReturnType.unit) {
                if (this instanceof CompareEqualBoolean) {
                    CompareEqualUnits compareEqualUnits = new CompareEqualUnits();
                    compareEqualUnits.children = this.children;
                    return compareEqualUnits.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
                } else if (this instanceof CompareNotEqualBoolean) {
                    CompareNotEqualUnits compareNotEqualUnits = new CompareNotEqualUnits();
                    compareNotEqualUnits.children = this.children;
                    return compareNotEqualUnits.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
                } else {
                    throw new BooleanParseException("Unhandled compare type: " + type() + " while using numbers");
                }
            } else {
                throw new BooleanParseException("Unhandled type: " + returnType + " while using " + type());
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareEqualBoolean.class */
    public final class CompareEqualBoolean extends CompareBooleanOnly {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "==";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean read = this.children[0].read(abstractC0623y);
            for (int i = 1; i < this.children.length; i++) {
                if (this.children[i].read(abstractC0623y) != read) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareNotEqualBoolean.class */
    public final class CompareNotEqualBoolean extends CompareBooleanOnly {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "!=";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean read = this.children[0].read(abstractC0623y);
            for (int i = 1; i < this.children.length; i++) {
                boolean read2 = this.children[i].read(abstractC0623y);
                if (read2 == read) {
                    return false;
                }
                read = read2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareNumbers.class */
    public abstract class CompareNumbers extends CompareJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            LogicBoolean[] logicBooleanArr;
            boolean z2 = true;
            for (LogicBoolean logicBoolean : this.children) {
                if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.number) {
                    throw new BooleanParseException("Non-number type while using " + type());
                }
                if (!(logicBoolean instanceof LogicBoolean.StaticValueBoolean)) {
                    z2 = false;
                }
            }
            if (z2) {
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareEqualNumbers.class */
    public final class CompareEqualNumbers extends CompareNumbers {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "==";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            float readNumber = logicBooleanArr[0].readNumber(abstractC0623y);
            for (int i = 1; i < logicBooleanArr.length; i++) {
                float readNumber2 = logicBooleanArr[i].readNumber(abstractC0623y);
                if (readNumber2 - 1.0E-4f > readNumber || readNumber2 + 1.0E-4f < readNumber) {
                    return false;
                }
                readNumber = readNumber2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareNotEqualNumbers.class */
    public final class CompareNotEqualNumbers extends CompareNumbers {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "!=";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            float readNumber = logicBooleanArr[0].readNumber(abstractC0623y);
            for (int i = 1; i < logicBooleanArr.length; i++) {
                float readNumber2 = logicBooleanArr[i].readNumber(abstractC0623y);
                if (readNumber2 - 1.0E-4f <= readNumber && readNumber2 + 1.0E-4f >= readNumber) {
                    return false;
                }
                readNumber = readNumber2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareEqualStrings.class */
    public final class CompareEqualStrings extends CompareJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "==";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            String readString = logicBooleanArr[0].readString(abstractC0623y);
            if (readString == null) {
                readString = VariableScope.nullOrMissingString;
            }
            for (int i = 1; i < logicBooleanArr.length; i++) {
                String readString2 = logicBooleanArr[i].readString(abstractC0623y);
                if (readString2 == null) {
                    readString2 = VariableScope.nullOrMissingString;
                }
                if (!readString.equals(readString2)) {
                    return false;
                }
                readString = readString2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareNotEqualStrings.class */
    public final class CompareNotEqualStrings extends CompareJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "!=";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            String readString = logicBooleanArr[0].readString(abstractC0623y);
            if (readString == null) {
                readString = VariableScope.nullOrMissingString;
            }
            for (int i = 1; i < logicBooleanArr.length; i++) {
                String readString2 = logicBooleanArr[i].readString(abstractC0623y);
                if (readString2 == null) {
                    readString2 = VariableScope.nullOrMissingString;
                }
                if (readString.equals(readString2)) {
                    return false;
                }
                readString = readString2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareEqualUnits.class */
    public final class CompareEqualUnits extends CompareJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "==";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            AbstractC0244am readUnit = logicBooleanArr[0].readUnit(abstractC0623y);
            for (int i = 1; i < logicBooleanArr.length; i++) {
                AbstractC0244am readUnit2 = logicBooleanArr[i].readUnit(abstractC0623y);
                if (readUnit != readUnit2) {
                    return false;
                }
                readUnit = readUnit2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareNotEqualUnits.class */
    public final class CompareNotEqualUnits extends CompareJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "!=";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            AbstractC0244am readUnit = logicBooleanArr[0].readUnit(abstractC0623y);
            for (int i = 1; i < logicBooleanArr.length; i++) {
                AbstractC0244am readUnit2 = logicBooleanArr[i].readUnit(abstractC0623y);
                if (readUnit == readUnit2) {
                    return false;
                }
                readUnit = readUnit2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareGreaterThanNumbers.class */
    public final class CompareGreaterThanNumbers extends CompareNumbers {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return ">";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            float readNumber = logicBooleanArr[0].readNumber(abstractC0623y);
            for (int i = 1; i < logicBooleanArr.length; i++) {
                float readNumber2 = logicBooleanArr[i].readNumber(abstractC0623y);
                if (readNumber <= readNumber2) {
                    return false;
                }
                readNumber = readNumber2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareLessThanNumbers.class */
    public final class CompareLessThanNumbers extends CompareNumbers {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "<";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            float readNumber = logicBooleanArr[0].readNumber(abstractC0623y);
            for (int i = 1; i < logicBooleanArr.length; i++) {
                float readNumber2 = logicBooleanArr[i].readNumber(abstractC0623y);
                if (readNumber >= readNumber2) {
                    return false;
                }
                readNumber = readNumber2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareGreaterThanOrEqualNumbers.class */
    public final class CompareGreaterThanOrEqualNumbers extends CompareNumbers {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return ">=";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            float readNumber = logicBooleanArr[0].readNumber(abstractC0623y);
            for (int i = 1; i < logicBooleanArr.length; i++) {
                float readNumber2 = logicBooleanArr[i].readNumber(abstractC0623y);
                if (readNumber < readNumber2) {
                    return false;
                }
                readNumber = readNumber2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$CompareLessThanOrEqualNumbers.class */
    public final class CompareLessThanOrEqualNumbers extends CompareNumbers {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "<=";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            LogicBoolean[] logicBooleanArr = this.children;
            float readNumber = logicBooleanArr[0].readNumber(abstractC0623y);
            for (int i = 1; i < logicBooleanArr.length; i++) {
                float readNumber2 = logicBooleanArr[i].readNumber(abstractC0623y);
                if (readNumber > readNumber2) {
                    return false;
                }
                readNumber = readNumber2;
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$MathJoinerBoolean.class */
    public abstract class MathJoinerBoolean extends CompareJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.number;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            LogicBoolean[] logicBooleanArr;
            if (this instanceof MathAddJoinerBoolean) {
                boolean z2 = false;
                for (LogicBoolean logicBoolean : this.children) {
                    if (logicBoolean.getReturnType() == LogicBoolean.ReturnType.string) {
                        z2 = true;
                    }
                }
                if (z2) {
                    StringJoinerBoolean stringJoinerBoolean = new StringJoinerBoolean();
                    stringJoinerBoolean.children = this.children;
                    return stringJoinerBoolean.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
                }
            }
            boolean z3 = true;
            for (LogicBoolean logicBoolean2 : this.children) {
                if (!(logicBoolean2 instanceof LogicBoolean.StaticValueBoolean)) {
                    z3 = false;
                }
                if (logicBoolean2.getReturnType() != LogicBoolean.ReturnType.number) {
                    throw new BooleanParseException("Unexpected type while using " + type() + " got: " + logicBoolean2.getReturnType().name());
                }
            }
            if (z3) {
                return new LogicBoolean.StaticValueBoolean(readNumber(null));
            }
            if (z) {
                throw new BooleanParseException("Cannot return number here, expected boolean");
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$StringJoinerBoolean.class */
    public final class StringJoinerBoolean extends CompareJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "+";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            for (int i = 0; i < this.children.length; i++) {
                if (this.children[i].getReturnType() != LogicBoolean.ReturnType.string) {
                    this.children[i] = LogicString.StringCast.createStringCast(this.children[i]);
                }
            }
            boolean z2 = true;
            for (LogicBoolean logicBoolean : this.children) {
                if (!(logicBoolean instanceof LogicString.StaticString)) {
                    z2 = false;
                }
            }
            if (z2) {
                return new LogicString.StaticString(readString(null));
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0623y abstractC0623y) {
            String readString = this.children[0].readString(abstractC0623y);
            for (int i = 1; i < this.children.length; i++) {
                readString = readString + this.children[i].readString(abstractC0623y);
            }
            return readString;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0623y abstractC0623y) {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.string;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$MathAddJoinerBoolean.class */
    public final class MathAddJoinerBoolean extends MathJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "+";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            float readNumber = this.children[0].readNumber(abstractC0623y);
            for (int i = 1; i < this.children.length; i++) {
                readNumber += this.children[i].readNumber(abstractC0623y);
            }
            return readNumber;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$MathSubtractJoinerBoolean.class */
    public final class MathSubtractJoinerBoolean extends MathJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "-";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            float readNumber = this.children[0].readNumber(abstractC0623y);
            for (int i = 1; i < this.children.length; i++) {
                readNumber -= this.children[i].readNumber(abstractC0623y);
            }
            return readNumber;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$MathMultiplyJoinerBoolean.class */
    public final class MathMultiplyJoinerBoolean extends MathJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "*";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            float readNumber = this.children[0].readNumber(abstractC0623y);
            for (int i = 1; i < this.children.length; i++) {
                readNumber *= this.children[i].readNumber(abstractC0623y);
            }
            return readNumber;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$MathModulusJoinerBoolean.class */
    public final class MathModulusJoinerBoolean extends MathJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "%";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            float readNumber = this.children[0].readNumber(abstractC0623y);
            for (int i = 1; i < this.children.length; i++) {
                readNumber %= this.children[i].readNumber(abstractC0623y);
            }
            return readNumber;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/CompareJoinerBoolean$MathDivideJoinerBoolean.class */
    public final class MathDivideJoinerBoolean extends MathJoinerBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.JoinerBoolean
        public String type() {
            return "/";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0623y abstractC0623y) {
            float readNumber = this.children[0].readNumber(abstractC0623y);
            for (int i = 1; i < this.children.length; i++) {
                readNumber /= this.children[i].readNumber(abstractC0623y);
            }
            return readNumber;
        }
    }
}
