package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/ServerContext.class */
public class ServerContext extends Context {

    /* renamed from: a */
    AssetManager f116a = new AssetManager();

    @Override // android.content.Context
    /* renamed from: d */
    public AssetManager mo6586d() {
        return this.f116a;
    }

    @Override // android.content.Context
    /* renamed from: e */
    public Resources mo6585e() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: f */
    public PackageManager mo6584f() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: g */
    public Context mo6583g() {
        return this;
    }

    @Override // android.content.Context
    /* renamed from: h */
    public String mo6582h() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public SharedPreferences mo6590a(String str, int i) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public FileInputStream mo6591a(String str) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: b */
    public FileOutputStream mo6588b(String str, int i) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: b */
    public File mo6589b(String str) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: i */
    public File mo6581i() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: j */
    public File mo6580j() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public void mo6592a(Intent intent) {
    }

    @Override // android.content.Context
    /* renamed from: c */
    public Object mo6587c(String str) {
        return null;
    }
}
