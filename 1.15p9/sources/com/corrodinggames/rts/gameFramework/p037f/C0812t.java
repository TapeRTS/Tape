package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0622x;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/t.class */
public class C0812t extends AbstractC0622x {

    /* renamed from: a */
    C0439f f5367a;

    /* renamed from: b */
    public UnitType m1916r() {
        return UnitType.f1777R;
    }

    public C0812t() {
        super(true);
        this.f5367a = new C0439f();
        this.team = Team.f1370i;
    }

    /* renamed from: a */
    public void m1920a(float f) {
        super.m3280a(f);
        GameEngine.m1193a("PlaceholderUnit was updated");
        m5812ch();
    }

    /* renamed from: t */
    public boolean m1915t() {
        return true;
    }

    /* renamed from: u */
    public boolean m1914u() {
        return true;
    }

    /* renamed from: dd */
    public C0439f m1917dd() {
        return this.f5367a;
    }

    /* renamed from: a */
    public void m1919a(C0439f c0439f) {
        this.f5367a = c0439f;
    }
}
