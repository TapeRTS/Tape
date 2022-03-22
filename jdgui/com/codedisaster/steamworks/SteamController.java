/*     */ package com.codedisaster.steamworks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SteamController
/*     */   extends SteamInterface
/*     */ {
/*     */   public static final int STEAM_CONTROLLER_MAX_COUNT = 16;
/*     */   public static final int STEAM_CONTROLLER_MAX_ANALOG_ACTIONS = 16;
/*     */   public static final int STEAM_CONTROLLER_MAX_DIGITAL_ACTIONS = 128;
/*     */   public static final int STEAM_CONTROLLER_MAX_ORIGINS = 8;
/*     */   public static final long STEAM_CONTROLLER_HANDLE_ALL_CONTROLLERS = -1L;
/*     */   public static final float STEAM_CONTROLLER_MIN_ANALOG_ACTION_DATA = -1.0F;
/*     */   public static final float STEAM_CONTROLLER_MAX_ANALOG_ACTION_DATA = 1.0F;
/* 264 */   private long[] controllerHandles = new long[16];
/* 265 */   private int[] actionOrigins = new int[8];
/*     */   
/*     */   public SteamController() {
/* 268 */     super(SteamAPI.getSteamControllerPointer());
/*     */   }
/*     */   
/*     */   public boolean init() {
/* 272 */     return init(this.pointer);
/*     */   }
/*     */   
/*     */   public boolean shutdown() {
/* 276 */     return shutdown(this.pointer);
/*     */   }
/*     */   
/*     */   public void runFrame() {
/* 280 */     runFrame(this.pointer);
/*     */   }
/*     */   
/*     */   public int getConnectedControllers(SteamControllerHandle[] paramArrayOfSteamControllerHandle) {
/* 284 */     if (paramArrayOfSteamControllerHandle.length < 16) {
/* 285 */       throw new IllegalArgumentException("Array size must be at least STEAM_CONTROLLER_MAX_COUNT");
/*     */     }
/*     */     
/* 288 */     int i = getConnectedControllers(this.pointer, this.controllerHandles);
/*     */     
/* 290 */     for (byte b = 0; b < i; b++) {
/* 291 */       paramArrayOfSteamControllerHandle[b] = new SteamControllerHandle(this.controllerHandles[b]);
/*     */     }
/*     */     
/* 294 */     return i;
/*     */   }
/*     */   
/*     */   public boolean showBindingPanel(SteamControllerHandle paramSteamControllerHandle) {
/* 298 */     return showBindingPanel(this.pointer, paramSteamControllerHandle.handle);
/*     */   }
/*     */   
/*     */   public SteamControllerActionSetHandle getActionSetHandle(String paramString) {
/* 302 */     return new SteamControllerActionSetHandle(getActionSetHandle(this.pointer, paramString));
/*     */   }
/*     */   
/*     */   public void activateActionSet(SteamControllerHandle paramSteamControllerHandle, SteamControllerActionSetHandle paramSteamControllerActionSetHandle) {
/* 306 */     activateActionSet(this.pointer, paramSteamControllerHandle.handle, paramSteamControllerActionSetHandle.handle);
/*     */   }
/*     */   
/*     */   public SteamControllerActionSetHandle getCurrentActionSet(SteamControllerHandle paramSteamControllerHandle) {
/* 310 */     return new SteamControllerActionSetHandle(getCurrentActionSet(this.pointer, paramSteamControllerHandle.handle));
/*     */   }
/*     */   
/*     */   public SteamControllerDigitalActionHandle getDigitalActionHandle(String paramString) {
/* 314 */     return new SteamControllerDigitalActionHandle(getDigitalActionHandle(this.pointer, paramString));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getDigitalActionData(SteamControllerHandle paramSteamControllerHandle, SteamControllerDigitalActionHandle paramSteamControllerDigitalActionHandle, SteamControllerDigitalActionData paramSteamControllerDigitalActionData) {
/* 321 */     getDigitalActionData(this.pointer, paramSteamControllerHandle.handle, paramSteamControllerDigitalActionHandle.handle, paramSteamControllerDigitalActionData);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDigitalActionOrigins(SteamControllerHandle paramSteamControllerHandle, SteamControllerActionSetHandle paramSteamControllerActionSetHandle, SteamControllerDigitalActionHandle paramSteamControllerDigitalActionHandle, SteamController$ActionOrigin[] paramArrayOfSteamController$ActionOrigin) {
/* 329 */     if (paramArrayOfSteamController$ActionOrigin.length < 8) {
/* 330 */       throw new IllegalArgumentException("Array size must be at least STEAM_CONTROLLER_MAX_ORIGINS");
/*     */     }
/*     */     
/* 333 */     int i = getDigitalActionOrigins(this.pointer, paramSteamControllerHandle.handle, paramSteamControllerActionSetHandle.handle, paramSteamControllerDigitalActionHandle.handle, this.actionOrigins);
/*     */ 
/*     */     
/* 336 */     for (byte b = 0; b < i; b++) {
/* 337 */       paramArrayOfSteamController$ActionOrigin[b] = SteamController$ActionOrigin.byOrdinal(this.actionOrigins[b]);
/*     */     }
/*     */     
/* 340 */     return i;
/*     */   }
/*     */   
/*     */   public SteamControllerAnalogActionHandle getAnalogActionHandle(String paramString) {
/* 344 */     return new SteamControllerAnalogActionHandle(getAnalogActionHandle(this.pointer, paramString));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getAnalogActionData(SteamControllerHandle paramSteamControllerHandle, SteamControllerAnalogActionHandle paramSteamControllerAnalogActionHandle, SteamControllerAnalogActionData paramSteamControllerAnalogActionData) {
/* 351 */     getAnalogActionData(this.pointer, paramSteamControllerHandle.handle, paramSteamControllerAnalogActionHandle.handle, paramSteamControllerAnalogActionData);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAnalogActionOrigins(SteamControllerHandle paramSteamControllerHandle, SteamControllerActionSetHandle paramSteamControllerActionSetHandle, SteamControllerAnalogActionHandle paramSteamControllerAnalogActionHandle, SteamController$ActionOrigin[] paramArrayOfSteamController$ActionOrigin) {
/* 359 */     if (paramArrayOfSteamController$ActionOrigin.length < 8) {
/* 360 */       throw new IllegalArgumentException("Array size must be at least STEAM_CONTROLLER_MAX_ORIGINS");
/*     */     }
/*     */     
/* 363 */     int i = getAnalogActionOrigins(this.pointer, paramSteamControllerHandle.handle, paramSteamControllerActionSetHandle.handle, paramSteamControllerAnalogActionHandle.handle, this.actionOrigins);
/*     */ 
/*     */     
/* 366 */     for (byte b = 0; b < i; b++) {
/* 367 */       paramArrayOfSteamController$ActionOrigin[b] = SteamController$ActionOrigin.byOrdinal(this.actionOrigins[b]);
/*     */     }
/*     */     
/* 370 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void stopAnalogActionMomentum(SteamControllerHandle paramSteamControllerHandle, SteamControllerAnalogActionHandle paramSteamControllerAnalogActionHandle) {
/* 376 */     stopAnalogActionMomentum(this.pointer, paramSteamControllerHandle.handle, paramSteamControllerAnalogActionHandle.handle);
/*     */   }
/*     */   
/*     */   public void triggerHapticPulse(SteamControllerHandle paramSteamControllerHandle, SteamController$Pad paramSteamController$Pad, int paramInt) {
/* 380 */     triggerHapticPulse(this.pointer, paramSteamControllerHandle.handle, paramSteamController$Pad.ordinal(), paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void triggerRepeatedHapticPulse(SteamControllerHandle paramSteamControllerHandle, SteamController$Pad paramSteamController$Pad, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 386 */     triggerRepeatedHapticPulse(this.pointer, paramSteamControllerHandle.handle, paramSteamController$Pad.ordinal(), paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */   
/*     */   public void triggerVibration(SteamControllerHandle paramSteamControllerHandle, short paramShort1, short paramShort2) {
/* 391 */     triggerVibration(this.pointer, paramSteamControllerHandle.handle, paramShort1, paramShort2);
/*     */   }
/*     */   
/*     */   public void setLEDColor(SteamControllerHandle paramSteamControllerHandle, int paramInt1, int paramInt2, int paramInt3, SteamController$LEDFlag paramSteamController$LEDFlag) {
/* 395 */     setLEDColor(this.pointer, paramSteamControllerHandle.handle, (byte)(paramInt1 & 0xFF), (byte)(paramInt2 & 0xFF), (byte)(paramInt3 & 0xFF), paramSteamController$LEDFlag
/* 396 */         .ordinal());
/*     */   }
/*     */   
/*     */   public int getGamepadIndexForController(SteamControllerHandle paramSteamControllerHandle) {
/* 400 */     return getGamepadIndexForController(this.pointer, paramSteamControllerHandle.handle);
/*     */   }
/*     */   
/*     */   public SteamControllerHandle getControllerForGamepadIndex(int paramInt) {
/* 404 */     return new SteamControllerHandle(getControllerForGamepadIndex(this.pointer, paramInt));
/*     */   }
/*     */   
/*     */   public void getMotionData(SteamControllerHandle paramSteamControllerHandle, SteamControllerMotionData paramSteamControllerMotionData) {
/* 408 */     getMotionData(this.pointer, paramSteamControllerHandle.handle, paramSteamControllerMotionData.data);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean showDigitalActionOrigins(SteamControllerHandle paramSteamControllerHandle, SteamControllerDigitalActionHandle paramSteamControllerDigitalActionHandle, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 415 */     return showDigitalActionOrigins(this.pointer, paramSteamControllerHandle.handle, paramSteamControllerDigitalActionHandle.handle, paramFloat1, paramFloat2, paramFloat3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean showAnalogActionOrigins(SteamControllerHandle paramSteamControllerHandle, SteamControllerAnalogActionHandle paramSteamControllerAnalogActionHandle, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 423 */     return showAnalogActionOrigins(this.pointer, paramSteamControllerHandle.handle, paramSteamControllerAnalogActionHandle.handle, paramFloat1, paramFloat2, paramFloat3);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStringForActionOrigin(SteamController$ActionOrigin paramSteamController$ActionOrigin) {
/* 428 */     return getStringForActionOrigin(this.pointer, paramSteamController$ActionOrigin.ordinal());
/*     */   }
/*     */   
/*     */   public String getGlyphForActionOrigin(SteamController$ActionOrigin paramSteamController$ActionOrigin) {
/* 432 */     return getGlyphForActionOrigin(this.pointer, paramSteamController$ActionOrigin.ordinal());
/*     */   }
/*     */   
/*     */   private static native boolean init(long paramLong);
/*     */   
/*     */   private static native boolean shutdown(long paramLong);
/*     */   
/*     */   private static native void runFrame(long paramLong);
/*     */   
/*     */   private static native int getConnectedControllers(long paramLong, long[] paramArrayOflong);
/*     */   
/*     */   private static native boolean showBindingPanel(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getActionSetHandle(long paramLong, String paramString);
/*     */   
/*     */   private static native void activateActionSet(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long getCurrentActionSet(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getDigitalActionHandle(long paramLong, String paramString);
/*     */   
/*     */   private static native void getDigitalActionData(long paramLong1, long paramLong2, long paramLong3, SteamControllerDigitalActionData paramSteamControllerDigitalActionData);
/*     */   
/*     */   private static native int getDigitalActionOrigins(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int[] paramArrayOfint);
/*     */   
/*     */   private static native long getAnalogActionHandle(long paramLong, String paramString);
/*     */   
/*     */   private static native void getAnalogActionData(long paramLong1, long paramLong2, long paramLong3, SteamControllerAnalogActionData paramSteamControllerAnalogActionData);
/*     */   
/*     */   private static native int getAnalogActionOrigins(long paramLong1, long paramLong2, long paramLong3, long paramLong4, int[] paramArrayOfint);
/*     */   
/*     */   private static native void stopAnalogActionMomentum(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void triggerHapticPulse(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void triggerRepeatedHapticPulse(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*     */   
/*     */   private static native void triggerVibration(long paramLong1, long paramLong2, short paramShort1, short paramShort2);
/*     */   
/*     */   private static native void setLEDColor(long paramLong1, long paramLong2, byte paramByte1, byte paramByte2, byte paramByte3, int paramInt);
/*     */   
/*     */   private static native int getGamepadIndexForController(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getControllerForGamepadIndex(long paramLong, int paramInt);
/*     */   
/*     */   private static native void getMotionData(long paramLong1, long paramLong2, float[] paramArrayOffloat);
/*     */   
/*     */   private static native boolean showDigitalActionOrigins(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, float paramFloat3);
/*     */   
/*     */   private static native boolean showAnalogActionOrigins(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, float paramFloat3);
/*     */   
/*     */   private static native String getStringForActionOrigin(long paramLong, int paramInt);
/*     */   
/*     */   private static native String getGlyphForActionOrigin(long paramLong, int paramInt);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */