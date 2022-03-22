/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.net.InetAddress;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketAddress;
/*     */ import java.nio.channels.SocketChannel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class h
/*     */   extends Socket
/*     */ {
/*     */   c a;
/*     */   int b;
/*     */   boolean c = false;
/*     */   i d;
/*     */   j e;
/*     */   
/*     */   public void a(ar paramar) {
/* 294 */     this.a.a(new av(this.b, paramar));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public h(c paramc, int paramInt) {
/* 303 */     this.a = paramc;
/* 304 */     this.b = paramInt;
/*     */     
/* 306 */     this.d = new i(this);
/* 307 */     this.e = new j(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bind(SocketAddress paramSocketAddress) {
/* 314 */     throw new RuntimeException("Not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void close() {
/* 320 */     if (!this.c) {
/*     */       
/* 322 */       this.c = true;
/* 323 */       l.d("Closing steam socket");
/*     */     } 
/* 325 */     if (this.d != null)
/*     */     {
/* 327 */       this.d.a(new byte[0]);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void connect(SocketAddress paramSocketAddress, int paramInt) {
/* 334 */     throw new RuntimeException("Not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void connect(SocketAddress paramSocketAddress) {
/* 340 */     throw new RuntimeException("Not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SocketChannel getChannel() {
/* 346 */     throw new RuntimeException("Not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public InetAddress getInetAddress() {
/* 352 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public InetAddress getLocalAddress() {
/* 358 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SocketAddress getLocalSocketAddress() {
/* 364 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SocketAddress getRemoteSocketAddress() {
/* 370 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InputStream getInputStream() {
/* 377 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getKeepAlive() {
/* 383 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLocalPort() {
/* 390 */     return 5555;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getOOBInline() {
/* 397 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public OutputStream getOutputStream() {
/* 403 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPort() {
/* 409 */     return 5555;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int getReceiveBufferSize() {
/* 415 */     return 512;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getReuseAddress() {
/* 423 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int getSendBufferSize() {
/* 429 */     return 512;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSoLinger() {
/* 435 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int getSoTimeout() {
/* 441 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getTcpNoDelay() {
/* 447 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTrafficClass() {
/* 453 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 459 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isClosed() {
/* 465 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isConnected() {
/* 471 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isInputShutdown() {
/* 477 */     return (this.d != null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOutputShutdown() {
/* 483 */     return (this.e != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendUrgentData(int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKeepAlive(boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOOBInline(boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformancePreferences(int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void setReceiveBufferSize(int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReuseAddress(boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void setSendBufferSize(int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSoLinger(boolean paramBoolean, int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void setSoTimeout(int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTcpNoDelay(boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrafficClass(int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void shutdownInput() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void shutdownOutput() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 564 */     return "<ForwardedSocket>";
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */