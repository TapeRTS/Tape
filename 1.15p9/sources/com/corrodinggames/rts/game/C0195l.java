package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/l.class */
public class C0195l extends AbstractC1120w {

    /* renamed from: a */
    int f1288a;

    /* renamed from: b */
    int f1289b;

    /* renamed from: e */
    EnumC0196m f1290e;

    /* renamed from: f */
    int f1291f;

    /* renamed from: h */
    static final Rect f1292h = new Rect();

    /* renamed from: i */
    static final Rect f1293i = new Rect();

    /* renamed from: j */
    static final Paint f1294j = C1117y.m483b();

    /* renamed from: k */
    static BitmapOrTexture f1295k = null;

    /* renamed from: l */
    static BitmapOrTexture f1296l = null;

    /* renamed from: m */
    static BitmapOrTexture f1297m = null;

    /* renamed from: n */
    static final RectF f1298n = new RectF();

    /* renamed from: c */
    int f1299c = 50;

    /* renamed from: d */
    int f1300d = 40;

    /* renamed from: g */
    int f1301g = -1;

    /* renamed from: b */
    public static void m6428b() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1295k = gameEngine.graphics.mo926a(R.drawable.scorch_mark, true);
        f1295k.f6394m = true;
        f1296l = gameEngine.graphics.mo926a(R.drawable.scorch_mark_nuke, true);
        f1296l.f6394m = true;
        f1297m = gameEngine.graphics.mo926a(R.drawable.blood_mark, true);
        f1297m.f6394m = true;
    }

    public C0195l() {
        GameEngine gameEngine = GameEngine.getInstance();
        setDrawLayer(-1);
        this.f1291f = gameEngine.f6096by;
    }

    /* renamed from: a */
    public static void m6434a(float f, float f2) {
        m6433a(f, f2, EnumC0196m.f1302a);
    }

    /* renamed from: a */
    public static void m6433a(float f, float f2, EnumC0196m enumC0196m) {
        if (!m6427b(f, f2, enumC0196m)) {
            return;
        }
        C0195l c0195l = new C0195l();
        c0195l.f6951ek = f;
        c0195l.f6952el = f2;
        if (enumC0196m == EnumC0196m.f1302a) {
            c0195l.f1288a = 0;
            c0195l.f1289b = CommonUtils.m2345a(c0195l, 0, 3, 0);
        } else {
            c0195l.f1288a = 2;
        }
        if (c0195l.f1288a == 2) {
            c0195l.f1299c = f1296l.mo396m();
            c0195l.f1300d = f1296l.mo397l();
        }
        c0195l.f1290e = enumC0196m;
        c0195l.m6424d();
    }

    /* renamed from: a */
    public static void m6431a(AbstractC0623y abstractC0623y, int i) {
        if (!abstractC0623y.m5838cI()) {
            EnumC0196m enumC0196m = i == 2 ? EnumC0196m.f1303b : EnumC0196m.f1302a;
            if (!m6427b(abstractC0623y.f6951ek, abstractC0623y.f6952el, enumC0196m)) {
                return;
            }
            C0195l c0195l = new C0195l();
            c0195l.f1288a = i;
            if (c0195l.f1288a == 2) {
                c0195l.f1299c = f1296l.mo396m();
                c0195l.f1300d = f1296l.mo397l();
            }
            c0195l.f6951ek = abstractC0623y.f6951ek;
            c0195l.f6952el = abstractC0623y.f6952el;
            c0195l.f1290e = enumC0196m;
            c0195l.f1289b = CommonUtils.m2345a(c0195l, 0, 3, 0);
            c0195l.m6424d();
        }
    }

    /* renamed from: b */
    public static boolean m6427b(float f, float f2, EnumC0196m enumC0196m) {
        int i = 0;
        int i2 = 0;
        int i3 = 25;
        if (enumC0196m == EnumC0196m.f1303b) {
            i3 = 45;
        }
        AbstractC1120w[] m539a = AbstractC1120w.f6956en.m539a();
        int size = AbstractC1120w.f6956en.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1120w abstractC1120w = m539a[i4];
            if (abstractC1120w instanceof C0195l) {
                C0195l c0195l = (C0195l) abstractC1120w;
                if (CommonUtils.m2294c(c0195l.f6951ek - f) < i3 && CommonUtils.m2294c(c0195l.f6952el - f2) < i3 && c0195l.f1290e == enumC0196m) {
                    i++;
                    if (CommonUtils.m2294c(c0195l.f6951ek - f) < 5 && CommonUtils.m2294c(c0195l.f6952el - f2) < 5) {
                        i2++;
                    }
                }
            }
        }
        if (i >= 3 || i2 >= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m6429a(GameEngine gameEngine) {
        return false;
    }

    /* renamed from: f */
    public boolean m6421f(float f) {
        return false;
    }

    /* renamed from: c */
    public boolean m6425c(float f) {
        return true;
    }

    /* renamed from: c */
    public RectF m6426c() {
        f1298n.f234a = this.f6951ek - (this.f1299c * 0.5f);
        f1298n.f236c = this.f6951ek + (this.f1299c * 0.5f);
        f1298n.f235b = this.f6952el - (this.f1300d * 0.5f);
        f1298n.f237d = this.f6952el + (this.f1300d * 0.5f);
        return f1298n;
    }

    /* renamed from: a */
    public void m6430a(InterfaceC1027y interfaceC1027y, int i, int i2, float f) {
        int i3;
        int i4 = this.f1289b * this.f1299c;
        BitmapOrTexture bitmapOrTexture = null;
        int i5 = this.f1299c;
        int i6 = this.f1300d;
        if (this.f1288a == 0) {
            bitmapOrTexture = f1295k;
        } else if (this.f1288a == 1) {
            bitmapOrTexture = f1297m;
        } else if (this.f1288a == 2) {
            bitmapOrTexture = f1296l;
        }
        Rect rect = f1292h;
        Rect rect2 = f1293i;
        rect2.f230a = i4;
        rect2.f231b = 0;
        rect2.f232c = i4 + i5;
        rect2.f233d = 0 + i6;
        int i7 = ((int) this.f6951ek) - i;
        int i8 = i5 >> 1;
        int i9 = i6 >> 1;
        float f2 = i7 - i8;
        rect.f230a = (int) (f2 * f);
        rect.f231b = (int) (((((int) this.f6952el) - i2) - i9) * f);
        rect.f232c = (int) ((i7 + i8) * f);
        rect.f233d = (int) ((i3 + i9) * f);
        interfaceC1027y.mo889b(bitmapOrTexture, rect2, rect, f1294j);
    }

    /* renamed from: d */
    private void m6424d() {
        GameEngine.getInstance().f6104bL.m6638a(this);
    }

    /* renamed from: e */
    public void m6422e(float f) {
    }

    /* renamed from: a */
    public void m6432a(float f, boolean z) {
    }

    /* renamed from: d */
    public void m6423d(float f) {
    }

    /* renamed from: a */
    public void m6435a(float f) {
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f6951ek);
        c0859ar.mo1488a(this.f6952el);
        c0859ar.mo1487a(this.f1288a);
        c0859ar.mo1487a(this.f1289b);
        c0859ar.mo1487a(this.f1299c);
        c0859ar.mo1487a(this.f1300d);
        c0859ar.m1564a(this.f1290e);
        c0859ar.mo1487a(this.f1291f);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f6951ek = c0876k.m1453g();
        this.f6952el = c0876k.m1453g();
        this.f1288a = c0876k.m1454f();
        this.f1289b = c0876k.m1454f();
        this.f1299c = c0876k.m1454f();
        this.f1300d = c0876k.m1454f();
        if (c0876k.m1463b() >= 87) {
            this.f1290e = (EnumC0196m) c0876k.m1461b(EnumC0196m.class);
            this.f1291f = c0876k.m1454f();
        } else {
            this.f1290e = this.f1288a == 2 ? EnumC0196m.f1303b : EnumC0196m.f1302a;
            if (this.f1288a == 2) {
                this.f1299c = f1296l.mo396m();
                this.f1300d = f1296l.mo397l();
            }
        }
        super.mo2877a(c0876k);
    }
}
