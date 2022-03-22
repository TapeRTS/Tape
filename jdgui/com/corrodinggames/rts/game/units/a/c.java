/*    */ package com.corrodinggames.rts.game.units.a;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.g.ap;
/*    */ import com.corrodinggames.rts.gameFramework.g.k;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class c
/*    */ {
/* 17 */   private static final HashMap c = new HashMap<>();
/* 18 */   public static final c a = a("-1");
/*    */   
/*    */   String b;
/*    */ 
/*    */   
/*    */   public static c a(String paramString) {
/* 24 */     c c1 = (c)c.get(paramString);
/* 25 */     if (c1 != null)
/*    */     {
/* 27 */       return c1;
/*    */     }
/*    */     
/* 30 */     c c2 = new c(paramString);
/* 31 */     c.put(paramString, c2);
/* 32 */     return c2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 37 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private c(String paramString) {
/* 44 */     this.b = paramString;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void a(ap paramap, c paramc) {
/* 49 */     String str = null;
/* 50 */     if (paramc != null)
/*    */     {
/* 52 */       str = paramc.b;
/*    */     }
/* 54 */     paramap.b(str);
/*    */   }
/*    */ 
/*    */   
/*    */   public static c a(k paramk) {
/* 59 */     String str = paramk.j();
/* 60 */     if (str != null)
/*    */     {
/* 62 */       return a(str);
/*    */     }
/*    */ 
/*    */     
/* 66 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 74 */     return (this == paramObject);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 80 */     return this.b.hashCode();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 87 */     return "ActionId(" + this.b + ")";
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */