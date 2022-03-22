/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ public class SteamControllerAnalogActionData
/*    */ {
/*    */   int mode;
/*    */   float x;
/*    */   float y;
/*    */   boolean active;
/*    */   
/*    */   public SteamController$SourceMode getMode() {
/* 11 */     return SteamController$SourceMode.byOrdinal(this.mode);
/*    */   }
/*    */   
/*    */   public float getX() {
/* 15 */     return this.x;
/*    */   }
/*    */   
/*    */   public float getY() {
/* 19 */     return this.y;
/*    */   }
/*    */   
/*    */   public boolean getActive() {
/* 23 */     return this.active;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamControllerAnalogActionData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */