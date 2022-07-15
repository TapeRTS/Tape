package com.corrodinggames.rts.gameFramework.network;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.ValueListSource;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.h.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/k.class */
public class InputNetStream {

    /* renamed from: a */
    ByteArrayInputStream buffer;

    /* renamed from: d */
    private DataInputStream streamA;

    /* renamed from: e */
    private DataInputStream stream;

    /* renamed from: f */
    private LinkedList f5410f = new LinkedList();

    /* renamed from: b */
    int f5411b = 999999;

    /* renamed from: c */
    int StreamVersion = 999999;

    /* renamed from: a */
    void m1246a() {
        this.stream = this.streamA;
    }

    public InputNetStream(Packet packet) {
        this.buffer = new ByteArrayInputStream(packet.bytes);
        this.streamA = new DataInputStream(this.buffer);
        m1246a();
    }

    public InputNetStream(DataInputStream dataInputStream) {
        this.streamA = dataInputStream;
        m1246a();
    }

    public InputNetStream(String str) {
        this.buffer = new ByteArrayInputStream(str.getBytes());
        this.streamA = new DataInputStream(this.buffer);
        m1246a();
    }

    public InputNetStream(byte[] bArr) {
        this.buffer = new ByteArrayInputStream(bArr);
        this.streamA = new DataInputStream(this.buffer);
        m1246a();
    }

    /* renamed from: a */
    public void m1245a(int i) {
        this.f5411b = i;
    }

    /* renamed from: b */
    public int m1237b() {
        return this.f5411b;
    }

    /* renamed from: b */
    public void setStreamVersion(int ver) {
        this.StreamVersion = ver;
    }

    /* renamed from: c */
    public int getStreamVersion() {
        return this.StreamVersion;
    }

    /* renamed from: d */
    public byte readByte() {
        return this.stream.readByte();
    }

    /* renamed from: e */
    public boolean readBoolean() {
        return this.stream.readBoolean();
    }

    /* renamed from: f */
    public int readInt() {
        return this.stream.readInt();
    }

    /* renamed from: g */
    public float readFloat() {
        return this.stream.readFloat();
    }

    /* renamed from: h */
    public double readDouble() {
        return this.stream.readDouble();
    }

    /* renamed from: i */
    public long readLong() {
        return this.stream.readLong();
    }

    /* renamed from: j */
    public String m1224j() {
        if (!readBoolean()) {
            return null;
        }
        return readString();
    }

    /* renamed from: k */
    public Integer m1223k() {
        if (!readBoolean()) {
            return null;
        }
        return Integer.valueOf(readInt());
    }

    /* renamed from: l */
    public String readString() {
        return this.stream.readUTF();
    }

    /* renamed from: m */
    public ValueListSource m1221m() {
        String readUTF = this.stream.readUTF();
        if (readUTF.equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        return ValueListSource.getValueListSource(readUTF);
    }

    /* renamed from: n */
    public long m1220n() {
        return this.stream.readLong();
    }

    /* renamed from: a */
    public GameObject readGameObject(Class cls) {
        return GameObject.getFromId(this.stream.readLong(), cls, false);
    }

    /* renamed from: a */
    public void m1243a(ObjectVector objectVector, Class cls) {
        int readInt = readInt();
        for (int i = 0; i < readInt; i++) {
            GameObject readGameObject = readGameObject(cls);
            if (readGameObject != null) {
                objectVector.add(readGameObject);
            }
        }
    }

    /* renamed from: o */
    public Unit m1219o() {
        return m1244a(EnumC0796m.f5417b);
    }

    /* renamed from: a */
    public Unit m1244a(EnumC0796m enumC0796m) {
        return GameObject.m429a(this.stream.readLong(), enumC0796m == EnumC0796m.f5416a);
    }

    /* renamed from: p */
    public OrderableUnit m1218p() {
        return GameObject.m425b(this.stream.readLong(), false);
    }

    /* renamed from: b */
    public Enum readEnum(Class cls) {
        int readInt = this.stream.readInt();
        if (readInt == -1) {
            return null;
        }
        Object[] enumConstants = cls.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            NetworkEngine.reportDesync("readEnum:" + readInt + " is out of range for " + cls.toString());
            return null;
        }
        return (Enum) enumConstants[readInt];
    }

    /* renamed from: q */
    public UnitType readUnitType() {
        int readInt = this.stream.readInt();
        if (readInt == -1) {
            return null;
        }
        if (readInt == -2) {
            String readString = readString();
            CustomUnitMetadata m3080l = CustomUnitMetadata.m3080l(readString);
            if (m3080l == null) {
                NetworkEngine.reportDesync("readUnitType: Could not find customUnitMetadata:" + readString);
            }
            UnitType m3101c = CustomUnitMetadata.m3101c(m3080l);
            if (m3101c != null) {
                if (m3101c instanceof CustomUnitMetadata) {
                    m3080l = (CustomUnitMetadata) m3101c;
                } else {
                    GameEngine.log("replacement not a custom unit:" + m3101c.mo3087i());
                }
            }
            return m3080l;
        }
        Object[] enumConstants = com.corrodinggames.rts.game.units.UnitType.class.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            NetworkEngine.reportDesync("readUnitType:" + readInt + " is out of range for UnitType");
            return null;
        }
        return (com.corrodinggames.rts.game.units.UnitType) enumConstants[readInt];
    }

    /* renamed from: r */
    public Team m1216r() {
        byte readByte = this.stream.readByte();
        Team team = Team.getTeam(readByte);
        if (team == null) {
            throw new IOException("Error loading save data, could not find referenced team:" + ((int) readByte) + VariableScope.nullOrMissingString);
        }
        return team;
    }

    /* renamed from: s */
    public Team m1215s() {
        return Team.getTeam(this.stream.readByte());
    }

    /* renamed from: t */
    public byte[] m1214t() {
        int read;
        int i = 0;
        int readInt = readInt();
        byte[] bArr = new byte[readInt];
        while (i < readInt && (read = this.stream.read(bArr, i, readInt - i)) != -1) {
            i += read;
        }
        return bArr;
    }

    /* renamed from: u */
    public InputNetStream m1213u() {
        return new InputNetStream(m1214t());
    }

    /* renamed from: v */
    public short m1212v() {
        return this.stream.readShort();
    }

    /* renamed from: a */
    public void m1241a(String str) {
        if (m1212v() != 12345) {
            NetworkEngine.reportDesync("Mark wasn't read for:" + str);
            if (GameEngine.getInstance().m907W()) {
                throw new RuntimeException("Mark wasn't read for:" + str);
            }
        }
    }

    /* renamed from: w */
    public InputStream m1211w() {
        return this.stream;
    }

    /* renamed from: b */
    public void m1234b(String str) {
        m1240a(str, false);
    }

    /* renamed from: x */
    public String m1210x() {
        return startBlockAndGetName(false, false);
    }

    /* renamed from: a */
    public void m1240a(String str, boolean z) {
        m1239a(str, z, false);
    }

    /* renamed from: a */
    public void m1239a(String str, boolean z, boolean z2) {
        if (this.f5411b < 11) {
            GameEngine.PrintLOG("Skipping start block:" + str);
            return;
        }
        String startBlockAndGetName = startBlockAndGetName(z, z2);
        if (!startBlockAndGetName.equals(str)) {
            GameEngine.log("InputNetStream:endBlock", "Name does not match: expected:" + str + " , got:" + startBlockAndGetName);
        }
    }

    /* renamed from: c */
    public byte[] m1232c(String str) {
        String readUTF = this.stream.readUTF();
        if (!readUTF.equals(str)) {
            GameEngine.log("getBlockRaw", "Name does not match: expected:" + str + " , got:" + readUTF);
        }
        return m1214t();
    }

    /* renamed from: a */
    public String startBlockAndGetName(boolean z, boolean z2) {
        if (this.f5411b < 11) {
            GameEngine.PrintLOG("Skipping start block: startBlockAndGetName()");
            return "<skipped>";
        }
        String readUTF = this.stream.readUTF();
        C0795l c0795l = new C0795l(m1214t(), z, z2);
        c0795l.f5413a = readUTF;
        this.f5410f.add(c0795l);
        this.stream = ((C0795l) this.f5410f.getLast()).f5415c;
        return readUTF;
    }

    /* renamed from: d */
    public void m1230d(String str) {
        if (this.f5411b < 11) {
            GameEngine.PrintLOG("Skipping end block:" + str);
            return;
        }
        C0795l c0795l = (C0795l) this.f5410f.removeLast();
        if (!c0795l.f5413a.equals(str)) {
            GameEngine.log("InputNetStream:endBlock", "Name does not match: expected" + str + " ," + c0795l.f5413a);
        }
        if (this.f5410f.isEmpty()) {
            this.stream = this.streamA;
        } else {
            this.stream = ((C0795l) this.f5410f.getLast()).f5415c;
        }
    }

    /* renamed from: y */
    public PointF m1209y() {
        if (!readBoolean()) {
            return null;
        }
        PointF pointF = new PointF();
        pointF.x = readFloat();
        pointF.y = readFloat();
        return pointF;
    }
}