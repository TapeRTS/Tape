package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.units.p023d.AbstractC0403c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e.class */
public class C0432e extends AbstractC0403c {

    /* renamed from: b */
    float f3111b;

    /* renamed from: a */
    static C0748e f3110a = null;

    /* renamed from: c */
    static PorterDuffColorFilter f3112c = new PorterDuffColorFilter(Color.m4214a(200, 200, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.crystalResource;
    }

    /* renamed from: c */
    public static void m2539c() {
        f3110a = AbstractC0789l.m638u().f5514bw.mo194a(C0063R.drawable.crystal);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        return f3110a;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
    }

    public C0432e(boolean z) {
        super(z);
        this.f3387D = f3110a;
        m2035b(f3110a);
        this.f1474bO = 11.0f;
        this.f1475bP = this.f1474bO + 1.0f;
        this.f1485bZ = 600.0f;
        this.f1484bY = this.f1485bZ;
        m406R(1);
        this.f2965n.m4136a(0, -1, 0, 0);
        this.f2966o.m4135a(this.f2965n);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c
    /* renamed from: f */
    public Paint mo2538f() {
        return super.mo2538f();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        this.f3111b += 0.01f * f;
        if (this.f3111b > 1.0f) {
            this.f3111b -= 1.0f;
            if (this.f3111b > 1.0f) {
                this.f3111b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: g */
    public float mo2537g() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: h */
    public EnumC0212ah mo2358h() {
        return EnumC0212ah.NONE;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: i */
    public boolean mo2357i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: j */
    public boolean mo2163j() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1534cW.m4120a(m3302co());
        return RectF.m4119a(u.f5563ct, f1534cW);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 0.0f;
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
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: n */
    public void mo2536n() {
        super.mo2536n();
        this.f3111b = ((this.f5843dI * 5.0f) + (this.f5842dH * 3.0f)) % 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: o */
    public boolean mo2535o() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: p */
    public boolean mo2534p() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: q */
    public boolean mo2533q() {
        return true;
    }
}
