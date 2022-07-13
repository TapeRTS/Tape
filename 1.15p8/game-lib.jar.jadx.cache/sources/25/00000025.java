package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.ai.AbstractC0157h;
import com.corrodinggames.rts.game.ai.Base;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.map.MapTile;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.buildings.Repairbay;
import com.corrodinggames.rts.game.units.custom.C0385bb;
import com.corrodinggames.rts.game.units.custom.EnumC0334ad;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.p017b.C0383i;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0207h;
import com.corrodinggames.rts.game.units.p026f.AbstractC0527j;
import com.corrodinggames.rts.game.units.p027g.C0530b;
import com.corrodinggames.rts.gameFramework.C0669d;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.Enum_draw;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.GroupController.UnitGroup;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.effect.C0661a;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EffectType;
import com.corrodinggames.rts.gameFramework.effect.Emitter;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.path.AbstractC0816c;
import com.corrodinggames.rts.gameFramework.path.C0824k;
import com.corrodinggames.rts.gameFramework.path.C0829p;
import com.corrodinggames.rts.gameFramework.path.PathEngine;
import com.corrodinggames.rts.gameFramework.utility.C0918ai;
import com.corrodinggames.rts.gameFramework.utility.C0950u;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.game.units.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/s.class */
public abstract class OrderableUnit extends ActiveUnit {

    /* renamed from: F */
    protected BitmapOrTexture image;

    /* renamed from: G */
    protected BitmapOrTexture shadowImage;

    /* renamed from: a */
    private int f3690a;

    /* renamed from: b */
    private float f3705b;

    /* renamed from: c */
    private float f3707c;

    /* renamed from: d */
    private float f3708d;

    /* renamed from: e */
    private float f3709e;

    /* renamed from: K */
    public Unit f3674K;

    /* renamed from: L */
    public float f3675L;

    /* renamed from: M */
    public float f3676M;

    /* renamed from: N */
    public float f3677N;

    /* renamed from: h */
    private boolean f3710h;

    /* renamed from: O */
    public float f3678O;

    /* renamed from: P */
    public float f3679P;

    /* renamed from: Q */
    public float f3680Q;

    /* renamed from: R */
    public float f3681R;

    /* renamed from: i */
    private boolean f3711i;

    /* renamed from: j */
    private boolean f3712j;

    /* renamed from: m */
    private int f3713m;

    /* renamed from: n */
    private float f3714n;

    /* renamed from: o */
    private float f3715o;

    /* renamed from: p */
    private byte f3716p;

    /* renamed from: q */
    private int f3717q;

    /* renamed from: r */
    private float f3718r;

    /* renamed from: s */
    private boolean f3719s;

    /* renamed from: S */
    public Unit f3682S;

    /* renamed from: T */
    public int f3683T;

    /* renamed from: U */
    public float f3684U;

    /* renamed from: V */
    public int f3685V;

    /* renamed from: W */
    public OrderableUnit f3686W;

    /* renamed from: X */
    public boolean f3687X;

    /* renamed from: Y */
    public boolean f3688Y;

    /* renamed from: Z */
    public int f3689Z;

    /* renamed from: aa */
    public short f3695aa;

    /* renamed from: ab */
    public float f3696ab;

    /* renamed from: ai */
    public boolean f3697ai;

    /* renamed from: an */
    public AbstractC0816c f3698an;

    /* renamed from: t */
    private boolean f3720t;

    /* renamed from: v */
    private int f3721v;

    /* renamed from: ar */
    public boolean f3699ar;

    /* renamed from: as */
    public float f3700as;

    /* renamed from: at */
    public float f3701at;

    /* renamed from: au */
    public AbstractC0157h f3702au;

    /* renamed from: av */
    public Base f3703av;

    /* renamed from: aw */
    public boolean f3704aw;

    /* renamed from: x */
    private int f3722x;

    /* renamed from: z */
    private int f3723z;

    /* renamed from: B */
    private static int f3671B;

    /* renamed from: aC */
    public Unit[] f3691aC;

    /* renamed from: aD */
    public float[] f3692aD;

    /* renamed from: aG */
    public boolean f3693aG;

    /* renamed from: aH */
    public boolean f3694aH;

    /* renamed from: bh */
    public ObjectVector f3706bh;

    /* renamed from: E */
    public static boolean f3724E = false;

    /* renamed from: H */
    public static final Waypoint[] f3725H = new Waypoint[0];

    /* renamed from: am */
    public static final PathNode[] f3726am = new PathNode[0];

    /* renamed from: ax */
    public static final UniquePaint f3727ax = new UniquePaint();

    /* renamed from: ay */
    public static final UniquePaint f3728ay = new UniquePaint();

    /* renamed from: az */
    public static final PointF f3729az = new PointF();

    /* renamed from: A */
    private static final Paint f3730A = new Paint();

    /* renamed from: C */
    private static final UniquePaint f3731C = m2598a(false);

    /* renamed from: D */
    private static final UniquePaint f3732D = m2598a(true);

    /* renamed from: aA */
    public static AbstractC0527j f3733aA = new AbstractC0527j() { // from class: com.corrodinggames.rts.game.units.s.1
        @Override // com.corrodinggames.rts.game.units.p026f.AbstractC0527j
        public void callback(OrderableUnit orderableUnit, float f, Unit unit) {
            orderableUnit.m2619a(unit, f, true);
        }
    };

    /* renamed from: aF */
    public static final C0950u f3734aF = new C0950u();

    /* renamed from: aI */
    static final C0590x f3735aI = new C0590x();

    /* renamed from: aJ */
    public static C0591y f3736aJ = new C0591y(true);

    /* renamed from: aK */
    public static C0591y f3737aK = new C0591y(false);

    /* renamed from: aL */
    public static C0227ab f3738aL = new C0227ab(true);

    /* renamed from: aM */
    public static C0227ab f3739aM = new C0227ab(false);

    /* renamed from: aO */
    static ObjectVector f3740aO = new ObjectVector();

    /* renamed from: aP */
    public static final PathNode f3741aP = new PathNode();

    /* renamed from: aQ */
    protected static PorterDuffColorFilter f3742aQ = new PorterDuffColorFilter(Color.m4733a(200, 255, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aR */
    protected static PorterDuffColorFilter f3743aR = new PorterDuffColorFilter(Color.m4733a(70, 255, 70), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aS */
    protected static PorterDuffColorFilter f3744aS = new PorterDuffColorFilter(Color.m4733a(255, 40, 40), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aT */
    protected static PorterDuffColorFilter f3745aT = new PorterDuffColorFilter(Color.m4733a(120, 120, 255), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aU */
    protected static Paint f3746aU = C0955y.m445b();

    /* renamed from: aV */
    protected static Paint f3747aV = C0955y.m445b();

    /* renamed from: aW */
    protected static Paint f3748aW = C0955y.m445b();

    /* renamed from: aX */
    static final PointF f3749aX = new PointF();

    /* renamed from: aY */
    protected static final C0918ai f3750aY = new C0918ai();

    /* renamed from: aZ */
    protected static final PointF f3751aZ = new PointF();

    /* renamed from: ba */
    protected static final PointF f3752ba = new PointF();

    /* renamed from: bb */
    protected static final PointF f3753bb = new PointF();

    /* renamed from: bc */
    static final Point f3754bc = new Point();

    /* renamed from: bd */
    static final Point f3755bd = new Point();

    /* renamed from: be */
    static final PointF f3756be = new PointF();

    /* renamed from: bf */
    static final C0586t f3757bf = new C0586t();

    /* renamed from: bg */
    public static final C0589w f3758bg = new C0589w();

    /* renamed from: bi */
    static ObjectVector f3759bi = new ObjectVector();

    /* renamed from: f */
    private int f3760f = 0;

    /* renamed from: g */
    private Waypoint[] f3761g = f3725H;

    /* renamed from: I */
    public AttackMode f3762I = AttackMode.f1393b;

    /* renamed from: J */
    int f3763J = -9999;

    /* renamed from: k */
    private float f3764k = 3.0f;

    /* renamed from: l */
    private float f3765l = 3.0f;

    /* renamed from: ac */
    public boolean f3766ac = false;

    /* renamed from: ad */
    public float f3767ad = 0.0f;

    /* renamed from: ae */
    public float f3768ae = 0.0f;

    /* renamed from: af */
    public float f3769af = 0.0f;

    /* renamed from: ag */
    public int f3770ag = 0;

    /* renamed from: ah */
    public float f3771ah = 0.0f;

    /* renamed from: aj */
    public float f3772aj = -999.0f;

    /* renamed from: ak */
    public boolean f3773ak = false;

    /* renamed from: al */
    public boolean f3774al = false;

    /* renamed from: ao */
    protected PathNode[] activePath = f3726am;

    /* renamed from: ap */
    protected int activePathCount = 0;

    /* renamed from: u */
    private int f3777u = 0;

    /* renamed from: aq */
    public boolean f3778aq = true;

    /* renamed from: w */
    private UniquePaint f3779w = null;

    /* renamed from: y */
    private UniquePaint f3780y = null;

    /* renamed from: aB */
    public byte f3781aB = 0;

    /* renamed from: aE */
    public int f3782aE = -9999;

    /* renamed from: aN */
    C0824k f3783aN = null;

    /* renamed from: d */
    public abstract BitmapOrTexture getImage();

    /* renamed from: k */
    public abstract BitmapOrTexture getShadowImage();

    /* renamed from: d */
    public abstract BitmapOrTexture mo2487d(int i);

    /* renamed from: I */
    public abstract boolean mo2657I();

    /* renamed from: m */
    public abstract float getMaxAttackRange();

    /* renamed from: b */
    public abstract float getShootDelay(int i);

    /* renamed from: A */
    public abstract float getTurnSpeed();

    /* renamed from: c */
    public abstract float getTurretTurnSpeed(int i);

    /* renamed from: z */
    public abstract float getMoveSpeed();

    /* renamed from: a */
    public abstract void fireProjectile(Unit unit, int i);

    static {
        f3727ax.m4717a(128, 255, 255, 255);
        f3727ax.m931n();
        f3728ay.m4711a(f3727ax);
        f3728ay.mo935a(true);
        f3728ay.m4687d(true);
        f3728ay.m4695b(true);
        f3728ay.m931n();
    }

    /* renamed from: b */
    public void m2543b(float f) {
        if (this.f3700as < f) {
            this.f3700as = f;
        }
    }

    /* renamed from: Q */
    public Paint m2651Q() {
        if (m2583aN()) {
            return f3728ay;
        }
        return f3727ax;
    }

    /* renamed from: a */
    public static void m2606a(OrderableUnit orderableUnit, OrderableUnit orderableUnit2) {
        try {
            OutputNetStream outputNetStream = new OutputNetStream();
            int i = orderableUnit.f3760f;
            for (int i2 = 0; i2 < i; i2++) {
                orderableUnit.f3761g[i2].writeOut(outputNetStream);
            }
            InputNetStream inputNetStream = new InputNetStream(outputNetStream.mo1294d());
            orderableUnit2.f3760f = i;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3;
                orderableUnit2.m2455m(i4);
                if (i4 >= orderableUnit2.f3761g.length) {
                    GameEngine.log("Too many waypoints:" + i3);
                    i4 = orderableUnit2.f3761g.length - 1;
                }
                if (orderableUnit2.f3761g[i4] == null) {
                    orderableUnit2.f3761g[i4] = new Waypoint();
                }
                orderableUnit2.f3761g[i4].readIn(inputNetStream);
                orderableUnit2.f3761g[i4].convertUnitIds();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeFloat(this.f3705b);
        outputNetStream.writeFloat(this.f3707c);
        outputNetStream.writeFloat(this.f1532cC[0].f1656e);
        outputNetStream.writeInt(this.f3760f);
        int i = this.f3760f;
        outputNetStream.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f3761g[i2].writeOut(outputNetStream);
        }
        outputNetStream.writeEnum(this.f3762I);
        Unit unit = this.f3674K;
        if (unit != null && unit.dead) {
            unit = null;
        }
        outputNetStream.mo1260a(unit);
        outputNetStream.writeFloat(this.f3675L);
        outputNetStream.writeFloat(this.f3677N);
        outputNetStream.writeFloat(this.f3678O);
        outputNetStream.mo1293d("pathing_active:");
        outputNetStream.writeBoolean(this.f3712j);
        outputNetStream.writeFloat(this.f3764k);
        outputNetStream.writeFloat(this.f3765l);
        outputNetStream.writeFloat(this.f3718r);
        outputNetStream.mo1310a(this.f3686W);
        outputNetStream.writeBoolean(this.f3687X);
        outputNetStream.writeBoolean(this.f3688Y);
        outputNetStream.writeBoolean(this.f3766ac);
        outputNetStream.writeFloat(this.f3767ad);
        outputNetStream.writeFloat(this.f3768ae);
        outputNetStream.writeFloat(this.f3769af);
        outputNetStream.writeInt(this.f3770ag);
        outputNetStream.writeInt(this.f3685V);
        outputNetStream.mo1293d("activePathCount:");
        outputNetStream.writeInt(this.activePathCount);
        for (int i3 = 0; i3 < this.activePathCount; i3++) {
            this.activePath[i3].m2426a(outputNetStream);
        }
        outputNetStream.writeInt(this.activePathCount);
        outputNetStream.writeInt(this.f3777u);
        if (outputNetStream.mo1290f()) {
        }
        outputNetStream.writeByte(11);
        outputNetStream.writeFloat(this.f3714n);
        outputNetStream.writeFloat(this.f3715o);
        outputNetStream.writeFloat(this.f3708d);
        outputNetStream.writeFloat(this.f3709e);
        outputNetStream.writeBoolean(this.f3720t);
        outputNetStream.writeFloat(this.f3696ab);
        outputNetStream.writeInt(this.f3713m);
        outputNetStream.writeFloat(this.f3679P);
        outputNetStream.writeFloat(this.f3772aj);
        outputNetStream.writeBoolean(this.f3773ak);
        outputNetStream.writeBoolean(this.f3774al);
        outputNetStream.mo1257a(this.f3695aa);
        outputNetStream.writeFloat(this.f3684U);
        outputNetStream.writeInt(this.f3721v);
        outputNetStream.writeFloat(this.f3680Q);
        outputNetStream.writeFloat(this.f3700as);
        outputNetStream.writeFloat(this.f3701at);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f3705b = inputNetStream.readFloat();
        this.f3707c = inputNetStream.readFloat();
        this.f1532cC[0].f1656e = inputNetStream.readFloat();
        this.f3760f = inputNetStream.readInt();
        if (this.f3760f > 0) {
            m2455m(CommonUtils.mini(this.f3760f - 1, 29));
        }
        int i = 30;
        if (inputNetStream.m1237b() >= 42) {
            i = inputNetStream.readInt();
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2;
            m2455m(i3);
            if (i3 >= this.f3761g.length) {
                GameEngine.log("Too many waypoints:" + i2);
                i3 = this.f3761g.length - 1;
            }
            if (this.f3761g[i3] == null) {
                this.f3761g[i3] = new Waypoint();
            }
            this.f3761g[i3].readIn(inputNetStream);
        }
        this.f3762I = (AttackMode) inputNetStream.readEnum(AttackMode.class);
        if (this.f3762I == AttackMode.f1392a) {
            if (!mo2657I()) {
                this.f3762I = AttackMode.f1393b;
            }
            if (inputNetStream.m1237b() < 74) {
                this.f3762I = AttackMode.f1393b;
            }
        }
        long m1220n = inputNetStream.m1220n();
        this.f3675L = inputNetStream.readFloat();
        this.f3677N = inputNetStream.readFloat();
        this.f3678O = inputNetStream.readFloat();
        this.f3712j = inputNetStream.readBoolean();
        this.f3764k = inputNetStream.readFloat();
        this.f3765l = inputNetStream.readFloat();
        this.f3718r = inputNetStream.readFloat();
        m2610a(inputNetStream.m1218p());
        this.f3687X = inputNetStream.readBoolean();
        this.f3688Y = inputNetStream.readBoolean();
        this.f3766ac = inputNetStream.readBoolean();
        this.f3767ad = inputNetStream.readFloat();
        this.f3768ae = inputNetStream.readFloat();
        this.f3769af = inputNetStream.readFloat();
        this.f3770ag = inputNetStream.readInt();
        if (inputNetStream.m1237b() >= 18) {
            this.f3685V = inputNetStream.readInt();
        }
        if (inputNetStream.m1237b() >= 21) {
            int readInt = inputNetStream.readInt();
            for (int i4 = 0; i4 < readInt; i4++) {
                m2459l(i4);
                if (this.activePath[i4] == null) {
                    this.activePath[i4] = new PathNode();
                }
                this.activePath[i4].m2425a(inputNetStream);
            }
        } else {
            for (int i5 = 0; i5 < 60; i5++) {
                m2459l(i5);
                if (this.activePath[i5] == null) {
                    this.activePath[i5] = new PathNode();
                }
                this.activePath[i5].m2425a(inputNetStream);
            }
        }
        this.activePathCount = inputNetStream.readInt();
        this.f3777u = inputNetStream.readInt();
        byte readByte = inputNetStream.readByte();
        if (readByte >= 1) {
            this.f3714n = inputNetStream.readFloat();
            this.f3715o = inputNetStream.readFloat();
        }
        if (readByte >= 2) {
            this.f3708d = inputNetStream.readFloat();
            this.f3709e = inputNetStream.readFloat();
        }
        if (readByte >= 3) {
            this.f3720t = inputNetStream.readBoolean();
        }
        if (readByte >= 4) {
            this.f3696ab = inputNetStream.readFloat();
            this.f3713m = inputNetStream.readInt();
        }
        if (readByte >= 5) {
            this.f3679P = inputNetStream.readFloat();
        }
        if (readByte >= 6) {
            this.f3772aj = inputNetStream.readFloat();
            this.f3773ak = inputNetStream.readBoolean();
            this.f3774al = inputNetStream.readBoolean();
        }
        if (readByte >= 7) {
            this.f3695aa = inputNetStream.m1212v();
        }
        if (readByte >= 8) {
            this.f3684U = inputNetStream.readFloat();
        }
        if (readByte >= 9) {
            this.f3721v = inputNetStream.readInt();
        }
        if (readByte >= 10) {
            this.f3680Q = inputNetStream.readFloat();
        }
        if (readByte >= 11) {
            this.f3700as = inputNetStream.readFloat();
            this.f3701at = inputNetStream.readFloat();
        }
        super.mo427a(inputNetStream);
        if (!this.dead) {
            this.f3674K = GameObject.m429a(m1220n, false);
            for (int i6 = 0; i6 < this.f3760f; i6++) {
                if (this.f3761g[i6] == null) {
                    GameEngine.PrintLOG("readIn: convertUnitIds is null: " + i6 + " waypointsCount:" + this.f3760f);
                } else {
                    this.f3761g[i6].convertUnitIds();
                }
            }
        }
        mo2650R();
        if (this.dead) {
            this.f4047en = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public void mo2537b(Team team) {
        super.mo2537b(team);
        mo2650R();
    }

    /* renamed from: R */
    public void mo2650R() {
        this.image = getImage();
        this.shadowImage = getShadowImage();
    }

    /* renamed from: h */
    public float mo2473h(int i) {
        return 0.0f;
    }

    /* renamed from: i */
    public float mo2469i(int i) {
        return 0.0f;
    }

    /* renamed from: S */
    public BitmapOrTexture mo2649S() {
        return null;
    }

    /* renamed from: a */
    public Paint m2626a(int i, ColorFilter colorFilter, boolean z) {
        int i2;
        UniquePaint uniquePaint;
        if (i == -1 && colorFilter == null) {
            if (z) {
                return f3732D;
            }
            return f3731C;
        }
        if (this.f1621cg) {
            if (colorFilter == null) {
                uniquePaint = f3730A;
                i2 = f3671B;
                f3671B = i;
            } else {
                uniquePaint = f3730A;
                i2 = -1;
                if (colorFilter == f3744aS) {
                    uniquePaint = f3747aV;
                }
                if (colorFilter == f3743aR) {
                    uniquePaint = f3746aU;
                }
                if (colorFilter == f3745aT) {
                    uniquePaint = f3748aW;
                }
            }
        } else if (z) {
            if (this.f3780y == null) {
                this.f3780y = m2598a(true);
            }
            uniquePaint = this.f3780y;
            i2 = this.f3723z;
            this.f3723z = i;
        } else {
            if (this.f3779w == null) {
                this.f3779w = m2598a(false);
            }
            uniquePaint = this.f3779w;
            i2 = this.f3722x;
            this.f3722x = i;
        }
        if (i2 != i) {
            uniquePaint.setColor(i);
        }
        if (uniquePaint.m4681h() != colorFilter) {
            uniquePaint.m4715a(colorFilter);
        }
        return uniquePaint;
    }

    /* renamed from: a */
    public static UniquePaint m2598a(boolean z) {
        UniquePaint uniquePaint = new UniquePaint();
        if (z) {
            uniquePaint.mo935a(true);
            uniquePaint.m4687d(true);
            uniquePaint.m4695b(true);
        } else {
            uniquePaint.mo935a(false);
            uniquePaint.m4687d(false);
            uniquePaint.m4695b(false);
        }
        return uniquePaint;
    }

    public OrderableUnit(boolean z) {
        super(z);
    }

    /* renamed from: j */
    public final void m2466j(int i) {
        int mo2512bk = mo2512bk();
        for (int i2 = 0; i2 < mo2512bk; i2++) {
            this.f1532cC[i2].m3722a(i);
        }
    }

    /* renamed from: a */
    public void m2600a(String str) {
        String str2;
        if (getUnitType() != null) {
            str2 = getUnitType().mo3087i();
        } else {
            str2 = "<NO UNIT TYPE>";
        }
        GameEngine.PrintLOG("(Unit log:" + str2 + " id:" + this.GameObjectID + "): " + str);
    }

    /* renamed from: T */
    public void mo2648T() {
        String str;
        if (getUnitType() != null) {
            str = getUnitType().mo3087i();
        } else {
            str = "<NO UNIT TYPE>";
        }
        GameEngine.PrintLOG("---- Debug for:" + str + " id:" + this.GameObjectID + "---");
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        float f2;
        float f3;
        float f4;
        super.update(f);
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f3699ar) {
            this.f3699ar = false;
        }
        if (this.f1541cc != 0.0f) {
            this.f1541cc = CommonUtils.toZero(this.f1541cc, f);
        }
        if (!this.dead && isActive()) {
            if (this.f3700as > 0.0f) {
                this.f3700as = CommonUtils.toZero(this.f3700as, f);
            }
            if (this.f3701at > 0.0f) {
                this.f3701at = CommonUtils.toZero(this.f3701at, f);
            }
            if (this.f3706bh != null) {
                C0530b.m2766a(this, f);
            }
            float f5 = this.x;
            float f6 = this.y;
            int mo2512bk = mo2512bk();
            for (int i = 0; i < mo2512bk; i++) {
                C0235aj c0235aj = this.f1532cC[i];
                if (c0235aj.f1655d == 0.0f) {
                    float mo2668C = mo2668C(i);
                    if (mo2538b(i, f) && c0235aj.f1652a != mo2668C) {
                        if (CommonUtils.absf(CommonUtils.m1670c(c0235aj.f1652a, mo2668C, 360.0f)) < 0.5f) {
                            c0235aj.f1655d = 20.0f;
                            c0235aj.f1654c = 0.0f;
                        } else {
                            m2640a(f, mo2668C, i);
                        }
                    }
                } else {
                    c0235aj.f1655d = CommonUtils.toZero(c0235aj.f1655d, f);
                }
            }
            if (!m2513bj()) {
                m2463k(f);
            }
            for (int i2 = 0; i2 < mo2512bk; i2++) {
                C0235aj c0235aj2 = this.f1532cC[i2];
                if (c0235aj2.f1656e != 0.0f) {
                    c0235aj2.f1656e = CommonUtils.toZero(c0235aj2.f1656e, f);
                }
            }
            boolean mo2515bh = mo2515bh();
            boolean z = (this.f1614bT == 0.0f && this.f1615bU == 0.0f) ? false : true;
            if ((this.speed != 0.0f || z) && mo2657I()) {
                float f7 = this.direction;
                float moveSpeed = getMoveSpeed();
                if (mo2514bi()) {
                    f7 = this.f1523bY;
                }
                if (!mo2515bh) {
                    float f8 = moveSpeed * this.speed * f;
                    f5 += CommonUtils.cos(f7) * f8;
                    f6 += CommonUtils.sin(f7) * f8 * mo2572aY();
                    if (z) {
                        f5 += this.f1614bT * f;
                        f6 += this.f1615bU * f * mo2572aY();
                        if (CommonUtils.distanceSq(0.0f, 0.0f, this.f1614bT, this.f1615bU) > moveSpeed * moveSpeed) {
                            this.f1614bT = (float) (this.f1614bT - ((this.f1614bT * 0.05d) * f));
                            this.f1615bU = (float) (this.f1615bU - ((this.f1615bU * 0.05d) * f));
                        }
                        this.f1614bT = CommonUtils.m1744a(this.f1614bT, 0.0f, 0.5f * moveSpeed * f);
                        this.f1615bU = CommonUtils.m1744a(this.f1615bU, 0.0f, 0.5f * moveSpeed * f);
                    }
                } else {
                    if (this.speed != 0.0f) {
                        f4 = getMoveAccelerationSpeed() * 1.41f;
                        f3 = CommonUtils.cos(f7) * moveSpeed * this.speed;
                        f2 = CommonUtils.sin(f7) * moveSpeed * this.speed;
                    } else {
                        f4 = getMoveDecelerationSpeed() * 1.41f;
                        f3 = 0.0f;
                        f2 = 0.0f;
                    }
                    float distanceSq = CommonUtils.distanceSq(this.f1614bT, this.f1615bU, f3, f2);
                    if (distanceSq > moveSpeed * moveSpeed) {
                        this.f1614bT = (float) (this.f1614bT - ((this.f1614bT * 0.05d) * f));
                        this.f1615bU = (float) (this.f1615bU - ((this.f1615bU * 0.05d) * f));
                    }
                    float f9 = f4 * f;
                    if (distanceSq < f9 * f9) {
                        this.f1614bT = f3;
                        this.f1615bU = f2;
                    } else {
                        float m1659d = CommonUtils.m1659d(this.f1614bT, this.f1615bU, f3, f2);
                        this.f1614bT += CommonUtils.cos(m1659d) * f9;
                        this.f1615bU += CommonUtils.sin(m1659d) * f9;
                    }
                    f5 += this.f1614bT * f;
                    f6 += this.f1615bU * f * mo2572aY();
                }
                this.f3699ar = true;
            }
            if (this.f1611bQ != 0.0f || this.f1612bR != 0.0f) {
                this.f1611bQ = CommonUtils.m1692b(this.f1611bQ, -9.0f, 9.0f);
                this.f1612bR = CommonUtils.m1692b(this.f1612bR, -9.0f, 9.0f);
                f5 += this.f1611bQ;
                f6 += this.f1612bR;
                this.f1612bR = 0.0f;
                this.f1611bQ = 0.0f;
                this.f3699ar = true;
            }
            if (this.f3699ar && mo2657I() && this.f1630cF == null) {
                m2630a(f, gameEngine, f5, f6);
            }
            if (this.f3778aq) {
                this.f3778aq = false;
                mo2491c(false);
                this.f3699ar = true;
            }
        }
    }

    /* renamed from: a */
    private void m2630a(float f, GameEngine gameEngine, float f2, float f3) {
        Map map = gameEngine.map;
        float f4 = map.f794r;
        float f5 = map.f795s;
        float f6 = this.x * f4;
        float f7 = this.y * f5;
        float f8 = f2 * f4;
        float f9 = f3 * f5;
        PointF pointF = null;
        boolean z = false;
        int floor = CommonUtils.floor(f6);
        int floor2 = CommonUtils.floor(f7);
        int floor3 = CommonUtils.floor(f8);
        int floor4 = CommonUtils.floor(f9);
        if ((floor != floor3 || floor2 != floor4) && this.f1541cc == 0.0f && gameEngine.PathEngine.m1103a(getMovementType(), floor3, floor4)) {
            if (floor != floor3 && floor2 != floor4) {
                boolean m1103a = gameEngine.PathEngine.m1103a(getMovementType(), floor, floor4);
                boolean m1103a2 = gameEngine.PathEngine.m1103a(getMovementType(), floor3, floor2);
                if (m1103a && m1103a2) {
                    z = true;
                    f3729az.set(f6, f7);
                    pointF = f3729az;
                }
                if (pointF == null && m1103a) {
                    pointF = C0236ak.m3718a(getMovementType(), f6, f7, f8, f9, floor, floor4, false);
                }
                if (pointF == null && m1103a2) {
                    pointF = C0236ak.m3718a(getMovementType(), f6, f7, f8, f9, floor3, floor2, false);
                }
            }
            if (pointF == null) {
                pointF = C0236ak.m3718a(getMovementType(), f6, f7, f8, f9, floor3, floor4, false);
            }
            if (pointF == null) {
                z = true;
                f3729az.set(f6, f7);
                pointF = f3729az;
            }
        }
        boolean z2 = false;
        if (pointF != null) {
            boolean z3 = false;
            if (gameEngine.PathEngine.m1103a(getMovementType(), floor, floor2) && !gameEngine.PathEngine.m1090b(getMovementType(), floor3, floor4)) {
                z3 = true;
            }
            if (!z3) {
                f2 = pointF.x * map.pixel_Width;
                f3 = pointF.y * map.pixel_Height;
                z2 = true;
            } else {
                z = false;
            }
        }
        if (z2) {
            this.f3705b += f;
            this.f3690a = 0;
        } else if (this.f3705b != 0.0f && f > 0.0f) {
            this.f3690a++;
            if (this.f3690a >= 3) {
                this.f3705b = 0.0f;
            }
        }
        if (!z) {
            int floor5 = CommonUtils.floor(f2 * f4);
            int floor6 = CommonUtils.floor(f3 * f5);
            this.x = f2;
            this.y = f3;
            if (floor != floor5 || floor2 != floor6) {
                mo2491c(true);
            }
        }
    }

    /* renamed from: b */
    public void m2542b(float f, float f2) {
        Map map = GameEngine.getInstance().map;
        float f3 = map.f794r;
        float f4 = map.f795s;
        int floor = CommonUtils.floor(this.x * f3);
        int floor2 = CommonUtils.floor(this.y * f4);
        int floor3 = CommonUtils.floor(f * f3);
        int floor4 = CommonUtils.floor(f2 * f4);
        this.x = f;
        this.y = f2;
        if (floor != floor3 || floor2 != floor4) {
            mo2491c(true);
        }
    }

    /* renamed from: g */
    public static void m2479g(float f) {
        int i;
        float f2;
        GameEngine gameEngine = GameEngine.getInstance();
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        gameEngine.f5865cd.m2275a(Enum_draw.f4182j);
        int i2 = gameEngine.f5845by;
        for (int i3 = 0; i3 < size; i3++) {
            if (m485a[i3] instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) m485a[i3];
                if ((orderableUnit.f3699ar || orderableUnit.f1613bS) && orderableUnit.mo2657I() && orderableUnit.f3782aE <= i2) {
                    orderableUnit.f1613bS = false;
                    orderableUnit.f3699ar = true;
                    if (orderableUnit.moving) {
                        f2 = orderableUnit.radius + 7.0f;
                        if (orderableUnit.f3781aB > 9) {
                            orderableUnit.f3782aE = i2 + 200 + (i3 % 50);
                        } else {
                            orderableUnit.f3782aE = i2 + 50 + (i3 % 50);
                        }
                    } else {
                        f2 = orderableUnit.radius + 5.0f;
                        orderableUnit.f3782aE = i2 + 250 + (i3 % 50);
                    }
                    orderableUnit.f3781aB = (byte) 0;
                    f3734aF.clear();
                    gameEngine.UnitGeoIndex.m2777b(orderableUnit.x, orderableUnit.y, f2, f3734aF);
                    Unit[] m485a2 = f3734aF.m485a();
                    int i4 = f3734aF.f6333b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        orderableUnit.m2619a(m485a2[i5], f, true);
                    }
                    if (orderableUnit.f3781aB > 9 && orderableUnit.f1529br > i2 - 400) {
                        orderableUnit.f3782aE = gameEngine.f5845by + 5 + (i3 % 5);
                        orderableUnit.f1613bS = true;
                    }
                }
            }
        }
        gameEngine.f5865cd.m2270b(Enum_draw.f4182j);
        gameEngine.f5865cd.m2275a(Enum_draw.f4183k);
        for (int i6 = 0; i6 < size; i6++) {
            if (m485a[i6] instanceof OrderableUnit) {
                OrderableUnit orderableUnit2 = (OrderableUnit) m485a[i6];
                if (orderableUnit2.f3699ar && (i = orderableUnit2.f3781aB) > 0 && orderableUnit2.mo2657I()) {
                    if (!orderableUnit2.f1613bS) {
                        orderableUnit2.f1613bS = true;
                    }
                    for (int i7 = 0; i7 < i; i7++) {
                        orderableUnit2.m2619a(orderableUnit2.f3691aC[i7], f, false);
                    }
                }
            }
        }
        gameEngine.f5865cd.m2270b(Enum_draw.f4183k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2619a(Unit unit, float f, boolean z) {
        Waypoint activeWaypoint;
        Waypoint activeWaypoint2;
        if (unit != this && unit.collidable && this.collidable && mo2676i() == unit.mo2676i() && isUnderwater() == unit.isUnderwater() && unit.transportedBy == null && this.transportedBy == null && this.f1607bI != unit && unit.f1607bI != this) {
            float f2 = this.x + this.f1611bQ;
            float f3 = this.y + this.f1612bR;
            float f4 = unit.x + unit.f1611bQ;
            float f5 = unit.y + unit.f1612bR;
            float distanceSq = CommonUtils.distanceSq(f2, f3, f4, f5);
            float f6 = this.radius + unit.radius;
            if (z) {
                float f7 = distanceSq;
                if (distanceSq < f6 * f6) {
                    f7 = 0.0f;
                }
                if (unit instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) unit;
                    int i = orderableUnit.f3781aB;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (orderableUnit.f3691aC[i2] == this) {
                            return;
                        }
                    }
                }
                if (this.f3691aC == null) {
                    this.f3691aC = new Unit[10];
                    this.f3692aD = new float[10];
                }
                Unit[] unitArr = this.f3691aC;
                byte b = -1;
                int i3 = 0;
                while (true) {
                    if (i3 < this.f3781aB) {
                        if (f7 >= this.f3692aD[i3]) {
                            i3++;
                        } else {
                            b = i3;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (b == -1) {
                    if (this.f3781aB < unitArr.length) {
                        b = this.f3781aB;
                    } else {
                        return;
                    }
                }
                if (this.f3781aB < unitArr.length) {
                    this.f3781aB = (byte) (this.f3781aB + 1);
                }
                for (int i4 = this.f3781aB - 1; i4 > b; i4--) {
                    unitArr[i4] = unitArr[i4 - 1];
                }
                unitArr[b] = unit;
                this.f3692aD[b] = f7;
            } else if (distanceSq < f6 * f6 && !unit.mo3778a(this, f) && !mo3778a(unit, f)) {
                float m1659d = CommonUtils.m1659d(f2, f3, f4, f5);
                float sqrt = (f6 - ((float) Math.sqrt(distanceSq))) + 0.001f;
                if (sqrt <= 0.0f) {
                    return;
                }
                int s = mo3143s(unit);
                int mo3143s = unit.mo3143s(this);
                int i5 = s > mo3143s ? s : mo3143s;
                if (i5 != 0) {
                    float f8 = (sqrt / i5) * f;
                    if (f8 > sqrt) {
                        f8 = sqrt;
                    }
                    sqrt = f8;
                }
                float f9 = sqrt * 0.95f;
                if (f9 > 1.0f) {
                    f9 *= 0.7f;
                }
                if (f9 > 3.0f) {
                    f9 = 3.0f + ((f9 - 3.0f) * 0.7f);
                }
                if (f9 > 6.0f) {
                    f9 = 6.0f + ((f9 - 6.0f) * 0.7f);
                }
                if (f9 > 10.0f) {
                    f9 = 10.0f + ((f9 - 10.0f) * 0.7f);
                }
                float f10 = 0.0f;
                float bM = getMass();
                float mass = unit.getMass();
                if (this.team == unit.team) {
                    boolean z2 = false;
                    float f11 = 1.7f;
                    if (unit instanceof OrderableUnit) {
                        OrderableUnit orderableUnit2 = (OrderableUnit) unit;
                        if (this.f3679P > 200.0f || orderableUnit2.f3679P > 200.0f) {
                            f11 = 5.0f;
                        }
                        if (this.f3686W == orderableUnit2) {
                            mass *= f11;
                            z2 = true;
                        }
                        if (orderableUnit2.f3686W == this) {
                            bM *= f11;
                            z2 = true;
                        }
                        if (!z2) {
                            if (this.f3687X && orderableUnit2.f3686W != null) {
                                bM *= f11;
                            } else if (orderableUnit2.f3687X && this.f3686W != null) {
                                mass *= f11;
                            } else if (this.f3707c == 0.0f && orderableUnit2.f3707c != 0.0f) {
                                bM *= f11;
                            } else if (orderableUnit2.f3707c == 0.0f && this.f3707c != 0.0f) {
                                mass *= f11;
                            }
                        }
                    }
                }
                if (unit instanceof AbstractC0582q) {
                    f10 = bM / (bM + mass);
                }
                float f12 = 1.0f - f10;
                float cos = CommonUtils.cos(m1659d);
                float sin = CommonUtils.sin(m1659d);
                if (unit instanceof AbstractC0582q) {
                    float f13 = f9 * f10;
                    unit.f1611bQ += cos * f13;
                    unit.f1612bR += sin * f13;
                }
                float f14 = f9 * f12;
                this.f1611bQ -= cos * f14;
                this.f1612bR -= sin * f14;
                GameEngine gameEngine = GameEngine.getInstance();
                this.f3682S = unit;
                this.f3683T = gameEngine.frameNumber;
                if (unit instanceof OrderableUnit) {
                    OrderableUnit orderableUnit3 = (OrderableUnit) unit;
                    orderableUnit3.f3682S = this;
                    orderableUnit3.f3683T = gameEngine.frameNumber;
                }
                if (unit instanceof OrderableUnit) {
                    OrderableUnit orderableUnit4 = (OrderableUnit) unit;
                    if (this.f3685V != 0 && this.f3685V == orderableUnit4.f3685V) {
                        if (getActiveWaypoint() == null && (activeWaypoint2 = orderableUnit4.getActiveWaypoint()) != null && (activeWaypoint2.type == WaypointType.f1751a || activeWaypoint2.type == WaypointType.f1758h)) {
                            orderableUnit4.m2546ax();
                        }
                        if (orderableUnit4.getActiveWaypoint() == null && (activeWaypoint = orderableUnit4.getActiveWaypoint()) != null) {
                            if (activeWaypoint.type == WaypointType.f1751a || activeWaypoint.type == WaypointType.f1758h) {
                                m2546ax();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: U */
    public int mo2647U() {
        return 1;
    }

    /* renamed from: a */
    public void upgrade(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public void m2646V() {
        GameEngine game = GameEngine.getInstance();
        if (this.team == game.playerTeam) {
            game.interfaceEngine.f4737f.m1953b(this);
        }
    }

    /* renamed from: b */
    public float m2541b(float f, float f2, float f3) {
        if (isFixedFiring()) {
            if (mo2975bH()) {
                return 0.0f;
            }
            return m2496c(f, CommonUtils.m1659d(this.x, this.y, f2, f3));
        } else if (mo2512bk() < 1) {
            return 0.0f;
        } else {
            int mo2578aS = mo2578aS();
            if (mo2578aS == -1) {
                mo2578aS = 0;
            }
            PointF mo2662F = mo2662F(mo2578aS);
            float m1659d = CommonUtils.m1659d(mo2662F.x, mo2662F.y, f2, f3);
            this.f1532cC[mo2578aS].m3722a(70);
            return m2640a(f, m1659d, mo2578aS);
        }
    }

    /* renamed from: c */
    public float m2496c(float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        if (this.f1524bZ && m2522ba()) {
            z = true;
            z2 = true;
        }
        return m2637a(f, f2, z, z2);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public void mo2475h(float f) {
        float m1670c = CommonUtils.m1670c(this.direction, f, 360.0f);
        if (CommonUtils.absf(m1670c) > 0.01d) {
            mo2471i(m1670c);
        }
    }

    /* renamed from: a */
    public float m2637a(float f, float f2, boolean z, boolean z2) {
        this.f1523bY = f2;
        if (CommonUtils.absf(this.direction - f2) < 0.01f) {
            if (z && this.f1524bZ) {
                m2466j(25);
                this.f1524bZ = false;
                return 0.0f;
            }
            return 0.0f;
        }
        float m1670c = CommonUtils.m1670c(this.direction, f2, 360.0f);
        if (z) {
            if (z2 && CommonUtils.absf(m1670c) > 100.0f) {
                m1670c = CommonUtils.m1670c(this.direction, f2 + 180.0f, 360.0f);
                if (!this.f1524bZ) {
                    m2466j(25);
                    this.f1524bZ = true;
                }
            } else if (this.f1524bZ) {
                m2466j(25);
                this.f1524bZ = false;
            }
        }
        if (CommonUtils.absf(m1670c) < 0.01f) {
            return 0.0f;
        }
        if (this.f3700as <= 0.0f) {
            float mo2671B = mo2671B();
            if (mo2671B <= 0.0f) {
                float turnSpeed = (m1670c > 0.0f ? 1.0f : -1.0f) * getTurnSpeed() * f;
                if (CommonUtils.absf(turnSpeed) > CommonUtils.absf(m1670c)) {
                    turnSpeed = m1670c;
                }
                mo2471i(turnSpeed);
            } else {
                float f3 = m1670c > 0.0f ? 1.0f : -1.0f;
                if (CommonUtils.absf(m1670c) < CommonUtils.absf(this.f1616bV) / mo2671B) {
                    this.f1616bV = CommonUtils.m1744a(this.f1616bV, f3 * mo2671B, mo2671B * f);
                } else {
                    this.f1616bV = CommonUtils.m1744a(this.f1616bV, f3 * getTurnSpeed(), mo2671B * f);
                }
                float f4 = this.f1616bV * f;
                if (CommonUtils.absf(f4) > CommonUtils.absf(m1670c)) {
                    this.f1616bV = 0.0f;
                    f4 = m1670c;
                }
                mo2471i(f4);
            }
        }
        return m1670c;
    }

    /* renamed from: i */
    public void mo2471i(float f) {
        this.direction += f;
        if (this.direction > 180.0f) {
            this.direction -= 360.0f;
        }
        if (this.direction < -180.0f) {
            this.direction += 360.0f;
        }
        if (mo2511bl()) {
            int mo2512bk = mo2512bk();
            for (int i = 0; i < mo2512bk; i++) {
                C0235aj c0235aj = this.f1532cC[i];
                c0235aj.f1652a += f;
                if (c0235aj.f1652a > 180.0f) {
                    c0235aj.f1652a -= 360.0f;
                }
                if (c0235aj.f1652a < -180.0f) {
                    c0235aj.f1652a += 360.0f;
                }
            }
        }
    }

    /* renamed from: j */
    public void m2467j(float f) {
        int mo2512bk = mo2512bk();
        for (int i = 0; i < mo2512bk; i++) {
            this.f1532cC[i].f1652a = f + mo2670B(i);
        }
    }

    /* renamed from: a */
    public void mo2628a(int i, float f) {
        this.f1532cC[i].f1652a += f;
    }

    /* renamed from: a */
    public float m2640a(float f, float f2, int i) {
        float f3;
        C0235aj c0235aj = this.f1532cC[i];
        float m1670c = CommonUtils.m1670c(c0235aj.f1652a, f2, 360.0f);
        if (m1670c == 0.0f) {
            return m1670c;
        }
        float mo2436w = mo2436w(i);
        if (mo2436w <= 0.0f) {
            float m1670c2 = CommonUtils.m1670c(c0235aj.f1652a, f2, getTurretTurnSpeed(i) * f);
            mo2628a(i, m1670c2);
            f3 = m1670c - m1670c2;
        } else {
            float mo2433y = mo2433y(i);
            float f4 = m1670c > 0.0f ? 1.0f : -1.0f;
            float absf = CommonUtils.absf(c0235aj.f1654c) / mo2433y;
            boolean z = ((m1670c > 0.0f ? 1 : (m1670c == 0.0f ? 0 : -1)) > 0) == ((c0235aj.f1654c > 0.0f ? 1 : (c0235aj.f1654c == 0.0f ? 0 : -1)) > 0);
            if (CommonUtils.absf(m1670c) < absf && z) {
                c0235aj.f1654c = CommonUtils.m1744a(c0235aj.f1654c, f4 * mo2433y, mo2433y * f);
            } else {
                c0235aj.f1654c = CommonUtils.m1744a(c0235aj.f1654c, f4 * getTurretTurnSpeed(i), mo2436w * f);
            }
            float f5 = c0235aj.f1654c * f;
            if (CommonUtils.absf(f5) > CommonUtils.absf(m1670c)) {
                c0235aj.f1654c = 0.0f;
                f5 = m1670c;
            }
            mo2628a(i, f5);
            f3 = m1670c - f5;
        }
        return f3;
    }

    /* renamed from: W */
    public Unit m2645W() {
        Waypoint activeWaypoint;
        if (this.f3710h && (activeWaypoint = getActiveWaypoint()) != null) {
            if ((activeWaypoint.type == WaypointType.f1754d || activeWaypoint.type == WaypointType.f1757g) && activeWaypoint.targetUnit != null && !activeWaypoint.targetUnit.dead) {
                return activeWaypoint.targetUnit;
            }
            return null;
        }
        return null;
    }

    /* renamed from: X */
    public boolean m2644X() {
        Waypoint activeWaypoint = getActiveWaypoint();
        if (activeWaypoint != null && activeWaypoint.type == WaypointType.f1757g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m2634a(float f, Waypoint waypoint, C0590x c0590x) {
        if (waypoint.f1739c == null) {
            m2546ax();
            waypoint = null;
        }
        if (waypoint != null) {
            if (waypoint.type == WaypointType.f1766p) {
            }
            if (1 != 0) {
                Action a = mo3219a(waypoint.f1739c);
                mo2648T();
                if (a == null) {
                    m2600a("Failed to find action:" + waypoint.f1739c.m3863a());
                } else {
                    mo2752a(a, false, new PointF(waypoint.x, waypoint.y), waypoint.targetUnit);
                }
                m2546ax();
            }
        }
    }

    /* renamed from: b */
    private void m2540b(float f, Waypoint waypoint, C0590x c0590x) {
        Unit m3670i = waypoint.m3670i();
        if (m3670i != null) {
            this.f3674K = m3670i;
            if (this.f3676M > 5.0f) {
                this.f3676M = 5.0f;
            }
        }
        m2546ax();
    }

    /* renamed from: c */
    private void m2495c(float f, Waypoint waypoint, C0590x c0590x) {
        float f2;
        Unit m2645W;
        Waypoint m2556an;
        Waypoint m2556an2;
        float realX = waypoint.getRealX();
        float realY = waypoint.getRealY();
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, realX, realY);
        boolean z = waypoint.type == WaypointType.f1761k || waypoint.type == WaypointType.f1764n;
        boolean z2 = waypoint.type == WaypointType.f1761k;
        Unit unit = waypoint.targetUnit;
        if (z) {
            if (unit == null || unit.dead) {
                m2546ax();
                waypoint = null;
            }
            if (waypoint != null && unit != null && !unit.mo3181ce() && this.team.m3925c(unit.team)) {
                m2546ax();
                waypoint = null;
            }
        }
        if (waypoint != null) {
            boolean z3 = false;
            float f3 = this.radius;
            if (z) {
                f3 += unit.radius;
            }
            if (waypoint.type == WaypointType.f1764n) {
                if (this.moving) {
                    f2 = f3 + 30.0f;
                } else {
                    f2 = f3 + 50.0f;
                }
            } else if (this.moving) {
                f2 = f3 + 80.0f;
            } else {
                f2 = f3 + 100.0f;
            }
            if (distanceSq > f2 * f2) {
                this.f3712j = true;
                this.f3764k = realX;
                this.f3765l = realY;
                this.f3713m = 2;
                if (this.f3718r > 90.0f) {
                    this.f3718r = 90.0f;
                }
                this.f3717q = 18;
                if (this.f3686W != null && !this.f3686W.isActive()) {
                    c0590x.f3811d = false;
                }
            } else {
                this.f3721v = 0;
            }
            c0590x.f3811d = false;
            if (0 == 0 && this.f3674K != null && !this.f3674K.dead) {
                boolean z4 = false;
                if (m2534b(this.f3674K, false)) {
                    z4 = true;
                }
                if (z4) {
                    float distanceSq2 = CommonUtils.distanceSq(this.x, this.y, this.f3674K.x, this.f3674K.y);
                    float m2449o = m2449o(this.f3674K);
                    boolean z5 = false;
                    boolean z6 = false;
                    if (distanceSq2 < m2449o * m2449o) {
                        z6 = true;
                    }
                    if (z6 && !m2642Z()) {
                        z6 = false;
                    }
                    if (distanceSq < 22500.0f) {
                        this.f3721v = 0;
                    }
                    if (!z6 && (this.f3721v == 1 || distanceSq > 122500.0f)) {
                        z5 = true;
                        this.f3721v = 1;
                    }
                    if (distanceSq > 302500.0f || (this.f3721v == 1 && distanceSq > 202500.0f)) {
                        z5 = true;
                        this.f3721v = 1;
                    }
                    if (!z5) {
                        z3 = true;
                        this.f3721v = 0;
                        if (z6) {
                            this.f3712j = false;
                        } else {
                            if (this.f3718r > 90.0f) {
                                this.f3718r = 90.0f;
                            }
                            this.f3712j = true;
                            this.f3764k = this.f3674K.x;
                            this.f3765l = this.f3674K.y;
                            this.f3713m = 0;
                            this.f3711i = true;
                        }
                    }
                }
            }
            if (z2 && !z3) {
                Unit m3729q = unit.m3729q(2.0f);
                if (m3729q != null && !m2534b(m3729q, true)) {
                    m3729q = null;
                }
                if (m3729q == null && this.f3721v != 1) {
                    m3729q = m3729q(2.0f);
                    if (m3729q != null && !m2534b(m3729q, true)) {
                        m3729q = null;
                    }
                }
                if (m3729q != null) {
                    z3 = true;
                    if (this.f3718r > 90.0f) {
                        this.f3718r = 90.0f;
                    }
                    this.f3712j = true;
                    this.f3764k = m3729q.x;
                    this.f3765l = m3729q.y;
                    this.f3713m = 0;
                    this.f3711i = true;
                }
            }
            if (z2 && !z3 && mo2621a(unit) && ((unit.hp < unit.maxHp || unit.built < 1.0f) && mo2621a(unit) && (m2556an2 = m2556an()) != null)) {
                m2556an2.m3686b(unit);
                m2556an2.f1744m = true;
                z3 = true;
                if (this.f3718r > 20.0f) {
                    this.f3718r = 20.0f;
                }
            }
            if (z2 && !z3 && mo2560aj() && (unit instanceof OrderableUnit) && (m2645W = ((OrderableUnit) unit).m2645W()) != null && mo2621a(m2645W) && (m2556an = m2556an()) != null) {
                m2556an.m3686b(m2645W);
                m2556an.f1744m = true;
                if (this.f3718r > 20.0f) {
                    this.f3718r = 20.0f;
                }
            }
        }
    }

    /* renamed from: d */
    private void m2488d(float f, Waypoint waypoint, C0590x c0590x) {
        float realX = waypoint.getRealX();
        float realY = waypoint.getRealY();
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, realX, realY);
        if (waypoint.targetUnit == null || waypoint.targetUnit.dead) {
            m2546ax();
            waypoint = null;
        }
        if (waypoint != null) {
            boolean z = false;
            if (waypoint.targetUnit.mo2975bH()) {
                if (distanceSq < 961.0f) {
                    this.f3681R += f;
                }
                if (this.f3681R > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (waypoint.targetUnit.mo2974ca().m4667a()) {
                    f2 = 11.0f;
                }
                if (this.f3705b > 0.0f) {
                    f2 = waypoint.targetUnit.radius + this.radius + 31.0f;
                }
                if (distanceSq < f2 * f2) {
                    z = true;
                }
            } else {
                float f3 = waypoint.targetUnit.radius + this.radius + 5.0f;
                if (distanceSq < f3 * f3) {
                    z = true;
                }
            }
            if (!z) {
                this.f3712j = true;
                this.f3764k = realX;
                this.f3765l = realY;
                this.f3713m = 0;
                if (waypoint.targetUnit.mo2975bH()) {
                    Rect mo2974ca = waypoint.targetUnit.mo2974ca();
                    this.f3713m = CommonUtils.mini(mo2974ca.height() / 2, mo2974ca.width() / 2) + 1;
                }
                if (this.f3718r > 90.0f) {
                    this.f3718r = 90.0f;
                }
                this.f3717q = 18;
                if (distanceSq < 48400.0f) {
                    c0590x.f3811d = false;
                    if (this.f3718r > 0.0f && getActivePathNode() == null) {
                        this.f3711i = true;
                    }
                }
                if (this.f3686W != null && !this.f3686W.isActive()) {
                    c0590x.f3811d = false;
                }
            }
            if (z) {
                m3775a(EnumC0334ad.f2112i, waypoint.targetUnit);
                m2546ax();
            }
        }
    }

    /* renamed from: e */
    private void m2484e(float f, Waypoint waypoint, C0590x c0590x) {
        float realX = waypoint.getRealX();
        float realY = waypoint.getRealY();
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, realX, realY);
        if (waypoint.targetUnit == null || waypoint.targetUnit.dead || !waypoint.targetUnit.isActive()) {
            m2546ax();
            waypoint = null;
        }
        if (waypoint != null && !mo2822d(waypoint.targetUnit, false)) {
            m2546ax();
        }
        if (waypoint != null) {
            this.f1607bI = waypoint.targetUnit;
            if (distanceSq > 441.0f) {
                this.f3712j = true;
                this.f3764k = realX;
                this.f3765l = realY;
                if (this.f3718r > 90.0f) {
                    this.f3718r = 90.0f;
                }
                this.f3717q = 18;
                if (distanceSq < 72900.0f) {
                    c0590x.f3811d = false;
                    if (this.f3718r > 0.0f && this.f3783aN == null) {
                        this.f3711i = true;
                    }
                }
                if (this.f3686W != null && !this.f3686W.isActive()) {
                    c0590x.f3811d = false;
                    return;
                }
                return;
            }
            mo2819e(waypoint.targetUnit, false);
            m2546ax();
        }
    }

    /* renamed from: a */
    private void m2633a(float f, Waypoint waypoint, C0590x c0590x, boolean z) {
        Waypoint m2884a;
        Unit q;
        float realX = waypoint.getRealX();
        float realY = waypoint.getRealY();
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, realX, realY);
        GameEngine gameEngine = GameEngine.getInstance();
        if (!mo2580aQ()) {
            boolean z2 = false;
            C0383i dj = m3735dj();
            if (dj != null && dj.f2291H) {
                m2500bw();
                z2 = true;
            }
            if (!z2) {
                m2547aw();
                waypoint = null;
            }
        }
        float f2 = 7.0f;
        if (distanceSq < 1681.0f) {
            this.f3681R += f;
        }
        if (this.f3681R > 240.0f) {
            f2 = 16.0f;
        }
        if (this.f3681R > 340.0f) {
            f2 = 36.0f;
        }
        if (waypoint != null && waypoint.type == WaypointType.f1760j) {
            if (m2549au() != 1) {
                f2 = 20.0f;
                float f3 = 30.0f;
                if (!z || this.f3683T == gameEngine.frameNumber || this.f3683T == gameEngine.frameNumber - 1) {
                    f3 = 70.0f;
                }
                if (distanceSq < f3 * f3) {
                    m2486d(waypoint);
                    m2547aw();
                    waypoint = null;
                }
            } else {
                f2 = 30.0f;
                if (!z || this.f3683T == gameEngine.frameNumber || this.f3683T == gameEngine.frameNumber - 1) {
                    f2 = 80.0f;
                }
            }
        }
        if (waypoint != null) {
            if (distanceSq < f2 * f2) {
                if (waypoint.type == WaypointType.f1760j) {
                    if (m2549au() == 1) {
                    }
                } else if (waypoint.type == WaypointType.f1758h) {
                    boolean z3 = false;
                    if (this.f3674K != null && !this.f3674K.dead && m2616a(this.f3674K, false)) {
                        z3 = true;
                    }
                    if (!z3) {
                        m2547aw();
                        waypoint = null;
                    }
                } else {
                    m2547aw();
                    waypoint = null;
                }
            } else {
                this.f3712j = true;
                this.f3764k = realX;
                this.f3765l = realY;
                this.f3713m = 0;
                if (waypoint.type == WaypointType.f1760j) {
                    this.f3719s = true;
                    m2596aA();
                }
            }
        }
        if (waypoint != null) {
            if (waypoint.type == WaypointType.f1758h || waypoint.type == WaypointType.f1760j) {
                if (this.f3674K != null && !this.f3674K.dead && m2616a(this.f3674K, false)) {
                    m2635a(f, this.f3674K, c0590x, true);
                }
                if (this.f3686W != null && this.f3686W.f3674K != null) {
                    c0590x.f3811d = false;
                }
            }
            if (waypoint.type == WaypointType.f1760j) {
                if (this.f3674K == null && (q = m3729q(3.0f)) != null && m2534b(q, true)) {
                    if (this.f3718r > 90.0f) {
                        this.f3718r = 90.0f;
                    }
                    this.f3712j = true;
                    this.f3764k = q.x;
                    this.f3765l = q.y;
                    this.f3713m = 0;
                    this.f3711i = true;
                }
                if (mo2560aj() && gameEngine.frameNumber % 10 == this.GameObjectID % 10 && (m2884a = Repairbay.m2884a(this, f, 150.0f, true)) != null) {
                    m2884a.f1744m = false;
                    m2884a.f1749k = 200.0f;
                    this.f3712j = false;
                    m2590aG();
                }
            }
        }
    }

    /* renamed from: f */
    private void m2482f(float f, Waypoint waypoint, C0590x c0590x) {
        boolean z;
        float realX = waypoint.getRealX();
        float realY = waypoint.getRealY();
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, realX, realY);
        GameEngine gameEngine = GameEngine.getInstance();
        UnitType unitType = waypoint.build;
        if (unitType == null) {
            m2600a("activeBuildingType==null, removing waypoint");
            m2546ax();
            waypoint = null;
        }
        if (waypoint != null) {
            float f2 = mo2723f(unitType);
            boolean z2 = false;
            if (f2 <= 30.0f) {
            }
            if (f2 <= 25.0f && this.height > 4.0f) {
                z2 = true;
            }
            if (this.f3686W != null) {
                Waypoint activeWaypoint = this.f3686W.getActiveWaypoint();
                if (activeWaypoint == null || activeWaypoint.type != WaypointType.f1753c) {
                    c0590x.f3811d = false;
                }
                if (activeWaypoint != null && !waypoint.m3685b(activeWaypoint)) {
                    c0590x.f3811d = false;
                }
            }
            boolean z3 = false;
            if (!C0955y.m462a(this.f3763J, 200)) {
                z3 = true;
            }
            if (f2 > 800000.0f) {
                z = true;
            } else {
                z = distanceSq <= f2 * f2;
            }
            if (!z || z2) {
                if (!mo2580aQ()) {
                    m2546ax();
                    return;
                }
                this.f3712j = true;
                this.f3764k = realX;
                this.f3765l = realY;
                if (f2 > 58.0f) {
                    this.f3713m = (int) ((f2 - 41.0f) / (gameEngine.map.pixel_Width * 1.414f));
                }
                if (this.f3718r > 90.0f) {
                    this.f3718r = 90.0f;
                }
                if (this.f3716p > 3) {
                    m2546ax();
                }
            } else if (!z3) {
                if (!mo2435x() || CommonUtils.absf(m2541b(f, realX, realY)) <= 30.0f) {
                    C0586t m2611a = m2611a(waypoint, waypoint.build, waypoint.f1740d, waypoint.x, waypoint.y);
                    Unit unit = null;
                    if (m2611a.f3784a != null) {
                        unit = m2611a.f3784a;
                    } else if (m2611a.f3785b != null) {
                        unit = m2611a.f3785b;
                    }
                    if (unit != null) {
                        m2611a.f3787d.mo3830a(this, unit);
                        if (mo2621a(unit)) {
                            if (mo2749b(unit) > 10000.0f) {
                                unit.m3728r(1.0f);
                                m2547aw();
                            } else {
                                waypoint.clear();
                                waypoint.type = WaypointType.f1754d;
                                waypoint.targetUnit = unit;
                                m2590aG();
                            }
                        } else {
                            m2546ax();
                        }
                        this.f3763J = -9999;
                        return;
                    }
                    if (waypoint.build == null) {
                        GameEngine.PrintLOG("active.build==null");
                    }
                    if (!m2611a.f3786c) {
                        m2546ax();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2635a(float f, Unit unit, C0590x c0590x, boolean z) {
        EnumC0295b mo2519bd = mo2519bd();
        float f2 = unit.x;
        float f3 = unit.y;
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, f2, f3);
        if (this.f3686W != null) {
            if (distanceSq < 490000.0f) {
                if (distanceSq < 48400.0f) {
                    c0590x.f3811d = false;
                }
                float distanceSq2 = CommonUtils.distanceSq(this.f3686W.x, this.f3686W.y, f2, f3);
                if (distanceSq2 < 48400.0f) {
                    c0590x.f3811d = false;
                }
                if (distanceSq2 < 270400.0f && mo2576aU()) {
                    c0590x.f3811d = false;
                }
            }
            if (this.f3686W.f3674K == unit) {
                c0590x.f3811d = false;
            }
            if (c0590x.f3811d) {
                this.f3696ab = 0.0f;
            } else {
                this.f3696ab += f;
            }
        } else {
            this.f3696ab = 500.0f;
        }
        float m2449o = m2449o(unit);
        boolean z2 = true;
        if (distanceSq < m2449o * m2449o) {
            if (this.f3674K != unit) {
                if (C0236ak.m3716a(this, unit)) {
                    this.f3674K = unit;
                    this.f3675L = 10.0f;
                    mo2653L(-1);
                }
            } else {
                this.f3675L = 10.0f;
            }
            float f4 = m2449o;
            if (!isFixedFiring()) {
                f4 -= 1.0f;
                if (mo2576aU()) {
                    f4 -= 2.0f;
                }
                if (mo2483e(0) > 5.0f) {
                    f4 -= 3.0f;
                }
            }
            if (distanceSq < f4 * f4 && mo2519bd() != EnumC0295b.f1772d) {
                if (unit == null) {
                    z2 = false;
                } else if (m2468i(unit)) {
                    z2 = false;
                    if (z) {
                        this.f3712j = false;
                    }
                } else if (!m2465j(unit)) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            this.f3712j = true;
            this.f3764k = f2;
            this.f3765l = f3;
            this.f3713m = 0;
            if (mo2519bd == EnumC0295b.f1772d) {
                m2641a(distanceSq, f2, f3);
            }
            this.f3713m = m2444q(unit);
            if (this.f3718r > 90.0f) {
                this.f3718r = 90.0f;
            }
            if (distanceSq < 810000.0f) {
                if (mo3177cq() || mo2576aU()) {
                    this.f3711i = true;
                }
                if (!c0590x.f3811d && this.f3696ab < 120.0f) {
                    this.f3718r = 0.1f;
                    this.f3711i = true;
                }
            }
        }
    }

    /* renamed from: g */
    private void m2478g(float f, Waypoint waypoint, C0590x c0590x) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (mo2519bd() == EnumC0295b.f1772d) {
            if (waypoint != null && ((waypoint.targetUnit == null || waypoint.targetUnit.dead || waypoint.targetUnit.team == this.team) && !this.f3774al)) {
                if (this.f3674K != null && this.f3674K.dead) {
                    this.f3674K = null;
                }
                m2602a(gameEngine, f, m2528b(true) + 200.0f);
                if (this.f3674K != null) {
                    waypoint.targetUnit = this.f3674K;
                    m2596aA();
                    m2590aG();
                } else {
                    this.f3774al = true;
                    this.f3773ak = true;
                }
            }
            if (waypoint != null && (waypoint.targetUnit == null || waypoint.targetUnit.dead || waypoint.targetUnit.team == this.team)) {
                if (waypoint.targetUnit == null) {
                    m2546ax();
                    waypoint = null;
                } else if (!this.f3773ak) {
                    m2546ax();
                    waypoint = null;
                }
            }
        } else if (waypoint.targetUnit == null || waypoint.targetUnit.dead || waypoint.targetUnit.team == this.team) {
            boolean z = true;
            if (m2549au() > 1) {
                z = false;
            }
            waypoint.targetUnit = null;
            if (z) {
                if (this.f3674K != null && this.f3674K.dead) {
                    this.f3674K = null;
                }
                m2602a(gameEngine, f, m2528b(true));
                if (this.f3674K != null) {
                    waypoint.targetUnit = this.f3674K;
                    m2596aA();
                    m2590aG();
                }
            }
            if (waypoint.targetUnit == null) {
                m2546ax();
                waypoint = null;
            }
        }
        if (waypoint != null && waypoint.targetUnit != null && !waypoint.targetUnit.dead && !waypoint.targetUnit.mo3181ce() && this.team.m3925c(waypoint.targetUnit.team) && !C0236ak.m3714b(this, waypoint.targetUnit)) {
            m2546ax();
            return;
        }
        if (waypoint != null && !mo2580aQ() && !canAttack()) {
            m2546ax();
            waypoint = null;
        }
        if (waypoint != null) {
            m2635a(f, waypoint.targetUnit, c0590x, false);
        }
    }

    /* renamed from: h */
    private void m2474h(float f, Waypoint waypoint, C0590x c0590x) {
        float realX = waypoint.getRealX();
        float realY = waypoint.getRealY();
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, realX, realY);
        if (waypoint.targetUnit == null || waypoint.targetUnit.dead) {
            m2546ax();
            waypoint = null;
        }
        if (waypoint != null && !waypoint.targetUnit.mo2822d(this, false)) {
            m2546ax();
        }
        if (waypoint != null) {
            this.f1607bI = waypoint.targetUnit;
            boolean z = false;
            if (waypoint.targetUnit.mo2975bH()) {
                if (distanceSq < 961.0f) {
                    this.f3681R += f;
                }
                if (this.f3681R > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (waypoint.targetUnit.mo2974ca().m4667a()) {
                    f2 = 11.0f;
                }
                if (this.f3705b > 0.0f) {
                    f2 = waypoint.targetUnit.radius + 31.0f;
                }
                if (distanceSq < f2 * f2) {
                    z = true;
                }
            } else if (distanceSq < 441.0f) {
                z = true;
            }
            if (!z) {
                this.f3712j = true;
                this.f3764k = realX;
                this.f3765l = realY;
                if (this.f3718r > 90.0f) {
                    this.f3718r = 90.0f;
                }
                this.f3717q = 18;
                if (distanceSq < 48400.0f) {
                    c0590x.f3811d = false;
                    if (this.f3718r > 0.0f && this.f3783aN == null) {
                        this.f3711i = true;
                    }
                }
                if (this.f3686W != null && !this.f3686W.isActive()) {
                    c0590x.f3811d = false;
                }
            }
            if (z) {
                waypoint.targetUnit.mo2819e(this, false);
                m2546ax();
            }
        }
    }

    /* renamed from: a_ */
    public float m2570a_(Unit unit) {
        float mo3135D = unit.getUnitType().mo3135D();
        if (unit.mo2647U() == 2) {
            mo3135D *= 0.5f;
        }
        if (unit.mo2647U() == 3) {
            mo3135D *= 0.25f;
        }
        return mo3135D * mo2749b(unit);
    }

    /* renamed from: f */
    public float mo2480f(Unit unit) {
        return 0.001f * 5.1f;
    }

    /* renamed from: g */
    public C0407b m2476g(Unit unit) {
        if (unit.f1528bq != null) {
            return unit.f1528bq;
        }
        return unit.getUnitType().mo3137B();
    }

    /* renamed from: i */
    private void m2470i(float f, Waypoint waypoint, C0590x c0590x) {
        boolean z;
        int i;
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z2 = false;
        boolean z3 = false;
        if (waypoint == null) {
            return;
        }
        float realX = waypoint.getRealX();
        float realY = waypoint.getRealY();
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, realX, realY);
        if (waypoint != null && waypoint.type == WaypointType.f1757g && waypoint.targetUnit != null && waypoint.targetUnit.mo2862g() > 0.0f) {
            z3 = true;
        }
        if (waypoint != null && (waypoint.targetUnit == null || waypoint.targetUnit.dead || waypoint.targetUnit.transportedBy != null)) {
            if (z3) {
                z2 = true;
            } else {
                m2547aw();
                waypoint = null;
            }
        }
        if (waypoint != null && !z2 && z3 && waypoint.targetUnit != null && !mo2728C(waypoint.targetUnit)) {
            z2 = true;
        }
        if (waypoint != null && z2) {
            ValueList valueList = null;
            if (waypoint.targetUnit != null) {
                valueList = waypoint.targetUnit.mo3189cO();
            }
            Unit m2609a = m2609a(this, waypoint.targetUnit.x, waypoint.targetUnit.y, mo3188cP(), valueList);
            if (m2609a != null) {
                waypoint.targetUnit = m2609a;
                m2596aA();
            } else {
                m2547aw();
                waypoint = null;
            }
        }
        if (waypoint != null) {
            if (waypoint.type == WaypointType.f1754d) {
                if (!mo2621a(waypoint.targetUnit)) {
                    m2546ax();
                    waypoint = null;
                }
            } else if (!mo2458l(waypoint.targetUnit)) {
                m2546ax();
                waypoint = null;
            }
        }
        if (waypoint != null && waypoint.type == WaypointType.f1754d && waypoint.targetUnit != null && waypoint.targetUnit.hp >= waypoint.targetUnit.maxHp && waypoint.targetUnit.built >= 1.0f) {
            m2547aw();
            waypoint = null;
        }
        if (waypoint != null && waypoint.targetUnit == this) {
            m2546ax();
            waypoint = null;
        }
        if (waypoint != null && waypoint != null && waypoint.targetUnit != null && waypoint.targetUnit.mo2862g() != 0.0f) {
            boolean z4 = false;
            if (waypoint.type == WaypointType.f1754d) {
                z4 = true;
            }
            if (z4) {
                m2546ax();
                waypoint = null;
            }
        }
        if (waypoint != null && waypoint.type == WaypointType.f1757g && waypoint.targetUnit.team != this.team && waypoint.targetUnit.mo2862g() == 0.0f) {
            boolean z5 = true;
            if (gameEngine.m918L() && this.team.m3913d(waypoint.targetUnit.team)) {
                z5 = false;
            }
            if (z5) {
                m2546ax();
                waypoint = null;
            }
        }
        if (waypoint != null) {
            if (waypoint.type == WaypointType.f1757g) {
                i = mo2720v(waypoint.targetUnit);
                z = mo3142w(waypoint.targetUnit);
            } else {
                i = mo2721u(waypoint.targetUnit);
                z = mo3141x(waypoint.targetUnit);
            }
            if (this.f3686W != null) {
                float distanceSq2 = CommonUtils.distanceSq(this.f3686W.x, this.f3686W.y, realX, realY);
                int i2 = i + 80;
                if (distanceSq2 < i2 * i2) {
                    c0590x.f3811d = false;
                }
                Waypoint activeWaypoint = this.f3686W.getActiveWaypoint();
                if (activeWaypoint == null) {
                    c0590x.f3811d = false;
                }
                if (activeWaypoint != null && !waypoint.m3685b(activeWaypoint)) {
                    c0590x.f3811d = false;
                }
            }
            float f2 = i;
            if (this.f3710h) {
                f2 += 5.0f;
            }
            if (i <= 30) {
            }
            if (distanceSq > f2 * f2) {
                if (!mo2580aQ() || waypoint.f1749k == 0.0f) {
                    m2546ax();
                    return;
                }
                boolean z6 = false;
                if (waypoint.f1749k >= 0.0f) {
                    if (waypoint.f1749k < CommonUtils.m1738a((int) distanceSq) - f2) {
                        z6 = true;
                    }
                }
                if (z6) {
                    m2546ax();
                    return;
                }
                this.f3712j = true;
                this.f3764k = realX;
                this.f3765l = realY;
                if (i > 58) {
                    this.f3713m = (int) ((i - 41.0f) / (gameEngine.map.pixel_Width * 1.414f));
                } else {
                    this.f3713m = 0;
                }
                if (i < 30 || z) {
                    if (distanceSq < 841.0f) {
                        this.f3711i = true;
                    }
                    float f3 = i + 14;
                    if (distanceSq < f3 * f3 && this.f3718r > 0.0f && this.f3783aN == null) {
                        this.f3711i = true;
                    }
                }
                this.f3717q = this.f3713m;
                if (this.f3718r > 90.0f) {
                    this.f3718r = 90.0f;
                    return;
                }
                return;
            }
            int mo2578aS = mo2578aS();
            if (mo2578aS == -1) {
                mo2578aS = 0;
            }
            float f4 = 0.0f;
            if (mo2435x()) {
                f4 = m2541b(f, realX, realY);
            }
            boolean z7 = false;
            if (CommonUtils.absf(f4) < 30.0f || !mo2435x()) {
                this.f3710h = true;
                c0590x.f3808a = true;
                C0235aj c0235aj = this.f1532cC[mo2578aS];
                if (c0235aj.f1657f < mo2483e(mo2578aS)) {
                    c0235aj.f1657f += f;
                } else {
                    c0235aj.f1657f = mo2483e(mo2578aS);
                    z7 = true;
                }
            }
            if (z7) {
                Unit unit = waypoint.targetUnit;
                if (waypoint.type != WaypointType.f1757g) {
                    if (unit.built < 1.0f) {
                        mo2525bB();
                        float m2570a_ = m2570a_(unit);
                        float f5 = m2570a_ * f;
                        boolean z8 = false;
                        boolean z9 = false;
                        C0407b m2476g = m2476g(unit);
                        if (m2476g != null) {
                            if (unit.built + f5 > 1.0f) {
                                f5 = 1.0f - unit.built;
                                z8 = true;
                            }
                            double d = (unit.built + f5) - unit.f1619ce;
                            double d2 = 0.0d;
                            if (z8) {
                                d2 = 1.0f - unit.f1619ce;
                            } else if (d >= 0.0010000000474974513d) {
                                d2 = ((int) (d / 0.0010000000474974513d)) * 0.0010000000474974513d;
                            }
                            boolean z10 = false;
                            if (d2 > 0.0d && this.team.f1315aj.m3322a(m2476g)) {
                                z10 = true;
                            }
                            if (!z10 && (d2 <= 0.0d || m2476g.m3407c(this, d2))) {
                                unit.f1619ce = (float) (unit.f1619ce + d2);
                            } else {
                                if (!z10) {
                                    this.team.f1315aj.m3321a(m2476g, this, d2);
                                }
                                f5 = 0.0f;
                                z8 = false;
                                z9 = true;
                            }
                        }
                        if (!z9) {
                            mo2620a(unit, f, mo2578aS);
                            float f6 = unit.built + f5;
                            if (z8) {
                                f6 = 1.0f;
                            }
                            unit.m3728r(f6);
                            if (f6 >= 1.0f && m2570a_ < 0.3d && unit.team == gameEngine.playerTeam) {
                                gameEngine.interfaceEngine.f4737f.m1958a(unit);
                            }
                            this.f3694aH = false;
                            return;
                        }
                        this.f3694aH = true;
                        return;
                    }
                    mo2620a(unit, f, mo2578aS);
                    unit.hp += mo2748c(unit) * f;
                    if (unit.hp > unit.maxHp) {
                        unit.hp = unit.maxHp;
                        m2546ax();
                    }
                    this.f3694aH = false;
                    return;
                }
                mo2536b(unit, f, mo2578aS);
                this.f3694aH = false;
                mo2525bB();
                boolean z11 = false;
                boolean y = m3726y(unit);
                float z12 = mo3140z(unit);
                boolean z13 = waypoint.targetUnit.mo2862g() > 0.0f;
                C0407b m2476g2 = m2476g(unit);
                if (z13 || m2476g2 != null) {
                }
                boolean z14 = false;
                if (!z13 && this.f3678O < 100.0f && !z13) {
                    if (unit.built < 0.5d) {
                        if (m2476g2 == null) {
                            z14 = true;
                        }
                    } else if (unit.hp / unit.maxHp < 0.5d) {
                        z14 = true;
                    }
                }
                if (!z14) {
                    if (unit.built < 1.0f) {
                        float mo2480f = mo2480f(unit) * f;
                        if (mo2480f >= unit.built) {
                            mo2480f = unit.built;
                            unit.built = 0.0f;
                        } else {
                            unit.built -= mo2480f;
                        }
                        unit.f1619ce = unit.built;
                        if (m2476g2 != null) {
                            m2476g2.m3402a(this, mo2480f, true);
                        }
                        if (unit.built <= 0.0f) {
                            z11 = true;
                        }
                    } else {
                        float f7 = z12 * f;
                        if (f7 >= unit.hp) {
                            f7 = unit.hp;
                            unit.hp = -1.0f;
                        } else {
                            unit.hp -= f7;
                        }
                        unit.f1557dg = 1000.0f;
                        if (y) {
                            float f8 = f7 / unit.maxHp;
                            C0407b m3748cK = unit.m3748cK();
                            C0407b mo3192cL = unit.mo3192cL();
                            if (mo3192cL != null) {
                                m3748cK = mo3192cL;
                            }
                            if (z13 || m2476g2 != null) {
                            }
                            if (m3748cK.m3406a() > 0) {
                                this.f3684U += f8 * m3748cK.m3406a();
                                if (this.f3684U > 1.0f) {
                                    this.team.credits += (int) this.f3684U;
                                    this.f3684U -= (int) this.f3684U;
                                }
                                m3748cK.m3402a(this, f8, false);
                            } else {
                                m3748cK.m3402a(this, f8, true);
                            }
                        }
                        if (unit.hp <= 0.0f) {
                            z11 = true;
                        }
                    }
                }
                if (z11 && !unit.dead) {
                    if (!y) {
                        C0407b mo3192cL2 = unit.mo3192cL();
                        if (mo3192cL2 != null) {
                            GameEngine.PrintLOG("refund: " + mo3192cL2.m3389a(false, true, 10, true));
                            mo3192cL2.m3402a(this, 1.0d, true);
                        } else {
                            C0407b m3748cK2 = unit.m3748cK();
                            GameEngine.PrintLOG("refund==null getCustomPrice: " + m3748cK2.m3389a(false, true, 10, true));
                            if (unit.f1527bp != null) {
                                m3748cK2 = unit.f1527bp;
                                GameEngine.PrintLOG("refund==null overridePriceBuildCost: " + m3748cK2.m3389a(false, true, 10, true));
                            }
                            m3748cK2.m3402a(this, 0.800000011920929d, true);
                            if (unit.built >= 1.0f && m2476g2 != null) {
                                m2476g2.m3402a(this, 0.800000011920929d, true);
                            }
                        }
                    }
                    unit.dead = true;
                    unit.f1610bN = gameEngine.f5845by;
                    unit.m3745cg();
                    if ((unit instanceof OrderableUnit) && unit.mo2975bH()) {
                        gameEngine.PathEngine.m1102a((OrderableUnit) unit);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void m2463k(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1607bI != null) {
            this.f1607bI = null;
        }
        if (this.f1518bJ != null) {
            this.f1519bK = CommonUtils.toZero(this.f1519bK, f);
            this.f1607bI = this.f1518bJ;
            if (this.f1519bK == 0.0f) {
                this.f1518bJ = null;
            }
        }
        if (this.f3718r != 0.0f) {
            this.f3718r = CommonUtils.toZero(this.f3718r, f);
        }
        if (this.speed != 0.0f) {
            this.f3707c = CommonUtils.toZero(this.f3707c, f);
        }
        Waypoint activeWaypoint = getActiveWaypoint();
        this.f3711i = false;
        boolean z = this.f3712j;
        this.f3712j = false;
        this.f3719s = false;
        this.f3717q = 150;
        if (activeWaypoint != null && activeWaypoint.f1750l > 0.0f && activeWaypoint.f1750l < this.f3678O) {
            m2547aw();
            activeWaypoint = null;
        }
        C0590x c0590x = f3735aI;
        c0590x.m2428a();
        if (activeWaypoint != null) {
            this.f3678O += f;
            WaypointType waypointType = activeWaypoint.type;
            if (waypointType == WaypointType.f1751a || waypointType == WaypointType.f1758h || waypointType == WaypointType.f1760j) {
                m2633a(f, activeWaypoint, c0590x, z);
            } else if (waypointType == WaypointType.f1752b) {
                m2478g(f, activeWaypoint, c0590x);
            } else if (waypointType == WaypointType.f1753c) {
                m2482f(f, activeWaypoint, c0590x);
            } else if (waypointType == WaypointType.f1754d || waypointType == WaypointType.f1757g) {
                m2470i(f, activeWaypoint, c0590x);
            } else if (waypointType == WaypointType.f1755e) {
                m2474h(f, activeWaypoint, c0590x);
            } else if (waypointType == WaypointType.f1759i) {
                m2484e(f, activeWaypoint, c0590x);
            } else if (waypointType == WaypointType.f1763m) {
                m2488d(f, activeWaypoint, c0590x);
            } else if (waypointType == WaypointType.f1761k || waypointType == WaypointType.f1762l || waypointType == WaypointType.f1764n) {
                m2495c(f, activeWaypoint, c0590x);
            } else if (waypointType == WaypointType.f1765o || waypointType == WaypointType.f1766p) {
                m2634a(f, activeWaypoint, c0590x);
            } else if (waypointType == WaypointType.f1767q) {
                m2540b(f, activeWaypoint, c0590x);
            }
            if (activeWaypoint != getActiveWaypoint()) {
                activeWaypoint = null;
            }
        }
        this.f3710h = c0590x.f3808a;
        if (activeWaypoint != null && activeWaypoint.f1744m && this.f3760f > 1) {
            boolean z2 = true;
            Waypoint m2462k = m2462k(1);
            if (m2462k != null && (m2462k.type == WaypointType.f1761k || m2462k.type == WaypointType.f1760j)) {
                z2 = false;
            }
            if (z2) {
                m2546ax();
                activeWaypoint = null;
            }
        }
        if (activeWaypoint == null) {
            this.f3712j = false;
        }
        if (this.f3712j) {
            C0383i dj = m3735dj();
            if (dj != null && dj.f2291H) {
                m2500bw();
            }
        } else if (this.f3716p != 0) {
            this.f3716p = (byte) 0;
        }
        m2529b(gameEngine, f);
        m2601a(gameEngine, f, activeWaypoint, c0590x);
    }

    /* renamed from: a */
    private void m2641a(float f, float f2, float f3) {
        if (this.f3772aj < -900.0f) {
            this.f3772aj = CommonUtils.m1659d(this.x, this.y, f2, f3);
        }
        if (f < 10000.0f && mo2812bV()) {
            this.f3773ak = true;
        }
        if (this.f3773ak) {
            if (this.f1549cs < mo2520bc() * 0.6d || (f < 40000.0f && this.f1549cs < mo2520bc())) {
                this.f3764k += CommonUtils.cos(this.f3772aj + 180.0f) * 600.0f;
                this.f3765l += CommonUtils.sin(this.f3772aj + 180.0f) * 600.0f;
                return;
            }
            this.f3773ak = false;
            this.f3772aj = -999.0f;
            m2590aG();
        }
    }

    /* renamed from: a */
    private void m2631a(float f, PathNode pathNode, C0590x c0590x, Waypoint waypoint) {
        float f2;
        PathNode pathNode2;
        PathNode pathNode3;
        float f3;
        float f4;
        GameEngine gameEngine = GameEngine.getInstance();
        OrderableUnit orderableUnit = this.f3686W;
        float f5 = orderableUnit.x + this.f3767ad;
        float f6 = orderableUnit.y + this.f3768ae;
        int i = gameEngine.f5845by - orderableUnit.f3770ag;
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, f5, f6);
        if (i > 300 || this.f3705b > 1.0f) {
            this.f3708d += f;
        }
        boolean z = false;
        if (this.f3708d > 300.0f) {
            z = true;
        }
        if (i > 300 && distanceSq > 250000.0f) {
            z = true;
        }
        if (this.f3705b > 1.0f) {
            if (this.f3707c != 0.0f) {
                z = true;
            }
            if (this.f3708d > 10.0f) {
                z = true;
            }
        }
        if (z) {
            this.f3707c = 90.0f;
        }
        if (this.f3707c == 0.0f) {
            m2590aG();
            c0590x.f3812e = f5;
            c0590x.f3813f = f6;
            PathNode pathNode4 = null;
            if (i < 3000 && 0 == 0 && orderableUnit.f3777u > 2 && orderableUnit.f3777u - orderableUnit.activePathCount <= 2) {
                pathNode4 = orderableUnit.m2450o(2);
            }
            if (i < 1500 && pathNode4 == null && orderableUnit.f3777u > 0 && orderableUnit.activePathCount + 0 >= orderableUnit.f3777u) {
                PathNode m2450o = orderableUnit.m2450o(0);
                pathNode4 = f3741aP;
                float m1659d = CommonUtils.m1659d(orderableUnit.x, orderableUnit.y, m2450o.f3818a, m2450o.f3819b);
                float f7 = 80.0f;
                if (i > 300) {
                    f7 = 80.0f - ((i - 300) * 0.06666667f);
                }
                pathNode4.f3818a = orderableUnit.x + (CommonUtils.cos(m1659d) * f7);
                pathNode4.f3819b = orderableUnit.y + (CommonUtils.sin(m1659d) * f7);
            }
            if (pathNode4 != null) {
                c0590x.f3810c = true;
                c0590x.f3812e = pathNode4.f3818a + this.f3767ad;
                c0590x.f3813f = pathNode4.f3819b + this.f3768ae;
            } else if (orderableUnit.f3777u >= 2 && orderableUnit.activePathCount >= 1) {
                if (orderableUnit.activePathCount >= 2) {
                    pathNode3 = orderableUnit.m2450o(0);
                    pathNode2 = orderableUnit.m2450o(1);
                } else {
                    pathNode3 = orderableUnit.m2450o(0);
                    pathNode2 = orderableUnit.m2450o(0);
                }
                if (pathNode3 != null && pathNode2 != null) {
                    float m1669c = 1.0f - ((CommonUtils.m1669c(orderableUnit.x, orderableUnit.y, pathNode3.f3818a, pathNode3.f3819b) - 15.0f) * 0.05f);
                    if (m1669c > 2.0f) {
                        m1669c = 2.0f;
                    }
                    if (m1669c < 0.0f) {
                        m1669c = 0.0f;
                    }
                    if (m1669c > 1.0f) {
                        if (orderableUnit.activePathCount >= 3) {
                            PathNode m2450o2 = orderableUnit.m2450o(2);
                            float f8 = pathNode2.f3818a - pathNode3.f3818a;
                            float f9 = pathNode2.f3819b - pathNode3.f3819b;
                            f4 = f8 + ((m2450o2.f3818a - pathNode2.f3818a) * (m1669c - 1.0f));
                            f3 = f9 + ((m2450o2.f3819b - pathNode2.f3819b) * (m1669c - 1.0f));
                        } else {
                            f4 = pathNode2.f3818a - pathNode3.f3818a;
                            f3 = pathNode2.f3819b - pathNode3.f3819b;
                        }
                    } else {
                        f4 = (pathNode2.f3818a - pathNode3.f3818a) * m1669c;
                        f3 = (pathNode2.f3819b - pathNode3.f3819b) * m1669c;
                    }
                    c0590x.f3812e = pathNode3.f3818a + this.f3767ad + f4;
                    c0590x.f3813f = pathNode3.f3819b + this.f3768ae + f3;
                }
            }
            float f10 = 45.0f;
            if (this.f3705b <= 1.0f) {
                f10 = 60.0f;
            } else if (i < 500 && this.f3705b <= 1.0f) {
                f10 = 110.0f;
            }
            if (distanceSq < f10 * f10) {
                this.f3708d = 0.0f;
            }
            boolean z2 = false;
            Waypoint activeWaypoint = orderableUnit.getActiveWaypoint();
            if (activeWaypoint == null || waypoint != null) {
            }
            if (activeWaypoint == null || 0 != 0) {
                this.f3709e += f;
                boolean z3 = false;
                if (waypoint != null && (waypoint.type == WaypointType.f1751a || waypoint.type == WaypointType.f1758h || waypoint.type == WaypointType.f1760j)) {
                    z3 = true;
                }
                if (z3 && this.f3709e > 600.0f) {
                    f2 = 260.0f;
                } else if (z3 && this.f3709e > 360.0f) {
                    f2 = 140.0f;
                } else if (z3 && this.f3709e > 180.0f) {
                    f2 = 70.0f;
                } else if (z3 && this.f3709e > 120.0f) {
                    f2 = 50.0f;
                } else {
                    f2 = 16.0f;
                }
                if (distanceSq < f2 * f2) {
                    z2 = true;
                }
                if (0 != 0) {
                    z2 = true;
                }
            }
            if (z2) {
                boolean z4 = false;
                if (activeWaypoint == null) {
                    z4 = true;
                }
                if (0 != 0) {
                    z4 = true;
                }
                if (z4 && CommonUtils.absf(m2496c(f, this.f3769af)) < 3.0f && waypoint != null) {
                    if (waypoint.type == WaypointType.f1751a || waypoint.type == WaypointType.f1758h) {
                        m2546ax();
                        if (orderableUnit != null) {
                            boolean z5 = false;
                            Waypoint activeWaypoint2 = getActiveWaypoint();
                            Waypoint activeWaypoint3 = orderableUnit.getActiveWaypoint();
                            if (activeWaypoint2 != null && activeWaypoint3 != null && activeWaypoint2.m3685b(activeWaypoint3)) {
                                z5 = true;
                            }
                            if (!z5) {
                                m2610a((OrderableUnit) null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (0 == 0) {
                c0590x.f3809b = true;
                return;
            } else {
                return;
            }
        }
        PathNode pathNode5 = null;
        if (0 == 0 && orderableUnit.f3777u > 2 && 8 < orderableUnit.activePathCount) {
            pathNode5 = orderableUnit.m2450o(8);
        }
        if (pathNode5 == null) {
            pathNode5 = f3741aP;
            pathNode5.f3818a = orderableUnit.x;
            pathNode5.f3819b = orderableUnit.y;
        }
        float distanceSq2 = CommonUtils.distanceSq(this.x, this.y, pathNode5.f3818a, pathNode5.f3819b);
        float f11 = this.radius + orderableUnit.radius + 15.0f;
        float f12 = this.radius + orderableUnit.radius + 100.0f;
        if (distanceSq2 < f11 * f11) {
            this.f3708d = 0.0f;
            this.f3707c = 0.0f;
        } else if (distanceSq2 < f12 * f12) {
        }
        if (this.f3783aN == null && pathNode != null && ((CommonUtils.absf(this.f3714n - pathNode5.f3818a) > 300.0f || CommonUtils.absf(this.f3715o - pathNode5.f3819b) > 300.0f) && this.f3718r > 30.0f)) {
            this.f3718r = 30.0f;
        }
        if (this.f3718r == 0.0f && this.f3783aN == null) {
            this.f3718r = 700.0f;
            m2639a(pathNode5.f3818a, pathNode5.f3819b, 0, false, false);
        }
        if (pathNode != null) {
            c0590x.f3812e = pathNode.f3818a;
            c0590x.f3813f = pathNode.f3819b;
            if (0 == 0) {
                c0590x.f3809b = true;
            }
        }
    }

    /* renamed from: a */
    private void m2601a(GameEngine gameEngine, float f, Waypoint waypoint, C0590x c0590x) {
        Waypoint activeWaypoint;
        boolean mo2657I = mo2657I();
        if (this.f3783aN != null) {
            m2530b(gameEngine);
        }
        if (this.f3686W != null && (this.f3686W.dead || !this.f3686W.isActive())) {
            m2610a((OrderableUnit) null);
        }
        if (this.f3712j) {
            PathNode activePathNode = getActivePathNode();
            Waypoint activeWaypoint2 = getActiveWaypoint();
            if (activeWaypoint2 == null) {
                c0590x.f3811d = false;
            }
            if (f3724E) {
                c0590x.f3811d = false;
            }
            if (this.f3687X && this.f3689Z > 0 && m2591aF()) {
                this.f3770ag = gameEngine.f5845by;
            }
            if (activeWaypoint2 != null && this.f3686W != null && c0590x.f3811d && (activeWaypoint = this.f3686W.getActiveWaypoint()) != null && !activeWaypoint.m3685b(activeWaypoint2)) {
                c0590x.f3811d = false;
            }
            if (this.f3686W != null && c0590x.f3811d) {
                m2631a(f, activePathNode, c0590x, waypoint);
            } else if (this.f1541cc != 0.0f) {
                c0590x.f3812e = this.f3764k;
                c0590x.f3813f = this.f3765l;
                c0590x.f3809b = true;
            } else {
                boolean z = false;
                if (this.f3783aN == null) {
                    if (activePathNode == null) {
                        if (this.f3720t && this.f3718r < 450.0f && this.f3783aN == null) {
                            z = true;
                        }
                        if (this.f3718r == 0.0f) {
                            z = true;
                        }
                    }
                    if (this.f3718r == 0.0f && (mo3177cq() || mo2576aU())) {
                        float maxAttackRange = getMaxAttackRange() - 1.0f;
                        if (CommonUtils.absf(this.f3714n - this.f3764k) > maxAttackRange || CommonUtils.absf(this.f3715o - this.f3765l) > maxAttackRange) {
                            z = true;
                        }
                    }
                    if (waypoint != null && this.f3718r == 0.0f && ((waypoint.type == WaypointType.f1755e || waypoint.type == WaypointType.f1759i) && (CommonUtils.absf(this.f3714n - this.f3764k) > 12.0f || CommonUtils.absf(this.f3715o - this.f3765l) > 12.0f))) {
                        z = true;
                    }
                    if (waypoint != null) {
                        float f2 = this.f3717q;
                        if (CommonUtils.absf(this.f3714n - this.f3764k) > f2 || CommonUtils.absf(this.f3715o - this.f3765l) > f2) {
                            if (this.f3718r > 30.0f) {
                                this.f3718r = 30.0f;
                            }
                            if (this.f3718r == 0.0f) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    this.f3718r = 500.0f;
                    m2639a(this.f3764k, this.f3765l, this.f3713m, this.f3687X && this.f3695aa > 1, this.f3719s);
                }
                if (activePathNode != null && this.f3698an == null && this.activePathCount >= 2 && getMoveSpeed() > 5.0f) {
                    PathNode pathNode = this.activePath[1];
                    float distanceSq = CommonUtils.distanceSq(this.x, this.y, activePathNode.f3818a, activePathNode.f3819b);
                    float distanceSq2 = CommonUtils.distanceSq(this.x, this.y, pathNode.f3818a, pathNode.f3819b);
                    if (distanceSq < 36.0f) {
                        m2588aI();
                        activePathNode = getActivePathNode();
                    } else if (distanceSq2 < 361.0f) {
                        m2588aI();
                        activePathNode = getActivePathNode();
                    }
                }
                if (activePathNode != null) {
                    c0590x.f3812e = activePathNode.f3818a;
                    c0590x.f3813f = activePathNode.f3819b;
                    c0590x.f3809b = true;
                } else if (this.f3711i) {
                    c0590x.f3812e = this.f3764k;
                    c0590x.f3813f = this.f3765l;
                    c0590x.f3809b = true;
                }
            }
        }
        m2632a(f, c0590x, waypoint, mo2657I);
    }

    /* renamed from: a */
    private void m2632a(float f, C0590x c0590x, Waypoint waypoint, boolean z) {
        float f2 = 0.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f3712j && c0590x.f3809b && z) {
            float f3 = c0590x.f3812e;
            float f4 = c0590x.f3813f;
            float moveSpeed = getMoveSpeed();
            float distanceSq = CommonUtils.distanceSq(this.x, this.y, f3, f4);
            float m1659d = CommonUtils.m1659d(this.x, this.y, f3, ((f4 - this.y) * mo2571aZ()) + this.y);
            boolean z2 = false;
            float mo2521bb = mo2521bb();
            if (mo2521bb > 0.95f) {
                z2 = true;
            } else if (mo2521bb > 0.87d) {
                if (this.f3695aa <= 1 && this.activePathCount > 0 && this.activePathCount <= 9 && this.f3687X && distanceSq < 250000.0f) {
                    z2 = true;
                }
            } else if (mo2521bb > 0.7d) {
                if (this.f3695aa <= 1 && this.activePathCount > 0 && this.activePathCount <= 4 && this.f3687X && distanceSq < 40000.0f) {
                    z2 = true;
                }
            } else if (mo2521bb > 0.4d && this.f3695aa <= 1 && this.activePathCount > 0 && this.activePathCount <= 2 && this.f3687X && distanceSq < 10000.0f) {
                z2 = true;
            }
            float f5 = 179.0f;
            if (this.f3674K != null && isFixedFiring() && mo2514bi() && !mo2576aU()) {
                this.f1523bY = m1659d;
            } else if (this.f3700as <= 0.0f) {
                f5 = m2637a(f, m1659d, true, z2);
            }
            float f6 = 20.0f;
            if (distanceSq > 361.0f) {
                f6 = 46.0f;
            }
            if (distanceSq > 3600.0f) {
                f6 = 89.0f;
            }
            float turnSpeed = getTurnSpeed();
            if (turnSpeed < 1.4d) {
                if (distanceSq > 6400.0f) {
                    f6 *= 0.5f;
                } else {
                    f6 = 17.0f;
                }
            }
            if (moveSpeed > 5.0f && this.speed < 0.01d && this.speed > -0.01d) {
                f6 = 1.0f;
            }
            if (turnSpeed < 1.1d) {
                f6 *= 0.7f;
            }
            if (this.speed > 0.4d && distanceSq > 16900.0f) {
                f6 = 180.0f;
            }
            if (m2573aX() && this.f3777u == this.activePathCount) {
                f6 = 1.0f;
            }
            if (mo2514bi()) {
                f6 = 181.0f;
            }
            boolean z3 = this.activePathCount == 1;
            if ((!z3 || distanceSq >= 4.0f * 4.0f) && CommonUtils.absf(f5) <= f6) {
                f2 = 1.0f;
                if (c0590x.f3810c) {
                    if (distanceSq < 2500.0f) {
                        f2 = 1.0f - 0.15f;
                    }
                    if (distanceSq < 900.0f) {
                        f2 -= 0.15f;
                    }
                    if (distanceSq < 225.0f) {
                        f2 -= 0.3f;
                    }
                } else if (this.f3686W != null) {
                    if (distanceSq > 400.0f) {
                        f2 = 1.0f + 0.2f;
                    }
                    if (distanceSq < 49.0f) {
                        f2 -= 0.15f;
                    }
                    if (distanceSq < 9.0f) {
                        f2 -= 0.15f;
                    }
                }
                if (distanceSq < 9.0f) {
                    f2 = 0.0f;
                }
            }
            if (z3 && f2 != 0.0f) {
                if (distanceSq < 324.0f && getMoveDecelerationSpeed() < 0.13f && getMoveSpeed() > 1.0f) {
                    f2 = 0.5f * f2;
                }
                if (distanceSq < 169.0f && getMoveDecelerationSpeed() < 0.15f && getMoveSpeed() > 0.9f) {
                    f2 = 0.5f * f2;
                }
                if (moveSpeed > 5.0f) {
                    if (distanceSq < 324.0f && f2 > 0.5f) {
                        f2 = 0.5f;
                    }
                    if (distanceSq < 81.0f && f2 > 0.25f) {
                        f2 = 0.25f;
                    }
                }
            }
            boolean z4 = false;
            if (!z3 && distanceSq < 256.0f) {
                z4 = true;
            }
            if (z3 && distanceSq < 4.0f * 4.0f) {
                z4 = true;
            }
            if ((this.f3683T == gameEngine.frameNumber || this.f3683T == gameEngine.frameNumber - 1) && this.f3682S != null && this.f3682S.m3758c(f3, f4, 2.0f)) {
                z4 = true;
            }
            if (f2 > 0.0f) {
                this.f3679P += f;
                if (this.f3679P > 200.0f && distanceSq < 3600.0f && this.activePathCount >= 2) {
                    float f7 = this.f3679P;
                    m2588aI();
                    this.f3679P = f7;
                }
                if (this.f3679P > 600.0f && this.activePathCount >= 2 && this.f3698an == null) {
                    m2590aG();
                }
                if (this.f3679P > 80.0f && this.f3705b > 30.0f) {
                    m2590aG();
                }
                if (this.f3679P > 40.0f && this.activePathCount >= 2 && this.f3698an == null) {
                    PathNode pathNode = this.activePath[1];
                    if (CommonUtils.distanceSq(this.x, this.y, pathNode.f3818a, pathNode.f3819b) < distanceSq) {
                        float f8 = this.f3679P;
                        m2588aI();
                        this.f3679P = f8;
                    }
                }
            }
            if (z4) {
                m2588aI();
                if (z3) {
                    this.f3708d = 0.0f;
                    this.f3707c = 0.0f;
                    if (!this.f3720t && this.f3686W == null && waypoint != null && waypoint.type == WaypointType.f1751a) {
                        m2547aw();
                    }
                }
            }
        }
        if (this.f1524bZ && !mo2514bi()) {
            f2 = (-f2) * mo2521bb();
        }
        if (this.f3700as > 0.0f) {
            f2 = 0.0f;
        }
        if (!mo2515bh()) {
            if (this.speed < f2) {
                this.speed = CommonUtils.m1744a(this.speed, f2, getMoveAccelerationSpeed() * f);
            }
            if (this.speed > f2) {
                this.speed = CommonUtils.m1744a(this.speed, f2, getMoveDecelerationSpeed() * f);
            }
        } else {
            this.speed = f2;
        }
        this.moving = c0590x.f3809b && z;
    }

    @Deprecated
    /* renamed from: Y */
    public boolean m2643Y() {
        return this.f3674K != null;
    }

    /* renamed from: Z */
    public boolean m2642Z() {
        if (this.f3674K != null && !this.f3674K.dead) {
            int mo2512bk = mo2512bk();
            for (int i = 0; i < mo2512bk; i++) {
                if (this.f1532cC[i].f1661j != null && mo2443r(i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: aa */
    public Unit m2569aa() {
        if (this.f3674K != null && !this.f3674K.dead) {
            return this.f3674K;
        }
        Waypoint activeWaypoint = getActiveWaypoint();
        if (activeWaypoint != null && activeWaypoint.targetUnit != null && !activeWaypoint.targetUnit.dead) {
            return activeWaypoint.targetUnit;
        }
        return null;
    }

    /* renamed from: a */
    private void m2602a(GameEngine gameEngine, float f, float f2) {
        f3736aJ.m2427a(f2);
        gameEngine.UnitGeoIndex.m2786a(this.x, this.y, f2, this, f, f3736aJ);
        if (f3736aJ.f3814a != 0) {
            if (this.f3674K == null || !m2472h(this.f3674K)) {
                f3737aK.m2427a(f2);
                gameEngine.UnitGeoIndex.m2786a(this.x, this.y, f2, this, f, f3737aK);
            }
        }
    }

    /* renamed from: ab */
    public boolean mo2568ab() {
        return mo2512bk() > 1;
    }

    /* renamed from: a */
    private void m2603a(GameEngine gameEngine, float f) {
        int mo2512bk = mo2512bk();
        if (!mo2568ab()) {
            for (int i = 0; i < mo2512bk; i++) {
                this.f1532cC[i].f1661j = this.f3674K;
            }
            return;
        }
        boolean z = false;
        for (int i2 = 0; i2 < mo2512bk; i2++) {
            C0235aj c0235aj = this.f1532cC[i2];
            if (mo2437v(i2) == -1) {
                if (mo2625a(i2, this.f3674K, false, false)) {
                    c0235aj.f1661j = this.f3674K;
                } else {
                    z = true;
                    if (c0235aj.f1661j == this.f3674K) {
                        c0235aj.f1661j = null;
                    }
                }
            }
        }
        if (z) {
            float m2528b = m2528b(false);
            f3739aM.m3803a(this);
            gameEngine.UnitGeoIndex.m2786a(this.x, this.y, m2528b, this, f, f3739aM);
        }
        for (int i3 = 0; i3 < mo2512bk; i3++) {
            int mo2437v = mo2437v(i3);
            if (mo2437v != -1) {
                this.f1532cC[i3].f1661j = this.f1532cC[mo2437v].f1661j;
            }
        }
    }

    /* renamed from: ac */
    public boolean m2567ac() {
        if (!canAttack()) {
            return false;
        }
        C0383i dj = m3735dj();
        if (dj != null && !dj.f2329M) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m2529b(GameEngine gameEngine, float f) {
        int mo2512bk = mo2512bk();
        boolean z = false;
        if (m2567ac()) {
            boolean z2 = false;
            boolean z3 = false;
            if (this.f3674K != null) {
                C0383i dj = m3735dj();
                if (dj != null && this.f1630cF != null && dj.f2293L && this.f1630cF.f3674K == this.f3674K) {
                    z2 = true;
                }
                if (!m2616a(this.f3674K, false) && !z2 && 1 != 0) {
                    this.f3674K = null;
                }
            }
            if (this.f3674K != null && !z2) {
                z3 = !m2472h(this.f3674K);
            }
            this.f3675L = CommonUtils.toZero(this.f3675L, f);
            this.f3676M = CommonUtils.toZero(this.f3676M, f);
            if ((this.f3674K == null || z3) && this.f3675L == 0.0f && mo2518be()) {
                this.f3675L = 20.0f + (this.x % 5.0f) + (this.y % 5.0f);
                m2602a(gameEngine, f, m2528b(false));
                if (this.f3674K != null) {
                    this.f3676M = 0.0f;
                }
            }
            if (this.f3674K != null && this.f3676M == 0.0f) {
                this.f3676M = 20.0f + (this.x % 5.0f) + (this.y % 5.0f);
                m2603a(gameEngine, f);
            }
            for (int i = 0; i < mo2512bk; i++) {
                this.f1532cC[i].f1658g = false;
            }
            if (this.f3674K != null) {
                float distanceSq = CommonUtils.distanceSq(this.x, this.y, this.f3674K.x, this.f3674K.y);
                float m2449o = m2449o(this.f3674K);
                if (distanceSq < m2449o * m2449o || z2) {
                    int mo2578aS = mo2578aS();
                    for (int i2 = 0; i2 < mo2512bk; i2++) {
                        C0235aj c0235aj = this.f1532cC[i2];
                        Unit unit = c0235aj.f1661j;
                        if (unit != null) {
                            boolean z4 = unit == this.f3674K;
                            if (!z4 && !m2534b(unit, true)) {
                                c0235aj.f1661j = null;
                            } else if (!mo2625a(i2, unit, false, !z4)) {
                                c0235aj.f1661j = null;
                            } else {
                                PointF mo2662F = mo2662F(i2);
                                PointF mo2655J = mo2655J(i2);
                                mo2655J.x += unit.x;
                                mo2655J.y += unit.y;
                                float m1659d = CommonUtils.m1659d(mo2662F.x, mo2662F.y, mo2655J.x, mo2655J.y);
                                if (mo2437v(i2) == -1 && i2 != mo2578aS) {
                                    if (!isFixedFiring()) {
                                        c0235aj.m3722a(70);
                                        c0235aj.f1653b = c0235aj.f1652a;
                                        float f2 = 179.0f;
                                        if (!c0235aj.m3721b()) {
                                            f2 = m2640a(f, m1659d, i2);
                                        }
                                        if (CommonUtils.absf(f2) < mo2434x(i2)) {
                                            c0235aj.f1658g = true;
                                        }
                                    } else {
                                        boolean z5 = false;
                                        Waypoint activeWaypoint = getActiveWaypoint();
                                        if (activeWaypoint != null && (activeWaypoint.type == WaypointType.f1753c || activeWaypoint.type == WaypointType.f1754d || activeWaypoint.type == WaypointType.f1757g)) {
                                            z5 = true;
                                        }
                                        if (!z5 && (!this.f3712j || mo2514bi())) {
                                            float m2496c = m2496c(f, m1659d);
                                            c0235aj.f1653b = c0235aj.f1652a;
                                            if (CommonUtils.absf(m2496c) < mo2434x(i2)) {
                                                c0235aj.f1658g = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (int i3 = 0; i3 < mo2512bk; i3++) {
                        C0235aj c0235aj2 = this.f1532cC[i3];
                        Unit unit2 = c0235aj2.f1661j;
                        if (unit2 != null) {
                            if (mo2438u(i3) && c0235aj2.f1656e == 0.0f) {
                                z = true;
                            }
                            if (mo2438u(i3)) {
                                m2636a(f, unit2, i3);
                            }
                        }
                    }
                } else if (!this.f3712j && mo2557am()) {
                    this.f3711i = true;
                    this.f3712j = true;
                    this.f3764k = this.f3674K.x;
                    this.f3765l = this.f3674K.y;
                    this.f3713m = 0;
                }
            }
        }
        if (this.f3693aG && m2645W() != null) {
            z = true;
        }
        for (int i4 = 0; i4 < mo2512bk; i4++) {
            C0235aj c0235aj3 = this.f1532cC[i4];
            if (!z && c0235aj3.f1657f != 0.0f) {
                c0235aj3.f1657f = CommonUtils.toZero(c0235aj3.f1657f, mo2481f(i4) * f);
            }
        }
    }

    /* renamed from: b */
    public void mo2535b(Unit unit, int i) {
    }

    /* renamed from: a */
    public boolean m2636a(float f, Unit unit, int i) {
        C0235aj c0235aj = this.f1532cC[i];
        int mo2437v = mo2437v(i);
        if (mo2437v != -1) {
            c0235aj.f1652a = this.f1532cC[mo2437v].f1652a;
        }
        boolean mo2440s = mo2440s(i);
        boolean z = false;
        if (mo2440s) {
            if (c0235aj.f1657f < mo2483e(i)) {
                if (c0235aj.f1657f == 0.0f) {
                    mo2535b(unit, i);
                }
                c0235aj.f1657f += f;
            } else {
                c0235aj.f1657f = mo2483e(i);
            }
            z = true;
        }
        if (c0235aj.f1656e == 0.0f && mo2443r(i)) {
            if (!mo2625a(i, unit, false, false)) {
                c0235aj.f1656e = -10.0f;
                return false;
            }
            if (!mo2440s) {
                if (c0235aj.f1657f < mo2483e(i)) {
                    if (c0235aj.f1657f == 0.0f) {
                        mo2535b(unit, i);
                    }
                    c0235aj.f1657f += f;
                } else {
                    z = true;
                }
            }
            if (z) {
                c0235aj.f1656e = getShootDelay(i) + mo2439t(i);
                if (!mo2440s) {
                    c0235aj.f1657f = 0.0f;
                }
                fireProjectile(unit, i);
                mo2653L(i);
                c0235aj.f1664m = !c0235aj.f1664m;
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m2472h(Unit unit) {
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
        float m2449o = m2449o(unit);
        if (distanceSq < m2449o * m2449o) {
            return true;
        }
        return false;
    }

    /* renamed from: ad */
    public boolean mo2566ad() {
        return false;
    }

    /* renamed from: ae */
    public boolean canAttackFly() {
        return true;
    }

    /* renamed from: af */
    public boolean mo2564af() {
        return true;
    }

    /* renamed from: ag */
    public boolean mo2563ag() {
        return true;
    }

    /* renamed from: i */
    public boolean m2468i(Unit unit) {
        int mo2437v;
        int mo2512bk = mo2512bk();
        for (int i = 0; i < mo2512bk; i++) {
            if (mo2443r(i) && mo2625a(i, unit, false, false) && ((mo2437v = mo2437v(i)) == -1 || mo2625a(mo2437v, unit, false, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean m2465j(Unit unit) {
        int mo2437v;
        int mo2512bk = mo2512bk();
        for (int i = 0; i < mo2512bk; i++) {
            if (mo2443r(i) && mo2625a(i, unit, true, false) && ((mo2437v = mo2437v(i)) == -1 || mo2625a(mo2437v, unit, true, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2625a(int i, Unit unit, boolean z, boolean z2) {
        if (!z && z2 && !m2472h(unit)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo2461k(Unit unit) {
        if (unit.mo2676i()) {
            return canAttackFly();
        }
        if (unit.isUnderwater()) {
            return mo2566ad();
        }
        if (!mo2563ag() && !unit.m3752cF()) {
            return false;
        }
        return mo2564af();
    }

    /* renamed from: a */
    public boolean mo2621a(Unit unit) {
        return false;
    }

    /* renamed from: l */
    public boolean mo2458l(Unit unit) {
        if (unit.mo2862g() != 0.0f && mo3232D(unit)) {
            return true;
        }
        return mo2621a(unit);
    }

    /* renamed from: a */
    public Action m2613a(UnitType unitType, boolean z) {
        return m2614a(unitType, -1, z);
    }

    /* renamed from: ah */
    public boolean m2562ah() {
        Iterator it = mo2712M().iterator();
        while (it.hasNext()) {
            if (((Action) it.next()).mo2735g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public Action m2614a(UnitType unitType, int i, boolean z) {
        UnitType mo3616C;
        ArrayList M = mo2712M();
        Action action = null;
        if (M.size() > 0) {
            Iterator it = M.iterator();
            while (it.hasNext()) {
                Action action2 = (Action) it.next();
                UnitType mo3588w = action2.mo3588w();
                if (z && (mo3616C = action2.mo3616C()) != null) {
                    mo3588w = mo3616C;
                }
                if (mo3588w == unitType && (i == -1 || i == action2.mo3816q())) {
                    action = action2;
                    if (action2.isAvailable(this) && action2.isActive((Unit) this, false)) {
                        return action2;
                    }
                }
            }
        }
        return action;
    }

    /* renamed from: b */
    public boolean m2533b(UnitType unitType, boolean z) {
        Action m2613a = m2613a(unitType, z);
        if (m2613a == null || m2613a.mo3603g(this) || !m2613a.isAvailable(this)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ai */
    public boolean mo2561ai() {
        return getUnitType().mo3079m();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: aj */
    public boolean mo2560aj() {
        return getUnitType().mo3081l();
    }

    /* renamed from: m */
    public void mo2454m(Unit unit) {
    }

    /* renamed from: ak */
    public boolean mo2559ak() {
        return false;
    }

    /* renamed from: a */
    public final boolean m2616a(Unit unit, boolean z) {
        if (this.team == unit.team || unit.dead || !this.team.m3925c(unit.team) || this.f3762I == AttackMode.f1395d || this.f3762I == AttackMode.f1394c || unit.transportedBy != null || !mo2461k(unit) || !unit.mo2679d((Unit) this)) {
            return false;
        }
        if (!z) {
            float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
            float m2528b = m2528b(false);
            if (distanceSq < m2528b * m2528b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m2534b(Unit unit, boolean z) {
        if (unit.mo3176cr()) {
            return false;
        }
        return m2616a(unit, z);
    }

    /* renamed from: al */
    public float mo2558al() {
        return 0.0f;
    }

    /* renamed from: am */
    public boolean mo2557am() {
        return this.f3762I == AttackMode.f1392a || this.f3762I == AttackMode.f1396e || this.f3762I == AttackMode.f1397f;
    }

    /* renamed from: b */
    public float m2528b(boolean z) {
        float f;
        float maxAttackRange = getMaxAttackRange();
        Waypoint activeWaypoint = getActiveWaypoint();
        if (activeWaypoint != null && (activeWaypoint.type == WaypointType.f1758h || activeWaypoint.type == WaypointType.f1760j || activeWaypoint.type == WaypointType.f1761k)) {
            if (activeWaypoint.type == WaypointType.f1760j) {
                maxAttackRange += 110.0f;
            } else if (activeWaypoint.type == WaypointType.f1761k) {
                maxAttackRange += 90.0f;
            } else {
                maxAttackRange += 20.0f;
            }
            if (maxAttackRange < 190.0f) {
                maxAttackRange = 190.0f;
            }
        }
        if (this.f3762I == AttackMode.f1392a) {
            f = maxAttackRange + 250.0f;
        } else if (this.f3762I == AttackMode.f1396e) {
            f = maxAttackRange + 150.0f;
        } else if (this.f3762I == AttackMode.f1397f) {
            f = maxAttackRange + 180.0f;
        } else {
            f = maxAttackRange + mo2558al();
            if (z) {
                f += 110.0f;
            }
        }
        return f;
    }

    /* renamed from: an */
    public Waypoint m2556an() {
        m2455m(29);
        if (this.f3760f > 0) {
            m2532b(this.f3761g[0]);
        }
        Waypoint waypoint = this.f3761g[29];
        for (int i = 29; i >= 1; i--) {
            this.f3761g[i] = this.f3761g[i - 1];
        }
        this.f3761g[0] = waypoint;
        if (this.f3760f < 29) {
            this.f3760f++;
        }
        if (this.f3761g[0] == null) {
            this.f3761g[0] = new Waypoint();
        }
        Waypoint waypoint2 = this.f3761g[0];
        waypoint2.clear();
        this.f3678O = 0.0f;
        this.f3681R = 0.0f;
        this.f3679P = 0.0f;
        m2492c(waypoint2);
        m2590aG();
        return waypoint2;
    }

    /* renamed from: a */
    public void mo2612a(Waypoint waypoint) {
    }

    /* renamed from: b */
    public final void m2532b(Waypoint waypoint) {
        this.f3710h = false;
    }

    /* renamed from: c */
    public void m2492c(Waypoint waypoint) {
        mo2525bB();
        if (this.f3674K != null && this.f3674K.mo3176cr()) {
            this.f3674K = null;
        }
    }

    /* renamed from: ao */
    public Waypoint m2555ao() {
        m2455m(this.f3760f);
        if (this.f3761g[this.f3760f] == null) {
            this.f3761g[this.f3760f] = new Waypoint();
        }
        Waypoint waypoint = this.f3761g[this.f3760f];
        waypoint.clear();
        if (this.f3760f < 29) {
            this.f3760f++;
        }
        if (this.f3760f > 0) {
            m2492c(this.f3761g[0]);
        }
        return waypoint;
    }

    /* renamed from: d */
    public Waypoint m2489d(float f, float f2) {
        Waypoint m2555ao = m2555ao();
        m2555ao.m3694a(f, f2);
        return m2555ao;
    }

    /* renamed from: n */
    public Waypoint m2451n(Unit unit) {
        Waypoint m2555ao = m2555ao();
        m2555ao.m3692a(unit);
        return m2555ao;
    }

    /* renamed from: e */
    public Waypoint m2485e(float f, float f2) {
        Waypoint m2555ao = m2555ao();
        m2555ao.m3687b(f, f2);
        return m2555ao;
    }

    /* renamed from: d */
    public Waypoint m2486d(Waypoint waypoint) {
        Waypoint m2555ao = m2555ao();
        m2555ao.m3681c(waypoint);
        return m2555ao;
    }

    /* renamed from: ap */
    public boolean m2554ap() {
        return getActiveWaypoint() == null;
    }

    /* renamed from: aq */
    public Waypoint getActiveWaypoint() {
        if (this.f3760f == 0) {
            return null;
        }
        return this.f3761g[0];
    }

    /* renamed from: ar */
    public Waypoint m2552ar() {
        if (this.f3760f <= 1) {
            return null;
        }
        return this.f3761g[1];
    }

    /* renamed from: as */
    public Waypoint m2551as() {
        if (this.f3760f == 0) {
            return null;
        }
        return this.f3761g[this.f3760f - 1];
    }

    /* renamed from: at */
    public void m2550at() {
        if (this.f3760f == 0) {
            return;
        }
        if (this.f3760f == 1) {
            m2546ax();
        } else {
            this.f3760f--;
        }
    }

    /* renamed from: k */
    public Waypoint m2462k(int i) {
        return this.f3761g[i];
    }

    /* renamed from: au */
    public int m2549au() {
        return this.f3760f;
    }

    /* renamed from: av */
    public boolean m2548av() {
        Waypoint activeWaypoint = getActiveWaypoint();
        if (activeWaypoint != null && activeWaypoint.type == WaypointType.f1752b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2615a(UnitType unitType, float f, float f2) {
        for (int i = 0; i < this.f3760f; i++) {
            Waypoint waypoint = this.f3761g[i];
            if (waypoint.type == WaypointType.f1753c && waypoint.build == unitType && CommonUtils.absf(waypoint.x - f) < 10.0f && CommonUtils.absf(waypoint.y - f2) < 10.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void m2459l(int i) {
        if (i >= 120) {
            throw new RuntimeException("PathNode index:" + i + " too large");
        }
        if (this.activePath == f3726am) {
            this.activePath = new PathNode[120];
        }
    }

    /* renamed from: m */
    public void m2455m(int i) {
        if (i >= 30) {
            throw new RuntimeException("Waypoint index:" + i + " too large");
        }
        if (this.f3761g == f3725H) {
            this.f3761g = new Waypoint[30];
        }
    }

    /* renamed from: n */
    public void m2452n(int i) {
        if (this.f3760f <= i) {
            throw new IndexOutOfBoundsException("completeWaypoint: waypointsCount:" + this.f3760f + ", waypointIndex:" + i);
        }
        if (i == 0) {
            m2546ax();
            return;
        }
        if (this.f3761g.length > 0) {
            Waypoint waypoint = this.f3761g[i];
            for (int i2 = i; i2 < this.f3760f - 1; i2++) {
                this.f3761g[i2] = this.f3761g[i2 + 1];
            }
            this.f3761g[this.f3760f - 1] = waypoint;
        }
        this.f3760f--;
    }

    /* renamed from: aw */
    public void m2547aw() {
        m2595aB();
        m2546ax();
    }

    /* renamed from: ax */
    public void m2546ax() {
        this.f3678O = 0.0f;
        this.f3681R = 0.0f;
        this.f3679P = 0.0f;
        this.f3773ak = false;
        this.f3772aj = -999.0f;
        this.f3774al = false;
        this.f3721v = 0;
        if (this.f3760f == 0) {
            m2590aG();
            this.f3709e = 0.0f;
            this.f3708d = 0.0f;
            this.f3707c = 0.0f;
        } else if (this.f3760f == 1) {
            m2532b(this.f3761g[0]);
            this.f3760f = 0;
            m2590aG();
            this.f3709e = 0.0f;
            this.f3708d = 0.0f;
            this.f3707c = 0.0f;
            m2492c((Waypoint) null);
        } else {
            if (this.f3761g.length > 0) {
                Waypoint waypoint = this.f3761g[0];
                m2532b(waypoint);
                for (int i = 0; i < this.f3760f - 1; i++) {
                    this.f3761g[i] = this.f3761g[i + 1];
                }
                this.f3761g[this.f3760f - 1] = waypoint;
            }
            this.f3760f--;
            if (this.f3760f > 0) {
                m2492c(this.f3761g[0]);
            } else {
                m2492c((Waypoint) null);
            }
            m2590aG();
        }
    }

    /* renamed from: ay */
    public void m2545ay() {
        int i = this.f3760f;
        if (this.f3760f > 0) {
            m2532b(this.f3761g[0]);
        }
        this.f3678O = 0.0f;
        this.f3681R = 0.0f;
        this.f3773ak = false;
        this.f3772aj = -999.0f;
        this.f3774al = false;
        this.f3760f = 0;
        m2590aG();
        m2594aC();
        m2610a((OrderableUnit) null);
        this.f3709e = 0.0f;
        this.f3708d = 0.0f;
        this.f3707c = 0.0f;
        this.f3721v = 0;
        if (i > 0) {
            m2492c((Waypoint) null);
        }
    }

    /* renamed from: az */
    public void m2544az() {
        for (int i = 0; i < this.f3760f; i++) {
            Waypoint waypoint = this.f3761g[i];
            if (waypoint != null && waypoint.type != WaypointType.f1753c && waypoint.type != WaypointType.f1754d) {
                m2452n(i);
            }
        }
    }

    /* renamed from: a */
    public void m2610a(OrderableUnit orderableUnit) {
        if (this.f3686W != null) {
            this.f3686W.f3689Z--;
        }
        this.f3686W = orderableUnit;
        if (orderableUnit != null) {
            this.f3686W.f3689Z++;
        }
    }

    /* renamed from: aA */
    public void m2596aA() {
        m2610a((OrderableUnit) null);
        this.f3687X = false;
        this.f3766ac = false;
        this.f3767ad = 0.0f;
        this.f3768ae = 0.0f;
        this.f3685V = 0;
        this.f3707c = 0.0f;
    }

    /* renamed from: aB */
    public void m2595aB() {
        if (this.f3689Z == 0) {
            return;
        }
        Waypoint m2552ar = m2552ar();
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.f3686W == this) {
                    boolean z = CommonUtils.distanceSq(this.x, this.y, orderableUnit.x, orderableUnit.y) < 108900.0f;
                    boolean z2 = false;
                    boolean z3 = false;
                    Waypoint m2552ar2 = orderableUnit.m2552ar();
                    if (m2552ar != null && m2552ar2 != null) {
                        if (m2552ar.m3685b(m2552ar2)) {
                            z2 = true;
                        }
                    } else if (m2552ar == null && m2552ar2 == null) {
                        z3 = true;
                    }
                    if (z2 && z) {
                        orderableUnit.m2546ax();
                    } else if (!z3) {
                        orderableUnit.m2610a((OrderableUnit) null);
                    }
                }
            }
        }
    }

    /* renamed from: aC */
    public void m2594aC() {
        Waypoint activeWaypoint;
        GroupController.UnitGroup r0;
        OrderableUnit orderableUnit = null;
        if (this.f3689Z == 0) {
            return;
        }
        Unit[] waypoint = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = waypoint[i];
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit2 = (OrderableUnit) unit;
                if (orderableUnit2.f3686W == this) {
                    orderableUnit2.m2610a((OrderableUnit) null);
                    orderableUnit = orderableUnit2;
                }
            }
        }
        if (this.f3689Z != 0) {
            this.f3689Z = 0;
        }
        if (orderableUnit != null && (activeWaypoint = orderableUnit.getActiveWaypoint()) != null && (r0 = activeWaypoint.group) != null) {
            r0.updateGroupLeaders();
        }
    }

    /* renamed from: aD */
    public PathNode getActivePathNode() {
        if (this.activePathCount == 0) {
            return null;
        }
        if (this.f3698an != null) {
            return this.f3698an.mo1143a(this);
        }
        return this.activePath[0];
    }

    /* renamed from: aE */
    public PathNode m2592aE() {
        if (this.activePathCount < 2) {
            return null;
        }
        if (this.f3698an != null) {
            return this.f3698an.mo1142b(this);
        }
        return this.activePath[1];
    }

    /* renamed from: a */
    public void m2627a(int i, float f, float f2) {
        m2459l(i);
        if (this.activePath[i] == null) {
            this.activePath[i] = new PathNode();
        }
        this.activePath[i].f3818a = f;
        this.activePath[i].f3819b = f2;
    }

    /* renamed from: aF */
    public boolean m2591aF() {
        if (this.f3698an == null && this.activePathCount >= 2) {
            if (getMoveSpeed() > 0.5d) {
                if (this.f3679P > 150.0f || this.f3680Q > 150.0f) {
                    return true;
                }
                return false;
            } else if (this.f3679P > 300.0f || this.f3680Q > 300.0f) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: aG */
    public void m2590aG() {
        this.activePathCount = 0;
        this.f3720t = false;
        this.f3777u = 0;
        this.f3718r = 0.0f;
        this.f3679P = 0.0f;
        this.f3680Q = 0.0f;
        this.f3716p = (byte) 0;
    }

    /* renamed from: aH */
    public void m2589aH() {
        m2590aG();
        this.activePath = f3726am;
        this.f3781aB = (byte) 0;
        this.f3691aC = null;
        this.f3692aD = null;
    }

    /* renamed from: aI */
    public void m2588aI() {
        this.f3680Q = this.f3679P;
        this.f3679P = 0.0f;
        if (this.f3698an != null) {
            this.f3698an.mo1141c(this);
        } else if (this.activePathCount != 0) {
            if (this.activePathCount == 1) {
                this.activePathCount = 0;
                return;
            }
            PathNode pathNode = this.activePath[0];
            for (int i = 0; i < this.activePathCount - 1; i++) {
                this.activePath[i] = this.activePath[i + 1];
            }
            this.activePath[this.activePathCount - 1] = pathNode;
            this.activePathCount--;
        }
    }

    /* renamed from: aJ */
    public boolean m2587aJ() {
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        if (mo3177cq()) {
            z = true;
        }
        gameEngine.map.m4168a(this.x, this.y);
        int i = gameEngine.map.returnX;
        int i2 = gameEngine.map.returnY;
        if (gameEngine.PathEngine.m1103a(getMovementType(), i, i2) && !gameEngine.PathEngine.m1090b(getMovementType(), i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void m2639a(float f, float f2, int i, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getInstance();
        PathEngine pathEngine = gameEngine.PathEngine;
        Map map = gameEngine.map;
        this.moving = true;
        boolean z3 = false;
        boolean z4 = false;
        if (mo3177cq()) {
            z3 = true;
        }
        map.m4168a(this.x, this.y);
        int i2 = map.returnX;
        int i3 = map.returnY;
        if (pathEngine.m1103a(getMovementType(), i2, i3) && !pathEngine.m1090b(getMovementType(), i2, i3)) {
            z3 = true;
            z4 = true;
        }
        if (f != this.f3714n || this.f3715o != f2) {
            this.f3716p = (byte) 0;
        }
        this.f3714n = f;
        this.f3715o = f2;
        if (z3) {
            this.f3720t = false;
            this.activePathCount = 0;
            this.f3698an = null;
            float m4169a = map.m4169a(f);
            float m4135b = map.m4135b(f2);
            if (z4) {
                float m1659d = CommonUtils.m1659d(this.x, this.y, m4169a, m4135b);
                float m1691b = CommonUtils.m1691b(this.x, this.y, m4169a, m4135b);
                if (m1691b > 60.0f) {
                    m1691b = 60.0f;
                    this.f3720t = true;
                    if (this.f3718r > 10.0f) {
                        this.f3718r = 10.0f;
                    }
                }
                m4169a = this.x + (CommonUtils.cos(m1659d) * m1691b);
                m4135b = this.y + (CommonUtils.sin(m1659d) * m1691b);
            }
            m2627a(this.activePathCount, m4169a, m4135b);
            this.activePathCount++;
            this.f3777u = this.activePathCount;
            return;
        }
        int i4 = 0;
        if (z) {
            i4 = 3;
        }
        if (C0236ak.m3719a(getMovementType(), this.x, this.y, f, f2, 80, i4, 1)) {
            this.f3720t = false;
            this.activePathCount = 0;
            this.f3698an = null;
            float m4169a2 = map.m4169a(f);
            float m4135b2 = map.m4135b(f2);
            float f3 = this.x;
            float f4 = this.y;
            float m1659d2 = CommonUtils.m1659d(this.x, this.y, m4169a2, m4135b2);
            float m1691b2 = CommonUtils.m1691b(this.x, this.y, m4169a2, m4135b2);
            float cos = CommonUtils.cos(m1659d2);
            float sin = CommonUtils.sin(m1659d2);
            int i5 = (int) ((m1691b2 * 0.05f) - 1.0f);
            int i6 = 1;
            if (i5 < 4) {
                i6 = 0;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= i5) {
                    break;
                }
                f3 += cos * 20.0f;
                f4 += sin * 20.0f;
                if (i6 > 0) {
                    i6--;
                } else {
                    m2627a(this.activePathCount, f3, f4);
                    this.activePathCount++;
                    if (this.activePathCount >= 119) {
                        this.f3720t = true;
                        break;
                    }
                }
                i7++;
            }
            if (!this.f3720t) {
                if (this.activePathCount < 119) {
                    m2627a(this.activePathCount, m4169a2, m4135b2);
                    this.activePathCount++;
                } else {
                    this.f3720t = true;
                }
            }
            this.f3777u = this.activePathCount;
            return;
        }
        GroupController.UnitGroup r26 = null;
        Waypoint activeWaypoint = getActiveWaypoint();
        if (activeWaypoint != null) {
            r26 = activeWaypoint.group;
            if (r26 == null) {
            }
        }
        if (r26 != null && r26.f3896g != null) {
            C0669d c0669d = null;
            Iterator it = r26.f3896g.iterator();
            while (it.hasNext()) {
                C0669d c0669d2 = (C0669d) it.next();
                if (c0669d2.f4403a != null && c0669d2.f4403a.mo1122a() != null && CommonUtils.absf(c0669d2.f4407e - f) <= 10.0f && CommonUtils.absf(c0669d2.f4408f - f2) <= 10.0f && c0669d2.f4409g + SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT >= gameEngine.frameNumber && c0669d2.f4410h == getMovementType() && CommonUtils.distanceSq(this.x, this.y, c0669d2.f4405c, c0669d2.f4406d) < 3600.0f) {
                    c0669d = c0669d2;
                }
            }
            if (c0669d != null) {
                this.f3783aN = c0669d.f4403a;
                return;
            }
        }
        if (f3724E && i > 2) {
            i = 2;
        }
        this.f3783aN = m2638a(f, f2, i, z, true, z2);
    }

    /* renamed from: a */
    public C0824k m2638a(float f, float f2, int i, boolean z, boolean z2, boolean z3) {
        GameEngine gameEngine = GameEngine.getInstance();
        PathEngine pathEngine = gameEngine.PathEngine;
        Map map = gameEngine.map;
        C0824k m1094a = pathEngine.m1094a(z2);
        map.m4168a(this.x, this.y);
        boolean z4 = false;
        if (m2522ba() || this.f1524bZ) {
            z4 = true;
        }
        m1094a.m1120a(getMovementType(), (short) map.returnX, (short) map.returnY, Float.valueOf(this.direction), z4);
        map.m4168a(f, f2);
        m1094a.m1115a((short) map.returnX, (short) map.returnY, (short) i);
        m1094a.f5533p = z;
        m1094a.f5534q = mo2516bg();
        m1094a.f5535r = z3;
        boolean z5 = this.moving;
        this.moving = true;
        if (z2 && m1094a.mo1114b()) {
            Iterator it = f3740aO.iterator();
            while (it.hasNext()) {
                C0824k c0824k = (C0824k) it.next();
                if (c0824k.f5524g + 60 < gameEngine.frameNumber) {
                    it.remove();
                } else if (c0824k.mo1117a(m1094a)) {
                    return c0824k;
                }
            }
        }
        pathEngine.m1097a(m1094a, z2);
        this.moving = z5;
        if (z2 && m1094a.mo1114b()) {
            f3740aO.add(m1094a);
        }
        return m1094a;
    }

    /* renamed from: b */
    void m2530b(GameEngine gameEngine) {
        if (this.f3783aN != null) {
            Map map = gameEngine.map;
            LinkedList mo1122a = this.f3783aN.mo1122a();
            if (mo1122a != null) {
                this.f3698an = this.f3783aN.mo1121a(this);
                C0824k c0824k = this.f3783aN;
                this.activePathCount = 0;
                this.f3720t = false;
                Iterator it = mo1122a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0829p c0829p = (C0829p) it.next();
                    map.fromGrid((int) c0829p.f5619a, (int) c0829p.f5620b);
                    m2627a(this.activePathCount, map.returnX + map.f792p, map.returnY + map.f793q);
                    this.activePathCount++;
                    if (this.activePathCount >= 120) {
                        this.f3720t = true;
                        break;
                    }
                }
                if (this.activePathCount == 1) {
                    this.f3716p = (byte) (this.f3716p + 1);
                }
                boolean z = false;
                if (mo1122a.size() != 0) {
                    map.m4168a(this.f3714n, this.f3715o);
                    if (!this.f3720t && ((C0829p) mo1122a.getLast()).f5619a == map.returnX && ((C0829p) mo1122a.getLast()).f5620b == map.returnY) {
                        z = true;
                    }
                }
                if (z) {
                    if (1 == 0) {
                        if (this.activePathCount < 120) {
                            m2627a(this.activePathCount, this.f3714n, this.f3715o);
                            this.activePathCount++;
                        }
                    } else {
                        if (this.activePathCount == 0) {
                            this.activePathCount++;
                        }
                        m2627a(this.activePathCount - 1, this.f3714n, this.f3715o);
                    }
                }
                this.f3783aN = null;
                if (this.activePathCount > 120) {
                    GameEngine.log("activePathCount>maxPathNodes: activePathCount:" + this.activePathCount);
                    this.activePathCount = 120;
                }
                this.f3777u = this.activePathCount;
            }
        }
    }

    /* renamed from: aK */
    public long m2586aK() {
        PathNode pathNode;
        long j = 0;
        for (int i = 0; i < this.activePathCount; i++) {
            if (this.activePath[i] != null) {
                j = j + Float.floatToRawIntBits(pathNode.f3818a) + Float.floatToRawIntBits(pathNode.f3819b);
            }
        }
        return j;
    }

    /* renamed from: o */
    PathNode m2450o(int i) {
        if (this.f3698an != null) {
            if (i == 0) {
                return getActivePathNode();
            }
            return m2592aE();
        } else if (i >= this.activePathCount) {
            return null;
        } else {
            return this.activePath[i];
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: d */
    public void mo423d(float f) {
        super.mo423d(f);
    }

    /* renamed from: aL */
    public float mo2585aL() {
        return 1.0f;
    }

    /* renamed from: l */
    public int m2460l(float f) {
        if (f < -0.3f) {
            int i = (int) (((1.0f - ((-f) / 10.0f)) * 130.0f) + 45.0f);
            if (i < 45) {
                i = 45;
            }
            return i;
        }
        return 255;
    }

    /* renamed from: aM */
    public Paint mo2584aM() {
        int i;
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.height < -0.3f) {
            i = Color.argb(m2460l(this.height), 255, 255, 255);
        } else {
            i = -1;
        }
        if (this.built < 1.0f && this.built < mo2585aL()) {
            i = Color.argb((int) (20.0f + ((this.built / mo2585aL()) * 220.0f)), 140, 255, 140);
            porterDuffColorFilter = f3742aQ;
        }
        if (this.f1621cg) {
            if (this.f1624cj) {
                i = Color.argb(200, 20, 255, 20);
                porterDuffColorFilter = f3743aR;
            }
            if (this.f1625ck) {
                i = Color.argb(200, 255, 20, 20);
                porterDuffColorFilter = f3744aS;
            }
            if (this.f1622ch) {
                i = Color.argb(50, 70, 70, 245);
                porterDuffColorFilter = f3745aT;
                if (this.f1625ck) {
                    i = Color.argb(50, 255, 20, 20);
                    porterDuffColorFilter = f3744aS;
                }
            }
            if (this.f1623ci) {
                i = Color.argb(150, 100, 100, 100);
            }
        }
        return m2626a(i, porterDuffColorFilter, m2583aN());
    }

    /* renamed from: aN */
    public boolean m2583aN() {
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = gameEngine.curSettings.renderAntiAlias;
        if (!mo3163dg()) {
            z = false;
            if (gameEngine.viewpointZoom < 1.0f) {
                z = true;
            }
        }
        if (this.f1620cf) {
            z = UnitType.f1703ag;
        }
        return z;
    }

    /* renamed from: p */
    public float mo2448p(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        Graphics graphics = gameEngine.graphics;
        Paint mo2584aM = mo2584aM();
        float cB = mo3194cB();
        if (this.f4047en) {
            PointF cU = mo3184cU();
            float f2 = (this.x + cU.x) - gameEngine.viewpointX_rounded;
            float f3 = ((this.y + cU.y) - gameEngine.viewpointY_rounded) - this.height;
            mo2581aP();
            if (cB != 1.0f) {
                graphics.mo135j();
                graphics.mo222a(cB, cB, f2, f3);
            }
            graphics.mo197a(this.image, f2, f3, mo2836d(false) - 90.0f, mo2584aM);
            if (cB != 1.0f) {
                graphics.mo134k();
                return true;
            }
            return true;
        }
        PointF cU2 = mo3184cU();
        RectF cD = mo2967cD();
        float f4 = cU2.x;
        float f5 = cU2.y - this.height;
        cD.left += f4;
        cD.top += f5;
        cD.right += f4;
        cD.bottom += f5;
        Rect a_ = getImageSrcRect(false);
        float f6 = (cD.left + cD.right) * 0.5f;
        float f7 = (cD.top + cD.bottom) * 0.5f;
        graphics.mo135j();
        mo2581aP();
        if (cB != 1.0f) {
            graphics.mo222a(cB, cB, f6, f7);
        }
        graphics.mo223a(mo2836d(false), f6, f7);
        graphics.mo190a(this.image, a_, cD, mo2584aM);
        graphics.mo134k();
        return true;
    }

    /* renamed from: F */
    public boolean mo2663F() {
        return this.height > 0.0f && this.built >= 1.0f && !this.f1622ch;
    }

    /* renamed from: aO */
    public PointF mo2582aO() {
        f3749aX.set(mo2661G(), mo2659H());
        return f3749aX;
    }

    /* renamed from: G */
    public float mo2661G() {
        return 0.0f;
    }

    /* renamed from: H */
    public float mo2659H() {
        return 0.0f;
    }

    /* renamed from: aP */
    public boolean mo2581aP() {
        if (this.shadowImage != null && mo2663F()) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (!gameEngine.f5969de && this.radius < 18.0f && this.height < 0.5d) {
                return true;
            }
            if (!gameEngine.f5970df && this.radius < 28.0f && this.height < 5.0f) {
                return true;
            }
            PointF mo2582aO = mo2582aO();
            float f = (this.x + mo2582aO.x) - gameEngine.viewpointX_rounded;
            float f2 = (this.y + mo2582aO.y) - gameEngine.viewpointY_rounded;
            float cB = mo3194cB();
            Graphics graphics = gameEngine.graphics;
            if (cB != 1.0f) {
                graphics.mo135j();
                graphics.mo222a(cB, cB, f, f2);
            }
            if (mo3193cE()) {
                Rect a_ = getImageSrcRect(true);
                RectF rectF = f1592ds;
                rectF.m4652a(f - this.halfObjectWidth, f2 - this.halfObjectHeight, f + this.halfObjectWidth, f2 + this.halfObjectHeight);
                graphics.mo135j();
                graphics.mo223a(mo2836d(true), f, f2);
                graphics.mo190a(this.shadowImage, a_, rectF, m2651Q());
                graphics.mo134k();
            } else {
                graphics.mo197a(this.shadowImage, f, f2, mo2836d(true) - 90.0f, m2651Q());
            }
            if (cB != 1.0f) {
                graphics.mo134k();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: p_ */
    public boolean isOnScreen() {
        return RectF.m4649a(GameEngine.getInstance().f5957cL, m3753cC());
    }

    /* renamed from: aQ */
    public boolean mo2580aQ() {
        C0383i dj = m3735dj();
        if (dj != null && !dj.f2295O) {
            return false;
        }
        return mo2657I();
    }

    /* renamed from: aR */
    public boolean mo2579aR() {
        return mo2580aQ();
    }

    /* renamed from: x */
    public boolean mo2435x() {
        return true;
    }

    /* renamed from: aS */
    public int mo2578aS() {
        return -1;
    }

    /* renamed from: o */
    public float m2449o(Unit unit) {
        if (mo2576aU() && unit != null) {
            return getMaxAttackRange() + this.radius + unit.radius;
        }
        return getMaxAttackRange();
    }

    /* renamed from: p */
    public float m2447p(Unit unit) {
        if (mo2576aU() && unit != null) {
            return mo2577aT() + this.radius + unit.radius;
        }
        return mo2577aT();
    }

    /* renamed from: aT */
    public float mo2577aT() {
        return getMaxAttackRange();
    }

    /* renamed from: q */
    public int m2444q(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        float m2447p = m2447p(unit);
        if (m2447p > 58.0f) {
            i = (int) ((m2447p - 41.0f) / (gameEngine.map.pixel_Width * 1.414f));
        }
        return i;
    }

    /* renamed from: aU */
    public boolean mo2576aU() {
        return false;
    }

    /* renamed from: q */
    public float getDirectDamage(int i) {
        return 0.0f;
    }

    /* renamed from: aV */
    public void m2575aV() {
        int mo2512bk = mo2512bk();
        for (int i = 0; i < mo2512bk; i++) {
            if (i < this.f1532cC.length) {
                C0235aj c0235aj = this.f1532cC[i];
                if (c0235aj.f1656e > getShootDelay(i)) {
                    c0235aj.f1656e = getShootDelay(i);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[SYNTHETIC] */
    /* renamed from: aW */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList m2574aW() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.OrderableUnit.m2574aW():java.util.ArrayList");
    }

    /* renamed from: r */
    public boolean mo2443r(int i) {
        return true;
    }

    /* renamed from: e */
    public float mo2483e(int i) {
        return 0.0f;
    }

    /* renamed from: s */
    public boolean mo2440s(int i) {
        return false;
    }

    /* renamed from: t */
    public float mo2439t(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float mo2481f(int i) {
        return 4.0f;
    }

    /* renamed from: u */
    public boolean mo2438u(int i) {
        int mo2437v = mo2437v(i);
        if (mo2437v == -1) {
            return this.f1532cC[i].f1658g;
        }
        return this.f1532cC[mo2437v].f1658g;
    }

    /* renamed from: v */
    public int mo2437v(int i) {
        return -1;
    }

    /* renamed from: B */
    public float mo2671B() {
        return -1.0f;
    }

    /* renamed from: w */
    public float mo2436w(int i) {
        return -1.0f;
    }

    /* renamed from: x */
    public float mo2434x(int i) {
        return 5.0f;
    }

    /* renamed from: y */
    public float mo2433y(int i) {
        return mo2436w(i);
    }

    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    /* renamed from: aX */
    public boolean m2573aX() {
        return false;
    }

    /* renamed from: aY */
    public float mo2572aY() {
        return 1.0f;
    }

    /* renamed from: aZ */
    public float mo2571aZ() {
        return 1.0f;
    }

    /* renamed from: ba */
    public boolean m2522ba() {
        return mo2521bb() > 0.95f;
    }

    /* renamed from: bb */
    public float mo2521bb() {
        return 0.6f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bc */
    public float mo2520bc() {
        return 0.0f;
    }

    /* renamed from: bd */
    public EnumC0295b mo2519bd() {
        return EnumC0295b.f1769a;
    }

    /* renamed from: be */
    public boolean mo2518be() {
        return true;
    }

    /* renamed from: bf */
    public boolean mo2517bf() {
        return true;
    }

    /* renamed from: bg */
    public int mo2516bg() {
        return 0;
    }

    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 99.0f;
    }

    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 99.0f;
    }

    /* renamed from: bh */
    public boolean mo2515bh() {
        return false;
    }

    /* renamed from: bi */
    public boolean mo2514bi() {
        return false;
    }

    /* renamed from: b */
    public boolean mo2538b(int i, float f) {
        return true;
    }

    /* renamed from: bj */
    public boolean m2513bj() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bk */
    public int mo2512bk() {
        return 1;
    }

    /* renamed from: bl */
    public boolean mo2511bl() {
        return true;
    }

    /* renamed from: g */
    public float getTurretSize(int i) {
        return 0.0f;
    }

    /* renamed from: z */
    public float mo2431z(int i) {
        return 99999.0f;
    }

    /* renamed from: A */
    public float mo2672A(int i) {
        return -1.0f;
    }

    /* renamed from: B */
    public float mo2670B(int i) {
        return 0.0f;
    }

    /* renamed from: C */
    public float mo2668C(int i) {
        if (this.f1524bZ && m2522ba()) {
            return this.direction + 180.0f;
        }
        return this.direction;
    }

    /* renamed from: bm */
    public C0918ai m2510bm() {
        int mo2578aS = mo2578aS();
        if (mo2578aS == -1) {
            return mo2666D(0);
        }
        return mo2666D(mo2578aS);
    }

    /* renamed from: D */
    public C0918ai mo2666D(int i) {
        f3750aY.m558a(getTurretEnd(i));
        return f3750aY;
    }

    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        C0235aj c0235aj = this.f1532cC[i];
        float turretSize = getTurretSize(i);
        float f = isFixedFiring() ? this.direction : c0235aj.f1652a;
        PointF mo2662F = mo2662F(i);
        f3751aZ.set(mo2662F.x + (CommonUtils.cos(f) * turretSize), mo2662F.y + (CommonUtils.sin(f) * turretSize));
        return f3751aZ;
    }

    /* renamed from: F */
    public PointF mo2662F(int i) {
        C0235aj c0235aj = this.f1532cC[i];
        float f = this.x;
        float f2 = this.y;
        float mo2660G = mo2660G(i);
        if (c0235aj.f1656e != 0.0f && mo2660G != 0.0f) {
            float mo2658H = mo2658H(i);
            float mo2656I = mo2656I(i);
            float f3 = 0.0f;
            float shootDelay = getShootDelay(i) - c0235aj.f1656e;
            if (shootDelay < mo2658H) {
                f3 = (shootDelay / mo2658H) * mo2660G;
            } else if (shootDelay < mo2656I + mo2658H) {
                f3 = mo2660G - (((shootDelay - mo2658H) / mo2656I) * mo2660G);
            }
            if (f3 != 0.0f) {
                f += CommonUtils.cos(c0235aj.f1652a) * f3;
                f2 += CommonUtils.sin(c0235aj.f1652a) * f3;
            }
        }
        f3752ba.set(f, f2);
        return f3752ba;
    }

    /* renamed from: G */
    public float mo2660G(int i) {
        return 0.0f;
    }

    /* renamed from: H */
    public float mo2658H(int i) {
        return 4.0f;
    }

    /* renamed from: I */
    public float mo2656I(int i) {
        return 6.0f;
    }

    /* renamed from: J */
    public PointF mo2655J(int i) {
        PointF pointF = f3753bb;
        pointF.set(0.0f, 0.0f);
        C0235aj c0235aj = this.f1532cC[i];
        pointF.x += c0235aj.f1659h;
        pointF.y += c0235aj.f1660i;
        return pointF;
    }

    /* renamed from: K */
    public float mo2654K(int i) {
        return 0.6f;
    }

    /* renamed from: L */
    public void mo2653L(int i) {
        if (i == -1) {
            int mo2512bk = mo2512bk();
            for (int i2 = 0; i2 < mo2512bk; i2++) {
                mo2653L(i2);
            }
            return;
        }
        C0235aj c0235aj = this.f1532cC[i];
        c0235aj.f1659h = 0.0f;
        c0235aj.f1660i = 0.0f;
        if (this.f3674K != null && mo2654K(i) != 0.0f) {
            float mo2654K = this.f3674K.radius * mo2654K(i);
            c0235aj.f1659h += CommonUtils.m1722a((GameObject) this, (int) (-mo2654K), (int) mo2654K, 1 + i);
            c0235aj.f1660i += CommonUtils.m1722a((GameObject) this, (int) (-mo2654K), (int) mo2654K, 2 + i);
        }
    }

    /* renamed from: a */
    public void m2605a(EnumC0588v enumC0588v) {
        m2604a(enumC0588v, true);
    }

    /* renamed from: a */
    public void m2604a(EnumC0588v enumC0588v, boolean z) {
        EffectObject m2205d;
        GameEngine gameEngine = GameEngine.getInstance();
        if (enumC0588v == EnumC0588v.f3799h) {
            gameEngine.audio.playSound(AudioEngine.buiding_explode, 0.8f, this.x, this.y);
            gameEngine.effects.m2237a(this.x, this.y, this.height);
            gameEngine.effects.m2210b(EnumC0668h.f4401e);
            EffectObject m2207c = gameEngine.effects.m2207c(this.x, this.y, this.height, -1127220);
            if (m2207c != null) {
                m2207c.f4287H = 0.2f;
                m2207c.f4286G = 2.0f;
                m2207c.drawLayer = (short) 2;
                m2207c.timer = 45.0f;
                m2207c.startTimer = m2207c.timer;
                m2207c.f4301V = 0.0f;
            }
        } else if (enumC0588v == EnumC0588v.f3795d || enumC0588v == EnumC0588v.f3797f || enumC0588v == EnumC0588v.f3798g) {
            gameEngine.audio.playSound(AudioEngine.buiding_explode, 0.8f, this.x, this.y);
            gameEngine.effects.m2237a(this.x, this.y, this.height);
        } else if (enumC0588v == EnumC0588v.f3792a) {
            gameEngine.audio.m2416a(AudioEngine.f3869o, 0.4f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), this.x, this.y);
            gameEngine.effects.emitSmalExplosion(this.x, this.y, this.height);
        } else if (enumC0588v == EnumC0588v.f3796e) {
            gameEngine.audio.m2416a(AudioEngine.f3869o, 0.8f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), this.x, this.y);
            gameEngine.effects.emitSmalExplosion(this.x, this.y, this.height);
            gameEngine.effects.m2210b(EnumC0668h.f4401e);
            EffectObject m2207c2 = gameEngine.effects.m2207c(this.x, this.y, this.height, -1127220);
            if (m2207c2 != null) {
                m2207c2.f4287H = 0.2f;
                m2207c2.f4286G = 2.0f;
                m2207c2.drawLayer = (short) 2;
                m2207c2.timer = 45.0f;
                m2207c2.startTimer = m2207c2.timer;
                m2207c2.f4301V = 0.0f;
            }
        } else {
            gameEngine.audio.m2416a(AudioEngine.f3869o, 0.8f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), this.x, this.y);
            gameEngine.effects.emitSmalExplosion(this.x, this.y, this.height);
        }
        if (enumC0588v != EnumC0588v.f3792a) {
            if (enumC0588v != EnumC0588v.f3798g && (m2205d = gameEngine.effects.m2205d(this.x, this.y, this.height, 0)) != null) {
                m2205d.startingAlpha = 0.9f;
            }
            if (z) {
                if (!mo3198bN()) {
                    m2509bn();
                }
                if (enumC0588v != EnumC0588v.f3798g && !m3749cI()) {
                    Emitter.m2195a(this.x, this.y);
                    Emitter.m2191b(this.x, this.y);
                    mo2507bp();
                }
            }
        }
    }

    /* renamed from: bn */
    public void m2509bn() {
        GameEngine gameEngine = GameEngine.getInstance();
        float f = 1.0f;
        float f2 = 1.0f;
        int mo2508bo = mo2508bo();
        if (mo2508bo >= 10) {
            f = 1.2f;
            f2 = 1.4f;
        }
        if (mo2508bo >= 20) {
            f = 1.5f;
            f2 = 1.7f;
        }
        if (this.height > -1.0f) {
            for (int i = 0; i < mo2508bo; i++) {
                gameEngine.effects.m2214b(this.x, this.y, this.height, f, f2);
            }
        }
    }

    /* renamed from: bo */
    public int mo2508bo() {
        if (mo2845cZ()) {
            return 8;
        }
        if (mo2975bH()) {
            return 7;
        }
        return 4;
    }

    /* renamed from: bp */
    public void mo2507bp() {
        if (!m3749cI()) {
            ScorchMark.m3995a(this.x, this.y);
        }
    }

    /* renamed from: s */
    public int mo2441s() {
        return 15;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public void mo2491c(boolean z) {
        int mo2441s;
        GameEngine game = GameEngine.getInstance();
        if (this.transportedBy == null && this.f1630cF == null && (mo2441s = mo2441s()) > 0) {
            game.map.m4167a(this.x, this.y, mo2441s, this.team, z);
        }
    }

    /* renamed from: bq */
    public void m2506bq() {
        GameEngine game = GameEngine.getInstance();
        RectF rectF = new RectF();
        rectF.m4651a(mo2973cb());
        rectF.top *= game.map.pixel_Height;
        rectF.bottom *= game.map.pixel_Height;
        rectF.left *= game.map.pixel_Width;
        rectF.right *= game.map.pixel_Width;
        rectF.m4653a(this.x, this.y);
        rectF.m4653a(-mo2897cV(), -mo2896cW());
        rectF.top -= 10.0f;
        rectF.bottom += 10.0f;
        rectF.left -= 10.0f;
        rectF.right += 10.0f;
        Iterator it = Unit.m3767bE().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if ((unit instanceof Unit) && unit != this && unit.m3781a(rectF)) {
                if ((unit instanceof OrderableUnit) && unit.dead) {
                    unit.remove();
                }
                if (unit instanceof Tree) {
                    ((Tree) unit).m3789f();
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo2493c(Team team) {
        return m2527b(false, team) == null;
    }

    /* renamed from: a */
    public boolean m2597a(boolean z, Team team) {
        return m2527b(z, team) == null;
    }

    /* renamed from: b */
    public String m2527b(boolean z, Team team) {
        String m3460a;
        GameEngine gameEngine = GameEngine.getInstance();
        C0385bb mo3071q = getUnitType().mo3071q();
        if (mo3071q != null && (m3460a = mo3071q.m3460a(this, this.x, this.y)) != null) {
            return m3460a;
        }
        if (getUnitType().mo3073p()) {
            gameEngine.map.m4168a(this.x, this.y);
            MapTile tileFromObjectLayer = gameEngine.map.getTileFromObjectLayer(gameEngine.map.returnX, gameEngine.map.returnY);
            if (tileFromObjectLayer == null || !tileFromObjectLayer.nresPool) {
                return "{2}";
            }
        }
        if (!z && m2617a((Unit) null, team)) {
            return "{0}";
        }
        if (!getUnitType().mo3073p()) {
            Rect cb = mo2973cb();
            Point a = m3780a(gameEngine.map, f3754bc);
            int i = a.game;
            int i2 = a.y;
            UnitType r = getUnitType();
            MovementType mo3075o = r.mo3075o();
            for (int i3 = i + cb.left; i3 <= i + cb.right; i3++) {
                for (int i4 = i2 + cb.top; i4 <= i2 + cb.bottom; i4++) {
                    String m2977a = Building.m2977a(this, r, mo3075o, i3, i4, false, team);
                    if (m2977a != null) {
                        return m2977a;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: M */
    public void m2652M(int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!getUnitType().mo3073p()) {
            Rect cb = mo2973cb();
            Point a = m3780a(gameEngine.map, f3755bd);
            int i2 = a.game;
            int i3 = a.y;
            getUnitType();
            int i4 = i2 + cb.left;
            int i5 = i3 + cb.top;
            int i6 = i2 + cb.right;
            int i7 = i3 + cb.bottom;
            if (i != -2) {
                gameEngine.map.m4151a(this, i4, i5, i6, i7, (int) gameEngine.viewpointX_rounded, (int) gameEngine.viewpointY_rounded, gameEngine.graphics, true, i);
            }
        }
    }

    /* renamed from: r */
    public boolean m2442r(Unit unit) {
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
        float f = 9.0f;
        if (!unit.mo2975bH()) {
            f = this.radius + unit.radius;
            if (f < 11.0f) {
                f = 11.0f;
            }
        }
        if (distanceSq < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2617a(Unit unit, Team team) {
        boolean z = false;
        if (!mo2975bH()) {
            z = true;
        }
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit2 = m485a[i];
            if (unit2 != this && ((z || unit2.mo2975bH()) && !unit2.dead && m2442r(unit2) && unit2 != unit && (team == null || unit2.m3739d(team)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: br */
    public OrderableUnit m2505br() {
        Iterator it = Unit.fastUnitList.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit != this && (unit instanceof OrderableUnit)) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (!orderableUnit.dead && orderableUnit.team == this.team && orderableUnit.getUnitType() == getUnitType() && m3727t(orderableUnit)) {
                    return orderableUnit;
                }
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.PhysicalObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void remove() {
        if (this.f1630cF != null) {
            m2500bw();
        }
        m2545ay();
        m2589aH();
        super.remove();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bs */
    public void mo2504bs() {
        m2610a((OrderableUnit) null);
        this.f3674K = null;
        m2545ay();
        m2589aH();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bt */
    public void mo2503bt() {
        if (this.f1630cF != null) {
            m2500bw();
        }
        super.mo2503bt();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bu */
    public void mo2502bu() {
        super.mo2502bu();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bv */
    public int mo2501bv() {
        return (((((((((((0 * 31) + super.mo2501bv()) * 31) + ((int) (getMoveSpeed() * 100.0f))) * 31) + ((int) (getTurnSpeed() * 100.0f))) * 31) + ((int) (getMaxAttackRange() * 100.0f))) * 31) + ((int) getShootDelay(0))) * 31) + ((int) (getMoveAccelerationSpeed() * 100.0f));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: m */
    PointF mo2456m(float f) {
        PointF m2453n = m2453n(f);
        f1595dv.set(this.x + m2453n.x, this.y + m2453n.y);
        return f1595dv;
    }

    /* renamed from: n */
    public PointF m2453n(float f) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (mo2657I() && this.f3705b == 0.0f) {
            if (mo2515bh()) {
                f2 = this.f1614bT * f;
                f3 = this.f1615bU * f;
            } else if (this.speed != 0.0f) {
                float f4 = this.direction;
                if (mo2514bi()) {
                    f4 = this.f1523bY;
                }
                float moveSpeed = getMoveSpeed() * this.speed * f;
                f2 = CommonUtils.cos(f4) * moveSpeed;
                f3 = CommonUtils.sin(f4) * moveSpeed;
            }
        }
        f3756be.set(f2, f3);
        return f3756be;
    }

    /* renamed from: a */
    public boolean mo2622a(EnumC0226aa enumC0226aa) {
        return false;
    }

    /* renamed from: a */
    public void mo2624a(Action action) {
    }

    /* renamed from: a */
    public boolean mo2623a(Action action, float f, float f2) {
        return true;
    }

    /* renamed from: a */
    public void mo2620a(Unit unit, float f, int i) {
        this.f3677N = CommonUtils.toZero(this.f3677N, f);
        if (this.f3677N == 0.0f) {
            this.f3677N = 5.0f;
            if (isOnScreen()) {
                C0918ai m2510bm = m2510bm();
                EffectObject emitEffect = GameEngine.getInstance().effects.emitEffect(m2510bm.f6260a, m2510bm.f6261b, this.height + m2510bm.f6262c, EffectType.f4274a, false, EnumC0668h.f4398b);
                if (emitEffect != null) {
                    float m1659d = CommonUtils.m1659d(m2510bm.f6260a, m2510bm.f6261b, (float) (unit.x + (-8.0d) + (Math.random() * 16.0d)), (float) (unit.y + (-8.0d) + (Math.random() * 16.0d)));
                    emitEffect.f4296Q = CommonUtils.cos(m1659d) * CommonUtils.rnd(2.0f, 4.0f);
                    emitEffect.ySpeed = CommonUtils.sin(m1659d) * CommonUtils.rnd(2.0f, 4.0f);
                    emitEffect.frameIndex = 6;
                    emitEffect.timer = 20.0f;
                    emitEffect.startTimer = emitEffect.timer;
                    emitEffect.fadeOut = true;
                    emitEffect.startingAlpha = 0.8f;
                    emitEffect.f4287H = 0.2f;
                    emitEffect.f4286G = 1.0f;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2536b(Unit unit, float f, int i) {
        this.f3677N = CommonUtils.toZero(this.f3677N, f);
        if (this.f3677N == 0.0f) {
            this.f3677N = 5.0f;
            if (isOnScreen()) {
                PointF turretEnd = getTurretEnd(0);
                EffectObject emitEffect = GameEngine.getInstance().effects.emitEffect(unit.x, unit.y, unit.height, EffectType.f4274a, false, EnumC0668h.f4398b);
                if (emitEffect != null) {
                    float m1659d = CommonUtils.m1659d(unit.x, unit.y - unit.height, (float) (turretEnd.x + (-8.0d) + (Math.random() * 16.0d)), (float) (turretEnd.y + (-8.0d) + (Math.random() * 16.0d)));
                    emitEffect.f4296Q = CommonUtils.cos(m1659d) * CommonUtils.rnd(2.0f, 4.0f);
                    emitEffect.ySpeed = CommonUtils.sin(m1659d) * CommonUtils.rnd(2.0f, 4.0f);
                    emitEffect.frameIndex = 5;
                    emitEffect.timer = 20.0f;
                    emitEffect.startTimer = emitEffect.timer;
                    emitEffect.fadeOut = true;
                    emitEffect.startingAlpha = 0.8f;
                    emitEffect.f4287H = 0.2f;
                    emitEffect.f4286G = 1.0f;
                }
            }
        }
    }

    /* renamed from: a */
    public C0586t m2611a(Waypoint game, UnitType unitType, int i, float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        Action m2614a = m2614a(unitType, i, false);
        if (m2614a == null) {
            GameEngine.log("Unit '" + getUnitType().mo3087i() + "' can not build:" + unitType.mo3087i());
            return f3757bf.m2430a();
        }
        if (!game.f1745n) {
            if (m2614a.mo3603g(this)) {
                GameEngine.log("Builder '" + getUnitType().mo3087i() + "' tried to build a locked building:" + m2614a.m3833M());
                return f3757bf.m2430a();
            } else if (!m2614a.isAvailable(this)) {
                GameEngine.log("Builder '" + getUnitType().mo3087i() + "' tried to build a unavailable building:" + m2614a.m3833M());
                return f3757bf.m2430a();
            }
        }
        if (!unitType.mo3083k() && !m2614a.mo3820v() && this.team.m3881r() >= this.team.m3880s()) {
            if (this.team == gameEngine.playerTeam) {
                gameEngine.interfaceEngine.m1879a(gameEngine.interfaceEngine.battleInterface.f4490an);
            }
            return f3757bf.m2430a();
        } else if (Unit.m3777a(unitType) == null) {
            String str = "{build is null}";
            if (game.build != null) {
                str = game.build.mo3087i();
            }
            GameEngine.PrintLOG("Build unit type missing: " + str);
            return f3757bf.m2430a();
        } else {
            Unit createBuilding = Building.createBuilding(unitType);
            createBuilding.f1527bp = m2614a.mo3586z();
            createBuilding.f1528bq = m2614a.mo3595o_();
            if (m2614a instanceof C0207h) {
                createBuilding.f1527bp = null;
                createBuilding.f1528bq = null;
            }
            createBuilding.built = 0.0f;
            createBuilding.f1619ce = 0.0f;
            gameEngine.map.m4134b((f - createBuilding.mo2897cV()) + 1.0f, (f2 - createBuilding.mo2896cW()) + 1.0f);
            createBuilding.x = gameEngine.map.returnX + createBuilding.mo2897cV();
            createBuilding.y = gameEngine.map.returnY + createBuilding.mo2896cW();
            createBuilding.mo3149f(this.team);
            createBuilding.mo3233B(this);
            if (i != 1 && (createBuilding instanceof OrderableUnit)) {
                ((OrderableUnit) createBuilding).upgrade(i);
            }
            createBuilding.mo3191cM();
            if (createBuilding instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) createBuilding;
                boolean z = false;
                OrderableUnit orderableUnit2 = null;
                if (mo2559ak()) {
                    orderableUnit2 = this;
                } else if (!this.collidable && !mo2975bH()) {
                    orderableUnit2 = this;
                }
                if (orderableUnit.m2617a(orderableUnit2, (Team) null)) {
                    z = true;
                }
                if (!z && !orderableUnit.m2597a(true, (Team) null)) {
                    z = true;
                }
                if (z) {
                    createBuilding.remove();
                    C0586t m2430a = f3757bf.m2430a();
                    OrderableUnit m2505br = ((OrderableUnit) createBuilding).m2505br();
                    m2430a.f3785b = m2505br;
                    m2430a.f3787d = m2614a;
                    if (m2505br == null) {
                    }
                    return m2430a;
                }
            }
            C0407b mo3586z = m2614a.mo3586z();
            if (game.f1745n) {
                mo3586z = C0407b.f2549a;
            }
            if (!mo3586z.m3408c(this)) {
                createBuilding.remove();
                C0586t m2430a2 = f3757bf.m2430a();
                this.f3763J = gameEngine.f5845by;
                if (this.f3678O < 1000.0f) {
                    m2430a2.f3786c = true;
                    C0661a m2253a = C0661a.m2253a(this.team, createBuilding.x, createBuilding.y);
                    if (m2253a != null) {
                        m2253a.f4222i = true;
                    }
                }
                return m2430a2;
            }
            mo2454m(createBuilding);
            if (createBuilding instanceof OrderableUnit) {
                OrderableUnit orderableUnit3 = (OrderableUnit) createBuilding;
                orderableUnit3.m2506bq();
                if (createBuilding.mo2975bH()) {
                    gameEngine.PathEngine.m1102a(orderableUnit3);
                }
            }
            Team.m3924c(createBuilding);
            C0586t m2430a3 = f3757bf.m2430a();
            m2430a3.f3784a = createBuilding;
            m2430a3.f3787d = m2614a;
            return m2430a3;
        }
    }

    /* renamed from: a */
    public boolean mo2607a(OrderableUnit orderableUnit, C0383i c0383i) {
        return false;
    }

    /* renamed from: b */
    public boolean mo2531b(OrderableUnit orderableUnit) {
        return false;
    }

    /* renamed from: bw */
    public void m2500bw() {
        if (this.f1630cF == null) {
            return;
        }
        if (this.f1630cF.dead) {
        }
        if (!this.f1630cF.mo2531b(this)) {
            GameEngine.log("Deattach failed, forcing deattach. Child:" + m3741cy() + " Parent:" + this.f1630cF.m3741cy());
            this.f1630cF = null;
            this.f1631cG = null;
        }
    }

    /* renamed from: a */
    public C0383i mo2599a(short s) {
        return null;
    }

    /* renamed from: a */
    public static Unit m2609a(OrderableUnit orderableUnit, float f, float f2, float f3, ValueList valueList) {
        if (f3 <= 0.0f) {
            return null;
        }
        f3758bg.f3806f = true;
        f3758bg.f3807g = false;
        f3758bg.f3805e = null;
        f3758bg.f3804d = f3 * f3;
        f3758bg.f3803c = valueList;
        f3758bg.f3801a = f;
        f3758bg.f3802b = f2;
        GameEngine.getInstance().UnitGeoIndex.m2786a(f, f2, f3, orderableUnit, 0.0f, f3758bg);
        return f3758bg.f3805e;
    }

    /* renamed from: bx */
    public C0407b mo2499bx() {
        return C0407b.f2549a;
    }

    /* renamed from: by */
    public ObjectVector mo2498by() {
        return f3759bi;
    }

    /* renamed from: bz */
    public boolean mo2497bz() {
        return false;
    }

    /* renamed from: bA */
    public int mo2526bA() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bB */
    public void mo2525bB() {
        C0407b c0407b;
        C0407b m2523bD = m2523bD();
        C0407b mo2524bC = mo2524bC();
        if (m2523bD == null) {
            c0407b = mo2524bC;
        } else if (mo2524bC == null) {
            c0407b = m2523bD;
        } else {
            c0407b = C0407b.m3397a(m2523bD, mo2524bC);
        }
        if (this.f1639dA == null && c0407b == null) {
            return;
        }
        if (this.f1639dA != null && c0407b != null && this.f1639dA.m3384b(c0407b)) {
            return;
        }
        Team.m3940b((Unit) this);
        this.f1639dA = c0407b;
        Team.m3924c(this);
    }

    /* renamed from: bC */
    public C0407b mo2524bC() {
        return null;
    }

    /* renamed from: bD */
    public C0407b m2523bD() {
        Waypoint activeWaypoint;
        Unit m2645W = m2645W();
        if (m2645W != null && (activeWaypoint = getActiveWaypoint()) != null) {
            if (activeWaypoint.type == WaypointType.f1754d && m2645W.built < 1.0f) {
                C0407b m2476g = m2476g(m2645W);
                float m2570a_ = m2570a_(m2645W) * 60.0f;
                if (m2476g != null) {
                    return C0407b.m3398a(m2476g, -m2570a_);
                }
            }
            if (activeWaypoint.type == WaypointType.f1757g) {
                if (m2645W.built < 1.0f) {
                    C0407b m2476g2 = m2476g(m2645W);
                    float mo2480f = mo2480f(m2645W) * 60.0f;
                    if (m2476g2 != null) {
                        return C0407b.m3398a(m2476g2, mo2480f);
                    }
                    return null;
                } else if (m3726y(m2645W)) {
                    float z = mo3140z(m2645W);
                    C0407b m3748cK = m2645W.m3748cK();
                    C0407b mo3192cL = m2645W.mo3192cL();
                    if (mo3192cL != null) {
                        m3748cK = mo3192cL;
                    }
                    return C0407b.m3398a(m3748cK, (z * 60.0f) / m2645W.maxHp);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}