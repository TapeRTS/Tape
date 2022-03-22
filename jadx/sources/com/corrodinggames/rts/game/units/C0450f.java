package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0757n;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f.class */
public class C0450f extends AbstractC0514q {

    /* renamed from: e */
    public float f3226e;

    /* renamed from: f */
    public float f3227f;

    /* renamed from: i */
    public boolean f3230i;

    /* renamed from: j */
    public float f3231j;

    /* renamed from: q */
    boolean f3238q;

    /* renamed from: k */
    static Paint f3232k = new Paint();

    /* renamed from: m */
    static Paint f3234m = new Paint();

    /* renamed from: l */
    static Paint f3233l = new Paint();

    /* renamed from: n */
    static Paint f3235n = new Paint();

    /* renamed from: o */
    static Paint f3236o = new Paint();

    /* renamed from: p */
    static Paint f3237p = new Paint(f3236o);

    /* renamed from: r */
    static final PointF f3239r = new PointF();

    /* renamed from: a */
    public float f3222a = 2000.0f;

    /* renamed from: b */
    public float f3223b = 0.0f;

    /* renamed from: c */
    public float f3224c = 0.0f;

    /* renamed from: d */
    public float f3225d = 2000.0f;

    /* renamed from: g */
    public boolean f3228g = true;

    /* renamed from: h */
    public float f3229h = 1.0f;

    static {
        f3232k.m4192a(10.0f);
        f3232k.m4169b(Color.m4213a(100, 160, 0, 0));
        f3232k.m4184a(Paint.Style.STROKE);
        f3234m.m4183a(f3232k);
        f3234m.m4169b(Color.m4213a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3233l.m4192a(2.0f);
        f3233l.m4169b(Color.m4213a(100, 160, 0, 0));
        f3233l.m4184a(Paint.Style.STROKE);
        f3235n.m4183a(f3233l);
        f3235n.m4169b(Color.m4213a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3236o.m4192a(2.0f);
        f3236o.m4169b(Color.m4213a(50, 255, 255, 255));
        f3236o.m4184a(Paint.Style.STROKE);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1130c(0);
        apVar.mo1096a(this.f3222a);
        apVar.mo1096a(this.f3223b);
        apVar.mo1096a(this.f3224c);
        apVar.mo1096a(this.f3225d);
        apVar.mo1096a(this.f3226e);
        apVar.mo1096a(this.f3227f);
        apVar.mo1090a(this.f3228g);
        apVar.mo1096a(this.f3229h);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        kVar.m1065d();
        this.f3222a = kVar.m1061g();
        this.f3223b = kVar.m1061g();
        this.f3224c = kVar.m1061g();
        this.f3225d = kVar.m1061g();
        this.f3226e = kVar.m1061g();
        this.f3227f = kVar.m1061g();
        this.f3228g = kVar.m1063e();
        this.f3229h = kVar.m1061g();
        super.mo399a(kVar);
        if (!this.f1459bz) {
            AbstractC0789l.m638u().f5522bE.m1628a(this);
        }
    }

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        if (this.f3238q) {
            return EnumC0215ak.zoneMarker;
        }
        return EnumC0215ak.damagingBorder;
    }

    /* renamed from: c */
    public static void m2469c() {
        AbstractC0789l.m638u();
    }

    public C0450f(boolean z) {
        super(z);
    }

    /* renamed from: f */
    public C0450f m2468f() {
        Iterator it = AbstractC0210af.m3317bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if ((afVar instanceof C0450f) && !afVar.f1459bz && afVar != this) {
                C0450f fVar = (C0450f) afVar;
                if (fVar.f3238q == this.f3238q) {
                    return fVar;
                }
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0514q, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz) {
            if (this.f3228g) {
                this.f3228g = false;
                C0450f f2 = m2468f();
                if (f2 != null) {
                    f2.f3226e = this.f5842dH;
                    f2.f3227f = this.f5843dI;
                    f2.f3225d = this.f3225d;
                    m3319bU();
                } else {
                    this.f3226e = this.f5842dH;
                    this.f3227f = this.f5843dI;
                    if (!this.f3238q) {
                        AbstractC0789l.m670d("DamagingBorder created " + this.f3226e + "," + this.f3227f + " size:" + this.f3225d);
                    }
                    AbstractC0789l.m638u().f5522bE.m1628a(this);
                }
            }
            if (this.f3238q) {
                this.f3222a = this.f3225d;
                this.f5842dH = this.f3226e;
                this.f5843dI = this.f3227f;
            } else if (this.f3222a > this.f3225d) {
                this.f3223b += 2.5E-4f * f;
                this.f3222a -= this.f3223b;
                this.f3230i = true;
                float b = C0654f.m1474b(this.f5842dH, this.f5843dI, this.f3226e, this.f3227f);
                float d = C0654f.m1446d(this.f5842dH, this.f5843dI, this.f3226e, this.f3227f);
                if (b > 1.0f) {
                    float f3 = this.f3223b;
                    if (f3 > b * f) {
                        f3 = b * f;
                    }
                    this.f5842dH += f3 * C0654f.m1421i(d) * f;
                    this.f5843dI += f3 * C0654f.m1425h(d) * f;
                }
            } else {
                this.f3230i = false;
                this.f5842dH = (float) (this.f5842dH + ((this.f3226e - this.f5842dH) * 0.003d * f));
                this.f5843dI = (float) (this.f5843dI + ((this.f3227f - this.f5843dI) * 0.003d * f));
            }
            if (this.f3222a < this.f3225d) {
                this.f3222a = this.f3225d;
                this.f3223b = 0.0f;
            }
            if (this.f3225d < 0.0f) {
                m3319bU();
                return;
            }
            this.f3224c -= f;
            if (!this.f1459bz && this.f3224c <= 0.0f && !this.f3238q) {
                this.f3224c = 2.0f;
                float i = this.f3222a * C0654f.m1421i(45.0f);
                float f4 = this.f5842dH - i;
                float f5 = this.f5842dH + i;
                float f6 = this.f5843dI - i;
                float f7 = this.f5843dI + i;
                float f8 = this.f3222a * this.f3222a;
                Iterator it = AbstractC0210af.m3317bt().iterator();
                while (it.hasNext()) {
                    AbstractC0210af afVar = (AbstractC0210af) it.next();
                    if (afVar.f5842dH <= f4 || afVar.f5842dH >= f5 || afVar.f5843dI <= f6 || afVar.f5843dI >= f7) {
                        if (C0654f.m1520a(this.f5842dH, this.f5843dI, afVar.f5842dH, afVar.f5843dI) >= f8 && !afVar.f1459bz && afVar.f1461bB != AbstractC0171m.f1236g && !afVar.mo1607o_()) {
                            afVar.mo2362a(this, (0.5f + (afVar.f1484bY * 0.002f) + (afVar.f1485bZ * 0.001f)) * this.f3229h, (C0163f) null);
                        }
                    }
                }
            }
            if (!this.f3238q) {
                AbstractC0789l u = AbstractC0789l.m638u();
                this.f3231j += f;
                if (this.f3231j > 3.0f) {
                    this.f3231j = 0.0f;
                    int a = u.f5545cb + C0654f.m1514a(0, (int) u.f5551ch);
                    int a2 = u.f5546cc + C0654f.m1514a(0, (int) u.f5552ci);
                    if (C0654f.m1520a(this.f5842dH, this.f5843dI, a, a2) > (this.f3222a + 30.0f) * (this.f3222a + 30.0f)) {
                        u.f5511bt.m3703a(a, a2);
                        u.f5511bt.m3699a(u.f5511bt.f764M, u.f5511bt.f765N);
                        C0573e b2 = u.f5517bz.m1989b(u.f5511bt.f764M + 10, (u.f5511bt.f765N - 10) + 10, 0.0f, EnumC0572d.custom, true, EnumC0576h.verylow);
                        if (b2 != null) {
                            b2.f3894ap = 19;
                            b2.f3877Y = C0654f.m1458c(-180.0f, 180.0f);
                            b2.f3845s = true;
                            b2.f3895aq = (short) 1;
                            b2.f3858F = 0.7f;
                            b2.f3875W = 30.0f;
                            b2.f3876X = b2.f3875W;
                            b2.f3860H = 0.2f;
                            b2.f3859G = 1.2f;
                            b2.f3851y = Color.m4213a(255, 173, 12, 12);
                        }
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: s */
    public int mo2139s() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: t */
    public boolean mo1605t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0514q, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: o_ */
    public boolean mo1607o_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public boolean mo398a(AbstractC0789l lVar) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0514q, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo403a(float f, boolean z) {
        C0450f f2;
        AbstractC0789l u = AbstractC0789l.m638u();
        float f3 = this.f5842dH - u.f5547cd;
        float f4 = this.f5843dI - u.f5548ce;
        Paint paint = this.f3230i ? f3234m : f3232k;
        if (this.f3238q) {
            paint = f3236o;
        }
        float f5 = this.f3222a;
        if (this.f3228g && (f2 = m2468f()) != null) {
            f5 = f2.f3225d - 300.0f;
        }
        u.f5514bw.mo195a(f3, f4, f5, paint);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public boolean mo2471a(int i, int i2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5514bw.mo127h();
        u.f5514bw.mo182a(u.f5522bE.f4454w);
        float b = u.f5522bE.m1624b(this.f3222a);
        Paint paint = this.f3230i ? f3235n : f3233l;
        if (this.f3238q) {
            paint = f3237p;
        }
        C0757n.m847a(u.f5514bw, i, i2, b, paint);
        u.f5514bw.mo126i();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
        this.f3222a = i * 100;
        this.f3225d = i * 100;
    }

    /* renamed from: a */
    public boolean m2473a(float f, float f2) {
        return C0654f.m1520a(this.f3226e, this.f3227f, f, f2) >= this.f3225d * this.f3225d;
    }

    /* renamed from: a */
    public PointF m2472a(float f, float f2, float f3) {
        if (f3 > this.f3225d) {
            f3 = this.f3225d;
        }
        float d = C0654f.m1446d(this.f5842dH, this.f5843dI, f, f2);
        float f4 = this.f3225d - f3;
        float i = this.f5842dH + (C0654f.m1421i(d) * f4);
        float h = this.f5843dI + (C0654f.m1425h(d) * f4);
        f3239r.f224a = i;
        f3239r.f225b = h;
        return f3239r;
    }
}
