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
public class C0581be {

    /* renamed from: e */
    static C0581be f4014e = null;

    /* renamed from: a */
    public boolean f4010a = false;

    /* renamed from: b */
    String f4011b = "rtsSave";

    /* renamed from: c */
    String f4012c = "rtsSave.bak";

    /* renamed from: d */
    public boolean f4013d = false;

    /* renamed from: f */
    HashMap f4015f = new HashMap();

    /* renamed from: a */
    public void m1934a(Context context) {
        if (!AbstractC0789l.f5471aF && !this.f4010a) {
            try {
            } catch (FileNotFoundException e) {
                Log.m4036b("RustedWarfare", "file save error:", e);
            } catch (IOException e2) {
                Log.m4036b("RustedWarfare", "file save error:", e2);
            }
            if (context == null) {
                throw new IOException("context==null");
            }
            try {
                FileOutputStream b = context.mo4278b(this.f4011b, 0);
                DataOutputStream dataOutputStream = new DataOutputStream(b);
                m1932a(dataOutputStream);
                dataOutputStream.close();
                b.close();
                if (this.f4013d) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.f4012c));
                        DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream);
                        m1932a(dataOutputStream2);
                        dataOutputStream2.close();
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        Log.m4036b("RustedWarfare", "file read error:", e3);
                    }
                }
            } catch (NullPointerException e4) {
                throw new IOException("openFileOutput NullPointerException", e4);
            }
        }
    }

    /* renamed from: a */
    public boolean m1932a(DataOutputStream dataOutputStream) {
        if (AbstractC0789l.f5471aF) {
            return false;
        }
        try {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(this.f4015f.size());
            for (C0582bf bfVar : this.f4015f.values()) {
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(bfVar.f4016a);
                dataOutputStream.writeUTF(bfVar.f4017b);
                dataOutputStream.writeInt(bfVar.f4018c);
                dataOutputStream.writeBoolean(bfVar.f4019d);
                dataOutputStream.writeBoolean(bfVar.f4020e);
                dataOutputStream.writeBoolean(bfVar.f4021f);
                dataOutputStream.writeLong(bfVar.f4022g);
                dataOutputStream.writeInt(bfVar.f4023h);
            }
            dataOutputStream.flush();
            return true;
        } catch (IOException e) {
            Log.m4036b("RustedWarfare", "file save error:", e);
            return false;
        }
    }

    /* renamed from: b */
    public void m1930b(Context context) {
        if (!this.f4010a) {
            boolean z = false;
            Log.m4033d("RustedWarfare", "Trying to load from internal memory");
            try {
                FileInputStream a = context.mo4281a(this.f4011b);
                z = m1933a(new DataInputStream(a));
                if (z) {
                    Log.m4033d("RustedWarfare", "loaded from internal memory");
                }
                a.close();
            } catch (IOException e) {
                Log.m4036b("RustedWarfare", "file read error:", e);
            }
            if (this.f4013d && !z) {
                Log.m4033d("RustedWarfare", "Trying to load from SD");
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.f4012c));
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    if (m1933a(dataInputStream)) {
                        Log.m4033d("RustedWarfare", "loaded from SD");
                    }
                    dataInputStream.close();
                    fileInputStream.close();
                } catch (IOException e2) {
                    Log.m4036b("RustedWarfare", "file read error:", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m1933a(DataInputStream dataInputStream) {
        try {
            int readInt = dataInputStream.readInt();
            if (readInt > 1) {
                Log.m4033d("RustedWarfare", "Warning file is at version:" + readInt);
                return false;
            }
            dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            this.f4015f.clear();
            for (int i = 0; i < readInt2; i++) {
                C0582bf bfVar = new C0582bf(this);
                dataInputStream.readInt();
                bfVar.f4016a = dataInputStream.readInt();
                String readUTF = dataInputStream.readUTF();
                if (readUTF.equals("maps/challenge/l030;Level 5.tmx")) {
                    Log.m4033d("RustedWarfare", "converting:" + readUTF);
                    readUTF = "maps/challenge/l090;Level 7.tmx";
                }
                bfVar.f4017b = readUTF;
                bfVar.f4018c = dataInputStream.readInt();
                bfVar.f4019d = dataInputStream.readBoolean();
                bfVar.f4020e = dataInputStream.readBoolean();
                bfVar.f4021f = dataInputStream.readBoolean();
                bfVar.f4022g = dataInputStream.readLong();
                bfVar.f4023h = dataInputStream.readInt();
                this.f4015f.put(m1931a(bfVar.f4017b), bfVar);
            }
            return true;
        } catch (IOException e) {
            Log.m4036b("RustedWarfare", "file read error:", e);
            return false;
        }
    }

    /* renamed from: c */
    public static C0581be m1928c(Context context) {
        if (f4014e == null) {
            f4014e = new C0581be(context);
            if (!AbstractC0789l.f5471aF) {
                f4014e.m1930b(context);
            }
        }
        return f4014e;
    }

    private C0581be(Context context) {
    }

    /* renamed from: a */
    public String m1931a(String str) {
        Integer k = AbstractC0789l.m648k(str);
        if (k != null) {
            return AbstractC0789l.m654i(str) + "/l" + k;
        }
        return str;
    }

    /* renamed from: b */
    public C0582bf m1929b(String str) {
        String a = m1931a(str);
        C0582bf bfVar = (C0582bf) this.f4015f.get(a);
        Log.m4033d("RustedWarfare", "StateEngine: get(" + str + ")=" + bfVar + "  (key=" + a + ")");
        if (bfVar == null) {
            bfVar = new C0582bf(this);
            bfVar.f4016a = 1;
            bfVar.f4017b = str;
            this.f4015f.put(a, bfVar);
        }
        return bfVar;
    }
}
