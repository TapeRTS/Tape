package com.corrodinggames.rts.game.units.land;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.e.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/b.class */
public class Builder extends AbstractC0529j implements InterfaceC0469d {

    /* renamed from: i */
    PointF[] f3576i;

    /* renamed from: j */
    PointF[] f3577j;

    /* renamed from: k */
    static Paint f3578k;

    /* renamed from: l */
    static Paint f3579l;

    /* renamed from: m */
    static Paint f3580m;

    /* renamed from: a */
    static BitmapOrTexture f3581a = null;

    /* renamed from: b */
    public static BitmapOrTexture f3582b = null;

    /* renamed from: c */
    static BitmapOrTexture f3583c = null;

    /* renamed from: d */
    public static BitmapOrTexture[] f3584d = new BitmapOrTexture[10];

    /* renamed from: e */
    public static BitmapOrTexture f3585e = null;

    /* renamed from: f */
    public static BitmapOrTexture f3586f = null;

    /* renamed from: g */
    static BitmapOrTexture f3587g = null;

    /* renamed from: h */
    public static BitmapOrTexture[] f3588h = new BitmapOrTexture[10];

    /* renamed from: n */
    static Action f3589n = new C0218m(false);

    /* renamed from: f */
    public UnitType m4143r() {
        return UnitType.f1741h;
    }

    /* renamed from: b */
    public PointF[] mo3515b() {
        return this.f3576i;
    }

    /* renamed from: c */
    public PointF[] mo3511c() {
        return this.f3577j;
    }

    /* renamed from: v */
    public BitmapOrTexture m4142v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3588h[this.team.getId()];
    }

    /* renamed from: K */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3581a = gameEngine.graphics.loadImage(R.drawable.builder);
        f3582b = gameEngine.graphics.loadImage(R.drawable.builder_dead);
        f3583c = m5883a(f3581a, f3581a.mo396m(), f3581a.mo397l());
        f3584d = Team.createBitmapForTeam(f3581a);
        f3585e = gameEngine.graphics.loadImage(R.drawable.builder_charge);
        f3586f = gameEngine.graphics.loadImage(R.drawable.builder_decharge);
        f3587g = gameEngine.graphics.loadImage(R.drawable.unit_icon_builder);
        f3588h = Team.createBitmapForTeam(f3587g);
    }

    /* renamed from: a */
    public boolean m4161a(Unit unit) {
        if (!unit.mo4203q() && unit.m5867bI()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public BitmapOrTexture m4154d() {
        if (this.isDead) {
            return f3582b;
        }
        return f3584d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4146k() {
        return f3583c;
    }

    /* renamed from: d */
    public BitmapOrTexture m4153d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m4152e() {
        GameEngine.getInstance();
        this.image = f3582b;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1502b);
        return true;
    }

    public Builder(boolean z) {
        super(z);
        this.f3576i = new PointF[6];
        this.f3577j = new PointF[this.f3576i.length];
        f3578k = new Paint();
        f3578k.m7267a(40, 0, 255, 0);
        f3578k.m7248a(true);
        f3578k.m7270a(2.0f);
        f3578k.m7262a(Paint.Cap.ROUND);
        f3579l = new Paint();
        f3579l.m7259a(f3578k);
        f3579l.m7267a(55, 255, 60, 60);
        f3580m = new Paint();
        f3580m.m7267a(60, 255, 255, 255);
        m2884T(20);
        m2883U(20);
        this.radius = 10.0f;
        this.displayRadius = this.radius + 2.0f;
        this.f1632ct = 170.0f;
        this.f1631cs = this.f1632ct;
        this.image = f3581a;
        for (int i = 0; i < this.f3576i.length; i++) {
            this.f3576i[i] = new PointF();
            this.f3577j[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m4164a(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        PointF[] mo3515b = interfaceC0469d.mo3515b();
        PointF[] mo3511c = interfaceC0469d.mo3511c();
        Unit m3228X = abstractC0623y.m3228X();
        abstractC0623y.f3961aM = m3228X != null;
        if (m3228X != null) {
            for (int i = 0; i < mo3515b.length; i++) {
                PointF pointF = mo3515b[i];
                PointF pointF2 = mo3511c[i];
                pointF.x = CommonUtils.m2367a(pointF.x, pointF2.x, 0.1f * f);
                pointF.y = CommonUtils.m2367a(pointF.y, pointF2.y, 0.1f * f);
                pointF.x += (pointF2.x - pointF.x) * 0.04f * f;
                pointF.y += (pointF2.y - pointF.y) * 0.04f * f;
                float f2 = m3228X.radius * 0.75f;
                if (CommonUtils.m2294c(pointF.x - pointF2.x) < 1.0f) {
                    pointF2.x = CommonUtils.m2282d(-f2, f2);
                }
                if (CommonUtils.m2294c(pointF.y - pointF2.y) < 1.0f) {
                    pointF2.y = CommonUtils.m2282d(-f2, f2);
                }
            }
        } else if (mo3515b[0].x != 0.0f || mo3515b[0].y != 0.0f) {
            for (int i2 = 0; i2 < mo3515b.length; i2++) {
                PointF pointF3 = mo3515b[i2];
                PointF pointF4 = mo3511c[i2];
                pointF3.x = 0.0f;
                pointF3.y = 0.0f;
                pointF4.x = 0.0f;
                pointF4.y = 0.0f;
            }
        }
    }

    /* renamed from: b */
    public static void m4158b(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        Unit m3228X = abstractC0623y.m3228X();
        if (m3228X != null) {
            boolean m3227Y = abstractC0623y.m3227Y();
            if (!m3227Y && abstractC0623y.f3962aN) {
                return;
            }
            GameEngine gameEngine = GameEngine.getInstance();
            PointF[] mo3515b = interfaceC0469d.mo3515b();
            Paint paint = f3578k;
            if (m3227Y) {
                paint = f3579l;
            }
            C1080ai m3091bn = abstractC0623y.m3091bn();
            for (PointF pointF : mo3515b) {
                float f2 = (m3228X.f6951ek + pointF.x) - gameEngine.f6138cv;
                float f3 = ((m3228X.f6952el - m3228X.height) + pointF.y) - gameEngine.f6139cw;
                gameEngine.graphics.mo932a((m3091bn.f6843a + (pointF.x * 0.15f)) - gameEngine.f6138cv, (((m3091bn.f6844b - m3091bn.f6845c) + (pointF.y * 0.15f)) - gameEngine.f6139cw) - abstractC0623y.height, f2, f3, paint);
                gameEngine.graphics.mo878k();
                gameEngine.graphics.mo896b(f2, f3);
                gameEngine.graphics.mo935a(0.5f, 0.5f);
                if (m3227Y) {
                    gameEngine.graphics.mo915a(f3586f, 0.0f, 0.0f, f3580m);
                } else {
                    gameEngine.graphics.mo915a(f3585e, 0.0f, 0.0f, f3580m);
                }
                gameEngine.graphics.mo877l();
            }
        }
    }

    /* renamed from: a */
    public void m4165a(float f) {
        super.update(f);
        if (!this.isDead) {
            m4164a(f, this);
        }
    }

    /* renamed from: a */
    public void m4163a(float f, boolean z) {
        super.mo469a(f, z);
        if (!this.isDead) {
            m4158b(f, this);
        }
    }

    /* renamed from: e */
    public float m4151e(int i) {
        return 30.0f;
    }

    /* renamed from: f */
    public float m4149f(int i) {
        return 1.3f;
    }

    /* renamed from: c */
    public boolean m4156c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (!this.isDead) {
            float m4151e = this.f1648cJ[0].f1716f / m4151e(0);
            if (m4151e != 0.0f) {
                C1080ai bn = m3091bn();
                gameEngine.graphics.mo880i();
                gameEngine.graphics.mo896b(bn.f6843a - gameEngine.f6138cv, (bn.f6844b - bn.f6845c) - gameEngine.f6139cw);
                gameEngine.graphics.mo935a(m4151e, m4151e);
                if (m3227Y()) {
                    gameEngine.graphics.mo915a(f3586f, 0.0f, 0.0f, (Paint) null);
                } else {
                    gameEngine.graphics.mo915a(f3585e, 0.0f, 0.0f, (Paint) null);
                }
                gameEngine.graphics.mo879j();
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m4160a(Unit unit, int i) {
    }

    /* renamed from: m */
    public float m4144m() {
        return 30.0f;
    }

    /* renamed from: b */
    public float m4157b(int i) {
        return 100.0f;
    }

    /* renamed from: z */
    public float m4141z() {
        if (m5837cJ()) {
            return 0.6f;
        }
        return 0.8f;
    }

    /* renamed from: A */
    public float m4175A() {
        if (m5837cJ()) {
            return 1.7f;
        }
        return 3.8f;
    }

    /* renamed from: B */
    public float m4174B() {
        return 0.35f;
    }

    /* renamed from: c */
    public float m4155c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean m4145l() {
        return false;
    }

    /* renamed from: C */
    public float m4173C() {
        return 0.04f;
    }

    /* renamed from: D */
    public float m4172D() {
        return 0.1f;
    }

    /* renamed from: a */
    public void m4162a(Action action, boolean z) {
    }

    /* renamed from: a */
    public static void m4159a(ArrayList arrayList, int i) {
        arrayList.add(f3589n);
        arrayList.add(new C0227v(UnitType.f1734a, 1, 1));
        arrayList.add(new C0227v(UnitType.f1739f, 1, 2));
        arrayList.add(new C0227v(UnitType.f1740g, 1, 3));
        arrayList.add(new C0227v(UnitType.f1735b, 1, 4));
        arrayList.add(new C0227v(UnitType.f1736c, 1, 5));
        arrayList.add(new C0227v(UnitType.f1737d, 1, 6));
        arrayList.add(new C0227v(UnitType.f1758y, 1, 7));
        arrayList.add(new C0227v(UnitType.f1761B, 1, 8));
        arrayList.add(new C0227v(UnitType.f1769J, 1, 9));
        arrayList.add(new C0227v(UnitType.f1766G, 1, 10));
        arrayList.add(new C0227v(UnitType.f1762C, 1, 14));
        arrayList.add(new C0227v(UnitType.f1763D, 1, 15));
    }

    /* renamed from: N */
    public ArrayList m4166N() {
        return m4143r().mo5716a(mo3230V());
    }

    /* renamed from: E */
    public boolean m4171E() {
        return true;
    }

    /* renamed from: g */
    public float m4148g(int i) {
        return 10.0f;
    }

    /* renamed from: F */
    public boolean m4170F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && !this.isDead;
    }

    /* renamed from: G */
    public float m4169G() {
        return 1.0f;
    }

    /* renamed from: H */
    public float m4168H() {
        return 1.0f;
    }

    /* renamed from: g */
    public boolean m4147g(Unit unit, boolean z) {
        return true;
    }
}
