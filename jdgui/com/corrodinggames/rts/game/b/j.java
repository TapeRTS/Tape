/*     */ package com.corrodinggames.rts.game.b;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Properties;
/*     */ import javax.xml.parsers.DocumentBuilder;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.Node;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class j
/*     */ {
/*     */   public e a;
/*     */   public String b;
/*     */   int c;
/*     */   int d;
/*     */   int e;
/*     */   int f;
/*  57 */   int g = 0;
/*  58 */   int h = 0;
/*     */ 
/*     */   
/*     */   int i;
/*     */ 
/*     */   
/*     */   float j;
/*     */ 
/*     */   
/*     */   public int k;
/*     */ 
/*     */   
/*  70 */   public int l = Integer.MAX_VALUE;
/*     */ 
/*     */ 
/*     */   
/*     */   public short m;
/*     */ 
/*     */ 
/*     */   
/*     */   public b n;
/*     */ 
/*     */   
/*     */   public boolean o = false;
/*     */ 
/*     */   
/*     */   public boolean p = false;
/*     */ 
/*     */   
/*     */   public boolean q = false;
/*     */ 
/*     */   
/*     */   public boolean r = false;
/*     */ 
/*     */   
/*  93 */   private HashMap w = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String a(b paramb, Element paramElement) {
/* 100 */     Element element = (Element)paramElement.getElementsByTagName("properties").item(0);
/*     */     
/* 102 */     if (element != null) {
/*     */       
/* 104 */       NodeList nodeList = element.getElementsByTagName("property");
/* 105 */       for (byte b1 = 0; b1 < nodeList.getLength(); b1++) {
/*     */         
/* 107 */         Element element1 = (Element)nodeList.item(b1);
/*     */         
/* 109 */         String str = element1.getAttribute("name");
/*     */ 
/*     */         
/* 112 */         if (str.equals("embedded_png")) {
/*     */ 
/*     */           
/* 115 */           String str1 = element1.getAttribute("value");
/* 116 */           if (str1 != null && !str1.equals(""))
/*     */           {
/* 118 */             return str1;
/*     */           }
/*     */ 
/*     */           
/* 122 */           Node node = element1.getFirstChild();
/*     */           
/* 124 */           if (node != null)
/*     */           {
/* 126 */             return node.getNodeValue();
/*     */           }
/*     */         } 
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
/* 139 */     return null;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 300 */   static String s = "[EMBED]";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 317 */   static ArrayList t = new ArrayList();
/*     */   
/*     */   Rect u;
/*     */   
/*     */   int v;
/*     */   
/*     */   public static strictfp String a(String paramString1, String paramString2) {
/* 324 */     for (k k1 : t) {
/*     */       
/* 326 */       if (paramString1.equalsIgnoreCase(k1.f))
/*     */       {
/* 328 */         return k1.d;
/*     */       }
/*     */     } 
/*     */     
/* 332 */     k k = new k();
/*     */     
/* 334 */     k.b = false;
/*     */     
/* 336 */     k.e = null;
/*     */     
/* 338 */     k.f = paramString1;
/*     */     
/* 340 */     k.c = s;
/* 341 */     k.d = s + k.a;
/*     */     
/* 343 */     k.g = paramString2;
/*     */     
/* 345 */     k.a++;
/*     */ 
/*     */ 
/*     */     
/* 349 */     t.add(k);
/*     */     
/* 351 */     return k.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp e a(String paramString) {
/*     */     InputStream inputStream;
/* 357 */     l l = l.u();
/*     */ 
/*     */     
/* 360 */     String str = "tilesets/bitmaps/";
/*     */ 
/*     */ 
/*     */     
/* 364 */     if (paramString.startsWith(s))
/*     */     {
/* 366 */       str = s;
/*     */     }
/*     */ 
/*     */     
/* 370 */     k k1 = null;
/*     */ 
/*     */     
/* 373 */     for (k k : t) {
/*     */       
/* 375 */       if (paramString.equalsIgnoreCase(k.d) && str.equalsIgnoreCase(k.c)) {
/*     */         
/* 377 */         k1 = k;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 382 */     if (k1 != null) {
/*     */ 
/*     */       
/* 385 */       if (k1.f != null) {
/*     */         e e2;
/*     */         
/* 388 */         inputStream = e.a(k1.f, "base64", "");
/* 389 */         BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 417 */         boolean bool1 = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 425 */           e2 = l.bw.a(bufferedInputStream, bool1);
/*     */         }
/* 427 */         catch (RuntimeException runtimeException) {
/*     */           
/* 429 */           runtimeException.printStackTrace();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 448 */           throw new f("Error loading embedded base64 image:" + k1.g + " - " + runtimeException.getMessage());
/*     */         } 
/*     */         
/* 451 */         if (e2 == null)
/*     */         {
/* 453 */           throw new f("Embedded tilesetBitmap is null for: " + paramString);
/*     */         }
/*     */         
/* 456 */         k1.e = e2;
/* 457 */         k1.f = null;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 462 */       k1.b = true;
/* 463 */       return k1.e;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 471 */       inputStream = l.bt.d(str, paramString);
/*     */     }
/* 473 */     catch (IOException iOException) {
/*     */       
/* 475 */       throw new f("Image file could not be found or loaded: " + str + paramString, iOException);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 480 */     boolean bool = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 489 */     e e1 = l.bw.a(inputStream, bool);
/* 490 */     if (e1 == null)
/*     */     {
/* 492 */       throw new RuntimeException("tilesetBitmap is null for: " + paramString);
/*     */     }
/* 494 */     e1.d = "tilesets/" + paramString;
/*     */     
/* 496 */     k k2 = new k();
/* 497 */     k2.b = true;
/* 498 */     k2.e = e1;
/* 499 */     k2.c = str;
/* 500 */     k2.d = paramString;
/* 501 */     t.add(k2);
/*     */     
/* 503 */     return k2.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void a() {
/* 508 */     for (k k : t)
/*     */     {
/* 510 */       k.b = false;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/* 516 */     Iterator<k> iterator = t.iterator();
/* 517 */     while (iterator.hasNext()) {
/*     */       
/* 519 */       k k = iterator.next();
/* 520 */       if (!k.b) {
/*     */         
/* 522 */         if (k.e != null) {
/*     */           
/* 524 */           k.e.n();
/* 525 */           k.e = null;
/*     */         } 
/*     */         
/* 528 */         k.f = null;
/*     */         
/* 530 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   strictfp void c() {
/* 537 */     this.a = a(this.b);
/*     */     
/* 539 */     this.i = this.a.l() / this.e;
/* 540 */     if (this.i == 0) this.i = 1;
/*     */     
/* 542 */     this.j = 1.0F / this.i;
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
/*     */   public strictfp Properties a(int paramInt) {
/* 561 */     return (Properties)this.w.get(new Integer(paramInt));
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
/*     */   public final strictfp void a(int paramInt, Rect paramRect) {
/* 578 */     int i = paramInt % this.i;
/* 579 */     int k = (int)(paramInt * this.j);
/*     */     
/* 581 */     int m = this.g + i * this.e;
/* 582 */     int n = this.h + k * this.f;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 587 */     paramRect.a = m;
/* 588 */     paramRect.b = n;
/* 589 */     paramRect.c = m + this.c;
/* 590 */     paramRect.d = n + this.d;
/*     */   }
/*     */   
/*     */   public strictfp j(b paramb, Element paramElement) {
/* 594 */     this.u = new Rect();
/* 595 */     this.v = -1; this.n = paramb; this.k = Integer.parseInt(paramElement.getAttribute("firstgid")); String str1 = paramElement.getAttribute("source"); if (str1 != null && !str1.equals("")) try { InputStream inputStream = paramb.d("tilesets/", str1); DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); Document document = documentBuilder.parse(inputStream); Element element = document.getDocumentElement(); paramElement = element; } catch (Exception exception) { l.u().a("Unable to load or parse sourced tileset: tilesets/" + str1, 1); throw new f("Unable to load or parse sourced tileset: tilesets/" + str1, exception); }   NodeList nodeList1 = paramElement.getElementsByTagName("image"); if (nodeList1.getLength() > 0) { Element element = (Element)nodeList1.item(0); String str = element.getAttribute("source"); str = str.trim(); this.b = l.j(str); }  String str2 = a(paramb, paramElement); if (str2 != null)
/*     */       this.b = a(str2, this.b);  if (this.b == null)
/*     */       throw new f("Map tileset is missing an image tag or embedded image data");  this.c = paramb.k; this.d = paramb.l; if (paramElement.hasAttribute("tilewidth")) { this.c = Integer.parseInt(paramElement.getAttribute("tilewidth")); this.d = Integer.parseInt(paramElement.getAttribute("tileheight")); }  if (l.v()) { this.c = paramb.k; this.d = paramb.l; }  int i = 0; if (paramElement.hasAttribute("spacing"))
/*     */       i = Integer.parseInt(paramElement.getAttribute("spacing"));  this.e = this.c + i; this.f = this.d + i; NodeList nodeList2 = paramElement.getElementsByTagName("tile"); for (byte b1 = 0; b1 < nodeList2.getLength(); b1++) { Element element1 = (Element)nodeList2.item(b1); int k = Integer.parseInt(element1.getAttribute("id")); k += this.k; Properties properties = new Properties(); Element element2 = (Element)element1.getElementsByTagName("properties").item(0); if (element2 != null) { NodeList nodeList = element2.getElementsByTagName("property"); for (byte b2 = 0; b2 < nodeList.getLength(); b2++) { Element element = (Element)nodeList.item(b2); String str3 = element.getAttribute("name"); String str4 = element.getAttribute("value"); if ("unit".equalsIgnoreCase(str3) || "customUnit".equalsIgnoreCase(str3))
/* 599 */             this.r = true;  properties.setProperty(str3, str4); }  }  this.w.put(new Integer(k), properties); }  } public final strictfp Rect b(int paramInt) { if (this.v == paramInt)
/*     */     {
/* 601 */       return this.u;
/*     */     }
/* 603 */     this.v = paramInt;
/*     */     
/* 605 */     a(paramInt, this.u);
/* 606 */     return this.u; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void c(int paramInt) {
/* 612 */     this.l = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean d(int paramInt) {
/* 622 */     return (paramInt >= this.k && paramInt <= this.l);
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
/*     */   public strictfp void d() {
/* 637 */     this.a = null;
/*     */     
/* 639 */     this.n = null;
/* 640 */     this.w = null;
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
/*     */   public strictfp Integer b(String paramString1, String paramString2) {
/* 654 */     for (Map.Entry entry : this.w.entrySet()) {
/*     */       
/* 656 */       Integer integer = (Integer)entry.getKey();
/* 657 */       Properties properties = (Properties)entry.getValue();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 662 */       String str = properties.getProperty(paramString1);
/*     */       
/* 664 */       if (str != null)
/*     */       {
/* 666 */         if (str.equals(paramString2))
/*     */         {
/* 668 */           return integer;
/*     */         }
/*     */       }
/*     */     } 
/*     */     
/* 673 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\b\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */