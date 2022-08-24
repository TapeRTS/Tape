package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.l.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/e.class */
public class C0934e {

    /* renamed from: a */
    public C0934e[] f6382a;

    /* renamed from: b */
    public C0934e[] f6383b;

    /* renamed from: c */
    public C0934e[] f6384c;

    /* renamed from: x */
    private static int f6385x;

    /* renamed from: d */
    public int f6386d;

    /* renamed from: e */
    public int f6387e;

    /* renamed from: f */
    public int f6388f;

    /* renamed from: g */
    public String f6389g;

    /* renamed from: h */
    public Integer f6390h;

    /* renamed from: i */
    C0928ae f6391i;

    /* renamed from: j */
    public int[] f6392j;

    /* renamed from: k */
    protected Bitmap f6393k;

    /* renamed from: m */
    public boolean f6394m;

    /* renamed from: n */
    public boolean f6395n;

    /* renamed from: p */
    public int f6396p;

    /* renamed from: q */
    public int f6397q;

    /* renamed from: r */
    public int f6398r;

    /* renamed from: s */
    public int f6399s;

    /* renamed from: t */
    public float f6400t;

    /* renamed from: u */
    public float f6401u;

    /* renamed from: v */
    public boolean f6402v;

    /* renamed from: l */
    public boolean f6403l = true;

    /* renamed from: o */
    public boolean f6404o = false;

    /* renamed from: w */
    boolean f6405w = false;

    public C0934e() {
        int i = f6385x;
        f6385x = i + 1;
        this.f6386d = i;
        this.f6387e = 1;
    }

    /* renamed from: a */
    public C0934e[] m1038a(EnumC0198o enumC0198o) {
        if (enumC0198o == EnumC0198o.pureGreen) {
            return this.f6382a;
        }
        if (enumC0198o == EnumC0198o.hueAdd) {
            return this.f6383b;
        }
        if (enumC0198o == EnumC0198o.hueShift) {
            return this.f6384c;
        }
        GameEngine.m1139b("getTeamImageCache coloringMode:" + enumC0198o);
        return this.f6382a;
    }

    /* renamed from: a */
    public void m1037a(EnumC0198o enumC0198o, C0934e[] c0934eArr) {
        if (enumC0198o == EnumC0198o.pureGreen) {
            this.f6382a = c0934eArr;
        } else if (enumC0198o == EnumC0198o.hueAdd) {
            this.f6383b = c0934eArr;
        } else if (enumC0198o == EnumC0198o.hueShift) {
            this.f6384c = c0934eArr;
        } else {
            GameEngine.m1139b("setTeamImageCache coloringMode:" + enumC0198o);
            this.f6382a = c0934eArr;
        }
    }

    /* renamed from: a */
    public void m1035a(String str) {
        this.f6389g = str;
    }

    /* renamed from: a */
    public String mo407a() {
        return this.f6389g;
    }

    /* renamed from: b */
    public Bitmap mo398b() {
        return this.f6393k;
    }

    /* renamed from: c */
    public C0934e mo397c() {
        return this;
    }

    /* renamed from: a */
    public void mo399a(boolean z) {
        this.f6404o = z;
        m1032e();
    }

    /* renamed from: b */
    public void m1034b(boolean z) {
        this.f6405w = z;
    }

    /* renamed from: d */
    public boolean m1033d() {
        return this.f6405w;
    }

    /* renamed from: e */
    protected void m1032e() {
    }

    /* renamed from: f */
    public boolean m1031f() {
        return this.f6394m;
    }

    /* renamed from: a */
    public void mo403a(Bitmap bitmap) {
        this.f6393k = bitmap;
        this.f6396p = this.f6393k.m6553b();
        this.f6397q = this.f6393k.m6550c();
        mo395g();
    }

    /* renamed from: g */
    public void mo395g() {
        this.f6398r = this.f6396p / 2;
        this.f6399s = this.f6397q / 2;
        this.f6400t = this.f6396p / 2.0f;
        this.f6401u = this.f6397q / 2.0f;
    }

    /* renamed from: a */
    public void mo402a(C0934e c0934e) {
        c0934e.f6404o = this.f6404o;
        c0934e.f6396p = this.f6396p;
        c0934e.f6397q = this.f6397q;
        c0934e.f6398r = this.f6398r;
        c0934e.f6399s = this.f6399s;
        c0934e.f6400t = this.f6400t;
        c0934e.f6401u = this.f6401u;
    }

    /* renamed from: h */
    public C0934e mo6756clone() {
        C0934e c0934e = new C0934e();
        c0934e.f6404o = this.f6404o;
        if (this.f6393k != null) {
            Bitmap m6559a = this.f6393k.m6559a(this.f6393k.m6548d(), true);
            if (m6559a == null) {
                throw new OutOfMemoryError("Failed to copy bitmap: " + this.f6393k.m6548d());
            }
            c0934e.mo403a(m6559a);
        }
        return c0934e;
    }

    /* renamed from: a */
    public C0934e mo404a(int i, int i2, boolean z) {
        C0934e c0934e = new C0934e();
        c0934e.f6404o = this.f6404o;
        if (this.f6393k != null) {
            Bitmap m6562a = Bitmap.m6562a(i, i2, this.f6393k.m6548d());
            c0934e.mo403a(m6562a);
            if (z) {
                for (int i3 = 0; i3 < m6562a.m6553b(); i3++) {
                    for (int i4 = 0; i4 < m6562a.m6550c(); i4++) {
                        m6562a.m6564a(i3, i4, this.f6393k.m6565a(i3, i4));
                    }
                }
            }
        }
        return c0934e;
    }

    /* renamed from: i */
    public void mo393i() {
        if (this.f6392j == null) {
            mo392j();
        }
    }

    /* renamed from: j */
    public void mo392j() {
        if (this.f6393k == null && GameEngine.f6199aU && !GameEngine.f6202aX) {
            return;
        }
        if (this.f6392j == null) {
            this.f6392j = new int[this.f6396p * this.f6397q];
        }
        this.f6393k.m6554a(this.f6392j, 0, this.f6396p, 0, 0, this.f6396p, this.f6397q);
    }

    /* renamed from: k */
    public boolean m1029k() {
        return true;
    }

    /* renamed from: a */
    public int mo406a(int i, int i2) {
        if (this.f6392j != null) {
            return this.f6392j[i + (i2 * this.f6396p)];
        }
        return this.f6393k.m6565a(i, i2);
    }

    /* renamed from: a */
    public void mo405a(int i, int i2, int i3) {
        if (this.f6392j != null) {
            this.f6392j[i + (i2 * this.f6396p)] = i3;
        } else {
            this.f6393k.m6564a(i, i2, i3);
        }
    }

    /* renamed from: l */
    public int mo391l() {
        return this.f6397q;
    }

    /* renamed from: m */
    public int mo390m() {
        return this.f6396p;
    }

    /* renamed from: n */
    public void mo389n() {
    }

    /* renamed from: o */
    public void mo388o() {
        if (this.f6393k != null) {
            this.f6393k = null;
        }
        if (this.f6405w) {
            GameEngine.m1139b("remove with keepInGPUMemory=true");
        }
    }

    /* renamed from: p */
    public void mo387p() {
        if (this.f6393k == null && GameEngine.f6199aU && !GameEngine.f6201aW) {
            return;
        }
        if (this.f6392j != null) {
            this.f6393k.m6551b(this.f6392j, 0, this.f6396p, 0, 0, this.f6396p, this.f6397q);
            this.f6392j = null;
        }
        this.f6387e++;
    }

    /* renamed from: q */
    public void m1028q() {
    }

    /* renamed from: r */
    public void mo386r() {
        this.f6392j = null;
    }

    /* renamed from: s */
    public void m1027s() {
        mo386r();
    }

    /* renamed from: t */
    public void mo385t() {
    }

    /* renamed from: u */
    public int mo384u() {
        return this.f6396p * this.f6397q * 8;
    }

    /* renamed from: v */
    public void mo383v() {
        this.f6382a = null;
        this.f6383b = null;
        this.f6384c = null;
        this.f6387e++;
    }

    /* renamed from: w */
    public void mo382w() {
    }

    /* renamed from: x */
    public void m1026x() {
    }

    /* renamed from: y */
    public void m1025y() {
    }

    /* renamed from: z */
    public void m1024z() {
    }

    /* renamed from: A */
    public boolean mo413A() {
        return false;
    }

    /* renamed from: B */
    public C0928ae mo1069B() {
        return this.f6391i;
    }

    /* renamed from: a */
    public void mo1068a(C0928ae c0928ae) {
        this.f6391i = c0928ae;
    }
}
