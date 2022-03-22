package com.corrodinggames.rts.java.audio;

import com.corrodinggames.rts.java.audio.p044a.C0864a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/Audio.class */
public interface Audio {
    AudioDevice newAudioDevice(int i, boolean z);

    AudioRecorder newAudioRecorder(int i, boolean z);

    Sound newSound(C0864a aVar);

    Music newMusic(C0864a aVar);
}
