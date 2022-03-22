package com.corrodinggames.rts.java.p046c;

import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamNetworking;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.corrodinggames.rts.java.c.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/k.class */
public class C0901k extends OutputStream {

    /* renamed from: a */
    boolean f6011a = true;

    /* renamed from: b */
    final /* synthetic */ C0899i f6012b;

    public C0901k(C0899i iVar) {
        this.f6012b = iVar;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        AbstractC0789l.m663f("SteamSocketOutputStream: Slow write: " + i);
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f6012b.f6003b) {
            AbstractC0789l.m670d("cannot write steam socket closed");
        } else if (i2 > 307200) {
            AbstractC0789l.m670d("Steam spliting large packet to:" + this.f6012b.f6006e + " len:" + i2);
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
            synchronized (this.f6012b.f6002a) {
                try {
                    if (this.f6011a) {
                        this.f6011a = false;
                        AbstractC0789l.m670d("First packet to:" + this.f6012b.f6006e);
                    }
                    if (!this.f6012b.f6002a.f5982h.sendP2PPacket(this.f6012b.f6006e, allocateDirect, SteamNetworking.P2PSend.Reliable, 0)) {
                        AbstractC0789l.m670d("steam sendP2PPacket failed (size: " + i2 + " to:" + this.f6012b.f6006e + ")");
                    }
                } catch (SteamException e) {
                    throw new IOException(e);
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
