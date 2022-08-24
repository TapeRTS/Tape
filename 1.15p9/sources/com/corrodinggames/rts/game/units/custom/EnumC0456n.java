package com.corrodinggames.rts.game.units.custom;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.custom.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/n.class */
public enum EnumC0456n {
    move,
    attack,
    idle,
    created,
    underConstruction,
    underConstructionWithLinkedBuiltTime,
    queuedUnits,
    repair,
    reclaim;

    /* renamed from: a */
    public static EnumC0456n m4073a(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
