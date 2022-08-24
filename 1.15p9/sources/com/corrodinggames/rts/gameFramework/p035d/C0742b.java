package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;

/* renamed from: com.corrodinggames.rts.gameFramework.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/b.class */
public class C0742b {

    /* renamed from: a */
    boolean f4672a = false;

    /* renamed from: b */
    BitmapOrTexture f4673b = null;

    /* renamed from: c */
    Paint f4674c = new C0930ag();

    /* renamed from: d */
    RectF f4675d = new RectF();

    /* renamed from: e */
    float f4676e = 0.0f;

    /* renamed from: f */
    float f4677f = 0.0f;

    /* renamed from: a */
    public boolean m2570a() {
        return GameEngine.getInstance().f6109bQ.renderClouds;
    }

    /* renamed from: b */
    public void m2568b() {
        this.f4673b = GameEngine.getInstance().graphics.mo926a(R.drawable.noise, false);
        this.f4672a = true;
    }

    /* renamed from: a */
    public void m2569a(float f) {
        if (!m2570a()) {
            return;
        }
        if (!this.f4672a) {
            m2568b();
        }
        this.f4676e += 0.2f * f;
        this.f4677f += 0.07f * f;
        this.f4676e %= this.f4673b.mo396m();
        this.f4677f %= this.f4673b.mo397l();
    }

    /* renamed from: b */
    public void m2567b(float f) {
        if (!m2570a()) {
            return;
        }
        if (!this.f4672a) {
            m2568b();
        }
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.graphics.mo880i();
        gameEngine.graphics.mo935a(3.0f, 3.0f);
        float m2265f = (int) CommonUtils.m2265f((-gameEngine.f6138cv) / 3.0f, 0.0f);
        float m2265f2 = (int) CommonUtils.m2265f((-gameEngine.f6139cw) / 3.0f, 0.0f);
        this.f4675d.m7195a(m2265f, m2265f2, ((int) (gameEngine.f6142cz / 3.0f)) + 1, ((int) (gameEngine.f6143cA / 3.0f)) + 1);
        this.f4674c.m7242b(-16777216);
        this.f4674c.m7237c(40);
        gameEngine.graphics.mo908a(this.f4673b, this.f4675d, this.f4674c, (gameEngine.f6138cv / 3.0f) + m2265f + this.f4676e, (gameEngine.f6139cw / 3.0f) + m2265f2 + this.f4677f, 0, 0);
        gameEngine.graphics.mo879j();
    }
}
