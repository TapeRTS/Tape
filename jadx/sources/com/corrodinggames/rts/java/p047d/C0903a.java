package com.corrodinggames.rts.java.p047d;

import android.graphics.Rect;
import android.graphics.RectF;
import com.LibRocket;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.EnumC0805u;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

/* renamed from: com.corrodinggames.rts.java.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d/a.class */
public class C0903a extends AbstractC0048b {

    /* renamed from: j */
    private static SGL f6020j = Renderer.get();

    /* renamed from: i */
    Graphics f6021i;

    @Override // com.corrodinggames.librocket.AbstractC0048b
    /* renamed from: a */
    public void mo205a() {
        throw new RuntimeException("startNewFrame() not supported on SlickLibRocket");
    }

    /* renamed from: a */
    public void m204a(Graphics graphics) {
        this.f6021i = graphics;
        super.mo205a();
    }

    @Override // com.LibRocket
    public boolean GenerateTexture(int i, byte[] bArr) {
        try {
            C0904b bVar = (C0904b) findTextureHolder(i);
            ImageBuffer imageBuffer = new ImageBuffer(bVar.width, bVar.height);
            byte[] rgba = imageBuffer.getRGBA();
            for (int i2 = 0; i2 < bArr.length; i2++) {
                rgba[i2] = bArr[i2];
            }
            bVar.f6022h = new Image(imageBuffer);
            if (bVar.f6022h != null) {
                return true;
            }
            throw new RuntimeException("slickTextureHolder.image==null");
        } catch (OutOfMemoryError e) {
            AbstractC0789l.m721a(EnumC0805u.uiImage, e);
            return false;
        } catch (Throwable th) {
            ScriptEngine.throwDelayedException("GenerateTexture Failed", th);
            return true;
        }
    }

    @Override // com.LibRocket
    public void RenderGeometryPossiblyCompiled(float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int i, float f, float f2, LibRocket.CompiledGeometry compiledGeometry) {
        try {
            if (this.debug) {
                System.out.println("SlickLibRocket:RenderGeometry(" + fArr.length + "," + i + ")");
                System.out.println("indices.length=" + iArr2.length + "");
            }
            C0904b bVar = null;
            if (i != 0) {
                bVar = (C0904b) findTextureHolder(i);
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
                        if (rectF.m4124a()) {
                            rectF.m4122a(f3, f4, f3 + 1.0f, f4 + 1.0f);
                        } else {
                            rectF.m4112c(f3, f4);
                        }
                    }
                }
                rectF.m4108g();
                if (compiledGeometry != null) {
                    compiledGeometry.bbox = rectF;
                }
            }
            RectF rectF2 = new RectF(rectF);
            rectF2.m4123a(f, f2);
            if (this.f359g && !C0654f.m1502a(rectF2, this.f358f)) {
                boolean z = true;
                if (bVar != null && bVar.f6022h == null && bVar.f364b && bVar.f368f == null) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            if (!(bVar == null || bVar.f6024j == null)) {
                System.out.println("Loading image for: " + bVar.index);
                bVar.f6022h = new Image(bVar.f6024j);
                if (bVar.f6022h == null) {
                    throw new RuntimeException("slickTextureHolder.image==null");
                }
                bVar.f6024j = null;
            }
            this.f6021i.pushTransform();
            this.f6021i.setDrawMode(Graphics.MODE_NORMAL);
            this.f6021i.translate(f, f2);
            float f5 = 1.0f;
            float f6 = 1.0f;
            boolean z2 = false;
            float f7 = 1.0f;
            boolean z3 = false;
            if (bVar != null) {
                z2 = bVar.f366d;
                f7 = bVar.f367e;
                TextureImpl.getLastBind();
                if (bVar.f6022h == null && bVar.f364b) {
                    if (bVar.f368f != null) {
                        float f8 = (((AbstractC0789l.m638u().f5501bj / 1000.0f) / 10.0f) * 360.0f) % 360.0f;
                        this.f6021i.translate(-f, -f2);
                        AbstractC0789l.m638u().f5514bw.mo182a(new Rect(this.f357e.f227a, this.f357e.f228b, this.f357e.f229c, this.f357e.f230d));
                        AbstractC0171m n = AbstractC0171m.m3436n(0);
                        if (n == null) {
                            n = AbstractC0171m.f1236g;
                        }
                        EnumC0215ak.m3276a(bVar.f368f, rectF2.m4111d(), rectF2.m4110e(), f8, 3.0f, n, rectF2.m4113c() * 0.6f, rectF2.m4113c(), false, false, 1);
                        f7 = 0.0f;
                    } else if (this.f356d < 1) {
                        bVar.mo203a();
                        this.f356d++;
                    }
                }
                if (bVar.f6022h != null) {
                    bVar.f6022h.getTexture().bind();
                    f5 = bVar.f6022h.getTextureWidth();
                    f6 = bVar.f6022h.getTextureHeight();
                    z3 = true;
                } else if (bVar.f364b) {
                    f7 = 0.1f;
                }
            }
            if (!z3) {
                TextureImpl.bindNone();
            }
            Color color = new Color(1.0f, 1.0f, 1.0f, f7);
            this.f6021i.setColor(color);
            f6020j.glBegin(4);
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
                    f6020j.glTexCoord2f(fArr2[(i10 * 2) + 0] * f5, fArr2[(i10 * 2) + 1] * f6);
                    f6020j.glVertex2f(fArr[(i10 * 2) + 0], fArr[(i10 * 2) + 1]);
                }
            }
            f6020j.glEnd();
            this.f6021i.popTransform();
        } catch (Throwable th) {
            ScriptEngine.throwDelayedException("UI Render Failed", th);
        }
    }

    @Override // com.LibRocket
    public LibRocket.TextureHolder getFromTextureHolderFactory() {
        return new C0904b(this);
    }

    @Override // com.corrodinggames.librocket.AbstractC0048b, com.LibRocket
    public void EnableScissorRegion(boolean z) {
        if (z) {
            this.f6021i.setWorldClip(this.f357e.f227a, this.f357e.f228b, this.f357e.m4134b(), this.f357e.m4130c());
            this.f359g = true;
            return;
        }
        this.f6021i.clearWorldClip();
        this.f359g = false;
    }
}
