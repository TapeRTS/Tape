/*     */ package a.a;
/*     */ 
/*     */ import java.net.DatagramSocket;
/*     */ import java.net.InetAddress;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketAddress;
/*     */ import java.net.SocketException;
/*     */ import java.net.SocketTimeoutException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   extends ServerSocket
/*     */ {
/*     */   c a;
/*     */   private DatagramSocket d;
/*     */   private int e;
/*     */   private int f;
/*     */   private boolean g;
/*     */   private ArrayList h;
/*     */   private HashMap i;
/*     */   private HashMap j;
/*     */   private HashMap k;
/*     */   long b;
/*     */   int c;
/*     */   private s l;
/*     */   
/*     */   public b() {
/*  77 */     this(new DatagramSocket(null), 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public b(int paramInt1, int paramInt2, InetAddress paramInetAddress, boolean paramBoolean) {
/* 144 */     DatagramSocket datagramSocket = new DatagramSocket(null);
/*     */     
/* 146 */     datagramSocket.setReuseAddress(paramBoolean);
/* 147 */     datagramSocket.bind(new InetSocketAddress(paramInetAddress, paramInt1));
/*     */     
/* 149 */     a(datagramSocket, paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public b(DatagramSocket paramDatagramSocket, int paramInt) {
/* 164 */     a(paramDatagramSocket, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(DatagramSocket paramDatagramSocket, int paramInt) {
/* 170 */     if (paramDatagramSocket == null) {
/* 171 */       throw new NullPointerException("sock");
/*     */     }
/*     */     
/* 174 */     this.d = paramDatagramSocket;
/* 175 */     this.f = (paramInt <= 0) ? 50 : paramInt;
/* 176 */     this.h = new ArrayList(this.f);
/* 177 */     this.i = new HashMap<>();
/* 178 */     this.j = new HashMap<>();
/* 179 */     this.k = new HashMap<>();
/*     */     
/* 181 */     this.l = new f(this, null);
/* 182 */     this.e = 0;
/* 183 */     this.g = false;
/*     */     
/* 185 */     (new d(this)).start();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(c paramc) {
/* 197 */     this.a = paramc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Socket accept() {
/* 204 */     if (isClosed()) {
/* 205 */       throw new SocketException("Socket is closed");
/*     */     }
/*     */     
/* 208 */     synchronized (this.h) {
/* 209 */       while (this.h.isEmpty()) {
/*     */         try {
/* 211 */           if (this.e == 0) {
/* 212 */             this.h.wait();
/*     */           } else {
/*     */             
/* 215 */             long l = System.currentTimeMillis();
/* 216 */             this.h.wait(this.e);
/* 217 */             if (System.currentTimeMillis() - l >= this.e) {
/* 218 */               throw new SocketTimeoutException();
/*     */             }
/*     */           }
/*     */         
/*     */         }
/* 223 */         catch (InterruptedException interruptedException) {
/* 224 */           interruptedException.printStackTrace();
/*     */         } 
/*     */         
/* 227 */         if (isClosed()) {
/* 228 */           throw new SocketException("Socket is closed");
/*     */         }
/*     */       } 
/*     */       
/* 232 */       return this.h.remove(0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void bind(SocketAddress paramSocketAddress) {
/* 239 */     bind(paramSocketAddress, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void bind(SocketAddress paramSocketAddress, int paramInt) {
/* 245 */     if (isClosed()) {
/* 246 */       throw new SocketException("Socket is closed");
/*     */     }
/*     */     
/* 249 */     this.d.setReuseAddress(true);
/* 250 */     this.d.bind(paramSocketAddress);
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void close() {
/* 255 */     if (isClosed()) {
/*     */       return;
/*     */     }
/*     */     
/* 259 */     this.g = true;
/* 260 */     synchronized (this.h) {
/* 261 */       this.h.clear();
/* 262 */       this.h.notify();
/*     */     } 
/*     */     
/* 265 */     synchronized (this.i) {
/*     */       
/* 267 */       if (this.i.isEmpty()) {
/* 268 */         this.d.close();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InetAddress getInetAddress() {
/* 278 */     return this.d.getInetAddress();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLocalPort() {
/* 283 */     return this.d.getLocalPort();
/*     */   }
/*     */ 
/*     */   
/*     */   public SocketAddress getLocalSocketAddress() {
/* 288 */     return this.d.getLocalSocketAddress();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 293 */     return this.d.isBound();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isClosed() {
/* 298 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSoTimeout(int paramInt) {
/* 303 */     if (paramInt < 0) {
/* 304 */       throw new IllegalArgumentException("timeout < 0");
/*     */     }
/*     */     
/* 307 */     this.e = paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSoTimeout() {
/* 312 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(SocketAddress paramSocketAddress, e parame) {
/* 363 */     synchronized (this.i) {
/*     */       
/* 365 */       parame.a(this.l);
/* 366 */       this.i.put(paramSocketAddress, parame);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private e a(SocketAddress paramSocketAddress) {
/* 379 */     synchronized (this.i) {
/* 380 */       e e = (e)this.i.remove(paramSocketAddress);
/*     */       
/* 382 */       if (this.i.isEmpty() && 
/* 383 */         isClosed()) {
/* 384 */         this.d.close();
/*     */       }
/*     */ 
/*     */       
/* 388 */       return e;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(String paramString) {
/* 429 */     if (this.b + 5000L < System.currentTimeMillis()) {
/*     */       
/* 431 */       this.b = System.currentTimeMillis();
/* 432 */       this.c = 0;
/*     */     } 
/* 434 */     if (this.c > 20) {
/*     */       return;
/*     */     }
/*     */     
/* 438 */     this.c++;
/*     */     
/* 440 */     System.out.println(paramString);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */