package com.codedisaster.steamworks;

import com.codedisaster.steamworks.SteamController;

/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamControllerAnalogActionData.class */
public class SteamControllerAnalogActionData {
    int mode;

    /* renamed from: x */
    float f337x;

    /* renamed from: y */
    float f338y;
    boolean active;

    public SteamController.SourceMode getMode() {
        return SteamController.SourceMode.byOrdinal(this.mode);
    }

    public float getX() {
        return this.f337x;
    }

    public float getY() {
        return this.f338y;
    }

    public boolean getActive() {
        return this.active;
    }
}
