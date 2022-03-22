package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/ContextWrapper.class */
public class ContextWrapper extends Context {

    /* renamed from: a */
    Context f116a;

    public ContextWrapper(Context context) {
        this.f116a = context;
    }

    /* renamed from: i */
    public Context m4542i() {
        return this.f116a;
    }

    @Override // android.content.Context
    /* renamed from: d */
    public AssetManager mo4536d() {
        return this.f116a.mo4536d();
    }

    @Override // android.content.Context
    /* renamed from: e */
    public Resources mo4535e() {
        return this.f116a.mo4535e();
    }

    @Override // android.content.Context
    /* renamed from: f */
    public PackageManager mo4534f() {
        return this.f116a.mo4534f();
    }

    @Override // android.content.Context
    /* renamed from: g */
    public Context mo4533g() {
        return this.f116a.mo4533g();
    }

    @Override // android.content.Context
    /* renamed from: h */
    public String mo4532h() {
        return this.f116a.mo4532h();
    }

    @Override // android.content.Context
    /* renamed from: a */
    public SharedPreferences mo4539a(String str, int i) {
        return this.f116a.mo4539a(str, i);
    }

    @Override // android.content.Context
    /* renamed from: a */
    public FileInputStream mo4540a(String str) {
        return this.f116a.mo4540a(str);
    }

    @Override // android.content.Context
    /* renamed from: b */
    public FileOutputStream mo4537b(String str, int i) {
        return this.f116a.mo4537b(str, i);
    }

    @Override // android.content.Context
    /* renamed from: a */
    public void mo4541a(Intent intent) {
        this.f116a.mo4541a(intent);
    }

    @Override // android.content.Context
    /* renamed from: b */
    public Object mo4538b(String str) {
        return this.f116a.mo4538b(str);
    }
}
