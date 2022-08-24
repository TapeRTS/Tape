package com.corrodinggames.rts.java.p053d;

import com.corrodinggames.librocket.AbstractC0049c;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1076af;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import com.corrodinggames.rts.java.C1173e;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.PNGImageData;

/* renamed from: com.corrodinggames.rts.java.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d/b.class */
public class C1172b extends AbstractC0049c {

    /* renamed from: h */
    Image f7148h;

    /* renamed from: i */
    boolean f7149i;

    /* renamed from: j */
    ImageBuffer f7150j;

    /* renamed from: k */
    final /* synthetic */ C1171a f7151k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172b(C1171a c1171a) {
        super(c1171a);
        this.f7151k = c1171a;
    }

    /* renamed from: a */
    public boolean mo6275a() {
        InputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        AbstractC1076af m639a = C1075ae.m639a(this.f366a);
        if (m639a != null) {
            fileInputStream = m639a.mo630b(this.f366a, true);
            if (fileInputStream == null) {
                GameEngine.m1114g("Failed to open zipped file: " + this.f366a);
                return false;
            }
        } else {
            try {
                fileInputStream = new FileInputStream(this.f366a);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            bufferedInputStream = new BufferedInputStream(fileInputStream);
        } catch (IOException e2) {
            GameEngine.m1182a("Exception loading image: " + this.f366a, (Throwable) e2);
            this.f7148h = C1173e.f7159s.mo412C();
            this.f7149i = true;
        } catch (OutOfMemoryError e3) {
            GameEngine.m1189a(EnumC1065u.uiImage, e3);
            this.f7148h = C1173e.f7158r.mo412C();
            this.f7149i = true;
        } catch (UnsupportedOperationException e4) {
            e4.printStackTrace();
            GameEngine.m1182a("Exception loading image: " + this.f366a, (Throwable) e4);
            this.f7148h = C1173e.f7159s.mo412C();
            this.f7149i = true;
        }
        try {
            PNGImageData pNGImageData = new PNGImageData();
            pNGImageData.loadImage(bufferedInputStream);
            bufferedInputStream.close();
            this.f7148h = new Image(pNGImageData);
            this.width = this.f7148h.getWidth();
            this.height = this.f7148h.getHeight();
            if (this.f368c) {
                if (this.width > 500 || this.height > 500) {
                    GameEngine.PrintLog("Map thumbnail is too large. Size:(" + this.width + "," + this.height + ") (max:500 pixels)");
                    this.f7148h = C1173e.f7160t.mo412C();
                    this.f7149i = true;
                    this.width = this.f7148h.getWidth();
                    this.height = this.f7148h.getHeight();
                    return true;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public void remove() {
        if (this.f7148h != null && !this.f7149i) {
            try {
                this.f7148h.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
        this.f366a = null;
        this.f7150j = null;
        this.f7148h = null;
        this.f7149i = false;
    }
}
