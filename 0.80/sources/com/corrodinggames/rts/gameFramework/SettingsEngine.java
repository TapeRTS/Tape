package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/SettingsEngine.class */
public class SettingsEngine {
    static SettingsEngine settingsEngine = null;
    public boolean dpad;
    public boolean enableSounds;
    public boolean hasPlayedGameOrSeenHelp;
    public int keyAction;
    public int keyDown;
    public int keyJump;
    public int keyLeft;
    public int keyRight;
    public String lastNetworkIP;
    public String lastNetworkPlayerName;
    public int lastSeenMessageId;
    public int locationAction;
    public int locationDpad;
    public float musicVolume;
    public boolean onscreenControls;
    SharedPreferences prefs;
    public boolean renderAntiAlias = false;
    public boolean renderBackground;
    public boolean renderControls;
    public boolean renderExtraLayers;
    public float scrollSpeed;
    public boolean showFps;
    public boolean showHp;
    public boolean showUnitIcons;
    public boolean shownAudioWarning;
    public boolean trackpad;
    public String uuid;

    private SettingsEngine(Context context) {
        this.prefs = context.getSharedPreferences("rts_settings", 0);
        this.hasPlayedGameOrSeenHelp = this.prefs.getBoolean("hasPlayedGameOrSeenHelp", false);
        this.enableSounds = this.prefs.getBoolean("enableSounds", true);
        this.musicVolume = this.prefs.getFloat("musicVolume", 0.5f);
        this.scrollSpeed = this.prefs.getFloat("scrollSpeed", 1.5f);
        this.onscreenControls = this.prefs.getBoolean("onscreenControls", true);
        this.trackpad = this.prefs.getBoolean("trackpad", true);
        this.dpad = this.prefs.getBoolean("dpad", true);
        this.renderBackground = this.prefs.getBoolean("renderBackground", true);
        this.renderExtraLayers = this.prefs.getBoolean("renderExtraLayers", true);
        this.renderControls = this.prefs.getBoolean("renderControls", true);
        this.showHp = this.prefs.getBoolean("showHp", false);
        this.showUnitIcons = this.prefs.getBoolean("showUnitIcons", true);
        this.showFps = this.prefs.getBoolean("showFps", false);
        this.shownAudioWarning = this.prefs.getBoolean("shownAudioWarning", false);
        this.lastNetworkPlayerName = this.prefs.getString("lastNetworkPlayerName", null);
        this.lastNetworkIP = this.prefs.getString("lastNetworkIP", null);
        this.locationDpad = this.prefs.getInt("locationDpad", 0);
        this.locationAction = this.prefs.getInt("locationAction", 3);
        this.keyAction = this.prefs.getInt("keyAction", 23);
        this.keyJump = this.prefs.getInt("keyJump", 19);
        this.keyLeft = this.prefs.getInt("keyLeft", 21);
        this.keyRight = this.prefs.getInt("keyRight", 22);
        this.keyDown = this.prefs.getInt("keyDown", 20);
        this.uuid = this.prefs.getString("uuid", null);
        this.lastSeenMessageId = this.prefs.getInt("lastSeenMessageId", -1);
    }

    public static SettingsEngine getInstance(Context context) {
        if (settingsEngine == null) {
            settingsEngine = new SettingsEngine(context);
        }
        return settingsEngine;
    }

    public void save() {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putBoolean("hasPlayedGameOrSeenHelp", this.hasPlayedGameOrSeenHelp);
        edit.putBoolean("enableSounds", this.enableSounds);
        Log.e(GameEngine.TAG, "put mv:" + this.musicVolume);
        edit.putFloat("musicVolume", this.musicVolume);
        edit.putFloat("scrollSpeed", this.scrollSpeed);
        edit.putBoolean("onscreenControls", this.onscreenControls);
        edit.putBoolean("trackpad", this.trackpad);
        edit.putBoolean("dpad", this.dpad);
        edit.putBoolean("renderBackground", this.renderBackground);
        edit.putBoolean("renderExtraLayers", this.renderExtraLayers);
        edit.putBoolean("renderControls", this.renderControls);
        edit.putBoolean("showHp", this.showHp);
        edit.putBoolean("showUnitIcons", this.showUnitIcons);
        edit.putBoolean("showFps", this.showFps);
        edit.putBoolean("shownAudioWarning", this.shownAudioWarning);
        edit.putString("lastNetworkPlayerName", this.lastNetworkPlayerName);
        edit.putString("lastNetworkIP", this.lastNetworkIP);
        edit.putInt("locationDpad", this.locationDpad);
        edit.putInt("locationAction", this.locationAction);
        edit.putInt("keyAction", this.keyAction);
        edit.putInt("keyJump", this.keyJump);
        edit.putInt("keyLeft", this.keyLeft);
        edit.putInt("keyRight", this.keyRight);
        edit.putInt("keyDown", this.keyDown);
        edit.putString("uuid", this.uuid);
        edit.putInt("lastSeenMessageId", this.lastSeenMessageId);
        edit.commit();
    }
}
