/*     */ package com.corrodinggames.rts.gameFramework.d;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Typeface;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
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
/*     */ public class i
/*     */ {
/*     */   f a;
/*     */   l b;
/*     */   Paint c;
/*     */   boolean d;
/*     */   ArrayList e;
/*     */   
/*     */   i(l paraml, f paramf) {
/*  63 */     this.e = new ArrayList();
/*     */     this.a = paramf;
/*     */     this.b = paraml;
/*     */     a();
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
/*     */   public void a() {
/*     */     this.c = new Paint();
/*     */     this.c.a(255, 255, 255, 255);
/*     */     this.c.a(true);
/*     */     this.c.c(true);
/*     */     this.c.a(Typeface.a(Typeface.c, 1));
/*     */     this.b.a(this.c, 16.0F);
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
/*     */   public synchronized void b() {
/*     */     this.d = false;
/*     */     this.e.clear();
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
/*     */   public synchronized void c() {
/* 117 */     Iterator<j> iterator = this.e.iterator();
/* 118 */     while (iterator.hasNext()) {
/*     */       
/* 120 */       j j = iterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 129 */       if (this.e.size() > 15)
/*     */       {
/* 131 */         iterator.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized j a(String paramString1, String paramString2) {
/* 140 */     l l1 = l.u();
/*     */ 
/*     */     
/* 143 */     j j = new j();
/*     */     
/* 145 */     j.a = paramString1;
/* 146 */     j.b = paramString2;
/*     */     
/* 148 */     j.c = System.currentTimeMillis();
/*     */     
/* 150 */     j.d = (new SimpleDateFormat("HH:mm:ss")).format(new Date());
/*     */ 
/*     */ 
/*     */     
/* 154 */     if (paramString1 != null && !paramString1.equals(""))
/*     */     {
/* 156 */       if (!l1.by.showPlayerChatInGame) {
/*     */         
/* 158 */         if (!this.d) {
/*     */           
/* 160 */           this.d = true;
/* 161 */           a(null, "[WARNING: A player send a chat message, but you have chat muted in your settings]");
/*     */         } 
/*     */         
/* 164 */         return j;
/*     */       } 
/*     */     }
/*     */     
/* 168 */     c();
/*     */     
/* 170 */     this.e.add(j);
/*     */     
/* 172 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void a(float paramFloat) {
/* 179 */     l l1 = l.u();
/*     */     
/* 181 */     c();
/*     */     
/* 183 */     int j = 95;
/* 184 */     byte b = 20;
/* 185 */     int k = (int)(20.0F * l1.bQ);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 192 */     boolean bool = l1.a();
/*     */     
/* 194 */     for (int m = this.e.size() - 1; m >= 0; m--) {
/*     */       
/* 196 */       j j1 = this.e.get(m);
/*     */ 
/*     */       
/* 199 */       if (j1.b()) {
/*     */         String str;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 207 */         if (j1.a == null || j1.a.equals("")) {
/*     */           
/* 209 */           str = j1.b;
/*     */         }
/*     */         else {
/*     */           
/* 213 */           str = j1.a + ": " + j1.b;
/*     */         } 
/*     */         
/* 216 */         if (bool)
/*     */         {
/* 218 */           str = j1.d + ": " + str;
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 223 */         if (j1.e > 0) {
/*     */ 
/*     */           
/* 226 */           int n = j1.a();
/*     */           
/* 228 */           int i1 = n / j1.e;
/*     */           
/* 230 */           if (i1 < 0)
/*     */           {
/* 232 */             i1 = 0;
/*     */           }
/* 234 */           if (i1 < str.length())
/*     */           {
/* 236 */             str = str.substring(0, i1);
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 241 */         this.c.b(j1.f);
/*     */         
/* 243 */         l1.bw.a(str, b, j, this.c);
/*     */         
/* 245 */         j += k;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */