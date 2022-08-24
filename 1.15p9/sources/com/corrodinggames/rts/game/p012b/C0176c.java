package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.C1028z;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/c.class */
public class C0176c {

    /* renamed from: f */
    int f854f;

    /* renamed from: g */
    int f855g;

    /* renamed from: h */
    int f856h;

    /* renamed from: i */
    int f857i;

    /* renamed from: j */
    int f858j;

    /* renamed from: k */
    int f859k;

    /* renamed from: l */
    float f860l;

    /* renamed from: n */
    boolean f861n;

    /* renamed from: a */
    int f862a = 7;

    /* renamed from: b */
    public C0934e f863b = null;

    /* renamed from: c */
    public InterfaceC1027y f864c = null;

    /* renamed from: d */
    C0177d[][] f865d = null;

    /* renamed from: e */
    public C0930ag f866e = new C0930ag();

    /* renamed from: m */
    float f867m = 1.0f;

    /* renamed from: o */
    Rect f868o = new Rect();

    /* renamed from: p */
    int f869p = 0;

    /* renamed from: a */
    public void m5829a() {
        GameEngine m1228A = GameEngine.m1228A();
        this.f867m = m5810g();
        if (this.f867m > 1.0f) {
        }
        this.f857i = (int) (this.f856h / this.f867m);
        this.f859k = (int) (this.f858j / this.f867m);
        this.f860l = 1.0f / this.f859k;
        this.f854f = m1228A.f6136ct - (this.f857i / 2);
        this.f855g = m1228A.f6137cu - (this.f857i / 2);
        float f = 1.0f / 20;
        this.f854f = ((int) (this.f854f * f)) * 20;
        this.f855g = ((int) (this.f855g * f)) * 20;
        for (int i = 0; i < this.f862a; i++) {
            for (int i2 = 0; i2 < this.f862a; i2++) {
                C0177d c0177d = this.f865d[i][i2];
                c0177d.f880k = true;
                c0177d.f883n = false;
            }
        }
    }

    /* renamed from: b */
    public void m5821b() {
        for (int i = 0; i < this.f862a; i++) {
            for (int i2 = 0; i2 < this.f862a; i2++) {
                C0177d c0177d = this.f865d[i][i2];
                c0177d.f878i = i;
                c0177d.f879j = i2;
            }
        }
    }

    /* renamed from: a */
    public void m5827a(int i) {
        C0177d[] c0177dArr = new C0177d[this.f862a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.f862a; i2++) {
                c0177dArr[i2] = this.f865d[i2][0];
            }
            for (int i3 = 1; i3 < this.f862a; i3++) {
                for (int i4 = 0; i4 < this.f862a; i4++) {
                    this.f865d[i4][i3 - 1] = this.f865d[i4][i3];
                }
            }
            for (int i5 = 0; i5 < this.f862a; i5++) {
                this.f865d[i5][this.f862a - 1] = c0177dArr[i5];
            }
            for (int i6 = 0; i6 < this.f862a; i6++) {
                this.f865d[i6][this.f862a - 1].f880k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.f862a; i7++) {
                c0177dArr[i7] = this.f865d[i7][this.f862a - 1];
            }
            for (int i8 = this.f862a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.f862a; i9++) {
                    this.f865d[i9][i8 + 1] = this.f865d[i9][i8];
                }
            }
            for (int i10 = 0; i10 < this.f862a; i10++) {
                this.f865d[i10][0] = c0177dArr[i10];
            }
            for (int i11 = 0; i11 < this.f862a; i11++) {
                this.f865d[i11][0].f880k = true;
            }
        }
        m5821b();
    }

    /* renamed from: b */
    public void m5820b(int i) {
        C0177d[] c0177dArr = new C0177d[this.f862a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.f862a; i2++) {
                c0177dArr[i2] = this.f865d[0][i2];
            }
            for (int i3 = 1; i3 < this.f862a; i3++) {
                for (int i4 = 0; i4 < this.f862a; i4++) {
                    this.f865d[i3 - 1][i4] = this.f865d[i3][i4];
                }
            }
            for (int i5 = 0; i5 < this.f862a; i5++) {
                this.f865d[this.f862a - 1][i5] = c0177dArr[i5];
            }
            for (int i6 = 0; i6 < this.f862a; i6++) {
                this.f865d[this.f862a - 1][i6].f880k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.f862a; i7++) {
                c0177dArr[i7] = this.f865d[this.f862a - 1][i7];
            }
            for (int i8 = this.f862a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.f862a; i9++) {
                    this.f865d[i8 + 1][i9] = this.f865d[i8][i9];
                }
            }
            for (int i10 = 0; i10 < this.f862a; i10++) {
                this.f865d[0][i10] = c0177dArr[i10];
            }
            for (int i11 = 0; i11 < this.f862a; i11++) {
                this.f865d[0][i11].f880k = true;
            }
        }
        m5821b();
    }

    /* renamed from: a */
    public C0177d m5826a(int i, int i2) {
        if (i < 0 || i >= this.f862a || i2 < 0 || i2 >= this.f862a || this.f865d == null) {
            return null;
        }
        return this.f865d[i][i2];
    }

    /* renamed from: a */
    public void m5823a(int i, int i2, boolean z) {
        C0173b c0173b = GameEngine.m1228A().f6104bL;
        int i3 = c0173b.f784n;
        int i4 = c0173b.f785o;
        int i5 = i * i3;
        int i6 = i2 * i4;
        m5825a((i5 - this.f854f) - i3, (i6 - this.f855g) - i4, 3 * i3, 3 * i4, z);
    }

    /* renamed from: c */
    public void m5817c() {
        if (this.f865d != null) {
            for (int i = 0; i < this.f862a; i++) {
                for (int i2 = 0; i2 < this.f862a; i2++) {
                    this.f865d[i][i2].f880k = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m5825a(int i, int i2, int i3, int i4, boolean z) {
        C0177d m5826a;
        C0177d m5826a2;
        C0177d m5826a3;
        int i5 = (int) (i * this.f860l);
        int i6 = (int) (i2 * this.f860l);
        C0177d m5826a4 = m5826a(i5, i6);
        if (m5826a4 != null) {
            if (z) {
                m5826a4.f881l = true;
            } else {
                m5826a4.f880k = true;
            }
            boolean z2 = false;
            boolean z3 = false;
            if (i + i3 >= (m5826a4.f878i * this.f859k) + this.f857i) {
                z2 = true;
            }
            if (i2 + i4 >= (m5826a4.f879j * this.f859k) + this.f857i) {
                z3 = true;
            }
            if (z2 && (m5826a3 = m5826a(i5 + 1, i6)) != null) {
                if (z) {
                    m5826a3.f881l = true;
                } else {
                    m5826a3.f880k = true;
                }
            }
            if (z3 && (m5826a2 = m5826a(i5, i6 + 1)) != null) {
                if (z) {
                    m5826a2.f881l = true;
                } else {
                    m5826a2.f880k = true;
                }
            }
            if (z2 && z3 && (m5826a = m5826a(i5 + 1, i6 + 1)) != null) {
                if (z) {
                    m5826a.f881l = true;
                } else {
                    m5826a.f880k = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m5822a(C0195l c0195l) {
        RectF m5676c = c0195l.m5676c();
        for (int i = 0; i < this.f862a; i++) {
            for (int i2 = 0; i2 < this.f862a; i2++) {
                if (this.f865d != null) {
                    C0177d c0177d = this.f865d[i][i2];
                    if (C0758f.m2348a(c0177d.m5808b(), m5676c)) {
                        boolean z = this.f867m != 1.0f;
                        if (z) {
                        }
                        c0195l.m5680a(c0177d.f870a, c0177d.m5807c(), c0177d.m5806d(), this.f867m);
                        c0177d.f873d.mo387p();
                        if (z) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m5824a(int i, int i2, InterfaceC1027y interfaceC1027y) {
        C0177d c0177d = this.f865d[i][i2];
        boolean z = this.f867m != 1.0f;
        if (z) {
        }
        Rect m5808b = c0177d.m5808b();
        C0758f.m2349a(m5808b, 95.0f);
        AbstractC1120w[] m533a = AbstractC1120w.f6956en.m533a();
        int size = AbstractC1120w.f6956en.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1120w abstractC1120w = m533a[i3];
            if (abstractC1120w instanceof C0195l) {
                C0195l c0195l = (C0195l) abstractC1120w;
                if (m5808b.m6444b((int) c0195l.f6951ek, (int) c0195l.f6952el)) {
                    c0195l.m5680a(interfaceC1027y, c0177d.m5807c(), c0177d.m5806d(), this.f867m);
                }
            }
        }
        if (z) {
        }
    }

    /* renamed from: b */
    public void m5818b(int i, int i2, InterfaceC1027y interfaceC1027y) {
        GameEngine m1228A = GameEngine.m1228A();
        C0173b c0173b = m1228A.f6104bL;
        if (m1228A.f6111bS.m2069E()) {
            int i3 = this.f854f + (i * this.f859k);
            int i4 = this.f855g + (i2 * this.f859k);
            int i5 = this.f857i;
            int i6 = this.f857i;
            int i7 = c0173b.f832u.f903n;
            int i8 = c0173b.f832u.f904o;
            if (((int) (i3 * c0173b.f788r)) < 0) {
            }
            if (((int) (i4 * c0173b.f789s)) < 0) {
            }
            if (((int) ((i3 + i5) * c0173b.f788r)) > i7 - 1) {
                int i9 = i7 - 1;
            }
            if (((int) ((i4 + i6) * c0173b.f789s)) > i8 - 1) {
                int i10 = i8 - 1;
            }
            if (this.f867m < 0.4d) {
                return;
            }
            boolean z = this.f867m != 1.0f;
            if (z) {
                interfaceC1027y.mo874i();
                interfaceC1027y.mo929a(this.f867m, this.f867m);
            }
            if (z) {
                interfaceC1027y.mo873j();
            }
        }
    }

    /* renamed from: b */
    public void m5819b(int i, int i2) {
        C0177d c0177d = C0173b.f829al.f865d[i][i2];
        GameEngine m1228A = GameEngine.m1228A();
        C0173b c0173b = m1228A.f6104bL;
        c0177d.f883n = true;
        this.f864c.mo888b(-16777216);
        C0934e c0934e = m1228A.f6115bW.f5289J;
        if (c0934e != null) {
            Rect rect = new Rect();
            RectF rectF = new RectF();
            rect.m6447a((int) (((this.f854f + (i * this.f859k)) / (c0173b.f784n * c0173b.f791C)) * c0934e.f6396p), (int) (((this.f855g + (i2 * this.f859k)) / (c0173b.f785o * c0173b.f792D)) * c0934e.f6397q), (int) (((this.f854f + ((i + 1) * this.f859k)) / (c0173b.f784n * c0173b.f791C)) * c0934e.f6396p), (int) (((this.f855g + ((i2 + 1) * this.f859k)) / (c0173b.f785o * c0173b.f792D)) * c0934e.f6397q));
            rectF.m6434a(0.0f, 0.0f, this.f856h, this.f856h);
            this.f864c.mo903a(c0934e, rect, rectF, this.f866e);
        }
        this.f864c.mo867p();
        if (GameEngine.f6201aW) {
            c0177d.f870a.mo921a(0, PorterDuff.Mode.CLEAR);
        }
        c0177d.f870a.mo884b(this.f863b, 0.0f, 0.0f, (Paint) null);
        c0177d.f873d.mo387p();
    }

    /* renamed from: c */
    public void m5815c(int i, int i2) {
        m5814c(i, i2, this.f864c);
    }

    /* renamed from: c */
    public void m5814c(int i, int i2, InterfaceC1027y interfaceC1027y) {
        C0177d c0177d = C0173b.f829al.f865d[i][i2];
        GameEngine m1228A = GameEngine.m1228A();
        C0173b c0173b = m1228A.f6104bL;
        boolean z = false;
        if (m1228A.f6109bQ.renderFancyWater) {
            z = true;
        }
        if (GameEngine.m1227B() || GameEngine.m1226C()) {
            z = true;
        }
        if (z) {
            interfaceC1027y.mo921a(0, PorterDuff.Mode.CLEAR);
        } else {
            boolean z2 = false;
            if (GameEngine.m1227B()) {
                z2 = true;
            }
            if (GameEngine.f6202aX) {
                z2 = true;
            }
            if (C0797f.f5187bA) {
            }
            if (c0173b.f840E) {
            }
            if (z2) {
                interfaceC1027y.mo888b(-16777216);
            }
        }
        if (GameEngine.f6202aX) {
            interfaceC1027y.mo921a(0, PorterDuff.Mode.CLEAR);
        }
        int i3 = this.f854f + (i * this.f859k);
        int i4 = this.f855g + (i2 * this.f859k);
        boolean z3 = false;
        boolean z4 = false;
        if (!c0173b.f832u.f912w) {
            z3 = true;
        }
        if (c0173b.f840E) {
            z4 = true;
        }
        if (C0173b.f820d) {
            z3 = false;
            z4 = false;
        }
        if (z3) {
            interfaceC1027y.mo893a(true);
        }
        c0173b.f832u.m5802a(interfaceC1027y, i3, i4, i3, i4, this.f857i, this.f857i, this.f867m, this.f867m, c0173b.f840E, false, false);
        if (c0173b.f833v != null) {
            if (z3 && c0173b.f833v.f912w) {
                interfaceC1027y.mo877f();
                GameEngine.PrintLog("Ending blit early");
            }
            c0173b.f833v.m5802a(interfaceC1027y, i3, i4, i3, i4, this.f857i, this.f857i, this.f867m, this.f867m, c0173b.f840E, false, false);
        }
        if (c0173b.f834w != null) {
            if (z3 && c0173b.f834w.f912w) {
                interfaceC1027y.mo877f();
                GameEngine.PrintLog("Ending blit early");
            }
            c0173b.f834w.m5802a(interfaceC1027y, i3, i4, i3, i4, this.f857i, this.f857i, this.f867m, this.f867m, c0173b.f840E, false, false);
        }
        Iterator it = c0173b.f836z.iterator();
        while (it.hasNext()) {
            C0178e c0178e = (C0178e) it.next();
            if (c0178e.f902m) {
                if (z3 && c0178e.f912w) {
                    interfaceC1027y.mo877f();
                    GameEngine.PrintLog("Ending blit early");
                }
                c0178e.m5802a(interfaceC1027y, i3, i4, i3, i4, this.f857i, this.f857i, this.f867m, this.f867m, c0173b.f840E, false, false);
            }
        }
        m5824a(i, i2, interfaceC1027y);
        if (c0173b.f840E) {
            if (z4) {
                interfaceC1027y.mo893a(false);
            }
            c0173b.f832u.m5802a(interfaceC1027y, i3, i4, i3, i4, this.f857i, this.f857i, this.f867m, this.f867m, c0173b.f840E, true, true);
        }
        if (z3 || z4) {
            interfaceC1027y.mo877f();
        }
        if (m1228A.f6111bS.m2069E()) {
            m5818b(i, i2, interfaceC1027y);
        }
        c0177d.f880k = false;
        c0177d.f881l = false;
        c0177d.f882m = 0;
        c0177d.f883n = false;
        interfaceC1027y.mo867p();
        if (z || GameEngine.f6201aW) {
            c0177d.f870a.mo921a(0, PorterDuff.Mode.CLEAR);
        }
        c0177d.f870a.mo884b(this.f863b, 0.0f, 0.0f, (Paint) null);
        c0177d.f873d.mo387p();
        if (C0173b.f819c) {
            c0177d.f870a.mo897a(VariableScope.nullOrMissingString + c0177d.f872c, 40.0f, 40.0f, C0173b.f823h);
        }
        c0177d.f872c++;
    }

    /* renamed from: d */
    public void m5813d() {
        if (GameEngine.f6199aU && !GameEngine.f6202aX && !GameEngine.f6203aY) {
            return;
        }
        GameEngine m1228A = GameEngine.m1228A();
        int max = Math.max((int) m1228A.f6147cE, (int) m1228A.f6149cG) + 3;
        if (this.f865d != null && this.f856h * this.f862a < max + this.f856h + 1) {
            GameEngine.m1138b("map", "screen must have changed size, layerBufferSize too small at " + this.f862a + ", adding to LayerBitmapBuffer");
            GameEngine.m1138b("map", "new viewpoint:" + m1228A.f6147cE + ", " + m1228A.f6149cG);
            m5816c(this.f862a + 1);
        }
        if (this.f865d == null) {
            GameEngine.m1138b("map", "setupLayerBuffers for size:" + max);
            long nanoTime = System.nanoTime();
            if (GameEngine.f6202aX || GameEngine.f6203aY) {
                this.f856h = 1024;
                this.f862a = (int) ((max / this.f856h) + 1.5f);
            } else {
                max = Math.max(600, max);
                this.f856h = (max / (this.f862a - 2)) + 7 + 4;
                this.f856h = ((int) ((this.f856h * (1.0f / 20)) + 0.5f)) * 20;
            }
            if (this.f856h * this.f862a < max + this.f856h + 1) {
                GameEngine.m1139b("layerBufferSize is too small");
                GameEngine.m1139b("layerBufferCount:" + this.f862a);
                GameEngine.m1139b("(layerBufferSize*(layerBufferCount):" + (this.f856h * this.f862a));
                GameEngine.m1139b("longest+layerBufferSize+1:" + (max + this.f856h + 1));
                GameEngine.m1139b("longest:" + max);
                if (GameEngine.f6202aX || GameEngine.f6203aY) {
                    this.f862a++;
                } else {
                    this.f856h += 100;
                }
            }
            GameEngine.PrintLog("layerBufferSize:" + this.f856h);
            this.f858j = this.f856h - 4;
            GameEngine.m1139b("layerBuffer:" + this.f862a + "x" + this.f862a + " = " + (this.f862a * this.f862a) + (C0173b.f827I ? " x2 for soft fade " : VariableScope.nullOrMissingString));
            this.f865d = new C0177d[this.f862a][this.f862a];
            boolean z = false;
            if (m1228A.f6109bQ.renderFancyWater) {
                z = true;
            }
            if (GameEngine.m1227B() || GameEngine.m1226C()) {
                z = true;
            }
            if (this.f856h <= 0) {
                GameEngine.m1139b("layerBuffer buffer size was too small at: " + this.f856h);
                this.f856h = 512;
            }
            if (z) {
                this.f863b = m1228A.f6107bO.mo922a(this.f856h, this.f856h, true);
            } else {
                this.f863b = m1228A.f6107bO.mo922a(this.f856h, this.f856h, false);
            }
            this.f863b.m1034b(true);
            this.f864c = m1228A.f6107bO.mo885b(this.f863b);
            m5811f();
            GameEngine.PrintLog("----- layerBuffers create in:" + ((System.nanoTime() - nanoTime) / 1000000.0d) + " ms");
        }
    }

    /* renamed from: c */
    public void m5816c(int i) {
        if (i < this.f862a) {
            GameEngine.m1114g("newLayerBufferCount:" + i);
            return;
        }
        C0177d[][] c0177dArr = new C0177d[i][i];
        for (int i2 = 0; i2 < this.f862a; i2++) {
            for (int i3 = 0; i3 < this.f862a; i3++) {
                c0177dArr[i2][i3] = this.f865d[i2][i3];
            }
        }
        this.f865d = c0177dArr;
        this.f862a = i;
        m5811f();
    }

    /* renamed from: e */
    public void m5812e() {
        C0173b.f827I = false;
        C0173b.f828J = true;
        for (int i = 0; i < this.f862a; i++) {
            for (int i2 = 0; i2 < this.f862a; i2++) {
                C0177d c0177d = this.f865d[i][i2];
                if (c0177d != null) {
                    if (c0177d.f875f != null) {
                        c0177d.f875f.mo866q();
                        c0177d.f875f = null;
                    }
                    if (c0177d.f874e != null) {
                        c0177d.f874e.mo388o();
                        c0177d.f874e = null;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void m5811f() {
        GameEngine m1228A = GameEngine.m1228A();
        ArrayList arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f862a; i++) {
            for (int i2 = 0; i2 < this.f862a; i2++) {
                if (this.f865d[i][i2] == null) {
                    C0177d c0177d = new C0177d(this, i, i2);
                    c0177d.f871b = this.f869p;
                    this.f869p++;
                    this.f865d[i][i2] = c0177d;
                    if (this.f856h <= 0) {
                        GameEngine.m1139b("initMissingLayerBufferImages: layerBuffer buffer size was too small at: " + this.f856h);
                        this.f856h = 512;
                    }
                    if (z) {
                        c0177d.f873d = m1228A.f6107bO.mo865r();
                    } else if (m1228A.f6109bQ.renderFancyWater) {
                        c0177d.f873d = m1228A.f6107bO.mo922a(this.f856h, this.f856h, true);
                    } else {
                        c0177d.f873d = m1228A.f6107bO.mo922a(this.f856h, this.f856h, false);
                    }
                    c0177d.f873d.m1034b(true);
                    if (c0177d.f873d.mo413A()) {
                        if (!z) {
                            GameEngine.m1139b("initMissingLayerBufferImages: Failed to create map buffer at :" + this.f856h + "px");
                        }
                        c0177d.f870a = new C1028z();
                    } else {
                        try {
                            c0177d.f870a = m1228A.f6107bO.mo885b(c0177d.f873d);
                        } catch (OutOfMemoryError e) {
                            if (!z) {
                                GameEngine.m1189a(EnumC1065u.gameImageCreate, e);
                            }
                            z = true;
                            c0177d.f870a = new C1028z();
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0177d);
                }
            }
        }
        if (z && C0173b.f827I) {
            m5812e();
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0177d c0177d2 = (C0177d) it.next();
                if (C0173b.f827I) {
                    try {
                        c0177d2.m5809a();
                    } catch (OutOfMemoryError e2) {
                        m5812e();
                        GameEngine.m1139b("Not enough free memory to enable smooth fog fading");
                        System.gc();
                    }
                }
            }
        }
        m5829a();
    }

    /* renamed from: g */
    public float m5810g() {
        GameEngine m1228A = GameEngine.m1228A();
        if (m1228A.f6250cW > 1.0f) {
            return 1.0f;
        }
        return m1228A.f6250cW;
    }

    /* renamed from: a */
    public void m5828a(float f) {
        GameEngine m1228A = GameEngine.m1228A();
        C0173b c0173b = m1228A.f6104bL;
        Long l = null;
        boolean z = false;
        float m5810g = m5810g();
        boolean z2 = false;
        float f2 = m5810g / this.f867m;
        if (C0758f.m2291c(f2 - 1.0f) < 0.01f) {
            f2 = 1.0f;
        }
        if (m5810g > 0.6d) {
            float f3 = 0.3f;
            if (GameEngine.m1151au()) {
                f3 = 0.1f;
            }
            if (m5810g - this.f867m > f3) {
                z2 = true;
            }
            if (m5810g == 1.0f && this.f867m != 1.0f) {
                z2 = true;
            }
        }
        if (f2 != 1.0f) {
            int i = 10;
            float f4 = 0.03f;
            if (m5810g < 0.3f) {
                i = 20;
                f4 = 0.09f;
            } else if (m5810g < 0.5f) {
                i = 20;
                f4 = 0.07f;
            }
            if (m5810g > 1.3f) {
                i = 7;
            }
            if (!GameEngine.m1151au()) {
                i += 10;
            }
            if (C0758f.m2291c(c0173b.f847aj - m5810g) > 0.03f) {
                c0173b.f847aj = m1228A.f6250cW;
                c0173b.f848ak = 0;
            } else {
                c0173b.f848ak++;
            }
            if (c0173b.f848ak < 3) {
                c0173b.f813ai = 0.0f;
            } else if (C0758f.m2291c(m5810g - this.f867m) > f4) {
                c0173b.f813ai += 1.0f;
            }
            if (c0173b.f813ai > i) {
                c0173b.f813ai = 0.0f;
                z2 = true;
            }
        }
        if (m1228A.f6136ct + m1228A.f6142cz + 4.0f > this.f854f + (this.f862a * this.f859k)) {
            this.f854f += this.f859k;
            m5820b(1);
        }
        if (m1228A.f6136ct - 1 < this.f854f) {
            this.f854f -= this.f859k;
            m5820b(-1);
        }
        if (m1228A.f6137cu + m1228A.f6143cA + 4.0f > this.f855g + (this.f862a * this.f859k)) {
            this.f855g += this.f859k;
            m5827a(1);
        }
        if (m1228A.f6137cu - 1 < this.f855g) {
            this.f855g -= this.f859k;
            m5827a(-1);
        }
        if (m1228A.f6136ct + m1228A.f6142cz + 4.0f > this.f854f + (this.f862a * this.f859k)) {
            z2 = true;
        }
        if (m1228A.f6136ct - 1 < this.f854f) {
            z2 = true;
        }
        if (m1228A.f6137cu + m1228A.f6143cA + 4.0f > this.f855g + (this.f862a * this.f859k)) {
            z2 = true;
        }
        if (m1228A.f6137cu - 1 < this.f855g) {
            z2 = true;
        }
        if (z2) {
            m5829a();
        }
        float f5 = m1228A.f6250cW / this.f867m;
        if (C0758f.m2291c(f5 - 1.0f) < 1.0E-4f) {
            f5 = 1.0f;
        }
        float f6 = (m1228A.f6147cE / f5) + 2.0f;
        float f7 = (m1228A.f6149cG / f5) + 2.0f;
        if (f5 != 1.0f) {
            m1228A.f6107bO.mo872k();
            m1228A.f6107bO.mo929a(f5, f5);
            c0173b.f851ao.m6446a(m1228A.f6241cJ);
            c0173b.f851ao.f232c = ((int) (c0173b.f851ao.f230a + (c0173b.f851ao.m6445b() / f5))) + 2;
            c0173b.f851ao.f233d = ((int) (c0173b.f851ao.f231b + (c0173b.f851ao.m6441c() / f5))) + 2;
            m1228A.f6107bO.mo917a(c0173b.f851ao);
        }
        float f8 = (this.f854f - m1228A.f6138cv) * this.f867m;
        float f9 = (this.f855g - m1228A.f6139cw) * this.f867m;
        float f10 = (int) f8;
        float f11 = (int) f9;
        int i2 = 0;
        boolean z3 = false;
        if (GameEngine.m1151au() && m1228A.f6250cW < 0.3d) {
            z3 = true;
        }
        this.f866e.mo6487a(z3);
        this.f866e.m6470d(z3);
        this.f866e.m6478b(z3);
        boolean z4 = false;
        for (int i3 = 0; i3 < this.f862a; i3++) {
            try {
                for (int i4 = 0; i4 < this.f862a; i4++) {
                    C0177d c0177d = this.f865d[i3][i4];
                    int i5 = (int) (f10 + (i3 * this.f859k * this.f867m));
                    int i6 = (int) (f11 + (i4 * this.f859k * this.f867m));
                    if (c0177d.f881l && !this.f861n) {
                        c0177d.f882m++;
                    }
                    c0177d.f885p.m6447a(i5 + 1, i6 + 1, (i5 + this.f856h) - 2, (i6 + this.f856h) - 2);
                    if (c0177d.f885p.f230a <= f6 && c0177d.f885p.f231b <= f7) {
                        if (c0177d.f885p.f232c > f6) {
                            c0177d.f885p.f232c = (int) f6;
                        }
                        if (c0177d.f885p.f233d > f7) {
                            c0177d.f885p.f233d = (int) f7;
                        }
                        int i7 = (int) ((0.0f - m1228A.f6138cv) * this.f867m);
                        int i8 = (int) ((0.0f - m1228A.f6139cw) * this.f867m);
                        int m5833i = (int) ((c0173b.m5833i() - m1228A.f6138cv) * this.f867m);
                        int m5832j = (int) ((c0173b.m5832j() - m1228A.f6139cw) * this.f867m);
                        if (c0177d.f885p.f230a < i7) {
                            c0177d.f885p.f230a = i7;
                        }
                        if (c0177d.f885p.f231b < i8) {
                            c0177d.f885p.f231b = i8;
                        }
                        if (c0177d.f885p.f232c > m5833i) {
                            c0177d.f885p.f232c = m5833i;
                        }
                        if (c0177d.f885p.f233d > m5832j) {
                            c0177d.f885p.f233d = m5832j;
                        }
                        if (!c0177d.f885p.m6449a()) {
                            boolean z5 = false;
                            boolean z6 = true;
                            if (c0177d.f880k) {
                                z5 = true;
                                z6 = false;
                            }
                            if (c0177d.f881l) {
                                int i9 = 10;
                                if (i2 > 3) {
                                    i9 = 10 + 2;
                                }
                                if (i2 > 6) {
                                    i9 += 2;
                                }
                                if (c0177d.f882m > i9) {
                                    c0177d.f882m = 0;
                                    z5 = true;
                                    i2++;
                                }
                            }
                            if (z5) {
                                z = true;
                                boolean z7 = false;
                                long m2610a = C0727bl.m2610a();
                                if (l == null) {
                                    l = Long.valueOf(m2610a);
                                } else {
                                    int i10 = 200;
                                    if (this.f861n) {
                                        i10 = 30;
                                    }
                                    if (C0727bl.m2607a(l.longValue(), m2610a) > i10) {
                                        z7 = true;
                                        this.f861n = true;
                                    }
                                }
                                if (z7 && c0177d.f880k && !c0177d.f883n) {
                                    m5819b(i3, i4);
                                }
                                if (!z7) {
                                    if (C0173b.f827I) {
                                        if (c0177d.f874e != null && c0177d.f874e.f6396p != c0177d.f873d.f6396p) {
                                            GameEngine.PrintLog("wrong sized fadeOutBitmap width:" + c0177d.f874e.f6396p + " vs " + c0177d.f873d.f6396p);
                                            c0177d.f874e.mo388o();
                                            c0177d.f874e = null;
                                        }
                                        if (c0177d.f874e == null) {
                                            try {
                                                c0177d.m5809a();
                                            } catch (OutOfMemoryError e) {
                                                e.printStackTrace();
                                                GameEngine.m1189a(EnumC1065u.gameImageCreate, e);
                                                m5812e();
                                                GameEngine.m1139b("Not enough free memory to keep smooth fog fading");
                                                System.gc();
                                            }
                                            if (C0173b.f827I && c0177d.f874e == null) {
                                                m1228A.m1110i("Disabling smooth fog fading due to error");
                                                m5812e();
                                                GameEngine.m1139b("fadeOutBitmap == null");
                                                System.gc();
                                            }
                                        }
                                    }
                                    if (C0173b.f827I) {
                                        if (c0177d.f876g > 0.0f) {
                                        }
                                        C0934e c0934e = c0177d.f873d;
                                        c0177d.f873d = c0177d.f874e;
                                        c0177d.f874e = c0934e;
                                        InterfaceC1027y interfaceC1027y = c0177d.f870a;
                                        c0177d.f870a = c0177d.f875f;
                                        c0177d.f875f = interfaceC1027y;
                                        if (z6) {
                                            c0177d.f876g = 1.0f;
                                        } else {
                                            c0177d.f876g = 0.0f;
                                        }
                                    } else {
                                        c0177d.f876g = 0.0f;
                                    }
                                    if (GameEngine.m1153as() && !z4) {
                                        C0173b.m5898a();
                                        z4 = true;
                                    }
                                    m1228A.f6107bO.mo874i();
                                    m5815c(i3, i4);
                                    m1228A.f6107bO.mo873j();
                                    if (C0173b.f817a) {
                                        C0727bl.m2605a("re-drawTile", m2610a);
                                    }
                                }
                            }
                            c0177d.f884o.m6446a(c0177d.f885p);
                            c0177d.f884o.m6448a(-i5, -i6);
                            c0177d.f886q.m6433a(c0177d.f885p);
                            c0177d.f886q.m6435a(-f10, -f11);
                            c0177d.f886q.m6435a(f8, f9);
                            if (c0177d.f876g > 0.0f) {
                                c0177d.f877h.mo6487a(z3);
                                c0177d.f877h.m6476c((int) ((1.0f - c0177d.f876g) * 255.0f));
                                m1228A.f6107bO.mo903a(c0177d.f874e, c0177d.f884o, c0177d.f886q, this.f866e);
                                if (c0177d.f876g < 0.98d) {
                                    m1228A.f6107bO.mo903a(c0177d.f873d, c0177d.f884o, c0177d.f886q, c0177d.f877h);
                                }
                                c0177d.f876g -= 0.1f * f;
                            } else if (c0177d.f873d.mo413A()) {
                                m1228A.f6107bO.mo902a(c0177d.f873d, c0177d.f886q, this.f866e, 0.0f, 0.0f, 0, 0);
                            } else {
                                m1228A.f6107bO.mo903a(c0177d.f873d, c0177d.f884o, c0177d.f886q, this.f866e);
                            }
                        }
                    }
                }
            } finally {
                if (z4) {
                    C0173b.m5863b();
                }
            }
        }
        if (f5 != 1.0f) {
            m1228A.f6107bO.mo871l();
        }
        if (!z) {
            this.f861n = false;
        }
    }
}
