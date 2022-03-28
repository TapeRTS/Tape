package com.corrodinggames.rts.gameFramework.gui;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/Button.class */
public class Button {
    int h;
    InterfaceEngine interfaceEngine;
    int w;
    int x;
    int y;

    public Button(InterfaceEngine interfaceEngine) {
        this.interfaceEngine = interfaceEngine;
    }

    void set(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.w = i3;
        this.h = i4;
    }
}
