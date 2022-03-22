/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamHTTPCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*    */   SteamHTTPCallbackAdapter(SteamHTTPCallback paramSteamHTTPCallback) {
/*  7 */     super(paramSteamHTTPCallback);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   void onHTTPRequestCompleted(long paramLong1, long paramLong2, boolean paramBoolean, int paramInt1, int paramInt2) {
/* 13 */     ((SteamHTTPCallback)this.callback).onHTTPRequestCompleted(new SteamHTTPRequestHandle(paramLong1), paramLong2, paramBoolean, 
/* 14 */         SteamHTTP$HTTPStatusCode.byValue(paramInt1), paramInt2);
/*    */   }
/*    */   
/*    */   void onHTTPRequestHeadersReceived(long paramLong1, long paramLong2) {
/* 18 */     ((SteamHTTPCallback)this.callback).onHTTPRequestHeadersReceived(new SteamHTTPRequestHandle(paramLong1), paramLong2);
/*    */   }
/*    */   
/*    */   void onHTTPRequestDataReceived(long paramLong1, long paramLong2, int paramInt1, int paramInt2) {
/* 22 */     ((SteamHTTPCallback)this.callback).onHTTPRequestDataReceived(new SteamHTTPRequestHandle(paramLong1), paramLong2, paramInt1, paramInt2);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamHTTPCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */