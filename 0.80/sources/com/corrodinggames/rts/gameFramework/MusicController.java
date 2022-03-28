package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.util.Log;
import java.io.IOException;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/MusicController.class */
public class MusicController {
    MediaPlayer background;
    boolean backgroundReady;
    Context context;
    float crossFade;
    boolean crossFading;
    MediaPlayer current;
    boolean currentReady;
    String currentSong;
    float currentSongTimer;
    boolean firstTrack;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/MusicController$MusicMood.class */
    public enum MusicMood {
        starting { // from class: com.corrodinggames.rts.gameFramework.MusicController.MusicMood.1
            @Override // com.corrodinggames.rts.gameFramework.MusicController.MusicMood
            String getPath() {
                return "music/starting";
            }
        },
        buildup { // from class: com.corrodinggames.rts.gameFramework.MusicController.MusicMood.2
            @Override // com.corrodinggames.rts.gameFramework.MusicController.MusicMood
            String getPath() {
                return "music/buildup";
            }
        },
        attacked { // from class: com.corrodinggames.rts.gameFramework.MusicController.MusicMood.3
            @Override // com.corrodinggames.rts.gameFramework.MusicController.MusicMood
            String getPath() {
                return "music/attacked";
            }
        };
        
        String[] files;

        /* synthetic */ MusicMood(MusicMood musicMood) {
            this();
        }

        static void loadAll() {
            starting.loadFiles();
            buildup.loadFiles();
            attacked.loadFiles();
        }

        String[] getFileArray() {
            return this.files;
        }

        abstract String getPath();

        void loadFiles() {
            this.files = GameEngine.listDir(getPath(), false);
        }
    }

    public boolean canPlayingBackgroundMusic() {
        return getMusicVolume() > 0.01f;
    }

    public String getMusicFile(MusicMood musicMood) {
        return getMusicFile(musicMood, musicMood);
    }

    public String getMusicFile(MusicMood musicMood, MusicMood musicMood2) {
        if (CommonUtils.realRand(musicMood.getFileArray().length + musicMood2.getFileArray().length) >= musicMood.getFileArray().length) {
            musicMood = musicMood2;
        }
        String[] fileArray = musicMood.getFileArray();
        return String.valueOf(musicMood.getPath()) + "/" + fileArray[CommonUtils.realRand(fileArray.length)];
    }

    public float getMusicVolume() {
        return GameEngine.getInstance().settings.musicVolume;
    }

    public void init(Context context) {
        this.context = context;
        MusicMood.loadAll();
        this.current = new MediaPlayer();
        this.background = new MediaPlayer();
    }

    public void pause() {
        Log.v(GameEngine.TAG, "Music:pause()");
        if (this.currentReady) {
            this.current.pause();
        }
        if (this.backgroundReady) {
            this.background.pause();
        }
    }

    public void startNew() {
        this.currentReady = false;
        this.currentSong = null;
        this.firstTrack = true;
        this.backgroundReady = false;
    }

    public void unPause() {
        if (this.currentReady) {
            this.current.start();
            if (!this.crossFading) {
                this.current.setVolume(getMusicVolume(), getMusicVolume());
            }
        }
        if (this.backgroundReady) {
            this.background.start();
        }
    }

    public void unload() {
        if (this.backgroundReady) {
            this.background.stop();
            this.background.release();
        }
        if (this.current != null) {
            this.current.stop();
            this.current.release();
        }
        this.current = null;
        this.currentSong = null;
        this.currentReady = false;
    }

    public void update(float f) {
        if (!this.currentReady || canPlayingBackgroundMusic() || !this.current.isPlaying()) {
            this.currentSongTimer += f;
            boolean z = false;
            if (!this.currentReady) {
                z = true;
            }
            if (this.currentSongTimer > 2200.0f) {
                z = true;
                this.currentSongTimer = 0.0f;
            }
            if (z) {
                String musicFile = this.firstTrack ? getMusicFile(MusicMood.starting) : getMusicFile(MusicMood.buildup, MusicMood.starting);
                if (!musicFile.equals(this.currentSong)) {
                    this.currentSong = musicFile;
                    this.firstTrack = false;
                    try {
                        AssetFileDescriptor openFd = this.context.getAssets().openFd(musicFile);
                        try {
                            MediaPlayer mediaPlayer = this.current;
                            this.current = this.background;
                            this.background = mediaPlayer;
                            this.current.reset();
                            this.current.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                            this.current.setLooping(true);
                            this.current.setVolume(0.0f, 0.0f);
                            this.current.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.corrodinggames.rts.gameFramework.MusicController.1
                                @Override // android.media.MediaPlayer.OnInfoListener
                                public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                                    return true;
                                }
                            });
                            this.current.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.corrodinggames.rts.gameFramework.MusicController.2
                                @Override // android.media.MediaPlayer.OnPreparedListener
                                public void onPrepared(MediaPlayer mediaPlayer2) {
                                    mediaPlayer2.start();
                                }
                            });
                            this.current.prepareAsync();
                            if (this.currentReady) {
                                this.backgroundReady = true;
                            }
                            this.crossFading = true;
                            this.crossFade = 1.0f;
                            openFd.close();
                            this.currentReady = true;
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            if (this.crossFading) {
                this.crossFade -= 0.006f * f;
                float musicVolume = this.crossFade * getMusicVolume();
                float musicVolume2 = (1.0f - this.crossFade) * getMusicVolume();
                if (this.crossFade <= 0.0f) {
                    this.crossFading = false;
                    if (this.backgroundReady) {
                        this.background.stop();
                    }
                    if (this.currentReady) {
                        this.current.setVolume(getMusicVolume(), getMusicVolume());
                        return;
                    }
                    return;
                }
                if (this.backgroundReady) {
                    this.background.setVolume(musicVolume, musicVolume);
                }
                if (this.currentReady) {
                    this.current.setVolume(musicVolume2, musicVolume2);
                    return;
                }
                return;
            }
            return;
        }
        pause();
    }
}
