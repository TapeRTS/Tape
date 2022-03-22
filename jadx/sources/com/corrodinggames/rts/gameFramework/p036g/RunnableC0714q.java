package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.g.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/q.class */
class RunnableC0714q implements Runnable {

    /* renamed from: a */
    Runnable f5025a;

    RunnableC0714q(Runnable runnable) {
        this.f5025a = runnable;
    }

    public void run() {
        AbstractC0789l.m715ag();
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m694b("LoadFromMasterServer", "Starting load");
        int i = C0710n.f5017c;
        C0710n.f5017c++;
        try {
            new Timer().schedule(new C0712o(i), 5000L);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "list"));
            arrayList.add(new BasicNameValuePair("game_version", Integer.toString(u.m686c(true))));
            arrayList.add(new BasicNameValuePair("game_version_beta", C0654f.m1536a(u.m666j())));
            C0710n.m1046a((List) arrayList, false, (AbstractC0717s) new C07151(i, u));
        } catch (Exception e) {
            e.printStackTrace();
            u.m731a("Error getting game list from server", 1);
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.g.q$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/q$1.class */
    class C07151 extends AbstractC0717s {

        /* renamed from: a */
        final /* synthetic */ int f5026a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0789l f5027b;

        C07151(int i, AbstractC0789l lVar) {
            this.f5026a = i;
            this.f5027b = lVar;
        }

        /* renamed from: a */
        void mo1033a(BufferedReader bufferedReader, int i, String str) {
            AbstractC0789l u = AbstractC0789l.m651u();
            String readLine = bufferedReader.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                String str2 = i + ": Unknown header from the master server: '" + C0654f.m1541a(readLine, 30) + "'";
                AbstractC0789l.m694b("LoadFromMasterServer", str2);
                this.f5030d = str2;
                try {
                    AbstractC0789l.m683d("----------- Full response ----------");
                    AbstractC0789l.m694b("LoadFromMasterServer", "line:" + readLine);
                    while (true) {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 != null) {
                            AbstractC0789l.m694b("LoadFromMasterServer", "line:" + readLine2);
                        } else {
                            AbstractC0789l.m683d("------------------------------------");
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                AbstractC0789l.m694b("LoadFromMasterServer", i + ": Starting load");
                int i2 = 0;
                while (true) {
                    String readLine3 = bufferedReader.readLine();
                    if (readLine3 == null) {
                        break;
                    }
                    String[] split = readLine3.split(",", -1);
                    if (split.length <= 21) {
                        AbstractC0789l.m694b("LoadFromMasterServer", i + ": columns.length too short at:" + split.length);
                        AbstractC0789l.m694b("LoadFromMasterServer", i + ": short line is:" + readLine3);
                    } else {
                        String str3 = split[0];
                        String str4 = split[1];
                        String str5 = split[2];
                        String str6 = split[3];
                        String str7 = split[4];
                        String str8 = split[5];
                        String str9 = split[6];
                        String str10 = split[7];
                        String str11 = split[8];
                        String str12 = split[9];
                        String str13 = split[10];
                        String str14 = split[11];
                        String str15 = split[12];
                        String str16 = split[13];
                        String str17 = split[15];
                        String str18 = split[16];
                        String str19 = split[17];
                        String str20 = split[18];
                        String str21 = split[19];
                        String str22 = split[20];
                        String str23 = split[21];
                        String str24 = null;
                        String str25 = null;
                        if (str6 != null && str6.startsWith("url:") && Boolean.parseBoolean(str19)) {
                            str24 = str6.substring(4);
                            str25 = str4;
                            if (!C0654f.m1506c(str24 + ";" + str25).equals(str7)) {
                                AbstractC0789l.m683d("Skipping " + str20);
                            }
                        }
                        if (str20 == null || str20.trim().length() == 0) {
                            str20 = str3;
                        }
                        try {
                            synchronized (C0710n.f5020d) {
                                C0703g b = C0710n.m1041b(str20);
                                b.f4970c = str6;
                                b.f4971d = str7;
                                b.f4972e = str24;
                                b.f4973f = str25;
                                b.f4974g = Integer.valueOf(str8).intValue();
                                b.f4975h = Boolean.parseBoolean(str9);
                                b.f4978l = Boolean.parseBoolean(str11);
                                b.f4976j = str5;
                                b.f4979m = str10;
                                b.f4982p = str12;
                                b.f4983q = str13;
                                b.f4984r = str14;
                                b.f4977k = str15;
                                b.f4968a = Boolean.parseBoolean(str16);
                                b.f4985s = str17;
                                b.f4986t = str18;
                                b.f4988x = Boolean.parseBoolean(str21);
                                if ("".equals(str22)) {
                                    str22 = null;
                                }
                                b.f4989y = str22;
                                if (!str23.trim().equals("")) {
                                    b.f4990z = Integer.valueOf(str23).intValue();
                                }
                                try {
                                    b.f4992u = Integer.parseInt(b.f4985s);
                                } catch (NumberFormatException e2) {
                                    AbstractC0789l.m695b("game_player_count_int:" + e2.getMessage());
                                }
                                try {
                                    b.f4993v = Integer.parseInt(b.f4986t);
                                } catch (NumberFormatException e3) {
                                    AbstractC0789l.m695b("game_max_player_count_int:" + e3.getMessage());
                                }
                                b.f4987w = Boolean.parseBoolean(str19);
                                if (b.f4981o < this.f5026a) {
                                    b.f4981o = this.f5026a;
                                }
                                if (C0710n.m1053a(b.f4969b) == null) {
                                    u.f5486bF.f4772bm.add(b);
                                }
                                i2++;
                            }
                        } catch (NumberFormatException e4) {
                            AbstractC0789l.m694b("LoadFromMasterServer", i + ": failed to load server");
                            e4.printStackTrace();
                        }
                    }
                }
                AbstractC0789l.m694b("LoadFromMasterServer", "[" + i + "]: Found " + i2 + " servers");
                if (i2 == 0) {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e5) {
                        e5.printStackTrace();
                    }
                }
                this.f5031e = true;
                RunnableC0714q.this.f5025a.run();
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e6) {
                    e6.printStackTrace();
                }
                C0710n.m1056a(this.f5026a, i);
                AbstractC0789l.m694b("LoadFromMasterServer", i + ": Completed load from master server without error");
            }
        }

        /* renamed from: a */
        void mo1034a() {
            if (!this.f5031e) {
                this.f5027b.f5486bF.f4771bl = this.f5030d;
                RunnableC0714q.this.f5025a.run();
            }
        }
    }
}
