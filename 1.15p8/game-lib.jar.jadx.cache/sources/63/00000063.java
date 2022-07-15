package com.corrodinggames.rts.game.units.air;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.land.MammothTank;
import com.corrodinggames.rts.game.units.p012a.AbstractC0223x;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/c.class */
public class AmphibiousJet extends AbstractC0297b {

    /* renamed from: q */
    float f1788q;

    /* renamed from: r */
    boolean f1789r = true;

    /* renamed from: s */
    boolean f1790s = true;

    /* renamed from: t */
    float f1791t = 0.0f;

    /* renamed from: u */
    float f1792u = 0.0f;

    /* renamed from: v */
    protected Paint f1793v = new UniquePaint();

    /* renamed from: w */
    PointF f1794w = new PointF();

    /* renamed from: x */
    Rect f1795x = new Rect();

    /* renamed from: a */
    static BitmapOrTexture f1796a = null;

    /* renamed from: b */
    static BitmapOrTexture f1797b = null;

    /* renamed from: c */
    static BitmapOrTexture f1798c = null;

    /* renamed from: d */
    static BitmapOrTexture f1799d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f1800e = new BitmapOrTexture[10];

    /* renamed from: f */
    static BitmapOrTexture[] f1801f = new BitmapOrTexture[10];

    /* renamed from: g */
    static BitmapOrTexture[] f1802g = new BitmapOrTexture[10];

    /* renamed from: o */
    static BitmapOrTexture f1803o = null;

    /* renamed from: p */
    static BitmapOrTexture f1804p = null;

    /* renamed from: y */
    public static final Action f1805y = new AbstractC0223x(151) { // from class: com.corrodinggames.rts.game.units.b.c.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Surface unit.";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Fly";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return !((AmphibiousJet) unit).f1789r;
        }
    };

    /* renamed from: z */
    public static final Action f1806z = new AbstractC0223x(152) { // from class: com.corrodinggames.rts.game.units.b.c.2
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "-Dive unit underwater.";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return ((AmphibiousJet) unit).f1789r && ((OrderableUnit) unit).m3750cH();
        }
    };

    /* renamed from: A */
    static ArrayList f1807A = new ArrayList();

    static {
        f1807A.add(f1805y);
        f1807A.add(f1806z);
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeBoolean(this.f1789r);
        outputNetStream.writeFloat(this.f1791t);
        outputNetStream.writeFloat(this.f1792u);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f1789r = inputNetStream.readBoolean();
        this.f1790s = !isUnderwater();
        if (inputNetStream.m1237b() >= 21) {
            this.f1791t = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 22) {
            this.f1792u = inputNetStream.readFloat();
        }
        m3663L();
        super.mo427a(inputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.Unit
    /* renamed from: P */
    public boolean isUnderwater() {
        return this.height < -1.0f;
    }

    /* renamed from: b */
    public boolean m3661b() {
        if (!this.f1789r || this.height < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public MovementType getMovementType() {
        if (this.f1621cg) {
            return MovementType.f1646d;
        }
        if (m3661b()) {
            return MovementType.f1647e;
        }
        return MovementType.f1646d;
    }

    /* renamed from: c */
    public UnitType mo1775r() {
        return UnitType.amphibiousJet;
    }

    /* renamed from: f */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1797b = gameEngine.graphics.loadImage(R.drawable.amphibious_jet);
        f1798c = gameEngine.graphics.loadImage(R.drawable.amphibious_jet_shadow);
        f1796a = gameEngine.graphics.loadImage(R.drawable.amphibious_jet_dead);
        f1800e = Team.createBitmapForTeam(f1797b);
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.amphibious_jet_p1);
        BitmapOrTexture loadImage2 = gameEngine.graphics.loadImage(R.drawable.amphibious_jet_p2);
        f1801f = Team.createBitmapForTeam(loadImage);
        f1802g = Team.createBitmapForTeam(loadImage2);
        f1803o = m3773a(loadImage);
        f1804p = m3773a(loadImage2);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aP */
    public boolean mo2581aP() {
        if (super.mo2581aP()) {
            m3657f(true);
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        if (this.dead) {
            return true;
        }
        m3657f(false);
        if (!this.dead) {
            for (int i = 0; i < mo2512bk(); i++) {
                if (i != m3659dn()) {
                    float mo2483e = this.f1532cC[i].f1657f / mo2483e(i);
                    if (mo2483e != 0.0f) {
                        GameEngine gameEngine = GameEngine.getInstance();
                        PointF E = getTurretEnd(i);
                        gameEngine.graphics.mo137h();
                        gameEngine.graphics.mo164b(E.x - gameEngine.viewpointX_rounded, (E.y - gameEngine.viewpointY_rounded) - this.height);
                        gameEngine.graphics.mo224a(mo2483e * 0.7f, mo2483e * 0.7f);
                        gameEngine.graphics.mo196a(MammothTank.f3479e, 0.0f, 0.0f, (Paint) null);
                        gameEngine.graphics.mo136i();
                    }
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public void m3657f(boolean z) {
        Paint paint;
        BitmapOrTexture bitmapOrTexture;
        float f;
        GameEngine gameEngine = GameEngine.getInstance();
        if (!z) {
            paint = mo2584aM();
        } else {
            this.f1793v.m4717a(50, 255, 255, 255);
            paint = this.f1793v;
        }
        for (int i = 0; i <= 1; i++) {
            PointF m3662a = m3662a(i, z);
            float f2 = m3662a.x - gameEngine.viewpointX_rounded;
            float f3 = m3662a.y - gameEngine.viewpointY_rounded;
            float mo2836d = mo2836d(false) - 90.0f;
            if (!z) {
                f3 -= this.height;
            }
            if (i == 0) {
                if (z) {
                    bitmapOrTexture = f1804p;
                } else {
                    bitmapOrTexture = f1802g[this.team.getId()];
                }
                f = mo2836d + 0.0f;
            } else {
                if (z) {
                    bitmapOrTexture = f1803o;
                } else {
                    bitmapOrTexture = f1801f[this.team.getId()];
                }
                f = mo2836d - 0.0f;
            }
            gameEngine.graphics.mo197a(bitmapOrTexture, f2, f3, f, paint);
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bk */
    public int mo2512bk() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public PointF mo2662F(int i) {
        if (i == m3659dn()) {
            return super.mo2662F(i);
        }
        float mo2836d = mo2836d(false) - 90.0f;
        PointF m3662a = m3662a(i, false);
        float f = m3662a.x;
        float f2 = m3662a.y;
        f3752ba.set(f + (CommonUtils.cos(mo2836d) * 5.0f), f2 + (CommonUtils.sin(mo2836d) * 5.0f));
        return f3752ba;
    }

    /* renamed from: a */
    public PointF m3662a(int i, boolean z) {
        float mo2836d = mo2836d(false) - 90.0f;
        if (i == m3659dn()) {
            throw new RuntimeException("index==2 is for base");
        }
        float f = this.x;
        float f2 = this.y;
        float m1692b = CommonUtils.m1692b(this.f1792u * 4.0f, 0.0f, 1.0f);
        float m1692b2 = CommonUtils.m1692b((this.f1792u * 2.0f) - 1.0f, 0.0f, 1.0f);
        float cos = f + (CommonUtils.cos(mo2836d) * (7.0f - (5.0f * m1692b)));
        float sin = f2 + (CommonUtils.sin(mo2836d) * (7.0f - (5.0f * m1692b)));
        float f3 = (-90) + (SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT * i);
        this.f1794w.set(cos + (CommonUtils.cos(mo2836d + f3) * (12.0f - (5.0f * m1692b2))), sin + (CommonUtils.sin(mo2836d + f3) * (12.0f - (5.0f * m1692b2))));
        return this.f1794w;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f1796a;
        }
        return f1800e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f1798c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return f1799d;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine.getInstance().effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = f1796a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public AmphibiousJet(boolean z) {
        super(z);
        m2331b(f1797b);
        this.radius = 12.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 530.0f;
        this.hp = this.maxHp;
        this.image = f1797b;
        this.shadowImage = f1798c;
        this.height = 0.0f;
        setDrawLayer(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo2676i() {
        return !m3661b();
    }

    /* renamed from: L */
    public void m3663L() {
        if (!this.f1790s) {
            setDrawLayer(1);
        } else {
            setDrawLayer(5);
        }
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0297b, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        float f2;
        super.update(f);
        if (!isActive() || this.dead) {
            return;
        }
        GameEngine game = GameEngine.getInstance();
        this.f1788q += 2.0f * f;
        if (this.f1788q > 360.0f) {
            this.f1788q -= 360.0f;
        }
        if (this.f1789r) {
            f2 = 20.0f + (CommonUtils.sin(this.f1788q) * 1.5f);
        } else {
            f2 = -8.0f;
        }
        if (this.f1789r && !isUnderwater()) {
            this.f1792u = CommonUtils.m1744a(this.f1792u, 0.0f, 0.018f * f);
        } else {
            this.f1792u = CommonUtils.m1744a(this.f1792u, 1.0f, 0.018f * f);
        }
        if (CommonUtils.absf(this.height - f2) > 3.0f) {
            float f3 = 0.6f;
            if (isUnderwater()) {
                f3 = 0.6f / 6.0f;
            }
            this.f1791t = CommonUtils.m1693b(this.f1791t, f3);
            this.f1791t = CommonUtils.m1744a(this.f1791t, f3, 0.006f * f);
        } else {
            this.f1791t = CommonUtils.m1744a(this.f1791t, 0.07f, 0.006f * f);
        }
        this.height = CommonUtils.m1744a(this.height, f2, this.f1791t * f);
        boolean z = false;
        if (this.f1790s && isUnderwater()) {
            if (!m3750cH()) {
                this.f1789r = true;
            } else {
                this.f1790s = false;
                m3663L();
                z = true;
            }
        }
        if (!this.f1790s && !isUnderwater()) {
            this.f1790s = true;
            m3663L();
            z = true;
        }
        if (z) {
            game.effects.m2230a(this.x, this.y, 0.0f, 0, 0.0f, 0.0f);
            for (int i = -180; i < 180; i += 45) {
                float f4 = this.direction + i;
                EffectObject m2215b = game.effects.m2215b((float) (this.x + (Math.cos(Math.toRadians(f4)) * (-5.0d))), (float) (this.y + (Math.sin(Math.toRadians(f4)) * (-5.0d))), 0.0f, f4);
                if (m2215b != null) {
                    m2215b.drawLayer = (short) 2;
                    m2215b.f4332t = true;
                    m2215b.f4333u = 7.0f;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        if (i == m3659dn()) {
            return 0.0f;
        }
        return 45.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit target, int i) {
        if (i == m3659dn()) {
            return;
        }
        PointF turretEnd = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, turretEnd.x, turretEnd.y, this.height, i);
        createProjectile.color = Color.argb(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        createProjectile.directDamage = getDirectDamage(i);
        createProjectile.target = target;
        createProjectile.lifeTimer = 10.0f;
        createProjectile.speed = 4.0f;
        createProjectile.f1047x = 2.0f;
        createProjectile.f987aQ = false;
        createProjectile.f957A = true;
        createProjectile.f968M = true;
        createProjectile.f1062ai = 0.5f;
        createProjectile.f1064ak = 1.0f;
        createProjectile.f1065al = 0.1f;
        GameEngine game = GameEngine.getInstance();
        game.effects.emitLight(turretEnd.x, turretEnd.y, this.height, -1118482);
        game.audio.playSound(AudioEngine.lighting_burst, 0.2f, this.x, this.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        if (m3661b()) {
            return 100.0f;
        }
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 110.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return 25 + (i * 10);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: f */
    public float mo2481f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        if (!isUnderwater()) {
            return 1.4f;
        }
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        if (!isUnderwater()) {
            return 3.8f;
        }
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.3f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: y */
    public float mo2433y(int i) {
        return 0.38f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bh */
    public boolean mo2515bh() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bi */
    public boolean mo2514bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: i */
    public void mo2471i(float f) {
        if (!m2643Y()) {
            super.mo2471i(f);
            return;
        }
        this.direction += f;
        if (this.direction > 180.0f) {
            this.direction -= 360.0f;
        }
        if (this.direction < -180.0f) {
            this.direction += 360.0f;
        }
    }

    /* renamed from: dn */
    public int m3659dn() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public float mo2836d(boolean z) {
        return this.f1532cC[m3659dn()].f1652a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ag */
    public boolean mo2563ag() {
        if (!isUnderwater()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ad */
    public boolean mo2566ad() {
        if (!isUnderwater()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ae */
    public boolean canAttackFly() {
        if (!isUnderwater()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: af */
    public boolean mo2564af() {
        if (!isUnderwater()) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2711a(Action action, boolean z) {
        if (action == f1805y) {
            this.f1789r = true;
        }
        if (action == f1806z) {
            this.f1789r = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        return f1807A;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
        super.mo420e(f);
        C0955y.m457a(this, getMaxAttackRange());
    }
}