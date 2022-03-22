package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0381x;

/* renamed from: com.corrodinggames.rts.game.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/h.class */
public class C0165h {

    /* renamed from: a */
    public C0365i f1142a;

    /* renamed from: b */
    public C0365i f1143b;

    /* renamed from: c */
    public float f1144c;

    /* renamed from: d */
    public float f1145d;

    /* renamed from: e */
    public C0363g f1146e;

    /* renamed from: f */
    public C0363g f1147f;

    /* renamed from: g */
    public C0381x f1148g;

    /* renamed from: a */
    public boolean m3560a(AbstractC0210af afVar) {
        if (this.f1143b != null && C0364h.m2904a(this.f1143b, afVar.mo2846cM())) {
            return false;
        }
        if (this.f1142a == null || C0364h.m2904a(this.f1142a, afVar.mo2846cM())) {
            return true;
        }
        return false;
    }
}
