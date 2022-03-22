package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.g.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/ab.class */
class RunnableC0662ab implements Runnable {

    /* renamed from: a */
    C0721w f4644a;

    /* renamed from: b */
    String f4645b;

    /* renamed from: c */
    int f4646c;

    /* renamed from: d */
    String f4647d;

    RunnableC0662ab() {
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0789l.m702ag();
        AbstractC0789l.m638u();
        AbstractC0789l.m681b("getGameServerInfoFromMasterServer", "Starting getGameServerInfoFromMasterServer");
        String a = C0710n.m1043a(this.f4646c);
        String str = null;
        if (this.f4647d != null) {
            str = C0654f.m1451c(this.f4645b + this.f4647d, 3);
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "get"));
            arrayList.add(new BasicNameValuePair("game_id", this.f4645b));
            arrayList.add(new BasicNameValuePair("c", a));
            arrayList.add(new BasicNameValuePair("p_hash", str));
            BufferedReader a2 = C0710n.m1037a(arrayList);
            String readLine = a2.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                AbstractC0789l.m681b("getGameServerInfoFromMasterServerRunnable", "Error bad header returned from the master server: " + readLine);
                this.f4644a.mo1017a("Unexpected header from master server", EnumC0722x.unknown, null);
                return;
            }
            String readLine2 = a2.readLine();
            if (readLine2 == null) {
                throw new IOException("Unexpected end of response");
            } else if (readLine.contains("[FAILED]")) {
                AbstractC0789l.m682b("Got failed header with status:" + readLine2);
                String str2 = "Failed to get server connection data - unknown";
                EnumC0722x xVar = EnumC0722x.unknown;
                if (readLine2.startsWith("ERROR_OTHER")) {
                    String[] split = readLine2.split(",");
                    if (split.length >= 2) {
                        str2 = split[1];
                    }
                    xVar = EnumC0722x.unknown;
                } else if (readLine2.startsWith("ERROR_MISSING")) {
                    str2 = "Request missing required fields";
                } else if (!readLine2.startsWith("ERROR_WRONG_C")) {
                    if (readLine2.startsWith("ERROR_MISSING_PASSWORD")) {
                        str2 = "Missing password";
                        xVar = EnumC0722x.unknown;
                    } else if (readLine2.startsWith("ERROR_WRONG_PASSWORD")) {
                        str2 = "Wrong password";
                        xVar = EnumC0722x.wrongPassword;
                    }
                }
                this.f4644a.mo1017a(str2, xVar, null);
            } else {
                String readLine3 = a2.readLine();
                if (readLine3 == null) {
                    throw new IOException("Unexpected end of response");
                }
                if (!readLine3.toLowerCase(Locale.ROOT).contains(C0654f.m1453c("game_" + a).toLowerCase(Locale.ROOT))) {
                    AbstractC0789l.m681b("getGameServerInfoFromMasterServerRunnable", "Error bad header returned from the master server: " + readLine3);
                    this.f4644a.mo1017a("Unexpected return from master server", EnumC0722x.unknown, null);
                    return;
                }
                a2.readLine();
                String readLine4 = a2.readLine();
                if (readLine4 == null) {
                    throw new IOException("Unexpected end of response");
                }
                String[] split2 = readLine4.split(",");
                if (split2.length <= 18) {
                    throw new RuntimeException("getGameServerInfoFromMasterServerRunnable: columns.length too short at:" + split2.length);
                }
                String str3 = split2[3];
                String str4 = split2[4];
                String str5 = split2[5];
                String str6 = split2[6];
                String str7 = split2[7];
                String str8 = split2[8];
                String str9 = split2[9];
                String str10 = split2[10];
                String str11 = split2[11];
                String str12 = split2[12];
                String str13 = split2[13];
                String str14 = split2[15];
                String str15 = split2[16];
                String str16 = split2[17];
                String str17 = split2[18];
                AbstractC0789l.m681b("getGameServerInfoFromMasterServerRunnable", "got ");
                AbstractC0789l.m681b("getGameServerInfoFromMasterServerRunnable", "Completed get from master server without error");
                this.f4644a.mo1018a(str3 + ":" + str5);
            }
        } catch (IOException e) {
            AbstractC0789l.m716a("getGameServerInfoFromMasterServerRunnable Failed", (Exception) e);
            this.f4644a.mo1017a(e.getMessage(), EnumC0722x.unknown, e);
        }
    }
}
