/*    */ package com.corrodinggames.rts.java.audio.a;
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
/*    */ class n
/*    */ {
/* 52 */   static final float[] a = new float[16384];
/*    */   static {
/*    */     byte b;
/* 55 */     for (b = 0; b < '䀀'; b++)
/* 56 */       a[b] = (float)Math.sin(((b + 0.5F) / 16384.0F * 6.2831855F)); 
/* 57 */     for (b = 0; b < 'Ũ'; b += 90)
/* 58 */       a[(int)(b * 45.511112F) & 0x3FFF] = (float)Math.sin((b * 0.017453292F)); 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\a\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */