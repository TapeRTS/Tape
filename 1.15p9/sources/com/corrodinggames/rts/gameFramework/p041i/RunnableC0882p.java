package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/p.class */
public class RunnableC0882p implements Runnable {
    public void run() {
        GameEngine.m1156ap();
        GameEngine m1228A = GameEngine.m1228A();
        GameEngine.m1138b("GetOwnInfoRunnable", "Starting getOwnInfoFromMasterServer");
        try {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "self_info"));
            C0879n.m1418a(arrayList, "port", Integer.toString(m1228A.networkEngine.f5474m));
            C0879n.m1418a(arrayList, "id", m1228A.networkEngine.f5529bi);
            C0857ap.f5711a.m1578b(m1228A.networkEngine.f5529bi, arrayList);
            C0857ap.f5711a.m1577c(m1228A.networkEngine.f5529bi, arrayList);
            BufferedReader m1421a = C0879n.m1421a(arrayList);
            String readLine = m1421a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.m1138b("GetOwnInfoRunnable", "Error bad header returned from the master server: " + readLine);
                return;
            }
            while (true) {
                String readLine2 = m1421a.readLine();
                if (readLine2 != null) {
                    String[] split = readLine2.split(",");
                    if (split.length <= 1) {
                        GameEngine.m1138b("GetOwnInfoRunnable", "columns.length too short at:" + split.length);
                    } else {
                        String str = split[0];
                        String str2 = split[1];
                        try {
                            GameEngine.m1138b("GetOwnInfoRunnable", "got info");
                            m1228A.networkEngine.m1730a(true, str, Boolean.valueOf(Boolean.parseBoolean(str2)));
                        } catch (NumberFormatException e) {
                            GameEngine.m1138b("GetOwnInfoRunnable", "failed to load server");
                            e.printStackTrace();
                        }
                    }
                } else {
                    ActivityC0129p.m6143l();
                    GameEngine.m1138b("GetOwnInfoRunnable", "Completed load from master server without error");
                    return;
                }
            }
        } catch (ClientProtocolException e2) {
            m1228A.networkEngine.m1730a(false, (String) null, (Boolean) null);
            e2.printStackTrace();
        } catch (IOException e3) {
            m1228A.networkEngine.m1730a(false, (String) null, (Boolean) null);
            e3.printStackTrace();
        } catch (Exception e4) {
            m1228A.networkEngine.m1730a(false, (String) null, (Boolean) null);
            GameEngine.m1184a("GetOwnInfoRunnable Failed", e4);
        }
    }
}
