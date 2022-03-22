package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h;
import com.corrodinggames.rts.gameFramework.p029a.AbstractC0534i;
import com.corrodinggames.rts.java.audio.Sound;

/* renamed from: com.corrodinggames.rts.java.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/p.class */
public class C0918p extends AbstractC0534i {

    /* renamed from: a */
    Sound f6102a;

    /* renamed from: b */
    final /* synthetic */ C0916n f6103b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0918p(C0916n nVar, String str, AbstractC0533h hVar) {
        super(str, hVar);
        this.f6103b = nVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0534i
    /* renamed from: a */
    public void mo72a(float f, float f2, int i, int i2, float f3) {
        C0917o oVar = (C0917o) this.f6103b.f6092c.m550a();
        if (oVar != null) {
            oVar.f6097b = f;
            oVar.f6098c = f2;
            oVar.f6099d = i;
            oVar.f6100e = i2;
            oVar.f6101f = f3;
            oVar.f6096a = this;
            this.f6103b.f6091b.offer(oVar);
        }
    }

    /* renamed from: b */
    public void m71b(float f, float f2, int i, int i2, float f3) {
        if (this.f6102a == null) {
            AbstractC0789l.m670d("Sound not loaded");
            return;
        }
        synchronized (this.f6103b.m75b()) {
            this.f6102a.play(C0654f.m1434f(f, f2), f3, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0534i
    /* renamed from: a */
    public int mo73a() {
        return this.f6102a.getBytesUsed();
    }
}
