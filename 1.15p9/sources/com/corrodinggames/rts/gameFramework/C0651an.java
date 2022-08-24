package com.corrodinggames.rts.gameFramework;

import android.media.MediaPlayer;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/an.class */
public class C0651an extends AbstractC0656aq {

    /* renamed from: a */
    ArrayList f4201a = new ArrayList();

    /* renamed from: b */
    ArrayList f4202b = new ArrayList();

    /* renamed from: c */
    ArrayList f4203c = new ArrayList();

    /* renamed from: d */
    boolean f4204d = false;

    /* renamed from: a */
    public AbstractC0657ar mo2909a(String str) {
        return new C0652ao(str, this);
    }

    /* renamed from: a */
    public AbstractC0658as mo2913a() {
        return new C0653ap(this);
    }

    /* renamed from: a */
    public void mo2910a(C0648am c0648am) {
        this.f4211e = c0648am;
        if (this.f4204d) {
            GameEngine.PrintLog("AndroidMusicFactory already loaded");
        }
        GameEngine.PrintLog("AndroidMusicFactory - load");
        this.f4204d = true;
        this.f4201a.add(new MediaPlayer());
        this.f4201a.add(new MediaPlayer());
        this.f4202b.addAll(this.f4201a);
    }

    /* renamed from: b */
    public void mo2908b() {
    }
}
