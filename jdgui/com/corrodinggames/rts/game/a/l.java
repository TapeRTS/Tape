/*     */ package com.corrodinggames.rts.game.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class l
/*     */   extends h
/*     */ {
/*  14 */   float a = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ap paramap) {
/*  20 */     int i = this.B.size();
/*  21 */     paramap.a(i);
/*  22 */     for (r r : this.B)
/*     */     {
/*  24 */       paramap.a(r);
/*     */     }
/*     */ 
/*     */     
/*  28 */     paramap.c(1);
/*     */ 
/*     */ 
/*     */     
/*  32 */     paramap.a(this.C.size());
/*  33 */     for (r r : this.C)
/*     */     {
/*  35 */       paramap.a(r);
/*     */     }
/*     */     
/*  38 */     paramap.a(this.a);
/*     */ 
/*     */     
/*  41 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/*  47 */     l();
/*  48 */     int i = paramk.f(); byte b;
/*  49 */     for (b = 0; b < i; b++) {
/*     */       
/*  51 */       r r = paramk.o();
/*  52 */       if (r != null)
/*     */       {
/*  54 */         a(r);
/*     */       }
/*     */     } 
/*     */     
/*  58 */     b = paramk.d();
/*     */     
/*  60 */     if (b >= 1) {
/*     */ 
/*     */       
/*  63 */       this.C.clear();
/*  64 */       int j = paramk.f();
/*  65 */       for (byte b1 = 0; b1 < j; b1++) {
/*     */         
/*  67 */         r r = paramk.o();
/*  68 */         if (r != null)
/*     */         {
/*  70 */           this.C.add(r);
/*     */         }
/*     */       } 
/*     */       
/*  74 */       this.a = paramk.g();
/*     */     } 
/*     */ 
/*     */     
/*  78 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public l(a parama) {
/*  85 */     super(parama);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/*  91 */     i();
/*     */     
/*  93 */     if (!h())
/*     */     {
/*  95 */       this.a += paramFloat;
/*     */     }
/*     */     
/*  98 */     Iterator<r> iterator = this.B.iterator();
/*  99 */     while (iterator.hasNext()) {
/*     */       
/* 101 */       r r = iterator.next();
/*     */       
/* 103 */       if (c((af)r) < 3600.0F && r.cp == null) {
/*     */ 
/*     */ 
/*     */         
/* 107 */         if (r.ar == this)
/*     */         {
/* 109 */           r.ar = null;
/*     */         }
/* 111 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 121 */     if (this.B.size() == 0 || this.a > 5000.0F)
/*     */     {
/* 123 */       k();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(r paramr) {
/* 133 */     a(paramr);
/*     */ 
/*     */     
/* 136 */     this.C.add(paramr);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\a\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */