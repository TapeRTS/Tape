/*      */ package com.corrodinggames.rts.gameFramework.utility;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.Rect;
/*      */ import com.corrodinggames.rts.game.units.custom.ag;
/*      */ import com.corrodinggames.rts.game.units.custom.ah;
/*      */ import com.corrodinggames.rts.game.units.custom.at;
/*      */ import com.corrodinggames.rts.game.units.custom.d.a;
/*      */ import com.corrodinggames.rts.game.units.custom.h;
/*      */ import com.corrodinggames.rts.game.units.custom.i;
/*      */ import com.corrodinggames.rts.game.units.custom.l;
/*      */ import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
/*      */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
/*      */ import com.corrodinggames.rts.game.units.custom.s;
/*      */ import com.corrodinggames.rts.gameFramework.e.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.FileReader;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.InputStreamReader;
/*      */ import java.io.UnsupportedEncodingException;
/*      */ import java.math.BigInteger;
/*      */ import java.security.MessageDigest;
/*      */ import java.security.NoSuchAlgorithmException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.LinkedHashMap;
/*      */ import java.util.LinkedHashSet;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import java.util.regex.Matcher;
/*      */ import java.util.regex.Pattern;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ab
/*      */ {
/*   51 */   private static final Pattern f = Pattern.compile("\\p{C}");
/*      */   
/*   53 */   private static final Pattern g = Pattern.compile("\\s*\\[([^]]*)\\]\\s*");
/*   54 */   private static final Pattern h = Pattern.compile("\\s*([^=:]*)(?:=|:)(.*)");
/*      */   
/*   56 */   private LinkedHashMap i = new LinkedHashMap<>();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   61 */   String a = "ini";
/*      */   boolean b = true;
/*   63 */   LinkedHashSet c = new LinkedHashSet();
/*      */ 
/*      */   
/*   66 */   public ArrayList d = new ArrayList();
/*      */   
/*   68 */   public ArrayList e = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString1, String paramString2) {
/*  117 */     a(paramString1, paramString2, "Unknown");
/*      */   }
/*      */   
/*      */   public void a(String paramString1, String paramString2, String paramString3) {
/*  121 */     if (this.b)
/*      */     {
/*  123 */       this.c.add(paramString1 + ":" + paramString2);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a() {
/*  175 */     if (!this.b)
/*      */     {
/*  177 */       throw new RuntimeException("Not tracking reads");
/*      */     }
/*      */     
/*  180 */     for (String str1 : this.i.keySet()) {
/*      */ 
/*      */       
/*  183 */       if (str1 != null && str1.startsWith("template_")) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */       
/*  188 */       boolean bool = false;
/*  189 */       String str2 = null;
/*      */       
/*  191 */       Map map = (Map)this.i.get(str1);
/*      */       
/*  193 */       for (String str3 : map.keySet()) {
/*      */ 
/*      */         
/*  196 */         if (str3 != null)
/*      */         {
/*  198 */           if (str3.startsWith("@define ") || str3.startsWith("@global ")) {
/*      */             continue;
/*      */           }
/*      */         }
/*      */ 
/*      */         
/*  204 */         String str4 = str1 + ":" + str3;
/*  205 */         if (!this.c.contains(str4)) {
/*      */ 
/*      */           
/*  208 */           String str = (String)map.get(str3);
/*  209 */           if ("IGNORE".equals(str)) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/*  214 */           if (str2 == null)
/*      */           {
/*      */ 
/*      */             
/*  218 */             str2 = this.a + ": The key '[" + str1 + "]" + str3 + "' was not used. (hint: make sure it's valid and in the right section)";
/*      */           }
/*      */ 
/*      */           
/*      */           continue;
/*      */         } 
/*      */ 
/*      */         
/*  226 */         bool = true;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  231 */       if (str2 != null) {
/*      */         
/*  233 */         if (bool || this.i.size() == 1)
/*      */         {
/*  235 */           throw new RuntimeException(str2);
/*      */         }
/*      */ 
/*      */         
/*  239 */         throw new RuntimeException(this.a + ": No keys in section: [" + str1 + "] were used (is this section named correctly?)");
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int b() {
/*      */     try {
/*  254 */       MessageDigest messageDigest = MessageDigest.getInstance("MD5");
/*      */ 
/*      */ 
/*      */       
/*  258 */       for (String str : this.i.keySet()) {
/*      */         
/*  260 */         Map map = (Map)this.i.get(str);
/*  261 */         for (String str1 : map.keySet()) {
/*      */           
/*  263 */           String str2 = str + ":" + str1 + ":" + (String)map.get(str1);
/*      */ 
/*      */ 
/*      */           
/*  267 */           byte[] arrayOfByte1 = str2.getBytes("UTF-8");
/*  268 */           messageDigest.update(arrayOfByte1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  273 */       byte[] arrayOfByte = messageDigest.digest();
/*      */       
/*  275 */       BigInteger bigInteger = new BigInteger(1, arrayOfByte);
/*      */       
/*  277 */       return bigInteger.intValue();
/*      */     
/*      */     }
/*  280 */     catch (UnsupportedEncodingException unsupportedEncodingException) {
/*      */       
/*  282 */       throw new RuntimeException(unsupportedEncodingException);
/*      */     }
/*  284 */     catch (NoSuchAlgorithmException noSuchAlgorithmException) {
/*      */       
/*  286 */       throw new RuntimeException(noSuchAlgorithmException);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ab(String paramString) {
/*  316 */     this.a = paramString;
/*  317 */     a(paramString);
/*      */   }
/*      */   
/*      */   public ab(InputStream paramInputStream, String paramString) {
/*  321 */     this.a = paramString;
/*  322 */     a(paramInputStream);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(String paramString) {
/*  327 */     BufferedReader bufferedReader = new BufferedReader(new FileReader(paramString));
/*  328 */     a(bufferedReader);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(InputStream paramInputStream) {
/*  333 */     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(paramInputStream, "UTF-8"));
/*  334 */     a(bufferedReader);
/*      */   }
/*      */   
/*      */   public void a(BufferedReader paramBufferedReader) {
/*      */     try {
/*  339 */       byte b = 0;
/*      */       
/*  341 */       String str2 = null; String str1;
/*  342 */       while ((str1 = paramBufferedReader.readLine()) != null)
/*      */       {
/*      */         
/*  345 */         b++;
/*      */ 
/*      */         
/*  348 */         if (str1.startsWith("﻿"))
/*      */         {
/*  350 */           str1 = str1.substring(1);
/*      */         }
/*      */         
/*  353 */         if (str1.trim().startsWith("#") || str1.trim().length() == 0) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/*  358 */         if (f.c(str1, "[")) {
/*      */           
/*  360 */           Matcher matcher1 = g.matcher(str1);
/*  361 */           if (matcher1.matches()) {
/*      */ 
/*      */             
/*  364 */             str2 = matcher1.group(1).trim();
/*      */             
/*      */             continue;
/*      */           } 
/*      */         } 
/*  369 */         if (str2 != null && str2.startsWith("comment_")) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/*  374 */         Matcher matcher = h.matcher(str1);
/*  375 */         if (matcher.matches()) {
/*      */           
/*  377 */           if (str2 == null) {
/*      */             
/*  379 */             l.b("IniFile: " + this.a + "  line is not in a [section]:'" + str1 + "'");
/*  380 */             this.e.add("This line is not in a [section]: '" + str1 + "'");
/*      */             
/*      */             continue;
/*      */           } 
/*  384 */           String str3 = matcher.group(1).trim();
/*  385 */           String str4 = matcher.group(2).trim();
/*  386 */           LinkedHashMap<Object, Object> linkedHashMap = (LinkedHashMap)this.i.get(str2);
/*  387 */           if (linkedHashMap == null) {
/*  388 */             this.i.put(str2, linkedHashMap = new LinkedHashMap<>());
/*      */           }
/*      */           
/*  391 */           if (linkedHashMap.get(str3) != null)
/*      */           {
/*  393 */             this.d.add(new ac(str2, str3));
/*      */           }
/*      */           
/*  396 */           linkedHashMap.put(str3, str4);
/*      */ 
/*      */ 
/*      */           
/*      */           continue;
/*      */         } 
/*      */ 
/*      */         
/*  404 */         matcher = f.matcher(str1);
/*      */         
/*  406 */         if (matcher.find()) {
/*      */           
/*  408 */           if (str1.length() == 1) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/*  413 */           String str3 = str1.replaceAll("\\p{C}", "?");
/*  414 */           String str4 = this.a + ": Unexpected format on line:" + b + ": '" + str3 + "' in ini file (hint: This line might have hidden unicode)";
/*  415 */           throw new IOException(str4);
/*      */         } 
/*      */         
/*  418 */         l.b(this.a + ": Unexpected format on line:" + b + ": '" + str1 + "' in ini file");
/*  419 */         this.e.add(str1);
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     finally {
/*      */ 
/*      */       
/*  430 */       paramBufferedReader.close();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private String a(String paramString1, String paramString2, boolean paramBoolean, String paramString3) {
/*  436 */     String str = a(paramString1, paramString2, paramBoolean);
/*  437 */     if (str != null)
/*      */     {
/*  439 */       a(paramString1, paramString2, paramString3);
/*      */     }
/*  441 */     return str;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String b(String paramString1, String paramString2) {
/*  447 */     Map map = (Map)this.i.get(paramString1);
/*  448 */     if (map == null)
/*      */     {
/*  450 */       return null;
/*      */     }
/*      */     
/*  453 */     return (String)map.get(paramString2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String a(String paramString1, String paramString2, boolean paramBoolean) {
/*  460 */     Map map = (Map)this.i.get(paramString1);
/*  461 */     if (map == null) {
/*      */       
/*  463 */       if (!paramBoolean)
/*      */       {
/*  465 */         throw new RuntimeException("Could not find section: [" + paramString1 + "] in configuration file");
/*      */       }
/*  467 */       return null;
/*      */     } 
/*      */     
/*  470 */     String str = (String)map.get(paramString2);
/*  471 */     if (str == null) {
/*      */       
/*  473 */       if (!paramBoolean)
/*      */       {
/*  475 */         throw new RuntimeException("Could not find: " + paramString2 + " in configuration file under [" + paramString1 + "]");
/*      */       }
/*  477 */       return null;
/*      */     } 
/*      */     
/*  480 */     if (str.equals("IGNORE")) {
/*      */       
/*  482 */       if (!paramBoolean)
/*      */       {
/*  484 */         throw new RuntimeException("Key: " + paramString2 + " under [" + paramString1 + "], is set to IGNORE but is required and has no default");
/*      */       }
/*  486 */       return null;
/*      */     } 
/*      */ 
/*      */     
/*  490 */     return str;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Boolean a(String paramString1, String paramString2, Boolean paramBoolean) {
/*  496 */     String str = b(paramString1, paramString2, (String)null);
/*  497 */     if (str == null)
/*      */     {
/*  499 */       return paramBoolean;
/*      */     }
/*  501 */     if (str.equalsIgnoreCase("true"))
/*      */     {
/*  503 */       return Boolean.valueOf(true);
/*      */     }
/*  505 */     if (str.equalsIgnoreCase("false"))
/*      */     {
/*  507 */       return Boolean.valueOf(false);
/*      */     }
/*      */ 
/*      */     
/*  511 */     if (str.equalsIgnoreCase("1"))
/*      */     {
/*  513 */       return Boolean.valueOf(true);
/*      */     }
/*  515 */     if (str.equalsIgnoreCase("0"))
/*      */     {
/*  517 */       return Boolean.valueOf(false);
/*      */     }
/*      */     
/*  520 */     throw new RuntimeException(paramString2 + ": unexpected boolean value:'" + str + "' in section:" + paramString1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(String paramString1, String paramString2) {
/*  525 */     throw new RuntimeException("Could not find " + paramString2 + " in configuration file in section:" + paramString1);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean d(String paramString1, String paramString2) {
/*  530 */     Boolean bool = a(paramString1, paramString2, (Boolean)null);
/*  531 */     if (bool == null)
/*      */     {
/*      */       
/*  534 */       c(paramString1, paramString2);
/*      */     }
/*  536 */     return bool.booleanValue();
/*      */   }
/*      */ 
/*      */   
/*      */   public String e(String paramString1, String paramString2) {
/*  541 */     String str = b(paramString1, paramString2, (String)null);
/*      */     
/*  543 */     if (str == null)
/*      */     {
/*      */       
/*  546 */       c(paramString1, paramString2);
/*      */     }
/*      */     
/*  549 */     return str;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String b(String paramString1, String paramString2, String paramString3) {
/*  557 */     String str = a(paramString1, paramString2, true, "string");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  572 */     if (str == null)
/*      */     {
/*  574 */       return paramString3;
/*      */     }
/*  576 */     return str;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String b(String paramString) {
/*  582 */     if (paramString == null)
/*      */     {
/*  584 */       return null;
/*      */     }
/*      */ 
/*      */     
/*  588 */     paramString = f.a(paramString, "\\n", "\n");
/*      */     
/*  590 */     return paramString;
/*      */   }
/*      */ 
/*      */   
/*      */   public ag c(String paramString1, String paramString2, String paramString3) {
/*  595 */     String str1 = b(paramString1, paramString2, (String)null);
/*      */     
/*  597 */     if (str1 == null) {
/*      */       
/*  599 */       if (paramString3 == null)
/*      */       {
/*  601 */         return null;
/*      */       }
/*      */ 
/*      */       
/*  605 */       str1 = paramString3;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  611 */     str1 = b(str1);
/*      */     
/*  613 */     ag ag = new ag();
/*      */ 
/*      */     
/*  616 */     if (str1 != null && str1.startsWith("i:")) {
/*      */       
/*  618 */       ag.e = str1.substring("i:".length());
/*  619 */       ag.e = ag.e.trim();
/*      */       
/*  621 */       a.a(ag.e, new Object[0]);
/*  622 */       return ag;
/*      */     } 
/*      */ 
/*      */     
/*  626 */     ArrayList<ah> arrayList = new ArrayList();
/*      */ 
/*      */     
/*  629 */     ah ah = new ah();
/*  630 */     ah.a = null;
/*  631 */     ah.b = str1;
/*  632 */     arrayList.add(ah);
/*      */     
/*  634 */     String str2 = paramString2 + "_";
/*  635 */     m m = j(paramString1, str2);
/*      */ 
/*      */     
/*  638 */     for (String str3 : m) {
/*      */       
/*  640 */       String str4 = str3.substring(str2.length());
/*  641 */       str4 = str4.toLowerCase(Locale.ROOT);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  647 */       String str5 = e(paramString1, str3);
/*      */       
/*  649 */       str5 = b(str5);
/*      */       
/*  651 */       ah ah1 = new ah();
/*  652 */       ah1.a = str4;
/*  653 */       ah1.b = str5;
/*  654 */       arrayList.add(ah1);
/*      */     } 
/*      */     
/*  657 */     ag.b = arrayList.<ah>toArray(new ah[0]);
/*      */ 
/*      */     
/*  660 */     ag.b();
/*      */     
/*  662 */     return ag;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LogicBoolean a(l paraml, String paramString1, String paramString2) {
/*  684 */     String str = e(paramString1, paramString2);
/*      */     
/*      */     try {
/*  687 */       return LogicBoolean.create(paraml, str, null);
/*      */     }
/*  689 */     catch (RuntimeException runtimeException) {
/*      */       
/*  691 */       throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": " + runtimeException.getMessage(), runtimeException);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public LogicBoolean a(l paraml, String paramString1, String paramString2, LogicBoolean paramLogicBoolean) {
/*  697 */     String str = b(paramString1, paramString2, (String)null);
/*      */     
/*      */     try {
/*  700 */       return LogicBoolean.create(paraml, str, paramLogicBoolean);
/*      */     }
/*  702 */     catch (RuntimeException runtimeException) {
/*      */       
/*  704 */       throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": " + runtimeException.getMessage(), runtimeException);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public h a(String paramString1, String paramString2, h paramh) {
/*  710 */     String str = b(paramString1, paramString2, (String)null);
/*      */     
/*  712 */     if (str == null)
/*      */     {
/*  714 */       return paramh;
/*      */     }
/*  716 */     if (str.trim().equals(""))
/*      */     {
/*  718 */       return paramh;
/*      */     }
/*      */     
/*  721 */     if (str.contains(","))
/*      */     {
/*  723 */       throw new at("[" + paramString1 + "]" + paramString2 + ": Expected single tag, got:" + str);
/*      */     }
/*      */     
/*  726 */     return h.c(str);
/*      */   }
/*      */ 
/*      */   
/*      */   public i a(l paraml, String paramString1, String paramString2, i parami) {
/*  731 */     String str = b(paramString1, paramString2, (String)null);
/*      */     
/*  733 */     return h.a(str, parami);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public s a(l paraml, String paramString1, String paramString2, s params) {
/*  755 */     String str = b(paramString1, paramString2, (String)null);
/*  756 */     if (str == null)
/*      */     {
/*  758 */       return params;
/*      */     }
/*  760 */     return paraml.c(str, paramString2, paramString1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public a a(l paraml, String paramString1, String paramString2, a parama, boolean paramBoolean) {
/*  781 */     String str = b(paramString1, paramString2, (String)null);
/*  782 */     if (str == null)
/*      */     {
/*  784 */       return parama;
/*      */     }
/*      */     
/*  787 */     if (paramBoolean) {
/*      */       
/*  789 */       a a2 = a.a(str);
/*  790 */       if (a2 != null)
/*      */       {
/*  792 */         return a2;
/*      */       }
/*      */     } 
/*      */     
/*  796 */     a a1 = paraml.i(str);
/*      */     
/*  798 */     if (a1 == null)
/*      */     {
/*  800 */       throw new BooleanParseException("[" + paramString1 + "]" + paramString2 + ": Could not find custom resource type of:" + str);
/*      */     }
/*      */     
/*  803 */     return a1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer a(String paramString1, String paramString2, Integer paramInteger) {
/*  810 */     String str = b(paramString1, paramString2, (String)null);
/*  811 */     if (str == null)
/*      */     {
/*  813 */       return paramInteger;
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/*  818 */       return Integer.valueOf(Color.a(str));
/*      */     }
/*  820 */     catch (IllegalArgumentException illegalArgumentException) {
/*      */       
/*  822 */       throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": Unknown color:" + str);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int f(String paramString1, String paramString2) {
/*  831 */     String str = a(paramString1, paramString2, false, "int");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  846 */       return Integer.parseInt(str);
/*      */     }
/*  848 */     catch (NumberFormatException numberFormatException) {
/*      */       
/*  850 */       throw new RuntimeException("Failed to read int:" + str + " in key:" + paramString2 + " section:" + paramString1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Short a(String paramString1, String paramString2, Short paramShort) {
/*  864 */     String str = a(paramString1, paramString2, true, "short");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  874 */     if (str == null)
/*      */     {
/*  876 */       return paramShort;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  882 */       return Short.valueOf(Short.parseShort(str));
/*      */     }
/*  884 */     catch (NumberFormatException numberFormatException) {
/*      */       
/*  886 */       throw new RuntimeException("getShort: " + str + " is not a number, key:" + paramString2);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer b(String paramString1, String paramString2, Integer paramInteger) {
/*  895 */     String str = a(paramString1, paramString2, true, "int");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  905 */     if (str == null)
/*      */     {
/*  907 */       return paramInteger;
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/*  912 */       return Integer.valueOf(Integer.parseInt(str));
/*      */     }
/*  914 */     catch (NumberFormatException numberFormatException) {
/*      */       
/*  916 */       throw new RuntimeException("getInt: " + str + " is not a number, key:" + paramString2);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Float a(String paramString1, String paramString2, Float paramFloat) {
/*  923 */     String str = a(paramString1, paramString2, true, "float");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  933 */     if (str == null) {
/*  934 */       return paramFloat;
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/*  939 */       return Float.valueOf(Float.parseFloat(str));
/*      */     }
/*  941 */     catch (NumberFormatException numberFormatException) {
/*      */       
/*  943 */       throw new RuntimeException("Failed to read float:" + str + " in key:" + paramString2 + " section:" + paramString1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PointF a(String paramString1, String paramString2, PointF paramPointF) {
/*  951 */     String str = a(paramString1, paramString2, true, "point");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  961 */     if (str == null) {
/*  962 */       return paramPointF;
/*      */     }
/*      */     
/*  965 */     if (str.equalsIgnoreCase("NONE")) {
/*  966 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/*  971 */       String[] arrayOfString = str.split(",");
/*  972 */       if (arrayOfString.length != 2)
/*      */       {
/*  974 */         throw new NumberFormatException("Got:" + arrayOfString.length + " elements expected 2");
/*      */       }
/*  976 */       PointF pointF = new PointF();
/*  977 */       pointF.a = Float.parseFloat(arrayOfString[0]);
/*  978 */       pointF.b = Float.parseFloat(arrayOfString[1]);
/*      */       
/*  980 */       return pointF;
/*      */     }
/*  982 */     catch (NumberFormatException numberFormatException) {
/*      */       
/*  984 */       throw new RuntimeException("Failed to read point:" + str + " in key:" + paramString2 + " section:" + paramString1 + " expected format: x,y");
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public ag a(String paramString1, String paramString2, ag paramag) {
/*  990 */     String str = a(paramString1, paramString2, true, "point3d");
/*      */     
/*  992 */     if (str == null)
/*      */     {
/*  994 */       return paramag;
/*      */     }
/*      */     
/*  997 */     if (str.equalsIgnoreCase("NONE"))
/*      */     {
/*  999 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/* 1004 */       String[] arrayOfString = str.split(",");
/* 1005 */       if (arrayOfString.length != 2 && arrayOfString.length != 3)
/*      */       {
/* 1007 */         throw new NumberFormatException("Got:" + arrayOfString.length + " elements expected 2 or 3");
/*      */       }
/* 1009 */       ag ag1 = new ag();
/* 1010 */       ag1.a = Float.parseFloat(arrayOfString[0]);
/* 1011 */       ag1.b = Float.parseFloat(arrayOfString[1]);
/*      */       
/* 1013 */       if (arrayOfString.length > 2)
/*      */       {
/* 1015 */         ag1.c = Float.parseFloat(arrayOfString[2]);
/*      */       }
/*      */       
/* 1018 */       return ag1;
/*      */     }
/* 1020 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1022 */       throw new RuntimeException("Failed to read point:" + str + " in key:" + paramString2 + " section:" + paramString1 + " expected format: x,y,[height]");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Float g(String paramString1, String paramString2) {
/* 1029 */     Float float_ = b(paramString1, paramString2, (Float)null);
/*      */     
/* 1031 */     if (float_ == null) {
/* 1032 */       throw new RuntimeException("Could not find key:" + paramString2 + " in section:" + paramString1);
/*      */     }
/*      */     
/* 1035 */     return float_;
/*      */   }
/*      */ 
/*      */   
/*      */   public Float b(String paramString1, String paramString2, Float paramFloat) {
/* 1040 */     return a(paramString1, paramString2, paramFloat, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public Float c(String paramString1, String paramString2, Float paramFloat) {
/* 1045 */     Float float_ = a(paramString1, paramString2, (Float)null, false);
/* 1046 */     if (float_ == null)
/*      */     {
/* 1048 */       return paramFloat;
/*      */     }
/* 1050 */     return Float.valueOf(float_.floatValue() * 16.666666F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Float a(String paramString1, String paramString2, Float paramFloat, boolean paramBoolean) {
/* 1057 */     String str = a(paramString1, paramString2, true, "time");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1067 */     if (str == null) {
/* 1068 */       return paramFloat;
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/* 1073 */       return Float.valueOf(a(str, paramBoolean, paramString1, paramString2));
/*      */     }
/* 1075 */     catch (NumberFormatException numberFormatException) {
/*      */ 
/*      */       
/* 1078 */       throw new RuntimeException("Failed to read time:" + str + " in key:" + paramString2 + " section:" + paramString1 + " expected a float with optional 's' or 'ms' postfix");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Float d(String paramString1, String paramString2, Float paramFloat) {
/* 1095 */     return a(paramString1, paramString2, paramFloat, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static float a(String paramString1, boolean paramBoolean, String paramString2, String paramString3) {
/* 1118 */     float f2, f1 = 1.0F;
/* 1119 */     boolean bool = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1129 */     if (paramString1.endsWith("s")) {
/*      */       
/* 1131 */       paramString1 = paramString1.substring(0, paramString1.length() - 1);
/* 1132 */       f1 = 60.0F;
/* 1133 */       bool = true;
/*      */     }
/*      */     else {
/*      */       
/* 1137 */       f1 = 1.0F;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1143 */       f2 = Float.parseFloat(paramString1) * f1;
/*      */     }
/* 1145 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1147 */       throw new RuntimeException("[" + paramString2 + "]" + paramString3 + ": Failed to read time:" + paramString1 + " expected a float with optional 's' postfix");
/*      */     } 
/*      */     
/* 1150 */     if (paramBoolean) {
/*      */       
/* 1152 */       if (bool)
/*      */       {
/* 1154 */         return 1.0F / f2;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1159 */       return f2;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1164 */     return f2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float h(String paramString1, String paramString2) {
/* 1172 */     String str = a(paramString1, paramString2, false, "float");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1188 */       return Float.parseFloat(str);
/*      */     }
/* 1190 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1192 */       throw new RuntimeException("Failed to read float:" + str + " in key:" + paramString2 + " section:" + paramString1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public double i(String paramString1, String paramString2) {
/* 1199 */     String str = a(paramString1, paramString2, false, "double");
/*      */ 
/*      */     
/*      */     try {
/* 1203 */       return Double.parseDouble(str);
/*      */     }
/* 1205 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1207 */       throw new RuntimeException("Failed to read float:" + str + " in key:" + paramString2 + " section:" + paramString1);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public double a(String paramString1, String paramString2, double paramDouble) {
/* 1213 */     String str = a(paramString1, paramString2, true, "double");
/*      */     
/* 1215 */     if (str == null) {
/* 1216 */       return paramDouble;
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/* 1221 */       return Double.parseDouble(str);
/*      */     }
/* 1223 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1225 */       throw new RuntimeException("Failed to read float:" + str + " in key:" + paramString2 + " section:" + paramString1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long a(String paramString1, String paramString2, long paramLong) {
/* 1250 */     String str = a(paramString1, paramString2, false, "long");
/*      */ 
/*      */     
/*      */     try {
/* 1254 */       return Long.parseLong(str);
/*      */     }
/* 1256 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1258 */       throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": Failed to read long:" + str + " in key:" + paramString2 + " section:" + paramString1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void d(String paramString1, String paramString2, String paramString3) {
/* 1265 */     LinkedHashMap<Object, Object> linkedHashMap = (LinkedHashMap)this.i.get(paramString1);
/* 1266 */     if (linkedHashMap == null) {
/*      */       
/* 1268 */       linkedHashMap = new LinkedHashMap<>();
/* 1269 */       this.i.put(paramString1, linkedHashMap);
/*      */     } 
/*      */     
/* 1272 */     if (linkedHashMap.get(paramString2) == null)
/*      */     {
/* 1274 */       linkedHashMap.put(paramString2, paramString3);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void e(String paramString1, String paramString2, String paramString3) {
/* 1280 */     LinkedHashMap<Object, Object> linkedHashMap = (LinkedHashMap)this.i.get(paramString1);
/* 1281 */     if (linkedHashMap == null) {
/*      */       
/* 1283 */       linkedHashMap = new LinkedHashMap<>();
/* 1284 */       this.i.put(paramString1, linkedHashMap);
/*      */     } 
/*      */     
/* 1287 */     linkedHashMap.put(paramString2, paramString3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ab paramab) {
/* 1295 */     for (String str : paramab.i.keySet()) {
/*      */       
/* 1297 */       LinkedHashMap linkedHashMap = (LinkedHashMap)paramab.i.get(str);
/*      */       
/* 1299 */       if (a(str, "@copyFrom_skipThisSection", Boolean.valueOf(false)).booleanValue()) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */       
/* 1304 */       LinkedHashMap<Object, Object> linkedHashMap1 = (LinkedHashMap)this.i.get(str);
/* 1305 */       if (linkedHashMap1 == null) {
/*      */         
/* 1307 */         linkedHashMap1 = new LinkedHashMap<>();
/* 1308 */         this.i.put(str, linkedHashMap1);
/*      */       } 
/*      */       
/* 1311 */       for (String str1 : linkedHashMap.keySet()) {
/*      */         
/* 1313 */         if (linkedHashMap1.get(str1) == null)
/*      */         {
/* 1315 */           linkedHashMap1.put(str1, linkedHashMap.get(str1));
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rect a(String paramString1, String paramString2, Rect paramRect) {
/* 1331 */     String str = b(paramString1, paramString2, (String)null);
/* 1332 */     if (str == null)
/*      */     {
/* 1334 */       return paramRect;
/*      */     }
/*      */     
/* 1337 */     String[] arrayOfString = str.split(",");
/*      */     
/* 1339 */     if (arrayOfString.length != 4)
/*      */     {
/* 1341 */       throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": getRect: expected 4 ints, not:" + arrayOfString.length);
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/* 1346 */       return new Rect(
/* 1347 */           Integer.valueOf(arrayOfString[0].trim()).intValue(), 
/* 1348 */           Integer.valueOf(arrayOfString[1].trim()).intValue(), 
/* 1349 */           Integer.valueOf(arrayOfString[2].trim()).intValue(), 
/* 1350 */           Integer.valueOf(arrayOfString[3].trim()).intValue());
/*      */     
/*      */     }
/* 1353 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1355 */       throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": getRect expected ints got: " + str);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Enum a(String paramString1, String paramString2, Enum paramEnum, Class<Object> paramClass) {
/* 1365 */     String str1 = b(paramString1, paramString2, (String)null);
/* 1366 */     if (str1 == null)
/*      */     {
/* 1368 */       return paramEnum;
/*      */     }
/*      */     
/* 1371 */     str1 = str1.trim();
/*      */     
/* 1373 */     for (Object object : paramClass.getEnumConstants()) {
/*      */       
/* 1375 */       Enum enum_ = (Enum)object;
/*      */       
/* 1377 */       if (enum_.name().equalsIgnoreCase(str1))
/*      */       {
/* 1379 */         return enum_;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1385 */     String str2 = "";
/* 1386 */     for (Object object : paramClass.getEnumConstants()) {
/*      */       
/* 1388 */       Enum enum_ = (Enum)object;
/* 1389 */       if (!str2.equals(""))
/*      */       {
/* 1391 */         str2 = str2 + ",";
/*      */       }
/*      */       
/* 1394 */       str2 = str2 + enum_.name();
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1399 */     throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": Unknown enum value: " + str1 + " (Expected: " + 
/* 1400 */         f.b(str2, 100) + ")");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static Enum a(String paramString, Enum paramEnum, Class<Object> paramClass) {
/* 1406 */     if (paramString == null)
/*      */     {
/* 1408 */       return paramEnum;
/*      */     }
/*      */     
/* 1411 */     paramString = paramString.trim();
/* 1412 */     for (Object object : paramClass.getEnumConstants()) {
/*      */       
/* 1414 */       Enum enum_ = (Enum)object;
/*      */       
/* 1416 */       if (enum_.name().equalsIgnoreCase(paramString))
/*      */       {
/* 1418 */         return enum_;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1423 */     String str = "";
/* 1424 */     for (Object object : paramClass.getEnumConstants()) {
/*      */       
/* 1426 */       Enum enum_ = (Enum)object;
/* 1427 */       if (!str.equals(""))
/*      */       {
/* 1429 */         str = str + ",";
/*      */       }
/*      */       
/* 1432 */       str = str + enum_.name();
/*      */     } 
/*      */     
/* 1435 */     throw new RuntimeException("Unknown enum value: " + paramString + " (Expected: " + 
/* 1436 */         f.b(str, 100) + ")");
/*      */   }
/*      */ 
/*      */   
/*      */   public m c(String paramString) {
/* 1441 */     m m = new m();
/*      */     
/* 1443 */     for (String str : this.i.keySet()) {
/*      */       
/* 1445 */       Map map = (Map)this.i.get(str);
/*      */       
/* 1447 */       if (map.get(paramString) != null)
/*      */       {
/* 1449 */         m.add(str);
/*      */       }
/*      */     } 
/* 1452 */     return m;
/*      */   }
/*      */ 
/*      */   
/*      */   public m d(String paramString) {
/* 1457 */     m m = new m();
/*      */     
/* 1459 */     for (String str : this.i.keySet()) {
/*      */       
/* 1461 */       Map map = (Map)this.i.get(str);
/*      */       
/* 1463 */       for (String str1 : map.keySet()) {
/*      */         
/* 1465 */         if (str1.startsWith(paramString)) {
/*      */           
/* 1467 */           if ("IGNORE".equals(map.get(str1))) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/* 1472 */           m.add(str);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1477 */     return m;
/*      */   }
/*      */ 
/*      */   
/*      */   public LinkedHashMap c() {
/* 1482 */     return this.i;
/*      */   }
/*      */ 
/*      */   
/*      */   public m j(String paramString1, String paramString2) {
/* 1487 */     m m = new m();
/*      */     
/* 1489 */     Map map = (Map)this.i.get(paramString1);
/* 1490 */     if (map != null)
/*      */     {
/* 1492 */       for (String str : map.keySet()) {
/*      */         
/* 1494 */         if (str.startsWith(paramString2)) {
/*      */           
/* 1496 */           if ("IGNORE".equals(map.get(str))) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/* 1501 */           m.add(str);
/*      */         } 
/*      */       } 
/*      */     }
/* 1505 */     return m;
/*      */   }
/*      */ 
/*      */   
/*      */   public m f(String paramString1, String paramString2, String paramString3) {
/* 1510 */     m m = new m();
/*      */     
/* 1512 */     Map map = (Map)this.i.get(paramString1);
/* 1513 */     if (map != null)
/*      */     {
/* 1515 */       for (String str : map.keySet()) {
/*      */         
/* 1517 */         if (str.startsWith(paramString2) || str.startsWith(paramString3))
/*      */         {
/* 1519 */           m.add(str);
/*      */         }
/*      */       } 
/*      */     }
/* 1523 */     return m;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean k(String paramString1, String paramString2) {
/* 1529 */     Map map = (Map)this.i.get(paramString1);
/* 1530 */     if (map != null)
/*      */     {
/* 1532 */       for (String str : map.keySet()) {
/*      */         
/* 1534 */         if (str.startsWith(paramString2))
/*      */         {
/* 1536 */           return true;
/*      */         }
/*      */       } 
/*      */     }
/* 1540 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public m e(String paramString) {
/* 1546 */     m m = new m();
/*      */     
/* 1548 */     Set set = this.i.keySet();
/*      */     
/* 1550 */     for (String str : set) {
/*      */       
/* 1552 */       if (str.startsWith(paramString))
/*      */       {
/* 1554 */         if (g(str))
/*      */         {
/*      */           
/* 1557 */           m.add(str);
/*      */         }
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1563 */     return m;
/*      */   }
/*      */ 
/*      */   
/*      */   public ArrayList l(String paramString1, String paramString2) {
/* 1568 */     ArrayList<String> arrayList = new ArrayList();
/*      */     
/* 1570 */     Set set = this.i.keySet();
/*      */     
/* 1572 */     for (String str : set) {
/*      */       
/* 1574 */       if (str.startsWith(paramString1) || str.startsWith(paramString2))
/*      */       {
/*      */         
/* 1577 */         if (g(str))
/*      */         {
/* 1579 */           arrayList.add(str);
/*      */         }
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1585 */     return arrayList;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean f(String paramString) {
/* 1590 */     if (this.i.get(paramString) != null)
/*      */     {
/* 1592 */       return true;
/*      */     }
/*      */     
/* 1595 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean g(String paramString) {
/* 1600 */     Map map = (Map)this.i.get(paramString);
/* 1601 */     if (map == null)
/*      */     {
/* 1603 */       return false;
/*      */     }
/*      */     
/* 1606 */     for (String str : map.keySet()) {
/*      */       
/* 1608 */       if (str != null && !str.startsWith("@"))
/*      */       {
/* 1610 */         return true;
/*      */       }
/*      */     } 
/*      */     
/* 1614 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean m(String paramString1, String paramString2) {
/* 1619 */     String str = a(paramString1, paramString2, true);
/* 1620 */     if (str != null)
/*      */     {
/* 1622 */       return true;
/*      */     }
/* 1624 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean g(String paramString1, String paramString2, String paramString3) {
/* 1632 */     if (paramString3.equalsIgnoreCase("true"))
/*      */     {
/* 1634 */       return true;
/*      */     }
/* 1636 */     if (paramString3.equalsIgnoreCase("false"))
/*      */     {
/* 1638 */       return false;
/*      */     }
/*      */     
/* 1641 */     throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": Unexpected boolean value:'" + paramString3 + "'");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static float h(String paramString1, String paramString2, String paramString3) {
/*      */     try {
/* 1648 */       return Float.parseFloat(paramString3);
/*      */     }
/* 1650 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1652 */       throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": Failed to read float:" + paramString3);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static int i(String paramString1, String paramString2, String paramString3) {
/*      */     try {
/* 1660 */       return Integer.parseInt(paramString3);
/*      */     }
/* 1662 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1664 */       throw new RuntimeException("[" + paramString1 + "]" + paramString2 + ": Failed to read int:" + paramString3);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */