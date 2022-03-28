package com.corrodinggames.rts.gameFramework;

import android.os.Environment;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GameSaver.class */
public class GameSaver {
    String folder = "/rustedWarfare/saves/";

    public void saveGame(String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStorageDirectory() + this.folder + str));
            new DataOutputStream(fileOutputStream).close();
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
