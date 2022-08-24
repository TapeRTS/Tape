package com.corrodinggames.rts.java.p053d;

import android.graphics.Rect;
import android.graphics.RectF;
import com.LibRocket;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

/* renamed from: com.corrodinggames.rts.java.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d/a.class */
public class C1171a extends AbstractC0048b {

    /* renamed from: j */
    private static SGL f7146j = Renderer.get();

    /* renamed from: i */
    Graphics f7147i;

    /* renamed from: a */
    public void m239a() {
        throw new RuntimeException("startNewFrame() not supported on SlickLibRocket");
    }

    /* renamed from: a */
    public void m238a(Graphics graphics) {
        this.f7147i = graphics;
        super.m7064a();
    }

    public boolean GenerateTexture(int i, byte[] bArr) {
        try {
            C1172b c1172b = (C1172b) findTextureHolder(i);
            ImageBuffer imageBuffer = new ImageBuffer(c1172b.width, c1172b.height);
            byte[] rgba = imageBuffer.getRGBA();
            for (int i2 = 0; i2 < bArr.length; i2++) {
                rgba[i2] = bArr[i2];
            }
            c1172b.f7148h = new Image(imageBuffer);
            if (c1172b.f7148h == null) {
                throw new RuntimeException("slickTextureHolder.image==null");
            }
            return true;
        } catch (OutOfMemoryError e) {
            GameEngine.m1195a(EnumC1065u.f6745g, e);
            return false;
        } catch (Throwable th) {
            ScriptEngine.throwDelayedException("GenerateTexture Failed", th);
            return true;
        }
    }

    public void RenderGeometryPossiblyCompiled(float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int i, float f, float f2, LibRocket.CompiledGeometry compiledGeometry) {
        try {
            if (this.debug) {
                System.out.println("SlickLibRocket:RenderGeometry(" + fArr.length + "," + i + ")");
                System.out.println("indices.length=" + iArr2.length + VariableScope.nullOrMissingString);
            }
            C1172b c1172b = null;
            if (i != 0) {
                c1172b = (C1172b) findTextureHolder(i);
            }
            RectF rectF = null;
            if (compiledGeometry != null) {
                rectF = (RectF) compiledGeometry.bbox;
            }
            if (rectF == null) {
                rectF = new RectF();
                for (int i2 = 0; i2 < iArr2.length; i2 += 3) {
                    int i3 = iArr2[i2];
                    for (int i4 = 0; i4 <= 2; i4++) {
                        int i5 = iArr2[i2 + i4];
                        float f3 = fArr[(i5 * 2) + 0];
                        float f4 = fArr[(i5 * 2) + 1];
                        if (rectF.m7197a()) {
                            rectF.m7195a(f3, f4, f3 + 1.0f, f4 + 1.0f);
                        } else {
                            rectF.m7185c(f3, f4);
                        }
                    }
                }
                rectF.m7181g();
                if (compiledGeometry != null) {
                    compiledGeometry.bbox = rectF;
                }
            }
            RectF rectF2 = new RectF(rectF);
            rectF2.m7196a(f, f2);
            if (this.f363g && !CommonUtils.m2348a(rectF2, this.f362f)) {
                boolean z = true;
                if (c1172b != null && c1172b.f7148h == null && c1172b.f367b && c1172b.f371f == null) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            if (c1172b != null && c1172b.f7150j != null) {
                System.out.println("Loading image for: " + c1172b.index);
                c1172b.f7148h = new Image(c1172b.f7150j);
                if (c1172b.f7148h == null) {
                    throw new RuntimeException("slickTextureHolder.image==null");
                }
                c1172b.f7150j = null;
            }
            this.f7147i.pushTransform();
            this.f7147i.setDrawMode(Graphics.MODE_NORMAL);
            this.f7147i.translate(f, f2);
            float f5 = 1.0f;
            float f6 = 1.0f;
            boolean z2 = false;
            float f7 = 1.0f;
            boolean z3 = false;
            if (c1172b != null) {
                z2 = c1172b.f369d;
                f7 = c1172b.f370e;
                TextureImpl.getLastBind();
                if (c1172b.f7148h == null && c1172b.f367b) {
                    if (c1172b.f371f != null) {
                        InterfaceC1027y interfaceC1027y = GameEngine.getInstance().graphics;
                        this.f7147i.pushTransform();
                        interfaceC1027y.mo880i();
                        float f8 = (((GameEngine.getInstance().f6098bA / 1000.0f) / 10.0f) * 360.0f) % 360.0f;
                        this.f7147i.translate(-f, -f2);
                        Rect rect = new Rect(this.f361e.f230a, this.f361e.f231b, this.f361e.f232c, this.f361e.f233d);
                        this.f7147i.setClip((Rectangle) null);
                        this.f7147i.setWorldClip((Rectangle) null);
                        interfaceC1027y.mo923a(rect);
                        Team m6317k = Team.m6317k(0);
                        if (m6317k == null) {
                            m6317k = Team.f1370i;
                        }
                        UnitType.m5737a(c1172b.f371f, rectF2.m7184d(), rectF2.m7183e(), f8, 3.0f, m6317k, rectF2.m7186c() * 0.6f, rectF2.m7186c(), false, false, 1, null);
                        interfaceC1027y.mo873p();
                        f7 = 0.0f;
                        interfaceC1027y.mo879j();
                        this.f7147i.popTransform();
                    } else if (this.f360d < 1) {
                        c1172b.mo7036a();
                        this.f360d++;
                    }
                }
                if (c1172b.f7148h != null) {
                    c1172b.f7148h.getTexture().bind();
                    f5 = c1172b.f7148h.getTextureWidth();
                    f6 = c1172b.f7148h.getTextureHeight();
                    z3 = true;
                } else if (c1172b.f367b) {
                    f7 = 0.1f;
                }
            }
            if (!z3) {
                TextureImpl.bindNone();
            }
            Color color = new Color(1.0f, 1.0f, 1.0f, f7);
            this.f7147i.setColor(color);
            f7146j.glBegin(4);
            for (int i6 = 0; i6 < iArr2.length; i6 += 3) {
                int i7 = iArr2[i6];
                if (!z2) {
                    int i8 = iArr[i7];
                    color.r = ((i8 >> 24) & 255) / 255.0f;
                    color.g = ((i8 >> 16) & 255) / 255.0f;
                    color.b = ((i8 >> 8) & 255) / 255.0f;
                    color.a = (i8 & 255) / 255.0f;
                    color.a *= f7;
                    color.bind();
                }
                for (int i9 = 0; i9 <= 2; i9++) {
                    int i10 = iArr2[i6 + i9];
                    f7146j.glTexCoord2f(fArr2[(i10 * 2) + 0] * f5, fArr2[(i10 * 2) + 1] * f6);
                    f7146j.glVertex2f(fArr[(i10 * 2) + 0], fArr[(i10 * 2) + 1]);
                }
            }
            f7146j.glEnd();
            this.f7147i.popTransform();
        } catch (Throwable th) {
            ScriptEngine.throwDelayedException("UI Render Failed", th);
        }
    }

    public LibRocket.TextureHolder getFromTextureHolderFactory() {
        return new C1172b(this);
    }

    public void EnableScissorRegion(boolean z) {
        if (z) {
            this.f7147i.setWorldClip(this.f361e.f230a, this.f361e.f231b, this.f361e.m7206b(), this.f361e.m7202c());
            this.f363g = true;
            return;
        }
        this.f7147i.clearWorldClip();
        this.f363g = false;
    }
}
