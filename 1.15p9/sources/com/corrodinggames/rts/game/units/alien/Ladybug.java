package com.corrodinggames.rts.game.units.alien;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.land.AbstractC0529j;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.game.units.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/c/a.class */
public class Ladybug extends AbstractC0529j {

    /* renamed from: a */
    static BitmapOrTexture f1898a = null;

    /* renamed from: b */
    static BitmapOrTexture f1899b = null;

    /* renamed from: c */
    static BitmapOrTexture f1900c = null;

    /* renamed from: d */
    static BitmapOrTexture[] f1901d = new BitmapOrTexture[10];

    /* renamed from: e */
    int f1902e;

    /* renamed from: f */
    float f1903f;

    /* renamed from: g */
    Rect f1904g;

    /* renamed from: h */
    Rect f1905h;

    /* renamed from: b */
    public UnitType m5532r() {
        return UnitType.f1753t;
    }

    /* renamed from: c */
    public static void load() {
        f1899b = GameEngine.getInstance().graphics.loadImage(R.drawable.ladybug);
        f1901d = Team.createBitmapForTeam(f1899b);
    }

    /* renamed from: d */
    public BitmapOrTexture m5539d() {
        if (this.isDead) {
            return f1898a;
        }
        return f1901d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m5535k() {
        return null;
    }

    /* renamed from: d */
    public BitmapOrTexture m5538d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m5537e() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.effects.m2537b(this.f6951ek, this.f6952el, this.height, EnumC0744d.f4710i, false, EnumC0748h.f4828c) != null) {
        }
        gameEngine.audio.m3004a(AudioEngine.f4056A, 0.8f, this.f6951ek, this.f6952el);
        C0195l.m6431a(this, 1);
        return false;
    }

    public Ladybug(boolean z) {
        super(z);
        this.f1902e = 0;
        this.f1903f = 0.0f;
        this.f1904g = new Rect();
        this.f1905h = new Rect();
        m2884T(17);
        m2883U(26);
        this.radius = 5.0f;
        this.displayRadius = this.radius + 3.0f;
        this.f1632ct = 130.0f;
        this.f1631cs = this.f1632ct;
        this.image = f1899b;
        this.f3889O = EnumC0205a.f1417a;
    }

    /* renamed from: a_ */
    public Rect m5548a_(boolean z) {
        int i = this.f1902e * this.f4223eo;
        this.f1904g.m7208a(i, 0, i + this.f4223eo, 0 + this.f4224ep);
        return this.f1904g;
    }

    /* renamed from: bP */
    public boolean m5543bP() {
        return true;
    }

    /* renamed from: bO */
    public boolean m5544bO() {
        return true;
    }

    /* renamed from: a */
    public void m5550a(float f) {
        super.update(f);
        if (this.f1647cI) {
            if (this.f1902e == 0) {
                this.f1902e = 1;
            } else {
                this.f1902e = 0;
            }
        }
        if (this.f1903f != 0.0f) {
            this.f1903f = CommonUtils.m2368a(this.f1903f, f);
            this.f1902e = 2;
        }
    }

    /* renamed from: a */
    public void m5549a(Unit unit, int i) {
        Projectile.m6506a((Unit) this, unit, 14.0f, (Projectile) null, false);
        this.f1903f = 4.0f;
        PointF E = getTurretEnd(i);
        GameEngine.getInstance().audio.m3004a(AudioEngine.f4057B, 0.3f, E.x, E.y);
    }

    /* renamed from: m */
    public float m5533m() {
        return 43.0f;
    }

    /* renamed from: b */
    public float m5545b(int i) {
        return 17.0f;
    }

    /* renamed from: z */
    public float m5531z() {
        return 1.7f;
    }

    /* renamed from: A */
    public float m5554A() {
        return 5.5f;
    }

    /* renamed from: c */
    public float m5540c(int i) {
        return 99.0f;
    }

    /* renamed from: c */
    public boolean m5541c(float f) {
        return super.draw(f);
    }

    /* renamed from: C */
    public float m5553C() {
        return 0.07f;
    }

    /* renamed from: D */
    public float m5552D() {
        return 0.12f;
    }

    /* renamed from: l */
    public boolean m5534l() {
        return true;
    }

    /* renamed from: af */
    public boolean m5547af() {
        return false;
    }

    /* renamed from: g */
    public float m5536g(int i) {
        return 7.0f;
    }

    /* renamed from: E */
    public boolean m5551E() {
        return true;
    }
}
