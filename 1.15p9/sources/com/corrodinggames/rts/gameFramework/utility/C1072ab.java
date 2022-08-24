package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.C0351ai;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0400ba;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0462t;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
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
public class C1072ab {

    /* renamed from: g */
    private static final Pattern f6816g = Pattern.compile("\\p{C}");

    /* renamed from: h */
    private static final Pattern f6817h = Pattern.compile("\\s*\\[([^]]*)\\]\\s*");

    /* renamed from: i */
    private static final Pattern f6818i = Pattern.compile("\\s*([^=:]*)(?:=|:)(.*)");

    /* renamed from: a */
    String f6819a;

    /* renamed from: k */
    private boolean f6820k;

    /* renamed from: f */
    public String f6821f;

    /* renamed from: j */
    private LinkedHashMap f6822j = new LinkedHashMap();

    /* renamed from: b */
    boolean f6823b = true;

    /* renamed from: c */
    LinkedHashSet f6824c = new LinkedHashSet();

    /* renamed from: d */
    public ArrayList f6825d = new ArrayList();

    /* renamed from: e */
    public ArrayList f6826e = new ArrayList();

    /* renamed from: a */
    public void m723a() {
        this.f6820k = true;
        this.f6823b = false;
    }

    /* renamed from: a */
    public void m707a(String str, String str2) {
        m694a(str, str2, "Unknown");
    }

    /* renamed from: a */
    public void m694a(String str, String str2, String str3) {
        if (this.f6823b) {
            this.f6824c.add(str + ":" + str2);
        }
    }

    /* renamed from: b */
    public void m687b() {
        if (!this.f6823b) {
            throw new RuntimeException("Not tracking reads");
        }
        for (String str : this.f6822j.keySet()) {
            if (str == null || !str.startsWith("template_")) {
                boolean z = false;
                String str2 = null;
                Map map = (Map) this.f6822j.get(str);
                for (String str3 : map.keySet()) {
                    if (str3 == null || (!str3.startsWith("@define ") && !str3.startsWith("@global "))) {
                        if (!this.f6824c.contains(str + ":" + str3)) {
                            if (!"IGNORE".equals((String) map.get(str3)) && str2 == null) {
                                if (str3 != null && str3.trim().equals(VariableScope.nullOrMissingString)) {
                                    str2 = this.f6819a + " Found line in [" + str + "] with no key name.";
                                } else {
                                    str2 = this.f6819a + ": The key '[" + str + "]" + str3 + "' was not used. (hint: make sure it's valid and in the right section)";
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                if (str2 != null) {
                    if (z || this.f6822j.size() == 1) {
                        throw new RuntimeException(str2);
                    }
                    throw new RuntimeException(this.f6819a + ": No keys in section: [" + str + "] were used (is this section named correctly?)");
                }
            }
        }
    }

    /* renamed from: c */
    public int m680c() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            for (String str : this.f6822j.keySet()) {
                Map map = (Map) this.f6822j.get(str);
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

    public C1072ab(String str) {
        this.f6819a = "ini";
        this.f6819a = str;
        this.f6821f = str;
        m712a(str);
    }

    public C1072ab(InputStream inputStream, String str) {
        this.f6819a = "ini";
        this.f6819a = str;
        m713a(inputStream);
    }

    /* renamed from: a */
    public void m712a(String str) {
        m714a(new BufferedReader(new FileReader(str)));
    }

    /* renamed from: a */
    public void m713a(InputStream inputStream) {
        m714a(new BufferedReader(new InputStreamReader(inputStream, "UTF-8")));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m714a(java.io.BufferedReader r7) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.utility.C1072ab.m714a(java.io.BufferedReader):void");
    }

    /* renamed from: a */
    private String m689a(String str, String str2, boolean z, String str3) {
        String m690a = m690a(str, str2, z);
        if (m690a != null) {
            m694a(str, str2, str3);
        }
        return m690a;
    }

    /* renamed from: b */
    public String m684b(String str, String str2) {
        Map map = (Map) this.f6822j.get(str);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    /* renamed from: a */
    private String m690a(String str, String str2, boolean z) {
        Map map = (Map) this.f6822j.get(str);
        if (map == null) {
            if (!z) {
                throw new RuntimeException("Could not find section: [" + str + "] in configuration file");
            }
            return null;
        }
        String str3 = (String) map.get(str2);
        if (str3 == null) {
            if (!z) {
                throw new RuntimeException("Could not find: " + str2 + " in configuration file under [" + str + "]");
            }
            return null;
        } else if (str3.equals("IGNORE")) {
            if (!z) {
                throw new RuntimeException("Key: " + str2 + " under [" + str + "], is set to IGNORE but is required and has no default");
            }
            return null;
        } else {
            return str3;
        }
    }

    /* renamed from: a */
    public String m692a(String str, String str2, String str3, String str4) {
        String m681b = m681b(str, str2, (String) null);
        String m681b2 = m681b(str, str3, (String) null);
        if (m681b == null || m681b2 == null) {
            return m681b != null ? m681b : m681b2 != null ? m681b2 : str4;
        }
        throw new RuntimeException("[" + str + "]Cannot set " + str2 + " and " + str3 + " at the same time");
    }

    /* renamed from: a */
    public Boolean m693a(String str, String str2, String str3, Boolean bool) {
        String m692a = m692a(str, str2, str3, (String) null);
        if (m692a == null) {
            return bool;
        }
        if (m692a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m692a.equalsIgnoreCase("false")) {
            return false;
        }
        if (m692a.equalsIgnoreCase("1")) {
            return true;
        }
        if (m692a.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + m692a + "' in section:" + str);
    }

    /* renamed from: a */
    public Boolean m700a(String str, String str2, Boolean bool) {
        String m681b = m681b(str, str2, (String) null);
        if (m681b == null) {
            return bool;
        }
        if (m681b.equalsIgnoreCase("true")) {
            return true;
        }
        if (m681b.equalsIgnoreCase("false")) {
            return false;
        }
        if (m681b.equalsIgnoreCase("1")) {
            return true;
        }
        if (m681b.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + m681b + "' in section:" + str);
    }

    /* renamed from: c */
    public void m677c(String str, String str2) {
        throw new RuntimeException("Could not find " + str2 + " in configuration file in section:" + str);
    }

    /* renamed from: d */
    public boolean m672d(String str, String str2) {
        Boolean m700a = m700a(str, str2, (Boolean) null);
        if (m700a == null) {
            m677c(str, str2);
        }
        return m700a.booleanValue();
    }

    /* renamed from: e */
    public String m668e(String str, String str2) {
        String m681b = m681b(str, str2, (String) null);
        if (m681b == null) {
            m677c(str, str2);
        }
        return m681b;
    }

    /* renamed from: b */
    public String m681b(String str, String str2, String str3) {
        String m689a = m689a(str, str2, true, "string");
        if (m689a == null) {
            return str3;
        }
        if (m689a.contains("%{") && m689a.contains("}")) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Doesn't support dynamic %{} sections");
        }
        return m689a;
    }

    /* renamed from: c */
    public String m675c(String str, String str2, String str3) {
        String m689a = m689a(str, str2, true, "string");
        if (m689a == null) {
            return str3;
        }
        return m689a;
    }

    /* renamed from: f */
    public String m665f(String str, String str2) {
        String m675c = m675c(str, str2, (String) null);
        if (m675c == null) {
            m677c(str, str2);
        }
        return m675c;
    }

    /* renamed from: b */
    public static String m685b(String str) {
        if (str == null) {
            return null;
        }
        return CommonUtils.m2329a(str, "\\n", "\n");
    }

    /* renamed from: a */
    public C0351ai m716a(C0453l c0453l, String str, String str2, String str3) {
        C0385az m691a = m691a(str, str2, str3, true);
        if (m691a == null) {
            return null;
        }
        try {
            return new C0351ai(c0453l, m691a);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public C0385az m691a(String str, String str2, String str3, boolean z) {
        String m681b;
        String m668e;
        if (z) {
            m681b = m675c(str, str2, (String) null);
        } else {
            m681b = m681b(str, str2, (String) null);
        }
        if (m681b == null) {
            if (str3 == null) {
                return null;
            }
            m681b = str3;
        }
        String m685b = m685b(m681b);
        C0385az c0385az = new C0385az();
        if (m685b != null && m685b.startsWith("i:")) {
            c0385az.f2321e = m685b.substring("i:".length());
            c0385az.f2321e = c0385az.f2321e.trim();
            C0820a.m1886a(c0385az.f2321e, new Object[0]);
            return c0385az;
        }
        ArrayList arrayList = new ArrayList();
        C0400ba c0400ba = new C0400ba();
        c0400ba.f2485a = null;
        c0400ba.f2486b = m685b;
        arrayList.add(c0400ba);
        String str4 = str2 + "_";
        Iterator it = m654k(str, str4).iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            String lowerCase = str5.substring(str4.length()).toLowerCase(Locale.ROOT);
            if (z) {
                m668e = m665f(str, str5);
            } else {
                m668e = m668e(str, str5);
            }
            String m685b2 = m685b(m668e);
            C0400ba c0400ba2 = new C0400ba();
            c0400ba2.f2485a = lowerCase;
            c0400ba2.f2486b = m685b2;
            arrayList.add(c0400ba2);
        }
        c0385az.f2318b = (C0400ba[]) arrayList.toArray(new C0400ba[0]);
        c0385az.m5339b();
        return c0385az;
    }

    /* renamed from: a */
    public LogicBoolean m722a(C0453l c0453l, String str, String str2) {
        try {
            return LogicBoolean.create(c0453l, m668e(str, str2), null);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public LogicBoolean m719a(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean) {
        try {
            return LogicBoolean.create(c0453l, m681b(str, str2, (String) null), logicBoolean);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public LogicBoolean m686b(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean) {
        return m718a(c0453l, str, str2, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: c */
    public LogicBoolean m679c(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean) {
        return m718a(c0453l, str, str2, logicBoolean, LogicBoolean.ReturnType.number);
    }

    /* renamed from: a */
    public LogicBoolean m718a(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        return m710a(m681b(str, str2, (String) null), c0453l, str, str2, logicBoolean, returnType);
    }

    /* renamed from: a */
    public static LogicBoolean m711a(String str, C0453l c0453l, String str2, String str3, LogicBoolean logicBoolean) {
        return m710a(str, c0453l, str2, str3, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: a */
    public static LogicBoolean m710a(String str, C0453l c0453l, String str2, String str3, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        if (str == null) {
            return logicBoolean;
        }
        try {
            if (returnType == LogicBoolean.ReturnType.number && CommonUtils.m2234u(str)) {
                return LogicBoolean.StaticValueBoolean.getStaticNumber(str);
            }
            if (str.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
                str = str.substring("unitref ".length()).trim();
            }
            LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(c0453l, str, false);
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
    public C0448g m702a(String str, String str2, C0448g c0448g) {
        String m681b = m681b(str, str2, (String) null);
        if (m681b == null) {
            return c0448g;
        }
        if (m681b.trim().equals(VariableScope.nullOrMissingString)) {
            return c0448g;
        }
        if (m681b.contains(",")) {
            throw new C0412bm("[" + str + "]" + str2 + ": Expected single tag, got:" + m681b);
        }
        return C0448g.m5054c(m681b);
    }

    /* renamed from: a */
    public C0449h m720a(C0453l c0453l, String str, String str2, C0449h c0449h) {
        return C0448g.m5057a(m681b(str, str2, (String) null), c0449h);
    }

    /* renamed from: a */
    public C0462t m717a(C0453l c0453l, String str, String str2, C0462t c0462t) {
        String m681b = m681b(str, str2, (String) null);
        if (m681b == null) {
            return c0462t;
        }
        return c0453l.m4736c(m681b, str2, str);
    }

    /* renamed from: a */
    public C0428a m721a(C0453l c0453l, String str, String str2, C0428a c0428a, boolean z) {
        C0428a m5155a;
        String m681b = m681b(str, str2, (String) null);
        if (m681b == null) {
            return c0428a;
        }
        if (z && (m5155a = C0428a.m5155a(m681b)) != null) {
            return m5155a;
        }
        C0428a m4719k = c0453l.m4719k(m681b);
        if (m4719k == null) {
            throw new BooleanParseException("[" + str + "]" + str2 + ": Could not find custom resource type of:" + m681b);
        }
        return m4719k;
    }

    /* renamed from: a */
    public Integer m696a(String str, String str2, Integer num) {
        String m681b = m681b(str, str2, (String) null);
        if (m681b == null) {
            return num;
        }
        if (m681b.equals(VariableScope.nullOrMissingString)) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color: ''");
        }
        try {
            return Integer.valueOf(Color.m7281a(m681b));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color:" + m681b);
        }
    }

    /* renamed from: g */
    public int m662g(String str, String str2) {
        String m689a = m689a(str, str2, false, "int");
        try {
            return Integer.parseInt(m689a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m689a);
        }
    }

    /* renamed from: a */
    public Short m695a(String str, String str2, Short sh) {
        String m689a = m689a(str, str2, true, "short");
        if (m689a == null) {
            return sh;
        }
        try {
            return Short.valueOf(Short.parseShort(m689a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m689a);
        }
    }

    /* renamed from: b */
    public Integer m682b(String str, String str2, Integer num) {
        String m689a = m689a(str, str2, true, "int");
        if (m689a == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m689a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m689a);
        }
    }

    /* renamed from: a */
    public Float m698a(String str, String str2, Float f) {
        String m689a = m689a(str, str2, true, "float");
        if (m689a == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(m689a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static float: " + m689a);
        }
    }

    /* renamed from: a */
    public PointF m704a(String str, String str2, PointF pointF) {
        String m689a = m689a(str, str2, true, "point");
        if (m689a == null) {
            return pointF;
        }
        if (m689a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = m689a.split(",");
            if (split.length != 2) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2");
            }
            PointF pointF2 = new PointF();
            pointF2.x = Float.parseFloat(split[0]);
            pointF2.y = Float.parseFloat(split[1]);
            return pointF2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + m689a + " in key:" + str2 + " section:" + str + " expected format: x,y");
        }
    }

    /* renamed from: a */
    public C1080ai m701a(String str, String str2, C1080ai c1080ai) {
        String m689a = m689a(str, str2, true, "point3d");
        if (m689a == null) {
            return c1080ai;
        }
        if (m689a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = m689a.split(",");
            if (split.length != 2 && split.length != 3) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2 or 3");
            }
            C1080ai c1080ai2 = new C1080ai();
            c1080ai2.f6843a = Float.parseFloat(split[0]);
            c1080ai2.f6844b = Float.parseFloat(split[1]);
            if (split.length > 2) {
                c1080ai2.f6845c = Float.parseFloat(split[2]);
            }
            return c1080ai2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + m689a + " in key:" + str2 + " section:" + str + " expected format: x,y,[height]");
        }
    }

    /* renamed from: h */
    public Float m660h(String str, String str2) {
        Float m683b = m683b(str, str2, (Float) null);
        if (m683b == null) {
            throw new RuntimeException("Could not find key:" + str2 + " in section:" + str);
        }
        return m683b;
    }

    /* renamed from: b */
    public Float m683b(String str, String str2, Float f) {
        return m697a(str, str2, f, false);
    }

    /* renamed from: c */
    public Float m676c(String str, String str2, Float f) {
        Float m697a = m697a(str, str2, (Float) null, false);
        if (m697a == null) {
            return f;
        }
        return Float.valueOf(m697a.floatValue() * 16.666666f);
    }

    /* renamed from: a */
    public Float m697a(String str, String str2, Float f, boolean z) {
        String m689a = m689a(str, str2, true, "time");
        if (m689a == null) {
            return f;
        }
        try {
            return Float.valueOf(m688a(m689a, z, str, str2));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read time:" + m689a + " in key:" + str2 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }

    /* renamed from: d */
    public Float m671d(String str, String str2, Float f) {
        return m697a(str, str2, f, true);
    }

    /* renamed from: a */
    public static float m688a(String str, boolean z, String str2, String str3) {
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
    public float m658i(String str, String str2) {
        String m689a = m689a(str, str2, false, "float");
        try {
            return Float.parseFloat(m689a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m689a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: j */
    public double m656j(String str, String str2) {
        String m689a = m689a(str, str2, false, "double");
        try {
            return Double.parseDouble(m689a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m689a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public double m706a(String str, String str2, double d) {
        String m689a = m689a(str, str2, true, "double");
        if (m689a == null) {
            return d;
        }
        try {
            return Double.parseDouble(m689a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m689a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public long m705a(String str, String str2, long j) {
        String m689a = m689a(str, str2, true, "long");
        if (m689a == null) {
            return j;
        }
        try {
            return Long.parseLong(m689a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read long:" + m689a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: d */
    public void m670d(String str, String str2, String str3) {
        if (this.f6820k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6822j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f6822j.put(str, linkedHashMap);
        }
        if (linkedHashMap.get(str2) == null) {
            linkedHashMap.put(str2, str3);
        }
    }

    /* renamed from: e */
    public void m667e(String str, String str2, String str3) {
        if (this.f6820k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6822j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f6822j.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, str3);
    }

    /* renamed from: a */
    public void m715a(C1072ab c1072ab) {
        if (this.f6820k) {
            throw new RuntimeException("locked changes");
        }
        for (String str : c1072ab.f6822j.keySet()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) c1072ab.f6822j.get(str);
            if (!m700a(str, "@copyFrom_skipThisSection", (Boolean) false).booleanValue()) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f6822j.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f6822j.put(str, linkedHashMap2);
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
    public Rect m703a(String str, String str2, Rect rect) {
        String m681b = m681b(str, str2, (String) null);
        if (m681b == null) {
            return rect;
        }
        String[] split = m681b.split(",");
        if (split.length != 4) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect: expected 4 ints, not:" + split.length);
        }
        try {
            return new Rect(Integer.valueOf(split[0].trim()).intValue(), Integer.valueOf(split[1].trim()).intValue(), Integer.valueOf(split[2].trim()).intValue(), Integer.valueOf(split[3].trim()).intValue());
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect expected ints got: " + m681b);
        }
    }

    /* renamed from: a */
    public Enum m699a(String str, String str2, Enum r8, Class cls) {
        try {
            return m708a(m681b(str, str2, (String) null), r8, cls);
        } catch (C0412bm e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static Enum m708a(String str, Enum r4, Class cls) {
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
        throw m709a(trim, cls);
    }

    /* renamed from: a */
    private static RuntimeException m709a(String str, Class cls) {
        String str2 = VariableScope.nullOrMissingString;
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (!str2.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + ",";
            }
            str2 = str2 + r0.name();
        }
        throw new C0412bm("Unknown value: " + str + " (Expected: " + CommonUtils.m2301b(str2, 100) + ")");
    }

    /* renamed from: c */
    public C1101m m678c(String str) {
        C1101m c1101m = new C1101m();
        for (String str2 : this.f6822j.keySet()) {
            if (((Map) this.f6822j.get(str2)).get(str) != null) {
                c1101m.add(str2);
            }
        }
        return c1101m;
    }

    /* renamed from: d */
    public C1101m m673d(String str) {
        C1101m c1101m = new C1101m();
        for (String str2 : this.f6822j.keySet()) {
            Map map = (Map) this.f6822j.get(str2);
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (str3.startsWith(str) && !"IGNORE".equals(map.get(str3))) {
                        c1101m.add(str2);
                        break;
                    }
                }
            }
        }
        return c1101m;
    }

    /* renamed from: d */
    public LinkedHashMap m674d() {
        return this.f6822j;
    }

    /* renamed from: k */
    public C1101m m654k(String str, String str2) {
        C1101m c1101m = new C1101m();
        Map map = (Map) this.f6822j.get(str);
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (str3.startsWith(str2) && !"IGNORE".equals(map.get(str3))) {
                    c1101m.add(str3);
                }
            }
        }
        return c1101m;
    }

    /* renamed from: f */
    public C1101m m664f(String str, String str2, String str3) {
        C1101m c1101m = new C1101m();
        Map map = (Map) this.f6822j.get(str);
        if (map != null) {
            for (String str4 : map.keySet()) {
                if (str4.startsWith(str2) || str4.startsWith(str3)) {
                    c1101m.add(str4);
                }
            }
        }
        return c1101m;
    }

    /* renamed from: l */
    public boolean m653l(String str, String str2) {
        Map map = (Map) this.f6822j.get(str);
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
    public C1101m m669e(String str) {
        C1101m c1101m = new C1101m();
        for (String str2 : this.f6822j.keySet()) {
            if (str2.startsWith(str) && m663g(str2)) {
                c1101m.add(str2);
            }
        }
        return c1101m;
    }

    /* renamed from: m */
    public C1101m m652m(String str, String str2) {
        C1101m c1101m = new C1101m();
        for (String str3 : this.f6822j.keySet()) {
            if (str3.startsWith(str) || str3.startsWith(str2)) {
                if (m663g(str3)) {
                    c1101m.add(str3);
                }
            }
        }
        return c1101m;
    }

    /* renamed from: f */
    public boolean m666f(String str) {
        if (this.f6822j.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m663g(String str) {
        Map map = (Map) this.f6822j.get(str);
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
    public boolean m651n(String str, String str2) {
        if (m690a(str, str2, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m661g(String str, String str2, String str3) {
        if (str3.equalsIgnoreCase("true")) {
            return true;
        }
        if (str3.equalsIgnoreCase("false")) {
            return false;
        }
        throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected boolean value:'" + str3 + "'");
    }

    /* renamed from: h */
    public static float m659h(String str, String str2, String str3) {
        try {
            return Float.parseFloat(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read float:" + str3);
        }
    }

    /* renamed from: i */
    public static int m657i(String str, String str2, String str3) {
        try {
            return Integer.parseInt(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read int:" + str3);
        }
    }

    /* renamed from: j */
    public static C0448g m655j(String str, String str2, String str3) {
        String trim = str3.trim();
        if (trim.contains(",")) {
            throw new C0412bm("[" + str + "]" + str2 + ": Unexpected single tag, got:'" + trim + "'");
        }
        if (trim.contains("\"")) {
            throw new C0412bm("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains("'")) {
            throw new C0412bm("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains(" ")) {
            throw new C0412bm("[" + str + "]" + str2 + ": tag cannot contain space, got:'" + trim + "'");
        }
        return C0448g.m5054c(trim);
    }
}
