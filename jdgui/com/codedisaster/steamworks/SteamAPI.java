/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class SteamAPI
/*    */ {
/*    */   private static boolean isRunning = false;
/*    */   
/*    */   public static boolean init() {
/* 10 */     return init(null);
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean init(String paramString) {
/* 15 */     SteamSharedLibraryLoader.loadLibraries(paramString);
/*    */     
/* 17 */     isRunning = nativeInit();
/*    */     
/* 19 */     return isRunning;
/*    */   }
/*    */   
/*    */   public static void shutdown() {
/* 23 */     isRunning = false;
/* 24 */     nativeShutdown();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isSteamRunning() {
/* 36 */     return isSteamRunning(false);
/*    */   }
/*    */   
/*    */   public static boolean isSteamRunning(boolean paramBoolean) {
/* 40 */     return (isRunning && (!paramBoolean || isSteamRunningNative()));
/*    */   }
/*    */   
/*    */   public static void printDebugInfo(PrintStream paramPrintStream) {
/* 44 */     if (SteamSharedLibraryLoader.alreadyLoaded) {
/* 45 */       paramPrintStream.println("  shared libraries loaded from: " + SteamSharedLibraryLoader.librarySystemPath);
/*    */     } else {
/* 47 */       paramPrintStream.println("  shared libraries not loaded");
/*    */     } 
/* 49 */     paramPrintStream.println("  Steam API initialized: " + isRunning);
/* 50 */     paramPrintStream.println("  Steam client active: " + isSteamRunning());
/*    */   }
/*    */   
/*    */   public static native boolean restartAppIfNecessary(int paramInt);
/*    */   
/*    */   public static native void releaseCurrentThreadMemory();
/*    */   
/*    */   private static native boolean nativeInit();
/*    */   
/*    */   private static native void nativeShutdown();
/*    */   
/*    */   public static native void runCallbacks();
/*    */   
/*    */   private static native boolean isSteamRunningNative();
/*    */   
/*    */   static native long getSteamAppsPointer();
/*    */   
/*    */   static native long getSteamControllerPointer();
/*    */   
/*    */   static native long getSteamFriendsPointer();
/*    */   
/*    */   static native long getSteamHTTPPointer();
/*    */   
/*    */   static native long getSteamMatchmakingPointer();
/*    */   
/*    */   static native long getSteamNetworkingPointer();
/*    */   
/*    */   static native long getSteamRemoteStoragePointer();
/*    */   
/*    */   static native long getSteamUGCPointer();
/*    */   
/*    */   static native long getSteamUserPointer();
/*    */   
/*    */   static native long getSteamUserStatsPointer();
/*    */   
/*    */   static native long getSteamUtilsPointer();
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */