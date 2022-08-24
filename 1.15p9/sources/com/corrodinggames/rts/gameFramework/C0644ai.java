package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ai.class */
public class C0644ai {
    /* renamed from: a */
    public boolean m2941a(int i, int i2, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!gameEngine.m1203a(i2, z)) {
            return false;
        }
        return gameEngine.m1119h(i);
    }

    /* renamed from: a */
    public boolean m2942a(int i, int i2) {
        return false;
    }

    /* renamed from: a */
    public int m2943a() {
        return 0;
    }

    /* renamed from: b */
    public float m2940b(int i, int i2) {
        return 0.0f;
    }

    /* renamed from: c */
    public String m2939c(int i, int i2) {
        return "<abstract>";
    }
}
