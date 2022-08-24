package com.codedisaster.steamworks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamInterface.class */
public abstract class SteamInterface {
    protected final long pointer;
    protected long callback;

    protected static native void deleteCallback(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SteamInterface(long j) {
        this(j, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SteamInterface(long j, long j2) {
        if (j == 0) {
            throw new RuntimeException("Steam interface created with null pointer. Always check result of SteamAPI.init(), or with SteamAPI.isSteamRunning()!");
        }
        this.pointer = j;
        this.callback = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCallback(long j) {
        this.callback = j;
    }

    public void dispose() {
        deleteCallback(this.callback);
    }
}
