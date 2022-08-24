package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ah.class */
public abstract class AbstractC0687ah extends AbstractC0690b {

    /* renamed from: l */
    private static HashMap f4332l = new HashMap();

    /* renamed from: o */
    private static C0689ai f4333o = new C0689ai();

    /* renamed from: p */
    private boolean f4334p;

    /* renamed from: q */
    private boolean f4335q;

    /* renamed from: r */
    private boolean f4336r;

    /* renamed from: s */
    private boolean f4337s;

    /* renamed from: t */
    private boolean f4338t;

    /* renamed from: u */
    private static int f4339u;

    /* renamed from: m */
    protected Bitmap f4340m;

    /* renamed from: v */
    private int f4341v;

    /* renamed from: n */
    int f4342n;

    /* renamed from: k */
    protected abstract Bitmap mo2797k();

    /* renamed from: a */
    protected abstract void mo2798a(Bitmap bitmap);

    protected AbstractC0687ah() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0687ah(boolean z) {
        super(null, 0, 0);
        this.f4334p = true;
        this.f4335q = false;
        this.f4336r = false;
        this.f4337s = false;
        this.f4338t = false;
        this.f4342n = 9729;
        if (z) {
            m2808a(true);
            this.f4341v = 1;
        }
    }

    /* renamed from: a */
    private static Bitmap m2822a(boolean z, Bitmap.Config config, int i) {
        Bitmap m6562a;
        C0689ai c0689ai = f4333o;
        c0689ai.f4343a = z;
        c0689ai.f4344b = config;
        c0689ai.f4345c = i;
        Bitmap bitmap = (Bitmap) f4332l.get(c0689ai);
        if (bitmap == null) {
            if (z) {
                m6562a = Bitmap.m6562a(1, i, config);
            } else {
                m6562a = Bitmap.m6562a(i, 1, config);
            }
            bitmap = m6562a;
            f4332l.put(c0689ai.m2815a(), bitmap);
        }
        return bitmap;
    }

    /* renamed from: n */
    private Bitmap m2817n() {
        if (this.f4340m == null) {
            this.f4340m = mo2797k();
            int m6553b = this.f4340m.m6553b() + (this.f4341v * 2);
            int m6550c = this.f4340m.m6550c() + (this.f4341v * 2);
            if (this.f4348c == -1) {
                m2812a(m6553b, m6550c);
            }
        }
        return this.f4340m;
    }

    /* renamed from: o */
    private void m2816o() {
        mo2798a(this.f4340m);
        this.f4340m = null;
    }

    /* renamed from: b */
    public int mo2807b() {
        if (this.f4348c == -1) {
            m2817n();
        }
        return this.f4348c;
    }

    /* renamed from: c */
    public int mo2806c() {
        if (this.f4348c == -1) {
            m2817n();
        }
        return this.f4349d;
    }

    /* renamed from: l */
    public void m2819l() {
        if (this.f4340m != null) {
            m2816o();
        }
        this.f4334p = false;
    }

    /* renamed from: m */
    public boolean m2818m() {
        return m2802i() && this.f4334p;
    }

    /* renamed from: d */
    public void m2821d(InterfaceC0700k interfaceC0700k) {
        int i;
        if (!m2802i()) {
            if (this.f4338t) {
                int i2 = f4339u + 1;
                f4339u = i2;
                if (i2 > 100) {
                    return;
                }
            }
            m2820e(interfaceC0700k);
        } else if (!this.f4334p) {
            Bitmap m2817n = m2817n();
            int internalFormat = GLUtils.getInternalFormat(m2817n);
            try {
                i = GLUtils.getType(m2817n);
            } catch (IllegalArgumentException e) {
                GameEngine.m1182a("updateContent: GLUtils.getType failed, defaulting to GL_UNSIGNED_BYTE", (Throwable) e);
                i = 5121;
            }
            interfaceC0700k.mo2767a(this, this.f4341v, this.f4341v, m2817n, internalFormat, i);
            m2816o();
            this.f4334p = true;
        }
    }

    /* renamed from: b */
    public void mo2672b(int i) {
        if (this.f4342n != i) {
            if (this.f4334p) {
                int mo2669g = mo2669g();
                GLES20.glTexParameterf(mo2669g, 10241, i);
                GLES20.glTexParameterf(mo2669g, 10240, i);
            }
            this.f4342n = i;
        }
    }

    /* renamed from: h */
    public int mo2668h() {
        return this.f4342n;
    }

    /* renamed from: e */
    private void m2820e(InterfaceC0700k interfaceC0700k) {
        int i;
        Bitmap m2817n = m2817n();
        if (m2817n != null) {
            try {
                int m6553b = m2817n.m6553b();
                int m6550c = m2817n.m6550c();
                int i2 = m6553b + (this.f4341v * 2);
                int i3 = m6550c + (this.f4341v * 2);
                int d = m2805d();
                int e = m2804e();
                this.f4346a = interfaceC0700k.mo2775a().mo2680a();
                this.f4334p = true;
                interfaceC0700k.mo2758d(this);
                if (m6553b == d && m6550c == e) {
                    interfaceC0700k.mo2766a(this, m2817n, 0);
                    C0703n.m2689o();
                } else {
                    int internalFormat = GLUtils.getInternalFormat(m2817n);
                    try {
                        i = GLUtils.getType(m2817n);
                    } catch (IllegalArgumentException e2) {
                        GameEngine.m1182a("uploadToCanvas: GLUtils.getType failed, defaulting to GL_UNSIGNED_BYTE", (Throwable) e2);
                        i = 5121;
                    }
                    Bitmap.Config m6548d = m2817n.m6548d();
                    interfaceC0700k.mo2769a(this, internalFormat, i, internalFormat);
                    C0703n.m2689o();
                    interfaceC0700k.mo2767a(this, this.f4341v, this.f4341v, m2817n, internalFormat, i);
                    C0703n.m2689o();
                    if (this.f4341v > 0) {
                        interfaceC0700k.mo2767a(this, 0, 0, m2822a(true, m6548d, e), internalFormat, i);
                        interfaceC0700k.mo2767a(this, 0, 0, m2822a(false, m6548d, d), internalFormat, i);
                    }
                    if (this.f4341v > 0) {
                        if (this.f4341v + m6553b < d) {
                            interfaceC0700k.mo2767a(this, this.f4341v + m6553b, 0, m2822a(true, m6548d, e), internalFormat, i);
                        }
                        if (this.f4341v + m6550c < e) {
                            interfaceC0700k.mo2767a(this, 0, this.f4341v + m6550c, m2822a(false, m6548d, d), internalFormat, i);
                        }
                    }
                }
                m2809a(interfaceC0700k);
                this.f4347b = 1;
                this.f4334p = true;
                return;
            } finally {
                m2816o();
            }
        }
        this.f4347b = -1;
        throw new RuntimeException("Texture load fail, no bitmap");
    }

    /* renamed from: c */
    public boolean mo2670c(InterfaceC0700k interfaceC0700k) {
        m2821d(interfaceC0700k);
        this.f4356i++;
        return m2818m();
    }

    /* renamed from: b */
    public void mo2671b(InterfaceC0700k interfaceC0700k) {
        this.f4346a = interfaceC0700k.mo2775a().mo2680a();
        if (3553 == 3553) {
            interfaceC0700k.mo2769a(this, 6408, 5121, 6408);
        }
        interfaceC0700k.mo2758d(this);
        this.f4347b = 1;
        m2809a(interfaceC0700k);
    }

    /* renamed from: g */
    public int mo2669g() {
        return 3553;
    }

    /* renamed from: j */
    public void mo2801j() {
        super.mo2801j();
        if (this.f4340m != null) {
            m2816o();
        }
    }
}
