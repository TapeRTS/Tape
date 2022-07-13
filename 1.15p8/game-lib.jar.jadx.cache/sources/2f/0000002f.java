package com.corrodinggames.rts.gameFramework.network;

import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.h.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/y.class */
public class RunnableC0810y implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        GameEngine.m865am();
        long curTimeMs = GameEngine.curTimeMs();
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.log("StartCreateOnMasterServer", "Starting create");
        try {
            try {
                ArrayList arrayList = new ArrayList(2);
                C0797n.m1198a(arrayList, "action", "add");
                String str = "u_" + CommonUtils.m1698b();
                C0797n.m1198a(arrayList, "user_id", str);
                C0776ao.f5265a.m1329a(str, arrayList);
                C0797n.m1198a(arrayList, "game_name", "Unnamed");
                C0797n.m1198a(arrayList, "game_version", Integer.toString(gameEngine.gameVersionInternal(true)));
                if (!gameEngine.networkEngine.isChatRoom) {
                    C0797n.m1198a(arrayList, "game_version_string", gameEngine.gameVersion());
                } else {
                    C0797n.m1198a(arrayList, "game_version_string", "ANY");
                }
                C0797n.m1198a(arrayList, "game_version_beta", CommonUtils.booleanToString(gameEngine.isBetaVersion()));
                String mods = gameEngine.networkEngine.getMods();
                if (mods != null) {
                    C0797n.m1198a(arrayList, "game_mods", mods);
                }
                C0797n.m1198a(arrayList, "private_token", gameEngine.networkEngine.f5177bg);
                C0797n.m1198a(arrayList, "private_token_2", CommonUtils.m1680b(CommonUtils.m1680b(gameEngine.networkEngine.f5177bg)));
                C0797n.m1198a(arrayList, "confirm", CommonUtils.m1680b("a" + CommonUtils.m1680b(gameEngine.networkEngine.f5177bg)));
                C0797n.m1190b(arrayList);
                BufferedReader m1200a = C0797n.m1200a(arrayList, 15);
                String readLine = m1200a.readLine();
                if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                    GameEngine.log("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                    GameEngine.log("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.curTimeMs() - curTimeMs)) / 1000000.0f) + " seconds");
                    return;
                }
                String[] split = m1200a.readLine().split(",");
                if (split.length < 1) {
                    GameEngine.log("StartCreateOnMasterServer", "columns.length too short at:" + split.length);
                }
                String str2 = split[0];
                try {
                    GameEngine.log("StartCreateOnMasterServer", "Created server is:" + str2);
                    gameEngine.networkEngine.f5086bh = str2;
                } catch (NumberFormatException e) {
                    GameEngine.log("StartCreateOnMasterServer", "failed to load server");
                    e.printStackTrace();
                }
                if (split.length >= 2) {
                    try {
                        C0776ao.f5270f = Integer.parseInt(split[1]);
                    } catch (NumberFormatException e2) {
                        C0776ao.f5270f = -1;
                    }
                }
                GameEngine.log("StartCreateOnMasterServer", "Completed create from master server without error");
                GameEngine.log("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.curTimeMs() - curTimeMs)) / 1000000.0f) + " seconds");
            } catch (IOException e3) {
                e3.printStackTrace();
                GameEngine.log("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.curTimeMs() - curTimeMs)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            GameEngine.log("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.curTimeMs() - curTimeMs)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}