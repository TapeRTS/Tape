/*      */ package com.corrodinggames.rts.gameFramework;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.content.SharedPreferences;
/*      */ import android.util.Log;
/*      */ import com.corrodinggames.rts.gameFramework.c.a;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.PrintWriter;
/*      */ import java.lang.reflect.Field;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collections;
/*      */ import java.util.HashMap;
/*      */ import java.util.Map;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class SettingsEngine
/*      */ {
/*      */   public boolean enableSounds;
/*      */   public boolean enableMouseCapture;
/*      */   public boolean resizeFontWithUIScale = true;
/*      */   public String slick2dResolution;
/*      */   public String slick2dFullScreenResolution;
/*      */   public boolean slick2dFullScreen;
/*      */   public boolean slick2dBorderless;
/*      */   public float masterVolume;
/*      */   public float gameVolume;
/*      */   public float interfaceVolume;
/*      */   public float musicVolume;
/*      */   public float scrollSpeed;
/*      */   public float edgeScrollSpeed;
/*      */   public boolean hasPlayedGameOrSeenHelp;
/*      */   public boolean onscreenControls;
/*      */   public boolean trackpad;
/*      */   public boolean dpad;
/*      */   public boolean batterySaving;
/*      */   public boolean highRefreshRate;
/*      */   public boolean renderBackground;
/*      */   public boolean renderExtraLayers;
/*      */   public boolean immersiveFullScreen;
/*      */   public boolean unlockedScreenRotation;
/*      */   public boolean renderDoubleScale;
/*   79 */   public float renderDensity = 1.0F;
/*      */   
/*   81 */   public float uiRenderScale = 1.0F;
/*      */ 
/*      */   
/*      */   public boolean renderExtraShadows = true;
/*      */ 
/*      */   
/*      */   public boolean renderFancyWater = false;
/*      */ 
/*      */   
/*      */   public boolean renderClouds = false;
/*      */ 
/*      */   
/*      */   public boolean softFogFading = false;
/*      */ 
/*      */   
/*      */   public boolean showActionInfoHoverNearMouse = true;
/*      */ 
/*      */   
/*      */   public boolean disableModLazyLoad = false;
/*      */ 
/*      */   
/*      */   public boolean showUnitGroups;
/*      */ 
/*      */   
/*      */   public boolean allowGameRecording;
/*      */ 
/*      */   
/*      */   public boolean renderAntiAlias = true;
/*      */ 
/*      */   
/*      */   public boolean renderControls;
/*      */   
/*      */   public boolean showHp;
/*      */   
/*      */   public boolean showUnitIcons;
/*      */   
/*      */   public boolean gestureZoom;
/*      */   
/*      */   public boolean showSelectedUnitsList = true;
/*      */   
/*      */   public boolean useCircleSelect;
/*      */   
/*      */   public boolean showZoomButton;
/*      */   
/*      */   public boolean showFps;
/*      */   
/*      */   public boolean showUnitWaypoints;
/*      */   
/*      */   public boolean useMinimapAllyColors;
/*      */   
/*      */   public boolean showWarLogOnScreen;
/*      */   
/*      */   public boolean classicInterface;
/*      */   
/*      */   public boolean quickRally;
/*      */   
/*      */   public boolean doubleClickToAttackMove = false;
/*      */   
/*      */   public boolean showMapPingsOnBattlefield = true;
/*      */   
/*      */   public boolean showMapPingsOnMinimap = true;
/*      */   
/*      */   public boolean showPlayerChatInGame = true;
/*      */   
/*      */   public boolean sendReports;
/*      */   
/*      */   public boolean shownAudioWarning;
/*      */   
/*      */   public boolean mouseSupport;
/*      */   
/*      */   public boolean keyboardSupport;
/*      */   
/*      */   public boolean forceEnglish;
/*      */   
/*      */   public String overrideLanguageCode;
/*      */   
/*      */   public boolean saveMultiplayerReplays;
/*      */   
/*      */   public boolean replaysShowRecordedChat;
/*      */   
/*      */   public int nextBackgroundMap;
/*      */   
/*      */   public String lastNetworkPlayerName;
/*      */   
/*      */   public String lastNetworkIP;
/*      */   
/*  167 */   public String teamColors = "#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4";
/*  168 */   public String teamColorsNames = "GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE";
/*      */ 
/*      */   
/*      */   public boolean landscapeOrientation;
/*      */ 
/*      */   
/*      */   public int aiDifficulty;
/*      */ 
/*      */   
/*      */   public int locationAction;
/*      */ 
/*      */   
/*      */   public int locationDpad;
/*      */ 
/*      */   
/*      */   public int keyAction;
/*      */ 
/*      */   
/*      */   public int keyJump;
/*      */   
/*      */   public int keyLeft;
/*      */   
/*      */   public int keyRight;
/*      */   
/*      */   public int keyDown;
/*      */   
/*      */   public String uuid;
/*      */   
/*      */   public String networkClientId;
/*      */   
/*      */   public String networkClientIdMachineKey;
/*      */   
/*      */   public String networkServerId;
/*      */   
/*      */   public int lastSeenMessageId;
/*      */   
/*      */   public String lastSeenMessageIds;
/*      */   
/*      */   public int networkPort;
/*      */   
/*      */   public boolean udpInMultiplayer;
/*      */   
/*      */   public int numberOfWins;
/*      */   
/*      */   public boolean rateGameShown;
/*      */   
/*      */   public boolean highGraphics = true;
/*      */   
/*      */   public int mouseOrders;
/*      */   
/*      */   public int mousePlacement;
/*      */   
/*      */   public boolean liveReloading;
/*      */   
/*      */   public boolean renderVsync;
/*      */   
/*      */   public boolean renderSmoothDelta;
/*      */   
/*  226 */   public int teamUnitCapSinglePlayer = 1000;
/*  227 */   public int teamUnitCapHostedGame = 250;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean showChatAndPingShortcuts = true;
/*      */ 
/*      */ 
/*      */   
/*      */   public String modSettings;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean loadDisabledModData;
/*      */ 
/*      */ 
/*      */   
/*      */   public int lastModCount;
/*      */ 
/*      */   
/*      */   public boolean smartSelection_v2;
/*      */ 
/*      */   
/*      */   SharedPreferences prefs;
/*      */ 
/*      */   
/*  252 */   static SettingsEngine settingsEngine = null;
/*      */   
/*      */   public static SettingsEngine getInstance(Context paramContext) {
/*  255 */     if (settingsEngine == null)
/*      */     {
/*  257 */       settingsEngine = new SettingsEngine(paramContext);
/*      */     }
/*      */     
/*  260 */     return settingsEngine;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getBooleanPref(String paramString, boolean paramBoolean) {
/*  267 */     if (l.aF)
/*      */     {
/*  269 */       return paramBoolean;
/*      */     }
/*  271 */     return this.prefs.getBoolean(paramString, paramBoolean);
/*      */   }
/*      */   
/*      */   public int getIntPref(String paramString, int paramInt) {
/*  275 */     if (l.aF)
/*      */     {
/*  277 */       return paramInt;
/*      */     }
/*  279 */     return this.prefs.getInt(paramString, paramInt);
/*      */   }
/*      */   
/*      */   public float getFloatPref(String paramString, float paramFloat) {
/*  283 */     if (l.aF)
/*      */     {
/*  285 */       return paramFloat;
/*      */     }
/*  287 */     return this.prefs.getFloat(paramString, paramFloat);
/*      */   }
/*      */   
/*      */   public String getStringPref(String paramString1, String paramString2) {
/*  291 */     if (l.aF)
/*      */     {
/*  293 */       return paramString2;
/*      */     }
/*  295 */     return this.prefs.getString(paramString1, paramString2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getValueDynamic(String paramString) {
/*      */     Object object;
/*      */     try {
/*  305 */       Field field = (Field)this.settingFields.get(paramString);
/*      */       
/*  307 */       if (field == null)
/*      */       {
/*  309 */         throw new RuntimeException("Could not find: " + paramString);
/*      */       }
/*      */ 
/*      */       
/*  313 */       object = field.get(this);
/*      */     }
/*  315 */     catch (IllegalArgumentException illegalArgumentException) {
/*      */       
/*  317 */       throw new RuntimeException(illegalArgumentException);
/*      */     }
/*  319 */     catch (IllegalAccessException illegalAccessException) {
/*      */       
/*  321 */       throw new RuntimeException(illegalAccessException);
/*      */     } 
/*      */     
/*  324 */     if (object == null)
/*      */     {
/*  326 */       return null;
/*      */     }
/*      */     
/*  329 */     return object.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean setValueDynamic(String paramString1, String paramString2) {
/*      */     try {
/*      */       Integer integer;
/*  337 */       Field field = (Field)this.settingFields.get(paramString1);
/*  338 */       String str = paramString2;
/*      */       
/*  340 */       if (field.getType().equals(boolean.class)) {
/*      */         
/*  342 */         if (paramString2 == null)
/*      */         {
/*  344 */           throw new RuntimeException("value==null");
/*      */         }
/*  346 */         Boolean bool = Boolean.valueOf(Boolean.parseBoolean(paramString2));
/*      */       } 
/*  348 */       if (field.getType().equals(float.class))
/*      */       {
/*  350 */         Float float_ = Float.valueOf(Float.parseFloat(paramString2));
/*      */       }
/*  352 */       if (field.getType().equals(int.class))
/*      */       {
/*  354 */         integer = Integer.valueOf(Integer.parseInt(paramString2));
/*      */       }
/*      */       
/*  357 */       field.set(this, integer);
/*      */     }
/*  359 */     catch (IllegalAccessException illegalAccessException) {
/*      */       
/*  361 */       throw new RuntimeException(illegalAccessException);
/*      */     } 
/*      */ 
/*      */     
/*  365 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPreferencesPath() {
/*  371 */     String str = "/SD/rustedWarfare/preferences.ini";
/*      */     
/*  373 */     return a.c(str);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void saveToFileSystem() {
/*  380 */     l l = l.u();
/*      */     
/*  382 */     File file = new File(getPreferencesPath());
/*      */     
/*  384 */     l.d("Saving to: " + file.getAbsolutePath());
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  389 */       PrintWriter printWriter = new PrintWriter(file);
/*      */ 
/*      */       
/*  392 */       printWriter.println("[settings]");
/*      */       
/*  394 */       ArrayList<Comparable> arrayList = new ArrayList();
/*  395 */       arrayList.addAll(this.settingFields.keySet());
/*  396 */       Collections.sort(arrayList);
/*      */       
/*  398 */       for (String str1 : arrayList) {
/*      */ 
/*      */ 
/*      */         
/*  402 */         String str2 = getValueDynamic(str1);
/*      */         
/*  404 */         if (str2 == null) {
/*      */           
/*  406 */           l.d("saveToFileSystem: " + str1 + " is null");
/*  407 */           str2 = "";
/*      */         } 
/*      */         
/*  410 */         str2 = str2.replace("\\", "\\\\");
/*  411 */         str2 = str2.replace("\n", "\\n");
/*      */         
/*  413 */         printWriter.println(str1 + ":" + str2);
/*      */       } 
/*      */ 
/*      */       
/*  417 */       printWriter.println("[keys]");
/*      */       
/*  419 */       for (ad ad : l.bB.ak) {
/*      */         
/*  421 */         if (!ad.b || ad.d()) {
/*      */           continue;
/*      */         }
/*      */         
/*  425 */         String str1 = "";
/*      */         
/*  427 */         str1 = str1 + ad.e();
/*      */         
/*  429 */         String str2 = l.bB.a(ad);
/*      */         
/*  431 */         printWriter.println(str1 + ":" + str2);
/*      */       } 
/*      */       
/*  434 */       printWriter.close();
/*      */ 
/*      */     
/*      */     }
/*  438 */     catch (IOException iOException) {
/*      */       
/*  440 */       iOException.printStackTrace();
/*  441 */       l.u().a("Failed to save preferences, IO error", 1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadFromFileSystem() {
/*  448 */     l l = l.u();
/*      */ 
/*      */     
/*  451 */     String str1 = getPreferencesPath();
/*      */     
/*  453 */     File file = new File(str1);
/*      */ 
/*      */     
/*  456 */     if (!file.exists()) {
/*      */       
/*  458 */       l.d("preferences not found, not loading (" + str1 + ")");
/*      */       
/*      */       return;
/*      */     } 
/*  462 */     l.d("loadFromFileSystem filepath: " + file.getAbsolutePath());
/*      */ 
/*      */     
/*  465 */     String str2 = "settings";
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
/*  476 */       ab ab = new ab(str1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  482 */       for (Map.Entry entry : this.settingFields.entrySet()) {
/*      */         
/*  484 */         String str3 = (String)entry.getKey();
/*      */         
/*  486 */         String str4 = ab.b(str2, str3, null);
/*      */         
/*  488 */         if (l.aJ)
/*      */         {
/*  490 */           l.d(str3 + "= " + str4);
/*      */         }
/*      */         
/*  493 */         if (str4 != null && !"".equals(str4)) {
/*      */ 
/*      */ 
/*      */           
/*  497 */           if (str3.startsWith("key.")) {
/*      */             
/*  499 */             str3 = str3.replace("key.", "");
/*      */             
/*  501 */             l.d("loading keybind:" + str3);
/*  502 */             l.bB.a(str3, str4);
/*      */             
/*      */             continue;
/*      */           } 
/*      */           
/*  507 */           setValueDynamic(str3, str4);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  517 */       for (ad ad : l.bB.ak)
/*      */       {
/*  519 */         if (!ad.b || ad.d()) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */ 
/*      */         
/*  525 */         String str3 = ad.e();
/*      */         
/*  527 */         String str4 = ab.b("keys", str3, null);
/*      */ 
/*      */ 
/*      */         
/*  531 */         if (str4 != null && !"".equals(str4))
/*      */         {
/*  533 */           l.bB.a(str3, str4);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  565 */     catch (IOException iOException) {
/*      */       
/*  567 */       iOException.printStackTrace();
/*  568 */       l.u().a("Failed to load preferences, IO error", 1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  577 */   HashMap settingFields = new HashMap<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private SettingsEngine(Context paramContext) {
/*  588 */     Field[] arrayOfField = getClass().getFields();
/*  589 */     for (Field field : arrayOfField) {
/*      */       
/*  591 */       String str = field.getName();
/*  592 */       if (this.settingFields.get(str) != null)
/*      */       {
/*  594 */         l.d("SettingsEngine: fields: " + str + " already exists");
/*      */       }
/*      */       
/*  597 */       if (l.aJ)
/*      */       {
/*  599 */         l.d("SettingsEngine: field:" + str);
/*      */       }
/*      */       
/*  602 */       this.settingFields.put(str, field);
/*      */     } 
/*      */ 
/*      */     
/*  606 */     if (!l.aF)
/*      */     {
/*  608 */       this.prefs = paramContext.a("rts_settings", 0);
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
/*  622 */     int i = getIntPref("settingVersion", 1);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  627 */     int j = getIntPref("settingsGameVersion", 0);
/*      */ 
/*      */     
/*  630 */     this.slick2dResolution = getStringPref("slick2dResolution", "native");
/*      */     
/*  632 */     this.slick2dFullScreenResolution = getStringPref("slick2dFullScreenResolution", "native");
/*      */ 
/*      */     
/*  635 */     this.slick2dFullScreen = getBooleanPref("slick2dFullScreen", false);
/*      */ 
/*      */ 
/*      */     
/*  639 */     this.hasPlayedGameOrSeenHelp = getBooleanPref("hasPlayedGameOrSeenHelp", false);
/*  640 */     this.enableSounds = getBooleanPref("enableSounds", true);
/*      */     
/*  642 */     this.enableMouseCapture = getBooleanPref("enableMouseCapture", false);
/*      */     
/*  644 */     this.musicVolume = getFloatPref("musicVolume", 0.25F);
/*      */     
/*  646 */     float f = 1.0F;
/*  647 */     if (l.al())
/*      */     {
/*  649 */       f = 0.5F;
/*      */     }
/*      */     
/*  652 */     this.masterVolume = getFloatPref("masterVolume", f);
/*      */     
/*  654 */     this.gameVolume = getFloatPref("gameVolume", 1.0F);
/*      */     
/*  656 */     this.interfaceVolume = getFloatPref("interfaceVolume", 0.8F);
/*      */     
/*  658 */     this.scrollSpeed = getFloatPref("scrollSpeed", 1.0F);
/*      */     
/*  660 */     this.edgeScrollSpeed = getFloatPref("edgeScrollSpeed", 1.0F);
/*      */     
/*  662 */     this.onscreenControls = getBooleanPref("onscreenControls", true);
/*  663 */     this.trackpad = getBooleanPref("trackpad", true);
/*  664 */     this.dpad = getBooleanPref("dpad", true);
/*      */ 
/*      */     
/*  667 */     this.batterySaving = getBooleanPref("batterySaving", false);
/*      */ 
/*      */ 
/*      */     
/*  671 */     boolean bool1 = false;
/*  672 */     if (l.al())
/*      */     {
/*  674 */       bool1 = true;
/*      */     }
/*      */     
/*  677 */     this.highRefreshRate = getBooleanPref("highRefreshRate", bool1);
/*      */     
/*  679 */     this.unlockedScreenRotation = getBooleanPref("unlockedScreenRotation", false);
/*      */ 
/*      */ 
/*      */     
/*  683 */     this.renderBackground = getBooleanPref("renderBackground", true);
/*  684 */     this.renderExtraLayers = getBooleanPref("renderExtraLayers", true);
/*  685 */     this.renderControls = getBooleanPref("renderControls", true);
/*      */     
/*  687 */     this.immersiveFullScreen = getBooleanPref("immersiveFullScreen", true);
/*      */     
/*  689 */     this.renderDoubleScale = getBooleanPref("renderDoubleScale", false);
/*  690 */     this.showUnitGroups = getBooleanPref("showUnitGroups", true);
/*      */ 
/*      */     
/*  693 */     boolean bool2 = false;
/*  694 */     if (l.al())
/*      */     {
/*  696 */       bool2 = true;
/*      */     }
/*  698 */     if (l.aJ)
/*      */     {
/*  700 */       bool2 = true;
/*      */     }
/*  702 */     this.renderClouds = getBooleanPref("renderClouds", bool2);
/*      */ 
/*      */     
/*  705 */     boolean bool3 = false;
/*  706 */     if (l.al())
/*      */     {
/*  708 */       bool3 = true;
/*      */     }
/*  710 */     if (l.aJ)
/*      */     {
/*  712 */       bool3 = true;
/*      */     }
/*  714 */     this.softFogFading = getBooleanPref("softFogFading", bool3);
/*      */     
/*  716 */     this.showUnitWaypoints = getBooleanPref("showUnitWaypoints", true);
/*  717 */     this.useMinimapAllyColors = getBooleanPref("useMinimapAllyColors", true);
/*      */ 
/*      */     
/*  720 */     boolean bool4 = false;
/*  721 */     if (l.al())
/*      */     {
/*  723 */       bool4 = true;
/*      */     }
/*      */     
/*  726 */     this.showWarLogOnScreen = getBooleanPref("showWarLogOnScreen", bool4);
/*      */ 
/*      */ 
/*      */     
/*  730 */     boolean bool5 = false;
/*      */ 
/*      */ 
/*      */     
/*  734 */     this.classicInterface = getBooleanPref("classicInterface", bool5);
/*      */ 
/*      */     
/*  737 */     boolean bool6 = false;
/*  738 */     if (l.al())
/*      */     {
/*  740 */       bool6 = true;
/*      */     }
/*      */     
/*  743 */     this.quickRally = getBooleanPref("quickRally", bool6);
/*      */     
/*  745 */     if (i <= 1 && !l.al())
/*      */     {
/*  747 */       this.quickRally = bool6;
/*      */     }
/*      */     
/*  750 */     this.doubleClickToAttackMove = getBooleanPref("doubleClickToAttackMove", true);
/*      */ 
/*      */ 
/*      */     
/*  754 */     this.showMapPingsOnBattlefield = getBooleanPref("showMapPingsOnBattlefield", true);
/*  755 */     this.showMapPingsOnMinimap = getBooleanPref("showMapPingsOnMinimap", true);
/*      */     
/*  757 */     this.showPlayerChatInGame = getBooleanPref("showPlayerChatInGame", true);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  762 */     this.allowGameRecording = false;
/*      */ 
/*      */     
/*  765 */     this.showHp = getBooleanPref("showHp", true);
/*  766 */     this.showUnitIcons = getBooleanPref("showUnitIcons", true);
/*  767 */     this.gestureZoom = getBooleanPref("gestureZoom", true);
/*  768 */     this.useCircleSelect = getBooleanPref("useCircleSelect", false);
/*      */     
/*  770 */     this.showZoomButton = getBooleanPref("showZoomButton", true);
/*  771 */     this.showFps = getBooleanPref("showFps", false);
/*      */     
/*  773 */     this.sendReports = getBooleanPref("sendReports", true);
/*      */     
/*  775 */     this.shownAudioWarning = getBooleanPref("shownAudioWarning", false);
/*      */     
/*  777 */     this.mouseSupport = getBooleanPref("mouseSupport", !l.d(paramContext));
/*  778 */     this.keyboardSupport = getBooleanPref("keyboardSupport", true);
/*      */ 
/*      */     
/*  781 */     boolean bool7 = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  789 */     this.forceEnglish = getBooleanPref("forceEnglish", bool7);
/*      */     
/*  791 */     boolean bool8 = false;
/*      */     
/*  793 */     if (l.al())
/*      */     {
/*  795 */       bool8 = true;
/*      */     }
/*      */     
/*  798 */     this.saveMultiplayerReplays = getBooleanPref("saveMultiplayerReplays", bool8);
/*      */     
/*  800 */     if (i <= 1)
/*      */     {
/*  802 */       this.saveMultiplayerReplays = bool8;
/*      */     }
/*      */ 
/*      */     
/*  806 */     this.replaysShowRecordedChat = getBooleanPref("replaysShowRecordedChat", true);
/*      */     
/*  808 */     this.lastNetworkPlayerName = getStringPref("lastNetworkPlayerName", null);
/*      */     
/*  810 */     this.lastNetworkIP = getStringPref("lastNetworkIP", null);
/*      */ 
/*      */ 
/*      */     
/*  814 */     this.aiDifficulty = getIntPref("aiDifficulty", 0);
/*      */ 
/*      */ 
/*      */     
/*  818 */     this.locationDpad = getIntPref("locationDpad", 0);
/*  819 */     this.locationAction = getIntPref("locationAction", 3);
/*      */ 
/*      */     
/*  822 */     this.keyAction = getIntPref("keyAction", 23);
/*  823 */     this.keyJump = getIntPref("keyJump", 19);
/*  824 */     this.keyLeft = getIntPref("keyLeft", 21);
/*  825 */     this.keyRight = getIntPref("keyRight", 22);
/*  826 */     this.keyDown = getIntPref("keyDown", 20);
/*      */ 
/*      */ 
/*      */     
/*  830 */     this.landscapeOrientation = getBooleanPref("landscapeOrientation", true);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  835 */     this.networkPort = getIntPref("networkPort", 5123);
/*  836 */     if (this.networkPort < 1024 || this.networkPort > 65535)
/*      */     {
/*  838 */       this.networkPort = 5123;
/*      */     }
/*      */ 
/*      */     
/*  842 */     this.udpInMultiplayer = getBooleanPref("udpInMultiplayer", false);
/*      */ 
/*      */     
/*  845 */     this.numberOfWins = getIntPref("numberOfWins", 0);
/*  846 */     this.rateGameShown = getBooleanPref("rateGameShown", false);
/*      */ 
/*      */     
/*  849 */     this.uuid = getStringPref("uuid", null);
/*      */     
/*  851 */     this.networkClientId = getStringPref("networkClientId", null);
/*  852 */     this.networkServerId = getStringPref("networkServerId", null);
/*      */ 
/*      */     
/*  855 */     this.lastSeenMessageId = getIntPref("lastSeenMessageId", -1);
/*      */     
/*  857 */     this.lastSeenMessageIds = getStringPref("lastSeenMessageIds", "");
/*      */     
/*  859 */     this.nextBackgroundMap = getIntPref("nextBackgroundMap", 1);
/*      */ 
/*      */ 
/*      */     
/*  863 */     this.showChatAndPingShortcuts = getBooleanPref("showChatAndPingShortcuts", true);
/*      */ 
/*      */ 
/*      */     
/*  867 */     this.teamUnitCapSinglePlayer = getIntPref("teamUnitCapSinglePlayer", 1000);
/*  868 */     this.teamUnitCapHostedGame = getIntPref("teamUnitCapHostedGame", 250);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  873 */     this.modSettings = getStringPref("modSettings", "");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  878 */     this.loadDisabledModData = getBooleanPref("loadDisabledModData", false);
/*      */     
/*  880 */     this.lastModCount = getIntPref("lastModCount", -1);
/*      */ 
/*      */     
/*  883 */     this.smartSelection_v2 = getBooleanPref("smartSelection_v2", true);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  888 */     this.mouseOrders = getIntPref("mouseOrders", 1);
/*  889 */     this.mousePlacement = getIntPref("mousePlacement", 1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  899 */     if (l.aG)
/*      */     {
/*  901 */       loadFromFileSystem();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void save() {
/*  911 */     if (l.aF) {
/*      */ 
/*      */ 
/*      */       
/*  915 */       if (l.aG)
/*      */       {
/*  917 */         saveToFileSystem();
/*      */       }
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  924 */     SharedPreferences.Editor editor = this.prefs.edit();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  929 */     editor.putInt("settingVersion", 2);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  934 */     editor.putInt("settingsGameVersion", 151);
/*      */ 
/*      */     
/*  937 */     editor.putBoolean("hasPlayedGameOrSeenHelp", this.hasPlayedGameOrSeenHelp);
/*      */ 
/*      */ 
/*      */     
/*  941 */     editor.putString("slick2dResolution", this.slick2dResolution);
/*      */     
/*  943 */     editor.putString("slick2dFullScreenResolution", this.slick2dFullScreenResolution);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  949 */     editor.putBoolean("slick2dFullScreen", this.slick2dFullScreen);
/*      */ 
/*      */     
/*  952 */     editor.putBoolean("enableSounds", this.enableSounds);
/*      */ 
/*      */     
/*  955 */     editor.putBoolean("enableMouseCapture", this.enableMouseCapture);
/*      */     
/*  957 */     Log.d("RustedWarfare", "put mv:" + this.musicVolume);
/*      */ 
/*      */     
/*  960 */     editor.putFloat("musicVolume", this.musicVolume);
/*      */     
/*  962 */     editor.putFloat("masterVolume", this.masterVolume);
/*      */     
/*  964 */     editor.putFloat("gameVolume", this.gameVolume);
/*      */     
/*  966 */     editor.putFloat("interfaceVolume", this.interfaceVolume);
/*      */     
/*  968 */     editor.putFloat("scrollSpeed", this.scrollSpeed);
/*      */     
/*  970 */     editor.putFloat("edgeScrollSpeed", this.edgeScrollSpeed);
/*      */ 
/*      */     
/*  973 */     editor.putBoolean("onscreenControls", this.onscreenControls);
/*  974 */     editor.putBoolean("trackpad", this.trackpad);
/*  975 */     editor.putBoolean("dpad", this.dpad);
/*      */ 
/*      */     
/*  978 */     editor.putBoolean("batterySaving", this.batterySaving);
/*      */     
/*  980 */     editor.putBoolean("highRefreshRate", this.highRefreshRate);
/*      */     
/*  982 */     editor.putBoolean("unlockedScreenRotation", this.unlockedScreenRotation);
/*      */ 
/*      */ 
/*      */     
/*  986 */     editor.putBoolean("renderBackground", this.renderBackground);
/*  987 */     editor.putBoolean("renderExtraLayers", this.renderExtraLayers);
/*      */     
/*  989 */     editor.putBoolean("renderControls", this.renderControls);
/*      */ 
/*      */     
/*  992 */     editor.putBoolean("immersiveFullScreen", this.immersiveFullScreen);
/*      */     
/*  994 */     editor.putBoolean("renderDoubleScale", this.renderDoubleScale);
/*      */     
/*  996 */     editor.putBoolean("showUnitGroups", this.showUnitGroups);
/*      */ 
/*      */     
/*  999 */     editor.putBoolean("renderClouds", this.renderClouds);
/*      */     
/* 1001 */     editor.putBoolean("softFogFading", this.softFogFading);
/*      */ 
/*      */     
/* 1004 */     editor.putBoolean("showUnitWaypoints", this.showUnitWaypoints);
/* 1005 */     editor.putBoolean("useMinimapAllyColors", this.useMinimapAllyColors);
/*      */ 
/*      */     
/* 1008 */     editor.putBoolean("showWarLogOnScreen", this.showWarLogOnScreen);
/*      */     
/* 1010 */     editor.putBoolean("classicInterface", this.classicInterface);
/*      */ 
/*      */ 
/*      */     
/* 1014 */     editor.putBoolean("quickRally", this.quickRally);
/*      */ 
/*      */ 
/*      */     
/* 1018 */     editor.putBoolean("doubleClickToAttackMove", this.doubleClickToAttackMove);
/*      */ 
/*      */ 
/*      */     
/* 1022 */     editor.putBoolean("showMapPingsOnBattlefield", this.showMapPingsOnBattlefield);
/* 1023 */     editor.putBoolean("showMapPingsOnMinimap", this.showMapPingsOnMinimap);
/* 1024 */     editor.putBoolean("showPlayerChatInGame", this.showPlayerChatInGame);
/*      */ 
/*      */ 
/*      */     
/* 1028 */     editor.putBoolean("allowGameRecording", this.allowGameRecording);
/*      */ 
/*      */ 
/*      */     
/* 1032 */     editor.putBoolean("showHp", this.showHp);
/*      */     
/* 1034 */     editor.putBoolean("showUnitIcons", this.showUnitIcons);
/*      */     
/* 1036 */     editor.putBoolean("gestureZoom", this.gestureZoom);
/*      */     
/* 1038 */     editor.putBoolean("useCircleSelect", this.useCircleSelect);
/*      */     
/* 1040 */     editor.putBoolean("showZoomButton", this.showZoomButton);
/*      */     
/* 1042 */     editor.putBoolean("showFps", this.showFps);
/*      */     
/* 1044 */     editor.putBoolean("sendReports", this.sendReports);
/*      */ 
/*      */     
/* 1047 */     editor.putBoolean("shownAudioWarning", this.shownAudioWarning);
/*      */ 
/*      */     
/* 1050 */     editor.putBoolean("mouseSupport", this.mouseSupport);
/* 1051 */     editor.putBoolean("keyboardSupport", this.keyboardSupport);
/*      */ 
/*      */     
/* 1054 */     editor.putBoolean("forceEnglish", this.forceEnglish);
/*      */ 
/*      */     
/* 1057 */     editor.putBoolean("saveMultiplayerReplays", this.saveMultiplayerReplays);
/*      */     
/* 1059 */     editor.putBoolean("replaysShowRecordedChat", this.replaysShowRecordedChat);
/*      */     
/* 1061 */     editor.putString("lastNetworkPlayerName", this.lastNetworkPlayerName);
/*      */     
/* 1063 */     editor.putString("lastNetworkIP", this.lastNetworkIP);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1068 */     editor.putInt("aiDifficulty", this.aiDifficulty);
/*      */ 
/*      */     
/* 1071 */     editor.putInt("locationDpad", this.locationDpad);
/* 1072 */     editor.putInt("locationAction", this.locationAction);
/*      */ 
/*      */     
/* 1075 */     editor.putInt("keyAction", this.keyAction);
/* 1076 */     editor.putInt("keyJump", this.keyJump);
/* 1077 */     editor.putInt("keyLeft", this.keyLeft);
/* 1078 */     editor.putInt("keyRight", this.keyRight);
/* 1079 */     editor.putInt("keyDown", this.keyDown);
/*      */ 
/*      */     
/* 1082 */     editor.putBoolean("landscapeOrientation", this.landscapeOrientation);
/*      */ 
/*      */ 
/*      */     
/* 1086 */     editor.putInt("networkPort", this.networkPort);
/*      */ 
/*      */ 
/*      */     
/* 1090 */     editor.putBoolean("udpInMultiplayer", this.udpInMultiplayer);
/*      */     
/* 1092 */     editor.putInt("numberOfWins", this.numberOfWins);
/* 1093 */     editor.putBoolean("rateGameShown", this.rateGameShown);
/*      */ 
/*      */     
/* 1096 */     editor.putString("uuid", this.uuid);
/*      */     
/* 1098 */     editor.putString("networkClientId", this.networkClientId);
/* 1099 */     editor.putString("networkServerId", this.networkServerId);
/*      */     
/* 1101 */     editor.putInt("lastSeenMessageId", this.lastSeenMessageId);
/*      */     
/* 1103 */     editor.putString("lastSeenMessageIds", this.lastSeenMessageIds);
/*      */ 
/*      */     
/* 1106 */     editor.putInt("nextBackgroundMap", this.nextBackgroundMap);
/*      */ 
/*      */ 
/*      */     
/* 1110 */     editor.putBoolean("showChatAndPingShortcuts", this.showChatAndPingShortcuts);
/*      */ 
/*      */     
/* 1113 */     editor.putString("modSettings", this.modSettings);
/*      */ 
/*      */ 
/*      */     
/* 1117 */     editor.putInt("teamUnitCapSinglePlayer", this.teamUnitCapSinglePlayer);
/* 1118 */     editor.putInt("teamUnitCapHostedGame", this.teamUnitCapHostedGame);
/*      */ 
/*      */ 
/*      */     
/* 1122 */     editor.putBoolean("loadDisabledModData", this.loadDisabledModData);
/*      */ 
/*      */     
/* 1125 */     editor.putInt("lastModCount", this.lastModCount);
/*      */ 
/*      */ 
/*      */     
/* 1129 */     editor.putBoolean("smartSelection_v2", this.smartSelection_v2);
/*      */ 
/*      */ 
/*      */     
/* 1133 */     editor.putInt("mouseOrders", this.mouseOrders);
/* 1134 */     editor.putInt("mousePlacement", this.mousePlacement);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1140 */     editor.commit();
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\SettingsEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */