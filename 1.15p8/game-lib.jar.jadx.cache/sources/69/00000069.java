package com.corrodinggames.rts.game.units.buildings.Turrets;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/g.class */
public class C0464g extends AbstractC0460c {

    /* renamed from: b */
    final /* synthetic */ Turret f3228b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0464g(Turret turret) {
        super(turret);
        this.f3228b = turret;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: c */
    public String mo2994c() {
        return Turret.gunT3;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public int mo2993d() {
        return UnitType.turret.getPrice() + Turret.f3216dJ.getPrice() + Turret.f3217dK.getPrice();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public BitmapOrTexture mo2992d(int i) {
        BitmapOrTexture bitmapOrTexture;
        bitmapOrTexture = Turret.IMAGE_TURRET_L3;
        return bitmapOrTexture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo3001a() {
        return 320.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo2999a(int i) {
        return 13.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: b */
    public float mo2995b(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: c */
    public PointF mo3002c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.getTurretEnd(i);
        float f = (this.f3228b.isFixedFiring() ? this.f3228b.direction : this.f3228b.f1532cC[i].f1652a) + (this.f3228b.f3197k == 1 ? -90 : 90);
        E.x += CommonUtils.cos(f) * 4.0f;
        E.y += CommonUtils.sin(f) * 4.0f;
        return E;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo2998a(Unit unit, int i) {
        PointF mo3002c = mo3002c(i);
        Projectile createProjectile = Projectile.createProjectile(this.f3228b, mo3002c.x, mo3002c.y);
        PointF J = this.f3228b.mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 60.0f;
        createProjectile.speed = 9.0f;
        createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 30, 30);
        createProjectile.directDamage = mo2995b(i);
        createProjectile.f1051P = (short) 5;
        createProjectile.f1047x = 1.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(mo3002c.x, mo3002c.y, this.f3228b.height, -1127220);
        gameEngine.effects.emitSmalFlame(mo3002c.x, mo3002c.y, this.f3228b.height, this.f3228b.f1532cC[i].f1652a);
        gameEngine.audio.m2416a(AudioEngine.f3874t, 0.15f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), mo3002c.x, mo3002c.y);
        this.f3228b.f3197k = this.f3228b.f3197k == 1 ? 0 : 1;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo3000a(float f) {
        if (this.f3228b.hp < this.f3228b.maxHp) {
            this.f3228b.hp += 0.1f * f;
            if (this.f3228b.hp > this.f3228b.maxHp) {
                this.f3228b.hp = this.f3228b.maxHp;
            }
        }
        this.f3228b.mo3012s(f);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: b */
    public int mo2996b() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo2997a(AbstractC0460c abstractC0460c) {
        if (!(abstractC0460c instanceof C0463f)) {
            this.f3228b.maxHp += 400.0f;
            this.f3228b.hp += 400.0f;
        }
        this.f3228b.maxHp += 2800.0f;
        this.f3228b.hp += 2800.0f;
    }
}