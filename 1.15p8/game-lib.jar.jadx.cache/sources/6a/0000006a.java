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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/f.class */
public class C0463f extends AbstractC0460c {

    /* renamed from: b */
    final /* synthetic */ Turret f3227b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0463f(Turret turret) {
        super(turret);
        this.f3227b = turret;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: c */
    public String mo2994c() {
        return Turret.gunT2;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public int mo2993d() {
        return UnitType.turret.getPrice() + Turret.f3216dJ.getPrice();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public BitmapOrTexture mo2992d(int i) {
        BitmapOrTexture bitmapOrTexture;
        bitmapOrTexture = Turret.IMAGE_TURRET_L2;
        return bitmapOrTexture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo3001a() {
        return 185.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo2999a(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: b */
    public float mo2995b(int i) {
        return 44.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: g */
    public float mo2991g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: c */
    public PointF mo3002c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.getTurretEnd(i);
        float f = (this.f3227b.isFixedFiring() ? this.f3227b.direction : this.f3227b.f1532cC[i].f1652a) + (this.f3227b.f3197k == 1 ? -90 : 90);
        E.x += CommonUtils.cos(f) * 4.0f;
        E.y += CommonUtils.sin(f) * 4.0f;
        return E;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo2998a(Unit unit, int i) {
        PointF mo3002c = mo3002c(i);
        Projectile createProjectile = Projectile.createProjectile(this.f3227b, mo3002c.x, mo3002c.y);
        PointF J = this.f3227b.mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 60.0f;
        createProjectile.speed = 6.0f;
        createProjectile.color = Color.argb(255, 40, 30, 110);
        createProjectile.directDamage = mo2995b(i);
        createProjectile.f1051P = (short) 5;
        createProjectile.f1047x = 1.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(mo3002c.x, mo3002c.y, this.f3227b.height, -1127220);
        gameEngine.effects.emitSmalFlame(mo3002c.x, mo3002c.y, this.f3227b.height, this.f3227b.f1532cC[i].f1652a);
        gameEngine.audio.m2416a(AudioEngine.f3874t, 0.3f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), mo3002c.x, mo3002c.y);
        this.f3227b.f3197k = this.f3227b.f3197k == 1 ? 0 : 1;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: b */
    public int mo2996b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo2997a(AbstractC0460c abstractC0460c) {
        this.f3227b.maxHp += 400.0f;
        this.f3227b.hp += 400.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo3000a(float f) {
        this.f3227b.mo3012s(f);
    }
}