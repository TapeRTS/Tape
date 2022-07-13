package com.corrodinggames.rts.gameFramework.network;

import com.corrodinggames.rts.appFramework.ActivityC0123p;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.h.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/n.class */
public class C0797n {

    /* renamed from: e */
    static int f5419e;

    /* renamed from: g */
    public static String f5420g;

    /* renamed from: a */
    public static boolean f5421a = true;

    /* renamed from: b */
    public static boolean printLog = true;

    /* renamed from: c */
    public static String[] ServerListApiURL = {"http://gs1.corrodinggames.com/masterserver/1.4", "http://gs4.corrodinggames.net/masterserver/1.4"};

    /* renamed from: d */
    public static C0803r f5424d = new C0803r();

    /* renamed from: f */
    public static Object f5425f = new Object();

    /* renamed from: a */
    public static void m1203a(String str) {
        if (printLog) {
            GameEngine.PrintLOG(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1196a(List list, boolean z, AbstractC0804s abstractC0804s) {
        m1195a(list, z, abstractC0804s, ServerListApiURL);
    }

    /* renamed from: a */
    static void m1195a(List list, boolean z, AbstractC0804s abstractC0804s, String[] strArr) {
        abstractC0804s.f5438f = strArr.length;
        int i = 0;
        for (String str : strArr) {
            i++;
            new Thread(new RunnableC0806u(list, abstractC0804s, str, z, i)).start();
            if (f5421a) {
                GameEngine.log("LoadFromMasterServer", i + ": Started RequestsParallelRunnable thread");
            }
        }
    }

    /* renamed from: a */
    public static String m1199a(List list, String str) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NameValuePair nameValuePair = (NameValuePair) it.next();
                if (str.equals(nameValuePair.getName())) {
                    return nameValuePair.getValue();
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public static BufferedReader m1201a(List list) {
        return m1194a(list, true, ServerListApiURL, 10, true);
    }

    /* renamed from: a */
    public static BufferedReader m1200a(List list, int i) {
        return m1194a(list, true, ServerListApiURL, i, true);
    }

    /* renamed from: a */
    public static BufferedReader m1194a(final List list, final boolean z, String[] strArr, int i, final boolean z2) {
        Future poll;
        String m1199a = m1199a(list, "action");
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(strArr.length);
        try {
            ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
            ArrayList arrayList = new ArrayList();
            for (final String str : strArr) {
                arrayList.add(executorCompletionService.submit(new Callable() { // from class: com.corrodinggames.rts.gameFramework.h.n.1
                    /* renamed from: a */
                    public C0805t call() {
                        try {
                            C0797n.m1203a("Running doSingleRequest:" + str);
                            return C0797n.m1197a(list, str, z);
                        } catch (Exception e) {
                            GameEngine.PrintLOG("Error on doSingleRequest:" + str + " - " + e.getMessage());
                            if (z2) {
                                e.printStackTrace();
                                return null;
                            }
                            return null;
                        }
                    }
                }));
            }
            int length = strArr.length;
            C0805t c0805t = null;
            C0805t c0805t2 = null;
            C0805t c0805t3 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                try {
                    poll = executorCompletionService.poll(10L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                    if (e2.getCause() != null) {
                        e2.getCause().printStackTrace();
                    }
                }
                if (poll == null) {
                    GameEngine.log("MULTI_MASTERSERVERS: poll timed out (" + m1199a + ")");
                    break;
                }
                C0805t c0805t4 = (C0805t) poll.get();
                if (c0805t4 != null) {
                    c0805t = c0805t4;
                    if (c0805t4.f5440b) {
                        if (c0805t4.f5441c) {
                            c0805t3 = c0805t4;
                        } else {
                            c0805t2 = c0805t4;
                            break;
                        }
                    }
                }
                i2++;
            }
            if (c0805t2 == null && c0805t3 != null) {
                GameEngine.log("All masterserver results included an error message (" + m1199a + ")");
                c0805t2 = c0805t3;
            }
            if (c0805t2 == null) {
                GameEngine.log("No valid result found on any masterserver (" + m1199a + ")");
                c0805t2 = c0805t;
            }
            if (c0805t2 != null) {
                BufferedReader bufferedReader = c0805t2.f5439a;
                newFixedThreadPool.shutdown();
                return bufferedReader;
            }
            throw new IOException("No results found (" + m1199a + ")");
        } catch (Throwable th) {
            newFixedThreadPool.shutdown();
            throw th;
        }
    }

    /* renamed from: a */
    public static C0805t m1197a(List list, String str, boolean z) {
        HttpUriRequest httpUriRequest;
        String str2;
        GameEngine gameEngine;
        HttpResponse httpResponse;
        String m1199a = m1199a(list, "action");
        long tookTime = C0651bl.getTookTime();
        String str3 = str + "/interface";
        if (z) {
            HttpUriRequest httpPost = new HttpPost(str3);
            httpPost.setEntity(new UrlEncodedFormEntity(list));
            httpUriRequest = httpPost;
        } else {
            str3 = str3 + "?" + URLEncodedUtils.format(list, "utf-8");
            httpUriRequest = new HttpGet(str3);
        }
        if (GameEngine.m858at()) {
            str2 = "rw server";
        } else {
            str2 = "rw " + (GameEngine.isPC() ? "pc" : "android");
        }
        String localLanguage = LangLocale.getLocalLanguage();
        if (GameEngine.getInstance() != null) {
            str2 = str2 + " " + gameEngine.gameVersionInternal(true) + " " + localLanguage;
        }
        httpUriRequest.setHeader("User-Agent", str2);
        httpUriRequest.setHeader("Language", localLanguage);
        HttpClient m1185a = f5424d.m1185a();
        try {
            httpResponse = m1185a.execute(httpUriRequest);
        } catch (NullPointerException e) {
            GameEngine.log("doRequest: httpclient.execute threw NullPointerException, running workaround");
            m1185a = f5424d.m1184b();
            httpResponse = m1185a.execute(httpUriRequest);
        }
        float m2277a = C0651bl.m2277a(tookTime);
        HttpEntity entity = httpResponse.getEntity();
        InputStream content = entity.getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read = content.read(bArr, 0, bArr.length);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byteArrayOutputStream.flush();
        content.close();
        entity.consumeContent();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C0805t c0805t = new C0805t();
        String m1193a = m1193a(byteArray);
        c0805t.f5440b = m1193a.startsWith("CORRODINGGAMES");
        c0805t.f5441c = m1193a.contains("[FAILED]");
        if (!c0805t.f5440b || c0805t.f5441c) {
            String str4 = str3 + (m1199a != null ? "?action=" + m1199a : VariableScope.nullOrMissingString) + " (" + m2277a + "ms)";
            if (!"list".equals(m1199a)) {
                str4 = str4 + ":\n" + new String(byteArray);
            }
            GameEngine.PrintLOG(str4);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
        f5424d.mo101a(m1185a);
        c0805t.f5439a = bufferedReader;
        return c0805t;
    }

    /* renamed from: a */
    public static String m1193a(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 10 || bArr[i] == 13) {
                length = i;
                break;
            }
        }
        return new String(bArr, 0, length);
    }

    /* renamed from: b */
    public static C0790g m1191b(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        Iterator it = gameEngine.networkEngine.f5166bs.iterator();
        while (it.hasNext()) {
            C0790g c0790g = (C0790g) it.next();
            if (str.equals(c0790g.f5371b)) {
                return c0790g;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C0790g m1188c(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        C0790g m1191b = m1191b(str);
        if (m1191b != null) {
            return m1191b;
        }
        C0790g c0790g = new C0790g();
        c0790g.f5371b = str;
        c0790g.f5370a = false;
        c0790g.f5383o = gameEngine.networkEngine.m1365m();
        return c0790g;
    }

    /* renamed from: a */
    public static void m1204a(Runnable runnable) {
        GameEngine.log("LoadFromMasterServer", "Load requested");
        new Thread(new RunnableC0801q(runnable)).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1206a(int i, int i2) {
        C0790g c0790g;
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        synchronized (f5425f) {
            Iterator it = gameEngine.networkEngine.f5166bs.iterator();
            while (it.hasNext()) {
                if (((C0790g) it.next()).f5384p < i) {
                    GameEngine.log("LoadFromMasterServer", i2 + ": Removing stale server with id:" + c0790g.f5371b);
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            ActivityC0123p.m4390l();
        }
    }

    /* renamed from: a */
    public static void m1208a() {
        GameEngine.log("GetOwnInfoRunnable", "getOwnInfoFromMasterServer");
        C0776ao.f5269e = 6;
        new Thread(new RunnableC0800p()).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1198a(List list, String str, String str2) {
        list.add(new BasicNameValuePair(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m1190b(List list) {
        String str;
        GameEngine gameEngine = GameEngine.getInstance();
        m1198a(list, "password_required", CommonUtils.booleanToString(gameEngine.networkEngine.f5104n != null));
        m1198a(list, "created_by", gameEngine.networkEngine.f5110y);
        m1198a(list, "private_ip", gameEngine.networkEngine.m1456ac());
        m1198a(list, "port_number", Integer.toString(gameEngine.networkEngine.f5103m));
        if (gameEngine.networkEngine.f5109u != null) {
            m1198a(list, "game_map", C0670a.m2152n(gameEngine.networkEngine.f5109u));
        } else {
            m1198a(list, "game_map", C0670a.m2152n(gameEngine.networkEngine.setup.mapFileName));
        }
        mapType maptype = gameEngine.networkEngine.setup.currentType;
        if (maptype == null) {
            maptype = mapType.f5220a;
        }
        m1198a(list, "game_mode", maptype.name());
        if (!gameEngine.networkEngine.isChatRoom) {
            if (gameEngine.networkEngine.gameHasStarted) {
                str = "ingame";
            } else if (gameEngine.networkEngine.setup.lockedRoom) {
                str = "locked";
            } else {
                str = "battleroom";
            }
            m1198a(list, "game_status", str);
        } else {
            m1198a(list, "game_status", "chat");
        }
        m1198a(list, "player_count", Integer.toString(gameEngine.networkEngine.m1527A()));
        String num = Integer.toString(Team.playerNumMax);
        if (gameEngine.networkEngine.isChatRoom) {
        }
        m1198a(list, "max_player_count", num);
    }

    /* renamed from: b */
    public static void m1192b() {
        GameEngine.log("StartCreateOnMasterServer", "Create requested");
        C0776ao.f5266b = 5;
        new Thread(new RunnableC0810y()).start();
    }

    /* renamed from: c */
    public static void m1189c() {
        new Thread(new RunnableC0748aa()).start();
    }

    /* renamed from: d */
    public static void m1187d() {
        GameEngine.log("startRemoveOnMasterServer", "Remove requested");
        new Thread(new RunnableC0811z()).start();
    }

    /* renamed from: a */
    public static void startErrorReport(String str, String str2) {
        GameEngine.log("startErrorReport", "ErrorReport requested");
        RunnableC0807v runnableC0807v = new RunnableC0807v();
        runnableC0807v.f5448b = str2;
        runnableC0807v.f5447a = str;
        new Thread(runnableC0807v).start();
    }

    /* renamed from: a */
    public static String m1207a(int i) {
        if (i == 0) {
            return VariableScope.nullOrMissingString;
        }
        if (i > 0) {
            if (i < 100000) {
                return CommonUtils.m1711a(CommonUtils.m1680b("x" + i), 10);
            }
            if (i < 200000) {
                return CommonUtils.m1711a(CommonUtils.m1680b("y" + i), 11);
            }
            if (i < 300000) {
                return CommonUtils.m1711a(CommonUtils.m1680b("z" + i), 12);
            }
            if (i < 1000000) {
                return CommonUtils.m1711a(CommonUtils.m1680b("xx" + i), 13) + "-" + GameEngine.getInstance().networkEngine.m1388g(i - 300000);
            }
            if (i < 2000000) {
                return CommonUtils.m1711a(CommonUtils.m1680b("yy" + i), 14) + "-" + GameEngine.getInstance().networkEngine.m1388g(i - 1000000);
            }
            return "NA";
        }
        return "NA";
    }

    /* renamed from: a */
    public static void m1205a(C0808w c0808w, String str, int i, String str2) {
        GameEngine.PrintLOG("getGameServerInfoFromMasterServer");
        RunnableC0749ab runnableC0749ab = new RunnableC0749ab();
        runnableC0749ab.f5031a = c0808w;
        runnableC0749ab.game_id = str;
        runnableC0749ab.f5033c = i;
        runnableC0749ab.f5034d = str2;
        new Thread(runnableC0749ab).start();
    }
}