package com.codedisaster.steamworks;

/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamAPICall.class */
public class SteamAPICall extends SteamNativeHandle {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SteamAPICall(long j) {
        super(j);
    }

    public boolean isValid() {
        return this.handle != 0;
    }
}
