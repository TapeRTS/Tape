/*     */ package android.app;
/*     */ 
/*     */ import android.content.ComponentCallbacks;
/*     */ import android.content.ComponentCallbacks2;
/*     */ import android.content.ContextWrapper;
/*     */ import android.content.res.Configuration;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Application
/*     */   extends ContextWrapper
/*     */   implements ComponentCallbacks2
/*     */ {
/*  45 */   private ArrayList b = new ArrayList();
/*     */   
/*  47 */   private ArrayList c = new ArrayList();
/*     */   
/*  49 */   private ArrayList d = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Application() {
/*  80 */     super(null);
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
/*     */   public void onConfigurationChanged(Configuration paramConfiguration) {
/* 105 */     Object[] arrayOfObject = a();
/* 106 */     if (arrayOfObject != null) {
/* 107 */       for (byte b = 0; b < arrayOfObject.length; b++) {
/* 108 */         ((ComponentCallbacks)arrayOfObject[b]).onConfigurationChanged(paramConfiguration);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void onLowMemory() {
/* 114 */     Object[] arrayOfObject = a();
/* 115 */     if (arrayOfObject != null) {
/* 116 */       for (byte b = 0; b < arrayOfObject.length; b++) {
/* 117 */         ((ComponentCallbacks)arrayOfObject[b]).onLowMemory();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void onTrimMemory(int paramInt) {
/* 123 */     Object[] arrayOfObject = a();
/* 124 */     if (arrayOfObject != null) {
/* 125 */       for (byte b = 0; b < arrayOfObject.length; b++) {
/* 126 */         Object object = arrayOfObject[b];
/* 127 */         if (object instanceof ComponentCallbacks2) {
/* 128 */           ((ComponentCallbacks2)object).onTrimMemory(paramInt);
/*     */         }
/*     */       } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object[] a() {
/* 251 */     Object[] arrayOfObject = null;
/* 252 */     synchronized (this.b) {
/* 253 */       if (this.b.size() > 0) {
/* 254 */         arrayOfObject = this.b.toArray();
/*     */       }
/*     */     } 
/* 257 */     return arrayOfObject;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\app\Application.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */