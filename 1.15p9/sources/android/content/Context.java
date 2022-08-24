package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/Context.class */
public abstract class Context {
    /* renamed from: d */
    public abstract AssetManager mo6586d();

    /* renamed from: e */
    public abstract Resources mo6585e();

    /* renamed from: f */
    public abstract PackageManager mo6584f();

    /* renamed from: g */
    public abstract Context mo6583g();

    /* renamed from: h */
    public abstract String mo6582h();

    /* renamed from: a */
    public abstract SharedPreferences mo6590a(String str, int i);

    /* renamed from: a */
    public abstract FileInputStream mo6591a(String str);

    /* renamed from: b */
    public abstract FileOutputStream mo6588b(String str, int i);

    /* renamed from: b */
    public abstract File mo6589b(String str);

    /* renamed from: i */
    public abstract File mo6581i();

    /* renamed from: j */
    public abstract File mo6580j();

    /* renamed from: a */
    public abstract void mo6592a(Intent intent);

    /* renamed from: c */
    public abstract Object mo6587c(String str);
}
