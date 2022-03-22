/*     */ package com.corrodinggames.rts.game.units.custom.logicBooleans;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import java.util.HashMap;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class LogicBoolean
/*     */   implements Cloneable
/*     */ {
/*     */   public static final boolean not = false;
/*  48 */   public static final LogicBoolean$StaticBoolean trueBoolean = new LogicBoolean$StaticBooleanTrue();
/*  49 */   public static final LogicBoolean$StaticBoolean falseBoolean = new LogicBoolean$StaticBooleanFalse();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  75 */   static LogicBoolean$CallContext_self callContext_self = new LogicBoolean$CallContext_self();
/*  76 */   static LogicBoolean$CallContext_selfAndTarget callContext_selfAndTarget = new LogicBoolean$CallContext_selfAndTarget();
/*     */ 
/*     */ 
/*     */   
/*     */   static HashMap booleans;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void addBooleanType(LogicBoolean paramLogicBoolean, String... paramVarArgs) {
/*  86 */     for (String str1 : paramVarArgs) {
/*     */       
/*  88 */       booleans.put(str1, paramLogicBoolean);
/*     */ 
/*     */       
/*  91 */       String str2 = str1.replace("self.", "subject.");
/*     */       
/*  93 */       if (!str2.equals(str1));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 115 */   static final HashMap parameterMappings = new HashMap<>();
/*     */   static {
/* 117 */     booleans = new HashMap<>();
/*     */     
/* 119 */     addBooleanType((new LogicBoolean$HeightBoolean()).with("underwater=true"), new String[] { "self.underwater", "self.isUnderwater" });
/*     */ 
/*     */ 
/*     */     
/* 123 */     addBooleanType((new LogicBoolean$HeightBoolean()).with("ground=true"), new String[] { "self.gound", "self.ground", "self.isAtGroundHeight" });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 128 */     addBooleanType(new LogicBoolean$HeightValueBoolean(), new String[] { "self.height" });
/*     */ 
/*     */     
/* 131 */     addBooleanType((new LogicBoolean$HeightBoolean()).with("flying=true"), new String[] { "self.flying", "self.isFlying" });
/*     */ 
/*     */ 
/*     */     
/* 135 */     addBooleanType(new LogicBoolean$MovingBoolean(), new String[] { "self.isMoving" });
/*     */ 
/*     */ 
/*     */     
/* 139 */     addBooleanType(new LogicBoolean$HasActiveWaypoint(), new String[] { "self.hasActiveWaypoint" });
/*     */ 
/*     */     
/* 142 */     addBooleanType((new LogicBoolean$SpeedBoolean()).with("atTopSpeed=true"), new String[] { "self.maxspeed", "self.isAtTopSpeed" });
/*     */ 
/*     */ 
/*     */     
/* 146 */     addBooleanType(new LogicBoolean$TouchWaterBoolean(), new String[] { "self.inwater", "self.isInWater" });
/*     */ 
/*     */ 
/*     */     
/* 150 */     addBooleanType(new LogicBoolean$OverWaterBoolean(), new String[] { "self.overwater", "self.isOverwater" });
/*     */ 
/*     */ 
/*     */     
/* 154 */     addBooleanType(new LogicBoolean$OverLiquidBoolean(), new String[] { "self.isOverLiquid" });
/*     */ 
/*     */     
/* 157 */     addBooleanType(new LogicBoolean$OverCliftBoolean(), new String[] { "self.isOverClift", "self.isOverCliff" });
/*     */ 
/*     */     
/* 160 */     addBooleanType(new LogicBoolean$OverPassableTileBoolean(), new String[] { "self.isOverPassableTile" });
/*     */ 
/*     */     
/* 163 */     addBooleanType((new LogicBoolean$OverPassableTileBoolean()).with("type='LAND'").lock(), new String[] { "self.isOverOpenLand" });
/*     */ 
/*     */ 
/*     */     
/* 167 */     addBooleanType(new LogicBoolean$TagsBoolean(), new String[] { "self.tags", "self.hasTags" });
/*     */ 
/*     */     
/* 170 */     addBooleanType(new LogicBoolean$TeamTagBoolean(), new String[] { "self.globalTeamTags", "self.hasGlobalTeamTags" });
/*     */ 
/*     */     
/* 173 */     addBooleanType(new LogicBoolean$HasFlagBoolean(), new String[] { "self.hasFlag" });
/*     */ 
/*     */     
/* 176 */     addBooleanType(new LogicBoolean$EnergyBoolean(), new String[] { "self.energy" });
/*     */ 
/*     */     
/* 179 */     addBooleanType(new LogicBoolean$EnergyIncludingQueuedBoolean(), new String[] { "self.energyIncludingQueued" });
/*     */ 
/*     */     
/* 182 */     addBooleanType((new LogicBoolean$EnergyBoolean()).with("full=true"), new String[] { "self.isEnergyFull" });
/*     */ 
/*     */     
/* 185 */     addBooleanType((new LogicBoolean$EnergyBoolean()).with("empty=true"), new String[] { "self.isEnergyEmpty" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     addBooleanType(new LogicBoolean$TransportingCountBoolean(), new String[] { "self.transportingCount" });
/*     */ 
/*     */     
/* 194 */     addBooleanType(new LogicBoolean$TransportingUnitWithTagsBoolean(), new String[] { "self.transportingUnitWithTags" });
/*     */ 
/*     */     
/* 197 */     addBooleanType(new LogicBoolean$isTransportUnloading(), new String[] { "self.isTransportUnloading" });
/*     */ 
/*     */ 
/*     */     
/* 201 */     addBooleanType(new LogicBoolean$HpBoolean(), new String[] { "self.hp" });
/*     */ 
/*     */     
/* 204 */     addBooleanType(new LogicBoolean$ShieldBoolean(), new String[] { "self.shield" });
/*     */ 
/*     */     
/* 207 */     addBooleanType(new LogicBoolean$AmmoBoolean(), new String[] { "self.ammo" });
/*     */ 
/*     */     
/* 210 */     addBooleanType((new LogicBoolean$AmmoBoolean()).with("empty=true"), new String[] { "self.isAmmoEmpty" });
/*     */ 
/*     */     
/* 213 */     addBooleanType(new LogicBoolean$AmmoIncludingQueuedBoolean(), new String[] { "self.ammoIncludingQueued" });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     addBooleanType(new LogicBoolean$ResourceCountBoolean(), new String[] { "self.resource" });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     addBooleanType(new LogicBoolean$QueueSize(), new String[] { "self.queueSize" });
/*     */ 
/*     */     
/* 226 */     addBooleanType(new LogicBoolean$NumberOfConnectionsBoolean(), new String[] { "self.numberOfConnections" });
/*     */     
/* 228 */     addBooleanType(new LogicBoolean$NumberOfAttachedUnitsBoolean(), new String[] { "self.numberOfAttachedUnits" });
/*     */     
/* 230 */     addBooleanType(new LogicBoolean$HasParent(), new String[] { "self.hasParent" });
/*     */ 
/*     */     
/* 233 */     addBooleanType(new LogicBoolean$HasResourcesBoolean(), new String[] { "self.hasResources" });
/*     */ 
/*     */     
/* 236 */     addBooleanType(new LogicBoolean$IsResourceLargerThan(), new String[] { "self.isResourceLargerThan" });
/*     */ 
/*     */     
/* 239 */     addBooleanType(new LogicBoolean$KillsBoolean(), new String[] { "self.kills" });
/*     */ 
/*     */     
/* 242 */     addBooleanType(new LogicBoolean$TimeAliveBoolean(), new String[] { "self.timeAlive" });
/*     */ 
/*     */     
/* 245 */     addBooleanType(new LogicBoolean$LastConvertedBoolean(), new String[] { "self.lastConverted" });
/*     */ 
/*     */     
/* 248 */     addBooleanType(new LogicBoolean$CustomTimerBoolean(), new String[] { "self.customTimer" });
/*     */ 
/*     */     
/* 251 */     addBooleanType(new LogicBoolean$HasTakenDamage(), new String[] { "self.hasTakenDamage" });
/*     */ 
/*     */     
/* 254 */     addBooleanType(new LogicBoolean$IsAttackingBoolean(), new String[] { "self.isAttacking" });
/*     */ 
/*     */ 
/*     */     
/* 258 */     addBooleanType((new LogicBoolean$IsOnTeam()).with("team=-1").lock(), new String[] { "self.isOnNeutralTeam" });
/*     */ 
/*     */ 
/*     */     
/* 262 */     addBooleanType(new LogicBoolean$IsControlledByAI(), new String[] { "self.isControlledByAI" });
/*     */ 
/*     */ 
/*     */     
/* 266 */     addBooleanType(new LogicBoolean$NumberOfUnitsInTeam(), new String[] { "numberOfUnitsInTeam", "self.numberOfUnitsInTeam" });
/*     */ 
/*     */ 
/*     */     
/* 270 */     addBooleanType((new LogicBoolean$NumberOfUnitsInTeam()).with("greaterThan=0, lessThan=-1"), new String[] { "hasUnitInTeam", "self.hasUnitInTeam" });
/*     */ 
/*     */ 
/*     */     
/* 274 */     addBooleanType((new LogicBoolean$NumberOfUnitsInTeam()).with("greaterThan=-1, lessThan=1"), new String[] { "noUnitInTeam", "self.noUnitInTeam" });
/*     */ 
/*     */ 
/*     */     
/* 278 */     addBooleanType((new LogicBoolean$NumberOfUnitsInTeam()).with("neutralTeam=true"), new String[] { "numberOfUnitsInNeutralTeam", "self.numberOfUnitsInNeutralTeam" });
/*     */ 
/*     */     
/* 281 */     addBooleanType((new LogicBoolean$NumberOfUnitsInTeam()).with("aggressiveTeam=true"), new String[] { "numberOfUnitsInAggressiveTeam", "self.numberOfUnitsInAggressiveTeam" });
/*     */ 
/*     */ 
/*     */     
/* 285 */     addBooleanType((new LogicBoolean$NumberOfUnitsInEnemyOrAllyTeam()).with("ally=false"), new String[] { "numberOfUnitsInEnemyTeam", "self.numberOfUnitsInEnemyTeam" });
/*     */ 
/*     */ 
/*     */     
/* 289 */     addBooleanType((new LogicBoolean$NumberOfUnitsInEnemyOrAllyTeam()).with("ally=true"), new String[] { "numberOfUnitsInAllyTeam", "self.numberOfUnitsInAllyTeam", "numberOfUnitsInAllyNotOwnTeam", "self.numberOfUnitsInAllyNotOwnTeam" });
/*     */ 
/*     */     
/* 292 */     addBooleanType((new LogicBoolean$GameModeBoolean()).with("nukesEnabled=true").lock(), new String[] { "game.nukesEnabled" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 300 */     addBooleanType(trueBoolean, new String[] { "true" });
/* 301 */     addBooleanType(falseBoolean, new String[] { "false" });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean locked;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LogicBoolean() {
/* 328 */     this.locked = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public LogicBoolean lock() {
/*     */     LogicBoolean logicBoolean;
/*     */     try {
/* 335 */       logicBoolean = (LogicBoolean)clone();
/*     */     }
/* 337 */     catch (CloneNotSupportedException cloneNotSupportedException) {
/*     */       
/* 339 */       throw new RuntimeException(cloneNotSupportedException);
/*     */     } 
/* 341 */     logicBoolean.locked = true;
/* 342 */     return logicBoolean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LogicBoolean with(String paramString) {
/* 353 */     return with(null, paramString);
/*     */   } public void setArgumentsRaw(String paramString) { LogicBooleanLoader$ParameterMapping logicBooleanLoader$ParameterMapping = (LogicBooleanLoader$ParameterMapping)parameterMappings.get(getClass());
/*     */     if (logicBooleanLoader$ParameterMapping == null) {
/*     */       logicBooleanLoader$ParameterMapping = new LogicBooleanLoader$ParameterMapping(getClass());
/*     */       parameterMappings.put(logicBooleanLoader$ParameterMapping.type, logicBooleanLoader$ParameterMapping);
/*     */     } 
/*     */     LogicBooleanLoader.setArgumentsWithMapping(logicBooleanLoader$ParameterMapping, this, paramString); } public void forMeta(l paraml) {} public LogicBoolean with(l paraml, String paramString) {
/*     */     LogicBoolean logicBoolean;
/*     */     try {
/* 362 */       logicBoolean = (LogicBoolean)clone();
/*     */     }
/* 364 */     catch (CloneNotSupportedException cloneNotSupportedException) {
/*     */       
/* 366 */       throw new RuntimeException(cloneNotSupportedException);
/*     */     } 
/*     */     
/* 369 */     logicBoolean.forMeta(paraml);
/*     */ 
/*     */     
/* 372 */     if (this.locked) {
/*     */       
/* 374 */       if (paramString != null && !paramString.trim().equals(""))
/*     */       {
/* 376 */         throw new BooleanParseException("No parameters accepted for " + getClass().getSimpleName());
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 381 */       logicBoolean.setArgumentsRaw(paramString);
/*     */     } 
/*     */     
/* 384 */     return logicBoolean;
/*     */   }
/*     */ 
/*     */   
/*     */   public static LogicBoolean convertAlwaysTrueToNull(LogicBoolean paramLogicBoolean) {
/* 389 */     if (paramLogicBoolean == trueBoolean)
/*     */     {
/* 391 */       return null;
/*     */     }
/* 393 */     return paramLogicBoolean;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isStaticFalse(LogicBoolean paramLogicBoolean) {
/* 398 */     return (paramLogicBoolean == falseBoolean);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isStaticTrue(LogicBoolean paramLogicBoolean) {
/* 403 */     return (paramLogicBoolean == trueBoolean);
/*     */   }
/*     */ 
/*     */   
/*     */   public static LogicBoolean create(l paraml, String paramString) {
/* 408 */     return create(paraml, paramString, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public static LogicBoolean create(l paraml, String paramString, LogicBoolean paramLogicBoolean) {
/* 413 */     String str = paramString;
/*     */     
/*     */     try {
/* 416 */       if (str == null)
/*     */       {
/* 418 */         return paramLogicBoolean;
/*     */       }
/* 420 */       str = str.toLowerCase(Locale.ENGLISH);
/*     */ 
/*     */ 
/*     */       
/* 424 */       if (str.equalsIgnoreCase("true"))
/*     */       {
/* 426 */         return trueBoolean;
/*     */       }
/* 428 */       if (str.equalsIgnoreCase("false"))
/*     */       {
/* 430 */         return falseBoolean;
/*     */       }
/*     */ 
/*     */       
/* 434 */       if (str.startsWith("if ")) {
/*     */         
/* 436 */         str = str.substring("if ".length());
/*     */         
/* 438 */         return LogicBooleanLoader.parseBooleanBlock(paraml, str);
/*     */       } 
/*     */       
/* 441 */       throw new BooleanParseException("Cannot parse:'" + paramString + "' expected true, false or statement starting with 'if'");
/*     */     }
/* 443 */     catch (RuntimeException runtimeException) {
/*     */       
/* 445 */       throw new RuntimeException("LogicBoolean - Error: " + runtimeException.getMessage() + ", [parsing: '" + paramString + "']", runtimeException);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void validateArguments(String paramString1, String paramString2, String paramString3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDebugDetails(k paramk) {
/* 464 */     boolean bool = read(paramk);
/* 465 */     return getMatchFailReasonForPlayer(paramk) + "==" + (bool ? "true" : "false");
/*     */   }
/*     */   
/*     */   public abstract boolean read(k paramk);
/*     */   
/*     */   public abstract String getMatchFailReasonForPlayer(k paramk);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\logicBooleans\LogicBoolean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */