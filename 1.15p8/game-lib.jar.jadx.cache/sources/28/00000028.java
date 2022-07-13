package com.corrodinggames.rts.gameFramework.effect;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;

/* renamed from: com.corrodinggames.rts.gameFramework.c.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/b.class */
public class C0662b {

    /* renamed from: a */
    boolean f4246a = false;

    /* renamed from: b */
    BitmapOrTexture f4247b = null;

    /* renamed from: c */
    Paint f4248c = new UniquePaint();

    /* renamed from: d */
    RectF f4249d = new RectF();

    /* renamed from: e */
    float f4250e = 0.0f;

    /* renamed from: f */
    float f4251f = 0.0f;

    /* renamed from: a */
    public boolean m2244a() {
        return GameEngine.getInstance().curSettings.renderClouds;
    }

    /* renamed from: b */
    public void m2242b() {
        this.f4247b = GameEngine.getInstance().graphics.loadImage(R.drawable.noise, false);
        this.f4246a = true;
    }

    /* renamed from: a */
    public void m2243a(float f) {
        if (!m2244a()) {
            return;
        }
        if (!this.f4246a) {
            m2242b();
        }
        this.f4250e += 0.2f * f;
        this.f4251f += 0.07f * f;
        this.f4250e %= this.f4247b.getWidth();
        this.f4251f %= this.f4247b.getHeight();
    }

    /* renamed from: b */
    public void m2241b(float f) {
        if (!m2244a()) {
            return;
        }
        if (!this.f4246a) {
            m2242b();
        }
        GameEngine game = GameEngine.getInstance();
        game.graphics.mo137h();
        game.graphics.mo224a(3.0f, 3.0f);
        float maxf = (int) CommonUtils.maxf((-game.viewpointX_rounded) / 3.0f, 0.0f);
        float maxf2 = (int) CommonUtils.maxf((-game.viewpointY_rounded) / 3.0f, 0.0f);
        this.f4249d.m4652a(maxf, maxf2, ((int) (game.f5884cz / 3.0f)) + 1, ((int) (game.f5847cA / 3.0f)) + 1);
        this.f4248c.setColor(-16777216);
        this.f4248c.setAlpha(40);
        game.graphics.mo189a(this.f4247b, this.f4249d, this.f4248c, (game.viewpointX_rounded / 3.0f) + maxf + this.f4250e, (game.viewpointY_rounded / 3.0f) + maxf2 + this.f4251f, 0, 0);
        game.graphics.mo136i();
    }
}