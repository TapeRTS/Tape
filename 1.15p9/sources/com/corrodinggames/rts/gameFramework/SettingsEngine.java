package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p040h.C0823a;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.p048a.C1068a;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/SettingsEngine.class */
public class SettingsEngine {
    public boolean enableSounds;
    public boolean enableMouseCapture;
    public boolean androidNoSoundPrioritiesDebug;
    public boolean disableDigitGrouping;
    public String slick2dResolution;
    public int settingsGameVersionFirst;
    public String slick2dFullScreenResolution;
    public boolean upgradedToNoPublicStorage;
    public boolean upgradedToNoPublicStorageWarningShown;
    public boolean slick2dFullScreen;
    public boolean slick2dBorderless;
    public boolean autosaving;
    public float masterVolume;
    public float gameVolume;
    public float interfaceVolume;
    public float musicVolume;
    public float scrollSpeed;
    public float edgeScrollSpeed;
    public boolean hasPlayedGameOrSeenHelp;
    public boolean onscreenControls;
    public boolean trackpad;
    public boolean dpad;
    public boolean batterySaving;
    public boolean highRefreshRate;
    public boolean renderBackground;
    public boolean renderExtraLayers;
    public boolean immersiveFullScreen;
    public boolean unlockedScreenRotation;
    public boolean renderDoubleScale;
    public boolean renderClouds;
    public boolean softFogFading;
    public boolean showUnitGroups;
    public boolean allowGameRecording;
    public boolean renderControls;
    public boolean showHp;
    public boolean showHpChanges;
    public boolean showUnitIcons;
    public boolean gestureZoom;
    public boolean useCircleSelect;
    public boolean showZoomButton;
    public boolean showFps;
    public boolean newRender;
    public boolean shaderEffects;
    public boolean teamShaders;
    public boolean showUnitWaypoints;
    public boolean useMinimapAllyColors;
    public boolean showWarLogOnScreen;
    public boolean classicInterface;
    public boolean quickRally;
    public boolean doubleClickToAttackMove;
    public boolean showMapPingsOnBattlefield;
    public boolean showMapPingsOnMinimap;
    public boolean showPlayerChatInGame;
    public boolean sendReports;
    public boolean shownAudioWarning;
    public boolean mouseSupport;
    public boolean keyboardSupport;
    public boolean forceEnglish;
    public String overrideLanguageCode;
    public boolean saveMultiplayerReplays;
    public boolean replaysShowRecordedChat;
    public int nextBackgroundMap;
    public String lastNetworkPlayerName;
    public String lastNetworkIP;
    public String lastDebugOption;
    public boolean landscapeOrientation;
    public int aiDifficulty;
    public int locationAction;
    public int locationDpad;
    public int keyAction;
    public int keyJump;
    public int keyLeft;
    public int keyRight;
    public int keyDown;
    public String uuid;
    public String networkClientId;
    public String networkClientIdMachineKey;
    public String networkServerId;
    public int numIncompleteLoadAttempts;
    public int numLoadsSinceRunningGameOrNormalExit;
    public int lastSeenMessageId;
    public String lastSeenMessageIds;
    public int networkPort;
    public boolean udpInMultiplayer;
    public int banTimeInSecondsAfterKick;
    public int numberOfWins;
    public boolean rateGameShown;
    public int mouseOrders;
    public int mousePlacement;
    public boolean liveReloading;
    public boolean renderVsync;
    public boolean renderSmoothDelta;
    public int teamUnitCapSinglePlayer;
    public int teamUnitCapHostedGame;
    public boolean showChatAndPingShortcuts;
    public String modSettings;
    public int modSettingsVersion;
    public int storageType;
    public boolean hasSelectedAStorageType;
    public boolean hadStoragePermissionInPast;
    public boolean loadDisabledModData;
    public int lastModCount;
    public String modSAFlinks;
    public boolean externalSAFWorking;
    public String externalSAFLink;
    public String externalSAFPathShown;
    public String externalSAFPathExtra;
    public boolean smartSelection_v2;
    SharedPreferences prefs;
    static SettingsEngine settingsEngine = null;
    public boolean resizeFontWithUIScale = true;
    public float renderDensity = 1.0f;
    public float uiRenderScale = 1.0f;
    public boolean renderExtraShadows = true;
    public boolean renderFancyWater = false;
    public boolean showActionInfoHoverNearMouse = true;
    public boolean disableModLazyLoad = false;
    public boolean renderAntiAlias = true;
    public boolean showSelectedUnitsList = true;
    public String teamColors = "#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4";
    public String teamColorsNames = "GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE";
    public boolean highGraphics = true;
    HashMap settingFields = new HashMap();

    public static SettingsEngine getInstance(Context context) {
        if (settingsEngine == null) {
            settingsEngine = new SettingsEngine(context);
        }
        return settingsEngine;
    }

    public boolean getBooleanPref(String str, boolean z) {
        if (GameEngine.f6199aU) {
            return z;
        }
        return this.prefs.getBoolean(str, z);
    }

    public int getIntPref(String str, int i) {
        if (GameEngine.f6199aU) {
            return i;
        }
        return this.prefs.getInt(str, i);
    }

    public float getFloatPref(String str, float f) {
        if (GameEngine.f6199aU) {
            return f;
        }
        return this.prefs.getFloat(str, f);
    }

    public String getStringPref(String str, String str2) {
        if (GameEngine.f6199aU) {
            return str2;
        }
        return this.prefs.getString(str, str2);
    }

    public String getValueDynamic(String str) {
        try {
            Field field = (Field) this.settingFields.get(str);
            if (field == null) {
                throw new RuntimeException("Could not find: " + str);
            }
            Object obj = field.get(this);
            if (obj == null) {
                return null;
            }
            return obj.toString();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean setValueDynamic(String str, String str2) {
        try {
            Field field = (Field) this.settingFields.get(str);
            Object obj = str2;
            if (field.getType().equals(Boolean.TYPE)) {
                if (str2 == null) {
                    throw new RuntimeException("value==null");
                }
                obj = Boolean.valueOf(Boolean.parseBoolean(str2));
            }
            if (field.getType().equals(Float.TYPE)) {
                if (str2 != null && str2.contains(",")) {
                    str2 = str2.replace(",", ".");
                }
                obj = Float.valueOf(Float.parseFloat(str2));
            }
            if (field.getType().equals(Integer.TYPE)) {
                obj = Integer.valueOf(Integer.parseInt(str2));
            }
            field.set(this, obj);
            return true;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public String getPreferencesPath() {
        return C0750a.m2447e("/SD/rustedWarfare/preferences.ini");
    }

    public boolean saveToFileSystem() {
        GameEngine gameEngine = GameEngine.getInstance();
        File file = new File(getPreferencesPath());
        GameEngine.PrintLog("Saving settings to: " + file.getAbsolutePath());
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("[settings]");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.settingFields.keySet());
            Collections.sort(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String valueDynamic = getValueDynamic(str);
                if (valueDynamic == null) {
                    valueDynamic = VariableScope.nullOrMissingString;
                }
                printWriter.println(str + ":" + valueDynamic.replace("\\", "\\\\").replace("\n", "\\n"));
            }
            printWriter.println("[keys]");
            Iterator it2 = gameEngine.f6112bT.f4140al.iterator();
            while (it2.hasNext()) {
                C0639ad c0639ad = (C0639ad) it2.next();
                if (c0639ad.f4145b && !c0639ad.mo2946d()) {
                    printWriter.println((VariableScope.nullOrMissingString + c0639ad.m2947e()) + ":" + gameEngine.f6112bT.m2966a(c0639ad));
                }
            }
            printWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            GameEngine.getInstance().m1192a("Failed to save preferences, IO error", 1);
            return false;
        }
    }

    public void loadFromFileSystem() {
        GameEngine gameEngine = GameEngine.getInstance();
        String preferencesPath = getPreferencesPath();
        File file = new File(preferencesPath);
        if (!file.exists()) {
            GameEngine.PrintLog("preferences not found, not loading (" + preferencesPath + ")");
            return;
        }
        GameEngine.PrintLog("loadFromFileSystem filepath: " + file.getAbsolutePath());
        try {
            C1072ab c1072ab = new C1072ab(preferencesPath);
            for (Map.Entry entry : this.settingFields.entrySet()) {
                String str = (String) entry.getKey();
                String m681b = c1072ab.m681b("settings", str, (String) null);
                if (GameEngine.f6204aZ) {
                    GameEngine.PrintLog(str + "= " + m681b);
                }
                if (m681b != null && !VariableScope.nullOrMissingString.equals(m681b)) {
                    if (str.startsWith("key.")) {
                        String replace = str.replace("key.", VariableScope.nullOrMissingString);
                        GameEngine.PrintLog("loading keybind:" + replace);
                        gameEngine.f6112bT.m2963a(replace, m681b);
                    } else {
                        setValueDynamic(str, m681b);
                    }
                }
            }
            Iterator it = gameEngine.f6112bT.f4140al.iterator();
            while (it.hasNext()) {
                C0639ad c0639ad = (C0639ad) it.next();
                if (c0639ad.f4145b && !c0639ad.mo2946d()) {
                    String m2947e = c0639ad.m2947e();
                    String m681b2 = c1072ab.m681b("keys", m2947e, (String) null);
                    if (m681b2 != null && !VariableScope.nullOrMissingString.equals(m681b2)) {
                        gameEngine.f6112bT.m2963a(m2947e, m681b2);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            GameEngine.getInstance().m1192a("Failed to load preferences, IO error", 1);
        }
    }

    private SettingsEngine(Context context) {
        Field[] fields;
        this.autosaving = true;
        this.renderClouds = false;
        this.softFogFading = false;
        this.doubleClickToAttackMove = false;
        this.showMapPingsOnBattlefield = true;
        this.showMapPingsOnMinimap = true;
        this.showPlayerChatInGame = true;
        this.banTimeInSecondsAfterKick = 60;
        this.teamUnitCapSinglePlayer = 1000;
        this.teamUnitCapHostedGame = 250;
        this.showChatAndPingShortcuts = true;
        for (Field field : getClass().getFields()) {
            String name = field.getName();
            if (this.settingFields.get(name) != null) {
                GameEngine.PrintLog("SettingsEngine: fields: " + name + " already exists");
            }
            if (GameEngine.f6204aZ) {
                GameEngine.PrintLog("SettingsEngine: field:" + name);
            }
            this.settingFields.put(name, field);
        }
        if (!GameEngine.f6199aU) {
            this.prefs = context.mo7351a("rts_settings", 0);
        }
        int intPref = getIntPref("settingVersion", 1);
        int intPref2 = getIntPref("settingsGameVersion", 0);
        this.settingsGameVersionFirst = getIntPref("settingsGameVersionFirst", 0);
        if (this.settingsGameVersionFirst == 0) {
            if (intPref2 != 0) {
                this.settingsGameVersionFirst = intPref2;
            } else {
                this.settingsGameVersionFirst = 172;
            }
        }
        this.upgradedToNoPublicStorage = getBooleanPref("upgradedToNoPublicStorage", this.settingsGameVersionFirst <= 160);
        this.upgradedToNoPublicStorageWarningShown = getBooleanPref("upgradedToNoPublicStorageWarningShown", false);
        this.slick2dResolution = getStringPref("slick2dResolution", "native");
        this.slick2dFullScreenResolution = getStringPref("slick2dFullScreenResolution", "native");
        this.slick2dFullScreen = getBooleanPref("slick2dFullScreen", false);
        this.hasPlayedGameOrSeenHelp = getBooleanPref("hasPlayedGameOrSeenHelp", false);
        this.enableSounds = getBooleanPref("enableSounds", true);
        this.enableMouseCapture = getBooleanPref("enableMouseCapture", false);
        this.androidNoSoundPrioritiesDebug = getBooleanPref("androidNoSoundPrioritiesDebug", false);
        this.disableDigitGrouping = getBooleanPref("disableDigitGrouping", false);
        this.musicVolume = getFloatPref("musicVolume", 0.25f);
        this.masterVolume = getFloatPref("masterVolume", GameEngine.m1157au() ? 0.5f : 1.0f);
        this.gameVolume = getFloatPref("gameVolume", 1.0f);
        this.interfaceVolume = getFloatPref("interfaceVolume", 0.8f);
        this.scrollSpeed = getFloatPref("scrollSpeed", 1.0f);
        this.edgeScrollSpeed = getFloatPref("edgeScrollSpeed", 1.0f);
        this.onscreenControls = getBooleanPref("onscreenControls", true);
        this.trackpad = getBooleanPref("trackpad", true);
        this.dpad = getBooleanPref("dpad", true);
        this.batterySaving = getBooleanPref("batterySaving", false);
        this.highRefreshRate = getBooleanPref("highRefreshRate", GameEngine.m1157au());
        this.unlockedScreenRotation = getBooleanPref("unlockedScreenRotation", false);
        this.renderBackground = getBooleanPref("renderBackground", true);
        this.renderExtraLayers = getBooleanPref("renderExtraLayers", true);
        this.renderControls = getBooleanPref("renderControls", true);
        this.immersiveFullScreen = getBooleanPref("immersiveFullScreen", true);
        this.renderDoubleScale = getBooleanPref("renderDoubleScale", false);
        this.showUnitGroups = getBooleanPref("showUnitGroups", true);
        this.renderClouds = getBooleanPref("renderClouds", GameEngine.f6204aZ ? true : GameEngine.m1157au());
        this.softFogFading = getBooleanPref("softFogFading", GameEngine.f6204aZ ? true : GameEngine.m1157au());
        this.showUnitWaypoints = getBooleanPref("showUnitWaypoints", true);
        this.useMinimapAllyColors = getBooleanPref("useMinimapAllyColors", true);
        this.showWarLogOnScreen = getBooleanPref("showWarLogOnScreen", GameEngine.m1157au());
        this.classicInterface = getBooleanPref("classicInterface", false);
        boolean z = GameEngine.m1157au();
        this.quickRally = getBooleanPref("quickRally", z);
        if (intPref <= 1 && !GameEngine.m1157au()) {
            this.quickRally = z;
        }
        this.doubleClickToAttackMove = getBooleanPref("doubleClickToAttackMove", true);
        this.showMapPingsOnBattlefield = getBooleanPref("showMapPingsOnBattlefield", true);
        this.showMapPingsOnMinimap = getBooleanPref("showMapPingsOnMinimap", true);
        this.showPlayerChatInGame = getBooleanPref("showPlayerChatInGame", true);
        this.allowGameRecording = false;
        this.showHp = getBooleanPref("showHp", true);
        this.showHpChanges = getBooleanPref("showHpChanges", true);
        this.showUnitIcons = getBooleanPref("showUnitIcons", true);
        this.gestureZoom = getBooleanPref("gestureZoom", true);
        this.useCircleSelect = getBooleanPref("useCircleSelect", false);
        this.showZoomButton = getBooleanPref("showZoomButton", true);
        this.showFps = getBooleanPref("showFps", false);
        this.newRender = getBooleanPref("newRender", false);
        this.shaderEffects = getBooleanPref("shaderEffects", false);
        this.teamShaders = getBooleanPref("teamShaders", false);
        this.sendReports = getBooleanPref("sendReports", true);
        this.shownAudioWarning = getBooleanPref("shownAudioWarning", false);
        this.mouseSupport = getBooleanPref("mouseSupport", !GameEngine.m1132d(context));
        this.keyboardSupport = getBooleanPref("keyboardSupport", true);
        this.forceEnglish = getBooleanPref("forceEnglish", GameEngine.f6204aZ);
        boolean z2 = GameEngine.m1157au();
        this.saveMultiplayerReplays = getBooleanPref("saveMultiplayerReplays", z2);
        if (intPref <= 1) {
            this.saveMultiplayerReplays = z2;
        }
        this.replaysShowRecordedChat = getBooleanPref("replaysShowRecordedChat", true);
        this.lastNetworkPlayerName = getStringPref("lastNetworkPlayerName", null);
        this.lastNetworkIP = getStringPref("lastNetworkIP", null);
        this.lastDebugOption = getStringPref("lastDebugOption", null);
        this.aiDifficulty = getIntPref("aiDifficulty", 0);
        this.locationDpad = getIntPref("locationDpad", 0);
        this.locationAction = getIntPref("locationAction", 3);
        this.keyAction = getIntPref("keyAction", 23);
        this.keyJump = getIntPref("keyJump", 19);
        this.keyLeft = getIntPref("keyLeft", 21);
        this.keyRight = getIntPref("keyRight", 22);
        this.keyDown = getIntPref("keyDown", 20);
        this.landscapeOrientation = getBooleanPref("landscapeOrientation", true);
        this.networkPort = getIntPref("networkPort", 5123);
        if (this.networkPort < 1024 || this.networkPort > 65535) {
            this.networkPort = 5123;
        }
        this.udpInMultiplayer = getBooleanPref("udpInMultiplayer", false);
        this.banTimeInSecondsAfterKick = getIntPref("banTimeInSecondsAfterKick", 60);
        this.numIncompleteLoadAttempts = getIntPref("numIncompleteLoadAttempts", 0);
        this.numLoadsSinceRunningGameOrNormalExit = getIntPref("numLoadsSinceRunningGameOrNormalExit", 0);
        this.numberOfWins = getIntPref("numberOfWins", 0);
        this.rateGameShown = getBooleanPref("rateGameShown", false);
        this.uuid = getStringPref("uuid", null);
        this.networkClientId = getStringPref("networkClientId", null);
        this.networkServerId = getStringPref("networkServerId", null);
        this.lastSeenMessageId = getIntPref("lastSeenMessageId", -1);
        this.lastSeenMessageIds = getStringPref("lastSeenMessageIds", VariableScope.nullOrMissingString);
        this.nextBackgroundMap = getIntPref("nextBackgroundMap", 1);
        this.showChatAndPingShortcuts = getBooleanPref("showChatAndPingShortcuts", true);
        this.teamUnitCapSinglePlayer = getIntPref("teamUnitCapSinglePlayer", 1000);
        this.teamUnitCapHostedGame = getIntPref("teamUnitCapHostedGame", 250);
        this.modSettings = getStringPref("modSettings", VariableScope.nullOrMissingString);
        this.modSettingsVersion = getIntPref("modSettingsVersion", 0);
        boolean z3 = false;
        if (GameEngine.m1159as() && C0090c.m6972b(C0090c.m6984a())) {
            z3 = true;
        }
        this.storageType = getIntPref("storageType", z3 ? 2 : 0);
        this.hadStoragePermissionInPast = getBooleanPref("hadStoragePermissionInPast", false);
        if (z3) {
            this.hadStoragePermissionInPast = true;
        }
        this.hasSelectedAStorageType = getBooleanPref("hasSelectedAStorageType", false);
        this.loadDisabledModData = getBooleanPref("loadDisabledModData", false);
        this.lastModCount = getIntPref("lastModCount", -1);
        this.modSAFlinks = getStringPref("modSAFlinks", null);
        this.externalSAFWorking = getBooleanPref("externalSAFWorking", false);
        this.externalSAFLink = getStringPref("externalSAFLink", null);
        this.externalSAFPathShown = getStringPref("externalSAFPathShown", null);
        this.externalSAFPathExtra = getStringPref("externalSAFPathExtra", null);
        this.smartSelection_v2 = getBooleanPref("smartSelection_v2", true);
        this.mouseOrders = getIntPref("mouseOrders", 1);
        this.mousePlacement = getIntPref("mousePlacement", 1);
        this.autosaving = getBooleanPref("autosaving", true);
        if (GameEngine.f6201aW) {
            loadFromFileSystem();
        }
    }

    public synchronized boolean save() {
        if (GameEngine.f6199aU) {
            if (GameEngine.f6201aW) {
                return saveToFileSystem();
            }
            return true;
        }
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putInt("settingVersion", 2);
        edit.putInt("settingsGameVersion", 172);
        edit.putInt("settingsGameVersionFirst", this.settingsGameVersionFirst);
        edit.putBoolean("upgradedToNoPublicStorage", this.upgradedToNoPublicStorage);
        edit.putBoolean("upgradedToNoPublicStorageWarningShown", this.upgradedToNoPublicStorageWarningShown);
        edit.putBoolean("hasPlayedGameOrSeenHelp", this.hasPlayedGameOrSeenHelp);
        edit.putString("slick2dResolution", this.slick2dResolution);
        edit.putString("slick2dFullScreenResolution", this.slick2dFullScreenResolution);
        edit.putBoolean("slick2dFullScreen", this.slick2dFullScreen);
        edit.putBoolean("enableSounds", this.enableSounds);
        edit.putBoolean("enableMouseCapture", this.enableMouseCapture);
        edit.putBoolean("androidNoSoundPrioritiesDebug", this.androidNoSoundPrioritiesDebug);
        edit.putBoolean("disableDigitGrouping", this.disableDigitGrouping);
        Log.m7106d("RustedWarfare", "put mv:" + this.musicVolume);
        edit.putFloat("musicVolume", this.musicVolume);
        edit.putFloat("masterVolume", this.masterVolume);
        edit.putFloat("gameVolume", this.gameVolume);
        edit.putFloat("interfaceVolume", this.interfaceVolume);
        edit.putFloat("scrollSpeed", this.scrollSpeed);
        edit.putFloat("edgeScrollSpeed", this.edgeScrollSpeed);
        edit.putBoolean("onscreenControls", this.onscreenControls);
        edit.putBoolean("trackpad", this.trackpad);
        edit.putBoolean("dpad", this.dpad);
        edit.putBoolean("batterySaving", this.batterySaving);
        edit.putBoolean("highRefreshRate", this.highRefreshRate);
        edit.putBoolean("unlockedScreenRotation", this.unlockedScreenRotation);
        edit.putBoolean("renderBackground", this.renderBackground);
        edit.putBoolean("renderExtraLayers", this.renderExtraLayers);
        edit.putBoolean("renderControls", this.renderControls);
        edit.putBoolean("immersiveFullScreen", this.immersiveFullScreen);
        edit.putBoolean("renderDoubleScale", this.renderDoubleScale);
        edit.putBoolean("showUnitGroups", this.showUnitGroups);
        edit.putBoolean("renderClouds", this.renderClouds);
        edit.putBoolean("softFogFading", this.softFogFading);
        edit.putBoolean("showUnitWaypoints", this.showUnitWaypoints);
        edit.putBoolean("useMinimapAllyColors", this.useMinimapAllyColors);
        edit.putBoolean("showWarLogOnScreen", this.showWarLogOnScreen);
        edit.putBoolean("classicInterface", this.classicInterface);
        edit.putBoolean("quickRally", this.quickRally);
        edit.putBoolean("doubleClickToAttackMove", this.doubleClickToAttackMove);
        edit.putBoolean("showMapPingsOnBattlefield", this.showMapPingsOnBattlefield);
        edit.putBoolean("showMapPingsOnMinimap", this.showMapPingsOnMinimap);
        edit.putBoolean("showPlayerChatInGame", this.showPlayerChatInGame);
        edit.putBoolean("allowGameRecording", this.allowGameRecording);
        edit.putBoolean("showHp", this.showHp);
        edit.putBoolean("showHpChanges", this.showHpChanges);
        edit.putBoolean("showUnitIcons", this.showUnitIcons);
        edit.putBoolean("gestureZoom", this.gestureZoom);
        edit.putBoolean("useCircleSelect", this.useCircleSelect);
        edit.putBoolean("showZoomButton", this.showZoomButton);
        edit.putBoolean("showFps", this.showFps);
        edit.putBoolean("newRender", this.newRender);
        edit.putBoolean("shaderEffects", this.shaderEffects);
        edit.putBoolean("teamShaders", this.teamShaders);
        edit.putBoolean("sendReports", this.sendReports);
        edit.putBoolean("shownAudioWarning", this.shownAudioWarning);
        edit.putBoolean("mouseSupport", this.mouseSupport);
        edit.putBoolean("keyboardSupport", this.keyboardSupport);
        edit.putBoolean("forceEnglish", this.forceEnglish);
        edit.putBoolean("saveMultiplayerReplays", this.saveMultiplayerReplays);
        edit.putBoolean("replaysShowRecordedChat", this.replaysShowRecordedChat);
        edit.putString("lastNetworkPlayerName", this.lastNetworkPlayerName);
        edit.putString("lastNetworkIP", this.lastNetworkIP);
        edit.putString("lastDebugOption", this.lastDebugOption);
        edit.putInt("aiDifficulty", this.aiDifficulty);
        edit.putInt("locationDpad", this.locationDpad);
        edit.putInt("locationAction", this.locationAction);
        edit.putInt("keyAction", this.keyAction);
        edit.putInt("keyJump", this.keyJump);
        edit.putInt("keyLeft", this.keyLeft);
        edit.putInt("keyRight", this.keyRight);
        edit.putInt("keyDown", this.keyDown);
        edit.putBoolean("landscapeOrientation", this.landscapeOrientation);
        edit.putInt("networkPort", this.networkPort);
        edit.putBoolean("udpInMultiplayer", this.udpInMultiplayer);
        edit.putInt("banTimeInSecondsAfterKick", this.banTimeInSecondsAfterKick);
        edit.putInt("numIncompleteLoadAttempts", this.numIncompleteLoadAttempts);
        edit.putInt("numLoadsSinceRunningGameOrNormalExit", this.numLoadsSinceRunningGameOrNormalExit);
        edit.putInt("numberOfWins", this.numberOfWins);
        edit.putBoolean("rateGameShown", this.rateGameShown);
        edit.putString("uuid", this.uuid);
        edit.putString("networkClientId", this.networkClientId);
        edit.putString("networkServerId", this.networkServerId);
        edit.putInt("lastSeenMessageId", this.lastSeenMessageId);
        edit.putString("lastSeenMessageIds", this.lastSeenMessageIds);
        edit.putInt("nextBackgroundMap", this.nextBackgroundMap);
        edit.putBoolean("showChatAndPingShortcuts", this.showChatAndPingShortcuts);
        edit.putString("modSettings", this.modSettings);
        edit.putInt("modSettingsVersion", this.modSettingsVersion);
        edit.putInt("storageType", this.storageType);
        edit.putBoolean("hasSelectedAStorageType", this.hasSelectedAStorageType);
        edit.putBoolean("hadStoragePermissionInPast", this.hadStoragePermissionInPast);
        edit.putInt("teamUnitCapSinglePlayer", this.teamUnitCapSinglePlayer);
        edit.putInt("teamUnitCapHostedGame", this.teamUnitCapHostedGame);
        edit.putBoolean("loadDisabledModData", this.loadDisabledModData);
        edit.putInt("lastModCount", this.lastModCount);
        edit.putString("modSAFlinks", this.modSAFlinks);
        edit.putBoolean("externalSAFWorking", this.externalSAFWorking);
        edit.putString("externalSAFLink", this.externalSAFLink);
        edit.putString("externalSAFPathShown", this.externalSAFPathShown);
        edit.putString("externalSAFPathExtra", this.externalSAFPathExtra);
        edit.putBoolean("smartSelection_v2", this.smartSelection_v2);
        edit.putInt("mouseOrders", this.mouseOrders);
        edit.putInt("mousePlacement", this.mousePlacement);
        edit.putBoolean("autosaving", this.autosaving);
        edit.commit();
        return true;
    }

    public boolean loadMainExternalFolder(boolean z) {
        if (!GameEngine.m1159as()) {
            return false;
        }
        GameEngine.PrintLog("loadMainExternalFolder..");
        GameEngine gameEngine = GameEngine.getInstance();
        if (z && gameEngine.m1142c()) {
            GameEngine.PrintLog("Not loading due to extra safe mode");
            return false;
        }
        String str = gameEngine.f6109bQ.externalSAFLink;
        String str2 = gameEngine.f6109bQ.externalSAFPathShown;
        String str3 = gameEngine.f6109bQ.externalSAFPathExtra;
        if (str == null) {
            GameEngine.PrintLog("No external folder set");
            return false;
        }
        GameEngine.PrintLog("External saf link: " + str);
        GameEngine.PrintLog("External saf shown path: " + str2);
        GameEngine.PrintLog("External saf extra: " + str3);
        try {
            Uri parse = Uri.parse(str);
            boolean z2 = false;
            String str4 = null;
            String m752a = C1068a.m752a(parse, true);
            GameEngine.PrintLog("safVirualPathBase: " + m752a);
            if (m752a == null) {
                GameEngine.PrintLog("createSAFLink failed for uri: " + parse);
                z2 = true;
            } else {
                str4 = m752a + str3;
                GameEngine.PrintLog("safVirualPath: " + str4);
                if (!C0750a.m2445f(str4)) {
                    GameEngine.PrintLog("isDirectory failed for: " + str4);
                    z2 = true;
                }
            }
            if (z2) {
                GameEngine.PrintLog("error for uri: " + parse);
                gameEngine.f6109bQ.externalSAFWorking = false;
                String str5 = "Failed to read: " + str2 + " - Folder might have moved or permission expired. Please setup again under in-game settings.";
                if (C0823a.f5405a == null) {
                    C0823a.f5405a = VariableScope.nullOrMissingString;
                }
                C0823a.f5405a += str5;
                C0823a.f5406b = str5;
                return false;
            }
            GameEngine.PrintLog("Using external path");
            gameEngine.f6109bQ.externalSAFWorking = true;
            C0750a.f4862d = str4;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
