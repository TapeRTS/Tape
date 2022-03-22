package com.corrodinggames.rts.gameFramework.p039j;

import android.graphics.Bitmap;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.gameFramework.j.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/e.class */
public class C0748e {

    /* renamed from: a */
    public C0748e[] f5233a;

    /* renamed from: r */
    private static int f5234r;

    /* renamed from: s */
    private static int f5235s;

    /* renamed from: b */
    public int f5236b;

    /* renamed from: c */
    public int f5237c;

    /* renamed from: d */
    public String f5238d;

    /* renamed from: e */
    public Integer f5239e;

    /* renamed from: f */
    public int[] f5240f;

    /* renamed from: g */
    protected Bitmap f5241g;

    /* renamed from: i */
    public boolean f5243i;

    /* renamed from: k */
    public int f5245k;

    /* renamed from: l */
    public int f5246l;

    /* renamed from: m */
    public int f5247m;

    /* renamed from: n */
    public int f5248n;

    /* renamed from: o */
    public float f5249o;

    /* renamed from: p */
    public float f5250p;

    /* renamed from: q */
    public boolean f5251q;

    /* renamed from: h */
    public boolean f5242h = true;

    /* renamed from: j */
    public boolean f5244j = false;

    public C0748e() {
        int i = f5234r;
        f5234r = i + 1;
        this.f5236b = i;
        int i2 = f5235s;
        f5235s = i2 + 1;
        this.f5237c = i2;
    }

    /* renamed from: a */
    public String mo63a() {
        return this.f5238d;
    }

    /* renamed from: b */
    public Bitmap mo353b() {
        return this.f5241g;
    }

    /* renamed from: c */
    public C0748e mo352c() {
        return this;
    }

    /* renamed from: a */
    public void mo354a(boolean z) {
        this.f5244j = z;
        mo54d();
    }

    /* renamed from: d */
    protected void mo54d() {
    }

    /* renamed from: e */
    public boolean m877e() {
        return this.f5243i;
    }

    /* renamed from: a */
    public void mo356a(Bitmap bitmap) {
        this.f5241g = bitmap;
        this.f5245k = this.f5241g.m4246b();
        this.f5246l = this.f5241g.m4243c();
        mo351f();
    }

    /* renamed from: f */
    public void mo351f() {
        this.f5247m = this.f5245k / 2;
        this.f5248n = this.f5246l / 2;
        this.f5249o = this.f5245k / 2.0f;
        this.f5250p = this.f5246l / 2.0f;
    }

    /* renamed from: a */
    public void mo355a(C0748e eVar) {
        eVar.f5244j = this.f5244j;
        eVar.f5245k = this.f5245k;
        eVar.f5246l = this.f5246l;
        eVar.f5247m = this.f5247m;
        eVar.f5248n = this.f5248n;
        eVar.f5249o = this.f5249o;
        eVar.f5250p = this.f5250p;
    }

    /* renamed from: g */
    public C0748e clone() {
        C0748e eVar = new C0748e();
        eVar.f5244j = this.f5244j;
        if (this.f5241g != null) {
            Bitmap a = this.f5241g.m4252a(this.f5241g.m4241d(), true);
            if (a == null) {
                throw new OutOfMemoryError("Failed to copy bitmap: " + this.f5241g.m4241d());
            }
            eVar.mo356a(a);
        }
        return eVar;
    }

    /* renamed from: a */
    public C0748e mo60a(int i, int i2, boolean z) {
        C0748e eVar = new C0748e();
        eVar.f5244j = this.f5244j;
        if (this.f5241g != null) {
            Bitmap a = Bitmap.m4255a(i, i2, this.f5241g.m4241d());
            eVar.mo356a(a);
            if (z) {
                for (int i3 = 0; i3 < a.m4246b(); i3++) {
                    for (int i4 = 0; i4 < a.m4243c(); i4++) {
                        a.m4257a(i3, i4, this.f5241g.m4258a(i3, i4));
                    }
                }
            }
        }
        return eVar;
    }

    /* renamed from: h */
    public void mo52h() {
        if (this.f5240f == null) {
            mo51i();
        }
    }

    /* renamed from: i */
    public void mo51i() {
        if (this.f5241g != null || !AbstractC0789l.f5471aF || AbstractC0789l.f5473aH) {
            if (this.f5240f == null) {
                this.f5240f = new int[this.f5245k * this.f5246l];
            }
            this.f5241g.m4247a(this.f5240f, 0, this.f5245k, 0, 0, this.f5245k, this.f5246l);
        }
    }

    /* renamed from: j */
    public boolean mo50j() {
        return true;
    }

    /* renamed from: a */
    public int mo62a(int i, int i2) {
        if (this.f5240f != null) {
            return this.f5240f[i + (i2 * this.f5245k)];
        }
        return this.f5241g.m4258a(i, i2);
    }

    /* renamed from: a */
    public void mo61a(int i, int i2, int i3) {
        if (this.f5240f != null) {
            this.f5240f[i + (i2 * this.f5245k)] = i3;
        } else {
            this.f5241g.m4257a(i, i2, i3);
        }
    }

    /* renamed from: k */
    public int mo350k() {
        return this.f5246l;
    }

    /* renamed from: l */
    public int mo349l() {
        return this.f5245k;
    }

    /* renamed from: m */
    public void mo49m() {
    }

    /* renamed from: n */
    public void mo48n() {
        if (this.f5241g != null) {
            this.f5241g = null;
        }
    }

    /* renamed from: o */
    public void mo47o() {
        if (this.f5241g != null || !AbstractC0789l.f5471aF || AbstractC0789l.f5472aG) {
            if (this.f5240f != null) {
                this.f5241g.m4244b(this.f5240f, 0, this.f5245k, 0, 0, this.f5245k, this.f5246l);
                this.f5240f = null;
            }
            if (this.f5241g != null) {
                this.f5241g.m4240e();
            }
        }
    }

    /* renamed from: p */
    public void mo46p() {
    }

    /* renamed from: q */
    public void mo45q() {
        this.f5240f = null;
    }

    /* renamed from: r */
    public void mo44r() {
        mo45q();
    }

    /* renamed from: s */
    public void mo43s() {
    }

    /* renamed from: t */
    public int mo348t() {
        return this.f5245k * this.f5246l * 8;
    }

    /* renamed from: u */
    public void mo347u() {
        this.f5233a = null;
        int i = f5235s;
        f5235s = i + 1;
        this.f5237c = i;
    }

    /* renamed from: v */
    public void mo346v() {
    }

    /* renamed from: w */
    public void mo42w() {
    }

    /* renamed from: x */
    public void mo41x() {
    }

    /* renamed from: y */
    public boolean mo345y() {
        return false;
    }
}
