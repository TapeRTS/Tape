package com.corrodinggames.rts.gameFramework.p037f;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p044l.AbstractC0942m;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/k.class */
public class C0802k {

    /* renamed from: a */
    float f5274a;

    /* renamed from: b */
    float f5275b;

    /* renamed from: e */
    public boolean f5276e;

    /* renamed from: f */
    public boolean f5277f;

    /* renamed from: g */
    public int f5278g;

    /* renamed from: h */
    public int f5279h;

    /* renamed from: i */
    public float f5280i;

    /* renamed from: j */
    public float f5281j;

    /* renamed from: k */
    int f5282k;

    /* renamed from: l */
    int f5283l;

    /* renamed from: m */
    boolean f5284m;

    /* renamed from: F */
    BitmapOrTexture f5285F;

    /* renamed from: G */
    InterfaceC1027y f5286G;

    /* renamed from: H */
    BitmapOrTexture f5287H;

    /* renamed from: I */
    InterfaceC1027y f5288I;

    /* renamed from: J */
    public BitmapOrTexture f5289J;

    /* renamed from: K */
    InterfaceC1027y f5290K;

    /* renamed from: M */
    float f5291M;

    /* renamed from: N */
    float f5292N;

    /* renamed from: T */
    public BitmapOrTexture f5293T;

    /* renamed from: U */
    public BitmapOrTexture f5294U;

    /* renamed from: W */
    C0930ag[] f5295W;

    /* renamed from: X */
    C0930ag f5296X;

    /* renamed from: Y */
    float f5297Y;

    /* renamed from: ac */
    static ArrayList f5298ac = new ArrayList();

    /* renamed from: c */
    public float f5299c = 120.0f;

    /* renamed from: d */
    public float f5300d = 120.0f;

    /* renamed from: n */
    final Paint f5301n = new Paint();

    /* renamed from: o */
    final Paint f5302o = new Paint();

    /* renamed from: p */
    final Paint f5303p = new Paint();

    /* renamed from: q */
    float f5304q = 0.0f;

    /* renamed from: r */
    float f5305r = 0.0f;

    /* renamed from: s */
    final Paint f5306s = new C0930ag();

    /* renamed from: t */
    final Paint f5307t = new Paint();

    /* renamed from: u */
    final Paint f5308u = new Paint();

    /* renamed from: v */
    final Paint f5309v = new Paint();

    /* renamed from: w */
    public final Rect f5310w = new Rect();

    /* renamed from: x */
    final Paint f5311x = new C0930ag();

    /* renamed from: y */
    final Paint f5312y = new C0930ag();

    /* renamed from: z */
    final Paint f5313z = new C0930ag();

    /* renamed from: A */
    final Paint f5314A = new C0930ag();

    /* renamed from: B */
    final Paint f5315B = new C0930ag();

    /* renamed from: C */
    final Paint f5316C = new C0930ag();

    /* renamed from: D */
    final Paint f5317D = new C0930ag();

    /* renamed from: E */
    final Rect f5318E = new Rect();

    /* renamed from: L */
    float f5319L = 0.0f;

    /* renamed from: O */
    public boolean f5320O = false;

    /* renamed from: P */
    public boolean f5321P = false;

    /* renamed from: Q */
    public float f5322Q = 0.0f;

    /* renamed from: R */
    int f5323R = 30;

    /* renamed from: S */
    int f5324S = -1;

    /* renamed from: V */
    final Rect f5325V = new Rect();

    /* renamed from: Z */
    public final ArrayList f5326Z = new ArrayList();

    /* renamed from: aa */
    public final ArrayList f5327aa = new ArrayList();

    /* renamed from: ag */
    private final ArrayList f5328ag = new ArrayList();

    /* renamed from: ab */
    Rect f5329ab = new Rect();

    /* renamed from: ad */
    Point f5330ad = new Point();

    /* renamed from: ae */
    AbstractC0942m f5331ae = new C08031();

    /* renamed from: af */
    ArrayList f5332af = new ArrayList();

    /* renamed from: a */
    public void m1943a(int i, int i2, float f, Unit unit) {
        boolean z = unit != null && unit.m5867bI();
        Iterator it = this.f5326Z.iterator();
        while (it.hasNext()) {
            C0805m c0805m = (C0805m) it.next();
            if (c0805m.f5340a == z && CommonUtils.m2279d(i - c0805m.f5341b) < 40 && CommonUtils.m2279d(i2 - c0805m.f5342c) < 40) {
                c0805m.f5343d += f;
                return;
            }
        }
        this.f5326Z.add(new C0805m(this, f, i, i2, z));
    }

    /* renamed from: a */
    public void m1940a(Context context) {
        this.f5302o.m7260a(Paint.Style.STROKE);
        this.f5302o.m7270a(1.0f);
        this.f5306s.m7267a(255, 255, 255, 255);
        this.f5306s.m7260a(Paint.Style.STROKE);
        this.f5306s.m7270a(1.0f);
        this.f5295W = new C0930ag[11];
        for (int i = 0; i <= 10; i++) {
            this.f5295W[i] = new C0930ag();
            this.f5295W[i].m7242b(-16777216);
            this.f5295W[i].m7260a(Paint.Style.FILL);
            this.f5295W[i].m7237c(i * 25);
        }
        this.f5296X = new C0930ag();
        this.f5296X.m7242b(-16777216);
        this.f5296X.m7260a(Paint.Style.FILL);
        this.f5307t.m7267a(255, 255, 0, 0);
        this.f5307t.m7260a(Paint.Style.STROKE);
        this.f5307t.m7270a(2.0f);
        this.f5308u.m7267a(155, 255, 0, 0);
        this.f5308u.m7260a(Paint.Style.STROKE);
        this.f5308u.m7270a(2.0f);
        this.f5309v.m7267a(200, 12, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_11, 219);
        this.f5309v.m7260a(Paint.Style.STROKE);
        this.f5309v.m7270a(2.0f);
        this.f5311x.m7242b(-16711936);
        this.f5312y.m7242b(-256);
        this.f5313z.m7242b(-65536);
        this.f5314A.m7242b(m1944a(this.f5311x.m7230e()));
        this.f5315B.m7242b(m1944a(this.f5312y.m7230e()));
        this.f5316C.m7242b(m1944a(this.f5313z.m7230e()));
        this.f5317D.m7267a(210, 255, 255, 255);
    }

    /* renamed from: a */
    public static int m1944a(int i) {
        return Color.argb(Color.m7284a(i), (int) (Color.m7280b(i) * 0.5f), (int) (Color.m7279c(i) * 0.5f), (int) (Color.m7278d(i) * 0.5f));
    }

    /* renamed from: a */
    public void m1947a() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!C0797f.f5181bD) {
            this.f5274a = (int) (gameEngine.f6128ck - (this.f5299c + 0.0f));
            this.f5275b = 0.0f;
            return;
        }
        this.f5274a = 0.0f;
        this.f5275b = (int) (gameEngine.f6129cl - (this.f5300d + 0.0f));
    }

    /* renamed from: b */
    public int m1935b() {
        return (int) (this.f5275b + this.f5300d);
    }

    /* renamed from: a */
    public void m1939a(C0173b c0173b, boolean z) {
        this.f5332af.clear();
        if (z) {
            this.f5284m = true;
            return;
        }
        this.f5278g = 1;
        this.f5279h = 1;
        this.f5280i = 1.0f;
        this.f5281j = 1.0f;
        this.f5277f = false;
        this.f5276e = false;
    }

    /* renamed from: c */
    public void m1932c() {
        if (this.f5289J != null) {
            this.f5289J.mo394o();
            this.f5289J = null;
        }
        if (this.f5285F != null) {
            this.f5285F.mo394o();
            this.f5285F = null;
        }
        if (this.f5293T != null) {
            this.f5293T.mo394o();
            this.f5293T = null;
        }
        if (this.f5294U != null) {
            this.f5294U.mo394o();
            this.f5294U = null;
        }
        if (this.f5288I != null) {
            this.f5288I.mo872q();
            this.f5288I = null;
        }
        if (this.f5287H != null) {
            this.f5287H.mo394o();
            this.f5287H = null;
        }
        this.f5290K = null;
        this.f5276e = false;
    }

    /* renamed from: d */
    public float m1929d() {
        return GameEngine.getInstance().f6132cp;
    }

    /* renamed from: e */
    public void m1927e() {
        GameEngine gameEngine = GameEngine.getInstance();
        m1925f();
        GameEngine.PrintLog("Creating minimap image buffers..");
        if (this.f5285F == null) {
            this.f5285F = gameEngine.graphics.mo928a((int) this.f5299c, (int) this.f5300d, false);
            this.f5286G = gameEngine.graphics.mo891b(this.f5285F);
        }
        if (this.f5289J == null) {
            this.f5289J = gameEngine.graphics.mo928a((int) this.f5299c, (int) this.f5300d, false);
            this.f5290K = gameEngine.graphics.mo891b(this.f5289J);
        }
        if (this.f5287H == null) {
            this.f5287H = gameEngine.graphics.mo928a((int) this.f5299c, (int) this.f5300d, false);
            this.f5288I = gameEngine.graphics.mo891b(this.f5287H);
        }
    }

    /* renamed from: f */
    public void m1925f() {
        this.f5299c = m1929d();
        this.f5300d = this.f5299c;
        m1947a();
    }

    /* renamed from: g */
    public void m1924g() {
        long m2612a = C0727bl.m2612a();
        GameEngine.PrintLog("--setting up minimap--");
        GameEngine gameEngine = GameEngine.getInstance();
        m1925f();
        this.f5278g = gameEngine.f6104bL.f791C * gameEngine.f6104bL.f784n;
        this.f5279h = gameEngine.f6104bL.f792D * gameEngine.f6104bL.f785o;
        if (this.f5278g <= 0) {
            this.f5278g = 1;
        }
        if (this.f5279h <= 0) {
            this.f5279h = 1;
        }
        this.f5280i = 1.0f / this.f5278g;
        this.f5281j = 1.0f / this.f5279h;
        this.f5277f = true;
        m1927e();
        this.f5326Z.clear();
        this.f5327aa.clear();
        this.f5328ag.clear();
        Iterator it = gameEngine.f6104bL.f837A.iterator();
        while (it.hasNext()) {
            Point point = (Point) it.next();
            this.f5328ag.add(new C0808p(this, point.f224a, point.f225b));
        }
        this.f5286G.mo894b(-16777216);
        this.f5290K.mo894b(-16777216);
        if (1 == 0) {
            Rect rect = new Rect(0, 0, (int) this.f5299c, (int) this.f5300d);
            gameEngine.f6104bL.f832u.m6558a(this.f5286G, 0.0f, 0.0f, 0.0f, 0.0f, this.f5278g, this.f5279h, this.f5299c / this.f5278g, this.f5300d / this.f5279h, false, false, false);
            Paint paint = new Paint();
            paint.m7267a(50, 0, 0, 0);
            this.f5286G.mo892b(rect, paint);
        } else {
            for (int i = 0; i < 2; i++) {
                for (int i2 = 0; i2 < 2; i2++) {
                    this.f5288I.mo894b(-16777216);
                    int i3 = ((int) this.f5299c) / 2;
                    int i4 = ((int) this.f5300d) / 2;
                    int i5 = this.f5278g / 2;
                    int i6 = this.f5279h / 2;
                    gameEngine.f6104bL.f832u.m6558a(this.f5288I, i5 * i, i6 * i2, i5 * i, i6 * i2, i5, i6, this.f5299c / i5, this.f5300d / i6, false, false, false);
                    Rect rect2 = new Rect(0, 0, (int) this.f5299c, (int) this.f5300d);
                    Rect rect3 = new Rect(i3 * i, i4 * i2, i3 * (i + 1), i4 * (i2 + 1));
                    Paint paint2 = new Paint();
                    paint2.m7248a(true);
                    paint2.m7231d(true);
                    paint2.m7239b(true);
                    this.f5290K.mo910a(this.f5287H, rect2, rect3, paint2);
                }
            }
            Rect rect4 = new Rect(0, 0, (int) this.f5299c, (int) this.f5300d);
            this.f5286G.mo894b(-16777216);
            Paint paint3 = new Paint();
            paint3.m7248a(true);
            paint3.m7231d(true);
            paint3.m7239b(true);
            paint3.m7267a(200, 255, 255, 255);
            this.f5286G.mo910a(this.f5289J, rect4, rect4, paint3);
        }
        this.f5288I.mo894b(-16777216);
        this.f5290K.mo894b(-16777216);
        this.f5291M = 50.0f;
        m1945a(0.0f, 1.0f);
        this.f5276e = true;
        GameEngine.PrintLog("Minimap map render took:" + C0727bl.m2611a(C0727bl.m2610a(m2612a)));
    }

    /* renamed from: a */
    void m1945a(float f, float f2) {
        C0930ag c0930ag;
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5329ab.m7208a(0, (int) (f * this.f5300d), (int) this.f5299c, (int) (f2 * this.f5300d));
        this.f5288I.mo910a(this.f5285F, this.f5329ab, this.f5329ab, (Paint) null);
        C0173b c0173b = gameEngine.f6104bL;
        if (c0173b.f840E) {
            boolean z = c0173b.f842G;
            C0930ag c0930ag2 = this.f5295W[5];
            C0930ag c0930ag3 = this.f5295W[10];
            C0930ag c0930ag4 = this.f5296X;
            c0930ag4.m7237c(255);
            if (z) {
                c0930ag4.m7237c((int) ((1.0f - ((1.0f - (c0930ag2.m7228f() / 255.0f)) * (1.0f - (this.f5295W[7].m7228f() / 255.0f)))) * 255.0f));
            }
            float f3 = this.f5299c / c0173b.f791C;
            float f4 = this.f5300d / c0173b.f792D;
            int i = ((int) (f * c0173b.f792D)) - 1;
            int i2 = ((int) (f2 * c0173b.f792D)) + 1;
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (i > gameEngine.f6104bL.f792D) {
                i = c0173b.f792D;
            }
            if (i2 > gameEngine.f6104bL.f792D) {
                i2 = c0173b.f792D;
            }
            int i3 = 0;
            byte[][] bArr = gameEngine.f6093bs.f1336M;
            if (bArr != null) {
                int i4 = c0173b.f791C;
                Rect rect = this.f5325V;
                for (int i5 = i; i5 < i2; i5++) {
                    int i6 = 0;
                    while (i6 < i4) {
                        byte b = bArr[i6][i5];
                        if (b != 0) {
                            int i7 = i6;
                            int i8 = i6;
                            while (i8 < i4 - 1 && bArr[i8][i5] == b) {
                                i8++;
                            }
                            i6 = i8;
                            rect.m7208a(0 + ((int) (i7 * f3)), 0 + ((int) (i5 * f4)), 0 + ((int) ((i8 + 1) * f3)), 0 + ((int) ((i5 + 1) * f4)));
                            if (b == 10) {
                                c0930ag = c0930ag4;
                            } else {
                                c0930ag = c0930ag2;
                            }
                            this.f5288I.mo892b(rect, c0930ag);
                            i3++;
                            if (i3 > 2) {
                                i3 = 0;
                            }
                        }
                        i6++;
                    }
                }
            }
        }
        this.f5290K.mo910a(this.f5287H, this.f5329ab, this.f5329ab, (Paint) null);
        this.f5289J.mo393p();
        if (GameEngine.f6203aY) {
        }
    }

    /* renamed from: a */
    static C0807o m1941a(int i, Paint paint) {
        synchronized (f5298ac) {
            C0807o c0807o = null;
            Iterator it = f5298ac.iterator();
            while (it.hasNext()) {
                C0807o c0807o2 = (C0807o) it.next();
                if (c0807o2.f5354d >= i && (c0807o == null || c0807o2.f5354d < c0807o.f5354d)) {
                    c0807o = c0807o2;
                }
            }
            if (c0807o != null) {
                f5298ac.remove(c0807o);
                c0807o.f5353c = paint;
                return c0807o;
            }
            return new C0807o(i + 15, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1937a(C0807o c0807o) {
        c0807o.f5353c = null;
        c0807o.f5352b = 0;
        synchronized (f5298ac) {
            if (f5298ac.size() < 20) {
                f5298ac.add(c0807o);
                return;
            }
            Iterator it = f5298ac.iterator();
            while (it.hasNext()) {
                if (((C0807o) it.next()).f5354d < c0807o.f5354d) {
                    it.remove();
                    f5298ac.add(c0807o);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    void m1936a(InterfaceC1027y interfaceC1027y, int i, int i2, float f, float f2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5299c < 50.0f) {
            i3 = 0;
            i4 = 0;
            i5 = 1;
            i6 = 1;
            i7 = 1;
        } else if (this.f5299c < 120.0f) {
            i3 = 0;
            i4 = 0;
            i5 = 2;
            i6 = 2;
            i7 = 2;
        } else {
            i3 = -1;
            i4 = -1;
            i5 = 2;
            i6 = 2;
            i7 = 3;
        }
        int i8 = i4 + i;
        int i9 = i5 + i;
        int i10 = i6 + i2;
        int i11 = i3 + i2;
        boolean z = false;
        if (gameEngine.f6093bs.m6374b() || gameEngine.f6120cb.m2635h()) {
            z = true;
        }
        for (int i12 = -1; i12 < Team.f1364c; i12++) {
            Team m6317k = Team.m6317k(i12);
            if (m6317k != null) {
                Paint paint = m6317k.f1353ad;
                if (gameEngine.f6109bQ.useMinimapAllyColors) {
                    if (z) {
                        this.f5303p.m7242b(Team.m6321i(m6317k.f1311q));
                        paint = this.f5303p;
                    } else if (gameEngine.f6093bs == m6317k) {
                        paint = this.f5311x;
                    } else if (gameEngine.f6093bs.m6342d(m6317k)) {
                        paint = this.f5312y;
                    } else if (gameEngine.f6093bs.m6354c(m6317k)) {
                        paint = this.f5313z;
                    }
                }
                int i13 = 0;
                if (m6317k.m6375a(true, false) > 0) {
                    Unit[] m523a = Unit.f1589bD.m523a();
                    int size = Unit.f1589bD.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Unit unit = m523a[i14];
                        if (unit.team == m6317k && unit.f1654cP) {
                            i13++;
                        }
                    }
                }
                if (i13 > 0) {
                    paint.m7270a(i7);
                    C0807o m1941a = m1941a(i13, paint);
                    Unit[] m523a2 = Unit.f1589bD.m523a();
                    int size2 = Unit.f1589bD.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        Unit unit2 = m523a2[i15];
                        if (unit2.team == m6317k && unit2.f1654cP) {
                            m1941a.m1922a(unit2.f1655cQ, unit2.f1656cR);
                        }
                    }
                    if (m1941a.f5352b != 0) {
                        gameEngine.graphics.mo905a(m1941a);
                    }
                }
                Paint paint2 = m6317k.f1354ae;
                if (gameEngine.f6109bQ.useMinimapAllyColors) {
                    if (z) {
                        this.f5303p.m7242b(Team.m6321i(m6317k.f1311q));
                        Paint paint3 = this.f5303p;
                    } else if (gameEngine.f6093bs == m6317k) {
                        paint2 = this.f5314A;
                    } else if (gameEngine.f6093bs.m6342d(m6317k)) {
                        paint2 = this.f5315B;
                    } else if (gameEngine.f6093bs.m6354c(m6317k)) {
                        paint2 = this.f5316C;
                    }
                }
                int i16 = 0;
                Object[] m544b = C0741a.f4660w.m544b();
                int size3 = C0741a.f4660w.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    C0741a c0741a = (C0741a) m544b[i17];
                    if (c0741a.f4645e == m6317k && c0741a.f4650k) {
                        i16++;
                    }
                }
                if (i16 > 0) {
                    paint2.m7270a(i7);
                    C0807o m1941a2 = m1941a(i16, paint2);
                    Object[] m544b2 = C0741a.f4660w.m544b();
                    int size4 = C0741a.f4660w.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        C0741a c0741a2 = (C0741a) m544b2[i18];
                        if (c0741a2.f4645e == m6317k && c0741a2.f4650k) {
                            m1941a2.m1922a(c0741a2.f4651l, c0741a2.f4652m);
                        }
                    }
                    if (m1941a2.f5352b != 0) {
                        gameEngine.graphics.mo905a(m1941a2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1942a(int i, int i2, EnumC0806n enumC0806n) {
        C0804l c0804l = new C0804l(this);
        c0804l.f5334a = i;
        c0804l.f5335b = i2;
        c0804l.f5338e = enumC0806n;
        c0804l.f5336c = 0.9f;
        c0804l.f5337d = 0.9f;
        this.f5327aa.add(c0804l);
    }

    /* renamed from: h */
    public void m1923h() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5284m = false;
        this.f5282k = (int) this.f5274a;
        this.f5283l = (int) this.f5275b;
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (!unit.isDead && unit.f1650cL == null && unit.m5815ce() && unit.m5851b_() && !unit.m5755u()) {
                Point m1933b = m1933b(unit.f6951ek, unit.f6952el);
                unit.f1655cQ = m1933b.f224a;
                unit.f1656cR = m1933b.f225b;
                unit.f1654cP = true;
            } else {
                unit.f1654cP = false;
            }
        }
        Object[] m544b = C0741a.f4660w.m544b();
        int size2 = C0741a.f4660w.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0741a c0741a = (C0741a) m544b[i2];
            if (!c0741a.f4653n && c0741a.f4657u) {
                Point m1933b2 = m1933b(c0741a.f4646g, c0741a.f4647h);
                c0741a.f4651l = m1933b2.f224a;
                c0741a.f4652m = m1933b2.f225b;
                c0741a.f4650k = true;
            }
        }
        Team team = gameEngine.f6093bs;
        Iterator it = this.f5328ag.iterator();
        while (it.hasNext()) {
            C0808p c0808p = (C0808p) it.next();
            c0808p.f5359e = false;
            if (gameEngine.f6104bL.m6637a(team, c0808p.f5355a, c0808p.f5356b)) {
                c0808p.f5359e = true;
                Point m1933b3 = m1933b(c0808p.f5355a * gameEngine.f6104bL.f784n, c0808p.f5356b * gameEngine.f6104bL.f785o);
                c0808p.f5357c = m1933b3.f224a;
                c0808p.f5358d = m1933b3.f225b;
            }
        }
    }

    /* renamed from: a */
    public void m1946a(float f) {
        if (GameEngine.f6199aU && !GameEngine.f6201aW) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5319L = CommonUtils.m2368a(this.f5319L, f);
        if (this.f5319L == 0.0f) {
            this.f5319L = 15.0f;
            m1923h();
        }
        this.f5297Y += f;
        if (this.f5297Y > 15.0f) {
            C0805m c0805m = null;
            Iterator it = this.f5326Z.iterator();
            while (it.hasNext()) {
                C0805m c0805m2 = (C0805m) it.next();
                if (c0805m2.f5344e != 0.0f) {
                    c0805m2.f5343d = 0.0f;
                } else if (c0805m2.f5343d > 15.0f) {
                    c0805m2.f5343d = 0.0f;
                    c0805m2.f5344e = 300.0f;
                    C0804l c0804l = new C0804l(this);
                    c0804l.f5334a = c0805m2.f5341b;
                    c0804l.f5335b = c0805m2.f5342c;
                    if (c0805m2.f5340a) {
                        c0804l.f5338e = EnumC0806n.f5346a;
                    } else {
                        c0804l.f5338e = EnumC0806n.f5347b;
                        c0804l.f5336c = 0.4f;
                        c0804l.f5337d = 0.8f;
                    }
                    this.f5327aa.add(c0804l);
                }
                c0805m2.f5343d = CommonUtils.m2368a(c0805m2.f5343d, 2.0f * this.f5297Y);
                c0805m2.f5344e = CommonUtils.m2368a(c0805m2.f5344e, this.f5297Y);
                if (c0805m2.f5343d == 0.0f && c0805m2.f5344e == 0.0f) {
                    c0805m = c0805m2;
                }
            }
            if (c0805m != null) {
                this.f5326Z.remove(c0805m);
            }
            Iterator it2 = this.f5327aa.iterator();
            while (it2.hasNext()) {
                C0804l c0804l2 = (C0804l) it2.next();
                if (c0804l2.f5338e != EnumC0806n.f5349d && gameEngine.f6247cP.m7205b(c0804l2.f5334a, c0804l2.f5335b)) {
                    c0804l2.f5336c = 0.0f;
                    c0804l2.f5337d = 0.0f;
                }
            }
            this.f5297Y = 0.0f;
        }
    }

    /* renamed from: b */
    public float m1934b(float f) {
        return f * this.f5280i * this.f5299c;
    }

    /* renamed from: b */
    public Point m1933b(float f, float f2) {
        if (!this.f5277f) {
            this.f5330ad.m7217a(-1, -1);
            return this.f5330ad;
        }
        this.f5330ad.m7217a((int) ((f * this.f5280i * this.f5299c) + this.f5274a), (int) ((f2 * this.f5281j * this.f5300d) + this.f5275b));
        return this.f5330ad;
    }

    /* renamed from: c */
    public Point m1930c(float f, float f2) {
        if (f < this.f5274a || f2 < this.f5275b || f > this.f5274a + this.f5299c || f2 > this.f5275b + this.f5300d) {
            return null;
        }
        this.f5330ad.m7217a((int) (((f - this.f5274a) / this.f5299c) * this.f5278g), (int) (((f2 - this.f5275b) / this.f5300d) * this.f5279h));
        return this.f5330ad;
    }

    /* renamed from: c */
    public float m1931c(float f) {
        return f < this.f5274a ? this.f5274a : f > this.f5274a + this.f5299c ? this.f5274a + this.f5299c : f;
    }

    /* renamed from: d */
    public float m1928d(float f) {
        return f < this.f5275b ? this.f5275b : f > this.f5275b + this.f5300d ? this.f5275b + this.f5300d : f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f.k$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/k$1.class */
    public class C08031 extends AbstractC0942m {
        C08031() {
        }

        /* renamed from: a */
        public void mo1007a(InterfaceC1027y interfaceC1027y) {
            C0802k.this.m1936a(interfaceC1027y, 0, 0, 0.0f, 1.0f);
        }
    }

    /* renamed from: e */
    public void m1926e(float f) {
        Paint paint;
        GameEngine gameEngine = GameEngine.getInstance();
        InterfaceC1027y interfaceC1027y = gameEngine.graphics;
        m1947a();
        if (this.f5289J != null && !CommonUtils.m2272e(this.f5299c, m1929d(), 5.0f)) {
            GameEngine.m1144b("minimap", "minimap size has changed, reseting");
            m1932c();
        }
        if (!this.f5276e || this.f5289J == null) {
            m1924g();
        }
        if (this.f5282k != ((int) this.f5274a) || this.f5283l != ((int) this.f5275b) || this.f5284m) {
            m1923h();
        }
        if (gameEngine.f6104bL.f840E) {
            if (this.f5320O && !this.f5321P) {
                this.f5291M = CommonUtils.m2368a(this.f5291M, 1.0f);
                if (this.f5291M == 0.0f) {
                    this.f5291M = 40.0f;
                    this.f5320O = false;
                    this.f5322Q = 0.0f;
                    this.f5321P = true;
                }
            }
            if (this.f5321P) {
                this.f5292N = CommonUtils.m2368a(this.f5292N, 1.0f);
                if (this.f5292N == 0.0f) {
                    this.f5292N = 3.0f;
                    if (this.f5289J != null) {
                        float f2 = this.f5322Q - 0.005f;
                        this.f5322Q = (float) (this.f5322Q + 0.04d);
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        if (this.f5322Q >= 1.0f) {
                            this.f5322Q = 1.0f;
                            this.f5321P = false;
                        }
                        m1945a(f2, this.f5322Q);
                    }
                }
            }
        }
        interfaceC1027y.mo890b(this.f5289J, this.f5274a, this.f5275b, this.f5301n);
        this.f5310w.m7208a((int) this.f5274a, (int) this.f5275b, (int) (this.f5274a + this.f5299c), (int) ((this.f5275b + this.f5300d) - 0.4d));
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Object[] m559a = Projectile.f1082a.m559a();
        int i = Projectile.f1082a.f6888a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Projectile) m559a[i2]).f1003D) {
                z3 = true;
                z2 = true;
            }
        }
        Iterator it = this.f5327aa.iterator();
        while (it.hasNext()) {
            C0804l c0804l = (C0804l) it.next();
            if (c0804l.f5338e != EnumC0806n.f5347b) {
                z = true;
                if (c0804l.f5338e != EnumC0806n.f5349d) {
                    z2 = true;
                }
            }
        }
        if (!z && !z3) {
            this.f5302o.m7267a(255, 100, 100, 100);
            this.f5302o.m7270a(1.0f);
            if (C0797f.f5187bA) {
                this.f5302o.m7267a(115, 0, 0, 0);
                this.f5302o.m7270a(2.0f);
            }
        } else {
            this.f5304q += 5.0f * f;
            if (this.f5304q > 180.0f) {
                this.f5304q -= 180.0f;
            }
            float sin = CommonUtils.sin(this.f5304q);
            if (z3) {
                this.f5302o.m7267a(255, 0, (int) (0.0f + (sin * 230.0f)), 0);
            } else if (!z2) {
                this.f5302o.m7267a(255, 12, (int) (0.0f + (sin * 220.0f)), (int) (0.0f + (sin * 220.0f)));
            } else {
                this.f5302o.m7267a(255, (int) (0.0f + (sin * 230.0f)), 0, 0);
            }
            this.f5302o.m7270a(2.0f);
        }
        interfaceC1027y.mo892b(this.f5310w, this.f5302o);
        Iterator it2 = this.f5328ag.iterator();
        while (it2.hasNext()) {
            C0808p c0808p = (C0808p) it2.next();
            if (c0808p.f5359e) {
                this.f5325V.m7208a(c0808p.f5357c, c0808p.f5358d, c0808p.f5357c + 2, c0808p.f5358d + 2);
                interfaceC1027y.mo892b(this.f5325V, this.f5317D);
            }
        }
        m1936a(interfaceC1027y, 0, 0, 0.0f, 1.0f);
        if (this.f5332af.size() != 0) {
            Iterator it3 = this.f5332af.iterator();
            while (it3.hasNext()) {
                C0809q c0809q = (C0809q) it3.next();
                if (c0809q.f5361a.isDead) {
                    it3.remove();
                } else {
                    Unit unit = c0809q.f5361a;
                    Point m1933b = m1933b(unit.f6951ek, unit.f6952el);
                    if (!unit.m5899a(m1933b.f224a, m1933b.f225b)) {
                        interfaceC1027y.mo931a(m1933b.f224a, m1933b.f225b, 4.0f, unit.team.f1353ad);
                    }
                }
            }
        }
        int i3 = Projectile.f1082a.f6888a;
        for (int i4 = 0; i4 < i3; i4++) {
            Projectile projectile = (Projectile) m559a[i4];
            if ((projectile.f1003D || (projectile.f990q != null && projectile.f990q.f1003D)) && projectile.f983j != null) {
                Point m1933b2 = m1933b(projectile.f6951ek, projectile.f6952el);
                float f3 = 2.0f;
                if (projectile.f1003D) {
                    f3 = 4.0f;
                }
                interfaceC1027y.mo931a(m1933b2.f224a, m1933b2.f225b, f3, projectile.f983j.team.f1353ad);
            }
        }
        Point m1933b3 = m1933b(gameEngine.f6138cv, gameEngine.f6139cw);
        this.f5318E.f230a = m1933b3.f224a;
        this.f5318E.f231b = m1933b3.f225b;
        Point m1933b4 = m1933b(gameEngine.f6138cv + gameEngine.f6142cz, gameEngine.f6139cw + gameEngine.f6143cA);
        this.f5318E.f232c = m1933b4.f224a;
        this.f5318E.f233d = m1933b4.f225b;
        if (this.f5318E.f230a < this.f5310w.f230a) {
            this.f5318E.f230a = this.f5310w.f230a;
        }
        if (this.f5318E.f232c > this.f5310w.f232c) {
            this.f5318E.f232c = this.f5310w.f232c;
        }
        if (this.f5318E.f231b < this.f5310w.f231b) {
            this.f5318E.f231b = this.f5310w.f231b;
        }
        if (this.f5318E.f233d > this.f5310w.f233d) {
            this.f5318E.f233d = this.f5310w.f233d;
        }
        interfaceC1027y.mo892b(this.f5318E, this.f5306s);
        this.f5305r += 6.0f * f;
        if (this.f5305r > 180.0f) {
            this.f5305r -= 180.0f;
        }
        Iterator it4 = this.f5327aa.iterator();
        while (it4.hasNext()) {
            C0804l c0804l2 = (C0804l) it4.next();
            Point m1933b5 = m1933b(c0804l2.f5334a, c0804l2.f5335b);
            float f4 = c0804l2.f5336c;
            float f5 = 0.05f;
            if (c0804l2.f5338e == EnumC0806n.f5347b) {
                paint = this.f5308u;
                f5 = 0.03f;
                float sin2 = CommonUtils.sin(this.f5305r);
                paint.m7267a((int) (50.0f + (sin2 * 190.0f)), (int) (50.0f + (sin2 * 190.0f)), 0, 0);
            } else if (c0804l2.f5338e == EnumC0806n.f5349d) {
                paint = this.f5309v;
            } else {
                paint = this.f5307t;
                float sin3 = CommonUtils.sin(this.f5305r);
                paint.m7267a((int) (50.0f + (sin3 * 190.0f)), (int) (50.0f + (sin3 * 190.0f)), 0, 0);
            }
            float m2315b = CommonUtils.m2315b(f4, f5, 1.0f);
            if (c0804l2.f5338e == EnumC0806n.f5347b) {
                float f6 = this.f5299c * m2315b;
                float f7 = this.f5300d * m2315b;
                interfaceC1027y.mo932a(m1931c(m1933b5.f224a - f6), m1928d(m1933b5.f225b - f7), m1931c(m1933b5.f224a + f6), m1928d(m1933b5.f225b + f7), paint);
                interfaceC1027y.mo932a(m1931c(m1933b5.f224a + f6), m1928d(m1933b5.f225b - f7), m1931c(m1933b5.f224a - f6), m1928d(m1933b5.f225b + f7), paint);
            } else {
                interfaceC1027y.mo932a(m1931c(m1933b5.f224a - (this.f5299c * m2315b)), m1928d(m1933b5.f225b), m1931c(m1933b5.f224a + (this.f5299c * m2315b)), m1928d(m1933b5.f225b), paint);
                interfaceC1027y.mo932a(m1931c(m1933b5.f224a), m1928d(m1933b5.f225b - (this.f5300d * m2315b)), m1931c(m1933b5.f224a), m1928d(m1933b5.f225b + (this.f5300d * m2315b)), paint);
            }
            c0804l2.f5336c = CommonUtils.m2368a(c0804l2.f5336c, 0.04f * f);
            if (c0804l2.f5336c == 0.0f) {
                c0804l2.f5337d = CommonUtils.m2368a(c0804l2.f5337d, 0.005f * f);
                if (c0804l2.f5337d == 0.0f) {
                    it4.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public void m1938a(Unit unit) {
        if (this.f5332af.contains(unit)) {
            return;
        }
        C0809q c0809q = new C0809q(this);
        c0809q.f5361a = unit;
        this.f5332af.add(c0809q);
    }
}
