package com.corrodinggames.rts.appFramework;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/ConfKeysDialog.class */
public class ConfKeysDialog extends Dialog implements DialogInterface.OnKeyListener {
    public ConfKeysDialog(Context context) {
        super(context);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }
}
