package com.corrodinggames.rts.game.units.buildings;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/r.class */
public class Repairbay extends AbstractC0488d implements InterfaceC0469d {

    /* renamed from: d */
    float f3530d;

    /* renamed from: f */
    Rect f3531f;

    /* renamed from: g */
    Rect f3532g;

    /* renamed from: i */
    PointF[] f3533i;

    /* renamed from: j */
    PointF[] f3534j;

    /* renamed from: a */
    static BitmapOrTexture f3535a = null;

    /* renamed from: b */
    static BitmapOrTexture[] f3536b = new BitmapOrTexture[10];

    /* renamed from: c */
    static BitmapOrTexture f3537c = null;

    /* renamed from: e */
    public static C0511s f3538e = new C0511s(true);

    /* renamed from: h */
    static ArrayList f3539h = new ArrayList();

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        super.mo2877a(c0876k);
    }

    /* renamed from: L */
    public UnitType m4267r() {
        return UnitType.f1761B;
    }

    static {
        f3539h.add(new C0218m(true));
        f3539h.add(new C0219n());
    }

    /* renamed from: dr */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f3535a = gameEngine.graphics.loadImage(R.drawable.repair_bay);
        f3537c = gameEngine.graphics.loadImage(R.drawable.repair_bay_dead);
        f3536b = Team.createBitmapForTeam(f3535a);
    }

    /* renamed from: K */
    public boolean m4287K() {
        this.image = f3537c;
        setDrawLayer(0);
        this.collidable = false;
        m3206a(EnumC0233ab.f1503c);
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m4274d() {
        if (this.isDead) {
            return f3537c;
        }
        if (this.team == null) {
            return f3536b[f3536b.length - 1];
        }
        return f3536b[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m4270k() {
        return null;
    }

    /* renamed from: a */
    public void m4282a(int i) {
    }

    public Repairbay(boolean z) {
        super(z);
        this.f3531f = new Rect();
        this.f3532g = new Rect();
        this.f3533i = new PointF[6];
        this.f3534j = new PointF[this.f3533i.length];
        this.image = f3535a;
        m2878b(f3535a);
        this.radius = 30.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 1000.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m7208a(-1, -1, 1, 1);
        this.f3422o.m7208a(-1, -1, 1, 1);
        for (int i = 0; i < this.f3533i.length; i++) {
            this.f3533i[i] = new PointF();
            this.f3534j[i] = new PointF();
        }
    }

    /* renamed from: y */
    public int m4266y() {
        return SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE;
    }

    /* renamed from: c */
    public float m4275c(Unit unit) {
        return 0.2f;
    }

    /* renamed from: a */
    public boolean m4281a(Unit unit) {
        if (unit.mo4203q()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C0305au m4279a(AbstractC0623y abstractC0623y, float f, float f2, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        f3538e.m4265a(abstractC0623y.mo3492y() + f2, z);
        gameEngine.f6121cc.m3792a(abstractC0623y.f6951ek, abstractC0623y.f6952el, abstractC0623y.mo3492y() + f2, abstractC0623y, f, f3538e);
        Unit unit = f3538e.f3544e;
        if (unit != null) {
            C0305au m3138ao = abstractC0623y.m3138ao();
            m3138ao.m5682b(unit);
            if (m3138ao != null) {
                m3138ao.f1808k = f2;
                m3138ao.f1803m = true;
                return m3138ao;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m4284a(float f) {
        super.update(f);
        if (!isActive() || this.isDead) {
            return;
        }
        this.f3530d += f;
        if (m3136aq() && this.f3530d > 40.0f) {
            this.f3530d = 0.0f;
            m4279a((AbstractC0623y) this, f, 0.0f, false);
        }
        if (!this.isDead) {
            Builder.m4164a(f, this);
        }
    }

    /* renamed from: c */
    public boolean m4277c(float f) {
        return super.m4512c(f);
    }

    /* renamed from: a */
    public void m4283a(float f, boolean z) {
        super.mo469a(f, z);
        if (!this.isDead) {
            Builder.m4158b(f, this);
        }
    }

    /* renamed from: l */
    public boolean m4269l() {
        return false;
    }

    /* renamed from: a */
    public void m4280a(Unit unit, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    /* renamed from: b */
    public float m4278b(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public float m4276c(int i) {
        return 0.0f;
    }

    /* renamed from: E */
    public PointF m4288E(int i) {
        PointF G = mo3523G(i);
        f3980bf.m7213a(G.x + 0.0f, G.y - 33.0f);
        return f3980bf;
    }

    /* renamed from: N */
    public ArrayList m4285N() {
        return f3539h;
    }

    /* renamed from: b */
    public PointF[] mo3515b() {
        return this.f3533i;
    }

    /* renamed from: c */
    public PointF[] mo3511c() {
        return this.f3534j;
    }

    /* renamed from: m */
    public float m4268m() {
        return m4266y();
    }

    /* renamed from: e */
    public void m4272e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m4266y());
    }

    /* renamed from: g */
    public boolean m4271g(Unit unit, boolean z) {
        return true;
    }
}
