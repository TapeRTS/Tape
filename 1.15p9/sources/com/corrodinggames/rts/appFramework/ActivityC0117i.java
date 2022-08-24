package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0187e;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.EnumC1063s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.appFramework.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/i.class */
public class ActivityC0117i extends ActivityC0089b {

    /* renamed from: c */
    boolean f473c;

    /* renamed from: d */
    String f474d;

    /* renamed from: b */
    public void mo6168b() {
        super.mo6168b();
        C0090c.m6218a((Activity) this, true);
    }

    /* renamed from: d */
    public static String m6172d(String str) {
        if (str == null) {
            return null;
        }
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
    public static boolean m6174a(String str, String str2) {
        Matcher matcher = Pattern.compile(".*\\[(.*)\\].*").matcher(str);
        if (matcher.matches()) {
            if ((matcher.group(1).toLowerCase(Locale.ENGLISH) + "|").contains("demo|")) {
                return true;
            }
        }
        if (C0750a.m2440h(str2.replace(".tmx", VariableScope.nullOrMissingString) + "_demo")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m6171e(String str) {
        return C0090c.m6210b(str);
    }

    /* renamed from: f */
    public static boolean m6170f(String str) {
        if (str.contains("skirmish/")) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m6169g(String str) {
        if (str.contains("SD/")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m6173a(String str, boolean z, int i, int i2, boolean z2, boolean z3) {
        GameEngine m1228A = GameEngine.m1228A();
        m1228A.f6111bS.m1981g();
        if (z || z3) {
            int i3 = 0;
            m1228A.m1218K();
            synchronized (m1228A) {
                m1228A.f6160dl = null;
                m1228A.f6159dk = str;
                int i4 = AbstractC0197n.f1364c - 1;
                int m6213a = C0090c.m6213a(str);
                GameEngine.PrintLog("Max teams on map: " + str + " = " + m6213a);
                if (m6213a > 0 && m6213a - 1 < i4) {
                    i4 = m6213a - 1;
                }
                AbstractC0197n.m5668D();
                m1228A.f6093bs = new C0187e(0);
                m1228A.f6093bs.f1315u = "Player";
                int i5 = 0;
                while (i5 <= 1) {
                    for (int i6 = 1; i6 <= i4; i6++) {
                        boolean z4 = i6 % 2 == 0 || i5 == 1;
                        if (i3 < i2 && z4 && AbstractC0197n.m5569k(i6) == null) {
                            C0136a c0136a = new C0136a(i6);
                            c0136a.f1315u = "AI";
                            c0136a.f1311q = 0;
                            i3++;
                        }
                    }
                    i5++;
                }
                GameEngine.PrintLog("Allies: " + i3 + "/" + i2);
                int i7 = 0;
                int i8 = i - i2;
                int i9 = 0;
                while (i9 <= 1) {
                    for (int i10 = 1; i10 <= i4; i10++) {
                        boolean z5 = i10 % 2 == 1 || i9 == 1;
                        if (!z2) {
                            z5 = true;
                        }
                        if (i7 < i8 && z5 && AbstractC0197n.m5569k(i10) == null) {
                            C0136a c0136a2 = new C0136a(i10);
                            c0136a2.f1315u = "AI";
                            i7++;
                            if (z2) {
                                c0136a2.f1311q = 1;
                            }
                        }
                    }
                    i9++;
                }
                m1228A.networkEngine.m1706aq();
                if (!z3) {
                    m1228A.mo5725a(false, EnumC1063s.normal);
                }
            }
            return;
        }
        m1228A.m1218K();
        synchronized (m1228A) {
            m1228A.f6160dl = null;
            m1228A.f6159dk = str;
        }
        if (!z3) {
            m1228A.mo5725a(true, EnumC1063s.normal);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0824b c0824b;
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        View view2 = ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView;
        String str = (String) view2.getTag();
        GameEngine m1228A = GameEngine.m1228A();
        String m6171e = m6171e(str);
        if (str != null) {
            c0824b = m1228A.f6118bZ.m1848g(str);
        } else {
            c0824b = null;
        }
        this.f474d = str;
        contextMenu.setHeaderTitle(m6171e);
        MenuItem add = contextMenu.add(0, view2.getId(), 0, "Export");
        if (c0824b != null) {
            add.setTitle("Export (Standalone maps only)");
            add.setEnabled(false);
        }
        MenuItem add2 = contextMenu.add(2, view2.getId(), 0, "Delete");
        if (c0824b != null) {
            add2.setTitle("Delete (Standalone maps only)");
            add2.setEnabled(false);
        }
        if (c0824b != null) {
            contextMenu.add(4, view2.getId(), 0, "From Mod: " + c0824b.m1835b()).setEnabled(false);
        }
        if (c0824b == null && this.f473c) {
            MenuItem add3 = contextMenu.add(3, view.getId(), 0, "Storage: " + C0750a.m2435m(str));
            if (add3 != null) {
                add3.setEnabled(false);
            }
        }
    }
}
