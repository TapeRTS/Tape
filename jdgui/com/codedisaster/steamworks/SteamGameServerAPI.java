/*    */ package com.codedisaster.steamworks;
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
/*    */ public class SteamGameServerAPI
/*    */ {
/*    */   private static boolean isRunning = false;
/*    */   
/*    */   public static boolean init(int paramInt, short paramShort1, short paramShort2, short paramShort3, SteamGameServerAPI$ServerMode paramSteamGameServerAPI$ServerMode, String paramString) {
/* 17 */     return init(null, paramInt, paramShort1, paramShort2, paramShort3, paramSteamGameServerAPI$ServerMode, paramString);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean init(String paramString1, int paramInt, short paramShort1, short paramShort2, short paramShort3, SteamGameServerAPI$ServerMode paramSteamGameServerAPI$ServerMode, String paramString2) {
/* 24 */     SteamSharedLibraryLoader.loadLibraries(paramString1);
/*    */     
/* 26 */     isRunning = nativeInit(paramInt, paramShort1, paramShort2, paramShort3, paramSteamGameServerAPI$ServerMode.ordinal(), paramString2);
/*    */     
/* 28 */     return isRunning;
/*    */   }
/*    */   
/*    */   public static void shutdown() {
/* 32 */     isRunning = false;
/* 33 */     nativeShutdown();
/*    */   }
/*    */   
/*    */   public static SteamID getSteamID() {
/* 37 */     return new SteamID(nativeGetSteamID());
/*    */   }
/*    */   
/*    */   private static native boolean nativeInit(int paramInt1, short paramShort1, short paramShort2, short paramShort3, int paramInt2, String paramString);
/*    */   
/*    */   private static native void nativeShutdown();
/*    */   
/*    */   public static native void runCallbacks();
/*    */   
/*    */   public static native boolean isSecure();
/*    */   
/*    */   private static native long nativeGetSteamID();
/*    */   
/*    */   static native long getSteamGameServerPointer();
/*    */   
/*    */   static native long getSteamGameServerNetworkingPointer();
/*    */   
/*    */   static native long getSteamGameServerStatsPointer();
/*    */   
/*    */   static native long getSteamGameServerHTTPPointer();
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamGameServerAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */