package android.app;

import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import java.util.ArrayList;

/* loaded from: game-lib.jar:android/app/Application.class */
public class Application extends ContextWrapper implements ComponentCallbacks2 {

    /* renamed from: b */
    private ArrayList f113b = new ArrayList();

    /* renamed from: c */
    private ArrayList f114c = new ArrayList();

    /* renamed from: d */
    private ArrayList f115d = null;

    /* loaded from: game-lib.jar:android/app/Application$ActivityLifecycleCallbacks.class */
    public interface ActivityLifecycleCallbacks {
    }

    /* loaded from: game-lib.jar:android/app/Application$OnProvideAssistDataListener.class */
    public interface OnProvideAssistDataListener {
    }

    public Application() {
        super(null);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] a = m4543a();
        if (a != null) {
            for (Object obj : a) {
                ((ComponentCallbacks) obj).onConfigurationChanged(configuration);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        Object[] a = m4543a();
        if (a != null) {
            for (Object obj : a) {
                ((ComponentCallbacks) obj).onLowMemory();
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Object[] a = m4543a();
        if (a != null) {
            for (Object obj : a) {
                if (obj instanceof ComponentCallbacks2) {
                    ((ComponentCallbacks2) obj).onTrimMemory(i);
                }
            }
        }
    }

    /* renamed from: a */
    private Object[] m4543a() {
        Object[] objArr = null;
        synchronized (this.f113b) {
            if (this.f113b.size() > 0) {
                objArr = this.f113b.toArray();
            }
        }
        return objArr;
    }
}
