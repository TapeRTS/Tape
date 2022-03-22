/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ 
/*    */ public class SteamUtils
/*    */   extends SteamInterface
/*    */ {
/*    */   private SteamUtilsCallbackAdapter callbackAdapter;
/*    */   
/*    */   public SteamUtils(SteamUtilsCallback paramSteamUtilsCallback) {
/* 41 */     super(SteamAPI.getSteamUtilsPointer());
/* 42 */     this.callbackAdapter = new SteamUtilsCallbackAdapter(paramSteamUtilsCallback);
/* 43 */     setCallback(createCallback(this.callbackAdapter));
/*    */   }
/*    */   
/*    */   public int getSecondsSinceAppActive() {
/* 47 */     return getSecondsSinceAppActive(this.pointer);
/*    */   }
/*    */   
/*    */   public int getSecondsSinceComputerActive() {
/* 51 */     return getSecondsSinceComputerActive(this.pointer);
/*    */   }
/*    */   
/*    */   public SteamUniverse getConnectedUniverse() {
/* 55 */     return SteamUniverse.byValue(getConnectedUniverse(this.pointer));
/*    */   }
/*    */   
/*    */   public int getServerRealTime() {
/* 59 */     return getServerRealTime(this.pointer);
/*    */   }
/*    */   
/*    */   public int getImageWidth(int paramInt) {
/* 63 */     return getImageWidth(this.pointer, paramInt);
/*    */   }
/*    */   
/*    */   public int getImageHeight(int paramInt) {
/* 67 */     return getImageHeight(this.pointer, paramInt);
/*    */   }
/*    */   
/*    */   public boolean getImageRGBA(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2) {
/* 71 */     if (!paramByteBuffer.isDirect()) {
/* 72 */       throw new SteamException("Direct buffer required!");
/*    */     }
/* 74 */     return getImageRGBA(this.pointer, paramInt1, paramByteBuffer, paramInt2);
/*    */   }
/*    */   
/*    */   public int getAppID() {
/* 78 */     return getAppID(this.pointer);
/*    */   }
/*    */   
/*    */   public void setOverlayNotificationPosition(SteamUtils$NotificationPosition paramSteamUtils$NotificationPosition) {
/* 82 */     setOverlayNotificationPosition(this.pointer, paramSteamUtils$NotificationPosition.ordinal());
/*    */   }
/*    */   
/*    */   public boolean isAPICallCompleted(SteamAPICall paramSteamAPICall, boolean[] paramArrayOfboolean) {
/* 86 */     return isAPICallCompleted(this.pointer, paramSteamAPICall.handle, paramArrayOfboolean);
/*    */   }
/*    */   
/*    */   public SteamUtils$SteamAPICallFailure getAPICallFailureReason(SteamAPICall paramSteamAPICall) {
/* 90 */     return SteamUtils$SteamAPICallFailure.byValue(getAPICallFailureReason(this.pointer, paramSteamAPICall.handle));
/*    */   }
/*    */   
/*    */   public void setWarningMessageHook(SteamAPIWarningMessageHook paramSteamAPIWarningMessageHook) {
/* 94 */     this.callbackAdapter.setWarningMessageHook(paramSteamAPIWarningMessageHook);
/* 95 */     enableWarningMessageHook(this.callback, (paramSteamAPIWarningMessageHook != null));
/*    */   }
/*    */   
/*    */   public boolean isOverlayEnabled() {
/* 99 */     return isOverlayEnabled(this.pointer);
/*    */   }
/*    */   
/*    */   private static native long createCallback(SteamUtilsCallbackAdapter paramSteamUtilsCallbackAdapter);
/*    */   
/*    */   private static native int getSecondsSinceAppActive(long paramLong);
/*    */   
/*    */   private static native int getSecondsSinceComputerActive(long paramLong);
/*    */   
/*    */   private static native int getConnectedUniverse(long paramLong);
/*    */   
/*    */   private static native int getServerRealTime(long paramLong);
/*    */   
/*    */   private static native String getIPCountry(long paramLong);
/*    */   
/*    */   private static native int getImageWidth(long paramLong, int paramInt);
/*    */   
/*    */   private static native int getImageHeight(long paramLong, int paramInt);
/*    */   
/*    */   private static native boolean getImageRGBA(long paramLong, int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
/*    */   
/*    */   private static native int getAppID(long paramLong);
/*    */   
/*    */   private static native void setOverlayNotificationPosition(long paramLong, int paramInt);
/*    */   
/*    */   private static native boolean isAPICallCompleted(long paramLong1, long paramLong2, boolean[] paramArrayOfboolean);
/*    */   
/*    */   private static native int getAPICallFailureReason(long paramLong1, long paramLong2);
/*    */   
/*    */   private static native void enableWarningMessageHook(long paramLong, boolean paramBoolean);
/*    */   
/*    */   private static native boolean isOverlayEnabled(long paramLong);
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */