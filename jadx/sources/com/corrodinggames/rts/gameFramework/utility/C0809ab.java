package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.custom.C0312ah;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.C0376s;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ab.class */
public class C0809ab {

    /* renamed from: f */
    private static final Pattern f5716f = Pattern.compile("\\p{C}");

    /* renamed from: g */
    private static final Pattern f5717g = Pattern.compile("\\s*\\[([^]]*)\\]\\s*");

    /* renamed from: h */
    private static final Pattern f5718h = Pattern.compile("\\s*([^=:]*)(?:=|:)(.*)");

    /* renamed from: a */
    String f5720a;

    /* renamed from: i */
    private LinkedHashMap f5719i = new LinkedHashMap();

    /* renamed from: b */
    boolean f5721b = true;

    /* renamed from: c */
    LinkedHashSet f5722c = new LinkedHashSet();

    /* renamed from: d */
    public ArrayList f5723d = new ArrayList();

    /* renamed from: e */
    public ArrayList f5724e = new ArrayList();

    /* renamed from: a */
    public void m601a(String str, String str2) {
        m588a(str, str2, "Unknown");
    }

    /* renamed from: a */
    public void m588a(String str, String str2, String str3) {
        if (this.f5721b) {
            this.f5722c.add(str + ":" + str2);
        }
    }

    /* renamed from: a */
    public void m612a() {
        if (!this.f5721b) {
            throw new RuntimeException("Not tracking reads");
        }
        for (String str : this.f5719i.keySet()) {
            if (str == null || !str.startsWith("template_")) {
                boolean z = false;
                String str2 = null;
                Map map = (Map) this.f5719i.get(str);
                for (String str3 : map.keySet()) {
                    if (str3 == null || (!str3.startsWith("@define ") && !str3.startsWith("@global "))) {
                        if (this.f5722c.contains(str + ":" + str3)) {
                            z = true;
                        } else if (!"IGNORE".equals((String) map.get(str3)) && str2 == null) {
                            str2 = this.f5720a + ": The key '[" + str + "]" + str3 + "' was not used. (hint: make sure it's valid and in the right section)";
                        }
                    }
                }
                if (str2 != null) {
                    if (z || this.f5719i.size() == 1) {
                        throw new RuntimeException(str2);
                    }
                    throw new RuntimeException(this.f5720a + ": No keys in section: [" + str + "] were used (is this section named correctly?)");
                }
            }
        }
    }

    /* renamed from: b */
    public int m584b() {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            for (String str : this.f5719i.keySet()) {
                Map map = (Map) this.f5719i.get(str);
                for (String str2 : map.keySet()) {
                    instance.update((str + ":" + str2 + ":" + ((String) map.get(str2))).getBytes("UTF-8"));
                }
            }
            return new BigInteger(1, instance.digest()).intValue();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public C0809ab(String str) {
        this.f5720a = "ini";
        this.f5720a = str;
        m603a(str);
    }

    public C0809ab(InputStream inputStream, String str) {
        this.f5720a = "ini";
        this.f5720a = str;
        m604a(inputStream);
    }

    /* renamed from: a */
    public void m603a(String str) {
        m605a(new BufferedReader(new FileReader(str)));
    }

    /* renamed from: a */
    public void m604a(InputStream inputStream) {
        m605a(new BufferedReader(new InputStreamReader(inputStream, "UTF-8")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0194, code lost:
        throw new java.io.IOException(r6.f5720a + ": Unexpected format on line:" + r8 + ": '" + r9.replaceAll("\\p{C}", "?") + "' in ini file (hint: This line might have hidden unicode)");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m605a(BufferedReader bufferedReader) {
        int i = 0;
        String str = null;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                String str2 = readLine;
                if (readLine != null) {
                    i++;
                    if (str2.startsWith("\ufeff")) {
                        str2 = str2.substring(1);
                    }
                    if (!str2.trim().startsWith("#") && str2.trim().length() != 0) {
                        if (C0654f.m1450c(str2, "[")) {
                            Matcher matcher = f5717g.matcher(str2);
                            if (matcher.matches()) {
                                str = matcher.group(1).trim();
                            }
                        }
                        if (str == null || !str.startsWith("comment_")) {
                            Matcher matcher2 = f5718h.matcher(str2);
                            if (matcher2.matches()) {
                                if (str == null) {
                                    AbstractC0789l.m682b("IniFile: " + this.f5720a + "  line is not in a [section]:'" + str2 + "'");
                                    this.f5724e.add("This line is not in a [section]: '" + str2 + "'");
                                } else {
                                    String trim = matcher2.group(1).trim();
                                    String trim2 = matcher2.group(2).trim();
                                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5719i.get(str);
                                    if (linkedHashMap == null) {
                                        LinkedHashMap linkedHashMap2 = this.f5719i;
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        linkedHashMap = linkedHashMap3;
                                        linkedHashMap2.put(str, linkedHashMap3);
                                    }
                                    if (linkedHashMap.get(trim) != null) {
                                        this.f5723d.add(new C0810ac(str, trim));
                                    }
                                    linkedHashMap.put(trim, trim2);
                                }
                            } else if (f5716f.matcher(str2).find()) {
                                if (str2.length() != 1) {
                                    break;
                                }
                            } else {
                                AbstractC0789l.m682b(this.f5720a + ": Unexpected format on line:" + i + ": '" + str2 + "' in ini file");
                                this.f5724e.add(str2);
                            }
                        }
                    }
                } else {
                    return;
                }
            } finally {
                bufferedReader.close();
            }
        }
    }

    /* renamed from: a */
    private String m586a(String str, String str2, boolean z, String str3) {
        String a = m587a(str, str2, z);
        if (a != null) {
            m588a(str, str2, str3);
        }
        return a;
    }

    /* renamed from: b */
    public String m582b(String str, String str2) {
        Map map = (Map) this.f5719i.get(str);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    /* renamed from: a */
    private String m587a(String str, String str2, boolean z) {
        Map map = (Map) this.f5719i.get(str);
        if (map != null) {
            String str3 = (String) map.get(str2);
            if (str3 == null) {
                if (z) {
                    return null;
                }
                throw new RuntimeException("Could not find: " + str2 + " in configuration file under [" + str + "]");
            } else if (!str3.equals("IGNORE")) {
                return str3;
            } else {
                if (z) {
                    return null;
                }
                throw new RuntimeException("Key: " + str2 + " under [" + str + "], is set to IGNORE but is required and has no default");
            }
        } else if (z) {
            return null;
        } else {
            throw new RuntimeException("Could not find section: [" + str + "] in configuration file");
        }
    }

    /* renamed from: a */
    public Boolean m594a(String str, String str2, Boolean bool) {
        String b = m579b(str, str2, (String) null);
        if (b == null) {
            return bool;
        }
        if (b.equalsIgnoreCase("true")) {
            return true;
        }
        if (b.equalsIgnoreCase("false")) {
            return false;
        }
        if (b.equalsIgnoreCase("1")) {
            return true;
        }
        if (b.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + b + "' in section:" + str);
    }

    /* renamed from: c */
    public void m576c(String str, String str2) {
        throw new RuntimeException("Could not find " + str2 + " in configuration file in section:" + str);
    }

    /* renamed from: d */
    public boolean m572d(String str, String str2) {
        Boolean a = m594a(str, str2, (Boolean) null);
        if (a == null) {
            m576c(str, str2);
        }
        return a.booleanValue();
    }

    /* renamed from: e */
    public String m568e(String str, String str2) {
        String b = m579b(str, str2, (String) null);
        if (b == null) {
            m576c(str, str2);
        }
        return b;
    }

    /* renamed from: b */
    public String m579b(String str, String str2, String str3) {
        String a = m586a(str, str2, true, "string");
        if (a == null) {
            return str3;
        }
        return a;
    }

    /* renamed from: b */
    public static String m583b(String str) {
        if (str == null) {
            return null;
        }
        return C0654f.m1485a(str, "\\n", "\n");
    }

    /* renamed from: c */
    public C0311ag m574c(String str, String str2, String str3) {
        String b = m579b(str, str2, (String) null);
        if (b == null) {
            if (str3 == null) {
                return null;
            }
            b = str3;
        }
        String b2 = m583b(b);
        C0311ag agVar = new C0311ag();
        if (b2 == null || !b2.startsWith("i:")) {
            ArrayList arrayList = new ArrayList();
            C0312ah ahVar = new C0312ah();
            ahVar.f2056a = null;
            ahVar.f2057b = b2;
            arrayList.add(ahVar);
            String str4 = str2 + "_";
            Iterator it = m556j(str, str4).iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                String lowerCase = str5.substring(str4.length()).toLowerCase(Locale.ROOT);
                String b3 = m583b(m568e(str, str5));
                C0312ah ahVar2 = new C0312ah();
                ahVar2.f2056a = lowerCase;
                ahVar2.f2057b = b3;
                arrayList.add(ahVar2);
            }
            agVar.f2052b = (C0312ah[]) arrayList.toArray(new C0312ah[0]);
            agVar.m3100b();
            return agVar;
        }
        agVar.f2055e = b2.substring("i:".length());
        agVar.f2055e = agVar.f2055e.trim();
        C0652a.m1536a(agVar.f2055e, new Object[0]);
        return agVar;
    }

    /* renamed from: a */
    public LogicBoolean m611a(C0368l lVar, String str, String str2) {
        try {
            return LogicBoolean.create(lVar, m568e(str, str2), null);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public LogicBoolean m608a(C0368l lVar, String str, String str2, LogicBoolean logicBoolean) {
        try {
            return LogicBoolean.create(lVar, m579b(str, str2, (String) null), logicBoolean);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public C0364h m596a(String str, String str2, C0364h hVar) {
        String b = m579b(str, str2, (String) null);
        if (b == null) {
            return hVar;
        }
        if (b.trim().equals("")) {
            return hVar;
        }
        if (!b.contains(",")) {
            return C0364h.m2897c(b);
        }
        throw new C0324at("[" + str + "]" + str2 + ": Expected single tag, got:" + b);
    }

    /* renamed from: a */
    public C0365i m609a(C0368l lVar, String str, String str2, C0365i iVar) {
        return C0364h.m2900a(m579b(str, str2, (String) null), iVar);
    }

    /* renamed from: a */
    public C0376s m607a(C0368l lVar, String str, String str2, C0376s sVar) {
        String b = m579b(str, str2, (String) null);
        if (b == null) {
            return sVar;
        }
        return lVar.m2766c(b, str2, str);
    }

    /* renamed from: a */
    public C0345a m610a(C0368l lVar, String str, String str2, C0345a aVar, boolean z) {
        C0345a a;
        String b = m579b(str, str2, (String) null);
        if (b == null) {
            return aVar;
        }
        if (z && (a = C0345a.m3017a(b)) != null) {
            return a;
        }
        C0345a i = lVar.m2753i(b);
        if (i != null) {
            return i;
        }
        throw new BooleanParseException("[" + str + "]" + str2 + ": Could not find custom resource type of:" + b);
    }

    /* renamed from: a */
    public Integer m590a(String str, String str2, Integer num) {
        String b = m579b(str, str2, (String) null);
        if (b == null) {
            return num;
        }
        try {
            return Integer.valueOf(Color.m4212a(b));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color:" + b);
        }
    }

    /* renamed from: f */
    public int m565f(String str, String str2) {
        String a = m586a(str, str2, false, "int");
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read int:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public Short m589a(String str, String str2, Short sh) {
        String a = m586a(str, str2, true, "short");
        if (a == null) {
            return sh;
        }
        try {
            return Short.valueOf(Short.parseShort(a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("getShort: " + a + " is not a number, key:" + str2);
        }
    }

    /* renamed from: b */
    public Integer m580b(String str, String str2, Integer num) {
        String a = m586a(str, str2, true, "int");
        if (a == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("getInt: " + a + " is not a number, key:" + str2);
        }
    }

    /* renamed from: a */
    public Float m592a(String str, String str2, Float f) {
        String a = m586a(str, str2, true, "float");
        if (a == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public PointF m598a(String str, String str2, PointF pointF) {
        String a = m586a(str, str2, true, "point");
        if (a == null) {
            return pointF;
        }
        if (a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = a.split(",");
            if (split.length != 2) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2");
            }
            PointF pointF2 = new PointF();
            pointF2.f224a = Float.parseFloat(split[0]);
            pointF2.f225b = Float.parseFloat(split[1]);
            return pointF2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + a + " in key:" + str2 + " section:" + str + " expected format: x,y");
        }
    }

    /* renamed from: a */
    public C0814ag m595a(String str, String str2, C0814ag agVar) {
        String a = m586a(str, str2, true, "point3d");
        if (a == null) {
            return agVar;
        }
        if (a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = a.split(",");
            if (split.length == 2 || split.length == 3) {
                C0814ag agVar2 = new C0814ag();
                agVar2.f5735a = Float.parseFloat(split[0]);
                agVar2.f5736b = Float.parseFloat(split[1]);
                if (split.length > 2) {
                    agVar2.f5737c = Float.parseFloat(split[2]);
                }
                return agVar2;
            }
            throw new NumberFormatException("Got:" + split.length + " elements expected 2 or 3");
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + a + " in key:" + str2 + " section:" + str + " expected format: x,y,[height]");
        }
    }

    /* renamed from: g */
    public Float m562g(String str, String str2) {
        Float b = m581b(str, str2, (Float) null);
        if (b != null) {
            return b;
        }
        throw new RuntimeException("Could not find key:" + str2 + " in section:" + str);
    }

    /* renamed from: b */
    public Float m581b(String str, String str2, Float f) {
        return m591a(str, str2, f, false);
    }

    /* renamed from: c */
    public Float m575c(String str, String str2, Float f) {
        Float a = m591a(str, str2, (Float) null, false);
        if (a == null) {
            return f;
        }
        return Float.valueOf(a.floatValue() * 16.666666f);
    }

    /* renamed from: a */
    public Float m591a(String str, String str2, Float f, boolean z) {
        String a = m586a(str, str2, true, "time");
        if (a == null) {
            return f;
        }
        try {
            return Float.valueOf(m585a(a, z, str, str2));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read time:" + a + " in key:" + str2 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }

    /* renamed from: d */
    public Float m571d(String str, String str2, Float f) {
        return m591a(str, str2, f, true);
    }

    /* renamed from: a */
    public static float m585a(String str, boolean z, String str2, String str3) {
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
            if (!z) {
                return parseFloat;
            }
            if (z2) {
                return 1.0f / parseFloat;
            }
            return parseFloat;
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": Failed to read time:" + str + " expected a float with optional 's' postfix");
        }
    }

    /* renamed from: h */
    public float m560h(String str, String str2) {
        String a = m586a(str, str2, false, "float");
        try {
            return Float.parseFloat(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: i */
    public double m558i(String str, String str2) {
        String a = m586a(str, str2, false, "double");
        try {
            return Double.parseDouble(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public double m600a(String str, String str2, double d) {
        String a = m586a(str, str2, true, "double");
        if (a == null) {
            return d;
        }
        try {
            return Double.parseDouble(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public long m599a(String str, String str2, long j) {
        String a = m586a(str, str2, false, "long");
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read long:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: d */
    public void m570d(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5719i.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f5719i.put(str, linkedHashMap);
        }
        if (linkedHashMap.get(str2) == null) {
            linkedHashMap.put(str2, str3);
        }
    }

    /* renamed from: e */
    public void m567e(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5719i.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f5719i.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, str3);
    }

    /* renamed from: a */
    public void m606a(C0809ab abVar) {
        for (String str : abVar.f5719i.keySet()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) abVar.f5719i.get(str);
            if (!m594a(str, "@copyFrom_skipThisSection", (Boolean) false).booleanValue()) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f5719i.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f5719i.put(str, linkedHashMap2);
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
    public Rect m597a(String str, String str2, Rect rect) {
        String b = m579b(str, str2, (String) null);
        if (b == null) {
            return rect;
        }
        String[] split = b.split(",");
        if (split.length != 4) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect: expected 4 ints, not:" + split.length);
        }
        try {
            return new Rect(Integer.valueOf(split[0].trim()).intValue(), Integer.valueOf(split[1].trim()).intValue(), Integer.valueOf(split[2].trim()).intValue(), Integer.valueOf(split[3].trim()).intValue());
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect expected ints got: " + b);
        }
    }

    /* renamed from: a */
    public Enum m593a(String str, String str2, Enum r9, Class cls) {
        String b = m579b(str, str2, (String) null);
        if (b == null) {
            return r9;
        }
        String trim = b.trim();
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (r0.name().equalsIgnoreCase(trim)) {
                return r0;
            }
        }
        String str3 = "";
        for (Object obj2 : cls.getEnumConstants()) {
            Enum r02 = (Enum) obj2;
            if (!str3.equals("")) {
                str3 = str3 + ",";
            }
            str3 = str3 + r02.name();
        }
        throw new RuntimeException("[" + str + "]" + str2 + ": Unknown enum value: " + trim + " (Expected: " + C0654f.m1463b(str3, 100) + ")");
    }

    /* renamed from: a */
    public static Enum m602a(String str, Enum r7, Class cls) {
        if (str == null) {
            return r7;
        }
        String trim = str.trim();
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (r0.name().equalsIgnoreCase(trim)) {
                return r0;
            }
        }
        String str2 = "";
        for (Object obj2 : cls.getEnumConstants()) {
            Enum r02 = (Enum) obj2;
            if (!str2.equals("")) {
                str2 = str2 + ",";
            }
            str2 = str2 + r02.name();
        }
        throw new RuntimeException("Unknown enum value: " + trim + " (Expected: " + C0654f.m1463b(str2, 100) + ")");
    }

    /* renamed from: c */
    public C0835m m577c(String str) {
        C0835m mVar = new C0835m();
        for (String str2 : this.f5719i.keySet()) {
            if (((Map) this.f5719i.get(str2)).get(str) != null) {
                mVar.add(str2);
            }
        }
        return mVar;
    }

    /* renamed from: d */
    public C0835m m573d(String str) {
        C0835m mVar = new C0835m();
        for (String str2 : this.f5719i.keySet()) {
            Map map = (Map) this.f5719i.get(str2);
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (str3.startsWith(str) && !"IGNORE".equals(map.get(str3))) {
                        mVar.add(str2);
                        break;
                    }
                }
            }
        }
        return mVar;
    }

    /* renamed from: c */
    public LinkedHashMap m578c() {
        return this.f5719i;
    }

    /* renamed from: j */
    public C0835m m556j(String str, String str2) {
        C0835m mVar = new C0835m();
        Map map = (Map) this.f5719i.get(str);
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (str3.startsWith(str2) && !"IGNORE".equals(map.get(str3))) {
                    mVar.add(str3);
                }
            }
        }
        return mVar;
    }

    /* renamed from: f */
    public C0835m m564f(String str, String str2, String str3) {
        C0835m mVar = new C0835m();
        Map map = (Map) this.f5719i.get(str);
        if (map != null) {
            for (String str4 : map.keySet()) {
                if (str4.startsWith(str2) || str4.startsWith(str3)) {
                    mVar.add(str4);
                }
            }
        }
        return mVar;
    }

    /* renamed from: k */
    public boolean m555k(String str, String str2) {
        Map map = (Map) this.f5719i.get(str);
        if (map == null) {
            return false;
        }
        for (String str3 : map.keySet()) {
            if (str3.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public C0835m m569e(String str) {
        C0835m mVar = new C0835m();
        for (String str2 : this.f5719i.keySet()) {
            if (str2.startsWith(str) && m563g(str2)) {
                mVar.add(str2);
            }
        }
        return mVar;
    }

    /* renamed from: l */
    public ArrayList m554l(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f5719i.keySet()) {
            if (str3.startsWith(str) || str3.startsWith(str2)) {
                if (m563g(str3)) {
                    arrayList.add(str3);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public boolean m566f(String str) {
        if (this.f5719i.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m563g(String str) {
        Map map = (Map) this.f5719i.get(str);
        if (map == null) {
            return false;
        }
        for (String str2 : map.keySet()) {
            if (!(str2 == null || str2.startsWith("@"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean m553m(String str, String str2) {
        if (m587a(str, str2, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m561g(String str, String str2, String str3) {
        if (str3.equalsIgnoreCase("true")) {
            return true;
        }
        if (str3.equalsIgnoreCase("false")) {
            return false;
        }
        throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected boolean value:'" + str3 + "'");
    }

    /* renamed from: h */
    public static float m559h(String str, String str2, String str3) {
        try {
            return Float.parseFloat(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read float:" + str3);
        }
    }

    /* renamed from: i */
    public static int m557i(String str, String str2, String str3) {
        try {
            return Integer.parseInt(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read int:" + str3);
        }
    }
}
