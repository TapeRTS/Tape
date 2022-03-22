package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/Context.class */
public abstract class Context {
    /* renamed from: d */
    public abstract AssetManager mo4277d();

    /* renamed from: e */
    public abstract Resources mo4276e();

    /* renamed from: f */
    public abstract PackageManager mo4275f();

    /* renamed from: g */
    public abstract Context mo4274g();

    /* renamed from: h */
    public abstract String mo4273h();

    /* renamed from: a */
    public abstract SharedPreferences mo4280a(String str, int i);

    /* renamed from: a */
    public abstract FileInputStream mo4281a(String str);

    /* renamed from: b */
    public abstract FileOutputStream mo4278b(String str, int i);

    /* renamed from: a */
    public abstract void mo4282a(Intent intent);

    /* renamed from: b */
    public abstract Object mo4279b(String str);
}
