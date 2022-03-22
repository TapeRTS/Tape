/*    */ package a.a.a;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class c
/*    */   extends a
/*    */ {
/*    */   private int[] a;
/*    */   
/*    */   protected c() {}
/*    */   
/*    */   public c(int paramInt1, int paramInt2, int[] paramArrayOfint) {
/* 62 */     a(32, paramInt1, 6 + paramArrayOfint.length);
/* 63 */     a(paramInt2);
/* 64 */     this.a = paramArrayOfint;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 69 */     return "EAK";
/*    */   }
/*    */ 
/*    */   
/*    */   public int[] c() {
/* 74 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public byte[] d() {
/* 79 */     byte[] arrayOfByte = super.d();
/*    */     
/* 81 */     for (byte b = 0; b < this.a.length; b++) {
/* 82 */       arrayOfByte[4 + b] = (byte)(this.a[b] & 0xFF);
/*    */     }
/*    */     
/* 85 */     return arrayOfByte;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 90 */     super.a(paramArrayOfbyte, paramInt1, paramInt2);
/* 91 */     this.a = new int[paramInt2 - 6];
/* 92 */     for (byte b = 0; b < this.a.length; b++)
/* 93 */       this.a[b] = paramArrayOfbyte[paramInt1 + 4 + b] & 0xFF; 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\a\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */