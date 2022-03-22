/*     */ package android.graphics;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PointF
/*     */   implements Parcelable
/*     */ {
/*     */   public float a;
/*     */   public float b;
/*     */   
/*     */   public PointF() {}
/*     */   
/*     */   public PointF(float paramFloat1, float paramFloat2) {
/*  33 */     this.a = paramFloat1;
/*  34 */     this.b = paramFloat2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void a(float paramFloat1, float paramFloat2) {
/*  46 */     this.a = paramFloat1;
/*  47 */     this.b = paramFloat2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void a(PointF paramPointF) {
/*  54 */     this.a = paramPointF.a;
/*  55 */     this.b = paramPointF.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void b(float paramFloat1, float paramFloat2) {
/*  64 */     this.a += paramFloat1;
/*  65 */     this.b += paramFloat2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/*  94 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel paramParcel, int paramInt) {
/* 104 */     paramParcel.writeFloat(this.a);
/* 105 */     paramParcel.writeFloat(this.b);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\graphics\PointF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */