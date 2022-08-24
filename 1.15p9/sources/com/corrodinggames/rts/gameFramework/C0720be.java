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

/* renamed from: com.corrodinggames.rts.gameFramework.be */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/be.class */
public class C0720be {

    /* renamed from: e */
    static C0720be f4533e = null;

    /* renamed from: a */
    public boolean f4534a = false;

    /* renamed from: b */
    String f4535b = "rtsSave";

    /* renamed from: c */
    String f4536c = "rtsSave.bak";

    /* renamed from: d */
    public boolean f4537d = false;

    /* renamed from: f */
    HashMap f4538f = new HashMap();

    /* renamed from: a */
    public void m2628a(Context context) {
        if (GameEngine.f6199aU || this.f4534a) {
            return;
        }
        try {
        } catch (FileNotFoundException e) {
            Log.m6348b("RustedWarfare", "file save error:", e);
        } catch (IOException e2) {
            Log.m6348b("RustedWarfare", "file save error:", e2);
        }
        if (context == null) {
            throw new IOException("context==null");
        }
        try {
            FileOutputStream mo6588b = context.mo6588b(this.f4535b, 0);
            DataOutputStream dataOutputStream = new DataOutputStream(mo6588b);
            m2626a(dataOutputStream);
            dataOutputStream.close();
            mo6588b.close();
            if (this.f4537d) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.f4536c));
                    DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream);
                    m2626a(dataOutputStream2);
                    dataOutputStream2.close();
                    fileOutputStream.close();
                } catch (IOException e3) {
                    Log.m6348b("RustedWarfare", "file read error:", e3);
                }
            }
        } catch (NullPointerException e4) {
            throw new IOException("openFileOutput NullPointerException", e4);
        }
    }

    /* renamed from: a */
    public boolean m2626a(DataOutputStream dataOutputStream) {
        if (GameEngine.f6199aU) {
            return false;
        }
        try {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(this.f4538f.size());
            for (C0721bf c0721bf : this.f4538f.values()) {
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(c0721bf.f4539a);
                dataOutputStream.writeUTF(c0721bf.f4540b);
                dataOutputStream.writeInt(c0721bf.f4541c);
                dataOutputStream.writeBoolean(c0721bf.f4542d);
                dataOutputStream.writeBoolean(c0721bf.f4543e);
                dataOutputStream.writeBoolean(c0721bf.f4544f);
                dataOutputStream.writeLong(c0721bf.f4545g);
                dataOutputStream.writeInt(c0721bf.f4546h);
            }
            dataOutputStream.flush();
            return true;
        } catch (IOException e) {
            Log.m6348b("RustedWarfare", "file save error:", e);
            return false;
        }
    }

    /* renamed from: b */
    public void m2624b(Context context) {
        if (this.f4534a) {
            return;
        }
        boolean z = false;
        Log.m6345d("RustedWarfare", "Trying to load from internal memory");
        try {
            FileInputStream mo6591a = context.mo6591a(this.f4535b);
            z = m2627a(new DataInputStream(mo6591a));
            if (z) {
                Log.m6345d("RustedWarfare", "loaded from internal memory");
            }
            mo6591a.close();
        } catch (IOException e) {
            Log.m6348b("RustedWarfare", "file read error:", e);
        }
        if (this.f4537d && !z) {
            Log.m6345d("RustedWarfare", "Trying to load from SD");
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.f4536c));
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                if (m2627a(dataInputStream)) {
                    Log.m6345d("RustedWarfare", "loaded from SD");
                }
                dataInputStream.close();
                fileInputStream.close();
            } catch (IOException e2) {
                Log.m6348b("RustedWarfare", "file read error:", e2);
            }
        }
    }

    /* renamed from: a */
    public boolean m2627a(DataInputStream dataInputStream) {
        try {
            int readInt = dataInputStream.readInt();
            if (readInt > 1) {
                Log.m6345d("RustedWarfare", "Warning file is at version:" + readInt);
                return false;
            }
            dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            this.f4538f.clear();
            for (int i = 0; i < readInt2; i++) {
                C0721bf c0721bf = new C0721bf(this);
                dataInputStream.readInt();
                c0721bf.f4539a = dataInputStream.readInt();
                String readUTF = dataInputStream.readUTF();
                if (readUTF.equals("maps/challenge/l030;Level 5.tmx")) {
                    Log.m6345d("RustedWarfare", "converting:" + readUTF);
                    readUTF = "maps/challenge/l090;Level 7.tmx";
                }
                c0721bf.f4540b = readUTF;
                c0721bf.f4541c = dataInputStream.readInt();
                c0721bf.f4542d = dataInputStream.readBoolean();
                c0721bf.f4543e = dataInputStream.readBoolean();
                c0721bf.f4544f = dataInputStream.readBoolean();
                c0721bf.f4545g = dataInputStream.readLong();
                c0721bf.f4546h = dataInputStream.readInt();
                this.f4538f.put(m2625a(c0721bf.f4540b), c0721bf);
            }
            return true;
        } catch (IOException e) {
            Log.m6348b("RustedWarfare", "file read error:", e);
            return false;
        }
    }

    /* renamed from: c */
    public static C0720be m2622c(Context context) {
        if (f4533e == null) {
            f4533e = new C0720be(context);
            if (!GameEngine.f6199aU) {
                f4533e.m2624b(context);
            }
        }
        return f4533e;
    }

    private C0720be(Context context) {
    }

    /* renamed from: a */
    public String m2625a(String str) {
        Integer m1103l = GameEngine.m1103l(str);
        if (m1103l != null) {
            return GameEngine.m1108j(str) + "/l" + m1103l;
        }
        return str;
    }

    /* renamed from: b */
    public C0721bf m2623b(String str) {
        String m2625a = m2625a(str);
        C0721bf c0721bf = (C0721bf) this.f4538f.get(m2625a);
        Log.m6345d("RustedWarfare", "StateEngine: get(" + str + ")=" + c0721bf + "  (key=" + m2625a + ")");
        if (c0721bf == null) {
            c0721bf = new C0721bf(this);
            c0721bf.f4539a = 1;
            c0721bf.f4540b = str;
            this.f4538f.put(m2625a, c0721bf);
        }
        return c0721bf;
    }
}
