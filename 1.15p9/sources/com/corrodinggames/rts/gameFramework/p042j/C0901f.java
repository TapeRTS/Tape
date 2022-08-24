package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/f.class */
public class C0901f extends C0906k {

    /* renamed from: a */
    AbstractC0898c f5937a;

    /* renamed from: b */
    C0902g f5938b;

    /* renamed from: c */
    static Paint f5939c = new Paint();

    /* renamed from: d */
    static Point f5940d = new Point();

    public C0901f(C0907l c0907l, boolean z) {
        super(c0907l, z);
        this.f5937a = new C0903h(this);
    }

    /* renamed from: a */
    public AbstractC0898c m1365a(Unit unit) {
        if (m1368a() != null) {
            return this.f5937a;
        }
        return null;
    }

    /* renamed from: a */
    public LinkedList m1368a() {
        return super.m1332a();
    }

    /* renamed from: b */
    public boolean m1363b() {
        return true;
    }

    /* renamed from: a */
    public boolean m1364a(C0906k c0906k) {
        if (this == c0906k) {
            return true;
        }
        if (!(c0906k instanceof C0901f)) {
            return false;
        }
        C0901f c0901f = (C0901f) c0906k;
        if (this.f5975l != c0901f.f5975l || this.f5976m != c0901f.f5976m || this.f5978o != c0901f.f5978o) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    protected boolean m1362c() {
        return this.f5987x != null;
    }

    /* renamed from: a */
    public final byte m1366a(int i, int i2) {
        if (this.f5938b == null) {
            return (byte) -1;
        }
        return this.f5938b.m1360a(i, i2);
    }

    /* renamed from: a */
    public static final void m1367a(byte b, Point point) {
        int i = 0;
        int i2 = 0;
        byte b2 = (byte) (b - 1);
        if (b2 == 0) {
            i = 0 + 1;
        }
        if (b2 == 1) {
            i++;
            i2 = 0 + 1;
        }
        if (b2 == 2) {
            i2++;
        }
        if (b2 == 3) {
            i2++;
            i--;
        }
        if (b2 == 4) {
            i--;
        }
        if (b2 == 5) {
            i--;
            i2--;
        }
        if (b2 == 6) {
            i2--;
        }
        if (b2 == 7) {
            i2--;
            i++;
        }
        point.f224a = i;
        point.f225b = i2;
    }

    /* renamed from: d */
    public void m1361d() {
        int i;
        int i2;
        int i3;
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = gameEngine.f6104bL;
        Rect rect = new Rect();
        float f = gameEngine.f6138cv;
        float f2 = gameEngine.f6139cw;
        float f3 = gameEngine.f6142cz;
        float f4 = gameEngine.f6143cA;
        C0178e c0178e = gameEngine.f6104bL.f832u;
        int i4 = (int) ((f * c0173b.f788r) - 1.0f);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) ((f2 * c0173b.f789s) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) (((f + f3) * c0173b.f788r) + 1.0f);
        if (i6 > c0173b.f791C - 1) {
            i6 = c0173b.f791C - 1;
        }
        int i7 = (int) (((f2 + f4) * c0173b.f789s) + 1.0f);
        if (i7 > c0173b.f792D - 1) {
            i7 = c0173b.f792D - 1;
        }
        for (int i8 = i4; i8 < i6 + 1; i8++) {
            for (int i9 = i5; i9 < i7 + 1; i9++) {
                if (c0178e.m6560a(i8, i9) != null) {
                    int i10 = i8 * c0173b.f784n;
                    int i11 = i9 * c0173b.f785o;
                    rect.m7208a(i10, i11, i10 + c0173b.f784n, i11 + c0173b.f785o);
                    rect.m7209a((int) (-f), (int) (-f2));
                    boolean m7205b = rect.m7205b((int) (gameEngine.f6111bS.f5203s / gameEngine.f6250cW), (int) (gameEngine.f6111bS.f5204t / gameEngine.f6250cW));
                    int i12 = 0;
                    if (50 == -1) {
                        i = 255;
                    } else {
                        i = 50 * 2;
                    }
                    if (0 == -1) {
                        i2 = 255;
                    } else {
                        i2 = 0 * 2;
                    }
                    if (0 == -1) {
                        i3 = 255;
                    } else {
                        if (0 != 0) {
                            i12 = 0 + 30;
                        }
                        i3 = i12 * 2;
                    }
                    f5939c.m7267a(128, i, i2, i3);
                    m1367a(m1366a(i8, i9), f5940d);
                    float f5 = (i10 + c0173b.f786p) - f;
                    float f6 = (i11 + c0173b.f787q) - f2;
                    gameEngine.graphics.mo932a(f5, f6, f5 + (f5940d.f224a * (c0173b.f784n - 3)) + 1.0f, f6 + (f5940d.f225b * (c0173b.f785o - 3)) + 1.0f, f5939c);
                    if (m7205b) {
                    }
                }
            }
        }
    }
}
