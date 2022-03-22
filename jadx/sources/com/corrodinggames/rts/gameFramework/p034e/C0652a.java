package com.corrodinggames.rts.gameFramework.p034e;

import android.os.Build;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.utility.C0832j;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/a.class */
public final class C0652a {

    /* renamed from: a */
    static ResourceBundle f4578a;

    /* renamed from: b */
    static boolean f4579b;

    /* renamed from: d */
    public static String f4581d;

    /* renamed from: c */
    public static int f4580c = 0;

    /* renamed from: e */
    static Pattern f4582e = Pattern.compile("(.*)(\\(.*\\)( *\\[by.*\\])?)");

    /* renamed from: f */
    static final Pattern f4583f = Pattern.compile("\\[i:([^\\]]*?)\\]");

    /* renamed from: a */
    public static void m1541a() {
        m1529e();
    }

    /* renamed from: b */
    static ResourceBundle m1535b() {
        if (f4578a == null) {
            m1529e();
        }
        return f4578a;
    }

    /* renamed from: a */
    static PropertyResourceBundle m1540a(String str) {
        C0832j h = C0596a.m1884h("translations/" + str);
        if (h == null) {
            return null;
        }
        PropertyResourceBundle propertyResourceBundle = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(h, "UTF-8");
            propertyResourceBundle = new PropertyResourceBundle(inputStreamReader);
            inputStreamReader.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return propertyResourceBundle;
    }

    /* renamed from: a */
    public static String m1537a(String str, Locale locale, boolean z, boolean z2) {
        String str2;
        String str3;
        if (locale == Locale.ROOT) {
            return str;
        }
        String language = locale.getLanguage();
        if (z) {
            str2 = locale.getCountry();
        } else {
            str2 = "";
        }
        if (z2) {
            str3 = locale.getVariant();
        } else {
            str3 = "";
        }
        if (language.equals("") && str2.equals("") && str3.equals("")) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append('_');
        if (!str3.equals("")) {
            sb.append(language).append('_').append(str2.toLowerCase(Locale.ROOT)).append('_').append(str3.toLowerCase(Locale.ROOT));
        } else if (!str2.equals("")) {
            sb.append(language).append('_').append(str2.toLowerCase(Locale.ROOT));
        } else {
            sb.append(language);
        }
        return sb.toString();
    }

    /* renamed from: a */
    static ResourceBundle m1538a(String str, Locale locale) {
        String str2 = m1537a(str, Locale.ROOT, false, false) + ".properties";
        PropertyResourceBundle a = m1540a(str2);
        if (a == null) {
            throw new RuntimeException("Root locate file:" + str2 + " is missing, it is required");
        } else if (Locale.ROOT.equals(locale)) {
            AbstractC0789l.m670d("Locale: Using " + str2 + " as locale");
            return a;
        } else {
            String str3 = m1537a(str, locale, true, true) + ".properties";
            PropertyResourceBundle a2 = m1540a(str3);
            if (a2 == null) {
                AbstractC0789l.m670d("Locale: No locale for " + str3 + " checking locale without variant ");
                str3 = m1537a(str, locale, true, false) + ".properties";
                a2 = m1540a(str3);
                if (a2 == null) {
                    AbstractC0789l.m670d("Locale: No locale for " + str3 + " checking locale without variant or country");
                    str3 = m1537a(str, locale, false, false) + ".properties";
                    a2 = m1540a(str3);
                    if (a2 == null) {
                        AbstractC0789l.m670d("Locale: No locale for " + str3 + " using base locale");
                        return a;
                    }
                }
            }
            AbstractC0789l.m670d("Locale: Using " + str3 + " as locale");
            return new C0653b(a2, a);
        }
    }

    /* renamed from: c */
    public static String m1533c() {
        return m1531d().getLanguage();
    }

    /* renamed from: d */
    public static Locale m1531d() {
        AbstractC0789l u = AbstractC0789l.m638u();
        SettingsEngine settingsEngine = null;
        if (u != null) {
            settingsEngine = u.f5516by;
        }
        boolean z = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            z = true;
        }
        if (z) {
            return Locale.ROOT;
        }
        return Locale.getDefault();
    }

    /* renamed from: e */
    public static synchronized void m1529e() {
        f4580c++;
        AbstractC0789l u = AbstractC0789l.m638u();
        SettingsEngine settingsEngine = null;
        if (u != null) {
            settingsEngine = u.f5516by;
        }
        boolean z = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            z = true;
        }
        if (f4578a != null && f4579b == z) {
            AbstractC0789l.m670d("Locale.reload: skipping reload");
        }
        if (Build.VERSION.SDK_INT >= 9) {
            ResourceBundle.clearCache();
        }
        if (z) {
            f4578a = m1538a("Strings", Locale.ROOT);
        } else if (f4581d != null) {
            f4578a = m1538a("Strings", new Locale(f4581d));
        } else if (settingsEngine == null || settingsEngine.overrideLanguageCode == null || settingsEngine.overrideLanguageCode.equals("")) {
            f4578a = m1538a("Strings", Locale.getDefault());
        } else {
            f4578a = m1538a("Strings", new Locale(settingsEngine.overrideLanguageCode));
        }
        f4579b = z;
        if (0 != 0) {
        }
    }

    /* renamed from: d */
    private static final String m1530d(String str) {
        try {
            String string = m1535b().getString(str);
            if (string.contains("[") || string.contains("]")) {
                string = string.replace("[[", "{{").replace("]]", "}}").replace("[", "{{").replace("]", "}}");
            }
            if (string.contains("{") || string.contains("}")) {
                string = string.replace("}}  {{", "}}{{").replace("}} {{", "}}{{").replace("}}{{", "\n-").replace("{{", "-").replace("}}", "");
            }
            return string;
        } catch (NullPointerException e) {
            throw new RuntimeException("NullPointer with key:" + str + " locale:" + m1535b().getLocale().toString(), e);
        }
    }

    /* renamed from: e */
    private static final boolean m1528e(String str) {
        try {
            m1535b().getString(str);
            return true;
        } catch (MissingResourceException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static final String m1539a(String str, String str2, Object... objArr) {
        try {
            return m1536a(str, objArr);
        } catch (MissingResourceException e) {
            return str2;
        }
    }

    /* renamed from: a */
    public static final String m1536a(String str, Object... objArr) {
        String d = m1530d(str);
        if (objArr.length == 0) {
            return d;
        }
        return new MessageFormat(d).format(objArr, new StringBuffer(), (FieldPosition) null).toString();
    }

    /* renamed from: b */
    public static final String m1534b(String str) {
        if (str == null) {
            return null;
        }
        String str2 = str;
        String str3 = null;
        Matcher matcher = f4582e.matcher(str);
        if (matcher.matches()) {
            str2 = matcher.group(1);
            str3 = matcher.group(2);
        }
        String str4 = "maps.name." + str2.trim().replace(" ", "_").replace(".tmx", "").toLowerCase(Locale.ENGLISH);
        if (!m1528e(str4)) {
            return str;
        }
        String a = m1536a(str4, new Object[0]);
        if (str3 != null) {
            a = a + str3;
        }
        AbstractC0789l.m670d("translated:" + a);
        if (a != null) {
            a = a.replace("_", " ");
        }
        return a;
    }

    /* renamed from: c */
    public static String m1532c(String str) {
        if (!str.contains("[i:")) {
            return str;
        }
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f4583f.matcher(str);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                AbstractC0789l.m682b("convertInlineBlocks: Too many loops while parsing: " + str);
                return str;
            }
            String group = matcher.group(1);
            String a = m1539a(group, null, new Object[0]);
            if (a == null) {
                AbstractC0789l.m670d("convertInlineBlocks: No key:" + group);
                a = "[No key: " + group + "]";
            }
            matcher.appendReplacement(stringBuffer, a);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
