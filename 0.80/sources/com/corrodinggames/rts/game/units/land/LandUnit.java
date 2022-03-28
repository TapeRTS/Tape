package com.corrodinggames.rts.game.units.land;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.MovableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/land/LandUnit.class */
public abstract class LandUnit extends MovableUnit {
    public static BitmapOrTexture IMAGE_ICON = null;
    public static BitmapOrTexture[] IMAGE_ICON_TEAMS = new BitmapOrTexture[8];

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE_ICON = instance.graphics.loadImage(R.drawable.unit_icon_land);
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
        return Unit.MovementType.LAND;
    }
}
