package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.C0169k;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.EnumC0805u;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/c.class */
public class C0151c {

    /* renamed from: f */
    int f795f;

    /* renamed from: g */
    int f796g;

    /* renamed from: h */
    int f797h;

    /* renamed from: i */
    int f798i;

    /* renamed from: j */
    int f799j;

    /* renamed from: k */
    int f800k;

    /* renamed from: l */
    float f801l;

    /* renamed from: n */
    boolean f803n;

    /* renamed from: a */
    int f790a = 7;

    /* renamed from: b */
    public C0748e f791b = null;

    /* renamed from: c */
    public AbstractC0755l f792c = null;

    /* renamed from: d */
    C0152d[][] f793d = null;

    /* renamed from: e */
    public Paint f794e = new C0760q();

    /* renamed from: m */
    float f802m = 1.0f;

    /* renamed from: o */
    Rect f804o = new Rect();

    /* renamed from: p */
    int f805p = 0;

    /* renamed from: a */
    public void m3642a() {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f802m = m3623g();
        if (this.f802m > 1.0f) {
        }
        this.f798i = (int) (this.f797h / this.f802m);
        this.f800k = (int) (this.f799j / this.f802m);
        this.f801l = 1.0f / this.f800k;
        this.f795f = u.f5545cb - (this.f798i / 2);
        this.f796g = u.f5546cc - (this.f798i / 2);
        float f = 1.0f / 20;
        this.f795f = ((int) (this.f795f * f)) * 20;
        this.f796g = ((int) (this.f796g * f)) * 20;
        for (int i = 0; i < this.f790a; i++) {
            for (int i2 = 0; i2 < this.f790a; i2++) {
                C0152d dVar = this.f793d[i][i2];
                dVar.f816k = true;
                dVar.f819n = false;
            }
        }
    }

    /* renamed from: b */
    public void m3634b() {
        for (int i = 0; i < this.f790a; i++) {
            for (int i2 = 0; i2 < this.f790a; i2++) {
                C0152d dVar = this.f793d[i][i2];
                dVar.f814i = i;
                dVar.f815j = i2;
            }
        }
    }

    /* renamed from: a */
    public void m3640a(int i) {
        C0152d[] dVarArr = new C0152d[this.f790a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.f790a; i2++) {
                dVarArr[i2] = this.f793d[i2][0];
            }
            for (int i3 = 1; i3 < this.f790a; i3++) {
                for (int i4 = 0; i4 < this.f790a; i4++) {
                    this.f793d[i4][i3 - 1] = this.f793d[i4][i3];
                }
            }
            for (int i5 = 0; i5 < this.f790a; i5++) {
                this.f793d[i5][this.f790a - 1] = dVarArr[i5];
            }
            for (int i6 = 0; i6 < this.f790a; i6++) {
                this.f793d[i6][this.f790a - 1].f816k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.f790a; i7++) {
                dVarArr[i7] = this.f793d[i7][this.f790a - 1];
            }
            for (int i8 = this.f790a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.f790a; i9++) {
                    this.f793d[i9][i8 + 1] = this.f793d[i9][i8];
                }
            }
            for (int i10 = 0; i10 < this.f790a; i10++) {
                this.f793d[i10][0] = dVarArr[i10];
            }
            for (int i11 = 0; i11 < this.f790a; i11++) {
                this.f793d[i11][0].f816k = true;
            }
        }
        m3634b();
    }

    /* renamed from: b */
    public void m3633b(int i) {
        C0152d[] dVarArr = new C0152d[this.f790a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.f790a; i2++) {
                dVarArr[i2] = this.f793d[0][i2];
            }
            for (int i3 = 1; i3 < this.f790a; i3++) {
                for (int i4 = 0; i4 < this.f790a; i4++) {
                    this.f793d[i3 - 1][i4] = this.f793d[i3][i4];
                }
            }
            for (int i5 = 0; i5 < this.f790a; i5++) {
                this.f793d[this.f790a - 1][i5] = dVarArr[i5];
            }
            for (int i6 = 0; i6 < this.f790a; i6++) {
                this.f793d[this.f790a - 1][i6].f816k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.f790a; i7++) {
                dVarArr[i7] = this.f793d[this.f790a - 1][i7];
            }
            for (int i8 = this.f790a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.f790a; i9++) {
                    this.f793d[i8 + 1][i9] = this.f793d[i8][i9];
                }
            }
            for (int i10 = 0; i10 < this.f790a; i10++) {
                this.f793d[0][i10] = dVarArr[i10];
            }
            for (int i11 = 0; i11 < this.f790a; i11++) {
                this.f793d[0][i11].f816k = true;
            }
        }
        m3634b();
    }

    /* renamed from: a */
    public C0152d m3639a(int i, int i2) {
        if (i < 0 || i >= this.f790a || i2 < 0 || i2 >= this.f790a || this.f793d == null) {
            return null;
        }
        return this.f793d[i][i2];
    }

    /* renamed from: a */
    public void m3636a(int i, int i2, boolean z) {
        C0148b bVar = AbstractC0789l.m638u().f5511bt;
        int i3 = bVar.f735k;
        int i4 = bVar.f736l;
        int i5 = i * i3;
        int i6 = i2 * i4;
        m3638a((i5 - this.f795f) - i3, (i6 - this.f796g) - i4, 3 * i3, 3 * i4, z);
    }

    /* renamed from: c */
    public void m3630c() {
        if (this.f793d != null) {
            for (int i = 0; i < this.f790a; i++) {
                for (int i2 = 0; i2 < this.f790a; i2++) {
                    this.f793d[i][i2].f816k = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m3638a(int i, int i2, int i3, int i4, boolean z) {
        C0152d a;
        C0152d a2;
        C0152d a3;
        int i5 = (int) (i * this.f801l);
        int i6 = (int) (i2 * this.f801l);
        C0152d a4 = m3639a(i5, i6);
        if (a4 != null) {
            if (z) {
                a4.f817l = true;
            } else {
                a4.f816k = true;
            }
            boolean z2 = false;
            boolean z3 = false;
            if (i + i3 >= (a4.f814i * this.f800k) + this.f798i) {
                z2 = true;
            }
            if (i2 + i4 >= (a4.f815j * this.f800k) + this.f798i) {
                z3 = true;
            }
            if (z2 && (a3 = m3639a(i5 + 1, i6)) != null) {
                if (z) {
                    a3.f817l = true;
                } else {
                    a3.f816k = true;
                }
            }
            if (z3 && (a2 = m3639a(i5, i6 + 1)) != null) {
                if (z) {
                    a2.f817l = true;
                } else {
                    a2.f816k = true;
                }
            }
            if (z2 && z3 && (a = m3639a(i5 + 1, i6 + 1)) != null) {
                if (z) {
                    a.f817l = true;
                } else {
                    a.f816k = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m3635a(C0169k kVar) {
        RectF c = kVar.m3532c();
        for (int i = 0; i < this.f790a; i++) {
            for (int i2 = 0; i2 < this.f790a; i2++) {
                if (this.f793d != null) {
                    C0152d dVar = this.f793d[i][i2];
                    if (C0654f.m1505a(dVar.m3621b(), c)) {
                        boolean z = this.f802m != 1.0f;
                        if (z) {
                        }
                        kVar.m3535a(dVar.f806a, dVar.m3620c(), dVar.m3619d(), this.f802m);
                        if (z) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3637a(int i, int i2, AbstractC0755l lVar) {
        C0152d dVar = this.f793d[i][i2];
        boolean z = this.f802m != 1.0f;
        if (z) {
        }
        Rect b = dVar.m3621b();
        C0654f.m1506a(b, 95.0f);
        AbstractC0854w[] a = AbstractC0854w.f5846dK.m472a();
        int size = AbstractC0854w.f5846dK.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0854w wVar = a[i3];
            if (wVar instanceof C0169k) {
                C0169k kVar = (C0169k) wVar;
                if (b.m4133b((int) kVar.f5842dH, (int) kVar.f5843dI)) {
                    kVar.m3535a(lVar, dVar.m3620c(), dVar.m3619d(), this.f802m);
                }
            }
        }
        if (z) {
        }
    }

    /* renamed from: b */
    public void m3631b(int i, int i2, AbstractC0755l lVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        if (u.f5518bA.m1759D()) {
            int i3 = this.f795f + (i * this.f800k);
            int i4 = this.f796g + (i2 * this.f800k);
            int i5 = this.f798i;
            int i6 = this.f798i;
            int i7 = bVar.f742r.f839n;
            int i8 = bVar.f742r.f840o;
            if (((int) (i3 * bVar.f739o)) < 0) {
            }
            if (((int) (i4 * bVar.f740p)) < 0) {
            }
            if (((int) ((i3 + i5) * bVar.f739o)) > i7 - 1) {
                int i9 = i7 - 1;
            }
            if (((int) ((i4 + i6) * bVar.f740p)) > i8 - 1) {
                int i10 = i8 - 1;
            }
            if (this.f802m >= 0.4d) {
                boolean z = this.f802m != 1.0f;
                if (z) {
                    lVar.mo127h();
                    lVar.mo200a(this.f802m, this.f802m);
                }
                if (z) {
                    lVar.mo126i();
                }
            }
        }
    }

    /* renamed from: b */
    public void m3632b(int i, int i2) {
        C0152d dVar = C0148b.f781ad.f793d[i][i2];
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        dVar.f819n = true;
        this.f792c.mo146b(-16777216);
        C0748e eVar = u.f5522bE.f4467J;
        if (eVar != null) {
            Rect rect = new Rect();
            RectF rectF = new RectF();
            rect.m4136a((int) (((this.f795f + (i * this.f800k)) / (bVar.f735k * bVar.f750y)) * eVar.f5245k), (int) (((this.f796g + (i2 * this.f800k)) / (bVar.f736l * bVar.f751z)) * eVar.f5246l), (int) (((this.f795f + ((i + 1) * this.f800k)) / (bVar.f735k * bVar.f750y)) * eVar.f5245k), (int) (((this.f796g + ((i2 + 1) * this.f800k)) / (bVar.f736l * bVar.f751z)) * eVar.f5246l));
            rectF.m4122a(0.0f, 0.0f, this.f797h, this.f797h);
            this.f792c.mo169a(eVar, rect, rectF, this.f794e);
        }
        this.f792c.mo122m();
        if (AbstractC0789l.f5472aG) {
            dVar.f806a.mo191a(0, PorterDuff.Mode.CLEAR);
        }
        dVar.f806a.mo140b(this.f791b, 0.0f, 0.0f, (Paint) null);
        dVar.f809d.mo47o();
    }

    /* renamed from: c */
    public void m3628c(int i, int i2) {
        m3627c(i, i2, this.f792c);
    }

    /* renamed from: c */
    public void m3627c(int i, int i2, AbstractC0755l lVar) {
        C0152d dVar = C0148b.f781ad.f793d[i][i2];
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        boolean z = false;
        if (u.f5516by.renderFancyWater) {
            z = true;
        }
        if (AbstractC0789l.m637v() || AbstractC0789l.m636w()) {
            z = true;
        }
        if (z) {
            lVar.mo191a(0, PorterDuff.Mode.CLEAR);
        } else {
            boolean z2 = false;
            if (AbstractC0789l.m637v()) {
                z2 = true;
            }
            if (AbstractC0789l.f5473aH) {
                z2 = true;
            }
            if (C0623f.f4403bw) {
            }
            if (bVar.f752A) {
            }
            if (z2) {
                lVar.mo146b(-16777216);
            }
        }
        if (AbstractC0789l.f5473aH) {
            lVar.mo191a(0, PorterDuff.Mode.CLEAR);
        }
        int i3 = this.f795f + (i * this.f800k);
        int i4 = this.f796g + (i2 * this.f800k);
        boolean z3 = false;
        boolean z4 = false;
        if (!bVar.f742r.f848w) {
            z3 = true;
        }
        if (bVar.f752A) {
            z4 = true;
        }
        if (z3) {
            lVar.mo151a(true);
        }
        bVar.f742r.m3615a(lVar, i3, i4, i3, i4, this.f798i, this.f798i, this.f802m, this.f802m, bVar.f752A, false, false);
        if (bVar.f743s != null) {
            if (z3 && bVar.f743s.f848w) {
                lVar.mo131e();
                AbstractC0789l.m670d("Ending blit early");
            }
            bVar.f743s.m3615a(lVar, i3, i4, i3, i4, this.f798i, this.f798i, this.f802m, this.f802m, bVar.f752A, false, false);
        }
        Iterator it = bVar.f746v.iterator();
        while (it.hasNext()) {
            C0153e eVar = (C0153e) it.next();
            if (eVar.f838m) {
                if (z3 && eVar.f848w) {
                    lVar.mo131e();
                    AbstractC0789l.m670d("Ending blit early");
                }
                eVar.m3615a(lVar, i3, i4, i3, i4, this.f798i, this.f798i, this.f802m, this.f802m, bVar.f752A, false, false);
            }
        }
        m3637a(i, i2, lVar);
        if (bVar.f752A) {
            if (z4) {
                lVar.mo151a(false);
            }
            bVar.f742r.m3615a(lVar, i3, i4, i3, i4, this.f798i, this.f798i, this.f802m, this.f802m, bVar.f752A, true, true);
        }
        if (z3 || z4) {
            lVar.mo131e();
        }
        if (u.f5518bA.m1759D()) {
            m3631b(i, i2, lVar);
        }
        dVar.f816k = false;
        dVar.f817l = false;
        dVar.f818m = 0;
        dVar.f819n = false;
        lVar.mo122m();
        if (z || AbstractC0789l.f5472aG) {
            dVar.f806a.mo191a(0, PorterDuff.Mode.CLEAR);
        }
        dVar.f806a.mo140b(this.f791b, 0.0f, 0.0f, (Paint) null);
        dVar.f809d.mo47o();
        if (C0148b.f727c) {
            dVar.f806a.mo158a("" + dVar.f808c, 40.0f, 40.0f, C0148b.f729e);
        }
        dVar.f808c++;
    }

    /* renamed from: d */
    public void m3626d() {
        if (!AbstractC0789l.f5471aF || AbstractC0789l.f5473aH || AbstractC0789l.f5474aI) {
            AbstractC0789l u = AbstractC0789l.m638u();
            int max = Math.max((int) u.f5556cm, (int) u.f5558co) + 3;
            if (this.f793d != null && this.f797h * this.f790a < max + this.f797h + 1) {
                AbstractC0789l.m681b("map", "screen must have changed size, layerBufferSize too small at " + this.f790a + ", adding to LayerBitmapBuffer");
                AbstractC0789l.m681b("map", "new viewpoint:" + u.f5556cm + ", " + u.f5558co);
                m3629c(this.f790a + 1);
            }
            if (this.f793d == null) {
                AbstractC0789l.m681b("map", "setupLayerBuffers for size:" + max);
                long nanoTime = System.nanoTime();
                if (AbstractC0789l.f5473aH || AbstractC0789l.f5474aI) {
                    this.f797h = 1024;
                    this.f790a = (int) ((max / this.f797h) + 1.5f);
                } else {
                    max = Math.max(600, max);
                    this.f797h = (max / (this.f790a - 2)) + 7 + 4;
                    this.f797h = ((int) ((this.f797h * (1.0f / 20)) + 0.5f)) * 20;
                }
                if (this.f797h * this.f790a < max + this.f797h + 1) {
                    AbstractC0789l.m682b("layerBufferSize is too small");
                    AbstractC0789l.m682b("layerBufferCount:" + this.f790a);
                    AbstractC0789l.m682b("(layerBufferSize*(layerBufferCount):" + (this.f797h * this.f790a));
                    AbstractC0789l.m682b("longest+layerBufferSize+1:" + (max + this.f797h + 1));
                    AbstractC0789l.m682b("longest:" + max);
                    if (AbstractC0789l.f5473aH || AbstractC0789l.f5474aI) {
                        this.f790a++;
                    } else {
                        this.f797h += 100;
                    }
                }
                AbstractC0789l.m670d("layerBufferSize:" + this.f797h);
                this.f799j = this.f797h - 4;
                AbstractC0789l.m682b("layerBuffer:" + this.f790a + "x" + this.f790a + " = " + (this.f790a * this.f790a) + (C0148b.f755D ? " x2 for soft fade " : ""));
                this.f793d = new C0152d[this.f790a][this.f790a];
                boolean z = false;
                if (u.f5516by.renderFancyWater) {
                    z = true;
                }
                if (AbstractC0789l.m637v() || AbstractC0789l.m636w()) {
                    z = true;
                }
                if (z) {
                    this.f791b = u.f5514bw.mo192a(this.f797h, this.f797h, true);
                } else {
                    this.f791b = u.f5514bw.mo192a(this.f797h, this.f797h, false);
                }
                this.f792c = u.f5514bw.mo177a(this.f791b);
                m3624f();
                AbstractC0789l.m670d("----- layerBuffers create in:" + ((System.nanoTime() - nanoTime) / 1000000.0d) + " ms");
            }
        }
    }

    /* renamed from: c */
    public void m3629c(int i) {
        if (i < this.f790a) {
            AbstractC0789l.m663f("newLayerBufferCount:" + i);
            return;
        }
        C0152d[][] dVarArr = new C0152d[i][i];
        for (int i2 = 0; i2 < this.f790a; i2++) {
            for (int i3 = 0; i3 < this.f790a; i3++) {
                dVarArr[i2][i3] = this.f793d[i2][i3];
            }
        }
        this.f793d = dVarArr;
        this.f790a = i;
        m3624f();
    }

    /* renamed from: e */
    public void m3625e() {
        C0148b.f755D = false;
        for (int i = 0; i < this.f790a; i++) {
            for (int i2 = 0; i2 < this.f790a; i2++) {
                C0152d dVar = this.f793d[i][i2];
                if (dVar != null) {
                    if (dVar.f811f != null) {
                        dVar.f811f.mo121n();
                        dVar.f811f = null;
                    }
                    if (dVar.f810e != null) {
                        dVar.f810e.mo48n();
                        dVar.f810e = null;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void m3624f() {
        AbstractC0789l u = AbstractC0789l.m638u();
        ArrayList arrayList = null;
        for (int i = 0; i < this.f790a; i++) {
            for (int i2 = 0; i2 < this.f790a; i2++) {
                if (this.f793d[i][i2] == null) {
                    C0152d dVar = new C0152d(this, i, i2);
                    dVar.f807b = this.f805p;
                    this.f805p++;
                    this.f793d[i][i2] = dVar;
                    if (u.f5516by.renderFancyWater) {
                        dVar.f809d = u.f5514bw.mo192a(this.f797h, this.f797h, true);
                    } else {
                        dVar.f809d = u.f5514bw.mo192a(this.f797h, this.f797h, false);
                    }
                    dVar.f806a = u.f5514bw.mo177a(dVar.f809d);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(dVar);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0152d dVar2 = (C0152d) it.next();
                if (C0148b.f755D) {
                    try {
                        dVar2.m3622a();
                    } catch (OutOfMemoryError e) {
                        e.printStackTrace();
                        C0148b.f756E = true;
                        m3625e();
                        AbstractC0789l.m682b("Not enough free memory to enable smooth fog fading");
                        System.gc();
                    }
                }
            }
        }
        m3642a();
    }

    /* renamed from: g */
    public float m3623g() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u.f5574cE > 1.0f) {
            return 1.0f;
        }
        return u.f5574cE;
    }

    /* renamed from: a */
    public void m3641a(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        Long l = null;
        boolean z = false;
        float g = m3623g();
        boolean z2 = false;
        float f2 = g / this.f802m;
        if (C0654f.m1459c(f2 - 1.0f) < 0.01f) {
            f2 = 1.0f;
        }
        if (g > 0.6d) {
            float f3 = 0.3f;
            if (AbstractC0789l.m697al()) {
                f3 = 0.1f;
            }
            if (g - this.f802m > f3) {
                z2 = true;
            }
            if (g == 1.0f && this.f802m != 1.0f) {
                z2 = true;
            }
        }
        if (f2 != 1.0f) {
            int i = 10;
            float f4 = 0.03f;
            if (g < 0.3f) {
                i = 20;
                f4 = 0.09f;
            } else if (g < 0.5f) {
                i = 20;
                f4 = 0.07f;
            }
            if (g > 1.3f) {
                i = 7;
            }
            if (!AbstractC0789l.m697al()) {
                i += 10;
            }
            if (C0654f.m1459c(bVar.f779ab - g) > 0.03f) {
                bVar.f779ab = u.f5574cE;
                bVar.f780ac = 0;
            } else {
                bVar.f780ac++;
            }
            if (bVar.f780ac < 3) {
                bVar.f778aa = 0.0f;
            } else if (C0654f.m1459c(g - this.f802m) > f4) {
                bVar.f778aa += 1.0f;
            }
            if (bVar.f778aa > i) {
                bVar.f778aa = 0.0f;
                z2 = true;
            }
        }
        if (u.f5545cb + u.f5551ch + 4.0f > this.f795f + (this.f790a * this.f800k)) {
            this.f795f += this.f800k;
            m3633b(1);
        }
        if (u.f5545cb - 1 < this.f795f) {
            this.f795f -= this.f800k;
            m3633b(-1);
        }
        if (u.f5546cc + u.f5552ci + 4.0f > this.f796g + (this.f790a * this.f800k)) {
            this.f796g += this.f800k;
            m3640a(1);
        }
        if (u.f5546cc - 1 < this.f796g) {
            this.f796g -= this.f800k;
            m3640a(-1);
        }
        if (u.f5545cb + u.f5551ch + 4.0f > this.f795f + (this.f790a * this.f800k)) {
            z2 = true;
        }
        if (u.f5545cb - 1 < this.f795f) {
            z2 = true;
        }
        if (u.f5546cc + u.f5552ci + 4.0f > this.f796g + (this.f790a * this.f800k)) {
            z2 = true;
        }
        if (u.f5546cc - 1 < this.f796g) {
            z2 = true;
        }
        if (z2) {
            m3642a();
        }
        float f5 = u.f5574cE / this.f802m;
        if (C0654f.m1459c(f5 - 1.0f) < 1.0E-4f) {
            f5 = 1.0f;
        }
        float f6 = (u.f5556cm / f5) + 2.0f;
        float f7 = (u.f5558co / f5) + 2.0f;
        if (f5 != 1.0f) {
            u.f5514bw.mo125j();
            u.f5514bw.mo200a(f5, f5);
            bVar.f784ag.m4135a(u.f5561cr);
            bVar.f784ag.f229c = ((int) (bVar.f784ag.f227a + (bVar.f784ag.m4134b() / f5))) + 2;
            bVar.f784ag.f230d = ((int) (bVar.f784ag.f228b + (bVar.f784ag.m4130c() / f5))) + 2;
            u.f5514bw.mo182a(bVar.f784ag);
        }
        float f8 = (this.f795f - u.f5547cd) * this.f802m;
        float f9 = (this.f796g - u.f5548ce) * this.f802m;
        float f10 = (int) f8;
        float f11 = (int) f9;
        int i2 = 0;
        boolean z3 = false;
        if (AbstractC0789l.m697al() && u.f5574cE < 0.3d) {
            z3 = true;
        }
        this.f794e.m4173a(z3);
        this.f794e.m4158d(z3);
        this.f794e.m4166b(z3);
        for (int i3 = 0; i3 < this.f790a; i3++) {
            for (int i4 = 0; i4 < this.f790a; i4++) {
                C0152d dVar = this.f793d[i3][i4];
                int i5 = (int) (f10 + (i3 * this.f800k * this.f802m));
                int i6 = (int) (f11 + (i4 * this.f800k * this.f802m));
                if (dVar.f817l && !this.f803n) {
                    dVar.f818m++;
                }
                dVar.f821p.m4136a(i5 + 1, i6 + 1, (i5 + this.f797h) - 2, (i6 + this.f797h) - 2);
                if (dVar.f821p.f227a <= f6 && dVar.f821p.f228b <= f7) {
                    if (dVar.f821p.f229c > f6) {
                        dVar.f821p.f229c = (int) f6;
                    }
                    if (dVar.f821p.f230d > f7) {
                        dVar.f821p.f230d = (int) f7;
                    }
                    int i7 = (int) ((0.0f - u.f5547cd) * this.f802m);
                    int i8 = (int) ((0.0f - u.f5548ce) * this.f802m);
                    int f12 = (int) ((bVar.m3649f() - u.f5547cd) * this.f802m);
                    int g2 = (int) ((bVar.m3646g() - u.f5548ce) * this.f802m);
                    if (dVar.f821p.f227a < i7) {
                        dVar.f821p.f227a = i7;
                    }
                    if (dVar.f821p.f228b < i8) {
                        dVar.f821p.f228b = i8;
                    }
                    if (dVar.f821p.f229c > f12) {
                        dVar.f821p.f229c = f12;
                    }
                    if (dVar.f821p.f230d > g2) {
                        dVar.f821p.f230d = g2;
                    }
                    if (!dVar.f821p.m4138a()) {
                        boolean z4 = false;
                        boolean z5 = true;
                        if (dVar.f816k) {
                            z4 = true;
                            z5 = false;
                        }
                        if (dVar.f817l) {
                            int i9 = 10;
                            if (i2 > 3) {
                                i9 = 10 + 2;
                            }
                            if (i2 > 6) {
                                i9 += 2;
                            }
                            if (dVar.f818m > i9) {
                                dVar.f818m = 0;
                                z4 = true;
                                i2++;
                            }
                        }
                        if (z4) {
                            z = true;
                            boolean z6 = false;
                            long a = C0586bj.m1919a();
                            if (l == null) {
                                l = Long.valueOf(a);
                            } else {
                                int i10 = 200;
                                if (this.f803n) {
                                    i10 = 30;
                                }
                                if (C0586bj.m1916a(l.longValue(), a) > i10) {
                                    z6 = true;
                                    this.f803n = true;
                                }
                            }
                            if (z6 && dVar.f816k && !dVar.f819n) {
                                m3632b(i3, i4);
                            }
                            if (!z6) {
                                if (C0148b.f755D) {
                                    if (!(dVar.f810e == null || dVar.f810e.f5245k == dVar.f809d.f5245k)) {
                                        AbstractC0789l.m670d("wrong sized fadeOutBitmap width:" + dVar.f810e.f5245k + " vs " + dVar.f809d.f5245k);
                                        dVar.f810e.mo48n();
                                        dVar.f810e = null;
                                    }
                                    if (dVar.f810e == null) {
                                        try {
                                            dVar.m3622a();
                                        } catch (OutOfMemoryError e) {
                                            e.printStackTrace();
                                            AbstractC0789l.m721a(EnumC0805u.gameImageCreate, e);
                                            m3625e();
                                            AbstractC0789l.m682b("Not enough free memory to keep smooth fog fading");
                                            System.gc();
                                        }
                                        if (C0148b.f755D && dVar.f810e == null) {
                                            u.m657h("Disabling smooth fog fading due to error");
                                            m3625e();
                                            AbstractC0789l.m682b("fadeOutBitmap == null");
                                            System.gc();
                                        }
                                    }
                                }
                                if (C0148b.f755D) {
                                    if (dVar.f812g > 0.0f) {
                                    }
                                    C0748e eVar = dVar.f809d;
                                    dVar.f809d = dVar.f810e;
                                    dVar.f810e = eVar;
                                    AbstractC0755l lVar = dVar.f806a;
                                    dVar.f806a = dVar.f811f;
                                    dVar.f811f = lVar;
                                    if (z5) {
                                        dVar.f812g = 1.0f;
                                    } else {
                                        dVar.f812g = 0.0f;
                                    }
                                } else {
                                    dVar.f812g = 0.0f;
                                }
                                m3628c(i3, i4);
                                if (C0148b.f725a) {
                                    C0586bj.m1914a("re-drawTile", a);
                                }
                            }
                        }
                        dVar.f820o.m4135a(dVar.f821p);
                        dVar.f820o.m4137a(-i5, -i6);
                        dVar.f822q.m4121a(dVar.f821p);
                        dVar.f822q.m4123a(-f10, -f11);
                        dVar.f822q.m4123a(f8, f9);
                        if (dVar.f812g > 0.0f) {
                            dVar.f813h.m4173a(z3);
                            dVar.f813h.m4164c((int) ((1.0f - dVar.f812g) * 255.0f));
                            u.f5514bw.mo169a(dVar.f810e, dVar.f820o, dVar.f822q, this.f794e);
                            if (dVar.f812g < 0.98d) {
                                u.f5514bw.mo169a(dVar.f809d, dVar.f820o, dVar.f822q, dVar.f813h);
                            }
                            dVar.f812g -= 0.1f * f;
                        } else {
                            u.f5514bw.mo169a(dVar.f809d, dVar.f820o, dVar.f822q, this.f794e);
                        }
                    }
                }
            }
        }
        if (f5 != 1.0f) {
            u.f5514bw.mo124k();
        }
        if (!z) {
            this.f803n = false;
        }
    }
}
