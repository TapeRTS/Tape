package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.g.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/j.class */
public class C0706j extends OutputStream {

    /* renamed from: a */
    boolean f5003a = true;

    /* renamed from: b */
    final /* synthetic */ C0704h f5004b;

    public C0706j(C0704h hVar) {
        this.f5004b = hVar;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        AbstractC0789l.m663f("SteamSocketOutputStream: Slow write: " + i);
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f5004b.f4996c) {
            AbstractC0789l.m670d("cannot write steam socket closed");
        } else {
            AbstractC0789l.m670d("Forwarded message to client: " + this.f5004b.f4995b + " with old method");
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
