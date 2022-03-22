package android.net.http;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* renamed from: android.net.http.a */
/* loaded from: game-lib.jar:android/net/http/a.class */
class C0036a implements HttpRequestInterceptor {

    /* renamed from: a */
    final /* synthetic */ AndroidHttpClient f262a;

    private C0036a(AndroidHttpClient androidHttpClient) {
        this.f262a = androidHttpClient;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        C0037b bVar;
        boolean a;
        String b;
        bVar = this.f262a.f252f;
        if (bVar != null) {
            a = bVar.m4349a();
            if (a && (httpRequest instanceof HttpUriRequest)) {
                b = AndroidHttpClient.m4350b((HttpUriRequest) httpRequest, false);
                bVar.m4346a(b);
            }
        }
    }
}
