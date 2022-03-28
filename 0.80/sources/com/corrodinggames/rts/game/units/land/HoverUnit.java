package com.corrodinggames.rts.game.units.land;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.EffectEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/land/HoverUnit.class */
public abstract class HoverUnit extends LandUnit {
    public static BitmapOrTexture IMAGE_ICON = null;
    public static BitmapOrTexture[] IMAGE_ICON_TEAMS = new BitmapOrTexture[8];
    float fallSpeed;
    float splashEffect;

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE_ICON = instance.graphics.loadImage(R.drawable.unit_icon_hover);
        for (int i = 0; i < IMAGE_ICON_TEAMS.length; i++) {
            IMAGE_ICON_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE_ICON.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.land.LandUnit, com.corrodinggames.rts.game.units.Unit
    public BitmapOrTexture getIcon() {
        return IMAGE_ICON_TEAMS[this.team.id];
    }

    @Override // com.corrodinggames.rts.game.units.land.LandUnit, com.corrodinggames.rts.game.units.Unit
    public Unit.MovementType getMovementType() {
        return Unit.MovementType.HOVER;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
        if (this.dead && isOverWater() && this.height > -10.0f) {
            this.fallSpeed += 0.002f * f;
            this.height -= this.fallSpeed * f;
        }
        if (isActive() && !this.dead && isOverWater()) {
            if (this.speed > 0.0f) {
                this.splashEffect += f;
            }
            if (this.splashEffect > 10.0f) {
                this.splashEffect = 0.0f;
                if (isOnScreen()) {
                    EffectEngine.EffectObject emitEffect = GameEngine.getInstance().effects.emitEffect((float) (this.x + (Math.cos(Math.toRadians(this.dir)) * 4.0d)), (float) (this.y + (Math.sin(Math.toRadians(this.dir)) * 4.0d)), 0.0f, EffectEngine.EffectType.custom, false);
                    if (emitEffect != null) {
                        emitEffect.stripIndex = 0;
                        emitEffect.frameIndex = 13;
                        emitEffect.drawLayer = 1;
                        emitEffect.fadeOut = true;
                        emitEffect.startingAlpha = 0.8f;
                        emitEffect.startTimer = 80.0f;
                        emitEffect.timer = 80.0f;
                        emitEffect.xSpeed = (float) ((-Math.cos(Math.toRadians(this.dir))) * 0.10000000149011612d);
                        emitEffect.ySpeed = (float) ((-Math.sin(Math.toRadians(this.dir))) * 0.10000000149011612d);
                    }
                }
            }
        }
    }
}
