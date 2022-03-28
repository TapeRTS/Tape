package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/SettingsKeysActivity.class */
public class SettingsKeysActivity extends Activity {
    private String[] mKeyLabels;
    SettingsEngine settings;
    boolean saveChanges = true;
    ArrayList<KeyButton> buttons = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/SettingsKeysActivity$KeyButton.class */
    public class KeyButton {
        Button button;
        int keycode;
        String text;

        KeyButton() {
        }

        public void updateText() {
            this.button.setText(String.valueOf(this.text) + ": " + SettingsKeysActivity.this.getKeyLabel(this.keycode));
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/SettingsKeysActivity$SettingsKeyClick.class */
    class SettingsKeyClick implements View.OnClickListener {
        KeyButton b;

        public SettingsKeyClick(KeyButton keyButton) {
            this.b = keyButton;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(SettingsKeysActivity.this);
            builder.setMessage("Press key to use for: " + this.b.text);
            builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.SettingsKeysActivity.SettingsKeyClick.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.corrodinggames.rts.appFramework.SettingsKeysActivity.SettingsKeyClick.2
                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    SettingsKeyClick.this.b.keycode = i;
                    SettingsKeyClick.this.b.updateText();
                    dialogInterface.dismiss();
                    return false;
                }
            });
            builder.show();
        }
    }

    protected String getKeyLabel(int i) {
        if (this.mKeyLabels == null) {
            this.mKeyLabels = getResources().getStringArray(R.array.keycode_labels);
        }
        String str = "Unknown Key";
        if (i > 0) {
            str = "Unknown Key";
            if (i < this.mKeyLabels.length) {
                str = this.mKeyLabels[i - 1];
            }
        }
        return str;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Keyboard");
        CommonGUI.globalSetup(this);
        setContentView(R.layout.settings_keyboard);
        this.settings = SettingsEngine.getInstance(getBaseContext());
        this.buttons = new ArrayList<>();
        KeyButton keyButton = new KeyButton();
        keyButton.button = (Button) findViewById(R.id.settingsKAction);
        keyButton.text = "Action";
        keyButton.keycode = this.settings.keyAction;
        this.buttons.add(keyButton);
        KeyButton keyButton2 = new KeyButton();
        keyButton2.button = (Button) findViewById(R.id.settingsKJump);
        keyButton2.text = "Jump";
        keyButton2.keycode = this.settings.keyJump;
        this.buttons.add(keyButton2);
        KeyButton keyButton3 = new KeyButton();
        keyButton3.button = (Button) findViewById(R.id.settingsKLeft);
        keyButton3.text = "Left";
        keyButton3.keycode = this.settings.keyLeft;
        this.buttons.add(keyButton3);
        KeyButton keyButton4 = new KeyButton();
        keyButton4.button = (Button) findViewById(R.id.settingsKRight);
        keyButton4.text = "Right";
        keyButton4.keycode = this.settings.keyRight;
        this.buttons.add(keyButton4);
        KeyButton keyButton5 = new KeyButton();
        keyButton5.button = (Button) findViewById(R.id.settingsKDown);
        keyButton5.text = "Down";
        keyButton5.keycode = this.settings.keyDown;
        this.buttons.add(keyButton5);
        Iterator<KeyButton> it = this.buttons.iterator();
        while (it.hasNext()) {
            KeyButton next = it.next();
            next.updateText();
            next.button.setOnClickListener(new SettingsKeyClick(next));
        }
        ((Button) findViewById(R.id.settingsKDone)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.SettingsKeysActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsKeysActivity.this.saveSettings();
            }
        });
        ((Button) findViewById(R.id.settingsKCancel)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.SettingsKeysActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsKeysActivity.this.saveChanges = false;
                SettingsKeysActivity.this.finish();
            }
        });
        ((Button) findViewById(R.id.settingKDefaults)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.SettingsKeysActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsKeysActivity.this.buttons.get(0).keycode = 23;
                SettingsKeysActivity.this.buttons.get(1).keycode = 19;
                SettingsKeysActivity.this.buttons.get(2).keycode = 21;
                SettingsKeysActivity.this.buttons.get(3).keycode = 22;
                SettingsKeysActivity.this.buttons.get(4).keycode = 20;
                Iterator<KeyButton> it2 = SettingsKeysActivity.this.buttons.iterator();
                while (it2.hasNext()) {
                    it2.next().updateText();
                }
            }
        });
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.saveChanges && isFinishing()) {
            saveSettings();
        }
        super.onPause();
    }

    public void saveSettings() {
        this.settings.keyAction = this.buttons.get(0).keycode;
        this.settings.keyJump = this.buttons.get(1).keycode;
        this.settings.keyLeft = this.buttons.get(2).keycode;
        this.settings.keyRight = this.buttons.get(3).keycode;
        this.settings.keyDown = this.buttons.get(4).keycode;
        this.settings.save();
        finish();
    }
}
