/*     */ package com.corrodinggames.rts.java.c;
/*     */ 
/*     */ import com.codedisaster.steamworks.SteamAPI;
/*     */ import com.codedisaster.steamworks.SteamException;
/*     */ import com.codedisaster.steamworks.SteamFriends;
/*     */ import com.codedisaster.steamworks.SteamID;
/*     */ import com.codedisaster.steamworks.SteamMatchmaking;
/*     */ import com.codedisaster.steamworks.SteamNetworking;
/*     */ import com.codedisaster.steamworks.SteamUGC;
/*     */ import com.codedisaster.steamworks.SteamUtils;
/*     */ import com.corrodinggames.librocket.scripts.ScriptEngine;
/*     */ import com.corrodinggames.rts.gameFramework.g.c;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.l.a;
/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
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
/*     */ public class b
/*     */   extends a
/*     */ {
/*     */   d b;
/*     */   SteamFriends c;
/*     */   SteamMatchmaking d;
/*     */   e e;
/*     */   f f;
/*     */   g g;
/*     */   SteamNetworking h;
/*     */   c i;
/*     */   SteamUtils j;
/*     */   
/*     */   public g m() {
/*  76 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean k = false;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  88 */     if (this.k) {
/*     */       
/*  90 */       l.d("SteamEngine - init already called");
/*     */       
/*     */       return;
/*     */     } 
/*  94 */     this.k = true;
/*     */     
/*  96 */     l.d("SteamEngine - java steamEngine init()");
/*     */ 
/*     */     
/*     */     try {
/*     */       SteamUGC steamUGC;
/*     */       
/* 102 */       if (!SteamAPI.init()) {
/*     */ 
/*     */         
/* 105 */         l.b("steamAPI init failed");
/*     */ 
/*     */         
/* 108 */         d();
/*     */         
/*     */         return;
/*     */       } 
/* 112 */       this.m = ByteBuffer.allocateDirect(100000);
/*     */ 
/*     */ 
/*     */       
/* 116 */       this.b = new d(this);
/* 117 */       this.c = new SteamFriends(this.b);
/*     */       
/* 119 */       this.e = new e(this);
/* 120 */       this.d = new SteamMatchmaking(this.e);
/*     */ 
/*     */       
/* 123 */       this.f = new f(this);
/* 124 */       this.h = new SteamNetworking(this.f, SteamNetworking.API.Client);
/*     */ 
/*     */       
/* 127 */       this.g = new g(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 135 */         steamUGC = new SteamUGC(this.g.a());
/*     */       }
/* 137 */       catch (RuntimeException runtimeException) {
/*     */         
/* 139 */         runtimeException.printStackTrace();
/* 140 */         throw new SteamException("Failed to create workshop");
/*     */       } 
/*     */       
/* 143 */       this.g.a(steamUGC);
/*     */ 
/*     */       
/* 146 */       this.i = new c(this);
/* 147 */       this.j = new SteamUtils(this.i);
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 152 */     catch (SteamException steamException) {
/*     */       
/* 154 */       steamException.printStackTrace();
/*     */ 
/*     */       
/* 157 */       d();
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
/* 168 */   HashMap l = new HashMap<>();
/*     */   
/*     */   ByteBuffer m;
/*     */   
/*     */   SteamID n;
/*     */   
/*     */   boolean o;
/*     */   SteamID p;
/*     */   
/*     */   public void a(float paramFloat) {
/* 178 */     SteamAPI.runCallbacks();
/*     */ 
/*     */     
/* 181 */     if (this.h != null) {
/*     */ 
/*     */       
/* 184 */       if (l.aC != null) {
/*     */         
/* 186 */         l.d("Joining game from commandline invite:" + l.aC);
/*     */         
/* 188 */         long l = Long.parseLong(l.aC);
/* 189 */         l.aC = null;
/*     */         
/* 191 */         SteamID steamID = SteamID.createFromNativeHandle(l);
/*     */         
/* 193 */         this.d.joinLobby(steamID);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       while (true) {
/* 201 */         int i = this.h.isP2PPacketAvailable(0);
/* 202 */         if (i == 0) {
/*     */           break;
/*     */         }
/*     */ 
/*     */         
/* 207 */         if (i > this.m.capacity()) {
/*     */           
/* 209 */           l.b("nextPacketSize:" + i + " larger then byteBuffer:" + this.m.capacity() + " resizing");
/* 210 */           this.m = ByteBuffer.allocateDirect(i);
/*     */         } 
/*     */         
/* 213 */         SteamID steamID = new SteamID();
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 219 */           this.m.clear();
/*     */           
/* 221 */           int j = this.h.readP2PPacket(steamID, this.m, 0);
/*     */           
/* 223 */           if (j == 0)
/*     */           {
/* 225 */             l.b("readP2PPacket with rtn==" + j);
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 232 */           i i1 = (i)this.l.get(steamID);
/*     */           
/* 234 */           if (i1 != null)
/*     */           {
/* 236 */             if (i1.isClosed()) {
/*     */               
/* 238 */               l.b("Removing stale steam socket");
/* 239 */               this.l.remove(steamID);
/* 240 */               i1 = null;
/*     */             } 
/*     */           }
/*     */ 
/*     */ 
/*     */           
/* 246 */           if (i1 == null) {
/*     */ 
/*     */ 
/*     */             
/* 250 */             b(steamID);
/*     */             
/* 252 */             i1 = (i)this.l.get(steamID);
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 258 */           if (i1 == null) {
/*     */             
/* 260 */             l.d("Could not find remote ID steamSocket: " + steamID);
/*     */             
/*     */             continue;
/*     */           } 
/*     */           
/* 265 */           int k = this.m.limit();
/*     */           
/* 267 */           byte[] arrayOfByte = new byte[k];
/* 268 */           this.m.get(arrayOfByte);
/*     */           
/* 270 */           i1.c.a(arrayOfByte);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         }
/* 277 */         catch (SteamException steamException) {
/*     */           
/* 279 */           steamException.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/* 292 */     l.b("JavaSteamEngine: disableSteam");
/* 293 */     l l = l.u();
/*     */     
/* 295 */     if (l != null) {
/*     */       
/* 297 */       l.h("Steam connection failed.");
/*     */     }
/*     */     else {
/*     */       
/* 301 */       l.d("cannot show alert game has not been created");
/*     */     } 
/*     */     
/* 304 */     a.a = new a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String c() {
/* 311 */     return this.c.getPersonaName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean f() {
/* 319 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String paramString) {
/* 325 */     l.d("Steam: " + paramString);
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/* 329 */     l.b("Steam: " + paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void i() {
/* 340 */     a("createLobby");
/*     */     
/* 342 */     if (this.n != null)
/*     */     {
/* 344 */       b("createLobby: activeLobby!=null");
/*     */     }
/*     */     
/* 347 */     this.d.createLobby(SteamMatchmaking.LobbyType.FriendsOnly, 10);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void a(SteamID paramSteamID) {
/* 354 */     l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 364 */     this.n = paramSteamID;
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
/*     */   public c b(SteamID paramSteamID) {
/* 387 */     l.d("addPeer: " + paramSteamID);
/*     */ 
/*     */     
/* 390 */     l l = l.u();
/*     */ 
/*     */     
/* 393 */     i i1 = (i)this.l.get(paramSteamID);
/* 394 */     if (i1 != null)
/*     */     {
/* 396 */       if (i1.isClosed()) {
/*     */         
/* 398 */         this.l.remove(paramSteamID);
/*     */       }
/*     */       else {
/*     */         
/* 402 */         b("addPeer, user already exists");
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 408 */           i1.close();
/*     */         }
/* 410 */         catch (IOException iOException) {
/*     */           
/* 412 */           iOException.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 420 */     i i2 = new i(this, paramSteamID);
/*     */     
/* 422 */     c c1 = new c(l.bF, i2);
/*     */ 
/*     */     
/*     */     try {
/* 426 */       c1.i = true;
/*     */       
/* 428 */       c1.d();
/*     */       
/* 430 */       l.bF.aV.add(c1);
/*     */ 
/*     */       
/* 433 */       this.l.put(paramSteamID, i2);
/*     */       
/* 435 */       l.bF.I();
/*     */       
/* 437 */       return c1;
/*     */     }
/* 439 */     catch (IOException iOException) {
/*     */ 
/*     */       
/* 442 */       iOException.printStackTrace();
/*     */       
/* 444 */       c1.a("crash");
/*     */ 
/*     */       
/* 447 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(SteamID paramSteamID) {
/* 453 */     l.d("connectTo: " + paramSteamID);
/*     */ 
/*     */ 
/*     */     
/* 457 */     i i = (i)this.l.get(paramSteamID);
/* 458 */     if (i != null)
/*     */     {
/* 460 */       if (i.isClosed()) {
/*     */         
/* 462 */         this.l.remove(paramSteamID);
/*     */       }
/*     */       else {
/*     */         
/* 466 */         b("connectTo, user already exists");
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 471 */           i.close();
/*     */         }
/* 473 */         catch (IOException iOException) {
/*     */           
/* 475 */           iOException.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 480 */     l l = l.u();
/*     */ 
/*     */     
/* 483 */     if (!this.o) {
/*     */ 
/*     */ 
/*     */       
/* 487 */       SteamID steamID = paramSteamID;
/*     */       
/* 489 */       b$1 b$1 = new b$1(this, steamID);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 565 */       ScriptEngine.getInstance().addRunnableToQueue(b$1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 584 */       a("connectTo as server?");
/*     */       
/* 586 */       b(paramSteamID);
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
/*     */   public void j() {
/* 602 */     a("stopLobby");
/*     */ 
/*     */     
/* 605 */     if (this.n == null) {
/*     */       
/* 607 */       b("stopLobby: activeLobby==null");
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 612 */       this.d.leaveLobby(this.n);
/*     */     } 
/*     */     
/* 615 */     a("stopLobby: activeSteamSockets:" + this.l.size());
/*     */     
/* 617 */     for (i i : this.l.values()) {
/*     */ 
/*     */       
/*     */       try {
/* 621 */         i.close();
/*     */       }
/* 623 */       catch (IOException iOException) {
/*     */         
/* 625 */         iOException.printStackTrace();
/*     */       } 
/*     */     } 
/* 628 */     this.l.clear();
/*     */ 
/*     */     
/* 631 */     this.n = null;
/* 632 */     this.p = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {
/* 639 */     if (this.n == null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 654 */     if (this.n == null) {
/*     */       
/* 656 */       l.u().h("Error: No steam lobby has been started");
/*     */       
/*     */       return;
/*     */     } 
/* 660 */     this.c.activateGameOverlayInviteDialog(this.n);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/* 669 */     this.g.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void l() {
/* 680 */     m().b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(com.corrodinggames.rts.gameFramework.f.b paramb) {
/* 686 */     m().c(paramb);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(com.corrodinggames.rts.gameFramework.f.b paramb) {
/* 692 */     m().b(paramb);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(com.corrodinggames.rts.gameFramework.f.b paramb, boolean paramBoolean, String paramString) {
/* 698 */     m().a(paramb, paramBoolean, paramString);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */