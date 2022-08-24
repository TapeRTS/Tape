package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/z.class */
public class C0818z {

    /* renamed from: a */
    C1101m f5387a;

    /* renamed from: b */
    Rect f5388b;

    /* renamed from: c */
    Paint f5389c;

    /* renamed from: d */
    Paint f5390d;

    /* renamed from: a */
    public void m1893a(float f, float f2) {
        BitmapOrTexture bitmapOrTexture;
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        int m2085a = C0795d.m2085a(this.f5389c);
        Iterator it = this.f5387a.iterator();
        while (it.hasNext()) {
            C0776aa c0776aa = (C0776aa) it.next();
            int i2 = 0;
            C0814v c0814v = null;
            Iterator it2 = c0776aa.f5052a.iterator();
            while (it2.hasNext()) {
                C0814v c0814v2 = (C0814v) it2.next();
                if (c0814v != null) {
                    i2 += c0814v.mo1897a(this.f5389c);
                }
                int m7201d = ((int) ((f + i2) + this.f5388b.m7201d())) - (c0776aa.f5053b / 2);
                int i3 = (int) (f2 + this.f5388b.f231b + (m2085a / 2) + (i * m2085a));
                if (!(c0814v2 instanceof C0817y)) {
                    if (c0814v2 instanceof C0816x) {
                        C0816x c0816x = (C0816x) c0814v2;
                        gameEngine.graphics.mo914a(c0816x.f5380a, m7201d, i3 - (bitmapOrTexture.f6397q * c0816x.f5381b), C0813u.f5370c, 0.0f, c0816x.f5381b);
                    }
                    c0814v = c0814v2;
                } else {
                    C0817y c0817y = (C0817y) c0814v2;
                    gameEngine.graphics.mo903a(c0817y.f5385d, m7201d, i3, c0817y.mo1899b(this.f5389c));
                    c0814v = c0814v2;
                }
            }
            i++;
        }
    }
}
