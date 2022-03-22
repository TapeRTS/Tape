/*     */ package com.corrodinggames.rts.gameFramework.k;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Typeface;
/*     */ import com.corrodinggames.rts.game.b.a;
/*     */ import com.corrodinggames.rts.game.b.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.custom.ag;
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.au;
/*     */ import com.corrodinggames.rts.gameFramework.k.a.a;
/*     */ import com.corrodinggames.rts.gameFramework.k.a.b;
/*     */ import com.corrodinggames.rts.gameFramework.k.a.c;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */ {
/*     */   public static a a(f paramf, a parama) {
/*     */     try {
/*     */       e e;
/*  25 */       l l = l.u();
/*     */ 
/*     */       
/*  28 */       String str1 = parama.b;
/*  29 */       if (str1 == null)
/*     */       {
/*  31 */         str1 = "NULL";
/*     */       }
/*     */       
/*  34 */       String str2 = parama.b("id");
/*  35 */       if (str2 != null && !str2.equals(""))
/*     */       {
/*  37 */         str1 = str2;
/*     */       }
/*  39 */       str1 = str1.trim();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  45 */       String str3 = parama.d;
/*  46 */       if (str3 != null) {
/*     */         
/*  48 */         e = e.a(str3);
/*     */         
/*  50 */         if (e == null)
/*     */         {
/*  52 */           f.c("Error: Unknown type:" + str3 + " found on " + str1);
/*  53 */           return null;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/*  58 */         f.c("Error: no type field set for: " + str1);
/*  59 */         return null;
/*     */       } 
/*     */ 
/*     */       
/*  63 */       a a1 = new a();
/*  64 */       a1.t = parama;
/*     */ 
/*     */       
/*  67 */       a1.g = e;
/*     */       
/*  69 */       a1.b = str1;
/*     */       
/*  71 */       byte b = 0;
/*     */       
/*  73 */       for (a a2 : paramf.J) {
/*     */         
/*  75 */         if (a2.b.equalsIgnoreCase(a1.b))
/*     */         {
/*  77 */           b++;
/*     */         }
/*     */       } 
/*  80 */       a1.c = a1.b;
/*     */       
/*  82 */       if (b != 0)
/*     */       {
/*  84 */         a1.c += "_" + b;
/*     */       }
/*     */       
/*  87 */       a1.a = parama.b;
/*     */       
/*  89 */       Integer integer = a1.d("team");
/*  90 */       if (integer != null) {
/*     */         
/*  92 */         a1.y = m.n(integer.intValue());
/*  93 */         if (a1.y == null) {
/*     */ 
/*     */           
/*  96 */           a1.g("Cannot find team:" + integer);
/*  97 */           return null;
/*     */         } 
/*     */       } 
/*     */       
/* 101 */       a1.r = a1.b("delay", a1.r);
/*     */       
/* 103 */       a1.p = a1.b("repeatDelay", a1.p);
/*     */       
/* 105 */       a1.o = a1.a("repeatCount", a1.o);
/*     */       
/* 107 */       a1.q = a1.b("resetActivationAfter", a1.q);
/*     */       
/* 109 */       a1.h = a1.a("allToActivate", false);
/*     */       
/* 111 */       a1.d.b = a1.h;
/*     */ 
/*     */       
/* 114 */       a1.s = a1.b("warmup", a1.s);
/*     */ 
/*     */       
/* 117 */       a1.w = a1.a("textOffsetX", 0.0F);
/* 118 */       a1.x = a1.a("textOffsetY", 0.0F);
/*     */       
/* 120 */       if (a1.g == e.g || a1.g == e.a)
/*     */       {
/* 122 */         a1.z = a1.a("text", (ag)null);
/*     */       }
/*     */ 
/*     */       
/* 126 */       if (a1.g == e.g) {
/*     */         
/* 128 */         paramf.i = true;
/*     */         
/* 130 */         a1.A = new Paint();
/*     */         
/* 132 */         a1.A.a(true);
/* 133 */         a1.A.a(Paint.Align.b);
/* 134 */         a1.A.a(Typeface.a(Typeface.c, 1));
/*     */ 
/*     */         
/* 137 */         int i = a1.c("textColor", -1);
/* 138 */         a1.A.b(i);
/*     */         
/* 140 */         int j = a1.a("textSize", 20);
/* 141 */         l.a(a1.A, j);
/*     */ 
/*     */         
/* 144 */         if (a1.A.f() == 0)
/*     */         {
/* 146 */           a1.g("Text has an alpha of 0");
/*     */         }
/*     */         
/* 149 */         String str = a1.b("style");
/*     */         
/* 151 */         if (str != null && !str.equals(""))
/*     */         {
/*     */           
/* 154 */           if (str.equalsIgnoreCase("arrow")) {
/*     */             
/* 156 */             a1.B = true;
/*     */           }
/*     */           else {
/*     */             
/* 160 */             a1.g("Unknown style: " + str);
/*     */           } 
/*     */         }
/*     */       } 
/*     */       
/* 165 */       if (a1.g == e.e) {
/*     */ 
/*     */         
/* 168 */         String str4 = a1.b("spawnUnits");
/* 169 */         String str5 = "<unitAdd>";
/* 170 */         String str6 = "spawnUnits";
/*     */ 
/*     */         
/*     */         try {
/* 174 */           a1.v = au.a(str4, str5, str6);
/*     */         }
/* 176 */         catch (at at) {
/*     */           
/* 178 */           f.c(at.getMessage());
/* 179 */           return null;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 185 */       if (a1.g == e.d) {
/*     */         
/* 187 */         a1.a("addTeamTags");
/* 188 */         a1.a("removeTeamTags");
/*     */       } 
/*     */ 
/*     */       
/* 192 */       if (a1.g == e.i)
/*     */       {
/* 194 */         a1.a((a)c.b(a1));
/*     */       }
/*     */ 
/*     */       
/* 198 */       if (a1.g == e.j)
/*     */       {
/* 200 */         a1.a((a)b.b(a1));
/*     */       }
/*     */ 
/*     */       
/* 204 */       a1.a("comment");
/*     */ 
/*     */ 
/*     */       
/* 208 */       a1.a("team");
/* 209 */       a1.a("globalMessage");
/* 210 */       a1.a("globalMessage_delayPerChar");
/* 211 */       a1.a("globalMessage_textColor");
/*     */       
/* 213 */       a1.a("debugMessage");
/*     */       
/* 215 */       a1.a("showOnMap");
/*     */       
/* 217 */       a1.a("text");
/* 218 */       a1.a("target");
/*     */       
/* 220 */       a1.a("onlyIfEmpty");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 236 */       if (a1.g == e.b)
/*     */       {
/* 238 */         a1.a("unload");
/*     */       }
/*     */       
/* 241 */       if (a1.g == e.f)
/*     */       {
/* 243 */         a1.a("onlyIfEmpty");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 248 */       return a1;
/*     */     }
/* 250 */     catch (RuntimeException runtimeException) {
/*     */       
/* 252 */       throw new f("Error while reading: " + parama.b(), runtimeException);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\k\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */