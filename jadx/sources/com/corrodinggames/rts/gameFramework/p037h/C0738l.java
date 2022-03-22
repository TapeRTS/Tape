package com.corrodinggames.rts.gameFramework.p037h;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.gameFramework.h.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/l.class */
public final class C0738l {

    /* renamed from: a */
    public short f5198a;

    /* renamed from: b */
    public short f5199b;

    public C0738l() {
    }

    public C0738l(short s, short s2) {
        m898a(s, s2);
    }

    /* renamed from: a */
    public final C0738l m898a(short s, short s2) {
        this.f5198a = s;
        this.f5199b = s2;
        return this;
    }

    /* renamed from: a */
    public final C0738l m899a(C0738l lVar) {
        this.f5198a = lVar.f5198a;
        this.f5199b = lVar.f5199b;
        return this;
    }

    /* renamed from: a */
    public final C0738l m907a(C0736j jVar) {
        this.f5198a = jVar.f5166a;
        this.f5199b = jVar.f5167b;
        return this;
    }

    /* renamed from: a */
    public final int m906a(RunnableC0737k kVar) {
        short s = this.f5198a;
        short s2 = this.f5199b;
        if (kVar.f5171b[(s * kVar.f5178h) + s2] == -1 || kVar.f5172c[(s * kVar.f5178h) + s2] == -1 || kVar.f5173d[(s * kVar.f5178h) + s2] == -1) {
            return -1;
        }
        return kVar.f5171b[(s * kVar.f5178h) + s2] + kVar.f5172c[(s * kVar.f5178h) + s2] + (kVar.f5173d[(s * kVar.f5178h) + s2] * 10);
    }

    /* renamed from: a */
    public final int m905a(RunnableC0737k kVar, byte b) {
        return kVar.f5182l[b][(this.f5198a * kVar.f5178h) + this.f5199b];
    }

    /* renamed from: a */
    public final void m902a(RunnableC0737k kVar, byte b, int i) {
        kVar.f5182l[b][(this.f5198a * kVar.f5178h) + this.f5199b] = i;
    }

    /* renamed from: a */
    public final void m900a(RunnableC0737k kVar, byte b, boolean z) {
        if (z) {
            byte[] bArr = kVar.f5183m[b];
            int i = (this.f5198a * kVar.f5178h) + this.f5199b;
            bArr[i] = (byte) (bArr[i] | 16);
            return;
        }
        byte[] bArr2 = kVar.f5183m[b];
        int i2 = (this.f5198a * kVar.f5178h) + this.f5199b;
        bArr2[i2] = (byte) (bArr2[i2] & (-17));
    }

    /* renamed from: b */
    public final boolean m897b(RunnableC0737k kVar, byte b) {
        return kVar.f5182l[b][(this.f5198a * kVar.f5178h) + this.f5199b] >= kVar.f5179i && (kVar.f5183m[b][(this.f5198a * kVar.f5178h) + this.f5199b] & 16) != 0;
    }

    /* renamed from: c */
    public final byte m895c(RunnableC0737k kVar, byte b) {
        return (byte) (kVar.f5183m[b][(this.f5198a * kVar.f5178h) + this.f5199b] & 7);
    }

    /* renamed from: d */
    public final boolean m894d(RunnableC0737k kVar, byte b) {
        return (kVar.f5183m[b][(this.f5198a * kVar.f5178h) + this.f5199b] & 8) != 0;
    }

    /* renamed from: b */
    public final void m896b(RunnableC0737k kVar, byte b, boolean z) {
        if (z) {
            byte[] bArr = kVar.f5183m[b];
            int i = (this.f5198a * kVar.f5178h) + this.f5199b;
            bArr[i] = (byte) (bArr[i] | 8);
            return;
        }
        byte[] bArr2 = kVar.f5183m[b];
        int i2 = (this.f5198a * kVar.f5178h) + this.f5199b;
        bArr2[i2] = (byte) (bArr2[i2] & (-9));
    }

    /* renamed from: a */
    public final void m904a(RunnableC0737k kVar, byte b, byte b2) {
        byte[] bArr = kVar.f5183m[b];
        int i = (this.f5198a * kVar.f5178h) + this.f5199b;
        bArr[i] = (byte) (bArr[i] & (-16));
        byte[] bArr2 = kVar.f5183m[b];
        int i2 = (this.f5198a * kVar.f5178h) + this.f5199b;
        bArr2[i2] = (byte) (bArr2[i2] | (b2 & 15));
    }

    /* renamed from: a */
    public final void m903a(RunnableC0737k kVar, byte b, float f) {
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
            AbstractC0789l.m670d("setCurrentDirectionFromAngle: dir:" + i + " direction:" + f);
            i = 0;
        }
        m904a(kVar, b, (byte) i);
    }

    /* renamed from: e */
    public final boolean m893e(RunnableC0737k kVar, byte b) {
        if (kVar.f5182l[b][(this.f5198a * kVar.f5178h) + this.f5199b] >= kVar.f5179i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C0738l m892f(RunnableC0737k kVar, byte b) {
        C0738l lVar = new C0738l();
        if (m901a(kVar, b, lVar)) {
            return lVar;
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m901a(RunnableC0737k kVar, byte b, C0738l lVar) {
        if (!m893e(kVar, b)) {
            lVar.m898a((short) -1, (short) -1);
            return false;
        }
        byte c = m895c(kVar, b);
        if (m894d(kVar, b)) {
            lVar.m898a((short) -1, (short) -1);
            return false;
        }
        int i = 0;
        int i2 = 0;
        if (c == 0) {
            i = 0 + 1;
        }
        if (c == 1) {
            i++;
            i2 = 0 + 1;
        }
        if (c == 2) {
            i2++;
        }
        if (c == 3) {
            i2++;
            i--;
        }
        if (c == 4) {
            i--;
        }
        if (c == 5) {
            i--;
            i2--;
        }
        if (c == 6) {
            i2--;
        }
        if (c == 7) {
            i2--;
            i++;
        }
        lVar.m898a((short) (this.f5198a - i), (short) (this.f5199b - i2));
        return true;
    }
}
