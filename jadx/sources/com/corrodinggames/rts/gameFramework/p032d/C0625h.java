package com.corrodinggames.rts.gameFramework.p032d;

import android.graphics.Point;
import com.corrodinggames.rts.game.p012b.C0155g;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.p023d.AbstractC0403c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.gameFramework.d.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/h.class */
public class C0625h {

    /* renamed from: a */
    static Point f4420a = new Point();

    /* renamed from: a */
    public static Point m1645a(int i, int i2, int i3) {
        C0155g e;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5511bt.m3703a(i, i2);
        int i4 = u.f5511bt.f764M;
        int i5 = u.f5511bt.f765N;
        Point point = null;
        float f = -1.0f;
        for (int i6 = i4 - i3; i6 <= i4 + i3; i6++) {
            for (int i7 = i5 - i3; i7 <= i5 + i3; i7++) {
                if (u.f5511bt.m3661c(i6, i7) && (e = u.f5511bt.m3651e(i6, i7)) != null && e.f857i) {
                    AbstractC0210af b = AbstractC0403c.m2647b(i6, i7);
                    if (b != null && !b.m3320bR()) {
                        b = null;
                    }
                    if (b == null) {
                        float a = C0654f.m1520a(i4, i5, i6, i7);
                        if (f == -1.0f || f > a) {
                            u.f5511bt.m3699a(i6, i7);
                            f4420a.m4145a(u.f5511bt.f764M, u.f5511bt.f765N);
                            point = f4420a;
                            f = a;
                        }
                    }
                }
            }
        }
        return point;
    }
}
