/*     */ package com.corrodinggames.rts.a;
/*     */ 
/*     */ import android.util.Log;
/*     */ import android.view.MotionEvent;
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class j
/*     */ {
/*     */   public static final boolean a;
/*     */   public static final boolean b;
/*     */   private static Method c;
/*     */   private static Method d;
/*     */   private static Method e;
/*     */   private static Method f;
/*     */   private static Method g;
/*     */   private static Method h;
/*     */   private static Method i;
/*     */   private static Method j;
/*     */   private static Method k;
/* 208 */   private static int l = 6;
/* 209 */   private static int m = 8;
/*     */   
/*     */   static {
/* 212 */     boolean bool1 = false;
/*     */     
/*     */     try {
/* 215 */       d = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
/* 216 */       e = MotionEvent.class.getMethod("findPointerIndex", new Class[] { int.class });
/* 217 */       f = MotionEvent.class.getMethod("getPressure", new Class[] { int.class });
/* 218 */       g = MotionEvent.class.getMethod("getHistoricalX", new Class[] { int.class, int.class });
/* 219 */       h = MotionEvent.class.getMethod("getHistoricalY", new Class[] { int.class, int.class });
/* 220 */       i = MotionEvent.class.getMethod("getHistoricalPressure", new Class[] { int.class, int.class });
/* 221 */       j = MotionEvent.class.getMethod("getX", new Class[] { int.class });
/* 222 */       k = MotionEvent.class.getMethod("getY", new Class[] { int.class });
/* 223 */       bool1 = true;
/* 224 */     } catch (Exception exception) {
/* 225 */       Log.b("MultiTouchController", "static initializer failed", exception);
/*     */     } 
/* 227 */     a = bool1;
/* 228 */     if (a) {
/*     */       
/*     */       try {
/*     */         
/* 232 */         l = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
/* 233 */         m = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
/* 234 */       } catch (Exception exception) {}
/*     */     }
/*     */ 
/*     */     
/* 238 */     boolean bool2 = false;
/*     */     
/*     */     try {
/* 241 */       c = MotionEvent.class.getMethod("getButtonState", new Class[0]);
/* 242 */       bool2 = true;
/*     */       
/* 244 */       Log.b("MultiTouchController", "--- Mouse API succeeded");
/*     */     
/*     */     }
/* 247 */     catch (Exception exception) {
/*     */       
/* 249 */       Log.b("MultiTouchController", "static initializer for mouse failed", exception);
/*     */     } 
/*     */     
/* 252 */     b = bool2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 263 */     n = new float[10];
/* 264 */     o = new float[10];
/* 265 */     p = new float[10];
/* 266 */     q = new int[10];
/* 267 */     r = new int[10];
/*     */   }
/*     */   
/*     */   private static final float[] n;
/*     */   private static final float[] o;
/*     */   private static final float[] p;
/*     */   private static final int[] q;
/*     */   private static final int[] r;
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\a\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */