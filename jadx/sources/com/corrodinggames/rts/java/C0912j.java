package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.p036g.C0716r;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;

/* renamed from: com.corrodinggames.rts.java.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/j.class */
public class C0912j extends C0716r {
    @Override // com.corrodinggames.rts.gameFramework.p036g.C0716r
    /* renamed from: a */
    public HttpClient mo100a(int i, boolean z) {
        RequestConfig.Builder connectionRequestTimeout = RequestConfig.custom().setConnectTimeout(i).setConnectionRequestTimeout(i);
        HttpClientBuilder create = HttpClientBuilder.create();
        create.setDefaultRequestConfig(connectionRequestTimeout.build());
        return create.build();
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0716r
    /* renamed from: a */
    public void mo99a(HttpClient httpClient) {
    }
}
