package com.corrodinggames.rts.gameFramework.p041i;

import android.os.Build;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/v.class */
public class RunnableC0889v implements Runnable {

    /* renamed from: a */
    String f5895a;

    /* renamed from: b */
    String f5896b;

    public void run() {
        long m1208U = GameEngine.m1208U();
        GameEngine m1228A = GameEngine.m1228A();
        GameEngine.m1138b("SendErrorReport", "Starting");
        try {
            try {
                try {
                    ArrayList arrayList = new ArrayList(2);
                    C0879n.m1418a(arrayList, "action", "error_report");
                    C0879n.m1418a(arrayList, "game_version", Integer.toString(m1228A.mo5712c(false)));
                    C0879n.m1418a(arrayList, "game_version_internal", Integer.toString(m1228A.mo5712c(true)));
                    C0879n.m1418a(arrayList, "game_version_string", m1228A.mo5696q());
                    C0879n.m1418a(arrayList, "package_name", m1228A.mo5702k());
                    C0879n.m1418a(arrayList, "installation_source", m1228A.mo5701l());
                    String str = VariableScope.nullOrMissingString + Build.VERSION.SDK_INT;
                    if (GameEngine.m1151au()) {
                        str = "s:0;";
                        if (C1058a.m780a().m772e()) {
                            str = "s:1;";
                        }
                    }
                    if (GameEngine.m1151au() || GameEngine.f6204aZ) {
                        C0879n.m1418a(arrayList, "system_version", System.getProperty("os.name") + " - " + System.getProperty("os.version"));
                    }
                    C0879n.m1418a(arrayList, "sdk_version", str);
                    C0879n.m1418a(arrayList, "device_model", m1228A.m1223F());
                    C0879n.m1418a(arrayList, "build_version", m1228A.m1222G());
                    C0879n.m1418a(arrayList, "release_version", C0758f.m2322a(GameEngine.f6184as));
                    C0879n.m1418a(arrayList, "dedicated_server", C0758f.m2322a(GameEngine.f6199aU));
                    String str2 = "NA";
                    if (m1228A.networkEngine != null) {
                        str2 = m1228A.networkEngine.f5619bh;
                    }
                    C0879n.m1418a(arrayList, "private_token", str2);
                    C0879n.m1418a(arrayList, "private_token_2", C0758f.m2300b(C0758f.m2300b(str2)));
                    C0879n.m1418a(arrayList, "message", this.f5895a);
                    C0879n.m1418a(arrayList, "stacktrace", this.f5896b);
                    GameEngine.m1138b("SendErrorReport", "making request");
                    String readLine = C0879n.m1421a(arrayList).readLine();
                    if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                        GameEngine.m1138b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                        GameEngine.m1138b("SendErrorReport", "took: " + (((float) (GameEngine.m1208U() - m1208U)) / 1000000.0f) + " seconds");
                        return;
                    }
                    GameEngine.m1138b("SendErrorReport", "Send trace successfully");
                    GameEngine.m1138b("SendErrorReport", "took: " + (((float) (GameEngine.m1208U() - m1208U)) / 1000000.0f) + " seconds");
                } catch (Exception e) {
                    e.printStackTrace();
                    GameEngine.m1138b("SendErrorReport", "took: " + (((float) (GameEngine.m1208U() - m1208U)) / 1000000.0f) + " seconds");
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                GameEngine.m1138b("SendErrorReport", "took: " + (((float) (GameEngine.m1208U() - m1208U)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            GameEngine.m1138b("SendErrorReport", "took: " + (((float) (GameEngine.m1208U() - m1208U)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}
