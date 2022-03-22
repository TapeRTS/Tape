/*    */ package com.codedisaster.steamworks;
/*    */ public enum SteamUniverse {
/*    */   private final int value;
/*  4 */   Invalid(0),
/*  5 */   Public(1),
/*  6 */   Beta(2),
/*  7 */   Internal(3),
/*  8 */   Dev(4); private static final SteamUniverse[] values;
/*    */   
/*    */   static {
/* 11 */     values = values();
/*    */   }
/*    */   SteamUniverse(int paramInt1) {
/* 14 */     this.value = paramInt1;
/*    */   }
/*    */   
/*    */   static SteamUniverse byValue(int paramInt) {
/* 18 */     for (SteamUniverse steamUniverse : values) {
/* 19 */       if (steamUniverse.value == paramInt) {
/* 20 */         return steamUniverse;
/*    */       }
/*    */     } 
/* 23 */     return Invalid;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUniverse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */