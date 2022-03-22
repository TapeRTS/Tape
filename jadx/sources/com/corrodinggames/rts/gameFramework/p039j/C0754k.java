package com.corrodinggames.rts.gameFramework.p039j;

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
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.EnumC0805u;
import java.io.File;
import java.io.InputStream;
import java.nio.IntBuffer;

/* renamed from: com.corrodinggames.rts.gameFramework.j.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/k.class */
public class C0754k implements AbstractC0755l {

    /* renamed from: q */
    private Context f5262q;

    /* renamed from: r */
    private AbstractC0751h f5263r;

    /* renamed from: s */
    private C0744a f5264s;

    /* renamed from: a */
    public Bitmap f5265a;

    /* renamed from: h */
    C0748e f5272h;

    /* renamed from: i */
    static int[] f5273i;

    /* renamed from: j */
    static Bitmap f5274j;

    /* renamed from: k */
    static IntBuffer f5275k = IntBuffer.allocate(0);

    /* renamed from: l */
    static IntBuffer f5276l = IntBuffer.allocate(0);

    /* renamed from: n */
    static final RectF f5278n = new RectF();

    /* renamed from: o */
    static final RectF f5279o = new RectF();

    /* renamed from: p */
    static Rect f5280p = new Rect();

    /* renamed from: b */
    final Rect f5266b = new Rect();

    /* renamed from: c */
    final Rect f5267c = new Rect();

    /* renamed from: d */
    final RectF f5268d = new RectF();

    /* renamed from: e */
    final RectF f5269e = new RectF();

    /* renamed from: f */
    final Matrix f5270f = new Matrix();

    /* renamed from: g */
    final RectF f5271g = new RectF();

    /* renamed from: m */
    boolean f5277m = false;

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public AbstractC0755l mo177a(C0748e eVar) {
        C0754k kVar = new C0754k();
        kVar.mo188a(this.f5262q);
        Canvas canvas = new Canvas();
        Bitmap b = eVar.mo353b();
        canvas.m4228a(b);
        kVar.f5263r = new C0750g(canvas);
        kVar.f5265a = b;
        return kVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public boolean mo202a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo188a(Context context) {
        this.f5262q = context;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo148b() {
        this.f5272h = new C0759p(mo194a(C0063R.drawable.error_outmem));
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: c */
    public AbstractC0751h mo136c() {
        return this.f5263r;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo166a(AbstractC0751h hVar) {
        this.f5263r = hVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo178a(C0744a aVar) {
        this.f5264s = aVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public C0748e mo194a(int i) {
        return mo189a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public C0748e mo189a(int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inScaled = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f5262q.mo4276e(), i, options);
        if (decodeResource != null) {
            return m850a(decodeResource);
        }
        throw new RuntimeException("Could not load image with resId:" + i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public C0748e mo160a(InputStream inputStream, boolean z) {
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
                AbstractC0789l.m663f("Could not load image from steam");
                return null;
            }
            Log.m4033d("RustedWarfare", "load a:" + z + " as " + decodeStream.m4241d());
            return m850a(decodeStream);
        } catch (OutOfMemoryError e) {
            AbstractC0789l.m721a(EnumC0805u.gameImage, e);
            if (this.f5272h != null) {
                return this.f5272h;
            }
            throw new RuntimeException("outOfMemoryErrorImage==null", e);
        }
    }

    /* renamed from: a */
    public C0748e m850a(Bitmap bitmap) {
        C0748e eVar = new C0748e();
        eVar.mo356a(bitmap);
        return eVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public C0748e mo192a(int i, int i2, boolean z) {
        return mo145b(i, i2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public C0748e mo145b(int i, int i2, boolean z) {
        Bitmap.Config config;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        try {
            Bitmap a = Bitmap.m4255a(i, i2, config);
            if (!z && config == Bitmap.Config.ARGB_8888 && Build.VERSION.SDK_INT >= 12) {
                a.m4248a(false);
            }
            if (a != null) {
                return m850a(a);
            }
            OutOfMemoryError outOfMemoryError = new OutOfMemoryError("createBitmap returned null, possible out of memory");
            AbstractC0789l.m721a(EnumC0805u.gameImageCreate, outOfMemoryError);
            if (this.f5272h != null) {
                return this.f5272h;
            }
            throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
        } catch (OutOfMemoryError e) {
            AbstractC0789l.m721a(EnumC0805u.gameImageCreate, e);
            if (this.f5272h != null) {
                return this.f5272h;
            }
            throw new RuntimeException("outOfMemoryErrorImage==null", e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: d */
    public void mo133d() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo176a(C0748e eVar, float f, float f2, float f3, Paint paint) {
        AbstractC0751h hVar = this.f5263r;
        hVar.mo853b();
        hVar.mo872a(f3 + 90.0f, f, f2);
        mo140b(eVar, f - eVar.f5249o, f2 - eVar.f5250p, paint);
        hVar.mo874a();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo173a(C0748e eVar, Rect rect, float f, float f2, float f3, Paint paint) {
        AbstractC0751h hVar = this.f5263r;
        hVar.mo853b();
        int b = rect.m4134b() >> 1;
        int c = rect.m4130c() >> 1;
        this.f5269e.m4122a(f - b, f2 - c, f + b, f2 + c);
        hVar.mo872a(f3 + 90.0f, f, f2);
        mo169a(eVar, rect, this.f5269e, paint);
        hVar.mo874a();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo170a(C0748e eVar, Rect rect, Rect rect2, Paint paint) {
        Bitmap b = eVar.mo353b();
        if (b != null) {
            this.f5263r.mo863a(b, rect, rect2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo139b(C0748e eVar, Rect rect, Rect rect2, Paint paint) {
        if (!this.f5277m) {
            mo170a(eVar, rect, rect2, paint);
            return;
        }
        Bitmap b = eVar.mo353b();
        boolean e = eVar.m877e();
        if (paint.m4155f() < 255) {
            e = true;
        }
        int b2 = this.f5265a.m4246b();
        int c = this.f5265a.m4243c();
        int b3 = b.m4246b();
        b.m4243c();
        eVar.mo52h();
        int[] iArr = eVar.f5240f;
        if (f5274j != this.f5265a) {
            mo151a(false);
        }
        int[] iArr2 = f5273i;
        int i = rect2.f228b;
        int i2 = rect2.f230d;
        int i3 = rect2.f227a;
        int i4 = rect2.f229c;
        int i5 = rect.f228b;
        int i6 = rect.f230d;
        int i7 = rect.f227a;
        float f = 1.0f;
        float f2 = 1.0f;
        int i8 = rect.f229c - i7;
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
        if (i2 > c - 1) {
            i2 = c - 1;
        }
        if (i <= i2) {
            if (i3 < 0) {
                i7 = (int) (i7 + ((-i3) * f2));
                i3 = 0;
            }
            if (i4 > b2 - 1) {
                i4 = b2 - 1;
            }
            if (i3 <= i4) {
                int i12 = i * b2;
                int i13 = i5 * b3;
                int i14 = i2 * b2;
                float f3 = 0.0f;
                if (!e) {
                    while (i12 < i14) {
                        int i15 = i12 + i3;
                        int i16 = i13 + (((int) f3) * b3) + i7;
                        float f4 = 0.0f;
                        int i17 = i12 + i4;
                        int i18 = i17 - 4;
                        while (i15 < i18) {
                            iArr2[i15] = iArr[i16 + ((int) f4)];
                            float f5 = f4 + f2;
                            int i19 = i15 + 1;
                            iArr2[i19] = iArr[i16 + ((int) f5)];
                            float f6 = f5 + f2;
                            int i20 = i19 + 1;
                            iArr2[i20] = iArr[i16 + ((int) f6)];
                            float f7 = f6 + f2;
                            int i21 = i20 + 1;
                            iArr2[i21] = iArr[i16 + ((int) f7)];
                            f4 = f7 + f2;
                            i15 = i21 + 1;
                        }
                        while (i15 < i17) {
                            iArr2[i15] = iArr[i16 + ((int) f4)];
                            i15++;
                            f4 += f2;
                        }
                        i12 += b2;
                        f3 += f;
                    }
                    return;
                }
                int e2 = paint.m4157e() >>> 24;
                while (i12 < i14) {
                    int i22 = i12 + i3;
                    int i23 = i13 + (((int) f3) * b3) + i7;
                    float f8 = 0.0f;
                    int i24 = i12 + i4;
                    int i25 = -1;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i22 < i24) {
                        int i29 = i23 + ((int) f8);
                        if (i29 != i25) {
                            int i30 = iArr[i29];
                            i26 = ((i30 >>> 24) * e2) >> 8;
                            i27 = i30 & 16711935;
                            i28 = i30 & 65280;
                            if (i26 == 0) {
                                i22++;
                                f8 += f2;
                            } else {
                                i25 = i29;
                            }
                        }
                        int i31 = iArr2[i22];
                        int i32 = i31 & 16711935;
                        int i33 = i31 & 65280;
                        iArr2[i22] = (-16777216) | ((i32 + (((i27 - i32) * i26) >> 8)) & 16711935) | ((i33 + (((i28 - i33) * i26) >> 8)) & 65280);
                        i22++;
                        f8 += f2;
                    }
                    i12 += b2;
                    f3 += f;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo181a(Rect rect, Paint paint) {
        if (!this.f5277m) {
            mo142b(rect, paint);
            return;
        }
        if (f5274j != this.f5265a) {
            mo151a(false);
        }
        int b = this.f5265a.m4246b();
        int c = this.f5265a.m4243c();
        int[] iArr = f5273i;
        int i = rect.f228b;
        int i2 = rect.f230d;
        int i3 = rect.f227a;
        int i4 = rect.f229c;
        if (i < 0) {
            i = 0;
        }
        if (i2 > c - 1) {
            i2 = c - 1;
        }
        if (i <= i2) {
            if (i3 < 0) {
                i3 = 0;
            }
            if (i4 > b - 1) {
                i4 = b - 1;
            }
            if (i3 <= i4) {
                int i5 = i * b;
                int i6 = i2 * b;
                int e = paint.m4157e();
                int i7 = e >>> 24;
                if (!(i7 < 255)) {
                    while (i5 < i6) {
                        int i8 = i5 + i4;
                        for (int i9 = i5 + i3; i9 < i8; i9++) {
                            iArr[i9] = e;
                        }
                        i5 += b;
                    }
                    return;
                }
                int i10 = (e >> 16) & 255;
                int i11 = (e >> 8) & 255;
                int i12 = e & 255;
                float f = i7 * 0.003921569f;
                int i13 = (int) (i10 * f);
                int i14 = (int) (i11 * f);
                int i15 = (int) (i12 * f);
                int i16 = 255 - i7;
                int i17 = (-16777216) | (i13 << 16) | (i14 << 8) | i15;
                while (i5 < i6) {
                    int i18 = i5 + i4;
                    for (int i19 = i5 + i3; i19 < i18; i19++) {
                        int i20 = iArr[i19];
                        iArr[i19] = (((((i20 & 16711935) * i16) >> 8) & 16711935) | ((((i20 & 65280) * i16) >> 8) & 65280)) + i17;
                    }
                    i5 += b;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo151a(boolean z) {
        this.f5277m = true;
        if (f5274j != this.f5265a) {
            int b = this.f5265a.m4246b();
            int c = this.f5265a.m4243c();
            int i = b * c;
            if (f5273i == null || f5273i.length < i) {
                f5273i = new int[i];
            }
            if (!z) {
                this.f5265a.m4247a(f5273i, 0, b, 0, 0, b, c);
            }
            f5274j = this.f5265a;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: e */
    public void mo131e() {
        this.f5277m = false;
        if (f5274j == this.f5265a) {
            int b = this.f5265a.m4246b();
            this.f5265a.m4244b(f5273i, 0, b, 0, 0, b, this.f5265a.m4243c());
            f5274j = null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo169a(C0748e eVar, Rect rect, RectF rectF, Paint paint) {
        Bitmap b = eVar.mo353b();
        if (b != null) {
            this.f5263r.mo862a(b, rect, rectF, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo175a(C0748e eVar, float f, float f2, Paint paint) {
        mo140b(eVar, f - eVar.f5249o, f2 - eVar.f5250p, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo174a(C0748e eVar, float f, float f2, Paint paint, float f3, float f4) {
        Matrix matrix = this.f5270f;
        matrix.mo4198a();
        matrix.mo4194b(f4, f4);
        if (f3 != 0.0f) {
            matrix.mo4196a(f3 + 90.0f, eVar.f5249o, eVar.f5250p);
        }
        matrix.mo4197a(f, f2);
        this.f5263r.mo864a(eVar.mo353b(), matrix, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo140b(C0748e eVar, float f, float f2, Paint paint) {
        Bitmap b = eVar.mo353b();
        if (b != null) {
            this.f5263r.mo865a(b, f, f2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo172a(C0748e eVar, Rect rect, Paint paint) {
        mo171a(eVar, rect, paint, 0, 0, 0, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo171a(C0748e eVar, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        if (eVar.mo349l() != 0 && eVar.mo350k() != 0) {
            if (i != 0) {
                i %= eVar.mo349l();
                if (i < 0) {
                    i += eVar.mo349l();
                }
            }
            if (i2 != 0) {
                i2 %= eVar.mo350k();
                if (i2 < 0) {
                    i2 += eVar.mo350k();
                }
            }
            int i5 = rect.f227a - i;
            int i6 = rect.f228b - i2;
            int l = eVar.mo349l();
            int k = eVar.mo350k();
            while (i5 < rect.f229c) {
                while (i6 < rect.f230d) {
                    int i7 = rect.f229c - i5;
                    if (i7 > l) {
                        i7 = l;
                    }
                    int i8 = rect.f230d - i6;
                    if (i8 > k) {
                        i8 = k;
                    }
                    if (i8 > 0 && i7 > 0) {
                        this.f5266b.m4136a(0, 0, i7, i8);
                        this.f5267c.m4136a(i5, i6, i5 + i7, i6 + i8);
                        int i9 = this.f5267c.f227a - rect.f227a;
                        if (i9 < 0) {
                            this.f5266b.f227a -= i9;
                            this.f5267c.f227a -= i9;
                        }
                        int i10 = this.f5267c.f228b - rect.f228b;
                        if (i10 < 0) {
                            this.f5266b.f228b -= i10;
                            this.f5267c.f228b -= i10;
                        }
                        mo170a(eVar, this.f5266b, this.f5267c, paint);
                        i6 += k - i4;
                    }
                }
                i5 += l - i3;
                i6 = rect.f228b - i2;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo168a(C0748e eVar, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        Rect rect;
        Rect rect2;
        if (eVar.mo349l() != 0 && eVar.mo350k() != 0) {
            if (f != 0.0f) {
                f %= eVar.mo349l();
                if (f < 0.0f) {
                    f += eVar.mo349l();
                }
            }
            if (f2 != 0.0f) {
                f2 %= eVar.mo350k();
                if (f2 < 0.0f) {
                    f2 += eVar.mo350k();
                }
            }
            float f3 = rectF.f231a - f;
            float f4 = rectF.f232b - f2;
            int l = eVar.mo349l();
            int k = eVar.mo350k();
            while (f3 < rectF.f233c) {
                while (f4 < rectF.f234d) {
                    float f5 = rectF.f233c - f3;
                    if (f5 > l) {
                        f5 = l;
                    }
                    float f6 = rectF.f234d - f4;
                    if (f6 > k) {
                        f6 = k;
                    }
                    if (f6 > 0.0f && f5 > 0.0f) {
                        this.f5266b.m4136a(0, 0, (int) f5, (int) f6);
                        this.f5268d.m4122a(f3, f4, f3 + f5, f4 + f6);
                        float f7 = this.f5268d.f231a - rectF.f231a;
                        if (f7 < 0.0f) {
                            this.f5266b.f227a = (int) (rect2.f227a - f7);
                            this.f5268d.f231a -= f7;
                        }
                        float f8 = this.f5268d.f232b - rectF.f232b;
                        if (f8 < 0.0f) {
                            this.f5266b.f228b = (int) (rect.f228b - f8);
                            this.f5268d.f232b -= f8;
                        }
                        mo169a(eVar, this.f5266b, this.f5268d, paint);
                        f4 += k - i2;
                    }
                }
                f3 += l - i;
                f4 = rectF.f232b - f2;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo146b(int i) {
        this.f5263r.mo868a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo191a(int i, PorterDuff.Mode mode) {
        this.f5263r.mo867a(i, mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo157a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
        float a = paint.m4179a(str);
        f5279o.m4122a(f, f2, f + a, f2 + mo156a(str, paint));
        f5278n.m4120a(f5279o);
        if (paint.m4150j() == Paint.Align.CENTER) {
            f5278n.m4123a(-(a / 2.0f), 0.0f);
        }
        C0654f.m1503a(f5278n, f3);
        this.f5263r.mo858a(f5278n, paint2);
        mo158a(str, f5279o.f231a + (f3 / 2.0f), f5279o.f234d - (f3 / 2.0f), paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo158a(String str, float f, float f2, Paint paint) {
        this.f5263r.mo856a(str, f, f2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo142b(Rect rect, Paint paint) {
        this.f5263r.mo860a(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo179a(RectF rectF, Paint paint) {
        this.f5263r.mo858a(rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: f */
    public void mo129f() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: g */
    public void mo128g() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: c */
    public void mo134c(Rect rect, Paint paint) {
        this.f5267c.m4136a(rect.f227a, rect.f228b, rect.f227a + rect.f229c, rect.f228b + rect.f230d);
        mo136c().mo860a(this.f5267c, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo182a(Rect rect) {
        mo136c().mo861a(rect);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo180a(RectF rectF) {
        mo136c().mo859a(rectF);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo195a(float f, float f2, float f3, Paint paint) {
        mo136c().mo869a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo149a(float[] fArr, int i, int i2, Paint paint) {
        mo136c().mo854a(fArr, i, i2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: h */
    public void mo127h() {
        mo136c().mo853b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: i */
    public void mo126i() {
        mo136c().mo874a();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: j */
    public void mo125j() {
        mo136c().mo853b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: k */
    public void mo124k() {
        mo136c().mo874a();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo199a(float f, float f2, float f3) {
        mo136c().mo872a(f, f2, f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo200a(float f, float f2) {
        mo136c().mo873a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo198a(float f, float f2, float f3, float f4) {
        mo136c().mo871a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo147b(float f, float f2) {
        mo136c().mo852b(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo197a(float f, float f2, float f3, float f4, Paint paint) {
        mo136c().mo870a(f, f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo165a(AbstractC0752i iVar) {
        mo136c().mo857a(iVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: l */
    public void mo123l() {
        mo191a(0, PorterDuff.Mode.CLEAR);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo187a(Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: m */
    public void mo122m() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: n */
    public void mo121n() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public int mo156a(String str, Paint paint) {
        return (int) paint.m4149k();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public int mo138b(String str, Paint paint) {
        paint.m4177a(str, 0, str.length(), f5280p);
        return f5280p.m4134b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: o */
    public C0748e mo120o() {
        return this.f5272h;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo167a(C0748e eVar, File file) {
        throw new RuntimeException("writeImageToFile not yet supported");
    }
}
