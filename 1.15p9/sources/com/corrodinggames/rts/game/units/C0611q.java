package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;

/* renamed from: com.corrodinggames.rts.game.units.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/q.class */
public class C0611q extends Action {

    /* renamed from: a */
    EnumC0612r f3870a;

    public C0611q(EnumC0612r enumC0612r) {
        super("SetTerrainType" + enumC0612r.ordinal());
        this.f3870a = enumC0612r;
    }

    /* renamed from: b */
    public boolean m3319b(Unit unit) {
        EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
        return m3709L == null || m3709L.f3788F == AbstractC0596n.f3855c;
    }

    /* renamed from: a */
    public String mo6189a() {
        return "Set terrain type to: " + this.f3870a.name();
    }

    /* renamed from: b */
    public String mo6187b() {
        return "Set " + this.f3870a.name();
    }

    /* renamed from: e_ */
    public boolean mo6183e_() {
        return false;
    }

    /* renamed from: c */
    public int mo6185c() {
        return 0;
    }

    /* renamed from: b */
    public int mo6186b(Unit unit, boolean z) {
        return -1;
    }

    /* renamed from: n */
    public UnitType mo7517i() {
        return null;
    }

    /* renamed from: e */
    public EnumC0226u mo6184e() {
        return EnumC0226u.f1480g;
    }

    /* renamed from: f */
    public EnumC0225t mo6182f() {
        return EnumC0225t.f1469f;
    }

    /* renamed from: g */
    public boolean mo6181g() {
        return false;
    }

    /* renamed from: a */
    public boolean m3321a(Unit unit, boolean z) {
        return true;
    }

    /* renamed from: h */
    public boolean m3312h() {
        return true;
    }

    /* renamed from: o */
    public boolean m3309o() {
        return true;
    }

    /* renamed from: a */
    public boolean m3322a(float f, float f2) {
        return true;
    }

    /* renamed from: p */
    public boolean m3308p() {
        return true;
    }
}
