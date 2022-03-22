package com.corrodinggames.rts.java;

import java.nio.ByteBuffer;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.util.MiscUtils;

/* renamed from: com.corrodinggames.rts.java.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/s.class */
public class C0921s implements ImageData {

    /* renamed from: a */
    int f6119a;

    /* renamed from: c */
    private int f6120c;

    /* renamed from: d */
    private int f6121d;

    /* renamed from: e */
    private int f6122e;

    /* renamed from: f */
    private int f6123f;

    /* renamed from: g */
    private byte[] f6124g;

    /* renamed from: b */
    final /* synthetic */ C0920r f6125b;

    public C0921s(C0920r rVar, Image image) {
        this.f6125b = rVar;
        Texture texture = image.getTexture();
        this.f6124g = texture.getTextureData();
        this.f6119a = texture.hasAlpha() ? 32 : 24;
        this.f6120c = texture.getImageWidth();
        this.f6121d = texture.getImageHeight();
        this.f6122e = texture.getTextureWidth();
        this.f6123f = texture.getTextureHeight();
    }

    public int getDepth() {
        return this.f6119a;
    }

    public int getWidth() {
        return this.f6120c;
    }

    public int getHeight() {
        return this.f6121d;
    }

    public int getTexWidth() {
        return this.f6122e;
    }

    public int getTexHeight() {
        return this.f6123f;
    }

    public ByteBuffer getImageBufferData() {
        ByteBuffer createByteBuffer = MiscUtils.createByteBuffer(this.f6124g.length);
        createByteBuffer.put(this.f6124g);
        createByteBuffer.flip();
        return createByteBuffer;
    }

    /* renamed from: a */
    public byte[] m39a() {
        return this.f6124g;
    }
}
