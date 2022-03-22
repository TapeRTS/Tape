package com.corrodinggames.rts.gameFramework;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.utility.C0812ae;
import com.corrodinggames.rts.gameFramework.utility.C0832j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap.class */
public class C0552ap extends AbstractC0557as {

    /* renamed from: a */
    MediaPlayer f3735a;

    /* renamed from: b */
    C0551ao f3736b;

    /* renamed from: c */
    C0550an f3737c;

    public C0552ap(C0550an anVar) {
        this.f3737c = anVar;
        if (anVar.f3731b.size() == 0) {
            throw new RuntimeException("Music player pool empty");
        }
        MediaPlayer mediaPlayer = (MediaPlayer) anVar.f3731b.remove(0);
        anVar.f3732c.add(this);
        this.f3735a = mediaPlayer;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: a */
    public void mo86a(AbstractC0556ar arVar) {
        this.f3736b = (C0551ao) arVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: a */
    public void mo85a(boolean z) {
        try {
            MediaPlayer mediaPlayer = this.f3735a;
            mediaPlayer.reset();
            AssetFileDescriptor assetFileDescriptor = null;
            if (this.f3736b.f3741b.startsWith("music")) {
                try {
                    assetFileDescriptor = this.f3737c.f3740e.f3711w.mo4277d().m4264b(this.f3736b.f3741b);
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                String c = C0596a.m1889c(this.f3736b.f3741b);
                if (!C0812ae.m544c(c)) {
                    mediaPlayer.setDataSource(c);
                } else {
                    C0832j h = C0596a.m1884h(c);
                    File createTempFile = File.createTempFile("music", "ogg");
                    AbstractC0789l.m670d("Temp file needed for this music from zipped mod file");
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    C0654f.m1496a(h, fileOutputStream);
                    fileOutputStream.close();
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    try {
                        mediaPlayer.setDataSource(fileInputStream.getFD(), 0L, fileInputStream.available());
                        fileInputStream.close();
                        createTempFile.delete();
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
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.corrodinggames.rts.gameFramework.ap.1
                @Override // android.media.MediaPlayer.OnInfoListener
                public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                    return true;
                }
            });
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.corrodinggames.rts.gameFramework.ap.2
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer2) {
                    mediaPlayer2.start();
                }
            });
            mediaPlayer.prepareAsync();
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: a */
    public void mo88a() {
        this.f3735a.pause();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: b */
    public void mo84b() {
        this.f3735a.start();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: c */
    public boolean mo83c() {
        return this.f3735a.isPlaying();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: d */
    public void mo82d() {
        if (this.f3735a != null) {
            this.f3735a.stop();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: e */
    public void mo81e() {
        if (this.f3735a != null) {
            this.f3735a.stop();
        }
        this.f3735a = null;
        this.f3737c.f3732c.remove(this);
        this.f3737c.f3731b.add(this.f3735a);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0557as
    /* renamed from: a */
    public void mo87a(float f) {
        this.f3735a.setVolume(f, f);
    }
}
