/*    */ package com.corrodinggames.rts.gameFramework.a;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.f;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class i
/*    */ {
/*    */   public String d;
/*    */   public boolean e;
/*    */   public boolean f;
/*    */   
/*    */   public i(String paramString, h paramh) {
/* 39 */     this.e = false;
/*    */     this.d = f.g(paramString);
/*    */     if (paramh != null)
/*    */       paramh.g.put(this.d, this); 
/*    */   }
/*    */   
/*    */   public abstract void a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3);
/*    */   
/*    */   public abstract int a();
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\a\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */