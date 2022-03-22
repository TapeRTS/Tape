package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.java.audio.p044a.C0864a;
import com.corrodinggames.rts.java.audio.p044a.C0882s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg.class */
public class Ogg {

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$Music.class */
    public class Music extends OpenALMusic {
        private OggInputStream input;
        private OggInputStream previousInput;

        public Music(OpenALAudio openALAudio, C0864a aVar) {
            super(openALAudio, aVar);
            if (!openALAudio.noDevice) {
                this.input = new OggInputStream(aVar.m344a());
                setup(this.input.getChannels(), this.input.getSampleRate());
            }
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public int read(byte[] bArr) {
            if (this.input == null) {
                this.input = new OggInputStream(this.file.m344a(), this.previousInput);
                setup(this.input.getChannels(), this.input.getSampleRate());
                this.previousInput = null;
            }
            return this.input.read(bArr);
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void reset() {
            C0882s.m268a(this.input);
            this.previousInput = null;
            this.input = null;
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        protected void loop() {
            C0882s.m268a(this.input);
            this.previousInput = this.input;
            this.input = null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$MusicWithThreadedLoader.class */
    public class MusicWithThreadedLoader extends OpenALMusic {
        private OggInputStream input;
        private OggInputStream previousInput;
        ThreadedWrappingAudioInputStream backgroundInput;

        public MusicWithThreadedLoader(OpenALAudio openALAudio, C0864a aVar) {
            super(openALAudio, aVar);
            if (!openALAudio.noDevice) {
                this.input = new OggInputStream(aVar.m344a());
                setup(this.input.getChannels(), this.input.getSampleRate());
                this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
            }
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public int read(byte[] bArr) {
            double a;
            if (this.input == null) {
                this.input = new OggInputStream(this.file.m344a(), this.previousInput);
                setup(this.input.getChannels(), this.input.getSampleRate());
                this.previousInput = null;
                this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
            }
            long a2 = C0586bj.m1919a();
            int read = this.backgroundInput.read(bArr);
            if (C0586bj.m1917a(a2) > 0.5d) {
                AbstractC0789l.m670d("ogg read took:" + C0586bj.m1918a(a));
            }
            return read;
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void backgroundUpdate() {
            try {
                if (!(this.input == null || this.backgroundInput == null)) {
                    this.backgroundInput.backgroundFillBuffer();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void reset() {
            C0882s.m268a(this.input);
            this.previousInput = null;
            this.input = null;
            this.backgroundInput.close();
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        protected void loop() {
            C0882s.m268a(this.input);
            this.previousInput = this.input;
            this.input = null;
            this.backgroundInput.close();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$Sound.class */
    public class Sound extends OpenALSound {
        public Sound(OpenALAudio openALAudio, C0864a aVar) {
            super(openALAudio);
            int read;
            if (!openALAudio.noDevice) {
                OggInputStream oggInputStream = null;
                try {
                    oggInputStream = new OggInputStream(aVar.m344a());
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
                    byte[] bArr = new byte[2048];
                    while (!oggInputStream.atEnd() && (read = oggInputStream.read(bArr)) != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    setup(byteArrayOutputStream.toByteArray(), oggInputStream.getChannels(), oggInputStream.getSampleRate());
                    C0882s.m268a(oggInputStream);
                } catch (Throwable th) {
                    C0882s.m268a(oggInputStream);
                    throw th;
                }
            }
        }
    }
}
