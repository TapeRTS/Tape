package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/g.class */
public class C0212g extends Action {

    /* renamed from: a */
    public Action f1431a;

    /* renamed from: b */
    public AbstractC0623y f1432b;

    /* renamed from: c */
    public C0207b f1433c;

    /* renamed from: d */
    static C1112u f1434d;

    /* renamed from: e */
    static final C1112u f1435e = new C1112u();

    /* renamed from: K */
    private void m6257K() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (f1434d != null) {
            throw new RuntimeException("savedSelectedUnitsCache!=null");
        }
        f1434d = gameEngine.f6111bS.f5255bL;
        f1435e.clear();
        f1435e.m519a(this.f1432b);
        gameEngine.f6111bS.f5255bL = f1435e;
    }

    /* renamed from: L */
    private void m6256L() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (f1434d == null) {
            throw new RuntimeException("savedSelectedUnitsCache==null");
        }
        gameEngine.f6111bS.f5255bL = f1434d;
        f1434d = null;
        f1435e.clear();
    }

    /* renamed from: j_ */
    public float m6234j_() {
        return super.m6062j_();
    }

    /* renamed from: a */
    public int mo5507a(Action action) {
        return super.m6090a(action);
    }

    /* renamed from: b */
    public String mo6187b() {
        return this.f1431a.getText();
    }

    /* renamed from: d */
    public String m6243d(Unit unit) {
        return this.f1431a.m6075d(this.f1432b);
    }

    /* renamed from: a */
    public String mo6189a() {
        return this.f1431a.getDescription();
    }

    /* renamed from: e */
    public String m6241e(Unit unit) {
        return this.f1431a.m6071e(this.f1432b);
    }

    /* renamed from: c */
    public int mo6185c() {
        return this.f1431a.mo6185c();
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        return this.f1431a.mo6186b(this.f1432b, z);
    }

    /* renamed from: k_ */
    public boolean m6232k_() {
        return this.f1431a.m6060k_();
    }

    /* renamed from: a */
    public boolean m6248a(Unit unit, boolean z) {
        return this.f1431a.mo4247a(this.f1432b, z);
    }

    /* renamed from: t */
    public int m6221t() {
        return this.f1431a.m6044t();
    }

    /* renamed from: f */
    public void m6240f(Unit unit) {
        this.f1431a.m6069f(this.f1432b);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public boolean m6239g(Unit unit) {
        return this.f1431a.m6068g(this.f1432b);
    }

    /* renamed from: u */
    public boolean m6219u() {
        return this.f1431a.m6042u();
    }

    /* renamed from: h */
    public boolean m6238h() {
        return this.f1431a.m6067h();
    }

    /* renamed from: i */
    public InterfaceC0303as mo7517i() {
        return this.f1431a.mo7517i();
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return this.f1431a.mo6181g();
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return this.f1431a.mo6184e();
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return this.f1431a.mo6182f();
    }

    /* renamed from: d */
    public String m6244d() {
        m6257K();
        String m6077d = this.f1431a.m6077d();
        m6256L();
        return m6077d;
    }

    /* renamed from: e_ */
    public boolean mo6183e_() {
        return this.f1431a.mo6183e_();
    }

    /* renamed from: a */
    public void m6249a(Unit unit, C0813u c0813u, Paint paint, Paint paint2) {
        m6257K();
        this.f1431a.m6084a(this.f1432b, c0813u, paint, paint2);
        m6256L();
    }

    /* renamed from: a */
    public void m6250a(Unit unit, C0813u c0813u) {
        m6257K();
        this.f1431a.m6085a(this.f1432b, c0813u);
        m6256L();
    }

    /* renamed from: j */
    public BitmapOrTexture mo6180j() {
        return this.f1431a.mo6180j();
    }

    /* renamed from: h */
    public BitmapOrTexture m6237h(Unit unit) {
        return this.f1431a.m6066h(unit);
    }

    /* renamed from: v */
    public Rect mo6177v() {
        return this.f1431a.mo6177v();
    }

    /* renamed from: i */
    public Unit m6236i(Unit unit) {
        return this.f1431a.m6065i(this.f1432b);
    }

    public int hashCode() {
        return this.f1431a.hashCode();
    }

    public String toString() {
        return this.f1431a.toString();
    }

    public C0212g(Action action, AbstractC0623y abstractC0623y, C0208c c0208c) {
        super(c0208c);
        this.f1433c = C0207b.emptyActionFilter;
        this.f1431a = action;
        this.f1432b = abstractC0623y;
        this.f1459g = this.f1431a.f1459g;
    }

    /* renamed from: m_ */
    public Action m6227m_() {
        return this.f1431a;
    }

    /* renamed from: x */
    public boolean m6218x() {
        return this.f1431a.m6037x();
    }

    /* renamed from: s */
    public boolean mo6178s() {
        return this.f1431a.mo6178s();
    }

    /* renamed from: y */
    public InterfaceC0303as m6217y() {
        return this.f1431a.m6036y();
    }

    /* renamed from: z */
    public C0208c m6216z() {
        return this.f1431a.m6095N();
    }

    /* renamed from: a */
    public void m6251a(Unit unit, Unit unit2) {
        super.m6086a(unit, unit2);
    }

    /* renamed from: a */
    public boolean m6252a(Unit unit, Team team) {
        return this.f1431a.m6087a(this.f1432b, team);
    }

    /* renamed from: A */
    public boolean m6267A() {
        return this.f1431a.m6106A();
    }

    /* renamed from: a */
    public boolean m6253a(Unit unit) {
        return this.f1431a.m6088a((Unit) this.f1432b);
    }

    /* renamed from: B */
    public C0424b m6266B() {
        return this.f1431a.m6105B();
    }

    /* renamed from: j */
    public String m6235j(Unit unit) {
        return this.f1431a.m6063j(this.f1432b);
    }

    /* renamed from: d */
    public boolean m6242d(Unit unit, boolean z) {
        return this.f1431a.m6074d(this.f1432b, z);
    }

    /* renamed from: k */
    public boolean m6233k(Unit unit) {
        return this.f1431a.m6061k(this.f1432b);
    }

    /* renamed from: l */
    public boolean m6230l(Unit unit) {
        return this.f1431a.m6058l(this.f1432b);
    }

    /* renamed from: C */
    public boolean m6265C() {
        return this.f1431a.m6104C();
    }

    /* renamed from: D */
    public boolean m6264D() {
        return this.f1431a.m6103D();
    }

    /* renamed from: E */
    public InterfaceC0303as m6263E() {
        return this.f1431a.m6102E();
    }

    /* renamed from: F */
    public boolean m6262F() {
        return this.f1431a.m6101F();
    }

    /* renamed from: m */
    public boolean m6228m(Unit unit) {
        return this.f1431a.m6055m(this.f1432b);
    }

    /* renamed from: n */
    public boolean m6226n(Unit unit) {
        return this.f1431a.m6054n(this.f1432b);
    }

    /* renamed from: c */
    public boolean m6245c(Unit unit, boolean z) {
        return this.f1431a.m6078c(this.f1432b, z);
    }

    /* renamed from: o */
    public boolean m6225o(Unit unit) {
        return this.f1431a.m6052o(this.f1432b);
    }

    /* renamed from: G */
    public boolean m6261G() {
        return this.f1431a.m6100G();
    }

    /* renamed from: c */
    public void m6246c(Unit unit) {
        this.f1431a.m6079c(this.f1432b);
    }

    /* renamed from: l */
    public float m6231l() {
        return this.f1431a.m6059l();
    }

    /* renamed from: m */
    public int m6229m() {
        return this.f1431a.m6056m();
    }

    /* renamed from: H */
    public boolean m6260H() {
        return this.f1431a.m6099H();
    }

    /* renamed from: I */
    public boolean m6259I() {
        return this.f1431a.m6098I();
    }

    /* renamed from: p */
    public float m6224p(Unit unit) {
        return this.f1431a.m6049p(this.f1432b);
    }

    /* renamed from: q */
    public ArrayList mo6179q(Unit unit) {
        return this.f1431a.mo6179q(this.f1432b);
    }

    /* renamed from: r */
    public boolean m6223r(Unit unit) {
        if (!this.f1433c.isAvailable(this, unit)) {
            return false;
        }
        return this.f1431a.m6047r(this.f1432b);
    }

    /* renamed from: b */
    public boolean m6247b(Unit unit) {
        if (!this.f1433c.isAvailable(this, unit)) {
            return false;
        }
        return this.f1431a.mo4245b(this.f1432b);
    }

    /* renamed from: J */
    public int m6258J() {
        return this.f1431a.m6097J();
    }

    /* renamed from: s */
    public boolean m6222s(Unit unit) {
        return this.f1431a.m6045s(this.f1432b);
    }

    /* renamed from: t */
    public boolean m6220t(Unit unit) {
        return this.f1431a.m6043t(this.f1432b);
    }

    /* renamed from: a */
    public boolean m6255a(C0212g c0212g) {
        return this.f1431a == c0212g.f1431a && this.f1432b == c0212g.f1432b && m6095N() == c0212g.m6095N() && this.f1433c == c0212g.f1433c;
    }
}
