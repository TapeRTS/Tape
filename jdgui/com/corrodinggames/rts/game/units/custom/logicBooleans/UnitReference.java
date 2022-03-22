/*     */ package com.corrodinggames.rts.game.units.custom.logicBooleans;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.custom.t;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import java.util.HashMap;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class UnitReference
/*     */   implements Cloneable
/*     */ {
/*  27 */   public static final UnitReference nullReference = new UnitReference$LockedUnitReference(null);
/*  28 */   public static final UnitReference$SelfUnitReference selfUnitReference = new UnitReference$SelfUnitReference();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean locked;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static HashMap referenceTypes;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final af get(af paramaf) {
/*  44 */     if (!(paramaf instanceof k))
/*     */     {
/*  46 */       return null;
/*     */     }
/*     */     
/*  49 */     return getSingleRaw((k)paramaf);
/*     */   }
/*     */ 
/*     */   
/*     */   public final af get(k paramk) {
/*  54 */     return getSingleRaw(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void forMeta(l paraml) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void addUnitReferenceType(UnitReference paramUnitReference, String... paramVarArgs) {
/*  72 */     for (String str1 : paramVarArgs) {
/*     */       
/*  74 */       referenceTypes.put(str1, paramUnitReference);
/*     */       
/*  76 */       String str2 = str1.replace("self.", "subject.");
/*  77 */       if (!str2.equals(str1));
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
/*  90 */   static final HashMap parameterMappings = new HashMap<>();
/*     */   static {
/*  92 */     referenceTypes = new HashMap<>();
/*     */     
/*  94 */     addUnitReferenceType(new UnitReference$AttachmentUnitReference(), new String[] { "self.attachment" });
/*     */     
/*  96 */     addUnitReferenceType(new UnitReference$ParentUnitReference(), new String[] { "self.parent" });
/*     */     
/*  98 */     addUnitReferenceType(new UnitReference$TransportingUnitReference(), new String[] { "self.transporting" });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static UnitReference$UnitReferenceOrUnitType parseUnitTypeOrReferenceFromConf(l paraml, ab paramab, String paramString1, String paramString2, UnitReference$UnitReferenceOrUnitType paramUnitReference$UnitReferenceOrUnitType) {
/* 104 */     String str = paramab.b(paramString1, paramString2, null);
/*     */     
/* 106 */     return parseUnitTypeOrReference(paraml, str, paramString1, paramString2, paramUnitReference$UnitReferenceOrUnitType);
/*     */   }
/*     */ 
/*     */   
/*     */   public static UnitReference$UnitReferenceOrUnitType parseUnitTypeOrReference(l paraml, String paramString1, String paramString2, String paramString3, UnitReference$UnitReferenceOrUnitType paramUnitReference$UnitReferenceOrUnitType) {
/* 111 */     if (paramString1 == null)
/*     */     {
/* 113 */       return paramUnitReference$UnitReferenceOrUnitType;
/*     */     }
/* 115 */     paramString1 = paramString1.trim();
/* 116 */     if ("".equals(paramString1) || "NONE".equalsIgnoreCase(paramString1))
/*     */     {
/* 118 */       return paramUnitReference$UnitReferenceOrUnitType;
/*     */     }
/*     */     
/* 121 */     if (paramString1.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
/*     */       
/* 123 */       UnitReference unitReference = parseUnitReference(paraml, paramString1, paramString2, paramString3, null, true);
/* 124 */       return new UnitReference$UnitReferenceOrUnitType(unitReference);
/*     */     } 
/*     */     
/* 127 */     t t = paraml.a(paramString1, paramString3, paramString2);
/* 128 */     return new UnitReference$UnitReferenceOrUnitType(t);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static UnitReference parseUnitReferenceFromConf(l paraml, ab paramab, String paramString1, String paramString2, UnitReference paramUnitReference) {
/* 134 */     String str = paramab.b(paramString1, paramString2, null);
/*     */     
/* 136 */     return parseUnitReference(paraml, str, paramString1, paramString2, paramUnitReference, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public static UnitReference parseUnitReference(l paraml, String paramString1, String paramString2, String paramString3, UnitReference paramUnitReference, boolean paramBoolean) {
/* 141 */     if (paramString1 == null)
/*     */     {
/* 143 */       return paramUnitReference;
/*     */     }
/*     */     
/* 146 */     paramString1 = paramString1.trim();
/* 147 */     if ("".equals(paramString1) || "NONE".equalsIgnoreCase(paramString1))
/*     */     {
/* 149 */       return paramUnitReference;
/*     */     }
/* 151 */     paramString1 = paramString1.toLowerCase(Locale.ROOT);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     if (paramString1.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
/*     */       
/* 160 */       paramString1 = paramString1.substring("unitref ".length());
/* 161 */       paramString1 = paramString1.trim();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     if (paramString1.equals("self"))
/*     */     {
/* 172 */       return selfUnitReference;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 177 */     int i = paramString1.indexOf("(");
/* 178 */     if (i == -1) {
/*     */       
/* 180 */       i = paramString1.length();
/*     */ 
/*     */     
/*     */     }
/* 184 */     else if (paramString1.indexOf(")") != paramString1.length() - 1) {
/*     */       
/* 186 */       throw new at("[" + paramString2 + "]" + paramString3 + " UnitReference: Unexpected format for: '" + paramString1 + "'");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 214 */       UnitReference unitReference = parseUnitReferenceBlock(paraml, paramString1);
/*     */       
/* 216 */       if (unitReference == null)
/*     */       {
/* 218 */         throw new RuntimeException("Unknown function:'" + paramString1 + "'");
/*     */       }
/*     */       
/* 221 */       return unitReference;
/*     */     
/*     */     }
/* 224 */     catch (RuntimeException runtimeException) {
/*     */       
/* 226 */       throw new RuntimeException("[" + paramString2 + "]" + paramString3 + " UnitReference error: " + runtimeException.getMessage() + ", [parsing: '" + paramString1 + "']", runtimeException);
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
/*     */   public static UnitReference parseUnitReferenceBlock(l paraml, String paramString) {
/* 241 */     int i = f.p(paramString);
/*     */     
/* 243 */     if (i != 0) {
/*     */       
/* 245 */       if (i > 0)
/*     */       {
/* 247 */         throw new RuntimeException("Brackets unbalanced for: '" + paramString + "'. A '(' was not closed.");
/*     */       }
/* 249 */       if (i < 0)
/*     */       {
/* 251 */         throw new RuntimeException("Brackets unbalanced for: '" + paramString + "'. Too many ')'.");
/*     */       }
/*     */     } 
/* 254 */     paramString = paramString.trim();
/* 255 */     paramString = LogicBooleanLoader.breakOuterLayerBrackets(paramString);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 283 */     String str = paramString.split("\\(")[0];
/* 284 */     str = str.trim();
/*     */     
/* 286 */     for (Map.Entry entry : referenceTypes.entrySet()) {
/*     */       
/* 288 */       String str1 = (String)entry.getKey();
/* 289 */       UnitReference unitReference = (UnitReference)entry.getValue();
/*     */       
/* 291 */       if (str.equals(str1.toLowerCase(Locale.ROOT))) {
/*     */         
/* 293 */         String str2 = paramString.substring(str1.length());
/* 294 */         str2 = str2.trim();
/*     */         
/* 296 */         if (str2.equals(""))
/*     */         {
/* 298 */           str2 = "()";
/*     */         }
/*     */         
/* 301 */         if (str2.startsWith("(") && str2.endsWith(")")) {
/*     */           
/* 303 */           str2 = str2.substring(1, str2.length() - 1);
/* 304 */           str2 = str2.trim();
/*     */         }
/*     */         else {
/*     */           
/* 308 */           throw new RuntimeException("Failed to parse function arguments in:'" + paramString + "'");
/*     */         } 
/*     */         
/* 311 */         return unitReference.with(paraml, str2);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 319 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setArgumentsRaw(String paramString) {
/* 328 */     LogicBooleanLoader$ParameterMapping logicBooleanLoader$ParameterMapping = (LogicBooleanLoader$ParameterMapping)parameterMappings.get(getClass());
/*     */     
/* 330 */     if (logicBooleanLoader$ParameterMapping == null) {
/*     */       
/* 332 */       logicBooleanLoader$ParameterMapping = new LogicBooleanLoader$ParameterMapping(getClass());
/* 333 */       parameterMappings.put(logicBooleanLoader$ParameterMapping.type, logicBooleanLoader$ParameterMapping);
/*     */     } 
/*     */     
/* 336 */     LogicBooleanLoader.setArgumentsWithMapping(logicBooleanLoader$ParameterMapping, this, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public UnitReference with(String paramString) {
/* 342 */     return with(null, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnitReference with(l paraml, String paramString) {
/*     */     UnitReference unitReference;
/*     */     try {
/* 351 */       unitReference = (UnitReference)clone();
/*     */     }
/* 353 */     catch (CloneNotSupportedException cloneNotSupportedException) {
/*     */       
/* 355 */       throw new RuntimeException(cloneNotSupportedException);
/*     */     } 
/*     */     
/* 358 */     unitReference.forMeta(paraml);
/*     */ 
/*     */     
/* 361 */     if (this.locked) {
/*     */       
/* 363 */       if (paramString != null && !paramString.trim().equals(""))
/*     */       {
/* 365 */         throw new BooleanParseException("No parameters accepted for " + getClass().getSimpleName());
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 370 */       unitReference.setArgumentsRaw(paramString);
/*     */     } 
/*     */     
/* 373 */     return unitReference;
/*     */   }
/*     */   
/*     */   public abstract af getSingleRaw(k paramk);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\logicBooleans\UnitReference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */