package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
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
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.i.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/n.class */
public class C0879n {

    /* renamed from: e */
    static int f5867e;

    /* renamed from: g */
    public static String f5868g;

    /* renamed from: a */
    public static boolean f5869a = true;

    /* renamed from: b */
    public static boolean f5870b = true;

    /* renamed from: c */
    public static String[] f5871c = {"http://gs1.corrodinggames.com/masterserver/1.4", "http://gs4.corrodinggames.net/masterserver/1.4"};

    /* renamed from: d */
    public static C0885r f5872d = new C0885r();

    /* renamed from: f */
    public static Object f5873f = new Object();

    /* renamed from: a */
    public static void m1429a(String str) {
        if (f5870b) {
            GameEngine.PrintLog(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1422a(List list, boolean z, AbstractC0886s abstractC0886s) {
        m1421a(list, z, abstractC0886s, f5871c);
    }

    /* renamed from: a */
    static void m1421a(List list, boolean z, AbstractC0886s abstractC0886s, String[] strArr) {
        abstractC0886s.f5886f = strArr.length;
        int i = 0;
        for (String str : strArr) {
            i++;
            new Thread(new RunnableC0888u(list, abstractC0886s, str, z, i)).start();
            if (f5869a) {
                GameEngine.m1144b("LoadFromMasterServer", i + ": Started RequestsParallelRunnable thread");
            }
        }
    }

    /* renamed from: a */
    public static String m1425a(List list, String str) {
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
    public static BufferedReader m1427a(List list) {
        return m1420a(list, true, f5871c, 10, true);
    }

    /* renamed from: a */
    public static BufferedReader m1426a(List list, int i) {
        return m1420a(list, true, f5871c, i, true);
    }

    /* renamed from: a */
    public static BufferedReader m1420a(List list, boolean z, String[] strArr, int i, boolean z2) {
        Future poll;
        String m1425a = m1425a(list, "action");
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(strArr.length);
        try {
            ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add(executorCompletionService.submit(new CallableC08801(str, list, z, z2)));
            }
            int length = strArr.length;
            C0887t c0887t = null;
            C0887t c0887t2 = null;
            C0887t c0887t3 = null;
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
                    GameEngine.m1145b("MULTI_MASTERSERVERS: poll timed out (" + m1425a + ")");
                    break;
                }
                C0887t c0887t4 = (C0887t) poll.get();
                if (c0887t4 != null) {
                    c0887t = c0887t4;
                    if (c0887t4.f5888b) {
                        if (c0887t4.f5889c) {
                            c0887t3 = c0887t4;
                        } else {
                            c0887t2 = c0887t4;
                            break;
                        }
                    }
                }
                i2++;
            }
            if (c0887t2 == null && c0887t3 != null) {
                GameEngine.m1145b("All masterserver results included an error message (" + m1425a + ")");
                c0887t2 = c0887t3;
            }
            if (c0887t2 == null) {
                GameEngine.m1145b("No valid result found on any masterserver (" + m1425a + ")");
                c0887t2 = c0887t;
            }
            if (c0887t2 != null) {
                BufferedReader bufferedReader = c0887t2.f5887a;
                newFixedThreadPool.shutdown();
                return bufferedReader;
            }
            throw new IOException("No results found (" + m1425a + ")");
        } catch (Throwable th) {
            newFixedThreadPool.shutdown();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.n$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/n$1.class */
    public final class CallableC08801 implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f5874a;

        /* renamed from: b */
        final /* synthetic */ List f5875b;

        /* renamed from: c */
        final /* synthetic */ boolean f5876c;

        /* renamed from: d */
        final /* synthetic */ boolean f5877d;

        CallableC08801(String str, List list, boolean z, boolean z2) {
            this.f5874a = str;
            this.f5875b = list;
            this.f5876c = z;
            this.f5877d = z2;
        }

        /* renamed from: a */
        public C0887t mo5338call() {
            try {
                C0879n.m1429a("Running doSingleRequest:" + this.f5874a);
                return C0879n.m1423a(this.f5875b, this.f5874a, this.f5876c);
            } catch (Exception e) {
                GameEngine.PrintLog("Error on doSingleRequest:" + this.f5874a + " - " + e.getMessage());
                if (this.f5877d) {
                    e.printStackTrace();
                    return null;
                }
                return null;
            }
        }
    }

    /* renamed from: a */
    public static C0887t m1423a(List list, String str, boolean z) {
        HttpGet httpGet;
        String str2;
        GameEngine gameEngine;
        HttpResponse execute;
        String m1425a = m1425a(list, "action");
        long m2612a = C0727bl.m2612a();
        String str3 = str + "/interface";
        if (z) {
            HttpGet httpPost = new HttpPost(str3);
            httpPost.setEntity(new UrlEncodedFormEntity(list));
            httpGet = httpPost;
        } else {
            str3 = str3 + "?" + URLEncodedUtils.format(list, "utf-8");
            httpGet = new HttpGet(str3);
        }
        if (GameEngine.m1155aw()) {
            str2 = "rw server";
        } else {
            str2 = "rw " + (GameEngine.m1157au() ? "pc" : "android");
        }
        String m1883c = C0820a.m1883c();
        if (GameEngine.getInstance() != null) {
            str2 = str2 + " " + gameEngine.m1135c(true) + " " + m1883c;
        }
        httpGet.setHeader("User-Agent", str2);
        httpGet.setHeader("Language", m1883c);
        HttpClient m1411a = f5872d.m1411a();
        try {
            execute = m1411a.execute(httpGet);
        } catch (NullPointerException e) {
            GameEngine.m1145b("doRequest: httpclient.execute threw NullPointerException, running workaround");
            m1411a = f5872d.m1408b();
            execute = m1411a.execute(httpGet);
        }
        float m2610a = C0727bl.m2610a(m2612a);
        HttpEntity entity = execute.getEntity();
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
        C0887t c0887t = new C0887t();
        String m1419a = m1419a(byteArray);
        c0887t.f5888b = m1419a.startsWith("CORRODINGGAMES");
        c0887t.f5889c = m1419a.contains("[FAILED]");
        if (!c0887t.f5888b || c0887t.f5889c) {
            String str4 = str3 + (m1425a != null ? "?action=" + m1425a : VariableScope.nullOrMissingString) + " (" + m2610a + "ms)";
            if (!"list".equals(m1425a)) {
                str4 = str4 + ":\n" + new String(byteArray);
            }
            GameEngine.PrintLog(str4);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
        f5872d.m1409a(m1411a);
        c0887t.f5887a = bufferedReader;
        return c0887t;
    }

    /* renamed from: a */
    public static String m1419a(byte[] bArr) {
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
    public static C0872g m1417b(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        Iterator it = gameEngine.networkEngine.f5608by.iterator();
        while (it.hasNext()) {
            C0872g c0872g = (C0872g) it.next();
            if (str.equals(c0872g.f5818b)) {
                return c0872g;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C0872g m1414c(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        C0872g m1417b = m1417b(str);
        if (m1417b != null) {
            return m1417b;
        }
        C0872g c0872g = new C0872g();
        c0872g.f5818b = str;
        c0872g.f5817a = false;
        c0872g.f5830o = gameEngine.networkEngine.m1623p();
        return c0872g;
    }

    /* renamed from: a */
    public static void m1430a(Runnable runnable) {
        GameEngine.m1144b("LoadFromMasterServer", "Load requested");
        new Thread(new RunnableC0883q(runnable)).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1432a(int i, int i2) {
        C0872g c0872g;
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        synchronized (f5873f) {
            Iterator it = gameEngine.networkEngine.f5608by.iterator();
            while (it.hasNext()) {
                if (((C0872g) it.next()).f5831p < i) {
                    GameEngine.m1144b("LoadFromMasterServer", i2 + ": Removing stale server with id:" + c0872g.f5818b);
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            ActivityC0129p.m6904l();
        }
    }

    /* renamed from: a */
    public static void m1434a() {
        GameEngine.m1144b("GetOwnInfoRunnable", "getOwnInfoFromMasterServer");
        C0857ap.f5715e = 6;
        new Thread(new RunnableC0882p()).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1424a(List list, String str, String str2) {
        list.add(new BasicNameValuePair(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m1416b(List list) {
        String str;
        GameEngine gameEngine = GameEngine.getInstance();
        m1424a(list, "password_required", CommonUtils.m2325a(gameEngine.networkEngine.f5475n != null));
        m1424a(list, "created_by", gameEngine.networkEngine.f5481y);
        m1424a(list, "private_ip", gameEngine.networkEngine.m1721ah());
        m1424a(list, "port_number", Integer.toString(gameEngine.networkEngine.f5474m));
        if (gameEngine.networkEngine.f5480u != null) {
            m1424a(list, "game_map", C0750a.m2437n(gameEngine.networkEngine.f5480u));
        } else {
            m1424a(list, "game_map", C0750a.m2437n(gameEngine.networkEngine.f5597aO.f5649b));
        }
        EnumC0846ai enumC0846ai = gameEngine.networkEngine.f5597aO.f5648a;
        if (enumC0846ai == null) {
            enumC0846ai = EnumC0846ai.f5663a;
        }
        m1424a(list, "game_mode", enumC0846ai.name());
        if (!gameEngine.networkEngine.f5560v) {
            if (gameEngine.networkEngine.f5533bm) {
                str = "ingame";
            } else if (gameEngine.networkEngine.f5597aO.f5662p) {
                str = "locked";
            } else {
                str = "battleroom";
            }
            m1424a(list, "game_status", str);
        } else {
            m1424a(list, "game_status", "chat");
        }
        m1424a(list, "player_count", Integer.toString(gameEngine.networkEngine.m1799D()));
        String num = Integer.toString(Team.f1364c);
        if (gameEngine.networkEngine.f5560v) {
        }
        m1424a(list, "max_player_count", num);
    }

    /* renamed from: b */
    public static void m1418b() {
        GameEngine.m1144b("StartCreateOnMasterServer", "Create requested");
        C0857ap.f5712b = 5;
        new Thread(new RunnableC0892y()).start();
    }

    /* renamed from: c */
    public static void m1415c() {
        new Thread(new RunnableC0828aa()).start();
    }

    /* renamed from: d */
    public static void m1413d() {
        GameEngine.m1144b("startRemoveOnMasterServer", "Remove requested");
        new Thread(new RunnableC0893z()).start();
    }

    /* renamed from: a */
    public static void m1428a(String str, String str2) {
        GameEngine.m1144b("startErrorReport", "ErrorReport requested");
        RunnableC0889v runnableC0889v = new RunnableC0889v();
        runnableC0889v.f5896b = str2;
        runnableC0889v.f5895a = str;
        new Thread(runnableC0889v).start();
    }

    /* renamed from: a */
    public static String m1433a(int i) {
        if (i == 0) {
            return VariableScope.nullOrMissingString;
        }
        if (i > 0) {
            if (i < 100000) {
                return CommonUtils.m2334a(CommonUtils.m2303b("x" + i), 10);
            }
            if (i < 200000) {
                return CommonUtils.m2334a(CommonUtils.m2303b("y" + i), 11);
            }
            if (i < 300000) {
                return CommonUtils.m2334a(CommonUtils.m2303b("z" + i), 12);
            }
            if (i < 1000000) {
                return CommonUtils.m2334a(CommonUtils.m2303b("xx" + i), 13) + "-" + GameEngine.getInstance().networkEngine.m1652g(i - 300000);
            }
            if (i < 2000000) {
                return CommonUtils.m2334a(CommonUtils.m2303b("yy" + i), 14) + "-" + GameEngine.getInstance().networkEngine.m1652g(i - 1000000);
            }
            return "NA";
        }
        return "NA";
    }

    /* renamed from: a */
    public static void m1431a(C0890w c0890w, String str, int i, String str2) {
        GameEngine.PrintLog("getGameServerInfoFromMasterServer");
        RunnableC0829ab runnableC0829ab = new RunnableC0829ab();
        runnableC0829ab.f5465a = c0890w;
        runnableC0829ab.f5466b = str;
        runnableC0829ab.f5467c = i;
        runnableC0829ab.f5468d = str2;
        new Thread(runnableC0829ab).start();
    }
}
