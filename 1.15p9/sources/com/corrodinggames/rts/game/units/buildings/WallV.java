package com.corrodinggames.rts.game.units.buildings;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.d.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/w.class */
public class WallV extends AbstractC0498i {

    /* renamed from: a */
    static BitmapOrTexture f3566a = null;

    /* renamed from: b */
    static BitmapOrTexture[] f3567b = new BitmapOrTexture[10];

    /* renamed from: c */
    static BitmapOrTexture f3568c = null;

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3566a = gameEngine.graphics.loadImage(R.drawable.wall_v);
        f3568c = gameEngine.graphics.loadImage(R.drawable.wall_v);
        f3567b = Team.createBitmapForTeam(f3566a);
    }

    /* renamed from: d */
    public BitmapOrTexture m4216d() {
        if (this.isDead) {
            return f3568c;
        }
        if (this.team == null) {
            return f3567b[f3567b.length - 1];
        }
        return f3567b[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4215k() {
        return null;
    }

    /* renamed from: a */
    public void m4219a(int i) {
    }

    public WallV(boolean z) {
        super(z);
        m2878b(f3566a);
        this.radius = 15.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 700.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3566a;
        this.f3421n.m7208a(0, 0, 1, 0);
        this.f3422o.m7208a(0, 0, 1, 0);
    }

    /* renamed from: c */
    public UnitType m4214r() {
        return UnitType.f1768I;
    }
}
