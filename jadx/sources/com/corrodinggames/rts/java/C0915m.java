package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0556ar;
import com.corrodinggames.rts.gameFramework.AbstractC0557as;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.java.audio.Music;

/* renamed from: com.corrodinggames.rts.java.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/m.class */
public class C0915m extends AbstractC0557as {

    /* renamed from: a */
    C0914l f6084a;

    /* renamed from: b */
    C0913k f6085b;

    /* renamed from: c */
    Music f6086c;

    /* renamed from: d */
    boolean f6087d = false;

    /* renamed from: e */
    boolean f6088e = false;

    /* renamed from: f */
    boolean f6089f = false;

    public C0915m(C0913k kVar) {
        this.f6085b = kVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: a */
    public void mo86a(AbstractC0556ar arVar) {
        this.f6084a = (C0914l) arVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: a */
    public void mo85a(boolean z) {
        synchronized (this.f6085b.m89f()) {
            this.f6087d = true;
            this.f6088e = z;
            this.f6089f = false;
            AbstractC0789l.m670d("Queued:" + this.f6084a.f3741b);
            if (this.f6086c != null) {
                AbstractC0789l.m670d("startPlaying: Stopping old music");
                this.f6086c.stop();
            }
            this.f6086c = this.f6084a.f6083c;
        }
    }

    /* renamed from: f */
    public void m80f() {
        if (!this.f6089f) {
            synchronized (this.f6085b.m89f()) {
                if (this.f6086c != null) {
                    AbstractC0789l.m670d("Now playing:" + this.f6084a.f3741b);
                    if (this.f6088e) {
                        this.f6086c.setVolume(this.f6086c.getVolume());
                        this.f6086c.setLooping(true);
                        this.f6086c.play();
                    } else {
                        this.f6086c.setVolume(this.f6086c.getVolume());
                        this.f6086c.play();
                    }
                    this.f6089f = true;
                } else {
                    AbstractC0789l.m670d("realPlay: playingMusic==null");
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: a */
    public void mo88a() {
        synchronized (this.f6085b.m89f()) {
            if (this.f6086c != null) {
                this.f6086c.pause();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: b */
    public void mo84b() {
        synchronized (this.f6085b.m89f()) {
            if (this.f6086c != null && !this.f6086c.isPlaying()) {
                this.f6086c.play();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: d */
    public void mo82d() {
        synchronized (this.f6085b.m89f()) {
            if (this.f6086c != null) {
                this.f6086c.stop();
                this.f6089f = false;
                this.f6087d = false;
                this.f6086c = null;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: e */
    public void mo81e() {
        synchronized (this.f6085b.m89f()) {
            if (this.f6086c != null) {
                this.f6086c.stop();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: c */
    public boolean mo83c() {
        synchronized (this.f6085b.m89f()) {
            if (!this.f6089f || this.f6086c == null) {
                return false;
            }
            return this.f6086c.isPlaying();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: a */
    public void mo87a(float f) {
        synchronized (this.f6085b.m89f()) {
            if (this.f6086c != null) {
                if (f > 0.05f && !this.f6089f && this.f6087d) {
                    m80f();
                }
                this.f6086c.setVolume(f);
            } else {
                AbstractC0789l.m670d("setVolume: playingMusic==null");
            }
        }
    }
}
