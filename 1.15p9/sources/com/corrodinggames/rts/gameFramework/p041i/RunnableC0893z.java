package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/z.class */
public class RunnableC0893z implements Runnable {
    public void run() {
        GameEngine.m1156ap();
        GameEngine m1228A = GameEngine.m1228A();
        GameEngine.m1138b("startRemoveOnMasterServer", "Starting remove");
        try {
            ArrayList arrayList = new ArrayList(2);
            C0879n.m1418a(arrayList, "action", "remove");
            String str = m1228A.networkEngine.f5529bi;
            if (str == null) {
                GameEngine.m1138b("startRemoveOnMasterServer", "No game id");
                return;
            }
            C0879n.m1418a(arrayList, "id", str);
            C0879n.m1418a(arrayList, "private_token", m1228A.networkEngine.f5619bh);
            BufferedReader m1421a = C0879n.m1421a(arrayList);
            String readLine = m1421a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.m1138b("startRemoveOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            GameEngine.m1138b("startRemoveOnMasterServer", "Remove server response was:" + m1421a.readLine());
            GameEngine.m1138b("startRemoveOnMasterServer", "Completed load from master server without error");
        } catch (IOException e) {
            GameEngine.m1138b("startRemoveOnMasterServer", "Remove failed");
            e.printStackTrace();
        }
    }
}
