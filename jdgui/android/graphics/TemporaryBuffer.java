/*    */ package android.graphics;
/*    */ 
/*    */ import com.a.a.a.a;
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
/*    */ public class TemporaryBuffer
/*    */ {
/*    */   public static char[] a(int paramInt) {
/*    */     char[] arrayOfChar;
/* 28 */     synchronized (TemporaryBuffer.class) {
/* 29 */       arrayOfChar = a;
/* 30 */       a = null;
/*    */     } 
/*    */     
/* 33 */     if (arrayOfChar == null || arrayOfChar.length < paramInt) {
/* 34 */       arrayOfChar = new char[a.b(paramInt)];
/*    */     }
/*    */     
/* 37 */     return arrayOfChar;
/*    */   }
/*    */   
/*    */   public static void a(char[] paramArrayOfchar) {
/* 41 */     if (paramArrayOfchar.length > 1000)
/*    */       return; 
/* 43 */     synchronized (TemporaryBuffer.class) {
/* 44 */       a = paramArrayOfchar;
/*    */     } 
/*    */   }
/*    */   
/* 48 */   private static char[] a = null;
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\graphics\TemporaryBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */