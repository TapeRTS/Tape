package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;

/* renamed from: com.corrodinggames.rts.game.units.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/l.class */
public class C0594l extends AbstractC0229x {

    /* renamed from: a */
    boolean f3849a;

    /* renamed from: b */
    boolean f3850b;

    public C0594l(boolean z, boolean z2) {
        super("changeTypeFilter" + z + "d:" + z2);
        this.f3849a = z;
        this.f3850b = z2;
    }

    /* renamed from: b */
    public boolean m3371b(Unit unit) {
        EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
        return m3709L == null || m3709L.f3788F == AbstractC0596n.f3854b;
    }

    /* renamed from: b */
    public String mo6187b() {
        if (this.f3850b) {
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            if (m3709L != null) {
                if (m3709L.f3787E != null) {
                    return m3709L.f3787E.m3344a();
                }
                return "All types";
            }
            return "Type Filter";
        } else if (this.f3849a) {
            return "<- Set type";
        } else {
            return "Set type ->";
        }
    }

    /* renamed from: d */
    public String m3370d() {
        if (!this.f3850b) {
            if (this.f3849a) {
                return "<-";
            }
            return "->";
        }
        EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
        if (m3709L == null) {
            return "NA";
        }
        if (m3709L.f3787E == null) {
            return "All mods";
        }
        return m3709L.f3787E.m3344a();
    }

    /* renamed from: a */
    public String mo6189a() {
        return "Change filtered type";
    }

    /* renamed from: l */
    public float m3367l() {
        if (!C0797f.f5188bB) {
            return 0.8f;
        }
        return 0.5f;
    }

    /* renamed from: m */
    public int m3366m() {
        if (this.f3850b) {
            return 2;
        }
        return 4;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        if (this.f3850b) {
            return EnumC0225t.f1470g;
        }
        return super.mo6182f();
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        if (this.f3850b) {
            return EnumC0226u.f1482i;
        }
        return super.mo6184e();
    }
}
