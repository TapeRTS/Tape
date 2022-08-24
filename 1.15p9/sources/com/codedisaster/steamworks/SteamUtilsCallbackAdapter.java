package com.codedisaster.steamworks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamUtilsCallbackAdapter.class */
public class SteamUtilsCallbackAdapter extends SteamCallbackAdapter {
    private SteamAPIWarningMessageHook messageHook;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SteamUtilsCallbackAdapter(SteamUtilsCallback steamUtilsCallback) {
        super(steamUtilsCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setWarningMessageHook(SteamAPIWarningMessageHook steamAPIWarningMessageHook) {
        this.messageHook = steamAPIWarningMessageHook;
    }

    void onWarningMessage(int i, String str) {
        if (this.messageHook != null) {
            this.messageHook.onWarningMessage(i, str);
        }
    }

    void onSteamShutdown() {
        ((SteamUtilsCallback) this.callback).onSteamShutdown();
    }
}
