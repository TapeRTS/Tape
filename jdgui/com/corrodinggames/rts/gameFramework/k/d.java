/*     */ package com.corrodinggames.rts.gameFramework.k;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.custom.i;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.d.j;
/*     */ import com.corrodinggames.rts.gameFramework.d.n;
/*     */ import com.corrodinggames.rts.gameFramework.e;
/*     */ import com.corrodinggames.rts.gameFramework.g.ad;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */ {
/*     */   public static void a(f paramf, a parama) {
/*  30 */     l l = l.u();
/*     */     
/*  32 */     boolean bool1 = false;
/*     */     
/*  34 */     if (!parama.j)
/*     */     {
/*  36 */       bool1 = true;
/*     */     }
/*     */ 
/*     */     
/*  40 */     paramf.a(parama);
/*     */ 
/*     */     
/*  43 */     parama.i = true;
/*     */     
/*  45 */     parama.j = true;
/*     */     
/*  47 */     parama.k = l.bh;
/*     */     
/*  49 */     boolean bool2 = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     String str1 = parama.b("globalMessage");
/*  83 */     if (str1 != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  91 */       j j = l.bA.e.a(null, parama.b("globalMessage"));
/*  92 */       if (j != null) {
/*     */         
/*  94 */         String str3 = "globalMessage_delayPerChar";
/*     */         
/*  96 */         String str4 = parama.b(str3);
/*     */         
/*  98 */         if (str4 != null)
/*     */         {
/* 100 */           if (str4.equals("slow")) {
/*     */             
/* 102 */             j.e = 18;
/*     */           }
/*     */           else {
/*     */             
/* 106 */             int k = parama.b(str3, -1);
/* 107 */             if (k != -1)
/*     */             {
/* 109 */               j.e = k;
/*     */             }
/*     */           } 
/*     */         }
/*     */         
/* 114 */         int i = parama.c("globalMessage_textColor", -1);
/* 115 */         if (i != -1)
/*     */         {
/* 117 */           j.f = i;
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 123 */       bool2 = true;
/*     */     } 
/*     */     
/* 126 */     String str2 = parama.b("debugMessage");
/* 127 */     if (str2 != null) {
/*     */       
/* 129 */       parama.h("Debug: " + str2);
/*     */       
/* 131 */       if (l.be && l.aV) {
/*     */         
/* 133 */         String str = "Debug: " + str2;
/* 134 */         ad.a(null, str);
/*     */       } 
/*     */       
/* 137 */       bool2 = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 142 */     boolean bool = parama.a("showOnMap", false);
/* 143 */     if (bool) {
/*     */       
/* 145 */       l.bE.a(parama.b(), parama.c(), n.d);
/*     */       
/* 147 */       bool2 = true;
/*     */     } 
/*     */ 
/*     */     
/* 151 */     if (parama.g == e.a) {
/*     */       
/* 153 */       if (bool1)
/*     */       {
/* 155 */         parama.h("objective met");
/*     */       }
/*     */       
/* 158 */       bool2 = true;
/*     */     } 
/*     */     
/* 161 */     if (parama.g == e.k)
/*     */     {
/* 163 */       bool2 = true;
/*     */     }
/*     */     
/* 166 */     if (parama.g == e.i)
/*     */     {
/* 168 */       bool2 = true;
/*     */     }
/*     */     
/* 171 */     if (parama.g == e.j)
/*     */     {
/* 173 */       bool2 = true;
/*     */     }
/*     */     
/* 176 */     if (parama.g == e.g)
/*     */     {
/* 178 */       bool2 = true;
/*     */     }
/*     */     
/* 181 */     if (parama.g == e.h) {
/*     */       
/* 183 */       bool2 = true;
/*     */       
/* 185 */       float f1 = parama.b();
/* 186 */       float f2 = parama.c();
/*     */       
/* 188 */       l.b(f1, f2);
/*     */     } 
/*     */ 
/*     */     
/* 192 */     if (parama.g == e.e) {
/*     */ 
/*     */       
/* 195 */       float f1 = parama.b();
/* 196 */       float f2 = parama.c();
/* 197 */       float f3 = 0.0F;
/* 198 */       float f4 = 0.0F;
/* 199 */       m m = parama.a();
/*     */       
/* 201 */       af af = null;
/*     */       
/* 203 */       boolean bool3 = false;
/* 204 */       m m1 = null;
/* 205 */       boolean bool4 = false;
/*     */       
/* 207 */       parama.v.a(f1, f2, f3, f4, m, bool3, af, m1, bool4);
/*     */       
/* 209 */       bool2 = true;
/*     */     } 
/*     */     
/* 212 */     if (parama.g == e.c) {
/*     */       
/* 214 */       m m = parama.a();
/* 215 */       if (m == null) {
/*     */         
/* 217 */         parama.g("Team not set for changeCredits");
/*     */         return;
/*     */       } 
/* 220 */       Integer integer1 = parama.d("set");
/* 221 */       if (integer1 != null)
/*     */       {
/* 223 */         m.m = integer1.intValue();
/*     */       }
/* 225 */       Integer integer2 = parama.d("add");
/* 226 */       if (integer2 != null)
/*     */       {
/* 228 */         m.h(integer2.intValue());
/*     */       }
/*     */       
/* 231 */       bool2 = true;
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 237 */     if (parama.g == e.d) {
/*     */       
/* 239 */       m m = parama.a();
/* 240 */       if (m == null) {
/*     */         
/* 242 */         parama.g("Team not set for event_teamTags");
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 247 */       String str3 = parama.a("addTeamTags", (String)null);
/*     */       
/* 249 */       if (str3 != null) {
/*     */         
/* 251 */         i i = h.a(str3);
/* 252 */         m.b(i);
/*     */       } 
/*     */       
/* 255 */       String str4 = parama.a("removeTeamTags", (String)null);
/* 256 */       if (str4 != null) {
/*     */         
/* 258 */         i i = h.a(str4);
/* 259 */         m.c(i);
/*     */       } 
/*     */       
/* 262 */       bool2 = true;
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 268 */     if (parama.g == e.b) {
/*     */ 
/*     */       
/* 271 */       String str = parama.b("target");
/* 272 */       if (str == null) {
/*     */ 
/*     */         
/* 275 */         f.i("Move trigger has no target id:" + parama.a);
/*     */         
/*     */         return;
/*     */       } 
/* 279 */       PointF pointF = paramf.f(str);
/* 280 */       if (pointF == null) {
/*     */ 
/*     */         
/* 283 */         f.i("Move trigger: Cannot find target for:" + parama.a + " target:" + str);
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 288 */       m m = parama.a();
/* 289 */       if (m == null) {
/*     */ 
/*     */         
/* 292 */         f.i("Team not set map trigger:" + parama.a);
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 298 */       byte b = 0;
/*     */       
/* 300 */       e e = l.bN.b(m);
/* 301 */       for (af af : af.bj) {
/*     */         
/* 303 */         if (af.bB == m)
/*     */         {
/* 305 */           if (af instanceof r)
/*     */           {
/* 307 */             if (parama.a(af))
/*     */             {
/* 309 */               if (parama.b(af)) {
/*     */                 
/* 311 */                 r r = (r)af;
/* 312 */                 e.a(r);
/*     */                 
/* 314 */                 b++;
/*     */               } 
/*     */             }
/*     */           }
/*     */         }
/*     */       } 
/*     */       
/* 321 */       e.a(pointF.a, pointF.b);
/*     */       
/* 323 */       if (bool1)
/*     */       {
/* 325 */         paramf.b("firstActivation: move at:" + l.bh + " for teamId:" + m.i + " to targetId:" + str + " (#units:" + b + ")");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 331 */       if (parama.b("unload") != null)
/*     */       {
/*     */ 
/*     */         
/* 335 */         for (af af : af.bj) {
/*     */           
/* 337 */           if (af.bB == m && af instanceof r)
/*     */           {
/*     */             
/* 340 */             if (parama.a(af) && parama.b(af))
/*     */             {
/* 342 */               if (af.cc()) {
/*     */                 
/* 344 */                 r r = (r)af;
/*     */ 
/*     */                 
/* 347 */                 e e1 = l.bN.b(m);
/* 348 */                 e1.e = true;
/* 349 */                 e1.a(r);
/*     */                 
/* 351 */                 c c = r.ca();
/*     */                 
/* 353 */                 e1.a(c);
/*     */               } 
/*     */             }
/*     */           }
/*     */         } 
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 363 */       bool2 = true;
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 371 */     if (parama.g == e.f) {
/*     */ 
/*     */       
/* 374 */       m m = new m();
/* 375 */       for (af af : af.bj) {
/*     */         
/* 377 */         if (af instanceof r)
/*     */         {
/* 379 */           if (parama.a(af))
/*     */           {
/* 381 */             if (parama.b(af))
/*     */             {
/* 383 */               m.add(af);
/*     */             }
/*     */           }
/*     */         }
/*     */       } 
/*     */       
/* 389 */       if (m.size() > 0)
/*     */       {
/* 391 */         for (af af : m)
/*     */         {
/* 393 */           af.bU();
/*     */         }
/*     */       }
/*     */       
/* 397 */       bool2 = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 402 */     if (!bool2)
/*     */     {
/* 404 */       parama.h("Trigger activated with no effect");
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\k\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */