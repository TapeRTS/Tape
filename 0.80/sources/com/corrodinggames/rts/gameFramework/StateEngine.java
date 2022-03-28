package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/StateEngine.class */
public class StateEngine {
    static StateEngine stateEngine = null;
    String FILENAME = "rtsSave";
    String FILENAME_BACKUP = "rtsSave.bak";
    HashMap<String, LevelState> levelStates = new HashMap<>();

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/StateEngine$LevelState.class */
    public class LevelState {
        public boolean attempted;
        public boolean completed;
        public long gemsCollected;
        public String level;
        public boolean locked;
        public int maxGems;
        public int time;
        public int version;

        public LevelState() {
        }

        public void collectGem(int i) {
            if (i < 0 || i > 63) {
                throw new RuntimeException("collectGem id:" + i + " is not in range");
            }
            this.gemsCollected |= 1 << i;
        }

        public int getMaxGems() {
            return this.maxGems;
        }

        public int getNumOfGemCollected() {
            int i = 0;
            for (int i2 = 0; i2 <= 63; i2++) {
                i = i;
                if (isGemCollected(i2)) {
                    i++;
                }
            }
            return i;
        }

        public boolean isGemCollected(int i) {
            if (i < 0 || i > 63) {
                throw new RuntimeException("isGemCollected id:" + i + " is not in range");
            }
            long j = 1 << i;
            return (this.gemsCollected & j) == j;
        }
    }

    private StateEngine(Context context) {
    }

    public static StateEngine getInstance(Context context) {
        if (stateEngine == null) {
            stateEngine = new StateEngine(context);
            stateEngine.readFromFile(context);
        }
        return stateEngine;
    }

    public String getKey(String str) {
        Integer mapLevel = GameEngine.getMapLevel(str);
        if (mapLevel != null) {
            str = String.valueOf(GameEngine.getFilepath(str)) + "/l" + mapLevel;
        }
        return str;
    }

    public LevelState getLevelState(String str) {
        String key = getKey(str);
        LevelState levelState = this.levelStates.get(key);
        Log.e(GameEngine.TAG, "StateEngine: get(" + str + ")=" + levelState + "  (key=" + key + ")");
        LevelState levelState2 = levelState;
        if (levelState == null) {
            levelState2 = new LevelState();
            levelState2.version = 1;
            levelState2.level = str;
            this.levelStates.put(key, levelState2);
        }
        return levelState2;
    }

    public void readFromFile(Context context) {
        boolean z = false;
        Log.e(GameEngine.TAG, "Trying to load from internal memory");
        try {
            FileInputStream openFileInput = context.openFileInput(this.FILENAME);
            boolean readFromStream = readFromStream(new DataInputStream(openFileInput));
            if (readFromStream) {
                Log.e(GameEngine.TAG, "loaded from internal memory");
            }
            z = readFromStream;
            openFileInput.close();
            z = readFromStream;
        } catch (IOException e) {
            Log.e(GameEngine.TAG, "file read error:", e);
        }
        if (!z) {
            Log.e(GameEngine.TAG, "Trying to load from SD");
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.FILENAME_BACKUP));
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                if (readFromStream(dataInputStream)) {
                    Log.e(GameEngine.TAG, "loaded from SD");
                }
                dataInputStream.close();
                fileInputStream.close();
            } catch (IOException e2) {
                Log.e(GameEngine.TAG, "file read error:", e2);
            }
        }
    }

    public boolean readFromStream(DataInputStream dataInputStream) {
        boolean z;
        try {
            int readInt = dataInputStream.readInt();
            if (readInt > 1) {
                Log.e(GameEngine.TAG, "Warning file is at version:" + readInt);
                z = false;
            } else {
                dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                this.levelStates.clear();
                for (int i = 0; i < readInt2; i++) {
                    LevelState levelState = new LevelState();
                    dataInputStream.readInt();
                    levelState.version = dataInputStream.readInt();
                    String readUTF = dataInputStream.readUTF();
                    String str = readUTF;
                    if (readUTF.equals("maps/challenge/l030;Level 5.tmx")) {
                        Log.e(GameEngine.TAG, "converting:" + readUTF);
                        str = "maps/challenge/l090;Level 7.tmx";
                    }
                    levelState.level = str;
                    levelState.time = dataInputStream.readInt();
                    levelState.completed = dataInputStream.readBoolean();
                    levelState.attempted = dataInputStream.readBoolean();
                    levelState.locked = dataInputStream.readBoolean();
                    levelState.gemsCollected = dataInputStream.readLong();
                    levelState.maxGems = dataInputStream.readInt();
                    this.levelStates.put(getKey(levelState.level), levelState);
                }
                z = true;
            }
        } catch (IOException e) {
            Log.e(GameEngine.TAG, "file read error:", e);
            z = false;
        }
        return z;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0069 -> B:12:0x0021). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0076 -> B:12:0x0021). Please submit an issue!!! */
    public void saveToFile(Context context) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(this.FILENAME, 2);
            DataOutputStream dataOutputStream = new DataOutputStream(openFileOutput);
            saveToStream(dataOutputStream);
            dataOutputStream.close();
            openFileOutput.close();
        } catch (FileNotFoundException e) {
            Log.e(GameEngine.TAG, "file save error:", e);
        } catch (IOException e2) {
            Log.e(GameEngine.TAG, "file save error:", e2);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.FILENAME_BACKUP));
            DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream);
            saveToStream(dataOutputStream2);
            dataOutputStream2.close();
            fileOutputStream.close();
        } catch (IOException e3) {
            Log.e(GameEngine.TAG, "file read error:", e3);
        }
    }

    public boolean saveToStream(DataOutputStream dataOutputStream) {
        boolean z;
        try {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(this.levelStates.size());
            for (LevelState levelState : this.levelStates.values()) {
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(levelState.version);
                dataOutputStream.writeUTF(levelState.level);
                dataOutputStream.writeInt(levelState.time);
                dataOutputStream.writeBoolean(levelState.completed);
                dataOutputStream.writeBoolean(levelState.attempted);
                dataOutputStream.writeBoolean(levelState.locked);
                dataOutputStream.writeLong(levelState.gemsCollected);
                dataOutputStream.writeInt(levelState.maxGems);
            }
            dataOutputStream.flush();
            z = true;
        } catch (IOException e) {
            Log.e(GameEngine.TAG, "file save error:", e);
            z = false;
        }
        return z;
    }
}
