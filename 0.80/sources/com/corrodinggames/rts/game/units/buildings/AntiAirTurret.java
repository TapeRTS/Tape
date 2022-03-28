package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Color;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/AntiAirTurret.class */
public class AntiAirTurret extends Turret {
    static BitmapOrTexture IMAGE_TURRET = null;
    static BitmapOrTexture IMAGE_ICON = null;
    static BitmapOrTexture[] IMAGE_ICON_TEAMS = new BitmapOrTexture[8];

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE_TURRET = instance.graphics.loadImage(R.drawable.anti_air_top);
        IMAGE_ICON = instance.graphics.loadImage(R.drawable.unit_icon_building_air_turrent);
        for (int i = 0; i < IMAGE_ICON_TEAMS.length; i++) {
            IMAGE_ICON_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE_ICON.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret, com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttackUnit(Unit unit) {
        return unit.isFlying();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret, com.corrodinggames.rts.game.units.buildings.Factory
    public void completeQueueItem(Factory.BuildQueueItem buildQueueItem) {
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret
    void drawTurret() {
        GameEngine instance = GameEngine.getInstance();
        this._srcRect.set(0, 0, IMAGE_TURRET.getWidth(), IMAGE_TURRET.getHeight());
        instance.graphics.drawImageCentered(IMAGE_TURRET, this._srcRect, this.x - GameEngine.getInstance().viewpointX_rounded, this.y - GameEngine.getInstance().viewpointY_rounded, this.turretDir, getBuildingPaint());
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret, com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        Projectile createProjectile = Projectile.createProjectile(this, this.x, this.y);
        createProjectile.color = Color.argb(255, 230, 230, 50);
        createProjectile.directDamage = 60.0f;
        createProjectile.target = unit;
        createProjectile.lifeTimer = 190.0f;
        createProjectile.speed = 4.0f;
        createProjectile.ballistic = true;
        createProjectile.ballistic_delaymove_height = 0.0f;
        createProjectile.ballistic_height = 0.0f;
        createProjectile.trailEffect = true;
        createProjectile.largeHitEffect = true;
        GameEngine.getInstance().audio.playSound(AudioEngine.missile_fire, 0.3f, this.x, this.y);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret, com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    public BitmapOrTexture getIcon() {
        return IMAGE_ICON_TEAMS[this.team.id];
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret, com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 270.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret, com.corrodinggames.rts.game.units.buildings.Factory, com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 80.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret, com.corrodinggames.rts.game.units.Unit
    public Unit.SpecialAction getSpecialAction(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret, com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.antiAirTurret;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Turret, com.corrodinggames.rts.game.units.Unit
    public int numSpecialActions() {
        return 0;
    }
}
