package com.corrodinggames.rts.game.units.buildings.Turrets;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/d.class */
public class C0461d extends AbstractC0460c {

    /* renamed from: b */
    final /* synthetic */ Turret f3225b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461d(Turret turret) {
        super(turret);
        this.f3225b = turret;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: c */
    public String mo2994c() {
        return Turret.artillery;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public int mo2993d() {
        return UnitType.turret.getPrice() + Turret.f3218dL.getPrice();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: d */
    public BitmapOrTexture mo2992d(int i) {
        BitmapOrTexture bitmapOrTexture;
        bitmapOrTexture = Turret.IMAGE_TURRET_ART;
        return bitmapOrTexture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo3001a() {
        return 350.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public float mo2999a(int i) {
        return 220.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: b */
    public float mo2995b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: a */
    public void mo2998a(Unit unit, int i) {
        PointF c = mo3002c(i);
        Projectile createProjectile = Projectile.createProjectile(this.f3225b, c.x, c.y);
        PointF J = this.f3225b.mo2655J(i);
        createProjectile.x = J.x;
        createProjectile.y = J.y;
        createProjectile.lifeTimer = 150.0f;
        createProjectile.speed = 4.0f;
        createProjectile.f987aQ = true;
        createProjectile.color = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        createProjectile.f1053R = (short) 2;
        createProjectile.f1051P = (short) 0;
        createProjectile.f1047x = 0.9f;
        PointF m3784a = unit.m3784a(c.x, c.y, createProjectile.speed, createProjectile.lifeTimer, mo3001a());
        createProjectile.f977aC = true;
        createProjectile.f1015m = true;
        createProjectile.f1016n = m3784a.x;
        createProjectile.f1017o = m3784a.y;
        createProjectile.f973Y = mo2995b(i);
        createProjectile.f974Z = 55.0f;
        createProjectile.f995aa = true;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.playSound(AudioEngine.cannon_firing, 0.3f, c.x, c.y);
        gameEngine.effects.emitSmalFlame(c.x, c.y, this.f3225b.height, this.f3225b.f1532cC[i].f1652a);
        gameEngine.effects.m2223a(createProjectile, -1118482);
        EffectObject emitLight = gameEngine.effects.emitLight(c.x, c.y, this.f3225b.height, -1118482);
        if (emitLight != null) {
            emitLight.timer = 15.0f;
            emitLight.startTimer = emitLight.timer;
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
        this.f3225b.maxHp += 300.0f;
        this.f3225b.hp += 300.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: e */
    public float mo3005e(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: f */
    public float mo3004f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turrets.AbstractC0460c
    /* renamed from: h */
    public float mo3003h(int i) {
        return -2.0f;
    }
}