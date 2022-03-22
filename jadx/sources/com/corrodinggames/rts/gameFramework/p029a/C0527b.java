package com.corrodinggames.rts.gameFramework.p029a;

import android.util.Log;

/* renamed from: com.corrodinggames.rts.gameFramework.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/b.class */
public class C0527b extends AbstractC0534i {

    /* renamed from: a */
    C0526a f3553a;

    /* renamed from: b */
    int f3554b = -1;

    /* renamed from: c */
    final /* synthetic */ C0526a f3555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0527b(C0526a aVar, String str, AbstractC0533h hVar) {
        super(str, hVar);
        this.f3555c = aVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0534i
    /* renamed from: a */
    public void mo72a(float f, float f2, int i, int i2, float f3) {
        C0528c cVar = (C0528c) this.f3555c.f3549c.m550a();
        if (cVar != null) {
            cVar.f3557b = f;
            cVar.f3558c = f2;
            cVar.f3559d = i;
            cVar.f3560e = i2;
            cVar.f3561f = f3;
            cVar.f3556a = this;
            this.f3555c.f3547a.offer(cVar);
        }
    }

    /* renamed from: b */
    public void m2121b(float f, float f2, int i, int i2, float f3) {
        if (this.f3554b == 0) {
            Log.m4033d("RustedWarfare", "Sound not loaded");
        } else {
            this.f3553a.f3552f.play(this.f3554b, f, f2, i, i2, f3);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0534i
    /* renamed from: a */
    public int mo73a() {
        return 0;
    }
}
