package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/InGameActivity.class */
public class InGameActivity extends Activity {
    private static final int DISCONNECT_ID = 10;
    private static final int LOOK_ID = 4;
    private static final int MODE_ID = 6;
    private static final int PICKTILE_ID = 1;
    private static final int QUICK_LOAD_ID = 8;
    private static final int QUICK_SAVE_ID = 7;
    private static final int RECORD_ID = 9;
    private static final int RESTART_ID = 5;
    private static final int SETTINGS_ID = 2;
    private static final int SHOW_BRIEFING_ID = 11;
    private static final int SKIP_ID = 3;
    GameView gameView;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CommonGUI.globalSetup(this);
        setContentView(R.layout.main);
        this.gameView = (GameView) findViewById(R.id.GameView);
        this.gameView.inGameActivity = this;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        GameEngine instance = GameEngine.getInstance();
        menu.add(0, 2, 0, "Settings").setIcon(17301577);
        if (!instance.isNetworkGameActive()) {
            menu.add(0, 3, 0, "Skip level").setShortcut('1', 'd').setIcon(17301538);
            menu.add(0, RESTART_ID, 0, "Restart").setIcon(17301580);
        }
        if (instance.isNetworkGameActive()) {
            menu.add(0, 10, 0, "Disconnect").setIcon(17301552);
            return true;
        } else if (instance.mission == null || instance.mission.introText == null) {
            return true;
        } else {
            menu.add(0, 11, 0, "Briefing").setIcon(17301659);
            return true;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Log.e(GameEngine.TAG, "InGameActivity:onDestroy");
        GameEngine.getInstance();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean doKeyDown;
        Log.e(GameEngine.TAG, "key down:" + i);
        if (i == 82) {
            doKeyDown = super.onKeyDown(i, keyEvent);
        } else if (i == 25) {
            doKeyDown = super.onKeyDown(i, keyEvent);
        } else if (i == 24) {
            doKeyDown = super.onKeyDown(i, keyEvent);
        } else {
            if (i == 84) {
                GameEngine instance = GameEngine.getInstance();
                if (instance.changeViewpointZoomTo == 1.0f) {
                    instance.changeViewpointZoomTo = 1.5f;
                } else if (instance.changeViewpointZoomTo == 1.5f) {
                    instance.changeViewpointZoomTo = 0.75f;
                } else {
                    instance.changeViewpointZoomTo = 1.0f;
                }
            }
            if (i == 4) {
                finish();
                doKeyDown = super.onKeyDown(i, keyEvent);
            } else {
                doKeyDown = GameEngine.getInstance().doKeyDown(i, keyEvent);
            }
        }
        return doKeyDown;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return i == 82 ? super.onKeyDown(i, keyEvent) : GameEngine.getInstance().doKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2:
                startActivityForResult(new Intent(getBaseContext(), SettingsActivity.class), 0);
                break;
            case 3:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Skip?").setMessage("Are you sure you want to skip this level?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.InGameActivity.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        GameEngine.getInstance().gotoNextLevel = true;
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                break;
            case 4:
                GameEngine.getInstance().lookAroundMode = !GameEngine.getInstance().lookAroundMode;
                break;
            case RESTART_ID /* 5 */:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Restart?").setMessage("Are you sure you want to restart this level?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.InGameActivity.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        GameEngine instance = GameEngine.getInstance();
                        instance.setStopped();
                        instance.loadNewMap();
                        instance.setRunning();
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                break;
            case MODE_ID /* 6 */:
                GameEngine instance = GameEngine.getInstance();
                instance.debugTempMode = !instance.debugTempMode;
                break;
            case RECORD_ID /* 9 */:
                GameEngine instance2 = GameEngine.getInstance();
                if (instance2.screenshot_saver) {
                    instance2.screenshot_saver = false;
                    break;
                } else {
                    instance2.screenshot_saver = true;
                    break;
                }
            case 10:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Disconnect?").setMessage("Are you sure you want to disconnect, and end this game?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.InGameActivity.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        GameEngine instance3 = GameEngine.getInstance();
                        instance3.network.disconnect();
                        InGameActivity.this.finish();
                        instance3.unloadMap();
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                break;
            case 11:
                GameEngine instance3 = GameEngine.getInstance();
                if (!(instance3.mission == null || instance3.mission.introText == null)) {
                    instance3.showMessageBox("Briefing", instance3.mission.introText);
                    break;
                }
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    protected void onPause() {
        Log.e(GameEngine.TAG, "Ingame:onPause");
        GameEngine instance = GameEngine.getInstance();
        if (instance != null && instance.safeToRun) {
            instance.setStopped();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        Log.e(GameEngine.TAG, "Ingame:onResume");
        super.onResume();
        GameEngine instance = GameEngine.getInstance();
        instance.topContext = this;
        if (instance != null && instance.safeToRun) {
            instance.setRunning();
        }
    }

    @Override // android.app.Activity
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return GameEngine.getInstance().onTrackballEvent(motionEvent);
    }
}
