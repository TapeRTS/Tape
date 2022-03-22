package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ae.class */
public class C0209ae extends AbstractC0512o {

    /* renamed from: a */
    static C0748e[] f1422a = new C0748e[3];

    /* renamed from: b */
    static C0748e f1423b = null;

    /* renamed from: c */
    C0748e f1424c;

    /* renamed from: d */
    int f1425d;

    /* renamed from: e */
    int f1426e;

    /* renamed from: g */
    float f1428g;

    /* renamed from: h */
    boolean f1429h;

    /* renamed from: i */
    float f1430i;

    /* renamed from: f */
    int f1427f = 0;

    /* renamed from: j */
    int f1431j = 0;

    /* renamed from: k */
    int f1432k = 0;

    /* renamed from: l */
    float f1433l = 1.0f;

    /* renamed from: m */
    boolean f1434m = false;

    /* renamed from: b */
    public static void m3348b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1422a[0] = u.f5514bw.mo194a(C0063R.drawable.palm_tree);
        f1422a[1] = u.f5514bw.mo194a(C0063R.drawable.trees);
        f1422a[2] = u.f5514bw.mo194a(C0063R.drawable.trees_snow);
        f1423b = u.f5514bw.mo194a(C0063R.drawable.palm_leaves);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(this.f1425d);
        apVar.mo1095a(this.f1427f);
        apVar.mo1096a(this.f1428g);
        apVar.mo1090a(this.f1429h);
        apVar.mo1096a(this.f1430i);
        apVar.mo1130c(2);
        apVar.mo1096a(this.f1433l);
        apVar.mo1095a(this.f1426e);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f1425d = kVar.m1062f();
        this.f1427f = kVar.m1062f();
        this.f1428g = kVar.m1061g();
        this.f1429h = kVar.m1063e();
        this.f1430i = kVar.m1061g();
        byte d = kVar.m1065d();
        if (d >= 1) {
            this.f1433l = kVar.m1061g();
        } else {
            this.f1433l = 1.0f;
        }
        if (d >= 2) {
            this.f1426e = kVar.m1062f();
        } else {
            this.f1426e = 0;
        }
        m3347b(this.f1425d, this.f1426e);
        super.mo399a(kVar);
        if (this.f1459bz) {
            this.f1434m = false;
        }
    }

    /* renamed from: c */
    public C0748e m3346c() {
        return this.f1424c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        m3344f();
        return true;
    }

    public C0209ae(boolean z) {
        super(z);
        m3347b(1, -1);
        this.f1474bO = 3.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 100.0f;
        this.f1484bY = this.f1485bZ;
        this.f1471bL = -90.0f;
        m406R(3);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a_ */
    public void mo2696a_(String str) {
        int i = -1;
        String[] split = str.split("\\.");
        if (!(split.length == 0 || split.length == 1)) {
            if (split.length == 2) {
                str = split[0];
                try {
                    i = Integer.parseInt(split[1]);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Tree sub type format error:" + split[1]);
                }
            } else {
                throw new RuntimeException("Tree sub unknown format with parts:" + split.length);
            }
        }
        try {
            m3347b(Integer.parseInt(str), i);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("Tree type format error:" + str);
        }
    }

    /* renamed from: b */
    public void m3347b(int i, int i2) {
        this.f1425d = i;
        this.f1426e = i2;
        if (this.f1425d == 0) {
            m2038S(27);
            m2037T(41);
            this.f1431j = 1;
            this.f1432k = 1;
            this.f1424c = f1422a[0];
        } else if (this.f1425d == 1 || this.f1425d == 2) {
            if (i2 == -1) {
                i2 = C0654f.m1512a(0, 4, (int) this.f5835dA);
            }
            if (i2 < 0 || i2 > 4) {
                throw new RuntimeException("Tree subType out of range:" + i2);
            }
            m2038S(25);
            m2037T(30);
            if (this.f1425d == 1) {
                this.f1424c = f1422a[1];
            } else {
                this.f1424c = f1422a[2];
            }
            this.f1431j = 0;
            this.f1432k = 30 * i2;
            if (i2 == 0) {
                this.f1433l = C0654f.m1518a(1.0f, 1.2f, ((int) this.f5835dA) + 1);
            } else {
                this.f1433l = C0654f.m1518a(1.0f, 2.0f, ((int) this.f5835dA) + 1);
            }
            this.f1434m = true;
        } else {
            throw new RuntimeException("Tree type:" + this.f1425d + " is not supported");
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        if (this.f1425d != 0) {
            return;
        }
        if (this.f1429h) {
            if (this.f1427f < 4) {
                this.f1428g += f;
                if (this.f1428g > 5.0f) {
                    this.f1428g = 0.0f;
                    this.f1427f++;
                }
            }
        } else if (this.f1430i != 0.0f) {
            this.f1430i = C0654f.m1522a(this.f1430i, 0.1f * f);
            this.f1427f = 2;
        } else if (this.f1427f > 1) {
            this.f1427f = 1;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a_ */
    public Rect mo2479a_(boolean z) {
        int i = this.f1431j;
        int i2 = this.f1432k;
        int i3 = i + (this.f1427f * (this.f3752dL + 1));
        f1542de.m4136a(i3, i2, i3 + this.f3752dL, i2 + this.f3753dM);
        return f1542de;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        C0748e c = m3346c();
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u.f5574cE < 0.15d) {
            return false;
        }
        f1534cW.m4120a(mo2637cp());
        f1534cW.m4123a(0.0f, (int) (-this.f5844dJ));
        float d = f1534cW.m4111d();
        float e = f1534cW.m4110e();
        f1535cX.m4135a(mo2479a_(false));
        AbstractC0755l lVar = u.f5514bw;
        lVar.mo125j();
        if (this.f1433l != 1.0f) {
            lVar.mo198a(this.f1433l, this.f1433l, d, e);
        }
        if (this.f1434m) {
            f1535cX.m4137a(this.f3752dL, 0);
            u.f5514bw.mo169a(c, f1535cX, f1534cW, (Paint) null);
            f1535cX.m4137a(-this.f3752dL, 0);
        }
        lVar.mo199a(mo2511f(false), d, e);
        lVar.mo169a(c, f1535cX, f1534cW, (Paint) null);
        lVar.mo124k();
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
    /* renamed from: ah */
    public boolean mo2245ah() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: ai */
    public boolean mo2244ai() {
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

    /* renamed from: d */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.tree;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public boolean mo3334a(AbstractC0210af afVar, float f) {
        if (this.f1429h) {
            return true;
        }
        if (this.f1430i == 0.0f) {
        }
        this.f1484bY -= (((afVar.mo2395bB() / 3000.0f) * this.f1485bZ) * 0.06f) * f;
        this.f1430i = 1.0f;
        this.f1529cR = 1000.0f;
        if (this.f1484bY <= 0.0f) {
            this.f1471bL = C0654f.m1446d(this.f5842dH, this.f5843dI, afVar.f5842dH, afVar.f5843dI) + 180.0f;
            m3344f();
        }
        if (!this.f1429h) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void m3344f() {
        if (!this.f1429h) {
            AbstractC0789l u = AbstractC0789l.m638u();
            this.f1427f = 2;
            this.f1428g = 0.0f;
            m406R(0);
            this.f1458by = false;
            this.f1459bz = true;
            this.f1460bA = u.f5499bh;
            this.f1429h = true;
            this.f1434m = false;
            for (int i = 0; i < 1; i++) {
                u.f5517bz.m2018a();
                C0573e b = u.f5517bz.m1989b(this.f5842dH + C0654f.m1458c(-12.0f, 12.0f), this.f5843dI + C0654f.m1458c(-12.0f, 12.0f), this.f5844dJ, EnumC0572d.custom, false, EnumC0576h.high);
                if (b != null) {
                    b.f3894ap = 9;
                    b.f3893ao = C0654f.m1514a(4, 5);
                    b.f3877Y = C0654f.m1458c(-180.0f, 180.0f);
                    b.f3891am = true;
                    b.f3864L = 5.0f + C0654f.m1458c(0.0f, 3.0f);
                    b.f3869Q = C0654f.m1458c(-0.05f, 0.05f) + (C0654f.m1421i(this.f1471bL) * 0.4f);
                    b.f3870R = C0654f.m1458c(-0.05f, 0.05f) + (C0654f.m1425h(this.f1471bL) * 0.4f);
                    b.f3849w = true;
                    b.f3850x = 0.2f;
                    b.f3860H = 0.4f * this.f1433l;
                    b.f3859G = 0.4f * this.f1433l;
                    b.f3875W = 90 + C0654f.m1514a(0, 40);
                    b.f3876X = b.f3875W;
                    b.f3845s = true;
                    b.f3895aq = (short) 2;
                }
            }
            float i2 = this.f5842dH + (C0654f.m1421i(this.f1471bL) * (this.f3753dM - 5));
            float h = this.f5843dI + (C0654f.m1425h(this.f1471bL) * (this.f3753dM - 5));
            boolean z = true;
            for (int i3 = 0; i3 < 1; i3++) {
                u.f5517bz.m2018a();
                C0573e b2 = u.f5517bz.m1989b(i2 + C0654f.m1458c(-17, 17), h + C0654f.m1458c(-17, 17), this.f5844dJ, EnumC0572d.custom, false, EnumC0576h.high);
                if (b2 != null) {
                    b2.f3894ap = 9;
                    b2.f3893ao = C0654f.m1514a(4, 5);
                    if (z) {
                        z = false;
                        b2.f3893ao = 3;
                    }
                    b2.f3877Y = C0654f.m1458c(-180.0f, 180.0f);
                    b2.f3891am = true;
                    if (b2.f3893ao == 3) {
                        b2.f3869Q = C0654f.m1458c(-0.05f, 0.05f);
                        b2.f3870R = C0654f.m1458c(-0.05f, 0.05f);
                        b2.f3860H = 1.5f * this.f1433l;
                        b2.f3859G = 2.2f * this.f1433l;
                        b2.f3875W = 90 + C0654f.m1514a(0, 40);
                        b2.f3895aq = (short) 2;
                    } else {
                        b2.f3869Q = C0654f.m1458c(-0.05f, 0.05f);
                        b2.f3870R = C0654f.m1458c(-0.05f, 0.0f);
                        b2.f3860H = 1.3f;
                        b2.f3859G = 1.3f;
                        b2.f3875W = 60 + C0654f.m1514a(0, 40);
                        b2.f3895aq = (short) 1;
                    }
                    b2.f3876X = b2.f3875W;
                    b2.f3845s = true;
                }
            }
            if (this.f1425d == 1 || this.f1425d == 2) {
                this.f5842dH += C0654f.m1421i(this.f1471bL) * ((this.f3753dM / 2) - 3);
                this.f5843dI += C0654f.m1425h(this.f1471bL) * ((this.f3753dM / 2) - 3);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: n */
    public void mo2536n() {
        super.mo2536n();
        this.f1471bL = C0654f.m1516a((this.f5843dI * 5.0f) + (this.f5842dH * 3.0f), false);
        if (this.f1425d == 0) {
            this.f1427f = ((int) ((this.f5843dI * 5.0f) + (this.f5842dH * 3.0f))) % 1;
        }
        if (this.f1425d == 1) {
        }
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
    /* renamed from: a */
    public float mo2362a(AbstractC0210af afVar, float f, C0163f fVar) {
        boolean z = this.f1459bz;
        float a = super.mo2362a(afVar, f, fVar);
        if (!z && this.f1459bz && fVar != null) {
            this.f1471bL = C0654f.m1446d(this.f5842dH, this.f5843dI, fVar.f5842dH, fVar.f5843dI) + 180.0f;
        }
        return a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: q */
    public boolean mo2533q() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: t */
    public boolean mo1605t() {
        return true;
    }
}
