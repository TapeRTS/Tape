package com.codedisaster.steamworks;

/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamUGCUpdateHandle.class */
public class SteamUGCUpdateHandle extends SteamNativeHandle {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SteamUGCUpdateHandle(long j) {
        super(j);
    }

    public boolean isValid() {
        return this.handle != -1;
    }
}
