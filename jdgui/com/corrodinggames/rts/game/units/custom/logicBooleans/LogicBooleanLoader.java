/*     */ package com.corrodinggames.rts.game.units.custom.logicBooleans;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
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
/*     */ public class LogicBooleanLoader
/*     */ {
/*     */   public static LogicBoolean parseBooleanBlock(l paraml, String paramString) {
/* 130 */     int i = f.p(paramString);
/*     */     
/* 132 */     if (i != 0) {
/*     */       
/* 134 */       if (i > 0)
/*     */       {
/* 136 */         throw new RuntimeException("Brackets unbalanced for: '" + paramString + "'. A '(' was not closed.");
/*     */       }
/* 138 */       if (i < 0)
/*     */       {
/* 140 */         throw new RuntimeException("Brackets unbalanced for: '" + paramString + "'. Too many ')'.");
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 145 */     paramString = paramString.trim();
/*     */     
/* 147 */     paramString = breakOuterLayerBrackets(paramString);
/*     */ 
/*     */     
/* 150 */     String[] arrayOfString = { "or", "and" };
/*     */     
/* 152 */     for (String str1 : arrayOfString) {
/*     */       
/* 154 */       ArrayList arrayList = f.a(paramString, str1, true);
/*     */       
/* 156 */       if (arrayList.size() != 1) {
/*     */         
/* 158 */         ArrayList<LogicBoolean> arrayList1 = new ArrayList();
/* 159 */         for (String str2 : arrayList) {
/*     */           
/* 161 */           LogicBoolean logicBoolean = parseBooleanBlock(paraml, str2);
/* 162 */           if (logicBoolean == null)
/*     */           {
/* 164 */             throw new RuntimeException("null on:'" + paramString + "'");
/*     */           }
/* 166 */           arrayList1.add(logicBoolean);
/*     */         } 
/*     */         
/* 169 */         return LogicBoolean$JoinerBoolean.createJoiner(str1, arrayList1.<LogicBoolean>toArray(new LogicBoolean[0]));
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 174 */     boolean bool = false;
/* 175 */     if (paramString.startsWith("not ")) {
/*     */       
/* 177 */       bool = true;
/* 178 */       paramString = paramString.substring("not ".length());
/*     */     } 
/*     */ 
/*     */     
/* 182 */     String str = paramString.split("\\(")[0];
/* 183 */     str = str.trim();
/*     */     
/* 185 */     for (Map.Entry entry : LogicBoolean.booleans.entrySet()) {
/*     */       
/* 187 */       String str1 = (String)entry.getKey();
/* 188 */       LogicBoolean logicBoolean = (LogicBoolean)entry.getValue();
/*     */ 
/*     */       
/* 191 */       if (str.equals(str1.toLowerCase(Locale.ROOT))) {
/*     */         
/* 193 */         String str2 = paramString.substring(str1.length());
/* 194 */         str2 = str2.trim();
/*     */         
/* 196 */         if (str2.equals(""))
/*     */         {
/* 198 */           str2 = "()";
/*     */         }
/*     */         
/* 201 */         if (str2.startsWith("(") && str2.endsWith(")")) {
/*     */           
/* 203 */           str2 = str2.substring(1, str2.length() - 1);
/* 204 */           str2 = str2.trim();
/*     */         }
/*     */         else {
/*     */           
/* 208 */           throw new RuntimeException("Failed to parse function arguments in:'" + paramString + "'");
/*     */         } 
/*     */ 
/*     */         
/* 212 */         LogicBoolean logicBoolean1 = logicBoolean.with(paraml, str2);
/* 213 */         logicBoolean1.validateArguments(str1, str2, paramString);
/*     */ 
/*     */         
/* 216 */         if (bool)
/*     */         {
/* 218 */           logicBoolean1 = new LogicBoolean$NotBoolean(logicBoolean1);
/*     */         }
/*     */         
/* 221 */         return logicBoolean1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 230 */     throw new RuntimeException("Unknown function:'" + paramString + "'");
/*     */   }
/*     */ 
/*     */   
/* 234 */   static Pattern patternSingleQuote = Pattern.compile("'(.*)'");
/* 235 */   static Pattern patternDoubleQuote = Pattern.compile("\"(.*)\"");
/* 236 */   static Pattern patternInteger = Pattern.compile("(-?\\d*)");
/* 237 */   static Pattern patternFloat = Pattern.compile("(-?\\d*\\.\\d*)");
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matcher match(Pattern paramPattern, String paramString) {
/* 242 */     Matcher matcher = paramPattern.matcher(paramString);
/* 243 */     if (matcher.matches())
/*     */     {
/* 245 */       return matcher;
/*     */     }
/* 247 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setArgumentsWithMapping(LogicBooleanLoader$ParameterMapping paramLogicBooleanLoader$ParameterMapping, Object paramObject, String paramString) {
/* 253 */     if (paramString == null || "".equals(paramString)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 258 */     ArrayList arrayList = f.a(paramString, ",", false);
/* 259 */     ArrayList<String> arrayList1 = new ArrayList();
/*     */     
/* 261 */     for (String str1 : arrayList) {
/*     */       String str3;
/*     */ 
/*     */       
/* 265 */       int i = str1.indexOf("=");
/* 266 */       if (i > 0) {
/*     */         
/* 268 */         str2 = str1.substring(0, i);
/* 269 */         str3 = str1.substring(i + 1);
/*     */       }
/*     */       else {
/*     */         
/* 273 */         str2 = str1;
/* 274 */         str3 = null;
/*     */       } 
/* 276 */       String str4 = str2;
/* 277 */       String str2 = str2.trim();
/* 278 */       str2 = str2.toLowerCase(Locale.ROOT);
/*     */       
/* 280 */       if (arrayList1.contains(str2))
/*     */       {
/* 282 */         throw new BooleanParseException("argument '" + str4 + "' has been listed more than once");
/*     */       }
/* 284 */       arrayList1.add(str2);
/*     */ 
/*     */       
/*     */       try {
/* 288 */         setArgumentWithMapping(paramLogicBooleanLoader$ParameterMapping, paramObject, str2, str3);
/*     */       }
/* 290 */       catch (BooleanParseException booleanParseException) {
/*     */         
/* 292 */         l.d("key:" + str2);
/* 293 */         l.d("element:" + str1);
/* 294 */         l.d("arguments:" + paramString);
/*     */         
/* 296 */         throw booleanParseException;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setArgumentWithMapping(LogicBooleanLoader$ParameterMapping paramLogicBooleanLoader$ParameterMapping, Object paramObject, String paramString1, String paramString2) {
/* 303 */     LogicBooleanLoader$ParameterMapping$FieldOrMethod logicBooleanLoader$ParameterMapping$FieldOrMethod = (LogicBooleanLoader$ParameterMapping$FieldOrMethod)paramLogicBooleanLoader$ParameterMapping.parameters.get(paramString1);
/*     */ 
/*     */     
/* 306 */     if (logicBooleanLoader$ParameterMapping$FieldOrMethod != null && logicBooleanLoader$ParameterMapping$FieldOrMethod.field != null) {
/*     */ 
/*     */       
/* 309 */       Class clazz = logicBooleanLoader$ParameterMapping$FieldOrMethod.type;
/*     */       
/* 311 */       Object object = convertParameterData(paramString2, clazz);
/*     */       
/*     */       try {
/* 314 */         logicBooleanLoader$ParameterMapping$FieldOrMethod.field.set(paramObject, object);
/*     */       }
/* 316 */       catch (IllegalArgumentException illegalArgumentException) {
/*     */         
/* 318 */         illegalArgumentException.printStackTrace();
/*     */         
/* 320 */         String str = illegalArgumentException.getMessage();
/* 321 */         if (str == null)
/*     */         {
/* 323 */           throw new BooleanParseException("Error parameter:'" + paramString1 + "' on " + paramObject.getClass().getSimpleName(), illegalArgumentException);
/*     */         }
/*     */         
/* 326 */         str = str.replace("com.corrodinggames.rts.game.units.custom.logicBooleans.", "");
/* 327 */         str = str.replace("java.lang.", "");
/*     */         
/* 329 */         throw new BooleanParseException("Error parameter:'" + paramString1 + "': " + str);
/*     */       }
/* 331 */       catch (IllegalAccessException illegalAccessException) {
/*     */         
/* 333 */         throw new BooleanParseException("Error parameter:'" + paramString1 + "' on " + paramObject.getClass().getSimpleName(), illegalAccessException);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 339 */     if (logicBooleanLoader$ParameterMapping$FieldOrMethod != null && logicBooleanLoader$ParameterMapping$FieldOrMethod.method != null) {
/*     */ 
/*     */ 
/*     */       
/* 343 */       Class clazz = logicBooleanLoader$ParameterMapping$FieldOrMethod.type;
/*     */       
/* 345 */       Object object = convertParameterData(paramString2, clazz);
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 350 */         logicBooleanLoader$ParameterMapping$FieldOrMethod.method.invoke(paramObject, new Object[] { object });
/*     */       }
/* 352 */       catch (IllegalArgumentException illegalArgumentException) {
/*     */         
/* 354 */         illegalArgumentException.printStackTrace();
/*     */         
/* 356 */         String str = illegalArgumentException.getMessage();
/* 357 */         if (str == null)
/*     */         {
/* 359 */           throw new BooleanParseException("Error parameter:'" + paramString1 + "' on " + paramObject.getClass().getSimpleName(), illegalArgumentException);
/*     */         }
/*     */         
/* 362 */         str = str.replace("com.corrodinggames.rts.game.units.custom.logicBooleans.", "");
/* 363 */         str = str.replace("java.lang.", "");
/*     */         
/* 365 */         throw new BooleanParseException("Error parameter:'" + paramString1 + "': " + str);
/*     */       }
/* 367 */       catch (IllegalAccessException illegalAccessException) {
/*     */         
/* 369 */         throw new BooleanParseException("Error parameter:'" + paramString1 + "' on " + paramObject.getClass().getSimpleName(), illegalAccessException);
/*     */       }
/* 371 */       catch (InvocationTargetException invocationTargetException) {
/*     */         
/* 373 */         throw new BooleanParseException("Error parameter:'" + paramString1 + "' on " + paramObject.getClass().getSimpleName(), invocationTargetException);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 379 */     throw new BooleanParseException("No parameter:'" + paramString1 + "' on " + paramObject.getClass().getSimpleName() + " (Possible parameters:" + paramLogicBooleanLoader$ParameterMapping.allParametersString + ")");
/*     */   }
/*     */   
/*     */   public static List getAllFieldsInherited(List paramList, Class paramClass) {
/* 383 */     paramList.addAll(Arrays.asList(paramClass.getFields()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 393 */     return paramList;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Object convertParameterData(String paramString, Class<String> paramClass) {
/* 398 */     paramString = paramString.trim();
/* 399 */     if (paramString.length() == 0)
/*     */     {
/* 401 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 405 */     if (paramString.equals("null"))
/*     */     {
/* 407 */       return null;
/*     */     }
/*     */     
/* 410 */     String str1 = paramString.toLowerCase(Locale.ENGLISH);
/* 411 */     if ("false".equals(str1))
/*     */     {
/* 413 */       return Boolean.FALSE;
/*     */     }
/* 415 */     if ("true".equals(str1))
/*     */     {
/* 417 */       return Boolean.TRUE;
/*     */     }
/*     */ 
/*     */     
/* 421 */     Matcher matcher = match(patternSingleQuote, paramString);
/* 422 */     if (matcher != null)
/*     */     {
/* 424 */       return f.o(matcher.group(1));
/*     */     }
/*     */ 
/*     */     
/* 428 */     matcher = match(patternDoubleQuote, paramString);
/* 429 */     if (matcher != null)
/*     */     {
/* 431 */       return f.o(matcher.group(1));
/*     */     }
/*     */ 
/*     */     
/* 435 */     matcher = match(patternInteger, paramString);
/* 436 */     if (matcher != null) {
/*     */       
/* 438 */       if (paramClass == String.class)
/*     */       {
/* 440 */         return matcher.group(1);
/*     */       }
/*     */       
/* 443 */       return Integer.valueOf(Integer.parseInt(matcher.group(1)));
/*     */     } 
/*     */ 
/*     */     
/* 447 */     matcher = match(patternFloat, paramString);
/* 448 */     if (matcher != null) {
/*     */       
/* 450 */       if (paramClass == String.class)
/*     */       {
/* 452 */         return matcher.group(1);
/*     */       }
/*     */       
/* 455 */       return Float.valueOf(Float.parseFloat(matcher.group(1)));
/*     */     } 
/*     */     
/* 458 */     String str2 = "Failed to read parameter:" + paramString + "";
/*     */     
/* 460 */     if (paramClass == String.class)
/*     */     {
/* 462 */       str2 = str2 + " (A quoted string was expected)";
/*     */     }
/*     */     
/* 465 */     throw new BooleanParseException(str2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String breakOuterLayerBrackets(String paramString) {
/* 472 */     if (paramString.startsWith("(") && paramString.endsWith(")")) {
/*     */       
/* 474 */       int i = f.g(paramString, 0);
/*     */       
/* 476 */       if (i == -1)
/*     */       {
/* 478 */         throw new RuntimeException("Brackets unbalanced. Starting '(' in '" + paramString + "' was not closed.");
/*     */       }
/*     */       
/* 481 */       if (i == paramString.length() - 1) {
/*     */         
/* 483 */         paramString = paramString.substring(1, paramString.length() - 1);
/* 484 */         paramString = paramString.trim();
/*     */         
/* 486 */         paramString = breakOuterLayerBrackets(paramString);
/*     */       } 
/*     */     } 
/*     */     
/* 490 */     return paramString;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\logicBooleans\LogicBooleanLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */