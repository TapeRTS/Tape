/*    */ package com.corrodinggames.rts.game.b;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Properties;
/*    */ import org.w3c.dom.Element;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class i
/*    */ {
/*    */   public int a;
/*    */   public String b;
/*    */   public ArrayList c;
/*    */   public int d;
/*    */   public int e;
/*    */   public Properties f;
/*    */   
/*    */   public strictfp a a(String paramString) {
/* 33 */     if (this.c != null)
/*    */     {
/* 35 */       for (a a : this.c) {
/*    */         
/* 37 */         if (paramString.equalsIgnoreCase(a.b))
/*    */         {
/* 39 */           return a;
/*    */         }
/*    */       } 
/*    */     }
/* 43 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp i(Element paramElement, b paramb) {
/* 55 */     this.b = paramElement.getAttribute("name");
/*    */     
/* 57 */     if (paramElement.hasAttribute("width"))
/*    */     {
/* 59 */       this.d = Integer.parseInt(paramElement.getAttribute("width"));
/*    */     }
/*    */     
/* 62 */     if (paramElement.hasAttribute("height"))
/*    */     {
/* 64 */       this.e = Integer.parseInt(paramElement.getAttribute("height"));
/*    */     }
/*    */     
/* 67 */     this.c = new ArrayList();
/*    */ 
/*    */ 
/*    */     
/* 71 */     Element element = (Element)paramElement.getElementsByTagName("properties").item(0);
/* 72 */     if (element != null) {
/*    */       
/* 74 */       NodeList nodeList1 = element.getElementsByTagName("property");
/* 75 */       if (nodeList1 != null) {
/* 76 */         this.f = new Properties();
/* 77 */         for (byte b2 = 0; b2 < nodeList1.getLength(); b2++) {
/* 78 */           Element element1 = (Element)nodeList1.item(b2);
/*    */           
/* 80 */           String str1 = element1.getAttribute("name");
/* 81 */           String str2 = element1.getAttribute("value");
/* 82 */           this.f.setProperty(str1, str2);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 87 */     NodeList nodeList = paramElement.getElementsByTagName("object");
/* 88 */     for (byte b1 = 0; b1 < nodeList.getLength(); b1++) {
/* 89 */       Element element1 = (Element)nodeList.item(b1);
/* 90 */       a a = new a(element1, paramb, this);
/* 91 */       a.a = b1;
/* 92 */       this.c.add(a);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\b\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */