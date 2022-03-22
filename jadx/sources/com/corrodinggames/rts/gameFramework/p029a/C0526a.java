package com.corrodinggames.rts.gameFramework.p029a;

import android.content.Context;
import android.media.SoundPool;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0811ad;
import com.corrodinggames.rts.gameFramework.utility.C0832j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/a.class */
public class C0526a extends AbstractC0533h {

    /* renamed from: a */
    LinkedBlockingQueue f3547a = new LinkedBlockingQueue();

    /* renamed from: b */
    final int f3548b = 15;

    /* renamed from: c */
    C0811ad f3549c = new C0811ad(15);

    /* renamed from: d */
    C0529d f3550d;

    /* renamed from: e */
    Context f3551e;

    /* renamed from: f */
    SoundPool f3552f;

    public C0526a() {
        for (int i = 0; i < 15; i++) {
            this.f3549c.m549a(new C0528c());
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public void mo77a(Context context) {
        if (this.f3551e != null) {
            AbstractC0789l.m670d("AndroidSoundFactory:setContext context already set");
            return;
        }
        this.f3551e = context;
        this.f3552f = new SoundPool(16, 3, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public void mo79a() {
        if (this.f3550d != null) {
            throw new RuntimeException("soundThread!=null");
        }
        this.f3550d = new C0529d(this);
        this.f3550d.start();
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public AbstractC0534i mo78a(int i) {
        C0527b bVar = new C0527b(this, C0654f.m1494a(C0063R.raw.class, i), this);
        bVar.f3553a = this;
        bVar.f3554b = this.f3552f.load(this.f3551e, i, 1);
        return bVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public AbstractC0534i mo76a(String str, C0832j jVar, boolean z) {
        int load;
        C0526a aVar = this;
        if (!z) {
            aVar = null;
        }
        if (!jVar.m499a()) {
            try {
                File createTempFile = File.createTempFile("audio", "ogg");
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                C0654f.m1496a(jVar, fileOutputStream);
                fileOutputStream.close();
                FileInputStream fileInputStream = new FileInputStream(createTempFile);
                try {
                    load = this.f3552f.load(fileInputStream.getFD(), 0L, fileInputStream.available(), 1);
                    fileInputStream.close();
                    createTempFile.delete();
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            try {
                load = this.f3552f.load(jVar.m498b(), 0L, jVar.available(), 1);
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        C0527b bVar = new C0527b(this, str, aVar);
        bVar.f3553a = this;
        bVar.f3554b = load;
        return bVar;
    }
}
