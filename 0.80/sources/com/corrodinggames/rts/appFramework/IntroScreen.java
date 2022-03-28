package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/IntroScreen.class */
public class IntroScreen extends Activity {
    static Timer timer;
    boolean alreadyLoaded;
    boolean loadingComplete;
    boolean timerComplete;

    public void doLoadingComplete() {
        synchronized (this) {
            this.loadingComplete = true;
            showMenuIfReady();
        }
    }

    public void doTimerComplete() {
        synchronized (this) {
            this.timerComplete = true;
            showMenuIfReady();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        super.finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CommonGUI.globalSetup(this);
        setContentView(R.layout.intro_screen);
        Log.e(GameEngine.TAG, "introScreen()");
        IntroScreenView introScreenView = (IntroScreenView) findViewById(R.id.IntroSurfaceView);
        this.loadingComplete = false;
        this.timerComplete = false;
        this.alreadyLoaded = GameEngine.getInstance() != null;
        UpdateChecker.doBackgroundCheck(this);
        GameEngine.getInstanceOrCreateAndLoadThreaded(getApplicationContext(), new GameEngine.LoadCallback() { // from class: com.corrodinggames.rts.appFramework.IntroScreen.1
            @Override // com.corrodinggames.rts.gameFramework.GameEngine.LoadCallback
            public void action() {
                IntroScreen.this.doLoadingComplete();
            }
        });
        startTimer();
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        startTimer();
        super.onResume();
    }

    public void showMenuIfReady() {
        synchronized (this) {
            if (this.loadingComplete && this.timerComplete) {
                startActivity(new Intent(getBaseContext(), MainMenuActivity.class));
                timer = null;
                finish();
            }
        }
    }

    public void startTimer() {
        if (timer == null) {
            timer = new Timer();
            TimerTask timerTask = new TimerTask() { // from class: com.corrodinggames.rts.appFramework.IntroScreen.1GameStartTask
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    IntroScreen.this.doTimerComplete();
                }
            };
            if (!this.alreadyLoaded) {
                timer.schedule(timerTask, 1700L);
            } else {
                timer.schedule(timerTask, 300L);
            }
        }
    }
}
