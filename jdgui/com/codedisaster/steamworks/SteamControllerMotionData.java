/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SteamControllerMotionData
/*    */ {
/*  9 */   float[] data = new float[10];
/*    */   
/*    */   public float getRotQuatX() {
/* 12 */     return this.data[0];
/*    */   }
/*    */   
/*    */   public float getRotQuatY() {
/* 16 */     return this.data[1];
/*    */   }
/*    */   
/*    */   public float getRotQuatZ() {
/* 20 */     return this.data[2];
/*    */   }
/*    */   
/*    */   public float getRotQuatW() {
/* 24 */     return this.data[3];
/*    */   }
/*    */   
/*    */   public float getPosAccelX() {
/* 28 */     return this.data[4];
/*    */   }
/*    */   
/*    */   public float getPosAccelY() {
/* 32 */     return this.data[5];
/*    */   }
/*    */   
/*    */   public float getPosAccelZ() {
/* 36 */     return this.data[6];
/*    */   }
/*    */   
/*    */   public float getRotVelX() {
/* 40 */     return this.data[7];
/*    */   }
/*    */   
/*    */   public float getRotVelY() {
/* 44 */     return this.data[8];
/*    */   }
/*    */   
/*    */   public float getRotVelZ() {
/* 48 */     return this.data[9];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamControllerMotionData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */