package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.C0385bb;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.p012a.C0225z;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/am.class */
public interface UnitType {
    /* renamed from: C */
    boolean mo3136C();

    /* renamed from: w */
    boolean mo3065w();

    /* renamed from: a */
    Unit createUnit();

    /* renamed from: d */
    C0225z mo3098d();

    /* renamed from: c */
    int getPrice();

    /* renamed from: b */
    int mo3107b(int i);

    /* renamed from: u */
    C0407b mo3067u();

    /* renamed from: d */
    C0407b mo3097d(int i);

    /* renamed from: B */
    C0407b mo3137B();

    /* renamed from: z */
    BitmapOrTexture mo3062z();

    /* renamed from: y */
    boolean mo3063y();

    /* renamed from: D */
    float mo3135D();

    /* renamed from: g */
    int mo3091g();

    /* renamed from: j */
    boolean mo3085j();

    /* renamed from: l */
    boolean mo3081l();

    /* renamed from: k */
    boolean mo3083k();

    /* renamed from: m */
    boolean mo3079m();

    /* renamed from: n */
    boolean mo3077n();

    /* renamed from: o */
    MovementType mo3075o();

    /* renamed from: p */
    boolean mo3073p();

    /* renamed from: q */
    C0385bb mo3071q();

    /* renamed from: e */
    String mo3095e();

    /* renamed from: f */
    String mo3093f();

    /* renamed from: i */
    String mo3087i();

    /* renamed from: h */
    void mo3089h();

    /* renamed from: a */
    ArrayList mo3132a(int i);

    /* renamed from: v */
    String mo3066v();

    /* renamed from: x */
    ValueList mo3064x();

    /* renamed from: a */
    int mo3130a(Unit unit);
}