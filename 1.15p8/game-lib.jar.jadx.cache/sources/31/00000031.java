package com.corrodinggames.rts.gameFramework.network;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.h.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/q.class */
public class RunnableC0801q implements Runnable {

    /* renamed from: a */
    Runnable f5431a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0801q(Runnable runnable) {
        this.f5431a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.m865am();
        final GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.log("LoadFromMasterServer", "Starting load");
        final int i = C0797n.f5419e;
        C0797n.f5419e++;
        try {
            new Timer().schedule(new C0799o(i), 5000L);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "list"));
            arrayList.add(new BasicNameValuePair("game_version", Integer.toString(gameEngine.gameVersionInternal(true))));
            arrayList.add(new BasicNameValuePair("game_version_beta", CommonUtils.booleanToString(gameEngine.isBetaVersion())));
            C0797n.m1196a((List) arrayList, false, new AbstractC0804s() { // from class: com.corrodinggames.rts.gameFramework.h.q.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.corrodinggames.rts.gameFramework.network.AbstractC0804s
                /* renamed from: a */
                public void mo1182a(BufferedReader bufferedReader, int i2, String str) {
                    GameEngine gameEngine2 = GameEngine.getInstance();
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                        String str2 = i2 + ": Unknown header from the master server: '" + CommonUtils.m1711a(readLine, 30) + "'";
                        GameEngine.log("LoadFromMasterServer", str2);
                        this.f5436d = str2;
                        try {
                            String str3 = VariableScope.nullOrMissingString + readLine + "\n";
                            GameEngine.PrintLOG("----------- Full response ----------");
                            GameEngine.log("LoadFromMasterServer", "line:" + readLine);
                            while (true) {
                                String readLine2 = bufferedReader.readLine();
                                if (readLine2 != null) {
                                    GameEngine.log("LoadFromMasterServer", "line:" + readLine2);
                                    str3 = str3 + readLine2 + "\n";
                                } else {
                                    GameEngine.PrintLOG("------------------------------------");
                                    C0797n.f5420g = str3;
                                    return;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        GameEngine.log("LoadFromMasterServer", i2 + ": Starting load");
                        int i3 = 0;
                        while (true) {
                            String readLine3 = bufferedReader.readLine();
                            if (readLine3 == null) {
                                break;
                            }
                            String[] split = readLine3.split(",", -1);
                            if (split.length <= 21) {
                                GameEngine.log("LoadFromMasterServer", i2 + ": columns.length too short at:" + split.length);
                                GameEngine.log("LoadFromMasterServer", i2 + ": short line is:" + readLine3);
                            } else {
                                String str4 = split[0];
                                String str5 = split[1];
                                String str6 = split[2];
                                String str7 = split[3];
                                String str8 = split[4];
                                String str9 = split[5];
                                String str10 = split[6];
                                String str11 = split[7];
                                String str12 = split[8];
                                String str13 = split[9];
                                String str14 = split[10];
                                String str15 = split[11];
                                String str16 = split[12];
                                String str17 = split[13];
                                String str18 = split[15];
                                String str19 = split[16];
                                String str20 = split[17];
                                String str21 = split[18];
                                String str22 = split[19];
                                String str23 = split[20];
                                String str24 = split[21];
                                String str25 = null;
                                String str26 = null;
                                if (str7 != null && str7.startsWith("url:") && Boolean.parseBoolean(str20)) {
                                    str25 = str7.substring(4);
                                    str26 = str5;
                                    if (!CommonUtils.m1666c(str25 + ";" + str26).equals(str8)) {
                                        GameEngine.PrintLOG("Skipping " + str21);
                                    }
                                }
                                if (str21 == null || str21.trim().length() == 0) {
                                    str21 = str4;
                                }
                                try {
                                    String str27 = str21;
                                    synchronized (C0797n.f5425f) {
                                        C0790g m1188c = C0797n.m1188c(str27);
                                        m1188c.f5372c = str7;
                                        m1188c.f5373d = str8;
                                        m1188c.f5374e = str25;
                                        m1188c.f5375f = str26;
                                        m1188c.f5376g = Integer.valueOf(str9).intValue();
                                        m1188c.f5377h = Boolean.parseBoolean(str10);
                                        m1188c.f5381m = Boolean.parseBoolean(str12);
                                        m1188c.f5378j = str6;
                                        try {
                                            m1188c.f5380l = Integer.parseInt(m1188c.f5378j);
                                        } catch (NumberFormatException e2) {
                                            GameEngine.log("game_version_int:" + e2.getMessage());
                                        }
                                        m1188c.serverUser = str11;
                                        m1188c.f5385q = str13;
                                        m1188c.f5386r = str14;
                                        m1188c.f5387s = str15;
                                        m1188c.f5379k = str16;
                                        m1188c.f5370a = Boolean.parseBoolean(str17);
                                        m1188c.f5388t = str18;
                                        m1188c.f5389u = str19;
                                        m1188c.f5391y = Boolean.parseBoolean(str22);
                                        if (VariableScope.nullOrMissingString.equals(str23)) {
                                            str23 = null;
                                        }
                                        m1188c.f5392z = str23;
                                        if (!str24.trim().equals(VariableScope.nullOrMissingString)) {
                                            m1188c.f5369A = Integer.valueOf(str24).intValue();
                                        }
                                        try {
                                            m1188c.f5394v = Integer.parseInt(m1188c.f5388t);
                                        } catch (NumberFormatException e3) {
                                            GameEngine.log("game_player_count_int:" + e3.getMessage());
                                        }
                                        try {
                                            m1188c.f5395w = Integer.parseInt(m1188c.f5389u);
                                        } catch (NumberFormatException e4) {
                                            GameEngine.log("game_max_player_count_int:" + e4.getMessage());
                                        }
                                        m1188c.f5390x = Boolean.parseBoolean(str20);
                                        if (m1188c.f5384p < i) {
                                            m1188c.f5384p = i;
                                        }
                                        if (C0797n.m1191b(m1188c.f5371b) == null) {
                                            gameEngine2.networkEngine.f5166bs.add(m1188c);
                                        }
                                        i3++;
                                    }
                                } catch (NumberFormatException e5) {
                                    GameEngine.log("LoadFromMasterServer", i2 + ": failed to load server");
                                    e5.printStackTrace();
                                }
                            }
                        }
                        GameEngine.log("LoadFromMasterServer", "[" + i2 + "]: Found " + i3 + " servers");
                        if (i3 == 0) {
                            try {
                                Thread.sleep(2000L);
                            } catch (InterruptedException e6) {
                                e6.printStackTrace();
                            }
                        }
                        this.f5437e = true;
                        RunnableC0801q.this.f5431a.run();
                        try {
                            Thread.sleep(2000L);
                        } catch (InterruptedException e7) {
                            e7.printStackTrace();
                        }
                        C0797n.m1206a(i, i2);
                        GameEngine.log("LoadFromMasterServer", i2 + ": Completed load from master server without error");
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.corrodinggames.rts.gameFramework.network.AbstractC0804s
                /* renamed from: a */
                public void mo1183a() {
                    if (!this.f5437e) {
                        gameEngine.networkEngine.f5165br = this.f5436d;
                        RunnableC0801q.this.f5431a.run();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            gameEngine.alert("Error getting game list from server", 1);
        }
    }
}