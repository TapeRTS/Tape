package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/k.class */
public class C0593k extends AbstractC0229x {

    /* renamed from: a */
    boolean f3847a;

    /* renamed from: b */
    boolean f3848b;

    public C0593k(boolean z, boolean z2) {
        super("changeTeam" + z + "d:" + z2);
        this.f3847a = z;
        this.f3848b = z2;
    }

    /* renamed from: b */
    public String mo6187b() {
        if (this.f3848b) {
            return "Selected player";
        }
        if (this.f3847a) {
            return "<- Set player";
        }
        return "Set player ->";
    }

    /* renamed from: d */
    public String m3378d() {
        if (!this.f3848b) {
            if (this.f3847a) {
                return "<-";
            }
            return "->";
        }
        GameEngine gameEngine = GameEngine.getInstance();
        Team team = null;
        Iterator it = gameEngine.f6111bS.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && gameEngine.f6111bS.m1974m(abstractC0623y)) {
                    team = abstractC0623y.team;
                }
            }
        }
        String str = VariableScope.nullOrMissingString;
        if (team != null) {
            str = str + "Team - " + (team.f1305k + 1) + VariableScope.nullOrMissingString;
        }
        return str;
    }

    /* renamed from: a */
    public String mo6189a() {
        return "Change targeted player for editor";
    }

    /* renamed from: l */
    public float m3375l() {
        if (!C0797f.f5188bB) {
            return 0.8f;
        }
        return 0.5f;
    }

    /* renamed from: m */
    public int m3374m() {
        if (this.f3848b) {
            return 2;
        }
        return 4;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        if (this.f3848b) {
            return EnumC0225t.f1470g;
        }
        return super.mo6182f();
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        if (this.f3848b) {
            return EnumC0226u.f1482i;
        }
        return super.mo6184e();
    }
}
