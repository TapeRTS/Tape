package com.corrodinggames.rts.game.units.buildings.Turrets;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/e.class */
public class C0462e extends AbstractC0460c {

    /* renamed from: b */
    final /* synthetic */ Turret turret;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462e(Turret turret) {
        super(turret);
        this.turret = turret;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: c */
    public String mo2994c() {
        return Turret.flamethrower;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public int mo2993d() {
        return UnitType.turret.getPrice() + Turret.f3219dM.getPrice();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public BitmapOrTexture mo2992d(int i) {
        BitmapOrTexture bitmapOrTexture;
        bitmapOrTexture = Turret.IMAGE_TURRET_FLAME;
        return bitmapOrTexture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo3001a() {
        return 155.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo2999a(int i) {
        return 5.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: b */
    public float mo2995b(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo2998a(Unit unit, int i) {
        PointF c = mo3002c(i);
        Projectile createProjectile = Projectile.createProjectile(this.turret, c.x, c.y);
        createProjectile.lifeTimer = 60.0f;
        createProjectile.speed = 3.0f + ((this.turret.f3197k * 13) % 2.0f);
        createProjectile.f1073aR = false;
        createProjectile.f963G = true;
        createProjectile.color = Color.argb(105, 255, 255, 255);
        createProjectile.f1051P = (short) 3;
        createProjectile.f1047x = 1.3f;
        PointF m3784a = unit.m3784a(c.x, c.y, createProjectile.speed, createProjectile.lifeTimer, mo3001a());
        createProjectile.f977aC = true;
        createProjectile.f1015m = true;
        createProjectile.f1016n = m3784a.x;
        createProjectile.f1017o = m3784a.y;
        createProjectile.f1016n += (-15) + ((this.turret.f3197k * 13) % 30);
        createProjectile.f1017o += (-15) + ((63 + (this.turret.f3197k * 33)) % 30);
        createProjectile.f6366ed = 3;
        createProjectile.f973Y = mo2995b(i);
        createProjectile.f974Z = 65.0f;
        createProjectile.f995aa = true;
        createProjectile.f959C = true;
        GameEngine game = GameEngine.getInstance();
        this.turret.f3197k++;
        if (this.turret.f3197k > 10) {
            this.turret.f3197k = 0;
            game.effects.emitSmalFlame(c.x, c.y, this.turret.height, this.turret.f1532cC[i].f1652a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: b */
    public int mo2996b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo2997a(AbstractC0460c abstractC0460c) {
        this.turret.maxHp += 900.0f;
        this.turret.hp += 900.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo3000a(float f) {
        if (this.turret.hp < this.turret.maxHp) {
            this.turret.hp += 0.15f * f;
            if (this.turret.hp > this.turret.maxHp) {
                this.turret.hp = this.turret.maxHp;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: e */
    public float mo3005e(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: f */
    public float mo3004f(int i) {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: g */
    public float mo2991g(int i) {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: h */
    public float mo3003h(int i) {
        return 0.0f;
    }
}