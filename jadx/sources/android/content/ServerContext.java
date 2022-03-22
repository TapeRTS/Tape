package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/ServerContext.class */
public class ServerContext extends Context {

    /* renamed from: a */
    AssetManager f117a = new AssetManager();

    @Override // android.content.Context
    /* renamed from: d */
    public AssetManager mo4536d() {
        return this.f117a;
    }

    @Override // android.content.Context
    /* renamed from: e */
    public Resources mo4535e() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: f */
    public PackageManager mo4534f() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: g */
    public Context mo4533g() {
        return this;
    }

    @Override // android.content.Context
    /* renamed from: h */
    public String mo4532h() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public SharedPreferences mo4539a(String str, int i) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public FileInputStream mo4540a(String str) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: b */
    public FileOutputStream mo4537b(String str, int i) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public void mo4541a(Intent intent) {
    }

    @Override // android.content.Context
    /* renamed from: b */
    public Object mo4538b(String str) {
        return null;
    }
}
