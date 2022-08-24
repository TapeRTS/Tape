package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.l.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/e.class */
public class BitmapOrTexture {

    /* renamed from: a */
    public BitmapOrTexture[] f6382a;

    /* renamed from: b */
    public BitmapOrTexture[] f6383b;

    /* renamed from: c */
    public BitmapOrTexture[] f6384c;

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

    public BitmapOrTexture() {
        int i = f6385x;
        f6385x = i + 1;
        this.f6386d = i;
        this.f6387e = 1;
    }

    /* renamed from: a */
    public BitmapOrTexture[] m1044a(EnumC0198o enumC0198o) {
        if (enumC0198o == EnumC0198o.f1378a) {
            return this.f6382a;
        }
        if (enumC0198o == EnumC0198o.f1379b) {
            return this.f6383b;
        }
        if (enumC0198o == EnumC0198o.f1381d) {
            return this.f6384c;
        }
        GameEngine.m1145b("getTeamImageCache coloringMode:" + enumC0198o);
        return this.f6382a;
    }

    /* renamed from: a */
    public void m1043a(EnumC0198o enumC0198o, BitmapOrTexture[] bitmapOrTextureArr) {
        if (enumC0198o == EnumC0198o.f1378a) {
            this.f6382a = bitmapOrTextureArr;
        } else if (enumC0198o == EnumC0198o.f1379b) {
            this.f6383b = bitmapOrTextureArr;
        } else if (enumC0198o == EnumC0198o.f1381d) {
            this.f6384c = bitmapOrTextureArr;
        } else {
            GameEngine.m1145b("setTeamImageCache coloringMode:" + enumC0198o);
            this.f6382a = bitmapOrTextureArr;
        }
    }

    /* renamed from: a */
    public void m1041a(String str) {
        this.f6389g = str;
    }

    /* renamed from: a */
    public String mo413a() {
        return this.f6389g;
    }

    /* renamed from: b */
    public Bitmap mo404b() {
        return this.f6393k;
    }

    /* renamed from: c */
    public BitmapOrTexture mo403c() {
        return this;
    }

    /* renamed from: a */
    public void mo405a(boolean z) {
        this.f6404o = z;
        m1038e();
    }

    /* renamed from: b */
    public void m1040b(boolean z) {
        this.f6405w = z;
    }

    /* renamed from: d */
    public boolean m1039d() {
        return this.f6405w;
    }

    /* renamed from: e */
    protected void m1038e() {
    }

    /* renamed from: f */
    public boolean m1037f() {
        return this.f6394m;
    }

    /* renamed from: a */
    public void mo409a(Bitmap bitmap) {
        this.f6393k = bitmap;
        this.f6396p = this.f6393k.m7314b();
        this.f6397q = this.f6393k.m7311c();
        mo401g();
    }

    /* renamed from: g */
    public void mo401g() {
        this.f6398r = this.f6396p / 2;
        this.f6399s = this.f6397q / 2;
        this.f6400t = this.f6396p / 2.0f;
        this.f6401u = this.f6397q / 2.0f;
    }

    /* renamed from: a */
    public void mo408a(BitmapOrTexture bitmapOrTexture) {
        bitmapOrTexture.f6404o = this.f6404o;
        bitmapOrTexture.f6396p = this.f6396p;
        bitmapOrTexture.f6397q = this.f6397q;
        bitmapOrTexture.f6398r = this.f6398r;
        bitmapOrTexture.f6399s = this.f6399s;
        bitmapOrTexture.f6400t = this.f6400t;
        bitmapOrTexture.f6401u = this.f6401u;
    }

    /* renamed from: h */
    public BitmapOrTexture mo7524clone() {
        BitmapOrTexture bitmapOrTexture = new BitmapOrTexture();
        bitmapOrTexture.f6404o = this.f6404o;
        if (this.f6393k != null) {
            Bitmap m7320a = this.f6393k.m7320a(this.f6393k.m7309d(), true);
            if (m7320a == null) {
                throw new OutOfMemoryError("Failed to copy bitmap: " + this.f6393k.m7309d());
            }
            bitmapOrTexture.mo409a(m7320a);
        }
        return bitmapOrTexture;
    }

    /* renamed from: a */
    public BitmapOrTexture mo410a(int i, int i2, boolean z) {
        BitmapOrTexture bitmapOrTexture = new BitmapOrTexture();
        bitmapOrTexture.f6404o = this.f6404o;
        if (this.f6393k != null) {
            Bitmap m7323a = Bitmap.m7323a(i, i2, this.f6393k.m7309d());
            bitmapOrTexture.mo409a(m7323a);
            if (z) {
                for (int i3 = 0; i3 < m7323a.m7314b(); i3++) {
                    for (int i4 = 0; i4 < m7323a.m7311c(); i4++) {
                        m7323a.m7325a(i3, i4, this.f6393k.m7326a(i3, i4));
                    }
                }
            }
        }
        return bitmapOrTexture;
    }

    /* renamed from: i */
    public void mo399i() {
        if (this.f6392j == null) {
            mo398j();
        }
    }

    /* renamed from: j */
    public void mo398j() {
        if (this.f6393k == null && GameEngine.f6199aU && !GameEngine.f6202aX) {
            return;
        }
        if (this.f6392j == null) {
            this.f6392j = new int[this.f6396p * this.f6397q];
        }
        this.f6393k.m7315a(this.f6392j, 0, this.f6396p, 0, 0, this.f6396p, this.f6397q);
    }

    /* renamed from: k */
    public boolean m1035k() {
        return true;
    }

    /* renamed from: a */
    public int mo412a(int i, int i2) {
        if (this.f6392j != null) {
            return this.f6392j[i + (i2 * this.f6396p)];
        }
        return this.f6393k.m7326a(i, i2);
    }

    /* renamed from: a */
    public void mo411a(int i, int i2, int i3) {
        if (this.f6392j != null) {
            this.f6392j[i + (i2 * this.f6396p)] = i3;
        } else {
            this.f6393k.m7325a(i, i2, i3);
        }
    }

    /* renamed from: l */
    public int mo397l() {
        return this.f6397q;
    }

    /* renamed from: m */
    public int mo396m() {
        return this.f6396p;
    }

    /* renamed from: n */
    public void mo395n() {
    }

    /* renamed from: o */
    public void mo394o() {
        if (this.f6393k != null) {
            this.f6393k = null;
        }
        if (this.f6405w) {
            GameEngine.m1145b("remove with keepInGPUMemory=true");
        }
    }

    /* renamed from: p */
    public void mo393p() {
        if (this.f6393k == null && GameEngine.f6199aU && !GameEngine.f6201aW) {
            return;
        }
        if (this.f6392j != null) {
            this.f6393k.m7312b(this.f6392j, 0, this.f6396p, 0, 0, this.f6396p, this.f6397q);
            this.f6392j = null;
        }
        this.f6387e++;
    }

    /* renamed from: q */
    public void m1034q() {
    }

    /* renamed from: r */
    public void mo392r() {
        this.f6392j = null;
    }

    /* renamed from: s */
    public void m1033s() {
        mo392r();
    }

    /* renamed from: t */
    public void mo391t() {
    }

    /* renamed from: u */
    public int mo390u() {
        return this.f6396p * this.f6397q * 8;
    }

    /* renamed from: v */
    public void mo389v() {
        this.f6382a = null;
        this.f6383b = null;
        this.f6384c = null;
        this.f6387e++;
    }

    /* renamed from: w */
    public void mo388w() {
    }

    /* renamed from: x */
    public void m1032x() {
    }

    /* renamed from: y */
    public void m1031y() {
    }

    /* renamed from: z */
    public void m1030z() {
    }

    /* renamed from: A */
    public boolean mo419A() {
        return false;
    }

    /* renamed from: B */
    public C0928ae mo1075B() {
        return this.f6391i;
    }

    /* renamed from: a */
    public void mo1074a(C0928ae c0928ae) {
        this.f6391i = c0928ae;
    }
}
