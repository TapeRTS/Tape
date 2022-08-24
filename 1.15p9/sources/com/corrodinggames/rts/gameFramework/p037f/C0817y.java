package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/y.class */
public class C0817y extends C0814v {

    /* renamed from: d */
    String f5385d;

    /* renamed from: e */
    final /* synthetic */ C0813u f5386e;

    /* renamed from: a */
    public int mo1897a(Paint paint) {
        GameEngine gameEngine = GameEngine.getInstance();
        int mo888b = gameEngine.graphics.mo888b(this.f5385d, mo1899b(paint));
        if (GameEngine.m1159as()) {
        }
        return mo888b;
    }

    /* renamed from: b */
    public Paint mo1899b(Paint paint) {
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0817y(C0813u c0813u, String str) {
        this.f5386e = c0813u;
        this.f5385d = str;
    }

    /* renamed from: b */
    public C0817y mo7520b(String str) {
        return new C0817y(this.f5386e, str);
    }
}
