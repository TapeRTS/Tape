package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import android.media.SoundPool;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1074ad;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/a.class */
public class C0627a extends AbstractC0634h {

    /* renamed from: d */
    C0630d f4016d;

    /* renamed from: f */
    Context f4018f;

    /* renamed from: g */
    SoundPool f4019g;

    /* renamed from: a */
    LinkedBlockingQueue f4013a = new LinkedBlockingQueue();

    /* renamed from: b */
    final int f4014b = 15;

    /* renamed from: c */
    C1074ad f4015c = new C1074ad(15);

    /* renamed from: e */
    int f4017e = 1000;

    public C0627a() {
        for (int i = 0; i < 15; i++) {
            this.f4015c.m641a(new C0629c());
        }
    }

    /* renamed from: a */
    public void mo2988a(Context context) {
        if (this.f4018f != null) {
            GameEngine.PrintLog("AndroidSoundFactory:setContext context already set");
            return;
        }
        this.f4018f = context;
        this.f4019g = new SoundPool(16, 3, 0);
    }

    /* renamed from: a */
    public void mo2990a() {
        if (this.f4016d != null) {
            throw new RuntimeException("soundThread!=null");
        }
        this.f4016d = new C0630d(this);
        this.f4016d.start();
    }

    /* renamed from: a */
    public AbstractC0635i mo2989a(int i) {
        C0628b c0628b = new C0628b(this, C0758f.m2337a(C0067R.raw.class, i), this);
        c0628b.f4020a = this;
        c0628b.f4021b = this.f4019g.load(this.f4018f, i, 1);
        return c0628b;
    }

    /* renamed from: a */
    public AbstractC0635i mo2987a(String str, C1098j c1098j, boolean z) {
        int load;
        C0627a c0627a = this;
        if (!z) {
            c0627a = null;
        }
        if (!c1098j.m562a()) {
            try {
                File m2464a = C0750a.m2464a(this.f4018f, "audio", "ogg");
                FileOutputStream fileOutputStream = new FileOutputStream(m2464a);
                C0758f.m2339a(c1098j, fileOutputStream);
                fileOutputStream.close();
                try {
                    c1098j.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                FileInputStream fileInputStream = new FileInputStream(m2464a);
                try {
                    load = this.f4019g.load(fileInputStream.getFD(), 0L, fileInputStream.available(), 1);
                    fileInputStream.close();
                    m2464a.delete();
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        } else {
            try {
                load = this.f4019g.load(c1098j.m561b(), 0L, c1098j.available(), 1);
                try {
                    c1098j.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                return null;
            }
        }
        C0628b c0628b = new C0628b(this, str, c0627a);
        c0628b.f4020a = this;
        c0628b.f4021b = load;
        return c0628b;
    }
}
