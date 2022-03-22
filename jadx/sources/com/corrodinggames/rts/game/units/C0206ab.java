package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.p012b.C0155g;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ab.class */
public class C0206ab extends AbstractC0512o {

    /* renamed from: b */
    C0748e f1399b;

    /* renamed from: c */
    int f1400c;

    /* renamed from: e */
    float f1402e;

    /* renamed from: f */
    float f1403f;

    /* renamed from: i */
    float f1406i;

    /* renamed from: j */
    float f1407j;

    /* renamed from: l */
    float f1409l;

    /* renamed from: m */
    float f1410m;

    /* renamed from: n */
    float f1411n;

    /* renamed from: q */
    float f1414q;

    /* renamed from: r */
    boolean f1415r;

    /* renamed from: a */
    static C0748e[] f1398a = new C0748e[2];

    /* renamed from: s */
    static Point f1416s = new Point();

    /* renamed from: t */
    public static C0207ac f1417t = new C0207ac();

    /* renamed from: d */
    int f1401d = 0;

    /* renamed from: g */
    int f1404g = 0;

    /* renamed from: h */
    int f1405h = 0;

    /* renamed from: k */
    boolean f1408k = false;

    /* renamed from: u */
    Rect f1418u = new Rect();

    /* renamed from: o */
    float f1412o = 0.05f;

    /* renamed from: p */
    float f1413p = 120.0f;

    /* renamed from: b */
    public static void m3355b() {
        f1398a[0] = AbstractC0789l.m638u().f5514bw.mo194a(C0063R.drawable.fire);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(this.f1400c);
        apVar.mo1095a(this.f1401d);
        apVar.mo1096a(this.f1402e);
        apVar.mo1130c(0);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f1400c = kVar.m1062f();
        this.f1401d = kVar.m1062f();
        this.f1402e = kVar.m1061g();
        kVar.m1065d();
        super.mo399a(kVar);
    }

    /* renamed from: c */
    public C0748e m3353c() {
        return this.f1399b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        return false;
    }

    public C0206ab(boolean z) {
        super(z);
        m3356a(0);
        this.f1474bO = 20.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 100.0f;
        this.f1484bY = this.f1485bZ;
        this.f1471bL = -90.0f;
        this.f1458by = false;
        m406R(3);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: c_ */
    public void mo2361c_() {
        this.f1458by = false;
    }

    /* renamed from: a */
    public void m3356a(int i) {
        this.f1400c = i;
        if (this.f1400c == 0) {
            m2038S(20);
            m2037T(20);
            this.f1404g = 0;
            this.f1405h = 0;
            this.f1399b = f1398a[0];
            return;
        }
        throw new RuntimeException("Fire type:" + this.f1400c + " is not supported");
    }

    /* renamed from: d */
    public void m3352d() {
        this.f1408k = true;
        this.f1406i = C0654f.m1499a((AbstractC0854w) this, -5, 5, 1);
        this.f1407j = C0654f.m1499a((AbstractC0854w) this, -5, 5, 2);
        this.f1402e = C0654f.m1499a((AbstractC0854w) this, 1, 10, 3);
        this.f1401d = C0654f.m1499a((AbstractC0854w) this, 0, 2, 4);
        this.f1403f = C0654f.m1499a((AbstractC0854w) this, 7, 13, 5);
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        u.f5511bt.m3703a(this.f5842dH, this.f5843dI);
        int i = u.f5511bt.f764M;
        int i2 = u.f5511bt.f765N;
        if (!bVar.m3661c(i, i2)) {
            this.f1409l = 0.0f;
            this.f1410m = 0.0f;
            this.f1411n = 2.0f;
            return;
        }
        C0155g a = u.f5511bt.f742r.m3617a(i, i2);
        boolean z = false;
        if (a.f853e || a.f856h || a.f859k || a.f854f) {
            z = true;
        }
        if (z) {
            this.f1409l = 0.0f;
            this.f1410m = 0.0f;
            this.f1411n = 2.0f;
            return;
        }
        this.f1409l = 5.0E-4f;
        this.f1410m = 1.0f;
        this.f1411n = 0.3f;
        this.f1412o += C0654f.m1499a((AbstractC0854w) this, 0, 10, 10) / 1000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1408k) {
            m3352d();
        }
        if (this.f1412o < this.f1410m) {
            this.f1412o += this.f1409l * f;
            if (this.f1412o > this.f1410m) {
                this.f1412o = this.f1410m;
            }
        }
        if (this.f1412o > this.f1411n) {
            this.f1414q = (float) (this.f1414q + (0.01d * f));
            if ((!this.f1415r && this.f1414q > 1.0f) || this.f1414q > 8.0f) {
                this.f1414q = C0654f.m1499a((AbstractC0854w) this, 0, 10, 10) / 1000.0f;
                m3351f();
            }
        }
        this.f1402e += f;
        if (this.f1402e > 10.0f) {
            this.f1402e = 0.0f;
            this.f1401d++;
            if (this.f1401d > 3) {
                this.f1401d = 0;
            }
        }
        if (this.f1412o < 0.0f) {
            mo2195bq();
        }
    }

    /* renamed from: f */
    public void m3351f() {
        this.f1415r = true;
        m3354b(-1, -1);
        m3354b(0, -1);
        m3354b(1, -1);
        m3354b(-1, 0);
        m3354b(1, 0);
        m3354b(-1, 1);
        m3354b(0, 1);
        m3354b(1, 1);
    }

    /* renamed from: b */
    public void m3354b(int i, int i2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        float f = (int) (this.f5842dH + (i * u.f5511bt.f735k));
        float f2 = (int) (this.f5843dI + (i2 * u.f5511bt.f736l));
        if (m3357a(f, f2) == null) {
            C0206ab abVar = new C0206ab(false);
            abVar.f5842dH = f;
            abVar.f5843dI = f2;
            abVar.mo2305a(this.f1461bB);
            u.f5528bK.m2458a(abVar);
            AbstractC0171m.m3473c(abVar);
            this.f1415r = false;
        }
    }

    /* renamed from: a */
    public static C0206ab m3357a(float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1417t.m3349a(f, f2);
        u.f5528bK.m2462a(f, f2, 30.0f, null, 1.0f, f1417t);
        return f1417t.f1421c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a_ */
    public Rect mo2479a_(boolean z) {
        int i = this.f1404g;
        int i2 = this.f1405h;
        int i3 = i + (this.f1401d * this.f3752dL);
        f1542de.m4136a(i3, i2, i3 + this.f3752dL, i2 + this.f3753dM);
        return f1542de;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        C0748e c = m3353c();
        AbstractC0789l u = AbstractC0789l.m638u();
        f1534cW.m4120a(mo2637cp());
        f1534cW.m4123a(0.0f, (int) (-this.f5844dJ));
        f1534cW.m4123a(this.f1406i, this.f1407j);
        f1535cX.m4135a(mo2479a_(false));
        u.f5514bw.mo125j();
        float d = f1534cW.m4111d();
        float e = f1534cW.m4110e();
        u.f5514bw.mo199a(mo2511f(false), d, e);
        u.f5514bw.mo198a(this.f1412o * 2.7f, this.f1412o * 2.7f, d, e);
        u.f5514bw.mo169a(c, f1535cX, f1534cW, (Paint) null);
        u.f5514bw.mo124k();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: h */
    public EnumC0212ah mo2358h() {
        return EnumC0212ah.NONE;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: i */
    public boolean mo2357i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: P */
    public boolean mo2363P() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: ai */
    public boolean mo2244ai() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: ah */
    public boolean mo2245ah() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: j */
    public boolean mo2163j() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: b_ */
    public boolean mo2855b_() {
        return false;
    }

    /* renamed from: m */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.spreadingFire;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: n */
    public void mo2536n() {
        super.mo2536n();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a_ */
    public float mo2867a_() {
        return -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: O */
    public boolean mo2364O() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public float mo2362a(AbstractC0210af afVar, float f, C0163f fVar) {
        this.f1412o -= f / 100.0f;
        return super.mo2362a(afVar, 0.0f, fVar);
    }
}
