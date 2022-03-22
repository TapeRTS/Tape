package com.corrodinggames.rts.gameFramework.p039j;

import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.corrodinggames.rts.gameFramework.j.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/a.class */
public class C0744a implements GLSurfaceView.Renderer {

    /* renamed from: q */
    private static BitmapFactory.Options f5204q = new BitmapFactory.Options();

    /* renamed from: a */
    public boolean f5205a;

    /* renamed from: b */
    GL10 f5206b;

    /* renamed from: c */
    float f5207c;

    /* renamed from: d */
    float f5208d;

    /* renamed from: e */
    int f5209e;

    /* renamed from: f */
    int f5210f;

    /* renamed from: g */
    C0746c[] f5211g;

    /* renamed from: h */
    C0758o f5212h;

    /* renamed from: i */
    int f5213i;

    /* renamed from: j */
    int f5214j;

    /* renamed from: k */
    int f5215k;

    /* renamed from: l */
    int f5216l;

    /* renamed from: m */
    int f5217m;

    /* renamed from: n */
    int f5218n;

    /* renamed from: o */
    String f5219o;

    /* renamed from: p */
    long f5220p;

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.f5209e == -1) {
            Log.m4033d("RustedWarfare", "---- render: no buffer is ready!");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f5220p = currentTimeMillis;
        this.f5216l += (int) (currentTimeMillis - this.f5220p);
        this.f5217m++;
        if (this.f5217m == 10) {
            this.f5218n = 10000 / this.f5216l;
            this.f5216l = 0;
            this.f5217m = 0;
            this.f5219o = this.f5218n + "fps";
            Log.m4033d("RustedWarfare", "render:" + this.f5219o + ", this renders has " + this.f5211g[this.f5209e].f5229b + " draws");
        }
        this.f5210f = this.f5209e;
        gl10.glClear(16640);
        gl10.glMatrixMode(5888);
        C0758o.m839a(gl10, true, false);
        C0746c cVar = this.f5211g[this.f5210f];
        this.f5213i = -1;
        this.f5214j = -1;
        this.f5215k = -1;
        for (int i = 0; i < cVar.f5229b; i++) {
            cVar.f5228a[i].m878a(gl10);
        }
        C0758o.m840a(gl10);
        this.f5210f = -1;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.m4033d("RustedWarfare", "2d gl onSurfaceChanged:" + i + "," + i2);
        this.f5206b = gl10;
        this.f5207c = i2;
        this.f5208d = i;
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

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m4033d("RustedWarfare", "2d gl onSurfaceCreated");
        this.f5206b = gl10;
        gl10.glHint(3152, 4353);
        gl10.glClearColor(0.3f, 0.3f, 0.5f, 1.0f);
        gl10.glShadeModel(7424);
        gl10.glDisable(2929);
        gl10.glEnable(3553);
        gl10.glDisable(3024);
        gl10.glDisable(2896);
        gl10.glClear(16640);
        if (AbstractC0789l.m638u() != null) {
        }
        this.f5205a = true;
    }
}
