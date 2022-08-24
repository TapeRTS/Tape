package com.corrodinggames.rts.gameFramework.p039g;

import android.os.Build;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
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

/* renamed from: com.corrodinggames.rts.gameFramework.g.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/a.class */
public final class C0820a {

    /* renamed from: a */
    static ResourceBundle f5392a;

    /* renamed from: b */
    static boolean f5393b;

    /* renamed from: d */
    public static String f5394d;

    /* renamed from: c */
    public static int f5395c = 0;

    /* renamed from: e */
    static Pattern f5396e = Pattern.compile("(.*)(\\(.*\\)( *\\[by.*\\])?)");

    /* renamed from: f */
    static final Pattern f5397f = Pattern.compile("\\[i:([^\\]]*?)\\]");

    /* renamed from: a */
    public static void m1891a() {
        m1879e();
    }

    /* renamed from: b */
    static ResourceBundle m1885b() {
        if (f5392a == null) {
            m1879e();
        }
        return f5392a;
    }

    /* renamed from: a */
    static PropertyResourceBundle m1890a(String str) {
        C1098j m2441j = C0750a.m2441j("translations/" + str);
        if (m2441j == null) {
            return null;
        }
        PropertyResourceBundle propertyResourceBundle = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(m2441j, "UTF-8");
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
    public static String m1887a(String str, Locale locale, boolean z, boolean z2) {
        String str2;
        String str3;
        if (locale == Locale.ROOT) {
            return str;
        }
        String language = locale.getLanguage();
        if (z) {
            str2 = locale.getCountry();
        } else {
            str2 = VariableScope.nullOrMissingString;
        }
        if (z2) {
            str3 = locale.getVariant();
        } else {
            str3 = VariableScope.nullOrMissingString;
        }
        if (language.equals(VariableScope.nullOrMissingString) && str2.equals(VariableScope.nullOrMissingString) && str3.equals(VariableScope.nullOrMissingString)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append('_');
        if (!str3.equals(VariableScope.nullOrMissingString)) {
            sb.append(language).append('_').append(str2.toLowerCase(Locale.ROOT)).append('_').append(str3.toLowerCase(Locale.ROOT));
        } else if (!str2.equals(VariableScope.nullOrMissingString)) {
            sb.append(language).append('_').append(str2.toLowerCase(Locale.ROOT));
        } else {
            sb.append(language);
        }
        return sb.toString();
    }

    /* renamed from: a */
    static ResourceBundle m1888a(String str, Locale locale) {
        String str2 = m1887a(str, Locale.ROOT, false, false) + ".properties";
        PropertyResourceBundle m1890a = m1890a(str2);
        if (m1890a == null) {
            throw new RuntimeException("Root locate file:" + str2 + " is missing, it is required");
        }
        if (Locale.ROOT.equals(locale)) {
            GameEngine.PrintLog("Locale: Using " + str2 + " as locale");
            return m1890a;
        }
        String str3 = m1887a(str, locale, true, true) + ".properties";
        PropertyResourceBundle m1890a2 = m1890a(str3);
        if (m1890a2 == null) {
            GameEngine.PrintLog("Locale: No locale for " + str3 + " checking locale without variant ");
            str3 = m1887a(str, locale, true, false) + ".properties";
            m1890a2 = m1890a(str3);
            if (m1890a2 == null) {
                GameEngine.PrintLog("Locale: No locale for " + str3 + " checking locale without variant or country");
                str3 = m1887a(str, locale, false, false) + ".properties";
                m1890a2 = m1890a(str3);
                if (m1890a2 == null) {
                    GameEngine.PrintLog("Locale: No locale for " + str3 + " using base locale");
                    return m1890a;
                }
            }
        }
        GameEngine.PrintLog("Locale: Using " + str3 + " as locale");
        return new C0821b(m1890a2, m1890a);
    }

    /* renamed from: c */
    public static String m1883c() {
        if (f5394d != null) {
            return f5394d;
        }
        return m1881d().getLanguage();
    }

    /* renamed from: d */
    public static Locale m1881d() {
        GameEngine gameEngine = GameEngine.getInstance();
        SettingsEngine settingsEngine = null;
        if (gameEngine != null) {
            settingsEngine = gameEngine.f6109bQ;
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
    public static synchronized void m1879e() {
        f5395c++;
        GameEngine gameEngine = GameEngine.getInstance();
        SettingsEngine settingsEngine = null;
        if (gameEngine != null) {
            settingsEngine = gameEngine.f6109bQ;
        }
        boolean z = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            z = true;
        }
        if (f5392a != null && f5393b == z) {
            GameEngine.PrintLog("Locale.reload: skipping reload");
        }
        if (Build.VERSION.SDK_INT >= 9) {
            ResourceBundle.clearCache();
        }
        if (z) {
            GameEngine.PrintLog("Locale: forceEnglish");
            f5392a = m1888a("Strings", Locale.ROOT);
        } else if (f5394d != null) {
            f5392a = m1888a("Strings", new Locale(f5394d));
        } else if (settingsEngine != null && settingsEngine.overrideLanguageCode != null && !settingsEngine.overrideLanguageCode.equals(VariableScope.nullOrMissingString)) {
            f5392a = m1888a("Strings", new Locale(settingsEngine.overrideLanguageCode));
        } else {
            Locale locale = Locale.getDefault();
            GameEngine.PrintLog("Locale: default targetLocale:" + locale);
            if (locale != null) {
                GameEngine.PrintLog("Locale: default targetLocale ISO3:" + locale.getISO3Language());
            }
            f5392a = m1888a("Strings", locale);
        }
        f5393b = z;
        if (0 != 0) {
        }
    }

    /* renamed from: d */
    private static final String m1880d(String str) {
        try {
            String string = m1885b().getString(str);
            if (string.contains("[") || string.contains("]")) {
                string = string.replace("[[", "{{").replace("]]", "}}").replace("[", "{{").replace("]", "}}");
            }
            if (string.contains("{") || string.contains("}")) {
                string = string.replace("}}  {{", "}}{{").replace("}} {{", "}}{{").replace("}}{{", "\n-").replace("{{", "-").replace("}}", VariableScope.nullOrMissingString);
            }
            return string;
        } catch (NullPointerException e) {
            throw new RuntimeException("NullPointer with key:" + str + " locale:" + m1885b().getLocale().toString(), e);
        }
    }

    /* renamed from: e */
    private static final boolean m1878e(String str) {
        try {
            m1885b().getString(str);
            return true;
        } catch (MissingResourceException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static final String m1889a(String str, String str2, Object... objArr) {
        try {
            return m1886a(str, objArr);
        } catch (MissingResourceException e) {
            return str2;
        }
    }

    /* renamed from: a */
    public static final String m1886a(String str, Object... objArr) {
        String m1880d = m1880d(str);
        if (objArr.length == 0) {
            return m1880d;
        }
        return new MessageFormat(m1880d).format(objArr, new StringBuffer(), (FieldPosition) null).toString();
    }

    /* renamed from: b */
    public static final String m1884b(String str) {
        if (str == null) {
            return null;
        }
        String str2 = str;
        String str3 = null;
        Matcher matcher = f5396e.matcher(str);
        if (matcher.matches()) {
            str2 = matcher.group(1);
            str3 = matcher.group(2);
        }
        String str4 = "maps.name." + str2.trim().replace(" ", "_").replace(".tmx", VariableScope.nullOrMissingString).toLowerCase(Locale.ENGLISH);
        if (m1878e(str4)) {
            String m1886a = m1886a(str4, new Object[0]);
            if (str3 != null) {
                m1886a = m1886a + str3;
            }
            GameEngine.PrintLog("translated:" + m1886a);
            if (m1886a != null) {
                m1886a = m1886a.replace("_", " ");
            }
            return m1886a;
        }
        return str;
    }

    /* renamed from: c */
    public static String m1882c(String str) {
        if (!str.contains("[i:")) {
            return str;
        }
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f5397f.matcher(str);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                GameEngine.m1145b("convertInlineBlocks: Too many loops while parsing: " + str);
                return str;
            }
            String group = matcher.group(1);
            String m1889a = m1889a(group, null, new Object[0]);
            if (m1889a == null) {
                GameEngine.PrintLog("convertInlineBlocks: No key:" + group);
                m1889a = "[No key: " + group + "]";
            }
            matcher.appendReplacement(stringBuffer, m1889a);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
