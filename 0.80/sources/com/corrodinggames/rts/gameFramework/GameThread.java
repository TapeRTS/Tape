package com.corrodinggames.rts.gameFramework;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GameThread.class */
public class GameThread extends Thread {
    public static final String TAG = "FoxPlatformer";
    long newTime;
    boolean running = true;

    public void resetDeltaTimer() {
        this.newTime = System.currentTimeMillis();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        resetDeltaTimer();
        long j = this.newTime;
        while (this.running) {
            long j2 = this.newTime;
            resetDeltaTimer();
            float f = (float) (this.newTime - j2);
            GameEngine.getInstance().updateAndDrawAll(f * 0.060000002f, (int) (this.newTime - j2));
        }
    }

    public void setRunning(boolean z) {
        synchronized (this) {
            this.running = z;
        }
    }
}
