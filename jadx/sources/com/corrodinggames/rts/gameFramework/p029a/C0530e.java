package com.corrodinggames.rts.gameFramework.p029a;

import android.content.Context;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.EnumC0805u;
import com.corrodinggames.rts.gameFramework.utility.C0832j;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/e.class */
public class C0530e {

    /* renamed from: a */
    ArrayList f3563a = new ArrayList();

    /* renamed from: b */
    public boolean f3564b;

    /* renamed from: c */
    public static AbstractC0533h f3565c = new C0526a();

    /* renamed from: d */
    public static AbstractC0534i f3566d;

    /* renamed from: e */
    public static AbstractC0534i f3567e;

    /* renamed from: f */
    public static AbstractC0534i f3568f;

    /* renamed from: g */
    public static AbstractC0534i f3569g;

    /* renamed from: h */
    public static AbstractC0534i f3570h;

    /* renamed from: i */
    public static AbstractC0534i f3571i;

    /* renamed from: j */
    public static AbstractC0534i f3572j;

    /* renamed from: k */
    public static AbstractC0534i f3573k;

    /* renamed from: l */
    public static AbstractC0534i f3574l;

    /* renamed from: m */
    public static AbstractC0534i f3575m;

    /* renamed from: n */
    public static AbstractC0534i f3576n;

    /* renamed from: o */
    public static AbstractC0534i f3577o;

    /* renamed from: p */
    public static AbstractC0534i f3578p;

    /* renamed from: q */
    public static AbstractC0534i f3579q;

    /* renamed from: r */
    public static AbstractC0534i f3580r;

    /* renamed from: s */
    public static AbstractC0534i f3581s;

    /* renamed from: t */
    public static AbstractC0534i f3582t;

    /* renamed from: u */
    public static AbstractC0534i f3583u;

    /* renamed from: v */
    public static AbstractC0534i f3584v;

    /* renamed from: w */
    public static AbstractC0534i f3585w;

    /* renamed from: x */
    public static AbstractC0534i f3586x;

    /* renamed from: y */
    public static AbstractC0534i f3587y;

    /* renamed from: z */
    public static AbstractC0534i f3588z;

    /* renamed from: A */
    public static AbstractC0534i f3589A;

    /* renamed from: B */
    public static AbstractC0534i f3590B;

    /* renamed from: C */
    public static AbstractC0534i f3591C;

    /* renamed from: D */
    public static AbstractC0534i f3592D;

    /* renamed from: E */
    public static AbstractC0534i f3593E;

    /* renamed from: a */
    public boolean m2116a(AbstractC0534i iVar, float f) {
        if (this.f3563a.contains(iVar)) {
            return false;
        }
        this.f3563a.add(iVar);
        return true;
    }

    /* renamed from: a */
    public boolean m2119a() {
        AbstractC0789l u = AbstractC0789l.m638u();
        return m2118a(u.f5516by.masterVolume * u.f5516by.gameVolume);
    }

    /* renamed from: a */
    public boolean m2118a(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (f >= 0.01f && !this.f3564b) {
            return u.f5516by.enableSounds;
        }
        return false;
    }

    /* renamed from: b */
    public static void m2111b() {
    }

    /* renamed from: a */
    public void m2117a(Context context) {
        f3565c.mo77a(context);
        f3566d = f3565c.mo78a(C0063R.raw.attack);
        f3567e = f3565c.mo78a(C0063R.raw.move);
        f3568f = f3565c.mo78a(C0063R.raw.click);
        f3569g = f3565c.mo78a(C0063R.raw.click_add);
        f3570h = f3565c.mo78a(C0063R.raw.click_remove);
        f3571i = f3565c.mo78a(C0063R.raw.warning);
        f3572j = f3565c.mo78a(C0063R.raw.message);
        f3574l = f3565c.mo78a(C0063R.raw.missile_fire);
        f3575m = f3565c.mo78a(C0063R.raw.missile_hit);
        f3576n = f3565c.mo78a(C0063R.raw.unit_explode);
        f3577o = f3565c.mo78a(C0063R.raw.buiding_explode);
        f3578p = f3565c.mo78a(C0063R.raw.tank_firing);
        f3579q = f3565c.mo78a(C0063R.raw.cannon_firing);
        f3580r = f3565c.mo78a(C0063R.raw.gun_fire);
        f3585w = f3565c.mo78a(C0063R.raw.lighting_burst);
        f3586x = f3565c.mo78a(C0063R.raw.plasma_fire);
        f3587y = f3565c.mo78a(C0063R.raw.plasma_fire2);
        f3581s = f3565c.mo78a(C0063R.raw.firing3);
        f3582t = f3565c.mo78a(C0063R.raw.firing4);
        f3583u = f3565c.mo78a(C0063R.raw.large_gun_fire1);
        f3584v = f3565c.mo78a(C0063R.raw.large_gun_fire2);
        f3588z = f3565c.mo78a(C0063R.raw.bug_die);
        f3589A = f3565c.mo78a(C0063R.raw.bug_attack);
        f3573k = f3565c.mo78a(C0063R.raw.interface_error);
        f3590B = f3565c.mo78a(C0063R.raw.nuke_explode);
        f3591C = f3565c.mo78a(C0063R.raw.nuke_launch);
        f3592D = f3565c.mo78a(C0063R.raw.laser_deflect);
        f3593E = f3565c.mo78a(C0063R.raw.laser_deflect2);
        f3565c.mo79a();
    }

    /* renamed from: a */
    public AbstractC0534i m2113a(String str) {
        AbstractC0534i iVar = (AbstractC0534i) f3565c.f3594g.get(str);
        if (iVar != null) {
            return iVar;
        }
        throw new RuntimeException("Could not find sound:" + str);
    }

    /* renamed from: b */
    public void m2109b(AbstractC0534i iVar, float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        float f2 = f * u.f5516by.masterVolume * u.f5516by.interfaceVolume;
        if (m2118a(f2) && f2 >= 0.01d && m2116a(iVar, f2)) {
            iVar.mo72a(f2, f2, 1, 0, 1.0f);
        }
    }

    /* renamed from: c */
    public void m2108c(AbstractC0534i iVar, float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        float f2 = f * u.f5516by.masterVolume * u.f5516by.gameVolume;
        if (m2118a(f2) && m2116a(iVar, f2)) {
            iVar.mo72a(f2, f2, 1, 0, 1.0f);
        }
    }

    /* renamed from: a */
    public void m2115a(AbstractC0534i iVar, float f, float f2, float f3) {
        m2114a(iVar, f, 1.0f, f2, f3);
    }

    /* renamed from: a */
    public void m2114a(AbstractC0534i iVar, float f, float f2, float f3, float f4) {
        if (m2119a()) {
            AbstractC0789l u = AbstractC0789l.m638u();
            if (u.f5451al) {
                f /= 20.0f;
            }
            if (u.f5527bJ.m1940h() && u.f5494bc > 1.5d) {
                f /= u.f5494bc;
            }
            float a = C0654f.m1520a((int) (u.f5547cd + u.f5559cp), (int) (u.f5548ce + u.f5560cq), f3, f4);
            float f5 = u.f5559cp * 1.72f;
            if (u.f5574cE < 0.5d) {
                f = f * 4.0f * u.f5574cE * u.f5574cE;
            }
            if (f > 1.0f || iVar.f3596e || a <= f5 * f5) {
                float sqrt = (float) Math.sqrt(a);
                float f6 = 1.0f;
                if (sqrt > u.f5559cp) {
                    f6 = 1.0f - ((sqrt - u.f5559cp) / u.f5559cp);
                }
                float f7 = f6 * f;
                if (f7 > 0.05d || iVar.f3596e) {
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    float f8 = f7 * u.f5516by.masterVolume * u.f5516by.gameVolume;
                    if (m2116a(iVar, f8)) {
                        iVar.mo72a(f8, f8, 1, 0, f2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public AbstractC0534i m2112a(String str, C0832j jVar, boolean z) {
        try {
            return f3565c.mo76a(str, jVar, z);
        } catch (OutOfMemoryError e) {
            AbstractC0789l.m721a(EnumC0805u.gameSound, e);
            return C0531f.m2107b();
        }
    }

    /* renamed from: b */
    public void m2110b(float f) {
        this.f3563a.clear();
    }
}
