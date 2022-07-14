package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.C0338ah;
import com.corrodinggames.rts.game.units.custom.C0373az;
import com.corrodinggames.rts.game.units.custom.C0395bl;
import com.corrodinggames.rts.game.units.custom.C0444t;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.TextWrapper;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.ValueListSource;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020e.C0411a;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ab.class */
public class UnitConfig {

    /* renamed from: g */
    private static final Pattern f6233g = Pattern.compile("\\p{C}");

    /* renamed from: h */
    private static final Pattern f6234h = Pattern.compile("\\s*\\[([^]]*)\\]\\s*");

    /* renamed from: i */
    private static final Pattern f6235i = Pattern.compile("\\s*([^=:]*)(?:=|:)(.*)");

    /* renamed from: a */
    String filename;

    /* renamed from: k */
    private boolean f6238k;

    /* renamed from: f */
    public String ioFilename;

    /* renamed from: j */
    private LinkedHashMap f6239j = new LinkedHashMap();

    /* renamed from: b */
    boolean isTrackingReads = true;

    /* renamed from: c */
    LinkedHashSet trackSet = new LinkedHashSet();

    /* renamed from: d */
    public ArrayList f6242d = new ArrayList();

    /* renamed from: e */
    public ArrayList f6243e = new ArrayList();

    /* renamed from: a */
    public void m669a() {
        this.f6238k = true;
        this.isTrackingReads = false;
    }

    /* renamed from: a */
    public void addTrack(String section, String key) {
        track(section, key, "Unknown");
    }

    /* renamed from: a */
    public void track(String section, String key, String str) {
        if (this.isTrackingReads) {
            this.trackSet.add(section + ":" + key);
        }
    }

    /* renamed from: b */
    public void m635b() {
        if (!this.isTrackingReads) {
            throw new RuntimeException("Not tracking reads");
        }
        for (String str : this.f6239j.keySet()) {
            if (str == null || !str.startsWith("template_")) {
                boolean z = false;
                String str2 = null;
                Map map = (Map) this.f6239j.get(str);
                for (String str3 : map.keySet()) {
                    if (str3 == null || (!str3.startsWith("@define ") && !str3.startsWith("@global "))) {
                        if (!this.trackSet.contains(str + ":" + str3)) {
                            if (!"IGNORE".equals((String) map.get(str3)) && str2 == null) {
                                str2 = this.filename + ": The key '[" + str + "]" + str3 + "' was not used. (hint: make sure it's valid and in the right section)";
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                if (str2 != null) {
                    if (z || this.f6239j.size() == 1) {
                        throw new RuntimeException(str2);
                    }
                    throw new RuntimeException(this.filename + ": No keys in section: [" + str + "] were used (is this section named correctly?)");
                }
            }
        }
    }

    /* renamed from: c */
    public int m628c() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            for (String str : this.f6239j.keySet()) {
                Map map = (Map) this.f6239j.get(str);
                for (String str2 : map.keySet()) {
                    messageDigest.update((str + ":" + str2 + ":" + ((String) map.get(str2))).getBytes("UTF-8"));
                }
            }
            return new BigInteger(1, messageDigest.digest()).intValue();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public UnitConfig(String filename) {
        this.filename = "ini";
        this.filename = filename;
        this.ioFilename = filename;
        m658a(filename);
    }

    public UnitConfig(InputStream inputStream, String filename) {
        this.filename = "ini";
        this.filename = filename;
        m659a(inputStream);
    }

    /* renamed from: a */
    public void m658a(String str) {
        m660a(new BufferedReader(new FileReader(str)));
    }

    /* renamed from: a */
    public void m659a(InputStream inputStream) {
        m660a(new BufferedReader(new InputStreamReader(inputStream, "UTF-8")));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0117 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m660a(java.io.BufferedReader r7) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.utility.UnitConfig.m660a(java.io.BufferedReader):void");
    }

    /* renamed from: a */
    private String getValue(String section, String key, boolean notThrow, String type) {
        String value = get(section, key, notThrow);
        if (value != null) {
            track(section, key, type);
        }
        return value;
    }

    /* renamed from: b */
    public String m632b(String str, String str2) {
        Map map = (Map) this.f6239j.get(str);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    /* renamed from: a */
    private String get(String section, String key, boolean notThrowException) {
        Map map = (Map) this.f6239j.get(section);
        if (map == null) {
            if (!notThrowException) {
                throw new RuntimeException("Could not find section: [" + section + "] in configuration file");
            }
            return null;
        }
        String key1 = (String) map.get(key);
        if (key1 == null) {
            if (!notThrowException) {
                throw new RuntimeException("Could not find: " + key + " in configuration file under [" + section + "]");
            }
            return null;
        } else if (key1.equals("IGNORE")) {
            if (!notThrowException) {
                throw new RuntimeException("Key: " + key + " under [" + section + "], is set to IGNORE but is required and has no default");
            }
            return null;
        } else {
            return key1;
        }
    }

    /* renamed from: a */
    public Boolean getStaticBooleanValue(String section, String key, Boolean r8) {
        String value = getStaticStringValue(section, key, (String) null);
        if (value == null) {
            return r8;
        }
        if (value.equalsIgnoreCase("true")) {
            return true;
        }
        if (value.equalsIgnoreCase("false")) {
            return false;
        }
        if (value.equalsIgnoreCase("1")) {
            return true;
        }
        if (value.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(key + ": unexpected boolean value:'" + value + "' in section:" + section);
    }

    /* renamed from: c */
    public void throwPropertyNotFoundException(String str, String str2) {
        throw new RuntimeException("Could not find " + str2 + " in configuration file in section:" + str);
    }

    /* renamed from: d */
    public boolean m621d(String str, String str2) {
        Boolean staticBooleanValue = getStaticBooleanValue(str, str2, (Boolean) null);
        if (staticBooleanValue == null) {
            throwPropertyNotFoundException(str, str2);
        }
        return staticBooleanValue.booleanValue();
    }

    /* renamed from: e */
    public String getStaticStringValueNoNull(String section, String key) {
        String staticStringValue = getStaticStringValue(section, key, (String) null);
        if (staticStringValue == null) {
            throwPropertyNotFoundException(section, key);
        }
        return staticStringValue;
    }

    /* renamed from: b */
    public String getStaticStringValue(String section, String key, String r9) {
        String value = getValue(section, key, true, "string");
        if (value == null) {
            return r9;
        }
        if (value.contains("%{") && value.contains("}")) {
            throw new RuntimeException("[" + section + "]" + key + ": Doesn't support dynamic %{} sections");
        }
        return value;
    }

    /* renamed from: c */
    public String m624c(String str, String str2, String str3) {
        String value = getValue(str, str2, true, "string");
        if (value == null) {
            return str3;
        }
        return value;
    }

    /* renamed from: f */
    public String m614f(String str, String str2) {
        String m624c = m624c(str, str2, (String) null);
        if (m624c == null) {
            throwPropertyNotFoundException(str, str2);
        }
        return m624c;
    }

    /* renamed from: b */
    public static String m633b(String str) {
        if (str == null) {
            return null;
        }
        return CommonUtils.m1706a(str, "\\n", "\n");
    }

    /* renamed from: a */
    public C0338ah m662a(CustomUnitMetadata customUnitMetadata, String str, String str2, String str3) {
        TextWrapper m639a = m639a(str, str2, str3, true);
        if (m639a == null) {
            return null;
        }
        try {
            return new C0338ah(customUnitMetadata, m639a);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new C0395bl("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public TextWrapper m639a(String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        if (z) {
            str4 = m624c(str, str2, (String) null);
        } else {
            str4 = getStaticStringValue(str, str2, (String) null);
        }
        if (str4 == null) {
            if (str3 == null) {
                return null;
            }
            str4 = str3;
        }
        String m633b = m633b(str4);
        TextWrapper textWrapper = new TextWrapper();
        if (m633b != null && m633b.startsWith("i:")) {
            textWrapper.f2246e = m633b.substring("i:".length());
            textWrapper.f2246e = textWrapper.f2246e.trim();
            LangLocale.getI18NText(textWrapper.f2246e, new Object[0]);
            return textWrapper;
        }
        ArrayList arrayList = new ArrayList();
        C0373az c0373az = new C0373az();
        c0373az.f2247a = null;
        c0373az.f2248b = m633b;
        arrayList.add(c0373az);
        String str6 = str2 + "_";
        Iterator it = getPropertiesStartingWith(str, str6).iterator();
        while (it.hasNext()) {
            String str7 = (String) it.next();
            String lowerCase = str7.substring(str6.length()).toLowerCase(Locale.ROOT);
            if (z) {
                str5 = m614f(str, str7);
            } else {
                str5 = getStaticStringValueNoNull(str, str7);
            }
            String m633b2 = m633b(str5);
            C0373az c0373az2 = new C0373az();
            c0373az2.f2247a = lowerCase;
            c0373az2.f2248b = m633b2;
            arrayList.add(c0373az2);
        }
        textWrapper.f2243b = (C0373az[]) arrayList.toArray(new C0373az[0]);
        textWrapper.m3488b();
        return textWrapper;
    }

    /* renamed from: a */
    public LogicBoolean m668a(CustomUnitMetadata customUnitMetadata, String str, String str2) {
        try {
            return LogicBoolean.create(customUnitMetadata, getStaticStringValueNoNull(str, str2), null);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public LogicBoolean getLogicBooleanValue(CustomUnitMetadata customUnitMetadata, String str, String str2, LogicBoolean logicBoolean) {
        try {
            return LogicBoolean.create(customUnitMetadata, getStaticStringValue(str, str2, (String) null), logicBoolean);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public LogicBoolean m634b(CustomUnitMetadata customUnitMetadata, String str, String str2, LogicBoolean logicBoolean) {
        return m664a(customUnitMetadata, str, str2, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: a */
    public LogicBoolean m664a(CustomUnitMetadata customUnitMetadata, String str, String str2, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        return m656a(getStaticStringValue(str, str2, (String) null), customUnitMetadata, str, str2, logicBoolean, returnType);
    }

    /* renamed from: a */
    public static LogicBoolean m657a(String str, CustomUnitMetadata customUnitMetadata, String str2, String str3, LogicBoolean logicBoolean) {
        return m656a(str, customUnitMetadata, str2, str3, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: a */
    public static LogicBoolean m656a(String str, CustomUnitMetadata customUnitMetadata, String str2, String str3, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        if (str == null) {
            return logicBoolean;
        }
        try {
            if (str.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
                str = str.substring("unitref ".length()).trim();
            }
            LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(customUnitMetadata, str, false);
            if (parseBooleanBlock == null) {
                return null;
            }
            LogicBoolean.ReturnType returnType2 = parseBooleanBlock.getReturnType();
            if (returnType2 != returnType) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Type mismatch. Expected type:" + returnType + " got:" + returnType2);
            }
            return parseBooleanBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public ValueListSource m648a(String str, String str2, ValueListSource valueListSource) {
        String staticStringValue = getStaticStringValue(str, str2, (String) null);
        if (staticStringValue == null) {
            return valueListSource;
        }
        if (staticStringValue.trim().equals(VariableScope.nullOrMissingString)) {
            return valueListSource;
        }
        if (staticStringValue.contains(",")) {
            throw new C0395bl("[" + str + "]" + str2 + ": Expected single tag, got:" + staticStringValue);
        }
        return ValueListSource.getValueListSource(staticStringValue);
    }

    /* renamed from: a */
    public ValueList m666a(CustomUnitMetadata customUnitMetadata, String str, String str2, ValueList valueList) {
        return ValueListSource.splitToValueList(getStaticStringValue(str, str2, (String) null), valueList);
    }

    /* renamed from: a */
    public C0444t m663a(CustomUnitMetadata customUnitMetadata, String str, String str2, C0444t c0444t) {
        String staticStringValue = getStaticStringValue(str, str2, (String) null);
        if (staticStringValue == null) {
            return c0444t;
        }
        return customUnitMetadata.m3099c(staticStringValue, str2, str);
    }

    /* renamed from: a */
    public C0411a m667a(CustomUnitMetadata customUnitMetadata, String str, String str2, C0411a c0411a, boolean z) {
        C0411a m3340a;
        String staticStringValue = getStaticStringValue(str, str2, (String) null);
        if (staticStringValue == null) {
            return c0411a;
        }
        if (z && (m3340a = C0411a.m3340a(staticStringValue)) != null) {
            return m3340a;
        }
        C0411a m3086i = customUnitMetadata.m3086i(staticStringValue);
        if (m3086i == null) {
            throw new BooleanParseException("[" + str + "]" + str2 + ": Could not find custom resource type of:" + staticStringValue);
        }
        return m3086i;
    }

    /* renamed from: a */
    public Integer m642a(String str, String str2, Integer num) {
        String staticStringValue = getStaticStringValue(str, str2, (String) null);
        if (staticStringValue == null) {
            return num;
        }
        if (staticStringValue.equals(VariableScope.nullOrMissingString)) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color: ''");
        }
        try {
            return Integer.valueOf(Color.m4731a(staticStringValue));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color:" + staticStringValue);
        }
    }

    /* renamed from: g */
    public int m611g(String str, String str2) {
        String value = getValue(str, str2, false, "int");
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + value);
        }
    }

    /* renamed from: a */
    public Short m641a(String str, String str2, Short sh) {
        String value = getValue(str, str2, true, "short");
        if (value == null) {
            return sh;
        }
        try {
            return Short.valueOf(Short.parseShort(value));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + value);
        }
    }

    /* renamed from: b */
    public Integer getStaticIntegerValue(String section, String key, Integer num) {
        String value = getValue(section, key, true, "int");
        if (value == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(value));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + section + "]" + key + ": Not a static integer: " + value);
        }
    }

    /* renamed from: a */
    public Float getStaticFloatValue(String section, String key, Float defaultF) {
        String str = getValue(section, key, true, "float");
        if (str == null) {
            return defaultF;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + section + "]" + key + ": Not a static float: " + str);
        }
    }

    /* renamed from: a */
    public PointF m650a(String str, String str2, PointF pointF) {
        String value = getValue(str, str2, true, "point");
        if (value == null) {
            return pointF;
        }
        if (value.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = value.split(",");
            if (split.length != 2) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2");
            }
            PointF pointF2 = new PointF();
            pointF2.x = Float.parseFloat(split[0]);
            pointF2.y = Float.parseFloat(split[1]);
            return pointF2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + value + " in key:" + str2 + " section:" + str + " expected format: x,y");
        }
    }

    /* renamed from: a */
    public C0918ai m647a(String str, String str2, C0918ai c0918ai) {
        String value = getValue(str, str2, true, "point3d");
        if (value == null) {
            return c0918ai;
        }
        if (value.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = value.split(",");
            if (split.length != 2 && split.length != 3) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2 or 3");
            }
            C0918ai c0918ai2 = new C0918ai();
            c0918ai2.f6260a = Float.parseFloat(split[0]);
            c0918ai2.f6261b = Float.parseFloat(split[1]);
            if (split.length > 2) {
                c0918ai2.f6262c = Float.parseFloat(split[2]);
            }
            return c0918ai2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + value + " in key:" + str2 + " section:" + str + " expected format: x,y,[height]");
        }
    }

    /* renamed from: h */
    public Float m609h(String str, String str2) {
        Float m631b = m631b(str, str2, (Float) null);
        if (m631b == null) {
            throw new RuntimeException("Could not find key:" + str2 + " in section:" + str);
        }
        return m631b;
    }

    /* renamed from: b */
    public Float m631b(String str, String str2, Float f) {
        return m643a(str, str2, f, false);
    }

    /* renamed from: c */
    public Float m625c(String str, String str2, Float f) {
        Float m643a = m643a(str, str2, (Float) null, false);
        if (m643a == null) {
            return f;
        }
        return Float.valueOf(m643a.floatValue() * 16.666666f);
    }

    /* renamed from: a */
    public Float m643a(String str, String str2, Float f, boolean z) {
        String value = getValue(str, str2, true, "time");
        if (value == null) {
            return f;
        }
        try {
            return Float.valueOf(m636a(value, z, str, str2));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read time:" + value + " in key:" + str2 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }

    /* renamed from: d */
    public Float m620d(String str, String str2, Float f) {
        return m643a(str, str2, f, true);
    }

    /* renamed from: a */
    public static float m636a(String str, boolean z, String str2, String str3) {
        float f;
        boolean z2 = false;
        if (str.endsWith("s")) {
            str = str.substring(0, str.length() - 1);
            f = 60.0f;
            z2 = true;
        } else {
            f = 1.0f;
        }
        try {
            float parseFloat = Float.parseFloat(str) * f;
            if (z) {
                if (z2) {
                    return 1.0f / parseFloat;
                }
                return parseFloat;
            }
            return parseFloat;
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": Failed to read time:" + str + " expected a float with optional 's' postfix");
        }
    }

    /* renamed from: i */
    public float m607i(String str, String str2) {
        String value = getValue(str, str2, false, "float");
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + value + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: j */
    public double m605j(String str, String str2) {
        String value = getValue(str, str2, false, "double");
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + value + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public double m652a(String str, String str2, double d) {
        String value = getValue(str, str2, true, "double");
        if (value == null) {
            return d;
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + value + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public long m651a(String str, String str2, long j) {
        String value = getValue(str, str2, true, "long");
        if (value == null) {
            return j;
        }
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read long:" + value + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: d */
    public void m619d(String str, String str2, String str3) {
        if (this.f6238k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6239j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f6239j.put(str, linkedHashMap);
        }
        if (linkedHashMap.get(str2) == null) {
            linkedHashMap.put(str2, str3);
        }
    }

    /* renamed from: e */
    public void m616e(String str, String str2, String str3) {
        if (this.f6238k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6239j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f6239j.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, str3);
    }

    /* renamed from: a */
    public void m661a(UnitConfig unitConfig) {
        if (this.f6238k) {
            throw new RuntimeException("locked changes");
        }
        for (String str : unitConfig.f6239j.keySet()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) unitConfig.f6239j.get(str);
            if (!getStaticBooleanValue(str, "@copyFrom_skipThisSection", (Boolean) false).booleanValue()) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f6239j.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f6239j.put(str, linkedHashMap2);
                }
                for (String str2 : linkedHashMap.keySet()) {
                    if (linkedHashMap2.get(str2) == null) {
                        linkedHashMap2.put(str2, linkedHashMap.get(str2));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Rect m649a(String str, String str2, Rect rect) {
        String staticStringValue = getStaticStringValue(str, str2, (String) null);
        if (staticStringValue == null) {
            return rect;
        }
        String[] split = staticStringValue.split(",");
        if (split.length != 4) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect: expected 4 ints, not:" + split.length);
        }
        try {
            return new Rect(Integer.valueOf(split[0].trim()).intValue(), Integer.valueOf(split[1].trim()).intValue(), Integer.valueOf(split[2].trim()).intValue(), Integer.valueOf(split[3].trim()).intValue());
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect expected ints got: " + staticStringValue);
        }
    }

    /* renamed from: a */
    public Enum getEnumValue(String section, String key, Enum enumValue, Class enumClass) {
        try {
            return m654a(getStaticStringValue(section, key, (String) null), enumValue, enumClass);
        } catch (C0395bl e) {
            throw new RuntimeException("[" + section + "]" + key + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static Enum m654a(String str, Enum r4, Class cls) {
        if (str == null) {
            return r4;
        }
        String trim = str.trim();
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (r0.name().equalsIgnoreCase(trim)) {
                return r0;
            }
        }
        throw m655a(trim, cls);
    }

    /* renamed from: a */
    private static RuntimeException m655a(String str, Class cls) {
        String str2 = VariableScope.nullOrMissingString;
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (!str2.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + ",";
            }
            str2 = str2 + r0.name();
        }
        throw new C0395bl("Unknown value: " + str + " (Expected: " + CommonUtils.m1678b(str2, 100) + ")");
    }

    /* renamed from: c */
    public ObjectVector getValueList2(String str) {
        ObjectVector objectVector = new ObjectVector();
        for (String str2 : this.f6239j.keySet()) {
            if (((Map) this.f6239j.get(str2)).get(str) != null) {
                objectVector.add(str2);
            }
        }
        return objectVector;
    }

    /* renamed from: d */
    public ObjectVector m622d(String str) {
        ObjectVector objectVector = new ObjectVector();
        for (String str2 : this.f6239j.keySet()) {
            Map map = (Map) this.f6239j.get(str2);
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (str3.startsWith(str) && !"IGNORE".equals(map.get(str3))) {
                        objectVector.add(str2);
                        break;
                    }
                }
            }
        }
        return objectVector;
    }

    /* renamed from: d */
    public LinkedHashMap m623d() {
        return this.f6239j;
    }

    /* renamed from: k */
    public ObjectVector getPropertiesStartingWith(String section, String startsWith) {
        ObjectVector objectVector = new ObjectVector();
        Map map = (Map) this.f6239j.get(section);
        if (map != null) {
            for (String mKey : map.keySet()) {
                if (mKey.startsWith(startsWith) && !"IGNORE".equals(map.get(mKey))) {
                    objectVector.add(mKey);
                }
            }
        }
        return objectVector;
    }

    /* renamed from: f */
    public ObjectVector m613f(String str, String str2, String str3) {
        ObjectVector objectVector = new ObjectVector();
        Map map = (Map) this.f6239j.get(str);
        if (map != null) {
            for (String str4 : map.keySet()) {
                if (str4.startsWith(str2) || str4.startsWith(str3)) {
                    objectVector.add(str4);
                }
            }
        }
        return objectVector;
    }

    /* renamed from: l */
    public boolean m602l(String str, String str2) {
        Map map = (Map) this.f6239j.get(str);
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (str3.startsWith(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    public ObjectVector m618e(String str) {
        ObjectVector objectVector = new ObjectVector();
        for (String str2 : this.f6239j.keySet()) {
            if (str2.startsWith(str) && m612g(str2)) {
                objectVector.add(str2);
            }
        }
        return objectVector;
    }

    /* renamed from: m */
    public ArrayList m601m(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f6239j.keySet()) {
            if (str3.startsWith(str) || str3.startsWith(str2)) {
                if (m612g(str3)) {
                    arrayList.add(str3);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public boolean m615f(String str) {
        if (this.f6239j.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m612g(String str) {
        Map map = (Map) this.f6239j.get(str);
        if (map == null) {
            return false;
        }
        for (String str2 : map.keySet()) {
            if (str2 != null && !str2.startsWith("@")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public boolean m600n(String str, String str2) {
        if (get(str, str2, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m610g(String str, String str2, String str3) {
        if (str3.equalsIgnoreCase("true")) {
            return true;
        }
        if (str3.equalsIgnoreCase("false")) {
            return false;
        }
        throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected boolean value:'" + str3 + "'");
    }

    /* renamed from: h */
    public static float m608h(String str, String str2, String str3) {
        try {
            return Float.parseFloat(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read float:" + str3);
        }
    }

    /* renamed from: i */
    public static int m606i(String str, String str2, String str3) {
        try {
            return Integer.parseInt(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read int:" + str3);
        }
    }

    /* renamed from: j */
    public static ValueListSource m604j(String str, String str2, String str3) {
        String trim = str3.trim();
        if (trim.contains(",")) {
            throw new C0395bl("[" + str + "]" + str2 + ": Unexpected single tag, got:'" + trim + "'");
        }
        if (trim.contains("\"")) {
            throw new C0395bl("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains("'")) {
            throw new C0395bl("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains(" ")) {
            throw new C0395bl("[" + str + "]" + str2 + ": tag cannot contain space, got:'" + trim + "'");
        }
        return ValueListSource.getValueListSource(trim);
    }
}