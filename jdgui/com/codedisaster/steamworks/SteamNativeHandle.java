/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ public abstract class SteamNativeHandle
/*    */ {
/*    */   long handle;
/*    */   
/*    */   SteamNativeHandle(long paramLong) {
/*  8 */     this.handle = paramLong;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static long getNativeHandle(SteamNativeHandle paramSteamNativeHandle) {
/* 18 */     return paramSteamNativeHandle.handle;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 23 */     return Long.valueOf(this.handle).hashCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 28 */     if (paramObject instanceof SteamNativeHandle) {
/* 29 */       return (this.handle == ((SteamNativeHandle)paramObject).handle);
/*    */     }
/* 31 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 36 */     return Long.toHexString(this.handle);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamNativeHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */