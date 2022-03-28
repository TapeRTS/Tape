package com.corrodinggames.rts.appFramework;

import android.app.Activity;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/CommonGUI.class */
public class CommonGUI {
    public static void globalSetup(Activity activity) {
        activity.setRequestedOrientation(0);
        activity.setVolumeControlStream(3);
        activity.requestWindowFeature(1);
        activity.getWindow().setFlags(1024, 1024);
    }
}
