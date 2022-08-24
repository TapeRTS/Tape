package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.l.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/h.class */
public class C0937h extends BitmapOrTexture {

    /* renamed from: x */
    public static C0928ae f6425x;

    /* renamed from: y */
    public static C0928ae f6426y;

    /* renamed from: z */
    public static C0928ae f6427z;

    /* renamed from: A */
    public static boolean f6428A;

    /* renamed from: B */
    boolean f6429B = false;

    /* renamed from: C */
    boolean f6430C = false;

    /* renamed from: H */
    private BitmapOrTexture f6431H;

    /* renamed from: I */
    private BitmapOrTexture f6432I;

    /* renamed from: D */
    int f6433D;

    /* renamed from: E */
    int f6434E;

    /* renamed from: F */
    EnumC0198o f6435F;

    /* renamed from: G */
    public static float f6436G;

    /* renamed from: C */
    public static synchronized void m1021C() {
        if (f6428A) {
            return;
        }
        try {
            GameEngine.PrintLog("Loading team shaders...");
            f6425x = new C0938i("assets/shaders/pureGreenTeamColor.frag", true);
            f6425x.m1069a("teamColor", -1);
            f6425x.mo1015c();
            f6426y = new C0938i("assets/shaders/hueAddTeamColor.frag", false);
            f6426y.m1071a("teamColorAmount", 0.15f);
            f6426y.m1069a("teamColor", -1);
            f6426y.mo1015c();
            f6427z = new C0938i("assets/shaders/hueShiftTeamColor.frag", false);
            f6427z.m1069a("teamColor", -1);
            f6427z.mo1015c();
            f6428A = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: D */
    public void m1020D() {
        if (!f6428A) {
            m1021C();
        }
    }

    /* renamed from: a */
    public String mo413a() {
        if (this.f6431H == null) {
            return "LazyColoring (error sourceBitmap==null)";
        }
        return "LazyColoring(" + this.f6434E + "):" + this.f6431H.mo413a();
    }

    public C0937h(BitmapOrTexture bitmapOrTexture, int i, EnumC0198o enumC0198o, int i2) {
        if (bitmapOrTexture == null) {
            throw new RuntimeException("baseImage==null");
        }
        this.f6431H = bitmapOrTexture;
        this.f6433D = i;
        this.f6435F = enumC0198o;
        this.f6434E = i2;
        this.f6431H.mo408a(this);
        this.f6393k = null;
    }

    /* renamed from: c */
    public void m1019c(boolean z) {
        if (GameEngine.m1153ay()) {
            if (z) {
            }
            m1020D();
            if (this.f6435F == EnumC0198o.f1379b) {
                mo1074a(f6426y);
            } else if (this.f6435F == EnumC0198o.f1381d) {
                mo1074a(f6427z);
            } else {
                mo1074a(f6425x);
            }
            this.f6432I = this.f6431H;
            this.f6430C = true;
        } else if (this.f6431H.mo419A()) {
            GameEngine.PrintLog("Lazy loaded bitmap using errored image: " + this.f6431H.mo413a());
            this.f6432I = this.f6431H;
        } else {
            if (z) {
                try {
                    GameEngine.PrintLog("Loading in lazy loaded bitmap:" + this.f6431H.mo413a() + " team:" + this.f6434E);
                } catch (OutOfMemoryError e) {
                    GameEngine.PrintLog("Colouring failed with OOM");
                    GameEngine.m1195a(EnumC1065u.f6741c, e);
                    this.f6432I = GameEngine.getInstance().graphics.mo871r();
                    return;
                }
            }
            long m2612a = C0727bl.m2612a();
            this.f6431H.mo399i();
            this.f6432I = this.f6431H.m1036h();
            this.f6432I.mo398j();
            BitmapOrTexture[] bitmapOrTextureArr = {this.f6432I};
            int[] iArr = {this.f6433D};
            int[] iArr2 = {this.f6434E};
            long m2612a2 = C0727bl.m2612a();
            if (this.f6435F == EnumC0198o.f1379b) {
                Team.m6361b(this.f6431H, bitmapOrTextureArr, iArr);
            } else if (this.f6435F == EnumC0198o.f1381d) {
                Team.m6378a(this.f6431H, bitmapOrTextureArr, iArr, iArr2);
            } else {
                Team.m6379a(this.f6431H, bitmapOrTextureArr, iArr);
            }
            double m2610a = C0727bl.m2610a(m2612a2);
            this.f6432I.mo393p();
            this.f6432I.m1033s();
            this.f6431H.m1034q();
            this.f6431H = null;
            double m2610a2 = C0727bl.m2610a(m2612a);
            if (m2610a2 > 1.0d) {
                GameEngine.PrintLog((this.f6435F == EnumC0198o.f1378a ? "Standard " : "Hue ") + "Colouring took:" + C0727bl.m2611a(m2610a2) + " (" + C0727bl.m2611a(m2610a) + ")");
            }
            f6436G = (float) (f6436G + m2610a2);
        }
    }

    /* renamed from: b */
    public Bitmap mo404b() {
        if (this.f6430C && !GameEngine.m1153ay()) {
            GameEngine.PrintLog("Team shader coloring now disabled. Recoloring image: " + this.f6431H.mo413a());
            this.f6429B = false;
            this.f6430C = false;
            mo1074a((C0928ae) null);
        }
        if (!this.f6429B) {
            m1019c(true);
            this.f6429B = true;
        }
        return this.f6432I.f6393k;
    }

    /* renamed from: c */
    public BitmapOrTexture mo403c() {
        if (this.f6430C && !GameEngine.m1153ay()) {
            GameEngine.PrintLog("Team shader coloring now disabled. Recoloring image: " + this.f6431H.mo413a());
            this.f6429B = false;
            this.f6430C = false;
            mo1074a((C0928ae) null);
        }
        if (!this.f6429B) {
            if (f6436G > 60.0f) {
            }
            m1019c(true);
            this.f6429B = true;
        }
        if (this.f6432I == null) {
            throw new RuntimeException("coloredBitmap==null");
        }
        return this.f6432I;
    }

    /* renamed from: w */
    public void mo388w() {
        if (!this.f6429B) {
            m1019c(false);
            this.f6429B = true;
        }
    }

    /* renamed from: u */
    public int mo390u() {
        if ((!this.f6429B) & (this.f6431H != null)) {
            return this.f6431H.mo390u();
        }
        return super.mo390u();
    }
}
