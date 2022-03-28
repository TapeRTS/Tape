package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.StateEngine;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/LevelSelectActivity.class */
public class LevelSelectActivity extends Activity {
    static final int LOADING_DIALOG = 0;
    ProgressDialog progressDialog;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/LevelSelectActivity$MapLoaderRunnable.class */
    public class MapLoaderRunnable implements Runnable {
        public Context context;
        public String mapPath;

        MapLoaderRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameEngine instanceOrCreateAndLoad = GameEngine.getInstanceOrCreateAndLoad(this.context);
            instanceOrCreateAndLoad.currentMapPath = this.mapPath;
            instanceOrCreateAndLoad.loadNewMap();
            Intent intent = new Intent(this.context, InGameActivity.class);
            intent.putExtra("level", this.mapPath);
            LevelSelectActivity.this.startActivityForResult(intent, 0);
            LevelSelectActivity.this.dismissDialog(0);
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/LevelSelectActivity$StartAnyway.class */
    class StartAnyway implements DialogInterface.OnClickListener {
        Context context;
        String mapPath;

        StartAnyway(Context context, String str) {
            this.mapPath = str;
            this.context = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            LevelSelectActivity.this.startNewLevel(this.context, this.mapPath);
        }
    }

    public static String convertLevelFileNameForDisplay(String str) {
        String str2 = null;
        Matcher matcher = Pattern.compile("^l\\d*;(.*)\\.tmx").matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            str2 = String.valueOf(group.substring(0, 1).toUpperCase()) + group.substring(1);
        }
        String str3 = str2;
        if (str2 == null) {
            Matcher matcher2 = Pattern.compile("\\[.*\\](.*)\\.tmx").matcher(str);
            str3 = str2;
            if (matcher2.matches()) {
                String group2 = matcher2.group(1);
                str3 = String.valueOf(group2.substring(0, 1).toUpperCase()) + group2.substring(1);
            }
        }
        String str4 = str3;
        if (str3 == null) {
            Matcher matcher3 = Pattern.compile("(.*)\\.tmx").matcher(str);
            str4 = str3;
            if (matcher3.matches()) {
                String group3 = matcher3.group(1);
                str4 = String.valueOf(group3.substring(0, 1).toUpperCase()) + group3.substring(1);
            }
        }
        String str5 = str4;
        if (str4 == null) {
            str5 = str;
        }
        return str5.replace('_', ' ');
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Levels");
        CommonGUI.globalSetup(this);
        setContentView(R.layout.level_select);
        overridePendingTransition(0, 0);
        setup();
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        ProgressDialog progressDialog;
        switch (i) {
            case 0:
                this.progressDialog = new ProgressDialog(this);
                this.progressDialog.setProgressStyle(0);
                this.progressDialog.setMessage("Loading...");
                this.progressDialog.setCancelable(false);
                progressDialog = this.progressDialog;
                break;
            default:
                progressDialog = null;
                break;
        }
        return progressDialog;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        setup();
    }

    public void setup() {
        GameEngine instanceOrCreateAndLoad = GameEngine.getInstanceOrCreateAndLoad(getApplicationContext());
        String str = null;
        if (getIntent() != null) {
            str = null;
            if (getIntent().getExtras() != null) {
                str = getIntent().getExtras().getString("mode");
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.levelHolder);
        linearLayout.removeAllViews();
        String str2 = String.valueOf(str) + "/";
        String[] listDir = GameEngine.listDir(str, true);
        if (listDir == null) {
            instanceOrCreateAndLoad.alert("Could not find folder: " + str, 1);
            finish();
            return;
        }
        for (String str3 : listDir) {
            Button button = new Button(getBaseContext());
            String convertLevelFileNameForDisplay = convertLevelFileNameForDisplay(str3);
            button.setTag(String.valueOf(str2) + str3);
            StateEngine.LevelState levelState = StateEngine.getInstance(getApplicationContext()).getLevelState(String.valueOf(str2) + str3);
            String sb = new StringBuilder(String.valueOf(convertLevelFileNameForDisplay)).toString();
            boolean z = levelState.getNumOfGemCollected() == levelState.getMaxGems();
            boolean z2 = levelState.attempted;
            button.setBackgroundResource(R.drawable.btn_dropdown);
            if (!levelState.completed) {
                button.getBackground().setColorFilter(new LightingColorFilter(-1, -5636096));
            } else if (z) {
                button.getBackground().setColorFilter(new LightingColorFilter(-1, -16733543));
            } else {
                button.getBackground().setColorFilter(new LightingColorFilter(-1, -16733696));
            }
            button.setText(sb);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.LevelSelectActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    GameEngine instance = GameEngine.getInstance();
                    String str4 = (String) view.getTag();
                    if (instance == null || !instance.levelLoaded) {
                        LevelSelectActivity.this.startNewLevel(view.getContext(), str4);
                        return;
                    }
                    new AlertDialog.Builder(LevelSelectActivity.this).setIcon(17301543).setTitle("Are you sure?").setMessage("Starting a new game will overwrite your last game").setPositiveButton("Start anyway", new StartAnyway(view.getContext(), str4)).setNegativeButton("Resume last game", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.LevelSelectActivity.1.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            LevelSelectActivity.this.startActivityForResult(new Intent(LevelSelectActivity.this.getApplicationContext(), InGameActivity.class), 0);
                        }
                    }).show();
                }
            });
            button.setTypeface(Typeface.DEFAULT_BOLD);
            button.setPadding(0, 16, 0, 16);
            linearLayout.addView(button);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(button.getLayoutParams());
            layoutParams.setMargins(2, 2, 2, 2);
            button.setLayoutParams(layoutParams);
        }
        if (this.progressDialog != null && this.progressDialog.isShowing()) {
            dismissDialog(0);
        }
    }

    public void startNewLevel(Context context, String str) {
        showDialog(0);
        MapLoaderRunnable mapLoaderRunnable = new MapLoaderRunnable();
        mapLoaderRunnable.context = context;
        mapLoaderRunnable.mapPath = str;
        new Thread(mapLoaderRunnable).start();
    }
}
