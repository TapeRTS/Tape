package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MultiplayerLobbyActivity.class */
public class MultiplayerLobbyActivity extends Activity {
    static final int LOADING_DIALOG = 0;
    ExpandedListView foundServersList;
    private Handler handler = new Handler() { // from class: com.corrodinggames.rts.appFramework.MultiplayerLobbyActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MultiplayerLobbyActivity.this.addDebugTextInternal(message.getData().getString("text"));
        }
    };
    EditText joinIpAddress;
    ArrayAdapter<String> lanServersAdapter;
    EditText networkPlayerName;
    ProgressDialog progressDialog;

    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MultiplayerLobbyActivity$JoinGameRunnable.class */
    class JoinGameRunnable implements Runnable {
        public Context context;

        JoinGameRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultiplayerLobbyActivity.this.addDebugText("joining..");
            MultiplayerLobbyActivity.this.addDebugText("InetAddress:" + MultiplayerLobbyActivity.this.getLocalIpAddress());
            boolean connectToServer = GameEngine.getInstance().network.connectToServer(MultiplayerLobbyActivity.this.joinIpAddress.getText().toString());
            MultiplayerLobbyActivity.this.dismissDialog(0);
            if (connectToServer) {
                MultiplayerLobbyActivity.this.startActivityForResult(new Intent(MultiplayerLobbyActivity.this.getBaseContext(), MultiplayerBattleroomActivity.class), 0);
            }
        }
    }

    void addDebugText(String str) {
        Message obtainMessage = this.handler.obtainMessage();
        obtainMessage.getData().putString("text", str);
        this.handler.sendMessage(obtainMessage);
    }

    void addDebugTextInternal(String str) {
    }

    public String getLocalIpAddress() {
        int ipAddress = ((WifiManager) getSystemService("wifi")).getConnectionInfo().getIpAddress();
        return String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GameEngine instanceOrCreateAndLoad = GameEngine.getInstanceOrCreateAndLoad(getBaseContext());
        CommonGUI.globalSetup(this);
        setContentView(R.layout.multiplayer_lobby);
        this.foundServersList = (ExpandedListView) findViewById(R.id.foundServersList);
        this.lanServersAdapter = new ArrayAdapter<>(this, 17367043, new String[]{"192.168.11.10:5000", "192.168.11.12:5000", "192.168.11.16:5000"});
        this.foundServersList.setAdapter((ListAdapter) this.lanServersAdapter);
        this.foundServersList.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.corrodinggames.rts.appFramework.MultiplayerLobbyActivity.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                MultiplayerLobbyActivity.this.joinIpAddress.setText(MultiplayerLobbyActivity.this.lanServersAdapter.getItem(i));
            }
        });
        this.networkPlayerName = (EditText) findViewById(R.id.networkPlayerName);
        if (instanceOrCreateAndLoad.settings.lastNetworkPlayerName != null) {
            this.networkPlayerName.setText(instanceOrCreateAndLoad.settings.lastNetworkPlayerName);
        }
        this.joinIpAddress = (EditText) findViewById(R.id.joinIpAddress);
        if (instanceOrCreateAndLoad.settings.lastNetworkIP != null) {
            this.joinIpAddress.setText(instanceOrCreateAndLoad.settings.lastNetworkIP);
        }
        ((Button) findViewById(R.id.hostButton)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MultiplayerLobbyActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GameEngine instance = GameEngine.getInstance();
                instance.network.localPlayerName = MultiplayerLobbyActivity.this.networkPlayerName.getText().toString();
                instance.settings.lastNetworkPlayerName = instance.network.localPlayerName;
                instance.settings.save();
                instance.network.startServer();
                MultiplayerLobbyActivity.this.startActivityForResult(new Intent(MultiplayerLobbyActivity.this.getBaseContext(), MultiplayerBattleroomActivity.class), 0);
            }
        });
        ((Button) findViewById(R.id.joinButton)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.MultiplayerLobbyActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MultiplayerLobbyActivity.this.showDialog(0);
                GameEngine instance = GameEngine.getInstance();
                instance.network.localPlayerName = MultiplayerLobbyActivity.this.networkPlayerName.getText().toString();
                instance.settings.lastNetworkPlayerName = instance.network.localPlayerName;
                instance.settings.lastNetworkIP = MultiplayerLobbyActivity.this.joinIpAddress.getText().toString();
                instance.settings.save();
                new Thread(new JoinGameRunnable()).start();
            }
        });
        addDebugText("ready..");
        addDebugText("ip address:" + getLocalIpAddress());
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        ProgressDialog progressDialog;
        switch (i) {
            case 0:
                this.progressDialog = new ProgressDialog(this);
                this.progressDialog.setProgressStyle(0);
                this.progressDialog.setMessage("Connecting...");
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
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        GameEngine instanceOrCreateAndLoad = GameEngine.getInstanceOrCreateAndLoad(getBaseContext());
        instanceOrCreateAndLoad.topContext = this;
        if (instanceOrCreateAndLoad.isNetworkGameActive()) {
            finish();
        }
        super.onResume();
    }
}
