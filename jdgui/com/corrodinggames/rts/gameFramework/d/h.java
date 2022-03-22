/*    */ package com.corrodinggames.rts.gameFramework.d;
/*    */ 
/*    */ import android.graphics.Point;
/*    */ import com.corrodinggames.rts.game.b.g;
/*    */ import com.corrodinggames.rts.game.units.af;
/*    */ import com.corrodinggames.rts.game.units.d.c;
/*    */ import com.corrodinggames.rts.gameFramework.f;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class h
/*    */ {
/* 14 */   static Point a = new Point();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Point a(int paramInt1, int paramInt2, int paramInt3) {
/* 20 */     l l = l.u();
/*    */     
/* 22 */     int i = paramInt3;
/*    */     
/* 24 */     l.bt.a(paramInt1, paramInt2);
/*    */     
/* 26 */     int j = l.bt.M;
/* 27 */     int k = l.bt.N;
/*    */     
/* 29 */     Point point = null;
/* 30 */     float f = -1.0F;
/*    */     
/* 32 */     for (int m = j - i; m <= j + i; m++) {
/*    */       
/* 34 */       for (int n = k - i; n <= k + i; n++) {
/*    */         
/* 36 */         if (l.bt.c(m, n)) {
/*    */ 
/*    */           
/* 39 */           g g = l.bt.e(m, n);
/* 40 */           if (g != null)
/*    */           {
/* 42 */             if (g.i) {
/*    */               
/* 44 */               af af = c.b(m, n);
/*    */               
/* 46 */               if (af != null)
/*    */               {
/* 48 */                 if (!af.bR())
/*    */                 {
/* 50 */                   af = null;
/*    */                 }
/*    */               }
/*    */               
/* 54 */               if (af == null) {
/*    */ 
/*    */                 
/* 57 */                 float f1 = f.a(j, k, m, n);
/*    */                 
/* 59 */                 if (f == -1.0F || f > f1) {
/*    */                   
/* 61 */                   l.bt.a(m, n);
/*    */                   
/* 63 */                   a.a(l.bt.M, l.bt.N);
/* 64 */                   point = a;
/*    */                   
/* 66 */                   f = f1;
/*    */                 } 
/*    */               } 
/*    */             } 
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 76 */     return point;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */