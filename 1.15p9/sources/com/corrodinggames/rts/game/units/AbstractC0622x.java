package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/x.class */
public abstract class AbstractC0622x extends AbstractC0623y {
    /* renamed from: v */
    public BitmapOrTexture m3259v() {
        return null;
    }

    /* renamed from: d */
    public BitmapOrTexture m3272d() {
        return Builder.f3582b;
    }

    /* renamed from: k */
    public BitmapOrTexture m3263k() {
        return null;
    }

    /* renamed from: d */
    public BitmapOrTexture m3271d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m3269e() {
        return false;
    }

    public AbstractC0622x(boolean z) {
        super(z);
        m2884T(20);
        m2883U(20);
        this.radius = 1.0f;
        this.displayRadius = this.radius;
        this.collidable = false;
        this.f1632ct = 100.0f;
        this.f1631cs = this.f1632ct;
        this.image = Builder.f3582b;
    }

    /* renamed from: c_ */
    public void m3273c_() {
        this.collidable = false;
    }

    /* renamed from: a */
    public void m3280a(float f) {
        super.update(f);
    }

    /* renamed from: a */
    public void m3279a(float f, boolean z) {
    }

    /* renamed from: e */
    public float m3268e(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float m3267f(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public boolean m3275c(float f) {
        return false;
    }

    /* renamed from: a */
    public void m3277a(Unit unit, int i) {
    }

    /* renamed from: m */
    public float m3261m() {
        return 30.0f;
    }

    /* renamed from: b */
    public float m3276b(int i) {
        return 100.0f;
    }

    /* renamed from: z */
    public float m3258z() {
        return 0.0f;
    }

    /* renamed from: A */
    public float m3292A() {
        return 4.8f;
    }

    /* renamed from: B */
    public float m3291B() {
        return 0.35f;
    }

    /* renamed from: c */
    public float m3274c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean m3262l() {
        return false;
    }

    /* renamed from: C */
    public float m3290C() {
        return 0.04f;
    }

    /* renamed from: D */
    public float m3289D() {
        return 0.1f;
    }

    /* renamed from: E */
    public boolean m3288E() {
        return true;
    }

    /* renamed from: g */
    public float m3266g(int i) {
        return 10.0f;
    }

    /* renamed from: F */
    public boolean m3287F() {
        return false;
    }

    /* renamed from: G */
    public float m3286G() {
        return 1.0f;
    }

    /* renamed from: H */
    public float m3285H() {
        return 1.0f;
    }

    /* renamed from: u */
    public boolean m3260u() {
        return true;
    }

    /* renamed from: d */
    public boolean m3270d(Unit unit) {
        return false;
    }

    /* renamed from: I */
    public boolean mo3295I() {
        return false;
    }

    /* renamed from: J */
    public boolean m3283J() {
        return true;
    }

    /* renamed from: a */
    public float m3278a(Unit unit, float f, Projectile projectile) {
        return super.mo4499a(unit, 0.0f, projectile);
    }

    /* renamed from: P */
    public boolean m3282P() {
        return true;
    }

    /* renamed from: Q */
    public boolean mo3294Q() {
        return false;
    }

    /* renamed from: i */
    public boolean mo3293i() {
        return true;
    }

    /* renamed from: h */
    public EnumC0246ao m3265h() {
        return EnumC0246ao.f1705d;
    }
}
