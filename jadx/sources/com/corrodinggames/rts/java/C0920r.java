package com.corrodinggames.rts.java;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0743j;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;

/* renamed from: com.corrodinggames.rts.java.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/r.class */
public class C0920r extends C0748e {

    /* renamed from: s */
    public static ArrayList f6105s;

    /* renamed from: r */
    private Image f6106r;

    /* renamed from: t */
    ImageData f6107t;

    /* renamed from: u */
    ByteBuffer f6108u;

    /* renamed from: v */
    int f6109v;

    /* renamed from: w */
    String f6110w;

    /* renamed from: B */
    boolean f6115B;

    /* renamed from: z */
    static boolean f6113z = true;

    /* renamed from: E */
    static int f6118E = 1000;

    /* renamed from: x */
    boolean f6111x = false;

    /* renamed from: y */
    int f6112y = 1;

    /* renamed from: A */
    boolean f6114A = false;

    /* renamed from: C */
    boolean f6116C = false;

    /* renamed from: D */
    long f6117D = -1;

    /* renamed from: z */
    public Image mo40z() {
        return this.f6106r;
    }

    /* renamed from: a */
    private void m57a(ImageData imageData) {
        this.f6107t = imageData;
        if (this.f6107t instanceof ImageBuffer) {
            this.f6108u = ByteBuffer.wrap(((ImageBuffer) imageData).getRGBA());
        } else {
            this.f6108u = imageData.getImageBufferData();
        }
        this.f6109v = imageData.getDepth() / 8;
        if (this.f6109v == 4) {
            int texHeight = imageData.getTexHeight();
            int texWidth = imageData.getTexWidth();
            int height = imageData.getHeight();
            int width = imageData.getWidth();
            for (int i = 0; i < height; i++) {
                for (int i2 = 0; i2 < width; i2++) {
                    int i3 = (i2 * 4) + (i * texWidth * 4);
                    try {
                        if (this.f6108u.get(i3 + 3) == 0) {
                            this.f6108u.put(i3 + 0, (byte) 0);
                            this.f6108u.put(i3 + 1, (byte) 0);
                            this.f6108u.put(i3 + 2, (byte) 0);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        throw new IndexOutOfBoundsException("offset:" + i3 + " x:" + i2 + " y:" + i + " height:" + height + " width:" + width + " texHeight:" + texHeight + " texWidth:" + texWidth);
                    }
                }
            }
        }
        if (f6113z) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: a */
    public String mo63a() {
        return this.f6110w;
    }

    public C0920r() {
        if (f6105s == null) {
            f6105s = new ArrayList();
        }
        f6105s.add(this);
    }

    /* renamed from: A */
    public void mo70A() {
        if (this.f6107t != null || this.f6106r == null) {
            if (this.f6106r != null) {
                try {
                    this.f6106r.destroy();
                } catch (SlickException e) {
                    throw new RuntimeException((Throwable) e);
                }
            }
            Image image = null;
            if (0 == 0) {
                image = new Image(this.f6107t);
            }
            this.f6106r = image;
            mo69B();
            this.f5245k = this.f6106r.getWidth();
            this.f5246l = this.f6106r.getHeight();
            mo351f();
            mo347u();
            return;
        }
        AbstractC0789l.m682b("reloadFromImageData: slickImageData==null and slickImage!=null. Ignoring");
    }

    /* renamed from: a */
    public void mo58a(Image image, String str) {
        if (this.f6106r != null) {
            AbstractC0789l.m663f("this.slickImage!=null");
        }
        this.f6106r = image;
        mo69B();
        this.f5245k = this.f6106r.getWidth();
        this.f5246l = this.f6106r.getHeight();
        mo351f();
        this.f6110w = str;
        if (this.f6110w == null) {
            return;
        }
        if (!new File(this.f6110w).exists()) {
            throw new RuntimeException(this.f6110w + " does not exist");
        }
        this.f6117D = mo55b(true);
    }

    /* renamed from: a */
    public void mo56a(ImageData imageData, String str, boolean z) {
        m57a(imageData);
        if (!z) {
            mo70A();
        }
        this.f6110w = str;
        if (this.f6110w != null && !this.f6110w.contains(".rwmod")) {
            if (!new File(this.f6110w).exists()) {
                throw new RuntimeException(this.f6110w + " does not exist");
            }
            this.f6117D = mo55b(true);
        }
        mo351f();
    }

    /* renamed from: a */
    public static ByteBuffer m59a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer.rewind();
        byteBuffer2.put(byteBuffer);
        byteBuffer.rewind();
        byteBuffer2.flip();
        return byteBuffer2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: a */
    public C0748e mo60a(int i, int i2, boolean z) {
        C0920r rVar = new C0920r();
        rVar.mo56a((ImageData) new ImageBuffer(i, i2), (String) null, true);
        if (z) {
            if (1 == 0 || this.f6109v != 4) {
                m66E();
                for (int i3 = 0; i3 < i2; i3++) {
                    for (int i4 = 0; i4 < i; i4++) {
                        rVar.mo61a(i4, i3, mo62a(i4, i3));
                    }
                }
            } else {
                m66E();
                m59a(this.f6107t.getImageBufferData(), rVar.f6108u);
            }
        }
        rVar.f5245k = i;
        rVar.f5246l = i2;
        rVar.mo351f();
        rVar.f6111x = true;
        return rVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: h */
    public void mo52h() {
        if (!this.f6114A) {
            mo51i();
        } else if (f6113z && this.f6108u == null) {
            mo51i();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: w */
    public void mo42w() {
        m66E();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: x */
    public void mo41x() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: i */
    public void mo51i() {
        this.f6114A = true;
        if (this.f6115B) {
            mo67D();
            throw new RuntimeException("Cannot buffer pixels, we have discarded the PixelBuffer");
        } else {
            m66E();
        }
    }

    /* renamed from: E */
    public void m66E() {
        if (f6113z && this.f6108u == null) {
            m64G();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: p */
    public void mo46p() {
        m65F();
    }

    /* renamed from: F */
    public void m65F() {
        if (f6113z) {
            this.f6107t = null;
            this.f6108u = null;
        }
    }

    /* renamed from: G */
    public void m64G() {
        if (this.f6106r == null) {
            throw new RuntimeException("Cannot buffer pixels, we have no slickImage");
        }
        long a = C0586bj.m1919a();
        C0921s sVar = new C0921s(this, this.f6106r);
        this.f6107t = sVar;
        this.f6108u = ByteBuffer.wrap(sVar.m39a());
        AbstractC0789l.m670d("Recreating image data from texture: " + mo63a() + " (" + C0586bj.m1918a(C0586bj.m1917a(a)) + ")");
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: j */
    public boolean mo50j() {
        if (this.f6107t != null) {
            return true;
        }
        if (!f6113z || this.f6106r == null) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: a */
    public int mo62a(int i, int i2) {
        try {
            return C0905e.m153a(this.f6107t, this.f6108u, i, i2, this.f6109v);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("getPixel out of bounds (x:" + i + " y:" + i2 + " perPixel:" + this.f6109v + " TexWidth:" + this.f6107t.getTexWidth() + " TexHeight:" + this.f6107t.getTexHeight() + " imageByteBuffer:" + this.f6108u.limit() + " width:" + this.f5245k + " height:" + this.f5246l + ")", e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: a */
    public void mo61a(int i, int i2, int i3) {
        try {
            C0905e.m152a(this.f6107t, this.f6108u, i, i2, Color.m4211b(i3), Color.m4210c(i3), Color.m4209d(i3), Color.m4215a(i3), this.f6109v);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("setPixel out of bounds (x:" + i + " y:" + i2 + " perPixel:" + this.f6109v + " TexWidth:" + this.f6107t.getTexWidth() + " TexHeight:" + this.f6107t.getTexHeight() + " imageByteBuffer:" + this.f6108u.limit() + " width:" + this.f5245k + " height:" + this.f5246l + ")", e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: o */
    public void mo47o() {
        if (this.f6114A) {
            this.f6114A = false;
            mo70A();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: q */
    public void mo45q() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: r */
    public void mo44r() {
        this.f6115B = true;
        this.f6107t = null;
        this.f6108u = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: m */
    public void mo49m() {
        this.f6116C = true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: n */
    public void mo48n() {
        this.f6107t = null;
        this.f6108u = null;
        if (f6105s != null) {
            f6105s.remove(this);
        }
        if (this.f6106r != null) {
            try {
                this.f6106r.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
            this.f6106r = null;
        }
    }

    protected void finalize() {
        if (this.f6116C) {
            mo48n();
        }
        if (this.f6106r != null) {
            AbstractC0789l.m682b("SlickBitmapOrTexture: Leak detection: finalize called with slickImage!=null");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: g */
    public C0748e clone() {
        return mo60a(this.f5245k, this.f5246l, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: d */
    protected void mo54d() {
        mo69B();
    }

    /* renamed from: B */
    public void mo69B() {
        if (this.f6106r == null) {
            AbstractC0789l.m682b("slickImage==null");
            AbstractC0789l.m748M();
        }
        if (!this.f5244j) {
            this.f6112y = 2;
            this.f6106r.setFilter(2);
            return;
        }
        this.f6112y = 1;
        this.f6106r.setFilter(1);
    }

    /* renamed from: C */
    public void mo68C() {
        if (this.f6111x) {
            AbstractC0789l.m670d("reloadImage: skipping cloned image:" + this.f6110w);
        } else if (this.f6110w == null) {
            AbstractC0789l.m670d("reloadImage: filepath is null, skipping");
        } else {
            try {
                AbstractC0789l.m670d("reloadImage: reloading:" + this.f6110w);
                if (this.f6106r != null) {
                    this.f6106r.destroy();
                } else {
                    AbstractC0789l.m670d("slickImage==null cannot free");
                }
                f6118E++;
                FileInputStream fileInputStream = new FileInputStream(this.f6110w);
                try {
                    this.f6106r = new Image(fileInputStream, "reload_" + f6118E, false);
                    mo347u();
                    mo69B();
                    this.f5245k = this.f6106r.getWidth();
                    this.f5246l = this.f6106r.getHeight();
                    mo351f();
                    fileInputStream.close();
                } catch (NullPointerException e) {
                    throw new IOException("Failed to reload", e);
                }
            } catch (IOException e2) {
                AbstractC0789l.m670d("reloadImage: failed");
                e2.printStackTrace();
            } catch (SlickException e3) {
                AbstractC0789l.m670d("reloadImage: failed");
                e3.printStackTrace();
            }
            AbstractC0789l u = AbstractC0789l.m638u();
            if (u != null && u.f5511bt != null) {
                u.f5511bt.m3658d();
            }
        }
    }

    /* renamed from: b */
    public long mo55b(boolean z) {
        if (this.f6110w == null) {
            return -2L;
        }
        return C0743j.m881a(this.f6110w, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.C0748e
    /* renamed from: s */
    public void mo43s() {
        long b = mo55b(false);
        if (this.f6117D == -1) {
            this.f6117D = b;
        } else if (this.f6117D != b) {
            AbstractC0789l.m670d("reloadImage: '" + this.f6110w + "' reloading current now:" + b);
            mo68C();
            this.f6117D = b;
        }
    }

    /* renamed from: D */
    public void mo67D() {
        AbstractC0789l.m670d("SlickBitmapOrTexture: " + this.f5238d);
        AbstractC0789l.m670d(" className:" + getClass().getSimpleName());
        AbstractC0789l.m670d(" filepath:" + this.f6110w);
        AbstractC0789l.m670d(" slickImage:" + (this.f6106r != null));
        AbstractC0789l.m670d(" cloned:" + this.f6111x);
    }
}
