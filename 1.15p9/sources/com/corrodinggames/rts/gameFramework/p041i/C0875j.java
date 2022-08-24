package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.i.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/j.class */
public class C0875j extends OutputStream {

    /* renamed from: a */
    boolean f5853a = true;

    /* renamed from: b */
    final /* synthetic */ C0873h f5854b;

    public C0875j(C0873h c0873h) {
        this.f5854b = c0873h;
    }

    public void write(int i) {
        GameEngine.m1114g("SteamSocketOutputStream: Slow write: " + i);
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.f5854b.f5846c) {
            GameEngine.PrintLog("cannot write steam socket closed");
        } else {
            GameEngine.PrintLog("Forwarded message to client: " + this.f5854b.f5845b + " with old method");
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
