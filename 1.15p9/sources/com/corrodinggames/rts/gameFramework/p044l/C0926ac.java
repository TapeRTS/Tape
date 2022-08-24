package com.corrodinggames.rts.gameFramework.p044l;

import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.l.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/ac.class */
public class C0926ac {

    /* renamed from: b */
    private FloatBuffer f6321b;

    /* renamed from: c */
    private FloatBuffer f6322c;

    /* renamed from: d */
    private FloatBuffer f6323d;

    /* renamed from: e */
    private IntBuffer f6324e;

    /* renamed from: f */
    private IntBuffer f6325f;

    /* renamed from: g */
    private IntBuffer f6326g;

    /* renamed from: h */
    private CharBuffer f6327h;

    /* renamed from: i */
    private Buffer f6328i;

    /* renamed from: j */
    private Buffer f6329j;

    /* renamed from: k */
    private Buffer f6330k;

    /* renamed from: l */
    private int f6331l;

    /* renamed from: m */
    private int f6332m;

    /* renamed from: n */
    private int f6333n;

    /* renamed from: o */
    private int f6334o;

    /* renamed from: p */
    private boolean f6335p;

    /* renamed from: q */
    private int f6336q;

    /* renamed from: r */
    private int f6337r;

    /* renamed from: s */
    private int f6338s;

    /* renamed from: t */
    private int f6339t;

    /* renamed from: a */
    static final /* synthetic */ boolean f6340a;

    static {
        f6340a = !C0926ac.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1074a(int i, int i2, float f, float f2) {
        if (i < 0 || i >= this.f6332m) {
            throw new IllegalArgumentException("i");
        }
        if (i2 < 0 || i2 >= this.f6333n) {
            throw new IllegalArgumentException("j");
        }
        int i3 = ((this.f6332m * i2) + i) * 2;
        if (this.f6331l == 5126) {
            this.f6322c.put(i3, f);
            this.f6322c.put(i3 + 1, f2);
            return;
        }
        this.f6325f.put(i3, (int) (f * 65536.0f));
        this.f6325f.put(i3 + 1, (int) (f2 * 65536.0f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1073a(int i, int i2, float f, float f2, float f3, float f4, float f5, float[] fArr) {
        if (i < 0 || i >= this.f6332m) {
            throw new IllegalArgumentException("i");
        }
        if (i2 < 0 || i2 >= this.f6333n) {
            throw new IllegalArgumentException("j");
        }
        int i3 = (this.f6332m * i2) + i;
        int i4 = i3 * 3;
        int i5 = i3 * 2;
        int i6 = i3 * 4;
        if (this.f6331l == 5126) {
            this.f6321b.put(i4, f);
            this.f6321b.put(i4 + 1, f2);
            this.f6321b.put(i4 + 2, f3);
            this.f6322c.put(i5, f4);
            this.f6322c.put(i5 + 1, f5);
            if (fArr != null) {
                this.f6323d.put(i6, fArr[0]);
                this.f6323d.put(i6 + 1, fArr[1]);
                this.f6323d.put(i6 + 2, fArr[2]);
                this.f6323d.put(i6 + 3, fArr[3]);
                return;
            }
            return;
        }
        this.f6324e.put(i4, (int) (f * 65536.0f));
        this.f6324e.put(i4 + 1, (int) (f2 * 65536.0f));
        this.f6324e.put(i4 + 2, (int) (f3 * 65536.0f));
        this.f6325f.put(i5, (int) (f4 * 65536.0f));
        this.f6325f.put(i5 + 1, (int) (f5 * 65536.0f));
        if (fArr != null) {
            this.f6326g.put(i6, (int) (fArr[0] * 65536.0f));
            this.f6326g.put(i6 + 1, (int) (fArr[1] * 65536.0f));
            this.f6326g.put(i6 + 2, (int) (fArr[2] * 65536.0f));
            this.f6326g.put(i6 + 3, (int) (fArr[3] * 65536.0f));
        }
    }

    /* renamed from: a */
    public static void m1071a(GL10 gl10, boolean z, boolean z2) {
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
    public void m1070b(GL10 gl10, boolean z, boolean z2) {
        if (!this.f6335p) {
            gl10.glVertexPointer(3, this.f6331l, 0, this.f6328i);
            if (z) {
                gl10.glTexCoordPointer(2, this.f6331l, 0, this.f6329j);
            }
            if (z2) {
                gl10.glColorPointer(4, this.f6331l, 0, this.f6330k);
            }
            gl10.glDrawElements(4, this.f6334o, 5123, this.f6327h);
            return;
        }
        GL11 gl11 = (GL11) gl10;
        gl11.glBindBuffer(34962, this.f6336q);
        gl11.glVertexPointer(3, this.f6331l, 0, 0);
        if (z) {
            gl11.glBindBuffer(34962, this.f6338s);
            gl11.glTexCoordPointer(2, this.f6331l, 0, 0);
        }
        if (z2) {
            gl11.glBindBuffer(34962, this.f6339t);
            gl11.glColorPointer(4, this.f6331l, 0, 0);
        }
        gl11.glBindBuffer(34963, this.f6337r);
        gl11.glDrawElements(4, this.f6334o, 5123, 0);
        gl11.glBindBuffer(34962, 0);
        gl11.glBindBuffer(34963, 0);
    }

    /* renamed from: a */
    public static void m1072a(GL10 gl10) {
        gl10.glDisableClientState(32884);
    }
}
