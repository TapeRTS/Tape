package com.corrodinggames.rts.gameFramework;

import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g.class */
public final class C0659g {

    /* renamed from: a */
    protected static EnumC0725h f4642a;

    /* renamed from: a */
    public static EnumC0725h m1364a() {
        if (f4642a == null) {
            String lowerCase = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if (lowerCase.indexOf("mac") >= 0 || lowerCase.indexOf("darwin") >= 0) {
                f4642a = EnumC0725h.MacOS;
            } else if (lowerCase.indexOf("win") >= 0) {
                f4642a = EnumC0725h.Windows;
            } else if (lowerCase.indexOf("nux") >= 0) {
                f4642a = EnumC0725h.Linux;
            } else {
                f4642a = EnumC0725h.Other;
            }
        }
        return f4642a;
    }
}
