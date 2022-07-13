package com.corrodinggames.rts.java;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.C0830j;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
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
public class C1025s extends BitmapOrTexture {

    /* renamed from: w */
    public static ArrayList f6655w;

    /* renamed from: v */
    private Image slickImage;

    /* renamed from: x */
    ImageData slickImageData;

    /* renamed from: y */
    ByteBuffer imageByteBuffer;

    /* renamed from: z */
    int perPixel;

    /* renamed from: A */
    String filepath;

    /* renamed from: F */
    boolean f6657F;

    /* renamed from: D */
    static boolean disabletextureread = true;

    /* renamed from: I */
    static int f6654I = 1000;

    /* renamed from: B */
    boolean f6662B = false;

    /* renamed from: C */
    int f6663C = 1;

    /* renamed from: E */
    boolean f6664E = false;

    /* renamed from: G */
    boolean f6665G = false;

    /* renamed from: H */
    long f6666H = -1;

    /* renamed from: B */
    public Image mo72B() {
        return this.slickImage;
    }

    /* renamed from: a */
    private void m58a(ImageData imageData) {
        this.slickImageData = imageData;
        if (this.slickImageData instanceof ImageBuffer) {
            this.imageByteBuffer = ByteBuffer.wrap(((ImageBuffer) imageData).getRGBA());
        } else {
            this.imageByteBuffer = imageData.getImageBufferData();
        }
        this.perPixel = imageData.getDepth() / 8;
        if (this.perPixel == 4) {
            int texHeight = imageData.getTexHeight();
            int texWidth = imageData.getTexWidth();
            int height = imageData.getHeight();
            int width = imageData.getWidth();
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int offset = (x * 4) + (y * texWidth * 4);
                    try {
                        if (this.imageByteBuffer.get(offset + 3) == 0) {
                            this.imageByteBuffer.put(offset + 0, (byte) 0);
                            this.imageByteBuffer.put(offset + 1, (byte) 0);
                            this.imageByteBuffer.put(offset + 2, (byte) 0);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        throw new IndexOutOfBoundsException("offset:" + offset + " x:" + x + " y:" + y + " height:" + height + " width:" + width + " texHeight:" + texHeight + " texWidth:" + texWidth);
                    }
                }
            }
        }
        if (disabletextureread) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: a */
    public String mo64a() {
        if (this.f5660g != null) {
            return this.f5660g;
        }
        return this.filepath;
    }

    public C1025s() {
        if (f6655w == null) {
            f6655w = new ArrayList();
        }
        f6655w.add(this);
    }

    /* renamed from: C */
    public void reloadFromImageData() {
        if (this.slickImageData == null && this.slickImage != null) {
            GameEngine.log("reloadFromImageData: slickImageData==null and slickImage!=null. Ignoring");
            return;
        }
        if (this.slickImage != null) {
            try {
                this.slickImage.destroy();
            } catch (SlickException e) {
                throw new RuntimeException((Throwable) e);
            }
        }
        Image image = null;
        if (0 == 0) {
            image = new Image(this.slickImageData);
        }
        this.slickImage = image;
        mo70D();
        this.width = this.slickImage.getWidth();
        this.height = this.slickImage.getHeight();
        mo376f();
        mo372u();
    }

    /* renamed from: a */
    public void mo59a(Image image, String str) {
        if (this.slickImage != null) {
            GameEngine.LogTrace("this.slickImage!=null");
        }
        this.slickImage = image;
        mo70D();
        this.width = this.slickImage.getWidth();
        this.height = this.slickImage.getHeight();
        mo376f();
        this.filepath = str;
        if (this.filepath != null) {
            if (!new File(this.filepath).exists()) {
                throw new RuntimeException(this.filepath + " does not exist");
            }
            this.f6666H = mo56b(true);
        }
    }

    /* renamed from: a */
    public void mo57a(ImageData imageData, String str, boolean z) {
        m58a(imageData);
        if (!z) {
            reloadFromImageData();
        }
        this.filepath = str;
        if (this.filepath != null && !this.filepath.contains(".rwmod")) {
            if (!new File(this.filepath).exists()) {
                throw new RuntimeException(this.filepath + " does not exist");
            }
            this.f6666H = mo56b(true);
        }
        mo376f();
    }

    /* renamed from: a */
    public static ByteBuffer m60a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer.rewind();
        byteBuffer2.put(byteBuffer);
        byteBuffer.rewind();
        byteBuffer2.flip();
        return byteBuffer2;
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: a */
    public BitmapOrTexture mo61a(int i, int i2, boolean z) {
        C1025s c1025s = new C1025s();
        c1025s.mo57a((ImageData) new ImageBuffer(i, i2), (String) null, true);
        if (z) {
            if (1 != 0 && this.perPixel == 4) {
                m67G();
                m60a(this.slickImageData.getImageBufferData(), c1025s.imageByteBuffer);
            } else {
                m67G();
                for (int i3 = 0; i3 < i2; i3++) {
                    for (int i4 = 0; i4 < i; i4++) {
                        c1025s.mo62a(i4, i3, mo63a(i4, i3));
                    }
                }
            }
        }
        c1025s.width = i;
        c1025s.height = i2;
        c1025s.mo376f();
        c1025s.f6662B = true;
        return c1025s;
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: h */
    public void mo53h() {
        if (!this.f6664E) {
            mo52i();
        } else if (disabletextureread && this.imageByteBuffer == null) {
            mo52i();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: w */
    public void mo43w() {
        m67G();
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: x */
    public void mo42x() {
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: i */
    public void mo52i() {
        this.f6664E = true;
        if (this.f6657F) {
            mo68F();
            throw new RuntimeException("Cannot buffer pixels, we have discarded the PixelBuffer");
        } else {
            m67G();
        }
    }

    /* renamed from: G */
    public void m67G() {
        if (disabletextureread && this.imageByteBuffer == null) {
            m65I();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: p */
    public void mo47p() {
        m66H();
    }

    /* renamed from: H */
    public void m66H() {
        if (disabletextureread) {
            this.slickImageData = null;
            this.imageByteBuffer = null;
        }
    }

    /* renamed from: I */
    public void m65I() {
        if (this.slickImage == null) {
            throw new RuntimeException("Cannot buffer pixels, we have no slickImage");
        }
        long tookTime = C0651bl.getTookTime();
        C1026t c1026t = new C1026t(this, this.slickImage);
        this.slickImageData = c1026t;
        this.imageByteBuffer = ByteBuffer.wrap(c1026t.m41a());
        GameEngine.PrintLOG("Recreating image data from texture: " + mo64a() + " (" + C0651bl.m2278a(C0651bl.m2277a(tookTime)) + ")");
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: j */
    public boolean mo51j() {
        if (this.slickImageData == null) {
            if (disabletextureread && this.slickImage != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: a */
    public int mo63a(int x, int y) {
        try {
            return C1009e.m170a(this.slickImageData, this.imageByteBuffer, x, y, this.perPixel);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("getPixel out of bounds (x:" + x + " y:" + y + " perPixel:" + this.perPixel + " TexWidth:" + this.slickImageData.getTexWidth() + " TexHeight:" + this.slickImageData.getTexHeight() + " imageByteBuffer:" + this.imageByteBuffer.limit() + " width:" + this.width + " height:" + this.height + ")", e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: a */
    public void mo62a(int x, int y, int i) {
        try {
            C1009e.m169a(this.slickImageData, this.imageByteBuffer, x, y, Color.m4730b(i), Color.m4729c(i), Color.m4728d(i), Color.m4734a(i), this.perPixel);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("setPixel out of bounds (x:" + x + " y:" + y + " perPixel:" + this.perPixel + " TexWidth:" + this.slickImageData.getTexWidth() + " TexHeight:" + this.slickImageData.getTexHeight() + " imageByteBuffer:" + this.imageByteBuffer.limit() + " width:" + this.width + " height:" + this.height + ")", e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: o */
    public void mo48o() {
        if (this.f6664E) {
            this.f6664E = false;
            reloadFromImageData();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: q */
    public void mo46q() {
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: r */
    public void mo45r() {
        this.f6657F = true;
        this.slickImageData = null;
        this.imageByteBuffer = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: m */
    public void mo50m() {
        this.f6665G = true;
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: n */
    public void mo49n() {
        this.slickImageData = null;
        this.imageByteBuffer = null;
        if (f6655w != null) {
            f6655w.remove(this);
        }
        if (this.slickImage != null) {
            try {
                this.slickImage.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
            this.slickImage = null;
        }
    }

    protected void finalize() {
        if (this.f6665G) {
            mo49n();
        }
        if (this.slickImage != null) {
            GameEngine.log("SlickBitmapOrTexture: Leak detection: finalize called with slickImage!=null");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: g */
    public BitmapOrTexture clone() {
        return mo61a(this.width, this.height, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: d */
    protected void mo55d() {
        mo70D();
    }

    /* renamed from: D */
    public void mo70D() {
        if (this.slickImage == null) {
            GameEngine.log("slickImage==null");
            GameEngine.m914P();
        }
        if (!this.f5674n) {
            this.f6663C = 2;
            this.slickImage.setFilter(2);
            return;
        }
        this.f6663C = 1;
        this.slickImage.setFilter(1);
    }

    /* renamed from: E */
    public void reloadImage() {
        if (this.f6662B) {
            GameEngine.PrintLOG("reloadImage: skipping cloned image:" + this.filepath);
        } else if (this.filepath == null) {
            GameEngine.PrintLOG("reloadImage: filepath is null, skipping");
        } else {
            try {
                GameEngine.PrintLOG("reloadImage: reloading:" + this.filepath);
                if (this.slickImage != null) {
                    this.slickImage.destroy();
                } else {
                    GameEngine.PrintLOG("slickImage==null cannot free");
                }
                f6654I++;
                FileInputStream fileInputStream = new FileInputStream(this.filepath);
                try {
                    this.slickImage = new Image(fileInputStream, "reload_" + f6654I, false);
                    mo372u();
                    mo70D();
                    this.width = this.slickImage.getWidth();
                    this.height = this.slickImage.getHeight();
                    mo376f();
                    fileInputStream.close();
                } catch (NullPointerException e) {
                    throw new IOException("Failed to reload", e);
                }
            } catch (IOException e2) {
                GameEngine.PrintLOG("reloadImage: failed");
                e2.printStackTrace();
            } catch (SlickException e3) {
                GameEngine.PrintLOG("reloadImage: failed");
                e3.printStackTrace();
            }
            GameEngine game = GameEngine.getInstance();
            if (game != null && game.map != null) {
                game.map.m4113f();
            }
        }
    }

    /* renamed from: b */
    public long mo56b(boolean z) {
        if (this.filepath == null) {
            return -2L;
        }
        return C0830j.m1032a(this.filepath, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture
    /* renamed from: s */
    public void mo44s() {
        long mo56b = mo56b(false);
        if (this.f6666H == -1) {
            this.f6666H = mo56b;
        } else if (this.f6666H != mo56b) {
            GameEngine.PrintLOG("reloadImage: '" + this.filepath + "' reloading current now:" + mo56b);
            reloadImage();
            this.f6666H = mo56b;
        }
    }

    /* renamed from: F */
    public void mo68F() {
        GameEngine.PrintLOG("SlickBitmapOrTexture: " + mo64a());
        GameEngine.PrintLOG(" className:" + getClass().getSimpleName());
        GameEngine.PrintLOG(" filepath:" + this.filepath);
        GameEngine.PrintLOG(" slickImage:" + (this.slickImage != null));
        GameEngine.PrintLOG(" cloned:" + this.f6662B);
    }
}