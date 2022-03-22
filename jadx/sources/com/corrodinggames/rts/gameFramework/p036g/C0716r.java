package com.corrodinggames.rts.gameFramework.p036g;

import android.net.http.AndroidHttpClient;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.corrodinggames.rts.gameFramework.g.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/r.class */
public class C0716r {

    /* renamed from: a */
    ReentrantLock f5029a = new ReentrantLock();

    /* renamed from: a */
    public HttpClient m1022a() {
        return mo100a(30000, false);
    }

    /* renamed from: b */
    public HttpClient m1021b() {
        return mo100a(30000, true);
    }

    /* renamed from: a */
    public HttpClient mo100a(int i, boolean z) {
        AndroidHttpClient androidHttpClient;
        boolean z2 = false;
        try {
            z2 = this.f5029a.tryLock(300L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!z2) {
            try {
                AbstractC0789l.m681b("LoadFromMasterServer", "Could not get getNewHttpClient lock! another thread maybe stuck in getNewHttpClient!");
            } catch (Throwable th) {
                if (z2) {
                    this.f5029a.unlock();
                }
                throw th;
            }
        }
        if (!z) {
            androidHttpClient = AndroidHttpClient.m4096a((String) null);
        } else {
            androidHttpClient = new DefaultHttpClient();
        }
        HttpParams params = androidHttpClient.getParams();
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, 20000);
        if (z2) {
            this.f5029a.unlock();
        }
        return androidHttpClient;
    }

    /* renamed from: a */
    public void mo99a(HttpClient httpClient) {
        if (httpClient instanceof AndroidHttpClient) {
            ((AndroidHttpClient) httpClient).m4098a();
        }
    }
}
