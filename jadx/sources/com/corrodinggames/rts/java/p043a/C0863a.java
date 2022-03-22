package com.corrodinggames.rts.java.p043a;

import java.nio.ByteBuffer;
import org.newdawn.slick.opengl.ImageData;

/* renamed from: com.corrodinggames.rts.java.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/a/a.class */
public class C0863a implements ImageData {

    /* renamed from: a */
    ImageData f5883a;

    /* renamed from: b */
    ByteBuffer f5884b;

    public C0863a(ImageData imageData, ByteBuffer byteBuffer) {
        this.f5883a = imageData;
        this.f5884b = byteBuffer;
    }

    public int getDepth() {
        return this.f5883a.getDepth();
    }

    public int getHeight() {
        return this.f5883a.getHeight();
    }

    public ByteBuffer getImageBufferData() {
        return this.f5884b;
    }

    public int getTexHeight() {
        return this.f5883a.getTexHeight();
    }

    public int getTexWidth() {
        return this.f5883a.getTexWidth();
    }

    public int getWidth() {
        return this.f5883a.getWidth();
    }
}
