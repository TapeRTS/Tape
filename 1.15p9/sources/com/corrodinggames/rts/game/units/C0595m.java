package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;

/* renamed from: com.corrodinggames.rts.game.units.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/m.class */
public class C0595m extends AbstractC0229x {

    /* renamed from: a */
    boolean f3851a;

    /* renamed from: b */
    boolean f3852b;

    public C0595m(boolean z, boolean z2) {
        super("changeUnitTab" + z + "d:" + z2);
        this.f3851a = z;
        this.f3852b = z2;
    }

    /* renamed from: b */
    public String mo6187b() {
        return m3363d();
    }

    /* renamed from: d */
    public String m3363d() {
        EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
        if (m3709L == null) {
            return "<NULL>";
        }
        if (this.f3852b) {
            return m3709L.f3788F.m3357a();
        }
        String str = VariableScope.nullOrMissingString;
        if (this.f3851a) {
            str = str + "<- ";
        }
        if (!this.f3851a) {
            str = str + " ->";
        }
        return str;
    }

    /* renamed from: n */
    public void m3358n() {
        EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
        if (m3709L == null) {
            GameEngine.m1145b("Editor not active");
        } else if (this.f3852b) {
        } else {
            m3709L.f3788F = m3709L.f3788F.m3354a(this.f3851a);
        }
    }

    /* renamed from: a */
    public String mo6189a() {
        return "Change unit tab in editor";
    }

    /* renamed from: l */
    public float m3360l() {
        if (!C0797f.f5188bB) {
            return 0.8f;
        }
        return 0.5f;
    }

    /* renamed from: m */
    public int m3359m() {
        if (this.f3852b) {
            return 2;
        }
        return 4;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        if (this.f3852b) {
            return EnumC0225t.f1470g;
        }
        return super.mo6182f();
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        if (this.f3852b) {
            return EnumC0226u.f1482i;
        }
        return super.mo6184e();
    }
}
