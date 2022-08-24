package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.land.AbstractC0529j;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g.class */
public class C0546g extends AbstractC0529j implements InterfaceC0469d {

    /* renamed from: a */
    public boolean f3740a;

    /* renamed from: b */
    PointF[] f3741b;

    /* renamed from: c */
    PointF[] f3742c;

    /* renamed from: d */
    static Paint f3743d;

    /* renamed from: e */
    static Paint f3744e;

    /* renamed from: f */
    static Paint f3745f;

    /* renamed from: g */
    int f3746g;

    /* renamed from: h */
    float f3747h;

    /* renamed from: i */
    float f3748i;

    /* renamed from: j */
    int f3749j;

    /* renamed from: f */
    public UnitType m3746r() {
        return UnitType.f1741h;
    }

    /* renamed from: b */
    public PointF[] mo3515b() {
        return this.f3741b;
    }

    /* renamed from: c */
    public PointF[] mo3511c() {
        return this.f3742c;
    }

    /* renamed from: v */
    public BitmapOrTexture m3744v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3645dL[this.team.getId()];
    }

    /* renamed from: a */
    public boolean m3765a(Unit unit) {
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m3757d() {
        if (this.isDead) {
            return Builder.f3582b;
        }
        return Builder.f3584d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3749k() {
        return null;
    }

    /* renamed from: d */
    public BitmapOrTexture m3756d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m3754e() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = Builder.f3582b;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.m3004a(AudioEngine.f4044o, 0.8f, this.f6951ek, this.f6952el);
        m3088bq();
        return true;
    }

    public C0546g(boolean z) {
        super(z);
        this.f3741b = new PointF[6];
        this.f3742c = new PointF[this.f3741b.length];
        f3743d = new Paint();
        f3743d.m7267a(40, 0, 255, 0);
        f3743d.m7248a(true);
        f3743d.m7270a(2.0f);
        f3743d.m7262a(Paint.Cap.ROUND);
        f3744e = new Paint();
        f3744e.m7259a(f3743d);
        f3744e.m7267a(55, 255, 60, 60);
        f3745f = new Paint();
        f3745f.m7267a(60, 255, 255, 255);
        m2884T(20);
        m2883U(20);
        this.radius = 10.0f;
        this.f6951ek = -1000.0f;
        this.f6952el = -1000.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 170000.0f;
        this.f1631cs = this.f1632ct;
        this.image = Builder.f3582b;
        for (int i = 0; i < this.f3741b.length; i++) {
            this.f3741b[i] = new PointF();
            this.f3742c[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3767a(float f, InterfaceC0469d interfaceC0469d) {
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

    /* renamed from: a */
    public void m3768a(float f) {
        super.update(f);
        if (!this.isDead) {
            m3767a(f, this);
        }
        this.f1631cs = this.f1632ct;
        this.f3746g++;
        this.f3747h += f;
        this.f3748i += f;
        GameEngine.getInstance();
        if (this.f3740a) {
            GameEngine.PrintLog("Stress test active");
            for (int i = 0; i < 6000; i++) {
                m3743w();
            }
            m5812ch();
        } else if (this.f3748i > 3.0f) {
            this.f3748i = 0.0f;
            m3743w();
        }
    }

    /* renamed from: w */
    public void m3743w() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f3749j++;
        InterfaceC0303as interfaceC0303as = (InterfaceC0303as) UnitType.f1790ae.get(CommonUtils.m2345a((AbstractC1120w) this, 0, UnitType.f1790ae.size() - 1, 1 + this.f3749j));
        boolean z = true;
        if (C0453l.f2901b == interfaceC0303as) {
            z = false;
        }
        if (interfaceC0303as == UnitType.f1778S) {
            z = false;
        }
        if (z) {
            Unit mo5717a = interfaceC0303as.mo5717a();
            mo5717a.f6951ek = CommonUtils.m2345a((AbstractC1120w) this, 200, ((int) gameEngine.f6104bL.m6589i()) - 200, 2 + this.f3746g + this.f3749j);
            mo5717a.f6952el = CommonUtils.m2345a((AbstractC1120w) this, 200, ((int) gameEngine.f6104bL.m6588j()) - 200, 3 + this.f3746g + this.f3749j + (this.f3749j * 9));
            try {
                mo5717a.m5901Q(CommonUtils.m2345a((AbstractC1120w) this, 0, 3, 4 + this.f3746g + this.f3749j + (this.f3749j * 9)));
                Team.m6353c(mo5717a);
                if (mo5717a.m5755u()) {
                    mo5717a.mo2880a();
                }
                if (mo5717a.m5863bO()) {
                    mo5717a.mo2880a();
                }
            } catch (C0179f e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public void m3766a(float f, boolean z) {
        if (!this.isDead) {
        }
    }

    /* renamed from: e */
    public float m3753e(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float m3751f(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public boolean m3760c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        GameEngine.getInstance();
        return true;
    }

    /* renamed from: a */
    public void m3763a(Unit unit, int i) {
    }

    /* renamed from: x */
    public boolean m3742x() {
        return false;
    }

    /* renamed from: y */
    public int m3741y() {
        return 850000;
    }

    /* renamed from: b */
    public float m3761b(Unit unit) {
        return 1.0E7f;
    }

    /* renamed from: c */
    public float m3758c(Unit unit) {
        return 1.0E7f;
    }

    /* renamed from: m */
    public float m3747m() {
        return 30.0f;
    }

    /* renamed from: b */
    public float m3762b(int i) {
        return 100.0f;
    }

    /* renamed from: z */
    public float m3740z() {
        return 0.0f;
    }

    /* renamed from: A */
    public float m3777A() {
        if (m5837cJ()) {
            return 4.7f;
        }
        return 4.8f;
    }

    /* renamed from: B */
    public float m3776B() {
        return 0.35f;
    }

    /* renamed from: c */
    public float m3759c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean m3748l() {
        return false;
    }

    /* renamed from: C */
    public float m3775C() {
        return 0.04f;
    }

    /* renamed from: D */
    public float m3774D() {
        return 0.1f;
    }

    /* renamed from: E */
    public boolean m3773E() {
        return true;
    }

    /* renamed from: g */
    public float m3750g(int i) {
        return 10.0f;
    }

    /* renamed from: F */
    public boolean m3772F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && !this.isDead;
    }

    /* renamed from: G */
    public float m3771G() {
        return 1.0f;
    }

    /* renamed from: H */
    public float m3770H() {
        return 1.0f;
    }

    /* renamed from: u */
    public boolean m3745u() {
        return true;
    }

    /* renamed from: I */
    public boolean mo3295I() {
        return false;
    }

    /* renamed from: d */
    public boolean m3755d(Unit unit) {
        return false;
    }

    /* renamed from: J */
    public boolean m3769J() {
        return true;
    }

    /* renamed from: a */
    public float m3764a(Unit unit, float f, Projectile projectile) {
        return super.mo4499a(unit, 0.0f, projectile);
    }
}
