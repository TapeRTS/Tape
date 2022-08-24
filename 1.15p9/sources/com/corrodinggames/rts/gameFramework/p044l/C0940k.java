package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b;
import com.corrodinggames.rts.gameFramework.p031b.C0682ac;
import com.corrodinggames.rts.gameFramework.p031b.C0691c;
import com.corrodinggames.rts.gameFramework.p031b.C0694f;
import com.corrodinggames.rts.gameFramework.p031b.C0703n;
import com.corrodinggames.rts.gameFramework.p031b.C0711v;
import com.corrodinggames.rts.gameFramework.p031b.InterfaceC0701l;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/k.class */
public class C0940k implements InterfaceC0941l {

    /* renamed from: a */
    public C0694f f6441a;

    /* renamed from: b */
    public C0703n f6442b;

    /* renamed from: c */
    C0711v f6443c;

    /* renamed from: e */
    Rect f6444e;

    /* renamed from: f */
    RectF f6445f;

    /* renamed from: g */
    C0691c f6446g;

    /* renamed from: h */
    RectF f6447h;

    /* renamed from: i */
    float[] f6448i;

    /* renamed from: j */
    static C0934e f6449j;

    /* renamed from: n */
    C0934e f6450n;

    /* renamed from: o */
    boolean f6451o;

    /* renamed from: d */
    public static boolean f6452d = false;

    /* renamed from: k */
    static Rect f6453k = new Rect(0, 0, 1, 1);

    /* renamed from: l */
    static Paint f6454l = new Paint();

    /* renamed from: m */
    static Rect f6455m = new Rect();

    /* renamed from: b */
    public void m1004b(C0934e c0934e) {
        this.f6441a.m2789a(this.f6441a.m2790a(c0934e.mo398b(), c0934e, this.f6446g));
    }

    /* renamed from: d */
    public void m1002d() {
        this.f6441a.m2796a();
    }

    /* renamed from: a */
    public C0711v m1007a(Paint paint) {
        this.f6442b.m2725a((C0928ae) null);
        if (paint == null) {
            return null;
        }
        this.f6443c.m2676a(paint.m6473d());
        this.f6443c.m2677a(paint.m6469e());
        this.f6443c.m2678a(paint.m6465g());
        return this.f6443c;
    }

    /* renamed from: a */
    public void mo991a(Rect rect) {
        this.f6441a.m2793a(rect.f230a, rect.f231b, rect.f232c, rect.f233d);
    }

    /* renamed from: a */
    public void mo989a(RectF rectF) {
        this.f6441a.m2793a((int) rectF.f234a, (int) rectF.f235b, (int) rectF.f236c, (int) rectF.f237d);
    }

    /* renamed from: a */
    public void mo985a(C0934e c0934e, float f, float f2, Paint paint) {
        this.f6444e.m6447a(0, 0, c0934e.mo390m(), c0934e.mo391l());
        this.f6445f.m6434a(f, f2, f + c0934e.mo390m(), f2 + c0934e.mo391l());
        m1003b(c0934e, this.f6444e, this.f6445f, paint);
    }

    /* renamed from: a */
    public void mo984a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        this.f6445f.m6433a(rect2);
        m1003b(c0934e, rect, this.f6445f, paint);
    }

    /* renamed from: a */
    public AbstractC0690b m1008a(Bitmap bitmap, C0934e c0934e) {
        AbstractC0690b m2826a;
        C0703n c0703n = this.f6442b;
        if (c0703n.f4373a == null) {
            c0703n.f4373a = new C0682ac(c0703n, 1024, 1024);
        }
        if (bitmap.m6553b() < 450 && bitmap.m6550c() < 100 && (m2826a = c0703n.f4373a.m2826a(bitmap)) != null) {
            return m2826a;
        }
        return this.f6441a.m2790a(bitmap, c0934e, this.f6446g);
    }

    /* renamed from: a */
    public void mo983a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        m1003b(c0934e, rect, rectF, paint);
    }

    /* renamed from: b */
    public void m1003b(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        Bitmap m1085a = C0924aa.m1085a(c0934e);
        this.f6447h.m6433a(rect);
        if (m1085a == null) {
            throw new RuntimeException("bitmap==null. sourceImage: " + c0934e.mo407a());
        }
        AbstractC0690b m1008a = m1008a(m1085a, c0934e);
        C0703n c0703n = this.f6442b;
        boolean z = true;
        if (paint == null) {
            c0703n.f4417u = -1;
        } else {
            int m6469e = paint.m6469e();
            if (m6469e != -1 && paint.m6464h() == null) {
                m6469e = Color.m6521a(Color.m6523a(m6469e), 255, 255, 255);
            }
            c0703n.f4417u = m6469e;
            if (paint instanceof C0930ag) {
                z = ((C0930ag) paint).m1042p();
            } else {
                z = paint.m6477c();
            }
        }
        c0703n.m2734a(m1008a, z ? 9729 : 9728);
        C0928ae c0928ae = null;
        if (paint instanceof C0930ag) {
            c0928ae = ((C0930ag) paint).m1041q();
        }
        if (c0934e != null && c0928ae == null) {
            c0928ae = c0934e.mo1069B();
        }
        if (c0928ae != null) {
            boolean mo1011a = c0928ae.mo1011a(paint, c0934e);
            this.f6442b.m2725a(c0928ae);
            if (mo1011a) {
                this.f6442b.mo2757e();
                this.f6442b.m2691m();
            }
        } else {
            this.f6442b.m2725a((C0928ae) null);
        }
        c0703n.m2729a(m1008a, this.f6447h, rectF, this.f6446g, (InterfaceC0701l) null);
    }

    /* renamed from: a */
    public void mo992a(Bitmap bitmap) {
        this.f6441a.m2792a(bitmap);
    }

    /* renamed from: a */
    public void mo995a(float f, float f2, float f3, Paint paint) {
        this.f6441a.m2794a(f, f2, f3, m1007a(paint));
    }

    /* renamed from: a */
    public void mo993a(int i, PorterDuff.Mode mode) {
        this.f6442b.m2721a(m1005b(i));
    }

    /* renamed from: a */
    public void mo994a(int i) {
        this.f6442b.m2721a(m1005b(i));
    }

    /* renamed from: b */
    float[] m1005b(int i) {
        float f = ((i >>> 24) & 255) * 0.003921569f * 1.0f;
        float f2 = ((i >>> 16) & 255) * 0.003921569f * f;
        float f3 = ((i >>> 8) & 255) * 0.003921569f * f;
        this.f6448i[0] = f;
        this.f6448i[1] = f2;
        this.f6448i[2] = f3;
        this.f6448i[3] = (i & 255) * 0.003921569f * f;
        return this.f6448i;
    }

    /* renamed from: a */
    public void mo996a(float f, float f2, float f3, float f4, Paint paint) {
        this.f6441a.m2795a(f, f2, f3, f4, m1007a(paint));
    }

    /* renamed from: a */
    public void mo978a(float[] fArr, int i, int i2, Paint paint) {
        this.f6441a.m2787a(fArr, i, i2, m1007a(paint));
    }

    /* renamed from: b */
    public void m1006b(float f, float f2, float f3, float f4, Paint paint) {
        if (f6449j == null) {
            Bitmap m6562a = Bitmap.m6562a(1, 1, Bitmap.Config.ARGB_8888);
            m6562a.m6564a(0, 0, -1);
            C0934e c0934e = new C0934e();
            c0934e.mo403a(m6562a);
            f6449j = c0934e;
            f6454l.m6503a(new LightingColorFilter(-1, -16777216));
        }
        f6454l.m6481b(paint.m6469e());
        if (paint.m6473d() == Paint.Style.STROKE) {
            float m6465g = paint.m6465g();
            if (m6465g == 0.0f) {
                m6465g = 1.0f;
            }
            this.f6445f.m6434a(f, f2, f3, f2 + m6465g);
            m1003b(f6449j, f6453k, this.f6445f, f6454l);
            this.f6445f.m6434a(f, f4, f3, f4 + m6465g);
            m1003b(f6449j, f6453k, this.f6445f, f6454l);
            this.f6445f.m6434a(f, f2, f + m6465g, f4);
            m1003b(f6449j, f6453k, this.f6445f, f6454l);
            this.f6445f.m6434a(f3, f2, f3 + m6465g, f4);
            m1003b(f6449j, f6453k, this.f6445f, f6454l);
            return;
        }
        this.f6445f.m6434a(f, f2, f3, f4);
        m1003b(f6449j, f6453k, this.f6445f, f6454l);
    }

    /* renamed from: a */
    public void mo990a(Rect rect, Paint paint) {
        m1006b(rect.f230a, rect.f231b, rect.f232c, rect.f233d, paint);
    }

    /* renamed from: a */
    public void mo988a(RectF rectF, Paint paint) {
        m1006b(rectF.f234a, rectF.f235b, rectF.f236c, rectF.f237d, paint);
    }

    /* renamed from: a */
    public void mo981a(String str, float f, float f2, Paint paint) {
        this.f6442b.m2709b((C0928ae) null);
        C0703n.f4425C = this;
        this.f6441a.m2788a(str, f, f2, paint);
    }

    public boolean equals(Object obj) {
        return this.f6441a.equals(obj);
    }

    public int hashCode() {
        return this.f6441a.hashCode();
    }

    /* renamed from: a */
    public void mo1000a() {
        this.f6442b.mo2761c();
    }

    /* renamed from: a */
    public void mo998a(float f, float f2, float f3) {
        C0703n c0703n = this.f6442b;
        c0703n.m2751a(f2, f3);
        c0703n.m2752a(f);
        c0703n.m2751a(-f2, -f3);
    }

    /* renamed from: b */
    public void mo977b() {
        this.f6442b.mo2763b();
    }

    /* renamed from: a */
    public void mo997a(float f, float f2, float f3, float f4) {
        C0703n c0703n = this.f6442b;
        c0703n.m2751a(f3, f4);
        c0703n.m2750a(f, f2, 1.0f);
        c0703n.m2751a(-f3, -f4);
    }

    /* renamed from: a */
    public void mo999a(float f, float f2) {
        this.f6442b.m2750a(f, f2, 1.0f);
    }

    /* renamed from: a */
    public void mo986a(C0934e c0934e) {
        if (this.f6450n != null) {
            m1002d();
        }
        if (c0934e != null) {
            m1004b(c0934e);
        }
        this.f6450n = c0934e;
    }

    public String toString() {
        return this.f6441a.toString();
    }

    /* renamed from: b */
    public void mo976b(float f, float f2) {
        this.f6442b.m2751a(f, f2);
    }

    /* renamed from: a */
    public void mo979a(boolean z) {
        this.f6451o = z;
    }

    /* renamed from: c */
    public boolean mo974c() {
        return this.f6451o;
    }

    /* renamed from: a */
    public void mo982a(AbstractC0942m abstractC0942m) {
        abstractC0942m.mo1001a(GameEngine.m1228A().f6107bO);
    }

    /* renamed from: a */
    public void mo980a(Lock lock) {
    }

    /* renamed from: b */
    public void mo975b(Lock lock) {
    }

    /* renamed from: a */
    public boolean mo987a(C0928ae c0928ae) {
        return this.f6442b.m2700d(c0928ae);
    }
}
