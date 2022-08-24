package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0656aq;
import com.corrodinggames.rts.gameFramework.AbstractC0657ar;
import com.corrodinggames.rts.gameFramework.AbstractC0658as;
import com.corrodinggames.rts.gameFramework.C0648am;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;

/* renamed from: com.corrodinggames.rts.java.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/l.class */
public class C1182l extends AbstractC0656aq {

    /* renamed from: a */
    volatile boolean f7224a;

    /* renamed from: b */
    public OpenALAudio f7225b;

    /* renamed from: c */
    boolean f7226c = false;

    /* renamed from: f */
    public Object m91f() {
        return this.f7225b;
    }

    /* renamed from: a */
    public void mo2912a(float f) {
        double m2608a;
        synchronized (m91f()) {
            if (this.f7224a) {
                return;
            }
            long m2610a = C0727bl.m2610a();
            this.f7225b.update();
            if (C0727bl.m2608a(m2610a) > 16.0d) {
                GameEngine.PrintLog("music poll took:" + C0727bl.m2609a(m2608a));
            }
            super.mo2912a(f);
        }
    }

    /* renamed from: a */
    public void mo2911a(int i) {
    }

    public C1182l(OpenALAudio openALAudio) {
        this.f7225b = openALAudio;
    }

    /* renamed from: a */
    public AbstractC0657ar mo2909a(String str) {
        return new C1183m(str, this);
    }

    /* renamed from: a */
    public AbstractC0658as mo2913a() {
        return new C1184n(this);
    }

    /* renamed from: a */
    public void mo2910a(C0648am c0648am) {
        this.f4211e = c0648am;
    }

    /* renamed from: b */
    public void mo2908b() {
        synchronized (m91f()) {
            this.f7224a = true;
        }
    }

    /* renamed from: c */
    public boolean mo2907c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo2906d() {
        return true;
    }

    /* renamed from: e */
    public int mo2905e() {
        return 100;
    }
}
