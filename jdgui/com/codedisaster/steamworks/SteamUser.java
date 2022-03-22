/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ import java.nio.Buffer;
/*    */ 
/*    */ public class SteamUser
/*    */   extends SteamInterface {
/*    */   public SteamUser(SteamUserCallback paramSteamUserCallback) {
/*  8 */     super(SteamAPI.getSteamUserPointer(), 
/*  9 */         createCallback(new SteamUserCallbackAdapter(paramSteamUserCallback)));
/*    */   }
/*    */   
/*    */   public SteamID getSteamID() {
/* 13 */     return new SteamID(getSteamID(this.pointer));
/*    */   }
/*    */ 
/*    */   
/*    */   public SteamAuthTicket getAuthSessionTicket(Buffer paramBuffer, int[] paramArrayOfint) {
/* 18 */     if (!paramBuffer.isDirect()) {
/* 19 */       throw new SteamException("Direct buffer required!");
/*    */     }
/*    */     
/* 22 */     int i = getAuthSessionTicket(this.pointer, paramBuffer, paramBuffer.capacity(), paramArrayOfint);
/*    */     
/* 24 */     if (i != 0L) {
/* 25 */       paramBuffer.limit(paramArrayOfint[0]);
/*    */     }
/*    */     
/* 28 */     return new SteamAuthTicket(i);
/*    */   }
/*    */ 
/*    */   
/*    */   public SteamAuth$BeginAuthSessionResult beginAuthSession(Buffer paramBuffer, SteamID paramSteamID) {
/* 33 */     if (!paramBuffer.isDirect()) {
/* 34 */       throw new SteamException("Direct buffer required!");
/*    */     }
/*    */     
/* 37 */     int i = beginAuthSession(this.pointer, paramBuffer, paramBuffer.limit(), paramSteamID.handle);
/* 38 */     return SteamAuth$BeginAuthSessionResult.byOrdinal(i);
/*    */   }
/*    */   
/*    */   public void endAuthSession(SteamID paramSteamID) {
/* 42 */     endAuthSession(this.pointer, paramSteamID.handle);
/*    */   }
/*    */   
/*    */   public void cancelAuthTicket(SteamAuthTicket paramSteamAuthTicket) {
/* 46 */     cancelAuthTicket(this.pointer, (int)paramSteamAuthTicket.handle);
/*    */   }
/*    */   
/*    */   public SteamAuth$UserHasLicenseForAppResult userHasLicenseForApp(SteamID paramSteamID, int paramInt) {
/* 50 */     return SteamAuth$UserHasLicenseForAppResult.byOrdinal(userHasLicenseForApp(this.pointer, paramSteamID.handle, paramInt));
/*    */   }
/*    */   
/*    */   private static native long createCallback(SteamUserCallbackAdapter paramSteamUserCallbackAdapter);
/*    */   
/*    */   private static native long getSteamID(long paramLong);
/*    */   
/*    */   private static native int getAuthSessionTicket(long paramLong, Buffer paramBuffer, int paramInt, int[] paramArrayOfint);
/*    */   
/*    */   private static native int beginAuthSession(long paramLong1, Buffer paramBuffer, int paramInt, long paramLong2);
/*    */   
/*    */   private static native void endAuthSession(long paramLong1, long paramLong2);
/*    */   
/*    */   private static native void cancelAuthTicket(long paramLong, int paramInt);
/*    */   
/*    */   private static native int userHasLicenseForApp(long paramLong1, long paramLong2, int paramInt);
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */