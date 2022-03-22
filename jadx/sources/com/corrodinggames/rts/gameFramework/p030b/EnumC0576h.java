package com.corrodinggames.rts.gameFramework.p030b;

/* renamed from: com.corrodinggames.rts.gameFramework.b.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/h.class */
public enum EnumC0576h {
    verylow,
    low,
    high,
    veryhigh,
    critical;

    /* renamed from: a */
    public boolean m1964a(EnumC0576h hVar) {
        return hVar == null || ordinal() < hVar.ordinal();
    }
}
