package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

/* renamed from: com.corrodinggames.rts.gameFramework.g.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/h.class */
public class C0704h extends Socket {

    /* renamed from: a */
    C0698c f4994a;

    /* renamed from: b */
    int f4995b;

    /* renamed from: c */
    boolean f4996c = false;

    /* renamed from: d */
    C0705i f4997d = new C0705i(this);

    /* renamed from: e */
    C0706j f4998e = new C0706j(this);

    /* renamed from: a */
    public void m1082a(C0692ar arVar) {
        this.f4994a.m1118a(new C0696av(this.f4995b, arVar));
    }

    public C0704h(C0698c cVar, int i) {
        this.f4994a = cVar;
        this.f4995b = i;
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f4996c) {
            this.f4996c = true;
            AbstractC0789l.m670d("Closing steam socket");
        }
        if (this.f4997d != null) {
            this.f4997d.m1081a(new byte[0]);
        }
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        throw new RuntimeException("Not supported");
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        throw new RuntimeException("Not supported");
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return null;
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return null;
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return null;
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return null;
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        return this.f4997d;
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        return true;
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return 5555;
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        return false;
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        return this.f4998e;
    }

    @Override // java.net.Socket
    public int getPort() {
        return 5555;
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        return 512;
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        return false;
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        return 512;
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return 0;
    }

    @Override // java.net.Socket
    public synchronized int getSoTimeout() {
        return 0;
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return true;
    }

    @Override // java.net.Socket
    public int getTrafficClass() {
        return 0;
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return true;
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.f4996c;
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return true;
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.f4997d != null;
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.f4998e != null;
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) {
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) {
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z) {
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i, int i2, int i3) {
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) {
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) {
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i) {
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) {
    }

    @Override // java.net.Socket
    public synchronized void setSoTimeout(int i) {
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) {
    }

    @Override // java.net.Socket
    public void shutdownInput() {
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
    }

    @Override // java.net.Socket
    public String toString() {
        return "<ForwardedSocket>";
    }
}
