package com.corrodinggames.rts.java.audio;

import com.corrodinggames.rts.java.audio.p050a.C1130a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/Audio.class */
public interface Audio {
    AudioDevice newAudioDevice(int i, boolean z);

    AudioRecorder newAudioRecorder(int i, boolean z);

    /* renamed from: newSound */
    Sound mo6762newSound(C1130a c1130a);

    /* renamed from: newMusic */
    Music mo6761newMusic(C1130a c1130a);
}
