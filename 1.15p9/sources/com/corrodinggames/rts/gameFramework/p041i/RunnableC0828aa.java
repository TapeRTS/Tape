package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/aa.class */
public class RunnableC0828aa implements Runnable {
    public void run() {
        GameEngine.m1156ap();
        GameEngine m1228A = GameEngine.m1228A();
        try {
            ArrayList arrayList = new ArrayList(2);
            C0879n.m1418a(arrayList, "action", "update");
            String str = m1228A.networkEngine.f5529bi;
            if (str == null) {
                GameEngine.m1138b("startUpdateOnMasterServer", "No game id");
                return;
            }
            C0879n.m1418a(arrayList, "id", str);
            C0879n.m1418a(arrayList, "private_token", m1228A.networkEngine.f5619bh);
            if (GameEngine.m1149aw()) {
                C0879n.m1418a(arrayList, "check_port", "false");
            }
            C0879n.m1410b(arrayList);
            BufferedReader m1421a = C0879n.m1421a(arrayList);
            String readLine = m1421a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.m1138b("startUpdateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            String readLine2 = m1421a.readLine();
            if (!"GAME UPDATED".equals(readLine2)) {
                GameEngine.m1138b("startUpdateOnMasterServer", "Update server response was:" + readLine2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
