package com.corrodinggames.rts.gameFramework.p039j;

import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

/* renamed from: com.corrodinggames.rts.gameFramework.j.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/o.class */
class C0758o {

    /* renamed from: b */
    private FloatBuffer f5288b;

    /* renamed from: c */
    private FloatBuffer f5289c;

    /* renamed from: d */
    private FloatBuffer f5290d;

    /* renamed from: e */
    private IntBuffer f5291e;

    /* renamed from: f */
    private IntBuffer f5292f;

    /* renamed from: g */
    private IntBuffer f5293g;

    /* renamed from: h */
    private CharBuffer f5294h;

    /* renamed from: i */
    private Buffer f5295i;

    /* renamed from: j */
    private Buffer f5296j;

    /* renamed from: k */
    private Buffer f5297k;

    /* renamed from: l */
    private int f5298l;

    /* renamed from: m */
    private int f5299m;

    /* renamed from: n */
    private int f5300n;

    /* renamed from: o */
    private int f5301o;

    /* renamed from: p */
    private boolean f5302p;

    /* renamed from: q */
    private int f5303q;

    /* renamed from: r */
    private int f5304r;

    /* renamed from: s */
    private int f5305s;

    /* renamed from: t */
    private int f5306t;

    /* renamed from: a */
    static final /* synthetic */ boolean f5307a;

    static {
        f5307a = !C0758o.class.desiredAssertionStatus();
    }

    /* renamed from: a */
    void m842a(int i, int i2, float f, float f2) {
        if (i < 0 || i >= this.f5299m) {
            throw new IllegalArgumentException("i");
        } else if (i2 < 0 || i2 >= this.f5300n) {
            throw new IllegalArgumentException("j");
        } else {
            int i3 = ((this.f5299m * i2) + i) * 2;
            if (this.f5298l == 5126) {
                this.f5289c.put(i3, f);
                this.f5289c.put(i3 + 1, f2);
                return;
            }
            this.f5292f.put(i3, (int) (f * 65536.0f));
            this.f5292f.put(i3 + 1, (int) (f2 * 65536.0f));
        }
    }

    /* renamed from: a */
    void m841a(int i, int i2, float f, float f2, float f3, float f4, float f5, float[] fArr) {
        if (i < 0 || i >= this.f5299m) {
            throw new IllegalArgumentException("i");
        } else if (i2 < 0 || i2 >= this.f5300n) {
            throw new IllegalArgumentException("j");
        } else {
            int i3 = (this.f5299m * i2) + i;
            int i4 = i3 * 3;
            int i5 = i3 * 2;
            int i6 = i3 * 4;
            if (this.f5298l == 5126) {
                this.f5288b.put(i4, f);
                this.f5288b.put(i4 + 1, f2);
                this.f5288b.put(i4 + 2, f3);
                this.f5289c.put(i5, f4);
                this.f5289c.put(i5 + 1, f5);
                if (fArr != null) {
                    this.f5290d.put(i6, fArr[0]);
                    this.f5290d.put(i6 + 1, fArr[1]);
                    this.f5290d.put(i6 + 2, fArr[2]);
                    this.f5290d.put(i6 + 3, fArr[3]);
                    return;
                }
                return;
            }
            this.f5291e.put(i4, (int) (f * 65536.0f));
            this.f5291e.put(i4 + 1, (int) (f2 * 65536.0f));
            this.f5291e.put(i4 + 2, (int) (f3 * 65536.0f));
            this.f5292f.put(i5, (int) (f4 * 65536.0f));
            this.f5292f.put(i5 + 1, (int) (f5 * 65536.0f));
            if (fArr != null) {
                this.f5293g.put(i6, (int) (fArr[0] * 65536.0f));
                this.f5293g.put(i6 + 1, (int) (fArr[1] * 65536.0f));
                this.f5293g.put(i6 + 2, (int) (fArr[2] * 65536.0f));
                this.f5293g.put(i6 + 3, (int) (fArr[3] * 65536.0f));
            }
        }
    }

    /* renamed from: a */
    public static void m839a(GL10 gl10, boolean z, boolean z2) {
        gl10.glEnableClientState(32884);
        if (z) {
            gl10.glEnableClientState(32888);
            gl10.glEnable(3553);
        } else {
            gl10.glDisableClientState(32888);
            gl10.glDisable(3553);
        }
        if (z2) {
            gl10.glEnableClientState(32886);
        } else {
            gl10.glDisableClientState(32886);
        }
    }

    /* renamed from: b */
    public void m838b(GL10 gl10, boolean z, boolean z2) {
        if (!this.f5302p) {
            gl10.glVertexPointer(3, this.f5298l, 0, this.f5295i);
            if (z) {
                gl10.glTexCoordPointer(2, this.f5298l, 0, this.f5296j);
            }
            if (z2) {
                gl10.glColorPointer(4, this.f5298l, 0, this.f5297k);
            }
            gl10.glDrawElements(4, this.f5301o, 5123, this.f5294h);
            return;
        }
        GL11 gl11 = (GL11) gl10;
        gl11.glBindBuffer(34962, this.f5303q);
        gl11.glVertexPointer(3, this.f5298l, 0, 0);
        if (z) {
            gl11.glBindBuffer(34962, this.f5305s);
            gl11.glTexCoordPointer(2, this.f5298l, 0, 0);
        }
        if (z2) {
            gl11.glBindBuffer(34962, this.f5306t);
            gl11.glColorPointer(4, this.f5298l, 0, 0);
        }
        gl11.glBindBuffer(34963, this.f5304r);
        gl11.glDrawElements(4, this.f5301o, 5123, 0);
        gl11.glBindBuffer(34962, 0);
        gl11.glBindBuffer(34963, 0);
    }

    /* renamed from: a */
    public static void m840a(GL10 gl10) {
        gl10.glDisableClientState(32884);
    }
}
