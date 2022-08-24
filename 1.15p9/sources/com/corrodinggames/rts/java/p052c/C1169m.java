package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamNetworking;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.corrodinggames.rts.java.c.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/m.class */
public class C1169m extends OutputStream {

    /* renamed from: a */
    boolean f7137a = true;

    /* renamed from: b */
    final /* synthetic */ C1167k f7138b;

    public C1169m(C1167k c1167k) {
        this.f7138b = c1167k;
    }

    public void write(int i) {
        GameEngine.m1114g("SteamSocketOutputStream: Slow write: " + i);
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.f7138b.f7129b) {
            GameEngine.PrintLog("cannot write steam socket closed");
        } else if (i2 > 307200) {
            GameEngine.PrintLog("Steam spliting large packet to:" + this.f7138b.f7132e + " len:" + i2);
            int i3 = i2;
            do {
                int i4 = i3;
                if (i4 > 256000) {
                    i4 = 256000;
                }
                write(bArr, i, i4);
                i += i4;
                i3 -= i4;
            } while (i3 > 0);
        } else {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
            allocateDirect.put(bArr, i, i2);
            allocateDirect.flip();
            synchronized (this.f7138b.f7128a) {
                try {
                    if (this.f7137a) {
                        this.f7137a = false;
                        GameEngine.PrintLog("First packet to:" + this.f7138b.f7132e);
                    }
                    if (!this.f7138b.f7128a.f7095h.sendP2PPacket(this.f7138b.f7132e, allocateDirect, SteamNetworking.P2PSend.Reliable, 0)) {
                        GameEngine.PrintLog("steam sendP2PPacket failed (size: " + i2 + " to:" + this.f7138b.f7132e + ")");
                    }
                } catch (SteamException e) {
                    throw new IOException(e);
                }
            }
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
