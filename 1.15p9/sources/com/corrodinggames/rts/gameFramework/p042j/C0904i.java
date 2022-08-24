package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.Tree;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1082ak;
import com.corrodinggames.rts.gameFramework.utility.C1093g;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.j.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/i.class */
public final class C0904i {

    /* renamed from: q */
    private final C0907l f5950q;

    /* renamed from: a */
    EnumC0246ao f5951a;

    /* renamed from: b */
    public final int f5952b;

    /* renamed from: c */
    public final int f5953c;

    /* renamed from: d */
    public byte[] f5954d;

    /* renamed from: e */
    public byte[] f5955e;

    /* renamed from: f */
    public byte[] f5956f;

    /* renamed from: g */
    public short[] f5957g;

    /* renamed from: h */
    public HashMap f5958h;

    /* renamed from: i */
    public int f5959i;

    /* renamed from: j */
    public byte[] f5960j;

    /* renamed from: m */
    public boolean f5961m;

    /* renamed from: o */
    public boolean f5962o;

    /* renamed from: p */
    public int f5963p;

    /* renamed from: k */
    public int f5964k = -99;

    /* renamed from: l */
    public int f5965l = 0;

    /* renamed from: n */
    Point f5966n = new Point();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0904i(C0907l c0907l, EnumC0246ao enumC0246ao, int i, int i2) {
        this.f5952b = i;
        this.f5953c = i2;
        this.f5950q = c0907l;
        this.f5951a = enumC0246ao;
        this.f5954d = new byte[i * i2];
        this.f5950q.f6021u.add(this);
        this.f5950q.f6022v = (C0904i[]) this.f5950q.f6021u.toArray(new C0904i[0]);
        m1348a();
    }

    /* renamed from: a */
    void m1348a() {
        m1337d();
        m1338c(null);
        m1336e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1344a(AbstractC0623y abstractC0623y) {
        double m2610a;
        if (abstractC0623y != null) {
            this.f5965l++;
            if (this.f5965l > 50) {
                if (!this.f5961m) {
                    GameEngine.PrintLog("buildAndReplaceClearanceCost being skipped");
                }
                this.f5961m = true;
                return;
            }
        }
        if (abstractC0623y != null) {
            m1340b(abstractC0623y);
            return;
        }
        long j = 0;
        if (abstractC0623y == null) {
            j = C0727bl.m2612a();
        }
        C0173b c0173b = this.f5950q.f6006q;
        byte[] bArr = this.f5960j;
        if (this.f5960j == null) {
            abstractC0623y = null;
        }
        this.f5960j = new byte[this.f5952b * this.f5953c];
        short s = 0;
        short s2 = 0;
        short s3 = this.f5950q.f6008s;
        short s4 = this.f5950q.f6009t;
        if (abstractC0623y != null) {
            if (bArr != null) {
                CommonUtils.m2323a(bArr, this.f5960j);
            }
            c0173b.m6652a(abstractC0623y.f6951ek, abstractC0623y.f6952el);
            Rect cb = abstractC0623y.m5818cb();
            short s5 = (short) c0173b.f800T;
            short s6 = (short) c0173b.f801U;
            s = (short) ((s5 - 5) + cb.f230a);
            s2 = (short) ((s6 - 5) + cb.f231b);
            s3 = (short) (s5 + 5 + cb.f232c);
            s4 = (short) (s6 + 5 + cb.f233d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.f5950q.f6008s) {
            s3 = this.f5950q.f6008s;
        }
        if (s4 > this.f5950q.f6009t) {
            s4 = this.f5950q.f6009t;
        }
        short s7 = s;
        while (true) {
            short s8 = s7;
            if (s8 >= s3) {
                break;
            }
            short s9 = s2;
            while (true) {
                short s10 = s9;
                if (s10 < s4) {
                    boolean z = false;
                    if (this.f5954d[(s8 * this.f5953c) + s10] == -1) {
                        z = true;
                    }
                    if (this.f5955e[(s8 * this.f5953c) + s10] == -1) {
                        z = true;
                    }
                    if (z) {
                        this.f5960j[(s8 * this.f5953c) + s10] = 0;
                    } else {
                        this.f5960j[(s8 * this.f5953c) + s10] = 4;
                    }
                    s9 = (short) (s10 + 1);
                }
            }
            s7 = (short) (s8 + 1);
        }
        short s11 = s;
        while (true) {
            short s12 = s11;
            if (s12 >= s3) {
                break;
            }
            short s13 = s2;
            while (true) {
                short s14 = s13;
                if (s14 < s4) {
                    if (this.f5960j[(s12 * this.f5953c) + s14] == 0) {
                        m1345a(c0173b, s12, s14, this.f5960j);
                    }
                    s13 = (short) (s14 + 1);
                }
            }
            s11 = (short) (s12 + 1);
        }
        short s15 = s;
        while (true) {
            short s16 = s15;
            if (s16 >= s3) {
                break;
            }
            m1345a(c0173b, s16, (short) -1, this.f5960j);
            m1345a(c0173b, s16, (short) (this.f5950q.f6009t + 1), this.f5960j);
            s15 = (short) (s16 + 1);
        }
        short s17 = s2;
        while (true) {
            short s18 = s17;
            if (s18 >= s4) {
                break;
            }
            m1345a(c0173b, (short) -1, s18, this.f5960j);
            m1345a(c0173b, (short) (this.f5950q.f6008s + 1), s18, this.f5960j);
            s17 = (short) (s18 + 1);
        }
        if (abstractC0623y == null) {
            if (C0727bl.m2610a(j) > 30.0d) {
                GameEngine.PrintLog("buildAndReplaceClearanceCostNew took:" + C0727bl.m2611a(m2610a) + " for:" + this.f5951a);
            }
        }
    }

    /* renamed from: a */
    final void m1345a(C0173b c0173b, short s, short s2, byte[] bArr) {
        int m2357a;
        int i = s - 3;
        int i2 = s2 - 3;
        int i3 = s + 3;
        int i4 = s2 + 3;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > c0173b.f791C - 1) {
            i3 = c0173b.f791C - 1;
        }
        if (i4 > c0173b.f792D - 1) {
            i4 = c0173b.f792D - 1;
        }
        for (int i5 = i; i5 <= i3; i5++) {
            for (int i6 = i2; i6 <= i4; i6++) {
                byte b = bArr[(i5 * this.f5953c) + i6];
                if (b != 0 && (m2357a = CommonUtils.m2357a((int) s, (int) s2, i5, i6)) < b) {
                    bArr[(i5 * this.f5953c) + i6] = (byte) m2357a;
                }
            }
        }
    }

    /* renamed from: b */
    void m1340b(AbstractC0623y abstractC0623y) {
        long j = 0;
        if (abstractC0623y == null) {
            j = C0727bl.m2612a();
        }
        C0173b c0173b = this.f5950q.f6006q;
        byte[] bArr = this.f5960j;
        if (this.f5960j == null) {
            abstractC0623y = null;
        }
        this.f5960j = new byte[this.f5952b * this.f5953c];
        short s = 0;
        short s2 = 0;
        short s3 = this.f5950q.f6008s;
        short s4 = this.f5950q.f6009t;
        if (abstractC0623y != null) {
            if (bArr != null) {
                CommonUtils.m2323a(bArr, this.f5960j);
            }
            c0173b.m6652a(abstractC0623y.f6951ek, abstractC0623y.f6952el);
            Rect cb = abstractC0623y.m5818cb();
            short s5 = (short) c0173b.f800T;
            short s6 = (short) c0173b.f801U;
            s = (short) ((s5 - 5) + cb.f230a);
            s2 = (short) ((s6 - 5) + cb.f231b);
            s3 = (short) (s5 + 5 + cb.f232c);
            s4 = (short) (s6 + 5 + cb.f233d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.f5950q.f6008s) {
            s3 = this.f5950q.f6008s;
        }
        if (s4 > this.f5950q.f6009t) {
            s4 = this.f5950q.f6009t;
        }
        short s7 = s;
        while (true) {
            short s8 = s7;
            if (s8 >= s3) {
                break;
            }
            short s9 = s2;
            while (true) {
                short s10 = s9;
                if (s10 < s4) {
                    this.f5960j[(s8 * this.f5953c) + s10] = m1346a(c0173b, s8, s10);
                    s9 = (short) (s10 + 1);
                }
            }
            s7 = (short) (s8 + 1);
        }
        if (abstractC0623y == null) {
            GameEngine.PrintLog("buildAndReplaceClearanceCost took:" + C0727bl.m2611a(C0727bl.m2610a(j)) + " for:" + this.f5951a);
        }
    }

    /* renamed from: a */
    final byte m1346a(C0173b c0173b, short s, short s2) {
        int m2357a;
        if (this.f5954d[(s * this.f5953c) + s2] == -1) {
            return (byte) 0;
        }
        int i = s2 - 3;
        int i2 = s + 3;
        int i3 = s2 + 3;
        int i4 = 4;
        for (int i5 = s - 3; i5 <= i2; i5++) {
            for (int i6 = i; i6 <= i3; i6++) {
                boolean z = false;
                if (c0173b.m6608c(i5, i6)) {
                    if (this.f5954d[(i5 * this.f5953c) + i6] == -1) {
                        z = true;
                    }
                    if (this.f5955e[(i5 * this.f5953c) + i6] == -1) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                if (z && (m2357a = CommonUtils.m2357a((int) s, (int) s2, i5, i6)) < i4) {
                    i4 = m2357a;
                }
            }
        }
        return (byte) i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1341b() {
        int i = this.f5952b;
        int i2 = this.f5953c;
        this.f5957g = new short[i * i2];
        this.f5958h = new HashMap();
        short s = 1;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 < i) {
                short s4 = 0;
                while (true) {
                    short s5 = s4;
                    if (s5 < i2) {
                        if (this.f5957g[(s3 * i2) + s5] == 0) {
                            if (s <= 0) {
                                Log.m7106d("RustedWarfare", "warning buildIsolatedGroups looped, ending");
                                return;
                            }
                            int m1343a = m1343a(s3, s5, s);
                            if (m1343a > 0) {
                                this.f5958h.put(Short.valueOf(s), Integer.valueOf(m1343a));
                                if (this.f5959i < m1343a) {
                                    this.f5959i = m1343a;
                                }
                                s = (short) (s + 1);
                            }
                        }
                        s4 = (short) (s5 + 1);
                    }
                }
            } else {
                return;
            }
            s2 = (short) (s3 + 1);
        }
    }

    /* renamed from: a */
    int m1343a(short s, short s2, short s3) {
        int i = this.f5953c;
        C0173b c0173b = this.f5950q.f6006q;
        short[] sArr = this.f5957g;
        byte[] bArr = this.f5954d;
        if (bArr[(s * i) + s2] == -1) {
            sArr[(s * i) + s2] = -1;
            return 0;
        } else if (s3 == 0) {
            throw new RuntimeException("id cannot be 0 is will cause can endless loop");
        } else {
            int i2 = 0;
            C1093g c1093g = new C1093g();
            c1093g.add(new C1082ak(s, s2));
            while (!c1093g.isEmpty()) {
                C1082ak c1082ak = (C1082ak) c1093g.m586a();
                short s4 = c1082ak.f6847a;
                short s5 = c1082ak.f6848b;
                if (c0173b.m6608c((int) s4, (int) s5)) {
                    int i3 = (s4 * i) + s5;
                    if (sArr[i3] == 0 && bArr[i3] != -1) {
                        sArr[i3] = s3;
                        i2++;
                        c1093g.add(new C1082ak((short) (s4 - 1), s5));
                        c1093g.add(new C1082ak((short) (s4 + 1), s5));
                        c1093g.add(new C1082ak(s4, (short) (s5 - 1)));
                        c1093g.add(new C1082ak(s4, (short) (s5 + 1)));
                    }
                }
            }
            return i2;
        }
    }

    /* renamed from: c */
    boolean m1339c() {
        return !this.f5951a.equals(EnumC0246ao.f1705d) && !this.f5951a.equals(EnumC0246ao.f1702a);
    }

    /* renamed from: a */
    public static int m1347a(C0173b c0173b) {
        C0178e c0178e = c0173b.f832u;
        int i = 0;
        for (int i2 = 0; i2 < c0178e.f903n; i2++) {
            for (int i3 = 0; i3 < c0178e.f904o; i3++) {
                C0180g m6560a = c0178e.m6560a(i2, i3);
                if (m6560a != null) {
                    i += (0 + (m6560a.f917e ? 1 : 0) + (m6560a.f920h ? 2 : 0) + (m6560a.f923k ? 4 : 0) + (m6560a.f919g ? 8 : 0) + (m6560a.f918f ? 16 : 0)) * (i2 + i3);
                }
            }
        }
        return i;
    }

    /* renamed from: d */
    void m1337d() {
        C0173b c0173b = this.f5950q.f6006q;
        byte[] bArr = this.f5954d;
        short[] m6561a = c0173b.f832u.m6561a();
        C0180g[] c0180gArr = c0173b.f839B;
        EnumC0246ao enumC0246ao = this.f5951a;
        int i = this.f5952b;
        int i2 = this.f5953c;
        if (!m1339c()) {
            return;
        }
        boolean z = enumC0246ao.equals(EnumC0246ao.f1706e) || enumC0246ao.equals(EnumC0246ao.f1707f) || enumC0246ao.equals(EnumC0246ao.f1709h);
        boolean z2 = enumC0246ao.equals(EnumC0246ao.f1707f) || enumC0246ao.equals(EnumC0246ao.f1708g) || enumC0246ao.equals(EnumC0246ao.f1709h);
        boolean z3 = enumC0246ao.equals(EnumC0246ao.f1708g) || enumC0246ao.equals(EnumC0246ao.f1709h);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (i3 * i2) + i4;
                bArr[i5] = 0;
                C0180g c0180g = c0180gArr[m6561a[i5]];
                if (c0180g != null) {
                    if (c0180g.f917e && !z) {
                        bArr[i5] = -1;
                    }
                    if (c0180g.f920h && !z2) {
                        bArr[i5] = -1;
                    }
                    if (c0180g.f923k && !z3) {
                        bArr[i5] = -1;
                    }
                    if (c0180g.f919g && 0 == 0) {
                        bArr[i5] = -1;
                    }
                    if (enumC0246ao == EnumC0246ao.f1706e && !c0180g.f917e && !c0180g.f918f) {
                        bArr[i5] = -1;
                    }
                }
                C0180g m6598e = c0173b.m6598e(i3, i4);
                if (m6598e != null) {
                    if (enumC0246ao == EnumC0246ao.f1703b && m6598e.f921i) {
                        bArr[i5] = -1;
                    }
                    if (m6598e.f923k && !z3) {
                        bArr[i5] = -1;
                    }
                    if (bArr[i5] == 0) {
                        bArr[i5] = m6598e.f922j;
                    }
                }
                if (c0180g != null && bArr[i5] == 0) {
                    bArr[i5] = c0180g.f922j;
                }
            }
        }
        if (c0173b.f790x != null) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 < i2; i7++) {
                    C0180g m6560a = c0173b.f790x.m6560a(i6, i7);
                    if (m6560a != null) {
                        bArr[(i6 * i2) + i7] = 0;
                        if (m6560a.f917e && !z) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (m6560a.f920h && !z2) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (m6560a.f923k && !z3) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (m6560a.f919g && 0 == 0) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (bArr[(i6 * i2) + i7] == 0) {
                            bArr[(i6 * i2) + i7] = m6560a.f922j;
                        }
                        if (enumC0246ao == EnumC0246ao.f1706e && !m6560a.f917e && !m6560a.f918f) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m1338c(AbstractC0623y abstractC0623y) {
        Rect m5818cb;
        if (abstractC0623y != null) {
            this.f5963p++;
            if (this.f5963p > 50) {
                this.f5962o = true;
                return;
            }
        }
        GameEngine.m1214U();
        this.f5955e = new byte[this.f5952b * this.f5953c];
        byte[] bArr = this.f5955e;
        if (this.f5951a.equals(EnumC0246ao.f1705d)) {
            return;
        }
        C0173b c0173b = this.f5950q.f6006q;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit.m5867bI() && !unit.isDead) {
                Point m5895a = unit.m5895a(c0173b, this.f5966n);
                int i2 = m5895a.f224a;
                int i3 = m5895a.f225b;
                if (this.f5951a.equals(EnumC0246ao.f1704c)) {
                    m5818cb = unit.m5817cc();
                } else {
                    m5818cb = unit.m5818cb();
                }
                for (int i4 = i2 + m5818cb.f230a; i4 <= i2 + m5818cb.f232c; i4++) {
                    for (int i5 = i3 + m5818cb.f231b; i5 <= i3 + m5818cb.f233d; i5++) {
                        if (c0173b.m6608c(i4, i5)) {
                            bArr[(i4 * this.f5953c) + i5] = -1;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m1336e() {
        byte[] bArr;
        GameEngine.m1214U();
        int i = this.f5953c;
        this.f5956f = new byte[this.f5952b * i];
        if (this.f5951a.equals(EnumC0246ao.f1705d)) {
            return;
        }
        C0173b c0173b = this.f5950q.f6006q;
        int i2 = c0173b.f786p;
        int i3 = c0173b.f787q;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i4 = 0; i4 < size; i4++) {
            Unit unit = m523a[i4];
            if (unit.collidable && !unit.m5867bI() && !unit.f1647cI && !(unit instanceof Tree) && !unit.isDead && !unit.mo3293i() && unit.f1650cL == null && !unit.mo3294Q()) {
                int i5 = 2;
                c0173b.m6652a(unit.f6951ek, unit.f6952el);
                int i6 = c0173b.f800T;
                int i7 = c0173b.f801U;
                float f = unit.radius + 5.0f;
                float f2 = unit.radius + 10.0f;
                if (f2 < 10.0f) {
                    i5 = 0;
                } else if (f2 < 20.0f) {
                    i5 = 1;
                }
                for (int i8 = i6 - i5; i8 <= i6 + i5; i8++) {
                    for (int i9 = i7 - i5; i9 <= i7 + i5; i9++) {
                        if (c0173b.m6608c(i8, i9)) {
                            c0173b.m6648a(i8, i9);
                            float m2366a = CommonUtils.m2366a(c0173b.f800T + i2, c0173b.f801U + i3, unit.f6951ek, unit.f6952el);
                            int i10 = (i8 * i) + i9;
                            if (m2366a < f * f) {
                                byte[] bArr2 = this.f5956f;
                                bArr2[i10] = (byte) (bArr2[i10] + 6);
                            } else if (m2366a < f2 * f2) {
                                this.f5956f[i10] = (byte) (bArr[i10] + (6 * 0.333d));
                            }
                            if (this.f5956f[i10] < -1) {
                                this.f5956f[i10] = Byte.MAX_VALUE;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1342a(boolean z) {
        if (!z) {
            return;
        }
        if (this.f5961m) {
            this.f5965l = 0;
            this.f5961m = false;
            m1338c(null);
            if (this.f5960j != null) {
                m1344a((AbstractC0623y) null);
            }
        }
        this.f5965l = 0;
    }
}
