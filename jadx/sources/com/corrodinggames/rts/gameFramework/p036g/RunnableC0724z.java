package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.g.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/z.class */
class RunnableC0724z implements Runnable {
    RunnableC0724z() {
    }

    public void run() {
        AbstractC0789l.m715ag();
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m694b("startRemoveOnMasterServer", "Starting remove");
        try {
            ArrayList arrayList = new ArrayList(2);
            C0710n.m1048a(arrayList, "action", "remove");
            String str = u.f5486bF.f4707bb;
            if (str == null) {
                AbstractC0789l.m694b("startRemoveOnMasterServer", "No game id");
                return;
            }
            C0710n.m1048a(arrayList, "id", str);
            C0710n.m1048a(arrayList, "private_token", u.f5486bF.f4783ba);
            BufferedReader a = C0710n.m1051a(arrayList);
            String readLine = a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                AbstractC0789l.m694b("startRemoveOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            AbstractC0789l.m694b("startRemoveOnMasterServer", "Remove server response was:" + a.readLine());
            AbstractC0789l.m694b("startRemoveOnMasterServer", "Completed load from master server without error");
        } catch (IOException e) {
            AbstractC0789l.m694b("startRemoveOnMasterServer", "Remove failed");
            e.printStackTrace();
        }
    }
}
