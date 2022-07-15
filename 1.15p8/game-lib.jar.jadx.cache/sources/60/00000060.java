package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.d.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/w.class */
public class Wall extends Factory {

    /* renamed from: a */
    static BitmapOrTexture f3387a = null;

    /* renamed from: b */
    static BitmapOrTexture[] f3388b = new BitmapOrTexture[10];

    /* renamed from: c */
    static BitmapOrTexture f3389c = null;

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3387a = gameEngine.graphics.loadImage(R.drawable.wall_v);
        f3389c = gameEngine.graphics.loadImage(R.drawable.wall_v);
        f3388b = Team.createBitmapForTeam(f3387a);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return f3389c;
        }
        if (this.team == null) {
            return f3388b[f3388b.length - 1];
        }
        return f3388b[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
    }

    public Wall(boolean z) {
        super(z);
        m2331b(f3387a);
        this.radius = 15.0f;
        this.displayRadius = this.radius;
        this.maxHp = 700.0f;
        this.hp = this.maxHp;
        this.image = f3387a;
        this.footprint.set(0, 0, 1, 0);
        this.softFootprint.set(0, 0, 1, 0);
    }

    /* renamed from: c */
    public UnitType mo1775r() {
        return UnitType.wall_v;
    }
}