/*     */ package com.corrodinggames.rts.java.c;
/*     */ 
/*     */ import com.codedisaster.steamworks.SteamID;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class i
/*     */   extends Socket
/*     */ {
/*     */   b a;
/*     */   boolean b = false;
/*     */   j c;
/*     */   k d;
/*     */   SteamID e;
/*     */   
/*     */   public i(b paramb, SteamID paramSteamID) {
/* 350 */     this.a = paramb;
/*     */ 
/*     */     
/* 353 */     this.e = paramSteamID;
/*     */ 
/*     */     
/* 356 */     this.c = new j(this);
/* 357 */     this.d = new k(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bind(SocketAddress paramSocketAddress) {
/* 364 */     throw new RuntimeException("Not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void close() {
/* 370 */     if (!this.b) {
/*     */       
/* 372 */       this.b = true;
/* 373 */       l.d("Closing steam socket");
/*     */     } 
/* 375 */     if (this.c != null)
/*     */     {
/* 377 */       this.c.a(new byte[0]);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void connect(SocketAddress paramSocketAddress, int paramInt) {
/* 384 */     throw new RuntimeException("Not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void connect(SocketAddress paramSocketAddress) {
/* 390 */     throw new RuntimeException("Not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SocketChannel getChannel() {
/* 396 */     throw new RuntimeException("Not supported");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public InetAddress getInetAddress() {
/* 402 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public InetAddress getLocalAddress() {
/* 408 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SocketAddress getLocalSocketAddress() {
/* 414 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SocketAddress getRemoteSocketAddress() {
/* 420 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InputStream getInputStream() {
/* 427 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getKeepAlive() {
/* 433 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLocalPort() {
/* 442 */     return 5555;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getOOBInline() {
/* 449 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public OutputStream getOutputStream() {
/* 455 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPort() {
/* 461 */     return 5555;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int getReceiveBufferSize() {
/* 467 */     return 512;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getReuseAddress() {
/* 475 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int getSendBufferSize() {
/* 481 */     return 512;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSoLinger() {
/* 487 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int getSoTimeout() {
/* 493 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getTcpNoDelay() {
/* 499 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTrafficClass() {
/* 505 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 511 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isClosed() {
/* 517 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isConnected() {
/* 523 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isInputShutdown() {
/* 529 */     return (this.c != null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOutputShutdown() {
/* 535 */     return (this.d != null);
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
/* 616 */     return "<SteamSocket>";
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */