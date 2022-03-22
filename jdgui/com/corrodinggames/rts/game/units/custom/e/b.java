/*     */ package com.corrodinggames.rts.game.units.custom.e;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import java.util.regex.Matcher;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   public e a;
/*     */   public e b;
/*     */   
/*     */   public b() {
/*  36 */     this.a = new e();
/*  37 */     this.b = new e();
/*     */   }
/*     */ 
/*     */   
/*     */   public b(e parame1, e parame2) {
/*  42 */     this.a = parame1;
/*  43 */     this.b = parame2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  48 */     this.a.a();
/*  49 */     this.b.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public b b() {
/*  59 */     return new b(this.a, new e());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double a(String paramString) {
/*  67 */     return (new b$1(paramString))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 144 */       .b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(String paramString) {
/* 149 */     if (paramString.contains("*")) return true; 
/* 150 */     if (paramString.contains("/")) return true; 
/* 151 */     if (paramString.contains("+")) return true; 
/* 152 */     if (paramString.contains("-")) return true; 
/* 153 */     if (paramString.contains("(")) return true; 
/* 154 */     if (paramString.contains(")")) return true; 
/* 155 */     if (paramString.contains("^")) return true; 
/* 156 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a(l paraml, ab paramab, String paramString1, String paramString2) {
/* 164 */     paramString2 = paramString2.trim();
/*     */ 
/*     */     
/* 167 */     boolean bool = b(paramString2);
/*     */     
/* 169 */     byte b1 = 0;
/*     */ 
/*     */     
/* 172 */     StringBuffer stringBuffer = new StringBuffer();
/*     */     
/* 174 */     Matcher matcher = a.b.matcher(paramString2);
/* 175 */     while (matcher.find()) {
/*     */       
/* 177 */       b1++;
/* 178 */       if (b1 > 100)
/*     */       {
/* 180 */         throw new at("Too many loops while parsing");
/*     */       }
/*     */       
/* 183 */       String str1 = matcher.group(0);
/*     */ 
/*     */ 
/*     */       
/* 187 */       if (f.q(str1)) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 195 */       if (str1.equals("int") || str1.equals("cos") || str1.equals("sin") || str1.equals("sqrt")) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 202 */       String str2 = b(paraml, paramab, paramString1, str1);
/*     */ 
/*     */       
/* 205 */       if (bool)
/*     */       {
/* 207 */         if (!f.q(str2))
/*     */         {
/* 209 */           throw new at("Cannot do maths on '" + str2 + "' from " + str1 + " (not a number)");
/*     */         }
/*     */       }
/*     */ 
/*     */       
/* 214 */       matcher.appendReplacement(stringBuffer, str2);
/*     */     } 
/*     */     
/* 217 */     matcher.appendTail(stringBuffer);
/* 218 */     paramString2 = stringBuffer.toString();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 224 */     if (bool)
/*     */     {
/* 226 */       paramString2 = f.b(a(paramString2));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 231 */     return paramString2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b(l paraml, ab paramab, String paramString1, String paramString2) {
/* 238 */     if (paramString2.contains(".")) {
/*     */       
/* 240 */       String[] arrayOfString = f.b(paramString2, '.');
/* 241 */       if (arrayOfString.length != 2)
/*     */       {
/* 243 */         throw new at("Unexpected key format: " + paramString2);
/*     */       }
/* 245 */       String str1 = arrayOfString[0];
/* 246 */       String str2 = arrayOfString[1];
/*     */       
/* 248 */       if (str1.equals("section"))
/*     */       {
/* 250 */         str1 = paramString1;
/*     */       }
/*     */       
/* 253 */       String str3 = paramab.b(str1, str2, null);
/* 254 */       if (str3 == null)
/*     */       {
/* 256 */         throw new at("Could not find: [" + str1 + "]" + str2 + " in this conf file");
/*     */       }
/*     */       
/* 259 */       if (str3.contains("${"))
/*     */       {
/* 261 */         throw new at("Reference [" + str1 + "]" + str2 + " is dynamic, chaining is not yet supported");
/*     */       }
/*     */       
/* 264 */       return str3;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 269 */     String str = this.b.a(paramString2);
/* 270 */     if (str != null)
/*     */     {
/* 272 */       return str;
/*     */     }
/*     */     
/* 275 */     str = this.a.a(paramString2);
/* 276 */     if (str != null)
/*     */     {
/* 278 */       return str;
/*     */     }
/*     */     
/* 281 */     throw new at("Could not find variable with name: " + paramString2);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\e\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */