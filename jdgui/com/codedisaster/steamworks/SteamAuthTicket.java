/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ public class SteamAuthTicket
/*    */   extends SteamNativeHandle {
/*    */   static final long AuthTicketInvalid = 0L;
/*    */   
/*    */   SteamAuthTicket(long paramLong) {
/*  8 */     super(paramLong);
/*    */   }
/*    */   
/*    */   public boolean isValid() {
/* 12 */     return (this.handle != 0L);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamAuthTicket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */