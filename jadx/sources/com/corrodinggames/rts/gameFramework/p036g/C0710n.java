package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.p008a.ActivityC0098n;
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

/* renamed from: com.corrodinggames.rts.gameFramework.g.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/n.class */
public class C0710n {

    /* renamed from: c */
    static int f5017c;

    /* renamed from: a */
    public static final String[] f5018a = {"http://gs1.corrodinggames.com/masterserver/1.4", "http://gs4.corrodinggames.net/masterserver/1.4"};

    /* renamed from: b */
    public static C0716r f5019b = new C0716r();

    /* renamed from: d */
    public static Object f5020d = new Object();

    /* renamed from: a */
    static void m1046a(List list, boolean z, AbstractC0717s sVar) {
        m1045a(list, z, sVar, f5018a);
    }

    /* renamed from: a */
    static void m1045a(List list, boolean z, AbstractC0717s sVar, String[] strArr) {
        sVar.f5032f = strArr.length;
        int i = 0;
        for (String str : strArr) {
            i++;
            new Thread(new RunnableC0719u(list, sVar, str, z, i)).start();
            AbstractC0789l.m694b("LoadFromMasterServer", i + ": Started RequestsParallelRunnable thread");
        }
    }

    /* renamed from: a */
    public static String m1049a(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NameValuePair nameValuePair = (NameValuePair) it.next();
            if (str.equals(nameValuePair.getName())) {
                return nameValuePair.getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static BufferedReader m1051a(List list) {
        return m1044a(list, true, f5018a, 10);
    }

    /* renamed from: a */
    public static BufferedReader m1050a(List list, int i) {
        return m1044a(list, true, f5018a, i);
    }

    /* renamed from: a */
    public static BufferedReader m1044a(final List list, final boolean z, String[] strArr, int i) {
        Future poll;
        String a = m1049a(list, "action");
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(strArr.length);
        try {
            ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
            ArrayList arrayList = new ArrayList();
            for (final String str : strArr) {
                arrayList.add(executorCompletionService.submit(new Callable() { // from class: com.corrodinggames.rts.gameFramework.g.n.1
                    /* renamed from: a */
                    public C0718t call() {
                        try {
                            AbstractC0789l.m683d("Running doSingleRequest:" + str);
                            return C0710n.m1047a(list, str, z);
                        } catch (Exception e) {
                            AbstractC0789l.m683d("Error on doSingleRequest:" + str);
                            e.printStackTrace();
                            return null;
                        }
                    }
                }));
            }
            int length = strArr.length;
            C0718t tVar = null;
            C0718t tVar2 = null;
            C0718t tVar3 = null;
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
                    AbstractC0789l.m695b("MULTI_MASTERSERVERS: poll timed out (" + a + ")");
                    break;
                }
                C0718t tVar4 = (C0718t) poll.get();
                if (tVar4 != null) {
                    tVar = tVar4;
                    if (tVar4.f5034b) {
                        if (!tVar4.f5035c) {
                            tVar2 = tVar4;
                            break;
                        }
                        tVar3 = tVar4;
                    }
                }
                i2++;
            }
            if (tVar2 == null && tVar3 != null) {
                AbstractC0789l.m695b("All masterserver results included an error message (" + a + ")");
                tVar2 = tVar3;
            }
            if (tVar2 == null) {
                AbstractC0789l.m695b("No valid result found on any masterserver (" + a + ")");
                tVar2 = tVar;
            }
            if (tVar2 != null) {
                BufferedReader bufferedReader = tVar2.f5033a;
                newFixedThreadPool.shutdown();
                return bufferedReader;
            }
            throw new IOException("No results found (" + a + ")");
        } catch (Throwable th) {
            newFixedThreadPool.shutdown();
            throw th;
        }
    }

    /* renamed from: a */
    public static C0718t m1047a(List list, String str, boolean z) {
        HttpUriRequest httpUriRequest;
        String str2;
        HttpResponse httpResponse;
        String a = m1049a(list, "action");
        long a2 = C0586bj.m1962a();
        String str3 = str + "/interface";
        AbstractC0789l u = AbstractC0789l.m651u();
        if (z) {
            HttpUriRequest httpPost = new HttpPost(str3);
            httpPost.setEntity(new UrlEncodedFormEntity(list));
            httpUriRequest = httpPost;
        } else {
            str3 = str3 + "?" + URLEncodedUtils.format(list, "utf-8");
            httpUriRequest = new HttpGet(str3);
        }
        if (AbstractC0789l.m708an()) {
            str2 = "rw server";
        } else {
            str2 = "rw " + (AbstractC0789l.m710al() ? "pc" : "android");
        }
        String c = C0652a.m1574c();
        httpUriRequest.setHeader("User-Agent", str2 + " " + u.mo686c(true) + " " + c);
        httpUriRequest.setHeader("Language", c);
        HttpClient a3 = f5019b.m1036a();
        try {
            httpResponse = a3.execute(httpUriRequest);
        } catch (NullPointerException e) {
            AbstractC0789l.m695b("doRequest: httpclient.execute threw NullPointerException, running workaround");
            a3 = f5019b.m1035b();
            httpResponse = a3.execute(httpUriRequest);
        }
        float a4 = C0586bj.m1960a(a2);
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
        C0718t tVar = new C0718t();
        String a5 = m1043a(byteArray);
        tVar.f5034b = a5.startsWith("CORRODINGGAMES");
        tVar.f5035c = a5.contains("[FAILED]");
        if (!tVar.f5034b || tVar.f5035c) {
            String str4 = str3 + (a != null ? "?action=" + a : "") + " (" + a4 + "ms)";
            if (!"list".equals(a)) {
                str4 = str4 + ":\n" + new String(byteArray);
            }
            AbstractC0789l.m683d(str4);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
        f5019b.mo99a(a3);
        tVar.f5033a = bufferedReader;
        return tVar;
    }

    /* renamed from: a */
    public static String m1043a(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 10 || bArr[i] == 13) {
                length = i;
                break;
            }
        }
        return new String(bArr, 0, length);
    }

    /* renamed from: a */
    public static C0703g m1053a(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        Iterator it = u.f5486bF.f4772bm.iterator();
        while (it.hasNext()) {
            C0703g gVar = (C0703g) it.next();
            if (str.equals(gVar.f4969b)) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C0703g m1041b(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        C0703g a = m1053a(str);
        if (a != null) {
            return a;
        }
        C0703g gVar = new C0703g();
        gVar.f4969b = str;
        gVar.f4968a = false;
        gVar.f4980n = u.f5486bF.m1240l();
        return gVar;
    }

    /* renamed from: a */
    public static void m1054a(Runnable runnable) {
        AbstractC0789l.m694b("LoadFromMasterServer", "Load requested");
        new Thread(new RunnableC0714q(runnable)).start();
    }

    /* renamed from: a */
    static void m1056a(int i, int i2) {
        C0703g gVar;
        AbstractC0789l u = AbstractC0789l.m651u();
        boolean z = false;
        synchronized (f5020d) {
            Iterator it = u.f5486bF.f4772bm.iterator();
            while (it.hasNext()) {
                if (((C0703g) it.next()).f4981o < i) {
                    AbstractC0789l.m694b("LoadFromMasterServer", i2 + ": Removing stale server with id:" + gVar.f4969b);
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            ActivityC0098n.m4169j();
        }
    }

    /* renamed from: a */
    public static void m1058a() {
        AbstractC0789l.m694b("GetOwnInfoRunnable", "getOwnInfoFromMasterServer");
        C0689ao.f4873e = 6;
        new Thread(new RunnableC0713p()).start();
    }

    /* renamed from: a */
    static void m1048a(List list, String str, String str2) {
        list.add(new BasicNameValuePair(str, str2));
    }

    /* renamed from: b */
    static void m1040b(List list) {
        String str;
        AbstractC0789l u = AbstractC0789l.m651u();
        m1048a(list, "password_required", C0654f.m1524a(u.f5486bF.f4654m != null));
        m1048a(list, "created_by", u.f5486bF.f4660w);
        m1048a(list, "private_ip", u.f5486bF.m1367Y());
        m1048a(list, "port_number", Integer.toString(u.f5486bF.f4653l));
        if (u.f5486bF.f4659s != null) {
            m1048a(list, "game_map", u.f5486bF.f4659s);
        } else {
            m1048a(list, "game_map", u.f5486bF.f4763aH.f4811b);
        }
        EnumC0679ai aiVar = u.f5486bF.f4763aH.f4810a;
        if (aiVar == null) {
            aiVar = EnumC0679ai.f4824a;
        }
        m1048a(list, "game_mode", aiVar.name());
        if (!u.f5486bF.f4730t) {
            if (u.f5486bF.isGameStart_Hcat) {
                str = "ingame";
            } else if (u.f5486bF.f4763aH.f4823o) {
                str = "locked";
            } else {
                str = "battleroom";
            }
            m1048a(list, "game_status", str);
        } else {
            m1048a(list, "game_status", "chat");
        }
        m1048a(list, "player_count", Integer.toString(u.f5486bF.m1224x()));
        String num = Integer.toString(AbstractC0171m.f1275a);
        if (u.f5486bF.f4730t) {
        }
        m1048a(list, "max_player_count", num);
    }

    /* renamed from: b */
    public static void m1042b() {
        AbstractC0789l.m694b("StartCreateOnMasterServer", "Create requested");
        C0689ao.f4870b = 5;
        new Thread(new RunnableC0723y()).start();
    }

    /* renamed from: c */
    public static void m1039c() {
        new Thread(new RunnableC0661aa()).start();
    }

    /* renamed from: d */
    public static void m1038d() {
        AbstractC0789l.m694b("startRemoveOnMasterServer", "Remove requested");
        new Thread(new RunnableC0724z()).start();
    }

    /* renamed from: a */
    public static void m1052a(String str, String str2) {
        AbstractC0789l.m694b("startErrorReport", "ErrorReport requested");
        RunnableC0720v vVar = new RunnableC0720v();
        vVar.f5042b = str2;
        vVar.f5041a = str;
        new Thread(vVar).start();
    }

    /* renamed from: a */
    public static String m1057a(int i) {
        if (i == 0) {
            return "";
        }
        if (i <= 0) {
            return "NA";
        }
        if (i < 100000) {
            return C0654f.m1529a(C0654f.m1506b("x" + i), 10);
        }
        if (i < 200000) {
            return C0654f.m1529a(C0654f.m1506b("y" + i), 11);
        }
        if (i < 300000) {
            return C0654f.m1529a(C0654f.m1506b("z" + i), 12);
        }
        if (i < 1000000) {
            return C0654f.m1529a(C0654f.m1506b("xx" + i), 13) + "-" + AbstractC0789l.m651u().f5486bF.m1263f(i - 300000);
        }
        if (i < 2000000) {
            return C0654f.m1529a(C0654f.m1506b("yy" + i), 14) + "-" + AbstractC0789l.m651u().f5486bF.m1263f(i - 1000000);
        }
        return "NA";
    }

    /* renamed from: a */
    public static void m1055a(C0721w wVar, String str, int i, String str2) {
        AbstractC0789l.m683d("getGameServerInfoFromMasterServer");
        RunnableC0662ab abVar = new RunnableC0662ab();
        abVar.f4644a = wVar;
        abVar.f4645b = str;
        abVar.f4646c = i;
        abVar.f4647d = str2;
        new Thread(abVar).start();
    }
}
