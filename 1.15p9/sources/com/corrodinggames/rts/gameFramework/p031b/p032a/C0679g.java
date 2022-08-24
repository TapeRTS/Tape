package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/g.class */
public class C0679g {

    /* renamed from: a */
    public final int f4297a = 2;

    /* renamed from: b */
    public final int f4298b = this.f4297a + 2;

    /* renamed from: c */
    public final int f4299c = this.f4298b * 4;

    /* renamed from: d */
    public final IntBuffer f4300d;

    /* renamed from: e */
    public final ShortBuffer f4301e;

    /* renamed from: f */
    public int f4302f;

    /* renamed from: g */
    public int f4303g;

    /* renamed from: h */
    final int[] f4304h;

    /* renamed from: i */
    private int f4305i;

    /* renamed from: j */
    private int f4306j;

    public C0679g(int i, int i2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * this.f4299c);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f4300d = allocateDirect.asIntBuffer();
        if (i2 > 0) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i2 * 2);
            allocateDirect2.order(ByteOrder.nativeOrder());
            this.f4301e = allocateDirect2.asShortBuffer();
        } else {
            this.f4301e = null;
        }
        this.f4302f = 0;
        this.f4303g = 0;
        this.f4304h = new int[(i * this.f4299c) / 4];
        this.f4305i = EnumC0671a.A_TexCoordinate.m2874a();
        this.f4306j = EnumC0671a.A_Position.m2874a();
    }

    /* renamed from: a */
    public void m2836a(float[] fArr, int i, int i2) {
        this.f4300d.clear();
        int i3 = i + i2;
        int i4 = i;
        int i5 = 0;
        while (i4 < i3) {
            this.f4304h[i5] = Float.floatToRawIntBits(fArr[i4]);
            i4++;
            i5++;
        }
        this.f4300d.put(this.f4304h, 0, i2);
        this.f4300d.flip();
        this.f4302f = i2 / this.f4298b;
    }

    /* renamed from: a */
    public void m2835a(short[] sArr, int i, int i2) {
        this.f4301e.clear();
        this.f4301e.put(sArr, i, i2);
        this.f4301e.flip();
        this.f4303g = i2;
    }

    /* renamed from: a */
    public void m2838a() {
        this.f4300d.position(0);
        GLES20.glVertexAttribPointer(this.f4306j, this.f4297a, 5126, false, this.f4299c, (Buffer) this.f4300d);
        GLES20.glEnableVertexAttribArray(this.f4306j);
        this.f4300d.position(this.f4297a);
        GLES20.glVertexAttribPointer(this.f4305i, 2, 5126, false, this.f4299c, (Buffer) this.f4300d);
        GLES20.glEnableVertexAttribArray(this.f4305i);
    }

    /* renamed from: a */
    public void m2837a(int i, int i2, int i3) {
        if (this.f4301e != null) {
            this.f4301e.position(i2);
            GLES20.glDrawElements(i, i3, 5123, this.f4301e);
            return;
        }
        GLES20.glDrawArrays(i, i2, i3);
    }

    /* renamed from: b */
    public void m2834b() {
        GLES20.glDisableVertexAttribArray(this.f4305i);
    }
}
