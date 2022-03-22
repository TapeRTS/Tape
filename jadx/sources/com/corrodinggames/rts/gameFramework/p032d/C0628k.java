package com.corrodinggames.rts.gameFramework.p032d;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p030b.C0569a;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0752i;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/k.class */
public class C0628k {

    /* renamed from: a */
    float f4432a;

    /* renamed from: b */
    float f4433b;

    /* renamed from: e */
    public boolean f4436e;

    /* renamed from: f */
    public boolean f4437f;

    /* renamed from: g */
    public int f4438g;

    /* renamed from: h */
    public int f4439h;

    /* renamed from: i */
    public float f4440i;

    /* renamed from: j */
    public float f4441j;

    /* renamed from: k */
    int f4442k;

    /* renamed from: l */
    int f4443l;

    /* renamed from: m */
    boolean f4444m;

    /* renamed from: F */
    C0748e f4463F;

    /* renamed from: G */
    AbstractC0755l f4464G;

    /* renamed from: H */
    C0748e f4465H;

    /* renamed from: I */
    AbstractC0755l f4466I;

    /* renamed from: J */
    public C0748e f4467J;

    /* renamed from: K */
    AbstractC0755l f4468K;

    /* renamed from: M */
    float f4470M;

    /* renamed from: N */
    float f4471N;

    /* renamed from: T */
    public C0748e f4477T;

    /* renamed from: U */
    public C0748e f4478U;

    /* renamed from: W */
    C0760q[] f4480W;

    /* renamed from: X */
    C0760q f4481X;

    /* renamed from: Y */
    float f4482Y;

    /* renamed from: ac */
    static ArrayList f4487ac = new ArrayList();

    /* renamed from: c */
    public float f4434c = 120.0f;

    /* renamed from: d */
    public float f4435d = 120.0f;

    /* renamed from: n */
    final Paint f4445n = new Paint();

    /* renamed from: o */
    final Paint f4446o = new Paint();

    /* renamed from: p */
    final Paint f4447p = new Paint();

    /* renamed from: q */
    float f4448q = 0.0f;

    /* renamed from: r */
    float f4449r = 0.0f;

    /* renamed from: s */
    final Paint f4450s = new C0760q();

    /* renamed from: t */
    final Paint f4451t = new Paint();

    /* renamed from: u */
    final Paint f4452u = new Paint();

    /* renamed from: v */
    final Paint f4453v = new Paint();

    /* renamed from: w */
    public final Rect f4454w = new Rect();

    /* renamed from: x */
    final Paint f4455x = new C0760q();

    /* renamed from: y */
    final Paint f4456y = new C0760q();

    /* renamed from: z */
    final Paint f4457z = new C0760q();

    /* renamed from: A */
    final Paint f4458A = new C0760q();

    /* renamed from: B */
    final Paint f4459B = new C0760q();

    /* renamed from: C */
    final Paint f4460C = new C0760q();

    /* renamed from: D */
    final Paint f4461D = new C0760q();

    /* renamed from: E */
    final Rect f4462E = new Rect();

    /* renamed from: L */
    float f4469L = 0.0f;

    /* renamed from: O */
    public boolean f4472O = false;

    /* renamed from: P */
    public boolean f4473P = false;

    /* renamed from: Q */
    public float f4474Q = 0.0f;

    /* renamed from: R */
    int f4475R = 30;

    /* renamed from: S */
    int f4476S = -1;

    /* renamed from: V */
    final Rect f4479V = new Rect();

    /* renamed from: Z */
    public final ArrayList f4483Z = new ArrayList();

    /* renamed from: aa */
    public final ArrayList f4484aa = new ArrayList();

    /* renamed from: ag */
    private final ArrayList f4485ag = new ArrayList();

    /* renamed from: ab */
    Rect f4486ab = new Rect();

    /* renamed from: ad */
    Point f4488ad = new Point();

    /* renamed from: ae */
    AbstractC0752i f4489ae = new AbstractC0752i() { // from class: com.corrodinggames.rts.gameFramework.d.k.1
        @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0752i
        /* renamed from: a */
        public void mo875a(AbstractC0755l lVar) {
            C0628k.this.m1626a(lVar, 0, 0, 0.0f, 1.0f);
        }
    };

    /* renamed from: af */
    ArrayList f4490af = new ArrayList();

    /* renamed from: a */
    public void m1633a(int i, int i2, float f, AbstractC0210af afVar) {
        boolean z = afVar != null && afVar.mo2643bw();
        Iterator it = this.f4483Z.iterator();
        while (it.hasNext()) {
            C0631m mVar = (C0631m) it.next();
            if (mVar.f4498a == z && C0654f.m1455c(i - mVar.f4499b) < 40 && C0654f.m1455c(i2 - mVar.f4500c) < 40) {
                mVar.f4501d += f;
                return;
            }
        }
        this.f4483Z.add(new C0631m(this, f, i, i2, z));
    }

    /* renamed from: a */
    public void m1630a(Context context) {
        this.f4446o.m4184a(Paint.Style.STROKE);
        this.f4446o.m4192a(1.0f);
        this.f4450s.m4189a(255, 255, 255, 255);
        this.f4450s.m4184a(Paint.Style.STROKE);
        this.f4450s.m4192a(1.0f);
        this.f4480W = new C0760q[11];
        for (int i = 0; i <= 10; i++) {
            this.f4480W[i] = new C0760q();
            this.f4480W[i].m4169b(-16777216);
            this.f4480W[i].m4184a(Paint.Style.FILL);
            this.f4480W[i].m4164c(i * 25);
        }
        this.f4481X = new C0760q();
        this.f4481X.m4169b(-16777216);
        this.f4481X.m4184a(Paint.Style.FILL);
        this.f4451t.m4189a(255, 255, 0, 0);
        this.f4451t.m4184a(Paint.Style.STROKE);
        this.f4451t.m4192a(2.0f);
        this.f4452u.m4189a(155, 255, 0, 0);
        this.f4452u.m4184a(Paint.Style.STROKE);
        this.f4452u.m4192a(2.0f);
        this.f4453v.m4189a(200, 12, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_11, 219);
        this.f4453v.m4184a(Paint.Style.STROKE);
        this.f4453v.m4192a(2.0f);
        this.f4455x.m4169b(-16711936);
        this.f4456y.m4169b(-256);
        this.f4457z.m4169b(-65536);
        this.f4458A.m4169b(m1634a(this.f4455x.m4157e()));
        this.f4459B.m4169b(m1634a(this.f4456y.m4157e()));
        this.f4460C.m4169b(m1634a(this.f4457z.m4157e()));
        this.f4461D.m4189a(210, 255, 255, 255);
    }

    /* renamed from: a */
    public static int m1634a(int i) {
        return Color.m4213a(Color.m4215a(i), (int) (Color.m4211b(i) * 0.5f), (int) (Color.m4210c(i) * 0.5f), (int) (Color.m4209d(i) * 0.5f));
    }

    /* renamed from: a */
    public void m1637a() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!C0623f.f4406bz) {
            this.f4432a = (int) (u.f5536bS - (this.f4434c + 0.0f));
            this.f4433b = 0.0f;
            return;
        }
        this.f4432a = 0.0f;
        this.f4433b = (int) (u.f5537bT - (this.f4435d + 0.0f));
    }

    /* renamed from: b */
    public int m1625b() {
        return (int) (this.f4433b + this.f4435d);
    }

    /* renamed from: a */
    public void m1629a(C0148b bVar, boolean z) {
        this.f4490af.clear();
        if (z) {
            this.f4444m = true;
            return;
        }
        this.f4438g = 1;
        this.f4439h = 1;
        this.f4440i = 1.0f;
        this.f4441j = 1.0f;
        this.f4437f = false;
        this.f4436e = false;
    }

    /* renamed from: c */
    public void m1622c() {
        if (this.f4467J != null) {
            this.f4467J.mo48n();
            this.f4467J = null;
        }
        if (this.f4463F != null) {
            this.f4463F.mo48n();
            this.f4463F = null;
        }
        if (this.f4477T != null) {
            this.f4477T.mo48n();
            this.f4477T = null;
        }
        if (this.f4478U != null) {
            this.f4478U.mo48n();
            this.f4478U = null;
        }
        if (this.f4466I != null) {
            this.f4466I.mo121n();
            this.f4466I = null;
        }
        if (this.f4465H != null) {
            this.f4465H.mo48n();
            this.f4465H = null;
        }
        this.f4468K = null;
        this.f4436e = false;
    }

    /* renamed from: d */
    public float m1619d() {
        return AbstractC0789l.m638u().f5541bX;
    }

    /* renamed from: e */
    public void m1617e() {
        AbstractC0789l u = AbstractC0789l.m638u();
        m1615f();
        AbstractC0789l.m670d("Creating minimap image buffers..");
        if (this.f4463F == null) {
            this.f4463F = u.f5514bw.mo192a((int) this.f4434c, (int) this.f4435d, false);
            this.f4464G = u.f5514bw.mo177a(this.f4463F);
        }
        if (this.f4467J == null) {
            this.f4467J = u.f5514bw.mo192a((int) this.f4434c, (int) this.f4435d, false);
            this.f4468K = u.f5514bw.mo177a(this.f4467J);
        }
        if (this.f4465H == null) {
            this.f4465H = u.f5514bw.mo192a((int) this.f4434c, (int) this.f4435d, false);
            this.f4466I = u.f5514bw.mo177a(this.f4465H);
        }
    }

    /* renamed from: f */
    public void m1615f() {
        this.f4434c = m1619d();
        this.f4435d = this.f4434c;
        m1637a();
    }

    /* renamed from: g */
    public void m1614g() {
        long a = C0586bj.m1919a();
        AbstractC0789l.m670d("--setting up minimap--");
        AbstractC0789l u = AbstractC0789l.m638u();
        m1615f();
        this.f4438g = u.f5511bt.f742r.f839n * u.f5511bt.f735k;
        this.f4439h = u.f5511bt.f742r.f840o * u.f5511bt.f736l;
        this.f4440i = 1.0f / this.f4438g;
        this.f4441j = 1.0f / this.f4439h;
        this.f4437f = true;
        m1617e();
        this.f4483Z.clear();
        this.f4484aa.clear();
        this.f4485ag.clear();
        Iterator it = u.f5511bt.f747w.iterator();
        while (it.hasNext()) {
            Point point = (Point) it.next();
            this.f4485ag.add(new C0634p(this, point.f221a, point.f222b));
        }
        this.f4464G.mo146b(-16777216);
        this.f4468K.mo146b(-16777216);
        if (1 == 0) {
            Rect rect = new Rect(0, 0, (int) this.f4434c, (int) this.f4435d);
            u.f5511bt.f742r.m3615a(this.f4464G, 0.0f, 0.0f, 0.0f, 0.0f, this.f4438g, this.f4439h, this.f4434c / this.f4438g, this.f4435d / this.f4439h, false, false, false);
            Paint paint = new Paint();
            paint.m4189a(50, 0, 0, 0);
            this.f4464G.mo142b(rect, paint);
        } else {
            for (int i = 0; i < 2; i++) {
                for (int i2 = 0; i2 < 2; i2++) {
                    this.f4466I.mo146b(-16777216);
                    int i3 = ((int) this.f4434c) / 2;
                    int i4 = ((int) this.f4435d) / 2;
                    int i5 = this.f4438g / 2;
                    int i6 = this.f4439h / 2;
                    u.f5511bt.f742r.m3615a(this.f4466I, i5 * i, i6 * i2, i5 * i, i6 * i2, i5, i6, this.f4434c / i5, this.f4435d / i6, false, false, false);
                    Rect rect2 = new Rect(0, 0, (int) this.f4434c, (int) this.f4435d);
                    Rect rect3 = new Rect(i3 * i, i4 * i2, i3 * (i + 1), i4 * (i2 + 1));
                    Paint paint2 = new Paint();
                    paint2.m4173a(true);
                    paint2.m4158d(true);
                    paint2.m4166b(true);
                    this.f4468K.mo170a(this.f4465H, rect2, rect3, paint2);
                }
            }
            Rect rect4 = new Rect(0, 0, (int) this.f4434c, (int) this.f4435d);
            Paint paint3 = new Paint();
            paint3.m4173a(true);
            paint3.m4158d(true);
            paint3.m4166b(true);
            paint3.m4189a(200, 255, 255, 255);
            this.f4464G.mo170a(this.f4467J, rect4, rect4, paint3);
        }
        this.f4466I.mo146b(-16777216);
        this.f4468K.mo146b(-16777216);
        this.f4470M = 50.0f;
        m1635a(0.0f, 1.0f);
        this.f4436e = true;
        AbstractC0789l.m670d("Minimap map render took:" + C0586bj.m1918a(C0586bj.m1917a(a)));
    }

    /* renamed from: a */
    void m1635a(float f, float f2) {
        C0760q qVar;
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f4486ab.m4136a(0, (int) (f * this.f4435d), (int) this.f4434c, (int) (f2 * this.f4435d));
        this.f4466I.mo170a(this.f4463F, this.f4486ab, this.f4486ab, (Paint) null);
        C0148b bVar = u.f5511bt;
        if (bVar.f752A) {
            boolean z = bVar.f754C;
            C0760q qVar2 = this.f4480W[5];
            C0760q qVar3 = this.f4480W[10];
            C0760q qVar4 = this.f4481X;
            qVar4.m4164c(255);
            if (z) {
                qVar4.m4164c((int) ((1.0f - ((1.0f - (qVar2.m4155f() / 255.0f)) * (1.0f - (this.f4480W[7].m4155f() / 255.0f)))) * 255.0f));
            }
            float f3 = this.f4434c / bVar.f750y;
            float f4 = this.f4435d / bVar.f751z;
            int i = ((int) (f * bVar.f751z)) - 1;
            int i2 = ((int) (f2 * bVar.f751z)) + 1;
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (i > u.f5511bt.f751z) {
                i = bVar.f751z;
            }
            if (i2 > u.f5511bt.f751z) {
                i2 = bVar.f751z;
            }
            byte[][] bArr = u.f5493bb.f1262C;
            if (bArr != null) {
                int i3 = bVar.f750y;
                Rect rect = this.f4479V;
                for (int i4 = i; i4 < i2; i4++) {
                    int i5 = 0;
                    while (i5 < i3) {
                        byte b = bArr[i5][i4];
                        if (b != 0) {
                            int i6 = i5;
                            while (i6 < i3 - 1 && bArr[i6][i4] == b) {
                                i6++;
                            }
                            i5 = i6;
                            rect.m4136a(0 + ((int) (i5 * f3)), 0 + ((int) (i4 * f4)), 0 + ((int) ((i6 + 1) * f3)), 0 + ((int) ((i4 + 1) * f4)));
                            if (b == 10) {
                                qVar = qVar4;
                            } else {
                                qVar = qVar2;
                            }
                            this.f4466I.mo142b(rect, qVar);
                        }
                        i5++;
                    }
                }
            }
        }
        this.f4468K.mo170a(this.f4465H, this.f4486ab, this.f4486ab, (Paint) null);
        if (AbstractC0789l.f5474aI) {
        }
    }

    /* renamed from: a */
    static C0633o m1631a(int i, Paint paint) {
        synchronized (f4487ac) {
            C0633o oVar = null;
            Iterator it = f4487ac.iterator();
            while (it.hasNext()) {
                C0633o oVar2 = (C0633o) it.next();
                if (oVar2.f4512d >= i && (oVar == null || oVar2.f4512d < oVar.f4512d)) {
                    oVar = oVar2;
                }
            }
            if (oVar == null) {
                return new C0633o(i + 15, paint);
            }
            f4487ac.remove(oVar);
            oVar.f4511c = paint;
            return oVar;
        }
    }

    /* renamed from: a */
    static void m1627a(C0633o oVar) {
        oVar.f4511c = null;
        oVar.f4510b = 0;
        synchronized (f4487ac) {
            if (f4487ac.size() < 20) {
                f4487ac.add(oVar);
                return;
            }
            Iterator it = f4487ac.iterator();
            while (it.hasNext()) {
                if (((C0633o) it.next()).f4512d < oVar.f4512d) {
                    it.remove();
                    f4487ac.add(oVar);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    void m1626a(AbstractC0755l lVar, int i, int i2, float f, float f2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f4434c < 50.0f) {
            i6 = 0;
            i7 = 0;
            i4 = 1;
            i5 = 1;
            i3 = 1;
        } else if (this.f4434c < 120.0f) {
            i6 = 0;
            i7 = 0;
            i4 = 2;
            i5 = 2;
            i3 = 2;
        } else {
            i6 = -1;
            i7 = -1;
            i4 = 2;
            i5 = 2;
            i3 = 3;
        }
        int i8 = i7 + i;
        int i9 = i4 + i;
        int i10 = i5 + i2;
        int i11 = i6 + i2;
        boolean z = false;
        if (u.f5493bb.m3493b() || u.f5527bJ.m1940h()) {
            z = true;
        }
        for (int i12 = -1; i12 < AbstractC0171m.f1230a; i12++) {
            AbstractC0171m n = AbstractC0171m.m3436n(i12);
            if (n != null) {
                Paint paint = n.f1279T;
                if (u.f5516by.useMinimapAllyColors) {
                    if (z) {
                        this.f4447p.m4169b(AbstractC0171m.m3438m(n.f1245o));
                        paint = this.f4447p;
                    } else if (u.f5493bb == n) {
                        paint = this.f4455x;
                    } else if (u.f5493bb.m3464d(n)) {
                        paint = this.f4456y;
                    } else if (u.f5493bb.m3474c(n)) {
                        paint = this.f4457z;
                    }
                }
                int i13 = 0;
                if (n.m3494a(true, false) > 0) {
                    AbstractC0210af[] a = AbstractC0210af.f1442bj.m456a();
                    int size = AbstractC0210af.f1442bj.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        AbstractC0210af afVar = a[i14];
                        if (afVar.f1461bB == n && afVar.f1505ct) {
                            i13++;
                        }
                    }
                }
                if (i13 > 0) {
                    paint.m4192a(i3);
                    C0633o a2 = m1631a(i13, paint);
                    AbstractC0210af[] a3 = AbstractC0210af.f1442bj.m456a();
                    int size2 = AbstractC0210af.f1442bj.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        AbstractC0210af afVar2 = a3[i15];
                        if (afVar2.f1461bB == n && afVar2.f1505ct) {
                            a2.m1612a(afVar2.f1506cu, afVar2.f1507cv);
                        }
                    }
                    if (a2.f4510b != 0) {
                        u.f5514bw.mo165a(a2);
                    }
                }
                Paint paint2 = n.f1280U;
                if (u.f5516by.useMinimapAllyColors) {
                    if (z) {
                        this.f4447p.m4169b(AbstractC0171m.m3438m(n.f1245o));
                        Paint paint3 = this.f4447p;
                    } else if (u.f5493bb == n) {
                        paint2 = this.f4458A;
                    } else if (u.f5493bb.m3464d(n)) {
                        paint2 = this.f4459B;
                    } else if (u.f5493bb.m3474c(n)) {
                        paint2 = this.f4460C;
                    }
                }
                int i16 = 0;
                Object[] b = C0569a.f3782w.m477b();
                int size3 = C0569a.f3782w.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    C0569a aVar = (C0569a) b[i17];
                    if (aVar.f3764e == n && aVar.f3770k) {
                        i16++;
                    }
                }
                if (i16 > 0) {
                    paint2.m4192a(i3);
                    C0633o a4 = m1631a(i16, paint2);
                    Object[] b2 = C0569a.f3782w.m477b();
                    int size4 = C0569a.f3782w.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        C0569a aVar2 = (C0569a) b2[i18];
                        if (aVar2.f3764e == n && aVar2.f3770k) {
                            a4.m1612a(aVar2.f3771l, aVar2.f3772m);
                        }
                    }
                    if (a4.f4510b != 0) {
                        u.f5514bw.mo165a(a4);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1632a(int i, int i2, EnumC0632n nVar) {
        C0630l lVar = new C0630l(this);
        lVar.f4492a = i;
        lVar.f4493b = i2;
        lVar.f4496e = nVar;
        lVar.f4494c = 0.9f;
        lVar.f4495d = 0.9f;
        this.f4484aa.add(lVar);
    }

    /* renamed from: h */
    public void m1613h() {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f4444m = false;
        this.f4442k = (int) this.f4432a;
        this.f4443l = (int) this.f4433b;
        AbstractC0210af[] a = AbstractC0210af.f1442bj.m456a();
        int size = AbstractC0210af.f1442bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1459bz || afVar.f1501cp != null || !afVar.m3320bR() || !afVar.mo2855b_() || afVar.mo1607o_()) {
                afVar.f1505ct = false;
            } else {
                Point b = m1623b(afVar.f5842dH, afVar.f5843dI);
                afVar.f1506cu = b.f221a;
                afVar.f1507cv = b.f222b;
                afVar.f1505ct = true;
            }
        }
        Object[] b2 = C0569a.f3782w.m477b();
        int size2 = C0569a.f3782w.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0569a aVar = (C0569a) b2[i2];
            if (!aVar.f3773n && aVar.f3780u) {
                Point b3 = m1623b(aVar.f3766g, aVar.f3767h);
                aVar.f3771l = b3.f221a;
                aVar.f3772m = b3.f222b;
                aVar.f3770k = true;
            }
        }
        AbstractC0171m mVar = u.f5493bb;
        Iterator it = this.f4485ag.iterator();
        while (it.hasNext()) {
            C0634p pVar = (C0634p) it.next();
            pVar.f4517e = false;
            if (u.f5511bt.m3689a(mVar, pVar.f4513a, pVar.f4514b)) {
                pVar.f4517e = true;
                Point b4 = m1623b(pVar.f4513a * u.f5511bt.f735k, pVar.f4514b * u.f5511bt.f736l);
                pVar.f4515c = b4.f221a;
                pVar.f4516d = b4.f222b;
            }
        }
    }

    /* renamed from: a */
    public void m1636a(float f) {
        if (!AbstractC0789l.f5471aF || AbstractC0789l.f5472aG) {
            AbstractC0789l u = AbstractC0789l.m638u();
            this.f4469L = C0654f.m1522a(this.f4469L, f);
            if (this.f4469L == 0.0f) {
                this.f4469L = 15.0f;
                m1613h();
            }
            this.f4482Y += f;
            if (this.f4482Y > 15.0f) {
                C0631m mVar = null;
                Iterator it = this.f4483Z.iterator();
                while (it.hasNext()) {
                    C0631m mVar2 = (C0631m) it.next();
                    if (mVar2.f4502e != 0.0f) {
                        mVar2.f4501d = 0.0f;
                    } else if (mVar2.f4501d > 15.0f) {
                        mVar2.f4501d = 0.0f;
                        mVar2.f4502e = 300.0f;
                        C0630l lVar = new C0630l(this);
                        lVar.f4492a = mVar2.f4499b;
                        lVar.f4493b = mVar2.f4500c;
                        if (mVar2.f4498a) {
                            lVar.f4496e = EnumC0632n.base;
                        } else {
                            lVar.f4496e = EnumC0632n.unit;
                            lVar.f4494c = 0.4f;
                            lVar.f4495d = 0.8f;
                        }
                        this.f4484aa.add(lVar);
                    }
                    mVar2.f4501d = C0654f.m1522a(mVar2.f4501d, 2.0f * this.f4482Y);
                    mVar2.f4502e = C0654f.m1522a(mVar2.f4502e, this.f4482Y);
                    if (mVar2.f4501d == 0.0f && mVar2.f4502e == 0.0f) {
                        mVar = mVar2;
                    }
                }
                if (mVar != null) {
                    this.f4483Z.remove(mVar);
                }
                Iterator it2 = this.f4484aa.iterator();
                while (it2.hasNext()) {
                    C0630l lVar2 = (C0630l) it2.next();
                    if (lVar2.f4496e != EnumC0632n.message && u.f5567cx.m4133b(lVar2.f4492a, lVar2.f4493b)) {
                        lVar2.f4494c = 0.0f;
                        lVar2.f4495d = 0.0f;
                    }
                }
                this.f4482Y = 0.0f;
            }
        }
    }

    /* renamed from: b */
    public float m1624b(float f) {
        return f * this.f4440i * this.f4434c;
    }

    /* renamed from: b */
    public Point m1623b(float f, float f2) {
        if (!this.f4437f) {
            this.f4488ad.m4145a(-1, -1);
            return this.f4488ad;
        }
        this.f4488ad.m4145a((int) ((f * this.f4440i * this.f4434c) + this.f4432a), (int) ((f2 * this.f4441j * this.f4435d) + this.f4433b));
        return this.f4488ad;
    }

    /* renamed from: c */
    public Point m1620c(float f, float f2) {
        if (f < this.f4432a || f2 < this.f4433b || f > this.f4432a + this.f4434c || f2 > this.f4433b + this.f4435d) {
            return null;
        }
        this.f4488ad.m4145a((int) (((f - this.f4432a) / this.f4434c) * this.f4438g), (int) (((f2 - this.f4433b) / this.f4435d) * this.f4439h));
        return this.f4488ad;
    }

    /* renamed from: c */
    public float m1621c(float f) {
        return f < this.f4432a ? this.f4432a : f > this.f4432a + this.f4434c ? this.f4432a + this.f4434c : f;
    }

    /* renamed from: d */
    public float m1618d(float f) {
        return f < this.f4433b ? this.f4433b : f > this.f4433b + this.f4435d ? this.f4433b + this.f4435d : f;
    }

    /* renamed from: e */
    public void m1616e(float f) {
        Paint paint;
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0755l lVar = u.f5514bw;
        m1637a();
        if (this.f4467J != null && !C0654f.m1439e(this.f4434c, m1619d(), 5.0f)) {
            AbstractC0789l.m681b("minimap", "minimap size has changed, reseting");
            m1622c();
        }
        if (!this.f4436e || this.f4467J == null) {
            m1614g();
        }
        if (!(this.f4442k == ((int) this.f4432a) && this.f4443l == ((int) this.f4433b) && !this.f4444m)) {
            m1613h();
        }
        if (u.f5511bt.f752A) {
            if (this.f4472O && !this.f4473P) {
                this.f4470M = C0654f.m1522a(this.f4470M, 1.0f);
                if (this.f4470M == 0.0f) {
                    this.f4470M = 40.0f;
                    this.f4472O = false;
                    this.f4474Q = 0.0f;
                    this.f4473P = true;
                }
            }
            if (this.f4473P) {
                this.f4471N = C0654f.m1522a(this.f4471N, 1.0f);
                if (this.f4471N == 0.0f) {
                    this.f4471N = 3.0f;
                    if (this.f4467J != null) {
                        float f2 = this.f4474Q - 0.005f;
                        this.f4474Q = (float) (this.f4474Q + 0.04d);
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        if (this.f4474Q >= 1.0f) {
                            this.f4474Q = 1.0f;
                            this.f4473P = false;
                        }
                        m1635a(f2, this.f4474Q);
                    }
                }
            }
        }
        lVar.mo140b(this.f4467J, this.f4432a, this.f4433b, this.f4445n);
        this.f4454w.m4136a((int) this.f4432a, (int) this.f4433b, (int) (this.f4432a + this.f4434c), (int) ((this.f4433b + this.f4435d) - 0.4d));
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Object[] a = C0163f.f915a.m490a();
        int i = C0163f.f915a.f5778a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0163f) a[i2]).f945D) {
                z3 = true;
                z2 = true;
            }
        }
        Iterator it = this.f4484aa.iterator();
        while (it.hasNext()) {
            C0630l lVar2 = (C0630l) it.next();
            if (lVar2.f4496e != EnumC0632n.unit) {
                z = true;
                if (lVar2.f4496e != EnumC0632n.message) {
                    z2 = true;
                }
            }
        }
        if (z || z3) {
            this.f4448q += 5.0f * f;
            if (this.f4448q > 180.0f) {
                this.f4448q -= 180.0f;
            }
            float h = C0654f.m1425h(this.f4448q);
            if (z3) {
                this.f4446o.m4189a(255, 0, (int) (0.0f + (h * 230.0f)), 0);
            } else if (!z2) {
                this.f4446o.m4189a(255, 12, (int) (0.0f + (h * 220.0f)), (int) (0.0f + (h * 220.0f)));
            } else {
                this.f4446o.m4189a(255, (int) (0.0f + (h * 230.0f)), 0, 0);
            }
            this.f4446o.m4192a(2.0f);
        } else {
            this.f4446o.m4189a(255, 100, 100, 100);
            this.f4446o.m4192a(1.0f);
            if (C0623f.f4403bw) {
                this.f4446o.m4189a(115, 0, 0, 0);
                this.f4446o.m4192a(2.0f);
            }
        }
        lVar.mo142b(this.f4454w, this.f4446o);
        Iterator it2 = this.f4485ag.iterator();
        while (it2.hasNext()) {
            C0634p pVar = (C0634p) it2.next();
            if (pVar.f4517e) {
                this.f4479V.m4136a(pVar.f4515c, pVar.f4516d, pVar.f4515c + 2, pVar.f4516d + 2);
                lVar.mo142b(this.f4479V, this.f4461D);
            }
        }
        m1626a(lVar, 0, 0, 0.0f, 1.0f);
        if (this.f4490af.size() != 0) {
            Iterator it3 = this.f4490af.iterator();
            while (it3.hasNext()) {
                C0635q qVar = (C0635q) it3.next();
                if (qVar.f4519a.f1459bz) {
                    it3.remove();
                } else {
                    AbstractC0210af afVar = qVar.f4519a;
                    Point b = m1623b(afVar.f5842dH, afVar.f5843dI);
                    if (!afVar.mo2471a(b.f221a, b.f222b)) {
                        lVar.mo195a(b.f221a, b.f222b, 4.0f, afVar.f1461bB.f1279T);
                    }
                }
            }
        }
        int i3 = C0163f.f915a.f5778a;
        for (int i4 = 0; i4 < i3; i4++) {
            C0163f fVar = (C0163f) a[i4];
            if ((fVar.f945D || (fVar.f932q != null && fVar.f932q.f945D)) && fVar.f925j != null) {
                Point b2 = m1623b(fVar.f5842dH, fVar.f5843dI);
                float f3 = 2.0f;
                if (fVar.f945D) {
                    f3 = 4.0f;
                }
                lVar.mo195a(b2.f221a, b2.f222b, f3, fVar.f925j.f1461bB.f1279T);
            }
        }
        Point b3 = m1623b(u.f5547cd, u.f5548ce);
        this.f4462E.f227a = b3.f221a;
        this.f4462E.f228b = b3.f222b;
        Point b4 = m1623b(u.f5547cd + u.f5551ch, u.f5548ce + u.f5552ci);
        this.f4462E.f229c = b4.f221a;
        this.f4462E.f230d = b4.f222b;
        if (this.f4462E.f227a < this.f4454w.f227a) {
            this.f4462E.f227a = this.f4454w.f227a;
        }
        if (this.f4462E.f229c > this.f4454w.f229c) {
            this.f4462E.f229c = this.f4454w.f229c;
        }
        if (this.f4462E.f228b < this.f4454w.f228b) {
            this.f4462E.f228b = this.f4454w.f228b;
        }
        if (this.f4462E.f230d > this.f4454w.f230d) {
            this.f4462E.f230d = this.f4454w.f230d;
        }
        lVar.mo142b(this.f4462E, this.f4450s);
        this.f4449r += 6.0f * f;
        if (this.f4449r > 180.0f) {
            this.f4449r -= 180.0f;
        }
        Iterator it4 = this.f4484aa.iterator();
        while (it4.hasNext()) {
            C0630l lVar3 = (C0630l) it4.next();
            Point b5 = m1623b(lVar3.f4492a, lVar3.f4493b);
            float f4 = lVar3.f4494c;
            float f5 = 0.05f;
            if (lVar3.f4496e == EnumC0632n.unit) {
                paint = this.f4452u;
                f5 = 0.03f;
                float h2 = C0654f.m1425h(this.f4449r);
                paint.m4189a((int) (50.0f + (h2 * 190.0f)), (int) (50.0f + (h2 * 190.0f)), 0, 0);
            } else if (lVar3.f4496e == EnumC0632n.message) {
                paint = this.f4453v;
            } else {
                paint = this.f4451t;
                float h3 = C0654f.m1425h(this.f4449r);
                paint.m4189a((int) (50.0f + (h3 * 190.0f)), (int) (50.0f + (h3 * 190.0f)), 0, 0);
            }
            float b6 = C0654f.m1475b(f4, f5, 1.0f);
            if (lVar3.f4496e == EnumC0632n.unit) {
                float f6 = this.f4434c * b6;
                float f7 = this.f4435d * b6;
                lVar.mo197a(m1621c(b5.f221a - f6), m1618d(b5.f222b - f7), m1621c(b5.f221a + f6), m1618d(b5.f222b + f7), paint);
                lVar.mo197a(m1621c(b5.f221a + f6), m1618d(b5.f222b - f7), m1621c(b5.f221a - f6), m1618d(b5.f222b + f7), paint);
            } else {
                lVar.mo197a(m1621c(b5.f221a - (this.f4434c * b6)), m1618d(b5.f222b), m1621c(b5.f221a + (this.f4434c * b6)), m1618d(b5.f222b), paint);
                lVar.mo197a(m1621c(b5.f221a), m1618d(b5.f222b - (this.f4435d * b6)), m1621c(b5.f221a), m1618d(b5.f222b + (this.f4435d * b6)), paint);
            }
            lVar3.f4494c = C0654f.m1522a(lVar3.f4494c, 0.04f * f);
            if (lVar3.f4494c == 0.0f) {
                lVar3.f4495d = C0654f.m1522a(lVar3.f4495d, 0.005f * f);
                if (lVar3.f4495d == 0.0f) {
                    it4.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public void m1628a(AbstractC0210af afVar) {
        if (!this.f4490af.contains(afVar)) {
            C0635q qVar = new C0635q(this);
            qVar.f4519a = afVar;
            this.f4490af.add(qVar);
        }
    }
}
