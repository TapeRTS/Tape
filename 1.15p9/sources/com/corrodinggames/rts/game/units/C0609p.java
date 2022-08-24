package com.corrodinggames.rts.game.units;

import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/p.class */
public class C0609p {

    /* renamed from: a */
    static C0617s[] f3866a;

    /* renamed from: b */
    static int f3867b;

    /* renamed from: c */
    static int f3868c;

    /* renamed from: d */
    static C0180g f3869d;

    /* renamed from: a */
    public static void m3330a(EnumC0612r enumC0612r, PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = gameEngine.f6104bL;
        if (c0173b == null) {
            GameEngine.PrintLog("setTerrainType called without map loaded");
            return;
        }
        int i = (int) (f * c0173b.f788r);
        int i2 = (int) (f2 * c0173b.f789s);
        if (!c0173b.m6608c(i, i2)) {
            GameEngine.PrintLog("setTerrainType out of map range");
        } else if (c0173b.f832u == null) {
            GameEngine.PrintLog("setTerrainType mainLayer missing");
        } else {
            if (!c0173b.f798R) {
                if (c0173b.f799S) {
                    return;
                }
                try {
                    if (c0173b.f833v == null) {
                        c0173b.f833v = new C0178e(c0173b, "grounddetails", c0173b.f791C, c0173b.f792D);
                        c0173b.f836z.add(c0173b.f833v);
                    }
                    if (c0173b.f834w == null) {
                        c0173b.f834w = new C0178e(c0173b, "grounddetails2", c0173b.f791C, c0173b.f792D);
                        c0173b.f836z.add(c0173b.f834w);
                    }
                    c0173b.f832u.f912w = true;
                    c0173b.f833v.f912w = true;
                    c0173b.f834w.f912w = true;
                } catch (C0179f e) {
                    e.printStackTrace();
                    gameEngine.m1137c("Failed to edit map", e.getMessage());
                    c0173b.f799S = true;
                    return;
                }
            }
            try {
                C0180g m6629a = c0173b.m6629a(enumC0612r.mo3306b(), 0, 0);
                if (m6629a == null) {
                    GameEngine.PrintLog("setTerrainType mapTile==null");
                    return;
                }
                C0180g m6560a = c0173b.f832u.m6560a(i, i2);
                if (f3867b == i && f3868c == i2 && C0180g.m6550a(f3869d, m6629a)) {
                    return;
                }
                GameEngine.PrintLog("setTerrainType changing " + m6560a.f914b + " to " + m6629a.f914b + " at:" + i2 + "," + i2);
                c0173b.f832u.m6559a(i, i2, m6629a, false);
                c0173b.f833v.m6559a(i, i2, null, false);
                c0173b.f834w.m6559a(i, i2, null, false);
                f3867b = i;
                f3868c = i2;
                f3869d = m6629a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Point(i, i2));
                for (int i3 = 0; i3 <= 4; i3++) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Point point = (Point) it.next();
                        m3327a(enumC0612r, m6629a, point.f224a, point.f225b, arrayList2);
                    }
                    arrayList = arrayList2;
                }
                c0173b.m6592g();
                gameEngine.f6113bU.m1315a(c0173b, false);
            } catch (C0179f e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m3327a(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2, ArrayList arrayList) {
        String mo3307a;
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        for (int i3 = -1; i3 <= 1; i3++) {
            for (int i4 = -1; i4 <= 1; i4++) {
                int i5 = i + i3;
                int i6 = i2 + i4;
                if (c0173b.m6608c(i5, i6) && ((i3 != 0 || i4 != 0) && (mo3307a = enumC0612r.mo3307a()) != null && m3328a(enumC0612r, c0180g, i5, i6, i3, i4, mo3307a))) {
                    arrayList.add(new Point(i5, i6));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3325a(int[] iArr, C0617s c0617s) {
        for (int i : iArr) {
            f3866a[i + 128] = c0617s;
        }
    }

    /* renamed from: a */
    public static void m3334a() {
        f3866a = new C0617s[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        m3325a(m3333a(1), new C0617s(2, 2));
        m3325a(m3333a(2), new C0617s(0, 2));
        m3325a(m3333a(4), new C0617s(0, 0));
        m3325a(m3333a(8), new C0617s(2, 0));
        m3325a(m3332a(16, 1, 2), new C0617s(1, 2));
        m3325a(m3332a(32, 2, 4), new C0617s(0, 1));
        m3325a(m3332a(64, 8, 4), new C0617s(1, 0));
        m3325a(m3332a(-128, 1, 8), new C0617s(2, 1));
        m3325a(m3332a(16 + 32, 2, 1, 4), new C0617s(0, 6));
        m3325a(m3332a(32 + 64, 4, 8, 2), new C0617s(0, 4));
        m3325a(m3332a(64 - 128, 8, 4, 1), new C0617s(2, 4));
        m3325a(m3332a((-128) + 16, 1, 8, 2), new C0617s(2, 6));
        m3325a(m3333a(1 + 2), new C0617s(1, 1));
        m3325a(m3333a(2 + 4), new C0617s(1, 1));
        m3325a(m3333a(4 + 8), new C0617s(1, 1));
        m3325a(m3333a(8 + 1), new C0617s(1, 1));
        m3325a(m3332a(16 + 32 + 64, 1, 2, 4, 8), new C0617s(1, 1));
        m3325a(m3332a((32 + 64) - 128, 1, 2, 4, 8), new C0617s(1, 1));
        m3325a(m3332a((64 - 128) + 16, 1, 2, 4, 8), new C0617s(1, 1));
        m3325a(m3332a((-128) + 16 + 32, 1, 2, 4, 8), new C0617s(1, 1));
        m3325a(m3332a(16 + 64, 1, 2, 8, 4), new C0617s(1, 1));
        m3325a(m3332a((-128) + 32, 1, 2, 8, 4), new C0617s(1, 1));
        m3325a(m3333a(1 + 4), new C0617s(1, 1));
        m3325a(m3333a(2 + 8), new C0617s(1, 1));
        m3325a(m3332a(16 + 4, 2, 1), new C0617s(1, 1));
        m3325a(m3332a(64 + 2, 4, 8), new C0617s(1, 1));
        m3325a(m3332a((-128) + 2, 1, 8), new C0617s(1, 1));
        m3325a(m3332a(32 + 1, 2, 4), new C0617s(1, 1));
        m3325a(m3332a(16 + 4 + 8, 2, 1), new C0617s(1, 1));
        m3325a(m3332a(64 + 2 + 1, 4, 8), new C0617s(1, 1));
        m3325a(m3332a((-128) + 2 + 4, 1, 8), new C0617s(1, 1));
        m3325a(m3332a(32 + 1 + 8, 2, 4), new C0617s(1, 1));
        m3325a(m3333a(-1), new C0617s(1, 1));
    }

    /* renamed from: a */
    private static int[] m3333a(int i) {
        return new int[]{i};
    }

    /* renamed from: a */
    private static int[] m3332a(int i, int... iArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        if (iArr.length == 1) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
        } else if (iArr.length == 2) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
        } else if (iArr.length == 3) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
        } else if (iArr.length == 4) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[2] + iArr[3]));
        } else {
            throw new RuntimeException("unhandled:" + iArr.length);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    public static boolean m3328a(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2, int i3, int i4, String str) {
        C0180g m6629a;
        boolean z = false;
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        byte m3324b = m3324b(enumC0612r, c0180g, i, i2);
        if (f3866a == null) {
            m3334a();
        }
        C0617s c0617s = f3866a[m3324b + 128];
        if (c0617s == null) {
            return false;
        }
        if (c0617s.f3876a == 1 && c0617s.f3877b == 1) {
            c0173b.f832u.m6559a(i, i2, c0180g, false);
            m6629a = null;
            z = true;
        } else {
            try {
                m6629a = c0173b.m6629a(str, c0617s.f3876a, c0617s.f3877b);
            } catch (C0179f e) {
                e.printStackTrace();
                return false;
            }
        }
        m3326a(enumC0612r, c0180g, m6629a, i, i2);
        return z;
    }

    /* renamed from: a */
    public static void m3326a(EnumC0612r enumC0612r, C0180g c0180g, C0180g c0180g2, int i, int i2) {
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        C0180g m6560a = c0173b.f832u.m6560a(i, i2);
        C0180g m6560a2 = c0173b.f833v.m6560a(i, i2);
        C0180g m6560a3 = c0173b.f834w.m6560a(i, i2);
        EnumC0612r m3331a = m3331a(m6560a2);
        EnumC0612r m3331a2 = m3331a(m6560a3);
        if (m3331a == enumC0612r) {
            c0173b.f833v.m6559a(i, i2, null, false);
            m6560a2 = null;
        }
        if (m3331a2 == enumC0612r) {
            c0173b.f834w.m6559a(i, i2, null, false);
            m6560a3 = null;
            m3331a2 = null;
        }
        if (m6560a2 == null && m6560a3 != null) {
            c0173b.f833v.m6559a(i, i2, m6560a3, false);
            c0173b.f834w.m6559a(i, i2, null, false);
            m6560a2 = m6560a3;
            m6560a3 = null;
        }
        if (C0180g.m6550a(m6560a, c0180g) || c0180g2 == null) {
            return;
        }
        if (m6560a2 != null) {
            if (m6560a3 != null) {
                c0173b.f833v.m6559a(i, i2, m6560a3, false);
            }
            c0173b.f834w.m6559a(i, i2, c0180g2, false);
            return;
        }
        c0173b.f833v.m6559a(i, i2, c0180g2, false);
    }

    /* renamed from: a */
    public static EnumC0612r m3331a(C0180g c0180g) {
        EnumC0612r[] values;
        if (c0180g == null) {
            return null;
        }
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        for (EnumC0612r enumC0612r : EnumC0612r.values()) {
            String str = c0180g.f913a.f949a;
            if (str != null && str.equals(enumC0612r.mo3306b())) {
                return enumC0612r;
            }
            if (str != null && str.equals(enumC0612r.mo3307a())) {
                return enumC0612r;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3329a(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2) {
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        if (c0173b.m6608c(i, i2) && C0180g.m6550a(c0173b.f832u.m6560a(i, i2), c0180g)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static byte m3324b(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2) {
        byte b = 0;
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        int i3 = c0173b.f791C;
        int i4 = c0173b.f792D;
        if (i >= 1) {
            if (m3329a(enumC0612r, c0180g, i - 1, i2)) {
                b = (byte) (0 - 128);
            }
            if (i2 >= 1 && m3329a(enumC0612r, c0180g, i - 1, i2 - 1)) {
                b = (byte) (b + 1);
            }
            if (i2 < i4 - 1 && m3329a(enumC0612r, c0180g, i - 1, i2 + 1)) {
                b = (byte) (b + 8);
            }
        }
        if (i2 >= 1) {
            if (m3329a(enumC0612r, c0180g, i, i2 - 1)) {
                b = (byte) (b + 16);
            }
            if (i < i3 - 1 && m3329a(enumC0612r, c0180g, i + 1, i2 - 1)) {
                b = (byte) (b + 2);
            }
        }
        if (i < i3 - 1 && m3329a(enumC0612r, c0180g, i + 1, i2)) {
            b = (byte) (b + 32);
        }
        if (i2 < i4 - 1) {
            if (m3329a(enumC0612r, c0180g, i, i2 + 1)) {
                b = (byte) (b + 64);
            }
            if (i < i3 - 1 && m3329a(enumC0612r, c0180g, i + 1, i2 + 1)) {
                b = (byte) (b + 4);
            }
        }
        return b;
    }
}
