/*     */ package com.corrodinggames.rts.game.units.custom.a.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.ad;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.a.a;
/*     */ import com.corrodinggames.rts.game.units.custom.a.c;
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.au;
/*     */ import com.corrodinggames.rts.game.units.custom.b.i;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   extends a
/*     */ {
/*     */   public au a;
/*     */   public ArrayList b;
/*     */   public int c;
/*     */   public boolean d;
/*     */   public boolean e;
/*     */   public boolean f;
/*     */   
/*     */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/*  52 */     au au1 = au.a(paraml, paramab, paramString1, paramString2 + "attachments_addNewUnits");
/*     */ 
/*     */     
/*  55 */     int i = paramab.b(paramString1, paramString2 + "attachments_deleteNumUnits", Integer.valueOf(0)).intValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  62 */     boolean bool1 = paramab.a(paramString1, paramString2 + "attachments_disconnect", Boolean.valueOf(false)).booleanValue();
/*     */     
/*  64 */     boolean bool2 = paramab.a(paramString1, paramString2 + "attachments_unload", Boolean.valueOf(false)).booleanValue();
/*     */     
/*  66 */     boolean bool3 = paramab.a(paramString1, paramString2 + "disconnectFromParent", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */     
/*  69 */     if (!au1.b() || i != 0 || bool3 || bool1 || bool2) {
/*     */ 
/*     */       
/*  72 */       e e1 = new e();
/*     */       
/*  74 */       e1.a = au1;
/*     */       
/*  76 */       String str = paramab.b(paramString1, "attachments_onlyOnSlots", null);
/*     */       
/*  78 */       if (str != null) {
/*     */         
/*  80 */         String[] arrayOfString = str.split(",");
/*     */         
/*  82 */         for (String str1 : arrayOfString) {
/*     */           
/*  84 */           str1 = str1.trim();
/*  85 */           if (!str1.equals("")) {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  90 */             i i1 = paraml.g(str1);
/*  91 */             if (e1.b == null)
/*     */             {
/*  93 */               e1.b = new ArrayList();
/*     */             }
/*     */ 
/*     */             
/*  97 */             if (i1 == null)
/*     */             {
/*  99 */               throw new at("[" + paramString1 + "]attachments_onlyOnSlots: Could not find attachment slot with name: " + str1);
/*     */             }
/*     */             
/* 102 */             e1.b.add(i1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 108 */       e1.c = i;
/*     */       
/* 110 */       e1.f = bool3;
/*     */ 
/*     */       
/* 113 */       e1.d = bool1;
/*     */       
/* 115 */       e1.e = bool2;
/*     */ 
/*     */       
/* 118 */       paramc.W.add(e1);
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
/*     */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/* 136 */     if (this.d || this.e)
/*     */     {
/* 138 */       if (paramk.y != null && paramk.y.size() > 0)
/*     */       {
/* 140 */         for (int i = paramk.y.size() - 1; i >= 0; i--) {
/*     */           
/* 142 */           af af1 = (af)paramk.y.get(i);
/*     */           
/* 144 */           if (af1 == null) {
/*     */             continue;
/*     */           }
/*     */ 
/*     */           
/* 149 */           if (this.b != null) {
/*     */ 
/*     */             
/* 152 */             boolean bool = false;
/* 153 */             for (i i1 : this.b) {
/*     */               
/* 155 */               if (i1.a() == i) {
/*     */                 
/* 157 */                 bool = true;
/*     */                 break;
/*     */               } 
/*     */             } 
/* 161 */             if (!bool) {
/*     */               continue;
/*     */             }
/*     */           } 
/*     */ 
/*     */           
/* 167 */           if (!(af1 instanceof r)) {
/*     */             
/* 169 */             l.d("Failed to deattach unit:" + af1.r().i() + " is not an OrderableUnit");
/*     */           } else {
/*     */             
/* 172 */             r r = (r)af1;
/*     */             
/* 174 */             if (this.e) {
/*     */ 
/*     */ 
/*     */               
/* 178 */               boolean bool = (paramk.x.size() % 2 == 0) ? true : false;
/*     */               
/* 180 */               paramk.a((af)r, true, bool);
/*     */               
/*     */               break;
/*     */             } 
/*     */             
/* 185 */             r.bs();
/*     */             
/*     */             break;
/*     */           } 
/*     */           
/*     */           continue;
/*     */         } 
/*     */       }
/*     */     }
/* 194 */     if (this.c != 0)
/*     */     {
/* 196 */       for (byte b = 0; b < this.c; b++) {
/*     */         
/* 198 */         if (paramk.y != null && paramk.y.size() > 0)
/*     */         {
/*     */           
/* 201 */           for (int i = paramk.y.size() - 1; i >= 0; i--) {
/*     */             
/* 203 */             af af1 = (af)paramk.y.get(i);
/*     */             
/* 205 */             if (af1 == null) {
/*     */               continue;
/*     */             }
/*     */ 
/*     */ 
/*     */             
/* 211 */             if (this.b != null) {
/*     */ 
/*     */ 
/*     */               
/* 215 */               boolean bool = false;
/* 216 */               for (i i1 : this.b) {
/*     */                 
/* 218 */                 if (i1.a() == i) {
/*     */                   
/* 220 */                   bool = true;
/*     */                   
/*     */                   break;
/*     */                 } 
/*     */               } 
/* 225 */               if (!bool) {
/*     */                 continue;
/*     */               }
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 250 */             af1.bU();
/*     */           } 
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 261 */     if (this.a != null) {
/*     */       
/* 263 */       m m = new m();
/*     */       
/* 265 */       this.a.a(m, paramk.bB, (af)paramk, true);
/*     */       
/* 267 */       for (af af1 : m) {
/*     */         
/* 269 */         boolean bool = false;
/*     */ 
/*     */         
/* 272 */         if (!(af1 instanceof r)) {
/*     */           
/* 274 */           l.d("Failed to attach unit:" + af1.r().i() + " is not an OrderableUnit");
/*     */           
/*     */           continue;
/*     */         } 
/* 278 */         r r = (r)af1;
/*     */ 
/*     */         
/* 281 */         if (this.b != null) {
/*     */           
/* 283 */           for (i i : this.b) {
/*     */ 
/*     */ 
/*     */             
/* 287 */             if (paramk.a(i) == null)
/*     */             {
/* 289 */               if (paramk.a(r, i)) {
/*     */                 
/* 291 */                 r.cs = -9999;
/*     */                 
/* 293 */                 bool = true;
/*     */ 
/*     */ 
/*     */                 
/*     */                 break;
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } else {
/* 302 */           for (i i : paramk.v.ap) {
/*     */ 
/*     */ 
/*     */             
/* 306 */             if (paramk.a(i) == null)
/*     */             {
/* 308 */               if (paramk.a(r, i)) {
/*     */                 
/* 310 */                 r.cs = -9999;
/*     */                 
/* 312 */                 bool = true;
/*     */ 
/*     */                 
/*     */                 break;
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/*     */         
/* 321 */         if (!bool)
/*     */         {
/*     */           
/* 324 */           r.a();
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
/* 337 */     if (this.f) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 342 */       if (paramk.cq != null)
/*     */       {
/* 344 */         paramk.bs();
/*     */       }
/*     */       
/* 347 */       if (paramk.cp != null)
/*     */       {
/* 349 */         if (paramk.cp instanceof ad) {
/*     */           
/* 351 */           ((ad)paramk.cp).e((af)paramk);
/*     */         }
/*     */         else {
/*     */           
/* 355 */           l.f("transportedBy is not a TransportInterface");
/* 356 */           paramk.cp = null;
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 366 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */