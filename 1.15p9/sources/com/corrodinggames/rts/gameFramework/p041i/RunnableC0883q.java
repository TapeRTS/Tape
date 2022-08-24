package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/q.class */
public class RunnableC0883q implements Runnable {

    /* renamed from: a */
    Runnable f5879a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0883q(Runnable runnable) {
        this.f5879a = runnable;
    }

    public void run() {
        GameEngine.m1156ap();
        GameEngine m1228A = GameEngine.m1228A();
        GameEngine.m1138b("LoadFromMasterServer", "Starting load");
        int i = C0879n.f5867e;
        C0879n.f5867e++;
        try {
            new Timer().schedule(new C0881o(i), 5000L);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "list"));
            arrayList.add(new BasicNameValuePair("game_version", Integer.toString(m1228A.mo5712c(true))));
            arrayList.add(new BasicNameValuePair("game_version_beta", C0758f.m2322a(m1228A.mo5700m())));
            C0879n.m1416a((List) arrayList, false, (AbstractC0886s) new C08841(i, m1228A));
        } catch (Exception e) {
            e.printStackTrace();
            m1228A.m1186a("Error getting game list from server", 1);
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.i.q$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/q$1.class */
    class C08841 extends AbstractC0886s {

        /* renamed from: a */
        final /* synthetic */ int f5880a;

        /* renamed from: b */
        final /* synthetic */ GameEngine f5881b;

        C08841(int i, GameEngine gameEngine) {
            this.f5880a = i;
            this.f5881b = gameEngine;
        }

        /* renamed from: a */
        void mo1400a(BufferedReader bufferedReader, int i, String str) {
            GameEngine m1228A = GameEngine.m1228A();
            String readLine = bufferedReader.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                String str2 = i + ": Unknown header from the master server: '" + C0758f.m2331a(readLine, 30) + "'";
                GameEngine.m1138b("LoadFromMasterServer", str2);
                this.f5884d = str2;
                try {
                    String str3 = VariableScope.nullOrMissingString + readLine + "\n";
                    GameEngine.PrintLog("----------- Full response ----------");
                    GameEngine.m1138b("LoadFromMasterServer", "line:" + readLine);
                    while (true) {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 != null) {
                            GameEngine.m1138b("LoadFromMasterServer", "line:" + readLine2);
                            str3 = str3 + readLine2 + "\n";
                        } else {
                            GameEngine.PrintLog("------------------------------------");
                            C0879n.f5868g = str3;
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                GameEngine.m1138b("LoadFromMasterServer", i + ": Starting load");
                int i2 = 0;
                while (true) {
                    String readLine3 = bufferedReader.readLine();
                    if (readLine3 == null) {
                        break;
                    }
                    String[] split = readLine3.split(",", -1);
                    if (split.length <= 21) {
                        GameEngine.m1138b("LoadFromMasterServer", i + ": columns.length too short at:" + split.length);
                        GameEngine.m1138b("LoadFromMasterServer", i + ": short line is:" + readLine3);
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
                            if (!C0758f.m2285c(str25 + ";" + str26).equals(str8)) {
                                GameEngine.PrintLog("Skipping " + str21);
                            }
                        }
                        if (str21 == null || str21.trim().length() == 0) {
                            str21 = str4;
                        }
                        try {
                            String str27 = str21;
                            synchronized (C0879n.f5873f) {
                                C0872g m1408c = C0879n.m1408c(str27);
                                m1408c.f5819c = str7;
                                m1408c.f5820d = str8;
                                m1408c.f5821e = str25;
                                m1408c.f5822f = str26;
                                m1408c.f5823g = Integer.valueOf(str9).intValue();
                                m1408c.f5824h = Boolean.parseBoolean(str10);
                                m1408c.f5828m = Boolean.parseBoolean(str12);
                                m1408c.f5825j = str6;
                                try {
                                    m1408c.f5827l = Integer.parseInt(m1408c.f5825j);
                                } catch (NumberFormatException e2) {
                                    GameEngine.m1139b("game_version_int:" + e2.getMessage());
                                }
                                m1408c.f5829n = str11;
                                m1408c.f5832q = str13;
                                m1408c.f5833r = str14;
                                m1408c.f5834s = str15;
                                m1408c.f5826k = str16;
                                m1408c.f5817a = Boolean.parseBoolean(str17);
                                m1408c.f5835t = str18;
                                m1408c.f5836u = str19;
                                m1408c.f5838y = Boolean.parseBoolean(str22);
                                if (VariableScope.nullOrMissingString.equals(str23)) {
                                    str23 = null;
                                }
                                m1408c.f5839z = str23;
                                if (!str24.trim().equals(VariableScope.nullOrMissingString)) {
                                    m1408c.f5840A = Integer.valueOf(str24).intValue();
                                }
                                try {
                                    m1408c.f5842v = Integer.parseInt(m1408c.f5835t);
                                } catch (NumberFormatException e3) {
                                    GameEngine.m1139b("game_player_count_int:" + e3.getMessage());
                                }
                                try {
                                    m1408c.f5843w = Integer.parseInt(m1408c.f5836u);
                                } catch (NumberFormatException e4) {
                                    GameEngine.m1139b("game_max_player_count_int:" + e4.getMessage());
                                }
                                m1408c.f5837x = Boolean.parseBoolean(str20);
                                if (m1408c.f5831p < this.f5880a) {
                                    m1408c.f5831p = this.f5880a;
                                }
                                if (C0879n.m1411b(m1408c.f5818b) == null) {
                                    m1228A.networkEngine.f5608by.add(m1408c);
                                }
                                i2++;
                            }
                        } catch (NumberFormatException e5) {
                            GameEngine.m1138b("LoadFromMasterServer", i + ": failed to load server");
                            e5.printStackTrace();
                        }
                    }
                }
                GameEngine.m1138b("LoadFromMasterServer", "[" + i + "]: Found " + i2 + " servers");
                if (i2 == 0) {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e6) {
                        e6.printStackTrace();
                    }
                }
                this.f5885e = true;
                RunnableC0883q.this.f5879a.run();
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e7) {
                    e7.printStackTrace();
                }
                C0879n.m1426a(this.f5880a, i);
                GameEngine.m1138b("LoadFromMasterServer", i + ": Completed load from master server without error");
            }
        }

        /* renamed from: a */
        void mo1401a() {
            if (!this.f5885e) {
                this.f5881b.networkEngine.f5607bx = this.f5884d;
                RunnableC0883q.this.f5879a.run();
            }
        }
    }
}
