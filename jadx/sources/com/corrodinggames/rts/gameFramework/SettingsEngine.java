package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
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
    public String slick2dResolution;
    public String slick2dFullScreenResolution;
    public boolean slick2dFullScreen;
    public boolean slick2dBorderless;
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
    public boolean showUnitIcons;
    public boolean gestureZoom;
    public boolean useCircleSelect;
    public boolean showZoomButton;
    public boolean showFps;
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
    public int lastSeenMessageId;
    public String lastSeenMessageIds;
    public int networkPort;
    public boolean udpInMultiplayer;
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
    public boolean loadDisabledModData;
    public int lastModCount;
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
        if (AbstractC0789l.f5471aF) {
            return z;
        }
        return this.prefs.getBoolean(str, z);
    }

    public int getIntPref(String str, int i) {
        if (AbstractC0789l.f5471aF) {
            return i;
        }
        return this.prefs.getInt(str, i);
    }

    public float getFloatPref(String str, float f) {
        if (AbstractC0789l.f5471aF) {
            return f;
        }
        return this.prefs.getFloat(str, f);
    }

    public String getStringPref(String str, String str2) {
        if (AbstractC0789l.f5471aF) {
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
        return C0596a.m1889c("/SD/rustedWarfare/preferences.ini");
    }

    public void saveToFileSystem() {
        AbstractC0789l u = AbstractC0789l.m638u();
        File file = new File(getPreferencesPath());
        AbstractC0789l.m670d("Saving to: " + file.getAbsolutePath());
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
                    AbstractC0789l.m670d("saveToFileSystem: " + str + " is null");
                    valueDynamic = "";
                }
                printWriter.println(str + ":" + valueDynamic.replace("\\", "\\\\").replace("\n", "\\n"));
            }
            printWriter.println("[keys]");
            Iterator it2 = u.f5519bB.f3670ak.iterator();
            while (it2.hasNext()) {
                C0538ad adVar = (C0538ad) it2.next();
                if (adVar.f3675b && !adVar.mo2069d()) {
                    printWriter.println(("" + adVar.m2070e()) + ":" + u.f5519bB.m2087a(adVar));
                }
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            AbstractC0789l.m638u().m718a("Failed to save preferences, IO error", 1);
        }
    }

    public void loadFromFileSystem() {
        AbstractC0789l u = AbstractC0789l.m638u();
        String preferencesPath = getPreferencesPath();
        File file = new File(preferencesPath);
        if (!file.exists()) {
            AbstractC0789l.m670d("preferences not found, not loading (" + preferencesPath + ")");
            return;
        }
        AbstractC0789l.m670d("loadFromFileSystem filepath: " + file.getAbsolutePath());
        try {
            C0809ab abVar = new C0809ab(preferencesPath);
            for (Map.Entry entry : this.settingFields.entrySet()) {
                String str = (String) entry.getKey();
                String b = abVar.m579b("settings", str, (String) null);
                if (AbstractC0789l.f5475aJ) {
                    AbstractC0789l.m670d(str + "= " + b);
                }
                if (b != null && !"".equals(b)) {
                    if (str.startsWith("key.")) {
                        String replace = str.replace("key.", "");
                        AbstractC0789l.m670d("loading keybind:" + replace);
                        u.f5519bB.m2085a(replace, b);
                    } else {
                        setValueDynamic(str, b);
                    }
                }
            }
            Iterator it = u.f5519bB.f3670ak.iterator();
            while (it.hasNext()) {
                C0538ad adVar = (C0538ad) it.next();
                if (adVar.f3675b && !adVar.mo2069d()) {
                    String e = adVar.m2070e();
                    String b2 = abVar.m579b("keys", e, (String) null);
                    if (b2 != null && !"".equals(b2)) {
                        u.f5519bB.m2085a(e, b2);
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            AbstractC0789l.m638u().m718a("Failed to load preferences, IO error", 1);
        }
    }

    private SettingsEngine(Context context) {
        Field[] fields;
        this.renderClouds = false;
        this.softFogFading = false;
        this.doubleClickToAttackMove = false;
        this.showMapPingsOnBattlefield = true;
        this.showMapPingsOnMinimap = true;
        this.showPlayerChatInGame = true;
        this.teamUnitCapSinglePlayer = 1000;
        this.teamUnitCapHostedGame = 250;
        this.showChatAndPingShortcuts = true;
        for (Field field : getClass().getFields()) {
            String name = field.getName();
            if (this.settingFields.get(name) != null) {
                AbstractC0789l.m670d("SettingsEngine: fields: " + name + " already exists");
            }
            if (AbstractC0789l.f5475aJ) {
                AbstractC0789l.m670d("SettingsEngine: field:" + name);
            }
            this.settingFields.put(name, field);
        }
        if (!AbstractC0789l.f5471aF) {
            this.prefs = context.mo4280a("rts_settings", 0);
        }
        int intPref = getIntPref("settingVersion", 1);
        getIntPref("settingsGameVersion", 0);
        this.slick2dResolution = getStringPref("slick2dResolution", "native");
        this.slick2dFullScreenResolution = getStringPref("slick2dFullScreenResolution", "native");
        this.slick2dFullScreen = getBooleanPref("slick2dFullScreen", false);
        this.hasPlayedGameOrSeenHelp = getBooleanPref("hasPlayedGameOrSeenHelp", false);
        this.enableSounds = getBooleanPref("enableSounds", true);
        this.enableMouseCapture = getBooleanPref("enableMouseCapture", false);
        this.musicVolume = getFloatPref("musicVolume", 0.25f);
        this.masterVolume = getFloatPref("masterVolume", AbstractC0789l.m697al() ? 0.5f : 1.0f);
        this.gameVolume = getFloatPref("gameVolume", 1.0f);
        this.interfaceVolume = getFloatPref("interfaceVolume", 0.8f);
        this.scrollSpeed = getFloatPref("scrollSpeed", 1.0f);
        this.edgeScrollSpeed = getFloatPref("edgeScrollSpeed", 1.0f);
        this.onscreenControls = getBooleanPref("onscreenControls", true);
        this.trackpad = getBooleanPref("trackpad", true);
        this.dpad = getBooleanPref("dpad", true);
        this.batterySaving = getBooleanPref("batterySaving", false);
        this.highRefreshRate = getBooleanPref("highRefreshRate", AbstractC0789l.m697al());
        this.unlockedScreenRotation = getBooleanPref("unlockedScreenRotation", false);
        this.renderBackground = getBooleanPref("renderBackground", true);
        this.renderExtraLayers = getBooleanPref("renderExtraLayers", true);
        this.renderControls = getBooleanPref("renderControls", true);
        this.immersiveFullScreen = getBooleanPref("immersiveFullScreen", true);
        this.renderDoubleScale = getBooleanPref("renderDoubleScale", false);
        this.showUnitGroups = getBooleanPref("showUnitGroups", true);
        this.renderClouds = getBooleanPref("renderClouds", AbstractC0789l.f5475aJ ? true : AbstractC0789l.m697al());
        this.softFogFading = getBooleanPref("softFogFading", AbstractC0789l.f5475aJ ? true : AbstractC0789l.m697al());
        this.showUnitWaypoints = getBooleanPref("showUnitWaypoints", true);
        this.useMinimapAllyColors = getBooleanPref("useMinimapAllyColors", true);
        this.showWarLogOnScreen = getBooleanPref("showWarLogOnScreen", AbstractC0789l.m697al());
        this.classicInterface = getBooleanPref("classicInterface", false);
        boolean z = AbstractC0789l.m697al();
        this.quickRally = getBooleanPref("quickRally", z);
        if (intPref <= 1 && !AbstractC0789l.m697al()) {
            this.quickRally = z;
        }
        this.doubleClickToAttackMove = getBooleanPref("doubleClickToAttackMove", true);
        this.showMapPingsOnBattlefield = getBooleanPref("showMapPingsOnBattlefield", true);
        this.showMapPingsOnMinimap = getBooleanPref("showMapPingsOnMinimap", true);
        this.showPlayerChatInGame = getBooleanPref("showPlayerChatInGame", true);
        this.allowGameRecording = false;
        this.showHp = getBooleanPref("showHp", true);
        this.showUnitIcons = getBooleanPref("showUnitIcons", true);
        this.gestureZoom = getBooleanPref("gestureZoom", true);
        this.useCircleSelect = getBooleanPref("useCircleSelect", false);
        this.showZoomButton = getBooleanPref("showZoomButton", true);
        this.showFps = getBooleanPref("showFps", false);
        this.sendReports = getBooleanPref("sendReports", true);
        this.shownAudioWarning = getBooleanPref("shownAudioWarning", false);
        this.mouseSupport = getBooleanPref("mouseSupport", !AbstractC0789l.m671d(context));
        this.keyboardSupport = getBooleanPref("keyboardSupport", true);
        this.forceEnglish = getBooleanPref("forceEnglish", false);
        boolean z2 = AbstractC0789l.m697al();
        this.saveMultiplayerReplays = getBooleanPref("saveMultiplayerReplays", z2);
        if (intPref <= 1) {
            this.saveMultiplayerReplays = z2;
        }
        this.replaysShowRecordedChat = getBooleanPref("replaysShowRecordedChat", true);
        this.lastNetworkPlayerName = getStringPref("lastNetworkPlayerName", null);
        this.lastNetworkIP = getStringPref("lastNetworkIP", null);
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
        this.numberOfWins = getIntPref("numberOfWins", 0);
        this.rateGameShown = getBooleanPref("rateGameShown", false);
        this.uuid = getStringPref("uuid", null);
        this.networkClientId = getStringPref("networkClientId", null);
        this.networkServerId = getStringPref("networkServerId", null);
        this.lastSeenMessageId = getIntPref("lastSeenMessageId", -1);
        this.lastSeenMessageIds = getStringPref("lastSeenMessageIds", "");
        this.nextBackgroundMap = getIntPref("nextBackgroundMap", 1);
        this.showChatAndPingShortcuts = getBooleanPref("showChatAndPingShortcuts", true);
        this.teamUnitCapSinglePlayer = getIntPref("teamUnitCapSinglePlayer", 1000);
        this.teamUnitCapHostedGame = getIntPref("teamUnitCapHostedGame", 250);
        this.modSettings = getStringPref("modSettings", "");
        this.loadDisabledModData = getBooleanPref("loadDisabledModData", false);
        this.lastModCount = getIntPref("lastModCount", -1);
        this.smartSelection_v2 = getBooleanPref("smartSelection_v2", true);
        this.mouseOrders = getIntPref("mouseOrders", 1);
        this.mousePlacement = getIntPref("mousePlacement", 1);
        if (AbstractC0789l.f5472aG) {
            loadFromFileSystem();
        }
    }

    public synchronized void save() {
        if (!AbstractC0789l.f5471aF) {
            SharedPreferences.Editor edit = this.prefs.edit();
            edit.putInt("settingVersion", 2);
            edit.putInt("settingsGameVersion", 151);
            edit.putBoolean("hasPlayedGameOrSeenHelp", this.hasPlayedGameOrSeenHelp);
            edit.putString("slick2dResolution", this.slick2dResolution);
            edit.putString("slick2dFullScreenResolution", this.slick2dFullScreenResolution);
            edit.putBoolean("slick2dFullScreen", this.slick2dFullScreen);
            edit.putBoolean("enableSounds", this.enableSounds);
            edit.putBoolean("enableMouseCapture", this.enableMouseCapture);
            Log.m4033d("RustedWarfare", "put mv:" + this.musicVolume);
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
            edit.putBoolean("showUnitIcons", this.showUnitIcons);
            edit.putBoolean("gestureZoom", this.gestureZoom);
            edit.putBoolean("useCircleSelect", this.useCircleSelect);
            edit.putBoolean("showZoomButton", this.showZoomButton);
            edit.putBoolean("showFps", this.showFps);
            edit.putBoolean("sendReports", this.sendReports);
            edit.putBoolean("shownAudioWarning", this.shownAudioWarning);
            edit.putBoolean("mouseSupport", this.mouseSupport);
            edit.putBoolean("keyboardSupport", this.keyboardSupport);
            edit.putBoolean("forceEnglish", this.forceEnglish);
            edit.putBoolean("saveMultiplayerReplays", this.saveMultiplayerReplays);
            edit.putBoolean("replaysShowRecordedChat", this.replaysShowRecordedChat);
            edit.putString("lastNetworkPlayerName", this.lastNetworkPlayerName);
            edit.putString("lastNetworkIP", this.lastNetworkIP);
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
            edit.putInt("teamUnitCapSinglePlayer", this.teamUnitCapSinglePlayer);
            edit.putInt("teamUnitCapHostedGame", this.teamUnitCapHostedGame);
            edit.putBoolean("loadDisabledModData", this.loadDisabledModData);
            edit.putInt("lastModCount", this.lastModCount);
            edit.putBoolean("smartSelection_v2", this.smartSelection_v2);
            edit.putInt("mouseOrders", this.mouseOrders);
            edit.putInt("mousePlacement", this.mousePlacement);
            edit.commit();
        } else if (AbstractC0789l.f5472aG) {
            saveToFileSystem();
        }
    }
}
