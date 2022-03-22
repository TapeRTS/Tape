package com.corrodinggames.rts.gameFramework.p029a;

import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.gameFramework.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/i.class */
public abstract class AbstractC0534i {

    /* renamed from: d */
    public String f3595d;

    /* renamed from: e */
    public boolean f3596e = false;

    /* renamed from: f */
    public boolean f3597f;

    /* renamed from: a */
    public abstract void mo72a(float f, float f2, int i, int i2, float f3);

    /* renamed from: a */
    public abstract int mo73a();

    public AbstractC0534i(String str, AbstractC0533h hVar) {
        this.f3595d = C0654f.m1427g(str);
        if (hVar != null) {
            hVar.f3594g.put(this.f3595d, this);
        }
    }
}
