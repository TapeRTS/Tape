package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0467y;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;

/* renamed from: com.corrodinggames.rts.game.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/h.class */
public class C0190h {

    /* renamed from: a */
    public C0449h f1209a;

    /* renamed from: b */
    public C0449h f1210b;

    /* renamed from: c */
    public float f1211c;

    /* renamed from: d */
    public float f1212d;

    /* renamed from: e */
    public C0424b f1213e;

    /* renamed from: f */
    public C0424b f1214f;

    /* renamed from: g */
    public C0467y f1215g;

    /* renamed from: a */
    public boolean m5738a(AbstractC0244am abstractC0244am) {
        if (this.f1210b != null && C0448g.m4414a(this.f1210b, abstractC0244am.m5192dc())) {
            return false;
        }
        if (this.f1209a != null && !C0448g.m4414a(this.f1209a, abstractC0244am.m5192dc())) {
            return false;
        }
        return true;
    }
}
