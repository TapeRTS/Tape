package com.corrodinggames.rts.gameFramework.network;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/network/Packet.class */
public class Packet {
    byte[] bytes;
    int connectionIndex;
    int type;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Packet(int i) {
        this.type = i;
    }
}
