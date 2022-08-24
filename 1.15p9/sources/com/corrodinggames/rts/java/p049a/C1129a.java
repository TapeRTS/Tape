package com.corrodinggames.rts.java.p049a;

import java.nio.ByteBuffer;
import org.newdawn.slick.opengl.ImageData;

/* renamed from: com.corrodinggames.rts.java.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/a/a.class */
public class C1129a implements ImageData {

    /* renamed from: a */
    ImageData f6995a;

    /* renamed from: b */
    ByteBuffer f6996b;

    public C1129a(ImageData imageData, ByteBuffer byteBuffer) {
        this.f6995a = imageData;
        this.f6996b = byteBuffer;
    }

    public int getDepth() {
        return this.f6995a.getDepth();
    }

    public int getHeight() {
        return this.f6995a.getHeight();
    }

    public ByteBuffer getImageBufferData() {
        return this.f6996b;
    }

    public int getTexHeight() {
        return this.f6995a.getTexHeight();
    }

    public int getTexWidth() {
        return this.f6995a.getTexWidth();
    }

    public int getWidth() {
        return this.f6995a.getWidth();
    }
}
