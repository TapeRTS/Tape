package android.app;

import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import java.util.ArrayList;

/* loaded from: game-lib.jar:android/app/Application.class */
public class Application extends ContextWrapper implements ComponentCallbacks2 {

    /* renamed from: b */
    private ArrayList f112b;

    /* renamed from: c */
    private ArrayList f113c;

    /* renamed from: d */
    private ArrayList f114d;

    /* loaded from: game-lib.jar:android/app/Application$ActivityLifecycleCallbacks.class */
    public interface ActivityLifecycleCallbacks {
    }

    /* loaded from: game-lib.jar:android/app/Application$OnProvideAssistDataListener.class */
    public interface OnProvideAssistDataListener {
    }

    public Application() {
        super(null);
        this.f112b = new ArrayList();
        this.f113c = new ArrayList();
        this.f114d = null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] m6594a = m6594a();
        if (m6594a != null) {
            for (Object obj : m6594a) {
                ((ComponentCallbacks) obj).onConfigurationChanged(configuration);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        Object[] m6594a = m6594a();
        if (m6594a != null) {
            for (Object obj : m6594a) {
                ((ComponentCallbacks) obj).onLowMemory();
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Object[] m6594a = m6594a();
        if (m6594a != null) {
            for (Object obj : m6594a) {
                if (obj instanceof ComponentCallbacks2) {
                    ((ComponentCallbacks2) obj).onTrimMemory(i);
                }
            }
        }
    }

    /* renamed from: a */
    private Object[] m6594a() {
        Object[] objArr = null;
        synchronized (this.f112b) {
            if (this.f112b.size() > 0) {
                objArr = this.f112b.toArray();
            }
        }
        return objArr;
    }
}
