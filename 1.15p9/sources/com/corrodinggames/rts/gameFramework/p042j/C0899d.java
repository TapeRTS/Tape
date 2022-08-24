package com.corrodinggames.rts.gameFramework.p042j;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.j.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/d.class */
public final class C0899d extends AbstractC0905j {

    /* renamed from: a */
    public static int f5912a;

    /* renamed from: b */
    public static int f5913b;

    /* renamed from: c */
    public static int f5914c;

    /* renamed from: d */
    public static int f5915d;

    /* renamed from: e */
    public static int f5916e;

    /* renamed from: f */
    public static int f5917f;

    /* renamed from: g */
    public static int f5918g;

    /* renamed from: h */
    public static double f5919h;

    /* renamed from: i */
    public static double f5920i;

    /* renamed from: j */
    int f5921j;

    /* renamed from: k */
    int f5922k;

    /* renamed from: l */
    int f5923l;

    /* renamed from: m */
    int f5924m;

    /* renamed from: n */
    int f5925n;

    /* renamed from: o */
    C0909n[] f5926o = new C0909n[975];

    /* renamed from: p */
    C1101m f5927p = new C1101m(100);

    /* renamed from: q */
    final PriorityQueue f5928q = new PriorityQueue();

    /* renamed from: r */
    final C1101m f5929r = new C1101m(300);

    /* renamed from: s */
    int f5930s;

    /* renamed from: t */
    int f5931t;

    /* renamed from: u */
    public static int f5932u;

    /* renamed from: c */
    private void m1370c() {
        if (this.f5922k == this.f5924m) {
            m1368d();
            return;
        }
        int i = this.f5925n;
        C0909n[] c0909nArr = this.f5926o;
        if (this.f5921j == -2) {
            for (int i2 = 0; i2 <= i; i2++) {
                int i3 = c0909nArr[i2].f6037c;
                if (this.f5922k == i3) {
                    this.f5921j = i2;
                    this.f5922k = i3;
                    return;
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 <= i; i6++) {
            int i7 = c0909nArr[i6].f6037c;
            if (i5 > i7) {
                i4 = i6;
                i5 = i7;
            }
        }
        if (this.f5922k != i5) {
            f5918g++;
        }
        this.f5921j = i4;
        this.f5922k = i5;
    }

    /* renamed from: a */
    private void m1373a(int i, C0909n c0909n) {
        this.f5926o[i] = c0909n;
        int i2 = c0909n.f6037c;
        if (this.f5921j == -1 || this.f5922k >= i2) {
            if (this.f5922k > i2) {
            }
            if (this.f5922k != i2) {
                f5918g++;
            }
            this.f5921j = i;
            this.f5922k = i2;
        }
        if (this.f5923l == -1 || this.f5924m < i2) {
            this.f5923l = i;
            this.f5924m = i2;
        }
    }

    /* renamed from: d */
    private void m1368d() {
        this.f5921j = -1;
        this.f5922k = Integer.MAX_VALUE;
        this.f5923l = -1;
        this.f5924m = Integer.MIN_VALUE;
        for (int i = 0; i <= this.f5925n; i++) {
            C0909n c0909n = this.f5926o[i];
            if (c0909n == null) {
                GameEngine.PrintLog("n:" + i);
                GameEngine.PrintLog("lowestBufferLastIndex:" + this.f5925n);
                throw new RuntimeException("null with n:" + i + ", lowestBufferLastIndex:" + this.f5925n);
            }
            int i2 = c0909n.f6037c;
            if (this.f5922k > i2) {
                this.f5921j = i;
                this.f5922k = i2;
            }
            if (this.f5924m < i2) {
                this.f5923l = i;
                this.f5924m = i2;
            }
        }
    }

    /* renamed from: e */
    private void m1367e() {
        if (this.f5925n < 30) {
            C0909n c0909n = (C0909n) this.f5928q.poll();
            if (c0909n != null) {
                m1371b(c0909n);
            }
            C0909n c0909n2 = (C0909n) this.f5928q.peek();
            if (c0909n2 != null) {
                this.f5930s = c0909n2.f6037c;
                return;
            }
            return;
        }
        this.f5930s = Integer.MAX_VALUE;
        C0909n c0909n3 = (C0909n) this.f5928q.peek();
        if (c0909n3 != null) {
            this.f5930s = c0909n3.f6037c;
        }
    }

    public C0899d() {
        m1366f();
    }

    /* renamed from: b */
    private void m1371b(C0909n c0909n) {
        this.f5925n++;
        m1373a(this.f5925n, c0909n);
        if (this.f5925n > f5912a) {
            f5912a = this.f5925n;
        }
    }

    /* renamed from: c */
    private void m1369c(C0909n c0909n) {
        this.f5928q.offer(c0909n);
        if (c0909n.f6037c < this.f5930s) {
            this.f5930s = c0909n.f6037c;
        }
        if (this.f5928q.size() > f5913b) {
            f5913b = this.f5928q.size();
        }
    }

    /* renamed from: a */
    public void mo1328a(C0909n c0909n) {
        f5915d++;
        boolean z = false;
        if (this.f5925n < this.f5926o.length - 1) {
            z = true;
        }
        if (z) {
            if (c0909n.f6037c <= this.f5930s) {
                m1371b(c0909n);
            } else {
                m1369c(c0909n);
            }
        } else if (c0909n.f6037c < this.f5924m) {
            C0909n c0909n2 = this.f5926o[this.f5923l];
            this.f5926o[this.f5923l] = c0909n;
            m1368d();
            m1369c(c0909n2);
        } else {
            m1369c(c0909n);
        }
    }

    /* renamed from: a */
    public C0909n mo1329a() {
        if (this.f5921j == -2) {
            int i = this.f5922k;
            m1370c();
            this.f5931t++;
            if (f5932u < this.f5931t) {
                f5932u = this.f5931t;
            }
            f5916e++;
            if (i == this.f5922k) {
                f5917f++;
            }
        } else {
            this.f5931t = 0;
        }
        if (this.f5922k < this.f5930s && this.f5921j != -1) {
            C0909n[] c0909nArr = this.f5926o;
            C0909n c0909n = c0909nArr[this.f5921j];
            if (this.f5925n != this.f5921j) {
                c0909nArr[this.f5921j] = c0909nArr[this.f5925n];
                c0909nArr[this.f5925n] = null;
            } else {
                c0909nArr[this.f5925n] = null;
            }
            this.f5925n--;
            this.f5921j = -2;
            return c0909n;
        }
        C0909n c0909n2 = (C0909n) this.f5928q.poll();
        m1367e();
        return c0909n2;
    }

    /* renamed from: b */
    public void mo1327b() {
        m1372a((C0908m) null);
    }

    /* renamed from: a */
    public void m1372a(C0908m c0908m) {
        for (int i = 0; i < this.f5926o.length; i++) {
            if (this.f5926o[i] != null) {
                if (c0908m != null) {
                    c0908m.m1277a(this.f5926o[i]);
                }
                this.f5926o[i] = null;
            }
        }
        this.f5925n = -1;
        Iterator it = this.f5928q.iterator();
        while (it.hasNext()) {
            C0909n c0909n = (C0909n) it.next();
            if (c0908m != null) {
                c0908m.m1277a(c0909n);
            }
        }
        this.f5928q.clear();
        m1366f();
    }

    /* renamed from: f */
    private void m1366f() {
        this.f5921j = -1;
        this.f5922k = Integer.MAX_VALUE;
        this.f5923l = -1;
        this.f5924m = Integer.MIN_VALUE;
        this.f5930s = Integer.MAX_VALUE;
    }
}
