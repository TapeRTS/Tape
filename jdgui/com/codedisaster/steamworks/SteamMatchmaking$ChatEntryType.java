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
/*     */ public enum SteamMatchmaking$ChatEntryType
/*     */ {
/*     */   private final int code;
/*     */   private static final SteamMatchmaking$ChatEntryType[] values;
/*  85 */   Invalid(0),
/*  86 */   ChatMsg(1),
/*  87 */   Typing(2),
/*  88 */   InviteGame(3),
/*  89 */   Emote(4),
/*  90 */   LeftConversation(6),
/*  91 */   Entered(7),
/*  92 */   WasKicked(8),
/*  93 */   WasBanned(9),
/*  94 */   Disconnected(10),
/*  95 */   HistoricalChat(11),
/*  96 */   Reserved1(12),
/*  97 */   Reserved2(13),
/*  98 */   LinkBlocked(14);
/*     */   
/*     */   static {
/* 101 */     values = values();
/*     */   }
/*     */   SteamMatchmaking$ChatEntryType(int paramInt1) {
/* 104 */     this.code = paramInt1;
/*     */   }
/*     */   
/*     */   static SteamMatchmaking$ChatEntryType byCode(int paramInt) {
/* 108 */     for (SteamMatchmaking$ChatEntryType steamMatchmaking$ChatEntryType : values) {
/* 109 */       if (steamMatchmaking$ChatEntryType.code == paramInt) {
/* 110 */         return steamMatchmaking$ChatEntryType;
/*     */       }
/*     */     } 
/* 113 */     return Invalid;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamMatchmaking$ChatEntryType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */