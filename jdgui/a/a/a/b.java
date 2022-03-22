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
/*    */ public class b
/*    */   extends h
/*    */ {
/*    */   private byte[] a;
/*    */   
/*    */   protected b() {}
/*    */   
/*    */   public b(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3, int paramInt4) {
/* 58 */     a(64, paramInt1, 6);
/* 59 */     a(paramInt2);
/* 60 */     this.a = new byte[paramInt4];
/* 61 */     System.arraycopy(paramArrayOfbyte, paramInt3, this.a, 0, paramInt4);
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 66 */     return this.a.length + super.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 71 */     return "DAT";
/*    */   }
/*    */ 
/*    */   
/*    */   public byte[] c() {
/* 76 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public byte[] d() {
/* 81 */     byte[] arrayOfByte = super.d();
/* 82 */     System.arraycopy(this.a, 0, arrayOfByte, 6, this.a.length);
/* 83 */     return arrayOfByte;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 88 */     super.a(paramArrayOfbyte, paramInt1, paramInt2);
/* 89 */     this.a = new byte[paramInt2 - 6];
/* 90 */     System.arraycopy(paramArrayOfbyte, paramInt1 + 6, this.a, 0, this.a.length);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\a\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */