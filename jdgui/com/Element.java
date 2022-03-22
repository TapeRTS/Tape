/*     */ package com;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Element
/*     */ {
/*     */   private long nativeHandle;
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*  31 */     if (paramObject == null || !(paramObject instanceof Element))
/*     */     {
/*  33 */       return false;
/*     */     }
/*     */     
/*  36 */     Element element = (Element)paramObject;
/*     */     
/*  38 */     if (element.nativeHandle == this.nativeHandle)
/*     */     {
/*  40 */       return true;
/*     */     }
/*     */     
/*  43 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAttribute(String paramString) {
/*  50 */     return getAttribute(paramString, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getAttributeBoolean(String paramString, boolean paramBoolean) {
/*  57 */     String str = getAttribute(paramString, null);
/*  58 */     if (str == null)
/*     */     {
/*  60 */       return paramBoolean;
/*     */     }
/*  62 */     if (str.equalsIgnoreCase("true"))
/*     */     {
/*  64 */       return true;
/*     */     }
/*  66 */     if (str.equalsIgnoreCase("false"))
/*     */     {
/*  68 */       return false;
/*     */     }
/*     */     
/*  71 */     return paramBoolean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getId() {
/*  78 */     return getAttribute("id");
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
/*     */   public void addStyle(String paramString) {
/* 103 */     String str = getAttribute("style");
/* 104 */     if (str == null)
/*     */     {
/* 106 */       str = "";
/*     */     }
/*     */     
/* 109 */     str = str + paramString;
/*     */     
/* 111 */     setAttribute("style", str);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStyle(String paramString) {
/* 116 */     setAttribute("style", paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(String paramString) {
/* 122 */     setAttribute("value", paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCheckbox(boolean paramBoolean) {
/* 129 */     if (paramBoolean) {
/*     */       
/* 131 */       setAttribute("checked", "");
/*     */     }
/*     */     else {
/*     */       
/* 135 */       setAttribute("checked", null);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getCheckbox() {
/* 144 */     String str = getAttribute("checked");
/* 145 */     if (str == null || "false".equals(str))
/*     */     {
/* 147 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 151 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValue() {
/* 159 */     return getAttribute("value");
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getValueAsInt(Integer paramInteger) {
/* 164 */     String str = getValue();
/* 165 */     if (str == null || str.equals(""))
/*     */     {
/* 167 */       return paramInteger;
/*     */     }
/* 169 */     return Integer.valueOf(Integer.parseInt(str));
/*     */   }
/*     */ 
/*     */   
/*     */   public Float getValueAsFloat(Float paramFloat) {
/* 174 */     String str = getValue();
/* 175 */     if (str == null || str.equals(""))
/*     */     {
/* 177 */       return paramFloat;
/*     */     }
/* 179 */     return Float.valueOf(Float.parseFloat(str));
/*     */   }
/*     */ 
/*     */   
/*     */   public Boolean getValueAsBoolean(Boolean paramBoolean) {
/* 184 */     String str = getValue();
/* 185 */     if (str == null || str.equals(""))
/*     */     {
/* 187 */       return paramBoolean;
/*     */     }
/* 189 */     return Boolean.valueOf(Boolean.parseBoolean(str));
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
/*     */   public static String excapeHTML(String paramString) {
/* 209 */     paramString = paramString.replace("&", "&amp;");
/* 210 */     paramString = paramString.replace("<", "&lt;");
/* 211 */     paramString = paramString.replace(">", "&gt;");
/*     */     
/* 213 */     paramString = paramString.replace("${", "$ {");
/*     */     
/* 215 */     return paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTextNoCharset(String paramString, boolean paramBoolean) {
/* 221 */     if (paramString == null)
/*     */     {
/* 223 */       paramString = "";
/*     */     }
/*     */     
/* 226 */     paramString = excapeHTML(paramString);
/*     */     
/* 228 */     if (paramBoolean && paramString.contains("\n"))
/*     */     {
/* 230 */       paramString = paramString.replaceAll("\n", "<br/>\n");
/*     */     }
/*     */     
/* 233 */     setInnerRML(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   boolean loadedChinese = false;
/*     */   
/*     */   HashSet charsetsLoaded;
/*     */ 
/*     */   
/*     */   public boolean loadCharsetIfNeededWithCurrentText() {
/* 243 */     return loadCharsetIfNeeded(getInnerRML());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean loadCharsetIfNeeded(String paramString) {
/* 248 */     String str = "";
/*     */     
/* 250 */     int i = paramString.length(); int j;
/* 251 */     for (j = 0; j < i; ) {
/* 252 */       int k = paramString.codePointAt(j);
/*     */ 
/*     */       
/* 255 */       if (k > 128) {
/*     */         
/* 257 */         boolean bool = false;
/*     */         
/* 259 */         if (k >= 196 && k <= 252)
/*     */         {
/* 261 */           bool = true;
/*     */         }
/*     */         
/* 264 */         if (!bool) {
/*     */           
/* 266 */           if (this.charsetsLoaded == null)
/*     */           {
/* 268 */             this.charsetsLoaded = new HashSet();
/*     */           }
/*     */ 
/*     */           
/* 272 */           if (!this.charsetsLoaded.contains(Integer.valueOf(k))) {
/*     */             
/* 274 */             this.charsetsLoaded.add(Integer.valueOf(k));
/*     */             
/* 276 */             if (!str.equals(""))
/*     */             {
/* 278 */               str = str + ",";
/*     */             }
/* 280 */             str = str + keycodeToHex(k);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 297 */       j += Character.charCount(k);
/*     */     } 
/*     */     
/* 300 */     if (!str.equals("")) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 312 */       compareAndAddClass("needsUnicodeFont");
/*     */ 
/*     */       
/* 315 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 319 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String keycodeToHex(int paramInt) {
/* 325 */     return String.format("U+%04X", new Object[] { Integer.valueOf(paramInt) });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void compareAndSetText(String paramString) {
/* 332 */     if (paramString == null)
/*     */     {
/* 334 */       paramString = "";
/*     */     }
/*     */     
/* 337 */     if (!paramString.equals(getInnerRML()))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 343 */       setText(paramString);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setText(String paramString) {
/* 349 */     loadCharsetIfNeeded(paramString);
/*     */     
/* 351 */     setTextNoCharset(paramString, false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTextWithNewlines(String paramString) {
/* 357 */     loadCharsetIfNeeded(paramString);
/*     */     
/* 359 */     setTextNoCharset(paramString, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addClass(String paramString) {
/* 364 */     setClassNames(getClassNames() + " " + paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public void compareAndAddClass(String paramString) {
/* 369 */     if (!hasClassName(paramString))
/*     */     {
/* 371 */       addClass(paramString);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeClass(String paramString) {
/* 377 */     String str1 = getClassNames();
/*     */     
/* 379 */     String str2 = str1.replaceAll("\\b" + paramString + "\\b", "");
/*     */     
/* 381 */     if (!str1.equals(str2))
/*     */     {
/* 383 */       setClassNames(str2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void compareAndSetClassNames(String paramString) {
/* 389 */     if (!paramString.equals(getClassNames()))
/*     */     {
/* 391 */       setClassNames(paramString);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Element cloneAndFix() {
/* 402 */     Element element = clone();
/* 403 */     element.setClassNames(getClassNames());
/* 404 */     return element;
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
/*     */   public boolean isFocused() {
/* 440 */     return isPseudoClassSet("focus");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isHovering() {
/* 446 */     return isPseudoClassSet("hover");
/*     */   }
/*     */ 
/*     */   
/*     */   public void prependChild(Element paramElement) {
/* 451 */     if (getNumChildren() == 0) {
/*     */       
/* 453 */       appendChild(paramElement);
/*     */     }
/*     */     else {
/*     */       
/* 457 */       insertBefore(paramElement, getChild(0));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void clearAllChildren() {
/* 463 */     int i = getNumChildren();
/*     */     
/* 465 */     for (int j = i; j >= 0; j--) {
/*     */       
/* 467 */       Element element = getChild(j);
/* 468 */       if (element == null)
/*     */       {
/* 470 */         throw new RuntimeException("child==null, i:" + j);
/*     */       }
/*     */       
/* 473 */       String str = element.getTagName();
/*     */       
/* 475 */       if (!str.equals("scrollbarvertical"))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 481 */         removeChild(element);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList getChildren() {
/* 489 */     ArrayList<Element> arrayList = new ArrayList();
/*     */     
/* 491 */     int i = getNumChildren();
/*     */     
/* 493 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 495 */       Element element = getChild(b);
/* 496 */       if (element == null)
/*     */       {
/* 498 */         throw new RuntimeException("child==null, i:" + b);
/*     */       }
/*     */       
/* 501 */       arrayList.add(element);
/*     */     } 
/* 503 */     return arrayList;
/*     */   }
/*     */ 
/*     */   
/*     */   public Element getTopLevelFocusedElement() {
/* 508 */     int i = getNumChildren();
/* 509 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 511 */       Element element1 = getChild(b);
/* 512 */       if (element1 == null)
/*     */       {
/* 514 */         throw new RuntimeException("child==null, i:" + b);
/*     */       }
/*     */       
/* 517 */       Element element2 = element1.getTopLevelFocusedElement();
/* 518 */       if (element2 != null)
/*     */       {
/* 520 */         return element2;
/*     */       }
/*     */     } 
/*     */     
/* 524 */     if (isFocused())
/*     */     {
/* 526 */       return this;
/*     */     }
/*     */     
/* 529 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList getChainFromChildElement(Element paramElement) {
/* 535 */     if (paramElement.equals(this)) {
/*     */       
/* 537 */       ArrayList<Element> arrayList = new ArrayList();
/* 538 */       arrayList.add(this);
/* 539 */       return arrayList;
/*     */     } 
/*     */     
/* 542 */     int i = getNumChildren();
/* 543 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 545 */       Element element = getChild(b);
/* 546 */       if (element == null)
/*     */       {
/* 548 */         throw new RuntimeException("child==null, i:" + b);
/*     */       }
/*     */       
/* 551 */       ArrayList<Element> arrayList = element.getChainFromChildElement(paramElement);
/* 552 */       if (arrayList != null) {
/*     */         
/* 554 */         arrayList.add(this);
/* 555 */         return arrayList;
/*     */       } 
/*     */     } 
/*     */     
/* 559 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ArrayList getAllNestedChildren() {
/* 564 */     ArrayList arrayList = new ArrayList();
/* 565 */     getAllNestedChildren(arrayList);
/* 566 */     return arrayList;
/*     */   }
/*     */   
/*     */   public void getAllNestedChildren(ArrayList<Element> paramArrayList) {
/* 570 */     int i = getNumChildren();
/* 571 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 573 */       Element element = getChild(b);
/* 574 */       if (element == null)
/*     */       {
/* 576 */         throw new RuntimeException("child==null, i:" + b);
/*     */       }
/*     */       
/* 579 */       paramArrayList.add(element);
/* 580 */       element.getAllNestedChildren(paramArrayList);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasClassName(String paramString) {
/* 586 */     if ((" " + getClassNames() + " ").contains(" " + paramString + " "))
/*     */     {
/* 588 */       return true;
/*     */     }
/* 590 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Element findByClassName(String paramString) {
/* 595 */     int i = getNumChildren();
/* 596 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 598 */       Element element1 = getChild(b);
/* 599 */       if (element1 == null)
/*     */       {
/* 601 */         throw new RuntimeException("child==null, i:" + b);
/*     */       }
/*     */ 
/*     */       
/* 605 */       if (element1.hasClassName(paramString))
/*     */       {
/* 607 */         return element1;
/*     */       }
/*     */       
/* 610 */       Element element2 = element1.findByClassName(paramString);
/* 611 */       if (element2 != null)
/*     */       {
/* 613 */         return element2;
/*     */       }
/*     */     } 
/* 616 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Element findByTagName(String paramString) {
/* 622 */     int i = getNumChildren();
/* 623 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 625 */       Element element1 = getChild(b);
/* 626 */       if (element1 == null)
/*     */       {
/* 628 */         throw new RuntimeException("child==null, i:" + b);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 634 */       if (element1.getTagName().equalsIgnoreCase(paramString))
/*     */       {
/* 636 */         return element1;
/*     */       }
/*     */       
/* 639 */       Element element2 = element1.findByTagName(paramString);
/* 640 */       if (element2 != null)
/*     */       {
/* 642 */         return element2;
/*     */       }
/*     */     } 
/* 645 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ArrayList findElementsByClassName(String paramString) {
/* 650 */     ArrayList arrayList = new ArrayList();
/* 651 */     findElementsByClassName(paramString, arrayList);
/* 652 */     return arrayList;
/*     */   }
/*     */ 
/*     */   
/*     */   public void findElementsByClassName(String paramString, List<Element> paramList) {
/* 657 */     int i = getNumChildren();
/* 658 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 660 */       Element element = getChild(b);
/* 661 */       if (element == null)
/*     */       {
/* 663 */         throw new RuntimeException("child==null, i:" + b);
/*     */       }
/*     */       
/* 666 */       if ((" " + element.getClassNames() + " ").contains(" " + paramString + " "))
/*     */       {
/* 668 */         paramList.add(element);
/*     */       }
/*     */       
/* 671 */       element.findElementsByClassName(paramString, paramList);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void hide() {
/* 678 */     show(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void show() {
/* 683 */     show(true);
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
/*     */   public void show(boolean paramBoolean) {
/* 707 */     if (!paramBoolean) {
/*     */       
/* 709 */       compareAndAddClass("hide");
/*     */     }
/*     */     else {
/*     */       
/* 713 */       removeClass("hide");
/*     */     } 
/*     */   }
/*     */   
/*     */   public native Element getElementById(String paramString);
/*     */   
/*     */   public native String getTagName();
/*     */   
/*     */   public native boolean focus();
/*     */   
/*     */   public native void blur();
/*     */   
/*     */   public native void click();
/*     */   
/*     */   public native void addReference();
/*     */   
/*     */   public native void removeReference();
/*     */   
/*     */   public native String getAttribute(String paramString1, String paramString2);
/*     */   
/*     */   public native void setAttribute(String paramString1, String paramString2);
/*     */   
/*     */   public native String getAttributeKey(int paramInt);
/*     */   
/*     */   public native String getAttributeValue(int paramInt);
/*     */   
/*     */   public native int getNumAttributes();
/*     */   
/*     */   public native Element getChild(int paramInt);
/*     */   
/*     */   public native int getNumChildren();
/*     */   
/*     */   public native String getInnerRML();
/*     */   
/*     */   public native void setInnerRML(String paramString);
/*     */   
/*     */   public native void setClassNames(String paramString);
/*     */   
/*     */   public native String getClassNames();
/*     */   
/*     */   public native Element clone();
/*     */   
/*     */   public native void appendChild(Element paramElement);
/*     */   
/*     */   public native void insertBefore(Element paramElement1, Element paramElement2);
/*     */   
/*     */   public native void removeChild(Element paramElement);
/*     */   
/*     */   public native String getProperty(String paramString1, String paramString2);
/*     */   
/*     */   public native void setProperty(String paramString1, String paramString2);
/*     */   
/*     */   public native boolean isPseudoClassSet(String paramString);
/*     */   
/*     */   public native float getAbsoluteLeft();
/*     */   
/*     */   public native float getAbsoluteTop();
/*     */   
/*     */   public native float getOffsetLeft();
/*     */   
/*     */   public native float getOffsetTop();
/*     */   
/*     */   public native float getOffsetWidth();
/*     */   
/*     */   public native float getOffsetHeight();
/*     */   
/*     */   public native float getScrollTop();
/*     */   
/*     */   public native void setScrollTop(float paramFloat);
/*     */   
/*     */   public native void scrollIntoView(boolean paramBoolean);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\Element.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */