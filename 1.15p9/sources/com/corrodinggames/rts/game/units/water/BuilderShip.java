package com.corrodinggames.rts.game.units.water;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/b.class */
public class BuilderShip extends AbstractC0590f implements InterfaceC0469d {

    /* renamed from: f */
    PointF[] f3808f;

    /* renamed from: g */
    PointF[] f3809g;

    /* renamed from: h */
    Rect f3810h;

    /* renamed from: a */
    static BitmapOrTexture f3811a = null;

    /* renamed from: b */
    static BitmapOrTexture f3812b = null;

    /* renamed from: c */
    static BitmapOrTexture f3813c = null;

    /* renamed from: d */
    static BitmapOrTexture f3814d = null;

    /* renamed from: e */
    static BitmapOrTexture[] f3815e = new BitmapOrTexture[10];

    /* renamed from: i */
    static Action f3816i = new C0218m(false);

    @Override // com.corrodinggames.rts.game.units.water.AbstractC0590f, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo5658v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return Builder.f3588h[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: q_ */
    public UnitType getUnitType() {
        return UnitType.f1771L;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3515b() {
        return this.f3808f;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3511c() {
        return this.f3809g;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3513bN() {
        return 6000.0f;
    }

    /* renamed from: K */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3812b = gameEngine.graphics.loadImage(R.drawable.builder_ship);
        f3811a = gameEngine.graphics.loadImage(R.drawable.builder_ship_dead);
        f3813c = gameEngine.graphics.loadImage(R.drawable.builder_ship_turret);
        f3815e = Team.createBitmapForTeam(f3812b);
        f3814d = m5883a(f3812b, f3812b.mo396m(), f3812b.mo397l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.isDead) {
            return f3811a;
        }
        return f3815e[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public BitmapOrTexture mo3507d(int i) {
        return f3813c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return f3814d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3525F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && this.height > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3524G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3522H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo5648e() {
        GameEngine.getInstance().effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = f3811a;
        setDrawLayer(0);
        this.collidable = false;
        return true;
    }

    public BuilderShip(boolean z) {
        super(z);
        this.f3808f = new PointF[6];
        this.f3809g = new PointF[this.f3808f.length];
        this.f3810h = new Rect();
        m2878b(f3812b);
        this.radius = 13.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 500.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3812b;
        for (int i = 0; i < this.f3808f.length; i++) {
            this.f3808f[i] = new PointF();
            this.f3809g[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float getTurnSpeed() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3528B() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 3.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3493w(int i) {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.water.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!this.isDead) {
            Builder.m4164a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo469a(float f, boolean z) {
        super.mo469a(f, z);
        if (!this.isDead) {
            Builder.m4158b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        C1117y.m487a((AbstractC0623y) this);
        if (!this.isDead) {
            float mo3505e = this.f1648cJ[0].f1716f / mo3505e(0);
            if (mo3505e != 0.0f) {
                PointF E = getTurretEnd(0);
                gameEngine.graphics.mo880i();
                gameEngine.graphics.mo896b(E.x - gameEngine.f6138cv, (E.y - gameEngine.f6139cw) - this.height);
                gameEngine.graphics.mo935a(mo3505e, mo3505e);
                if (m3227Y()) {
                    gameEngine.graphics.mo915a(Builder.f3586f, 0.0f, 0.0f, (Paint) null);
                } else {
                    gameEngine.graphics.mo915a(Builder.f3585e, 0.0f, 0.0f, (Paint) null);
                }
                gameEngine.graphics.mo879j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3499l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bl */
    public int mo3512bl() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo3523G(int i) {
        f3981bg.m7213a(this.f6951ek + (CommonUtils.m2249i(this.direction) * 8.0f), this.f6952el + (CommonUtils.sin(this.direction) * 8.0f));
        return f3981bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 120 - (i * 28);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3505e(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: f */
    public float mo3504f(int i) {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo3518a(Unit unit) {
        if (!unit.mo4203q() && unit.m5867bI()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3519a(Action action, boolean z) {
    }

    /* renamed from: a */
    public static void m3516a(ArrayList arrayList, int i) {
        arrayList.add(f3816i);
        arrayList.add(new C0227v(UnitType.f1734a, 1, 1));
        arrayList.add(new C0227v(UnitType.f1739f, 1, 2));
        arrayList.add(new C0227v(UnitType.f1740g, 1, 3));
        arrayList.add(new C0227v(UnitType.f1735b, 1, 4));
        arrayList.add(new C0227v(UnitType.f1736c, 1, 5));
        arrayList.add(new C0227v(UnitType.f1737d, 1, 6));
        arrayList.add(new C0227v(UnitType.f1769J, 1, 7));
        arrayList.add(new C0227v(UnitType.f1758y, 1, 8));
        arrayList.add(new C0227v(UnitType.f1761B, 1, 9));
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3520N() {
        return getUnitType().mo5716a(mo3230V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: y */
    public int mo3492y() {
        return 145;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: g */
    public boolean mo3501g(Unit unit, boolean z) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: f */
    public float mo3503f(InterfaceC0303as interfaceC0303as) {
        int mo3492y = mo3492y();
        int mo5715a = interfaceC0303as.mo5715a(this);
        if (mo5715a == 0 && interfaceC0303as.mo5699p()) {
            mo5715a = 110;
        }
        return mo3492y + mo5715a;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: u */
    public int mo3495u(Unit unit) {
        return (int) mo3503f(unit.getUnitType());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public int mo3494v(Unit unit) {
        return (int) mo3503f(unit.getUnitType());
    }
}
