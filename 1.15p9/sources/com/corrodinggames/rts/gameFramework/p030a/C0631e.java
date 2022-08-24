package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/e.class */
public class C0631e {

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
    public boolean m3002a(AbstractC0635i abstractC0635i, float f) {
        if (this.f4030a.contains(abstractC0635i)) {
            return false;
        }
        this.f4030a.add(abstractC0635i);
        return true;
    }

    /* renamed from: a */
    public boolean m3005a() {
        GameEngine m1228A = GameEngine.m1228A();
        return m3004a(m1228A.f6109bQ.masterVolume * m1228A.f6109bQ.gameVolume);
    }

    /* renamed from: a */
    public boolean m3004a(float f) {
        GameEngine m1228A = GameEngine.m1228A();
        if (f < 0.01f || this.f4031b) {
            return false;
        }
        return m1228A.f6109bQ.enableSounds;
    }

    /* renamed from: b */
    public static void m2997b() {
    }

    /* renamed from: a */
    public void m3003a(Context context) {
        f4032c.mo2988a(context);
        f4034e = f4032c.mo2989a(C0067R.raw.attack);
        f4034e.f4065d = 0.2f;
        f4033d = f4032c.mo2989a(C0067R.raw.attack2);
        f4035f = f4032c.mo2989a(C0067R.raw.move);
        f4036g = f4032c.mo2989a(C0067R.raw.click);
        f4037h = f4032c.mo2989a(C0067R.raw.click_add);
        f4038i = f4032c.mo2989a(C0067R.raw.click_remove);
        f4039j = f4032c.mo2989a(C0067R.raw.warning);
        f4040k = f4032c.mo2989a(C0067R.raw.message);
        f4042m = f4032c.mo2989a(C0067R.raw.missile_fire);
        f4043n = f4032c.mo2989a(C0067R.raw.missile_hit);
        f4044o = f4032c.mo2989a(C0067R.raw.unit_explode);
        f4045p = f4032c.mo2989a(C0067R.raw.buiding_explode);
        f4046q = f4032c.mo2989a(C0067R.raw.tank_firing);
        f4047r = f4032c.mo2989a(C0067R.raw.cannon_firing);
        f4048s = f4032c.mo2989a(C0067R.raw.gun_fire);
        f4053x = f4032c.mo2989a(C0067R.raw.lighting_burst);
        f4054y = f4032c.mo2989a(C0067R.raw.plasma_fire);
        f4055z = f4032c.mo2989a(C0067R.raw.plasma_fire2);
        f4049t = f4032c.mo2989a(C0067R.raw.firing3);
        f4050u = f4032c.mo2989a(C0067R.raw.firing4);
        f4051v = f4032c.mo2989a(C0067R.raw.large_gun_fire1);
        f4052w = f4032c.mo2989a(C0067R.raw.large_gun_fire2);
        f4056A = f4032c.mo2989a(C0067R.raw.bug_die);
        f4057B = f4032c.mo2989a(C0067R.raw.bug_attack);
        f4041l = f4032c.mo2989a(C0067R.raw.interface_error);
        f4058C = f4032c.mo2989a(C0067R.raw.nuke_explode);
        f4059D = f4032c.mo2989a(C0067R.raw.nuke_launch);
        f4060E = f4032c.mo2989a(C0067R.raw.laser_deflect);
        f4061F = f4032c.mo2989a(C0067R.raw.laser_deflect2);
        f4032c.mo2990a();
    }

    /* renamed from: a */
    public AbstractC0635i m2999a(String str) {
        AbstractC0635i abstractC0635i = (AbstractC0635i) f4032c.f4062h.get(str);
        if (abstractC0635i == null) {
            throw new RuntimeException("Could not find sound:" + str);
        }
        return abstractC0635i;
    }

    /* renamed from: b */
    public void m2995b(AbstractC0635i abstractC0635i, float f) {
        GameEngine m1228A = GameEngine.m1228A();
        float f2 = f * m1228A.f6109bQ.masterVolume * m1228A.f6109bQ.interfaceVolume * abstractC0635i.f4065d;
        if (!m3004a(f2) || f2 < 0.01d || !m3002a(abstractC0635i, f2)) {
            return;
        }
        if (m1228A.f6075aq) {
            f2 /= 20.0f;
        }
        abstractC0635i.mo2985a(f2, f2, 1, 0, 1.0f);
    }

    /* renamed from: c */
    public void m2993c(AbstractC0635i abstractC0635i, float f) {
        GameEngine m1228A = GameEngine.m1228A();
        float f2 = f * m1228A.f6109bQ.masterVolume * m1228A.f6109bQ.gameVolume * abstractC0635i.f4065d;
        if (!m3004a(f2)) {
            return;
        }
        if (m1228A.f6075aq) {
            f2 /= 20.0f;
        }
        if (!m3002a(abstractC0635i, f2)) {
            return;
        }
        abstractC0635i.mo2985a(f2, f2, 1, 0, 1.0f);
    }

    /* renamed from: a */
    public void m3001a(AbstractC0635i abstractC0635i, float f, float f2, float f3) {
        m3000a(abstractC0635i, f, 1.0f, f2, f3);
    }

    /* renamed from: a */
    public void m3000a(AbstractC0635i abstractC0635i, float f, float f2, float f3, float f4) {
        if (!m3005a()) {
            return;
        }
        GameEngine m1228A = GameEngine.m1228A();
        if (m1228A.f6075aq) {
            f /= 20.0f;
        }
        if (m1228A.f6120cb.m2634h() && m1228A.f6231bt > 1.5d) {
            f /= m1228A.f6231bt;
        }
        float m2363a = C0758f.m2363a((int) (m1228A.f6138cv + m1228A.f6150cH), (int) (m1228A.f6139cw + m1228A.f6151cI), f3, f4);
        float f5 = m1228A.f6150cH * 1.72f;
        if (m1228A.f6250cW < 0.5d) {
            f = f * 4.0f * m1228A.f6250cW * m1228A.f6250cW;
        }
        if (f <= 1.0f && !abstractC0635i.f4066f && m2363a > f5 * f5) {
            return;
        }
        float sqrt = (float) Math.sqrt(m2363a);
        float f6 = 1.0f;
        if (sqrt > m1228A.f6150cH) {
            f6 = 1.0f - ((sqrt - m1228A.f6150cH) / m1228A.f6150cH);
        }
        float f7 = f6 * f;
        if (f7 <= 0.05d && !abstractC0635i.f4066f) {
            return;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = f7 * m1228A.f6109bQ.masterVolume * m1228A.f6109bQ.gameVolume * abstractC0635i.f4065d;
        if (!m3002a(abstractC0635i, f8)) {
            return;
        }
        abstractC0635i.mo2985a(f8, f8, 1, 0, f2);
    }

    /* renamed from: a */
    public AbstractC0635i m2998a(String str, C1098j c1098j, boolean z) {
        try {
            return f4032c.mo2987a(str, c1098j, z);
        } catch (OutOfMemoryError e) {
            GameEngine.m1189a(EnumC1065u.gameSound, e);
            return C0632f.m2991b();
        }
    }

    /* renamed from: b */
    public AbstractC0635i m2994b(String str) {
        return C0632f.m2992a(str);
    }

    /* renamed from: b */
    public void m2996b(float f) {
        this.f4030a.clear();
    }
}
