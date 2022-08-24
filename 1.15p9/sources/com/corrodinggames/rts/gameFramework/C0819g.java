package com.corrodinggames.rts.gameFramework;

import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g.class */
public final class C0819g {

    /* renamed from: a */
    protected static EnumC0822h f5391a;

    /* renamed from: a */
    public static EnumC0822h m1886a() {
        if (f5391a == null) {
            String lowerCase = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if (lowerCase.indexOf("mac") >= 0 || lowerCase.indexOf("darwin") >= 0) {
                f5391a = EnumC0822h.MacOS;
            } else if (lowerCase.indexOf("win") >= 0) {
                f5391a = EnumC0822h.Windows;
            } else if (lowerCase.indexOf("nux") >= 0) {
                f5391a = EnumC0822h.Linux;
            } else {
                f5391a = EnumC0822h.Other;
            }
        }
        return f5391a;
    }
}
