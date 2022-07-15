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
/* renamed from: com.corrodinggames.rts.game.units.d.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/h.class */
public class C0465h extends AbstractC0460c {

    /* renamed from: b */
    final /* synthetic */ Turret turret;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0465h(Turret turret) {
        super(turret);
        this.turret = turret;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: c */
    public String mo2994c() {
        return Turret.gun;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public int mo2993d() {
        return UnitType.turret.getPrice();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public BitmapOrTexture mo2992d(int i) {
        BitmapOrTexture bitmapOrTexture;
        bitmapOrTexture = Turret.IMAGE_TURRET;
        return bitmapOrTexture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo3001a() {
        return 165.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: b */
    public float mo2995b(int i) {
        return 41.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo2999a(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: g */
    public float mo2991g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo2998a(Unit unit, int i) {
        PointF c = mo3002c(i);
        Projectile createProjectile = Projectile.createProjectile(this.turret, c.x, c.y);
        PointF J = this.turret.mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 60.0f;
        createProjectile.speed = 5.0f;
        createProjectile.color = Color.argb(255, 100, 30, 30);
        createProjectile.directDamage = mo2995b(i);
        createProjectile.f1051P = (short) 5;
        createProjectile.f1047x = 1.0f;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitLight(c.x, c.y, this.turret.height, -1127220);
        gameEngine.effects.emitSmalFlame(c.x, c.y, this.turret.height, this.turret.f1532cC[i].f1652a);
        gameEngine.audio.m2416a(AudioEngine.f3874t, 0.3f, 1.0f + CommonUtils.rnd(-0.07f, 0.07f), c.x, c.y);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: b */
    public int mo2996b() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo2997a(AbstractC0460c abstractC0460c) {
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo3000a(float f) {
        this.turret.mo3012s(f);
    }
}