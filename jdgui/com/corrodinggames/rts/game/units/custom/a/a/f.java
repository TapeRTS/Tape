/*     */ package com.corrodinggames.rts.game.units.custom.a.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.a.a;
/*     */ import com.corrodinggames.rts.game.units.custom.a.c;
/*     */ import com.corrodinggames.rts.game.units.custom.ac;
/*     */ import com.corrodinggames.rts.game.units.custom.ag;
/*     */ import com.corrodinggames.rts.game.units.custom.d.a;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.g.ad;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
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
/*     */ public class f
/*     */   extends a
/*     */ {
/*     */   ag a;
/*     */   ag b;
/*     */   ag c;
/*     */   ag d;
/*     */   ag e;
/*     */   String f;
/*     */   
/*     */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/*  42 */     ag ag1 = ac.a(paramab, paramString1, "showMessageToPlayer", null);
/*  43 */     ag ag2 = ac.a(paramab, paramString1, "showMessageToAllPlayers", null);
/*  44 */     ag ag3 = ac.a(paramab, paramString1, "showMessageToAllEnemyPlayers", null);
/*     */ 
/*     */ 
/*     */     
/*  48 */     ag ag4 = ac.a(paramab, paramString1, "showQuickWarLogToPlayer", null);
/*  49 */     ag ag5 = ac.a(paramab, paramString1, "showQuickWarLogToAllPlayers", null);
/*     */     
/*  51 */     String str = paramab.b(paramString1, "debugMessage", null);
/*     */     
/*  53 */     if (ag1 != null || ag2 != null || ag3 != null || ag4 != null || ag5 != null || str != null) {
/*     */ 
/*     */       
/*  56 */       f f1 = new f();
/*  57 */       f1.a = ag1;
/*  58 */       f1.b = ag2;
/*  59 */       f1.c = ag3;
/*     */ 
/*     */       
/*  62 */       f1.d = ag4;
/*  63 */       f1.e = ag5;
/*     */       
/*  65 */       f1.f = str;
/*     */       
/*  67 */       paramc.W.add(f1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  77 */   static final Pattern g = Pattern.compile("%\\{([^\\]]*?)\\}");
/*     */ 
/*     */   
/*     */   public static String a(k paramk, String paramString) {
/*  81 */     if (!paramString.contains("%{"))
/*     */     {
/*  83 */       return paramString;
/*     */     }
/*     */     
/*  86 */     byte b = 0;
/*  87 */     StringBuffer stringBuffer = new StringBuffer();
/*     */     
/*  89 */     Matcher matcher = g.matcher(paramString);
/*  90 */     while (matcher.find()) {
/*     */       
/*  92 */       b++;
/*  93 */       if (b > 100) {
/*     */         
/*  95 */         l.b("convertInlineBlocks: Too many loops while parsing: " + paramString);
/*  96 */         return paramString;
/*     */       } 
/*     */       
/*  99 */       String str1 = matcher.group(1);
/*     */       
/* 101 */       String str2 = null;
/*     */       
/* 103 */       str1 = str1.trim();
/* 104 */       if (str1.equals("self.id"))
/*     */       {
/* 106 */         str2 = "" + paramk.dA;
/*     */       }
/* 108 */       if (str1.equals("self.playerName"))
/*     */       {
/* 110 */         str2 = "" + paramk.bB.q;
/*     */       }
/* 112 */       if (str1.equals("self.teamName"))
/*     */       {
/* 114 */         str2 = "" + paramk.bB.f();
/*     */       }
/* 116 */       if (str1.equals("self.kills"))
/*     */       {
/* 118 */         str2 = "" + paramk.cw;
/*     */       }
/*     */       
/* 121 */       if (str1.startsWith("self.resource.")) {
/*     */         
/* 123 */         String str = str1.substring("self.resource.".length());
/*     */         
/* 125 */         a a1 = paramk.da().h(str);
/* 126 */         if (a1 == null) {
/*     */           
/* 128 */           str2 = "[Undefined resource: " + a1 + "]";
/*     */         }
/*     */         else {
/*     */           
/* 132 */           str2 = com.corrodinggames.rts.gameFramework.f.c(a1.a((af)paramk));
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 137 */       if (str2 == null)
/*     */       {
/* 139 */         str2 = "[Unknown key: " + str1 + "]";
/*     */       }
/*     */       
/* 142 */       matcher.appendReplacement(stringBuffer, str2);
/*     */     } 
/* 144 */     matcher.appendTail(stringBuffer);
/*     */     
/* 146 */     return stringBuffer.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public String b(k paramk, String paramString) {
/* 151 */     if (paramString == null)
/*     */     {
/* 153 */       paramString = null;
/*     */     }
/*     */     
/* 156 */     paramString = a(paramk, paramString);
/*     */     
/* 158 */     return paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/* 164 */     l l = l.u();
/*     */     
/* 166 */     if (this.a != null)
/*     */     {
/* 168 */       if (paramk.bB == l.bb)
/*     */       {
/* 170 */         ad.a(null, b(paramk, this.a.b()));
/*     */       }
/*     */     }
/*     */     
/* 174 */     if (this.b != null)
/*     */     {
/* 176 */       ad.a(null, b(paramk, this.b.b()));
/*     */     }
/*     */     
/* 179 */     if (this.c != null)
/*     */     {
/* 181 */       if (l.bb != null && paramk.bB.c(l.bb))
/*     */       {
/* 183 */         ad.a(null, b(paramk, this.c.b()));
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 189 */     if (this.d != null)
/*     */     {
/* 191 */       if (paramk.bB == l.bb)
/*     */       {
/* 193 */         l.bA.f.a(b(paramk, this.d.b()));
/*     */       }
/*     */     }
/*     */     
/* 197 */     if (this.e != null)
/*     */     {
/* 199 */       l.bA.f.a(b(paramk, this.e.b()));
/*     */     }
/*     */     
/* 202 */     if (this.f != null)
/*     */     {
/* 204 */       if (l.be && l.aV) {
/*     */         
/* 206 */         String str = paramk.da().i() + "(" + paramk.dA + ") Debug: " + b(paramk, this.f);
/* 207 */         ad.a(null, str);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 212 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */