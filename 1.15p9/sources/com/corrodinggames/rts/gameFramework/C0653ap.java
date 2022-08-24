package com.corrodinggames.rts.gameFramework;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap.class */
public class C0653ap extends AbstractC0658as {

    /* renamed from: a */
    MediaPlayer f4206a;

    /* renamed from: b */
    C0652ao f4207b;

    /* renamed from: c */
    C0651an f4208c;

    public C0653ap(C0651an c0651an) {
        this.f4208c = c0651an;
        if (c0651an.f4202b.size() == 0) {
            throw new RuntimeException("Music player pool empty");
        }
        MediaPlayer mediaPlayer = (MediaPlayer) c0651an.f4202b.remove(0);
        c0651an.f4203c.add(this);
        this.f4206a = mediaPlayer;
    }

    /* renamed from: a */
    public void mo2889a(AbstractC0657ar abstractC0657ar) {
        this.f4207b = (C0652ao) abstractC0657ar;
    }

    /* renamed from: a */
    public void mo2888a(boolean z) {
        try {
            MediaPlayer mediaPlayer = this.f4206a;
            mediaPlayer.reset();
            AssetFileDescriptor assetFileDescriptor = null;
            if (this.f4207b.f4212b.startsWith("music")) {
                try {
                    assetFileDescriptor = this.f4208c.f4211e.f4172w.mo6586d().m6571b(C0750a.m2444e(this.f4207b.f4212b));
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                String m2444e = C0750a.m2444e(this.f4207b.f4212b);
                if (C1075ae.m639a(m2444e) == null) {
                    mediaPlayer.setDataSource(m2444e);
                } else {
                    C1098j m2438j = C0750a.m2438j(m2444e);
                    if (m2438j == null) {
                        throw new RuntimeException("openAssetSteam() null for '" + m2444e + "'");
                    }
                    File m2464a = C0750a.m2464a(this.f4208c.f4211e.f4172w, "music", "ogg");
                    GameEngine.PrintLog("Temp file needed for this music from zipped/abstract mod file");
                    FileOutputStream fileOutputStream = new FileOutputStream(m2464a);
                    C0758f.m2339a(m2438j, fileOutputStream);
                    fileOutputStream.close();
                    m2438j.close();
                    FileInputStream fileInputStream = new FileInputStream(m2464a);
                    try {
                        mediaPlayer.setDataSource(fileInputStream.getFD(), 0L, fileInputStream.available());
                        fileInputStream.close();
                        m2464a.delete();
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                }
            }
            if (z) {
                mediaPlayer.setLooping(true);
            }
            mediaPlayer.setVolume(0.0f, 0.0f);
            mediaPlayer.setOnInfoListener(new C06541());
            mediaPlayer.setOnPreparedListener(new C06552());
            mediaPlayer.prepareAsync();
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.ap$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap$1.class */
    class C06541 implements MediaPlayer.OnInfoListener {
        C06541() {
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.ap$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap$2.class */
    class C06552 implements MediaPlayer.OnPreparedListener {
        C06552() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.start();
        }
    }

    /* renamed from: a */
    public void mo2891a() {
        this.f4206a.pause();
    }

    /* renamed from: b */
    public void mo2887b() {
        this.f4206a.start();
    }

    /* renamed from: c */
    public boolean mo2886c() {
        return this.f4206a.isPlaying();
    }

    /* renamed from: d */
    public void mo2885d() {
        if (this.f4206a != null) {
            this.f4206a.stop();
        }
    }

    /* renamed from: e */
    public void mo2884e() {
        if (this.f4206a != null) {
            this.f4206a.stop();
        }
        this.f4206a = null;
        this.f4208c.f4203c.remove(this);
        this.f4208c.f4202b.add(this.f4206a);
    }

    /* renamed from: a */
    public void mo2890a(float f) {
        this.f4206a.setVolume(f, f);
    }
}
