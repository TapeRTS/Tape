package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0885r;
import java.io.IOException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/* renamed from: com.corrodinggames.rts.java.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/k.class */
public class C1181k extends C0885r {
    /* renamed from: a */
    public HttpClient m102a(int i, boolean z) {
        RequestConfig.Builder connectionRequestTimeout = RequestConfig.custom().setConnectTimeout(i).setConnectionRequestTimeout(i);
        HttpClientBuilder create = HttpClientBuilder.create();
        create.setDefaultRequestConfig(connectionRequestTimeout.build());
        return create.build();
    }

    /* renamed from: a */
    public void m101a(HttpClient httpClient) {
        if (httpClient instanceof CloseableHttpClient) {
            try {
                ((CloseableHttpClient) httpClient).close();
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        GameEngine.PrintLog("closeHttpClient: Didn't close");
    }
}
