package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.appFramework.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/k.class */
public class C0119k implements Comparator {

    /* renamed from: a */
    Pattern f476a = Pattern.compile(".*\\((.*)\\).*");

    /* renamed from: a */
    public int compare(String str, String str2) {
        Date m6166a = m6166a(str);
        Date m6166a2 = m6166a(str2);
        if (m6166a == null && m6166a2 == null) {
            return str.compareTo(str2);
        }
        if (m6166a != null && m6166a2 != null) {
            return m6166a2.compareTo(m6166a);
        }
        if (m6166a == null && m6166a2 != null) {
            return -1;
        }
        if (m6166a != null && m6166a2 == null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public Date m6166a(String str) {
        Matcher matcher = this.f476a.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            try {
                return new SimpleDateFormat("d MMM yyyy HH.mm.ss", Locale.ENGLISH).parse(group);
            } catch (ParseException e) {
                try {
                    return new SimpleDateFormat("d MMM yyyy HH:mm:ss", Locale.ENGLISH).parse(group);
                } catch (ParseException e2) {
                    try {
                        return new SimpleDateFormat("d MMM yyyy HH_mm_ss", Locale.ENGLISH).parse(group);
                    } catch (ParseException e3) {
                        try {
                            return new SimpleDateFormat("d MMM yyyy HH-mm-ss", Locale.ENGLISH).parse(group);
                        } catch (ParseException e4) {
                            try {
                                return new SimpleDateFormat("d MMM. yyyy HH.mm.ss", Locale.ENGLISH).parse(group);
                            } catch (ParseException e5) {
                                GameEngine.PrintLog("Failed to parse date:" + group);
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
