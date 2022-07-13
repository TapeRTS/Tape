package com.corrodinggames.rts.gameFramework.lang;

import android.os.Build;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.utility.C0936j;
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

/* renamed from: com.corrodinggames.rts.gameFramework.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a.class */
public final class LangLocale {

    /* renamed from: a */
    static ResourceBundle f4966a;

    /* renamed from: b */
    static boolean f4967b;

    /* renamed from: d */
    public static String f4968d;

    /* renamed from: c */
    public static int f4969c = 0;

    /* renamed from: e */
    static Pattern pattern = Pattern.compile("(.*)(\\(.*\\)( *\\[by.*\\])?)");

    /* renamed from: f */
    static final Pattern f4971f = Pattern.compile("\\[i:([^\\]]*?)\\]");

    /* renamed from: a */
    public static void init() {
        m1598e();
    }

    /* renamed from: b */
    static ResourceBundle m1604b() {
        if (f4966a == null) {
            m1598e();
        }
        return f4966a;
    }

    /* renamed from: a */
    static PropertyResourceBundle m1609a(String str) {
        C0936j m2156j = C0670a.m2156j("translations/" + str);
        if (m2156j == null) {
            return null;
        }
        PropertyResourceBundle propertyResourceBundle = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(m2156j, "UTF-8");
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
    public static String m1606a(String str, Locale locale, boolean isGetCountry, boolean z) {
        String str2;
        String str3;
        if (locale == Locale.ROOT) {
            return str;
        }
        String language = locale.getLanguage();
        if (isGetCountry) {
            str2 = locale.getCountry();
        } else {
            str2 = VariableScope.nullOrMissingString;
        }
        if (z) {
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
    static ResourceBundle m1607a(String str, Locale locale) {
        String str2 = m1606a(str, Locale.ROOT, false, false) + ".properties";
        PropertyResourceBundle m1609a = m1609a(str2);
        if (m1609a == null) {
            throw new RuntimeException("Root locate file:" + str2 + " is missing, it is required");
        }
        if (Locale.ROOT.equals(locale)) {
            GameEngine.PrintLOG("Locale: Using " + str2 + " as locale");
            return m1609a;
        }
        String str3 = m1606a(str, locale, true, true) + ".properties";
        PropertyResourceBundle m1609a2 = m1609a(str3);
        if (m1609a2 == null) {
            GameEngine.PrintLOG("Locale: No locale for " + str3 + " checking locale without variant ");
            str3 = m1606a(str, locale, true, false) + ".properties";
            m1609a2 = m1609a(str3);
            if (m1609a2 == null) {
                GameEngine.PrintLOG("Locale: No locale for " + str3 + " checking locale without variant or country");
                str3 = m1606a(str, locale, false, false) + ".properties";
                m1609a2 = m1609a(str3);
                if (m1609a2 == null) {
                    GameEngine.PrintLOG("Locale: No locale for " + str3 + " using base locale");
                    return m1609a;
                }
            }
        }
        GameEngine.PrintLOG("Locale: Using " + str3 + " as locale");
        return new MultipleResourceBundle(m1609a2, m1609a);
    }

    /* renamed from: c */
    public static String getLocalLanguage() {
        if (f4968d != null) {
            return f4968d;
        }
        return m1600d().getLanguage();
    }

    /* renamed from: d */
    public static Locale m1600d() {
        GameEngine gameEngine = GameEngine.getInstance();
        SettingsEngine settingsEngine = null;
        if (gameEngine != null) {
            settingsEngine = gameEngine.curSettings;
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
    public static synchronized void m1598e() {
        f4969c++;
        GameEngine gameEngine = GameEngine.getInstance();
        SettingsEngine settingsEngine = null;
        if (gameEngine != null) {
            settingsEngine = gameEngine.curSettings;
        }
        boolean z = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            z = true;
        }
        if (f4966a != null && f4967b == z) {
            GameEngine.PrintLOG("Locale.reload: skipping reload");
        }
        if (Build.VERSION.SDK_INT >= 9) {
            ResourceBundle.clearCache();
        }
        if (z) {
            GameEngine.PrintLOG("Locale: forceEnglish");
            f4966a = m1607a("Strings", Locale.ROOT);
        } else if (f4968d != null) {
            f4966a = m1607a("Strings", new Locale(f4968d));
        } else if (settingsEngine != null && settingsEngine.overrideLanguageCode != null && !settingsEngine.overrideLanguageCode.equals(VariableScope.nullOrMissingString)) {
            f4966a = m1607a("Strings", new Locale(settingsEngine.overrideLanguageCode));
        } else {
            Locale locale = Locale.getDefault();
            GameEngine.PrintLOG("Locale: default targetLocale:" + locale);
            if (locale != null) {
                GameEngine.PrintLOG("Locale: default targetLocale ISO3:" + locale.getISO3Language());
            }
            f4966a = m1607a("Strings", locale);
        }
        f4967b = z;
        if (0 != 0) {
        }
    }

    /* renamed from: d */
    private static final String m1599d(String str) {
        try {
            String string = m1604b().getString(str);
            if (string.contains("[") || string.contains("]")) {
                string = string.replace("[[", "{{").replace("]]", "}}").replace("[", "{{").replace("]", "}}");
            }
            if (string.contains("{") || string.contains("}")) {
                string = string.replace("}}  {{", "}}{{").replace("}} {{", "}}{{").replace("}}{{", "\n-").replace("{{", "-").replace("}}", VariableScope.nullOrMissingString);
            }
            return string;
        } catch (NullPointerException e) {
            throw new RuntimeException("NullPointer with key:" + str + " locale:" + m1604b().getLocale().toString(), e);
        }
    }

    /* renamed from: e */
    private static final boolean m1597e(String str) {
        try {
            m1604b().getString(str);
            return true;
        } catch (MissingResourceException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static final String m1608a(String str, String str2, Object... objArr) {
        try {
            return getI18NText(str, objArr);
        } catch (MissingResourceException e) {
            return str2;
        }
    }

    /* renamed from: a */
    public static final String getI18NText(String str, Object... objArr) {
        String m1599d = m1599d(str);
        if (objArr.length == 0) {
            return m1599d;
        }
        return new MessageFormat(m1599d).format(objArr, new StringBuffer(), (FieldPosition) null).toString();
    }

    /* renamed from: b */
    public static final String m1603b(String str) {
        if (str == null) {
            return null;
        }
        String str2 = str;
        String str3 = null;
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            str2 = matcher.group(1);
            str3 = matcher.group(2);
        }
        String str4 = "maps.name." + str2.trim().replace(" ", "_").replace(".tmx", VariableScope.nullOrMissingString).toLowerCase(Locale.ENGLISH);
        if (m1597e(str4)) {
            String i18NText = getI18NText(str4, new Object[0]);
            if (str3 != null) {
                i18NText = i18NText + str3;
            }
            GameEngine.PrintLOG("translated:" + i18NText);
            if (i18NText != null) {
                i18NText = i18NText.replace("_", " ");
            }
            return i18NText;
        }
        return str;
    }

    /* renamed from: c */
    public static String m1601c(String str) {
        if (!str.contains("[i:")) {
            return str;
        }
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f4971f.matcher(str);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                GameEngine.log("convertInlineBlocks: Too many loops while parsing: " + str);
                return str;
            }
            String group = matcher.group(1);
            String m1608a = m1608a(group, null, new Object[0]);
            if (m1608a == null) {
                GameEngine.PrintLOG("convertInlineBlocks: No key:" + group);
                m1608a = "[No key: " + group + "]";
            }
            matcher.appendReplacement(stringBuffer, m1608a);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}