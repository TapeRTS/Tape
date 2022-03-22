package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.AudioRecorder;
import com.corrodinggames.rts.java.audio.p044a.C0866c;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.TargetDataLine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/JavaSoundAudioRecorder.class */
public class JavaSoundAudioRecorder implements AudioRecorder {
    private TargetDataLine line;
    private byte[] buffer = new byte[4096];

    public JavaSoundAudioRecorder(int i, boolean z) {
        try {
            AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, i, 16, z ? 1 : 2, z ? 2 : 4, i, false);
            this.line = AudioSystem.getTargetDataLine(audioFormat);
            this.line.open(audioFormat, this.buffer.length);
            this.line.start();
        } catch (Exception e) {
            throw new C0866c("Error creating JavaSoundAudioRecorder.", e);
        }
    }

    @Override // com.corrodinggames.rts.java.audio.AudioRecorder
    public void read(short[] sArr, int i, int i2) {
        if (this.buffer.length < i2 * 2) {
            this.buffer = new byte[i2 * 2];
        }
        int i3 = i2 * 2;
        int i4 = 0;
        while (i4 != i3) {
            i4 += this.line.read(this.buffer, i4, i3 - i4);
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 * 2) {
            sArr[i + i6] = (short) ((this.buffer[i5 + 1] << 8) | (this.buffer[i5] & 255));
            i5 += 2;
            i6++;
        }
    }

    @Override // com.corrodinggames.rts.java.audio.AudioRecorder
    public void dispose() {
        this.line.close();
    }
}
