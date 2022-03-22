/*     */ package com.corrodinggames.rts.gameFramework.d;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.bi;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.w;
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
/*     */ public class v
/*     */   extends bi
/*     */ {
/*     */   private final a i;
/*  25 */   public ArrayList a = new ArrayList();
/*     */   
/*     */   public float b;
/*     */   
/*     */   public long c;
/*     */   
/*     */   public float d;
/*     */   
/*     */   public float e;
/*     */   
/*     */   public float f;
/*     */   
/*     */   public boolean g;
/*     */   public boolean h;
/*     */   
/*     */   public v(a parama, boolean paramBoolean) {
/*  41 */     this.i = parama;
/*  42 */     this.g = paramBoolean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/*  53 */     af af = null;
/*     */ 
/*     */     
/*  56 */     for (af af1 : this.a) {
/*     */       
/*  58 */       if (!af1.bz && af1.cp == null) {
/*     */         
/*  60 */         boolean bool = this.i.a.j(af1);
/*     */         
/*  62 */         if (bool)
/*     */         {
/*  64 */           af = af1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     if (this.c > l.N() - 700L)
/*     */     {
/*  83 */       if (af != null)
/*     */       {
/*  85 */         this.i.b.b(af.dH, af.dI);
/*     */       }
/*     */     }
/*     */     
/*  89 */     this.c = l.N();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  96 */     this.a.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 102 */     for (w w : w.dK) {
/*     */       
/* 104 */       if (w instanceof r) {
/*     */         
/* 106 */         r r = (r)w;
/* 107 */         if (r.ci)
/*     */         {
/* 109 */           if (!this.a.contains(r))
/*     */           {
/* 111 */             this.a.add(r);
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ap paramap) {
/* 123 */     d();
/*     */     
/* 125 */     paramap.a(this.b);
/* 126 */     paramap.a(this.c);
/* 127 */     int i = this.a.size();
/* 128 */     paramap.a(i);
/* 129 */     for (af af : this.a)
/*     */     {
/* 131 */       paramap.a(af);
/*     */     }
/* 133 */     paramap.c(0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/* 139 */     this.b = paramk.g();
/* 140 */     this.c = paramk.i();
/* 141 */     this.a.clear();
/* 142 */     int i = paramk.f();
/* 143 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 145 */       af af = paramk.n();
/* 146 */       if (af != null)
/*     */       {
/* 148 */         this.a.add(af);
/*     */       }
/*     */     } 
/*     */     
/* 152 */     paramk.d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/* 159 */     if (this.a.size() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 164 */     for (Iterator<af> iterator = this.a.iterator(); iterator.hasNext(); ) {
/*     */       
/* 166 */       af af = iterator.next();
/*     */       
/* 168 */       if (af.bz)
/*     */       {
/* 170 */         iterator.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 177 */     if (this.a.size() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 182 */     ArrayList<af> arrayList = new ArrayList();
/*     */     
/* 184 */     for (af af1 : this.a) {
/*     */       
/* 186 */       af af2 = w.a(af1.dA, true);
/* 187 */       if (af2 != null && !af2.bz)
/*     */       {
/* 189 */         arrayList.add(af2);
/*     */       }
/*     */     } 
/*     */     
/* 193 */     this.a = arrayList;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */