package com.corrodinggames.rts.java;

import java.nio.ByteBuffer;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.util.MiscUtils;

/* renamed from: com.corrodinggames.rts.java.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/t.class */
public class C1190t implements ImageData {

    /* renamed from: a */
    int f7264a;

    /* renamed from: c */
    private int f7265c;

    /* renamed from: d */
    private int f7266d;

    /* renamed from: e */
    private int f7267e;

    /* renamed from: f */
    private int f7268f;

    /* renamed from: g */
    private byte[] f7269g;

    /* renamed from: b */
    final /* synthetic */ C1189s f7270b;

    public C1190t(C1189s c1189s, Image image) {
        this.f7270b = c1189s;
        Texture texture = image.getTexture();
        this.f7269g = texture.getTextureData();
        this.f7264a = texture.hasAlpha() ? 32 : 24;
        this.f7265c = texture.getImageWidth();
        this.f7266d = texture.getImageHeight();
        this.f7267e = texture.getTextureWidth();
        this.f7268f = texture.getTextureHeight();
    }

    public int getDepth() {
        return this.f7264a;
    }

    public int getWidth() {
        return this.f7265c;
    }

    public int getHeight() {
        return this.f7266d;
    }

    public int getTexWidth() {
        return this.f7267e;
    }

    public int getTexHeight() {
        return this.f7268f;
    }

    public ByteBuffer getImageBufferData() {
        ByteBuffer createByteBuffer = MiscUtils.createByteBuffer(this.f7269g.length);
        createByteBuffer.put(this.f7269g);
        createByteBuffer.flip();
        return createByteBuffer;
    }

    /* renamed from: a */
    public byte[] m41a() {
        return this.f7269g;
    }
}
