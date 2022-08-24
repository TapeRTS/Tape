package com.corrodinggames.rts.gameFramework.p041i;

import android.net.http.AndroidHttpClient;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.corrodinggames.rts.gameFramework.i.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/r.class */
public class C0885r {

    /* renamed from: a */
    ReentrantLock f5883a = new ReentrantLock();

    /* renamed from: a */
    public HttpClient m1405a() {
        return m1404a(30000, false);
    }

    /* renamed from: b */
    public HttpClient m1402b() {
        return m1404a(30000, true);
    }

    /* renamed from: a */
    public HttpClient m1404a(int i, boolean z) {
        DefaultHttpClient defaultHttpClient;
        boolean z2 = false;
        try {
            z2 = this.f5883a.tryLock(300L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!z2) {
            try {
                GameEngine.m1138b("LoadFromMasterServer", "Could not get getNewHttpClient lock! another thread maybe stuck in getNewHttpClient!");
            } catch (Throwable th) {
                if (z2) {
                    this.f5883a.unlock();
                }
                throw th;
            }
        }
        if (!z) {
            defaultHttpClient = AndroidHttpClient.m6408a((String) null);
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpParams params = defaultHttpClient.getParams();
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, 20000);
        if (z2) {
            this.f5883a.unlock();
        }
        return defaultHttpClient;
    }

    /* renamed from: a */
    public void m1403a(HttpClient httpClient) {
        if (httpClient instanceof AndroidHttpClient) {
            ((AndroidHttpClient) httpClient).m6410a();
        }
    }
}
