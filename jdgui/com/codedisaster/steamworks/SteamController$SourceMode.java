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
/*    */ public enum SteamController$SourceMode
/*    */ {
/*    */   private static final SteamController$SourceMode[] values;
/* 26 */   None,
/* 27 */   Dpad,
/* 28 */   Buttons,
/* 29 */   FourButtons,
/* 30 */   AbsoluteMouse,
/* 31 */   RelativeMouse,
/* 32 */   JoystickMove,
/* 33 */   JoystickMouse,
/* 34 */   JoystickCamera,
/* 35 */   ScrollWheel,
/* 36 */   Trigger,
/* 37 */   TouchMenu,
/* 38 */   MouseJoystick,
/* 39 */   MouseRegion,
/* 40 */   RadialMenu,
/* 41 */   Switches;
/*    */   static {
/* 43 */     values = values();
/*    */   }
/*    */   static SteamController$SourceMode byOrdinal(int paramInt) {
/* 46 */     return values[paramInt];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamController$SourceMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */