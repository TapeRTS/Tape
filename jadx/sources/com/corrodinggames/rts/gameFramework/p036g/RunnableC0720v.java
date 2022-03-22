package com.corrodinggames.rts.gameFramework.p036g;

import android.os.Build;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.g.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/v.class */
class RunnableC0720v implements Runnable {

    /* renamed from: a */
    String f5041a;

    /* renamed from: b */
    String f5042b;

    RunnableC0720v() {
    }

    public void run() {
        long N = AbstractC0789l.m760N();
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m694b("SendErrorReport", "Starting");
        try {
            try {
                try {
                    ArrayList arrayList = new ArrayList(2);
                    C0710n.m1048a(arrayList, "action", "error_report");
                    C0710n.m1048a(arrayList, "game_version", Integer.toString(u.m686c(false)));
                    C0710n.m1048a(arrayList, "game_version_internal", Integer.toString(u.m686c(true)));
                    C0710n.m1048a(arrayList, "game_version_string", u.m656n());
                    C0710n.m1048a(arrayList, "package_name", u.m672h());
                    C0710n.m1048a(arrayList, "installation_source", u.m669i());
                    String str = "" + Build.VERSION.SDK_INT;
                    if (AbstractC0789l.m710al()) {
                        str = "s:0;";
                        if (C0796a.m645a().m637e()) {
                            str = "s:1;";
                        }
                    }
                    if (AbstractC0789l.m710al() || AbstractC0789l.f5560aJ) {
                        C0710n.m1048a(arrayList, "system_version", System.getProperty("os.name") + " - " + System.getProperty("os.version"));
                    }
                    C0710n.m1048a(arrayList, "sdk_version", str);
                    C0710n.m1048a(arrayList, "device_model", u.m646z());
                    C0710n.m1048a(arrayList, "build_version", u.m773A());
                    C0710n.m1048a(arrayList, "release_version", C0654f.m1536a(AbstractC0789l.f5548an));
                    C0710n.m1048a(arrayList, "dedicated_server", C0654f.m1536a(AbstractC0789l.f5556aF));
                    String str2 = "NA";
                    if (u.f5486bF != null) {
                        str2 = u.f5486bF.f4783ba;
                    }
                    C0710n.m1048a(arrayList, "private_token", str2);
                    C0710n.m1048a(arrayList, "private_token_2", C0654f.m1518b(C0654f.m1518b(str2)));
                    C0710n.m1048a(arrayList, "message", this.f5041a);
                    C0710n.m1048a(arrayList, "stacktrace", this.f5042b);
                    AbstractC0789l.m694b("SendErrorReport", "making request");
                    String readLine = C0710n.m1051a(arrayList).readLine();
                    if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                        AbstractC0789l.m694b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                        AbstractC0789l.m694b("SendErrorReport", "took: " + (((float) (AbstractC0789l.m760N() - N)) / 1000000.0f) + " seconds");
                        return;
                    }
                    AbstractC0789l.m694b("SendErrorReport", "Send trace successfully");
                    AbstractC0789l.m694b("SendErrorReport", "took: " + (((float) (AbstractC0789l.m760N() - N)) / 1000000.0f) + " seconds");
                } catch (IOException e) {
                    e.printStackTrace();
                    AbstractC0789l.m694b("SendErrorReport", "took: " + (((float) (AbstractC0789l.m760N() - N)) / 1000000.0f) + " seconds");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                AbstractC0789l.m694b("SendErrorReport", "took: " + (((float) (AbstractC0789l.m760N() - N)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            AbstractC0789l.m694b("SendErrorReport", "took: " + (((float) (AbstractC0789l.m760N() - N)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}
