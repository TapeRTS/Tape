package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.Map;

/* renamed from: com.corrodinggames.rts.gameFramework.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/f.class */
public class C0694f {

    /* renamed from: a */
    protected final InterfaceC0700k f4362a;

    /* renamed from: b */
    private Map f4363b;

    /* renamed from: c */
    private C0670a f4364c;

    /* renamed from: d */
    private C0696g f4365d;

    /* renamed from: e */
    private InterfaceC0685af f4366e;

    /* renamed from: a */
    public void m2789a(AbstractC0690b abstractC0690b) {
        this.f4362a.mo2760c(abstractC0690b);
    }

    /* renamed from: a */
    public void m2796a() {
        this.f4362a.mo2759d();
    }

    /* renamed from: b */
    public InterfaceC0700k m2786b() {
        return this.f4362a;
    }

    /* renamed from: a */
    public AbstractC0690b m2790a(Bitmap bitmap, C0934e c0934e, InterfaceC0685af interfaceC0685af) {
        this.f4366e = interfaceC0685af;
        AbstractC0690b m2791a = m2791a(bitmap, c0934e);
        if (interfaceC0685af instanceof C0698i) {
            m2791a = ((C0698i) interfaceC0685af).m2777a(m2791a, this.f4362a, new InterfaceC0699j() { // from class: com.corrodinggames.rts.gameFramework.b.f.1
                @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0699j
                /* renamed from: a */
                public void mo2776a(AbstractC0690b abstractC0690b, InterfaceC0685af interfaceC0685af2, boolean z) {
                    C0694f.this.f4362a.mo2768a(abstractC0690b, 0, 0, abstractC0690b.mo2807b(), abstractC0690b.mo2806c(), interfaceC0685af2, null);
                }
            });
        }
        return m2791a;
    }

    /* renamed from: a */
    public void m2792a(Bitmap bitmap) {
        AbstractC0690b abstractC0690b = (AbstractC0690b) this.f4363b.get(bitmap);
        if (abstractC0690b != null && (abstractC0690b instanceof AbstractC0687ah)) {
            ((AbstractC0687ah) abstractC0690b).m2819l();
        }
        m2786b().mo2771a(bitmap);
    }

    /* renamed from: a */
    public AbstractC0690b m2791a(Bitmap bitmap, C0934e c0934e) {
        C0693e c0693e = (AbstractC0690b) this.f4363b.get(bitmap);
        if (c0693e == null) {
            this.f4362a.mo2757e();
            m2785c();
            c0693e = new C0693e(bitmap);
            c0693e.mo2670c(m2786b());
            c0693e.f4357j = c0934e.m1033d();
            C0703n.m2712b(c0693e.f4350e, c0693e.f4351f);
            this.f4363b.put(bitmap, c0693e);
            m2784d();
        }
        return c0693e;
    }

    /* renamed from: a */
    public void m2794a(float f, float f2, float f3, C0711v c0711v) {
        if (c0711v.m2674c() == Paint.Style.FILL) {
            this.f4365d.m2782a(0.5f);
        } else {
            float m2675b = c0711v.m2675b();
            if (m2675b == 0.0f) {
                m2675b = 1.0f;
            }
            this.f4365d.m2782a(m2675b / (2.0f * f3));
        }
        this.f4362a.mo2773a(f - f3, f2 - f3, f3, c0711v, this.f4365d);
    }

    /* renamed from: a */
    public void m2795a(float f, float f2, float f3, float f4, C0711v c0711v) {
        this.f4362a.mo2774a(f, f2, f3, f4, c0711v, this.f4364c);
    }

    /* renamed from: c */
    public void m2785c() {
        this.f4362a.mo2763b();
    }

    /* renamed from: d */
    public void m2784d() {
        this.f4362a.mo2761c();
    }

    /* renamed from: e */
    public void m2783e() {
        for (AbstractC0690b abstractC0690b : this.f4363b.values()) {
            abstractC0690b.mo2801j();
        }
        this.f4363b.clear();
    }

    protected void finalize() {
        super.finalize();
        m2783e();
    }

    /* renamed from: a */
    public void m2793a(int i, int i2, int i3, int i4) {
        this.f4362a.mo2772a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void m2788a(String str, float f, float f2, Paint paint) {
        this.f4362a.mo2765a(str, f, f2, paint);
    }

    /* renamed from: a */
    public void m2787a(float[] fArr, int i, int i2, C0711v c0711v) {
        this.f4362a.mo2764a(fArr, i, i2, c0711v, this.f4364c);
    }
}
