package com.corrodinggames.rts.gameFramework.p039j;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.EnumC0172n;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.EnumC0805u;

/* renamed from: com.corrodinggames.rts.gameFramework.j.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/f.class */
public class C0749f extends C0748e {

    /* renamed from: r */
    boolean f5252r = false;

    /* renamed from: w */
    private C0748e f5253w;

    /* renamed from: x */
    private C0748e f5254x;

    /* renamed from: s */
    int f5255s;

    /* renamed from: t */
    int f5256t;

    /* renamed from: u */
    EnumC0172n f5257u;

    /* renamed from: v */
    public static float f5258v;

    public C0749f(C0748e eVar, int i, EnumC0172n nVar, int i2) {
        this.f5253w = eVar;
        this.f5255s = i;
        this.f5257u = nVar;
        this.f5256t = i2;
        this.f5253w.mo355a(this);
        this.f5241g = null;
    }

    /* renamed from: b */
    public void m876b(boolean z) {
        if (z) {
            try {
                AbstractC0789l.m670d("Loading in lazy loaded bitmap:" + this.f5253w.mo63a() + " team:" + this.f5256t);
            } catch (OutOfMemoryError e) {
                AbstractC0789l.m670d("Colouring failed with OOM");
                AbstractC0789l.m721a(EnumC0805u.gameImageColor, e);
                this.f5254x = AbstractC0789l.m638u().f5514bw.mo120o();
                return;
            }
        }
        long a = C0586bj.m1919a();
        this.f5253w.mo52h();
        this.f5254x = this.f5253w.clone();
        this.f5254x.mo51i();
        C0748e[] eVarArr = {this.f5254x};
        int[] iArr = {this.f5255s};
        int[] iArr2 = {this.f5256t};
        long a2 = C0586bj.m1919a();
        if (this.f5257u == EnumC0172n.hueAdd) {
            AbstractC0171m.m3481b(this.f5253w, eVarArr, iArr);
        } else if (this.f5257u == EnumC0172n.hueShift) {
            AbstractC0171m.m3497a(this.f5253w, eVarArr, iArr, iArr2);
        } else {
            AbstractC0171m.m3498a(this.f5253w, eVarArr, iArr);
        }
        double a3 = C0586bj.m1917a(a2);
        this.f5254x.mo47o();
        this.f5254x.mo44r();
        this.f5253w.mo46p();
        this.f5253w = null;
        double a4 = C0586bj.m1917a(a);
        if (a4 > 1.0d) {
            AbstractC0789l.m670d((this.f5257u == EnumC0172n.pureGreen ? "Standard " : "Hue ") + "Colouring took:" + C0586bj.m1918a(a4) + " (" + C0586bj.m1918a(a3) + ")");
        }
        f5258v = (float) (f5258v + a4);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: b */
    public Bitmap mo353b() {
        if (!this.f5252r) {
            m876b(true);
            this.f5252r = true;
        }
        return this.f5254x.f5241g;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: c */
    public C0748e mo352c() {
        if (!this.f5252r) {
            if (f5258v > 60.0f) {
            }
            m876b(true);
            this.f5252r = true;
        }
        if (this.f5254x != null) {
            return this.f5254x;
        }
        throw new RuntimeException("coloredBitmap==null");
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: v */
    public void mo346v() {
        if (!this.f5252r) {
            m876b(false);
            this.f5252r = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: t */
    public int mo348t() {
        if (!this.f5252r) {
            return 0;
        }
        return super.mo348t();
    }
}
