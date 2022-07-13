package com.corrodinggames.rts.gameFramework.gui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.AbstractC0846l;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.effect.C0661a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.e.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/k.class */
public class minimap_img {

    /* renamed from: a */
    float f4842a;

    /* renamed from: b */
    float f4843b;

    /* renamed from: e */
    public boolean f4844e;

    /* renamed from: f */
    public boolean f4845f;

    /* renamed from: g */
    public int f4846g;

    /* renamed from: h */
    public int f4847h;

    /* renamed from: i */
    public float f4848i;

    /* renamed from: j */
    public float f4849j;

    /* renamed from: k */
    int f4850k;

    /* renamed from: l */
    int f4851l;

    /* renamed from: m */
    boolean f4852m;

    /* renamed from: F */
    BitmapOrTexture f4829F;

    /* renamed from: G */
    Graphics f4830G;

    /* renamed from: H */
    BitmapOrTexture f4831H;

    /* renamed from: I */
    Graphics f4832I;

    /* renamed from: J */
    public BitmapOrTexture f4833J;

    /* renamed from: K */
    Graphics f4834K;

    /* renamed from: M */
    float f4835M;

    /* renamed from: N */
    float f4836N;

    /* renamed from: T */
    public BitmapOrTexture f4837T;

    /* renamed from: U */
    public BitmapOrTexture f4838U;

    /* renamed from: W */
    UniquePaint[] f4839W;

    /* renamed from: X */
    UniquePaint f4840X;

    /* renamed from: Y */
    float f4841Y;

    /* renamed from: ac */
    static ArrayList f4828ac = new ArrayList();

    /* renamed from: c */
    public float f4853c = 120.0f;

    /* renamed from: d */
    public float f4854d = 120.0f;

    /* renamed from: n */
    final Paint f4855n = new Paint();

    /* renamed from: o */
    final Paint f4856o = new Paint();

    /* renamed from: p */
    final Paint f4857p = new Paint();

    /* renamed from: q */
    float f4858q = 0.0f;

    /* renamed from: r */
    float f4859r = 0.0f;

    /* renamed from: s */
    final Paint f4860s = new UniquePaint();

    /* renamed from: t */
    final Paint f4861t = new Paint();

    /* renamed from: u */
    final Paint f4862u = new Paint();

    /* renamed from: v */
    final Paint f4863v = new Paint();

    /* renamed from: w */
    public final Rect f4864w = new Rect();

    /* renamed from: x */
    final Paint f4865x = new UniquePaint();

    /* renamed from: y */
    final Paint f4866y = new UniquePaint();

    /* renamed from: z */
    final Paint f4867z = new UniquePaint();

    /* renamed from: A */
    final Paint f4868A = new UniquePaint();

    /* renamed from: B */
    final Paint f4869B = new UniquePaint();

    /* renamed from: C */
    final Paint f4870C = new UniquePaint();

    /* renamed from: D */
    final Paint f4871D = new UniquePaint();

    /* renamed from: E */
    final Rect f4872E = new Rect();

    /* renamed from: L */
    float f4873L = 0.0f;

    /* renamed from: O */
    public boolean f4874O = false;

    /* renamed from: P */
    public boolean f4875P = false;

    /* renamed from: Q */
    public float f4876Q = 0.0f;

    /* renamed from: R */
    int f4877R = 30;

    /* renamed from: S */
    int f4878S = -1;

    /* renamed from: V */
    final Rect f4879V = new Rect();

    /* renamed from: Z */
    public final ArrayList f4880Z = new ArrayList();

    /* renamed from: aa */
    public final ArrayList f4881aa = new ArrayList();

    /* renamed from: ag */
    private final ArrayList f4882ag = new ArrayList();

    /* renamed from: ab */
    Rect f4883ab = new Rect();

    /* renamed from: ad */
    Point f4884ad = new Point();

    /* renamed from: ae */
    AbstractC0846l f4885ae = new AbstractC0846l() { // from class: com.corrodinggames.rts.gameFramework.e.k.1
        @Override // com.corrodinggames.rts.gameFramework.draw.AbstractC0846l
        /* renamed from: a */
        public void mo1002a(Graphics graphics) {
            minimap_img.this.m1794a(graphics, 0, 0, 0.0f, 1.0f);
        }
    };

    /* renamed from: af */
    ArrayList f4886af = new ArrayList();

    /* renamed from: a */
    public void m1801a(int i, int i2, float f, Unit unit) {
        boolean z = unit != null && unit.mo2975bH();
        Iterator it = this.f4880Z.iterator();
        while (it.hasNext()) {
            C0724m c0724m = (C0724m) it.next();
            if (c0724m.f4894a == z && CommonUtils.absi(i - c0724m.f4895b) < 40 && CommonUtils.absi(i2 - c0724m.f4896c) < 40) {
                c0724m.f4897d += f;
                return;
            }
        }
        this.f4880Z.add(new C0724m(this, f, i, i2, z));
    }

    /* renamed from: a */
    public void m1798a(Context context) {
        this.f4856o.setStyle(Paint.Style.f217b);
        this.f4856o.setStrokeWidth(1.0f);
        this.f4860s.m4717a(255, 255, 255, 255);
        this.f4860s.setStyle(Paint.Style.f217b);
        this.f4860s.setStrokeWidth(1.0f);
        this.f4839W = new UniquePaint[11];
        for (int i = 0; i <= 10; i++) {
            this.f4839W[i] = new UniquePaint();
            this.f4839W[i].setColor(-16777216);
            this.f4839W[i].setStyle(Paint.Style.f216a);
            this.f4839W[i].setAlpha(i * 25);
        }
        this.f4840X = new UniquePaint();
        this.f4840X.setColor(-16777216);
        this.f4840X.setStyle(Paint.Style.f216a);
        this.f4861t.m4717a(255, 255, 0, 0);
        this.f4861t.setStyle(Paint.Style.f217b);
        this.f4861t.setStrokeWidth(2.0f);
        this.f4862u.m4717a(155, 255, 0, 0);
        this.f4862u.setStyle(Paint.Style.f217b);
        this.f4862u.setStrokeWidth(2.0f);
        this.f4863v.m4717a(200, 12, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_11, 219);
        this.f4863v.setStyle(Paint.Style.f217b);
        this.f4863v.setStrokeWidth(2.0f);
        this.f4865x.setColor(-16711936);
        this.f4866y.setColor(-256);
        this.f4867z.setColor(-65536);
        this.f4868A.setColor(m1802a(this.f4865x.m4686e()));
        this.f4869B.setColor(m1802a(this.f4866y.m4686e()));
        this.f4870C.setColor(m1802a(this.f4867z.m4686e()));
        this.f4871D.m4717a(210, 255, 255, 255);
    }

    /* renamed from: a */
    public static int m1802a(int i) {
        return Color.argb(Color.m4734a(i), (int) (Color.m4730b(i) * 0.5f), (int) (Color.m4729c(i) * 0.5f), (int) (Color.m4728d(i) * 0.5f));
    }

    /* renamed from: a */
    public void m1805a() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!InterfaceEngine.f4663bC) {
            this.f4842a = (int) (gameEngine.f5870ck - (this.f4853c + 0.0f));
            this.f4843b = 0.0f;
            return;
        }
        this.f4842a = 0.0f;
        this.f4843b = (int) (gameEngine.f5871cl - (this.f4854d + 0.0f));
    }

    /* renamed from: b */
    public int m1793b() {
        return (int) (this.f4843b + this.f4854d);
    }

    /* renamed from: a */
    public void m1797a(Map map, boolean z) {
        this.f4886af.clear();
        if (z) {
            this.f4852m = true;
            return;
        }
        this.f4846g = 1;
        this.f4847h = 1;
        this.f4848i = 1.0f;
        this.f4849j = 1.0f;
        this.f4845f = false;
        this.f4844e = false;
    }

    /* renamed from: c */
    public void m1790c() {
        if (this.f4833J != null) {
            this.f4833J.mo49n();
            this.f4833J = null;
        }
        if (this.f4829F != null) {
            this.f4829F.mo49n();
            this.f4829F = null;
        }
        if (this.f4837T != null) {
            this.f4837T.mo49n();
            this.f4837T = null;
        }
        if (this.f4838U != null) {
            this.f4838U.mo49n();
            this.f4838U = null;
        }
        if (this.f4832I != null) {
            this.f4832I.mo129p();
            this.f4832I = null;
        }
        if (this.f4831H != null) {
            this.f4831H.mo49n();
            this.f4831H = null;
        }
        this.f4834K = null;
        this.f4844e = false;
    }

    /* renamed from: d */
    public float m1787d() {
        return GameEngine.getInstance().f5874cp;
    }

    /* renamed from: e */
    public void m1785e() {
        GameEngine game = GameEngine.getInstance();
        m1783f();
        GameEngine.PrintLOG("Creating minimap image buffers..");
        if (this.f4829F == null) {
            this.f4829F = game.graphics.mo214a((int) this.f4853c, (int) this.f4854d, false);
            this.f4830G = game.graphics.mo199a(this.f4829F);
        }
        if (this.f4833J == null) {
            this.f4833J = game.graphics.mo214a((int) this.f4853c, (int) this.f4854d, false);
            this.f4834K = game.graphics.mo199a(this.f4833J);
        }
        if (this.f4831H == null) {
            this.f4831H = game.graphics.mo214a((int) this.f4853c, (int) this.f4854d, false);
            this.f4832I = game.graphics.mo199a(this.f4831H);
        }
    }

    /* renamed from: f */
    public void m1783f() {
        this.f4853c = m1787d();
        this.f4854d = this.f4853c;
        m1805a();
    }

    /* renamed from: g */
    public void m1782g() {
        long tookTime = C0651bl.getTookTime();
        GameEngine.PrintLOG("--setting up minimap--");
        GameEngine gameEngine = GameEngine.getInstance();
        m1783f();
        this.f4846g = gameEngine.map.mapWidth * gameEngine.map.pixel_Width;
        this.f4847h = gameEngine.map.mapHeight * gameEngine.map.pixel_Height;
        if (this.f4846g <= 0) {
            this.f4846g = 1;
        }
        if (this.f4847h <= 0) {
            this.f4847h = 1;
        }
        this.f4848i = 1.0f / this.f4846g;
        this.f4849j = 1.0f / this.f4847h;
        this.f4845f = true;
        m1785e();
        this.f4880Z.clear();
        this.f4881aa.clear();
        this.f4882ag.clear();
        Iterator it = gameEngine.map.resPools.iterator();
        while (it.hasNext()) {
            Point point = (Point) it.next();
            this.f4882ag.add(new C0727p(this, point.game, point.y));
        }
        this.f4830G.mo162b(-16777216);
        this.f4834K.mo162b(-16777216);
        if (1 == 0) {
            Rect rect = new Rect(0, 0, (int) this.f4853c, (int) this.f4854d);
            gameEngine.map.mainLayer.m4077a(this.f4830G, 0.0f, 0.0f, 0.0f, 0.0f, this.f4846g, this.f4847h, this.f4853c / this.f4846g, this.f4854d / this.f4847h, false, false, false);
            Paint paint = new Paint();
            paint.m4717a(50, 0, 0, 0);
            this.f4830G.drawRect(rect, paint);
        } else {
            for (int i = 0; i < 2; i++) {
                for (int i2 = 0; i2 < 2; i2++) {
                    this.f4832I.mo162b(-16777216);
                    int i3 = ((int) this.f4853c) / 2;
                    int i4 = ((int) this.f4854d) / 2;
                    int i5 = this.f4846g / 2;
                    int i6 = this.f4847h / 2;
                    gameEngine.map.mainLayer.m4077a(this.f4832I, i5 * i, i6 * i2, i5 * i, i6 * i2, i5, i6, this.f4853c / i5, this.f4854d / i6, false, false, false);
                    Rect rect2 = new Rect(0, 0, (int) this.f4853c, (int) this.f4854d);
                    Rect rect3 = new Rect(i3 * i, i4 * i2, i3 * (i + 1), i4 * (i2 + 1));
                    Paint paint2 = new Paint();
                    paint2.mo935a(true);
                    paint2.m4687d(true);
                    paint2.m4695b(true);
                    this.f4834K.mo191a(this.f4831H, rect2, rect3, paint2);
                }
            }
            Rect rect4 = new Rect(0, 0, (int) this.f4853c, (int) this.f4854d);
            this.f4830G.mo162b(-16777216);
            Paint paint3 = new Paint();
            paint3.mo935a(true);
            paint3.m4687d(true);
            paint3.m4695b(true);
            paint3.m4717a(200, 255, 255, 255);
            this.f4830G.mo191a(this.f4833J, rect4, rect4, paint3);
        }
        this.f4832I.mo162b(-16777216);
        this.f4834K.mo162b(-16777216);
        this.f4835M = 50.0f;
        m1803a(0.0f, 1.0f);
        this.f4844e = true;
        GameEngine.PrintLOG("Minimap map render took:" + C0651bl.m2278a(C0651bl.m2277a(tookTime)));
    }

    /* renamed from: a */
    void m1803a(float f, float f2) {
        UniquePaint uniquePaint;
        GameEngine game = GameEngine.getInstance();
        this.f4883ab.set(0, (int) (f * this.f4854d), (int) this.f4853c, (int) (f2 * this.f4854d));
        this.f4832I.mo191a(this.f4829F, this.f4883ab, this.f4883ab, (Paint) null);
        Map map = game.map;
        if (map.f818D) {
            boolean z = map.f820F;
            UniquePaint uniquePaint2 = this.f4839W[5];
            UniquePaint uniquePaint3 = this.f4839W[10];
            UniquePaint uniquePaint4 = this.f4840X;
            uniquePaint4.setAlpha(255);
            if (z) {
                uniquePaint4.setAlpha((int) ((1.0f - ((1.0f - (uniquePaint2.m4684f() / 255.0f)) * (1.0f - (this.f4839W[7].m4684f() / 255.0f)))) * 255.0f));
            }
            float f3 = this.f4853c / map.mapWidth;
            float f4 = this.f4854d / map.mapHeight;
            int i = ((int) (f * map.mapHeight)) - 1;
            int i2 = ((int) (f2 * map.mapHeight)) + 1;
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (i > game.map.mapHeight) {
                i = map.mapHeight;
            }
            if (i2 > game.map.mapHeight) {
                i2 = map.mapHeight;
            }
            byte[][] bArr = game.playerTeam.fogOfWar_map;
            if (bArr != null) {
                int i3 = map.mapWidth;
                Rect rect = this.f4879V;
                for (int i4 = i; i4 < i2; i4++) {
                    int i5 = 0;
                    while (i5 < i3) {
                        byte b = bArr[i5][i4];
                        if (b != 0) {
                            int i6 = i5;
                            int i7 = i5;
                            while (i7 < i3 - 1 && bArr[i7][i4] == b) {
                                i7++;
                            }
                            i5 = i7;
                            rect.set(0 + ((int) (i6 * f3)), 0 + ((int) (i4 * f4)), 0 + ((int) ((i7 + 1) * f3)), 0 + ((int) ((i4 + 1) * f4)));
                            if (b == 10) {
                                uniquePaint = uniquePaint4;
                            } else {
                                uniquePaint = uniquePaint2;
                            }
                            this.f4832I.drawRect(rect, uniquePaint);
                        }
                        i5++;
                    }
                }
            }
        }
        this.f4834K.mo191a(this.f4831H, this.f4883ab, this.f4883ab, (Paint) null);
        this.f4833J.mo48o();
        if (GameEngine.isLibGDX) {
        }
    }

    /* renamed from: a */
    static C0726o m1799a(int i, Paint paint) {
        synchronized (f4828ac) {
            C0726o c0726o = null;
            Iterator it = f4828ac.iterator();
            while (it.hasNext()) {
                C0726o c0726o2 = (C0726o) it.next();
                if (c0726o2.f4908d >= i && (c0726o == null || c0726o2.f4908d < c0726o.f4908d)) {
                    c0726o = c0726o2;
                }
            }
            if (c0726o != null) {
                f4828ac.remove(c0726o);
                c0726o.f4907c = paint;
                return c0726o;
            }
            return new C0726o(i + 15, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1795a(C0726o c0726o) {
        c0726o.f4907c = null;
        c0726o.f4906b = 0;
        synchronized (f4828ac) {
            if (f4828ac.size() < 20) {
                f4828ac.add(c0726o);
                return;
            }
            Iterator it = f4828ac.iterator();
            while (it.hasNext()) {
                if (((C0726o) it.next()).f4908d < c0726o.f4908d) {
                    it.remove();
                    f4828ac.add(c0726o);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    void m1794a(Graphics graphics, int i, int i2, float f, float f2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        GameEngine game = GameEngine.getInstance();
        if (this.f4853c < 50.0f) {
            i6 = 0;
            i7 = 0;
            i4 = 1;
            i5 = 1;
            i3 = 1;
        } else if (this.f4853c < 120.0f) {
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
        if (game.playerTeam.m3945b() || game.replayEngine.isPlaying()) {
            z = true;
        }
        for (int i12 = -1; i12 < Team.playerNumMax; i12++) {
            Team team = Team.getTeam(i12);
            if (team != null) {
                Paint paint = team.f1310ab;
                if (game.curSettings.useMinimapAllyColors) {
                    if (z) {
                        this.f4857p.setColor(Team.m3892i(team.allyGroup));
                        paint = this.f4857p;
                    } else if (game.playerTeam == team) {
                        paint = this.f4865x;
                    } else if (game.playerTeam.m3913d(team)) {
                        paint = this.f4866y;
                    } else if (game.playerTeam.m3925c(team)) {
                        paint = this.f4867z;
                    }
                }
                int i13 = 0;
                if (team.getUnitCounts(true, false) > 0) {
                    Unit[] m485a = Unit.fastUnitList.m485a();
                    int size = Unit.fastUnitList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Unit unit = m485a[i14];
                        if (unit.team == team && unit.f1534cI) {
                            i13++;
                        }
                    }
                }
                if (i13 > 0) {
                    paint.setStrokeWidth(i3);
                    C0726o m1799a = m1799a(i13, paint);
                    Unit[] m485a2 = Unit.fastUnitList.m485a();
                    int size2 = Unit.fastUnitList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        Unit unit2 = m485a2[i15];
                        if (unit2.team == team && unit2.f1534cI) {
                            m1799a.m1780a(unit2.f1535cJ, unit2.f1536cK);
                        }
                    }
                    if (m1799a.f4906b != 0) {
                        game.graphics.mo186a(m1799a);
                    }
                }
                Paint paint2 = team.mapPaint;
                if (game.curSettings.useMinimapAllyColors) {
                    if (z) {
                        this.f4857p.setColor(Team.m3892i(team.allyGroup));
                        Paint paint3 = this.f4857p;
                    } else if (game.playerTeam == team) {
                        paint2 = this.f4868A;
                    } else if (game.playerTeam.m3913d(team)) {
                        paint2 = this.f4869B;
                    } else if (game.playerTeam.m3925c(team)) {
                        paint2 = this.f4870C;
                    }
                }
                int i16 = 0;
                Object[] m506b = C0661a.f4233w.m506b();
                int size3 = C0661a.f4233w.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    C0661a c0661a = (C0661a) m506b[i17];
                    if (c0661a.f4219e == team && c0661a.f4224k) {
                        i16++;
                    }
                }
                if (i16 > 0) {
                    paint2.setStrokeWidth(i3);
                    C0726o m1799a2 = m1799a(i16, paint2);
                    Object[] m506b2 = C0661a.f4233w.m506b();
                    int size4 = C0661a.f4233w.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        C0661a c0661a2 = (C0661a) m506b2[i18];
                        if (c0661a2.f4219e == team && c0661a2.f4224k) {
                            m1799a2.m1780a(c0661a2.f4225l, c0661a2.f4226m);
                        }
                    }
                    if (m1799a2.f4906b != 0) {
                        game.graphics.mo186a(m1799a2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1800a(int i, int i2, EnumC0725n enumC0725n) {
        C0723l c0723l = new C0723l(this);
        c0723l.f4888a = i;
        c0723l.f4889b = i2;
        c0723l.f4892e = enumC0725n;
        c0723l.f4890c = 0.9f;
        c0723l.f4891d = 0.9f;
        this.f4881aa.add(c0723l);
    }

    /* renamed from: h */
    public void m1781h() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f4852m = false;
        this.f4850k = (int) this.f4842a;
        this.f4851l = (int) this.f4843b;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (!unit.dead && unit.transportedBy == null && unit.m3746cd() && unit.mo3195b_() && !unit.mo1773u()) {
                Point m1791b = m1791b(unit.x, unit.y);
                unit.f1535cJ = m1791b.game;
                unit.f1536cK = m1791b.y;
                unit.f1534cI = true;
            } else {
                unit.f1534cI = false;
            }
        }
        Object[] m506b = C0661a.f4233w.m506b();
        int size2 = C0661a.f4233w.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0661a c0661a = (C0661a) m506b[i2];
            if (!c0661a.f4227n && c0661a.f4231u) {
                Point m1791b2 = m1791b(c0661a.f4220g, c0661a.f4221h);
                c0661a.f4225l = m1791b2.game;
                c0661a.f4226m = m1791b2.y;
                c0661a.f4224k = true;
            }
        }
        Team team = gameEngine.playerTeam;
        Iterator it = this.f4882ag.iterator();
        while (it.hasNext()) {
            C0727p c0727p = (C0727p) it.next();
            c0727p.f4913e = false;
            if (gameEngine.map.m4153a(team, c0727p.f4909a, c0727p.f4910b)) {
                c0727p.f4913e = true;
                Point m1791b3 = m1791b(c0727p.f4909a * gameEngine.map.pixel_Width, c0727p.f4910b * gameEngine.map.pixel_Height);
                c0727p.f4911c = m1791b3.game;
                c0727p.f4912d = m1791b3.y;
            }
        }
    }

    /* renamed from: a */
    public void m1804a(float f) {
        if (GameEngine.isDedicatedServer && !GameEngine.isPC_Device) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        this.f4873L = CommonUtils.toZero(this.f4873L, f);
        if (this.f4873L == 0.0f) {
            this.f4873L = 15.0f;
            m1781h();
        }
        this.f4841Y += f;
        if (this.f4841Y > 15.0f) {
            C0724m c0724m = null;
            Iterator it = this.f4880Z.iterator();
            while (it.hasNext()) {
                C0724m c0724m2 = (C0724m) it.next();
                if (c0724m2.f4898e != 0.0f) {
                    c0724m2.f4897d = 0.0f;
                } else if (c0724m2.f4897d > 15.0f) {
                    c0724m2.f4897d = 0.0f;
                    c0724m2.f4898e = 300.0f;
                    C0723l c0723l = new C0723l(this);
                    c0723l.f4888a = c0724m2.f4895b;
                    c0723l.f4889b = c0724m2.f4896c;
                    if (c0724m2.f4894a) {
                        c0723l.f4892e = EnumC0725n.base;
                    } else {
                        c0723l.f4892e = EnumC0725n.unit;
                        c0723l.f4890c = 0.4f;
                        c0723l.f4891d = 0.8f;
                    }
                    this.f4881aa.add(c0723l);
                }
                c0724m2.f4897d = CommonUtils.toZero(c0724m2.f4897d, 2.0f * this.f4841Y);
                c0724m2.f4898e = CommonUtils.toZero(c0724m2.f4898e, this.f4841Y);
                if (c0724m2.f4897d == 0.0f && c0724m2.f4898e == 0.0f) {
                    c0724m = c0724m2;
                }
            }
            if (c0724m != null) {
                this.f4880Z.remove(c0724m);
            }
            Iterator it2 = this.f4881aa.iterator();
            while (it2.hasNext()) {
                C0723l c0723l2 = (C0723l) it2.next();
                if (c0723l2.f4892e != EnumC0725n.message && gameEngine.f5961cP.contains(c0723l2.f4888a, c0723l2.f4889b)) {
                    c0723l2.f4890c = 0.0f;
                    c0723l2.f4891d = 0.0f;
                }
            }
            this.f4841Y = 0.0f;
        }
    }

    /* renamed from: b */
    public float m1792b(float f) {
        return f * this.f4848i * this.f4853c;
    }

    /* renamed from: b */
    public Point m1791b(float f, float f2) {
        if (!this.f4845f) {
            this.f4884ad.m4674a(-1, -1);
            return this.f4884ad;
        }
        this.f4884ad.m4674a((int) ((f * this.f4848i * this.f4853c) + this.f4842a), (int) ((f2 * this.f4849j * this.f4854d) + this.f4843b));
        return this.f4884ad;
    }

    /* renamed from: c */
    public Point m1788c(float f, float f2) {
        if (f < this.f4842a || f2 < this.f4843b || f > this.f4842a + this.f4853c || f2 > this.f4843b + this.f4854d) {
            return null;
        }
        this.f4884ad.m4674a((int) (((f - this.f4842a) / this.f4853c) * this.f4846g), (int) (((f2 - this.f4843b) / this.f4854d) * this.f4847h));
        return this.f4884ad;
    }

    /* renamed from: c */
    public float m1789c(float f) {
        return f < this.f4842a ? this.f4842a : f > this.f4842a + this.f4853c ? this.f4842a + this.f4853c : f;
    }

    /* renamed from: d */
    public float m1786d(float f) {
        return f < this.f4843b ? this.f4843b : f > this.f4843b + this.f4854d ? this.f4843b + this.f4854d : f;
    }

    /* renamed from: e */
    public void m1784e(float f) {
        Paint paint;
        GameEngine gameEngine = GameEngine.getInstance();
        Graphics graphics = gameEngine.graphics;
        m1805a();
        if (this.f4833J != null && !CommonUtils.m1651e(this.f4853c, m1787d(), 5.0f)) {
            GameEngine.log("minimap", "minimap size has changed, reseting");
            m1790c();
        }
        if (!this.f4844e || this.f4833J == null) {
            m1782g();
        }
        if (this.f4850k != ((int) this.f4842a) || this.f4851l != ((int) this.f4843b) || this.f4852m) {
            m1781h();
        }
        if (gameEngine.map.f818D) {
            if (this.f4874O && !this.f4875P) {
                this.f4835M = CommonUtils.toZero(this.f4835M, 1.0f);
                if (this.f4835M == 0.0f) {
                    this.f4835M = 40.0f;
                    this.f4874O = false;
                    this.f4876Q = 0.0f;
                    this.f4875P = true;
                }
            }
            if (this.f4875P) {
                this.f4836N = CommonUtils.toZero(this.f4836N, 1.0f);
                if (this.f4836N == 0.0f) {
                    this.f4836N = 3.0f;
                    if (this.f4833J != null) {
                        float f2 = this.f4876Q - 0.005f;
                        this.f4876Q = (float) (this.f4876Q + 0.04d);
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        if (this.f4876Q >= 1.0f) {
                            this.f4876Q = 1.0f;
                            this.f4875P = false;
                        }
                        m1803a(f2, this.f4876Q);
                    }
                }
            }
        }
        graphics.mo156b(this.f4833J, this.f4842a, this.f4843b, this.f4855n);
        this.f4864w.set((int) this.f4842a, (int) this.f4843b, (int) (this.f4842a + this.f4853c), (int) ((this.f4843b + this.f4854d) - 0.4d));
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Object[] items = Projectile.f1024a.getItems();
        int i = Projectile.f1024a.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Projectile) items[i2]).f960D) {
                z3 = true;
                z2 = true;
            }
        }
        Iterator it = this.f4881aa.iterator();
        while (it.hasNext()) {
            C0723l c0723l = (C0723l) it.next();
            if (c0723l.f4892e != EnumC0725n.unit) {
                z = true;
                if (c0723l.f4892e != EnumC0725n.message) {
                    z2 = true;
                }
            }
        }
        if (!z && !z3) {
            this.f4856o.m4717a(255, 100, 100, 100);
            this.f4856o.setStrokeWidth(1.0f);
            if (InterfaceEngine.f4743bz) {
                this.f4856o.m4717a(115, 0, 0, 0);
                this.f4856o.setStrokeWidth(2.0f);
            }
        } else {
            this.f4858q += 5.0f * f;
            if (this.f4858q > 180.0f) {
                this.f4858q -= 180.0f;
            }
            float sin = CommonUtils.sin(this.f4858q);
            if (z3) {
                this.f4856o.m4717a(255, 0, (int) (0.0f + (sin * 230.0f)), 0);
            } else if (!z2) {
                this.f4856o.m4717a(255, 12, (int) (0.0f + (sin * 220.0f)), (int) (0.0f + (sin * 220.0f)));
            } else {
                this.f4856o.m4717a(255, (int) (0.0f + (sin * 230.0f)), 0, 0);
            }
            this.f4856o.setStrokeWidth(2.0f);
        }
        graphics.drawRect(this.f4864w, this.f4856o);
        Iterator it2 = this.f4882ag.iterator();
        while (it2.hasNext()) {
            C0727p c0727p = (C0727p) it2.next();
            if (c0727p.f4913e) {
                this.f4879V.set(c0727p.f4911c, c0727p.f4912d, c0727p.f4911c + 2, c0727p.f4912d + 2);
                graphics.drawRect(this.f4879V, this.f4871D);
            }
        }
        m1794a(graphics, 0, 0, 0.0f, 1.0f);
        if (this.f4886af.size() != 0) {
            Iterator it3 = this.f4886af.iterator();
            while (it3.hasNext()) {
                C0728q c0728q = (C0728q) it3.next();
                if (c0728q.f4915a.dead) {
                    it3.remove();
                } else {
                    Unit unit = c0728q.f4915a;
                    Point m1791b = m1791b(unit.x, unit.y);
                    if (!unit.mo2798a(m1791b.game, m1791b.y)) {
                        graphics.mo219a(m1791b.game, m1791b.y, 4.0f, unit.team.f1310ab);
                    }
                }
            }
        }
        int i3 = Projectile.f1024a.size;
        for (int i4 = 0; i4 < i3; i4++) {
            Projectile projectile = (Projectile) items[i4];
            if ((projectile.f960D || (projectile.f1019q != null && projectile.f1019q.f960D)) && projectile.source != null) {
                Point m1791b2 = m1791b(projectile.x, projectile.y);
                float f3 = 2.0f;
                if (projectile.f960D) {
                    f3 = 4.0f;
                }
                graphics.mo219a(m1791b2.game, m1791b2.y, f3, projectile.source.team.f1310ab);
            }
        }
        Point m1791b3 = m1791b(gameEngine.viewpointX_rounded, gameEngine.viewpointY_rounded);
        this.f4872E.left = m1791b3.game;
        this.f4872E.top = m1791b3.y;
        Point m1791b4 = m1791b(gameEngine.viewpointX_rounded + gameEngine.f5884cz, gameEngine.viewpointY_rounded + gameEngine.f5847cA);
        this.f4872E.right = m1791b4.game;
        this.f4872E.bottom = m1791b4.y;
        if (this.f4872E.left < this.f4864w.left) {
            this.f4872E.left = this.f4864w.left;
        }
        if (this.f4872E.right > this.f4864w.right) {
            this.f4872E.right = this.f4864w.right;
        }
        if (this.f4872E.top < this.f4864w.top) {
            this.f4872E.top = this.f4864w.top;
        }
        if (this.f4872E.bottom > this.f4864w.bottom) {
            this.f4872E.bottom = this.f4864w.bottom;
        }
        graphics.drawRect(this.f4872E, this.f4860s);
        this.f4859r += 6.0f * f;
        if (this.f4859r > 180.0f) {
            this.f4859r -= 180.0f;
        }
        Iterator it4 = this.f4881aa.iterator();
        while (it4.hasNext()) {
            C0723l c0723l2 = (C0723l) it4.next();
            Point m1791b5 = m1791b(c0723l2.f4888a, c0723l2.f4889b);
            float f4 = c0723l2.f4890c;
            float f5 = 0.05f;
            if (c0723l2.f4892e == EnumC0725n.unit) {
                paint = this.f4862u;
                f5 = 0.03f;
                float sin2 = CommonUtils.sin(this.f4859r);
                paint.m4717a((int) (50.0f + (sin2 * 190.0f)), (int) (50.0f + (sin2 * 190.0f)), 0, 0);
            } else if (c0723l2.f4892e == EnumC0725n.message) {
                paint = this.f4863v;
            } else {
                paint = this.f4861t;
                float sin3 = CommonUtils.sin(this.f4859r);
                paint.m4717a((int) (50.0f + (sin3 * 190.0f)), (int) (50.0f + (sin3 * 190.0f)), 0, 0);
            }
            float m1692b = CommonUtils.m1692b(f4, f5, 1.0f);
            if (c0723l2.f4892e == EnumC0725n.unit) {
                float f6 = this.f4853c * m1692b;
                float f7 = this.f4854d * m1692b;
                graphics.mo221a(m1789c(m1791b5.game - f6), m1786d(m1791b5.y - f7), m1789c(m1791b5.game + f6), m1786d(m1791b5.y + f7), paint);
                graphics.mo221a(m1789c(m1791b5.game + f6), m1786d(m1791b5.y - f7), m1789c(m1791b5.game - f6), m1786d(m1791b5.y + f7), paint);
            } else {
                graphics.mo221a(m1789c(m1791b5.game - (this.f4853c * m1692b)), m1786d(m1791b5.y), m1789c(m1791b5.game + (this.f4853c * m1692b)), m1786d(m1791b5.y), paint);
                graphics.mo221a(m1789c(m1791b5.game), m1786d(m1791b5.y - (this.f4854d * m1692b)), m1789c(m1791b5.game), m1786d(m1791b5.y + (this.f4854d * m1692b)), paint);
            }
            c0723l2.f4890c = CommonUtils.toZero(c0723l2.f4890c, 0.04f * f);
            if (c0723l2.f4890c == 0.0f) {
                c0723l2.f4891d = CommonUtils.toZero(c0723l2.f4891d, 0.005f * f);
                if (c0723l2.f4891d == 0.0f) {
                    it4.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public void m1796a(Unit unit) {
        if (this.f4886af.contains(unit)) {
            return;
        }
        C0728q c0728q = new C0728q(this);
        c0728q.f4915a = unit;
        this.f4886af.add(c0728q);
    }
}