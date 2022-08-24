package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/e.class */
public class AudioEngine {

    /* renamed from: a */
    ArrayList f4030a = new ArrayList();

    /* renamed from: b */
    public boolean f4031b;

    /* renamed from: c */
    public static AbstractC0634h f4032c = new C0627a();

    /* renamed from: d */
    public static AbstractC0635i f4033d;

    /* renamed from: e */
    public static AbstractC0635i f4034e;

    /* renamed from: f */
    public static AbstractC0635i f4035f;

    /* renamed from: g */
    public static AbstractC0635i f4036g;

    /* renamed from: h */
    public static AbstractC0635i f4037h;

    /* renamed from: i */
    public static AbstractC0635i f4038i;

    /* renamed from: j */
    public static AbstractC0635i f4039j;

    /* renamed from: k */
    public static AbstractC0635i f4040k;

    /* renamed from: l */
    public static AbstractC0635i f4041l;

    /* renamed from: m */
    public static AbstractC0635i f4042m;

    /* renamed from: n */
    public static AbstractC0635i f4043n;

    /* renamed from: o */
    public static AbstractC0635i f4044o;

    /* renamed from: p */
    public static AbstractC0635i f4045p;

    /* renamed from: q */
    public static AbstractC0635i f4046q;

    /* renamed from: r */
    public static AbstractC0635i f4047r;

    /* renamed from: s */
    public static AbstractC0635i f4048s;

    /* renamed from: t */
    public static AbstractC0635i f4049t;

    /* renamed from: u */
    public static AbstractC0635i f4050u;

    /* renamed from: v */
    public static AbstractC0635i f4051v;

    /* renamed from: w */
    public static AbstractC0635i f4052w;

    /* renamed from: x */
    public static AbstractC0635i f4053x;

    /* renamed from: y */
    public static AbstractC0635i f4054y;

    /* renamed from: z */
    public static AbstractC0635i f4055z;

    /* renamed from: A */
    public static AbstractC0635i f4056A;

    /* renamed from: B */
    public static AbstractC0635i f4057B;

    /* renamed from: C */
    public static AbstractC0635i f4058C;

    /* renamed from: D */
    public static AbstractC0635i f4059D;

    /* renamed from: E */
    public static AbstractC0635i f4060E;

    /* renamed from: F */
    public static AbstractC0635i f4061F;

    /* renamed from: a */
    public boolean m3005a(AbstractC0635i abstractC0635i, float f) {
        if (this.f4030a.contains(abstractC0635i)) {
            return false;
        }
        this.f4030a.add(abstractC0635i);
        return true;
    }

    /* renamed from: a */
    public boolean m3008a() {
        GameEngine gameEngine = GameEngine.getInstance();
        return m3007a(gameEngine.f6109bQ.masterVolume * gameEngine.f6109bQ.gameVolume);
    }

    /* renamed from: a */
    public boolean m3007a(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (f < 0.01f || this.f4031b) {
            return false;
        }
        return gameEngine.f6109bQ.enableSounds;
    }

    /* renamed from: b */
    public static void m3000b() {
    }

    /* renamed from: a */
    public void m3006a(Context context) {
        f4032c.mo2989a(context);
        f4034e = f4032c.mo2990a(R.raw.attack);
        f4034e.f4065d = 0.2f;
        f4033d = f4032c.mo2990a(R.raw.attack2);
        f4035f = f4032c.mo2990a(R.raw.move);
        f4036g = f4032c.mo2990a(R.raw.click);
        f4037h = f4032c.mo2990a(R.raw.click_add);
        f4038i = f4032c.mo2990a(R.raw.click_remove);
        f4039j = f4032c.mo2990a(R.raw.warning);
        f4040k = f4032c.mo2990a(R.raw.message);
        f4042m = f4032c.mo2990a(R.raw.missile_fire);
        f4043n = f4032c.mo2990a(R.raw.missile_hit);
        f4044o = f4032c.mo2990a(R.raw.unit_explode);
        f4045p = f4032c.mo2990a(R.raw.buiding_explode);
        f4046q = f4032c.mo2990a(R.raw.tank_firing);
        f4047r = f4032c.mo2990a(R.raw.cannon_firing);
        f4048s = f4032c.mo2990a(R.raw.gun_fire);
        f4053x = f4032c.mo2990a(R.raw.lighting_burst);
        f4054y = f4032c.mo2990a(R.raw.plasma_fire);
        f4055z = f4032c.mo2990a(R.raw.plasma_fire2);
        f4049t = f4032c.mo2990a(R.raw.firing3);
        f4050u = f4032c.mo2990a(R.raw.firing4);
        f4051v = f4032c.mo2990a(R.raw.large_gun_fire1);
        f4052w = f4032c.mo2990a(R.raw.large_gun_fire2);
        f4056A = f4032c.mo2990a(R.raw.bug_die);
        f4057B = f4032c.mo2990a(R.raw.bug_attack);
        f4041l = f4032c.mo2990a(R.raw.interface_error);
        f4058C = f4032c.mo2990a(R.raw.nuke_explode);
        f4059D = f4032c.mo2990a(R.raw.nuke_launch);
        f4060E = f4032c.mo2990a(R.raw.laser_deflect);
        f4061F = f4032c.mo2990a(R.raw.laser_deflect2);
        f4032c.mo2991a();
    }

    /* renamed from: a */
    public AbstractC0635i m3002a(String str) {
        AbstractC0635i abstractC0635i = (AbstractC0635i) f4032c.f4062h.get(str);
        if (abstractC0635i == null) {
            throw new RuntimeException("Could not find sound:" + str);
        }
        return abstractC0635i;
    }

    /* renamed from: b */
    public void m2998b(AbstractC0635i abstractC0635i, float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        float f2 = f * gameEngine.f6109bQ.masterVolume * gameEngine.f6109bQ.interfaceVolume * abstractC0635i.f4065d;
        if (!m3007a(f2) || f2 < 0.01d || !m3005a(abstractC0635i, f2)) {
            return;
        }
        if (gameEngine.f6075aq) {
            f2 /= 20.0f;
        }
        abstractC0635i.mo2992a(f2, f2, 1, 0, 1.0f);
    }

    /* renamed from: c */
    public void m2996c(AbstractC0635i abstractC0635i, float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        float f2 = f * gameEngine.f6109bQ.masterVolume * gameEngine.f6109bQ.gameVolume * abstractC0635i.f4065d;
        if (!m3007a(f2)) {
            return;
        }
        if (gameEngine.f6075aq) {
            f2 /= 20.0f;
        }
        if (!m3005a(abstractC0635i, f2)) {
            return;
        }
        abstractC0635i.mo2992a(f2, f2, 1, 0, 1.0f);
    }

    /* renamed from: a */
    public void m3004a(AbstractC0635i abstractC0635i, float f, float f2, float f3) {
        m3003a(abstractC0635i, f, 1.0f, f2, f3);
    }

    /* renamed from: a */
    public void m3003a(AbstractC0635i abstractC0635i, float f, float f2, float f3, float f4) {
        if (!m3008a()) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6075aq) {
            f /= 20.0f;
        }
        if (gameEngine.f6120cb.m2635h() && gameEngine.f6231bt > 1.5d) {
            f /= gameEngine.f6231bt;
        }
        float m2366a = CommonUtils.m2366a((int) (gameEngine.f6138cv + gameEngine.f6150cH), (int) (gameEngine.f6139cw + gameEngine.f6151cI), f3, f4);
        float f5 = gameEngine.f6150cH * 1.72f;
        if (gameEngine.f6250cW < 0.5d) {
            f = f * 4.0f * gameEngine.f6250cW * gameEngine.f6250cW;
        }
        if (f <= 1.0f && !abstractC0635i.f4066f && m2366a > f5 * f5) {
            return;
        }
        float sqrt = (float) Math.sqrt(m2366a);
        float f6 = 1.0f;
        if (sqrt > gameEngine.f6150cH) {
            f6 = 1.0f - ((sqrt - gameEngine.f6150cH) / gameEngine.f6150cH);
        }
        float f7 = f6 * f;
        if (f7 <= 0.05d && !abstractC0635i.f4066f) {
            return;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = f7 * gameEngine.f6109bQ.masterVolume * gameEngine.f6109bQ.gameVolume * abstractC0635i.f4065d;
        if (!m3005a(abstractC0635i, f8)) {
            return;
        }
        abstractC0635i.mo2992a(f8, f8, 1, 0, f2);
    }

    /* renamed from: a */
    public AbstractC0635i m3001a(String str, C1098j c1098j, boolean z) {
        try {
            return f4032c.mo2988a(str, c1098j, z);
        } catch (OutOfMemoryError e) {
            GameEngine.m1195a(EnumC1065u.f6744f, e);
            return C0632f.m2994b();
        }
    }

    /* renamed from: b */
    public AbstractC0635i m2997b(String str) {
        return C0632f.m2995a(str);
    }

    /* renamed from: b */
    public void m2999b(float f) {
        this.f4030a.clear();
    }
}
