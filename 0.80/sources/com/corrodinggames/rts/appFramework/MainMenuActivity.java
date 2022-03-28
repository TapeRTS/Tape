package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import java.lang.reflect.Method;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MainMenuActivity.class */
public class MainMenuActivity extends Activity {

    /* renamed from: com.corrodinggames.rts.appFramework.MainMenuActivity$3  reason: invalid class name */
    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MainMenuActivity$3.class */
    class AnonymousClass3 implements View.OnClickListener {
        AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!GameEngine.getInstance().isNetworkGameActive()) {
                MainMenuActivity.this.checkIfHelpShouldBeShown(new Callback(MainMenuActivity.this) { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.3.1
                    @Override // com.corrodinggames.rts.appFramework.MainMenuActivity.Callback
                    public void run() {
                        new AlertDialog.Builder(MainMenuActivity.this).setIcon(17301543).setTitle("Warning").setMessage("Multiplayer is currently incomplete and will have problems and bugs. Please report any problems to corrodinggames@gmail.com").setPositiveButton("I will", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.3.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                MainMenuActivity.this.startActivityForResult(new Intent(MainMenuActivity.this.getApplicationContext(), MultiplayerLobbyActivity.class), 0);
                            }
                        }).setNegativeButton("Back", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.3.1.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).show();
                    }
                });
            } else {
                new AlertDialog.Builder(MainMenuActivity.this).setIcon(17301543).setTitle("Warning").setMessage("A Multiplayer is currently in progress").setPositiveButton("Resume", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.3.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainMenuActivity.this.resumeMultiplayer();
                    }
                }).setNegativeButton("Disconnect", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.3.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        GameEngine.getInstance().network.disconnect();
                        MainMenuActivity.this.startActivityForResult(new Intent(MainMenuActivity.this.getApplicationContext(), MultiplayerLobbyActivity.class), 0);
                    }
                }).show();
            }
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MainMenuActivity$Callback.class */
    public abstract class Callback {
        public Callback() {
        }

        public abstract void run();
    }

    public void checkIfHelpShouldBeShown(final Callback callback) {
        if (!SettingsEngine.getInstance(getBaseContext()).hasPlayedGameOrSeenHelp) {
            new AlertDialog.Builder(this).setIcon(17301543).setTitle("This appears to be your first time playing").setMessage("Would you like to view the quick help slides?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.11
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    MainMenuActivity.this.startActivityForResult(new Intent(MainMenuActivity.this.getApplicationContext(), QuickHelpActivity.class), 0);
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.12
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    callback.run();
                }
            }).show();
        } else {
            callback.run();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Method method = IntroScreen.class.getMethod("overridePendingTransition", Integer.TYPE, Integer.TYPE);
            if (method != null) {
                try {
                    method.invoke(this, Integer.valueOf((int) R.anim.mainfadein), Integer.valueOf((int) R.anim.splashfadeout));
                    Log.e(GameEngine.TAG, "overridePendingTransition done");
                } catch (Exception e) {
                    Log.e(GameEngine.TAG, "overridePendingTransition invoke:", e);
                }
            }
        } catch (Exception e2) {
            Log.e(GameEngine.TAG, "overridePendingTransition:", e2);
        }
        CommonGUI.globalSetup(this);
        setContentView(R.layout.menu);
        setup();
        ((Button) findViewById(R.id.startgameButton)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (GameEngine.getInstance().isNetworkGameActive()) {
                    MainMenuActivity.this.resumeMultiplayer();
                    return;
                }
                MainMenuActivity.this.startActivityForResult(new Intent(view.getContext(), InGameActivity.class), 0);
            }
        });
        ((Button) findViewById(R.id.menuCustomButton)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!GameEngine.getInstance().isNetworkGameActive()) {
                    MainMenuActivity.this.checkIfHelpShouldBeShown(new Callback(MainMenuActivity.this) { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.2.1
                        @Override // com.corrodinggames.rts.appFramework.MainMenuActivity.Callback
                        public void run() {
                            MainMenuActivity.this.startActivityForResult(new Intent(MainMenuActivity.this.getApplicationContext(), LevelGroupSelectActivity.class), 0);
                        }
                    });
                } else {
                    new AlertDialog.Builder(MainMenuActivity.this).setIcon(17301543).setTitle("Warning").setMessage("A Multiplayer is currently in progress").setPositiveButton("Resume", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.2.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            MainMenuActivity.this.resumeMultiplayer();
                        }
                    }).setNegativeButton("Disconnect", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.2.3
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            GameEngine.getInstance().network.disconnect();
                            MainMenuActivity.this.startActivityForResult(new Intent(MainMenuActivity.this.getApplicationContext(), LevelGroupSelectActivity.class), 0);
                        }
                    }).show();
                }
            }
        });
        ((Button) findViewById(R.id.multiplayerButton)).setOnClickListener(new AnonymousClass3());
        ((Button) findViewById(R.id.helpButton)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainMenuActivity.this.startActivityForResult(new Intent(view.getContext(), QuickHelpActivity.class), 0);
            }
        });
        ((Button) findViewById(R.id.settingsButton)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainMenuActivity.this.startActivityForResult(new Intent(view.getContext(), SettingsActivity.class), 0);
            }
        });
        ((Button) findViewById(R.id.exitgameButton)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainMenuActivity.this.finish();
            }
        });
        warnAboutBugs();
        String str = UpdateChecker.updateMessage;
        if (str != null) {
            int i = UpdateChecker.updateMessageId;
            boolean z = UpdateChecker.updateMessage_showAsMessageBox;
            SettingsEngine instance = SettingsEngine.getInstance(this);
            if (i == -1 || i != instance.lastSeenMessageId) {
                instance.lastSeenMessageId = i;
                instance.save();
                GameEngine.getInstance();
                if (!z) {
                    Toast.makeText(this, str, 1).show();
                } else {
                    new AlertDialog.Builder(this).setIcon(17301543).setTitle("").setMessage(str).setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.7
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                        }
                    }).show();
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        setup();
    }

    public void resumeMultiplayer() {
        GameEngine instance = GameEngine.getInstance();
        if (instance.network == null || instance.network.gameHasBeenStarted) {
            startActivityForResult(new Intent(getApplicationContext(), InGameActivity.class), 0);
        } else {
            startActivityForResult(new Intent(getApplicationContext(), MultiplayerBattleroomActivity.class), 0);
        }
    }

    public void setup() {
        GameEngine instanceOrCreateAndLoad = GameEngine.getInstanceOrCreateAndLoad(getApplicationContext());
        instanceOrCreateAndLoad.topContext = this;
        Button button = (Button) findViewById(R.id.startgameButton);
        if (instanceOrCreateAndLoad == null || !instanceOrCreateAndLoad.levelLoaded) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.TitleImage);
    }

    public void warnAboutBugs() {
        if (!SettingsEngine.getInstance(this).shownAudioWarning) {
            boolean z = false;
            if (Build.MODEL.toUpperCase().contains("GT-I9100")) {
                z = true;
            }
            if (z) {
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Bugs in Samsung Galaxy S2's audio may cause crashes and freezes.").setMessage("Would you like to disable sound?").setPositiveButton("Disable sound", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.8
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SettingsEngine instance = SettingsEngine.getInstance(MainMenuActivity.this);
                        instance.enableSounds = false;
                        instance.musicVolume = 0.0f;
                        instance.shownAudioWarning = true;
                        instance.save();
                    }
                }).setNeutralButton("Remind me", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.9
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setNegativeButton("Risk it", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MainMenuActivity.10
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SettingsEngine instance = SettingsEngine.getInstance(MainMenuActivity.this);
                        instance.shownAudioWarning = true;
                        instance.save();
                    }
                }).show();
            }
        }
    }
}
