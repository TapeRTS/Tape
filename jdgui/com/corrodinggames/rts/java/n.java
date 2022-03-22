/*     */ package com.corrodinggames.rts.java;
/*     */ 
/*     */ import android.content.Context;
/*     */ import com.corrodinggames.rts.gameFramework.a.h;
/*     */ import com.corrodinggames.rts.gameFramework.a.i;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ad;
/*     */ import com.corrodinggames.rts.gameFramework.utility.j;
/*     */ import com.corrodinggames.rts.java.audio.Sound;
/*     */ import com.corrodinggames.rts.java.audio.a.a;
/*     */ import com.corrodinggames.rts.java.audio.a.c;
/*     */ import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
/*     */ import java.io.InputStream;
/*     */ import java.util.concurrent.LinkedBlockingQueue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class n
/*     */   extends h
/*     */ {
/*  27 */   final int a = 15;
/*     */   
/*  29 */   LinkedBlockingQueue b = new LinkedBlockingQueue();
/*  30 */   ad c = new ad(15);
/*     */   
/*     */   q d;
/*     */   
/*     */   public Object b() {
/*  35 */     return this.f;
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
/*     */   Context e;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OpenALAudio f;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public n(OpenALAudio paramOpenALAudio) {
/* 133 */     for (byte b = 0; b < 15; b++)
/*     */     {
/* 135 */       this.c.a(new o());
/*     */     }
/* 137 */     this.f = paramOpenALAudio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Context paramContext) {
/* 142 */     if (this.e != null) {
/*     */       
/* 144 */       l.d("SlickSoundFactory:setContext context already set");
/*     */       
/*     */       return;
/*     */     } 
/* 148 */     this.e = paramContext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public i a(int paramInt) {
/* 156 */     String str1 = f.e(paramInt);
/*     */     
/* 158 */     p p = new p(this, str1, this);
/* 159 */     String str2 = f.e(paramInt);
/*     */ 
/*     */     
/* 162 */     if (str2 == null)
/*     */     {
/* 164 */       throw new RuntimeException("Failed to find sound for res id:" + paramInt);
/*     */     }
/*     */     
/* 167 */     synchronized (b()) {
/*     */       
/* 169 */       a a = new a(str2);
/*     */       
/* 171 */       p.a = (Sound)this.f.newSound(a);
/*     */     } 
/*     */     
/* 174 */     return p;
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
/*     */   
/*     */   public i a(String paramString, j paramj, boolean paramBoolean) {
/* 214 */     n n1 = this;
/* 215 */     if (!paramBoolean)
/*     */     {
/* 217 */       n1 = null;
/*     */     }
/*     */     
/* 220 */     p p = new p(this, paramString, n1);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 226 */       synchronized (b())
/*     */       {
/* 228 */         p.a = (Sound)this.f.newSound(new a((InputStream)paramj, paramj.d()));
/*     */       }
/*     */     
/*     */     }
/* 232 */     catch (c c) {
/*     */       
/* 234 */       c.printStackTrace();
/* 235 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 239 */     return p;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 249 */     if (this.d != null)
/*     */     {
/* 251 */       throw new RuntimeException("startThreads: soundThread!=null");
/*     */     }
/*     */     
/* 254 */     this.d = new q(this);
/* 255 */     this.d.start();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */