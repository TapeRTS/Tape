package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p028g.C0554e;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.a.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/s.class */
public abstract class Action implements Comparable {

    /* renamed from: g */
    public float f1459g = -999.0f;

    /* renamed from: h */
    public C0206a f1460h = C0206a.f1425a;

    /* renamed from: i */
    public static final C0208c f1461i = C0208c.f1427a;

    /* renamed from: a */
    private C0208c f1462a;

    /* renamed from: b */
    private C0424b f1463b;

    /* renamed from: b */
    public abstract String getText();

    /* renamed from: a */
    public abstract String getDescription();

    /* renamed from: c */
    public abstract int mo6185c();

    /* renamed from: b */
    public abstract int mo6186b(Unit unit, boolean z);

    /* renamed from: i */
    public abstract InterfaceC0303as mo7517i();

    /* renamed from: g */
    public abstract boolean mo6181g();

    /* renamed from: e */
    public abstract EnumC0226u mo6184e();

    /* renamed from: f */
    public abstract EnumC0225t mo6182f();

    /* renamed from: j_ */
    public float m6062j_() {
        if (this instanceof C0220o) {
            return -100.0f;
        }
        if (this.f1459g != -999.0f) {
            return this.f1459g;
        }
        InterfaceC0303as mo7517i = mo7517i();
        if (mo7517i != null && mo6181g()) {
            return mo7517i.mo5708g();
        }
        return 1.0f;
    }

    /* renamed from: a */
    public int mo5507a(Action action) {
        if (action == null) {
            return 0;
        }
        float m6062j_ = m6062j_() - action.m6062j_();
        if (m6062j_ < 0.0f) {
            return -1;
        }
        return m6062j_ > 0.0f ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass() || !this.f1462a.equals(((Action) obj).f1462a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m6081b(C0208c c0208c) {
        if (c0208c == null || c0208c == f1461i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m6080c(C0208c c0208c) {
        return !m6081b(c0208c);
    }

    /* renamed from: a */
    public static boolean m6089a(Action action, Action action2) {
        return action == action2;
    }

    /* renamed from: d */
    public final boolean m6076d(C0208c c0208c) {
        return this.f1462a == c0208c;
    }

    public Action(int i) {
        m6082a(String.valueOf(i));
    }

    public Action(String str) {
        m6082a(str);
    }

    public Action(C0208c c0208c) {
        m6072e(c0208c);
    }

    /* renamed from: a */
    public final void m6082a(String str) {
        this.f1462a = C0208c.m6280a(str);
    }

    /* renamed from: e */
    public final void m6072e(C0208c c0208c) {
        this.f1462a = c0208c;
    }

    /* renamed from: N */
    public final C0208c m6095N() {
        return this.f1462a;
    }

    /* renamed from: z */
    public C0208c m6035z() {
        return m6095N();
    }

    /* renamed from: O */
    public final String m6094O() {
        if (this.f1462a == null) {
            return "<null index>";
        }
        return this.f1462a.m6284a();
    }

    /* renamed from: P */
    public C0449h m6093P() {
        return null;
    }

    /* renamed from: d */
    public String m6075d(Unit unit) {
        return getText();
    }

    /* renamed from: e */
    public String m6071e(Unit unit) {
        return getDescription();
    }

    /* renamed from: B */
    public C0424b m6105B() {
        C0424b m6292a = this.f1460h.m6292a();
        if (m6292a != null) {
            return m6292a;
        }
        int mo6185c = mo6185c();
        if (mo6185c == 0) {
            return C0424b.f2709a;
        }
        if (this.f1463b == null || this.f1463b.m5231a() != mo6185c) {
            this.f1463b = C0424b.m5230a(mo6185c);
        }
        return this.f1463b;
    }

    /* renamed from: o_ */
    public C0424b m6051o_() {
        if (this.f1460h.m6288b() != null) {
            return this.f1460h.m6288b();
        }
        return null;
    }

    /* renamed from: k_ */
    public boolean m6060k_() {
        return false;
    }

    /* renamed from: g */
    public boolean m6068g(Unit unit) {
        return this.f1460h.m6287b(unit);
    }

    /* renamed from: j */
    public String m6063j(Unit unit) {
        return this.f1460h.m6286c(unit);
    }

    /* renamed from: a */
    public void m6086a(Unit unit, Unit unit2) {
        this.f1460h.m6290a(unit, unit2);
    }

    /* renamed from: d */
    public boolean m6074d(Unit unit, boolean z) {
        return true;
    }

    /* renamed from: k */
    public boolean m6061k(Unit unit) {
        return false;
    }

    /* renamed from: l */
    public boolean m6058l(Unit unit) {
        return false;
    }

    /* renamed from: a */
    public boolean mo4247a(Unit unit, boolean z) {
        if (m6068g(unit) || C0554e.m3728a(unit, m6095N()) > 0) {
            return false;
        }
        if (z) {
            return m6105B().m5194c(unit, m6092Q());
        }
        return m6105B().mo5235b(unit);
    }

    /* renamed from: r */
    public boolean m6047r(Unit unit) {
        return mo4245b(unit);
    }

    /* renamed from: u */
    public boolean m6041u(Unit unit) {
        return this.f1460h.m6291a(unit);
    }

    /* renamed from: b */
    public boolean mo4245b(Unit unit) {
        return this.f1460h.m6289a(unit, false);
    }

    /* renamed from: a */
    public boolean m6087a(Unit unit, Team team) {
        return false;
    }

    /* renamed from: u */
    public boolean m6042u() {
        return false;
    }

    /* renamed from: h */
    public boolean m6067h() {
        return false;
    }

    /* renamed from: C */
    public boolean m6104C() {
        return false;
    }

    /* renamed from: D */
    public boolean m6103D() {
        return true;
    }

    /* renamed from: A */
    public boolean m6106A() {
        return false;
    }

    /* renamed from: y */
    public InterfaceC0303as m6036y() {
        return null;
    }

    /* renamed from: E */
    public InterfaceC0303as m6102E() {
        return null;
    }

    /* renamed from: F */
    public boolean m6101F() {
        return false;
    }

    /* renamed from: t */
    public int m6044t() {
        return 1;
    }

    /* renamed from: o */
    public boolean m6053o() {
        return false;
    }

    /* renamed from: m */
    public boolean m6055m(Unit unit) {
        return false;
    }

    /* renamed from: n */
    public boolean m6054n(Unit unit) {
        return false;
    }

    /* renamed from: v */
    public EnumC0340e m6039v(Unit unit) {
        return null;
    }

    /* renamed from: d */
    public String m6077d() {
        String str = null;
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        Unit[] m523a = gameEngine.f6111bS.f5255bL.m523a();
        int size = gameEngine.f6111bS.f5255bL.size();
        for (int i2 = 0; i2 < size; i2++) {
            Unit unit = m523a[i2];
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (str == null) {
                    str = m6075d(abstractC0623y);
                }
                int mo6186b = mo6186b(abstractC0623y, true);
                if (mo6186b != -1 && mo6186b != 0) {
                    i += mo6186b;
                }
            }
        }
        if (str == null) {
            str = getText();
        }
        if (i != -1 && i != 0) {
            str = str + " (" + i + ")";
        }
        return str;
    }

    /* renamed from: e_ */
    public boolean mo6183e_() {
        return true;
    }

    /* renamed from: w */
    public String m6038w(Unit unit) {
        return m6075d(unit);
    }

    /* renamed from: a */
    public void m6084a(Unit unit, C0813u c0813u, Paint paint, Paint paint2) {
        String m6038w;
        Paint paint3 = c0813u.f5374g;
        if (paint != null) {
            c0813u.m1911a(paint);
        }
        if (mo6183e_() && (m6038w = m6038w(unit)) != null && !m6038w.equals(VariableScope.nullOrMissingString)) {
            c0813u.m1902b(m6038w);
        }
        if (paint != null) {
            c0813u.m1911a(paint3);
        }
        EnumC0225t mo6182f = mo6182f();
        C0424b m6105B = m6105B();
        if (!m6105B.m5209b() && mo6182f != EnumC0225t.f1472i) {
            c0813u.m1902b(" (");
            Unit unit2 = null;
            int i = 0;
            if (paint2 != null) {
                unit2 = unit;
                i = paint2.m7230e();
            }
            m6105B.m5214a(c0813u, false, true, 5, true, unit2, i);
            c0813u.m1902b(")");
        }
        C0424b m6051o_ = m6051o_();
        if (m6051o_ != null && !m6051o_.m5209b() && mo6182f != EnumC0225t.f1472i) {
            c0813u.m1902b(" (");
            m6051o_.m5214a(c0813u, false, true, 5, true, null, 0);
            c0813u.m1902b(")");
        }
    }

    /* renamed from: a */
    public void m6085a(Unit unit, C0813u c0813u) {
        String m2220a = C0760a.m2220a(this, false);
        if (m2220a != null && !VariableScope.nullOrMissingString.equals(m2220a)) {
            c0813u.m1902b("\n" + m2220a.trim());
        }
        String m6071e = m6071e(unit);
        if (m6071e != null && !VariableScope.nullOrMissingString.equals(m6071e)) {
            c0813u.m1902b("\n" + m6071e.trim());
        }
    }

    /* renamed from: c */
    public boolean m6078c(Unit unit, boolean z) {
        return false;
    }

    /* renamed from: f */
    public void m6069f(Unit unit) {
    }

    /* renamed from: j */
    public BitmapOrTexture mo6180j() {
        if (mo6182f() == EnumC0225t.f1466c) {
            return GameEngine.getInstance().f6111bS.f5234be;
        }
        return null;
    }

    /* renamed from: h */
    public BitmapOrTexture m6066h(Unit unit) {
        return null;
    }

    /* renamed from: J */
    public int m6097J() {
        return Color.argb(100, 255, 255, 255);
    }

    /* renamed from: v */
    public Rect mo6177v() {
        return null;
    }

    /* renamed from: i */
    public Unit m6065i(Unit unit) {
        return null;
    }

    /* renamed from: s */
    public boolean m6045s(Unit unit) {
        return true;
    }

    /* renamed from: t */
    public boolean m6043t(Unit unit) {
        return true;
    }

    /* renamed from: a */
    public boolean m6088a(Unit unit) {
        return this.f1460h.m6285d(unit);
    }

    /* renamed from: s */
    public boolean mo6178s() {
        return false;
    }

    /* renamed from: o */
    public boolean m6052o(Unit unit) {
        return true;
    }

    /* renamed from: G */
    public boolean m6100G() {
        return false;
    }

    /* renamed from: c */
    public void m6079c(Unit unit) {
    }

    /* renamed from: l */
    public float m6059l() {
        return 1.0f;
    }

    /* renamed from: m */
    public int m6056m() {
        return -1;
    }

    /* renamed from: H */
    public boolean m6099H() {
        return false;
    }

    /* renamed from: I */
    public boolean m6098I() {
        return false;
    }

    /* renamed from: x */
    public boolean m6037x() {
        return false;
    }

    /* renamed from: p */
    public float m6049p(Unit unit) {
        return -1.0f;
    }

    /* renamed from: q */
    public ArrayList mo6179q(Unit unit) {
        return null;
    }

    /* renamed from: M */
    public C0639ad m6096M() {
        return null;
    }

    /* renamed from: l_ */
    public boolean m6057l_() {
        return false;
    }

    /* renamed from: Q */
    public boolean m6092Q() {
        return false;
    }

    /* renamed from: a */
    public void m6083a(AbstractC0623y abstractC0623y) {
    }

    /* renamed from: a */
    public boolean m6091a(float f, float f2) {
        return false;
    }

    /* renamed from: p */
    public boolean m6050p() {
        return false;
    }
}
