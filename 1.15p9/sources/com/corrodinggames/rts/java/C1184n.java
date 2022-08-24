package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0657ar;
import com.corrodinggames.rts.gameFramework.AbstractC0658as;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.java.audio.Music;

/* renamed from: com.corrodinggames.rts.java.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/n.class */
public class C1184n extends AbstractC0658as {

    /* renamed from: a */
    C1183m f7229a;

    /* renamed from: b */
    C1182l f7230b;

    /* renamed from: c */
    Music f7231c;

    /* renamed from: d */
    boolean f7232d = false;

    /* renamed from: e */
    boolean f7233e = false;

    /* renamed from: f */
    boolean f7234f = false;

    public C1184n(C1182l c1182l) {
        this.f7230b = c1182l;
    }

    /* renamed from: a */
    public void mo2889a(AbstractC0657ar abstractC0657ar) {
        this.f7229a = (C1183m) abstractC0657ar;
    }

    /* renamed from: a */
    public void mo2888a(boolean z) {
        synchronized (this.f7230b.m91f()) {
            this.f7232d = true;
            this.f7233e = z;
            this.f7234f = false;
            GameEngine.PrintLog("Queued:" + this.f7229a.f4212b);
            if (this.f7231c != null) {
                GameEngine.PrintLog("startPlaying: Stopping old music");
                this.f7231c.stop();
            }
            this.f7231c = this.f7229a.f7228c;
        }
    }

    /* renamed from: f */
    public void m82f() {
        if (this.f7234f) {
            return;
        }
        synchronized (this.f7230b.m91f()) {
            if (this.f7231c != null) {
                GameEngine.PrintLog("Now playing:" + this.f7229a.f4212b);
                if (this.f7233e) {
                    this.f7231c.setVolume(this.f7231c.getVolume());
                    this.f7231c.setLooping(true);
                    this.f7231c.play();
                } else {
                    this.f7231c.setVolume(this.f7231c.getVolume());
                    this.f7231c.play();
                }
                this.f7234f = true;
            } else {
                GameEngine.PrintLog("realPlay: playingMusic==null");
            }
        }
    }

    /* renamed from: a */
    public void mo2891a() {
        synchronized (this.f7230b.m91f()) {
            if (this.f7231c != null) {
                this.f7231c.pause();
            }
        }
    }

    /* renamed from: b */
    public void mo2887b() {
        synchronized (this.f7230b.m91f()) {
            if (this.f7231c != null && !this.f7231c.isPlaying()) {
                this.f7231c.play();
            }
        }
    }

    /* renamed from: d */
    public void mo2885d() {
        synchronized (this.f7230b.m91f()) {
            if (this.f7231c != null) {
                this.f7231c.stop();
                this.f7234f = false;
                this.f7232d = false;
                this.f7231c = null;
            }
        }
    }

    /* renamed from: e */
    public void mo2884e() {
        synchronized (this.f7230b.m91f()) {
            if (this.f7231c != null) {
                this.f7231c.stop();
            }
        }
    }

    /* renamed from: c */
    public boolean mo2886c() {
        synchronized (this.f7230b.m91f()) {
            if (this.f7234f && this.f7231c != null) {
                return this.f7231c.isPlaying();
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo2890a(float f) {
        synchronized (this.f7230b.m91f()) {
            if (this.f7231c != null) {
                if (f > 0.05f && !this.f7234f && this.f7232d) {
                    m82f();
                }
                this.f7231c.setVolume(f);
            } else {
                GameEngine.PrintLog("setVolume: playingMusic==null");
            }
        }
    }
}
