package com.corrodinggames.rts.game.units.air;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/a.class */
public class AirShip extends AbstractC0309b {

    /* renamed from: a */
    static BitmapOrTexture f1833a = null;

    /* renamed from: b */
    static BitmapOrTexture f1834b = null;

    /* renamed from: c */
    static BitmapOrTexture f1835c = null;

    /* renamed from: d */
    static BitmapOrTexture f1836d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f1837e = new BitmapOrTexture[10];

    /* renamed from: f */
    float f1838f;

    /* renamed from: g */
    Rect f1839g;

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.f1746m;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1834b = gameEngine.graphics.loadImage(R.drawable.ship);
        f1835c = gameEngine.graphics.loadImage(R.drawable.ship_shadow);
        f1833a = gameEngine.graphics.loadImage(R.drawable.ship_dead);
        f1837e = Team.createBitmapForTeam(f1834b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.isDead) {
            return f1833a;
        }
        return f1837e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f1835c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture mo3507d(int i) {
        return f1836d;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0309b, com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo5648e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f1833a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public AirShip(boolean z) {
        super(z);
        this.f1839g = new Rect();
        m2884T(24);
        m2883U(22);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 0.0f;
        this.f1632ct = 250.0f;
        this.f1631cs = this.f1632ct;
        this.image = f1834b;
        this.shadowImage = f1835c;
        this.height = 0.0f;
        this.f1838f = 0.18f;
        setDrawLayer(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: I */
    public boolean mo3295I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo3293i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.air.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.isDead) {
            return;
        }
        this.height = CommonUtils.m2367a(this.height, 20.0f, 0.3f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        PointF E = getTurretEnd(i);
        Projectile createProjectile = Projectile.createProjectile(this, E.x, E.y, this.height, i);
        PointF K = m3238K(i);
        createProjectile.x = K.x;
        createProjectile.y = K.y;
        createProjectile.directDamage = 30.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 75.0f;
        createProjectile.speed = 6.0f;
        createProjectile.f997x = 2.0f;
        createProjectile.f998y = 4.0f;
        createProjectile.color = Color.argb(250, 74, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 255);
        GameEngine gameEngine = GameEngine.getInstance();
        C0745e m2562a = gameEngine.effects.m2562a(E.x, E.y, this.height, this.f1648cJ[i].f1711a);
        if (m2562a != null) {
            m2562a.f4763aq = 10;
        }
        gameEngine.audio.m3003a(AudioEngine.f4054y, 0.14f, 1.0f + CommonUtils.rnd(-0.1f, 0.1f), E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float getMoveSpeed() {
        if (this.height < 15.0f) {
            return 0.0f;
        }
        return 2.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float getTurnSpeed() {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3528B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bm */
    public boolean mo5661bm() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3493w(int i) {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean isFixedFiring() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.16f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean canAttackFly() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ag */
    public boolean mo5652ag() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bi */
    public boolean mo3999bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bj */
    public boolean mo3998bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public float mo3996d(boolean z) {
        return this.f1648cJ[0].f1711a + 90.0f;
    }
}
