/*      */ package com.corrodinggames.librocket.scripts;
/*      */ 
/*      */ import com.Element;
/*      */ import com.ElementDocument;
/*      */ import com.corrodinggames.rts.a.g;
/*      */ import com.corrodinggames.rts.a.h;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.gameFramework.c.a;
/*      */ import com.corrodinggames.rts.gameFramework.e.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g.ah;
/*      */ import com.corrodinggames.rts.gameFramework.g.ai;
/*      */ import com.corrodinggames.rts.gameFramework.g.ak;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.l.a;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Multiplayer
/*      */   extends ScriptContext
/*      */ {
/*      */   Root root;
/*      */   String[] currentDropdownRawArray;
/*      */   Root$TableData lastPlayerTable;
/*      */   boolean useMapDropdown;
/*      */   
/*      */   void updateMapDropdown(Element paramElement, String paramString1, String paramString2) {
/*      */     l l = l.u();
/*      */     Element element1 = paramElement.getElementById(paramString2);
/*      */     int i = element1.getValueAsInt(Integer.valueOf(0)).intValue();
/*      */     this.currentDropdownRawArray = null;
/*      */     ArrayList<String> arrayList = new ArrayList();
/*      */     if (i == 0) {
/*      */       this.currentDropdownRawArray = a.a("maps/skirmish", true);
/*      */       Arrays.sort((Object[])this.currentDropdownRawArray);
/*      */       for (String str4 : this.currentDropdownRawArray) {
/*      */         String str5 = g.d(str4);
/*      */         arrayList.add(str5);
/*      */       } 
/*      */     } else if (i == 1) {
/*      */       this.currentDropdownRawArray = a.a("/SD/rusted_warfare_maps", true);
/*      */       if (this.currentDropdownRawArray == null) {
/*      */         l.a("Could not find folder: /SD/rusted_warfare_maps", 1);
/*      */         this.currentDropdownRawArray = new String[0];
/*      */       } 
/*      */       Arrays.sort((Object[])this.currentDropdownRawArray);
/*      */       for (String str4 : this.currentDropdownRawArray) {
/*      */         String str5 = g.d(str4);
/*      */         arrayList.add(str5);
/*      */       } 
/*      */     } else if (i == 2) {
/*      */       this.currentDropdownRawArray = h.j();
/*      */       if (this.currentDropdownRawArray == null) {
/*      */         l.a("Could not find a save folder on SD card", 1);
/*      */         this.currentDropdownRawArray = new String[0];
/*      */       } 
/*      */       for (String str4 : this.currentDropdownRawArray) {
/*      */         String str5 = g.d(str4);
/*      */         arrayList.add(str5);
/*      */       } 
/*      */     } else {
/*      */       throw new RuntimeException("Unknown typeIndex:" + i);
/*      */     } 
/*      */     String str1 = "";
/*      */     String str2 = "maps/skirmish";
/*      */     byte b1 = 0;
/*      */     byte b2 = 1;
/*      */     for (String str : this.currentDropdownRawArray) {
/*      */       b1++;
/*      */       if (i == 0)
/*      */         if (str.equalsIgnoreCase("[p8]Many Islands (8p).tmx"))
/*      */           b2 = b1;  
/*      */     } 
/*      */     b1 = 0;
/*      */     for (String str4 : this.currentDropdownRawArray) {
/*      */       b1++;
/*      */       String str5 = this.root.convertMapName(str4);
/*      */       boolean bool = (b1 == b2) ? true : false;
/*      */       str1 = str1 + generateOption(str4, str5, bool) + "\n";
/*      */     } 
/*      */     l.d("mapList:" + str1);
/*      */     if (i != 2);
/*      */     Element element2 = paramElement.getElementById("mapsSelectorParent");
/*      */     String str3 = "<p data-workaround='this stops disappearing select'></p><select id='mapsSelector' class='mapsSelector'><option value='0'>...</option></select>";
/*      */     element2.setInnerRML(str3);
/*      */     Element element3 = getMapDropdown();
/*      */     element3.setInnerRML(str1);
/*      */   }
/*      */   
/*      */   String generateOption(String paramString1, String paramString2, boolean paramBoolean) {
/*      */     String str = "";
/*      */     if (paramBoolean)
/*      */       str = str + " selected='selected'"; 
/*      */     return "<option value=" + this.root.escapedString(paramString1) + " " + str + ">" + this.root.htmlString(paramString2) + "</option>";
/*      */   }
/*      */   
/*      */   Element getMapDropdown() {
/*      */     ElementDocument elementDocument = this.libRocket.c();
/*      */     return elementDocument.findByClassName("mapsSelector");
/*      */   }
/*      */   
/*      */   String getMapDropdownSelected() {
/*      */     return getMapDropdown().getAttribute("value");
/*      */   }
/*      */   
/*      */   void readInterfaceIntoNetworkSettings() {
/*      */     l l = l.u();
/*      */     if (l.bF.A) {
/*      */       String str = getMapDropdownSelected();
/*      */       if (str == null)
/*      */         str = "<No Map>"; 
/*      */       l.bF.aH.b = str;
/*      */       boolean bool = false;
/*      */       l.bF.aH.a = ai.values()[bool];
/*      */     } 
/*      */   }
/*      */   
/*      */   public void multiplayerStart() {
/*      */     l l = l.u();
/*      */     if (l.bF.A) {
/*      */       if (l.bF.aH.a == ai.a) {
/*      */         l.bF.aI = "maps/skirmish/" + l.bF.aH.b;
/*      */       } else if (l.bF.aH.a == ai.b) {
/*      */         l.bF.aI = "/SD/rusted_warfare_maps/" + l.bF.aH.b;
/*      */       } else if (l.bF.aH.a == ai.c) {
/*      */         l.bF.aI = null;
/*      */       } else {
/*      */         this.libRocket.c("Error: No map type selected");
/*      */         return;
/*      */       } 
/*      */       if (l.bF.aH.b == null || "".equals(l.bF.aH.b) || l.bF.aH.b.equals("<No Map>")) {
/*      */         this.libRocket.c("Error: No map selected");
/*      */         return;
/*      */       } 
/*      */       l.bF.W();
/*      */     } else if (l.bF.F) {
/*      */       l.bF.i("-start");
/*      */     } else {
/*      */       l.b("startNetButton.setOnClickListener", "Clicked but not server or proxy controller");
/*      */     } 
/*      */   }
/*      */   
/*      */   public void battleroomSetup() {
/*      */     l l = l.u();
/*      */     this.lastPlayerTable = null;
/*      */     refreshUI();
/*      */     this.root.refreshChat();
/*      */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/*      */     if (elementDocument != null)
/*      */       if (l.bF.D)
/*      */         elementDocument.addClass("singlePlayer");  
/*      */     l.bF.aj();
/*      */   }
/*      */   
/*      */   public void refreshUI() {
/*      */     l l = l.u();
/*      */     Element element1 = this.libRocket.getActiveElementById("infoDiv");
/*      */     if (element1 == null) {
/*      */       l.d("refreshUI: infoTextElement==null");
/*      */       return;
/*      */     } 
/*      */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/*      */     boolean bool1 = (l.bF.A || l.bF.F) ? true : false;
/*      */     boolean bool = l.bF.A;
/*      */     boolean bool2 = (!bool1 && !l.bF.aH.l) ? true : false;
/*      */     for (Element element : elementDocument.findElementsByClassName("forHostOnly"))
/*      */       element.show(bool1); 
/*      */     for (Element element : elementDocument.findElementsByClassName("forLocalHostOnly"))
/*      */       element.show(bool); 
/*      */     for (Element element : elementDocument.findElementsByClassName("forUnlockedTeamsNonHost"))
/*      */       element.show(bool2); 
/*      */     if (l.I())
/*      */       for (Element element : elementDocument.findElementsByClassName("forRealNetworkOnly"))
/*      */         element.show(false);  
/*      */     String str1 = l.bF.ak();
/*      */     element1.compareAndSetText(str1);
/*      */     String str2 = l.bF.am();
/*      */     if (l.bF.aH.a == ai.c)
/*      */       str2 = "saves/" + l.bF.aH.b; 
/*      */     Element element2 = this.libRocket.getActiveElementById("mapImage");
/*      */     if (l.bF.t)
/*      */       element2.hide(); 
/*      */     String str3 = element2.getAttribute("src");
/*      */     if (str2 == null) {
/*      */       if (!"".equals(str3))
/*      */         element2.setAttribute("src", ""); 
/*      */     } else {
/*      */       String str = this.root.getMapThumbnail(str2);
/*      */       if (str == null)
/*      */         str = ""; 
/*      */       if (!str.equals(str3))
/*      */         element2.setAttribute("src", str); 
/*      */     } 
/*      */     refreshPlayerTable();
/*      */   }
/*      */   
/*      */   public void refreshPlayerTable() {
/*      */     Root$TableData root$TableData = getPlayerTable();
/*      */     String str = "playersDiv";
/*      */     if (this.lastPlayerTable != null) {
/*      */       if (this.lastPlayerTable.same(root$TableData, false))
/*      */         return; 
/*      */       if (this.lastPlayerTable.same(root$TableData, true)) {
/*      */         this.root.updateTableTextOnly(str, root$TableData, this.lastPlayerTable);
/*      */         return;
/*      */       } 
/*      */     } 
/*      */     this.root.refreshTable(str, root$TableData);
/*      */     this.lastPlayerTable = root$TableData;
/*      */   }
/*      */   
/*      */   public Root$TableData getPlayerTable() {
/*      */     l l = l.u();
/*      */     Root$TableData root$TableData = new Root$TableData();
/*      */     ArrayList<Root$TableRow> arrayList = root$TableData.rows;
/*      */     int i = -1;
/*      */     byte b = 0;
/*      */     ArrayList arrayList1 = m.a(true);
/*      */     for (m m : arrayList1) {
/*      */       if (m != null) {
/*      */         if (i != -1 && i != m.o)
/*      */           b++; 
/*      */         i = m.o;
/*      */       } 
/*      */     } 
/*      */     i = -1;
/*      */     for (m m : arrayList1) {
/*      */       if (m != null) {
/*      */         if (i != -1 && i != m.o && b <= 3) {
/*      */           Root$TableRow root$TableRow1 = new Root$TableRow();
/*      */           for (byte b1 = 0; b1 < 4; b1++) {
/*      */             Root$TableCell root$TableCell = root$TableRow1.addCell("");
/*      */             root$TableCell.addClass("spacer");
/*      */           } 
/*      */           arrayList.add(root$TableRow1);
/*      */         } 
/*      */         i = m.o;
/*      */         String str1 = "unnamed";
/*      */         if (m.q != null)
/*      */           str1 = m.q; 
/*      */         String str2 = m.v();
/*      */         String str3 = Integer.toString(m.i + 1);
/*      */         boolean bool = m.b();
/*      */         if (bool)
/*      */           str3 = "S"; 
/*      */         String str4 = m.f();
/*      */         Root$TableRow root$TableRow = new Root$TableRow();
/*      */         Root$TableCell root$TableCell1 = root$TableRow.addCell(str1);
/*      */         if (m == l.bF.x)
/*      */           root$TableCell1.addClass("boldText"); 
/*      */         Root$TableCell root$TableCell2 = root$TableRow.addCell(str3);
/*      */         root$TableCell2.color = Integer.valueOf(m.H());
/*      */         Root$TableCell root$TableCell3 = root$TableRow.addCell(str4);
/*      */         root$TableCell3.color = Integer.valueOf(m.m(m.o));
/*      */         root$TableRow.addCell(str2);
/*      */         root$TableRow.setLibrocketOnClick("mp.showPlayerConfig('" + m.i + "')");
/*      */         arrayList.add(root$TableRow);
/*      */       } 
/*      */     } 
/*      */     if (!l.bF.A && l.bF.P == null) {
/*      */       arrayList.clear();
/*      */       String str = "Connecting...";
/*      */       if (l.bF.aV.size() == 0)
/*      */         str = "Disconnected"; 
/*      */       Root$TableRow root$TableRow = new Root$TableRow();
/*      */       root$TableRow.addCell(str);
/*      */       Root$TableCell root$TableCell1 = root$TableRow.addCell("");
/*      */       Root$TableCell root$TableCell2 = root$TableRow.addCell("");
/*      */       root$TableRow.addCell("");
/*      */       arrayList.add(root$TableRow);
/*      */     } 
/*      */     return root$TableData;
/*      */   }
/*      */   
/*      */   Multiplayer(Root paramRoot) {
/* 1260 */     this.useMapDropdown = false; this.root = paramRoot;
/*      */   } public void showSetTeamsDialog() { l l = l.u(); ElementDocument elementDocument = this.root.createAndShowPopup("battleroom_setTeams.rml", null, "Set Teams"); if (elementDocument != null); } public void showPlayerConfigForSelf() { l l = l.u(); if (l.bF.x != null) showPlayerConfig("" + l.bF.x.i);  }
/*      */   public void showPlayerConfig(String paramString) { l l = l.u(); int i = Integer.parseInt(paramString); m m = m.n(i); if (m == null) { this.root.logWarn("showPlayerConfig: " + paramString + "==null"); return; }  if (!l.bF.an()) if (l.bF.x != m || l.bF.aH.l) return;   ElementDocument elementDocument = this.root.createAndShowPopup("battleroom_player.rml", m, m.q); if (elementDocument != null) { elementDocument.getElementById("team_id").setValue("" + m.i); Element element1 = elementDocument.getElementById("spawnPoint"); Element element2 = elementDocument.getElementById("allyTeam"); String str = "" + (m.i + 1); if (m.b())
/*      */         str = "-2";  element1.setValue(str); if (m.p) { element2.setValue("" + (m.o + 1)); } else { element2.setValue("fromSpawn2"); }  }  }
/* 1264 */   public void gameOptionsRefreshTypes() { l l = l.u();
/* 1265 */     ElementDocument elementDocument = this.libRocket.c();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1270 */     if (this.useMapDropdown)
/*      */     {
/* 1272 */       updateMapDropdown((Element)elementDocument, "mapsSelector", "typeSelector"); }  }
/*      */   public void teamsSet_apply() { l l = l.u(); if (!l.bF.A) { l.d("Not server"); return; }  l.d("playerConfig_kick"); String str = this.libRocket.c().getElementById("teamLayout").getValue(); if ("2t".equalsIgnoreCase(str)) { l.bF.a(ak.a); } else if ("3t".equalsIgnoreCase(str)) { l.bF.a(ak.b); } else if ("FFA".equalsIgnoreCase(str)) { l.bF.a(ak.c); }
/*      */     else if ("spectators".equalsIgnoreCase(str)) { l.bF.a(ak.d); }
/*      */     else { l.b("teamsSet_apply: unknown layout: " + str); }
/*      */      refreshUI(); }
/*      */   public void playerConfig_kick() { l l = l.u(); l.d("playerConfig_kick"); String str = this.libRocket.c().getElementById("team_id").getValue(); int i = Integer.parseInt(str); m m = m.n(i); if (m == null) { this.root.logWarn("playerConfig_kick: " + str + "==null"); return; }
/*      */      l.bF.c(m); }
/*      */   public void playerConfig_apply() { int k; boolean bool3; l l = l.u(); l.d("playerConfig_kick"); String str1 = this.libRocket.c().getElementById("team_id").getValue(); int i = Integer.parseInt(str1); m m = m.n(i); if (m == null) { this.root.logWarn("playerConfig_apply: " + str1 + "==null"); return; }
/*      */      Element element1 = this.libRocket.c().getElementById("spawnPoint"); Element element2 = this.libRocket.c().getElementById("allyTeam"); String str2 = element1.getValue(); String str3 = element2.getValue(); int j = Integer.valueOf(str2).intValue() - 1; boolean bool1 = false; if (j == -3) { bool1 = true; }
/*      */     else { if (j < 0)
/*      */         j = 1;  if (j > m.a - 1)
/*      */         j = m.a - 1;  }
/*      */      boolean bool2 = false; if (bool1) { k = -3; bool3 = true; }
/*      */     else if (str3.equals("fromSpawn2")) { k = j % 2; m.p = false; bool3 = true; }
/*      */     else { bool3 = false; k = m.o; try { k = Integer.valueOf(str3).intValue() - 1; }
/*      */       catch (NumberFormatException numberFormatException) { numberFormatException.printStackTrace(); }
/*      */        m.p = true; }
/*      */      if (m.o != k)
/*      */       if (l.bF.A) { bool2 = true; }
/*      */       else if (l.bF.F || l.bF.x == m) { bool2 = true; }
/*      */       else { l.b("row.setOnClickListener", "Clicked but not server or proxy controller"); }
/*      */         try { if (m.i != j)
/*      */         if (l.bF.A) { bool2 = false; l.bF.a(m, j); m.o = k; }
/*      */         else if (l.bF.F || l.bF.x == m) { bool2 = false; int n = k; if (bool3)
/*      */             n = -1;  l.bF.a(m, j, Integer.valueOf(n)); }
/*      */         else { l.b("row.setOnClickListener", "Clicked but not server or proxy controller"); }
/*      */           }
/*      */     catch (NumberFormatException numberFormatException) { numberFormatException.printStackTrace(); }
/*      */      if (bool2)
/*      */       if (l.bF.A) { m.o = k; }
/*      */       else if (bool3) { l.bF.b(m, -1); }
/*      */       else { l.bF.b(m, k); }
/* 1304 */         l.bF.F(); refreshUI(); } public void gameOptionsGetOrPush(boolean paramBoolean) { l l = l.u();
/*      */     
/* 1306 */     ElementDocument elementDocument = this.libRocket.c();
/*      */     
/* 1308 */     Element element1 = elementDocument.getElementById("fogMode");
/*      */     
/* 1310 */     Element element2 = elementDocument.getElementById("startingCredits");
/*      */ 
/*      */ 
/*      */     
/* 1314 */     Element element3 = elementDocument.getElementById("incomeMultiplier");
/*      */     
/* 1316 */     Element element4 = elementDocument.getElementById("noNukes");
/*      */ 
/*      */     
/* 1319 */     Element element5 = elementDocument.getElementById("sharedControl");
/*      */ 
/*      */ 
/*      */     
/* 1323 */     Element element6 = elementDocument.getElementById("aiDifficulty");
/*      */ 
/*      */     
/* 1326 */     Element element7 = elementDocument.getElementById("startingUnits");
/*      */     
/* 1328 */     if (!paramBoolean)
/*      */     {
/* 1330 */       setupStartingUnitDropDown(element7);
/*      */     }
/*      */     
/* 1333 */     Element element8 = elementDocument.getElementById("typeSelector");
/* 1334 */     Element element9 = getMapDropdown();
/*      */     
/* 1336 */     if (!paramBoolean) {
/*      */ 
/*      */       
/* 1339 */       if (l.bF.aH.a == null) {
/*      */         
/* 1341 */         l.d("gameOptionsGetOrPush: game.network.setup.currentType==null");
/*      */       }
/*      */       else {
/*      */         
/* 1345 */         element8.setValue("" + l.bF.aH.a.ordinal());
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1351 */       if (this.useMapDropdown) {
/*      */         
/* 1353 */         updateMapDropdown((Element)elementDocument, "mapsSelector", "typeSelector");
/*      */         
/* 1355 */         element9 = getMapDropdown();
/*      */ 
/*      */         
/* 1358 */         l.d("new currentMapSelection=" + l.bF.aH.b);
/*      */         
/* 1360 */         element9.setValue("" + l.bF.aH.b);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1365 */       element8 = elementDocument.getElementById("typeSelector");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1374 */       element1.setValue("" + l.bF.aH.d);
/* 1375 */       element2.setValue("" + l.bF.aH.c);
/*      */ 
/*      */ 
/*      */       
/* 1379 */       element7.setValue("" + l.bF.aH.g);
/*      */ 
/*      */       
/* 1382 */       l.bF.aH.e = true;
/*      */       
/* 1384 */       element4.setCheckbox(l.bF.aH.i);
/*      */       
/* 1386 */       element5.setCheckbox(l.bF.aH.k);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1392 */       element3.setValue("" + f.a(l.bF.aH.h, 1) + "x");
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1397 */       element6.setValue("" + l.bF.aH.f);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       return;
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
/* 1418 */     ah ah = l.bF.c();
/*      */     
/* 1420 */     if (ah != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1428 */       String str1 = null;
/* 1429 */       if (this.useMapDropdown) {
/*      */         
/* 1431 */         str1 = element9.getValue();
/* 1432 */         if (str1 == null) {
/*      */           
/* 1434 */           l.d("gameOptionsGetOrPush: mapDropdownSelected==null");
/* 1435 */           str1 = "<No Map>";
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1442 */       int i = element8.getValueAsInt(Integer.valueOf(0)).intValue();
/*      */ 
/*      */       
/* 1445 */       ai ai = ah.a;
/*      */       
/* 1447 */       ah.a = ai.values()[i];
/*      */ 
/*      */       
/* 1450 */       if (this.useMapDropdown) {
/*      */         
/* 1452 */         ah.b = str1;
/*      */ 
/*      */       
/*      */       }
/* 1456 */       else if (ai != ah.a) {
/*      */         
/* 1458 */         ah.b = null;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1463 */       ah.d = element1.getValueAsInt(null).intValue();
/* 1464 */       ah.c = element2.getValueAsInt(null).intValue();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1469 */       String str2 = element3.getValue();
/* 1470 */       str2 = str2.replace("x", "");
/*      */       
/* 1472 */       float f = 1.0F;
/*      */       
/*      */       try {
/* 1475 */         f = Float.parseFloat(str2);
/*      */       }
/* 1477 */       catch (NumberFormatException numberFormatException) {
/*      */         
/* 1479 */         numberFormatException.printStackTrace();
/*      */       } 
/* 1481 */       ah.h = f;
/*      */ 
/*      */       
/* 1484 */       ah.i = element4.getCheckbox();
/*      */       
/* 1486 */       ah.k = element5.getCheckbox();
/*      */       
/* 1488 */       ah.f = element6.getValueAsInt(null).intValue();
/*      */       
/* 1490 */       ah.g = element7.getValueAsInt(Integer.valueOf(1)).intValue();
/*      */ 
/*      */       
/* 1493 */       l.bF.a(ah);
/*      */     }  }
/*      */   public void disconnect(String paramString) { l l = l.u(); l.bF.b(paramString); }
/*      */   public void multiplayerBackPrompt() { String str1 = a.a("menus.ingame.multiplayerClose.title", new Object[0]); String str2 = "What would you like to do?"; String str3 = a.a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":"; str3 = str3 + "closePopup(); mp.disconnect('exited'); back();"; boolean bool = true; this.root.showPopup(str1, str2, bool, str3, null); }
/*      */   public void surrenderPrompt() { String str1 = a.a("menus.ingame.surrender.title", new Object[0]); String str2 = a.a("menus.ingame.surrender.message", new Object[0]); String str3 = a.a("menus.ingame.surrender.surrenderButton", new Object[0]) + ":"; str3 = str3 + "closePopup(); mp.surrender();"; boolean bool = true; this.root.showPopup(str1, str2, bool, str3, null); }
/*      */   public void surrender() { l.d("Surrender requested"); this.root.sendChatMessage("-surrender"); }
/*      */   public void multiplayerExitPrompt() { String str1 = a.a("menus.ingame.multiplayerClose.title", new Object[0]); String str2 = "Are you sure you want to disconnect, and end this game?"; String str3 = a.a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":"; str3 = str3 + "closePopup(); mp.disconnect('exited'); showMainMenu();"; boolean bool = true;
/*      */     this.root.showPopup(str1, str2, bool, str3, null); }
/*      */   public void addAI() { l l = l.u();
/*      */     if (l.bF.A) {
/*      */       l.bF.ag();
/*      */     } else if (l.bF.F) {
/*      */       l.bF.i("-addai");
/*      */     } else {
/*      */       this.root.logWarn("addAI(): Clicked but not server or proxy controller");
/*      */     }  }
/*      */   public String _getRandomDefaultPlayerName() { return "Unnamed" + f.a(0, 999); }
/*      */   public void loadUsername() { l.d("mp.loadUsername()");
/*      */     l l = l.u();
/*      */     String str1 = l.by.lastNetworkPlayerName;
/*      */     Element element = this.libRocket.getActiveElementById("username");
/*      */     String str2 = a.a().c();
/*      */     l.d("steamName:" + str2);
/*      */     if (str2 != null)
/*      */       if (str1 == null)
/*      */         str1 = str2;  
/*      */     if (str1 == null || "".equals(str1))
/*      */       str1 = _getRandomDefaultPlayerName(); 
/*      */     element.loadCharsetIfNeeded(str1);
/*      */     element.setAttribute("value", str1); }
/*      */   public void getUsernameFromInterface() { l l = l.u();
/*      */     String str = this.root.getValueById("username");
/*      */     if (str == null) {
/*      */       l.b("getUsernameFromInterface: Cannot find username");
/*      */       return;
/*      */     } 
/*      */     str = str.trim();
/*      */     l.d("set username:" + str);
/*      */     if (str.equals(""))
/*      */       str = _getRandomDefaultPlayerName(); 
/*      */     l.bF.a(str); }
/*      */   public void gameOptionsGet() { gameOptionsGetOrPush(false); }
/* 1535 */   public void gameOptionsPush() { gameOptionsGetOrPush(true); } public void closeBattleroomIfOpen() { l l = l.u();
/*      */     
/* 1537 */     Element element = this.libRocket.getActiveElementById("battleroomPage");
/* 1538 */     if (element == null) {
/*      */ 
/*      */ 
/*      */       
/* 1542 */       l.d("closeBattleroomIfOpen: battleroomPage==null");
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */     
/* 1550 */     this.libRocket.backToLastDocument(); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void reinviteAsk() {
/* 1563 */     String str1 = a.a("menus.ingame.multiplayerReinvite.title", new Object[0]);
/*      */     
/* 1565 */     String str2 = "While in-game you can only reinvite players who were in-game before but dropped out";
/*      */     
/* 1567 */     String str3 = "reInvite:";
/*      */     
/* 1569 */     str3 = str3 + "closePopup(); mp.showSteamInviteDialog();";
/*      */ 
/*      */ 
/*      */     
/* 1573 */     boolean bool = true;
/* 1574 */     this.root.showPopup(str1, str2, bool, str3, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void showSteamInviteDialog() {
/* 1582 */     a a = a.a();
/*      */ 
/*      */     
/* 1585 */     a.g();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMapFromPopup(String paramString) {
/* 1595 */     if (!isInControlOfServer()) {
/*      */ 
/*      */       
/* 1598 */       String str1 = this.root.getMapNameFromPath(paramString);
/*      */       
/* 1600 */       String str2 = "clicked on '" + str1 + "'";
/*      */       
/* 1602 */       this.root.sendChatMessage(str2);
/*      */       
/* 1604 */       this.root.closePopup();
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1609 */     l l = l.u();
/*      */     
/* 1611 */     ah ah = l.bF.c();
/*      */     
/* 1613 */     if (ah != null) {
/*      */ 
/*      */       
/* 1616 */       String str = paramString;
/*      */       
/* 1618 */       if (!str.contains("MOD|"))
/*      */       {
/* 1620 */         str = f.k(str);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1625 */       ah.b = str;
/*      */ 
/*      */       
/* 1628 */       l.bF.a(ah);
/*      */     } 
/*      */     
/* 1631 */     this.root.closePopup();
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
/*      */   public void showMapSelect() {
/* 1658 */     String str = this.root.getModeMapPath(null, null);
/*      */ 
/*      */     
/* 1661 */     this.root.showMapPopup(str, "mp.setMapFromPopup");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isInControlOfServer() {
/* 1671 */     l l = l.u();
/*      */     
/* 1673 */     return (l.bF.A || l.bF.F);
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
/*      */   public void askPassword() {
/* 1686 */     l.d("mp.askPassword()");
/*      */     
/* 1688 */     l l = l.u();
/*      */     
/* 1690 */     String str1 = "Password Required";
/* 1691 */     String str2 = "This server requires a password to join";
/* 1692 */     String str3 = "";
/* 1693 */     this.root.showInputPopupNonClose(str1, str2, str3, "Close:mp.cancelPaswordAsk()", "[onenter]Join:mp.askPasswordEntered(getPopupText())");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void askPasswordEntered(String paramString) {
/* 1702 */     l.d("mp.askPasswordEntered()");
/*      */ 
/*      */     
/* 1705 */     l l = l.u();
/* 1706 */     l.bF.m = paramString;
/*      */ 
/*      */     
/* 1709 */     l.bF.P();
/*      */ 
/*      */     
/* 1712 */     this.root.closePopup();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void cancelPaswordAsk() {
/* 1718 */     l l = l.u();
/* 1719 */     if (l.bF.A) {
/*      */       
/* 1721 */       this.root.logWarn("cancelPaswordAsk: we are the server");
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1726 */       l.bF.b("Cancel password");
/* 1727 */       closeBattleroomIfOpen();
/*      */     } 
/*      */ 
/*      */     
/* 1731 */     this.root.closePopup();
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
/*      */   public void setupStartingUnitDropDown(Element paramElement) {
/* 1754 */     String str = "";
/*      */ 
/*      */     
/* 1757 */     for (Multiplayer$DropdownOption multiplayer$DropdownOption : getStartingUnitOptions())
/*      */     {
/*      */ 
/*      */       
/* 1761 */       str = str + generateOption(multiplayer$DropdownOption.key, multiplayer$DropdownOption.value, false);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1767 */     paramElement.setInnerRML(str);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ArrayList getStartingUnitOptions() {
/* 1776 */     l l = l.u();
/*      */     
/* 1778 */     ArrayList<Multiplayer$DropdownOption> arrayList = new ArrayList();
/*      */ 
/*      */     
/* 1781 */     for (Integer integer : l.bF.g()) {
/*      */       
/* 1783 */       String str = l.bF.d(integer.intValue());
/* 1784 */       arrayList.add(new Multiplayer$DropdownOption(integer.toString(), str));
/*      */     } 
/*      */ 
/*      */     
/* 1788 */     return arrayList;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\librocket\scripts\Multiplayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */