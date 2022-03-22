/*    */ package com.corrodinggames.rts.gameFramework.g;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.f;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ao
/*    */ {
/* 16 */   public static ao a = new ao();
/*    */   
/* 18 */   static int b = 2;
/* 19 */   static int c = 3;
/*    */   
/* 21 */   static int d = 2;
/* 22 */   static int e = 3;
/* 23 */   static int f = 4;
/*    */   
/* 25 */   static String g = "tx";
/* 26 */   static String h = "_";
/*    */ 
/*    */   
/* 29 */   public static int i = 55;
/* 30 */   public static int j = 66;
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
/*    */   public void a(String paramString, List paramList) {
/* 50 */     long l = l.N();
/*    */ 
/*    */     
/* 53 */     n.a(paramList, h + "1", "" + l);
/*    */     
/* 55 */     n.a(paramList, g + "2", f.d("_" + paramString + (b + c)));
/*    */     
/* 57 */     n.a(paramList, g + "3", f.d("_" + paramString + ((b + c) + l)));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(String paramString, List paramList) {
/* 63 */     n.a(paramList, g + "3", f.d("-" + paramString + (d + e) + f));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void c(String paramString, List paramList) {
/* 69 */     if (f > 1000)
/*    */     {
/* 71 */       n.a(paramList, g + "4", f.d("+" + paramString + (d + e) + f));
/*    */     }
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */