/*      */ package com.corrodinggames.librocket;
/*      */ 
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import com.Element;
/*      */ import com.ElementDocument;
/*      */ import com.LibRocket;
/*      */ import com.corrodinggames.librocket.scripts.ScriptEngine;
/*      */ import com.corrodinggames.rts.game.units.ak;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.gameFramework.bl;
/*      */ import com.corrodinggames.rts.gameFramework.c.a;
/*      */ import com.corrodinggames.rts.gameFramework.e.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.j;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import java.io.File;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashMap;
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
/*      */ public abstract class b
/*      */   extends LibRocket
/*      */ {
/*   34 */   public static bl a = new bl("LoadResources");
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   39 */   public static String b = "";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   47 */   public ScriptEngine c = ScriptEngine.createScriptEngine(this);
/*      */ 
/*      */   
/*   50 */   protected int d = 0;
/*      */ 
/*      */   
/*      */   public void a() {
/*   54 */     this.d = 0;
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
/*      */   public static String a(String paramString) {
/*   71 */     l.d("convertTexturePath for: " + paramString);
/*      */     
/*   73 */     paramString = f.n(paramString);
/*      */ 
/*      */     
/*   76 */     if (paramString.startsWith("base:"))
/*      */     {
/*   78 */       return b + paramString.substring("base:".length());
/*      */     }
/*   80 */     if (paramString.startsWith("drawable:"))
/*      */     {
/*   82 */       return b + "res/drawable/" + paramString.substring("drawable:".length());
/*      */     }
/*   84 */     if (paramString.startsWith("assets:")) {
/*      */ 
/*      */       
/*   87 */       String str1 = paramString.substring("assets:".length());
/*      */       
/*   89 */       String str2 = a.c(str1);
/*      */       
/*   91 */       l.d("convertTexturePath: " + str1 + " > " + str2);
/*      */ 
/*      */ 
/*      */       
/*   95 */       return b + str2;
/*      */     } 
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
/*  108 */     if (paramString.startsWith(b + "assets/gui/")) {
/*      */       
/*  110 */       l.d("convertTexturePath already had path:" + paramString);
/*  111 */       return paramString;
/*      */     } 
/*      */     
/*  114 */     return b + "assets/gui/" + paramString;
/*      */   }
/*      */ 
/*      */   
/*      */   public Matcher a(String paramString1, String paramString2) {
/*  119 */     Pattern pattern = Pattern.compile(paramString1);
/*  120 */     Matcher matcher = pattern.matcher(paramString2);
/*  121 */     if (matcher.matches())
/*      */     {
/*  123 */       return matcher;
/*      */     }
/*  125 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void ReleaseTexture(int paramInt) {
/*  132 */     removeTextureHolder(paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean LoadTexture(int paramInt, String paramString) {
/*  141 */     a.a();
/*      */     
/*  143 */     c c = (c)findTextureHolder(paramInt);
/*      */     
/*  145 */     boolean bool1 = false;
/*  146 */     boolean bool2 = false;
/*  147 */     boolean bool3 = false;
/*      */     
/*  149 */     al al = null;
/*      */ 
/*      */ 
/*      */     
/*  153 */     if (paramString.startsWith("lazy:")) {
/*      */       
/*  155 */       paramString = paramString.substring("lazy:".length());
/*  156 */       bool1 = true;
/*      */     } 
/*      */     
/*  159 */     if (paramString.startsWith("nocolor:")) {
/*      */       
/*  161 */       paramString = paramString.substring("nocolor:".length());
/*  162 */       bool2 = true;
/*      */     } 
/*      */     
/*  165 */     if (paramString.startsWith("unit:")) {
/*      */       
/*  167 */       paramString = paramString.substring("unit:".length());
/*      */ 
/*      */       
/*  170 */       al = ak.a(paramString);
/*      */       
/*  172 */       bool1 = true;
/*      */     } 
/*      */     
/*  175 */     if (paramString.startsWith("thumbnail:")) {
/*      */       
/*  177 */       paramString = paramString.substring("thumbnail:".length());
/*  178 */       bool3 = true;
/*      */     } 
/*      */     
/*  181 */     Matcher matcher = a("^(alpha\\((.*)\\):).*", paramString);
/*  182 */     if (matcher != null) {
/*      */       
/*  184 */       String str1 = matcher.group(1);
/*  185 */       String str2 = matcher.group(2);
/*      */       
/*  187 */       l.d("alpha=" + str2);
/*      */       
/*  189 */       c.e = Float.parseFloat(str2);
/*      */       
/*  191 */       paramString = paramString.substring(str1.length());
/*      */     } 
/*      */ 
/*      */     
/*  195 */     String str = a(paramString);
/*      */     
/*  197 */     c.b = bool1;
/*  198 */     c.c = bool3;
/*  199 */     c.d = bool2;
/*      */     
/*  201 */     c.f = al;
/*      */     
/*  203 */     c.a = str;
/*      */     
/*  205 */     if (!bool1)
/*      */     {
/*  207 */       if (!c.a()) {
/*      */         
/*  209 */         a.b();
/*  210 */         return false;
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  215 */     a.b();
/*      */     
/*  217 */     return true;
/*      */   }
/*      */   
/*  220 */   protected Rect e = new Rect();
/*  221 */   protected RectF f = new RectF();
/*      */ 
/*      */   
/*      */   protected boolean g = false;
/*      */ 
/*      */   
/*      */   private d i;
/*      */ 
/*      */   
/*      */   private d j;
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract void EnableScissorRegion(boolean paramBoolean);
/*      */ 
/*      */   
/*      */   public void SetScissorRegion(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  238 */     this.e.a(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
/*  239 */     this.f.a(paramInt1, paramInt2, (paramInt1 + paramInt3), (paramInt2 + paramInt4));
/*      */ 
/*      */     
/*  242 */     EnableScissorRegion(true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b() {
/*  251 */     if (getActiveDocument() != null)
/*      */     {
/*  253 */       return false;
/*      */     }
/*  255 */     if (this.j != null)
/*      */     {
/*  257 */       return false;
/*      */     }
/*  259 */     if (this.i != null)
/*      */     {
/*  261 */       return false;
/*      */     }
/*      */     
/*  264 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void HandleEvent(String paramString) {
/*  270 */     this.c.processScript(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Object b(String paramString) {
/*  276 */     HashMap hashMap = getActiveDocumentMetadata();
/*      */     
/*  278 */     if (hashMap == null)
/*      */     {
/*  280 */       return null;
/*      */     }
/*      */     
/*  283 */     return hashMap.get(paramString);
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
/*      */   public void newDocumentLoaded(ElementDocument paramElementDocument) {
/*  313 */     this.c.getRootNoCheck().convertTextOnPage();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void newDocumentShown(ElementDocument paramElementDocument) {
/*  324 */     if (this.j != null)
/*      */     {
/*  326 */       this.j.a.pullToFront();
/*      */     }
/*      */     
/*  329 */     if (this.i != null)
/*      */     {
/*  331 */       this.i.a.pullToFront();
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
/*      */   public ElementDocument c() {
/*  354 */     if (this.j != null)
/*      */     {
/*  356 */       return this.j.a;
/*      */     }
/*  358 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public ElementDocument d() {
/*  363 */     if (this.i != null)
/*      */     {
/*  365 */       return this.i.a;
/*      */     }
/*  367 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public ElementDocument e() {
/*  372 */     ElementDocument elementDocument = d();
/*  373 */     if (elementDocument != null)
/*      */     {
/*  375 */       return elementDocument;
/*      */     }
/*  377 */     return c();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ElementDocument f() {
/*  384 */     ElementDocument elementDocument = c();
/*  385 */     if (elementDocument != null)
/*      */     {
/*  387 */       return elementDocument;
/*      */     }
/*      */ 
/*      */     
/*  391 */     elementDocument = getActiveDocument();
/*      */     
/*  393 */     return elementDocument;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ElementDocument g() {
/*  401 */     ElementDocument elementDocument = d();
/*  402 */     if (elementDocument != null)
/*      */     {
/*  404 */       return elementDocument;
/*      */     }
/*      */     
/*  407 */     elementDocument = c();
/*  408 */     if (elementDocument != null)
/*      */     {
/*  410 */       return elementDocument;
/*      */     }
/*      */     
/*  413 */     elementDocument = getActiveDocument();
/*  414 */     return elementDocument;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(String paramString) {
/*  424 */     d d1 = new d();
/*  425 */     d1.b = null;
/*  426 */     d1.c = paramString;
/*  427 */     a(d1);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(String paramString1, String paramString2) {
/*  433 */     d d1 = new d();
/*  434 */     d1.b = paramString1;
/*  435 */     d1.c = paramString2;
/*  436 */     a(d1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
/*  443 */     d d1 = new d();
/*  444 */     d1.b = paramString1;
/*  445 */     d1.c = paramString2;
/*  446 */     d1.d = paramString3;
/*  447 */     d1.e = paramString4;
/*  448 */     d1.f = paramString5;
/*  449 */     a(d1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString1, String paramString2, String paramString3, e parame1, e parame2) {
/*  456 */     d d1 = new d();
/*  457 */     d1.b = paramString1;
/*  458 */     d1.c = paramString2;
/*  459 */     d1.d = paramString3;
/*  460 */     d1.e = parame1;
/*  461 */     d1.f = parame2;
/*  462 */     a(d1);
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
/*      */   public ElementDocument a(String paramString1, String paramString2, String paramString3, Object paramObject1, Object paramObject2, boolean paramBoolean1, boolean paramBoolean2) {
/*  482 */     d d1 = new d();
/*  483 */     d1.b = paramString1;
/*  484 */     d1.c = paramString2;
/*  485 */     d1.d = paramString3;
/*  486 */     d1.e = paramObject1;
/*  487 */     d1.f = paramObject2;
/*  488 */     d1.g = paramBoolean1;
/*  489 */     d1.h = paramBoolean2;
/*  490 */     return a(d1);
/*      */   }
/*      */ 
/*      */   
/*      */   public ElementDocument a(d paramd) {
/*  495 */     ScriptEngine.checkThreadAccess();
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
/*  506 */     ElementDocument elementDocument = createPopup("messagebox.rml", null);
/*      */     
/*  508 */     HashMap hashMap = elementDocument.getMetadataMap();
/*      */ 
/*      */ 
/*      */     
/*  512 */     elementDocument.getElementById("message").setTextWithNewlines(paramd.c);
/*      */ 
/*      */ 
/*      */     
/*  516 */     if (paramd.b == null)
/*      */     {
/*  518 */       paramd.b = "";
/*      */     }
/*  520 */     elementDocument.getElementById("title").setText(paramd.b);
/*      */     
/*  522 */     a(elementDocument, "button_1", paramd.e, hashMap);
/*  523 */     a(elementDocument, "button_2", paramd.f, hashMap);
/*      */     
/*  525 */     Element element = elementDocument.getElementById("button_back");
/*      */     
/*  527 */     element.loadCharsetIfNeededWithCurrentText();
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
/*  540 */     String str = "closePopup();";
/*  541 */     if (paramd.d != null)
/*      */     {
/*  543 */       str = str + "hideKeyboard();";
/*      */     }
/*  545 */     element.setAttribute("onclick", str);
/*      */ 
/*      */     
/*  548 */     if (!paramd.h)
/*      */     {
/*  550 */       element.hide();
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  555 */     if (paramd.e == null && paramd.f == null) {
/*      */       
/*  557 */       element.setText(a.a("menus.common.ok", new Object[0]));
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  562 */       element.focus();
/*      */     } 
/*      */     
/*  565 */     if (paramd.d != null) {
/*      */       
/*  567 */       Element element1 = elementDocument.getElementById("textInputWrapper");
/*  568 */       element1.show();
/*      */ 
/*      */       
/*  571 */       Element element2 = elementDocument.getElementById("textInput");
/*      */       
/*  573 */       element2.setAttribute("value", paramd.d);
/*      */       
/*  575 */       element2.focus();
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  580 */     paramd.a = elementDocument;
/*      */ 
/*      */ 
/*      */     
/*  584 */     if (paramd.g) {
/*      */       
/*  586 */       if (b(paramd))
/*      */       {
/*  588 */         return elementDocument;
/*      */       }
/*      */ 
/*      */       
/*  592 */       closeDocument(elementDocument);
/*      */       
/*  594 */       return null;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  599 */     return elementDocument;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(d paramd) {
/*  607 */     if (this.i != null) {
/*      */       
/*  609 */       l.d("AlertPopup already visible closing");
/*  610 */       closeDocument(this.i.a);
/*  611 */       this.i = null;
/*      */     } 
/*      */     
/*  614 */     this.i = paramd;
/*  615 */     paramd.a.show(4);
/*      */     
/*  617 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(ElementDocument paramElementDocument) {
/*  622 */     return c(new d(paramElementDocument));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(d paramd) {
/*  627 */     if (this.j != null) {
/*      */       
/*  629 */       l.d("Popup already visible, cannot show: " + paramd.a.getMetadata("sourceDocumentId"));
/*      */       
/*  631 */       if (this.i != null) {
/*      */         
/*  633 */         this.i.a.pullToFront();
/*  634 */         return false;
/*      */       } 
/*      */       
/*  637 */       this.j.a.pullToFront();
/*  638 */       return false;
/*      */     } 
/*      */     
/*  641 */     this.j = paramd;
/*      */ 
/*      */     
/*  644 */     paramd.a.show(4);
/*      */     
/*  646 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ElementDocument a(String paramString1, Object paramObject, String paramString2, boolean paramBoolean) {
/*  652 */     ScriptEngine.checkThreadAccess();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  661 */     ElementDocument elementDocument = createPopup("messagebox.rml", paramObject);
/*      */     
/*  663 */     elementDocument.setMetadata("sourceDocumentId", paramString1);
/*      */ 
/*      */ 
/*      */     
/*  667 */     File file = new File(a(paramString1));
/*  668 */     String str = f.a(file);
/*      */     
/*  670 */     elementDocument.getElementById("mainButtons").hide();
/*      */     
/*  672 */     Element element = elementDocument.getElementById("message");
/*  673 */     element.setInnerRML(str);
/*      */ 
/*      */ 
/*      */     
/*  677 */     a(element);
/*      */ 
/*      */     
/*  680 */     if (paramString2 == null)
/*      */     {
/*  682 */       paramString2 = "";
/*      */     }
/*  684 */     elementDocument.getElementById("title").setText(paramString2);
/*      */     
/*  686 */     if (paramBoolean) {
/*      */       
/*  688 */       d d1 = new d(elementDocument);
/*      */       
/*  690 */       if (c(d1))
/*      */       {
/*  692 */         return elementDocument;
/*      */       }
/*      */ 
/*      */       
/*  696 */       closeDocument(elementDocument);
/*      */       
/*  698 */       return null;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  703 */     return elementDocument;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Element paramElement) {
/*  713 */     if (paramElement == null) {
/*      */       
/*  715 */       l.d("loadCharsetIfNeededOnChildren: root is null");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  720 */     ArrayList arrayList = paramElement.getAllNestedChildren();
/*      */     
/*  722 */     for (Element element : arrayList) {
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
/*  734 */       String str = element.getTagName();
/*  735 */       if (str.equals("p") || str
/*  736 */         .startsWith("h") || str
/*  737 */         .startsWith("label") || str
/*  738 */         .startsWith("button") || str
/*  739 */         .startsWith("select"))
/*      */       {
/*      */ 
/*      */         
/*  743 */         boolean bool = element.loadCharsetIfNeededWithCurrentText();
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
/*      */   public void a(ElementDocument paramElementDocument, String paramString, Object paramObject, HashMap<String, Runnable> paramHashMap) {
/*  799 */     Element element = paramElementDocument.getElementById(paramString);
/*      */     
/*  801 */     if (paramObject == null) {
/*      */       
/*  803 */       element.hide();
/*      */     }
/*  805 */     else if (paramObject instanceof String) {
/*      */       
/*  807 */       String str1 = (String)paramObject;
/*      */       
/*  809 */       int i = str1.indexOf(":");
/*      */       
/*  811 */       String str2 = str1.substring(0, i);
/*      */       
/*  813 */       String str3 = "";
/*  814 */       if (i + 1 < str1.length())
/*      */       {
/*  816 */         str3 = str1.substring(i + 1);
/*      */       }
/*      */ 
/*      */       
/*  820 */       if (str2.startsWith("[onenter]")) {
/*      */         
/*  822 */         str2 = str2.substring("[onenter]".length());
/*  823 */         paramElementDocument.getElementById("textInput").setAttribute("onenter", str3);
/*      */       } 
/*      */ 
/*      */       
/*  827 */       element.setText(str2);
/*  828 */       element.setAttribute("onclick", str3);
/*      */     
/*      */     }
/*  831 */     else if (paramObject instanceof e) {
/*      */       
/*  833 */       e e = (e)paramObject;
/*      */       
/*  835 */       String str = "action_" + paramString;
/*      */       
/*  837 */       paramHashMap.put(str, e.b);
/*      */       
/*  839 */       element.setText(e.a);
/*  840 */       element.setAttribute("onclick", "runRunnable(" + str + ");");
/*      */       
/*  842 */       if (e.c)
/*      */       {
/*  844 */         paramElementDocument.getElementById("textInput").setAttribute("onenter", "runRunnable(" + str + ");");
/*      */       
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/*  850 */       l.f("Unhandled type:" + paramObject);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean h() {
/*  857 */     if (i())
/*      */     {
/*  859 */       return true;
/*      */     }
/*      */     
/*  862 */     if (j())
/*      */     {
/*  864 */       return true;
/*      */     }
/*      */     
/*  867 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean i() {
/*  872 */     d d1 = this.i;
/*      */     
/*  874 */     if (d1 != null) {
/*      */       
/*  876 */       l.d("Closing alert");
/*      */ 
/*      */       
/*  879 */       closeDocument(d1.a);
/*      */       
/*  881 */       this.i = null;
/*      */       
/*  883 */       if (d1.i != null)
/*      */       {
/*  885 */         d1.i.run();
/*      */       }
/*      */       
/*  888 */       return true;
/*      */     } 
/*      */     
/*  891 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean j() {
/*  897 */     d d1 = this.j;
/*      */     
/*  899 */     if (d1 != null) {
/*      */       
/*  901 */       l.d("Closing popup");
/*      */ 
/*      */ 
/*      */       
/*  905 */       closeDocument(d1.a);
/*      */       
/*  907 */       this.j = null;
/*      */       
/*  909 */       if (d1.i != null)
/*      */       {
/*  911 */         d1.i.run();
/*      */       }
/*      */       
/*  914 */       return true;
/*      */     } 
/*  916 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public String k() {
/*  921 */     ElementDocument elementDocument = e();
/*      */     
/*  923 */     Element element = elementDocument.getElementById("textInput");
/*  924 */     return element.getAttribute("value");
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
/*  940 */   Pattern h = Pattern.compile("\\$\\{([^\\}]*?)\\}");
/*      */ 
/*      */ 
/*      */   
/*      */   public String d(String paramString) {
/*  945 */     String str = null;
/*      */     
/*  947 */     if (paramString != null && paramString.contains("class=\"log-entry\"")) {
/*      */       
/*  949 */       System.out.println("parseText: skipping log line:" + paramString);
/*  950 */       return null;
/*      */     } 
/*      */     
/*  953 */     byte b1 = 0;
/*      */ 
/*      */ 
/*      */     
/*  957 */     Matcher matcher = this.h.matcher(paramString);
/*  958 */     while (matcher.find()) {
/*      */       
/*  960 */       b1++;
/*  961 */       if (b1 > 100) {
/*      */         
/*  963 */         System.out.println("parseText too many loops!!");
/*  964 */         return null;
/*      */       } 
/*      */ 
/*      */       
/*  968 */       String str1 = matcher.group(1);
/*  969 */       String str2 = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  977 */       if (this.debug)
/*      */       {
/*  979 */         System.out.println("parseText:" + str1);
/*      */       }
/*      */       
/*  982 */       if (str1.startsWith("i:")) {
/*      */         
/*  984 */         String str3 = str1.substring(2);
/*  985 */         str2 = a.a(str3, new Object[0]);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  995 */       if (str2 == null) {
/*      */ 
/*      */ 
/*      */         
/*  999 */         Object object = this.c.processArg(str1);
/* 1000 */         if (object != null)
/*      */         {
/* 1002 */           str2 = object.toString();
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1007 */       if (str2 == null) {
/*      */ 
/*      */         
/* 1010 */         paramString = matcher.replaceFirst("(unhandled:" + str1 + ")");
/*      */       }
/*      */       else {
/*      */         
/* 1014 */         paramString = matcher.replaceFirst(str2);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1019 */       if (str2 != null) {
/*      */ 
/*      */         
/* 1022 */         ElementDocument elementDocument = getActiveDocument();
/* 1023 */         if (elementDocument != null && !elementDocument.translatedToUnicode)
/*      */         {
/* 1025 */           if (f.m(str2))
/*      */           {
/* 1027 */             elementDocument.translatedToUnicode = true;
/*      */           }
/*      */         }
/*      */         
/* 1031 */         elementDocument = g();
/* 1032 */         if (elementDocument != null && !elementDocument.translatedToUnicode)
/*      */         {
/* 1034 */           if (f.m(str2))
/*      */           {
/* 1036 */             elementDocument.translatedToUnicode = true;
/*      */           }
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1042 */       matcher = this.h.matcher(paramString);
/*      */       
/* 1044 */       str = paramString;
/*      */     } 
/*      */     
/* 1047 */     return str;
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
/*      */   public String TranslateString(String paramString) {
/*      */     try {
/* 1065 */       String str = d(paramString);
/*      */       
/* 1067 */       if (str != null)
/*      */       {
/* 1069 */         return str;
/*      */       
/*      */       }
/*      */     }
/* 1073 */     catch (Exception exception) {
/*      */       
/* 1075 */       ScriptEngine.throwDelayedException("TranslateString exception on: " + paramString, exception);
/*      */ 
/*      */       
/* 1078 */       l.a("Exception in TranslateString", exception);
/*      */       
/* 1080 */       l.b("start");
/* 1081 */       exception.printStackTrace();
/* 1082 */       l.b("end");
/*      */ 
/*      */       
/* 1085 */       l.b("start logStack");
/* 1086 */       l.M();
/* 1087 */       l.b("end logStack");
/*      */ 
/*      */       
/* 1090 */       System.err.flush();
/* 1091 */       System.out.flush();
/*      */ 
/*      */ 
/*      */       
/* 1095 */       return null;
/*      */     } 
/*      */ 
/*      */     
/* 1099 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getFileLastModified(String paramString) {
/* 1110 */     return j.a(paramString, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void postUpdate() {
/* 1121 */     boolean bool = this.queueExtraUpdate;
/*      */     
/* 1123 */     super.postUpdate();
/*      */     
/* 1125 */     if (bool)
/*      */     {
/* 1127 */       this.c.checkForErrors();
/*      */     }
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\librocket\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */