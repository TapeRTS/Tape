package com.corrodinggames.rts.java;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.EnumC0805u;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0752i;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0744a;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0832j;
import com.corrodinggames.rts.java.p043a.C0863a;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.GlyphPage;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.imageout.ImageIOWriter;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.ImageIOImageData;
import org.newdawn.slick.opengl.PNGImageData;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.LineStripRenderer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.util.FastTrig;
import org.newdawn.slick.util.ResourceLoader;

/* renamed from: com.corrodinggames.rts.java.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/e.class */
public final class C0905e implements AbstractC0755l {

    /* renamed from: a */
    public boolean f6026a;

    /* renamed from: e */
    public Graphics f6030e;

    /* renamed from: f */
    public C0748e f6031f;

    /* renamed from: k */
    public static C0862a f6037k;

    /* renamed from: l */
    public static C0862a f6038l;

    /* renamed from: m */
    public static C0862a f6039m;

    /* renamed from: r */
    boolean f6044r;

    /* renamed from: I */
    float f6061I;

    /* renamed from: J */
    float f6062J;

    /* renamed from: K */
    float f6063K;

    /* renamed from: b */
    public static final Color f6027b = new Color(0, 0, 0, 255);

    /* renamed from: c */
    public static final Color f6028c = new Color(0, 0, 0, 255);

    /* renamed from: d */
    public static final Color f6029d = new Color(0, 0, 0, 255);

    /* renamed from: g */
    public static Graphics f6032g = null;

    /* renamed from: L */
    private static SGL f6033L = Renderer.get();

    /* renamed from: t */
    public static final Color f6046t = new Color(0, 0, 0, 255);

    /* renamed from: u */
    static float f6047u = -1.0f;

    /* renamed from: x */
    static ArrayList f6050x = new ArrayList();

    /* renamed from: A */
    static RectF f6053A = new RectF();

    /* renamed from: B */
    static RectF f6054B = new RectF();

    /* renamed from: M */
    private static LineStripRenderer f6064M = Renderer.getLineStripRenderer();

    /* renamed from: h */
    final Rect f6034h = new Rect();

    /* renamed from: i */
    final Rect f6035i = new Rect();

    /* renamed from: j */
    final RectF f6036j = new RectF();

    /* renamed from: n */
    ArrayList f6040n = new ArrayList();

    /* renamed from: o */
    int f6041o = -1;

    /* renamed from: p */
    Paint f6042p = null;

    /* renamed from: q */
    C0920r f6043q = null;

    /* renamed from: s */
    final Paint f6045s = new Paint();

    /* renamed from: v */
    C0906f f6048v = new C0906f(this);

    /* renamed from: w */
    byte[] f6049w = new byte[4];

    /* renamed from: y */
    int f6051y = 0;

    /* renamed from: z */
    RectF f6052z = new RectF();

    /* renamed from: C */
    public float f6055C = 1.0f;

    /* renamed from: D */
    Rect f6056D = new Rect();

    /* renamed from: E */
    Stack f6057E = new Stack();

    /* renamed from: F */
    FloatBuffer f6058F = BufferUtils.createFloatBuffer(3);

    /* renamed from: G */
    float[] f6059G = new float[0];

    /* renamed from: H */
    int f6060H = -1;

    /* renamed from: p */
    public static void m119p() {
        f6033L = Renderer.get();
    }

    /* renamed from: q */
    public Color m118q() {
        return f6027b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public AbstractC0755l mo177a(C0748e eVar) {
        C0905e eVar2 = new C0905e();
        try {
            eVar2.f6030e = m141b(eVar).mo40z().getGraphics();
            eVar2.f6031f = eVar;
            return eVar2;
        } catch (SlickException e) {
            throw new RuntimeException((Throwable) e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public boolean mo202a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo188a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo148b() {
        f6037k = new C0862a((C0920r) mo194a(C0063R.drawable.error_outmem));
        f6038l = new C0862a((C0920r) mo194a(C0063R.drawable.error_general));
        f6039m = new C0862a((C0920r) mo194a(C0063R.drawable.error_toolargethumb));
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: c */
    public AbstractC0751h mo136c() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo166a(AbstractC0751h hVar) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo178a(C0744a aVar) {
    }

    /* renamed from: a */
    public static boolean m159a(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) > 255) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    Font m164a(C0906f fVar, String str, boolean z) {
        C0906f a = m163a(fVar, z);
        if (a.m113a(str)) {
            return a.f6068d;
        }
        UnicodeFont unicodeFont = a.f6068d;
        int i = 0;
        for (GlyphPage glyphPage : unicodeFont.getGlyphPages()) {
            i += glyphPage.getGlyphs().size();
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            str.charAt(i2);
            if (0 == 0) {
            }
        }
        unicodeFont.getGlyphPages().size();
        unicodeFont.addGlyphs(str);
        try {
            unicodeFont.loadGlyphs();
            int i3 = 0;
            for (GlyphPage glyphPage2 : unicodeFont.getGlyphPages()) {
                i3 += glyphPage2.getGlyphs().size();
            }
            unicodeFont.getGlyphPages().size();
            if (i != i3) {
                AbstractC0789l.m670d("new glypth, " + i3 + " " + a.toString() + " for text:" + str);
            }
            a.m112b(str);
            return a.f6068d;
        } catch (SlickException e) {
            throw new RuntimeException((Throwable) e);
        }
    }

    /* renamed from: a */
    C0906f m163a(C0906f fVar, boolean z) {
        Iterator it = this.f6040n.iterator();
        while (it.hasNext()) {
            C0906f fVar2 = (C0906f) it.next();
            if (fVar2.f6065a == fVar.f6065a && fVar2.f6066b == fVar.f6066b && fVar2.f6067c == fVar.f6067c) {
                return fVar2;
            }
        }
        C0906f a = fVar.clone();
        AbstractC0789l.m670d("New font:" + a.f6065a + " bold:" + a.f6066b);
        if (z) {
        }
        String str = "font/Roboto-Regular.ttf";
        if (a.f6066b) {
            str = "font/Roboto-Bold.ttf";
        }
        if (a.f6067c) {
            str = "font/DroidSansFallback.ttf";
        }
        try {
            UnicodeFont unicodeFont = new UnicodeFont(java.awt.Font.createFont(0, ResourceLoader.getResourceAsStream(str)).deriveFont(a.f6065a));
            unicodeFont.addAsciiGlyphs();
            unicodeFont.getEffects().add(new ColorEffect(new java.awt.Color(255, 255, 255)));
            try {
                unicodeFont.loadGlyphs();
            } catch (SlickException e) {
                throw new RuntimeException((Throwable) e);
            } catch (OutOfMemoryError e2) {
                AbstractC0789l.m721a(EnumC0805u.gameImage, e2);
            }
            AbstractC0789l.m670d("loadGlyphs");
            a.f6068d = unicodeFont;
            this.f6040n.add(a);
            return a;
        } catch (FontFormatException e3) {
            throw new RuntimeException((Throwable) e3);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public void m185a(Paint paint, String str) {
        m183a(paint, true, str, (C0920r) null);
    }

    /* renamed from: b */
    public void m143b(Paint paint) {
        m183a(paint, false, (String) null, (C0920r) null);
    }

    /* renamed from: a */
    public void m186a(Paint paint, C0920r rVar) {
        m183a(paint, false, (String) null, rVar);
    }

    /* renamed from: a */
    public void m183a(Paint paint, boolean z, String str, C0920r rVar) {
        boolean z2;
        boolean z3 = false;
        if (f6032g != this.f6030e) {
            m115t();
            this.f6026a = true;
            f6047u = -1.0f;
            Color.setRebindRequired();
            this.f6042p = this.f6045s;
            z3 = true;
        }
        f6032g = this.f6030e;
        if ((paint != null && !(paint instanceof C0760q)) || this.f6042p != paint || this.f6043q != rVar || z) {
            this.f6042p = paint;
            this.f6043q = rVar;
            boolean z4 = rVar == null && !z;
            if (this.f6041o != Graphics.MODE_NORMAL) {
                this.f6041o = Graphics.MODE_NORMAL;
                this.f6030e.setDrawMode(this.f6041o);
            }
            if (z3 && this.f6031f != null) {
                f6033L.glEnable(3042);
                f6033L.glColorMask(true, true, true, true);
                GL14.glBlendFuncSeparate(770, 771, 770, 1);
            }
            if (paint == null) {
                z2 = false;
                m155a(Color.white);
                if (z4) {
                    m201a(1.0f);
                }
                if (z) {
                    this.f6030e.resetFont();
                }
            } else {
                z2 = paint.m4165c();
            }
            if (rVar != null) {
                if ((rVar.f6112y == 1) != z2) {
                    int i = z2 ? 1 : 2;
                    rVar.mo40z().setFilter(i);
                    rVar.f6112y = i;
                }
            }
            if (paint != null) {
                boolean z5 = true;
                ColorFilter h = paint.m4152h();
                if (h != null && (h instanceof LightingColorFilter)) {
                    LightingColorFilter lightingColorFilter = (LightingColorFilter) h;
                    if (!(lightingColorFilter.f158a == 0 || lightingColorFilter.f158a == -1)) {
                        int i2 = lightingColorFilter.f158a;
                        f6028c.r = android.graphics.Color.m4211b(i2) * 0.003921569f;
                        f6028c.g = android.graphics.Color.m4210c(i2) * 0.003921569f;
                        f6028c.b = android.graphics.Color.m4209d(i2) * 0.003921569f;
                        f6028c.a = android.graphics.Color.m4215a(i2) * 0.003921569f;
                        m190a(paint.m4157e(), f6029d);
                        f6028c.r *= f6029d.r;
                        f6028c.g *= f6029d.g;
                        f6028c.b *= f6029d.b;
                        f6028c.a *= f6029d.a;
                        m155a(f6028c);
                        this.f6041o = Graphics.MODE_ADD;
                        this.f6030e.setDrawMode(this.f6041o);
                        f6033L.glEnable(3042);
                        f6033L.glColorMask(true, true, true, true);
                        f6033L.glBlendFunc(770, 1);
                        z5 = false;
                    }
                }
                if (z5) {
                    m130e(paint.m4157e());
                }
                if (z4) {
                    if (paint.m4153g() != 0.0f) {
                        m201a(paint.m4153g());
                    } else {
                        m201a(1.0f);
                    }
                }
                if (z) {
                    this.f6030e.setFont(m184a(paint, str, true));
                }
            }
        }
    }

    /* renamed from: e */
    private void m130e(int i) {
        m190a(i, f6046t);
        m155a(f6046t);
    }

    /* renamed from: a */
    private void m155a(Color color) {
        Color color2 = f6027b;
        if (this.f6026a) {
            this.f6026a = false;
        } else if (color2.r == color.r && color2.g == color.g && color2.b == color.b && color2.a == color.a) {
            return;
        }
        color2.a = color.a;
        color2.r = color.r;
        color2.g = color.g;
        color2.b = color.b;
        this.f6030e.setColor(color2);
    }

    /* renamed from: a */
    public void m201a(float f) {
        if (f6047u != f) {
            f6047u = f;
            this.f6030e.setLineWidth(f);
        }
    }

    /* renamed from: a */
    public Font m184a(Paint paint, String str, boolean z) {
        C0906f fVar = this.f6048v;
        fVar.f6065a = (int) paint.m4149k();
        if (m116s()) {
            fVar.f6065a = (int) (fVar.f6065a * this.f6055C);
        }
        Typeface i = paint.m4151i();
        fVar.f6066b = false;
        if (i != null) {
            fVar.f6066b = i.m4103a();
        }
        fVar.f6067c = false;
        if (m159a(str)) {
            fVar.f6067c = true;
        }
        return m164a(fVar, str, z);
    }

    /* renamed from: a */
    public static void m152a(ImageData imageData, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int texWidth = (i + (i2 * imageData.getTexWidth())) * i7;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            byteBuffer.put(texWidth, (byte) i5);
            byteBuffer.put(texWidth + 1, (byte) i4);
            byteBuffer.put(texWidth + 2, (byte) i3);
            byteBuffer.put(texWidth + 3, (byte) i6);
            return;
        }
        byteBuffer.put(texWidth, (byte) i3);
        byteBuffer.put(texWidth + 1, (byte) i4);
        byteBuffer.put(texWidth + 2, (byte) i5);
        byteBuffer.put(texWidth + 3, (byte) i6);
    }

    /* renamed from: a */
    public static int m153a(ImageData imageData, ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int texWidth = (i + (i2 * imageData.getTexWidth())) * i3;
        if (i3 == 4) {
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            i4 = byteBuffer.get(texWidth) & 255;
            i5 = byteBuffer.get(texWidth + 1) & 255;
            i6 = byteBuffer.get(texWidth + 2) & 255;
        } else {
            i6 = byteBuffer.get(texWidth) & 255;
            i5 = byteBuffer.get(texWidth + 1) & 255;
            i4 = byteBuffer.get(texWidth + 2) & 255;
        }
        if (i3 < 4) {
            i7 = 255;
        } else {
            i7 = byteBuffer.get(texWidth + 3) & 255;
        }
        return m193a(i7, i6, i5, i4);
    }

    /* renamed from: a */
    public static final int m193a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static Color m190a(int i, Color color) {
        color.r = ((i >> 16) & 255) * 0.003921569f;
        color.g = ((i >> 8) & 255) * 0.003921569f;
        color.b = (i & 255) * 0.003921569f;
        color.a = (i >>> 24) * 0.003921569f;
        return color;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public C0748e mo194a(int i) {
        return mo189a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: d */
    public void mo133d() {
        m117r();
    }

    /* renamed from: r */
    public static void m117r() {
        if (f6050x.size() != 0) {
            Iterator it = f6050x.iterator();
            while (it.hasNext()) {
                ((C0920r) it.next()).m65F();
            }
            f6050x.clear();
        }
    }

    /* renamed from: a */
    public static void m162a(C0920r rVar) {
        f6050x.add(rVar);
        if (f6050x.size() > 15) {
            m117r();
        }
    }

    /* renamed from: b */
    public static C0920r m144b(int i, boolean z) {
        String e = C0654f.m1438e(i);
        try {
            FileInputStream fileInputStream = new FileInputStream(e);
            ImageData a = m161a(fileInputStream);
            fileInputStream.close();
            return m154a(a, e);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (OutOfMemoryError e3) {
            AbstractC0789l.m721a(EnumC0805u.gameImage, e3);
            if (f6037k != null) {
                return f6037k;
            }
            throw new RuntimeException("outOfMemoryErrorImage==null", e3);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public C0748e mo189a(int i, boolean z) {
        return m144b(i, z);
    }

    /* renamed from: a */
    public static ImageData m161a(InputStream inputStream) {
        ImageData imageData;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                bufferedInputStream.mark(Integer.MAX_VALUE);
                ImageData pNGImageData = new PNGImageData();
                pNGImageData.loadImage(bufferedInputStream);
                imageData = pNGImageData;
            } catch (IOException e) {
                bufferedInputStream.reset();
                AbstractC0789l.m670d("PNG load failed: " + e.getMessage());
                AbstractC0789l.m670d("Attempting load with ImageIO..");
                ImageIOImageData imageIOImageData = new ImageIOImageData();
                imageData = new C0863a(imageIOImageData, imageIOImageData.loadImage(bufferedInputStream, false, (int[]) null));
            }
            return imageData;
        } finally {
            bufferedInputStream.close();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public C0748e mo160a(InputStream inputStream, boolean z) {
        try {
            String str = null;
            if (inputStream instanceof C0832j) {
                str = ((C0832j) inputStream).m496d();
            } else {
                AbstractC0789l.m682b("loadImage InputStream is not AssetInputStream");
                AbstractC0789l.m748M();
            }
            this.f6051y++;
            return m154a(m161a(inputStream), str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (OutOfMemoryError e2) {
            AbstractC0789l.m721a(EnumC0805u.gameImage, e2);
            if (f6037k != null) {
                return f6037k;
            }
            throw new RuntimeException("outOfMemoryErrorImage==null", e2);
        }
    }

    /* renamed from: a */
    public static C0920r m154a(ImageData imageData, String str) {
        C0920r rVar = new C0920r();
        rVar.mo56a(imageData, str, false);
        m162a(rVar);
        return rVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public C0748e mo192a(int i, int i2, boolean z) {
        C0920r rVar = new C0920r();
        try {
            rVar.mo58a(new Image(i, i2), (String) null);
            m162a(rVar);
            return rVar;
        } catch (SlickException e) {
            throw new RuntimeException((Throwable) e);
        } catch (OutOfMemoryError e2) {
            AbstractC0789l.m721a(EnumC0805u.gameImageCreate, e2);
            if (f6037k != null) {
                return f6037k;
            }
            throw new RuntimeException("outOfMemoryErrorImage==null", e2);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public C0748e mo145b(int i, int i2, boolean z) {
        return m154a((ImageData) new ImageBuffer(i, i2), (String) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo176a(C0748e eVar, float f, float f2, float f3, Paint paint) {
        this.f6030e.pushTransform();
        this.f6030e.rotate(f, f2, f3 + 90.0f);
        C0920r b = m141b(eVar);
        m186a(paint, b);
        this.f6030e.drawImage(b.mo40z(), f - b.f5247m, f2 - b.f5248n, m118q());
        this.f6030e.popTransform();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo173a(C0748e eVar, Rect rect, float f, float f2, float f3, Paint paint) {
        this.f6030e.pushTransform();
        this.f6030e.rotate(f, f2, f3);
        C0920r b = m141b(eVar);
        m186a(paint, b);
        this.f6030e.drawImage(b.mo40z(), f - b.f5247m, f2 - b.f5248n, rect.f227a, rect.f228b, rect.f229c, rect.f230d, m118q());
        this.f6030e.popTransform();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo170a(C0748e eVar, Rect rect, Rect rect2, Paint paint) {
        this.f6052z.m4121a(rect2);
        mo169a(eVar, rect, this.f6052z, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo139b(C0748e eVar, Rect rect, Rect rect2, Paint paint) {
        this.f6052z.m4121a(rect2);
        mo169a(eVar, rect, this.f6052z, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo181a(Rect rect, Paint paint) {
        this.f6052z.m4121a(rect);
        mo179a(this.f6052z, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo151a(boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: e */
    public void mo131e() {
    }

    /* renamed from: b */
    private final C0920r m141b(C0748e eVar) {
        return (C0920r) eVar.mo352c();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo169a(C0748e eVar, Rect rect, RectF rectF, Paint paint) {
        C0920r b = m141b(eVar);
        m186a(paint, b);
        Image z = b.mo40z();
        if (z == null) {
            b.mo67D();
            throw new RuntimeException("getSlickImage==null");
        } else {
            this.f6030e.drawImage(z, rectF.f231a, rectF.f232b, rectF.f233c, rectF.f234d, rect.f227a, rect.f228b, rect.f229c, rect.f230d, m118q());
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo175a(C0748e eVar, float f, float f2, Paint paint) {
        mo140b(eVar, f - eVar.f5249o, f2 - eVar.f5250p, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo174a(C0748e eVar, float f, float f2, Paint paint, float f3, float f4) {
        this.f6030e.pushTransform();
        this.f6030e.translate(f, f2);
        this.f6030e.scale(f4, f4);
        this.f6030e.rotate(f, f2, f3);
        C0920r b = m141b(eVar);
        m186a(paint, b);
        this.f6030e.drawImage(b.mo40z(), 0.0f, 0.0f, m118q());
        this.f6030e.popTransform();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo140b(C0748e eVar, float f, float f2, Paint paint) {
        C0920r b = m141b(eVar);
        m186a(paint, b);
        this.f6030e.drawImage(b.mo40z(), f, f2, m118q());
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo172a(C0748e eVar, Rect rect, Paint paint) {
        mo171a(eVar, rect, paint, 0, 0, 0, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo171a(C0748e eVar, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        if (eVar.mo349l() != 0 && eVar.mo350k() != 0) {
            if (i != 0) {
                i %= eVar.mo349l();
                if (i < 0) {
                    i += eVar.mo349l();
                }
            }
            if (i2 != 0) {
                i2 %= eVar.mo350k();
                if (i2 < 0) {
                    i2 += eVar.mo350k();
                }
            }
            int i5 = rect.f227a - i;
            int i6 = rect.f228b - i2;
            int l = eVar.mo349l();
            int k = eVar.mo350k();
            while (i5 < rect.f229c) {
                while (i6 < rect.f230d) {
                    int i7 = rect.f229c - i5;
                    if (i7 > l) {
                        i7 = l;
                    }
                    int i8 = rect.f230d - i6;
                    if (i8 > k) {
                        i8 = k;
                    }
                    if (i8 > 0 && i7 > 0) {
                        this.f6034h.m4136a(0, 0, i7, i8);
                        this.f6035i.m4136a(i5, i6, i5 + i7, i6 + i8);
                        int i9 = this.f6035i.f227a - rect.f227a;
                        if (i9 < 0) {
                            this.f6034h.f227a -= i9;
                            this.f6035i.f227a -= i9;
                        }
                        int i10 = this.f6035i.f228b - rect.f228b;
                        if (i10 < 0) {
                            this.f6034h.f228b -= i10;
                            this.f6035i.f228b -= i10;
                        }
                        mo170a(eVar, this.f6034h, this.f6035i, paint);
                        i6 += k - i4;
                    }
                }
                i5 += l - i3;
                i6 = rect.f228b - i2;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo168a(C0748e eVar, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        Rect rect;
        Rect rect2;
        float l = eVar.mo349l();
        float k = eVar.mo350k();
        if (l != 0.0f && k != 0.0f) {
            if (f != 0.0f) {
                f %= l;
                if (f < 0.0f) {
                    f += l;
                }
            }
            if (f2 != 0.0f) {
                f2 %= k;
                if (f2 < 0.0f) {
                    f2 += k;
                }
            }
            float f3 = rectF.f231a - f;
            float f4 = rectF.f232b;
            while (true) {
                float f5 = f4 - f2;
                if (f3 < rectF.f233c) {
                    while (f5 < rectF.f234d) {
                        float f6 = rectF.f233c - f3;
                        if (f6 > l) {
                            f6 = l;
                        }
                        float f7 = rectF.f234d - f5;
                        if (f7 > k) {
                            f7 = k;
                        }
                        if (f7 > 0.0f && f6 > 0.0f) {
                            this.f6034h.m4136a(0, 0, (int) f6, (int) f7);
                            this.f6036j.m4122a(f3, f5, f3 + f6, f5 + f7);
                            float f8 = this.f6036j.f231a - rectF.f231a;
                            if (f8 < 0.0f) {
                                this.f6034h.f227a = (int) (rect2.f227a - f8);
                                this.f6036j.f231a -= f8;
                            }
                            float f9 = this.f6036j.f232b - rectF.f232b;
                            if (f9 < 0.0f) {
                                this.f6034h.f228b = (int) (rect.f228b - f9);
                                this.f6036j.f232b -= f9;
                            }
                            mo169a(eVar, this.f6034h, this.f6036j, paint);
                            f5 += k - i2;
                        }
                    }
                    f3 += l - i;
                    f4 = rectF.f232b;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo146b(int i) {
        this.f6042p = null;
        this.f6030e.setBackground(m190a(i, f6029d));
        this.f6030e.clear();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: l */
    public void mo123l() {
        this.f6042p = null;
        this.f6030e.clearAlphaMap();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo191a(int i, PorterDuff.Mode mode) {
        this.f6042p = null;
        if (mode != PorterDuff.Mode.CLEAR) {
            mo146b(i);
            return;
        }
        mo146b(i);
        this.f6030e.clearAlphaMap();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo157a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
        float b = mo138b(str, paint);
        f6053A.m4122a(f, f2, f + b, f2 + mo156a(str, paint));
        C0654f.m1503a(f6053A, f3);
        f6054B.m4120a(f6053A);
        if (paint.m4150j() == Paint.Align.CENTER) {
            f6053A.m4123a(-(b / 2.0f), 0.0f);
        }
        mo179a(f6053A, paint2);
        mo158a(str, f6054B.f231a + f3, f6054B.f234d - f3, paint);
    }

    /* renamed from: s */
    boolean m116s() {
        if (!AbstractC0789l.m638u().f5516by.resizeFontWithUIScale || this.f6055C == 1.0f) {
            return false;
        }
        if (this.f6055C < 1.0f) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo158a(String str, float f, float f2, Paint paint) {
        if (m116s()) {
            mo125j();
            float f3 = 1.0f / this.f6055C;
            mo200a(f3, f3);
            f *= this.f6055C;
            f2 *= this.f6055C;
        }
        m185a(paint, str);
        int i = 0;
        if (paint.m4150j() == Paint.Align.CENTER) {
            i = 0 - (this.f6030e.getFont().getWidth(str) / 2);
        } else if (paint.m4150j() == Paint.Align.RIGHT) {
            i = 0 - this.f6030e.getFont().getWidth(str);
        }
        this.f6030e.drawString(str, (int) (f + i), (int) (f2 + (0 - this.f6030e.getFont().getLineHeight())));
        if (m116s()) {
            mo124k();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo142b(Rect rect, Paint paint) {
        this.f6052z.m4121a(rect);
        mo179a(this.f6052z, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo179a(RectF rectF, Paint paint) {
        m143b(paint);
        if (paint.m4161d() == Paint.Style.FILL || paint.m4161d() == Paint.Style.FILL_AND_STROKE) {
            TextureImpl.bindNone();
            f6033L.glBegin(7);
            f6033L.glVertex2f(rectF.f231a, rectF.f232b);
            f6033L.glVertex2f(rectF.f233c, rectF.f232b);
            f6033L.glVertex2f(rectF.f233c, rectF.f234d);
            f6033L.glVertex2f(rectF.f231a, rectF.f234d);
            f6033L.glEnd();
            return;
        }
        this.f6030e.drawRect(rectF.f231a, rectF.f232b, rectF.m4117b(), rectF.m4113c());
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: f */
    public void mo129f() {
        mo133d();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: g */
    public void mo128g() {
        this.f6042p = null;
        this.f6056D.m4125h();
        this.f6057E.clear();
        this.f6026a = true;
        f6047u = -1.0f;
        this.f6044r = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: c */
    public void mo134c(Rect rect, Paint paint) {
        this.f6035i.m4136a(rect.f227a, rect.f228b, rect.f227a + rect.f229c, rect.f228b + rect.f230d);
        mo142b(this.f6035i, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo182a(Rect rect) {
        if (rect == null) {
            this.f6056D.m4125h();
        } else {
            this.f6056D.m4135a(rect);
        }
        m115t();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo180a(RectF rectF) {
        if (rectF == null) {
            this.f6056D.m4125h();
        } else {
            this.f6056D.m4136a((int) rectF.f231a, (int) rectF.f232b, (int) rectF.f233c, (int) rectF.f234d);
        }
        m115t();
    }

    /* renamed from: t */
    public void m115t() {
        if (!this.f6056D.m4138a()) {
            this.f6030e.setWorldClip(this.f6056D.f227a, this.f6056D.f228b, this.f6056D.m4134b(), this.f6056D.m4130c());
        } else {
            this.f6030e.clearWorldClip();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo195a(float f, float f2, float f3, Paint paint) {
        m143b(paint);
        if (paint.m4161d() == Paint.Style.STROKE) {
            int i = 40;
            if (f3 > 100.0f) {
                i = 60;
            }
            m196a(f, f2, f3, i);
            return;
        }
        this.f6030e.fillOval(f - f3, f2 - f3, f3 * 2.0f, f3 * 2.0f);
    }

    /* renamed from: c */
    public FloatBuffer m135c(int i) {
        if (this.f6058F.capacity() < i) {
            this.f6058F = BufferUtils.createFloatBuffer(i);
        }
        return this.f6058F;
    }

    /* renamed from: a */
    public FloatBuffer m150a(float[] fArr, int i) {
        FloatBuffer c = m135c(i);
        c.clear();
        c.put(fArr, 0, i);
        c.flip();
        return c;
    }

    /* renamed from: d */
    public float[] m132d(int i) {
        if (this.f6059G.length < i) {
            this.f6059G = new float[i];
        }
        return this.f6059G;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo149a(float[] fArr, int i, int i2, Paint paint) {
        if (i2 != 0) {
            boolean z = true;
            if (Main.f5853b) {
                z = false;
            }
            float g = paint.m4153g();
            float f = 1.0f;
            float f2 = 0.0f;
            if (g > 1.0f) {
                f = 1.0f + ((g - 1.0f) * 0.5f);
                f2 = 0.0f + ((g - 1.0f) * 0.5f);
            }
            if (z) {
                float[] d = m132d(i2 * 4);
                int i3 = i2 * 4;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5 += 8) {
                    float f3 = fArr[i4];
                    float f4 = fArr[i4 + 1];
                    float f5 = f3 - f2;
                    float f6 = f3 + f;
                    float f7 = f4 - f2;
                    float f8 = f4 + f;
                    d[i5 + 0] = f5;
                    d[i5 + 1] = f7;
                    d[i5 + 2] = f6;
                    d[i5 + 3] = f7;
                    d[i5 + 4] = f6;
                    d[i5 + 5] = f8;
                    d[i5 + 6] = f5;
                    d[i5 + 7] = f8;
                    i4 += 2;
                }
                m137b(d, 0, i2 * 4, paint);
                return;
            }
            m143b(paint);
            TextureImpl.bindNone();
            f6033L.glBegin(7);
            int i6 = i + i2;
            for (int i7 = i; i7 < i6; i7 += 2) {
                float f9 = fArr[i7];
                float f10 = fArr[i7 + 1];
                float f11 = f9 - f2;
                float f12 = f9 + f;
                float f13 = f10 - f2;
                float f14 = f10 + f;
                f6033L.glVertex2f(f11, f13);
                f6033L.glVertex2f(f12, f13);
                f6033L.glVertex2f(f12, f14);
                f6033L.glVertex2f(f11, f14);
            }
            f6033L.glEnd();
        }
    }

    /* renamed from: b */
    public void m137b(float[] fArr, int i, int i2, Paint paint) {
        boolean z = Main.f5852a;
        if (z) {
            GL11.glDisableClientState(32886);
        }
        m143b(paint);
        TextureImpl.bindNone();
        GL11.glEnableClientState(32884);
        GL11.glVertexPointer(2, 0, m150a(fArr, i2));
        GL11.glDrawArrays(7, i, i2 / 2);
        if (z) {
            GL11.glEnableClientState(32886);
        }
    }

    /* renamed from: a */
    public void m196a(float f, float f2, float f3, int i) {
        Graphics.setCurrent(this.f6030e);
        TextureImpl.bindNone();
        if (this.f6060H != i) {
            this.f6060H = i;
            this.f6061I = 6.283185f / i;
            this.f6062J = (float) FastTrig.cos(this.f6061I);
            this.f6063K = (float) FastTrig.sin(this.f6061I);
        }
        float f4 = this.f6062J;
        float f5 = this.f6063K;
        float f6 = f3;
        float f7 = 0.0f;
        f6064M.start();
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            f6064M.vertex(f6 + f, f7 + f2);
            f6 = (f4 * f6) - (f5 * f7);
            f7 = (f5 * f6) + (f4 * f7);
        }
        f6064M.end();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: h */
    public void mo127h() {
        this.f6030e.pushTransform();
        this.f6057E.push(new Rect(this.f6056D));
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: i */
    public void mo126i() {
        this.f6030e.popTransform();
        this.f6056D = (Rect) this.f6057E.pop();
        m115t();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: j */
    public void mo125j() {
        this.f6030e.pushTransform();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: k */
    public void mo124k() {
        this.f6030e.popTransform();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo199a(float f, float f2, float f3) {
        this.f6030e.rotate(f2, f3, f);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo200a(float f, float f2) {
        this.f6030e.scale(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo198a(float f, float f2, float f3, float f4) {
        this.f6030e.translate(f3, f4);
        this.f6030e.scale(f, f2);
        this.f6030e.translate(-f3, -f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public void mo147b(float f, float f2) {
        this.f6030e.translate(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo165a(AbstractC0752i iVar) {
        iVar.mo875a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo197a(float f, float f2, float f3, float f4, Paint paint) {
        m143b(paint);
        this.f6030e.drawLine(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo187a(Paint paint) {
        m184a(paint, "", false);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: m */
    public void mo122m() {
        this.f6042p = null;
        this.f6030e.flush();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: n */
    public void mo121n() {
        if (this.f6030e != null) {
            this.f6030e.destroy();
        }
        this.f6030e = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public int mo156a(String str, Paint paint) {
        m185a(paint, str);
        int lineHeight = this.f6030e.getFont().getLineHeight();
        if (m116s()) {
            lineHeight = (int) (lineHeight / this.f6055C);
        }
        return lineHeight;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: b */
    public int mo138b(String str, Paint paint) {
        m185a(paint, str);
        int width = this.f6030e.getFont().getWidth(str);
        if (m116s()) {
            width = (int) (width / this.f6055C);
        }
        return width;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: o */
    public C0748e mo120o() {
        return f6037k;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l
    /* renamed from: a */
    public void mo167a(C0748e eVar, File file) {
        C0920r b = m141b(eVar);
        ImageIOWriter imageIOWriter = new ImageIOWriter();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            imageIOWriter.saveImage(b.mo40z(), "png", fileOutputStream, true);
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
