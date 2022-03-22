/*     */ package com.corrodinggames.rts.game.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class h
/*     */   extends o
/*     */ {
/*  21 */   ArrayList B = new ArrayList();
/*  22 */   ArrayList C = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int g() {
/*  28 */     return this.B.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  37 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  42 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public h(a parama) {
/*  47 */     super(parama);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h() {
/*  53 */     for (o o1 : this.R.aU) {
/*     */       
/*  55 */       if (o1 instanceof n) {
/*     */         
/*  57 */         n n = (n)o1;
/*  58 */         if (n.m == this)
/*     */         {
/*  60 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void i() {
/*  71 */     Iterator<r> iterator = this.B.iterator();
/*  72 */     while (iterator.hasNext()) {
/*     */       
/*  74 */       r r = iterator.next();
/*  75 */       if (r == null || r.bz) {
/*     */         
/*  77 */         if (r != null && r.ar == this)
/*     */         {
/*  79 */           r.ar = null;
/*     */         }
/*     */         
/*  82 */         if (r != null)
/*     */         {
/*  84 */           this.C.remove(r);
/*     */         }
/*     */         
/*  87 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  94 */     Iterator<r> iterator = this.C.iterator();
/*  95 */     while (iterator.hasNext()) {
/*     */       
/*  97 */       r r = iterator.next();
/*  98 */       if (r == null || r.bz || r.cp != null || r.cq != null)
/*     */       {
/* 100 */         iterator.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/* 108 */     l();
/* 109 */     this.C.clear();
/*     */ 
/*     */     
/* 112 */     super.k();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(r paramr) {
/* 118 */     if (paramr.ar != null)
/*     */     {
/* 120 */       paramr.ar.b(paramr);
/*     */     }
/*     */     
/* 123 */     if (paramr.bB != null)
/*     */     {
/* 125 */       if (paramr.bB != this.R)
/*     */       {
/* 127 */         l.f("unit.team:" + paramr.bB.i + ", ai:" + this.R.i);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 132 */     this.B.add(paramr);
/* 133 */     paramr.ar = this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(r paramr) {
/* 140 */     this.B.remove(paramr);
/*     */     
/* 142 */     this.C.remove(paramr);
/*     */     
/* 144 */     if (paramr.ar == this)
/*     */     {
/* 146 */       paramr.ar = null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void l() {
/* 153 */     for (r r : this.B) {
/*     */       
/* 155 */       if (r != null && r.ar == this)
/*     */       {
/* 157 */         r.ar = null;
/*     */       }
/*     */     } 
/* 160 */     this.B.clear();
/*     */   }
/*     */   
/*     */   public abstract void a(float paramFloat);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\a\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */