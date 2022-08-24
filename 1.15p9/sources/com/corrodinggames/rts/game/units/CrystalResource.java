package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.buildings.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e.class */
public class CrystalResource extends AbstractC0488d {

    /* renamed from: b */
    float f3569b;

    /* renamed from: a */
    static BitmapOrTexture f3570a = null;

    /* renamed from: c */
    static PorterDuffColorFilter f3571c = new PorterDuffColorFilter(Color.m7292a(200, 200, 200), PorterDuff.Mode.MULTIPLY);

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.f1767H;
    }

    /* renamed from: c */
    public static void load() {
        f3570a = GameEngine.getInstance().graphics.loadImage(R.drawable.crystal);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture mo4208d() {
        return f3570a;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0488d, com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo5647e() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo4214a(int i) {
    }

    public CrystalResource(boolean z) {
        super(z);
        this.image = f3570a;
        m2878b(f3570a);
        this.radius = 11.0f;
        this.displayRadius = this.radius + 1.0f;
        this.f1632ct = 600.0f;
        this.f1631cs = this.f1632ct;
        setDrawLayer(1);
        this.f3421n.m7217a(0, -1, 0, 0);
        this.f3422o.m7216a(this.f3421n);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0488d
    /* renamed from: f */
    public Paint mo4207f() {
        return super.mo4207f();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        this.f3569b += 0.01f * f;
        if (this.f3569b > 1.0f) {
            this.f3569b -= 1.0f;
            if (this.f3569b > 1.0f) {
                this.f3569b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: g */
    public float mo4206g() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0488d, com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public EnumC0246ao mo5644h() {
        return EnumC0246ao.f1702a;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0488d, com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo3296i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: p_ */
    public boolean mo3028p_() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1683ds.m7202a(m5854cD());
        return RectF.m7201a(gameEngine.f6243cL, f1683ds);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public BitmapOrTexture mo4204k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo4203m() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo4211b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo4209c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo4213a(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: n */
    public void mo4202n() {
        super.mo4202n();
        this.f3569b = ((this.f6952el * 5.0f) + (this.f6951ek * 3.0f)) % 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: o */
    public boolean mo4201o() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: p */
    public boolean mo4200p() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: q */
    public boolean mo4199q() {
        return true;
    }
}
