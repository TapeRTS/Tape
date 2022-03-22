package com.codedisaster.steamworks;

/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamUGCUpdateHandle.class */
public class SteamUGCUpdateHandle extends SteamNativeHandle {
    SteamUGCUpdateHandle(long j) {
        super(j);
    }

    public boolean isValid() {
        return this.handle != -1;
    }
}
