package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.corrodinggames.rts.gameFramework.b.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/aa.class */
public class C0680aa {

    /* renamed from: a */
    public final FloatBuffer f4307a;

    /* renamed from: b */
    public final ShortBuffer f4308b;

    /* renamed from: c */
    public int f4309c;

    /* renamed from: d */
    public int f4310d;

    /* renamed from: e */
    int[] f4311e;

    /* renamed from: f */
    int f4312f;

    /* renamed from: g */
    final /* synthetic */ C0714y f4313g;

    /* renamed from: a */
    public void m2831a(float[] fArr, int i, int i2) {
        this.f4307a.clear();
        int i3 = i + i2;
        this.f4307a.put(fArr, 0, i2);
        this.f4307a.flip();
        this.f4310d = i2;
    }

    /* renamed from: a */
    public void m2833a() {
        GLES20.glEnableVertexAttribArray(this.f4313g.f4453j.f4462a.f4432a);
        GLES20.glEnableVertexAttribArray(this.f4313g.f4453j.f4463b.f4432a);
        GLES20.glEnableVertexAttribArray(this.f4313g.f4453j.f4464c.f4432a);
    }

    /* renamed from: b */
    public void m2830b() {
        C0703n.m2689o();
        if (this.f4311e == null) {
            this.f4311e = new int[1];
            GLES20.glGenBuffers(1, this.f4311e, 0);
            C0703n.m2688p();
        }
        this.f4312f++;
        if (this.f4312f >= 1) {
            this.f4312f = 0;
        }
        GLES20.glBindBuffer(34962, this.f4311e[this.f4312f]);
        GLES20.glBufferData(34962, this.f4310d * 4, this.f4307a, 35040);
        GLES20.glVertexAttribPointer(this.f4313g.f4453j.f4462a.f4432a, 2, 5126, false, 32, 0);
        C0703n.m2689o();
        GLES20.glVertexAttribPointer(this.f4313g.f4453j.f4463b.f4432a, 2, 5126, false, 32, 8);
        C0703n.m2689o();
        GLES20.glVertexAttribPointer(this.f4313g.f4453j.f4464c.f4432a, 4, 5126, false, 32, 16);
        C0703n.m2689o();
    }

    /* renamed from: a */
    public void m2832a(int i, int i2, int i3) {
        if (this.f4308b != null) {
            GLES20.glDrawElements(i, i3, 5123, 0);
        } else {
            GLES20.glDrawArrays(i, i2, i3);
        }
    }

    /* renamed from: c */
    public void m2829c() {
        GLES20.glBindBuffer(34962, 0);
    }

    /* renamed from: d */
    public void m2828d() {
        GLES20.glBindBuffer(34963, this.f4309c);
        m2833a();
    }

    /* renamed from: e */
    public void m2827e() {
        GLES20.glDisableVertexAttribArray(this.f4313g.f4453j.f4463b.f4432a);
        GLES20.glDisableVertexAttribArray(this.f4313g.f4453j.f4464c.f4432a);
        GLES20.glBindBuffer(34963, 0);
    }
}
