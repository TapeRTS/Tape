package com.corrodinggames.rts.java;

import android.content.Context;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h;
import com.corrodinggames.rts.gameFramework.p029a.AbstractC0534i;
import com.corrodinggames.rts.gameFramework.utility.C0811ad;
import com.corrodinggames.rts.gameFramework.utility.C0832j;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.audio.p044a.C0864a;
import com.corrodinggames.rts.java.audio.p044a.C0866c;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.corrodinggames.rts.java.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/n.class */
public class C0916n extends AbstractC0533h {

    /* renamed from: a */
    final int f6090a = 15;

    /* renamed from: b */
    LinkedBlockingQueue f6091b = new LinkedBlockingQueue();

    /* renamed from: c */
    C0811ad f6092c = new C0811ad(15);

    /* renamed from: d */
    C0919q f6093d;

    /* renamed from: e */
    Context f6094e;

    /* renamed from: f */
    public OpenALAudio f6095f;

    /* renamed from: b */
    public Object m75b() {
        return this.f6095f;
    }

    public C0916n(OpenALAudio openALAudio) {
        for (int i = 0; i < 15; i++) {
            this.f6092c.m549a(new C0917o());
        }
        this.f6095f = openALAudio;
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public void mo77a(Context context) {
        if (this.f6094e != null) {
            AbstractC0789l.m670d("SlickSoundFactory:setContext context already set");
        } else {
            this.f6094e = context;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public AbstractC0534i mo78a(int i) {
        C0918p pVar = new C0918p(this, C0654f.m1438e(i), this);
        String e = C0654f.m1438e(i);
        if (e == null) {
            throw new RuntimeException("Failed to find sound for res id:" + i);
        }
        synchronized (m75b()) {
            pVar.f6102a = this.f6095f.newSound(new C0864a(e));
        }
        return pVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public AbstractC0534i mo76a(String str, C0832j jVar, boolean z) {
        C0916n nVar = this;
        if (!z) {
            nVar = null;
        }
        C0918p pVar = new C0918p(this, str, nVar);
        try {
            synchronized (m75b()) {
                pVar.f6102a = this.f6095f.newSound(new C0864a(jVar, jVar.m496d()));
            }
            return pVar;
        } catch (C0866c e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public void mo79a() {
        if (this.f6093d != null) {
            throw new RuntimeException("startThreads: soundThread!=null");
        }
        this.f6093d = new C0919q(this);
        this.f6093d.start();
    }
}
