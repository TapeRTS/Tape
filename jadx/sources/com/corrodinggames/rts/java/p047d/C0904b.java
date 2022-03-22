package com.corrodinggames.rts.java.p047d;

import com.corrodinggames.librocket.AbstractC0049c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.EnumC0805u;
import com.corrodinggames.rts.gameFramework.utility.C0812ae;
import com.corrodinggames.rts.java.C0905e;
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
public class C0904b extends AbstractC0049c {

    /* renamed from: h */
    Image f6022h;

    /* renamed from: i */
    boolean f6023i;

    /* renamed from: j */
    ImageBuffer f6024j;

    /* renamed from: k */
    final /* synthetic */ C0903a f6025k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904b(C0903a aVar) {
        super(aVar);
        this.f6025k = aVar;
    }

    @Override // com.corrodinggames.librocket.AbstractC0049c
    /* renamed from: a */
    public boolean mo203a() {
        InputStream inputStream;
        if (C0812ae.m544c(this.f363a)) {
            inputStream = C0812ae.m545b(this.f363a, true);
            if (inputStream == null) {
                AbstractC0789l.m663f("Failed to open zipped file: " + this.f363a);
                return false;
            }
        } else {
            try {
                inputStream = new FileInputStream(this.f363a);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            PNGImageData pNGImageData = new PNGImageData();
            pNGImageData.loadImage(bufferedInputStream);
            bufferedInputStream.close();
            this.f6022h = new Image(pNGImageData);
        } catch (IOException e2) {
            AbstractC0789l.m714a("Exception loading image: " + this.f363a, (Throwable) e2);
            this.f6022h = C0905e.f6038l.mo40z();
            this.f6023i = true;
        } catch (OutOfMemoryError e3) {
            AbstractC0789l.m721a(EnumC0805u.uiImage, e3);
            this.f6022h = C0905e.f6037k.mo40z();
            this.f6023i = true;
        }
        this.width = this.f6022h.getWidth();
        this.height = this.f6022h.getHeight();
        if (!this.f365c) {
            return true;
        }
        if (this.width <= 500 && this.height <= 500) {
            return true;
        }
        AbstractC0789l.m670d("Map thumbnail is too large. Size:(" + this.width + "," + this.height + ") (max:500 pixels)");
        this.f6022h = C0905e.f6039m.mo40z();
        this.f6023i = true;
        this.width = this.f6022h.getWidth();
        this.height = this.f6022h.getHeight();
        return true;
    }

    @Override // com.LibRocket.TextureHolder
    public void remove() {
        if (this.f6022h != null && !this.f6023i) {
            try {
                this.f6022h.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
        this.f363a = null;
        this.f6024j = null;
        this.f6022h = null;
        this.f6023i = false;
    }
}
