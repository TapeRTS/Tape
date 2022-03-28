package com.corrodinggames.rts.game.units;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/MovableUnit.class */
public abstract class MovableUnit extends OrderableUnit {
    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canMove() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public boolean isFlying() {
        return false;
    }
}
