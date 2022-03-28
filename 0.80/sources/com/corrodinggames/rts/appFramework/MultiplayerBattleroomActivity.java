package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MultiplayerBattleroomActivity.class */
public class MultiplayerBattleroomActivity extends Activity {
    static MultiplayerBattleroomActivity lastLoaded;
    TextView chatLog;
    EditText chatMessage;
    String[] levels;
    Spinner mapDropdown;
    ExpandedListView networkPlayerList;
    ArrayAdapter<String> playersAdapter;
    CheckBox readyCheckbox;
    TextView status_info;
    final String multiplayerLevelsDir = "maps/skirmish";
    private Handler handler = new Handler() { // from class: com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MultiplayerBattleroomActivity.this.addMessageToChatLogInternal(message.getData().getString("text"));
        }
    };
    final Handler uiHandler = new Handler();
    private Runnable updateRunnable = new Runnable() { // from class: com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity.2
        @Override // java.lang.Runnable
        public void run() {
            MultiplayerBattleroomActivity.this.updatePlayerList();
        }
    };
    private Runnable closeIfOpenRunnable = new Runnable() { // from class: com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity.3
        @Override // java.lang.Runnable
        public void run() {
            MultiplayerBattleroomActivity.this.finish();
        }
    };
    private Runnable startGameRunnable = new Runnable() { // from class: com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity.4
        @Override // java.lang.Runnable
        public void run() {
            GameEngine instance = GameEngine.getInstance();
            String str = instance.network.networkMapPath;
            instance.currentMapPath = str;
            instance.loadNewMap();
            Intent intent = new Intent(MultiplayerBattleroomActivity.this, InGameActivity.class);
            intent.putExtra("level", str);
            MultiplayerBattleroomActivity.this.startActivityForResult(intent, 0);
        }
    };

    public static void addMessageToChatLog(String str) {
        if (lastLoaded == null) {
            throw new RuntimeException("lastLoaded is null");
        }
        Message obtainMessage = lastLoaded.handler.obtainMessage();
        obtainMessage.getData().putString("text", str);
        lastLoaded.handler.sendMessage(obtainMessage);
    }

    public static void closeIfOpen() {
        if (lastLoaded != null) {
            lastLoaded.uiHandler.post(lastLoaded.closeIfOpenRunnable);
        }
    }

    public static void startGame() {
        if (lastLoaded != null) {
            lastLoaded.uiHandler.post(lastLoaded.startGameRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayerList() {
        this.playersAdapter.clear();
        for (int i = 0; i < Team.teamList.length; i++) {
            Team team = Team.teamList[i];
            if (team != null) {
                String str = "unnamed";
                if (team.playerName != null) {
                    str = team.playerName;
                }
                this.playersAdapter.add(str);
            }
        }
    }

    public static void updateUI() {
        if (lastLoaded != null) {
            lastLoaded.uiHandler.post(lastLoaded.updateRunnable);
        }
    }

    void addMessageToChatLogInternal(String str) {
        this.chatLog.setText(((Object) this.chatLog.getText()) + "\n" + str);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GameEngine instanceOrCreateAndLoad = GameEngine.getInstanceOrCreateAndLoad(getBaseContext());
        CommonGUI.globalSetup(this);
        setContentView(R.layout.multiplayer_battleroom);
        this.networkPlayerList = (ExpandedListView) findViewById(R.id.networkPlayerList);
        this.playersAdapter = new ArrayAdapter<>(this, 17367043);
        this.networkPlayerList.setAdapter((ListAdapter) this.playersAdapter);
        updatePlayerList();
        lastLoaded = this;
        this.status_info = (TextView) findViewById(R.id.battleroom_status_info);
        this.mapDropdown = (Spinner) findViewById(R.id.battleroom_map);
        this.levels = GameEngine.listDir("maps/skirmish", true);
        ArrayList arrayList = new ArrayList();
        for (String str : this.levels) {
            arrayList.add(LevelSelectActivity.convertLevelFileNameForDisplay(str));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        this.mapDropdown.setAdapter((SpinnerAdapter) arrayAdapter);
        int i = 0;
        for (String str2 : this.levels) {
            if (str2.toLowerCase().contains("desert")) {
                this.mapDropdown.setSelection(i);
            }
            i++;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.battleroom_mapLayout);
        if (instanceOrCreateAndLoad.network.server) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        Button button = (Button) findViewById(R.id.battleroom_startNetButton);
        if (instanceOrCreateAndLoad.network.server) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    GameEngine instance = GameEngine.getInstance();
                    int selectedItemPosition = MultiplayerBattleroomActivity.this.mapDropdown.getSelectedItemPosition();
                    instance.network.networkMapPath = "maps/skirmish/" + MultiplayerBattleroomActivity.this.levels[selectedItemPosition];
                    instance.network.sendStartGameEvent();
                }
            });
        } else {
            button.setVisibility(8);
        }
        this.readyCheckbox = (CheckBox) findViewById(R.id.battleroom_ready);
        this.readyCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity.6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                GameEngine.getInstance().network.setReadyState(z);
            }
        });
        this.chatLog = (TextView) findViewById(R.id.chatLog);
        this.chatMessage = (EditText) findViewById(R.id.battleroom_text);
        ((Button) findViewById(R.id.battleroom_send)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MultiplayerBattleroomActivity.this.sendChat();
            }
        });
        this.chatMessage.setOnKeyListener(new View.OnKeyListener() { // from class: com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity.8
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                boolean z;
                if (keyEvent.getKeyCode() == 66) {
                    MultiplayerBattleroomActivity.this.sendChat();
                    z = true;
                } else {
                    z = false;
                }
                return z;
            }
        });
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        GameEngine instanceOrCreateAndLoad = GameEngine.getInstanceOrCreateAndLoad(getBaseContext());
        instanceOrCreateAndLoad.topContext = this;
        if (instanceOrCreateAndLoad.network != null && instanceOrCreateAndLoad.network.gameHasBeenStarted) {
            finish();
        }
        if (instanceOrCreateAndLoad.network != null && !instanceOrCreateAndLoad.network.networked) {
            finish();
        }
        if (instanceOrCreateAndLoad.network.server) {
            String localIpAddress = instanceOrCreateAndLoad.network.getLocalIpAddress();
            if (localIpAddress != null) {
                this.status_info.setText("Your local IP address is: " + localIpAddress + " using port: " + instanceOrCreateAndLoad.network.currentPortNumber);
            } else {
                this.status_info.setText("You do not have a network connection");
            }
        } else {
            this.status_info.setText("");
        }
        super.onResume();
    }

    void sendChat() {
        GameEngine instance = GameEngine.getInstance();
        String editable = this.chatMessage.getText().toString();
        if (!editable.trim().equals("")) {
            instance.network.sendChatMessage(editable);
        }
        this.chatMessage.setText("");
    }
}
