package com.corrodinggames.rts.gameFramework.p042j;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.j.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/p.class */
public final class C0911p {

    /* renamed from: a */
    public short f6068a;

    /* renamed from: b */
    public short f6069b;

    public C0911p() {
    }

    public C0911p(short s, short s2) {
        m1245a(s, s2);
    }

    /* renamed from: a */
    public final C0911p m1245a(short s, short s2) {
        this.f6068a = s;
        this.f6069b = s2;
        return this;
    }

    /* renamed from: a */
    public final C0911p m1246a(C0911p c0911p) {
        this.f6068a = c0911p.f6068a;
        this.f6069b = c0911p.f6069b;
        return this;
    }

    /* renamed from: a */
    public final C0911p m1254a(C0909n c0909n) {
        this.f6068a = c0909n.f6035a;
        this.f6069b = c0909n.f6036b;
        return this;
    }

    /* renamed from: a */
    public final int m1253a(RunnableC0910o runnableC0910o) {
        short s = this.f6068a;
        short s2 = this.f6069b;
        if (runnableC0910o.f6040b[(s * runnableC0910o.f6047h) + s2] == -1 || runnableC0910o.f6041c[(s * runnableC0910o.f6047h) + s2] == -1 || runnableC0910o.f6042d[(s * runnableC0910o.f6047h) + s2] == -1) {
            return -1;
        }
        return runnableC0910o.f6040b[(s * runnableC0910o.f6047h) + s2] + runnableC0910o.f6041c[(s * runnableC0910o.f6047h) + s2] + (runnableC0910o.f6042d[(s * runnableC0910o.f6047h) + s2] * 10);
    }

    /* renamed from: a */
    public final int m1252a(RunnableC0910o runnableC0910o, byte b) {
        return runnableC0910o.f6051l[b][(this.f6068a * runnableC0910o.f6047h) + this.f6069b];
    }

    /* renamed from: a */
    public final void m1249a(RunnableC0910o runnableC0910o, byte b, int i) {
        runnableC0910o.f6051l[b][(this.f6068a * runnableC0910o.f6047h) + this.f6069b] = i;
    }

    /* renamed from: a */
    public final void m1247a(RunnableC0910o runnableC0910o, byte b, boolean z) {
        if (z) {
            byte[] bArr = runnableC0910o.f6052m[b];
            int i = (this.f6068a * runnableC0910o.f6047h) + this.f6069b;
            bArr[i] = (byte) (bArr[i] | 16);
            return;
        }
        byte[] bArr2 = runnableC0910o.f6052m[b];
        int i2 = (this.f6068a * runnableC0910o.f6047h) + this.f6069b;
        bArr2[i2] = (byte) (bArr2[i2] & (-17));
    }

    /* renamed from: b */
    public final boolean m1244b(RunnableC0910o runnableC0910o, byte b) {
        return runnableC0910o.f6051l[b][(this.f6068a * runnableC0910o.f6047h) + this.f6069b] >= runnableC0910o.f6048i && (runnableC0910o.f6052m[b][(this.f6068a * runnableC0910o.f6047h) + this.f6069b] & 16) != 0;
    }

    /* renamed from: c */
    public final byte m1242c(RunnableC0910o runnableC0910o, byte b) {
        return (byte) (runnableC0910o.f6052m[b][(this.f6068a * runnableC0910o.f6047h) + this.f6069b] & 7);
    }

    /* renamed from: d */
    public final boolean m1241d(RunnableC0910o runnableC0910o, byte b) {
        return (runnableC0910o.f6052m[b][(this.f6068a * runnableC0910o.f6047h) + this.f6069b] & 8) != 0;
    }

    /* renamed from: b */
    public final void m1243b(RunnableC0910o runnableC0910o, byte b, boolean z) {
        if (z) {
            byte[] bArr = runnableC0910o.f6052m[b];
            int i = (this.f6068a * runnableC0910o.f6047h) + this.f6069b;
            bArr[i] = (byte) (bArr[i] | 8);
            return;
        }
        byte[] bArr2 = runnableC0910o.f6052m[b];
        int i2 = (this.f6068a * runnableC0910o.f6047h) + this.f6069b;
        bArr2[i2] = (byte) (bArr2[i2] & (-9));
    }

    /* renamed from: a */
    public final void m1251a(RunnableC0910o runnableC0910o, byte b, byte b2) {
        byte[] bArr = runnableC0910o.f6052m[b];
        int i = (this.f6068a * runnableC0910o.f6047h) + this.f6069b;
        bArr[i] = (byte) (bArr[i] & (-16));
        byte[] bArr2 = runnableC0910o.f6052m[b];
        int i2 = (this.f6068a * runnableC0910o.f6047h) + this.f6069b;
        bArr2[i2] = (byte) (bArr2[i2] | (b2 & 15));
    }

    /* renamed from: a */
    public final void m1250a(RunnableC0910o runnableC0910o, byte b, float f) {
        int i = (int) (((f / 360.0f) * 8.0f) + 0.5f);
        if (i < 0) {
            i += 8;
        }
        if (i > 7) {
            i -= 8;
        }
        if (i < 0) {
            i += 8;
        }
        if (i > 7) {
            i -= 8;
        }
        if (i < 0 || i > 7) {
            GameEngine.PrintLog("setCurrentDirectionFromAngle: dir:" + i + " direction:" + f);
            i = 0;
        }
        m1251a(runnableC0910o, b, (byte) i);
    }

    /* renamed from: e */
    public final boolean m1240e(RunnableC0910o runnableC0910o, byte b) {
        if (runnableC0910o.f6051l[b][(this.f6068a * runnableC0910o.f6047h) + this.f6069b] >= runnableC0910o.f6048i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C0911p m1239f(RunnableC0910o runnableC0910o, byte b) {
        C0911p c0911p = new C0911p();
        if (m1248a(runnableC0910o, b, c0911p)) {
            return c0911p;
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m1248a(RunnableC0910o runnableC0910o, byte b, C0911p c0911p) {
        if (!m1240e(runnableC0910o, b)) {
            c0911p.m1245a((short) -1, (short) -1);
            return false;
        }
        byte m1242c = m1242c(runnableC0910o, b);
        if (m1241d(runnableC0910o, b)) {
            c0911p.m1245a((short) -1, (short) -1);
            return false;
        }
        int i = 0;
        int i2 = 0;
        if (m1242c == 0) {
            i = 0 + 1;
        }
        if (m1242c == 1) {
            i++;
            i2 = 0 + 1;
        }
        if (m1242c == 2) {
            i2++;
        }
        if (m1242c == 3) {
            i2++;
            i--;
        }
        if (m1242c == 4) {
            i--;
        }
        if (m1242c == 5) {
            i--;
            i2--;
        }
        if (m1242c == 6) {
            i2--;
        }
        if (m1242c == 7) {
            i2--;
            i++;
        }
        c0911p.m1245a((short) (this.f6068a - i), (short) (this.f6069b - i2));
        return true;
    }
}
