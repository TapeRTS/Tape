package com.corrodinggames.rts.gameFramework.network;

import android.os.Build;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.h.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/v.class */
public class RunnableC0807v implements Runnable {

    /* renamed from: a */
    String f5447a;

    /* renamed from: b */
    String f5448b;

    @Override // java.lang.Runnable
    public void run() {
        long curTimeMs = GameEngine.curTimeMs();
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.log("SendErrorReport", "Starting");
        try {
            try {
                try {
                    ArrayList arrayList = new ArrayList(2);
                    C0797n.m1198a(arrayList, "action", "error_report");
                    C0797n.m1198a(arrayList, "game_version", Integer.toString(gameEngine.gameVersionInternal(false)));
                    C0797n.m1198a(arrayList, "game_version_internal", Integer.toString(gameEngine.gameVersionInternal(true)));
                    C0797n.m1198a(arrayList, "game_version_string", gameEngine.getVersionNZ());
                    C0797n.m1198a(arrayList, "package_name", gameEngine.mo818i());
                    C0797n.m1198a(arrayList, "installation_source", gameEngine.mo815j());
                    StringBuilder intSDK = new StringBuilder();
                    String sb = intSDK.append(VariableScope.nullOrMissingString).append(Build.VERSION.SDK_INT).toString();
                    if (GameEngine.isPC()) {
                        sb = "s:0;";
                        if (SteamEngine.m718a().m717e()) {
                            sb = "s:1;";
                        }
                    }
                    if (GameEngine.isPC() || GameEngine.isIOS_Device) {
                        C0797n.m1198a(arrayList, "system_version", System.getProperty("os.name") + " - " + System.getProperty("os.version"));
                    }
                    C0797n.m1198a(arrayList, "sdk_version", sb);
                    C0797n.m1198a(arrayList, "device_model", gameEngine.getDeviceModel());
                    C0797n.m1198a(arrayList, "build_version", gameEngine.getBuildVersion());
                    C0797n.m1198a(arrayList, "release_version", CommonUtils.booleanToString(GameEngine.isReleaseVersion));
                    C0797n.m1198a(arrayList, "dedicated_server", CommonUtils.booleanToString(GameEngine.isDedicatedServer));
                    String str = "NA";
                    if (gameEngine.networkEngine != null) {
                        str = gameEngine.networkEngine.f5177bg;
                    }
                    C0797n.m1198a(arrayList, "private_token", str);
                    C0797n.m1198a(arrayList, "private_token_2", CommonUtils.m1680b(CommonUtils.m1680b(str)));
                    C0797n.m1198a(arrayList, "message", this.f5447a);
                    C0797n.m1198a(arrayList, "stacktrace", this.f5448b);
                    GameEngine.log("SendErrorReport", "making request");
                    String readLine = C0797n.m1201a(arrayList).readLine();
                    if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                        GameEngine.log("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                        GameEngine.log("SendErrorReport", "took: " + (((float) (GameEngine.curTimeMs() - curTimeMs)) / 1000000.0f) + " seconds");
                        return;
                    }
                    GameEngine.log("SendErrorReport", "Send trace successfully");
                    GameEngine.log("SendErrorReport", "took: " + (((float) (GameEngine.curTimeMs() - curTimeMs)) / 1000000.0f) + " seconds");
                } catch (IOException e) {
                    e.printStackTrace();
                    GameEngine.log("SendErrorReport", "took: " + (((float) (GameEngine.curTimeMs() - curTimeMs)) / 1000000.0f) + " seconds");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                GameEngine.log("SendErrorReport", "took: " + (((float) (GameEngine.curTimeMs() - curTimeMs)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            GameEngine.log("SendErrorReport", "took: " + (((float) (GameEngine.curTimeMs() - curTimeMs)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}