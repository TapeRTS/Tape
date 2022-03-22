/*      */ package com.corrodinggames.librocket.scripts;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import com.Element;
/*      */ import com.ElementDocument;
/*      */ import com.corrodinggames.librocket.a;
/*      */ import com.corrodinggames.librocket.b;
/*      */ import com.corrodinggames.librocket.e;
/*      */ import com.corrodinggames.rts.a.c;
/*      */ import com.corrodinggames.rts.a.g;
/*      */ import com.corrodinggames.rts.a.h;
/*      */ import com.corrodinggames.rts.a.n;
/*      */ import com.corrodinggames.rts.a.o;
/*      */ import com.corrodinggames.rts.game.b.f;
/*      */ import com.corrodinggames.rts.game.i;
/*      */ import com.corrodinggames.rts.gameFramework.ad;
/*      */ import com.corrodinggames.rts.gameFramework.bl;
/*      */ import com.corrodinggames.rts.gameFramework.c.a;
/*      */ import com.corrodinggames.rts.gameFramework.e.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g;
/*      */ import com.corrodinggames.rts.gameFramework.g.ah;
/*      */ import com.corrodinggames.rts.gameFramework.g.ai;
/*      */ import com.corrodinggames.rts.gameFramework.g.al;
/*      */ import com.corrodinggames.rts.gameFramework.g.b;
/*      */ import com.corrodinggames.rts.gameFramework.g.c;
/*      */ import com.corrodinggames.rts.gameFramework.g.g;
/*      */ import com.corrodinggames.rts.gameFramework.g.n;
/*      */ import com.corrodinggames.rts.gameFramework.h;
/*      */ import com.corrodinggames.rts.gameFramework.i.a;
/*      */ import com.corrodinggames.rts.gameFramework.j;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashMap;
/*      */ import java.util.LinkedList;
/*      */ import java.util.ListIterator;
/*      */ import java.util.concurrent.ConcurrentLinkedQueue;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Root
/*      */   extends ScriptContext
/*      */ {
/*      */   public static final boolean DEBUG_TIMING = true;
/*      */   public Multiplayer multiplayer;
/*      */   
/*      */   public void logDebug(String paramString) {
/*   70 */     l.d("ui[debug]: " + paramString);
/*      */   }
/*      */   
/*      */   public void logWarn(String paramString) {
/*   74 */     l.d("ui[warn]: " + paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void back() {
/*   81 */     this.libRocket.backToLastDocument();
/*      */ 
/*      */     
/*   84 */     if (this.libRocket.getActiveDocument() == null) {
/*      */       
/*   86 */       l.b("back: libRocket.getActiveDocument()==null");
/*      */       
/*   88 */       l l = l.u();
/*      */       
/*   90 */       if (l == null || !l.ba) {
/*      */         
/*   92 */         l.b("back: showing main menu!");
/*   93 */         showMainMenu();
/*      */       }
/*      */       else {
/*      */         
/*   97 */         l.b("back: resuming game");
/*      */         
/*   99 */         this.guiEngine.a(false);
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
/*      */   public void backOrClose() {
/*  119 */     if (closePopup()) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  125 */     this.libRocket.backToLastDocument();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String fullVersionOnlyStyle() {
/*  131 */     if ((l.u()).am)
/*      */     {
/*  133 */       return "notInDemo";
/*      */     }
/*  135 */     return "";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void openIfNotDemo(String paramString1, Object paramObject, String paramString2) {
/*  141 */     if ((l.u()).am) {
/*      */       
/*  143 */       alert(paramString2);
/*      */       
/*      */       return;
/*      */     } 
/*  147 */     open(paramString1, paramObject);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getVersionName() {
/*  153 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  164 */     return l.m();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  170 */   bl openDocumentTimer = new bl("openDocument", true);
/*      */   al threadedGameConnector;
/*      */   
/*      */   public void delayedOpenNoHistory(String paramString, Object paramObject) {
/*  174 */     ScriptEngine$Action scriptEngine$Action = this.scriptEngine.addRunnableToQueue(new Root$1(this, paramString));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  189 */     scriptEngine$Action.framesDelay = 1;
/*      */   }
/*      */ 
/*      */   
/*      */   ElementDocument lastConnectingPopup;
/*      */   
/*      */   public void open(String paramString, Object paramObject) {
/*  196 */     this.openDocumentTimer.a();
/*  197 */     b.a.f();
/*      */     
/*  199 */     HashMap<Object, Object> hashMap = null;
/*  200 */     if (paramObject != null) {
/*      */       
/*  202 */       hashMap = new HashMap<>();
/*  203 */       hashMap.put("mode", paramObject);
/*      */     } 
/*      */     
/*  206 */     this.libRocket.setDocument(paramString, hashMap);
/*      */     
/*  208 */     onShowNewScreen();
/*      */     
/*  210 */     this.openDocumentTimer.d();
/*  211 */     b.a.e();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onShowNewScreen() {
/*  221 */     this.guiEngine.a(true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void resume() {
/*  230 */     this.libRocket.closeActiveDocument();
/*  231 */     this.libRocket.clearHistory();
/*      */     
/*  233 */     this.guiEngine.e();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void resumeNonMenu() {
/*  239 */     this.libRocket.closeActiveDocument();
/*  240 */     this.libRocket.clearHistory();
/*      */     
/*  242 */     this.guiEngine.a(false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void startNew(String paramString) {
/*  249 */     this.guiEngine.a(paramString);
/*      */ 
/*      */     
/*  252 */     this.libRocket.closeActiveDocument();
/*  253 */     this.libRocket.clearHistory();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void showRangeValue(String paramString1, String paramString2, boolean paramBoolean) {
/*  260 */     Element element1 = this.libRocket.getActiveElementById(paramString1);
/*  261 */     if (element1 == null) {
/*      */       
/*  263 */       logWarn("Could not find:" + paramString1);
/*      */       return;
/*      */     } 
/*  266 */     String str = element1.getAttribute("value");
/*      */     
/*  268 */     if (paramBoolean) {
/*      */       
/*  270 */       str = (new Float(str)).toString();
/*      */     }
/*      */     else {
/*      */       
/*  274 */       str = Integer.toString((int)Float.parseFloat(str));
/*      */     } 
/*      */     
/*  277 */     Element element2 = this.libRocket.getActiveElementById(paramString2);
/*  278 */     if (element2 == null) {
/*      */       
/*  280 */       logWarn("Could not find:" + paramString2);
/*      */       
/*      */       return;
/*      */     } 
/*  284 */     element2.setText(str);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getValueById(String paramString) {
/*  291 */     Element element = this.libRocket.getActiveElementById(paramString);
/*  292 */     if (element == null) {
/*      */       
/*  294 */       logWarn("Could not find:" + paramString);
/*      */       
/*  296 */       return null;
/*      */     } 
/*      */     
/*  299 */     return element.getAttribute("value");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setValueById(String paramString1, String paramString2) {
/*  305 */     Element element = this.libRocket.getActiveElementById(paramString1);
/*  306 */     if (element == null) {
/*      */       
/*  308 */       logWarn("Could not find:" + paramString1);
/*      */       
/*      */       return;
/*      */     } 
/*  312 */     element.setAttribute("value", paramString2);
/*      */   }
/*      */ 
/*      */   
/*      */   public Element getElementById(String paramString) {
/*  317 */     Element element = this.libRocket.getActiveElementById(paramString);
/*  318 */     if (element == null) {
/*      */       
/*  320 */       logWarn("Could not find:" + paramString);
/*  321 */       return null;
/*      */     } 
/*  323 */     return element;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean clickElement(Element paramElement) {
/*  328 */     if (paramElement == null) {
/*      */       
/*  330 */       logWarn("element is null");
/*  331 */       return false;
/*      */     } 
/*  333 */     paramElement.click();
/*      */     
/*  335 */     return true;
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
/*      */   public void directJoinPopup() {
/*  347 */     l l = l.u();
/*      */     
/*  349 */     String str1 = "Direct Join";
/*  350 */     String str2 = "Enter IP address or host name";
/*      */ 
/*      */ 
/*      */     
/*  354 */     String str3 = "";
/*      */     
/*  356 */     if (l.by.lastNetworkIP != null)
/*      */     {
/*  358 */       str3 = l.by.lastNetworkIP;
/*      */     }
/*      */ 
/*      */     
/*  362 */     showInputPopup(str1, str2, str3, "[onenter]Join:joinServerFromPopup(getPopupText())", (String)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void joinServerFromPopup(String paramString) {
/*  369 */     closePopup();
/*  370 */     hideKeyboard();
/*      */     
/*  372 */     if (paramString == null) {
/*      */       
/*  374 */       logDebug("joinAddress==null");
/*      */       return;
/*      */     } 
/*  377 */     paramString = paramString.trim();
/*      */     
/*  379 */     l l = l.u();
/*  380 */     l.by.lastNetworkIP = paramString;
/*  381 */     l.by.save();
/*      */ 
/*      */ 
/*      */     
/*  385 */     joinServerWithId(paramString, (String)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void joinServerWithId(String paramString1, String paramString2) {
/*  394 */     l l = l.u();
/*      */     
/*  396 */     l.bF.by = paramString2;
/*      */     
/*  398 */     joinServer(paramString1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void joinServer(String paramString) {
/*  405 */     logDebug("joinAddress=" + paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  423 */     Root$2 root$2 = new Root$2(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  433 */     l l = l.u();
/*      */     
/*  435 */     this.threadedGameConnector = l.bF.a(paramString, false, root$2);
/*      */ 
/*      */     
/*  438 */     this.lastConnectingPopup = createAndShowPopup("multiplayerLobby_connecting.rml", (Object)null, "Please wait");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void joinServerCallback() {
/*  446 */     logDebug("joinServerCallback");
/*      */     
/*  448 */     l l = l.u();
/*      */     
/*  450 */     if (this.threadedGameConnector == null) {
/*      */       
/*  452 */       logDebug("threadedGameConnector==null");
/*      */       
/*      */       return;
/*      */     } 
/*  456 */     closePopupOnly();
/*      */     
/*  458 */     if (this.threadedGameConnector.e != null) {
/*      */ 
/*      */       
/*  461 */       if (this.threadedGameConnector.e.equals("CANCELLED")) {
/*      */         
/*  463 */         logDebug("Server join cancelled");
/*      */         
/*      */         return;
/*      */       } 
/*  467 */       logWarn("Server join failed");
/*      */ 
/*      */       
/*  470 */       boolean bool = true;
/*      */       
/*  472 */       String str = "Connection failed";
/*  473 */       showPopup(str, this.threadedGameConnector.e, bool, (String)null, (String)null);
/*      */     } else {
/*      */ 
/*      */       
/*      */       try {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  482 */         l.bF.b("starting new");
/*      */         
/*  484 */         l.bF.a(this.threadedGameConnector.g);
/*      */         
/*  486 */         logDebug("connected");
/*      */ 
/*      */         
/*  489 */         showBattleroom();
/*      */       
/*      */       }
/*  492 */       catch (IOException iOException) {
/*      */         
/*  494 */         String str = iOException.getMessage();
/*  495 */         l.c(str, "Connection failed");
/*  496 */         iOException.printStackTrace();
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  504 */     this.threadedGameConnector = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void cancelJoinServer() {
/*  512 */     if (this.threadedGameConnector != null) {
/*      */       
/*  514 */       if (this.threadedGameConnector.a())
/*      */       {
/*  516 */         closePopup();
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/*  521 */       closePopup();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void alert(String paramString) {
/*  528 */     showAlert(paramString);
/*      */   }
/*      */   
/*      */   public void showAlert(String paramString) {
/*  532 */     logDebug("alert:" + paramString);
/*  533 */     if (paramString == null)
/*      */     {
/*  535 */       paramString = "null";
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  540 */     this.libRocket.c(paramString);
/*      */   }
/*      */ 
/*      */   
/*      */   public void showPopupWithButtons(String paramString1, String paramString2, boolean paramBoolean, e parame1, e parame2) {
/*  545 */     logDebug("showPopup:" + paramString2);
/*  546 */     if (paramString2 == null)
/*      */     {
/*  548 */       paramString2 = "null";
/*      */     }
/*      */ 
/*      */     
/*  552 */     String str = null;
/*      */     
/*  554 */     this.libRocket.a(paramString1, paramString2, str, parame1, parame2);
/*      */   }
/*      */ 
/*      */   
/*      */   public void showPopupWithButtonsAndInput(String paramString1, String paramString2, boolean paramBoolean, String paramString3, e parame1, e parame2) {
/*  559 */     logDebug("showPopup:" + paramString2);
/*  560 */     if (paramString2 == null)
/*      */     {
/*  562 */       paramString2 = "null";
/*      */     }
/*      */ 
/*      */     
/*  566 */     if (paramString3 == null)
/*      */     {
/*  568 */       paramString3 = "";
/*      */     }
/*      */     
/*  571 */     if ("".equals(paramString3))
/*      */     {
/*  573 */       this.guiEngine.k();
/*      */     }
/*      */     
/*  576 */     this.libRocket.a(paramString1, paramString2, paramString3, parame1, parame2, true, paramBoolean);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void showPopup(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4) {
/*  582 */     logDebug("showPopup:" + paramString2);
/*  583 */     if (paramString2 == null)
/*      */     {
/*  585 */       paramString2 = "null";
/*      */     }
/*      */ 
/*      */     
/*  589 */     String str = null;
/*      */     
/*  591 */     this.libRocket.a(paramString1, paramString2, str, paramString3, paramString4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void showInputPopup(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
/*  601 */     logDebug("showInputPopup:" + paramString2);
/*  602 */     if (paramString2 == null)
/*      */     {
/*  604 */       paramString2 = "null";
/*      */     }
/*      */ 
/*      */     
/*  608 */     String str = paramString3;
/*  609 */     if (str == null)
/*      */     {
/*  611 */       str = "";
/*      */     }
/*      */     
/*  614 */     if ("".equals(str))
/*      */     {
/*  616 */       this.guiEngine.k();
/*      */     }
/*      */     
/*  619 */     this.libRocket.a(paramString1, paramString2, str, paramString4, paramString5);
/*      */   }
/*      */ 
/*      */   
/*      */   public void showInputPopupNonClose(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
/*  624 */     logDebug("showInputPopup:" + paramString2);
/*  625 */     if (paramString2 == null)
/*      */     {
/*  627 */       paramString2 = "null";
/*      */     }
/*      */ 
/*      */     
/*  631 */     String str = paramString3;
/*  632 */     if (str == null)
/*      */     {
/*  634 */       str = "";
/*      */     }
/*      */     
/*  637 */     if ("".equals(str))
/*      */     {
/*  639 */       this.guiEngine.k();
/*      */     }
/*      */     
/*  642 */     this.libRocket.a(paramString1, paramString2, str, paramString4, paramString5, true, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public ElementDocument getPopup() {
/*  647 */     return this.libRocket.c();
/*      */   }
/*      */ 
/*      */   
/*      */   public ElementDocument getAlertOrPopup() {
/*  652 */     return this.libRocket.e();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean closePopup() {
/*  657 */     return this.libRocket.h();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean closePopupOnly() {
/*  662 */     return this.libRocket.j();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean closeAlertOnly() {
/*  667 */     return this.libRocket.i();
/*      */   }
/*      */ 
/*      */   
/*      */   public String getPopupText() {
/*  672 */     return this.libRocket.k();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void showHostOptions() {
/*  679 */     this.libRocket.a("Host game", i("menus.hostgame.info_pc"), null, "Host Private:closePopup();hostStart(false);", "Host Public:closePopup();hostStart(true);");
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
/*      */   public void hostStartFromPopup(boolean paramBoolean) {
/*  692 */     ElementDocument elementDocument = this.libRocket.g();
/*  693 */     Element element1 = elementDocument.getElementById("password");
/*      */     
/*  695 */     String str = null;
/*      */     
/*  697 */     if (element1 == null) {
/*      */       
/*  699 */       logWarn("hostStartFromPopup: password==null");
/*      */     }
/*      */     else {
/*      */       
/*  703 */       String str1 = element1.getValue();
/*      */       
/*  705 */       if (str1 != null && !str1.trim().equals(""))
/*      */       {
/*  707 */         str = str1;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  712 */     Element element2 = elementDocument.getElementById("useMods");
/*      */     
/*  714 */     boolean bool = element2.getCheckbox();
/*      */ 
/*      */     
/*  717 */     closePopup();
/*      */ 
/*      */ 
/*      */     
/*  721 */     hostStartWithPasswordAndMods(paramBoolean, str, bool);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void hostStart(boolean paramBoolean) {
/*  728 */     l.b("old version of hostStart");
/*  729 */     hostStartWithPassword(paramBoolean, (String)null);
/*      */   }
/*      */ 
/*      */   
/*      */   public void hostStartWithPassword(boolean paramBoolean, String paramString) {
/*  734 */     l.b("old version of hostStartWithPassword");
/*  735 */     hostStartWithPasswordAndMods(paramBoolean, paramString, true);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void hostStartWithPasswordAndMods(boolean paramBoolean1, String paramString, boolean paramBoolean2) {
/*  741 */     l l = l.u();
/*      */ 
/*      */     
/*  744 */     l.bF.b("starting new");
/*      */ 
/*      */ 
/*      */     
/*  748 */     l.bF.m = paramString;
/*      */     
/*  750 */     l.bF.n = paramBoolean2;
/*      */     
/*  752 */     l.bF.p = paramBoolean1;
/*      */ 
/*      */     
/*  755 */     if (l.bF.b(false)) {
/*      */       
/*  757 */       logDebug("hosting");
/*      */ 
/*      */       
/*  760 */       String str = l.bF.am();
/*      */       
/*  762 */       if (str != null)
/*      */       {
/*      */         
/*  765 */         if (!a.f(str)) {
/*      */           
/*  767 */           l.b("hostStart: map does not exist: " + str + " reseting");
/*  768 */           str = null;
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  774 */       if (str == null) {
/*      */ 
/*      */         
/*  777 */         boolean bool = false;
/*  778 */         l.bF.aH.a = ai.values()[bool];
/*      */ 
/*      */         
/*  781 */         l.bF.aI = "maps/skirmish/[p8]Many Islands (8p).tmx";
/*      */         
/*  783 */         l.bF.aH.b = "[p8]Many Islands (8p).tmx";
/*      */       } 
/*      */ 
/*      */       
/*  787 */       this.libRocket.setDocument("battleroom.rml", null);
/*      */     }
/*      */     else {
/*      */       
/*  791 */       logWarn("hosting failed");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void exit() {
/*  800 */     this.scriptEngine.addRunnableToQueue(new Root$3(this));
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
/*      */   public String getMapDetails(String paramString) {
/*  816 */     return "hello 123";
/*      */   }
/*      */ 
/*      */   
/*      */   public String getHTMLMapNameFromPath(String paramString) {
/*  821 */     return htmlString(getMapNameFromPath(paramString));
/*      */   }
/*      */ 
/*      */   
/*      */   public String getMapNameFromPath(String paramString) {
/*  826 */     File file = new File(paramString);
/*  827 */     return convertMapName(file.getName());
/*      */   }
/*      */ 
/*      */   
/*      */   public String convertMapName(String paramString) {
/*  832 */     String str = convertMapNameWithoutTranslation(paramString);
/*  833 */     str = a.b(str);
/*  834 */     return str;
/*      */   }
/*      */ 
/*      */   
/*      */   public String convertMapNameWithoutTranslation(String paramString) {
/*  839 */     return g.d(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getHTMLMapThumbnail(String paramString) {
/*  846 */     return escapedString(getMapThumbnail(paramString));
/*      */   }
/*      */ 
/*      */   
/*      */   public String getMapThumbnail(String paramString) {
/*  851 */     String str1 = null;
/*  852 */     if (paramString.startsWith("saves/"))
/*      */     {
/*  854 */       str1 = "drawable:icon_save.png";
/*      */     }
/*      */     
/*  857 */     String str2 = c.c(paramString);
/*      */     
/*  859 */     str1 = "thumbnail:assets:" + str2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  867 */     if (!a.f(str2)) {
/*      */       
/*  869 */       if (l.aJ)
/*      */       {
/*  871 */         l.a("getMapThumbnail: Failed to find: " + str2);
/*      */       }
/*      */       
/*  874 */       return "drawable:error_missingmap.png";
/*      */     } 
/*      */     
/*  877 */     return str1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isMapSkirmish(String paramString) {
/*  883 */     return g.e(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void showLevelOptions() {
/*  889 */     l l = l.u();
/*      */     
/*  891 */     String str = (String)this.libRocket.b("mode");
/*  892 */     if (str == null) {
/*      */ 
/*      */       
/*  895 */       l.f("levelPath==null");
/*      */       
/*      */       return;
/*      */     } 
/*  899 */     boolean bool = true;
/*  900 */     if (!isMapSkirmish(str))
/*      */     {
/*  902 */       bool = false;
/*      */     }
/*      */     
/*  905 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/*      */ 
/*      */     
/*  908 */     for (Element element : elementDocument.findElementsByClassName("skirmishOnly"))
/*      */     {
/*  910 */       element.show(bool);
/*      */     }
/*      */     
/*  913 */     Element element1 = elementDocument.getElementById("advancedButton");
/*  914 */     if (element1 != null)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  921 */       element1.show((bool || g.f(str)));
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  926 */     Element element2 = elementDocument.getElementById("aiDifficulty");
/*      */     
/*  928 */     element2.setValue("" + l.by.aiDifficulty);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadConfigAndStartSwitchToAdvanced(String paramString) {
/*  935 */     boolean bool = true;
/*      */     
/*  937 */     l l = l.u();
/*  938 */     l.be = false;
/*      */     
/*  940 */     loadConfigCommon(paramString, bool);
/*      */     
/*  942 */     _startAdvancedMode(false);
/*      */   }
/*      */   
/*      */   private void _startAdvancedMode(boolean paramBoolean) {
/*      */     boolean bool;
/*  947 */     l l = l.u();
/*      */ 
/*      */     
/*  950 */     l.bF.b("starting singleplayer");
/*  951 */     l.bF.w = "You";
/*      */     
/*  953 */     l.bF.n = true;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  958 */     if (paramBoolean) {
/*      */       
/*  960 */       bool = l.bF.J();
/*      */     }
/*      */     else {
/*      */       
/*  964 */       bool = l.bF.K();
/*      */     } 
/*      */     
/*  967 */     if (bool) {
/*      */       
/*  969 */       logDebug("started startSinglePlayerServer");
/*  970 */       ah ah = l.bF.c();
/*  971 */       if (ah != null) {
/*      */         
/*  973 */         ah.f = l.by.aiDifficulty;
/*      */         
/*  975 */         l.bF.a(ah);
/*      */       } 
/*  977 */       this.libRocket.setDocument("battleroom.rml", null);
/*      */     }
/*      */     else {
/*      */       
/*  981 */       logWarn("failed startSinglePlayerServer");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadConfigAndStartNewSandbox(String paramString) {
/*  988 */     _loadConfigAndStartNewSandboxCommon(paramString, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public void loadConfigAndStartNewSandboxInAdvanced(String paramString) {
/*  993 */     l.d("loadConfigAndStartNewSandboxInAdvanced");
/*      */     
/*  995 */     _loadConfigAndStartNewSandboxCommon(paramString, false);
/*      */     
/*  997 */     _startAdvancedMode(true);
/*      */     
/*  999 */     l l = l.u();
/*      */ 
/*      */     
/* 1002 */     l.d("editorMode:" + l.be);
/*      */   }
/*      */ 
/*      */   
/*      */   private void _loadConfigAndStartNewSandboxCommon(String paramString, boolean paramBoolean) {
/* 1007 */     boolean bool = false;
/*      */     
/* 1009 */     if (paramString.startsWith("saves/")) {
/*      */       
/* 1011 */       l.d("Starting sandbox from save: " + paramString);
/* 1012 */       loadGame(paramString.substring("saves/".length()));
/*      */     }
/*      */     else {
/*      */       
/* 1016 */       l.d("Starting sandbox from map: " + paramString);
/* 1017 */       loadConfigCommon(paramString, bool);
/*      */     } 
/*      */     
/* 1020 */     l l = l.u();
/*      */     
/* 1022 */     l.bt.A = false;
/*      */     
/* 1024 */     l.bA.w();
/*      */     
/* 1026 */     l.be = true;
/*      */     
/* 1028 */     if (paramBoolean)
/*      */     {
/*      */       
/* 1031 */       this.guiEngine.e();
/*      */     }
/*      */     
/* 1034 */     this.libRocket.closeActiveDocument();
/* 1035 */     this.libRocket.clearHistory();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadConfigAndStartNew(String paramString) {
/* 1041 */     l l = l.u();
/* 1042 */     l.be = false;
/*      */ 
/*      */     
/* 1045 */     boolean bool = false;
/*      */     
/* 1047 */     loadConfigCommon(paramString, bool);
/*      */     
/* 1049 */     this.guiEngine.e();
/*      */ 
/*      */     
/* 1052 */     this.libRocket.closeActiveDocument();
/* 1053 */     this.libRocket.clearHistory();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadConfigCommon(String paramString, boolean paramBoolean) {
/* 1059 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/* 1063 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1068 */     Element element = elementDocument.getElementById("aiDifficulty");
/*      */ 
/*      */ 
/*      */     
/* 1072 */     l.by.aiDifficulty = element.getValueAsInt(Integer.valueOf(0)).intValue();
/* 1073 */     l.by.save();
/*      */     
/* 1075 */     this.guiEngine.b(true);
/*      */     
/* 1077 */     this.guiEngine.c(false);
/*      */ 
/*      */ 
/*      */     
/* 1081 */     String str = paramString;
/*      */     
/* 1083 */     boolean bool = isMapSkirmish(str);
/*      */     
/* 1085 */     int i = elementDocument.getElementById("numberOfAIs").getValueAsInt(Integer.valueOf(4)).intValue();
/* 1086 */     boolean bool1 = true;
/*      */ 
/*      */     
/* 1089 */     int j = elementDocument.getElementById("aiTeams").getValueAsInt(Integer.valueOf(1)).intValue();
/*      */     
/* 1091 */     int k = j - 1;
/* 1092 */     if (j == 5) {
/*      */       
/* 1094 */       k = 0;
/* 1095 */       bool1 = false;
/*      */     } 
/*      */ 
/*      */     
/* 1099 */     g.a(str, bool, i, k, bool1, paramBoolean);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void showMapPopup(String paramString1, String paramString2) {
/* 1110 */     boolean bool = false;
/*      */     
/* 1112 */     ElementDocument elementDocument = this.libRocket.a("levelSelect.rml", paramString1, "Map Select", bool);
/*      */     
/* 1114 */     if (elementDocument != null) {
/*      */       
/* 1116 */       elementDocument.setMetadata("mapClickFunction", paramString2);
/*      */       
/* 1118 */       for (Element element : elementDocument.findElementsByClassName("noStyleInPopup"))
/*      */       {
/* 1120 */         element.setAttribute("class", "");
/*      */       }
/*      */       
/* 1123 */       if (showMapsWithDoc(elementDocument)) {
/*      */         
/* 1125 */         l.d("showMapsWithDoc passed");
/*      */ 
/*      */         
/* 1128 */         this.libRocket.h();
/*      */ 
/*      */         
/* 1131 */         this.libRocket.a(elementDocument);
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
/*      */   public boolean showMaps() {
/* 1154 */     ElementDocument elementDocument = this.libRocket.f();
/* 1155 */     return showMapsWithDoc(elementDocument);
/*      */   }
/*      */   
/*      */   public boolean showMapsWithDoc(ElementDocument paramElementDocument) {
/*      */     String[] arrayOfString;
/* 1160 */     l l = l.u();
/*      */     
/* 1162 */     l.d("showMaps");
/*      */     
/* 1164 */     if (paramElementDocument == null) {
/*      */       
/* 1166 */       l.d("showMaps: elementDocument==null");
/* 1167 */       return false;
/*      */     } 
/*      */     
/* 1170 */     Element element1 = paramElementDocument.getElementById("mapTemplateHolder");
/* 1171 */     Element element2 = paramElementDocument.getElementById("mapHolder");
/*      */     
/* 1173 */     String str1 = element1.getInnerRML();
/*      */     
/* 1175 */     String str2 = "";
/*      */     
/* 1177 */     String str3 = (String)paramElementDocument.getMetadata("mode");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1182 */     String str4 = (String)paramElementDocument.getMetadata("mapClickFunction");
/*      */ 
/*      */     
/* 1185 */     boolean bool1 = str3.equals("saves");
/* 1186 */     boolean bool2 = str3.equals("replays");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1193 */     if (bool1) {
/*      */ 
/*      */       
/* 1196 */       arrayOfString = h.j();
/*      */       
/* 1198 */       if (arrayOfString == null)
/*      */       {
/* 1200 */         l.a("No saves", 1);
/* 1201 */         return false;
/*      */       
/*      */       }
/*      */     
/*      */     }
/* 1206 */     else if (bool2) {
/*      */ 
/*      */       
/* 1209 */       arrayOfString = o.j();
/*      */ 
/*      */ 
/*      */       
/* 1213 */       if (!l.by.saveMultiplayerReplays)
/*      */       {
/* 1215 */         alert("Note: Multiplayer replay recordings are not turned on. You can enable them in the settings.");
/*      */       }
/*      */       
/* 1218 */       if (arrayOfString == null)
/*      */       {
/* 1220 */         if (l.by.saveMultiplayerReplays)
/*      */         {
/* 1222 */           l.a("No replays yet", 1);
/*      */         }
/* 1224 */         return false;
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1230 */       arrayOfString = a.a(str3, true);
/*      */       
/* 1232 */       arrayOfString = l.bH.a(arrayOfString, str3);
/*      */       
/* 1234 */       if (arrayOfString == null) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1239 */         l.a("Could not find folder: " + a.c(str3), 1);
/* 1240 */         return false;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1247 */     String str5 = str3 + "/";
/*      */     
/* 1249 */     byte b = 0;
/* 1250 */     for (String str6 : arrayOfString) {
/*      */ 
/*      */ 
/*      */       
/* 1254 */       String str10, str11, str7 = str1;
/*      */       
/* 1256 */       String str8 = convertMapName(str6);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1261 */       boolean bool = g.a(str6, str5 + str6);
/*      */       
/* 1263 */       String str9 = str8 + "";
/*      */       
/* 1265 */       if (l.am && !bool)
/*      */       {
/*      */         
/* 1268 */         str9 = "[LOCKED] " + str9;
/*      */       }
/*      */ 
/*      */       
/* 1272 */       str7 = str7.replace("_NAME_", htmlString(str9));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1278 */       if (bool1) {
/*      */         
/* 1280 */         str10 = "loadGame(" + escapedString(str6) + ")";
/* 1281 */         str11 = "loadGameEdit(" + escapedString(str6) + ")";
/*      */       }
/* 1283 */       else if (bool2) {
/*      */         
/* 1285 */         str10 = "loadReplay(" + escapedString(str6) + ")";
/* 1286 */         str11 = "loadReplayEdit(" + escapedString(str6) + ")";
/*      */       }
/*      */       else {
/*      */         
/* 1290 */         str10 = "open('levelOptions.rml', " + escapedString(str5 + str6) + ")";
/*      */         
/* 1292 */         str11 = "";
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1298 */       if (str4 != null) {
/*      */         
/* 1300 */         str10 = str4 + "(" + escapedString(str5 + str6) + ")";
/* 1301 */         str11 = "";
/*      */       } 
/*      */       
/* 1304 */       str7 = str7.replace("_ONCLICK_", str10);
/* 1305 */       str7 = str7.replace("_ONCLICKEDIT_", str11);
/*      */ 
/*      */       
/* 1308 */       String str12 = "thumbnail:assets:";
/*      */       
/* 1310 */       if (b > 18)
/*      */       {
/* 1312 */         str12 = "lazy:" + str12;
/*      */       }
/*      */ 
/*      */       
/* 1316 */       String str13 = c.c(str5 + str6);
/*      */       
/* 1318 */       String str14 = str13;
/* 1319 */       if (l.aJ);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1329 */       String str15 = str12 + str13;
/*      */       
/* 1331 */       if (!a.f(str14)) {
/*      */         
/* 1333 */         if (l.aJ)
/*      */         {
/* 1335 */           l.a("List: Failed to find: " + str14 + " after converting:" + str13 + " ( " + str15 + " )");
/*      */         }
/*      */         
/* 1338 */         str15 = "drawable:error_missingmap.png";
/*      */       } 
/*      */       
/* 1341 */       if (bool1 || bool2)
/*      */       {
/* 1343 */         str15 = "";
/*      */       }
/*      */       
/* 1346 */       str7 = str7.replace("_IMG_", htmlString(str15));
/*      */ 
/*      */       
/* 1349 */       b++;
/* 1350 */       str2 = str2 + str7;
/*      */     } 
/*      */     
/* 1353 */     element2.setInnerRML(str2);
/*      */     
/* 1355 */     element2.loadCharsetIfNeeded(str2);
/*      */     
/* 1357 */     if (bool1 || bool2)
/*      */     {
/* 1359 */       element2.addClass("savesOnly");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1366 */     return true;
/*      */   }
/*      */ 
/*      */   
/* 1370 */   static bl convertTextStopwatch = new bl("ConvertText", true);
/*      */ 
/*      */ 
/*      */   
/*      */   public void convertTextOnPage() {
/* 1375 */     l l = l.u();
/*      */     
/* 1377 */     logDebug("convertTextOnPage");
/* 1378 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/*      */ 
/*      */     
/* 1381 */     if (isMobile())
/*      */     {
/* 1383 */       elementDocument.addClass("mobile");
/*      */     }
/*      */     
/* 1386 */     convertTextStopwatch.a();
/*      */     
/* 1388 */     ArrayList arrayList = elementDocument.getAllNestedChildren();
/*      */     
/* 1390 */     for (Element element : arrayList) {
/*      */       
/* 1392 */       int i = element.getNumAttributes();
/* 1393 */       for (byte b = 0; b < i; b++) {
/*      */         
/* 1395 */         String str1 = element.getAttributeKey(b);
/* 1396 */         String str2 = element.getAttributeValue(b);
/*      */ 
/*      */ 
/*      */         
/* 1400 */         if (str1 != null)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1406 */           if (str1.equals("nestedclone") && !str2.equalsIgnoreCase("false")) {
/*      */             
/* 1408 */             l.d("nested clone:" + element.getId());
/* 1409 */             element.setAttribute(str1, "false");
/*      */             
/* 1411 */             Element element1 = element.clone();
/* 1412 */             element.prependChild(element1);
/* 1413 */             element1.removeReference();
/*      */ 
/*      */ 
/*      */           
/*      */           }
/* 1418 */           else if (str1.equals("childclone") && !str2.equalsIgnoreCase("false")) {
/*      */             
/* 1420 */             element.setAttribute(str1, "false");
/*      */ 
/*      */             
/* 1423 */             if (element.getNumChildren() < 1)
/*      */             {
/* 1425 */               l.d("child clone failed no children:" + element.getId());
/*      */             }
/*      */             
/* 1428 */             Element element1 = element.getChild(0).clone();
/*      */             
/* 1430 */             element1.addClass("clone");
/* 1431 */             element.prependChild(element1);
/*      */             
/* 1433 */             element1.removeReference();
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */             
/* 1439 */             String str = this.libRocket.d(str2);
/* 1440 */             if (str != null) {
/*      */ 
/*      */               
/* 1443 */               l.d("convertTextOnPage:" + str1 + ": '" + str2 + "' to '" + str + "'");
/*      */               
/* 1445 */               if (str1.equals("_html")) {
/*      */                 
/* 1447 */                 l.d("setting html:" + str1);
/* 1448 */                 element.setInnerRML(str);
/*      */               }
/*      */               else {
/*      */                 
/* 1452 */                 if (str1.startsWith("_")) {
/*      */                   
/* 1454 */                   str1 = str1.substring("_".length());
/* 1455 */                   l.d("converted key to:" + str1);
/*      */                 } 
/*      */                 
/* 1458 */                 element.setAttribute(str1, str);
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1470 */       if (elementDocument.translatedToUnicode) {
/*      */ 
/*      */ 
/*      */         
/* 1474 */         String str = element.getTagName();
/* 1475 */         if (str.equals("p") || str
/* 1476 */           .startsWith("h") || str
/* 1477 */           .startsWith("label") || str
/* 1478 */           .startsWith("button") || str
/* 1479 */           .startsWith("select"))
/*      */         {
/*      */ 
/*      */           
/* 1483 */           boolean bool = element.loadCharsetIfNeededWithCurrentText();
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1491 */     convertTextStopwatch.d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void keyBindingPopup_apply(boolean paramBoolean) {
/* 1498 */     l l = l.u();
/*      */     
/* 1500 */     ElementDocument elementDocument = this.libRocket.c();
/* 1501 */     if (elementDocument == null) {
/*      */       
/* 1503 */       logWarn("showKeyBindingActionPopup: popup==null");
/*      */       
/*      */       return;
/*      */     } 
/* 1507 */     String str = (String)elementDocument.getMetadata("mode");
/* 1508 */     String[] arrayOfString = str.split(":");
/* 1509 */     int i = Integer.parseInt(arrayOfString[0]);
/* 1510 */     int j = Integer.parseInt(arrayOfString[1]);
/*      */     
/* 1512 */     ArrayList<ad> arrayList = l.bB.ak;
/* 1513 */     ad ad = arrayList.get(i);
/*      */     
/* 1515 */     if (!paramBoolean) {
/*      */       
/* 1517 */       Object object1 = elementDocument.getMetadata("lastKeyPressed");
/* 1518 */       if (object1 == null) {
/*      */         
/* 1520 */         logWarn("keyBindingPopup_apply: no last key entered");
/*      */         return;
/*      */       } 
/* 1523 */       int k = ((Integer)object1).intValue();
/*      */       
/* 1525 */       int m = 0;
/*      */       
/* 1527 */       Object object2 = elementDocument.getMetadata("lastKeyModifiersPressed");
/* 1528 */       if (object2 != null)
/*      */       {
/* 1530 */         m = ((Integer)object2).intValue();
/*      */       }
/*      */ 
/*      */       
/* 1534 */       ad.a(k, j, m, true);
/*      */     }
/*      */     else {
/*      */       
/* 1538 */       boolean bool = false;
/*      */       
/* 1540 */       ad.a(0, j, bool, true);
/*      */     } 
/*      */ 
/*      */     
/* 1544 */     showKeyBinding();
/*      */     
/* 1546 */     closePopup();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void keyBindingPopup_onKeydown(int paramInt) {
/* 1553 */     l l = l.u();
/*      */     
/* 1555 */     ElementDocument elementDocument = this.libRocket.c();
/* 1556 */     if (elementDocument == null) {
/*      */       
/* 1558 */       logWarn("showKeyBindingActionPopup: popup==null");
/*      */       return;
/*      */     } 
/* 1561 */     Element element = elementDocument.getElementById("keyBindMessage");
/* 1562 */     if (element == null) {
/*      */       
/* 1564 */       logWarn("showKeyBindingActionPopup: keyBindMessage==null");
/*      */       
/*      */       return;
/*      */     } 
/* 1568 */     String str1 = "";
/*      */     
/* 1570 */     int i = this.guiEngine.h();
/*      */     
/* 1572 */     str1 = str1 + l.j(i);
/*      */     
/* 1574 */     if (paramInt == 111);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1579 */     if (paramInt == 0) {
/*      */       
/* 1581 */       logWarn("keyBindingPopup_onKeydown: skipping keycode 0");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1586 */     if (!l.i(paramInt)) {
/*      */       
/* 1588 */       elementDocument.setMetadata("lastKeyPressed", Integer.valueOf(paramInt));
/* 1589 */       elementDocument.setMetadata("lastKeyModifiersPressed", Integer.valueOf(i));
/*      */       
/* 1591 */       str1 = str1 + SlickToAndroidKeycodes.a(paramInt);
/*      */       
/* 1593 */       keyBindingPopup_apply(false);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1598 */     String str2 = "Key: " + str1;
/*      */     
/* 1600 */     element.setText(str2);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void showKeyBindingPopup() {
/* 1606 */     l l = l.u();
/*      */     
/* 1608 */     ElementDocument elementDocument = this.libRocket.c();
/* 1609 */     if (elementDocument == null) {
/*      */       
/* 1611 */       logWarn("showKeyBindingActionPopup: popup==null");
/*      */       return;
/*      */     } 
/* 1614 */     Element element = elementDocument.getElementById("keyBindMessage");
/* 1615 */     if (element == null) {
/*      */       
/* 1617 */       logWarn("showKeyBindingActionPopup: keyBindMessage==null");
/*      */       
/*      */       return;
/*      */     } 
/* 1621 */     String str1 = (String)elementDocument.getMetadata("mode");
/* 1622 */     String[] arrayOfString = str1.split(":");
/* 1623 */     int i = Integer.parseInt(arrayOfString[0]);
/* 1624 */     int j = Integer.parseInt(arrayOfString[1]);
/*      */     
/* 1626 */     ArrayList<ad> arrayList = l.bB.ak;
/* 1627 */     ad ad = arrayList.get(i);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1632 */     String str2 = "Press a key..";
/*      */     
/* 1634 */     element.setText(str2);
/*      */   }
/*      */ 
/*      */   
/*      */   public String getKeyBindingAction(int paramInt1, ad paramad, int paramInt2) {
/* 1639 */     String str = paramInt1 + ":" + paramInt2;
/*      */     
/* 1641 */     return "createAndShowPopup('settingsKeyBindingSet.rml', " + escapedString(str) + ", " + escapedString(paramad.a) + "); showKeyBindingPopup();";
/*      */   }
/*      */ 
/*      */   
/*      */   public void showKeyBinding() {
/* 1646 */     l l = l.u();
/*      */ 
/*      */     
/* 1649 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/*      */ 
/*      */     
/* 1652 */     elementDocument.setMetadata("event_onkeydown", "keyBindingPopup_onKeydown");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1657 */     Root$TableData root$TableData = new Root$TableData();
/*      */     
/* 1659 */     ArrayList<Root$TableRow> arrayList = root$TableData.rows;
/*      */ 
/*      */     
/* 1662 */     ArrayList<ad> arrayList1 = l.bB.ak;
/*      */ 
/*      */     
/* 1665 */     for (byte b = 0; b < arrayList1.size(); b++) {
/*      */       
/* 1667 */       ad ad = arrayList1.get(b);
/*      */       
/* 1669 */       if (ad.b) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1674 */         Root$TableRow root$TableRow = new Root$TableRow();
/* 1675 */         root$TableRow.addCell(ad.a);
/*      */         
/* 1677 */         if (ad.d()) {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1682 */           root$TableRow.addClass("rowHeader");
/*      */         }
/*      */         else {
/*      */           
/* 1686 */           root$TableRow.addCell(ad.a(0)).setLibrocketOnClick(getKeyBindingAction(b, ad, 0));
/* 1687 */           root$TableRow.addCell(ad.a(1)).setLibrocketOnClick(getKeyBindingAction(b, ad, 1));
/*      */         } 
/*      */         
/* 1690 */         arrayList.add(root$TableRow);
/*      */       } 
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
/* 1702 */     refreshTable("keysDiv", root$TableData);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1712 */   static bl loadSettingsStopwatch = new bl("LoadSettings", true);
/*      */   
/*      */   ArrayList lastSortedDiscoveredServers;
/*      */ 
/*      */   
/*      */   public void loadSettings() {
/* 1718 */     l l = l.u();
/*      */ 
/*      */     
/* 1721 */     loadSettingsStopwatch.a();
/*      */     
/* 1723 */     logDebug("loadSettings");
/* 1724 */     Element element = this.libRocket.getActiveElementById("body");
/*      */     
/* 1726 */     ArrayList arrayList = element.getAllNestedChildren();
/*      */     
/* 1728 */     for (Element element1 : arrayList) {
/*      */       
/* 1730 */       String str = element1.getAttribute("data-settings");
/* 1731 */       if (str != null) {
/*      */         
/* 1733 */         String str1 = element1.getId();
/* 1734 */         String str2 = element1.getAttribute("type", "unknown");
/*      */ 
/*      */ 
/*      */         
/* 1738 */         String str3 = l.by.getValueDynamic(str1);
/*      */ 
/*      */ 
/*      */         
/* 1742 */         if (str2.equals("checkbox")) {
/*      */           
/* 1744 */           if (Boolean.parseBoolean(str3) == true) {
/*      */             
/* 1746 */             element1.setAttribute("checked", "");
/*      */             
/*      */             continue;
/*      */           } 
/* 1750 */           element1.setAttribute("checked", null);
/*      */           
/*      */           continue;
/*      */         } 
/*      */         
/* 1755 */         element1.setAttribute("value", str3);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1761 */     loadSettingsStopwatch.d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void applyResolution() {
/* 1768 */     this.guiEngine.f();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void saveSettings() {
/* 1774 */     l l = l.u();
/*      */     
/* 1776 */     logDebug("saveSettings");
/* 1777 */     Element element = this.libRocket.getActiveElementById("body");
/*      */     
/* 1779 */     ArrayList arrayList = element.getAllNestedChildren();
/*      */     
/* 1781 */     for (Element element1 : arrayList) {
/*      */       
/* 1783 */       String str = element1.getAttribute("data-settings");
/* 1784 */       if (str != null) {
/*      */         
/* 1786 */         String str1 = element1.getId();
/* 1787 */         String str2 = element1.getAttribute("type", "unknown");
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1792 */         String str3 = null;
/*      */         
/* 1794 */         if (str2.equals("checkbox")) {
/*      */           
/* 1796 */           String str4 = element1.getAttribute("checked");
/* 1797 */           if (str4 == null || "false".equals(str4))
/*      */           {
/* 1799 */             str3 = "false";
/*      */           }
/*      */           else
/*      */           {
/* 1803 */             str3 = "true";
/*      */           }
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 1809 */           str3 = element1.getAttribute("value");
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         try {
/* 1819 */           l.by.setValueDynamic(str1, str3);
/*      */         }
/* 1821 */         catch (NumberFormatException numberFormatException) {
/*      */           
/* 1823 */           alert("Error:" + numberFormatException.getMessage());
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1831 */     this.guiEngine.f();
/*      */ 
/*      */     
/* 1834 */     j.a();
/*      */ 
/*      */     
/* 1837 */     a.e();
/*      */ 
/*      */     
/* 1840 */     this.guiEngine.g();
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
/*      */   public String hideStyle(boolean paramBoolean) {
/* 1853 */     if (paramBoolean)
/*      */     {
/* 1855 */       return "";
/*      */     }
/*      */ 
/*      */     
/* 1859 */     return "display:none;";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String hideIf(boolean paramBoolean) {
/* 1865 */     return hideClass(!paramBoolean);
/*      */   }
/*      */ 
/*      */   
/*      */   public String hideUnless(boolean paramBoolean) {
/* 1870 */     return hideClass(paramBoolean);
/*      */   }
/*      */ 
/*      */   
/*      */   public String hideClass(boolean paramBoolean) {
/* 1875 */     if (paramBoolean)
/*      */     {
/* 1877 */       return "";
/*      */     }
/*      */ 
/*      */     
/* 1881 */     return "hide";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String hideIfMobile() {
/* 1887 */     if (l.ak())
/*      */     {
/* 1889 */       return "hide";
/*      */     }
/* 1891 */     return "";
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean canResume() {
/* 1896 */     l l = l.u();
/*      */     
/* 1898 */     if (l != null)
/*      */     {
/* 1900 */       if (l.bp && !l.bq)
/*      */       {
/* 1902 */         return true;
/*      */       }
/*      */     }
/*      */     
/* 1906 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isMobile() {
/* 1911 */     return l.ak();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isIOS() {
/* 1916 */     return l.aJ;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isDesktop() {
/* 1921 */     return l.al();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isMac() {
/* 1926 */     return i.c;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean hasModSupport() {
/* 1931 */     return !l.aJ;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean hasReloadSupport() {
/* 1936 */     return !l.aJ;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   String restrictedString(String paramString) {
/* 1943 */     if (paramString == null)
/*      */     {
/* 1945 */       return null;
/*      */     }
/*      */ 
/*      */     
/* 1949 */     paramString = paramString.replace("'", ".");
/* 1950 */     paramString = paramString.replace("\"", ".");
/* 1951 */     paramString = paramString.replace("(", ".");
/* 1952 */     paramString = paramString.replace(")", ".");
/* 1953 */     paramString = paramString.replace(",", ".");
/* 1954 */     paramString = paramString.replace("<", ".");
/* 1955 */     paramString = paramString.replace(">", ".");
/*      */     
/* 1957 */     return "'" + paramString + "'";
/*      */   }
/*      */ 
/*      */   
/*      */   String escapedString(String paramString) {
/* 1962 */     paramString = paramString.replace("&", "&amp;");
/*      */     
/* 1964 */     paramString = paramString.replace("<", "&lt;");
/* 1965 */     paramString = paramString.replace(">", "&gt;");
/*      */     
/* 1967 */     paramString = paramString.replace("'", "&apos;");
/* 1968 */     paramString = paramString.replace("\"", "&quot;");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1973 */     paramString = paramString.replace("${", "$ {");
/*      */     
/* 1975 */     return "'" + paramString + "'";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   String htmlString(String paramString) {
/* 1981 */     paramString = paramString.replace("&", "&amp;");
/* 1982 */     paramString = paramString.replace("<", "&lt;");
/* 1983 */     paramString = paramString.replace(">", "&gt;");
/*      */ 
/*      */     
/* 1986 */     paramString = paramString.replace("\"", "&quot;");
/*      */     
/* 1988 */     paramString = paramString.replace("${", "$ {");
/*      */     
/* 1990 */     return "" + paramString + "";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void refreshServerList(String paramString1, String paramString2, String paramString3) {
/* 1997 */     l l = l.u();
/*      */     
/* 1999 */     if (paramString3 != null) {
/*      */       
/* 2001 */       Element element = this.libRocket.getActiveElementById(paramString3);
/* 2002 */       element.setText("Refreshing");
/*      */     } 
/*      */ 
/*      */     
/* 2006 */     Root$4 root$4 = new Root$4(this, paramString1, paramString2, paramString3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2013 */     l.bF.bl = null;
/*      */ 
/*      */     
/* 2016 */     n.a(root$4);
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
/*      */   public void displayServerList(String paramString1, String paramString2, String paramString3) {
/* 2037 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/* 2041 */     Element element1 = this.libRocket.getActiveElementById(paramString1);
/* 2042 */     Element element2 = this.libRocket.getActiveElementById(paramString2);
/*      */     
/* 2044 */     if (element1 == null) {
/*      */       
/* 2046 */       l.b("serverListData is null, we may have changed page");
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2056 */     Element element3 = element1;
/*      */     
/* 2058 */     ArrayList arrayList = n.k();
/*      */     
/* 2060 */     this.lastSortedDiscoveredServers = arrayList;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2089 */     String str1 = a.a("menus.lobby.gameState.battleroom", new Object[0]);
/* 2090 */     String str2 = a.a("menus.lobby.gameState.ingame", new Object[0]);
/* 2091 */     String str3 = a.a("menus.lobby.gameState.chat", new Object[0]);
/*      */ 
/*      */     
/* 2094 */     if (element3.getNumChildren() > arrayList.size()) {
/*      */       
/* 2096 */       for (int i = element3.getNumChildren() - 1; i >= arrayList.size(); i--) {
/*      */         
/* 2098 */         l.d("removing rowIndex:" + i);
/* 2099 */         element3.removeChild(element3.getChild(i));
/*      */       } 
/*      */       
/* 2102 */       if (element3.getNumChildren() != arrayList.size())
/*      */       {
/* 2104 */         l.b("-- Non matching size after clean up:" + element3.getNumChildren() + " vs " + arrayList.size());
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 2109 */     byte b = 0;
/* 2110 */     for (g g : arrayList) {
/*      */       String str8, str10;
/*      */       
/* 2113 */       Element element4 = null;
/*      */       
/* 2115 */       if (b < element3.getNumChildren())
/*      */       {
/* 2117 */         element4 = element3.getChild(b);
/*      */       }
/* 2119 */       if (element4 != null && element4.hasClassName("serverRowMessage")) {
/*      */         
/* 2121 */         l.d("removing non rowIndex:" + b);
/* 2122 */         element3.removeChild(element4);
/* 2123 */         element4 = null;
/*      */       } 
/*      */       
/* 2126 */       if (element4 != null && element4.findByClassName("rState") == null) {
/*      */         
/* 2128 */         l.d("removing non rowIndex with no rState:" + b);
/* 2129 */         element3.removeChild(element4);
/* 2130 */         element4 = null;
/*      */       } 
/*      */       
/* 2133 */       if (element4 == null) {
/*      */ 
/*      */ 
/*      */         
/* 2137 */         element4 = element2.clone();
/* 2138 */         element3.appendChild(element4);
/* 2139 */         element4.removeReference();
/*      */         
/* 2141 */         element4.setAttribute("onclick", "clickedServerRow(" + b + ")");
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 2146 */       String str4 = g.r;
/*      */       
/* 2148 */       if (str4 != null) {
/*      */         
/* 2150 */         str4 = str4.replace("battleroom", str1);
/* 2151 */         str4 = str4.replace("ingame", str2);
/* 2152 */         str4 = str4.replace("chat", str3);
/*      */       } 
/*      */       
/* 2155 */       boolean bool1 = false;
/* 2156 */       boolean bool2 = false;
/* 2157 */       boolean bool3 = false;
/* 2158 */       boolean bool4 = false;
/*      */       
/* 2160 */       if (g != null)
/*      */       {
/* 2162 */         if (g.w) {
/*      */           
/* 2164 */           bool1 = true;
/*      */           
/* 2166 */           if ("chat".equalsIgnoreCase(g.r))
/*      */           {
/* 2168 */             bool2 = true;
/*      */           }
/*      */           
/* 2171 */           if (g.d())
/*      */           {
/* 2173 */             bool4 = true;
/*      */           }
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/* 2179 */       int i = Color.a(255, 255, 255, 255);
/* 2180 */       String str5 = "serverRow serverRowData realServerRow ";
/*      */       
/* 2182 */       boolean bool5 = false;
/*      */       
/* 2184 */       if (g != null) {
/*      */         
/* 2186 */         if (bool1) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 2195 */           str5 = str5 + "dedicatedServerRow ";
/*      */           
/* 2197 */           if (bool2 || bool4)
/*      */           {
/* 2199 */             i = Color.a(255, 152, 236, 249);
/* 2200 */             str5 = str5 + "chatRow ";
/*      */           }
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 2206 */           if (g.h) {
/*      */             
/* 2208 */             i = Color.a(255, 240, 240, 240);
/* 2209 */             str5 = str5 + "openRow ";
/*      */           } 
/*      */           
/* 2212 */           if (g.a) {
/*      */             
/* 2214 */             i = Color.a(255, 229, 149, 35);
/* 2215 */             str5 = str5 + "lanRow ";
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/* 2220 */         if (g.a())
/*      */         {
/* 2222 */           str5 = str5 + "lastConnectedRow ";
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 2227 */         if (!bool2 && !bool4)
/*      */         {
/* 2229 */           if (!("" + l.c(true)).equals(g.j))
/*      */           {
/* 2231 */             bool3 = true;
/*      */           }
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2240 */       String str6 = "";
/*      */       
/* 2242 */       str6 = str6 + "color:" + f.f(i) + ";";
/*      */       
/* 2244 */       if (bool5) {
/*      */         
/* 2246 */         str6 = str6 + "font-weight: bold;";
/* 2247 */         str5 = str5 + "boldRow ";
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 2252 */       element4.compareAndSetClassNames(str5);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2260 */       element4.findByClassName("rState").compareAndSetText(str4);
/*      */       
/* 2262 */       String str7 = f.a(g.m, 15);
/* 2263 */       element4.findByClassName("rHost").compareAndSetText(str7);
/*      */ 
/*      */ 
/*      */       
/* 2267 */       if (g.s == "?") {
/*      */         
/* 2269 */         str8 = "?";
/*      */       }
/*      */       else {
/*      */         
/* 2273 */         str8 = g.s + "\\" + g.t;
/*      */       } 
/* 2275 */       element4.findByClassName("rPlayers").compareAndSetText(f.a(str8, 15));
/*      */ 
/*      */       
/* 2278 */       String str9 = f.a(g.d(g.p), 40);
/*      */       
/* 2280 */       if (str9 == null)
/*      */       {
/* 2282 */         str9 = "";
/*      */       }
/* 2284 */       element4.findByClassName("rMap").compareAndSetText(str9);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2289 */       if ("ANY".equalsIgnoreCase(g.k)) {
/*      */         
/* 2291 */         str10 = g.k;
/*      */       }
/*      */       else {
/*      */         
/* 2295 */         str10 = "v" + f.a(g.k, 8);
/*      */       } 
/*      */       
/* 2298 */       Element element5 = element4.findByClassName("rVersion");
/*      */ 
/*      */       
/* 2301 */       element5.compareAndSetText(str10);
/* 2302 */       String str11 = "";
/* 2303 */       String str12 = "cell rVersion ";
/*      */       
/* 2305 */       if (bool3) {
/*      */         
/* 2307 */         str11 = "color:" + f.f(Color.a(255, 155, 147, 147)) + ";";
/* 2308 */         str12 = str12 + "nonMatchingRow ";
/*      */       }
/*      */       else {
/*      */         
/* 2312 */         str11 = "color:" + f.f(i) + ";";
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 2317 */       element5.compareAndSetClassNames(str12);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2328 */       String str13 = "";
/* 2329 */       if (g.h) {
/*      */         
/* 2331 */         if (g.l)
/*      */         {
/* 2333 */           str13 = "P";
/*      */         }
/*      */         else
/*      */         {
/* 2337 */           str13 = "Y";
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 2342 */         str13 = "N";
/*      */       } 
/*      */       
/* 2345 */       if (g.a)
/*      */       {
/* 2347 */         str13 = "L";
/*      */       }
/*      */       
/* 2350 */       Element element6 = element4.findByClassName("rOpen");
/* 2351 */       element6.compareAndSetText(str13);
/*      */       
/* 2353 */       String str14 = "";
/* 2354 */       String str15 = "cell rOpen ";
/*      */       
/* 2356 */       if (!g.h && !g.a) {
/*      */         
/* 2358 */         str14 = "color:" + f.f(Color.a(255, 155, 147, 147)) + ";";
/* 2359 */         str15 = str15 + "notOpenRow ";
/*      */       }
/*      */       else {
/*      */         
/* 2363 */         str14 = "color:" + f.f(i) + ";";
/*      */       } 
/*      */ 
/*      */       
/* 2367 */       element6.compareAndSetClassNames(str15);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2376 */       b++;
/*      */     } 
/*      */     
/* 2379 */     if (arrayList.size() == 0)
/*      */     {
/* 2381 */       if (l.bF.bl != null) {
/*      */         
/* 2383 */         String str = "ERROR: " + l.bF.bl;
/*      */         
/* 2385 */         Element element = null;
/*      */         
/* 2387 */         element = element2.clone();
/* 2388 */         element3.appendChild(element);
/* 2389 */         element.removeReference();
/*      */ 
/*      */ 
/*      */         
/* 2393 */         element.setText(str);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 2398 */     if (paramString3 != null) {
/*      */       
/* 2400 */       Element element = this.libRocket.getActiveElementById(paramString3);
/* 2401 */       element.setText("Refresh");
/*      */     } 
/*      */ 
/*      */     
/* 2405 */     l.b("DONE");
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
/*      */   public void clickedServerRow(int paramInt) {
/* 2419 */     g g = this.lastSortedDiscoveredServers.get(paramInt);
/*      */     
/* 2421 */     clickedServer(g.b);
/*      */   }
/*      */ 
/*      */   
/*      */   public void clickedServer(String paramString) {
/*      */     g g;
/*      */     String str3;
/* 2428 */     if (getAlertOrPopup() != null) {
/*      */       
/* 2430 */       logWarn("clickedServer: getAlertOrPopup!=null");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*      */     try {
/* 2437 */       g = n.a(paramString);
/*      */     }
/* 2439 */     catch (IOException iOException) {
/*      */       
/* 2441 */       throw new RuntimeException(iOException);
/*      */     } 
/*      */     
/* 2444 */     if (g == null) {
/*      */       
/* 2446 */       logWarn("clickedServer: server==null");
/*      */       
/* 2448 */       alert("That server no longer exists");
/*      */       
/*      */       return;
/*      */     } 
/* 2452 */     String str1 = g.b();
/*      */     
/* 2454 */     String str2 = "Join Server?";
/*      */ 
/*      */     
/* 2457 */     if (g.d()) {
/*      */       
/* 2459 */       str3 = "[onenter]Open Link:";
/*      */       
/* 2461 */       str3 = str3 + "closePopup(); openWhitelistedLink(" + restrictedString(g.c()) + ");";
/*      */     }
/* 2463 */     else if (!g.a) {
/*      */       
/* 2465 */       str3 = "[onenter]Join:";
/*      */       
/* 2467 */       str3 = str3 + "closePopup(); joinServerWithId(" + restrictedString(g.e()) + "," + restrictedString(g.b) + ");";
/*      */     }
/*      */     else {
/*      */       
/* 2471 */       str3 = "[onenter]Join over LAN:";
/*      */       
/* 2473 */       str3 = str3 + "closePopup(); joinServerWithId(" + restrictedString(g.f()) + "," + restrictedString(g.b) + ");";
/*      */     } 
/*      */     
/* 2476 */     boolean bool = true;
/* 2477 */     showPopup((String)null, str1, bool, str3, (String)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void hideKeyboard() {
/* 2484 */     this.guiEngine.l();
/*      */   }
/*      */ 
/*      */   
/*      */   public void saveGame(String paramString) {
/* 2489 */     closePopup();
/*      */     
/* 2491 */     hideKeyboard();
/*      */     
/* 2493 */     paramString = paramString.replace(".", "_");
/* 2494 */     paramString = paramString.replace("/", "_");
/* 2495 */     paramString = paramString.replace("\\", "_");
/*      */ 
/*      */ 
/*      */     
/* 2499 */     l l = l.u();
/*      */     
/* 2501 */     l.bI.a(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void exportMap(String paramString) {
/* 2510 */     closePopup();
/* 2511 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2520 */     paramString = paramString.replace(".", "_");
/* 2521 */     paramString = paramString.replace("/", "_");
/* 2522 */     paramString = paramString.replace("\\", "_");
/* 2523 */     paramString = paramString.replace("|", "_");
/* 2524 */     paramString = paramString.replace("?", "_");
/*      */ 
/*      */     
/*      */     try {
/* 2528 */       l.bt.b(l.cS, "/SD/rusted_warfare_maps/" + paramString + ".tmx");
/*      */     }
/* 2530 */     catch (f f) {
/*      */       
/* 2532 */       showAlert("Failed to export map. error: " + f.getMessage());
/*      */       
/*      */       return;
/* 2535 */     } catch (IOException iOException) {
/*      */       
/* 2537 */       showAlert("Failed to export map. IO error: " + iOException.getMessage());
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 2542 */     showAlert("Map exported");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadGame(String paramString) {
/* 2550 */     l l = l.u();
/*      */     
/* 2552 */     l.be = false;
/*      */     
/* 2554 */     if (l.bI.b(paramString, false))
/*      */     {
/* 2556 */       resumeNonMenu();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void loadGameEdit(String paramString) {
/* 2562 */     l l = l.u();
/*      */     
/* 2564 */     String str = paramString;
/*      */     
/* 2566 */     e e1 = null;
/* 2567 */     if (a.b())
/*      */     {
/* 2569 */       e1 = new e("Share", new Root$5(this, l, paramString));
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
/*      */     
/* 2583 */     e e2 = new e("Delete", new Root$6(this, l, paramString));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2598 */     boolean bool = true;
/* 2599 */     showPopupWithButtons((String)null, str, bool, e1, e2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadReplay(String paramString) {
/* 2608 */     l l = l.u();
/*      */     
/* 2610 */     l.be = false;
/*      */     
/* 2612 */     if (l.bJ.c(paramString))
/*      */     {
/* 2614 */       resumeNonMenu();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadReplayEdit(String paramString) {
/* 2622 */     l l = l.u();
/*      */     
/* 2624 */     String str = paramString;
/*      */     
/* 2626 */     e e1 = null;
/* 2627 */     if (a.b())
/*      */     {
/* 2629 */       e1 = new e("Share", new Root$7(this, l, paramString));
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
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2646 */     e e2 = new e("Delete", new Root$8(this, l, paramString));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2661 */     boolean bool = true;
/* 2662 */     showPopupWithButtons((String)null, str, bool, e1, e2);
/*      */   }
/*      */ 
/*      */   
/*      */   public void makeSaveGamePopup(String paramString) {
/*      */     String str3;
/* 2668 */     l l = l.u();
/*      */     
/* 2670 */     String str1 = "Save Game";
/* 2671 */     String str2 = "Enter a name to save the game under";
/*      */ 
/*      */     
/* 2674 */     if (paramString == null) {
/*      */       
/* 2676 */       str3 = l.ac() + " (" + f.a("d MMM yyyy HH-mm-ss") + ")";
/*      */       
/* 2678 */       str3 = str3.replace("  ", " ");
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 2683 */       str3 = paramString;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2688 */     showInputPopup(str1, str2, str3, "[onenter]Save:saveGame(getPopupText())", (String)null);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void makeExportMapGamePopup(String paramString) {
/*      */     String str3;
/* 2759 */     l l = l.u();
/*      */     
/* 2761 */     String str1 = "Export Map";
/* 2762 */     String str2 = "Enter a name to export the map as";
/*      */ 
/*      */     
/* 2765 */     if (paramString == null) {
/*      */       
/* 2767 */       str3 = "New " + l.ac() + " - " + f.a("d MMM yyyy");
/*      */       
/* 2769 */       str3 = str3.replace("  ", " ");
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 2774 */       str3 = paramString;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2779 */     showInputPopup(str1, str2, str3, "[onenter]Export:exportMap(getPopupText())", (String)null);
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
/*      */   public void makeSendMessagePopup() {
/* 2791 */     l l = l.u();
/*      */     
/* 2793 */     String str1 = "Send Message";
/*      */ 
/*      */     
/* 2796 */     String str2 = "[onenter]Send: sendChatMessage(getPopupText()); closePopup();";
/*      */     
/* 2798 */     String str3 = "Switch - Team only: makeSendTeamMessagePopupWithDefaultText(getPopupText()); ";
/*      */ 
/*      */     
/* 2801 */     String str4 = "";
/*      */     
/* 2803 */     showInputPopup(str1, str4, "", str2, str3);
/*      */   }
/*      */ 
/*      */   
/*      */   public void makeSendTeamMessagePopup() {
/* 2808 */     makeSendTeamMessagePopupWithDefaultText("");
/*      */   }
/*      */ 
/*      */   
/*      */   public void makeSendTeamMessagePopupWithDefaultText(String paramString) {
/* 2813 */     l l = l.u();
/* 2814 */     String str1 = "Send Team Message";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2823 */     String str2 = "+ Ping Map:sendTeamChatMessageAndPing(getPopupText()); closePopup();";
/*      */     
/* 2825 */     String str3 = "";
/* 2826 */     showInputPopup(str1, str3, paramString, "[onenter]Send Team:sendTeamChatMessage(getPopupText()); closePopup();", str2);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void sendChatMessage(String paramString) {
/* 2832 */     l l = l.u();
/*      */     
/* 2834 */     this.guiEngine.l();
/*      */     
/* 2836 */     if (paramString == null || paramString.trim().equals("")) {
/*      */       return;
/*      */     }
/*      */     
/* 2840 */     l.bF.k(paramString);
/* 2841 */     l.bA.p = false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void sendTeamChatMessageAndPing(String paramString) {
/* 2846 */     sendTeamChatMessage(paramString);
/*      */     
/* 2848 */     l l = l.u();
/* 2849 */     l.bA.G();
/*      */   }
/*      */ 
/*      */   
/*      */   public void sendTeamChatMessage(String paramString) {
/* 2854 */     l l = l.u();
/*      */     
/* 2856 */     this.guiEngine.l();
/*      */     
/* 2858 */     if (paramString == null || paramString.trim().equals("")) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 2863 */     l.bF.j(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void receiveChatMessage(int paramInt, String paramString1, String paramString2, c paramc) {
/* 2870 */     refreshChat();
/*      */   }
/*      */ 
/*      */   
/*      */   public void refreshChat() {
/* 2875 */     l l = l.u();
/*      */ 
/*      */     
/* 2878 */     Element element1 = this.libRocket.getActiveElementById("chatLogHistory");
/* 2879 */     if (element1 == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 2885 */     boolean bool = element1.getAttributeBoolean("reversed", false);
/*      */     
/* 2887 */     if (l.bF.D) {
/*      */ 
/*      */       
/* 2890 */       Element element = this.libRocket.getActiveElementById("chatBox");
/* 2891 */       if (element != null)
/*      */       {
/* 2893 */         element.hide();
/*      */       }
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
/* 2906 */     element1.setInnerRML("");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2911 */     ConcurrentLinkedQueue concurrentLinkedQueue = l.bF.aL.b();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2917 */     StringBuffer stringBuffer = new StringBuffer();
/*      */ 
/*      */     
/* 2920 */     for (b b : concurrentLinkedQueue) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2930 */       if (bool) {
/*      */         
/* 2932 */         stringBuffer.insert(0, "<div>" + b.b() + "</div>");
/*      */         
/*      */         continue;
/*      */       } 
/* 2936 */       stringBuffer.append("<div>" + b.b() + "</div>");
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2941 */     stringBuffer.append("<div id='chatLastRowSpacer'></div>");
/*      */     
/* 2943 */     element1.setInnerRML(stringBuffer.toString());
/*      */ 
/*      */     
/* 2946 */     element1.loadCharsetIfNeededWithCurrentText();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2961 */     Element element2 = this.libRocket.getActiveElementById("chatLastRowSpacer");
/*      */ 
/*      */     
/* 2964 */     if (element2 != null)
/*      */     {
/* 2966 */       element2.scrollIntoView(false);
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
/*      */   public void trace(String paramString) {
/* 2979 */     l.d("Trace:" + paramString);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void updateTableTextOnly(String paramString, Root$TableData paramRoot$TableData1, Root$TableData paramRoot$TableData2) {
/* 3128 */     ArrayList<Root$TableRow> arrayList = paramRoot$TableData1.rows;
/* 3129 */     Element element1 = this.libRocket.getActiveElementById(paramString);
/* 3130 */     if (element1 == null) {
/*      */       
/* 3132 */       l.b("updateTableText: tableElement:" + paramString + " is null, we may have changed page");
/*      */       
/*      */       return;
/*      */     } 
/* 3136 */     Element element2 = element1.getElementById("tableListData");
/*      */ 
/*      */ 
/*      */     
/* 3140 */     for (byte b = 0; b < arrayList.size(); b++) {
/*      */       
/* 3142 */       Root$TableRow root$TableRow = arrayList.get(b);
/*      */       
/* 3144 */       for (byte b1 = 0; b1 < root$TableRow.tableCells.size(); b1++) {
/*      */         
/* 3146 */         Root$TableCell root$TableCell = root$TableRow.tableCells.get(b1);
/*      */         
/* 3148 */         Element element3 = element2.getChild(b);
/* 3149 */         if (element3 == null) {
/*      */           
/* 3151 */           l.b("updateTableText failed to get row " + b);
/*      */           return;
/*      */         } 
/* 3154 */         Element element4 = element3.getChild(b1);
/* 3155 */         if (element4 == null) {
/*      */           
/* 3157 */           l.b("updateTableText failed to get cell " + b1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           return;
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3170 */         element4.compareAndSetText(root$TableCell.text);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void refreshTable(String paramString, Root$TableData paramRoot$TableData) {
/* 3180 */     ArrayList arrayList = paramRoot$TableData.rows;
/*      */     
/* 3182 */     Element element1 = this.libRocket.getActiveElementById(paramString);
/* 3183 */     if (element1 == null) {
/*      */       
/* 3185 */       l.b("refreshTable: tableElement:" + paramString + " is null, we may have changed page");
/*      */       
/*      */       return;
/*      */     } 
/* 3189 */     Element element2 = element1.getElementById("tableRowTemplateHolder");
/* 3190 */     Element element3 = element1.getElementById("tableListData");
/*      */     
/* 3192 */     Element element4 = element2.findByClassName("rowTemplate").getChild(0);
/* 3193 */     Element element5 = element2.findByClassName("cellTemplate").getChild(0);
/*      */ 
/*      */     
/* 3196 */     element3.setInnerRML("");
/*      */     
/* 3198 */     for (Root$TableRow root$TableRow : arrayList) {
/*      */       
/* 3200 */       Element element = element4.cloneAndFix();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3206 */       if (root$TableRow.librocketOnClick != null)
/*      */       {
/* 3208 */         element.setAttribute("onclick", root$TableRow.librocketOnClick);
/*      */       }
/*      */       
/* 3211 */       if (root$TableRow.extraClasses != null)
/*      */       {
/* 3213 */         element.addClass(root$TableRow.extraClasses);
/*      */       }
/*      */ 
/*      */       
/* 3217 */       for (Root$TableCell root$TableCell : root$TableRow.tableCells) {
/*      */         
/* 3219 */         Element element6 = element5.cloneAndFix();
/*      */ 
/*      */         
/* 3222 */         element6.compareAndSetText(root$TableCell.text);
/*      */         
/* 3224 */         if (root$TableCell.librocketOnClick != null) {
/*      */           
/* 3226 */           element6.setAttribute("onclick", root$TableCell.librocketOnClick);
/* 3227 */           element6.addClass("clickablecell");
/*      */         } 
/*      */         
/* 3230 */         if (root$TableCell.classes != null)
/*      */         {
/* 3232 */           element6.addClass(root$TableCell.classes);
/*      */         }
/*      */         
/* 3235 */         if (root$TableCell.color != null)
/*      */         {
/* 3237 */           element6.setAttribute("style", "color:" + f.f(root$TableCell.color.intValue()) + ";");
/*      */         }
/*      */ 
/*      */         
/* 3241 */         element.appendChild(element6);
/*      */         
/* 3243 */         element6.removeReference();
/*      */       } 
/*      */       
/* 3246 */       element3.appendChild(element);
/*      */       
/* 3248 */       element.removeReference();
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
/*      */   public ElementDocument createAndShowPopup(String paramString1, Object paramObject, String paramString2) {
/* 3260 */     return this.libRocket.a(paramString1, paramObject, paramString2, true);
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
/*      */   public void showMainMenu() {
/* 3278 */     (l.u()).bA.p = false;
/* 3279 */     a.a().b();
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
/*      */   public void onEnter() {
/* 3299 */     ElementDocument elementDocument = this.libRocket.g();
/*      */     
/* 3301 */     if (elementDocument == null) {
/*      */       
/* 3303 */       l.d("onEnter: elementDocument==null");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 3309 */     ArrayList arrayList = elementDocument.getAllNestedChildren();
/*      */     
/* 3311 */     for (Element element : arrayList) {
/*      */       
/* 3313 */       String str = element.getAttribute("onenter");
/* 3314 */       if (str != null)
/*      */       {
/* 3316 */         if (element.isFocused())
/*      */         {
/* 3318 */           this.scriptEngine.processScript(str);
/*      */         }
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void scrollFromFocusedElement(float paramFloat) {
/* 3328 */     ElementDocument elementDocument = this.libRocket.g();
/*      */     
/* 3330 */     if (elementDocument == null) {
/*      */       
/* 3332 */       l.d("onEnter: elementDocument==null");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 3337 */     Element element = elementDocument.getTopLevelFocusedElement();
/*      */ 
/*      */ 
/*      */     
/* 3341 */     if (element == null) {
/*      */       
/* 3343 */       l.d("focusedElement: Not found");
/*      */       
/*      */       return;
/*      */     } 
/* 3347 */     ArrayList arrayList = elementDocument.getChainFromChildElement(element);
/*      */     
/* 3349 */     if (arrayList == null) {
/*      */       
/* 3351 */       l.d("scrollFromFocusedElement: Failed to find chain");
/*      */       
/*      */       return;
/*      */     } 
/* 3355 */     for (Element element1 : arrayList) {
/*      */       
/* 3357 */       boolean bool = false;
/* 3358 */       if ("scrollDiv".equals(element1.getId()))
/*      */       {
/* 3360 */         bool = true;
/*      */       }
/* 3362 */       if (element1.hasClassName("slider"))
/*      */       {
/* 3364 */         bool = true;
/*      */       }
/*      */       
/* 3367 */       if (bool) {
/*      */         
/* 3369 */         float f = element1.getScrollTop();
/*      */         
/* 3371 */         f += paramFloat;
/*      */         
/* 3373 */         element1.setScrollTop(f);
/*      */ 
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 3382 */     l.d("Found no slider element to offset");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isSliderOrUIElementSelected() {
/* 3388 */     ElementDocument elementDocument = this.libRocket.g();
/*      */     
/* 3390 */     if (elementDocument == null) {
/*      */       
/* 3392 */       l.d("onEnter: elementDocument==null");
/* 3393 */       return false;
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
/* 3405 */     Element element = elementDocument.getTopLevelFocusedElement();
/*      */     
/* 3407 */     if (element != null) {
/*      */       
/* 3409 */       Element element1 = element;
/*      */       
/* 3411 */       String str = element1.getTagName();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3418 */       boolean bool = false;
/* 3419 */       if ("scrollDiv".equals(element1.getId()))
/*      */       {
/* 3421 */         bool = true;
/*      */       }
/* 3423 */       if (element1.hasClassName("slider"))
/*      */       {
/* 3425 */         bool = true;
/*      */       }
/*      */       
/* 3428 */       if ("input".equals(str))
/*      */       {
/* 3430 */         if ("range".equals(element1.getAttribute("type", "text")))
/*      */         {
/* 3432 */           bool = true;
/*      */         }
/*      */       }
/*      */       
/* 3436 */       if (bool) {
/*      */         
/* 3438 */         l.d("Slider element: true");
/* 3439 */         return true;
/*      */       } 
/*      */ 
/*      */       
/* 3443 */       l.d("Slider element: false");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3476 */     l.d("Slider element: no element focused");
/*      */ 
/*      */     
/* 3479 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void onTouch() {
/* 3485 */     ElementDocument elementDocument = this.libRocket.g();
/*      */     
/* 3487 */     if (elementDocument == null) {
/*      */       
/* 3489 */       l.d("onEnter: elementDocument==null");
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */     
/* 3497 */     ArrayList arrayList = elementDocument.getAllNestedChildren();
/*      */     
/* 3499 */     for (Element element : arrayList) {
/*      */       
/* 3501 */       String str = element.getAttribute("type");
/* 3502 */       if ("text".equals(str))
/*      */       {
/*      */ 
/*      */         
/* 3506 */         if (element.isFocused())
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 3512 */           this.guiEngine.k();
/*      */         }
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onEscape() {
/* 3523 */     ElementDocument elementDocument = this.libRocket.g();
/* 3524 */     if (elementDocument == null) {
/*      */       
/* 3526 */       l.d("onEscape: elementDocument==null");
/*      */       
/*      */       return;
/*      */     } 
/* 3530 */     boolean bool = false;
/*      */     
/* 3532 */     ArrayList arrayList = elementDocument.getAllNestedChildren();
/* 3533 */     for (Element element : arrayList) {
/*      */       
/* 3535 */       String str = element.getAttribute("click_on_escape");
/* 3536 */       if (str != null) {
/*      */ 
/*      */         
/* 3539 */         element.click();
/* 3540 */         bool = true;
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/*      */     
/* 3546 */     if (bool) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 3552 */     if (closePopup()) {
/*      */       return;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void askQuitGame() {
/* 3563 */     closePopup();
/*      */ 
/*      */     
/* 3566 */     String str1 = "Are you sure you want to quit?";
/*      */     
/* 3568 */     String str2 = "";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3573 */     String str3 = "[onenter]Quit:";
/* 3574 */     str3 = str3 + "closePopup(); exit();";
/*      */     
/* 3576 */     boolean bool = true;
/* 3577 */     showPopup(str1, str2, bool, str3, (String)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCurrentDocumentPath() {
/* 3587 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/* 3588 */     if (elementDocument == null)
/*      */     {
/* 3590 */       return null;
/*      */     }
/* 3592 */     return elementDocument.documentPath;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCurrentPopupPath() {
/* 3597 */     ElementDocument elementDocument = this.libRocket.c();
/* 3598 */     if (elementDocument == null)
/*      */     {
/* 3600 */       return null;
/*      */     }
/* 3602 */     return elementDocument.documentPath;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCreditsText() {
/* 3609 */     return "Credits goes here";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void runRunnable(Runnable paramRunnable) {
/* 3616 */     logDebug("runRunnable");
/*      */     
/* 3618 */     if (paramRunnable == null)
/*      */     {
/* 3620 */       logDebug("runnable==null");
/*      */     }
/*      */     
/* 3623 */     paramRunnable.run();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isLinux() {
/* 3631 */     return (g.a() == h.c);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean not(boolean paramBoolean) {
/* 3636 */     return !paramBoolean;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean and(boolean paramBoolean1, boolean paramBoolean2) {
/* 3641 */     return (paramBoolean1 && paramBoolean2);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean or(boolean paramBoolean1, boolean paramBoolean2) {
/* 3646 */     return (paramBoolean1 || paramBoolean2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void showBattleroom() {
/* 3653 */     String str = "battleroom.rml";
/*      */     
/* 3655 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/* 3656 */     boolean bool = true;
/*      */     
/* 3658 */     if (elementDocument != null)
/*      */     {
/* 3660 */       if (str.equals(elementDocument.documentPath)) {
/*      */         
/* 3662 */         l.d("Already on battleroom page");
/* 3663 */         bool = false;
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 3668 */     this.libRocket.setDocument(str, null, bool);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDocument(String paramString) {
/* 3674 */     this.libRocket.setDocument(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void playNextMusicTrack() {
/* 3685 */     (l.u()).bv.e();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void toggleMusic() {
/* 3692 */     (l.u()).bv.u = !(l.u()).bv.u;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void updateMusicButton(String paramString) {
/* 3701 */     Element element = this.libRocket.getActiveElementById(paramString);
/* 3702 */     if (element != null)
/*      */     {
/* 3704 */       if ((l.u()).bv.u) {
/*      */         
/* 3706 */         element.setText(">");
/*      */       }
/*      */       else {
/*      */         
/* 3710 */         element.setText("||");
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
/*      */   public void setSandboxMapFromPopup(String paramString) {
/* 3728 */     l l = l.u();
/*      */     
/* 3730 */     closePopup();
/*      */     
/* 3732 */     String str = paramString;
/*      */     
/* 3734 */     this.libRocket.getActiveDocument().setMetadata("mode", paramString);
/*      */ 
/*      */     
/* 3737 */     showLevelOptions();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3742 */     this.libRocket.getActiveDocument().findByClassName("mapImage").setAttribute("src", getMapThumbnail(str));
/* 3743 */     this.libRocket.getActiveDocument().findByClassName("mapText").setText(getMapNameFromPath(str));
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
/*      */   public void showSandboxMapSelectOnChange() {
/* 3755 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/* 3756 */     Element element = elementDocument.getElementById("typeSelector");
/*      */     
/* 3758 */     int i = Integer.parseInt(element.getValue());
/*      */     
/* 3760 */     int j = ((Integer)elementDocument.getMetadata("lastTypeSelector", Integer.valueOf(0))).intValue();
/*      */ 
/*      */     
/* 3763 */     this.libRocket.getActiveDocument().setMetadata("lastTypeSelector", Integer.valueOf(i));
/*      */     
/* 3765 */     if (i != j)
/*      */     {
/* 3767 */       showSandboxMapSelect();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void showSandboxMapSelect() {
/* 3776 */     String str = getModeMapPath((Element)this.libRocket.getActiveDocument(), "typeSelector");
/*      */     
/* 3778 */     showMapPopup(str, "setSandboxMapFromPopup");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getModeMapPath(Element paramElement, String paramString) {
/*      */     int i;
/* 3785 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/* 3789 */     if (paramString == null) {
/*      */       
/* 3791 */       if (l.bF.aH.a == null)
/*      */       {
/* 3793 */         l.b("getModeMapPath: currentType==0");
/* 3794 */         i = 0;
/*      */       }
/*      */       else
/*      */       {
/* 3798 */         i = l.bF.aH.a.ordinal();
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 3804 */       Element element = paramElement.getElementById(paramString);
/*      */       
/* 3806 */       if (element == null) {
/*      */         
/* 3808 */         l.f("getModeMapPath: typeSelector==null");
/* 3809 */         i = 0;
/*      */       }
/*      */       else {
/*      */         
/* 3813 */         i = element.getValueAsInt(Integer.valueOf(0)).intValue();
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 3819 */     if (i == 0)
/*      */     {
/* 3821 */       return "maps/skirmish";
/*      */     }
/* 3823 */     if (i == 1)
/*      */     {
/* 3825 */       return "/SD/rusted_warfare_maps";
/*      */     }
/*      */     
/* 3828 */     if (i == 2)
/*      */     {
/* 3830 */       return "saves";
/*      */     }
/*      */ 
/*      */     
/* 3834 */     throw new RuntimeException("Unknown typeIndex:" + i);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void event_unicodeEntered() {
/* 3844 */     ElementDocument elementDocument = this.libRocket.g();
/*      */     
/* 3846 */     if (elementDocument != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3856 */       Element element = elementDocument.findByClassName("textinputUnicodeWrap");
/*      */       
/* 3858 */       if (element != null)
/*      */       {
/*      */         
/* 3861 */         element.compareAndAddClass("unicodeWasTyped");
/*      */       
/*      */       }
/*      */       else
/*      */       {
/* 3866 */         l.d("event_unicodeEntered: missing textinput");
/*      */       
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 3873 */       l.d("event_unicodeEntered: missing document");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isVersionBeta() {
/* 3881 */     l l = l.u();
/* 3882 */     return l.j();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Object ifCondition(boolean paramBoolean, Object paramObject1, Object paramObject2) {
/* 3888 */     return paramBoolean ? paramObject1 : paramObject2;
/*      */   }
/*      */ 
/*      */   
/*      */   public String i(String paramString) {
/* 3893 */     return a.a(paramString, new Object[0]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void openLinkToCG(String paramString) {
/* 3900 */     String str = "http://corrodinggames.com/" + paramString;
/* 3901 */     openWhitelistedLink(str);
/*      */   }
/*      */ 
/*      */   
/*      */   public void openWhitelistedLink(String paramString) {
/* 3906 */     l.d("Opening link:" + paramString);
/*      */     
/* 3908 */     if (!paramString.startsWith("http://corrodinggames.com/") && 
/* 3909 */       !paramString.startsWith("https://corrodinggames.com/") && 
/* 3910 */       !paramString.startsWith("http://corrodinggames.net/") && 
/* 3911 */       !paramString.startsWith("https://corrodinggames.net/")) {
/*      */ 
/*      */       
/* 3914 */       l.d("Not in whitelist");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 3919 */     if (this.guiEngine.b(paramString)) {
/*      */       
/* 3921 */       alert("Opened link: " + paramString);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 3926 */     alert("Sorry couldn't load browser to: " + paramString + " please navigate manually");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeGameLog(String paramString) {
/* 3987 */     StringBuffer stringBuffer = new StringBuffer();
/*      */     
/* 3989 */     boolean bool = false;
/*      */ 
/*      */     
/* 3992 */     LinkedList linkedList = a.a().j();
/*      */     
/* 3994 */     if (linkedList == null) {
/*      */       
/* 3996 */       bool = true;
/*      */     }
/*      */     else {
/*      */       
/* 4000 */       synchronized (linkedList) {
/*      */         
/* 4002 */         int i = f.b(0, linkedList.size() - 3000);
/*      */         
/* 4004 */         ListIterator<String> listIterator = linkedList.listIterator(i);
/* 4005 */         while (listIterator.hasNext()) {
/*      */           
/* 4007 */           stringBuffer.append(Element.excapeHTML(listIterator.next()));
/* 4008 */           stringBuffer.append("<br/>");
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4017 */     if (bool) {
/*      */       
/* 4019 */       alert("Internal game logging not active");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 4024 */     l.d("writeGameLog ready");
/*      */     
/* 4026 */     Element element = this.libRocket.getActiveElementById(paramString);
/*      */     
/* 4028 */     if (element == null) {
/*      */       
/* 4030 */       l.d("Failed to find: " + paramString);
/*      */       
/*      */       return;
/*      */     } 
/* 4034 */     element.setInnerRML(stringBuffer.toString());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPageMinWidthAndHeight(float paramFloat1, float paramFloat2) {
/* 4043 */     l.d("setPageMinWidthAndHeight(" + paramFloat1 + ", " + paramFloat2 + ")");
/*      */     
/* 4045 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/* 4046 */     if (elementDocument == null) {
/*      */       
/* 4048 */       l.d("setPageMinWidthAndHeight - no page");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 4054 */     elementDocument.setMetadataFloat("minWidth", Float.valueOf(paramFloat1));
/* 4055 */     elementDocument.setMetadataFloat("minHeight", Float.valueOf(paramFloat2));
/*      */ 
/*      */     
/* 4058 */     this.guiEngine.m();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void importFilePopup() {
/* 4067 */     Root$9 root$9 = new Root$9(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4082 */     a.a(root$9);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\librocket\scripts\Root.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */