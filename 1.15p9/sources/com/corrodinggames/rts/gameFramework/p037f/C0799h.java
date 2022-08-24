package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Point;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/h.class */
public class C0799h {

    /* renamed from: a */
    static Point f5262a = new Point();

    /* renamed from: a */
    public static Point m1955a(int i, int i2, int i3) {
        C0180g m6598e;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6104bL.m6652a(i, i2);
        int i4 = gameEngine.f6104bL.f800T;
        int i5 = gameEngine.f6104bL.f801U;
        Point point = null;
        float f = -1.0f;
        for (int i6 = i4 - i3; i6 <= i4 + i3; i6++) {
            for (int i7 = i5 - i3; i7 <= i5 + i3; i7++) {
                if (gameEngine.f6104bL.m6608c(i6, i7) && (m6598e = gameEngine.f6104bL.m6598e(i6, i7)) != null && m6598e.f921i) {
                    Unit m4514b = AbstractC0488d.m4514b(i6, i7);
                    if (m4514b != null && !m4514b.m5815ce()) {
                        m4514b = null;
                    }
                    if (m4514b == null) {
                        float m2366a = CommonUtils.m2366a(i4, i5, i6, i7);
                        if (f == -1.0f || f > m2366a) {
                            gameEngine.f6104bL.m6648a(i6, i7);
                            f5262a.m7217a(gameEngine.f6104bL.f800T, gameEngine.f6104bL.f801U);
                            point = f5262a;
                            f = m2366a;
                        }
                    }
                }
            }
        }
        return point;
    }
}
