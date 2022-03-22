package com.corrodinggames.rts.game.units.p023d;

import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.d.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/t.class */
public class C0431t extends AbstractC0413h {

    /* renamed from: a */
    static C0748e f3107a = null;

    /* renamed from: b */
    static C0748e[] f3108b = new C0748e[10];

    /* renamed from: c */
    static C0748e f3109c = null;

    /* renamed from: b */
    public static void m2542b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3107a = u.f5514bw.mo194a(C0063R.drawable.wall_v);
        f3109c = u.f5514bw.mo194a(C0063R.drawable.wall_v);
        f3108b = AbstractC0171m.m3501a(f3107a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3109c;
        }
        if (this.f1461bB == null) {
            return f3108b[f3108b.length - 1];
        }
        return f3108b[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
    }

    public C0431t(boolean z) {
        super(z);
        m2035b(f3107a);
        this.f1474bO = 15.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 700.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3107a;
        this.f2965n.m4136a(0, 0, 1, 0);
        this.f2966o.m4136a(0, 0, 1, 0);
    }

    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.wall_v;
    }
}
