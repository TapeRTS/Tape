/*     */ package com.corrodinggames.rts.b.a;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class i
/*     */ {
/*     */   public void a() {
/*  15 */     l.d("Running unit tests");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  21 */     (new c()).a();
/*     */     
/*  23 */     (new g()).a();
/*     */ 
/*     */     
/*  26 */     (new d()).a();
/*     */ 
/*     */     
/*  29 */     (new a()).a();
/*     */ 
/*     */     
/*  32 */     (new e()).a();
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
/*     */   public static void a(boolean paramBoolean) {
/*  70 */     if (!paramBoolean)
/*     */     {
/*  72 */       throw new RuntimeException("Asset failed");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void b(boolean paramBoolean) {
/*  78 */     if (paramBoolean)
/*     */     {
/*  80 */       throw new RuntimeException("Asset failed");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(int paramInt1, int paramInt2) {
/*  86 */     if (paramInt1 != paramInt2)
/*     */     {
/*  88 */       throw new RuntimeException("Asset failed (int):" + paramInt1 + "!=" + paramInt2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(float paramFloat1, float paramFloat2) {
/*  94 */     if (f.c(paramFloat1 - paramFloat2) > 0.001F)
/*     */     {
/*  96 */       throw new RuntimeException("Asset failed (float):" + paramFloat1 + "!=" + paramFloat2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(String paramString1, String paramString2) {
/* 102 */     if (!paramString1.equals(paramString2))
/*     */     {
/* 104 */       throw new RuntimeException("Asset failed:" + paramString1 + "!=" + paramString2);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b(String paramString1, String paramString2) {
/* 111 */     Float float_1 = Float.valueOf(Float.parseFloat(paramString1));
/* 112 */     Float float_2 = Float.valueOf(Float.parseFloat(paramString2));
/*     */     
/* 114 */     a(float_1.floatValue(), float_2.floatValue());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(Object paramObject1, Object paramObject2) {
/* 120 */     if (paramObject1 != paramObject2)
/*     */     {
/* 122 */       throw new RuntimeException("Asset failed:" + paramObject1 + "!=" + paramObject2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\b\a\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */