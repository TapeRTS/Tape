package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.g.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/y.class */
class RunnableC0723y implements Runnable {
    RunnableC0723y() {
    }

    public void run() {
        AbstractC0789l.m715ag();
        long N = AbstractC0789l.m760N();
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m694b("StartCreateOnMasterServer", "Starting create");
        try {
            try {
                ArrayList arrayList = new ArrayList(2);
                C0710n.m1048a(arrayList, "action", "add");
                String str = "u_" + C0654f.m1533b();
                C0710n.m1048a(arrayList, "user_id", str);
                C0689ao.f4869a.m1203a(str, arrayList);
                C0710n.m1048a(arrayList, "game_name", "Unnamed");
                C0710n.m1048a(arrayList, "game_version", Integer.toString(u.m686c(true)));
                if (!u.f5486bF.f4730t) {
                    C0710n.m1048a(arrayList, "game_version_string", u.m655o());
                } else {
                    C0710n.m1048a(arrayList, "game_version_string", "ANY");
                }
                C0710n.m1048a(arrayList, "game_version_beta", C0654f.m1536a(u.m666j()));
                String al = u.f5486bF.m1314al();
                if (al != null) {
                    C0710n.m1048a(arrayList, "game_mods", al);
                }
                C0710n.m1048a(arrayList, "private_token", u.f5486bF.f4783ba);
                C0710n.m1048a(arrayList, "private_token_2", C0654f.m1518b(C0654f.m1518b(u.f5486bF.f4783ba)));
                C0710n.m1048a(arrayList, "confirm", C0654f.m1518b("a" + C0654f.m1518b(u.f5486bF.f4783ba)));
                C0710n.m1040b(arrayList);
                BufferedReader a = C0710n.m1050a(arrayList, 15);
                String readLine = a.readLine();
                if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                    AbstractC0789l.m694b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                    AbstractC0789l.m694b("StartCreateOnMasterServer", "create took: " + (((float) (AbstractC0789l.m760N() - N)) / 1000000.0f) + " seconds");
                    return;
                }
                String[] split = a.readLine().split(",");
                if (split.length < 1) {
                    AbstractC0789l.m694b("StartCreateOnMasterServer", "columns.length too short at:" + split.length);
                }
                String str2 = split[0];
                try {
                    AbstractC0789l.m694b("StartCreateOnMasterServer", "Created server is:" + str2);
                    u.f5486bF.f4707bb = str2;
                } catch (NumberFormatException e) {
                    AbstractC0789l.m694b("StartCreateOnMasterServer", "failed to load server");
                    e.printStackTrace();
                }
                if (split.length >= 2) {
                    try {
                        C0689ao.f4874f = Integer.parseInt(split[1]);
                    } catch (NumberFormatException e2) {
                        C0689ao.f4874f = -1;
                    }
                }
                AbstractC0789l.m694b("StartCreateOnMasterServer", "Completed create from master server without error");
                AbstractC0789l.m694b("StartCreateOnMasterServer", "create took: " + (((float) (AbstractC0789l.m760N() - N)) / 1000000.0f) + " seconds");
            } catch (IOException e3) {
                e3.printStackTrace();
                AbstractC0789l.m694b("StartCreateOnMasterServer", "create took: " + (((float) (AbstractC0789l.m760N() - N)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            AbstractC0789l.m694b("StartCreateOnMasterServer", "create took: " + (((float) (AbstractC0789l.m760N() - N)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}
