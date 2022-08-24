package android.net.http;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* renamed from: android.net.http.a */
/* loaded from: game-lib.jar:android/net/http/a.class */
class C0036a implements HttpRequestInterceptor {

    /* renamed from: a */
    final /* synthetic */ AndroidHttpClient f265a;

    private C0036a(AndroidHttpClient androidHttpClient) {
        this.f265a = androidHttpClient;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        boolean m6402a;
        C0037b m6409a = AndroidHttpClient.m6409a(this.f265a);
        if (m6409a != null) {
            m6402a = m6409a.m6402a();
            if (m6402a && (httpRequest instanceof HttpUriRequest)) {
                m6409a.m6399a(AndroidHttpClient.m6405a((HttpUriRequest) httpRequest, false));
            }
        }
    }
}
