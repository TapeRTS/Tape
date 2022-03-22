/*     */ package com.corrodinggames.rts.game.units.custom.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.a.a;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.ag;
/*     */ import com.corrodinggames.rts.game.units.custom.g;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
/*     */ import com.corrodinggames.rts.game.units.custom.p;
/*     */ import com.corrodinggames.rts.gameFramework.d.w;
/*     */ import com.corrodinggames.rts.gameFramework.l;
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
/*     */   public LogicBoolean b;
/*     */   public LogicBoolean c;
/*     */   public ag d;
/*     */   public LogicBoolean e;
/*     */   public ag f;
/*     */   public LogicBoolean g;
/*     */   public ag h;
/*     */   public LogicBoolean i;
/*     */   public g j;
/*     */   public g k;
/*     */   
/*     */   public static a a(c paramc) {
/*  35 */     boolean bool = false;
/*  36 */     if (paramc.u != null)
/*     */     {
/*  38 */       if (paramc.u != LogicBoolean.falseBoolean)
/*     */       {
/*  40 */         bool = true;
/*     */       }
/*     */     }
/*     */     
/*  44 */     if (paramc.w != null)
/*     */     {
/*  46 */       if (paramc.w != LogicBoolean.falseBoolean)
/*     */       {
/*  48 */         bool = true;
/*     */       }
/*     */     }
/*     */     
/*  52 */     if (paramc.y != null)
/*     */     {
/*  54 */       if (paramc.y != LogicBoolean.falseBoolean)
/*     */       {
/*  56 */         bool = true;
/*     */       }
/*     */     }
/*     */     
/*  60 */     if (paramc.r != null)
/*     */     {
/*  62 */       if (paramc.r != LogicBoolean.trueBoolean)
/*     */       {
/*  64 */         bool = true;
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*  69 */     if (paramc.av != null)
/*     */     {
/*  71 */       if (paramc.av != LogicBoolean.falseBoolean)
/*     */       {
/*  73 */         bool = true;
/*     */       }
/*     */     }
/*     */     
/*  77 */     if (paramc.Y != null)
/*     */     {
/*  79 */       bool = true;
/*     */     }
/*     */     
/*  82 */     if (paramc.o != null)
/*     */     {
/*  84 */       bool = true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  89 */     if (!bool)
/*     */     {
/*  91 */       return a.a;
/*     */     }
/*     */     
/*  94 */     b b1 = new b();
/*     */ 
/*     */     
/*  97 */     b1.c = paramc.u;
/*  98 */     b1.d = paramc.v;
/*     */     
/* 100 */     b1.e = paramc.w;
/* 101 */     b1.f = paramc.x;
/*     */     
/* 103 */     b1.g = paramc.y;
/* 104 */     b1.h = paramc.z;
/*     */     
/* 106 */     b1.b = paramc.r;
/*     */     
/* 108 */     b1.i = paramc.av;
/*     */     
/* 110 */     b1.k = paramc.Y;
/*     */     
/* 112 */     b1.j = paramc.o;
/*     */ 
/*     */     
/* 115 */     return b1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static a a(p paramp) {
/* 121 */     boolean bool = false;
/* 122 */     if (paramp.f != null)
/*     */     {
/* 124 */       if (paramp.f != LogicBoolean.falseBoolean)
/*     */       {
/* 126 */         bool = true;
/*     */       }
/*     */     }
/*     */     
/* 130 */     if (!bool)
/*     */     {
/* 132 */       return a.a;
/*     */     }
/*     */     
/* 135 */     b b1 = new b();
/*     */ 
/*     */     
/* 138 */     b1.c = paramp.f;
/* 139 */     b1.d = paramp.g;
/*     */     
/* 141 */     return b1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf) {
/* 147 */     return a(paramaf, -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, int paramInt) {
/* 152 */     if (this.c != null && (paramInt == -1 || paramInt == 1)) {
/*     */       
/* 154 */       if (!(paramaf instanceof k)) {
/*     */         
/* 156 */         l.m("CustomActionConfig lockedInGame:" + paramaf.r().i() + " is not a custom unit");
/* 157 */         return false;
/*     */       } 
/* 159 */       if (this.c.read((k)paramaf))
/*     */       {
/* 161 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 165 */     if (this.e != null && (paramInt == -1 || paramInt == 2)) {
/*     */       
/* 167 */       if (!(paramaf instanceof k)) {
/*     */         
/* 169 */         l.m("CustomActionConfig lockedInGame:" + paramaf.r().i() + " is not a custom unit");
/* 170 */         return false;
/*     */       } 
/* 172 */       if (this.e.read((k)paramaf))
/*     */       {
/* 174 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 178 */     if (this.g != null && (paramInt == -1 || paramInt == 3)) {
/*     */       
/* 180 */       if (!(paramaf instanceof k)) {
/*     */         
/* 182 */         l.m("CustomActionConfig lockedInGame:" + paramaf.r().i() + " is not a custom unit");
/* 183 */         return false;
/*     */       } 
/* 185 */       if (this.g.read((k)paramaf))
/*     */       {
/* 187 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 191 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String b(af paramaf) {
/* 197 */     if (a(paramaf, 1))
/*     */     {
/* 199 */       if (this.d != null)
/*     */       {
/* 201 */         return this.d.b();
/*     */       }
/*     */     }
/*     */     
/* 205 */     if (a(paramaf, 2))
/*     */     {
/* 207 */       if (this.f != null)
/*     */       {
/* 209 */         return this.f.b();
/*     */       }
/*     */     }
/*     */     
/* 213 */     if (a(paramaf, 3))
/*     */     {
/* 215 */       if (this.h != null)
/*     */       {
/* 217 */         return this.h.b();
/*     */       }
/*     */     }
/*     */     
/* 221 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, boolean paramBoolean) {
/* 228 */     if (this.b != null) {
/*     */       
/* 230 */       if (!(paramaf instanceof k)) {
/*     */         
/* 232 */         l.m("CustomActionConfig isAvailable:" + paramaf.r().i() + " is not a custom unit");
/* 233 */         return true;
/*     */       } 
/*     */       
/* 236 */       if (paramBoolean)
/*     */       {
/* 238 */         return w.a(this.b, (k)paramaf);
/*     */       }
/*     */ 
/*     */       
/* 242 */       return this.b.read((k)paramaf);
/*     */     } 
/*     */ 
/*     */     
/* 246 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(af paramaf) {
/* 252 */     if (this.i != null) {
/*     */       
/* 254 */       if (!(paramaf instanceof k)) {
/*     */         
/* 256 */         l.m("CustomActionConfig isGuiBlinking:" + paramaf.r().i() + " is not a custom unit");
/* 257 */         return true;
/*     */       } 
/* 259 */       return this.i.read((k)paramaf);
/*     */     } 
/*     */     
/* 262 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(af paramaf1, af paramaf2) {
/* 269 */     if (this.k != null)
/*     */     {
/* 271 */       this.k.f(paramaf1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public g a() {
/* 279 */     return this.j;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */