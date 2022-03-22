package com.corrodinggames.rts.p008a;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/i.class */
class C0089i implements Comparator {

    /* renamed from: a */
    Pattern f415a = Pattern.compile(".*\\((.*)\\).*");

    C0089i() {
    }

    /* renamed from: a */
    public int compare(String str, String str2) {
        Date a = m3934a(str);
        Date a2 = m3934a(str2);
        if (a == null && a2 == null) {
            return str.compareTo(str2);
        }
        if (a != null && a2 != null) {
            return a2.compareTo(a);
        }
        if (a == null && a2 != null) {
            return -1;
        }
        if (a == null || a2 != null) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public Date m3934a(String str) {
        Matcher matcher = this.f415a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
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
                            AbstractC0789l.m670d("Failed to parse date:" + group);
                            return null;
                        }
                    }
                }
            }
        }
    }
}
