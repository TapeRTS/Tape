package com.corrodinggames.rts.gameFramework.p037h;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.p012b.C0153e;
import com.corrodinggames.rts.game.p012b.C0155g;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0209ae;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0816ai;
import com.corrodinggames.rts.gameFramework.utility.C0827g;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.h.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/e.class */
public final class C0731e {

    /* renamed from: o */
    private final C0734h f5086o;

    /* renamed from: a */
    EnumC0212ah f5087a;

    /* renamed from: b */
    public final int f5088b;

    /* renamed from: c */
    public final int f5089c;

    /* renamed from: d */
    public byte[] f5090d;

    /* renamed from: e */
    public byte[] f5091e;

    /* renamed from: f */
    public byte[] f5092f;

    /* renamed from: g */
    public short[] f5093g;

    /* renamed from: h */
    public HashMap f5094h;

    /* renamed from: i */
    public int f5095i;

    /* renamed from: j */
    public byte[] f5096j;

    /* renamed from: m */
    public boolean f5099m;

    /* renamed from: k */
    public int f5097k = -99;

    /* renamed from: l */
    public int f5098l = 0;

    /* renamed from: n */
    Point f5100n = new Point();

    C0731e(C0734h hVar, EnumC0212ah ahVar, int i, int i2) {
        this.f5088b = i;
        this.f5089c = i2;
        this.f5086o = hVar;
        this.f5087a = ahVar;
        this.f5090d = new byte[i * i2];
        this.f5086o.f5144r.add(this);
        this.f5086o.f5145s = (C0731e[]) this.f5086o.f5144r.toArray(new C0731e[0]);
        m990a();
    }

    /* renamed from: a */
    void m990a() {
        m980d();
        m979e();
        m978f();
    }

    /* JADX WARN: Type inference failed for: r0v131, types: [long] */
    /* renamed from: a */
    void m986a(AbstractC0515r rVar) {
        double a;
        if (rVar != null) {
            this.f5098l++;
            if (this.f5098l > 50) {
                if (!this.f5099m) {
                    AbstractC0789l.m670d("buildAndReplaceClearanceCost being skipped");
                }
                this.f5099m = true;
                return;
            }
        }
        if (rVar != null) {
            m982b(rVar);
            return;
        }
        char c = 0;
        if (rVar == null) {
            c = C0586bj.m1919a();
        }
        C0148b bVar = this.f5086o.f5140n;
        byte[] bArr = this.f5096j;
        if (this.f5096j == null) {
            rVar = null;
        }
        this.f5096j = new byte[this.f5088b * this.f5089c];
        short s = 0;
        short s2 = 0;
        short s3 = this.f5086o.f5142p;
        short s4 = this.f5086o.f5143q;
        if (rVar != null) {
            if (bArr != null) {
                C0654f.m1481a(bArr, this.f5096j);
            }
            bVar.m3703a(rVar.f5842dH, rVar.f5843dI);
            Rect bO = rVar.mo2645bO();
            short s5 = (short) bVar.f764M;
            short s6 = (short) bVar.f765N;
            s = (short) ((s5 - 5) + bO.f227a);
            s2 = (short) ((s6 - 5) + bO.f228b);
            s3 = (short) (s5 + 5 + bO.f229c);
            s4 = (short) (s6 + 5 + bO.f230d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.f5086o.f5142p) {
            s3 = this.f5086o.f5142p;
        }
        if (s4 > this.f5086o.f5143q) {
            s4 = this.f5086o.f5143q;
        }
        for (short s7 = s; s7 < s3; s7 = (short) (s7 + 1)) {
            for (short s8 = s2; s8 < s4; s8 = (short) (s8 + 1)) {
                boolean z = false;
                if (this.f5090d[(s7 * this.f5089c) + s8] == -1) {
                    z = true;
                }
                if (this.f5091e[(s7 * this.f5089c) + s8] == -1) {
                    z = true;
                }
                if (z) {
                    this.f5096j[(s7 * this.f5089c) + s8] = 0;
                } else {
                    this.f5096j[(s7 * this.f5089c) + s8] = 4;
                }
            }
        }
        for (short s9 = s; s9 < s3; s9 = (short) (s9 + 1)) {
            for (short s10 = s2; s10 < s4; s10 = (short) (s10 + 1)) {
                if (this.f5096j[(s9 * this.f5089c) + s10] == 0) {
                    m987a(bVar, s9, s10, this.f5096j);
                }
            }
        }
        for (short s11 = s; s11 < s3; s11 = (short) (s11 + 1)) {
            m987a(bVar, s11, (short) -1, this.f5096j);
            m987a(bVar, s11, (short) (this.f5086o.f5143q + 1), this.f5096j);
        }
        for (short s12 = s2; s12 < s4; s12 = (short) (s12 + 1)) {
            m987a(bVar, (short) -1, s12, this.f5096j);
            m987a(bVar, (short) (this.f5086o.f5142p + 1), s12, this.f5096j);
        }
        if (rVar == null) {
            if (C0586bj.m1917a((long) c) > 30.0d) {
                AbstractC0789l.m670d("buildAndReplaceClearanceCostNew took:" + C0586bj.m1918a(a) + " for:" + this.f5087a);
            }
        }
    }

    /* renamed from: a */
    final void m987a(C0148b bVar, short s, short s2, byte[] bArr) {
        int a;
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
        if (i3 > bVar.f750y - 1) {
            i3 = bVar.f750y - 1;
        }
        if (i4 > bVar.f751z - 1) {
            i4 = bVar.f751z - 1;
        }
        for (int i5 = i; i5 <= i3; i5++) {
            for (int i6 = i2; i6 <= i4; i6++) {
                byte b = bArr[(i5 * this.f5089c) + i6];
                if (b != 0 && (a = C0654f.m1511a((int) s, (int) s2, i5, i6)) < b) {
                    bArr[(i5 * this.f5089c) + i6] = (byte) a;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v83, types: [long] */
    /* renamed from: b */
    void m982b(AbstractC0515r rVar) {
        char c = 0;
        if (rVar == null) {
            c = C0586bj.m1919a();
        }
        C0148b bVar = this.f5086o.f5140n;
        byte[] bArr = this.f5096j;
        if (this.f5096j == null) {
            rVar = null;
        }
        this.f5096j = new byte[this.f5088b * this.f5089c];
        short s = 0;
        short s2 = 0;
        short s3 = this.f5086o.f5142p;
        short s4 = this.f5086o.f5143q;
        if (rVar != null) {
            if (bArr != null) {
                C0654f.m1481a(bArr, this.f5096j);
            }
            bVar.m3703a(rVar.f5842dH, rVar.f5843dI);
            Rect bO = rVar.mo2645bO();
            short s5 = (short) bVar.f764M;
            short s6 = (short) bVar.f765N;
            s = (short) ((s5 - 5) + bO.f227a);
            s2 = (short) ((s6 - 5) + bO.f228b);
            s3 = (short) (s5 + 5 + bO.f229c);
            s4 = (short) (s6 + 5 + bO.f230d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.f5086o.f5142p) {
            s3 = this.f5086o.f5142p;
        }
        if (s4 > this.f5086o.f5143q) {
            s4 = this.f5086o.f5143q;
        }
        for (short s7 = s; s7 < s3; s7 = (short) (s7 + 1)) {
            for (short s8 = s2; s8 < s4; s8 = (short) (s8 + 1)) {
                this.f5096j[(s7 * this.f5089c) + s8] = m988a(bVar, s7, s8);
            }
        }
        if (rVar == null) {
            AbstractC0789l.m670d("buildAndReplaceClearanceCost took:" + C0586bj.m1918a(C0586bj.m1917a((long) c)) + " for:" + this.f5087a);
        }
    }

    /* renamed from: a */
    final byte m988a(C0148b bVar, short s, short s2) {
        int a;
        if (this.f5090d[(s * this.f5089c) + s2] == -1) {
            return (byte) 0;
        }
        int i = s2 - 3;
        int i2 = s + 3;
        int i3 = s2 + 3;
        int i4 = 4;
        for (int i5 = s - 3; i5 <= i2; i5++) {
            for (int i6 = i; i6 <= i3; i6++) {
                boolean z = false;
                if (bVar.m3661c(i5, i6)) {
                    if (this.f5090d[(i5 * this.f5089c) + i6] == -1) {
                        z = true;
                    }
                    if (this.f5091e[(i5 * this.f5089c) + i6] == -1) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                if (z && (a = C0654f.m1511a((int) s, (int) s2, i5, i6)) < i4) {
                    i4 = a;
                }
            }
        }
        return (byte) i4;
    }

    /* renamed from: b */
    void m983b() {
        int i = this.f5088b;
        int i2 = this.f5089c;
        this.f5093g = new short[i * i2];
        this.f5094h = new HashMap();
        short s = 1;
        for (short s2 = 0; s2 < i; s2 = (short) (s2 + 1)) {
            for (short s3 = 0; s3 < i2; s3 = (short) (s3 + 1)) {
                if (this.f5093g[(s2 * i2) + s3] == 0) {
                    if (s <= 0) {
                        Log.m4033d("RustedWarfare", "warning buildIsolatedGroups looped, ending");
                        return;
                    }
                    int a = m985a(s2, s3, s);
                    if (a > 0) {
                        this.f5094h.put(Short.valueOf(s), Integer.valueOf(a));
                        if (this.f5095i < a) {
                            this.f5095i = a;
                        }
                        s = (short) (s + 1);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    int m985a(short s, short s2, short s3) {
        int i = this.f5089c;
        C0148b bVar = this.f5086o.f5140n;
        short[] sArr = this.f5093g;
        byte[] bArr = this.f5090d;
        if (bArr[(s * i) + s2] == -1) {
            sArr[(s * i) + s2] = -1;
            return 0;
        } else if (s3 == 0) {
            throw new RuntimeException("id cannot be 0 is will cause can endless loop");
        } else {
            int i2 = 0;
            C0827g gVar = new C0827g();
            gVar.add(new C0816ai(s, s2));
            while (!gVar.isEmpty()) {
                C0816ai aiVar = (C0816ai) gVar.m517a();
                short s4 = aiVar.f5739a;
                short s5 = aiVar.f5740b;
                if (bVar.m3661c((int) s4, (int) s5)) {
                    int i3 = (s4 * i) + s5;
                    if (sArr[i3] == 0 && bArr[i3] != -1) {
                        sArr[i3] = s3;
                        i2++;
                        gVar.add(new C0816ai((short) (s4 - 1), s5));
                        gVar.add(new C0816ai((short) (s4 + 1), s5));
                        gVar.add(new C0816ai(s4, (short) (s5 - 1)));
                        gVar.add(new C0816ai(s4, (short) (s5 + 1)));
                    }
                }
            }
            return i2;
        }
    }

    /* renamed from: c */
    boolean m981c() {
        return !this.f5087a.equals(EnumC0212ah.AIR) && !this.f5087a.equals(EnumC0212ah.NONE);
    }

    /* renamed from: a */
    public static int m989a(C0148b bVar) {
        C0153e eVar = bVar.f742r;
        int i = 0;
        for (int i2 = 0; i2 < eVar.f839n; i2++) {
            for (int i3 = 0; i3 < eVar.f840o; i3++) {
                C0155g a = eVar.m3617a(i2, i3);
                if (a != null) {
                    i += (0 + (a.f853e ? 1 : 0) + (a.f856h ? 2 : 0) + (a.f859k ? 4 : 0) + (a.f855g ? 8 : 0) + (a.f854f ? 16 : 0)) * (i2 + i3);
                }
            }
        }
        return i;
    }

    /* renamed from: d */
    void m980d() {
        C0148b bVar = this.f5086o.f5140n;
        byte[] bArr = this.f5090d;
        short[] a = bVar.f742r.m3618a();
        C0155g[] gVarArr = bVar.f749x;
        EnumC0212ah ahVar = this.f5087a;
        int i = this.f5088b;
        int i2 = this.f5089c;
        if (m981c()) {
            boolean z = ahVar.equals(EnumC0212ah.WATER) || ahVar.equals(EnumC0212ah.HOVER) || ahVar.equals(EnumC0212ah.OVER_CLIFF_WATER);
            boolean z2 = ahVar.equals(EnumC0212ah.HOVER) || ahVar.equals(EnumC0212ah.OVER_CLIFF) || ahVar.equals(EnumC0212ah.OVER_CLIFF_WATER);
            boolean z3 = ahVar.equals(EnumC0212ah.OVER_CLIFF) || ahVar.equals(EnumC0212ah.OVER_CLIFF_WATER);
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    bArr[i5] = 0;
                    C0155g gVar = gVarArr[a[i5]];
                    if (gVar != null) {
                        if (gVar.f853e && !z) {
                            bArr[i5] = -1;
                        }
                        if (gVar.f856h && !z2) {
                            bArr[i5] = -1;
                        }
                        if (gVar.f859k && !z3) {
                            bArr[i5] = -1;
                        }
                        if (gVar.f855g && 0 == 0) {
                            bArr[i5] = -1;
                        }
                        if (ahVar == EnumC0212ah.WATER && !gVar.f853e && !gVar.f854f) {
                            bArr[i5] = -1;
                        }
                    }
                    C0155g e = bVar.m3651e(i3, i4);
                    if (e != null) {
                        if (ahVar == EnumC0212ah.LAND && e.f857i) {
                            bArr[i5] = -1;
                        }
                        if (e.f859k && !z3) {
                            bArr[i5] = -1;
                        }
                        if (bArr[i5] == 0) {
                            bArr[i5] = e.f858j;
                        }
                    }
                    if (gVar != null && bArr[i5] == 0) {
                        bArr[i5] = gVar.f858j;
                    }
                }
            }
            if (bVar.f744t != null) {
                for (int i6 = 0; i6 < i; i6++) {
                    for (int i7 = 0; i7 < i2; i7++) {
                        C0155g a2 = bVar.f744t.m3617a(i6, i7);
                        if (a2 != null) {
                            bArr[(i6 * i2) + i7] = 0;
                            if (a2.f853e && !z) {
                                bArr[(i6 * i2) + i7] = -1;
                            }
                            if (a2.f856h && !z2) {
                                bArr[(i6 * i2) + i7] = -1;
                            }
                            if (a2.f859k && !z3) {
                                bArr[(i6 * i2) + i7] = -1;
                            }
                            if (a2.f855g && 0 == 0) {
                                bArr[(i6 * i2) + i7] = -1;
                            }
                            if (bArr[(i6 * i2) + i7] == 0) {
                                bArr[(i6 * i2) + i7] = a2.f858j;
                            }
                            if (ahVar == EnumC0212ah.WATER && !a2.f853e && !a2.f854f) {
                                bArr[(i6 * i2) + i7] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m979e() {
        Rect rect;
        AbstractC0789l.m747N();
        this.f5091e = new byte[this.f5088b * this.f5089c];
        byte[] bArr = this.f5091e;
        if (!this.f5087a.equals(EnumC0212ah.AIR)) {
            C0148b bVar = this.f5086o.f5140n;
            AbstractC0210af[] a = AbstractC0210af.f1442bj.m456a();
            int size = AbstractC0210af.f1442bj.size();
            for (int i = 0; i < size; i++) {
                AbstractC0210af afVar = a[i];
                if (afVar.mo2643bw() && !afVar.f1459bz) {
                    Point a2 = afVar.m3336a(bVar, this.f5100n);
                    int i2 = a2.f221a;
                    int i3 = a2.f222b;
                    if (this.f5087a.equals(EnumC0212ah.BUILDING)) {
                        rect = afVar.mo2644bP();
                    } else {
                        rect = afVar.mo2645bO();
                    }
                    for (int i4 = i2 + rect.f227a; i4 <= i2 + rect.f229c; i4++) {
                        for (int i5 = i3 + rect.f228b; i5 <= i3 + rect.f230d; i5++) {
                            if (bVar.m3661c(i4, i5)) {
                                bArr[(i4 * this.f5089c) + i5] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void m978f() {
        byte[] bArr;
        AbstractC0789l.m747N();
        int i = this.f5089c;
        this.f5092f = new byte[this.f5088b * i];
        if (!this.f5087a.equals(EnumC0212ah.AIR)) {
            C0148b bVar = this.f5086o.f5140n;
            int i2 = bVar.f737m;
            int i3 = bVar.f738n;
            AbstractC0210af[] a = AbstractC0210af.f1442bj.m456a();
            int size = AbstractC0210af.f1442bj.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0210af afVar = a[i4];
                if (afVar.f1458by && !afVar.mo2643bw() && !afVar.f1498cm && !(afVar instanceof C0209ae) && !afVar.f1459bz && !afVar.mo2357i() && afVar.f1501cp == null && !afVar.mo2363P()) {
                    int i5 = 2;
                    bVar.m3703a(afVar.f5842dH, afVar.f5843dI);
                    int i6 = bVar.f764M;
                    int i7 = bVar.f765N;
                    float f = afVar.f1474bO + 5.0f;
                    float f2 = afVar.f1474bO + 10.0f;
                    if (f2 < 10.0f) {
                        i5 = 0;
                    } else if (f2 < 20.0f) {
                        i5 = 1;
                    }
                    for (int i8 = i6 - i5; i8 <= i6 + i5; i8++) {
                        for (int i9 = i7 - i5; i9 <= i7 + i5; i9++) {
                            if (bVar.m3661c(i8, i9)) {
                                bVar.m3699a(i8, i9);
                                float a2 = C0654f.m1520a(bVar.f764M + i2, bVar.f765N + i3, afVar.f5842dH, afVar.f5843dI);
                                int i10 = (i8 * i) + i9;
                                if (a2 < f * f) {
                                    byte[] bArr2 = this.f5092f;
                                    bArr2[i10] = (byte) (bArr2[i10] + 6);
                                } else if (a2 < f2 * f2) {
                                    this.f5092f[i10] = (byte) (bArr[i10] + (6 * 0.333d));
                                }
                                if (this.f5092f[i10] < -1) {
                                    this.f5092f[i10] = Byte.MAX_VALUE;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m984a(boolean z) {
        if (z) {
            if (this.f5099m) {
                this.f5098l = 0;
                this.f5099m = false;
                m979e();
                if (this.f5096j != null) {
                    m986a((AbstractC0515r) null);
                }
            }
            this.f5098l = 0;
        }
    }
}
