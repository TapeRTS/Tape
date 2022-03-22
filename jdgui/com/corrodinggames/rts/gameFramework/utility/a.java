/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import android.os.Looper;
/*     */ import java.util.Map;
/*     */ import java.util.TreeMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends Error
/*     */ {
/*     */   private a(c paramc) {
/*  47 */     super("Application Not Responding", paramc);
/*     */   }
/*     */ 
/*     */   
/*     */   public Throwable fillInStackTrace() {
/*  52 */     setStackTrace(new StackTraceElement[0]);
/*  53 */     return this;
/*     */   }
/*     */   
/*     */   static a a(String paramString, boolean paramBoolean) {
/*  57 */     Thread thread = Looper.b().e();
/*     */     
/*  59 */     TreeMap<Object, Object> treeMap = new TreeMap<>(new a$1(thread));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     for (Map.Entry<Thread, StackTraceElement> entry : Thread.getAllStackTraces().entrySet()) {
/*  73 */       if (entry
/*  74 */         .getKey() == thread || (((Thread)entry
/*     */         
/*  76 */         .getKey()).getName().startsWith(paramString) && (paramBoolean || ((StackTraceElement[])entry
/*     */ 
/*     */ 
/*     */         
/*  80 */         .getValue()).length > 0)))
/*     */       {
/*     */ 
/*     */         
/*  84 */         treeMap.put(entry.getKey(), entry.getValue());
/*     */       }
/*     */     } 
/*  87 */     if (!treeMap.containsKey(thread)) {
/*  88 */       treeMap.put(thread, thread.getStackTrace());
/*     */     }
/*     */     
/*  91 */     c c = null;
/*  92 */     for (Map.Entry<Object, Object> entry : treeMap.entrySet()) {
/*  93 */       (new b(a((Thread)entry.getKey()), (StackTraceElement[])entry.getValue(), null)).getClass(); c = new c(new b(a((Thread)entry.getKey()), (StackTraceElement[])entry.getValue(), null), c, null);
/*     */     } 
/*  95 */     return new a(c);
/*     */   }
/*     */   
/*     */   static a a() {
/*  99 */     Thread thread = Looper.b().e();
/* 100 */     StackTraceElement[] arrayOfStackTraceElement = thread.getStackTrace();
/*     */     
/* 102 */     (new b(a(thread), arrayOfStackTraceElement, null)).getClass(); return new a(new c(new b(a(thread), arrayOfStackTraceElement, null), null, null));
/*     */   }
/*     */   
/*     */   private static String a(Thread paramThread) {
/* 106 */     return paramThread.getName() + " (state = " + paramThread.getState() + ")";
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */