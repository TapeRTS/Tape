package com.corrodinggames.rts.gameFramework.p044l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.File;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/x.class */
public class C1026x implements InterfaceC1027y {

    /* renamed from: a */
    static C1026x f6558a;

    /* renamed from: b */
    static BitmapOrTexture f6559b;

    /* renamed from: c */
    static int[] f6560c;

    /* renamed from: d */
    static Bitmap f6561d;

    /* renamed from: x */
    private Context f6562x;

    /* renamed from: y */
    private InterfaceC0941l f6563y;

    /* renamed from: z */
    private InterfaceC0941l f6564z;

    /* renamed from: A */
    private C0923a f6565A;

    /* renamed from: h */
    public boolean f6566h;

    /* renamed from: i */
    public Bitmap f6567i;

    /* renamed from: j */
    public BitmapOrTexture f6568j;

    /* renamed from: k */
    public int f6569k;

    /* renamed from: l */
    public int f6570l;

    /* renamed from: B */
    private C1026x f6571B;

    /* renamed from: s */
    BitmapOrTexture f6572s;

    /* renamed from: e */
    static IntBuffer f6573e = IntBuffer.allocate(0);

    /* renamed from: f */
    static IntBuffer f6574f = IntBuffer.allocate(0);

    /* renamed from: t */
    static final RectF f6575t = new RectF();

    /* renamed from: u */
    static final RectF f6576u = new RectF();

    /* renamed from: w */
    static Rect f6577w = new Rect();

    /* renamed from: g */
    boolean f6578g = false;

    /* renamed from: m */
    final Rect f6579m = new Rect();

    /* renamed from: n */
    final Rect f6580n = new Rect();

    /* renamed from: o */
    final RectF f6581o = new RectF();

    /* renamed from: p */
    final RectF f6582p = new RectF();

    /* renamed from: q */
    final Matrix f6583q = new Matrix();

    /* renamed from: r */
    final RectF f6584r = new RectF();

    /* renamed from: v */
    C1101m f6585v = new C1101m();

    /* renamed from: a */
    public InterfaceC1027y mo917a(BitmapOrTexture bitmapOrTexture) {
        C1026x c1026x = (C1026x) mo891b(bitmapOrTexture);
        c1026x.f6566h = true;
        return c1026x;
    }

    /* renamed from: b */
    public InterfaceC1027y mo891b(BitmapOrTexture bitmapOrTexture) {
        if (this.f6571B != null) {
            return this.f6571B.mo891b(bitmapOrTexture);
        }
        C1026x c1026x = new C1026x();
        c1026x.mo925a(this.f6562x);
        Canvas canvas = new Canvas();
        Bitmap mo404b = bitmapOrTexture.mo404b();
        canvas.m7297a(mo404b);
        c1026x.f6563y = new C0939j(canvas);
        c1026x.f6564z = c1026x.f6563y;
        c1026x.f6567i = mo404b;
        c1026x.f6568j = bitmapOrTexture;
        c1026x.f6571B = this;
        if (bitmapOrTexture != null) {
            c1026x.f6569k = bitmapOrTexture.mo396m();
            c1026x.f6570l = bitmapOrTexture.mo397l();
        }
        return c1026x;
    }

    /* renamed from: a */
    public boolean mo936a() {
        return false;
    }

    /* renamed from: a */
    public void mo925a(Context context) {
        this.f6562x = context;
    }

    /* renamed from: b */
    public void mo897b() {
        this.f6572s = new C0927ad(mo930a(R.drawable.error_outmem));
    }

    /* renamed from: s */
    private void m937s() {
        C1026x c1026x;
        if (f6558a != this) {
            f6558a = this;
            if (this.f6571B != null) {
                c1026x = this.f6571B;
            } else {
                c1026x = this;
            }
            if (c1026x.m939c()) {
                InterfaceC0941l interfaceC0941l = this.f6563y;
                if (this.f6571B != null) {
                    interfaceC0941l = this.f6571B.f6563y;
                }
                if (!this.f6566h) {
                    if (f6559b != null) {
                        interfaceC0941l.mo992a((BitmapOrTexture) null);
                        f6559b = null;
                    }
                    if (this.f6571B != null) {
                        this.f6563y = this.f6564z;
                        return;
                    }
                    return;
                }
                if (this.f6571B != null) {
                    this.f6563y = interfaceC0941l;
                }
                if (this.f6568j != f6559b) {
                    this.f6563y.mo992a(this.f6568j);
                    f6559b = this.f6568j;
                    return;
                }
                return;
            }
            if (f6559b != null) {
                InterfaceC0941l interfaceC0941l2 = this.f6563y;
                if (this.f6571B != null) {
                    interfaceC0941l2 = this.f6571B.f6563y;
                }
                interfaceC0941l2.mo992a((BitmapOrTexture) null);
                f6559b = null;
            }
            if (this.f6571B != null) {
                this.f6563y = this.f6564z;
            }
        }
    }

    /* renamed from: a */
    private void m942a(Paint paint, String str) {
        m941a(paint, true, str, (BitmapOrTexture) null);
    }

    /* renamed from: b */
    private void m940b(Paint paint) {
        m941a(paint, false, (String) null, (BitmapOrTexture) null);
    }

    /* renamed from: a */
    private void m943a(Paint paint, BitmapOrTexture bitmapOrTexture) {
        m941a(paint, false, (String) null, bitmapOrTexture);
    }

    /* renamed from: c */
    public boolean m939c() {
        if ((this.f6563y instanceof C0944o) || (this.f6563y instanceof C0940k)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m941a(Paint paint, boolean z, String str, BitmapOrTexture bitmapOrTexture) {
        m937s();
    }

    /* renamed from: d */
    public InterfaceC0941l mo885d() {
        return this.f6563y;
    }

    /* renamed from: a */
    public void mo906a(InterfaceC0941l interfaceC0941l) {
        this.f6563y = interfaceC0941l;
    }

    /* renamed from: a */
    public void mo919a(C0923a c0923a) {
        this.f6565A = c0923a;
    }

    /* renamed from: a */
    public BitmapOrTexture mo930a(int i) {
        return mo926a(i, true);
    }

    /* renamed from: a */
    public BitmapOrTexture mo926a(int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inScaled = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f6562x.mo7346e(), i, options);
        if (decodeResource == null) {
            throw new RuntimeException("Could not load image with resId:" + i);
        }
        return m944a(decodeResource);
    }

    /* renamed from: a */
    public BitmapOrTexture mo904a(InputStream inputStream, boolean z) {
        if (inputStream == null) {
            throw new RuntimeException("loadImage: steam is null");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inScaled = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (decodeStream == null) {
                GameEngine.m1120g("Could not load image from steam");
                return null;
            }
            Log.m7106d("RustedWarfare", "load a:" + z + " as " + decodeStream.m7309d());
            return m944a(decodeStream);
        } catch (OutOfMemoryError e) {
            GameEngine.m1195a(EnumC1065u.f6739a, e);
            if (this.f6572s == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e);
            }
            return this.f6572s;
        }
    }

    /* renamed from: a */
    public BitmapOrTexture m944a(Bitmap bitmap) {
        BitmapOrTexture bitmapOrTexture = new BitmapOrTexture();
        bitmapOrTexture.mo409a(bitmap);
        return bitmapOrTexture;
    }

    /* renamed from: a */
    public BitmapOrTexture mo928a(int i, int i2, boolean z) {
        return mo893b(i, i2, z);
    }

    /* renamed from: b */
    public BitmapOrTexture mo893b(int i, int i2, boolean z) {
        Bitmap.Config config;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        try {
            Bitmap m7323a = Bitmap.m7323a(i, i2, config);
            if (m7323a != null && !z && config == Bitmap.Config.ARGB_8888 && Build.VERSION.SDK_INT >= 12) {
                m7323a.m7316a(false);
            }
            if (m7323a == null) {
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("createBitmap returned null, possible out of memory");
                GameEngine.m1195a(EnumC1065u.f6740b, outOfMemoryError);
                if (this.f6572s == null) {
                    throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
                }
                return this.f6572s;
            }
            return m944a(m7323a);
        } catch (OutOfMemoryError e) {
            GameEngine.m1195a(EnumC1065u.f6740b, e);
            if (this.f6572s == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e);
            }
            return this.f6572s;
        }
    }

    /* renamed from: e */
    public void mo884e() {
    }

    /* renamed from: a */
    public void mo916a(BitmapOrTexture bitmapOrTexture, float f, float f2, float f3, Paint paint) {
        InterfaceC0941l interfaceC0941l = this.f6563y;
        interfaceC0941l.mo983b();
        interfaceC0941l.mo1004a(f3 + 90.0f, f, f2);
        mo890b(bitmapOrTexture, f - bitmapOrTexture.f6400t, f2 - bitmapOrTexture.f6401u, paint);
        interfaceC0941l.mo1006a();
    }

    /* renamed from: a */
    public void mo913a(BitmapOrTexture bitmapOrTexture, Rect rect, float f, float f2, float f3, Paint paint) {
        InterfaceC0941l interfaceC0941l = this.f6563y;
        interfaceC0941l.mo983b();
        int m7206b = rect.m7206b() >> 1;
        int m7202c = rect.m7202c() >> 1;
        this.f6582p.m7195a(f - m7206b, f2 - m7202c, f + m7206b, f2 + m7202c);
        interfaceC0941l.mo1004a(f3 + 90.0f, f, f2);
        mo909a(bitmapOrTexture, rect, this.f6582p, paint);
        interfaceC0941l.mo1006a();
    }

    /* renamed from: a */
    public void mo910a(BitmapOrTexture bitmapOrTexture, Rect rect, Rect rect2, Paint paint) {
        if (m938c(bitmapOrTexture) != null) {
            this.f6563y.mo990a(bitmapOrTexture, rect, rect2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    /* renamed from: c */
    public Bitmap m938c(BitmapOrTexture bitmapOrTexture) {
        Bitmap mo404b = bitmapOrTexture.mo404b();
        if (bitmapOrTexture.f6388f != bitmapOrTexture.f6387e) {
            bitmapOrTexture.f6388f = bitmapOrTexture.f6387e;
            mo885d().mo998a(mo404b);
        }
        return mo404b;
    }

    /* renamed from: b */
    public void mo889b(BitmapOrTexture bitmapOrTexture, Rect rect, Rect rect2, Paint paint) {
        if (!this.f6578g) {
            mo910a(bitmapOrTexture, rect, rect2, paint);
            return;
        }
        Bitmap m938c = m938c(bitmapOrTexture);
        boolean m1037f = bitmapOrTexture.m1037f();
        if (paint.m7228f() < 255) {
            m1037f = true;
        }
        int m7314b = this.f6567i.m7314b();
        int m7311c = this.f6567i.m7311c();
        int m7314b2 = m938c.m7314b();
        m938c.m7311c();
        bitmapOrTexture.mo399i();
        int[] iArr = bitmapOrTexture.f6392j;
        if (f6561d != this.f6567i) {
            mo899a(false);
        }
        int[] iArr2 = f6560c;
        int i = rect2.f231b;
        int i2 = rect2.f233d;
        int i3 = rect2.f230a;
        int i4 = rect2.f232c;
        int i5 = rect.f231b;
        int i6 = rect.f233d;
        int i7 = rect.f230a;
        float f = 1.0f;
        float f2 = 1.0f;
        int i8 = rect.f232c - i7;
        int i9 = i6 - i5;
        int i10 = i4 - i3;
        int i11 = i2 - i;
        if (i11 != 0) {
            f = i9 / i11;
        }
        if (i10 != 0) {
            f2 = i8 / i10;
        }
        if (i < 0) {
            i5 = (int) (i5 + ((-i) * f));
            i = 0;
        }
        if (i2 > m7311c - 1) {
            i2 = m7311c - 1;
        }
        if (i > i2) {
            return;
        }
        if (i3 < 0) {
            i7 = (int) (i7 + ((-i3) * f2));
            i3 = 0;
        }
        if (i4 > m7314b - 1) {
            i4 = m7314b - 1;
        }
        if (i3 > i4) {
            return;
        }
        int i12 = i * m7314b;
        int i13 = i5 * m7314b2;
        int i14 = i2 * m7314b;
        float f3 = 0.0f;
        int i15 = i3;
        int i16 = i7;
        int i17 = i4;
        if (!m1037f) {
            while (i12 < i14) {
                int i18 = i12 + i15;
                int i19 = i13 + (((int) f3) * m7314b2) + i16;
                float f4 = 0.0f;
                int i20 = i12 + i17;
                int i21 = i20 - 4;
                while (i18 < i21) {
                    iArr2[i18] = iArr[i19 + ((int) f4)];
                    float f5 = f4 + f2;
                    int i22 = i18 + 1;
                    iArr2[i22] = iArr[i19 + ((int) f5)];
                    float f6 = f5 + f2;
                    int i23 = i22 + 1;
                    iArr2[i23] = iArr[i19 + ((int) f6)];
                    float f7 = f6 + f2;
                    int i24 = i23 + 1;
                    iArr2[i24] = iArr[i19 + ((int) f7)];
                    f4 = f7 + f2;
                    i18 = i24 + 1;
                }
                while (i18 < i20) {
                    iArr2[i18] = iArr[i19 + ((int) f4)];
                    i18++;
                    f4 += f2;
                }
                i12 += m7314b;
                f3 += f;
            }
            return;
        }
        int m7230e = paint.m7230e() >>> 24;
        while (i12 < i14) {
            int i25 = i12 + i15;
            int i26 = i13 + (((int) f3) * m7314b2) + i16;
            float f8 = 0.0f;
            int i27 = i12 + i17;
            int i28 = -1;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i25 < i27) {
                int i32 = i26 + ((int) f8);
                if (i32 != i28) {
                    int i33 = iArr[i32];
                    i29 = ((i33 >>> 24) * m7230e) >> 8;
                    i30 = i33 & 16711935;
                    i31 = i33 & 65280;
                    if (i29 == 0) {
                        i25++;
                        f8 += f2;
                    } else {
                        i28 = i32;
                    }
                }
                int i34 = iArr2[i25];
                int i35 = i34 & 16711935;
                int i36 = i34 & 65280;
                iArr2[i25] = (-16777216) | ((i35 + (((i30 - i35) * i29) >> 8)) & 16711935) | ((i36 + (((i31 - i36) * i29) >> 8)) & 65280);
                i25++;
                f8 += f2;
            }
            i12 += m7314b;
            f3 += f;
        }
    }

    /* renamed from: a */
    public void mo922a(Rect rect, Paint paint) {
        if (!this.f6578g) {
            mo892b(rect, paint);
            return;
        }
        if (f6561d != this.f6567i) {
            mo899a(false);
        }
        int m7314b = this.f6567i.m7314b();
        int m7311c = this.f6567i.m7311c();
        int[] iArr = f6560c;
        int i = rect.f231b;
        int i2 = rect.f233d;
        int i3 = rect.f230a;
        int i4 = rect.f232c;
        if (i < 0) {
            i = 0;
        }
        if (i2 > m7311c - 1) {
            i2 = m7311c - 1;
        }
        if (i > i2) {
            return;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 > m7314b - 1) {
            i4 = m7314b - 1;
        }
        if (i3 > i4) {
            return;
        }
        int i5 = i * m7314b;
        int i6 = i2 * m7314b;
        int i7 = i3;
        int i8 = i4;
        int m7230e = paint.m7230e();
        int i9 = m7230e >>> 24;
        if (!(i9 < 255)) {
            while (i5 < i6) {
                int i10 = i5 + i8;
                for (int i11 = i5 + i7; i11 < i10; i11++) {
                    iArr[i11] = m7230e;
                }
                i5 += m7314b;
            }
            return;
        }
        int i12 = (m7230e >> 16) & 255;
        int i13 = (m7230e >> 8) & 255;
        int i14 = m7230e & 255;
        float f = i9 * 0.003921569f;
        int i15 = (int) (i12 * f);
        int i16 = (int) (i13 * f);
        int i17 = (int) (i14 * f);
        int i18 = 255 - i9;
        int i19 = (-16777216) | (i15 << 16) | (i16 << 8) | i17;
        while (i5 < i6) {
            int i20 = i5 + i8;
            for (int i21 = i5 + i7; i21 < i20; i21++) {
                int i22 = iArr[i21];
                iArr[i21] = (((((i22 & 16711935) * i18) >> 8) & 16711935) | ((((i22 & 65280) * i18) >> 8) & 65280)) + i19;
            }
            i5 += m7314b;
        }
    }

    /* renamed from: a */
    public void mo899a(boolean z) {
        this.f6578g = true;
        if (f6561d == this.f6567i) {
            return;
        }
        int m7314b = this.f6567i.m7314b();
        int m7311c = this.f6567i.m7311c();
        int i = m7314b * m7311c;
        if (f6560c == null || f6560c.length < i) {
            f6560c = new int[i];
        }
        if (!z) {
            this.f6567i.m7315a(f6560c, 0, m7314b, 0, 0, m7314b, m7311c);
        }
        f6561d = this.f6567i;
    }

    /* renamed from: f */
    public void mo883f() {
        this.f6578g = false;
        if (f6561d == this.f6567i) {
            int m7314b = this.f6567i.m7314b();
            this.f6567i.m7312b(f6560c, 0, m7314b, 0, 0, m7314b, this.f6567i.m7311c());
            f6561d = null;
        }
    }

    /* renamed from: a */
    public void mo909a(BitmapOrTexture bitmapOrTexture, Rect rect, RectF rectF, Paint paint) {
        if (m938c(bitmapOrTexture) != null) {
            m943a(paint, bitmapOrTexture);
            this.f6563y.mo989a(bitmapOrTexture, rect, rectF, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    /* renamed from: a */
    public void mo915a(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint) {
        mo890b(bitmapOrTexture, f - bitmapOrTexture.f6400t, f2 - bitmapOrTexture.f6401u, paint);
    }

    /* renamed from: a */
    public void mo914a(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint, float f3, float f4) {
        InterfaceC0941l interfaceC0941l = this.f6563y;
        interfaceC0941l.mo983b();
        if (f3 != 0.0f) {
            interfaceC0941l.mo1004a(f3 + 90.0f, f, f2);
        }
        interfaceC0941l.mo1003a(f4, f4, f, f2);
        m938c(bitmapOrTexture);
        interfaceC0941l.mo991a(bitmapOrTexture, f, f2, paint);
        interfaceC0941l.mo1006a();
    }

    /* renamed from: b */
    public void mo890b(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint) {
        if (m938c(bitmapOrTexture) != null) {
            this.f6563y.mo991a(bitmapOrTexture, f, f2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    /* renamed from: a */
    public void mo912a(BitmapOrTexture bitmapOrTexture, Rect rect, Paint paint) {
        mo911a(bitmapOrTexture, rect, paint, 0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo911a(BitmapOrTexture bitmapOrTexture, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        C0924aa.m1087a(this, bitmapOrTexture, rect, paint, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo908a(BitmapOrTexture bitmapOrTexture, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        C0924aa.m1086a(this, bitmapOrTexture, rectF, paint, f, f2, i, i2);
    }

    /* renamed from: b */
    public void mo894b(int i) {
        m937s();
        this.f6563y.mo1000a(i);
    }

    /* renamed from: a */
    public void mo927a(int i, PorterDuff.Mode mode) {
        m937s();
        this.f6563y.mo999a(i, mode);
    }

    /* renamed from: a */
    public void mo902a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
        float m7254a = paint.m7254a(str);
        f6576u.m7195a(f, f2, f + m7254a, f2 + mo901a(str, paint));
        f6575t.m7193a(f6576u);
        if (paint.m7223j() == Paint.Align.CENTER) {
            f6575t.m7196a(-(m7254a / 2.0f), 0.0f);
        }
        CommonUtils.m2349a(f6575t, f3);
        m940b(paint2);
        this.f6563y.mo994a(f6575t, paint2);
        mo903a(str, f6576u.f234a + (f3 / 2.0f), f6576u.f237d - (f3 / 2.0f), paint);
    }

    /* renamed from: a */
    public void mo903a(String str, float f, float f2, Paint paint) {
        m942a(paint, str);
        this.f6563y.mo987a(str, f, f2, paint);
    }

    /* renamed from: b */
    public void mo892b(Rect rect, Paint paint) {
        m940b(paint);
        this.f6563y.mo996a(rect, paint);
    }

    /* renamed from: a */
    public void mo920a(RectF rectF, Paint paint) {
        m940b(paint);
        this.f6563y.mo994a(rectF, paint);
    }

    /* renamed from: g */
    public void mo882g() {
        if (this.f6585v.size() > 0) {
            synchronized (this.f6585v) {
                Iterator it = this.f6585v.iterator();
                while (it.hasNext()) {
                    this.f6563y.mo993a((C0928ae) it.next());
                }
                this.f6585v.clear();
            }
        }
    }

    /* renamed from: h */
    public void mo881h() {
        m937s();
    }

    /* renamed from: c */
    public void mo886c(Rect rect, Paint paint) {
        this.f6580n.m7208a(rect.f230a, rect.f231b, rect.f230a + rect.f232c, rect.f231b + rect.f233d);
        m940b(paint);
        mo885d().mo996a(this.f6580n, paint);
    }

    /* renamed from: a */
    public void mo923a(Rect rect) {
        if (this.f6567i != null) {
            rect = new Rect(rect);
            int m7311c = this.f6567i.m7311c() - this.f6570l;
        }
        mo885d().mo997a(rect);
    }

    /* renamed from: a */
    public void mo921a(RectF rectF) {
        if (this.f6567i != null) {
            rectF = new RectF(rectF);
            int m7311c = this.f6567i.m7311c() - this.f6570l;
        }
        mo885d().mo995a(rectF);
    }

    /* renamed from: a */
    public void mo931a(float f, float f2, float f3, Paint paint) {
        if (f3 < 50.0f) {
            C0924aa.m1088a(this, f, f2, f3, paint, 1.0f);
            return;
        }
        m940b(paint);
        this.f6563y.mo1001a(f, f2, f3, paint);
    }

    /* renamed from: b */
    public void mo895b(float f, float f2, float f3, Paint paint) {
        m940b(paint);
        this.f6563y.mo1001a(f, f2, f3, paint);
    }

    /* renamed from: a */
    public void mo898a(float[] fArr, int i, int i2, Paint paint) {
        m940b(paint);
        mo885d().mo984a(fArr, i, i2, paint);
    }

    /* renamed from: i */
    public void mo880i() {
        m937s();
        this.f6563y.mo983b();
    }

    /* renamed from: j */
    public void mo879j() {
        m937s();
        this.f6563y.mo1006a();
    }

    /* renamed from: k */
    public void mo878k() {
        m937s();
        this.f6563y.mo983b();
    }

    /* renamed from: l */
    public void mo877l() {
        m937s();
        this.f6563y.mo1006a();
    }

    /* renamed from: a */
    public void mo934a(float f, float f2, float f3) {
        this.f6563y.mo1004a(f, f2, f3);
    }

    /* renamed from: a */
    public void mo935a(float f, float f2) {
        this.f6563y.mo1005a(f, f2);
    }

    /* renamed from: a */
    public void mo933a(float f, float f2, float f3, float f4) {
        this.f6563y.mo1003a(f, f2, f3, f4);
    }

    /* renamed from: b */
    public void mo896b(float f, float f2) {
        this.f6563y.mo982b(f, f2);
    }

    /* renamed from: a */
    public void mo932a(float f, float f2, float f3, float f4, Paint paint) {
        m940b(paint);
        mo885d().mo1002a(f, f2, f3, f4, paint);
    }

    /* renamed from: a */
    public void mo905a(AbstractC0942m abstractC0942m) {
        mo885d().mo988a(abstractC0942m);
    }

    /* renamed from: m */
    public int mo876m() {
        if (this.f6567i != null) {
            return this.f6569k;
        }
        return (int) GameEngine.getInstance().f6128ck;
    }

    /* renamed from: n */
    public int mo875n() {
        if (this.f6567i != null) {
            return this.f6570l;
        }
        return (int) GameEngine.getInstance().f6129cl;
    }

    /* renamed from: a */
    public void mo929a(int i, int i2) {
        this.f6569k = i;
        this.f6570l = i2;
    }

    /* renamed from: o */
    public void mo874o() {
        m940b((Paint) null);
        mo927a(0, PorterDuff.Mode.CLEAR);
    }

    /* renamed from: a */
    public void mo924a(Paint paint) {
    }

    /* renamed from: a */
    public void mo918a(C0928ae c0928ae) {
        if (c0928ae != null) {
            synchronized (this.f6585v) {
                this.f6585v.add(c0928ae);
            }
        }
    }

    /* renamed from: p */
    public void mo873p() {
        m937s();
        if (this.f6567i != null && (this.f6563y instanceof C0939j)) {
            mo885d().mo998a(this.f6567i);
        }
    }

    /* renamed from: q */
    public void mo872q() {
    }

    /* renamed from: a */
    public int mo901a(String str, Paint paint) {
        return (int) paint.m7222k();
    }

    /* renamed from: b */
    public int mo888b(String str, Paint paint) {
        paint.m7252a(str, 0, str.length(), f6577w);
        return f6577w.f230a + f6577w.m7206b();
    }

    /* renamed from: r */
    public BitmapOrTexture mo871r() {
        return this.f6572s;
    }

    /* renamed from: a */
    public void mo907a(BitmapOrTexture bitmapOrTexture, File file) {
        throw new RuntimeException("writeImageToFile not yet supported");
    }

    /* renamed from: a */
    public void mo900a(Lock lock) {
        m937s();
        this.f6563y.mo986a(lock);
    }

    /* renamed from: b */
    public void mo887b(Lock lock) {
        m937s();
        this.f6563y.mo981b(lock);
    }
}
