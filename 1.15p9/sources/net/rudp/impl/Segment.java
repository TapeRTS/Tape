package net.rudp.impl;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;

/* renamed from: a.a.a.h */
/* loaded from: game-lib.jar:a/a/a/h.class */
public abstract class Segment {

    /* renamed from: a */
    private int f13a;

    /* renamed from: b */
    private int f14b;

    /* renamed from: c */
    private int f15c;

    /* renamed from: e */
    private int f16e = 0;

    /* renamed from: d */
    private int f17d = -1;

    /* renamed from: a */
    public abstract String m5319a();

    /* renamed from: m */
    public int m5311m() {
        return this.f15c;
    }

    /* renamed from: b */
    public int m5315b() {
        return this.f14b;
    }

    /* renamed from: a */
    public void m5318a(int i) {
        this.f13a |= 64;
        this.f17d = i;
    }

    /* renamed from: n */
    public int m5310n() {
        if ((this.f13a & 64) == 64) {
            return this.f17d;
        }
        return -1;
    }

    /* renamed from: o */
    public int m5309o() {
        return this.f16e;
    }

    /* renamed from: b */
    public void m5314b(int i) {
        this.f16e = i;
    }

    /* renamed from: d */
    public byte[] m5312d() {
        byte[] bArr = new byte[m5315b()];
        bArr[0] = (byte) (this.f13a & 255);
        bArr[1] = (byte) (this.f14b & 255);
        bArr[2] = (byte) (this.f15c & 255);
        bArr[3] = (byte) (this.f17d & 255);
        return bArr;
    }

    public String toString() {
        return m5319a() + " [ SEQ = " + m5311m() + ", ACK = " + (m5310n() >= 0 ? VariableScope.nullOrMissingString + m5310n() : "N/A") + ", LEN = " + m5315b() + " ]";
    }

    /* renamed from: b */
    public static Segment m5313b(byte[] bArr, int i, int i2) {
        Segment segment = null;
        if (i2 < 6) {
            throw new IOException("Invalid segment:" + i2);
        }
        byte b = bArr[i];
        if ((b & Byte.MIN_VALUE) != 0) {
            segment = new C0007g();
        } else if ((b & 8) != 0) {
            segment = new C0005e();
        } else if ((b & 32) != 0) {
            segment = new C0003c();
        } else if ((b & 16) != 0) {
            segment = new C0006f();
        } else if ((b & 2) != 0) {
            segment = new C0004d();
        } else if ((b & 64) != 0) {
            if (i2 == 6) {
                segment = new C0001a();
            } else {
                segment = new C0002b();
            }
        }
        if (segment == null) {
            throw new IOException("Invalid segment");
        }
        segment.m5316a(bArr, i, i2);
        return segment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5317a(int i, int i2, int i3) {
        this.f13a = i;
        this.f15c = i2;
        this.f14b = i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5316a(byte[] bArr, int i, int i2) {
        this.f13a = bArr[i] & 255;
        this.f14b = bArr[i + 1] & 255;
        this.f15c = bArr[i + 2] & 255;
        this.f17d = bArr[i + 3] & 255;
    }
}
