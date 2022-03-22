/*     */ package com.corrodinggames.rts.game.b;
/*     */ 
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.ag;
/*     */ import com.corrodinggames.rts.game.units.custom.ah;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ad;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import com.corrodinggames.rts.gameFramework.utility.x;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Locale;
/*     */ import java.util.Properties;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.NodeList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   public int a;
/*     */   public String b;
/*     */   public String c;
/*     */   public String d;
/*     */   public float e;
/*     */   public float f;
/*     */   public float g;
/*     */   public float h;
/*     */   public float i;
/*     */   private String p;
/*     */   public RectF j;
/*  60 */   public int k = -1;
/*     */   
/*     */   public j l;
/*  63 */   public int m = -1;
/*     */ 
/*     */   
/*     */   public Properties n;
/*     */ 
/*     */   
/*  69 */   public m o = new m();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a(Element paramElement, b paramb, i parami) {
/*  80 */     this.b = paramElement.getAttribute("name");
/*  81 */     if (this.b != null)
/*     */     {
/*  83 */       this.c = this.b.trim().toLowerCase(Locale.ENGLISH);
/*     */     }
/*     */     
/*  86 */     this.d = paramElement.getAttribute("type");
/*  87 */     this.e = Float.parseFloat(paramElement.getAttribute("x"));
/*  88 */     this.f = Float.parseFloat(paramElement.getAttribute("y"));
/*     */     
/*  90 */     if (paramElement.hasAttribute("rotation"))
/*     */     {
/*  92 */       this.i = Float.parseFloat(paramElement.getAttribute("rotation")) - 90.0F;
/*     */     }
/*     */     
/*  95 */     if (!paramElement.getAttribute("width").equals(""))
/*     */     {
/*  97 */       this.g = Float.parseFloat(paramElement.getAttribute("width"));
/*     */     }
/*  99 */     if (!paramElement.getAttribute("height").equals(""))
/*     */     {
/* 101 */       this.h = Float.parseFloat(paramElement.getAttribute("height"));
/*     */     }
/*     */ 
/*     */     
/* 105 */     Element element1 = (Element)paramElement.getElementsByTagName("image").item(0);
/* 106 */     if (element1 != null) {
/* 107 */       this.p = element1.getAttribute("source");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 112 */     Element element2 = (Element)paramElement.getElementsByTagName("properties").item(0);
/* 113 */     if (element2 != null) {
/*     */       
/* 115 */       NodeList nodeList = element2.getElementsByTagName("property");
/* 116 */       if (nodeList != null) {
/* 117 */         this.n = new Properties();
/* 118 */         for (byte b1 = 0; b1 < nodeList.getLength(); b1++) {
/* 119 */           Element element = (Element)nodeList.item(b1);
/*     */           
/* 121 */           String str1 = element.getAttribute("name");
/*     */           
/* 123 */           String str2 = "";
/* 124 */           if (element.hasAttribute("value")) {
/*     */             
/* 126 */             str2 = element.getAttribute("value");
/*     */           
/*     */           }
/*     */           else {
/*     */             
/* 131 */             str2 = element.getTextContent();
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 137 */           this.n.setProperty(str1, str2);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 143 */     if (paramElement.hasAttribute("gid")) {
/*     */       
/* 145 */       this.k = Integer.parseInt(paramElement.getAttribute("gid"));
/*     */ 
/*     */       
/* 148 */       this.l = paramb.a(this.k);
/*     */       
/* 150 */       if (this.l != null) {
/*     */         
/* 152 */         this.l.o = true;
/*     */ 
/*     */ 
/*     */         
/* 156 */         this.l.q = true;
/*     */ 
/*     */         
/* 159 */         this.m = this.k - this.l.k;
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */ 
/*     */         
/* 168 */         throw new RuntimeException("Unable to decode base 64 block, could not find tileId:" + this.k);
/*     */       } 
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
/* 188 */     Properties properties = this.n;
/*     */     
/* 190 */     this.j = new RectF(this.e, this.f, this.e + this.g, this.f + this.h);
/* 191 */     paramb.a(this.j);
/*     */ 
/*     */     
/* 194 */     this.e = this.j.a;
/* 195 */     this.f = this.j.b;
/* 196 */     this.g = this.j.b();
/* 197 */     this.h = this.j.c();
/*     */     
/* 199 */     float f1 = this.j.d();
/* 200 */     float f2 = this.j.e();
/*     */     
/* 202 */     String str = paramElement.getAttribute("type");
/* 203 */     if (str != null && !str.equals(""))
/*     */     {
/* 205 */       if (!str.equals("unit") && !str.equals("comment"))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 211 */         if (!parami.b.equalsIgnoreCase("triggers"))
/*     */         {
/* 213 */           d("Triggers should be on triggers layer");
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 218 */     if (properties != null) {
/*     */ 
/*     */ 
/*     */       
/* 222 */       String str1 = properties.getProperty("unit");
/* 223 */       String str2 = properties.getProperty("customUnit");
/*     */ 
/*     */       
/* 226 */       if (str1 != null || str2 != null) {
/*     */         af af;
/*     */ 
/*     */ 
/*     */         
/* 231 */         String str3 = properties.getProperty("team");
/* 232 */         m m1 = null;
/*     */         
/* 234 */         if (str3 == null)
/*     */         {
/* 236 */           throw new f("Unit object team missing for:" + ((str1 != null) ? str1 : str2));
/*     */         }
/* 238 */         if ("none".equalsIgnoreCase(str3)) {
/*     */           
/* 240 */           m1 = m.n(-1);
/*     */         } else {
/*     */           int k;
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           try {
/* 248 */             k = Integer.valueOf(str3).intValue();
/*     */           }
/* 250 */           catch (NumberFormatException numberFormatException) {
/*     */             
/* 252 */             throw new f("Unit object team invalid: " + numberFormatException.getMessage(), numberFormatException);
/*     */           } 
/*     */           
/* 255 */           m1 = m.n(k);
/* 256 */           if (m1 == null) {
/*     */             
/* 258 */             l.b("map", "Unit object without team:" + str1 + " (skipping unit)");
/*     */             
/*     */             return;
/*     */           } 
/* 262 */           if (m1.b()) {
/*     */             
/* 264 */             l.b("map", "Unit team is marked as spectator:" + str1 + " (skipping unit)");
/*     */ 
/*     */             
/*     */             return;
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 272 */         if (str2 != null) {
/*     */ 
/*     */           
/* 275 */           l l = l.l(str2);
/* 276 */           if (l == null)
/*     */           {
/* 278 */             throw new f("Could not find custom unit of:" + str2 + " at x:" + this.e + ", y:" + this.f);
/*     */           }
/*     */           
/* 281 */           al al = l.c((al)l);
/* 282 */           if (al != null)
/*     */           {
/* 284 */             if (al instanceof l) {
/*     */               
/* 286 */               l = (l)al;
/*     */             }
/*     */             else {
/*     */               
/* 290 */               l.b("replacement not a custom unit:" + al.i());
/*     */             } 
/*     */           }
/*     */           
/* 294 */           k k = l.a(false, l);
/* 295 */           if (k == null)
/*     */           {
/* 297 */             throw new RuntimeException("Metadata unit is null for:" + str2);
/*     */           
/*     */           }
/*     */         }
/*     */         else {
/*     */           
/* 303 */           af = null;
/* 304 */           al al = ak.a(str1);
/* 305 */           if (al != null) {
/*     */             
/* 307 */             af = al.a();
/*     */           
/*     */           }
/*     */           else {
/*     */             
/* 312 */             throw new f("Could not find unit type of:" + str1 + " at x:" + this.e + ", y:" + this.f);
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 318 */         af.dH = f1;
/* 319 */         af.dI = f2;
/*     */ 
/*     */         
/* 322 */         if (!af.bw())
/*     */         {
/*     */           
/* 325 */           af.h(this.i);
/*     */         }
/*     */         
/* 328 */         if (m1 != null) {
/*     */           
/* 330 */           af.a(m1);
/*     */         }
/*     */         else {
/*     */           
/* 334 */           throw new f("team is null:" + str1);
/*     */         } 
/*     */ 
/*     */         
/* 338 */         if (properties.getProperty("type") != null)
/*     */         {
/* 340 */           af.a_(properties.getProperty("type"));
/*     */         }
/*     */         
/* 343 */         if (properties.getProperty("randomRotate") != null)
/*     */         {
/* 345 */           if (!af.bw())
/*     */           {
/* 347 */             af.h(f.a(af, -180, 180));
/*     */           }
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 354 */         af.bt = ("builder".equalsIgnoreCase(str1) || "builder".equalsIgnoreCase(str2));
/* 355 */         af.bu = ("commandCenter".equalsIgnoreCase(str1) || "commandCenter".equalsIgnoreCase(str2));
/*     */ 
/*     */         
/* 358 */         af.br = true;
/* 359 */         af.n();
/*     */ 
/*     */         
/* 362 */         m.c(af);
/*     */         
/* 364 */         w.dq();
/*     */       } 
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
/*     */   public boolean a(af paramaf) {
/* 380 */     return this.j.b((int)paramaf.dH, (int)paramaf.dI);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String paramString) {
/* 427 */     if (!this.o.contains(paramString))
/*     */     {
/* 429 */       this.o.add(paramString);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String[] a() {
/* 435 */     if (this.n == null)
/*     */     {
/* 437 */       return x.h;
/*     */     }
/*     */     
/* 440 */     m m1 = new m();
/*     */     
/* 442 */     Enumeration<?> enumeration = this.n.propertyNames();
/* 443 */     while (enumeration.hasMoreElements()) {
/*     */       
/* 445 */       String str = (String)enumeration.nextElement();
/*     */       
/* 447 */       if (!this.o.contains(str))
/*     */       {
/* 449 */         m1.add(str);
/*     */       }
/*     */     } 
/*     */     
/* 453 */     return (String[])m1.toArray((Object[])x.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public String b(String paramString) {
/* 458 */     a(paramString);
/*     */     
/* 460 */     if (this.n == null)
/*     */     {
/* 462 */       return null;
/*     */     }
/*     */     
/* 465 */     return this.n.getProperty(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(String paramString1, String paramString2) {
/* 470 */     a(paramString1);
/*     */     
/* 472 */     if (this.n == null)
/*     */     {
/* 474 */       return null;
/*     */     }
/*     */     
/* 477 */     return this.n.getProperty(paramString1, paramString2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer c(String paramString) {
/* 488 */     String str = a(paramString, (String)null);
/* 489 */     if (str == null)
/*     */     {
/* 491 */       return null;
/*     */     }
/*     */     
/*     */     try {
/* 495 */       return Integer.valueOf(Integer.parseInt(str));
/*     */     }
/* 497 */     catch (NumberFormatException numberFormatException) {
/*     */       
/* 499 */       throw new f(paramString + ": Unexpected integer value:'" + str + "'");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ag a(String paramString, ag paramag) {
/* 508 */     String str1 = a(paramString, (String)null);
/* 509 */     if (str1 == null)
/*     */     {
/* 511 */       return paramag;
/*     */     }
/*     */     
/* 514 */     ArrayList<ah> arrayList = new ArrayList();
/*     */     
/* 516 */     ah ah = new ah(null, str1);
/* 517 */     arrayList.add(ah);
/*     */     
/* 519 */     String str2 = paramString + "_";
/*     */ 
/*     */ 
/*     */     
/* 523 */     m m1 = new m();
/*     */     
/* 525 */     for (String str : this.n.keySet()) {
/*     */       
/* 527 */       if (str instanceof String) {
/*     */         
/* 529 */         String str3 = str;
/* 530 */         if (str3.startsWith(str2))
/*     */         {
/* 532 */           m1.add(str3);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 537 */     for (String str3 : m1) {
/*     */       
/* 539 */       String str4 = str3.substring(str2.length());
/* 540 */       str4 = str4.toLowerCase(Locale.ROOT);
/*     */ 
/*     */ 
/*     */       
/* 544 */       String str5 = b(str3);
/*     */ 
/*     */ 
/*     */       
/* 548 */       ah ah1 = new ah(str4, str5);
/* 549 */       arrayList.add(ah1);
/*     */     } 
/*     */ 
/*     */     
/* 553 */     ah[] arrayOfAh = arrayList.<ah>toArray(new ah[0]);
/*     */     
/* 555 */     ag ag1 = new ag(arrayOfAh);
/*     */     
/* 557 */     ag1.b();
/*     */     
/* 559 */     return ag1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(String paramString) {
/* 564 */     ad.f("(Map trigger: " + this.b + ", type:" + this.d + "): " + paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 570 */     return "(Map trigger: " + this.b + ", type:" + this.d + ")";
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\b\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */