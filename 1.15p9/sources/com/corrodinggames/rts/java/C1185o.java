package com.corrodinggames.rts.java;

import android.content.Context;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i;
import com.corrodinggames.rts.gameFramework.utility.C1074ad;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.audio.p050a.C1130a;
import com.corrodinggames.rts.java.audio.p050a.C1132c;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.corrodinggames.rts.java.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/o.class */
public class C1185o extends AbstractC0634h {

    /* renamed from: a */
    final int f7235a = 15;

    /* renamed from: b */
    LinkedBlockingQueue f7236b = new LinkedBlockingQueue();

    /* renamed from: c */
    C1074ad f7237c = new C1074ad(15);

    /* renamed from: d */
    C1188r f7238d;

    /* renamed from: e */
    Context f7239e;

    /* renamed from: f */
    public OpenALAudio f7240f;

    /* renamed from: b */
    public Object m83b() {
        return this.f7240f;
    }

    public C1185o(OpenALAudio openALAudio) {
        for (int i = 0; i < 15; i++) {
            this.f7237c.m647a(new C1186p());
        }
        this.f7240f = openALAudio;
    }

    /* renamed from: a */
    public void mo2989a(Context context) {
        if (this.f7239e != null) {
            GameEngine.PrintLog("SlickSoundFactory:setContext context already set");
        } else {
            this.f7239e = context;
        }
    }

    /* renamed from: a */
    public AbstractC0635i mo2990a(int i) {
        C1187q c1187q = new C1187q(this, CommonUtils.m2263f(i), this);
        String m2263f = CommonUtils.m2263f(i);
        if (m2263f == null) {
            throw new RuntimeException("Failed to find sound for res id:" + i);
        }
        synchronized (m83b()) {
            c1187q.f7247a = this.f7240f.mo7535newSound(new C1130a(m2263f));
        }
        return c1187q;
    }

    /* renamed from: a */
    public AbstractC0635i mo2988a(String str, C1098j c1098j, boolean z) {
        C1185o c1185o = this;
        if (!z) {
            c1185o = null;
        }
        C1187q c1187q = new C1187q(this, str, c1185o);
        try {
            synchronized (m83b()) {
                c1187q.f7247a = this.f7240f.mo7535newSound(new C1130a(c1098j, c1098j.m565d()));
            }
            return c1187q;
        } catch (C1132c e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo2991a() {
        if (this.f7238d != null) {
            throw new RuntimeException("startThreads: soundThread!=null");
        }
        this.f7238d = new C1188r(this);
        this.f7238d.start();
    }
}
