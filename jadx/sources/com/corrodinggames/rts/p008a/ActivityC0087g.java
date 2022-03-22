package com.corrodinggames.rts.p008a;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0162e;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.EnumC0803s;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/g.class */
public class ActivityC0087g extends ActivityC0066b {
    /* renamed from: b */
    public void mo4239b() {
        super.mo4239b();
        C0067c.m4294a(this, true);
    }

    /* renamed from: c */
    public static String m4269c(String str) {
        if (str.contains("/MOD|")) {
            return str.substring(str.indexOf("/MOD|"));
        }
        if (str.contains("/NEW_PATH|")) {
            return str.substring(str.indexOf("/NEW_PATH|"));
        }
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    /* renamed from: a */
    public static boolean m4271a(String str, String str2) {
        Matcher matcher = Pattern.compile(".*\\[(.*)\\].*").matcher(str);
        if (matcher.matches()) {
            if ((matcher.group(1).toLowerCase(Locale.ENGLISH) + "|").contains("demo|")) {
                return true;
            }
        }
        if (C0596a.m1941f(str2.replace(".tmx", "") + "_demo")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static String m4268d(String str) {
        return C0067c.m4288b(str);
    }

    /* renamed from: e */
    public static boolean m4267e(String str) {
        if (str.contains("skirmish/")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m4266f(String str) {
        if (str.contains("SD/")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m4270a(String str, boolean z, int i, int i2, boolean z2, boolean z3) {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5481bA.m1732g();
        if (z || z3) {
            int i3 = 0;
            u.m769E();
            synchronized (u) {
                u.f5530cT = null;
                u.f5529cS = str;
                int i4 = AbstractC0171m.f1275a - 1;
                int a = C0067c.m4290a(str);
                AbstractC0789l.m683d("Max teams on map: " + str + " = " + a);
                if (a > 0 && a - 1 < i4) {
                    i4 = a - 1;
                }
                AbstractC0171m.m3833B();
                u.f5464bb = new C0162e(0);
                u.f5464bb.f1238q = "Player";
                int i5 = 0;
                while (i5 <= 1) {
                    for (int i6 = 1; i6 <= i4; i6++) {
                        boolean z4 = i6 % 2 == 0 || i5 == 1;
                        if (i3 < i2 && z4 && AbstractC0171m.m3740n(i6) == null) {
                            C0118a aVar = new C0118a(i6);
                            aVar.f1238q = "AI";
                            aVar.f1236o = 0;
                            i3++;
                        }
                    }
                    i5++;
                }
                AbstractC0789l.m683d("Allies: " + i3 + "/" + i2);
                int i7 = 0;
                int i8 = i - i2;
                int i9 = 0;
                while (i9 <= 1) {
                    for (int i10 = 1; i10 <= i4; i10++) {
                        boolean z5 = i10 % 2 == 1 || i9 == 1;
                        if (!z2) {
                            z5 = true;
                        }
                        if (i7 < i8 && z5 && AbstractC0171m.m3740n(i10) == null) {
                            C0118a aVar2 = new C0118a(i10);
                            aVar2.f1238q = "AI";
                            i7++;
                            if (z2) {
                                aVar2.f1236o = 1;
                            }
                        }
                    }
                    i9++;
                }
                u.f5486bF.m1318ah();
                if (!z3) {
                    u.m723a(false, EnumC0803s.f5652b);
                }
            }
            return;
        }
        u.m769E();
        synchronized (u) {
            u.f5530cT = null;
            u.f5529cS = str;
        }
        if (!z3) {
            u.m723a(true, EnumC0803s.f5652b);
        }
    }
}
