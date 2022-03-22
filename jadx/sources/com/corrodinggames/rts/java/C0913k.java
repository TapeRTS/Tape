package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0555aq;
import com.corrodinggames.rts.gameFramework.AbstractC0556ar;
import com.corrodinggames.rts.gameFramework.AbstractC0557as;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0547am;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;

/* renamed from: com.corrodinggames.rts.java.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/k.class */
public class C0913k extends AbstractC0555aq {

    /* renamed from: a */
    volatile boolean f6079a;

    /* renamed from: b */
    public OpenALAudio f6080b;

    /* renamed from: c */
    boolean f6081c = false;

    /* renamed from: f */
    public Object m89f() {
        return this.f6080b;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: a */
    public void mo97a(float f) {
        double a;
        synchronized (m89f()) {
            if (!this.f6079a) {
                long a2 = C0586bj.m1919a();
                this.f6080b.update();
                if (C0586bj.m1917a(a2) > 16.0d) {
                    AbstractC0789l.m670d("music poll took:" + C0586bj.m1918a(a));
                }
                super.mo97a(f);
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: a */
    public void mo96a(int i) {
    }

    public C0913k(OpenALAudio openALAudio) {
        this.f6080b = openALAudio;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: a */
    public AbstractC0556ar mo94a(String str) {
        return new C0914l(str, this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: a */
    public AbstractC0557as mo98a() {
        return new C0915m(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: a */
    public void mo95a(C0547am amVar) {
        this.f3740e = amVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: b */
    public void mo93b() {
        synchronized (m89f()) {
            this.f6079a = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: c */
    public boolean mo92c() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: d */
    public boolean mo91d() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: e */
    public int mo90e() {
        return 100;
    }
}
