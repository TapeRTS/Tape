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
/*     */ public class Point
/*     */   implements Parcelable
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   
/*     */   public Point() {}
/*     */   
/*     */   public Point(int paramInt1, int paramInt2) {
/*  33 */     this.a = paramInt1;
/*  34 */     this.b = paramInt2;
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
/*     */   public void a(int paramInt1, int paramInt2) {
/*  46 */     this.a = paramInt1;
/*  47 */     this.b = paramInt2;
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
/*     */   public boolean equals(Object paramObject) {
/*  75 */     if (this == paramObject) return true; 
/*  76 */     if (paramObject == null || getClass() != paramObject.getClass()) return false;
/*     */     
/*  78 */     Point point = (Point)paramObject;
/*     */     
/*  80 */     if (this.a != point.a) return false; 
/*  81 */     if (this.b != point.b) return false;
/*     */     
/*  83 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  88 */     int i = this.a;
/*  89 */     i = 31 * i + this.b;
/*  90 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  95 */     return "Point(" + this.a + ", " + this.b + ")";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 103 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel paramParcel, int paramInt) {
/* 113 */     paramParcel.writeInt(this.a);
/* 114 */     paramParcel.writeInt(this.b);
/*     */   }
/*     */   
/* 117 */   public static final Parcelable.Creator c = new Point$1();
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
/*     */   public void a(Parcel paramParcel) {
/* 142 */     this.a = paramParcel.readInt();
/* 143 */     this.b = paramParcel.readInt();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\graphics\Point.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */