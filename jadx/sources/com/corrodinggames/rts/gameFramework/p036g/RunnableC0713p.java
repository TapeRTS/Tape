package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.p008a.ActivityC0098n;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.g.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/p.class */
class RunnableC0713p implements Runnable {
    RunnableC0713p() {
    }

    public void run() {
        AbstractC0789l.m715ag();
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m694b("GetOwnInfoRunnable", "Starting getOwnInfoFromMasterServer");
        try {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "self_info"));
            C0710n.m1048a(arrayList, "port", Integer.toString(u.f5486bF.f4653l));
            C0710n.m1048a(arrayList, "id", u.f5486bF.f4707bb);
            C0689ao.f4869a.m1202b(u.f5486bF.f4707bb, arrayList);
            C0689ao.f4869a.m1201c(u.f5486bF.f4707bb, arrayList);
            BufferedReader a = C0710n.m1051a(arrayList);
            String readLine = a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                AbstractC0789l.m694b("GetOwnInfoRunnable", "Error bad header returned from the master server: " + readLine);
                return;
            }
            while (true) {
                String readLine2 = a.readLine();
                if (readLine2 != null) {
                    String[] split = readLine2.split(",");
                    if (split.length <= 1) {
                        AbstractC0789l.m694b("GetOwnInfoRunnable", "columns.length too short at:" + split.length);
                    } else {
                        String str = split[0];
                        String str2 = split[1];
                        try {
                            AbstractC0789l.m694b("GetOwnInfoRunnable", "got info");
                            u.f5486bF.m1328a(true, str, Boolean.valueOf(Boolean.parseBoolean(str2)));
                        } catch (NumberFormatException e) {
                            AbstractC0789l.m694b("GetOwnInfoRunnable", "failed to load server");
                            e.printStackTrace();
                        }
                    }
                } else {
                    ActivityC0098n.m4243j();
                    AbstractC0789l.m694b("GetOwnInfoRunnable", "Completed load from master server without error");
                    return;
                }
            }
        } catch (ClientProtocolException e2) {
            u.f5486bF.m1328a(false, (String) null, (Boolean) null);
            e2.printStackTrace();
        } catch (IOException e3) {
            u.f5486bF.m1328a(false, (String) null, (Boolean) null);
            e3.printStackTrace();
        } catch (Exception e4) {
            u.f5486bF.m1328a(false, (String) null, (Boolean) null);
            AbstractC0789l.m729a("GetOwnInfoRunnable Failed", e4);
        }
    }
}
