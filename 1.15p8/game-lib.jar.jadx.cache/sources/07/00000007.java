package com.corrodinggames.rts.gameFramework.draw;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.HueColor;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.k.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/e.class */
public class BitmapOrTexture {

    /* renamed from: a */
    public BitmapOrTexture[] f5655a;

    /* renamed from: b */
    public BitmapOrTexture[] f5656b;

    /* renamed from: c */
    public BitmapOrTexture[] f5657c;

    /* renamed from: v */
    private static int f5654v;

    /* renamed from: d */
    public int f5658d;

    /* renamed from: f */
    public int f5659f;

    /* renamed from: g */
    public String f5660g;

    /* renamed from: h */
    public Integer textureHandle;

    /* renamed from: i */
    C0857w f5662i;

    /* renamed from: j */
    public int[] f5663j;

    /* renamed from: k */
    protected Bitmap f5664k;

    /* renamed from: m */
    public boolean f5665m;

    /* renamed from: o */
    public int width;

    /* renamed from: p */
    public int height;

    /* renamed from: q */
    public int f5668q;

    /* renamed from: r */
    public int f5669r;

    /* renamed from: s */
    public float f5670s;

    /* renamed from: t */
    public float f5671t;

    /* renamed from: u */
    public boolean f5672u;

    /* renamed from: l */
    public boolean f5673l = true;

    /* renamed from: n */
    public boolean f5674n = false;

    /* renamed from: e */
    public int f5675e = 1;

    public BitmapOrTexture() {
        int i = f5654v;
        f5654v = i + 1;
        this.f5658d = i;
    }

    /* renamed from: a */
    public BitmapOrTexture[] m1018a(HueColor hueColor) {
        if (hueColor == HueColor.f1354a) {
            return this.f5655a;
        }
        if (hueColor == HueColor.f1355b) {
            return this.f5656b;
        }
        if (hueColor == HueColor.f1357d) {
            return this.f5657c;
        }
        GameEngine.log("getTeamImageCache coloringMode:" + hueColor);
        return this.f5655a;
    }

    /* renamed from: a */
    public void m1017a(HueColor hueColor, BitmapOrTexture[] bitmapOrTextureArr) {
        if (hueColor == HueColor.f1354a) {
            this.f5655a = bitmapOrTextureArr;
        } else if (hueColor == HueColor.f1355b) {
            this.f5656b = bitmapOrTextureArr;
        } else if (hueColor == HueColor.f1357d) {
            this.f5657c = bitmapOrTextureArr;
        } else {
            GameEngine.log("setTeamImageCache coloringMode:" + hueColor);
            this.f5655a = bitmapOrTextureArr;
        }
    }

    /* renamed from: a */
    public void m1016a(String str) {
        this.f5660g = str;
    }

    /* renamed from: a */
    public String mo64a() {
        return this.f5660g;
    }

    /* renamed from: b */
    public Bitmap mo378b() {
        return this.f5664k;
    }

    /* renamed from: c */
    public BitmapOrTexture mo377c() {
        return this;
    }

    /* renamed from: a */
    public void mo379a(boolean z) {
        this.f5674n = z;
        mo55d();
    }

    /* renamed from: d */
    protected void mo55d() {
    }

    /* renamed from: e */
    public boolean m1015e() {
        return this.f5665m;
    }

    /* renamed from: a */
    public void mo381a(Bitmap bitmap) {
        this.f5664k = bitmap;
        this.width = this.f5664k.m4763b();
        this.height = this.f5664k.m4760c();
        mo376f();
    }

    /* renamed from: f */
    public void mo376f() {
        this.f5668q = this.width / 2;
        this.f5669r = this.height / 2;
        this.f5670s = this.width / 2.0f;
        this.f5671t = this.height / 2.0f;
    }

    /* renamed from: a */
    public void mo380a(BitmapOrTexture bitmapOrTexture) {
        bitmapOrTexture.f5674n = this.f5674n;
        bitmapOrTexture.width = this.width;
        bitmapOrTexture.height = this.height;
        bitmapOrTexture.f5668q = this.f5668q;
        bitmapOrTexture.f5669r = this.f5669r;
        bitmapOrTexture.f5670s = this.f5670s;
        bitmapOrTexture.f5671t = this.f5671t;
    }

    /* renamed from: g */
    public BitmapOrTexture clone() {
        BitmapOrTexture bitmapOrTexture = new BitmapOrTexture();
        bitmapOrTexture.f5674n = this.f5674n;
        if (this.f5664k != null) {
            Bitmap m4769a = this.f5664k.m4769a(this.f5664k.m4758d(), true);
            if (m4769a == null) {
                throw new OutOfMemoryError("Failed to copy bitmap: " + this.f5664k.m4758d());
            }
            bitmapOrTexture.mo381a(m4769a);
        }
        return bitmapOrTexture;
    }

    /* renamed from: a */
    public BitmapOrTexture mo61a(int i, int i2, boolean z) {
        BitmapOrTexture bitmapOrTexture = new BitmapOrTexture();
        bitmapOrTexture.f5674n = this.f5674n;
        if (this.f5664k != null) {
            Bitmap m4772a = Bitmap.m4772a(i, i2, this.f5664k.m4758d());
            bitmapOrTexture.mo381a(m4772a);
            if (z) {
                for (int i3 = 0; i3 < m4772a.m4763b(); i3++) {
                    for (int i4 = 0; i4 < m4772a.m4760c(); i4++) {
                        m4772a.m4774a(i3, i4, this.f5664k.m4775a(i3, i4));
                    }
                }
            }
        }
        return bitmapOrTexture;
    }

    /* renamed from: h */
    public void mo53h() {
        if (this.f5663j == null) {
            mo52i();
        }
    }

    /* renamed from: i */
    public void mo52i() {
        if (this.f5664k == null && GameEngine.isDedicatedServer && !GameEngine.isJava) {
            return;
        }
        if (this.f5663j == null) {
            this.f5663j = new int[this.width * this.height];
        }
        this.f5664k.m4764a(this.f5663j, 0, this.width, 0, 0, this.width, this.height);
    }

    /* renamed from: j */
    public boolean mo51j() {
        return true;
    }

    /* renamed from: a */
    public int mo63a(int i, int i2) {
        if (this.f5663j != null) {
            return this.f5663j[i + (i2 * this.width)];
        }
        return this.f5664k.m4775a(i, i2);
    }

    /* renamed from: a */
    public void mo62a(int i, int i2, int i3) {
        if (this.f5663j != null) {
            this.f5663j[i + (i2 * this.width)] = i3;
        } else {
            this.f5664k.m4774a(i, i2, i3);
        }
    }

    /* renamed from: k */
    public int getHeight() {
        return this.height;
    }

    /* renamed from: l */
    public int getWidth() {
        return this.width;
    }

    /* renamed from: m */
    public void mo50m() {
    }

    /* renamed from: n */
    public void mo49n() {
        if (this.f5664k != null) {
            this.f5664k = null;
        }
    }

    /* renamed from: o */
    public void mo48o() {
        if (this.f5664k == null && GameEngine.isDedicatedServer && !GameEngine.isPC_Device) {
            return;
        }
        if (this.f5663j != null) {
            this.f5664k.m4761b(this.f5663j, 0, this.width, 0, 0, this.width, this.height);
            this.f5663j = null;
        }
        this.f5675e++;
    }

    /* renamed from: p */
    public void mo47p() {
    }

    /* renamed from: q */
    public void mo46q() {
        this.f5663j = null;
    }

    /* renamed from: r */
    public void mo45r() {
        mo46q();
    }

    /* renamed from: s */
    public void mo44s() {
    }

    /* renamed from: t */
    public int mo373t() {
        return this.width * this.height * 8;
    }

    /* renamed from: u */
    public void mo372u() {
        this.f5655a = null;
        this.f5656b = null;
        this.f5657c = null;
        this.f5675e++;
    }

    /* renamed from: v */
    public void mo371v() {
    }

    /* renamed from: w */
    public void mo43w() {
    }

    /* renamed from: x */
    public void mo42x() {
    }

    /* renamed from: y */
    public void m1014y() {
    }

    /* renamed from: z */
    public boolean mo370z() {
        return false;
    }

    /* renamed from: A */
    public C0857w mo955A() {
        return this.f5662i;
    }

    /* renamed from: a */
    public void mo954a(C0857w c0857w) {
        this.f5662i = c0857w;
    }
}