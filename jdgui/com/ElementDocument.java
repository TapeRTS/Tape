/*     */ package com;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ public class ElementDocument
/*     */   extends Element {
/*     */   public static final int NONE = 0;
/*     */   public static final int FOCUS = 2;
/*     */   public static final int MODAL = 4;
/*     */   public String documentPath;
/*     */   public HashMap metadata;
/*     */   public boolean translatedToUnicode;
/*     */   
/*     */   public void show() {
/*  16 */     show(2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public native void show(int paramInt);
/*     */ 
/*     */ 
/*     */   
/*     */   public native void hide();
/*     */ 
/*     */ 
/*     */   
/*     */   public void closeDocument() {
/*  30 */     close();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private native void close();
/*     */ 
/*     */ 
/*     */   
/*     */   public native void pullToFront();
/*     */ 
/*     */   
/*     */   public native void pushToBack();
/*     */ 
/*     */   
/*     */   public Object getMetadata(String paramString) {
/*  46 */     if (this.metadata == null)
/*     */     {
/*  48 */       return null;
/*     */     }
/*  50 */     return this.metadata.get(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getMetadata(String paramString, Object paramObject) {
/*  55 */     if (this.metadata == null)
/*     */     {
/*  57 */       return paramObject;
/*     */     }
/*  59 */     Object object = this.metadata.get(paramString);
/*     */     
/*  61 */     if (object == null)
/*     */     {
/*  63 */       return paramObject;
/*     */     }
/*  65 */     return object;
/*     */   }
/*     */ 
/*     */   
/*     */   public Float getMetadataFloat(String paramString) {
/*  70 */     Object object = getMetadata(paramString);
/*  71 */     if (object instanceof Float)
/*     */     {
/*  73 */       return (Float)object;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMetadata(String paramString, Object paramObject) {
/*  84 */     if (this.metadata == null)
/*     */     {
/*  86 */       this.metadata = new HashMap<>();
/*     */     }
/*  88 */     this.metadata.put(paramString, paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMetadataFloat(String paramString, Float paramFloat) {
/*  93 */     setMetadata(paramString, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public HashMap getMetadataMap() {
/*  98 */     if (this.metadata == null)
/*     */     {
/* 100 */       this.metadata = new HashMap<>();
/*     */     }
/* 102 */     return this.metadata;
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
/* 115 */   public ArrayList pageTimers = new ArrayList(1);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\ElementDocument.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */