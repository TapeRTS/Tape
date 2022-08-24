package com.corrodinggames.rts.java;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;

/* renamed from: com.corrodinggames.rts.java.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/s.class */
public class C1189s extends BitmapOrTexture {

    /* renamed from: y */
    public static ArrayList f7250y;

    /* renamed from: x */
    private Image f7251x;

    /* renamed from: z */
    ImageData f7252z;

    /* renamed from: A */
    ByteBuffer f7253A;

    /* renamed from: B */
    int f7254B;

    /* renamed from: C */
    String f7255C;

    /* renamed from: H */
    boolean f7256H;

    /* renamed from: F */
    static boolean f7257F = true;

    /* renamed from: K */
    static int f7258K = 1000;

    /* renamed from: D */
    boolean f7259D = false;

    /* renamed from: E */
    int f7260E = 1;

    /* renamed from: G */
    boolean f7261G = false;

    /* renamed from: I */
    boolean f7262I = false;

    /* renamed from: J */
    long f7263J = -1;

    /* renamed from: C */
    public Image mo418C() {
        return this.f7251x;
    }

    /* renamed from: a */
    private void m64a(ImageData imageData) {
        this.f7252z = imageData;
        if (this.f7252z instanceof ImageBuffer) {
            this.f7253A = ByteBuffer.wrap(((ImageBuffer) imageData).getRGBA());
        } else {
            this.f7253A = imageData.getImageBufferData();
        }
        this.f7254B = imageData.getDepth() / 8;
        if (this.f7254B == 4) {
            int texHeight = imageData.getTexHeight();
            int texWidth = imageData.getTexWidth();
            int height = imageData.getHeight();
            int width = imageData.getWidth();
            for (int i = 0; i < height; i++) {
                for (int i2 = 0; i2 < width; i2++) {
                    int i3 = (i2 * 4) + (i * texWidth * 4);
                    try {
                        if (this.f7253A.get(i3 + 3) == 0) {
                            this.f7253A.put(i3 + 0, (byte) 0);
                            this.f7253A.put(i3 + 1, (byte) 0);
                            this.f7253A.put(i3 + 2, (byte) 0);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        throw new IndexOutOfBoundsException("offset:" + i3 + " x:" + i2 + " y:" + i + " height:" + height + " width:" + width + " texHeight:" + texHeight + " texWidth:" + texWidth);
                    }
                }
            }
        }
        if (f7257F) {
        }
    }

    /* renamed from: a */
    public String mo413a() {
        if (this.f6389g != null) {
            return this.f6389g;
        }
        return this.f7255C;
    }

    public C1189s() {
        if (f7250y == null) {
            f7250y = new ArrayList();
        }
        f7250y.add(this);
    }

    /* renamed from: D */
    public void mo417D() {
        if (this.f7252z == null && this.f7251x != null) {
            GameEngine.m1145b("reloadFromImageData: slickImageData==null and slickImage!=null. Ignoring");
            return;
        }
        if (this.f7251x != null) {
            try {
                this.f7251x.destroy();
            } catch (SlickException e) {
                throw new RuntimeException((Throwable) e);
            }
        }
        Image image = null;
        if (0 == 0) {
            image = new Image(this.f7252z);
        }
        this.f7251x = image;
        mo416E();
        this.f6396p = this.f7251x.getWidth();
        this.f6397q = this.f7251x.getHeight();
        mo401g();
        mo389v();
    }

    /* renamed from: a */
    public void mo407a(Image image, String str) {
        if (this.f7251x != null) {
            GameEngine.m1120g("this.slickImage!=null");
        }
        this.f7251x = image;
        mo416E();
        this.f6396p = this.f7251x.getWidth();
        this.f6397q = this.f7251x.getHeight();
        mo401g();
        this.f7255C = str;
        if (this.f7255C != null) {
            if (!new File(this.f7255C).exists()) {
                throw new RuntimeException(this.f7255C + " does not exist");
            }
            this.f7263J = mo402c(true);
        }
    }

    /* renamed from: a */
    public void mo406a(ImageData imageData, String str, boolean z) {
        m64a(imageData);
        if (!z) {
            mo417D();
        }
        this.f7255C = str;
        if (this.f7255C != null && !this.f7255C.contains(".rwmod")) {
            if (!new File(this.f7255C).exists()) {
                throw new RuntimeException(this.f7255C + " does not exist");
            }
            this.f7263J = mo402c(true);
        }
        mo401g();
    }

    /* renamed from: a */
    public static ByteBuffer m66a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer.rewind();
        byteBuffer2.put(byteBuffer);
        byteBuffer.rewind();
        byteBuffer2.flip();
        return byteBuffer2;
    }

    /* renamed from: a */
    public BitmapOrTexture mo410a(int i, int i2, boolean z) {
        C1189s c1189s = new C1189s();
        c1189s.mo406a((ImageData) new ImageBuffer(i, i2), (String) null, true);
        if (z) {
            if (1 != 0 && this.f7254B == 4) {
                m73H();
                m66a(this.f7252z.getImageBufferData(), c1189s.f7253A);
            } else {
                m73H();
                for (int i3 = 0; i3 < i2; i3++) {
                    for (int i4 = 0; i4 < i; i4++) {
                        c1189s.mo411a(i4, i3, mo412a(i4, i3));
                    }
                }
            }
        }
        c1189s.f6396p = i;
        c1189s.f6397q = i2;
        c1189s.mo401g();
        c1189s.f7259D = true;
        return c1189s;
    }

    /* renamed from: i */
    public void mo399i() {
        if (!this.f7261G) {
            mo398j();
        } else if (f7257F && this.f7253A == null) {
            mo398j();
        }
    }

    /* renamed from: x */
    public void m49x() {
        m73H();
    }

    /* renamed from: y */
    public void m48y() {
    }

    /* renamed from: j */
    public void mo398j() {
        this.f7261G = true;
        if (this.f7256H) {
            mo414G();
            throw new RuntimeException("Cannot buffer pixels, we have discarded the PixelBuffer");
        } else {
            m73H();
        }
    }

    /* renamed from: H */
    public void m73H() {
        if (f7257F && this.f7253A == null) {
            m71J();
        }
    }

    /* renamed from: q */
    public void m53q() {
        m72I();
    }

    /* renamed from: I */
    public void m72I() {
        if (f7257F) {
            this.f7252z = null;
            this.f7253A = null;
        }
    }

    /* renamed from: J */
    public void m71J() {
        if (this.f7251x == null) {
            throw new RuntimeException("Cannot buffer pixels, we have no slickImage");
        }
        long m2612a = C0727bl.m2612a();
        C1190t c1190t = new C1190t(this, this.f7251x);
        this.f7252z = c1190t;
        this.f7253A = ByteBuffer.wrap(c1190t.m47a());
        GameEngine.PrintLog("Recreating image data from texture: " + mo413a() + " (" + C0727bl.m2611a(C0727bl.m2610a(m2612a)) + ")");
    }

    /* renamed from: k */
    public boolean m57k() {
        if (this.f7252z == null) {
            if (f7257F && this.f7251x != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int mo412a(int i, int i2) {
        try {
            return C1173e.m180a(this.f7252z, this.f7253A, i, i2, this.f7254B);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("getPixel out of bounds (x:" + i + " y:" + i2 + " perPixel:" + this.f7254B + " TexWidth:" + this.f7252z.getTexWidth() + " TexHeight:" + this.f7252z.getTexHeight() + " imageByteBuffer:" + this.f7253A.limit() + " width:" + this.f6396p + " height:" + this.f6397q + ")", e);
        }
    }

    /* renamed from: a */
    public void mo411a(int i, int i2, int i3) {
        try {
            C1173e.m179a(this.f7252z, this.f7253A, i, i2, Color.m7280b(i3), Color.m7279c(i3), Color.m7278d(i3), Color.m7284a(i3), this.f7254B);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("setPixel out of bounds (x:" + i + " y:" + i2 + " perPixel:" + this.f7254B + " TexWidth:" + this.f7252z.getTexWidth() + " TexHeight:" + this.f7252z.getTexHeight() + " imageByteBuffer:" + this.f7253A.limit() + " width:" + this.f6396p + " height:" + this.f6397q + ")", e);
        }
    }

    /* renamed from: p */
    public void mo393p() {
        if (this.f7261G) {
            this.f7261G = false;
            mo417D();
        }
    }

    /* renamed from: r */
    public void mo392r() {
    }

    /* renamed from: s */
    public void m51s() {
        this.f7256H = true;
        this.f7252z = null;
        this.f7253A = null;
    }

    /* renamed from: n */
    public void mo395n() {
        this.f7262I = true;
    }

    /* renamed from: o */
    public void mo394o() {
        this.f7252z = null;
        this.f7253A = null;
        if (f7250y != null) {
            f7250y.remove(this);
        }
        if (this.f7251x != null) {
            try {
                this.f7251x.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
            this.f7251x = null;
        }
    }

    protected void finalize() {
        if (this.f7262I) {
            mo394o();
        }
        if (this.f7251x != null) {
            GameEngine.m1145b("SlickBitmapOrTexture: Leak detection: finalize called with slickImage!=null");
        }
    }

    /* renamed from: h */
    public BitmapOrTexture mo7524clone() {
        return mo410a(this.f6396p, this.f6397q, true);
    }

    /* renamed from: e */
    protected void m61e() {
        mo416E();
    }

    /* renamed from: E */
    public void mo416E() {
        if (this.f7251x == null) {
            GameEngine.m1145b("slickImage==null");
            GameEngine.m1216S();
        }
        if (!this.f6404o) {
            this.f7260E = 2;
            this.f7251x.setFilter(2);
            return;
        }
        this.f7260E = 1;
        this.f7251x.setFilter(1);
    }

    /* renamed from: F */
    public void mo415F() {
        FileInputStream fileInputStream;
        if (this.f7259D) {
            GameEngine.PrintLog("reloadImage: skipping cloned image:" + this.f7255C);
        } else if (this.f7255C == null) {
            GameEngine.PrintLog("reloadImage: filepath is null, skipping");
        } else {
            try {
                GameEngine.PrintLog("reloadImage: reloading:" + this.f7255C);
                if (this.f7251x != null) {
                    this.f7251x.destroy();
                } else {
                    GameEngine.PrintLog("slickImage==null cannot free");
                }
                f7258K++;
                fileInputStream = new FileInputStream(this.f7255C);
            } catch (IOException e) {
                GameEngine.PrintLog("reloadImage: failed");
                e.printStackTrace();
            } catch (SlickException e2) {
                GameEngine.PrintLog("reloadImage: failed");
                e2.printStackTrace();
            }
            try {
                this.f7251x = new Image(fileInputStream, "reload_" + f7258K, false);
                mo389v();
                mo416E();
                this.f6396p = this.f7251x.getWidth();
                this.f6397q = this.f7251x.getHeight();
                mo401g();
                fileInputStream.close();
                GameEngine gameEngine = GameEngine.getInstance();
                if (gameEngine != null && gameEngine.f6104bL != null) {
                    gameEngine.f6104bL.m6592g();
                }
            } catch (NullPointerException e3) {
                throw new IOException("Failed to reload", e3);
            }
        }
    }

    /* renamed from: c */
    public long mo402c(boolean z) {
        if (this.f7255C == null) {
            return -2L;
        }
        return C0894j.m1401a(this.f7255C, z);
    }

    /* renamed from: t */
    public void mo391t() {
        long mo402c = mo402c(false);
        if (this.f7263J == -1) {
            this.f7263J = mo402c;
        } else if (this.f7263J != mo402c) {
            GameEngine.PrintLog("reloadImage: '" + this.f7255C + "' reloading current now:" + mo402c);
            mo415F();
            this.f7263J = mo402c;
        }
    }

    /* renamed from: G */
    public void mo414G() {
        GameEngine.PrintLog("SlickBitmapOrTexture: " + mo413a());
        GameEngine.PrintLog(" className:" + getClass().getSimpleName());
        GameEngine.PrintLog(" filepath:" + this.f7255C);
        GameEngine.PrintLog(" slickImage:" + (this.f7251x != null));
        GameEngine.PrintLog(" cloned:" + this.f7259D);
    }
}
