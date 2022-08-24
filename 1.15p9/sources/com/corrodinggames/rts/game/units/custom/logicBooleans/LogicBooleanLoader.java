package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.CompareJoinerBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader.class */
public class LogicBooleanLoader {
    public static final boolean TRACE = false;
    static Pattern patternSingleQuote = Pattern.compile("'(.*)'");
    static Pattern patternDoubleQuote = Pattern.compile("\"(.*)\"");
    static Pattern patternInteger = Pattern.compile("(-?\\d*)");
    static Pattern patternFloat = Pattern.compile("(-?\\d*\\.\\d*)");
    static final LogicBooleanContext defaultContextReader = new DefaultContextReader();
    static final LogicBooleanContext voidContextReader = new VoidContextReader();

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$DefaultContextReader.class */
    public final class DefaultContextReader extends LogicBooleanContextWithDefault {
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$LogicBooleanContext.class */
    public interface LogicBooleanContext {
        LogicBoolean parseNextElementInChain(String str, C0453l c0453l, String str2, boolean z, String str3, String str4);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ParameterMapping.class */
    public class ParameterMapping {
        public HashMap parameters = new HashMap();
        int numberOfPositionalParameters = 0;
        public Class type;
        public String allParametersString;

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ParameterMapping$FieldOrMethod.class */
        public class FieldOrMethod {
            Field field;
            Method method;
            Class type;
            LogicBoolean.ReturnType returnType;
            int positionalOffset = -1;
            boolean required;

            public FieldOrMethod(Field field) {
                this.field = field;
                this.type = field.getType();
            }

            public FieldOrMethod(Method method) {
                this.method = method;
                this.type = method.getParameterTypes()[0];
            }
        }

        public ParameterMapping(Class cls) {
            Method[] methods;
            this.type = cls;
            ArrayList arrayList = new ArrayList();
            LogicBooleanLoader.getAllFieldsInherited(arrayList, cls);
            this.allParametersString = VariableScope.nullOrMissingString;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                if (field.isAnnotationPresent(LogicBoolean.Parameter.class)) {
                    addParameter(field.getName().toLowerCase(Locale.ROOT), new FieldOrMethod(field), (LogicBoolean.Parameter) field.getAnnotation(LogicBoolean.Parameter.class));
                }
            }
            for (Method method : cls.getMethods()) {
                if (method.isAnnotationPresent(LogicBoolean.Parameter.class)) {
                    addParameter(method.getName().toLowerCase(Locale.ROOT), new FieldOrMethod(method), (LogicBoolean.Parameter) method.getAnnotation(LogicBoolean.Parameter.class));
                }
            }
        }

        public void addParameter(String str, FieldOrMethod fieldOrMethod, LogicBoolean.Parameter parameter) {
            if (parameter.type() != LogicBoolean.ReturnType.undefined) {
                fieldOrMethod.returnType = parameter.type();
            }
            if (parameter.positional() != -1) {
                fieldOrMethod.positionalOffset = parameter.positional();
                this.numberOfPositionalParameters++;
            }
            if (parameter.required()) {
                fieldOrMethod.required = true;
            }
            if (parameter.key() != null && !parameter.key().equals(VariableScope.nullOrMissingString)) {
                str = parameter.key();
            }
            this.parameters.put(str, fieldOrMethod);
            if (!this.allParametersString.equals(VariableScope.nullOrMissingString)) {
                this.allParametersString += ", ";
            }
            this.allParametersString += str;
        }
    }

    public static boolean isEmptyIgnoringPlusMinus(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '-' && charAt != '+' && charAt != ' ') {
                return false;
            }
        }
        return true;
    }

    public static LogicBoolean parseNumberBlock(C0453l c0453l, String str) {
        LogicBoolean parseBooleanBlock = parseBooleanBlock(c0453l, str, false);
        if (parseBooleanBlock != null && parseBooleanBlock.getReturnType() != LogicBoolean.ReturnType.number) {
            throw new RuntimeException("Expected number for: '" + str + "' got a " + parseBooleanBlock.getReturnType() + " type");
        }
        return parseBooleanBlock;
    }

    public static LogicBoolean parseBooleanBlock(C0453l c0453l, String str, boolean z) {
        ArrayList m2326a;
        int m2235t = CommonUtils.m2235t(str);
        if (m2235t != 0) {
            if (m2235t > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. A '(' was not closed.");
            }
            if (m2235t < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. Too many ')'.");
            }
        }
        String breakOuterLayerBrackets = breakOuterLayerBrackets(str.trim());
        if (breakOuterLayerBrackets.length() > 1 && breakOuterLayerBrackets.charAt(0) == '-') {
            boolean z2 = false;
            for (int i = 1; i < breakOuterLayerBrackets.length(); i++) {
                char charAt = breakOuterLayerBrackets.charAt(i);
                if (charAt != ' ') {
                    z2 = !Character.isDigit(charAt);
                }
            }
            if (z2) {
                breakOuterLayerBrackets = "0" + breakOuterLayerBrackets;
            }
        }
        String lowerCase = breakOuterLayerBrackets.toLowerCase(Locale.ROOT);
        String[] strArr = {"==", "!=", "<=", ">=", "<", ">"};
        String[] strArr2 = {"or", "and", "==", "!=", "<=", ">=", "<", ">", "%", "-", "+", "*", "/", "="};
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr2[i2];
            if (CommonUtils.m2285c(lowerCase, str2)) {
                boolean z3 = false;
                boolean z4 = false;
                if (str2.equals("and") || str2.equals("or")) {
                    z3 = true;
                    z4 = true;
                }
                if (str2.equals("<>")) {
                    int m2332a = CommonUtils.m2332a(breakOuterLayerBrackets, 0, strArr);
                    m2326a = new ArrayList();
                    m2326a.add(breakOuterLayerBrackets.substring(0, m2332a));
                    int i3 = m2332a + 2;
                    if (i3 > breakOuterLayerBrackets.length() - 1) {
                        i3 = breakOuterLayerBrackets.length() - 1;
                    }
                    String substring = breakOuterLayerBrackets.substring(m2332a, i3);
                    if (!substring.endsWith("=")) {
                        substring = substring.substring(0, 1);
                    }
                    m2326a.add(breakOuterLayerBrackets.substring(m2332a + substring.length()));
                    str2 = substring;
                } else if (z4) {
                    m2326a = CommonUtils.m2326a(breakOuterLayerBrackets, str2, z3, true);
                } else {
                    m2326a = CommonUtils.m2326a(breakOuterLayerBrackets, str2, z3, false);
                }
                if (m2326a.size() == 1) {
                    continue;
                } else if (str2.equals("=")) {
                    throw new RuntimeException("Unexpected assignment operator: '=', use '==' for comparison");
                } else {
                    if (!((String) m2326a.get(0)).equals(VariableScope.nullOrMissingString) || m2326a.size() != 2 || (!str2.equals("+") && !str2.equals("-"))) {
                        ArrayList arrayList = new ArrayList();
                        LogicBoolean.JoinerBoolean newJoiner = LogicBoolean.JoinerBoolean.getNewJoiner(str2);
                        boolean requireBooleanChildren = newJoiner.requireBooleanChildren();
                        if (requireBooleanChildren && ((newJoiner instanceof CompareJoinerBoolean.CompareNotEqualBoolean) || (newJoiner instanceof CompareJoinerBoolean.CompareEqualBoolean))) {
                            GameEngine.PrintLog(newJoiner.type() + " was set to require boolean. Workaround triggered. requireBooleanChildren:" + newJoiner.requireBooleanChildren());
                            requireBooleanChildren = false;
                        }
                        int i4 = -1;
                        if (str2.equals("+") || str2.equals("-")) {
                            boolean z5 = false;
                            Iterator it = m2326a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (isEmptyIgnoringPlusMinus((String) it.next())) {
                                    z5 = true;
                                    break;
                                }
                            }
                            if (z5) {
                                ArrayList arrayList2 = new ArrayList();
                                String str3 = VariableScope.nullOrMissingString;
                                Iterator it2 = m2326a.iterator();
                                while (it2.hasNext()) {
                                    String str4 = (String) it2.next();
                                    if (isEmptyIgnoringPlusMinus(str4)) {
                                        str3 = str3 + str4 + str2;
                                    } else {
                                        if (!str3.equals(VariableScope.nullOrMissingString)) {
                                            str4 = str3 + str4;
                                            str3 = VariableScope.nullOrMissingString;
                                        }
                                        arrayList2.add(str4);
                                    }
                                }
                                if (!str3.equals(VariableScope.nullOrMissingString)) {
                                    throw new RuntimeException("Unexpected empty last element using: " + str2);
                                }
                                m2326a = arrayList2;
                            }
                        }
                        if (m2326a.size() != 1) {
                            Iterator it3 = m2326a.iterator();
                            while (it3.hasNext()) {
                                String str5 = (String) it3.next();
                                i4++;
                                if (str5.equals(VariableScope.nullOrMissingString)) {
                                    if (i4 == 0) {
                                        throw new RuntimeException("Unexpected empty element before: " + str2);
                                    }
                                    throw new RuntimeException("Unexpected empty element after: " + str2);
                                }
                                try {
                                    LogicBoolean parseBooleanBlock = parseBooleanBlock(c0453l, str5, requireBooleanChildren);
                                    if (parseBooleanBlock == null) {
                                        throw new RuntimeException("null on:'" + breakOuterLayerBrackets + "'");
                                    }
                                    arrayList.add(parseBooleanBlock);
                                } catch (BooleanParseException e) {
                                    throw e;
                                }
                            }
                            newJoiner.children = (LogicBoolean[]) arrayList.toArray(new LogicBoolean[0]);
                            return newJoiner.validateAndOptimize(str2, VariableScope.nullOrMissingString, breakOuterLayerBrackets, null, z);
                        }
                    }
                }
            }
        }
        if (lowerCase.startsWith("not ")) {
            String substring2 = breakOuterLayerBrackets.substring("not ".length());
            return new LogicBoolean.NotBoolean(parseBooleanBlock(c0453l, substring2, true)).validateAndOptimize("not", VariableScope.nullOrMissingString, substring2, null, z);
        }
        if (breakOuterLayerBrackets.length() > 0) {
            String str6 = breakOuterLayerBrackets;
            if (str6.startsWith("+")) {
                str6 = str6.substring(1).trim();
            }
            String m2231x = CommonUtils.m2231x(str6);
            if (CommonUtils.m2234u(m2231x)) {
                if (z) {
                    throw new RuntimeException("Expected a boolean type here, not number: " + m2231x);
                }
                return LogicBoolean.StaticValueBoolean.getStaticNumber(m2231x);
            }
            String m2239p = CommonUtils.m2239p(breakOuterLayerBrackets);
            if (m2239p != null) {
                if (z) {
                    throw new RuntimeException("Expected a boolean type here, not string: " + breakOuterLayerBrackets);
                }
                return new LogicString.StaticString(m2239p);
            }
        }
        boolean z6 = false;
        boolean z7 = false;
        if (breakOuterLayerBrackets.startsWith("self.")) {
            breakOuterLayerBrackets = breakOuterLayerBrackets.substring("self.".length());
            z6 = true;
        }
        String[] m2327a = CommonUtils.m2327a(breakOuterLayerBrackets, ".", false);
        C1101m c1101m = new C1101m();
        LogicBoolean logicBoolean = null;
        String str7 = null;
        LogicBooleanContext logicBooleanContext = defaultContextReader;
        int i5 = 0;
        while (i5 < m2327a.length) {
            String str8 = m2327a[i5];
            if (str8.equalsIgnoreCase("self")) {
                if (z7) {
                    throw new RuntimeException("No field:'" + str8 + "' globals");
                }
                if (m2327a.length == 1) {
                    return UnitReference.selfUnitReference;
                }
                z6 = true;
            } else if (i5 == 0 && str8.equalsIgnoreCase("game")) {
                z7 = true;
            } else {
                boolean z8 = i5 == m2327a.length - 1;
                String str9 = null;
                if (z6) {
                    str9 = "self.";
                }
                if (z7) {
                    str9 = "game.";
                }
                boolean z9 = z;
                if (!z8) {
                    z9 = false;
                }
                if (logicBoolean != null) {
                    logicBooleanContext = logicBoolean.createContext();
                }
                LogicBoolean parseNextElementInChain = logicBooleanContext.parseNextElementInChain(str9, c0453l, str8, z9, breakOuterLayerBrackets, str7);
                if (parseNextElementInChain == null) {
                    throw new RuntimeException("Null function or field:'" + str8 + "'");
                }
                logicBoolean = parseNextElementInChain;
                str7 = str8;
                z6 = true;
                c1101m.add(parseNextElementInChain);
            }
            i5++;
        }
        if (c1101m.size() == 0) {
            throw new RuntimeException("Unknown function:'" + breakOuterLayerBrackets + "'");
        }
        LogicBoolean logicBoolean2 = null;
        for (int i6 = c1101m.f6888a - 1; i6 >= 0; i6--) {
            LogicBoolean logicBoolean3 = (LogicBoolean) c1101m.get(i6);
            if (logicBoolean2 != null) {
                logicBoolean3 = logicBoolean3.setChild(logicBoolean2);
            }
            logicBoolean2 = logicBoolean3;
        }
        LogicBoolean.ReturnType returnType = logicBoolean2.getReturnType();
        if (returnType == LogicBoolean.ReturnType.voidReturn) {
            logicBoolean2.throwVoidReturnError(breakOuterLayerBrackets);
            throw new RuntimeException("throwVoidReturnError");
        } else if (z && returnType != LogicBoolean.ReturnType.bool) {
            throw new BooleanParseException("Function:'" + breakOuterLayerBrackets + "' is expected to return a boolean type but it returns type: " + returnType);
        } else {
            return logicBoolean2;
        }
    }

    public static String fixArguments(String str) {
        String trim = str.trim();
        if (trim.equals(VariableScope.nullOrMissingString)) {
            return VariableScope.nullOrMissingString;
        }
        if (trim.startsWith("(") && trim.endsWith(")")) {
            return trim.substring(1, trim.length() - 1).trim();
        }
        throw new RuntimeException("Failed to parse function arguments:'" + trim + "'");
    }

    public static Matcher match(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public static void setArgumentsWithMapping(ParameterMapping parameterMapping, Object obj, String str, C0453l c0453l, String str2) {
        String str3;
        String str4;
        if (str2 == null) {
            str2 = obj.getClass().getSimpleName();
        }
        ArrayList arrayList = new ArrayList();
        if (str != null && !VariableScope.nullOrMissingString.equals(str)) {
            int i = 0;
            boolean z = false;
            Iterator it = CommonUtils.m2298b(str, ",", false).iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                int m2275d = CommonUtils.m2275d(str5, "=");
                if (m2275d > 0) {
                    str3 = str5.substring(0, m2275d);
                    str4 = str5.substring(m2275d + 1);
                    z = true;
                } else if (z) {
                    throw new BooleanParseException(str2 + "(): SyntaxError: Cannot use non-keyword arg after keyword arg");
                } else {
                    if (parameterMapping.numberOfPositionalParameters == 0) {
                        throw new BooleanParseException(str2 + "(): Function doesn't accept any non-keyword arguments.");
                    }
                    if (parameterMapping.numberOfPositionalParameters <= i) {
                        throw new BooleanParseException(str2 + "(): Too many non-keyword arguments. Only " + parameterMapping.numberOfPositionalParameters + " accepted.");
                    }
                    str3 = null;
                    Iterator it2 = parameterMapping.parameters.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str6 = (String) it2.next();
                        if (((ParameterMapping.FieldOrMethod) parameterMapping.parameters.get(str6)).positionalOffset == i) {
                            str3 = str6;
                            break;
                        }
                    }
                    if (str3 == null) {
                        throw new BooleanParseException("Error failed to find non-keyword argument index: " + i);
                    }
                    str4 = str5;
                }
                String str7 = str3;
                String lowerCase = str3.trim().toLowerCase(Locale.ROOT);
                if (arrayList.contains(lowerCase)) {
                    throw new BooleanParseException("SyntaxError: Argument '" + str7 + "' has been listed more than once");
                }
                arrayList.add(lowerCase);
                try {
                    setArgumentWithMapping(parameterMapping, obj, lowerCase, str4, c0453l);
                    i++;
                } catch (BooleanParseException e) {
                    throw e;
                }
            }
        }
        for (String str8 : parameterMapping.parameters.keySet()) {
            if (((ParameterMapping.FieldOrMethod) parameterMapping.parameters.get(str8)).required && !arrayList.contains(str8)) {
                throw new BooleanParseException(str2 + "(): SyntaxError: Missing required argument: '" + str8 + "'");
            }
        }
    }

    public static Object getArgumentTextWithMapping(ParameterMapping.FieldOrMethod fieldOrMethod, Object obj) {
        if (fieldOrMethod != null && fieldOrMethod.field != null) {
            try {
                Object obj2 = fieldOrMethod.field.get(obj);
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return "<error>";
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return "<error>";
            }
        } else if (fieldOrMethod != null && fieldOrMethod.method != null) {
            GameEngine.PrintLog("getArgumentTextWithMapping: method not supported");
            return "<method>";
        } else {
            GameEngine.PrintLog("getArgumentTextWithMapping: No method or field");
            return "<error>";
        }
    }

    public static void setArgumentWithMapping(ParameterMapping parameterMapping, Object obj, String str, String str2, C0453l c0453l) {
        String message;
        String message2;
        ParameterMapping.FieldOrMethod fieldOrMethod = (ParameterMapping.FieldOrMethod) parameterMapping.parameters.get(str);
        if (fieldOrMethod != null && fieldOrMethod.field != null) {
            Object convertParameterData = convertParameterData(str2, fieldOrMethod.type, c0453l, fieldOrMethod.returnType, str);
            if (convertParameterData == null && fieldOrMethod.required) {
                throw new BooleanParseException("SyntaxError: Cannot set required argument: '" + str + "' to null");
            }
            try {
                fieldOrMethod.field.set(obj, convertParameterData);
            } catch (IllegalAccessException e) {
                throw new BooleanParseException("Error setting parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e);
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                if (e2.getMessage() == null) {
                    throw new BooleanParseException("Error parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e2);
                }
                throw new BooleanParseException("Error parameter:'" + str + "': " + message2.replace("com.corrodinggames.rts.game.units.custom.logicBooleans.", VariableScope.nullOrMissingString).replace("java.lang.", VariableScope.nullOrMissingString));
            }
        } else if (fieldOrMethod != null && fieldOrMethod.method != null) {
            try {
                fieldOrMethod.method.invoke(obj, convertParameterData(str2, fieldOrMethod.type, c0453l, fieldOrMethod.returnType, str));
            } catch (IllegalAccessException e3) {
                throw new BooleanParseException("Error setting parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e3);
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
                if (e4.getMessage() == null) {
                    throw new BooleanParseException("Error parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e4);
                }
                throw new BooleanParseException("Error setting parameter:'" + str + "': " + message.replace("com.corrodinggames.rts.game.units.custom.logicBooleans.", VariableScope.nullOrMissingString).replace("java.lang.", VariableScope.nullOrMissingString));
            } catch (InvocationTargetException e5) {
                Throwable cause = e5.getCause();
                String str3 = VariableScope.nullOrMissingString;
                if (cause != null) {
                    str3 = " - " + cause.getMessage();
                }
                throw new BooleanParseException("Error setting parameter:'" + str + "' on " + obj.getClass().getSimpleName() + str3, e5);
            }
        } else {
            throw new BooleanParseException("No parameter:'" + str + "' on " + obj.getClass().getSimpleName() + " (Possible parameters:" + parameterMapping.allParametersString + ")");
        }
    }

    public static List getAllFieldsInherited(List list, Class cls) {
        list.addAll(Arrays.asList(cls.getFields()));
        return list;
    }

    public static Object convertParameterData(String str, Class cls, C0453l c0453l, LogicBoolean.ReturnType returnType, String str2) {
        LogicBoolean.ReturnType returnType2;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0 || trim.equals("null")) {
            return null;
        }
        if (cls == LogicBoolean.class) {
            LogicBoolean parseBooleanBlock = parseBooleanBlock(c0453l, trim, false);
            if (parseBooleanBlock != null && returnType != null && returnType != (returnType2 = parseBooleanBlock.getReturnType())) {
                throw new BooleanParseException("Wrong type. Expected type: '" + returnType + "' for dynamic parameter '" + str2 + "' instead got type:'" + returnType2 + "' (parsing: " + trim + ")");
            }
            return parseBooleanBlock;
        } else if (CommonUtils.m2233v(trim)) {
            if (!CommonUtils.m2285c(trim, ".")) {
                if (cls == String.class) {
                    return trim;
                }
                return Integer.valueOf(Integer.parseInt(trim));
            } else if (cls == String.class) {
                return trim;
            } else {
                return Float.valueOf(Float.parseFloat(trim));
            }
        } else {
            String lowerCase = trim.toLowerCase(Locale.ENGLISH);
            if ("false".equals(lowerCase)) {
                return Boolean.FALSE;
            }
            if ("true".equals(lowerCase)) {
                return Boolean.TRUE;
            }
            Matcher match = match(patternSingleQuote, trim);
            if (match != null) {
                return CommonUtils.m2238q(match.group(1));
            }
            Matcher match2 = match(patternDoubleQuote, trim);
            if (match2 != null) {
                return CommonUtils.m2238q(match2.group(1));
            }
            Matcher match3 = match(patternInteger, trim);
            if (match3 != null) {
                if (cls == String.class) {
                    return match3.group(1);
                }
                return Integer.valueOf(Integer.parseInt(match3.group(1)));
            }
            Matcher match4 = match(patternFloat, trim);
            if (match4 != null) {
                if (cls == String.class) {
                    return match4.group(1);
                }
                return Float.valueOf(Float.parseFloat(match4.group(1)));
            }
            String str3 = "null";
            if (cls != null) {
                str3 = "data of " + cls.getSimpleName();
                if (cls == String.class) {
                    str3 = "string";
                }
                if (cls == Float.TYPE) {
                    str3 = "number";
                }
                if (cls == Integer.TYPE) {
                    str3 = "integer";
                }
                if (cls == Boolean.TYPE) {
                    str3 = "boolean";
                }
            }
            String str4 = "Failed to read parameter '" + str2 + "' expected non-dynamic " + str3 + " got: " + trim + VariableScope.nullOrMissingString;
            if (cls == String.class) {
                str4 = str4 + " (A quoted string was expected)";
            }
            throw new BooleanParseException(str4);
        }
    }

    public static String breakOuterLayerBrackets(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            int m2255g = CommonUtils.m2255g(str, 0);
            if (m2255g == -1) {
                throw new RuntimeException("Brackets unbalanced. Starting '(' in '" + str + "' was not closed.");
            }
            if (m2255g == str.length() - 1) {
                str = breakOuterLayerBrackets(str.substring(1, str.length() - 1).trim());
            }
        }
        return str;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$LogicBooleanScopeOnly.class */
    public abstract class LogicBooleanScopeOnly extends LogicBoolean implements LogicBooleanContext {
        public LogicBooleanContext createContext() {
            return this;
        }

        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return logicBoolean;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return false;
        }

        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.voidReturn;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "<scope>";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$LogicBooleanContextWithDefault.class */
    public abstract class LogicBooleanContextWithDefault implements LogicBooleanContext {
        public LogicBoolean parseNextElementInChain(String str, C0453l c0453l, String str2, boolean z, String str3, String str4) {
            return defaultParseNextElementInChain(this, str, c0453l, str2, z, str3, str4);
        }

        public static LogicBoolean defaultParseNextElementInChain(LogicBooleanContext logicBooleanContext, String str, C0453l c0453l, String str2, boolean z, String str3, String str4) {
            String lowerCase;
            String substring;
            UnitReference parseSingleUnitReferenceElement = UnitReference.parseSingleUnitReferenceElement(c0453l, str2);
            if (parseSingleUnitReferenceElement != null) {
                return parseSingleUnitReferenceElement;
            }
            int indexOf = str2.indexOf("(");
            if (indexOf == -1) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
                substring = VariableScope.nullOrMissingString;
            } else {
                lowerCase = str2.substring(0, indexOf).trim().toLowerCase(Locale.ROOT);
                substring = str2.substring(indexOf);
            }
            if (str != null) {
                lowerCase = str + lowerCase;
            }
            LogicBoolean logicBoolean = (LogicBoolean) LogicBoolean.booleans.get(lowerCase);
            if (logicBoolean != null) {
                String fixArguments = LogicBooleanLoader.fixArguments(substring);
                return logicBoolean.mo7381with(c0453l, fixArguments, lowerCase).validateAndOptimize(lowerCase, fixArguments, str3, logicBooleanContext, z);
            } else if (str4 != null) {
                throw new RuntimeException("Unknown function or field:'" + str2 + "' in '" + str4 + "'");
            } else {
                throw new RuntimeException("Unknown function or field:'" + str2 + "'");
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$VoidContextReader.class */
    public final class VoidContextReader extends LogicBooleanContextWithDefault {
        public LogicBoolean parseNextElementInChain(String str, C0453l c0453l, String str2, boolean z, String str3, String str4) {
            if (str4 != null) {
                throw new RuntimeException("No field:'" + str2 + "' in '" + str4 + "'");
            }
            throw new RuntimeException("No field:'" + str2 + "'");
        }
    }
}
