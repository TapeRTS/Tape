package com.corrodinggames.rts.game.units.p023d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0384d;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.p013a.C0191m;
import com.corrodinggames.rts.game.units.p013a.C0192n;
import com.corrodinggames.rts.game.units.p025e.C0434b;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p.class */
public class C0425p extends AbstractC0403c implements AbstractC0384d {

    /* renamed from: d */
    float f3074d;

    /* renamed from: f */
    Rect f3076f = new Rect();

    /* renamed from: g */
    Rect f3077g = new Rect();

    /* renamed from: i */
    PointF[] f3079i = new PointF[6];

    /* renamed from: j */
    PointF[] f3080j = new PointF[this.f3079i.length];

    /* renamed from: a */
    static C0748e f3071a = null;

    /* renamed from: b */
    static C0748e[] f3072b = new C0748e[10];

    /* renamed from: c */
    static C0748e f3073c = null;

    /* renamed from: e */
    public static C0426q f3075e = new C0426q(true);

    /* renamed from: h */
    static ArrayList f3078h = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        super.mo399a(kVar);
    }

    /* renamed from: L */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.repairbay;
    }

    static {
        f3078h.add(new C0191m(true));
        f3078h.add(new C0192n());
    }

    /* renamed from: da */
    public static void m2558da() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3071a = u.f5514bw.mo194a(C0063R.drawable.repair_bay);
        f3073c = u.f5514bw.mo194a(C0063R.drawable.repair_bay_dead);
        f3072b = AbstractC0171m.m3501a(f3071a);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: K */
    public boolean mo2550K() {
        this.f3387D = f3073c;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.normal);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3073c;
        }
        if (this.f1461bB == null) {
            return f3072b[f3072b.length - 1];
        }
        return f3072b[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
    }

    public C0425p(boolean z) {
        super(z);
        this.f3387D = f3071a;
        m2035b(f3071a);
        this.f1474bO = 30.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 1000.0f;
        this.f1484bY = this.f1485bZ;
        this.f2965n.m4136a(-1, -1, 1, 1);
        this.f2966o.m4136a(-1, -1, 1, 1);
        for (int i = 0; i < this.f3079i.length; i++) {
            this.f3079i[i] = new PointF();
            this.f3080j[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: y */
    public int mo2397y() {
        return SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: c */
    public float mo2425c(AbstractC0210af afVar) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public boolean mo2302a(AbstractC0210af afVar) {
        if (afVar.mo2533q()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C0270an m2559a(AbstractC0515r rVar, float f, float f2, boolean z) {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3075e.m2557a(rVar.mo2397y() + f2, z);
        u.f5528bK.m2462a(rVar.f5842dH, rVar.f5843dI, rVar.mo2397y() + f2, rVar, f, f3075e);
        AbstractC0210af afVar = f3075e.f3085e;
        if (afVar == null) {
            return null;
        }
        C0270an am = rVar.m2240am();
        am.m3249b(afVar);
        if (am == null) {
            return null;
        }
        am.f1655k = f2;
        am.f1657m = true;
        return am;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
            this.f3074d += f;
            if (m2238ao() && this.f3074d > 40.0f) {
                this.f3074d = 0.0f;
                m2559a((AbstractC0515r) this, f, 0.0f, false);
            }
            if (!this.f1459bz) {
                C0434b.m2529a(f, this);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        return super.mo396c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo403a(float f, boolean z) {
        super.mo403a(f, z);
        if (!this.f1459bz) {
            C0434b.m2527b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public PointF mo2345E(int i) {
        PointF F = mo2343F(i);
        f3485aT.m4141a(F.f224a + 0.0f, F.f225b - 33.0f);
        return f3485aT;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f3078h;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: b */
    public PointF[] mo2404b() {
        return this.f3079i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: c */
    public PointF[] mo2403c() {
        return this.f3080j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return mo2397y();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2397y());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: w */
    public boolean mo2398w(AbstractC0210af afVar) {
        return true;
    }
}
