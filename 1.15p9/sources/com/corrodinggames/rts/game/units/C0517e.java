package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e.class */
public class C0517e extends AbstractC0488d {

    /* renamed from: b */
    float f3569b;

    /* renamed from: a */
    static C0934e f3570a = null;

    /* renamed from: c */
    static PorterDuffColorFilter f3571c = new PorterDuffColorFilter(Color.m6128a(200, 200, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: b */
    public UnitType m3636r() {
        return UnitType.crystalResource;
    }

    /* renamed from: c */
    public static void m3651c() {
        f3570a = GameEngine.m1234A().f6107bO.mo930a(C0067R.drawable.crystal);
    }

    /* renamed from: d */
    public C0934e m3649d() {
        return f3570a;
    }

    /* renamed from: e */
    public boolean m3648e() {
        return true;
    }

    /* renamed from: a */
    public void m3655a(int i) {
    }

    public C0517e(boolean z) {
        super(z);
        this.f3880L = f3570a;
        m2873b(f3570a);
        this.f1620ch = 11.0f;
        this.f1621ci = this.f1620ch + 1.0f;
        this.f1632ct = 600.0f;
        this.f1631cs = this.f1632ct;
        m472S(1);
        this.f3421n.m6053a(0, -1, 0, 0);
        this.f3422o.m6052a(this.f3421n);
    }

    /* renamed from: f */
    public Paint m3647f() {
        return super.m3849f();
    }

    /* renamed from: a */
    public void m3656a(float f) {
        super.mo4640a(f);
        this.f3569b += 0.01f * f;
        if (this.f3569b > 1.0f) {
            this.f3569b -= 1.0f;
            if (this.f3569b > 1.0f) {
                this.f3569b = 0.0f;
            }
        }
    }

    /* renamed from: g */
    public float m3646g() {
        return 0.02f;
    }

    /* renamed from: h */
    public EnumC0246ao m3645h() {
        return EnumC0246ao.NONE;
    }

    /* renamed from: i */
    public boolean mo3283i() {
        return false;
    }

    /* renamed from: p_ */
    public boolean m3638p_() {
        GameEngine m1234A = GameEngine.m1234A();
        f1683ds.m6038a(m4752cD());
        return RectF.m6037a(m1234A.f6243cL, f1683ds);
    }

    /* renamed from: k */
    public C0934e m3644k() {
        return null;
    }

    /* renamed from: l */
    public boolean m3643l() {
        return false;
    }

    /* renamed from: m */
    public float m3642m() {
        return 0.0f;
    }

    /* renamed from: b */
    public float m3652b(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public float m3650c(int i) {
        return 0.0f;
    }

    /* renamed from: a */
    public void m3654a(Unit unit, int i) {
    }

    /* renamed from: n */
    public void m3641n() {
        super.mo4793n();
        this.f3569b = ((this.f6952el * 5.0f) + (this.f6951ek * 3.0f)) % 1.0f;
    }

    /* renamed from: o */
    public boolean m3640o() {
        return true;
    }

    /* renamed from: p */
    public boolean m3639p() {
        return true;
    }

    /* renamed from: q */
    public boolean m3637q() {
        return true;
    }
}
