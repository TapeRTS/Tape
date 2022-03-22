/*     */ package android.os;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Message
/*     */   implements Parcelable
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*     */   public Object d;
/*     */   public Messenger e;
/*  79 */   public int f = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int g;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   long h;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Bundle i;
/*     */ 
/*     */ 
/*     */   
/*     */   Handler j;
/*     */ 
/*     */ 
/*     */   
/*     */   Runnable k;
/*     */ 
/*     */ 
/*     */   
/*     */   Message l;
/*     */ 
/*     */ 
/*     */   
/* 110 */   private static final Object n = new Object();
/*     */   private static Message o;
/* 112 */   private static int p = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean q = true;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Message a() {
/* 123 */     synchronized (n) {
/* 124 */       if (o != null) {
/* 125 */         Message message = o;
/* 126 */         o = message.l;
/* 127 */         message.l = null;
/* 128 */         message.g = 0;
/* 129 */         p--;
/* 130 */         return message;
/*     */       } 
/*     */     } 
/* 133 */     return new Message();
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
/*     */   public static Message a(Handler paramHandler) {
/* 165 */     Message message = a();
/* 166 */     message.j = paramHandler;
/*     */     
/* 168 */     return message;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 277 */     if (f()) {
/* 278 */       if (q) {
/* 279 */         throw new IllegalStateException("This message cannot be recycled because it is still in use.");
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 284 */     c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void c() {
/* 294 */     this.g = 1;
/* 295 */     this.a = 0;
/* 296 */     this.b = 0;
/* 297 */     this.c = 0;
/* 298 */     this.d = null;
/* 299 */     this.e = null;
/* 300 */     this.f = -1;
/* 301 */     this.h = 0L;
/* 302 */     this.j = null;
/* 303 */     this.k = null;
/* 304 */     this.i = null;
/*     */     
/* 306 */     synchronized (n) {
/* 307 */       if (p < 50) {
/* 308 */         this.l = o;
/* 309 */         o = this;
/* 310 */         p++;
/*     */       } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Bundle d() {
/* 383 */     if (this.i == null) {
/* 384 */       this.i = new Bundle();
/*     */     }
/*     */     
/* 387 */     return this.i;
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
/*     */   public boolean e() {
/* 428 */     return ((this.g & 0x2) != 0);
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
/*     */   public void a(boolean paramBoolean) {
/* 458 */     if (paramBoolean) {
/* 459 */       this.g |= 0x2;
/*     */     } else {
/* 461 */       this.g &= 0xFFFFFFFD;
/*     */     } 
/*     */   }
/*     */   
/*     */   boolean f() {
/* 466 */     return ((this.g & 0x1) == 1);
/*     */   }
/*     */   
/*     */   void g() {
/* 470 */     this.g |= 0x1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 480 */     return a(SystemClock.a());
/*     */   }
/*     */   
/*     */   String a(long paramLong) {
/* 484 */     StringBuilder stringBuilder = new StringBuilder();
/* 485 */     stringBuilder.append("{ when=");
/*     */     
/* 487 */     stringBuilder.append("corrodinggames-unsupported");
/*     */     
/* 489 */     if (this.j != null) {
/* 490 */       if (this.k != null) {
/* 491 */         stringBuilder.append(" callback=");
/* 492 */         stringBuilder.append(this.k.getClass().getName());
/*     */       } else {
/* 494 */         stringBuilder.append(" what=");
/* 495 */         stringBuilder.append(this.a);
/*     */       } 
/*     */       
/* 498 */       if (this.b != 0) {
/* 499 */         stringBuilder.append(" arg1=");
/* 500 */         stringBuilder.append(this.b);
/*     */       } 
/*     */       
/* 503 */       if (this.c != 0) {
/* 504 */         stringBuilder.append(" arg2=");
/* 505 */         stringBuilder.append(this.c);
/*     */       } 
/*     */       
/* 508 */       if (this.d != null) {
/* 509 */         stringBuilder.append(" obj=");
/* 510 */         stringBuilder.append(this.d);
/*     */       } 
/*     */       
/* 513 */       stringBuilder.append(" target=");
/* 514 */       stringBuilder.append(this.j.getClass().getName());
/*     */     } else {
/* 516 */       stringBuilder.append(" barrier=");
/* 517 */       stringBuilder.append(this.b);
/*     */     } 
/*     */     
/* 520 */     stringBuilder.append(" }");
/* 521 */     return stringBuilder.toString();
/*     */   }
/*     */   
/* 524 */   public static final Parcelable.Creator m = new Message$1();
/*     */ 
/*     */ 
/*     */ 
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
/* 538 */     return 0;
/*     */   }
/*     */   
/*     */   public void writeToParcel(Parcel paramParcel, int paramInt) {
/* 542 */     if (this.k != null) {
/* 543 */       throw new RuntimeException("Can't marshal callbacks across processes.");
/*     */     }
/*     */     
/* 546 */     paramParcel.writeInt(this.a);
/* 547 */     paramParcel.writeInt(this.b);
/* 548 */     paramParcel.writeInt(this.c);
/* 549 */     if (this.d != null) {
/*     */       try {
/* 551 */         Parcelable parcelable = (Parcelable)this.d;
/* 552 */         paramParcel.writeInt(1);
/* 553 */         paramParcel.writeParcelable(parcelable, paramInt);
/* 554 */       } catch (ClassCastException classCastException) {
/* 555 */         throw new RuntimeException("Can't marshal non-Parcelable objects across processes.");
/*     */       } 
/*     */     } else {
/*     */       
/* 559 */       paramParcel.writeInt(0);
/*     */     } 
/* 561 */     paramParcel.writeLong(this.h);
/* 562 */     paramParcel.writeBundle(this.i);
/* 563 */     Messenger.writeMessengerOrNullToParcel(this.e, paramParcel);
/* 564 */     paramParcel.writeInt(this.f);
/*     */   }
/*     */   
/*     */   private void a(Parcel paramParcel) {
/* 568 */     this.a = paramParcel.readInt();
/* 569 */     this.b = paramParcel.readInt();
/* 570 */     this.c = paramParcel.readInt();
/* 571 */     if (paramParcel.readInt() != 0) {
/* 572 */       this.d = paramParcel.readParcelable(getClass().getClassLoader());
/*     */     }
/* 574 */     this.h = paramParcel.readLong();
/* 575 */     this.i = paramParcel.readBundle();
/* 576 */     this.e = Messenger.readMessengerOrNullFromParcel(paramParcel);
/* 577 */     this.f = paramParcel.readInt();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\os\Message.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */