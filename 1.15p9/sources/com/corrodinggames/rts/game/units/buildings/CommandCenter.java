package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/e.class */
public class CommandCenter extends AbstractC0498i {

    /* renamed from: a */
    static BitmapOrTexture f3427a = null;

    /* renamed from: b */
    static BitmapOrTexture[] f3428b = new BitmapOrTexture[10];

    /* renamed from: c */
    static BitmapOrTexture f3429c = null;

    /* renamed from: d */
    static BitmapOrTexture f3430d = null;

    /* renamed from: e */
    float f3431e;

    /* renamed from: f */
    public float f3432f;

    /* renamed from: g */
    public float f3433g;

    /* renamed from: h */
    public int f3434h;

    /* renamed from: i */
    public float f3435i;

    /* renamed from: j */
    public float f3436j;

    /* renamed from: k */
    float f3437k;

    /* renamed from: l */
    int f3438l;

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0498i, com.corrodinggames.rts.game.units.buildings.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3431e);
        super.mo466a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0498i, com.corrodinggames.rts.game.units.buildings.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3431e = c0876k.m1453g();
        super.mo2877a(c0876k);
    }

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3427a = gameEngine.graphics.loadImage(R.drawable.base);
        f3429c = gameEngine.graphics.loadImage(R.drawable.base_dead);
        f3430d = gameEngine.graphics.loadImage(R.drawable.base_back);
        f3428b = Team.createBitmapForTeam(f3427a);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType getUnitType() {
        return UnitType.f1738e;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0488d
    /* renamed from: K */
    public boolean mo4503K() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.image = f3429c;
        this.f3420m = null;
        setDrawLayer(0);
        this.collidable = false;
        m3208a(EnumC0233ab.f1504d);
        float f = this.f6951ek;
        float f2 = this.f6952el;
        gameEngine.effects.m2536b(EnumC0748h.f4830e);
        C0745e emitLight = gameEngine.effects.emitLight(f, f2, this.height, Color.argb(255, 255, 255, 255));
        if (emitLight != null) {
            emitLight.f4730H = 8.0f;
            emitLight.f4729G = 5.0f;
            emitLight.f4728F = 0.9f;
            emitLight.f4745W = 20.0f;
            emitLight.f4746X = emitLight.f4745W;
            emitLight.f4720s = true;
        }
        gameEngine.effects.m2536b(EnumC0748h.f4830e);
        C0745e m2533c = gameEngine.effects.m2533c(f, f2, 0.0f, -1127220);
        if (m2533c != null) {
            m2533c.f4730H = 0.2f;
            m2533c.f4729G = 2.0f;
            m2533c.f4786ar = (short) 2;
            m2533c.f4745W = 45.0f;
            m2533c.f4746X = m2533c.f4745W;
            m2533c.f4744V = 0.0f;
        }
        gameEngine.effects.m2561a(this.f6951ek, this.f6952el, this.height, 40.0f, 70.0f);
        C0746f.m2519a(this.f6951ek, this.f6952el);
        C0746f.m2512b(this.f6951ek, this.f6952el).f4789a = 800.0f;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo4214a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: S */
    public void mo4502S() {
        super.mo4502S();
        if (this.isDead) {
            this.f3420m = null;
        } else {
            this.f3420m = f3430d;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture mo4208d() {
        if (this.isDead) {
            return f3429c;
        }
        return f3428b[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public BitmapOrTexture mo4204k() {
        return null;
    }

    public CommandCenter(boolean z) {
        super(z);
        this.f3437k = 20.0f;
        this.f3438l = 0;
        this.image = f3427a;
        this.f3420m = f3430d;
        m2884T(53);
        m2883U(68);
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 4000.0f;
        this.f1631cs = this.f1632ct;
        setDrawLayer(3);
        this.f3421n.m7217a(-1, -1, 1, 1);
        this.f3422o.m7217a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cE */
    public RectF mo4494cE() {
        RectF cE = super.mo4494cE();
        cE.m7205a(6.0f, 0.0f);
        return cE;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        GameEngine.getInstance();
        super.update(f);
        if (!isActive() || this.isDead) {
            return;
        }
        this.f3437k = CommonUtils.m2368a(this.f3437k, f);
        if (this.f3437k == 0.0f) {
            this.f3437k = 5.0f;
            this.f3438l++;
            if (this.f3438l > 6) {
                this.f3438l = 0;
                this.f3437k = 70.0f;
            }
            if (this.f3438l <= 3) {
                this.f3426s = this.f3438l;
            } else {
                this.f3426s = 6 - this.f3438l;
            }
        }
        this.f3432f += f;
        this.f3434h++;
        this.f3435i += 10.0f;
        if (this.f3436j > f) {
            this.f3436j = f;
        }
        this.f3433g += f;
        this.f3431e += f;
        if (this.f3431e > Team.f1377ao - 0.1f) {
            this.f3431e -= Team.f1377ao;
            this.team.m6385b(mo4493cw() * (Team.f1377ao / Team.f1376an));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cw */
    public float mo4493cw() {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo4492q(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo4213a(Unit unit, int i) {
        Projectile m6519a = Projectile.m6519a(this, this.f6951ek, this.f6952el);
        PointF K = m3241K(i);
        m6519a.x = K.x;
        m6519a.y = K.y;
        m6519a.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m6519a.directDamage = mo4492q(i);
        m6519a.target = unit;
        m6519a.lifeTimer = 180.0f;
        m6519a.speed = 2.0f;
        m6519a.f991r = 5.0f;
        m6519a.f1058aH = true;
        m6519a.f1063aM = true;
        m6519a.f1067aQ = true;
        m6519a.f1057aG = true;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2549a(m6519a, -1118720);
        gameEngine.audio.m3004a(AudioEngine.f4042m, 0.8f, this.f6951ek, this.f6952el);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo4203m() {
        return 280.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo4211b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo4209c(int i) {
        return 999.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public boolean mo4498b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0498i, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return true;
    }

    /* renamed from: a */
    public static void m4500a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(UnitType.f1741h, 1));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3520N() {
        return getUnitType().mo5728a(mo3233V());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo4501a(Unit unit, float f, Projectile projectile) {
        if (f > 2500.0f) {
            f = 2500.0f;
        }
        return super.mo4501a(unit, f, projectile);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bJ */
    public boolean mo4497bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo3531e(float f) {
        super.mo3531e(f);
        C1117y.m495a(this, mo4203m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: s */
    public int mo4491s() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bp */
    public int mo4496bp() {
        return 35;
    }
}
