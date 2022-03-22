/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.b.c;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class j
/*     */   extends s
/*     */ {
/*     */   public k a;
/*     */   
/*     */   public j() {
/*  24 */     this(k.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public j(k paramk) {
/*  29 */     super("c_6_" + paramk.name());
/*     */     
/*  31 */     this.a = paramk;
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
/*     */   public int b(af paramaf, boolean paramBoolean) {
/*  70 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/*  75 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ak t() {
/*  83 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public u e() {
/*  89 */     return u.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public t f() {
/*  94 */     return t.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/* 100 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/* 106 */     return "Ping Map" + this.a.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public String b() {
/* 111 */     return this.a.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public String H() {
/* 116 */     return this.a.c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String c(af paramaf) {
/* 122 */     return a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 129 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 137 */   static ArrayList b = new ArrayList();
/*     */   
/*     */   static {
/* 140 */     for (k k1 : k.values())
/*     */     {
/* 142 */       b.add(new j(k1));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static j a(c paramc) {
/* 149 */     for (s s1 : b) {
/*     */       
/* 151 */       if (s1.d(paramc))
/*     */       {
/* 153 */         return (j)s1;
/*     */       }
/*     */     } 
/* 156 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList r(af paramaf) {
/* 164 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e r() {
/* 172 */     return (c.n[9]).i;
/*     */   }
/*     */   
/* 175 */   static Rect c = new Rect();
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect s() {
/* 180 */     int i = 7 + this.a.ordinal();
/*     */     
/* 182 */     c.a(29 * i, 0, 29 * i + 28, 28);
/*     */     
/* 184 */     return c;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */