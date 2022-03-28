package com.corrodinggames.rts.gameFramework.network;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/network/NetStream.class */
public class NetStream {
    private InputNetStream in;
    private OutputNetStream out;

    public NetStream(InputNetStream inputNetStream) {
        this.in = inputNetStream;
    }

    public NetStream(OutputNetStream outputNetStream) {
        this.out = outputNetStream;
    }

    public InputNetStream getIn() {
        return this.in;
    }

    public OutputNetStream getOut() {
        return this.out;
    }
}
