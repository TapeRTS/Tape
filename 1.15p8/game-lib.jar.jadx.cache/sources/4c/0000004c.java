package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/r.class */
public abstract class DummyUnit extends OrderableUnit {
    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        return Builder.f3403b;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        return false;
    }

    public DummyUnit(boolean z) {
        super(z);
        setObjectWidth(20);
        setObjectHeight(20);
        this.radius = 1.0f;
        this.displayRadius = this.radius;
        this.collidable = false;
        this.maxHp = 100.0f;
        this.hp = this.maxHp;
        this.image = Builder.f3403b;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c_ */
    public void mo2680c_() {
        this.collidable = false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo431a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: f */
    public float mo2481f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 4.8f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public boolean isFixedFiring() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2661G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2659H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: u */
    public boolean mo1773u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public boolean mo2679d(Unit unit) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: I */
    public boolean mo2657I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: J */
    public boolean mo2684J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo2681a(Unit unit, float f, Projectile projectile) {
        return super.mo2681a(unit, 0.0f, projectile);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: O */
    public boolean mo2683O() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: P */
    public boolean isUnderwater() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo2676i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public MovementType getMovementType() {
        return MovementType.f1646d;
    }
}