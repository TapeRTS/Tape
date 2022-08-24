package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.GameEngine;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.corrodinggames.rts.gameFramework.l.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/a.class */
public class C0923a implements GLSurfaceView.Renderer {

    /* renamed from: q */
    private static BitmapFactory.Options f6290q = new BitmapFactory.Options();

    /* renamed from: a */
    public boolean f6291a;

    /* renamed from: b */
    GL10 f6292b;

    /* renamed from: c */
    float f6293c;

    /* renamed from: d */
    float f6294d;

    /* renamed from: e */
    int f6295e;

    /* renamed from: f */
    int f6296f;

    /* renamed from: g */
    C0932c[] f6297g;

    /* renamed from: h */
    C0926ac f6298h;

    /* renamed from: i */
    int f6299i;

    /* renamed from: j */
    int f6300j;

    /* renamed from: k */
    int f6301k;

    /* renamed from: l */
    int f6302l;

    /* renamed from: m */
    int f6303m;

    /* renamed from: n */
    int f6304n;

    /* renamed from: o */
    String f6305o;

    /* renamed from: p */
    long f6306p;

    public void onDrawFrame(GL10 gl10) {
        if (this.f6295e == -1) {
            Log.m6345d("RustedWarfare", "---- render: no buffer is ready!");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f6306p = currentTimeMillis;
        this.f6302l += (int) (currentTimeMillis - this.f6306p);
        this.f6303m++;
        if (this.f6303m == 10) {
            this.f6304n = 10000 / this.f6302l;
            this.f6302l = 0;
            this.f6303m = 0;
            this.f6305o = this.f6304n + "fps";
            Log.m6345d("RustedWarfare", "render:" + this.f6305o + ", this renders has " + this.f6297g[this.f6295e].f6378b + " draws");
        }
        this.f6296f = this.f6295e;
        gl10.glClear(16640);
        gl10.glMatrixMode(5888);
        C0926ac.m1071a(gl10, true, false);
        C0932c c0932c = this.f6297g[this.f6296f];
        this.f6299i = -1;
        this.f6300j = -1;
        this.f6301k = -1;
        for (int i = 0; i < c0932c.f6378b; i++) {
            c0932c.f6377a[i].m1040a(gl10);
        }
        C0926ac.m1072a(gl10);
        this.f6296f = -1;
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.m6345d("RustedWarfare", "2d gl onSurfaceChanged:" + i + "," + i2);
        this.f6292b = gl10;
        this.f6293c = i2;
        this.f6294d = i;
        gl10.glViewport(0, 0, i, i2);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        gl10.glOrthof(0.0f, i, 0.0f, i2, 0.0f, 1.0f);
        gl10.glShadeModel(7424);
        gl10.glEnable(3042);
        gl10.glBlendFunc(770, 771);
        gl10.glColor4x(65536, 65536, 65536, 65536);
        gl10.glEnable(3553);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m6345d("RustedWarfare", "2d gl onSurfaceCreated");
        this.f6292b = gl10;
        gl10.glHint(3152, 4353);
        gl10.glClearColor(0.3f, 0.3f, 0.5f, 1.0f);
        gl10.glShadeModel(7424);
        gl10.glDisable(2929);
        gl10.glEnable(3553);
        gl10.glDisable(3024);
        gl10.glDisable(2896);
        gl10.glClear(16640);
        if (GameEngine.m1228A() != null) {
        }
        this.f6291a = true;
    }
}
