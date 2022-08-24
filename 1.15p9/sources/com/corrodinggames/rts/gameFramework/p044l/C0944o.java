package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/o.class */
public final class C0944o extends AbstractC1023u {

    /* renamed from: b */
    int f6457b;

    /* renamed from: a */
    InterfaceC0941l f6458a = new C0939j(null);

    /* renamed from: c */
    final C1101m f6459c = new C1101m();

    /* renamed from: d */
    final C1019q f6460d = new C1019q(Paint.class);

    /* renamed from: e */
    final C1019q f6461e = new C1019q(Rect.class);

    /* renamed from: f */
    final C1019q f6462f = new C1019q(RectF.class);

    /* renamed from: g */
    final C1019q f6463g = new C1019q(Matrix.class);

    /* renamed from: h */
    final C1019q f6464h = new C1019q(C1020r.class);

    /* renamed from: i */
    final C1022t f6465i = new C1022t(200);

    /* renamed from: j */
    int f6466j = 0;

    /* renamed from: k */
    volatile boolean f6467k = false;

    public C0944o() {
        this.f6459c.add(this.f6460d);
        this.f6459c.add(this.f6461e);
        this.f6459c.add(this.f6462f);
        this.f6459c.add(this.f6463g);
        this.f6459c.add(this.f6464h);
    }

    /* renamed from: a */
    public final void m951a(EnumC0946p enumC0946p, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        C1022t c1022t = this.f6465i;
        int i = this.f6466j;
        if (i >= c1022t.f6551a) {
            c1022t.m939a(new C1021s(this));
        }
        C1021s c1021s = c1022t.f6552b[i];
        c1021s.f6544a = enumC0946p;
        Object[] objArr = c1021s.f6545b;
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
        objArr[4] = obj5;
        objArr[5] = obj6;
        objArr[6] = obj7;
        objArr[7] = obj8;
        objArr[8] = obj9;
        objArr[9] = obj10;
        this.f6466j++;
    }

    /* renamed from: a */
    public final void m952a(EnumC0946p enumC0946p, Object obj, Object obj2, Object obj3, Object obj4) {
        C1022t c1022t = this.f6465i;
        int i = this.f6466j;
        if (i >= c1022t.f6551a) {
            c1022t.m939a(new C1021s(this));
        }
        C1021s c1021s = c1022t.f6552b[i];
        c1021s.f6544a = enumC0946p;
        Object[] objArr = c1021s.f6545b;
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
        this.f6466j++;
    }

    /* renamed from: a */
    public final void m953a(EnumC0946p enumC0946p, Object obj, Object obj2) {
        C1022t c1022t = this.f6465i;
        int i = this.f6466j;
        if (i >= c1022t.f6551a) {
            c1022t.m939a(new C1021s(this));
        }
        C1021s c1021s = c1022t.f6552b[i];
        c1021s.f6544a = enumC0946p;
        Object[] objArr = c1021s.f6545b;
        objArr[0] = obj;
        objArr[1] = obj2;
        this.f6466j++;
    }

    /* renamed from: a */
    public final C1021s m954a(EnumC0946p enumC0946p) {
        C1022t c1022t = this.f6465i;
        int i = this.f6466j;
        if (i >= c1022t.f6551a) {
            c1022t.m939a(new C1021s(this));
        }
        C1021s c1021s = c1022t.f6552b[i];
        c1021s.f6544a = enumC0946p;
        this.f6466j++;
        return c1021s;
    }

    /* renamed from: a */
    public void mo979a(boolean z) {
        this.f6467k = z;
    }

    /* renamed from: c */
    public boolean mo974c() {
        return this.f6467k;
    }

    /* renamed from: a */
    public void mo991a(Rect rect) {
        m951a(EnumC0946p.f6474g, this.f6461e.m941a(rect), null, null, null, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public void mo989a(RectF rectF) {
        m951a(EnumC0946p.f6476i, this.f6462f.m940a(rectF), null, null, null, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public void mo985a(C0934e c0934e, float f, float f2, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6460d.m942a(paint);
        }
        C1021s m954a = m954a(EnumC0946p.f6480m);
        m954a.f6545b[0] = c0934e;
        m954a.f6545b[1] = paint;
        m954a.f6546c = f;
        m954a.f6547d = f2;
    }

    /* renamed from: a */
    public void mo984a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        Rect m941a = this.f6461e.m941a(rect);
        Rect m941a2 = this.f6461e.m941a(rect2);
        if (!(paint instanceof C0930ag)) {
            paint = this.f6460d.m942a(paint);
        }
        m952a(EnumC0946p.f6482o, c0934e, m941a, m941a2, paint);
    }

    /* renamed from: a */
    public void mo983a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        Rect m941a = this.f6461e.m941a(rect);
        RectF m940a = this.f6462f.m940a(rectF);
        if (!(paint instanceof C0930ag)) {
            paint = this.f6460d.m942a(paint);
        }
        m952a(EnumC0946p.f6483p, c0934e, m941a, m940a, paint);
    }

    /* renamed from: a */
    public void mo995a(float f, float f2, float f3, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6460d.m942a(paint);
        }
        m952a(EnumC0946p.f6487t, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), paint);
    }

    /* renamed from: a */
    public void mo993a(int i, PorterDuff.Mode mode) {
        m953a(EnumC0946p.f6488u, Integer.valueOf(i), mode);
    }

    /* renamed from: a */
    public void mo994a(int i) {
        m951a(EnumC0946p.f6489v, Integer.valueOf(i), null, null, null, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public void mo996a(float f, float f2, float f3, float f4, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6460d.m942a(paint);
        }
        m951a(EnumC0946p.f6490w, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), paint, null, null, null, null, null);
    }

    /* renamed from: a */
    public void mo978a(float[] fArr, int i, int i2, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6460d.m942a(paint);
        }
        m951a(EnumC0946p.f6500G, fArr, Integer.valueOf(i), Integer.valueOf(i2), paint, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public void mo990a(Rect rect, Paint paint) {
        Rect m941a = this.f6461e.m941a(rect);
        if (!(paint instanceof C0930ag)) {
            paint = this.f6460d.m942a(paint);
        }
        m953a(EnumC0946p.f6506M, m941a, paint);
    }

    /* renamed from: a */
    public void mo988a(RectF rectF, Paint paint) {
        RectF m940a = this.f6462f.m940a(rectF);
        if (!(paint instanceof C0930ag)) {
            paint = this.f6460d.m942a(paint);
        }
        m953a(EnumC0946p.f6507N, m940a, paint);
    }

    /* renamed from: a */
    public void mo981a(String str, float f, float f2, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6460d.m942a(paint);
        }
        m951a(EnumC0946p.f6511R, str, Float.valueOf(f), Float.valueOf(f2), paint, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public void mo1000a() {
        m954a(EnumC0946p.f6516W);
        this.f6457b--;
        if (this.f6457b < 0) {
            GameEngine.m1114g("saveStackSize: " + this.f6457b);
        }
    }

    /* renamed from: a */
    public void mo998a(float f, float f2, float f3) {
        C1021s m954a = m954a(EnumC0946p.f6519Z);
        m954a.f6546c = f;
        m954a.f6547d = f2;
        m954a.f6548e = f3;
    }

    /* renamed from: b */
    public void mo977b() {
        m954a(EnumC0946p.f6520aa);
        this.f6457b++;
        if (this.f6457b <= 0) {
            GameEngine.m1114g("saveStackSize (on save): " + this.f6457b);
        }
    }

    /* renamed from: a */
    public void mo999a(float f, float f2) {
        C1021s m954a = m954a(EnumC0946p.f6525af);
        m954a.f6546c = f;
        m954a.f6547d = f2;
    }

    /* renamed from: a */
    public void mo997a(float f, float f2, float f3, float f4) {
        C1021s m954a = m954a(EnumC0946p.f6526ag);
        m954a.f6546c = f;
        m954a.f6547d = f2;
        m954a.f6548e = f3;
        m954a.f6549f = f4;
    }

    /* renamed from: a */
    public void mo986a(C0934e c0934e) {
        m951a(EnumC0946p.f6527ah, c0934e, null, null, null, null, null, null, null, null, null);
    }

    /* renamed from: b */
    public void mo976b(float f, float f2) {
        m953a(EnumC0946p.f6532am, Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: a */
    public void mo982a(AbstractC0942m abstractC0942m) {
        m953a(EnumC0946p.f6533an, this, abstractC0942m);
    }

    /* renamed from: a */
    public void mo992a(Bitmap bitmap) {
        m953a(EnumC0946p.f6535ap, bitmap, (Object) null);
    }

    /* renamed from: a */
    public void mo980a(Lock lock) {
        m953a(EnumC0946p.f6536aq, lock, (Object) null);
    }

    /* renamed from: b */
    public void mo975b(Lock lock) {
        m953a(EnumC0946p.f6537ar, lock, (Object) null);
    }

    /* renamed from: a */
    public boolean mo987a(C0928ae c0928ae) {
        m953a(EnumC0946p.f6538as, c0928ae, (Object) null);
        return true;
    }
}
