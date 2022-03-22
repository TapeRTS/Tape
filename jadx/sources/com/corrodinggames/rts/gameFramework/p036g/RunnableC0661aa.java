package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.g.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/aa.class */
class RunnableC0661aa implements Runnable {
    RunnableC0661aa() {
    }

    public void run() {
        AbstractC0789l.m715ag();
        AbstractC0789l u = AbstractC0789l.m651u();
        try {
            ArrayList arrayList = new ArrayList(2);
            C0710n.m1048a(arrayList, "action", "update");
            String str = u.f5486bF.f4707bb;
            if (str == null) {
                AbstractC0789l.m694b("startUpdateOnMasterServer", "No game id");
                return;
            }
            C0710n.m1048a(arrayList, "id", str);
            C0710n.m1048a(arrayList, "private_token", u.f5486bF.f4783ba);
            if (AbstractC0789l.m708an()) {
                C0710n.m1048a(arrayList, "check_port", "false");
            }
            C0710n.m1040b(arrayList);
            BufferedReader a = C0710n.m1051a(arrayList);
            String readLine = a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                AbstractC0789l.m694b("startUpdateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            String readLine2 = a.readLine();
            if (!"GAME UPDATED".equals(readLine2)) {
                AbstractC0789l.m694b("startUpdateOnMasterServer", "Update server response was:" + readLine2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
