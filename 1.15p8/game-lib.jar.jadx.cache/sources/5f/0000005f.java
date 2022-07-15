package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e.class */
public class Crystal extends Building {

    /* renamed from: b */
    float f3392b;

    /* renamed from: a */
    static BitmapOrTexture IMAGE = null;

    /* renamed from: c */
    static PorterDuffColorFilter f3391c = new PorterDuffColorFilter(Color.m4733a(200, 200, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: b */
    public UnitType mo1775r() {
        return UnitType.crystalResource;
    }

    /* renamed from: c */
    public static void load() {
        IMAGE = GameEngine.getInstance().graphics.loadImage(R.drawable.crystal);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        return IMAGE;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
    }

    public Crystal(boolean z) {
        super(z);
        this.image = IMAGE;
        m2331b(IMAGE);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 600.0f;
        this.hp = this.maxHp;
        setDrawLayer(1);
        this.footprint.set(0, -1, 0, 0);
        this.softFootprint.m4664a(this.footprint);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building
    /* renamed from: f */
    public Paint mo2863f() {
        return super.mo2863f();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        this.f3392b += 0.01f * f;
        if (this.f3392b > 1.0f) {
            this.f3392b -= 1.0f;
            if (this.f3392b > 1.0f) {
                this.f3392b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: g */
    public float mo2862g() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public MovementType getMovementType() {
        return MovementType.f1643a;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo2676i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: p_ */
    public boolean isOnScreen() {
        GameEngine game = GameEngine.getInstance();
        f1586dl.m4650a(m3753cC());
        return RectF.m4649a(game.f5957cL, f1586dl);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: n */
    public void mo2861n() {
        super.mo2861n();
        this.f3392b = ((this.y * 5.0f) + (this.x * 3.0f)) % 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: o */
    public boolean mo2860o() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: p */
    public boolean mo2859p() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: q */
    public boolean mo2858q() {
        return true;
    }
}