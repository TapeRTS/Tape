package p000a.p001a.p002a;

import java.io.IOException;

/* renamed from: a.a.a.h */
/* loaded from: game-lib.jar:a/a/a/h.class */
public abstract class AbstractC0008h {

    /* renamed from: a */
    private int f13a;

    /* renamed from: b */
    private int f14b;

    /* renamed from: c */
    private int f15c;

    /* renamed from: e */
    private int f17e = 0;

    /* renamed from: d */
    private int f16d = -1;

    /* renamed from: a */
    public abstract String mo4409a();

    protected AbstractC0008h() {
    }

    /* renamed from: m */
    public int m4401m() {
        return this.f15c;
    }

    /* renamed from: b */
    public int mo4405b() {
        return this.f14b;
    }

    /* renamed from: a */
    public void m4408a(int i) {
        this.f13a |= 64;
        this.f16d = i;
    }

    /* renamed from: n */
    public int m4400n() {
        if ((this.f13a & 64) == 64) {
            return this.f16d;
        }
        return -1;
    }

    /* renamed from: o */
    public int m4399o() {
        return this.f17e;
    }

    /* renamed from: b */
    public void m4404b(int i) {
        this.f17e = i;
    }

    /* renamed from: d */
    public byte[] mo4402d() {
        byte[] bArr = new byte[mo4405b()];
        bArr[0] = (byte) (this.f13a & 255);
        bArr[1] = (byte) (this.f14b & 255);
        bArr[2] = (byte) (this.f15c & 255);
        bArr[3] = (byte) (this.f16d & 255);
        return bArr;
    }

    public String toString() {
        return mo4409a() + " [ SEQ = " + m4401m() + ", ACK = " + (m4400n() >= 0 ? "" + m4400n() : "N/A") + ", LEN = " + mo4405b() + " ]";
    }

    /* renamed from: b */
    public static AbstractC0008h m4403b(byte[] bArr, int i, int i2) {
        C0007g gVar = null;
        if (i2 < 6) {
            throw new IOException("Invalid segment:" + i2);
        }
        byte b = bArr[i];
        if ((b & Byte.MIN_VALUE) != 0) {
            gVar = new C0007g();
        } else if ((b & 8) != 0) {
            gVar = new C0005e();
        } else if ((b & 32) != 0) {
            gVar = new C0003c();
        } else if ((b & 16) != 0) {
            gVar = new C0006f();
        } else if ((b & 2) != 0) {
            gVar = new C0004d();
        } else if ((b & 64) != 0) {
            if (i2 == 6) {
                gVar = new C0001a();
            } else {
                gVar = new C0002b();
            }
        }
        if (gVar == null) {
            throw new IOException("Invalid segment");
        }
        gVar.mo4406a(bArr, i, i2);
        return gVar;
    }

    /* renamed from: a */
    protected void m4407a(int i, int i2, int i3) {
        this.f13a = i;
        this.f15c = i2;
        this.f14b = i3;
    }

    /* renamed from: a */
    protected void mo4406a(byte[] bArr, int i, int i2) {
        this.f13a = bArr[i] & 255;
        this.f14b = bArr[i + 1] & 255;
        this.f15c = bArr[i + 2] & 255;
        this.f16d = bArr[i + 3] & 255;
    }
}
