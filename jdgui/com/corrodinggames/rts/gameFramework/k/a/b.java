/*    */ package com.corrodinggames.rts.gameFramework.k.a;
/*    */ 
/*    */ import com.corrodinggames.rts.game.b.f;
/*    */ import com.corrodinggames.rts.game.m;
/*    */ import com.corrodinggames.rts.game.units.custom.at;
/*    */ import com.corrodinggames.rts.game.units.custom.h;
/*    */ import com.corrodinggames.rts.gameFramework.k.a;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */   extends a
/*    */ {
/*    */   m a;
/*    */   h b;
/*    */   
/*    */   public static b b(a parama) {
/* 23 */     b b1 = new b();
/*    */     
/* 25 */     b1.a = parama.a();
/* 26 */     if (b1.a != null)
/*    */     {
/* 28 */       throw new f("teamTagDetect requires a team set");
/*    */     }
/*    */ 
/*    */     
/* 32 */     String str = parama.b("teamTag");
/*    */     
/* 34 */     if (str != null && !str.equals("")) {
/*    */       
/*    */       try
/*    */       {
/* 38 */         b1.b = h.b(str);
/*    */       }
/* 40 */       catch (at at)
/*    */       {
/* 42 */         throw new f(at.getMessage());
/*    */       }
/*    */     
/*    */     } else {
/*    */       
/* 47 */       throw new f("teamTagDetect requires a teamTag set");
/*    */     } 
/*    */     
/* 50 */     return b1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(a parama) {
/* 57 */     if (h.a(this.b, this.a.O()))
/*    */     {
/* 59 */       return true;
/*    */     }
/*    */     
/* 62 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\k\a\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */