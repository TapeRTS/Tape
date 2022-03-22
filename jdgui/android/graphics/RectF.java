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
/*     */ public class RectF
/*     */   implements Parcelable
/*     */ {
/*     */   public float a;
/*     */   public float b;
/*     */   public float c;
/*     */   public float d;
/*     */   
/*     */   public RectF() {}
/*     */   
/*     */   public RectF(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*  55 */     this.a = paramFloat1;
/*  56 */     this.b = paramFloat2;
/*  57 */     this.c = paramFloat3;
/*  58 */     this.d = paramFloat4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RectF(RectF paramRectF) {
/*  69 */     this.a = paramRectF.a;
/*  70 */     this.b = paramRectF.b;
/*  71 */     this.c = paramRectF.c;
/*  72 */     this.d = paramRectF.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  83 */     return "RectF(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ")";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean a() {
/*  91 */     return (this.a >= this.c || this.b >= this.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float b() {
/*  99 */     return this.c - this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float c() {
/* 107 */     return this.d - this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float d() {
/* 115 */     return (this.a + this.c) * 0.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float e() {
/* 123 */     return (this.b + this.d) * 0.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f() {
/* 130 */     this.a = this.c = this.b = this.d = 0.0F;
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
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 144 */     this.a = paramFloat1;
/* 145 */     this.b = paramFloat2;
/* 146 */     this.c = paramFloat3;
/* 147 */     this.d = paramFloat4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(RectF paramRectF) {
/* 157 */     this.a = paramRectF.a;
/* 158 */     this.b = paramRectF.b;
/* 159 */     this.c = paramRectF.c;
/* 160 */     this.d = paramRectF.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Rect paramRect) {
/* 170 */     this.a = paramRect.a;
/* 171 */     this.b = paramRect.b;
/* 172 */     this.c = paramRect.c;
/* 173 */     this.d = paramRect.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2) {
/* 184 */     this.a += paramFloat1;
/* 185 */     this.b += paramFloat2;
/* 186 */     this.c += paramFloat1;
/* 187 */     this.d += paramFloat2;
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
/*     */   public boolean b(float paramFloat1, float paramFloat2) {
/* 232 */     return (this.a < this.c && this.b < this.d && paramFloat1 >= this.a && paramFloat1 < this.c && paramFloat2 >= this.b && paramFloat2 < this.d);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 291 */     if (this.a < paramFloat3 && paramFloat1 < this.c && this.b < paramFloat4 && paramFloat2 < this.d) {
/*     */       
/* 293 */       if (this.a < paramFloat1) {
/* 294 */         this.a = paramFloat1;
/*     */       }
/* 296 */       if (this.b < paramFloat2) {
/* 297 */         this.b = paramFloat2;
/*     */       }
/* 299 */       if (this.c > paramFloat3) {
/* 300 */         this.c = paramFloat3;
/*     */       }
/* 302 */       if (this.d > paramFloat4) {
/* 303 */         this.d = paramFloat4;
/*     */       }
/* 305 */       return true;
/*     */     } 
/* 307 */     return false;
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
/*     */   public boolean b(RectF paramRectF) {
/* 322 */     return b(paramRectF.a, paramRectF.b, paramRectF.c, paramRectF.d);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(RectF paramRectF1, RectF paramRectF2) {
/* 380 */     return (paramRectF1.a < paramRectF2.c && paramRectF2.a < paramRectF1.c && paramRectF1.b < paramRectF2.d && paramRectF2.b < paramRectF1.d);
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
/*     */   public void c(float paramFloat1, float paramFloat2) {
/* 451 */     if (paramFloat1 < this.a) {
/* 452 */       this.a = paramFloat1;
/* 453 */     } else if (paramFloat1 > this.c) {
/* 454 */       this.c = paramFloat1;
/*     */     } 
/* 456 */     if (paramFloat2 < this.b) {
/* 457 */       this.b = paramFloat2;
/* 458 */     } else if (paramFloat2 > this.d) {
/* 459 */       this.d = paramFloat2;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g() {
/* 471 */     if (this.a > this.c) {
/* 472 */       float f = this.a;
/* 473 */       this.a = this.c;
/* 474 */       this.c = f;
/*     */     } 
/* 476 */     if (this.b > this.d) {
/* 477 */       float f = this.b;
/* 478 */       this.b = this.d;
/* 479 */       this.d = f;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 487 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel paramParcel, int paramInt) {
/* 496 */     paramParcel.writeFloat(this.a);
/* 497 */     paramParcel.writeFloat(this.b);
/* 498 */     paramParcel.writeFloat(this.c);
/* 499 */     paramParcel.writeFloat(this.d);
/*     */   }
/*     */   
/* 502 */   public static final Parcelable.Creator e = new RectF$1();
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
/* 527 */     this.a = paramParcel.readFloat();
/* 528 */     this.b = paramParcel.readFloat();
/* 529 */     this.c = paramParcel.readFloat();
/* 530 */     this.d = paramParcel.readFloat();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\graphics\RectF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */