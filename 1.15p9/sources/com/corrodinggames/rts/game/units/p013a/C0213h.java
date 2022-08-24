package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Color;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/h.class */
public class C0213h extends Action {

    /* renamed from: a */
    Action f1436a;

    /* renamed from: b */
    C0207b f1437b;

    /* renamed from: c */
    boolean f1438c;

    /* renamed from: d */
    public int f1439d;

    /* renamed from: e */
    public boolean f1440e;

    /* renamed from: f */
    public final int f1441f;

    /* renamed from: j_ */
    public float m6201j_() {
        return this.f1436a.m6062j_();
    }

    /* renamed from: a */
    public int mo5507a(Action action) {
        return this.f1436a.m6090a(action);
    }

    /* renamed from: b */
    public String mo6187b() {
        return this.f1436a.getText();
    }

    /* renamed from: d */
    public String m6208d(Unit unit) {
        return this.f1436a.m6075d(unit);
    }

    /* renamed from: a */
    public String mo6189a() {
        return this.f1436a.getDescription();
    }

    /* renamed from: e */
    public String m6207e(Unit unit) {
        return this.f1436a.m6071e(unit);
    }

    /* renamed from: c */
    public int mo6185c() {
        return 0;
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        return this.f1436a.mo6186b(unit, z);
    }

    /* renamed from: k_ */
    public boolean m6200k_() {
        return this.f1436a.m6060k_();
    }

    /* renamed from: a */
    public boolean m6212a(Unit unit, boolean z) {
        if (this.f1438c) {
            return this.f1436a.mo4247a(unit, z);
        }
        return true;
    }

    /* renamed from: t */
    public int m6198t() {
        return this.f1436a.m6044t();
    }

    /* renamed from: f */
    public void m6206f(Unit unit) {
        this.f1436a.m6069f(unit);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0213h) {
            return this.f1436a.equals(((C0213h) obj).f1436a);
        }
        return false;
    }

    /* renamed from: g */
    public boolean m6205g(Unit unit) {
        return this.f1436a.m6068g(unit);
    }

    /* renamed from: b */
    public boolean m6211b(Unit unit) {
        if (!this.f1437b.isAvailable(this, unit)) {
            return false;
        }
        return this.f1436a.mo4245b(unit);
    }

    /* renamed from: u */
    public boolean m6197u() {
        return this.f1436a.m6042u();
    }

    /* renamed from: h */
    public boolean m6204h() {
        return this.f1436a.m6067h();
    }

    /* renamed from: i */
    public InterfaceC0303as mo7517i() {
        return this.f1436a.mo7517i();
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return this.f1436a.mo6181g();
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return this.f1436a.mo6184e();
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return this.f1436a.mo6182f();
    }

    /* renamed from: d */
    public String m6209d() {
        return this.f1436a.m6077d();
    }

    /* renamed from: e_ */
    public boolean mo6183e_() {
        return this.f1436a.mo6183e_();
    }

    /* renamed from: a */
    public void m6213a(Unit unit, C0813u c0813u) {
        this.f1436a.m6085a(unit, c0813u);
        InterfaceC0303as mo7517i = this.f1436a.mo7517i();
        if (mo7517i != null && (mo7517i instanceof C0453l)) {
            C0453l c0453l = (C0453l) mo7517i;
            if (c0453l.f2917I != null) {
                c0813u.m1906a("\n(mod: " + CommonUtils.m2334a(c0453l.f2917I.m1846a(), 30) + ")", this.f1441f, true);
            }
        }
    }

    /* renamed from: j */
    public BitmapOrTexture mo6180j() {
        return this.f1436a.mo6180j();
    }

    /* renamed from: h */
    public BitmapOrTexture m6203h(Unit unit) {
        return this.f1436a.m6066h(unit);
    }

    /* renamed from: v */
    public Rect mo6177v() {
        return this.f1436a.mo6177v();
    }

    /* renamed from: i */
    public Unit m6202i(Unit unit) {
        return this.f1436a.m6065i(unit);
    }

    public int hashCode() {
        return this.f1436a.hashCode();
    }

    public String toString() {
        return this.f1436a.toString();
    }

    public C0213h(Action action, C0207b c0207b) {
        this(action, c0207b, false);
    }

    public C0213h(Action action, C0207b c0207b, boolean z) {
        super(action.m6095N());
        this.f1437b = C0207b.emptyActionFilter;
        this.f1439d = 0;
        this.f1441f = Color.argb(255, 50, 50, 50);
        this.f1436a = action;
        this.f1437b = c0207b;
        m6072e(this.f1436a.m6095N());
        this.f1459g = this.f1436a.f1459g;
        this.f1438c = z;
    }

    /* renamed from: n_ */
    public Action m6199n_() {
        return this.f1436a;
    }

    /* renamed from: x */
    public boolean m6196x() {
        return true;
    }

    /* renamed from: s */
    public boolean mo6178s() {
        if (!this.f1437b.isAvailable(this, null)) {
            return false;
        }
        if (this.f1438c) {
            return this.f1436a.mo6178s();
        }
        return true;
    }

    /* renamed from: y */
    public InterfaceC0303as m6195y() {
        return this.f1436a.m6036y();
    }

    /* renamed from: c */
    public boolean m6210c(Unit unit, boolean z) {
        return this.f1436a.m6078c(unit, z);
    }

    /* renamed from: a */
    public boolean m6214a(Unit unit) {
        return this.f1436a.m6088a(unit);
    }
}
