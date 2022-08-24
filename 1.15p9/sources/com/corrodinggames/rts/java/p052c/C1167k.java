package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

/* renamed from: com.corrodinggames.rts.java.c.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/k.class */
public class C1167k extends Socket {

    /* renamed from: a */
    C1157b f7128a;

    /* renamed from: b */
    boolean f7129b = false;

    /* renamed from: c */
    C1168l f7130c = new C1168l(this);

    /* renamed from: d */
    C1169m f7131d = new C1169m(this);

    /* renamed from: e */
    SteamID f7132e;

    public C1167k(C1157b c1157b, SteamID steamID) {
        this.f7128a = c1157b;
        this.f7132e = steamID;
    }

    public void bind(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    public synchronized void close() {
        if (!this.f7129b) {
            this.f7129b = true;
            GameEngine.PrintLog("Closing steam socket");
        }
        if (this.f7130c != null) {
            this.f7130c.m255a(new byte[0]);
        }
    }

    public void connect(SocketAddress socketAddress, int i) {
        throw new RuntimeException("Not supported");
    }

    public void connect(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    public SocketChannel getChannel() {
        throw new RuntimeException("Not supported");
    }

    public InetAddress getInetAddress() {
        return null;
    }

    public InetAddress getLocalAddress() {
        return null;
    }

    public SocketAddress getLocalSocketAddress() {
        return null;
    }

    public SocketAddress getRemoteSocketAddress() {
        return null;
    }

    public InputStream getInputStream() {
        return this.f7130c;
    }

    public boolean getKeepAlive() {
        return true;
    }

    public int getLocalPort() {
        return 5555;
    }

    public boolean getOOBInline() {
        return false;
    }

    public OutputStream getOutputStream() {
        return this.f7131d;
    }

    public int getPort() {
        return 5555;
    }

    public synchronized int getReceiveBufferSize() {
        return 512;
    }

    public boolean getReuseAddress() {
        return false;
    }

    public synchronized int getSendBufferSize() {
        return 512;
    }

    public int getSoLinger() {
        return 0;
    }

    public synchronized int getSoTimeout() {
        return 0;
    }

    public boolean getTcpNoDelay() {
        return true;
    }

    public int getTrafficClass() {
        return 0;
    }

    public boolean isBound() {
        return true;
    }

    public boolean isClosed() {
        return this.f7129b;
    }

    public boolean isConnected() {
        return true;
    }

    public boolean isInputShutdown() {
        return this.f7130c != null;
    }

    public boolean isOutputShutdown() {
        return this.f7131d != null;
    }

    public void sendUrgentData(int i) {
    }

    public void setKeepAlive(boolean z) {
    }

    public void setOOBInline(boolean z) {
    }

    public void setPerformancePreferences(int i, int i2, int i3) {
    }

    public synchronized void setReceiveBufferSize(int i) {
    }

    public void setReuseAddress(boolean z) {
    }

    public synchronized void setSendBufferSize(int i) {
    }

    public void setSoLinger(boolean z, int i) {
    }

    public synchronized void setSoTimeout(int i) {
    }

    public void setTcpNoDelay(boolean z) {
    }

    public void setTrafficClass(int i) {
    }

    public void shutdownInput() {
    }

    public void shutdownOutput() {
    }

    public String toString() {
        return "<SteamSocket>";
    }
}
