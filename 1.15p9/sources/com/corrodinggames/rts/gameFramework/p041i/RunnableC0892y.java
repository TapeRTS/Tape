package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/y.class */
public class RunnableC0892y implements Runnable {
    public void run() {
        GameEngine.m1156ap();
        long m1208U = GameEngine.m1208U();
        GameEngine m1228A = GameEngine.m1228A();
        GameEngine.m1138b("StartCreateOnMasterServer", "Starting create");
        try {
            try {
                ArrayList arrayList = new ArrayList(2);
                C0879n.m1418a(arrayList, "action", "add");
                String str = "u_" + C0758f.m2318b();
                C0879n.m1418a(arrayList, "user_id", str);
                C0857ap.f5711a.m1579a(str, arrayList);
                C0879n.m1418a(arrayList, "game_name", "Unnamed");
                C0879n.m1418a(arrayList, "game_version", Integer.toString(m1228A.mo5712c(true)));
                if (!m1228A.networkEngine.f5560v) {
                    C0879n.m1418a(arrayList, "game_version_string", m1228A.mo5692u());
                } else {
                    C0879n.m1418a(arrayList, "game_version_string", "ANY");
                }
                C0879n.m1418a(arrayList, "game_version_beta", C0758f.m2322a(m1228A.mo5700m()));
                String m1702au = m1228A.networkEngine.m1702au();
                if (m1702au != null) {
                    C0879n.m1418a(arrayList, "game_mods", m1702au);
                }
                C0879n.m1418a(arrayList, "private_token", m1228A.networkEngine.f5619bh);
                C0879n.m1418a(arrayList, "private_token_2", C0758f.m2300b(C0758f.m2300b(m1228A.networkEngine.f5619bh)));
                C0879n.m1418a(arrayList, "confirm", C0758f.m2300b("a" + C0758f.m2300b(m1228A.networkEngine.f5619bh)));
                C0879n.m1410b(arrayList);
                BufferedReader m1420a = C0879n.m1420a(arrayList, 15);
                String readLine = m1420a.readLine();
                if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                    GameEngine.m1138b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                    GameEngine.m1138b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.m1208U() - m1208U)) / 1000000.0f) + " seconds");
                    return;
                }
                String[] split = m1420a.readLine().split(",");
                if (split.length < 1) {
                    GameEngine.m1138b("StartCreateOnMasterServer", "columns.length too short at:" + split.length);
                }
                String str2 = split[0];
                try {
                    GameEngine.m1138b("StartCreateOnMasterServer", "Created server is:" + str2);
                    m1228A.networkEngine.f5529bi = str2;
                } catch (NumberFormatException e) {
                    GameEngine.m1138b("StartCreateOnMasterServer", "failed to load server");
                    e.printStackTrace();
                }
                if (split.length >= 2) {
                    try {
                        C0857ap.f5716f = Integer.parseInt(split[1]);
                    } catch (NumberFormatException e2) {
                        C0857ap.f5716f = -1;
                    }
                }
                GameEngine.m1138b("StartCreateOnMasterServer", "Completed create from master server without error");
                GameEngine.m1138b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.m1208U() - m1208U)) / 1000000.0f) + " seconds");
            } catch (IOException e3) {
                e3.printStackTrace();
                GameEngine.m1138b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.m1208U() - m1208U)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            GameEngine.m1138b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.m1208U() - m1208U)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}
