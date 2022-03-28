package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Spinner;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/SettingsActivity.class */
public class SettingsActivity extends Activity {
    Button confKeys;
    CheckBox enableSounds;
    Spinner locationAction;
    int locationActionOld;
    Spinner locationDpad;
    int locationDpadOld;
    SeekBar musicVolume;
    CheckBox onscreenControls;
    CheckBox renderBackground;
    CheckBox renderExtraLayers;
    boolean saveChanges = true;
    SeekBar scrollSpeed;
    SettingsEngine settings;
    CheckBox showFps;
    CheckBox showHp;
    CheckBox showUnitIcons;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Settings");
        CommonGUI.globalSetup(this);
        setContentView(R.layout.settings);
        this.settings = SettingsEngine.getInstance(getBaseContext());
        this.enableSounds = (CheckBox) findViewById(R.id.SettingsEnableSounds);
        this.musicVolume = (SeekBar) findViewById(R.id.musicVolume);
        this.scrollSpeed = (SeekBar) findViewById(R.id.scrollSpeed);
        this.onscreenControls = (CheckBox) findViewById(R.id.settingsOnscreenControls);
        this.renderBackground = (CheckBox) findViewById(R.id.settingsRenderBackground);
        this.renderExtraLayers = (CheckBox) findViewById(R.id.settingsRenderExtraLayers);
        this.showHp = (CheckBox) findViewById(R.id.settingsShowHp);
        this.showFps = (CheckBox) findViewById(R.id.settingsShowFps);
        this.showUnitIcons = (CheckBox) findViewById(R.id.settingsShowUnitIcons);
        this.confKeys = (Button) findViewById(R.id.settingsConfKeys);
        this.locationAction = (Spinner) findViewById(R.id.SettingsLocationAction);
        this.locationDpad = (Spinner) findViewById(R.id.SettingsLocationDpad);
        this.enableSounds.setChecked(this.settings.enableSounds);
        this.musicVolume.setProgress((int) (this.settings.musicVolume * 100.0f));
        this.scrollSpeed.setProgress((int) ((this.settings.scrollSpeed * 100.0f) - 20.0f));
        this.onscreenControls.setChecked(this.settings.onscreenControls);
        this.renderBackground.setChecked(this.settings.renderBackground);
        this.renderExtraLayers.setChecked(this.settings.renderExtraLayers);
        this.showHp.setChecked(this.settings.showHp);
        this.showUnitIcons.setChecked(this.settings.showUnitIcons);
        this.showFps.setChecked(this.settings.showFps);
        this.locationDpad.setSelection(this.settings.locationDpad);
        this.locationAction.setSelection(this.settings.locationAction);
        this.locationDpadOld = this.locationDpad.getSelectedItemPosition();
        this.locationActionOld = this.locationAction.getSelectedItemPosition();
        this.locationAction.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.corrodinggames.rts.appFramework.SettingsActivity.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (SettingsActivity.this.locationDpad.getSelectedItemPosition() == i && SettingsActivity.this.locationActionOld != i) {
                    SettingsActivity.this.locationDpad.setSelection(SettingsActivity.this.locationActionOld);
                }
                SettingsActivity.this.locationDpadOld = SettingsActivity.this.locationDpad.getSelectedItemPosition();
                SettingsActivity.this.locationActionOld = SettingsActivity.this.locationAction.getSelectedItemPosition();
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.locationDpad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.corrodinggames.rts.appFramework.SettingsActivity.2
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (SettingsActivity.this.locationAction.getSelectedItemPosition() == i && SettingsActivity.this.locationDpadOld != i) {
                    SettingsActivity.this.locationAction.setSelection(SettingsActivity.this.locationDpadOld);
                }
                SettingsActivity.this.locationDpadOld = SettingsActivity.this.locationDpad.getSelectedItemPosition();
                SettingsActivity.this.locationActionOld = SettingsActivity.this.locationAction.getSelectedItemPosition();
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        ((Button) findViewById(R.id.settingsDone)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.SettingsActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.saveSettings();
            }
        });
        ((Button) findViewById(R.id.settingsCancel)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.SettingsActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.saveChanges = false;
                SettingsActivity.this.finish();
            }
        });
        ((Button) findViewById(R.id.settingsCredits)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.SettingsActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.startActivityForResult(new Intent(view.getContext(), CreditsActivity.class), 0);
            }
        });
        this.confKeys.setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.SettingsActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.startActivityForResult(new Intent(view.getContext(), SettingsKeysActivity.class), 0);
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
        this.settings.enableSounds = this.enableSounds.isChecked();
        this.settings.musicVolume = this.musicVolume.getProgress() / 100.0f;
        this.settings.scrollSpeed = (this.scrollSpeed.getProgress() + 20.0f) / 100.0f;
        this.settings.onscreenControls = this.onscreenControls.isChecked();
        this.settings.renderBackground = this.renderBackground.isChecked();
        this.settings.renderExtraLayers = this.renderExtraLayers.isChecked();
        this.settings.showFps = this.showFps.isChecked();
        this.settings.showHp = this.showHp.isChecked();
        this.settings.showUnitIcons = this.showUnitIcons.isChecked();
        this.settings.locationAction = this.locationAction.getSelectedItemPosition();
        this.settings.locationDpad = this.locationDpad.getSelectedItemPosition();
        this.settings.save();
        finish();
    }
}
