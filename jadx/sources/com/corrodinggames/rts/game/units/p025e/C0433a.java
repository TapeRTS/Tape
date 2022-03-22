package com.corrodinggames.rts.game.units.p025e;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/a.class */
public class C0433a extends AbstractC0444j {

    /* renamed from: a */
    static C0748e f3113a = null;

    /* renamed from: b */
    static C0748e f3114b = null;

    /* renamed from: c */
    static C0748e f3115c = null;

    /* renamed from: d */
    static C0748e[] f3116d = new C0748e[10];

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.artillery;
    }

    /* renamed from: c */
    public static void m2531c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3113a = u.f5514bw.mo194a(C0063R.drawable.artillery2);
        f3114b = u.f5514bw.mo194a(C0063R.drawable.artillery1_dead);
        f3116d = AbstractC0171m.m3501a(f3113a);
        f3115c = m3331a(f3113a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3114b;
        }
        return f3116d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3115c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && !this.f1459bz;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: G */
    public float mo2342G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: H */
    public float mo2340H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u();
        this.f3387D = f3114b;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.normal);
        return true;
    }

    public C0433a(boolean z) {
        super(z);
        m2038S(28);
        m2037T(50);
        this.f1474bO = 18.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 140.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3113a;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
        PointF J = mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f923h = 150.0f;
        a.f935t = 4.0f;
        a.f1010aQ = true;
        a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        a.f959R = (short) 2;
        a.f957P = (short) 1;
        a.f939x = 0.9f;
        PointF a2 = afVar.m3340a(E.f224a, E.f225b, a.f935t, a.f923h, mo2152m());
        a.f996aC = true;
        a.f928m = true;
        a.f929n = a2.f224a;
        a.f930o = a2.f225b;
        a.f966Y = 80.0f;
        a.f967Z = 45.0f;
        a.f968aa = true;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5512bu.m2115a(C0530e.f3579q, 0.3f, E.f224a, E.f225b);
        u.f5517bz.m2014a(E.f224a, E.f225b, this.f5844dJ, this.f1499cn[i].f1561a);
        C0573e a3 = u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1118482);
        if (a3 != null) {
            a3.f3875W = 15.0f;
            a3.f3876X = a3.f3875W;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bI */
    public float mo2486bI() {
        if (this.f1499cn[0].f1565e > 0.0f) {
            return 1.0f - (this.f1499cn[0].f1565e / mo2222b(0));
        }
        return super.mo2486bI();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 290.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ad */
    public boolean mo2249ad() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public boolean mo2346E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
        super.mo392e(f);
        C0851y.m428a(this, mo2152m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 14000.0f;
    }
}
