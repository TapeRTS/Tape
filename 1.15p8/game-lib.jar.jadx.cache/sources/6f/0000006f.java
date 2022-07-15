package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;

/* renamed from: com.corrodinggames.rts.game.units.d.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/i.class */
public abstract class Factory extends Building implements AbstractC0483l {

    /* renamed from: y */
    public static final Paint f3298y = new Paint();

    /* renamed from: z */
    C0482k f3299z = mo2902dp();

    /* renamed from: A */
    Rect _dst = new Rect();

    /* renamed from: B */
    Rect _src = new Rect();

    static {
        f3298y.m4717a(255, 0, 255, 0);
        f3298y.setStrokeWidth(1.5f);
        f3298y.mo935a(true);
    }

    public Factory(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeInt(this.f3247r);
        this.f3299z.m2930a(outputNetStream);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream stream) {
        if (stream.m1237b() >= 69) {
            mo2956Q(stream.readInt());
        }
        this.f3299z.m2929a(stream);
        super.mo427a(stream);
    }

    /* renamed from: dp */
    public C0482k mo2902dp() {
        return new C0482k(this);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: b */
    public void mo2914b(Item item) {
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: c */
    public boolean mo2913c(Item item) {
        return true;
    }

    /* renamed from: a */
    public void mo2873a(Item item) {
        float f;
        if (this.f3299z.f3316b != null) {
            f = this.radius * 2.0f;
        } else {
            f = this.radius * 3.0f;
        }
        Unit unit = this.f3299z.m2931a(item, f, false, 0.0f);
        if (unit != null) {
            if (unit.y - unit.radius < this.y + mo2877dq()) {
                unit.y = this.y + mo2877dq() + unit.radius;
            }
            Team.m3924c(unit);
        }
    }

    /* renamed from: dq */
    public int mo2877dq() {
        return -100;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: f */
    public int mo2907f(boolean z) {
        return this.f3299z.m2941a(Action.f1432h, z, true);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public final int mo2915a(C0202c c0202c, boolean z) {
        return this.f3299z.m2942a(c0202c, z);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: dr */
    public Item mo2912dr() {
        return this.f3299z.m2927b();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bC */
    public C0407b mo2524bC() {
        return this.f3299z.m2923c();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: ds */
    public ObjectVector mo2911ds() {
        return this.f3299z.f3317c;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: h */
    public int mo2906h(UnitType unitType) {
        return this.f3299z.m2934a(unitType);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: dt */
    public boolean mo2910dt() {
        return this.f3299z.m2944a();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: du */
    public void mo2909du() {
        this.f3299z.f3319e = 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2916a(PointF pointF) {
        this.f3299z.f3316b = pointF;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: dv */
    public boolean mo2908dv() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bT */
    public float getSecBar() {
        if (isActive() && !this.f3299z.m2944a()) {
            return this.f3299z.f3319e;
        }
        return super.getSecBar();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public Action mo2946e(UnitType unitType) {
        return this.f3299z.m2925b(unitType);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2711a(Action action, boolean z) {
        this.f3299z.m2938a(action, z, (PointF) null, (Unit) null);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public void mo2949b(Action action, boolean z) {
        this.f3299z.m2939a(action, z);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public void mo2950b(Action action) {
        this.f3299z.m2940a(action);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!isActive() || this.dead) {
            return;
        }
        this.f3299z.m2943a(f);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        return super.draw(f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bu */
    public void mo2502bu() {
        Team.m3960a((Unit) this);
        this.f3299z.m2928a(true);
        super.mo2502bu();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.PhysicalObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void remove() {
        Team.m3960a((Unit) this);
        this.f3299z.m2928a(true);
        super.remove();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit target, int i) {
        throw new RuntimeException("Unit cannot shoot");
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

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bY */
    public void mo2948bY() {
        if (this.f3299z.f3316b != null) {
            GameEngine game = GameEngine.getInstance();
            game.graphics.mo221a((int) (this.x - game.viewpointX_rounded), (int) (this.y - game.viewpointY_rounded), (int) (this.f3299z.f3316b.x - game.viewpointX_rounded), (int) (this.f3299z.f3316b.y - game.viewpointY_rounded), f3298y);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: dk */
    public int mo2947dk() {
        return this.f3299z.m2919f();
    }
}