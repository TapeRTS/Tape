package com.corrodinggames.rts.game.units.air;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.MovableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/air/AirUnit.class */
public abstract class AirUnit extends MovableUnit {
    public static BitmapOrTexture IMAGE_ICON = null;
    public static BitmapOrTexture[] IMAGE_ICON_TEAMS = new BitmapOrTexture[8];
    float fallSpeed;
    boolean hitGround = false;

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE_ICON = instance.graphics.loadImage(R.drawable.unit_icon_air);
        for (int i = 0; i < IMAGE_ICON_TEAMS.length; i++) {
            IMAGE_ICON_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE_ICON.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public BitmapOrTexture getIcon() {
        return IMAGE_ICON_TEAMS[this.team.id];
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public Unit.MovementType getMovementType() {
        return Unit.MovementType.AIR;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
        GameEngine instance = GameEngine.getInstance();
        if (!this.dead) {
            return;
        }
        if (this.height > 0.0f) {
            this.fallSpeed += 0.08f * f;
            this.height -= this.fallSpeed * f;
        } else if (!this.hitGround) {
            this.height = 0.0f;
            this.fallSpeed = 0.0f;
            this.hitGround = true;
            instance.effects.emitSmallExplosion(this.x, this.y, this.height);
            leaveScorchMark();
        } else if (isOverWater() && this.height > -10.0f) {
            this.fallSpeed += 0.002f * f;
            this.height -= this.fallSpeed * f;
        }
    }
}
