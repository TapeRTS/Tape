package com.corrodinggames.rts.gameFramework;

import android.media.MediaPlayer;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/an.class */
public class C0550an extends AbstractC0555aq {

    /* renamed from: a */
    ArrayList f3730a = new ArrayList();

    /* renamed from: b */
    ArrayList f3731b = new ArrayList();

    /* renamed from: c */
    ArrayList f3732c = new ArrayList();

    /* renamed from: d */
    boolean f3733d = false;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: a */
    public AbstractC0556ar mo94a(String str) {
        return new C0551ao(str, this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: a */
    public AbstractC0557as mo98a() {
        return new C0552ap(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: a */
    public void mo95a(C0547am amVar) {
        this.f3740e = amVar;
        if (this.f3733d) {
            AbstractC0789l.m670d("AndroidMusicFactory already loaded");
        }
        AbstractC0789l.m670d("AndroidMusicFactory - load");
        this.f3733d = true;
        this.f3730a.add(new MediaPlayer());
        this.f3730a.add(new MediaPlayer());
        this.f3731b.addAll(this.f3730a);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0555aq
    /* renamed from: b */
    public void mo93b() {
    }
}
