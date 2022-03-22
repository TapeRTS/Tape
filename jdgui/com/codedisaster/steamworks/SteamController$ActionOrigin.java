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
/*     */ public enum SteamController$ActionOrigin
/*     */ {
/*     */   private static final SteamController$ActionOrigin[] values;
/*  51 */   None,
/*  52 */   A,
/*  53 */   B,
/*  54 */   X,
/*  55 */   Y,
/*  56 */   LeftBumper,
/*  57 */   RightBumper,
/*  58 */   LeftGrip,
/*  59 */   RightGrip,
/*  60 */   Start,
/*  61 */   Back,
/*  62 */   LeftPad_Touch,
/*  63 */   LeftPad_Swipe,
/*  64 */   LeftPad_Click,
/*  65 */   LeftPad_DPadNorth,
/*  66 */   LeftPad_DPadSouth,
/*  67 */   LeftPad_DPadWest,
/*  68 */   LeftPad_DPadEast,
/*  69 */   RightPad_Touch,
/*  70 */   RightPad_Swipe,
/*  71 */   RightPad_Click,
/*  72 */   RightPad_DPadNorth,
/*  73 */   RightPad_DPadSouth,
/*  74 */   RightPad_DPadWest,
/*  75 */   RightPad_DPadEast,
/*  76 */   LeftTrigger_Pull,
/*  77 */   LeftTrigger_Click,
/*  78 */   RightTrigger_Pull,
/*  79 */   RightTrigger_Click,
/*  80 */   LeftStick_Move,
/*  81 */   LeftStick_Click,
/*  82 */   LeftStick_DPadNorth,
/*  83 */   LeftStick_DPadSouth,
/*  84 */   LeftStick_DPadWest,
/*  85 */   LeftStick_DPadEast,
/*  86 */   Gyro_Move,
/*  87 */   Gyro_Pitch,
/*  88 */   Gyro_Yaw,
/*  89 */   Gyro_Roll,
/*     */   
/*  91 */   PS4_X,
/*  92 */   PS4_Circle,
/*  93 */   PS4_Triangle,
/*  94 */   PS4_Square,
/*  95 */   PS4_LeftBumper,
/*  96 */   PS4_RightBumper,
/*  97 */   PS4_Options,
/*  98 */   PS4_Share,
/*  99 */   PS4_LeftPad_Touch,
/* 100 */   PS4_LeftPad_Swipe,
/* 101 */   PS4_LeftPad_Click,
/* 102 */   PS4_LeftPad_DPadNorth,
/* 103 */   PS4_LeftPad_DPadSouth,
/* 104 */   PS4_LeftPad_DPadWest,
/* 105 */   PS4_LeftPad_DPadEast,
/* 106 */   PS4_RightPad_Touch,
/* 107 */   PS4_RightPad_Swipe,
/* 108 */   PS4_RightPad_Click,
/* 109 */   PS4_RightPad_DPadNorth,
/* 110 */   PS4_RightPad_DPadSouth,
/* 111 */   PS4_RightPad_DPadWest,
/* 112 */   PS4_RightPad_DPadEast,
/* 113 */   PS4_CenterPad_Touch,
/* 114 */   PS4_CenterPad_Swipe,
/* 115 */   PS4_CenterPad_Click,
/* 116 */   PS4_CenterPad_DPadNorth,
/* 117 */   PS4_CenterPad_DPadSouth,
/* 118 */   PS4_CenterPad_DPadWest,
/* 119 */   PS4_CenterPad_DPadEast,
/* 120 */   PS4_LeftTrigger_Pull,
/* 121 */   PS4_LeftTrigger_Click,
/* 122 */   PS4_RightTrigger_Pull,
/* 123 */   PS4_RightTrigger_Click,
/* 124 */   PS4_LeftStick_Move,
/* 125 */   PS4_LeftStick_Click,
/* 126 */   PS4_LeftStick_DPadNorth,
/* 127 */   PS4_LeftStick_DPadSouth,
/* 128 */   PS4_LeftStick_DPadWest,
/* 129 */   PS4_LeftStick_DPadEast,
/* 130 */   PS4_RightStick_Move,
/* 131 */   PS4_RightStick_Click,
/* 132 */   PS4_RightStick_DPadNorth,
/* 133 */   PS4_RightStick_DPadSouth,
/* 134 */   PS4_RightStick_DPadWest,
/* 135 */   PS4_RightStick_DPadEast,
/* 136 */   PS4_DPad_North,
/* 137 */   PS4_DPad_South,
/* 138 */   PS4_DPad_West,
/* 139 */   PS4_DPad_East,
/* 140 */   PS4_Gyro_Move,
/* 141 */   PS4_Gyro_Pitch,
/* 142 */   PS4_Gyro_Yaw,
/* 143 */   PS4_Gyro_Roll,
/*     */   
/* 145 */   XBoxOne_A,
/* 146 */   XBoxOne_B,
/* 147 */   XBoxOne_X,
/* 148 */   XBoxOne_Y,
/* 149 */   XBoxOne_LeftBumper,
/* 150 */   XBoxOne_RightBumper,
/* 151 */   XBoxOne_Menu,
/* 152 */   XBoxOne_View,
/* 153 */   XBoxOne_LeftTrigger_Pull,
/* 154 */   XBoxOne_LeftTrigger_Click,
/* 155 */   XBoxOne_RightTrigger_Pull,
/* 156 */   XBoxOne_RightTrigger_Click,
/* 157 */   XBoxOne_LeftStick_Move,
/* 158 */   XBoxOne_LeftStick_Click,
/* 159 */   XBoxOne_LeftStick_DPadNorth,
/* 160 */   XBoxOne_LeftStick_DPadSouth,
/* 161 */   XBoxOne_LeftStick_DPadWest,
/* 162 */   XBoxOne_LeftStick_DPadEast,
/* 163 */   XBoxOne_RightStick_Move,
/* 164 */   XBoxOne_RightStick_Click,
/* 165 */   XBoxOne_RightStick_DPadNorth,
/* 166 */   XBoxOne_RightStick_DPadSouth,
/* 167 */   XBoxOne_RightStick_DPadWest,
/* 168 */   XBoxOne_RightStick_DPadEast,
/* 169 */   XBoxOne_DPad_North,
/* 170 */   XBoxOne_DPad_South,
/* 171 */   XBoxOne_DPad_West,
/* 172 */   XBoxOne_DPad_East,
/*     */   
/* 174 */   XBox360_A,
/* 175 */   XBox360_B,
/* 176 */   XBox360_X,
/* 177 */   XBox360_Y,
/* 178 */   XBox360_LeftBumper,
/* 179 */   XBox360_RightBumper,
/* 180 */   XBox360_Start,
/* 181 */   XBox360_Back,
/* 182 */   XBox360_LeftTrigger_Pull,
/* 183 */   XBox360_LeftTrigger_Click,
/* 184 */   XBox360_RightTrigger_Pull,
/* 185 */   XBox360_RightTrigger_Click,
/* 186 */   XBox360_LeftStick_Move,
/* 187 */   XBox360_LeftStick_Click,
/* 188 */   XBox360_LeftStick_DPadNorth,
/* 189 */   XBox360_LeftStick_DPadSouth,
/* 190 */   XBox360_LeftStick_DPadWest,
/* 191 */   XBox360_LeftStick_DPadEast,
/* 192 */   XBox360_RightStick_Move,
/* 193 */   XBox360_RightStick_Click,
/* 194 */   XBox360_RightStick_DPadNorth,
/* 195 */   XBox360_RightStick_DPadSouth,
/* 196 */   XBox360_RightStick_DPadWest,
/* 197 */   XBox360_RightStick_DPadEast,
/* 198 */   XBox360_DPad_North,
/* 199 */   XBox360_DPad_South,
/* 200 */   XBox360_DPad_West,
/* 201 */   XBox360_DPad_East,
/*     */   
/* 203 */   SteamV2_A,
/* 204 */   SteamV2_B,
/* 205 */   SteamV2_X,
/* 206 */   SteamV2_Y,
/* 207 */   SteamV2_LeftBumper,
/* 208 */   SteamV2_RightBumper,
/* 209 */   SteamV2_LeftGrip,
/* 210 */   SteamV2_RightGrip,
/* 211 */   SteamV2_Start,
/* 212 */   SteamV2_Back,
/* 213 */   SteamV2_LeftPad_Touch,
/* 214 */   SteamV2_LeftPad_Swipe,
/* 215 */   SteamV2_LeftPad_Click,
/* 216 */   SteamV2_LeftPad_DPadNorth,
/* 217 */   SteamV2_LeftPad_DPadSouth,
/* 218 */   SteamV2_LeftPad_DPadWest,
/* 219 */   SteamV2_LeftPad_DPadEast,
/* 220 */   SteamV2_RightPad_Touch,
/* 221 */   SteamV2_RightPad_Swipe,
/* 222 */   SteamV2_RightPad_Click,
/* 223 */   SteamV2_RightPad_DPadNorth,
/* 224 */   SteamV2_RightPad_DPadSouth,
/* 225 */   SteamV2_RightPad_DPadWest,
/* 226 */   SteamV2_RightPad_DPadEast,
/* 227 */   SteamV2_LeftTrigger_Pull,
/* 228 */   SteamV2_LeftTrigger_Click,
/* 229 */   SteamV2_RightTrigger_Pull,
/* 230 */   SteamV2_RightTrigger_Click,
/* 231 */   SteamV2_LeftStick_Move,
/* 232 */   SteamV2_LeftStick_Click,
/* 233 */   SteamV2_LeftStick_DPadNorth,
/* 234 */   SteamV2_LeftStick_DPadSouth,
/* 235 */   SteamV2_LeftStick_DPadWest,
/* 236 */   SteamV2_LeftStick_DPadEast,
/* 237 */   SteamV2_Gyro_Move,
/* 238 */   SteamV2_Gyro_Pitch,
/* 239 */   SteamV2_Gyro_Yaw,
/* 240 */   SteamV2_Gyro_Roll;
/*     */   static {
/* 242 */     values = values();
/*     */   }
/*     */   static SteamController$ActionOrigin byOrdinal(int paramInt) {
/* 245 */     return values[paramInt];
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamController$ActionOrigin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */