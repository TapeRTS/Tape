/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamUtilsCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*    */   private SteamAPIWarningMessageHook messageHook;
/*    */   
/*    */   SteamUtilsCallbackAdapter(SteamUtilsCallback paramSteamUtilsCallback) {
/*  9 */     super(paramSteamUtilsCallback);
/*    */   }
/*    */   
/*    */   void setWarningMessageHook(SteamAPIWarningMessageHook paramSteamAPIWarningMessageHook) {
/* 13 */     this.messageHook = paramSteamAPIWarningMessageHook;
/*    */   }
/*    */   
/*    */   void onWarningMessage(int paramInt, String paramString) {
/* 17 */     if (this.messageHook != null) {
/* 18 */       this.messageHook.onWarningMessage(paramInt, paramString);
/*    */     }
/*    */   }
/*    */   
/*    */   void onSteamShutdown() {
/* 23 */     ((SteamUtilsCallback)this.callback).onSteamShutdown();
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUtilsCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */