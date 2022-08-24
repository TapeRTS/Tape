package com.corrodinggames.rts.java;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.AbstractC0942m;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0923a;
import com.corrodinggames.rts.gameFramework.p044l.C0924aa;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0929af;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0935f;
import com.corrodinggames.rts.gameFramework.p044l.C0936g;
import com.corrodinggames.rts.gameFramework.p044l.C1024v;
import com.corrodinggames.rts.gameFramework.p044l.EnumC1025w;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.java.p049a.C1129a;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
import java.util.concurrent.locks.Lock;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.GlyphPage;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.imageout.ImageOut;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.ImageIOImageData;
import org.newdawn.slick.opengl.PNGImageData;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.LineStripRenderer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.util.FastTrig;
import org.newdawn.slick.util.ResourceLoader;

/* renamed from: com.corrodinggames.rts.java.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/e.class */
public final class C1173e implements InterfaceC1027y {

    /* renamed from: b */
    public boolean f7152b;

    /* renamed from: f */
    public Graphics f7153f;

    /* renamed from: g */
    public BitmapOrTexture f7154g;

    /* renamed from: h */
    public int f7155h;

    /* renamed from: i */
    public int f7156i;

    /* renamed from: j */
    public C0935f f7157j;

    /* renamed from: r */
    public static C1128a f7158r;

    /* renamed from: s */
    public static C1128a f7159s;

    /* renamed from: t */
    public static C1128a f7160t;

    /* renamed from: y */
    boolean f7161y;

    /* renamed from: J */
    static RectF f7162J;

    /* renamed from: K */
    static RectF f7163K;

    /* renamed from: M */
    static RectF f7164M;

    /* renamed from: Q */
    float f7165Q;

    /* renamed from: R */
    float f7166R;

    /* renamed from: S */
    float f7167S;

    /* renamed from: X */
    private static LineStripRenderer f7168X;

    /* renamed from: c */
    public static final Color f7169c = new Color(0, 0, 0, 255);

    /* renamed from: d */
    public static final Color f7170d = new Color(0, 0, 0, 255);

    /* renamed from: e */
    public static final Color f7171e = new Color(0, 0, 0, 255);

    /* renamed from: k */
    public static Graphics f7172k = null;

    /* renamed from: l */
    static C1173e f7173l = null;

    /* renamed from: m */
    public static C0928ae f7174m = null;

    /* renamed from: W */
    private static SGL f7175W = Renderer.get();

    /* renamed from: A */
    public static final Color f7176A = new Color(0, 0, 0, 255);

    /* renamed from: B */
    static float f7177B = -1.0f;

    /* renamed from: E */
    static ArrayList f7178E = new ArrayList();

    /* renamed from: I */
    static Paint f7179I = new C0930ag();

    /* renamed from: H */
    static Paint f7180H = new Paint();

    /* renamed from: a */
    public boolean f7181a = true;

    /* renamed from: n */
    final Rect f7182n = new Rect();

    /* renamed from: o */
    final Rect f7183o = new Rect();

    /* renamed from: p */
    final RectF f7184p = new RectF();

    /* renamed from: q */
    final PointF f7185q = new PointF();

    /* renamed from: u */
    ArrayList f7186u = new ArrayList();

    /* renamed from: v */
    int f7187v = -1;

    /* renamed from: w */
    Paint f7188w = null;

    /* renamed from: x */
    C1189s f7189x = null;

    /* renamed from: z */
    final Paint f7190z = new Paint();

    /* renamed from: C */
    C1174f f7191C = new C1174f(this);

    /* renamed from: D */
    byte[] f7192D = new byte[4];

    /* renamed from: F */
    int f7193F = 0;

    /* renamed from: G */
    RectF f7194G = new RectF();

    /* renamed from: L */
    public float f7195L = 1.0f;

    /* renamed from: N */
    FloatBuffer f7196N = BufferUtils.createFloatBuffer(3);

    /* renamed from: O */
    float[] f7197O = new float[0];

    /* renamed from: P */
    int f7198P = -1;

    /* renamed from: T */
    C1175g f7199T = new C1175g();

    /* renamed from: U */
    C1101m f7200U = new C1101m();

    /* renamed from: V */
    C1101m f7201V = new C1101m();

    static {
        f7180H.m7267a(255, 255, 0, 0);
        f7180H.m7260a(Paint.Style.STROKE);
        f7162J = new RectF();
        f7163K = new RectF();
        f7168X = Renderer.getLineStripRenderer();
    }

    /* renamed from: c */
    public static void m159c() {
        f7175W = Renderer.get();
    }

    /* renamed from: s */
    public Color m133s() {
        return f7169c;
    }

    /* renamed from: c */
    public C1173e mo917a(BitmapOrTexture bitmapOrTexture) {
        C1173e m151d = m151d(bitmapOrTexture);
        m151d.f7157j = this.f7157j;
        return m151d;
    }

    /* renamed from: d */
    public C1173e mo891b(BitmapOrTexture bitmapOrTexture) {
        C1173e c1173e = new C1173e();
        try {
            c1173e.f7153f = m148e(bitmapOrTexture).mo418C().getGraphics();
            c1173e.f7154g = bitmapOrTexture;
            if (bitmapOrTexture != null) {
                c1173e.f7155h = bitmapOrTexture.mo396m();
                c1173e.f7156i = bitmapOrTexture.mo397l();
            }
            return c1173e;
        } catch (SlickException e) {
            throw new RuntimeException((Throwable) e);
        }
    }

    /* renamed from: m */
    public int mo876m() {
        if (this.f7154g != null) {
            return this.f7155h;
        }
        return (int) GameEngine.getInstance().f6128ck;
    }

    /* renamed from: n */
    public int mo875n() {
        if (this.f7154g != null) {
            return this.f7156i;
        }
        return (int) GameEngine.getInstance().f6129cl;
    }

    /* renamed from: a */
    public void mo929a(int i, int i2) {
        this.f7155h = i;
        this.f7156i = i2;
    }

    /* renamed from: a */
    public boolean mo936a() {
        return false;
    }

    /* renamed from: a */
    public void mo925a(Context context) {
    }

    /* renamed from: b */
    public void mo897b() {
        f7158r = new C1128a((C1189s) mo930a(R.drawable.error_outmem));
        f7158r.m1041a("Out of memory");
        f7159s = new C1128a((C1189s) mo930a(R.drawable.error_general));
        f7159s.m1041a("General Error");
        f7160t = new C1128a((C1189s) mo930a(R.drawable.error_toolargethumb));
        f7159s.m1041a("Too Large Thumbnail Error");
        if (!GameEngine.f6081aC) {
            this.f7157j = new C0935f(1024, 1024);
        }
    }

    /* renamed from: d */
    public InterfaceC0941l mo885d() {
        return null;
    }

    /* renamed from: a */
    public void mo906a(InterfaceC0941l interfaceC0941l) {
    }

    /* renamed from: a */
    public void mo919a(C0923a c0923a) {
    }

    /* renamed from: a */
    public static boolean m188a(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) > 255) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    Font m193a(C1174f c1174f, String str, boolean z) {
        C1174f m192a = m192a(c1174f, z);
        if (m192a.m124a(str)) {
            return m192a.f7205d;
        }
        UnicodeFont unicodeFont = m192a.f7205d;
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
                GameEngine.PrintLog("new glypth, " + i3 + " " + m192a.toString() + " for text:" + str);
            }
            m192a.m123b(str);
            return m192a.f7205d;
        } catch (SlickException e) {
            throw new RuntimeException((Throwable) e);
        }
    }

    /* renamed from: a */
    C1174f m192a(C1174f c1174f, boolean z) {
        Iterator it = this.f7186u.iterator();
        while (it.hasNext()) {
            C1174f c1174f2 = (C1174f) it.next();
            if (c1174f2.f7202a == c1174f.f7202a && c1174f2.f7203b == c1174f.f7203b && c1174f2.f7204c == c1174f.f7204c) {
                return c1174f2;
            }
        }
        C1174f m125a = c1174f.m125a();
        GameEngine.PrintLog("New font:" + m125a.f7202a + " bold:" + m125a.f7203b);
        if (z) {
        }
        String str = "font/Roboto-Regular.ttf";
        if (m125a.f7203b) {
            str = "font/Roboto-Bold.ttf";
        }
        if (m125a.f7204c) {
            str = "font/DroidSansFallback.ttf";
        }
        try {
            UnicodeFont unicodeFont = new UnicodeFont(java.awt.Font.createFont(0, ResourceLoader.getResourceAsStream(str)).deriveFont(m125a.f7202a));
            unicodeFont.addAsciiGlyphs();
            unicodeFont.getEffects().add(new ColorEffect(new java.awt.Color(255, 255, 255)));
            try {
                unicodeFont.loadGlyphs();
            } catch (SlickException e) {
                throw new RuntimeException((Throwable) e);
            } catch (OutOfMemoryError e2) {
                GameEngine.m1195a(EnumC1065u.f6739a, e2);
            }
            GameEngine.PrintLog("loadGlyphs");
            m125a.f7205d = unicodeFont;
            this.f7186u.add(m125a);
            return m125a;
        } catch (FontFormatException e3) {
            throw new RuntimeException((Throwable) e3);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public void m217a(Paint paint, String str) {
        m215a(paint, true, str, (C1189s) null, (BitmapOrTexture) null);
    }

    /* renamed from: b */
    public void m169b(Paint paint) {
        m215a(paint, false, (String) null, (C1189s) null, (BitmapOrTexture) null);
    }

    /* renamed from: a */
    public void m218a(Paint paint, C1189s c1189s, BitmapOrTexture bitmapOrTexture) {
        m215a(paint, false, (String) null, c1189s, bitmapOrTexture);
    }

    /* renamed from: t */
    public void m132t() {
        m128x();
        Graphics.setCurrent(this.f7153f);
        m161b(true);
        this.f7152b = true;
        f7177B = -1.0f;
        Color.setRebindRequired();
        this.f7188w = this.f7190z;
        f7173l = this;
    }

    /* renamed from: a */
    public void m215a(Paint paint, boolean z, String str, C1189s c1189s, BitmapOrTexture bitmapOrTexture) {
        boolean m7238c;
        boolean z2 = false;
        if (f7172k != this.f7153f) {
            m132t();
            z2 = true;
            f7172k = this.f7153f;
        }
        if ((paint == null || (paint instanceof C0930ag)) && this.f7188w == paint && this.f7189x == c1189s && !z) {
            C0928ae c0928ae = null;
            if (this.f7181a) {
                if (paint != null && (paint instanceof C0930ag)) {
                    c0928ae = ((C0930ag) paint).m1047q();
                }
                if (bitmapOrTexture != null && c0928ae == null) {
                    c0928ae = bitmapOrTexture.mo1075B();
                }
            }
            if (f7174m == c0928ae) {
                if (f7174m != null && f7174m.mo1017a(paint, bitmapOrTexture)) {
                    this.f7153f.flushBuffer();
                    m167b(f7174m);
                    return;
                }
                return;
            }
        }
        this.f7188w = paint;
        this.f7189x = c1189s;
        boolean z3 = c1189s == null && !z;
        if (this.f7187v != Graphics.MODE_NORMAL) {
            this.f7187v = Graphics.MODE_NORMAL;
            this.f7153f.setDrawMode(this.f7187v);
        }
        if (z2 && this.f7154g != null) {
            f7175W.glEnable(3042);
            f7175W.glColorMask(true, true, true, true);
            GL14.glBlendFuncSeparate(770, 771, 770, 1);
        }
        if (paint == null) {
            m7238c = false;
            m183a(Color.white);
            if (z3) {
                m235a(1.0f);
            }
            if (z) {
                this.f7153f.resetFont();
            }
        } else {
            m7238c = paint.m7238c();
        }
        if (this.f7181a) {
            C0928ae c0928ae2 = null;
            if (paint != null && (paint instanceof C0930ag)) {
                c0928ae2 = ((C0930ag) paint).m1047q();
            }
            if (bitmapOrTexture != null && c0928ae2 == null) {
                c0928ae2 = bitmapOrTexture.mo1075B();
            }
            if (f7174m != c0928ae2) {
                this.f7153f.flushBuffer();
                if (c0928ae2 == null) {
                    m131u();
                } else {
                    c0928ae2.m1061f();
                    if (!m156c(c0928ae2)) {
                        if (f7174m != null) {
                            m131u();
                        }
                    } else {
                        c0928ae2.mo1017a(paint, bitmapOrTexture);
                        m167b(c0928ae2);
                    }
                }
                f7174m = c0928ae2;
            } else if (f7174m != null && f7174m.mo1017a(paint, bitmapOrTexture)) {
                this.f7153f.flushBuffer();
                m167b(f7174m);
            }
        }
        if (c1189s != null) {
            if ((c1189s.f7260E == 1) != m7238c) {
                this.f7153f.flushBuffer();
                int i = m7238c ? 1 : 2;
                c1189s.mo418C().setFilter(i);
                c1189s.f7260E = i;
            }
        }
        if (paint != null) {
            boolean z4 = true;
            ColorFilter m7225h = paint.m7225h();
            if (m7225h != null) {
                if (m7225h instanceof LightingColorFilter) {
                    LightingColorFilter lightingColorFilter = (LightingColorFilter) m7225h;
                    if (lightingColorFilter.f157a != 0 && lightingColorFilter.f157a != -1) {
                        int i2 = lightingColorFilter.f157a;
                        f7170d.r = android.graphics.Color.m7280b(i2) * 0.003921569f;
                        f7170d.g = android.graphics.Color.m7279c(i2) * 0.003921569f;
                        f7170d.b = android.graphics.Color.m7278d(i2) * 0.003921569f;
                        f7170d.a = android.graphics.Color.m7284a(i2) * 0.003921569f;
                        m222a(paint.m7230e(), f7171e);
                        f7170d.r *= f7171e.r;
                        f7170d.g *= f7171e.g;
                        f7170d.b *= f7171e.b;
                        f7170d.a *= f7171e.a;
                        m183a(f7170d);
                        this.f7187v = Graphics.MODE_ADD;
                        this.f7153f.setDrawMode(this.f7187v);
                        f7175W.glEnable(3042);
                        f7175W.glColorMask(true, true, true, true);
                        f7175W.glBlendFunc(770, 1);
                        z4 = false;
                    }
                } else if (m7225h instanceof C1024v) {
                    C1024v c1024v = (C1024v) m7225h;
                    if (c1024v.f6553a == EnumC1025w.f6555b) {
                        m146f(paint.m7230e());
                        this.f7187v = 99;
                        f7175W.glEnable(3042);
                        f7175W.glColorMask(true, true, true, true);
                        f7175W.glBlendFunc(1, 1);
                        z4 = false;
                    } else if (c1024v.f6553a == EnumC1025w.f6556c) {
                        m146f(paint.m7230e());
                        this.f7187v = 99;
                        f7175W.glEnable(3042);
                        f7175W.glColorMask(true, true, true, true);
                        f7175W.glBlendFunc(774, 771);
                        z4 = false;
                    }
                }
            }
            if (z4) {
                m146f(paint.m7230e());
            }
            if (z3) {
                if (paint.m7226g() != 0.0f) {
                    m235a(paint.m7226g());
                } else {
                    m235a(1.0f);
                }
            }
            if (z) {
                this.f7153f.setFont(m216a(paint, str, true));
            }
        }
    }

    /* renamed from: u */
    public void m131u() {
        GL20.glUseProgram(0);
    }

    /* renamed from: b */
    public void m167b(C0928ae c0928ae) {
        C0929af[] c0929afArr;
        for (C0929af c0929af : c0928ae.f6355p) {
            if (c0929af.f6360c) {
                c0929af.f6360c = false;
                if (c0929af.f6364b == -1) {
                    c0929af.f6364b = GL20.glGetUniformLocation(c0928ae.f6353n, c0929af.f6359a);
                    if (c0929af.f6364b == -1 && !c0929af.f6361d) {
                        c0929af.f6361d = true;
                        c0928ae.m1066b("Unknown parameter: " + c0929af.f6359a);
                        int glGetProgrami = GL20.glGetProgrami(c0928ae.f6353n, 35718);
                        int glGetProgrami2 = GL20.glGetProgrami(c0928ae.f6353n, 35719);
                        for (int i = 0; i < glGetProgrami; i++) {
                            c0928ae.m1066b("Possible parameter: " + GL20.glGetActiveUniform(c0928ae.f6353n, i, glGetProgrami2));
                        }
                        return;
                    }
                }
                if (c0929af.f6362f != null) {
                    Texture texture = m148e(c0929af.f6362f).mo418C().getTexture();
                    if (c0929af.f6363g) {
                        GL20.glUniform2f(c0929af.f6364b, texture.getTextureWidth(), texture.getTextureHeight());
                    } else {
                        int textureID = texture.getTextureID();
                        c0928ae.m1066b("Updating texture to:" + textureID);
                        GL20.glUniform1i(c0929af.f6364b, 1);
                        GL13.glActiveTexture(33985);
                        GL11.glBindTexture(3553, textureID);
                        GL13.glActiveTexture(33984);
                    }
                } else if (c0929af.f6365e.length == 1) {
                    GL20.glUniform1f(c0929af.f6364b, c0929af.f6365e[0]);
                } else if (c0929af.f6365e.length == 2) {
                    GL20.glUniform2f(c0929af.f6364b, c0929af.f6365e[0], c0929af.f6365e[1]);
                } else if (c0929af.f6365e.length == 4) {
                    GL20.glUniform4f(c0929af.f6364b, c0929af.f6365e[0], c0929af.f6365e[1], c0929af.f6365e[2], c0929af.f6365e[3]);
                } else {
                    c0928ae.m1066b("Unhandled parameter size: " + c0929af.f6359a + " - " + c0929af.f6365e.length);
                }
            }
        }
    }

    /* renamed from: c */
    public boolean m156c(C0928ae c0928ae) {
        if (c0928ae.f6354o != 0) {
            return false;
        }
        if (c0928ae.f6353n != 0 && !c0928ae.f6352m) {
            GL20.glUseProgram(c0928ae.f6353n);
            return true;
        }
        c0928ae.f6352m = false;
        c0928ae.m1066b("Compiling shader");
        c0928ae.f6346g = m208a(c0928ae, 35633, c0928ae.f6344e);
        c0928ae.f6347h = m208a(c0928ae, 35632, c0928ae.f6345f);
        if (c0928ae.f6354o != 0) {
            return false;
        }
        c0928ae.f6353n = GL20.glCreateProgram();
        if (c0928ae.f6353n == 0) {
            c0928ae.m1064c("could not create program; check ShaderProgram.isSupported()");
            return false;
        }
        GL20.glAttachShader(c0928ae.f6353n, c0928ae.f6346g);
        GL20.glAttachShader(c0928ae.f6353n, c0928ae.f6347h);
        GL20.glLinkProgram(c0928ae.f6353n);
        int glGetProgrami = GL20.glGetProgrami(c0928ae.f6353n, 35714);
        String glGetProgramInfoLog = GL20.glGetProgramInfoLog(c0928ae.f6353n, GL20.glGetProgrami(c0928ae.f6353n, 35716));
        if (glGetProgramInfoLog != null && glGetProgramInfoLog.length() != 0) {
            c0928ae.f6343d = glGetProgramInfoLog + "\n" + c0928ae.f6343d;
        }
        if (c0928ae.f6343d != null) {
            c0928ae.f6343d = c0928ae.f6343d.trim();
        }
        if (glGetProgrami == 0) {
            c0928ae.m1064c(c0928ae.f6343d.length() != 0 ? c0928ae.f6343d : "Could not link program");
            return false;
        }
        GL20.glUseProgram(c0928ae.f6353n);
        return true;
    }

    /* renamed from: a */
    protected int m208a(C0928ae c0928ae, int i, String str) {
        int glCreateShader = GL20.glCreateShader(i);
        if (glCreateShader == 0) {
            c0928ae.m1064c("could not create shader object; check ShaderProgram.isSupported()");
        }
        GL20.glShaderSource(glCreateShader, str);
        GL20.glCompileShader(glCreateShader);
        int glGetShaderi = GL20.glGetShaderi(glCreateShader, 35713);
        int glGetShaderi2 = GL20.glGetShaderi(glCreateShader, 35716);
        String m149e = m149e(i);
        String glGetShaderInfoLog = GL20.glGetShaderInfoLog(glCreateShader, glGetShaderi2);
        if (glGetShaderInfoLog != null && glGetShaderInfoLog.length() != 0) {
            c0928ae.f6343d += m149e + " compile log:\n" + glGetShaderInfoLog + "\n";
        }
        if (glGetShaderi == 0) {
            c0928ae.m1064c(c0928ae.f6343d.length() != 0 ? c0928ae.f6343d : "Could not compile " + m149e(i));
        }
        return glCreateShader;
    }

    /* renamed from: e */
    private String m149e(int i) {
        if (i == 35632) {
            return "FRAGMENT_SHADER";
        }
        if (i == 35633) {
            return "VERTEX_SHADER";
        }
        return "shader";
    }

    /* renamed from: f */
    private void m146f(int i) {
        m222a(i, f7176A);
        m183a(f7176A);
    }

    /* renamed from: a */
    private void m183a(Color color) {
        Color color2 = f7169c;
        if (this.f7152b) {
            this.f7152b = false;
        } else if (color2.r == color.r && color2.g == color.g && color2.b == color.b && color2.a == color.a) {
            return;
        }
        color2.a = color.a;
        color2.r = color.r;
        color2.g = color.g;
        color2.b = color.b;
        this.f7153f.setColor(color2);
    }

    /* renamed from: a */
    public void m235a(float f) {
        if (f7177B != f) {
            f7177B = f;
            this.f7153f.setLineWidth(f);
        }
    }

    /* renamed from: a */
    public Font m216a(Paint paint, String str, boolean z) {
        C1174f c1174f = this.f7191C;
        c1174f.f7202a = (int) paint.m7222k();
        if (m129w()) {
            c1174f.f7202a = (int) (c1174f.f7202a * this.f7195L);
        }
        Typeface m7224i = paint.m7224i();
        c1174f.f7203b = false;
        if (m7224i != null) {
            c1174f.f7203b = m7224i.m7176a();
        }
        c1174f.f7204c = false;
        if (m188a(str)) {
            c1174f.f7204c = true;
        }
        return m193a(c1174f, str, z);
    }

    /* renamed from: a */
    public static void m179a(ImageData imageData, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
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
    public static int m180a(ImageData imageData, ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int texWidth = (i + (i2 * imageData.getTexWidth())) * i3;
        if (i3 == 4) {
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            i6 = byteBuffer.get(texWidth) & 255;
            i5 = byteBuffer.get(texWidth + 1) & 255;
            i4 = byteBuffer.get(texWidth + 2) & 255;
        } else {
            i4 = byteBuffer.get(texWidth) & 255;
            i5 = byteBuffer.get(texWidth + 1) & 255;
            i6 = byteBuffer.get(texWidth + 2) & 255;
        }
        if (i3 < 4) {
            i7 = 255;
        } else {
            i7 = byteBuffer.get(texWidth + 3) & 255;
        }
        return m225a(i7, i4, i5, i6);
    }

    /* renamed from: a */
    public static final int m225a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static Color m222a(int i, Color color) {
        color.r = ((i >> 16) & 255) * 0.003921569f;
        color.g = ((i >> 8) & 255) * 0.003921569f;
        color.b = (i & 255) * 0.003921569f;
        color.a = (i >>> 24) * 0.003921569f;
        return color;
    }

    /* renamed from: a */
    public BitmapOrTexture mo930a(int i) {
        return mo926a(i, true);
    }

    /* renamed from: e */
    public void mo884e() {
        m130v();
    }

    /* renamed from: v */
    public static void m130v() {
        if (f7178E.size() == 0) {
            return;
        }
        Iterator it = f7178E.iterator();
        while (it.hasNext()) {
            ((C1189s) it.next()).m72I();
        }
        f7178E.clear();
    }

    /* renamed from: a */
    public static void m191a(C1189s c1189s) {
        f7178E.add(c1189s);
        if (f7178E.size() > 15) {
            m130v();
        }
    }

    /* renamed from: b */
    public static C1189s m170b(int i, boolean z) {
        String m2263f = CommonUtils.m2263f(i);
        try {
            FileInputStream fileInputStream = new FileInputStream(m2263f);
            ImageData m190a = m190a(fileInputStream);
            fileInputStream.close();
            return m181a(m190a, m2263f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (OutOfMemoryError e2) {
            GameEngine.m1195a(EnumC1065u.f6739a, e2);
            if (f7158r == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e2);
            }
            return f7158r;
        }
    }

    /* renamed from: a */
    public BitmapOrTexture mo926a(int i, boolean z) {
        return m170b(i, z);
    }

    /* renamed from: a */
    public static ImageData m190a(InputStream inputStream) {
        PNGImageData c1129a;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                bufferedInputStream.mark(Integer.MAX_VALUE);
                PNGImageData pNGImageData = new PNGImageData();
                pNGImageData.loadImage(bufferedInputStream);
                c1129a = pNGImageData;
            } catch (IOException e) {
                bufferedInputStream.reset();
                GameEngine.PrintLog("PNG load failed: " + e.getMessage());
                GameEngine.PrintLog("Attempting load with ImageIO..");
                ImageIOImageData imageIOImageData = new ImageIOImageData();
                c1129a = new C1129a(imageIOImageData, imageIOImageData.loadImage(bufferedInputStream, false, (int[]) null));
            }
            return c1129a;
        } finally {
            bufferedInputStream.close();
        }
    }

    /* renamed from: a */
    public BitmapOrTexture mo904a(InputStream inputStream, boolean z) {
        try {
            String str = null;
            if (inputStream instanceof C1098j) {
                str = ((C1098j) inputStream).m565d();
            } else {
                GameEngine.m1145b("loadImage InputStream is not AssetInputStream");
                GameEngine.m1216S();
            }
            this.f7193F++;
            return m181a(m190a(inputStream), str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (OutOfMemoryError e2) {
            GameEngine.m1195a(EnumC1065u.f6739a, e2);
            if (f7158r == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e2);
            }
            return f7158r;
        }
    }

    /* renamed from: a */
    public static C1189s m181a(ImageData imageData, String str) {
        C1189s c1189s = new C1189s();
        c1189s.mo406a(imageData, str, false);
        m191a(c1189s);
        return c1189s;
    }

    /* renamed from: a */
    public BitmapOrTexture mo928a(int i, int i2, boolean z) {
        C1189s c1189s = new C1189s();
        try {
            c1189s.mo407a(new Image(i, i2), (String) null);
            m191a(c1189s);
            return c1189s;
        } catch (SlickException e) {
            throw new RuntimeException((Throwable) e);
        } catch (OutOfMemoryError e2) {
            GameEngine.m1195a(EnumC1065u.f6740b, e2);
            if (f7158r == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e2);
            }
            return f7158r;
        }
    }

    /* renamed from: b */
    public BitmapOrTexture mo893b(int i, int i2, boolean z) {
        return m181a((ImageData) new ImageBuffer(i, i2), (String) null);
    }

    /* renamed from: a */
    public void mo916a(BitmapOrTexture bitmapOrTexture, float f, float f2, float f3, Paint paint) {
        mo878k();
        mo934a(f3 + 90.0f, f, f2);
        m154c(bitmapOrTexture, f - bitmapOrTexture.f6398r, f2 - bitmapOrTexture.f6399s, paint);
        mo877l();
    }

    /* renamed from: a */
    public void mo913a(BitmapOrTexture bitmapOrTexture, Rect rect, float f, float f2, float f3, Paint paint) {
        mo878k();
        mo934a(f3, f, f2);
        this.f7194G.m7195a(f - bitmapOrTexture.f6398r, f2 - bitmapOrTexture.f6399s, bitmapOrTexture.f6396p, bitmapOrTexture.f6397q);
        mo909a(bitmapOrTexture, rect, this.f7194G, paint);
        mo877l();
    }

    /* renamed from: a */
    public void mo910a(BitmapOrTexture bitmapOrTexture, Rect rect, Rect rect2, Paint paint) {
        this.f7194G.m7194a(rect2);
        mo909a(bitmapOrTexture, rect, this.f7194G, paint);
    }

    /* renamed from: b */
    public void mo889b(BitmapOrTexture bitmapOrTexture, Rect rect, Rect rect2, Paint paint) {
        this.f7194G.m7194a(rect2);
        mo909a(bitmapOrTexture, rect, this.f7194G, paint);
    }

    /* renamed from: a */
    public void mo922a(Rect rect, Paint paint) {
        this.f7194G.m7194a(rect);
        mo920a(this.f7194G, paint);
    }

    /* renamed from: a */
    public void mo899a(boolean z) {
    }

    /* renamed from: f */
    public void mo883f() {
    }

    /* renamed from: e */
    private final C1189s m148e(BitmapOrTexture bitmapOrTexture) {
        return (C1189s) bitmapOrTexture.mo403c();
    }

    /* renamed from: a */
    public void mo909a(BitmapOrTexture bitmapOrTexture, Rect rect, RectF rectF, Paint paint) {
        m206a(bitmapOrTexture, rectF.f234a, rectF.f235b, rectF.f236c, rectF.f237d, rect.f230a, rect.f231b, rect.f232c, rect.f233d, paint);
    }

    /* renamed from: c */
    private void m154c(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint) {
        float mo396m = bitmapOrTexture.mo396m();
        float mo397l = bitmapOrTexture.mo397l();
        m206a(bitmapOrTexture, f, f2, f + mo396m, f2 + mo397l, 0.0f, 0.0f, mo396m, mo397l, paint);
    }

    /* renamed from: a */
    private void m206a(BitmapOrTexture bitmapOrTexture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        C0936g m1027a;
        C1175g c1175g = this.f7199T;
        float f9 = f3 - f;
        float f10 = f4 - f2;
        if (c1175g.f7211c != -90.0f) {
            float f11 = f9 / 2.0f;
            float f12 = f10 / 2.0f;
            float f13 = (f + f11) - c1175g.f7215g;
            float f14 = (f2 + f12) - c1175g.f7216h;
            if ((f13 != 0.0f || f14 != 0.0f) && (f13 > 0.01f || f14 > 0.01f || f13 < -0.01f || f14 < -0.01f)) {
                PointF pointF = this.f7185q;
                pointF.x = f13;
                pointF.y = f14;
                m228a(c1175g.f7211c + 180.0f, pointF);
                float f15 = (pointF.x + c1175g.f7215g) - f11;
                float f16 = (pointF.y + c1175g.f7216h) - f12;
                f3 += f15 - f;
                f4 += f16 - f2;
                f = f15;
                f2 = f16;
            }
        }
        C1189s m148e = m148e(bitmapOrTexture);
        if (this.f7157j != null && m148e.mo396m() < 450 && m148e.mo397l() < 100 && (m1027a = this.f7157j.m1027a(m148e)) != null) {
            m148e = m148e(m1027a.f6419a);
            if (f5 < 0.0f) {
                f += -f5;
                f5 = 0.0f;
            }
            if (f6 < 0.0f) {
                f2 += -f6;
                f6 = 0.0f;
            }
            if (f7 > m1027a.f6422d) {
                f3 += -(m1027a.f6422d - f7);
                f7 = m1027a.f6422d;
            }
            if (f8 > m1027a.f6423e) {
                f4 += -(m1027a.f6423e - f8);
                f8 = m1027a.f6423e;
            }
            f5 += m1027a.f6420b;
            f7 += m1027a.f6420b;
            f6 += m1027a.f6421c;
            f8 += m1027a.f6421c;
        }
        float f17 = f * c1175g.f7212d;
        float f18 = f2 * c1175g.f7213e;
        float f19 = (f3 - f) * c1175g.f7212d;
        float f20 = (f4 - f2) * c1175g.f7213e;
        float f21 = f17 + c1175g.f7209a;
        float f22 = f18 + c1175g.f7210b;
        float f23 = f19 / 2.0f;
        float f24 = f20 / 2.0f;
        m218a(paint, m148e, bitmapOrTexture);
        Image mo418C = m148e.mo418C();
        if (mo418C == null) {
            m148e.mo414G();
            throw new RuntimeException("getSlickImage==null");
        } else {
            m182a(mo418C, f21 + f23, f22 + f24, f19, f20, f5, f6, f7, f8, m133s(), c1175g.f7211c);
        }
    }

    /* renamed from: a */
    private void m182a(Image image, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Color color, float f9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Graphics.setCurrent(this.f7153f);
        image.startUse();
        if (color != null) {
            color.bind();
        }
        float f18 = f3 / 2.0f;
        float f19 = f4 / 2.0f;
        float width = (f5 / image.getWidth()) * image.getTextureWidth();
        float height = (f6 / image.getHeight()) * image.getTextureHeight();
        float width2 = ((f7 - f5) / image.getWidth()) * image.getTextureWidth();
        float height2 = ((f8 - f6) / image.getHeight()) * image.getTextureHeight();
        float f20 = f9 + 90.0f;
        if (f20 == 0.0f) {
            f10 = (-f18) + f;
            f11 = (-f19) + f2;
            f12 = f18 + f;
            f13 = (-f19) + f2;
            f14 = (-f18) + f;
            f15 = f19 + f2;
            f16 = f18 + f;
            f17 = f19 + f2;
        } else {
            float m2249i = CommonUtils.m2249i(f20);
            float sin = CommonUtils.sin(f20);
            float f21 = f18 * m2249i;
            float f22 = f19 * m2249i;
            float f23 = f18 * sin;
            float f24 = f19 * sin;
            f10 = (-f21) + f24 + f;
            f11 = ((-f23) - f22) + f2;
            f12 = f21 + f24 + f;
            f13 = (f23 - f22) + f2;
            f14 = ((-f21) - f24) + f;
            f15 = (-f23) + f22 + f2;
            f16 = (f21 - f24) + f;
            f17 = f23 + f22 + f2;
        }
        f7175W.glTexCoord2f(width, height);
        f7175W.glVertex3f(f10, f11, 0.0f);
        f7175W.glTexCoord2f(width, height + height2);
        f7175W.glVertex3f(f14, f15, 0.0f);
        f7175W.glTexCoord2f(width + width2, height + height2);
        f7175W.glVertex3f(f16, f17, 0.0f);
        f7175W.glTexCoord2f(width + width2, height);
        f7175W.glVertex3f(f12, f13, 0.0f);
        image.endUse();
        this.f7153f.getColor().bind();
    }

    /* renamed from: a */
    public void mo915a(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint) {
        mo890b(bitmapOrTexture, f - bitmapOrTexture.f6400t, f2 - bitmapOrTexture.f6401u, paint);
    }

    /* renamed from: a */
    public void mo914a(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint, float f3, float f4) {
        mo878k();
        mo896b(f, f2);
        mo935a(f4, f4);
        mo934a(f3, f, f2);
        m154c(bitmapOrTexture, 0.0f, 0.0f, paint);
        mo877l();
    }

    /* renamed from: b */
    public void mo890b(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint) {
        m154c(bitmapOrTexture, f, f2, paint);
    }

    /* renamed from: a */
    public void mo912a(BitmapOrTexture bitmapOrTexture, Rect rect, Paint paint) {
        mo911a(bitmapOrTexture, rect, paint, 0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo911a(BitmapOrTexture bitmapOrTexture, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        C0924aa.m1087a(this, bitmapOrTexture, rect, paint, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo908a(BitmapOrTexture bitmapOrTexture, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        C0924aa.m1086a(this, bitmapOrTexture, rectF, paint, f, f2, i, i2);
    }

    /* renamed from: b */
    public void mo894b(int i) {
        if (f7173l != this) {
            m132t();
        }
        m161b(false);
        this.f7188w = null;
        this.f7153f.setBackground(m222a(i, f7171e));
        this.f7153f.clear();
    }

    /* renamed from: o */
    public void mo874o() {
        if (f7173l != this) {
            m132t();
        }
        this.f7188w = null;
        this.f7153f.clearAlphaMap();
    }

    /* renamed from: a */
    public void mo927a(int i, PorterDuff.Mode mode) {
        this.f7188w = null;
        if (mode != PorterDuff.Mode.CLEAR) {
            mo894b(i);
            return;
        }
        mo894b(i);
        this.f7153f.clearAlphaMap();
    }

    /* renamed from: a */
    public void mo902a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
        float mo888b = mo888b(str, paint);
        f7162J.m7195a(f, f2, f + mo888b, f2 + mo901a(str, paint));
        CommonUtils.m2349a(f7162J, f3);
        f7163K.m7193a(f7162J);
        if (paint.m7223j() == Paint.Align.CENTER) {
            f7162J.m7196a(-(mo888b / 2.0f), 0.0f);
        }
        mo920a(f7162J, paint2);
        mo903a(str, f7163K.f234a + f3, f7163K.f237d - f3, paint);
    }

    /* renamed from: w */
    boolean m129w() {
        if (!GameEngine.getInstance().f6109bQ.resizeFontWithUIScale || this.f7195L == 1.0f) {
            return false;
        }
        if (this.f7195L < 1.0f) {
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void mo903a(String str, float f, float f2, Paint paint) {
        if (m129w()) {
            mo878k();
            float f3 = 1.0f / this.f7195L;
            mo935a(f3, f3);
            f *= this.f7195L;
            f2 *= this.f7195L;
        }
        float f4 = f * this.f7199T.f7212d;
        float f5 = f2 * this.f7199T.f7213e;
        float f6 = f4 + this.f7199T.f7209a;
        float f7 = f5 + this.f7199T.f7210b;
        m217a(paint, str);
        int i = 0;
        if (paint.m7223j() == Paint.Align.CENTER) {
            i = 0 - (this.f7153f.getFont().getWidth(str) / 2);
        } else if (paint.m7223j() == Paint.Align.RIGHT) {
            i = 0 - this.f7153f.getFont().getWidth(str);
        }
        this.f7153f.drawString(str, (int) (f6 + i), (int) (f7 + (0 - this.f7153f.getFont().getLineHeight())));
        if (m129w()) {
            mo877l();
        }
    }

    /* renamed from: b */
    public void mo892b(Rect rect, Paint paint) {
        this.f7194G.m7194a(rect);
        mo920a(this.f7194G, paint);
    }

    /* renamed from: a */
    public void mo920a(RectF rectF, Paint paint) {
        m169b(paint);
        if (paint.m7234d() == Paint.Style.FILL || paint.m7234d() == Paint.Style.FILL_AND_STROKE) {
            TextureImpl.bindNone();
            f7175W.glBegin(7);
            float f = rectF.f234a;
            float f2 = rectF.f235b;
            float f3 = rectF.f236c;
            float f4 = rectF.f237d;
            float f5 = f * this.f7199T.f7212d;
            float f6 = f2 * this.f7199T.f7213e;
            float f7 = f5 + this.f7199T.f7209a;
            float f8 = f6 + this.f7199T.f7210b;
            float f9 = f3 * this.f7199T.f7212d;
            float f10 = f4 * this.f7199T.f7213e;
            float f11 = f9 + this.f7199T.f7209a;
            float f12 = f10 + this.f7199T.f7210b;
            f7175W.glVertex2f(f7, f8);
            f7175W.glVertex2f(f11, f8);
            f7175W.glVertex2f(f11, f12);
            f7175W.glVertex2f(f7, f12);
            f7175W.glEnd();
            return;
        }
        float f13 = rectF.f234a;
        float f14 = rectF.f235b;
        float m7190b = rectF.m7190b();
        float m7186c = rectF.m7186c();
        float f15 = f13 * this.f7199T.f7212d;
        float f16 = f14 * this.f7199T.f7213e;
        this.f7153f.drawRect(f15 + this.f7199T.f7209a, f16 + this.f7199T.f7210b, m7190b * this.f7199T.f7212d, m7186c * this.f7199T.f7213e);
    }

    /* renamed from: g */
    public void mo882g() {
        mo884e();
        f7164M = null;
        if (this.f7157j != null) {
            this.f7157j.m1023c();
        }
    }

    /* renamed from: h */
    public void mo881h() {
        m128x();
        if (this.f7157j != null) {
            this.f7157j.m1022d();
        }
        if (this.f7181a && f7174m != null) {
            m131u();
            f7174m = null;
        }
        this.f7188w = null;
        f7164M = null;
        this.f7152b = true;
        f7177B = -1.0f;
        this.f7161y = false;
    }

    /* renamed from: c */
    public void mo886c(Rect rect, Paint paint) {
        this.f7183o.m7208a(rect.f230a, rect.f231b, rect.f230a + rect.f232c, rect.f231b + rect.f233d);
        mo892b(this.f7183o, paint);
    }

    /* renamed from: a */
    public void mo923a(Rect rect) {
        if (rect != null) {
            this.f7199T.f7214f = new RectF(rect);
            this.f7199T.f7214f.f234a *= this.f7199T.f7212d;
            this.f7199T.f7214f.f236c *= this.f7199T.f7212d;
            this.f7199T.f7214f.f235b *= this.f7199T.f7213e;
            this.f7199T.f7214f.f237d *= this.f7199T.f7213e;
            this.f7199T.f7214f.m7196a(this.f7199T.f7209a, this.f7199T.f7210b);
        } else {
            this.f7199T.f7214f = null;
        }
        m161b(false);
    }

    /* renamed from: a */
    public void mo921a(RectF rectF) {
        if (rectF != null) {
            this.f7199T.f7214f = new RectF(rectF);
            this.f7199T.f7214f.f234a *= this.f7199T.f7212d;
            this.f7199T.f7214f.f236c *= this.f7199T.f7212d;
            this.f7199T.f7214f.f235b *= this.f7199T.f7213e;
            this.f7199T.f7214f.f237d *= this.f7199T.f7213e;
            this.f7199T.f7214f.m7196a(this.f7199T.f7209a, this.f7199T.f7210b);
        } else {
            this.f7199T.f7214f = null;
        }
        m161b(false);
    }

    /* renamed from: b */
    public void m161b(boolean z) {
        RectF rectF = this.f7199T.f7214f;
        if (f7164M == rectF && !z) {
            return;
        }
        m128x();
        if (rectF != null) {
            f7175W.glEnable(3089);
            f7175W.glScissor((int) rectF.f234a, (int) ((mo875n() * this.f7195L) - rectF.f237d), (int) rectF.m7190b(), (int) rectF.m7186c());
        } else {
            f7175W.glDisable(3089);
        }
        f7164M = rectF;
    }

    /* renamed from: b */
    public void mo895b(float f, float f2, float f3, Paint paint) {
        float f4 = f * this.f7199T.f7212d;
        float f5 = f2 * this.f7199T.f7213e;
        float f6 = f4 + this.f7199T.f7209a;
        float f7 = f5 + this.f7199T.f7210b;
        float f8 = f3 * this.f7199T.f7212d;
        m169b(paint);
        if (paint.m7234d() == Paint.Style.STROKE) {
            int i = 40;
            if (f8 > 100.0f) {
                i = 60;
            }
            m230a(f6, f7, f8, i);
            return;
        }
        this.f7153f.fillOval(f6 - f8, f7 - f8, f8 * 2.0f, f8 * 2.0f);
    }

    /* renamed from: a */
    public void mo931a(float f, float f2, float f3, Paint paint) {
        float f4 = this.f7199T.f7212d;
        if (f3 * f4 < 25.0f && paint.m7234d() == Paint.Style.STROKE) {
            C0924aa.m1088a(this, f, f2, f3, paint, f4);
        } else {
            mo895b(f, f2, f3, paint);
        }
    }

    /* renamed from: c */
    public FloatBuffer m158c(int i) {
        if (this.f7196N.capacity() < i) {
            this.f7196N = BufferUtils.createFloatBuffer(i);
        }
        return this.f7196N;
    }

    /* renamed from: a */
    public FloatBuffer m177a(float[] fArr, int i) {
        FloatBuffer m158c = m158c(i);
        m158c.clear();
        m158c.put(fArr, 0, i);
        m158c.flip();
        return m158c;
    }

    /* renamed from: d */
    public float[] m152d(int i) {
        if (this.f7197O.length < i) {
            this.f7197O = new float[i];
        }
        return this.f7197O;
    }

    /* renamed from: a */
    public void mo898a(float[] fArr, int i, int i2, Paint paint) {
        if (i2 == 0) {
            return;
        }
        boolean z = true;
        if (Main.f6965b) {
            z = false;
        }
        float m7226g = paint.m7226g();
        float f = 1.0f;
        float f2 = 0.0f;
        if (m7226g > 1.0f) {
            f = 1.0f + ((m7226g - 1.0f) * 0.5f);
            f2 = 0.0f + ((m7226g - 1.0f) * 0.5f);
        }
        float f3 = this.f7199T.f7212d;
        float f4 = this.f7199T.f7213e;
        float f5 = this.f7199T.f7209a;
        float f6 = this.f7199T.f7210b;
        if (z) {
            float[] m152d = m152d(i2 * 4);
            int i3 = i2 * 4;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5 += 8) {
                float f7 = fArr[i4];
                float f8 = fArr[i4 + 1];
                float f9 = f7 - f2;
                float f10 = f7 + f;
                float f11 = f8 - f2;
                float f12 = f8 + f;
                m152d[i5 + 0] = f9;
                m152d[i5 + 1] = f11;
                m152d[i5 + 2] = f10;
                m152d[i5 + 3] = f11;
                m152d[i5 + 4] = f10;
                m152d[i5 + 5] = f12;
                m152d[i5 + 6] = f9;
                m152d[i5 + 7] = f12;
                i4 += 2;
            }
            m160b(m152d, 0, i2 * 4, paint);
            return;
        }
        m169b(paint);
        TextureImpl.bindNone();
        f7175W.glBegin(7);
        int i6 = i + i2;
        for (int i7 = i; i7 < i6; i7 += 2) {
            float f13 = fArr[i7] * f3;
            float f14 = fArr[i7 + 1] * f4;
            float f15 = f13 + f5;
            float f16 = f14 + f6;
            float f17 = f15 - f2;
            float f18 = f15 + f;
            float f19 = f16 - f2;
            float f20 = f16 + f;
            f7175W.glVertex2f(f17, f19);
            f7175W.glVertex2f(f18, f19);
            f7175W.glVertex2f(f18, f20);
            f7175W.glVertex2f(f17, f20);
        }
        f7175W.glEnd();
    }

    /* renamed from: b */
    public void m160b(float[] fArr, int i, int i2, Paint paint) {
        boolean z = Main.f6964a;
        if (z) {
            GL11.glDisableClientState(32886);
        }
        m169b(paint);
        TextureImpl.bindNone();
        GL11.glEnableClientState(32884);
        GL11.glVertexPointer(2, 0, m177a(fArr, i2));
        GL11.glDrawArrays(7, i, i2 / 2);
        if (z) {
            GL11.glEnableClientState(32886);
        }
    }

    /* renamed from: a */
    public void m230a(float f, float f2, float f3, int i) {
        Graphics.setCurrent(this.f7153f);
        TextureImpl.bindNone();
        if (this.f7198P != i) {
            this.f7198P = i;
            this.f7165Q = 6.283185f / i;
            this.f7166R = (float) FastTrig.cos(this.f7165Q);
            this.f7167S = (float) FastTrig.sin(this.f7165Q);
        }
        float f4 = this.f7166R;
        float f5 = this.f7167S;
        float f6 = f3;
        float f7 = 0.0f;
        f7168X.start();
        int i2 = i + 1;
        float f8 = f6 + f;
        float f9 = 0.0f + f2;
        for (int i3 = 0; i3 < i2; i3++) {
            f7168X.vertex(f6 + f, f7 + f2);
            float f10 = f6;
            f6 = (f4 * f6) - (f5 * f7);
            f7 = (f5 * f10) + (f4 * f7);
        }
        f7168X.end();
    }

    /* renamed from: i */
    public void mo880i() {
        m127y();
    }

    /* renamed from: j */
    public void mo879j() {
        m126z();
    }

    /* renamed from: k */
    public void mo878k() {
        m127y();
    }

    /* renamed from: l */
    public void mo877l() {
        m126z();
    }

    /* renamed from: a */
    public void mo934a(float f, float f2, float f3) {
        this.f7199T.f7211c += f;
        this.f7199T.f7215g = f2;
        this.f7199T.f7216h = f3;
    }

    /* renamed from: a */
    public static void m228a(float f, PointF pointF) {
        float sin = CommonUtils.sin(f);
        float m2249i = CommonUtils.m2249i(f);
        float f2 = pointF.x;
        float f3 = pointF.y;
        pointF.x = (m2249i * f3) - (sin * f2);
        pointF.y = (sin * f3) + (m2249i * f2);
    }

    /* renamed from: a */
    public void mo935a(float f, float f2) {
        this.f7199T.f7212d *= f;
        this.f7199T.f7213e *= f2;
    }

    /* renamed from: a */
    public void mo933a(float f, float f2, float f3, float f4) {
        mo896b(f3, f4);
        mo935a(f, f2);
        mo896b(-f3, -f4);
    }

    /* renamed from: b */
    public void mo896b(float f, float f2) {
        this.f7199T.f7209a += f * this.f7199T.f7212d;
        this.f7199T.f7210b += f2 * this.f7199T.f7213e;
    }

    /* renamed from: a */
    public void mo905a(AbstractC0942m abstractC0942m) {
        abstractC0942m.mo1007a(this);
    }

    /* renamed from: a */
    public void mo932a(float f, float f2, float f3, float f4, Paint paint) {
        m169b(paint);
        float f5 = f * this.f7199T.f7212d;
        float f6 = f2 * this.f7199T.f7213e;
        float f7 = f5 + this.f7199T.f7209a;
        float f8 = f6 + this.f7199T.f7210b;
        float f9 = f3 * this.f7199T.f7212d;
        float f10 = f4 * this.f7199T.f7213e;
        this.f7153f.drawLine(f7, f8, f9 + this.f7199T.f7209a, f10 + this.f7199T.f7210b);
    }

    /* renamed from: a */
    public void mo924a(Paint paint) {
        m216a(paint, VariableScope.nullOrMissingString, false);
    }

    /* renamed from: a */
    public void mo918a(C0928ae c0928ae) {
        if (this.f7181a) {
            m156c(c0928ae);
            m131u();
            f7174m = null;
        }
    }

    /* renamed from: x */
    public void m128x() {
        this.f7153f.flushBuffer();
    }

    /* renamed from: p */
    public void mo873p() {
        this.f7153f.flushBuffer();
        this.f7188w = null;
        this.f7153f.flush();
    }

    /* renamed from: q */
    public void mo872q() {
        if (this.f7153f != null) {
            this.f7153f.destroy();
        }
        this.f7153f = null;
    }

    /* renamed from: a */
    public int mo901a(String str, Paint paint) {
        m217a(paint, str);
        int lineHeight = this.f7153f.getFont().getLineHeight();
        if (m129w()) {
            lineHeight = (int) (lineHeight / this.f7195L);
        }
        return lineHeight;
    }

    /* renamed from: b */
    public int mo888b(String str, Paint paint) {
        m217a(paint, str);
        int width = this.f7153f.getFont().getWidth(str);
        if (m129w()) {
            width = (int) (width / this.f7195L);
        }
        return width;
    }

    /* renamed from: r */
    public BitmapOrTexture mo871r() {
        return f7158r;
    }

    /* renamed from: a */
    public void mo907a(BitmapOrTexture bitmapOrTexture, File file) {
        C1189s m148e = m148e(bitmapOrTexture);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            ImageOut.write(m148e.mo418C(), "png", bufferedOutputStream);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SlickException e2) {
            throw new RuntimeException((Throwable) e2);
        }
    }

    /* renamed from: a */
    public void mo900a(Lock lock) {
    }

    /* renamed from: b */
    public void mo887b(Lock lock) {
    }

    /* renamed from: y */
    public void m127y() {
        C1175g c1175g;
        this.f7200U.add(this.f7199T);
        if (this.f7201V.f6888a == 0) {
            c1175g = new C1175g();
        } else {
            c1175g = (C1175g) this.f7201V.m552c();
        }
        this.f7199T.m122a(c1175g);
        this.f7199T = c1175g;
    }

    /* renamed from: z */
    public void m126z() {
        if (this.f7200U.size() == 0) {
            throw new RuntimeException("tranform stack is empty");
        }
        this.f7201V.add(this.f7199T);
        this.f7199T = (C1175g) this.f7200U.m552c();
        m161b(false);
    }
}
