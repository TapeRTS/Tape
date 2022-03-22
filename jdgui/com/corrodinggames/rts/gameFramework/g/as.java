/*    */ package com.corrodinggames.rts.gameFramework.g;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.TimerTask;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class as
/*    */   extends TimerTask
/*    */ {
/*    */   private final ad c;
/*    */   public boolean a = true;
/* 18 */   public long b = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   as(ad paramad) {
/* 26 */     this.c = paramad;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void run() {
/*    */     try {
/* 36 */       long l = System.currentTimeMillis();
/*    */       
/* 38 */       if (this.c.aD != 0L)
/*    */       {
/* 40 */         if (l > this.c.aD + 5L || l < this.c.aD) {
/*    */           
/* 42 */           this.c.aD = 0L;
/* 43 */           this.c.I();
/*    */         } 
/*    */       }
/*    */       
/* 47 */       if (l > this.b + 1000L || l < this.b)
/*    */       {
/*    */         
/* 50 */         this.b = l;
/*    */         
/* 52 */         if (this.a) {
/*    */           
/* 54 */           ap ap = new ap();
/* 55 */           ap.a(System.currentTimeMillis());
/* 56 */           ap.c(0);
/* 57 */           ar ar = ap.b(108);
/* 58 */           this.c.g(ar);
/*    */         }
/*    */         else {
/*    */           
/* 62 */           this.c.H();
/*    */         } 
/*    */         
/* 65 */         this.a = !this.a;
/*    */       
/*    */       }
/*    */     
/*    */     }
/* 70 */     catch (IOException iOException) {
/*    */ 
/*    */       
/* 73 */       iOException.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */