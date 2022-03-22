/*     */ package com.corrodinggames.rts.game.units.custom.logicBooleans;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
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
/*     */ public class LogicBooleanLoader$ParameterMapping
/*     */ {
/*  35 */   public HashMap parameters = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class type;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String allParametersString;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LogicBooleanLoader$ParameterMapping(Class<LogicBoolean$IsResourceLargerThan> paramClass) {
/*  61 */     this.type = paramClass;
/*     */     
/*  63 */     ArrayList arrayList = new ArrayList();
/*  64 */     LogicBooleanLoader.getAllFieldsInherited(arrayList, paramClass);
/*  65 */     this.allParametersString = "";
/*     */     
/*  67 */     if (paramClass == LogicBoolean$IsResourceLargerThan.class)
/*     */     {
/*  69 */       l.d("========== IsResourceLargerThan ===========");
/*     */     }
/*     */ 
/*     */     
/*  73 */     for (Field field : arrayList) {
/*     */       
/*  75 */       if (paramClass == LogicBoolean$IsResourceLargerThan.class)
/*     */       {
/*  77 */         l.d("Found: " + field);
/*     */       }
/*     */       
/*  80 */       if (field.isAnnotationPresent((Class)LogicBoolean$Parameter.class)) {
/*     */         
/*  82 */         if (paramClass == LogicBoolean$IsResourceLargerThan.class)
/*     */         {
/*  84 */           l.d("Found: " + field + " (isAnnotationPresent)");
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*  89 */         String str = field.getName().toLowerCase(Locale.ROOT);
/*     */         
/*  91 */         this.parameters.put(str, new LogicBooleanLoader$ParameterMapping$FieldOrMethod(field));
/*     */         
/*  93 */         if (!this.allParametersString.equals(""))
/*     */         {
/*  95 */           this.allParametersString += ", ";
/*     */         }
/*  97 */         this.allParametersString += field.getName();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 102 */     Method[] arrayOfMethod = paramClass.getMethods();
/* 103 */     for (Method method : arrayOfMethod) {
/*     */       
/* 105 */       if (method.isAnnotationPresent((Class)LogicBoolean$Parameter.class)) {
/*     */ 
/*     */ 
/*     */         
/* 109 */         String str = method.getName().toLowerCase(Locale.ROOT);
/* 110 */         this.parameters.put(str, new LogicBooleanLoader$ParameterMapping$FieldOrMethod(method));
/*     */         
/* 112 */         if (!this.allParametersString.equals(""))
/*     */         {
/* 114 */           this.allParametersString += ", ";
/*     */         }
/* 116 */         this.allParametersString += method.getName();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\logicBooleans\LogicBooleanLoader$ParameterMapping.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */