package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;

/* renamed from: com.corrodinggames.rts.game.units.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/j.class */
public class C0592j extends AbstractC0229x {

    /* renamed from: a */
    boolean f3845a;

    /* renamed from: b */
    boolean f3846b;

    public C0592j(boolean z, boolean z2) {
        super("changeModFilter" + z + "d:" + z2);
        this.f3845a = z;
        this.f3846b = z2;
    }

    /* renamed from: b */
    public boolean m3386b(Unit unit) {
        EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
        return m3709L == null || m3709L.f3788F == AbstractC0596n.f3856d;
    }

    /* renamed from: b */
    public String mo6187b() {
        if (this.f3846b) {
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            if (m3709L != null) {
                if (m3709L.f3786D != null) {
                    return m3709L.f3786D.m1846a();
                }
                return "All mods";
            }
            return "Mod Filter";
        } else if (this.f3845a) {
            return "<- Set mod";
        } else {
            return "Set mod ->";
        }
    }

    /* renamed from: d */
    public String m3385d() {
        if (!this.f3846b) {
            if (this.f3845a) {
                return "<-";
            }
            return "->";
        }
        EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
        if (m3709L == null) {
            return "NA";
        }
        if (m3709L.f3786D == null) {
            return "All mods";
        }
        return m3709L.f3786D.m1841b();
    }

    /* renamed from: a */
    public String mo6189a() {
        return "Change filtered mod";
    }

    /* renamed from: l */
    public float m3382l() {
        if (!C0797f.f5188bB) {
            return 0.8f;
        }
        return 0.5f;
    }

    /* renamed from: m */
    public int m3381m() {
        if (this.f3846b) {
            return 2;
        }
        return 4;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        if (this.f3846b) {
            return EnumC0225t.f1470g;
        }
        return super.mo6182f();
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        if (this.f3846b) {
            return EnumC0226u.f1482i;
        }
        return super.mo6184e();
    }
}
