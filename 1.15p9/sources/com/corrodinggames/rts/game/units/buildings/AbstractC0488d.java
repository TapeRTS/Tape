package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0402bc;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/d.class */
public abstract class AbstractC0488d extends AbstractC0623y {

    /* renamed from: m */
    BitmapOrTexture f3420m;

    /* renamed from: n */
    public Rect f3421n;

    /* renamed from: o */
    public Rect f3422o;

    /* renamed from: p */
    public static BitmapOrTexture f3423p = null;

    /* renamed from: q */
    public static BitmapOrTexture[] f3424q = new BitmapOrTexture[10];

    /* renamed from: r */
    int f3425r;

    /* renamed from: s */
    int f3426s;

    /* renamed from: M */
    public boolean m4520M() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3425r);
        super.mo466a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        if (c0876k.m1463b() >= 15) {
            m4519R(c0876k.m1454f());
        }
        super.mo2877a(c0876k);
    }

    /* renamed from: a */
    public static boolean m4518a(InterfaceC0303as interfaceC0303as, float f, float f2, Team team) {
        GameEngine gameEngine = GameEngine.getInstance();
        AbstractC0623y abstractC0623y = (AbstractC0623y) Unit.m5890a(interfaceC0303as);
        gameEngine.f6104bL.m6617b(f, f2);
        abstractC0623y.f6951ek = gameEngine.f6104bL.f800T + abstractC0623y.m5823cX();
        abstractC0623y.f6952el = gameEngine.f6104bL.f801U + abstractC0623y.m5823cX();
        abstractC0623y.mo3120b(team);
        return abstractC0623y.m3075c((Team) null);
    }

    /* renamed from: R */
    public void m4519R(int i) {
        this.f3425r = i;
    }

    /* renamed from: d */
    public BitmapOrTexture m4507d(int i) {
        return null;
    }

    /* renamed from: v */
    public BitmapOrTexture m4504v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3424q[this.team.getId()];
    }

    /* renamed from: dq */
    public static void m4506dq() {
        f3423p = GameEngine.getInstance().graphics.loadImage(R.drawable.unit_icon_building);
        f3424q = Team.createBitmapForTeam(f3423p);
    }

    public AbstractC0488d(boolean z) {
        super(z);
        this.f3421n = new Rect();
        this.f3422o = new Rect();
        this.f3425r = 1;
        this.f3426s = 0;
        this.direction = -90.0f;
        this.collidable = false;
    }

    /* renamed from: c_ */
    public void m4511c_() {
        this.collidable = false;
    }

    /* renamed from: K */
    public boolean mo4501K() {
        m3206a(EnumC0233ab.f1504d);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo5648e() {
        GameEngine.getInstance().f6113bU.m1312a(this);
        if (this.f1623ck < 1.0f) {
            m3206a(EnumC0233ab.f1501a);
            return false;
        }
        this.f3426s = 0;
        return mo4501K();
    }

    /* renamed from: cc */
    public Rect m4509cc() {
        return this.f3422o;
    }

    /* renamed from: cb */
    public Rect m4510cb() {
        return this.f3421n;
    }

    /* renamed from: a */
    public static boolean m4517a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = gameEngine.f6104bL;
        if (!c0173b.m6608c(i, i2)) {
            return false;
        }
        boolean z = false;
        if (c0173b.f840E && gameEngine.f6093bs.f1336M != null) {
            if (!c0173b.f842G && gameEngine.f6093bs.f1336M[i][i2] == 10) {
                return false;
            }
            z = gameEngine.f6093bs.f1336M[i][i2] >= 5;
        }
        if (m4516a(abstractC0623y, interfaceC0303as, enumC0246ao, i, i2, z)) {
            if (interfaceC0303as.mo5699p()) {
                C0180g m6598e = c0173b.m6598e(i, i2);
                if (m6598e != null && m6598e.f921i) {
                    return true;
                }
                return false;
            } else if (C0741a.m2578a(gameEngine.f6093bs, i, i2, i3)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4516a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z) {
        return m4515a(abstractC0623y, interfaceC0303as, enumC0246ao, i, i2, z, null) == null;
    }

    /* renamed from: a */
    public static String m4515a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z, Team team) {
        String m5288a;
        GameEngine gameEngine = GameEngine.getInstance();
        if (!gameEngine.f6104bL.m6608c(i, i2)) {
            return "{0}";
        }
        C0402bc mo5698q = interfaceC0303as.mo5698q();
        if (mo5698q != null && (m5288a = mo5698q.m5288a(abstractC0623y, i, i2)) != null) {
            return m5288a;
        }
        if (interfaceC0303as == UnitType.f1737d || enumC0246ao == EnumC0246ao.f1706e) {
            if (!gameEngine.f6113bU.m1311a(gameEngine.f6113bU.f6013A, i, i2)) {
                return null;
            }
            return "{3}";
        }
        C0180g m6598e = gameEngine.f6104bL.m6598e(i, i2);
        if (m6598e != null && m6598e.f921i) {
            if (interfaceC0303as.mo5699p()) {
                return null;
            }
            return "{0}";
        } else if (enumC0246ao == EnumC0246ao.f1705d) {
            return null;
        } else {
            if (enumC0246ao == EnumC0246ao.f1707f) {
                if (!gameEngine.f6113bU.m1311a(gameEngine.f6113bU.f6015C, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.f1708g) {
                if (!gameEngine.f6113bU.m1311a(gameEngine.f6113bU.f6016D, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.f1709h) {
                if (!gameEngine.f6113bU.m1311a(gameEngine.f6113bU.f6017E, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (gameEngine.f6113bU.m1310a(gameEngine.f6113bU.f6012z, i, i2, z)) {
                boolean z2 = false;
                if (team != null && !gameEngine.f6104bL.m6647a(i, i2, team)) {
                    z2 = true;
                }
                if (!z2) {
                    return "{0}";
                }
                return null;
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static Unit m4514b(int i, int i2) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6104bL.m6648a(i, i2);
        float f = gameEngine.f6104bL.f800T + gameEngine.f6104bL.f786p;
        float f2 = gameEngine.f6104bL.f801U + gameEngine.f6104bL.f787q;
        Iterator it = gameEngine.f6121cc.m3784b(f, f2, 0.0f).iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.m5867bI() && !unit.isDead && unit.m5850c(f, f2, 0.0f)) {
                return unit;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo4213a(int i) {
    }

    /* renamed from: g */
    public static Unit m4505g(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            throw new RuntimeException("type is null");
        }
        return interfaceC0303as.mo5717a();
    }

    /* renamed from: I */
    public boolean mo3295I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public EnumC0246ao mo5645h() {
        return EnumC0246ao.f1702a;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo3293i() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo3294Q() {
        return false;
    }

    /* renamed from: z */
    public float m4502z() {
        return 0.0f;
    }

    /* renamed from: A */
    public float m4521A() {
        return 0.0f;
    }

    /* renamed from: x */
    public boolean m4503x() {
        return false;
    }

    /* renamed from: f */
    public Paint mo4210f() {
        int argb;
        GameEngine gameEngine = GameEngine.getInstance();
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.f1623ck < 1.0f) {
            argb = Color.argb((int) (40.0f + (this.f1623ck * 200.0f)), 140, 255, 140);
            porterDuffColorFilter = f3971aW;
        } else {
            argb = Color.argb(255, 255, 255, 255);
        }
        if (this.f1626cn) {
            if (this.f1629cq) {
                argb = Color.argb(200, 20, 255, 20);
                porterDuffColorFilter = f3972aX;
            }
            if (this.f1630cr) {
                argb = Color.argb(200, 255, 20, 20);
                porterDuffColorFilter = f3973aY;
            }
            if (this.f1627co) {
                argb = Color.argb(70, 70, 70, 245);
                porterDuffColorFilter = f3974aZ;
                if (this.f1630cr) {
                    argb = Color.argb(70, 255, 20, 20);
                    porterDuffColorFilter = f3973aY;
                }
            }
            if (this.f1628cp) {
                argb = Color.argb(150, 100, 100, 100);
            }
        }
        boolean z = gameEngine.f6109bQ.renderAntiAlias;
        if (!m5781di()) {
            z = false;
            if (gameEngine.f6250cW < 1.0f) {
                z = true;
            }
        }
        if (this.f1625cm) {
            z = UnitType.f1792ag;
        }
        return m3210a(argb, porterDuffColorFilter, z);
    }

    /* renamed from: c */
    public boolean m4512c(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        int i = this.f3426s * this.f4223eo;
        RectF cE = mo4492cE();
        f1684dt.m7208a(i, 0, i + this.f4223eo, 0 + this.f4224ep);
        gameEngine.graphics.mo909a(this.image, f1684dt, cE, mo4210f());
        return true;
    }

    /* renamed from: d */
    public void m4508d(float f) {
        super.mo461d(f);
        if (this.f3420m == null) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (m4520M()) {
            gameEngine.graphics.mo890b(this.f3420m, (this.f6951ek - ((int) (this.f3420m.f6400t + 0.1f))) - gameEngine.f6138cv, (this.f6952el - ((int) (this.f3420m.f6401u + 0.1f))) - gameEngine.f6139cw, mo4210f());
            return;
        }
        RectF cE = mo4492cE();
        f1684dt.m7208a(0, 0, 0 + this.f4223eo, 0 + this.f4224ep);
        gameEngine.graphics.mo909a(this.f3420m, f1684dt, cE, mo4210f());
    }

    /* renamed from: bI */
    public boolean m4513bI() {
        return true;
    }
}
