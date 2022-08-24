package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/ContextWrapper.class */
public class ContextWrapper extends Context {

    /* renamed from: a */
    Context f115a;

    public ContextWrapper(Context context) {
        this.f115a = context;
    }

    /* renamed from: k */
    public Context m6593k() {
        return this.f115a;
    }

    @Override // android.content.Context
    /* renamed from: d */
    public AssetManager mo6586d() {
        return this.f115a.mo6586d();
    }

    @Override // android.content.Context
    /* renamed from: e */
    public Resources mo6585e() {
        return this.f115a.mo6585e();
    }

    @Override // android.content.Context
    /* renamed from: f */
    public PackageManager mo6584f() {
        return this.f115a.mo6584f();
    }

    @Override // android.content.Context
    /* renamed from: g */
    public Context mo6583g() {
        return this.f115a.mo6583g();
    }

    @Override // android.content.Context
    /* renamed from: h */
    public String mo6582h() {
        return this.f115a.mo6582h();
    }

    @Override // android.content.Context
    /* renamed from: a */
    public SharedPreferences mo6590a(String str, int i) {
        return this.f115a.mo6590a(str, i);
    }

    @Override // android.content.Context
    /* renamed from: a */
    public FileInputStream mo6591a(String str) {
        return this.f115a.mo6591a(str);
    }

    @Override // android.content.Context
    /* renamed from: b */
    public FileOutputStream mo6588b(String str, int i) {
        return this.f115a.mo6588b(str, i);
    }

    @Override // android.content.Context
    /* renamed from: b */
    public File mo6589b(String str) {
        return this.f115a.mo6589b(str);
    }

    @Override // android.content.Context
    /* renamed from: i */
    public File mo6581i() {
        return this.f115a.mo6581i();
    }

    @Override // android.content.Context
    /* renamed from: j */
    public File mo6580j() {
        return this.f115a.mo6580j();
    }

    @Override // android.content.Context
    /* renamed from: a */
    public void mo6592a(Intent intent) {
        this.f115a.mo6592a(intent);
    }

    @Override // android.content.Context
    /* renamed from: c */
    public Object mo6587c(String str) {
        return this.f115a.mo6587c(str);
    }
}
