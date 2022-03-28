package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;
import com.corrodinggames.rts.R;
import java.util.HashMap;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/AudioEngine.class */
public class AudioEngine {
    public static int bug_attack;
    public static int bug_die;
    public static int building_explode;
    public static int cannon_firing;
    public static int firing3;
    public static int firing4;
    public static int gun_fire;
    public static int interface_click;
    public static int interface_error;
    public static int interface_move;
    public static int missile_fire;
    public static int missile_hit;
    public static int plasma_fire;
    public static int plasma_fire2;
    public static int tank_firing;
    public static int unit_explode;
    private AudioManager audioManager;
    private Context context;
    private SoundPool soundPool;
    private HashMap soundPoolMap;

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/AudioEngine$SoundData.class */
    public static class SoundData {
    }

    public static void load() {
    }

    public SoundData getSoundData(String str) {
        return null;
    }

    public void init(Context context) {
        this.context = context;
        this.soundPool = new SoundPool(8, 3, 0);
        interface_move = this.soundPool.load(context, R.raw.move, 1);
        interface_click = this.soundPool.load(context, R.raw.click, 1);
        missile_fire = this.soundPool.load(context, R.raw.missile_fire, 1);
        missile_hit = this.soundPool.load(context, R.raw.missile_hit, 1);
        unit_explode = this.soundPool.load(context, R.raw.unit_explode, 1);
        building_explode = this.soundPool.load(context, R.raw.buiding_explode, 1);
        tank_firing = this.soundPool.load(context, R.raw.tank_firing, 1);
        cannon_firing = this.soundPool.load(context, R.raw.cannon_firing, 1);
        gun_fire = this.soundPool.load(context, R.raw.gun_fire, 1);
        plasma_fire = this.soundPool.load(context, R.raw.plasma_fire, 1);
        plasma_fire2 = this.soundPool.load(context, R.raw.plasma_fire2, 1);
        firing3 = this.soundPool.load(context, R.raw.firing3, 1);
        firing4 = this.soundPool.load(context, R.raw.firing4, 1);
        bug_die = this.soundPool.load(context, R.raw.bug_die, 1);
        bug_attack = this.soundPool.load(context, R.raw.bug_attack, 1);
        interface_error = this.soundPool.load(context, R.raw.interface_error, 1);
    }

    public boolean isSoundOn() {
        return GameEngine.getInstance().settings.enableSounds;
    }

    public void playSound(int i) {
        playSound(i, 1.0f);
    }

    public void playSound(int i, float f) {
        if (isSoundOn()) {
            if (i == 0) {
                Log.e(GameEngine.TAG, "Sound not loaded");
            } else {
                this.soundPool.play(i, f, f, 1, 0, 1.0f);
            }
        }
    }

    public void playSound(int i, float f, float f2, float f3) {
        if (isSoundOn()) {
            GameEngine instance = GameEngine.getInstance();
            float distanceSq = CommonUtils.distanceSq((int) (instance.viewpointX_rounded + instance.halfViewpointWidth), (int) (instance.viewpointY_rounded + instance.halfViewpointHeight), f2, f3);
            float f4 = instance.halfViewpointWidth * 2.0f;
            if (distanceSq <= f4 * f4) {
                float sqrt = (float) Math.sqrt(distanceSq);
                float f5 = 1.0f;
                if (sqrt > instance.halfViewpointWidth) {
                    f5 = 1.0f - ((sqrt - instance.halfViewpointWidth) / instance.halfViewpointWidth);
                }
                float f6 = f5 * f;
                if (i == 0) {
                    Log.e(GameEngine.TAG, "Sound not loaded");
                } else {
                    this.soundPool.play(i, f6, f6, 1, 0, 1.0f);
                }
            }
        }
    }
}
