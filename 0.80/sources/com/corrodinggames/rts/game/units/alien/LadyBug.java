package com.corrodinggames.rts.game.units.alien;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.land.LandUnit;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EffectEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/alien/LadyBug.class */
public class LadyBug extends LandUnit {
    static BitmapOrTexture IMAGE_WREAK = null;
    static BitmapOrTexture IMAGE = null;
    static BitmapOrTexture IMAGE_TURRET = null;
    static BitmapOrTexture[] IMAGE_TEAMS = new BitmapOrTexture[8];
    int drawFrame = 0;
    float attackedTimer = 0.0f;
    Rect _temp = new Rect();
    Rect _srcRect = new Rect();

    public LadyBug() {
        this.objectWidth = 17;
        this.objectHeight = 26;
        this.radius = 3.0f;
        this.displayRadius = this.radius + 5.0f;
        this.maxHp = 130.0f;
        this.hp = this.maxHp;
        this.image = IMAGE;
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE = instance.graphics.loadImage(R.drawable.ladybug);
        for (int i = 0; i < IMAGE_TEAMS.length; i++) {
            IMAGE_TEAMS[i] = instance.graphics.loadImage(Team.createBitmapForTeam(IMAGE.bitmap, i));
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttack() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttackUnit(Unit unit) {
        return !unit.isFlying();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean destroyEffectAndWreak() {
        GameEngine instance = GameEngine.getInstance();
        instance.effects.emitEffect(this.x, this.y, this.height, EffectEngine.EffectType.blood, false);
        instance.audio.playSound(AudioEngine.bug_die, 0.8f, this.x, this.y);
        ScorchMark.create(this, 1);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
        if (shouldDrawCheck()) {
            super.draw(f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        Projectile.damageUnit(this, unit, 14);
        this.attackedTimer = 4.0f;
        PointF turretEnd = getTurretEnd();
        GameEngine.getInstance().audio.playSound(AudioEngine.bug_attack, 0.3f, turretEnd.x, turretEnd.y);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public Rect getImageSrcRect(boolean z) {
        int i = this.drawFrame * this.objectWidth;
        this._temp.set(i, 0, this.objectWidth + i, this.objectHeight + 0);
        return this._temp;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 43.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveAccelerationSpeed() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveDecelerationSpeed() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public int getMoveSlidingDir() {
        return 181;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMoveSpeed() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 17.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurnSpeed() {
        return 5.5f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurretSize() {
        return 7.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public UnitType getUnitType() {
        return UnitType.ladybug;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean isFixedFiring() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void setTeam(int i) {
        if (this instanceof LadyBug) {
            this.image = IMAGE_TEAMS[i];
        }
        super.setTeam(i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
        if (this.moving) {
            if (this.drawFrame == 0) {
                this.drawFrame = 1;
            } else {
                this.drawFrame = 0;
            }
        }
        if (this.attackedTimer != 0.0f) {
            this.attackedTimer = CommonUtils.toZero(this.attackedTimer, f);
            this.drawFrame = 2;
        }
    }
}
