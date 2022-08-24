package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EditorOrBuilder;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/p.class */
public abstract class AbstractC0221p extends Action {
    public AbstractC0221p(String str) {
        super("c__cut_" + str);
        this.f1459g = 0.0f;
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        return -1;
    }

    /* renamed from: c */
    public int mo6185c() {
        return 0;
    }

    /* renamed from: i */
    public InterfaceC0303as mo7517i() {
        return null;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return EnumC0226u.f1482i;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return EnumC0225t.f1470g;
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return false;
    }

    /* renamed from: K */
    public AbstractC0623y m6126K() {
        AbstractC0623y abstractC0623y = null;
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y2.f1643cE) {
                    abstractC0623y = abstractC0623y2;
                }
            }
        }
        return abstractC0623y;
    }

    /* renamed from: L */
    public boolean m6125L() {
        GameEngine gameEngine = GameEngine.getInstance();
        AbstractC0623y m6126K = m6126K();
        if (m6126K != null) {
            return (m6126K instanceof EditorOrBuilder) || gameEngine.f6093bs == m6126K.team;
        }
        return false;
    }

    /* renamed from: d */
    public String m6122d() {
        return getText();
    }

    /* renamed from: e_ */
    public boolean mo6183e_() {
        return false;
    }

    /* renamed from: s */
    public boolean mo6178s() {
        if (!m6125L()) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public boolean m6127G() {
        return false;
    }

    /* renamed from: l */
    public float m6116l() {
        if (!C0797f.f5188bB) {
            return 1.0f;
        }
        return 1.0f;
    }
}
