/*     */ package android.graphics;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Color
/*     */ {
/*     */   public static int a(int paramInt) {
/*  56 */     return paramInt >>> 24;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int b(int paramInt) {
/*  64 */     return paramInt >> 16 & 0xFF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int c(int paramInt) {
/*  72 */     return paramInt >> 8 & 0xFF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int d(int paramInt) {
/*  80 */     return paramInt & 0xFF;
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
/*     */   public static int a(int paramInt1, int paramInt2, int paramInt3) {
/*  94 */     return 0xFF000000 | paramInt1 << 16 | paramInt2 << 8 | paramInt3;
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
/*     */   public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 108 */     return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
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
/*     */   public static int a(String paramString) {
/* 209 */     if (paramString.charAt(0) == '#') {
/*     */       
/* 211 */       long l = Long.parseLong(paramString.substring(1), 16);
/* 212 */       if (paramString.length() == 7) {
/*     */         
/* 214 */         l |= 0xFFFFFFFFFF000000L;
/* 215 */       } else if (paramString.length() != 9) {
/* 216 */         throw new IllegalArgumentException("Unknown color");
/*     */       } 
/* 218 */       return (int)l;
/*     */     } 
/* 220 */     Integer integer = (Integer)a.get(paramString.toLowerCase(Locale.ROOT));
/* 221 */     if (integer != null) {
/* 222 */       return integer.intValue();
/*     */     }
/*     */     
/* 225 */     throw new IllegalArgumentException("Unknown color");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 407 */   private static final HashMap a = new HashMap<>(); static {
/* 408 */     a.put("black", Integer.valueOf(-16777216));
/* 409 */     a.put("darkgray", Integer.valueOf(-12303292));
/* 410 */     a.put("gray", Integer.valueOf(-7829368));
/* 411 */     a.put("lightgray", Integer.valueOf(-3355444));
/* 412 */     a.put("white", Integer.valueOf(-1));
/* 413 */     a.put("red", Integer.valueOf(-65536));
/* 414 */     a.put("green", Integer.valueOf(-16711936));
/* 415 */     a.put("blue", Integer.valueOf(-16776961));
/* 416 */     a.put("yellow", Integer.valueOf(-256));
/* 417 */     a.put("cyan", Integer.valueOf(-16711681));
/* 418 */     a.put("magenta", Integer.valueOf(-65281));
/* 419 */     a.put("aqua", Integer.valueOf(-16711681));
/* 420 */     a.put("fuchsia", Integer.valueOf(-65281));
/* 421 */     a.put("darkgrey", Integer.valueOf(-12303292));
/* 422 */     a.put("grey", Integer.valueOf(-7829368));
/* 423 */     a.put("lightgrey", Integer.valueOf(-3355444));
/* 424 */     a.put("lime", Integer.valueOf(-16711936));
/* 425 */     a.put("maroon", Integer.valueOf(-8388608));
/* 426 */     a.put("navy", Integer.valueOf(-16777088));
/* 427 */     a.put("olive", Integer.valueOf(-8355840));
/* 428 */     a.put("purple", Integer.valueOf(-8388480));
/* 429 */     a.put("silver", Integer.valueOf(-4144960));
/* 430 */     a.put("teal", Integer.valueOf(-16744320));
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\graphics\Color.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */