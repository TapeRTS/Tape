/*      */ package a.a;
/*      */ 
/*      */ import a.a.a.a;
/*      */ import a.a.a.b;
/*      */ import a.a.a.c;
/*      */ import a.a.a.d;
/*      */ import a.a.a.g;
/*      */ import a.a.a.h;
/*      */ import a.a.a.i;
/*      */ import java.io.EOFException;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.net.DatagramPacket;
/*      */ import java.net.DatagramSocket;
/*      */ import java.net.InetAddress;
/*      */ import java.net.InetSocketAddress;
/*      */ import java.net.Socket;
/*      */ import java.net.SocketAddress;
/*      */ import java.net.SocketException;
/*      */ import java.net.SocketTimeoutException;
/*      */ import java.nio.channels.SocketChannel;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ import java.util.Random;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class h
/*      */   extends Socket
/*      */ {
/*      */   protected DatagramSocket c;
/*      */   protected SocketAddress d;
/*      */   protected o e;
/*      */   protected q f;
/*      */   private byte[] a;
/*      */   
/*      */   public h() {
/*   83 */     this(new r());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public h(r paramr) {
/*   95 */     this(new DatagramSocket(), paramr);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected h(DatagramSocket paramDatagramSocket) {
/*  204 */     this(paramDatagramSocket, new r());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected h(DatagramSocket paramDatagramSocket, r paramr) {
/*  216 */     if (paramDatagramSocket == null) {
/*  217 */       throw new NullPointerException("sock");
/*      */     }
/*      */     
/*  220 */     a(paramDatagramSocket, paramr);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(DatagramSocket paramDatagramSocket, r paramr) {
/*  231 */     this.c = paramDatagramSocket;
/*  232 */     this.g = paramr;
/*      */ 
/*      */     
/*  235 */     this.C = (this.g.a() - 6) * 32;
/*  236 */     this.D = (this.g.a() - 6) * 32;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  253 */     if (this.z == null) {
/*      */       
/*  255 */       this.z = new m(this);
/*  256 */       this.z.start();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void bind(SocketAddress paramSocketAddress) {
/*  264 */     this.c.bind(paramSocketAddress);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void connect(SocketAddress paramSocketAddress) {
/*  271 */     connect(paramSocketAddress, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void connect(SocketAddress paramSocketAddress, int paramInt) {
/*  278 */     if (paramSocketAddress == null) {
/*  279 */       throw new IllegalArgumentException("connect: The address can't be null");
/*      */     }
/*      */     
/*  282 */     if (paramInt < 0) {
/*  283 */       throw new IllegalArgumentException("connect: timeout can't be negative");
/*      */     }
/*      */     
/*  286 */     if (isClosed()) {
/*  287 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  290 */     if (isConnected()) {
/*  291 */       throw new SocketException("already connected");
/*      */     }
/*      */     
/*  294 */     if (!(paramSocketAddress instanceof InetSocketAddress)) {
/*  295 */       throw new IllegalArgumentException("Unsupported address type");
/*      */     }
/*      */     
/*  298 */     this.d = paramSocketAddress;
/*      */     
/*  300 */     d();
/*      */ 
/*      */     
/*  303 */     this.l = 2;
/*  304 */     Random random = new Random(System.currentTimeMillis());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  314 */     g g = new g(this.y.a(random.nextInt(255)), this.g.b(), this.g.a(), this.g.h(), this.g.i(), this.g.g(), this.g.c(), this.g.d(), this.g.e(), this.g.f());
/*      */     
/*  316 */     e((h)g);
/*      */ 
/*      */     
/*  319 */     boolean bool = false;
/*  320 */     synchronized (this) {
/*  321 */       if (!isConnected()) {
/*      */         try {
/*  323 */           if (paramInt == 0) {
/*  324 */             wait();
/*      */           } else {
/*      */             
/*  327 */             long l = System.currentTimeMillis();
/*  328 */             wait(paramInt);
/*  329 */             if (System.currentTimeMillis() - l >= paramInt) {
/*  330 */               bool = true;
/*      */             }
/*      */           }
/*      */         
/*  334 */         } catch (InterruptedException interruptedException) {
/*  335 */           interruptedException.printStackTrace();
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  342 */     if (this.l == 3) {
/*      */       return;
/*      */     }
/*      */     
/*  346 */     synchronized (this.u) {
/*  347 */       this.u.clear();
/*  348 */       this.u.notifyAll();
/*      */     } 
/*      */     
/*  351 */     this.y.l();
/*  352 */     this.F.e();
/*      */     
/*  354 */     switch (this.l) {
/*      */       case 2:
/*  356 */         i();
/*  357 */         this.l = 0;
/*  358 */         if (bool) {
/*  359 */           throw new SocketTimeoutException();
/*      */         }
/*  361 */         throw new SocketException("Connection refused");
/*      */       case 0:
/*      */       case 4:
/*  364 */         this.l = 0;
/*  365 */         throw new SocketException("Socket closed");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public SocketChannel getChannel() {
/*  372 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public InetAddress getInetAddress() {
/*  378 */     if (!isConnected()) {
/*  379 */       return null;
/*      */     }
/*      */     
/*  382 */     return ((InetSocketAddress)this.d).getAddress();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getPort() {
/*  388 */     if (!isConnected()) {
/*  389 */       return 0;
/*      */     }
/*      */     
/*  392 */     return ((InetSocketAddress)this.d).getPort();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SocketAddress getRemoteSocketAddress() {
/*  399 */     if (!isConnected()) {
/*  400 */       return null;
/*      */     }
/*      */     
/*  403 */     return new InetSocketAddress(getInetAddress(), getPort());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public InetAddress getLocalAddress() {
/*  409 */     return this.c.getLocalAddress();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLocalPort() {
/*  415 */     return this.c.getLocalPort();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public SocketAddress getLocalSocketAddress() {
/*  421 */     return this.c.getLocalSocketAddress();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized InputStream getInputStream() {
/*  428 */     if (isClosed()) {
/*  429 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  432 */     if (!isConnected()) {
/*  433 */       throw new SocketException("Socket is not connected");
/*      */     }
/*      */     
/*  436 */     if (isInputShutdown()) {
/*  437 */       throw new SocketException("Socket input is shutdown");
/*      */     }
/*      */     
/*  440 */     if (this.e == null)
/*      */     {
/*  442 */       this.e = new o(this);
/*      */     }
/*      */     
/*  445 */     return this.e;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized OutputStream getOutputStream() {
/*  452 */     if (isClosed()) {
/*  453 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  456 */     if (!isConnected()) {
/*  457 */       throw new SocketException("Socket is not connected");
/*      */     }
/*      */     
/*  460 */     if (isOutputShutdown()) {
/*  461 */       throw new SocketException("Socket output is shutdown");
/*      */     }
/*      */     
/*  464 */     if (this.f == null)
/*      */     {
/*  466 */       this.f = new q(this);
/*      */     }
/*      */     
/*  469 */     return this.f;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void close() {
/*  476 */     synchronized (this.q) {
/*      */ 
/*      */       
/*  479 */       if (isClosed()) {
/*      */         return;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  496 */       e();
/*      */       
/*  498 */       switch (this.l) {
/*      */         case 2:
/*  500 */           synchronized (this) {
/*  501 */             notify();
/*      */           } 
/*      */           break;
/*      */         case 1:
/*      */         case 3:
/*      */         case 4:
/*  507 */           a((h)new d(this.y.a()));
/*  508 */           c();
/*      */           break;
/*      */         
/*      */         case 0:
/*  512 */           this.c.close();
/*      */           break;
/*      */       } 
/*      */ 
/*      */       
/*  517 */       if (this.l != 0)
/*      */       {
/*  519 */         this.p = this.l;
/*      */       }
/*      */       
/*  522 */       this.b = true;
/*  523 */       this.l = 0;
/*      */       
/*  525 */       synchronized (this.u) {
/*  526 */         this.u.notify();
/*      */       } 
/*      */       
/*  529 */       synchronized (this.w) {
/*  530 */         this.w.notify();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBound() {
/*  538 */     return this.c.isBound();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isConnected() {
/*  544 */     return this.i;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isClosed() {
/*  550 */     synchronized (this.q) {
/*  551 */       return this.b;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSoTimeout(int paramInt) {
/*  559 */     if (paramInt < 0) {
/*  560 */       throw new IllegalArgumentException("timeout < 0");
/*      */     }
/*      */     
/*  563 */     this.m = paramInt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void setSendBufferSize(int paramInt) {
/*  570 */     if (paramInt <= 0) {
/*  571 */       throw new IllegalArgumentException("negative receive size");
/*      */     }
/*      */     
/*  574 */     if (isClosed()) {
/*  575 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  578 */     if (isConnected()) {
/*      */       return;
/*      */     }
/*      */     
/*  582 */     this.C = paramInt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized int getSendBufferSize() {
/*  589 */     if (isClosed()) {
/*  590 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  593 */     return this.C;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void setReceiveBufferSize(int paramInt) {
/*  600 */     if (paramInt <= 0) {
/*  601 */       throw new IllegalArgumentException("negative send size");
/*      */     }
/*      */     
/*  604 */     if (isClosed()) {
/*  605 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  608 */     if (isConnected()) {
/*      */       return;
/*      */     }
/*      */     
/*  612 */     this.D = paramInt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized int getReceiveBufferSize() {
/*  619 */     if (isClosed()) {
/*  620 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  623 */     return this.D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTcpNoDelay(boolean paramBoolean) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getTcpNoDelay() {
/*  636 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void setKeepAlive(boolean paramBoolean) {
/*  643 */     if (isClosed()) {
/*  644 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  647 */     if (!(this.k ^ paramBoolean)) {
/*      */       return;
/*      */     }
/*      */     
/*  651 */     this.k = paramBoolean;
/*      */     
/*  653 */     if (isConnected()) {
/*  654 */       if (this.k) {
/*  655 */         this.H.a((this.g.g() * 6), (this.g
/*  656 */             .g() * 6));
/*      */       } else {
/*      */         
/*  659 */         this.H.e();
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized boolean getKeepAlive() {
/*  667 */     if (isClosed()) {
/*  668 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  671 */     return this.k;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void shutdownInput() {
/*  677 */     if (isClosed()) {
/*  678 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  681 */     if (!isConnected()) {
/*  682 */       throw new SocketException("Socket is not connected");
/*      */     }
/*      */     
/*  685 */     if (isInputShutdown()) {
/*  686 */       throw new SocketException("Socket input is already shutdown");
/*      */     }
/*      */     
/*  689 */     this.n = true;
/*      */     
/*  691 */     synchronized (this.x) {
/*  692 */       this.x.notify();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void shutdownOutput() {
/*  699 */     if (isClosed()) {
/*  700 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  703 */     if (!isConnected()) {
/*  704 */       throw new SocketException("Socket is not connected");
/*      */     }
/*      */     
/*  707 */     if (isOutputShutdown()) {
/*  708 */       throw new SocketException("Socket output is already shutdown");
/*      */     }
/*      */     
/*  711 */     this.o = true;
/*      */     
/*  713 */     synchronized (this.u) {
/*  714 */       this.u.notifyAll();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isInputShutdown() {
/*  720 */     return this.n;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isOutputShutdown() {
/*  725 */     return this.o;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  827 */     a(paramArrayOfbyte, paramInt1, paramInt2, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
/*  834 */     if (isClosed()) {
/*  835 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */     
/*  838 */     if (isOutputShutdown()) {
/*  839 */       throw new IOException("Socket output is shutdown");
/*      */     }
/*      */     
/*  842 */     if (!isConnected()) {
/*  843 */       throw new SocketException("Connection reset");
/*      */     }
/*      */     
/*  846 */     int j = 0;
/*  847 */     while (j < paramInt2) {
/*  848 */       synchronized (this.r) {
/*  849 */         while (this.j) {
/*      */           try {
/*  851 */             this.r.wait();
/*      */           }
/*  853 */           catch (InterruptedException interruptedException) {
/*  854 */             interruptedException.printStackTrace();
/*      */           } 
/*      */         } 
/*      */         
/*  858 */         int k = Math.min(this.g.a() - 6, paramInt2 - j);
/*      */ 
/*      */         
/*  861 */         b b = new b(this.y.a(), this.y.b(), paramArrayOfbyte, paramInt1 + j, k);
/*      */         
/*  863 */         e((h)b);
/*      */         
/*  865 */         if (paramBoolean)
/*      */         {
/*  867 */           a((h)b);
/*      */         }
/*      */         
/*  870 */         j += k;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  901 */     int j = 0;
/*      */     
/*  903 */     synchronized (this.x) {
/*      */       
/*      */       while (true) {
/*  906 */         while (this.w.isEmpty()) {
/*      */           
/*  908 */           if (isClosed()) {
/*  909 */             throw new SocketException("Socket is closed");
/*      */           }
/*      */           
/*  912 */           if (isInputShutdown()) {
/*  913 */             throw new EOFException();
/*      */           }
/*      */           
/*  916 */           if (!isConnected()) {
/*  917 */             throw new SocketException("Connection reset");
/*      */           }
/*      */           
/*      */           try {
/*  921 */             if (this.m == 0) {
/*  922 */               this.x.wait();
/*      */               continue;
/*      */             } 
/*  925 */             long l = System.currentTimeMillis();
/*  926 */             this.x.wait(this.m);
/*  927 */             if (System.currentTimeMillis() - l >= this.m) {
/*  928 */               throw new SocketTimeoutException();
/*      */             
/*      */             }
/*      */           }
/*  932 */           catch (InterruptedException interruptedException) {
/*  933 */             interruptedException.printStackTrace();
/*      */           } 
/*      */         } 
/*      */         
/*  937 */         for (Iterator<h> iterator = this.w.iterator(); iterator.hasNext(); ) {
/*  938 */           h h1 = iterator.next();
/*      */           
/*  940 */           if (h1 instanceof a.a.a.f) {
/*  941 */             iterator.remove();
/*      */             break;
/*      */           } 
/*  944 */           if (h1 instanceof d) {
/*  945 */             if (j) {
/*  946 */               iterator.remove();
/*  947 */               return -1;
/*      */             } 
/*      */             break;
/*      */           } 
/*  951 */           if (h1 instanceof b) {
/*  952 */             byte[] arrayOfByte = ((b)h1).c();
/*  953 */             if (arrayOfByte.length + j > paramInt2) {
/*  954 */               if (j <= 0) {
/*  955 */                 throw new IOException("insufficient buffer space");
/*      */               }
/*      */               
/*      */               break;
/*      */             } 
/*  960 */             System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt1 + j, arrayOfByte.length);
/*  961 */             j += arrayOfByte.length;
/*  962 */             iterator.remove();
/*      */           } 
/*      */         } 
/*      */         
/*  966 */         if (j > 0) {
/*  967 */           return j;
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(s params) {
/* 1017 */     if (params == null) {
/* 1018 */       throw new NullPointerException("stateListener");
/*      */     }
/*      */     
/* 1021 */     synchronized (this.t) {
/* 1022 */       if (!this.t.contains(params)) {
/* 1023 */         this.t.add(params);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(h paramh) {
/* 1056 */     if (paramh instanceof b || paramh instanceof a.a.a.f || paramh instanceof d || paramh instanceof a.a.a.e) {
/* 1057 */       h(paramh);
/*      */     }
/*      */ 
/*      */     
/* 1061 */     if (paramh instanceof b || paramh instanceof a.a.a.f || paramh instanceof d) {
/* 1062 */       this.E.d();
/*      */     }
/*      */     
/* 1065 */     if (I) {
/* 1066 */       a("sent " + paramh);
/*      */     }
/*      */     
/* 1069 */     d(paramh);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private h g() {
/*      */     h h1;
/* 1084 */     if ((h1 = a()) != null) {
/*      */       
/* 1086 */       if (I) {
/* 1087 */         a("recv " + h1);
/*      */       }
/*      */       
/* 1090 */       if (h1 instanceof b || h1 instanceof a.a.a.e || h1 instanceof a.a.a.f || h1 instanceof d || h1 instanceof g)
/*      */       {
/*      */         
/* 1093 */         this.y.c();
/*      */       }
/*      */       
/* 1096 */       if (this.k) {
/* 1097 */         this.H.d();
/*      */       }
/*      */     } 
/*      */     
/* 1101 */     return h1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void e(h paramh) {
/* 1114 */     synchronized (this.u) {
/* 1115 */       while (this.u.size() >= this.A || this.y
/* 1116 */         .j() > this.g.b()) {
/*      */         
/* 1118 */         if (this.b) {
/* 1119 */           throw new SocketException("Socket is closed");
/*      */         }
/*      */ 
/*      */         
/*      */         try {
/* 1124 */           this.u.wait(10000L);
/*      */         }
/* 1126 */         catch (InterruptedException interruptedException) {
/* 1127 */           interruptedException.printStackTrace();
/*      */         } 
/*      */       } 
/*      */       
/* 1131 */       this.y.i();
/* 1132 */       this.u.add(paramh);
/*      */     } 
/*      */     
/* 1135 */     if (this.b) {
/* 1136 */       throw new SocketException("Socket is closed");
/*      */     }
/*      */ 
/*      */     
/* 1140 */     if (!(paramh instanceof c) && !(paramh instanceof a)) {
/* 1141 */       synchronized (this.F) {
/* 1142 */         if (this.F.c()) {
/* 1143 */           this.F.a(this.g.h(), this.g
/* 1144 */               .h());
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/* 1149 */     a(paramh);
/*      */     
/* 1151 */     if (paramh instanceof b) {
/* 1152 */       synchronized (this.s) {
/* 1153 */         Iterator<p> iterator = this.s.iterator();
/* 1154 */         while (iterator.hasNext()) {
/* 1155 */           p p = iterator.next();
/* 1156 */           p.a();
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void f(h paramh) {
/* 1172 */     if (this.g.c() > 0) {
/* 1173 */       paramh.b(paramh.o() + 1);
/*      */     }
/*      */     
/* 1176 */     if (this.g.c() != 0 && paramh.o() > this.g.c()) {
/* 1177 */       k();
/*      */       
/*      */       return;
/*      */     } 
/* 1181 */     a(paramh);
/*      */     
/* 1183 */     if (paramh instanceof b) {
/* 1184 */       synchronized (this.s) {
/* 1185 */         Iterator<p> iterator = this.s.iterator();
/* 1186 */         while (iterator.hasNext()) {
/* 1187 */           p p = iterator.next();
/* 1188 */           p.b();
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void h() {
/* 1200 */     if (isConnected()) {
/*      */       
/* 1202 */       this.E.e();
/*      */       
/* 1204 */       if (this.k) {
/* 1205 */         this.H.e();
/*      */       }
/*      */       
/* 1208 */       synchronized (this.r) {
/* 1209 */         this.j = false;
/* 1210 */         this.r.notify();
/*      */       } 
/*      */     } else {
/*      */       
/* 1214 */       synchronized (this) {
/*      */         
/* 1216 */         d();
/*      */         
/* 1218 */         this.i = true;
/* 1219 */         this.l = 3;
/*      */ 
/*      */         
/* 1222 */         notify();
/*      */       } 
/*      */       
/* 1225 */       synchronized (this.t) {
/* 1226 */         Iterator<s> iterator = this.t.iterator();
/* 1227 */         while (iterator.hasNext()) {
/* 1228 */           s s = iterator.next();
/* 1229 */           s.a(this);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1234 */     this.E.a(0L, this.g.g());
/*      */     
/* 1236 */     if (this.k) {
/* 1237 */       this.H.a((this.g.g() * 6), (this.g
/* 1238 */           .g() * 6));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void i() {
/* 1248 */     synchronized (this.t) {
/* 1249 */       Iterator<s> iterator = this.t.iterator();
/* 1250 */       while (iterator.hasNext()) {
/* 1251 */         s s = iterator.next();
/* 1252 */         s.b(this);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void j() {
/* 1263 */     synchronized (this.t) {
/* 1264 */       Iterator<s> iterator = this.t.iterator();
/* 1265 */       while (iterator.hasNext()) {
/* 1266 */         s s = iterator.next();
/* 1267 */         s.c(this);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void k() {
/* 1278 */     synchronized (this.q) {
/*      */       
/* 1280 */       if (isClosed()) {
/*      */         return;
/*      */       }
/*      */       
/* 1284 */       switch (this.l) {
/*      */         case 2:
/* 1286 */           synchronized (this) {
/* 1287 */             notify();
/*      */           } 
/*      */           break;
/*      */         case 1:
/*      */         case 3:
/*      */         case 4:
/* 1293 */           this.i = false;
/* 1294 */           synchronized (this.u) {
/* 1295 */             this.u.notifyAll();
/*      */           } 
/*      */           
/* 1298 */           synchronized (this.x) {
/* 1299 */             this.x.notify();
/*      */           } 
/*      */           
/* 1302 */           c();
/*      */           break;
/*      */       } 
/*      */       
/* 1306 */       this.l = 0;
/* 1307 */       this.b = true;
/*      */     } 
/*      */     
/* 1310 */     synchronized (this.t) {
/* 1311 */       Iterator<s> iterator = this.t.iterator();
/* 1312 */       while (iterator.hasNext()) {
/* 1313 */         s s = iterator.next();
/* 1314 */         s.d(this);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void l() {
/* 1325 */     synchronized (this.t) {
/* 1326 */       Iterator<s> iterator = this.t.iterator();
/* 1327 */       while (iterator.hasNext()) {
/* 1328 */         s s = iterator.next();
/* 1329 */         s.e(this);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(g paramg) {
/*      */     Random random;
/*      */     g g1;
/* 1351 */     switch (this.l) {
/*      */ 
/*      */       
/*      */       case 0:
/* 1355 */         this.l = 1;
/*      */         
/* 1357 */         this
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1368 */           .g = new r(this.A, this.B, paramg.e(), paramg.c(), paramg.i(), paramg.j(), paramg.k(), paramg.l(), paramg.h(), paramg.f(), paramg.g());
/*      */         
/* 1370 */         this.y.b(paramg.m());
/*      */ 
/*      */         
/* 1373 */         random = new Random(System.currentTimeMillis());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1384 */         g1 = new g(this.y.a(random.nextInt(255)), this.g.b(), this.g.a(), this.g.h(), this.g.i(), this.g.g(), this.g.c(), this.g.d(), this.g.e(), this.g.f());
/*      */ 
/*      */ 
/*      */         
/* 1388 */         g1.a(paramg.m());
/* 1389 */         e((h)g1);
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 1:
/* 1397 */         synchronized (this.u) {
/* 1398 */           Iterator<h> iterator = this.u.iterator();
/* 1399 */           while (iterator.hasNext()) {
/* 1400 */             h h1 = iterator.next();
/*      */             try {
/* 1402 */               f(h1);
/*      */             }
/* 1404 */             catch (IOException iOException) {
/* 1405 */               iOException.printStackTrace();
/*      */             } 
/*      */           } 
/*      */         } 
/*      */         break;
/*      */ 
/*      */ 
/*      */       
/*      */       case 2:
/* 1414 */         this.y.b(paramg.m());
/* 1415 */         this.l = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1420 */         m();
/* 1421 */         h();
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(c paramc) {
/* 1443 */     int[] arrayOfInt = paramc.c();
/*      */     
/* 1445 */     int j = paramc.n();
/* 1446 */     int k = arrayOfInt[arrayOfInt.length - 1];
/*      */     
/* 1448 */     synchronized (this.u) {
/*      */       Iterator<h> iterator;
/*      */       
/* 1451 */       for (iterator = this.u.iterator(); iterator.hasNext(); ) {
/* 1452 */         h h1 = iterator.next();
/* 1453 */         if (a(h1.m(), j) <= 0) {
/* 1454 */           iterator.remove();
/*      */           
/*      */           continue;
/*      */         } 
/* 1458 */         for (byte b = 0; b < arrayOfInt.length; b++) {
/* 1459 */           if (a(h1.m(), arrayOfInt[b]) == 0) {
/* 1460 */             iterator.remove();
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1467 */       iterator = this.u.iterator();
/* 1468 */       while (iterator.hasNext()) {
/* 1469 */         h h1 = iterator.next();
/* 1470 */         if (a(j, h1.m()) < 0 && 
/* 1471 */           a(k, h1.m()) > 0) {
/*      */           
/*      */           try {
/* 1474 */             f(h1);
/*      */           }
/* 1476 */           catch (IOException iOException) {
/* 1477 */             iOException.printStackTrace();
/*      */           } 
/*      */         }
/*      */       } 
/*      */       
/* 1482 */       this.u.notifyAll();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void g(h paramh) {
/* 1498 */     if (paramh instanceof a.a.a.f) {
/* 1499 */       synchronized (this.r) {
/* 1500 */         this.j = true;
/*      */       } 
/*      */       
/* 1503 */       l();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1510 */     if (paramh instanceof d) {
/* 1511 */       switch (this.l) {
/*      */         case 2:
/* 1513 */           synchronized (this) {
/* 1514 */             notify();
/*      */           } 
/*      */           break;
/*      */         case 0:
/*      */           break;
/*      */         default:
/* 1520 */           this.l = 4;
/*      */           break;
/*      */       } 
/*      */     }
/* 1524 */     boolean bool = false;
/* 1525 */     synchronized (this.x) {
/*      */       
/* 1527 */       if (a(paramh.m(), this.y.b()) > 0)
/*      */       {
/*      */         
/* 1530 */         if (a(paramh.m(), b(this.y.b())) == 0) {
/* 1531 */           bool = true;
/* 1532 */           if (this.w.size() == 0 || this.w.size() + this.v.size() < this.B)
/*      */           {
/* 1534 */             this.y.b(paramh.m());
/* 1535 */             if (paramh instanceof b || paramh instanceof a.a.a.f || paramh instanceof d) {
/* 1536 */               this.w.add(paramh);
/*      */             }
/*      */             
/* 1539 */             if (paramh instanceof b) {
/* 1540 */               synchronized (this.s) {
/* 1541 */                 Iterator<p> iterator = this.s.iterator();
/* 1542 */                 while (iterator.hasNext()) {
/* 1543 */                   p p = iterator.next();
/* 1544 */                   p.c();
/*      */                 } 
/*      */               } 
/*      */             }
/*      */             
/* 1549 */             p();
/*      */           
/*      */           }
/*      */ 
/*      */         
/*      */         }
/* 1555 */         else if (this.w.size() + this.v.size() < this.B) {
/*      */           
/* 1557 */           boolean bool1 = false;
/* 1558 */           for (byte b = 0; b < this.v.size() && !bool1; b++) {
/* 1559 */             h h1 = this.v.get(b);
/* 1560 */             int j = a(paramh.m(), h1.m());
/* 1561 */             if (j == 0) {
/*      */               
/* 1563 */               bool1 = true;
/*      */             }
/* 1565 */             else if (j < 0) {
/* 1566 */               this.v.add(b, paramh);
/* 1567 */               bool1 = true;
/*      */             } 
/*      */           } 
/*      */           
/* 1571 */           if (!bool1) {
/* 1572 */             this.v.add(paramh);
/*      */           }
/*      */           
/* 1575 */           this.y.f();
/*      */           
/* 1577 */           if (paramh instanceof b) {
/* 1578 */             synchronized (this.s) {
/* 1579 */               Iterator<p> iterator = this.s.iterator();
/* 1580 */               while (iterator.hasNext()) {
/* 1581 */                 p p = iterator.next();
/* 1582 */                 p.d();
/*      */               } 
/*      */             } 
/*      */           }
/*      */         } 
/*      */       }
/* 1588 */       if (bool && (paramh instanceof a.a.a.f || paramh instanceof a.a.a.e || paramh instanceof d)) {
/*      */ 
/*      */         
/* 1591 */         m();
/*      */       }
/* 1593 */       else if (this.y.g() > 0 && (this.g
/* 1594 */         .e() == 0 || this.y.g() > this.g.e())) {
/* 1595 */         n();
/*      */       }
/* 1597 */       else if (this.y.d() > 0 && (this.g
/* 1598 */         .d() == 0 || this.y.d() > this.g.d())) {
/* 1599 */         o();
/*      */       } else {
/*      */         
/* 1602 */         synchronized (this.G) {
/* 1603 */           if (this.G.c()) {
/* 1604 */             this.G.a(this.g.i());
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void m() {
/* 1618 */     synchronized (this.x) {
/* 1619 */       if (!this.v.isEmpty()) {
/* 1620 */         n();
/*      */         
/*      */         return;
/*      */       } 
/* 1624 */       o();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void n() {
/* 1634 */     synchronized (this.x) {
/*      */       
/* 1636 */       if (this.v.isEmpty()) {
/*      */         return;
/*      */       }
/*      */       
/* 1640 */       this.y.e();
/* 1641 */       this.y.h();
/*      */ 
/*      */       
/* 1644 */       int[] arrayOfInt = new int[this.v.size()]; int j;
/* 1645 */       for (j = 0; j < arrayOfInt.length; j++) {
/* 1646 */         h h1 = this.v.get(j);
/* 1647 */         arrayOfInt[j] = h1.m();
/*      */       } 
/*      */       
/*      */       try {
/* 1651 */         j = this.y.b();
/* 1652 */         a((h)new c(b(j), j, arrayOfInt));
/*      */       
/*      */       }
/* 1655 */       catch (IOException iOException) {
/* 1656 */         iOException.printStackTrace();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void o() {
/* 1668 */     if (this.y.e() == 0) {
/*      */       return;
/*      */     }
/*      */     
/*      */     try {
/* 1673 */       int j = this.y.b();
/* 1674 */       a((h)new a(b(j), j));
/*      */     }
/* 1676 */     catch (IOException iOException) {
/* 1677 */       iOException.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void h(h paramh) {
/* 1689 */     if (this.y.e() == 0) {
/*      */       return;
/*      */     }
/*      */     
/* 1693 */     paramh.a(this.y.b());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean b(h paramh) {
/* 1700 */     int j = paramh.n();
/*      */     
/* 1702 */     if (j < 0) {
/* 1703 */       return false;
/*      */     }
/*      */     
/* 1706 */     Iterator<h> iterator = this.u.iterator();
/* 1707 */     while (iterator.hasNext()) {
/* 1708 */       h h1 = iterator.next();
/* 1709 */       if (a(h1.m(), j) <= 0) {
/* 1710 */         return true;
/*      */       }
/*      */     } 
/*      */     
/* 1714 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void c(h paramh) {
/* 1725 */     int j = paramh.n();
/*      */     
/* 1727 */     if (j < 0) {
/*      */       return;
/*      */     }
/*      */     
/* 1731 */     this.y.k();
/*      */ 
/*      */ 
/*      */     
/* 1735 */     synchronized (this.u) {
/*      */ 
/*      */ 
/*      */       
/* 1739 */       Iterator<h> iterator = this.u.iterator();
/* 1740 */       while (iterator.hasNext()) {
/* 1741 */         h h1 = iterator.next();
/* 1742 */         if (a(h1.m(), j) <= 0) {
/* 1743 */           iterator.remove();
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1749 */       if (this.l == 1) {
/*      */         
/* 1751 */         boolean bool = false;
/*      */         
/* 1753 */         if (!this.u.isEmpty()) {
/*      */           
/* 1755 */           Iterator<h> iterator1 = this.u.iterator();
/* 1756 */           while (iterator1.hasNext()) {
/*      */             
/* 1758 */             h h1 = iterator1.next();
/* 1759 */             if (h1 instanceof g)
/*      */             {
/* 1761 */               bool = true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */         
/* 1766 */         if (bool) {
/*      */ 
/*      */ 
/*      */           
/* 1770 */           a("Bad first ack: " + j);
/*      */           
/*      */           return;
/*      */         } 
/*      */         
/* 1775 */         this.l = 3;
/* 1776 */         h();
/*      */       } 
/*      */ 
/*      */       
/* 1780 */       if (this.u.isEmpty()) {
/* 1781 */         this.F.e();
/*      */       }
/*      */       
/* 1784 */       this.u.notifyAll();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void p() {
/* 1794 */     synchronized (this.x) {
/* 1795 */       Iterator<h> iterator = this.v.iterator();
/* 1796 */       while (iterator.hasNext()) {
/* 1797 */         h h1 = iterator.next();
/* 1798 */         if (a(h1.m(), b(this.y.b())) == 0) {
/* 1799 */           this.y.b(h1.m());
/* 1800 */           if (h1 instanceof b || h1 instanceof a.a.a.f || h1 instanceof d) {
/* 1801 */             this.w.add(h1);
/*      */           }
/* 1803 */           iterator.remove();
/*      */         } 
/*      */       } 
/*      */       
/* 1807 */       this.x.notify();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void d(h paramh) {
/*      */     try {
/* 1823 */       DatagramPacket datagramPacket = new DatagramPacket(paramh.d(), paramh.b(), this.d);
/* 1824 */       this.c.send(datagramPacket);
/*      */     }
/* 1826 */     catch (IOException iOException) {
/* 1827 */       if (!isClosed()) {
/* 1828 */         iOException.printStackTrace();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected h a() {
/*      */     try {
/* 1844 */       if (this.a == null)
/*      */       {
/* 1846 */         this.a = new byte[65535];
/*      */       }
/*      */       
/* 1849 */       DatagramPacket datagramPacket = new DatagramPacket(this.a, this.a.length);
/* 1850 */       this.c.receive(datagramPacket);
/* 1851 */       return h.b(datagramPacket.getData(), 0, datagramPacket.getLength());
/*      */     }
/* 1853 */     catch (IOException iOException) {
/* 1854 */       if (!isClosed()) {
/* 1855 */         iOException.printStackTrace();
/*      */       }
/*      */ 
/*      */       
/* 1859 */       return null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void b() {
/* 1867 */     this.c.close();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void c() {
/* 1875 */     this.E.e();
/* 1876 */     this.H.e();
/* 1877 */     this.l = 4;
/*      */     
/* 1879 */     h$1 h$1 = new h$1(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1899 */     h$1.setName("ReliableSocket-Closing");
/* 1900 */     h$1.setDaemon(true);
/* 1901 */     h$1.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected synchronized void a(String paramString) {
/* 1909 */     System.out.println(getLocalPort() + ": " + paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static int b(int paramInt) {
/* 1919 */     return (paramInt + 1) % 255;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int a(int paramInt1, int paramInt2) {
/* 1931 */     if (paramInt1 == paramInt2) {
/* 1932 */       return 0;
/*      */     }
/* 1934 */     if ((paramInt1 < paramInt2 && paramInt2 - paramInt1 > 127) || (paramInt1 > paramInt2 && paramInt1 - paramInt2 < 127))
/*      */     {
/* 1936 */       return 1;
/*      */     }
/*      */     
/* 1939 */     return -1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean b = false;
/*      */ 
/*      */   
/*      */   private boolean i = false;
/*      */ 
/*      */   
/*      */   private boolean j = false;
/*      */   
/*      */   private boolean k = true;
/*      */   
/* 1954 */   private int l = 0;
/* 1955 */   private int m = 0;
/*      */   
/*      */   private boolean n = false;
/*      */   private boolean o = false;
/* 1959 */   private int p = -1;
/*      */   
/* 1961 */   private Object q = new Object();
/* 1962 */   private Object r = new Object();
/*      */   
/* 1964 */   private ArrayList s = new ArrayList();
/* 1965 */   private ArrayList t = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1970 */   protected r g = r.a;
/*      */ 
/*      */   
/* 1973 */   private ArrayList u = new ArrayList();
/* 1974 */   private ArrayList v = new ArrayList();
/* 1975 */   private ArrayList w = new ArrayList();
/*      */   
/* 1977 */   private Object x = new Object();
/* 1978 */   private i y = new i(this);
/*      */ 
/*      */   
/*      */   private Thread z;
/*      */ 
/*      */   
/* 1984 */   private int A = 32;
/* 1985 */   private int B = 32;
/*      */ 
/*      */   
/*      */   private int C;
/*      */ 
/*      */   
/*      */   private int D;
/*      */   
/*      */   public boolean h = false;
/*      */ 
/*      */   
/*      */   public synchronized void d() {
/* 1997 */     if (!this.h) {
/*      */ 
/*      */ 
/*      */       
/* 2001 */       this.h = true;
/*      */       
/* 2003 */       this.E.a();
/* 2004 */       this.F.a();
/* 2005 */       this.G.a();
/* 2006 */       this.H.a();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void e() {
/* 2013 */     if (this.h) {
/*      */ 
/*      */ 
/*      */       
/* 2017 */       this.h = false;
/*      */       
/* 2019 */       this.F.f();
/* 2020 */       this.G.f();
/* 2021 */       this.H.f();
/* 2022 */       this.E.f();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 2032 */   private i E = new i("rudp-NullSegmentTimer", new l(this, null));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 2044 */   private i F = new i("rudp-RetransmissionTimer", new n(this, null));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 2058 */   private i G = new i("rudp-CumulativeAckTimer", new j(this, null));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 2064 */   private i H = new i("rudp-KeepAliveTimer", new k(this, null));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 2075 */   private static final boolean I = Boolean.getBoolean("net.rudp.debug");
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */