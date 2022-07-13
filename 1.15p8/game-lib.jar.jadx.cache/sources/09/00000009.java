package com.corrodinggames.rts.gameFramework.draw;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.HueColor;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.EnumC0903u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.k.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/h.class */
public class C0842h extends BitmapOrTexture {

    /* renamed from: v */
    public static C0857w f5696v;

    /* renamed from: w */
    public static C0857w f5697w;

    /* renamed from: x */
    public static C0857w f5698x;

    /* renamed from: y */
    public static boolean f5699y;

    /* renamed from: z */
    boolean f5705z = false;

    /* renamed from: E */
    private BitmapOrTexture sourceBitmap;

    /* renamed from: F */
    private BitmapOrTexture coloredBitmap;

    /* renamed from: A */
    int f5700A;

    /* renamed from: B */
    int f5701B;

    /* renamed from: C */
    HueColor f5702C;

    /* renamed from: D */
    public static float f5695D;

    /* renamed from: B */
    public static synchronized void m1005B() {
        if (f5699y) {
            return;
        }
        try {
            GameEngine.PrintLOG("Loading team shaders...");
            f5696v = new C0843i("assets/shaders/pureGreenTeamColor.frag");
            f5696v.teamColor("teamColor", -1);
            f5696v.mo953a();
            f5697w = new C0843i("assets/shaders/hueAddTeamColor.frag");
            f5697w.teamColorAmount("teamColorAmount", 0.15f);
            f5697w.teamColor("teamColor", -1);
            f5697w.mo953a();
            f5698x = new C0843i("assets/shaders/hueShiftTeamColor.frag");
            f5698x.teamColor("teamColor", -1);
            f5698x.mo953a();
            f5699y = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: C */
    public void m1004C() {
        if (!f5699y) {
            m1005B();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: a */
    public String mo64a() {
        if (this.sourceBitmap == null) {
            return "LazyColoring (error sourceBitmap==null)";
        }
        return "LazyColoring(" + this.f5701B + "):" + this.sourceBitmap.mo64a();
    }

    public C0842h(BitmapOrTexture bitmapOrTexture, int i, HueColor hueColor, int i2) {
        if (bitmapOrTexture == null) {
            throw new RuntimeException("baseImage==null");
        }
        this.sourceBitmap = bitmapOrTexture;
        this.f5700A = i;
        this.f5702C = hueColor;
        this.f5701B = i2;
        this.sourceBitmap.mo380a(this);
        this.f5664k = null;
    }

    /* renamed from: b */
    public void m1003b(boolean z) {
        if (GameEngine.teamShaders) {
            if (z) {
            }
            m1004C();
            if (this.f5702C == HueColor.f1355b) {
                mo954a(f5697w);
            } else if (this.f5702C == HueColor.f1357d) {
                mo954a(f5698x);
            } else {
                mo954a(f5696v);
            }
            this.coloredBitmap = this.sourceBitmap;
        } else if (this.sourceBitmap.mo370z()) {
            GameEngine.PrintLOG("Lazy loaded bitmap using errored image: " + this.sourceBitmap.mo64a());
            this.coloredBitmap = this.sourceBitmap;
        } else {
            if (z) {
                try {
                    GameEngine.PrintLOG("Loading in lazy loaded bitmap:" + this.sourceBitmap.mo64a() + " team:" + this.f5701B);
                } catch (OutOfMemoryError e) {
                    GameEngine.PrintLOG("Colouring failed with OOM");
                    GameEngine.m890a(EnumC0903u.gameImageColor, e);
                    this.coloredBitmap = GameEngine.getInstance().graphics.mo128q();
                    return;
                }
            }
            long tookTime = C0651bl.getTookTime();
            this.sourceBitmap.mo53h();
            this.coloredBitmap = this.sourceBitmap.clone();
            this.coloredBitmap.mo52i();
            BitmapOrTexture[] bitmapOrTextureArr = {this.coloredBitmap};
            int[] iArr = {this.f5700A};
            int[] iArr2 = {this.f5701B};
            long tookTime2 = C0651bl.getTookTime();
            if (this.f5702C == HueColor.f1355b) {
                Team.m3932b(this.sourceBitmap, bitmapOrTextureArr, iArr);
            } else if (this.f5702C == HueColor.f1357d) {
                Team.m3949a(this.sourceBitmap, bitmapOrTextureArr, iArr, iArr2);
            } else {
                Team.m3950a(this.sourceBitmap, bitmapOrTextureArr, iArr);
            }
            double m2277a = C0651bl.m2277a(tookTime2);
            this.coloredBitmap.mo48o();
            this.coloredBitmap.mo45r();
            this.sourceBitmap.mo47p();
            this.sourceBitmap = null;
            double m2277a2 = C0651bl.m2277a(tookTime);
            if (m2277a2 > 1.0d) {
                GameEngine.PrintLOG((this.f5702C == HueColor.f1354a ? "Standard " : "Hue ") + "Colouring took:" + C0651bl.m2278a(m2277a2) + " (" + C0651bl.m2278a(m2277a) + ")");
            }
            f5695D = (float) (f5695D + m2277a2);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: b */
    public Bitmap mo378b() {
        if (!this.f5705z) {
            m1003b(true);
            this.f5705z = true;
        }
        return this.coloredBitmap.f5664k;
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: c */
    public BitmapOrTexture mo377c() {
        if (!this.f5705z) {
            if (f5695D > 60.0f) {
            }
            m1003b(true);
            this.f5705z = true;
        }
        if (this.coloredBitmap == null) {
            throw new RuntimeException("coloredBitmap==null");
        }
        return this.coloredBitmap;
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: v */
    public void mo371v() {
        if (!this.f5705z) {
            m1003b(false);
            this.f5705z = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: t */
    public int mo373t() {
        if ((!this.f5705z) & (this.sourceBitmap != null)) {
            return this.sourceBitmap.mo373t();
        }
        return super.mo373t();
    }
}