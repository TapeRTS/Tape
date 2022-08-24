package com.corrodinggames.rts.gameFramework.p041i;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.i.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/k.class */
public class C0876k {

    /* renamed from: a */
    ByteArrayInputStream f5855a;

    /* renamed from: d */
    private DataInputStream f5856d;

    /* renamed from: e */
    private DataInputStream f5857e;

    /* renamed from: f */
    private LinkedList f5858f = new LinkedList();

    /* renamed from: b */
    int f5859b = 999999;

    /* renamed from: c */
    int f5860c = 999999;

    /* renamed from: a */
    void m1472a() {
        this.f5857e = this.f5856d;
    }

    public C0876k(C0861at c0861at) {
        this.f5855a = new ByteArrayInputStream(c0861at.f5735c);
        this.f5856d = new DataInputStream(this.f5855a);
        m1472a();
    }

    public C0876k(DataInputStream dataInputStream) {
        this.f5856d = dataInputStream;
        m1472a();
    }

    public C0876k(String str) {
        this.f5855a = new ByteArrayInputStream(str.getBytes());
        this.f5856d = new DataInputStream(this.f5855a);
        m1472a();
    }

    public C0876k(byte[] bArr) {
        this.f5855a = new ByteArrayInputStream(bArr);
        this.f5856d = new DataInputStream(this.f5855a);
        m1472a();
    }

    /* renamed from: a */
    public void m1471a(int i) {
        this.f5859b = i;
    }

    /* renamed from: b */
    public int m1463b() {
        return this.f5859b;
    }

    /* renamed from: b */
    public void m1462b(int i) {
        this.f5860c = i;
    }

    /* renamed from: c */
    public int m1459c() {
        return this.f5860c;
    }

    /* renamed from: d */
    public byte m1457d() {
        return this.f5857e.readByte();
    }

    /* renamed from: e */
    public boolean m1455e() {
        return this.f5857e.readBoolean();
    }

    /* renamed from: f */
    public int m1454f() {
        return this.f5857e.readInt();
    }

    /* renamed from: g */
    public float m1453g() {
        return this.f5857e.readFloat();
    }

    /* renamed from: h */
    public double m1452h() {
        return this.f5857e.readDouble();
    }

    /* renamed from: i */
    public long m1451i() {
        return this.f5857e.readLong();
    }

    /* renamed from: j */
    public String m1450j() {
        if (!m1455e()) {
            return null;
        }
        return m1448l();
    }

    /* renamed from: k */
    public Integer m1449k() {
        if (!m1455e()) {
            return null;
        }
        return Integer.valueOf(m1454f());
    }

    /* renamed from: l */
    public String m1448l() {
        return this.f5857e.readUTF();
    }

    /* renamed from: m */
    public C0448g m1447m() {
        String readUTF = this.f5857e.readUTF();
        if (readUTF.equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        return C0448g.m5054c(readUTF);
    }

    /* renamed from: n */
    public long m1446n() {
        return this.f5857e.readLong();
    }

    /* renamed from: a */
    public AbstractC1120w m1468a(Class cls) {
        return AbstractC1120w.m468a(this.f5857e.readLong(), cls, false);
    }

    /* renamed from: a */
    public void m1469a(C1101m c1101m, Class cls) {
        int m1454f = m1454f();
        for (int i = 0; i < m1454f; i++) {
            AbstractC1120w m1468a = m1468a(cls);
            if (m1468a != null) {
                c1101m.add(m1468a);
            }
        }
    }

    /* renamed from: o */
    public Unit m1445o() {
        return m1470a(EnumC0878m.f5865b);
    }

    /* renamed from: a */
    public Unit m1470a(EnumC0878m enumC0878m) {
        return AbstractC1120w.m467a(this.f5857e.readLong(), enumC0878m == EnumC0878m.f5864a);
    }

    /* renamed from: p */
    public AbstractC0623y m1444p() {
        return AbstractC1120w.m463b(this.f5857e.readLong(), false);
    }

    /* renamed from: b */
    public Enum m1461b(Class cls) {
        int readInt = this.f5857e.readInt();
        if (readInt == -1) {
            return null;
        }
        Object[] enumConstants = cls.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            C0831ad.m1648g("readEnum:" + readInt + " is out of range for " + cls.toString());
            return null;
        }
        return (Enum) enumConstants[readInt];
    }

    /* renamed from: q */
    public InterfaceC0303as m1443q() {
        int readInt = this.f5857e.readInt();
        if (readInt == -1) {
            return null;
        }
        if (readInt == -2) {
            String m1448l = m1448l();
            C0453l m4713n = C0453l.m4713n(m1448l);
            if (m4713n == null) {
                C0831ad.m1648g("readUnitType: Could not find customUnitMetadata:" + m1448l);
            }
            InterfaceC0303as m4738c = C0453l.m4738c(m4713n);
            if (m4738c != null) {
                if (m4738c instanceof C0453l) {
                    m4713n = (C0453l) m4738c;
                } else {
                    GameEngine.m1145b("replacement not a custom unit:" + m4738c.mo5706i());
                }
            }
            return m4713n;
        }
        Object[] enumConstants = UnitType.class.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            C0831ad.m1648g("readUnitType:" + readInt + " is out of range for UnitType");
            return null;
        }
        return (UnitType) enumConstants[readInt];
    }

    /* renamed from: r */
    public Team m1442r() {
        byte readByte = this.f5857e.readByte();
        Team m6317k = Team.m6317k(readByte);
        if (m6317k == null) {
            throw new IOException("Error loading save data, could not find referenced team:" + ((int) readByte) + VariableScope.nullOrMissingString);
        }
        return m6317k;
    }

    /* renamed from: s */
    public Team m1441s() {
        return Team.m6317k(this.f5857e.readByte());
    }

    /* renamed from: t */
    public byte[] m1440t() {
        int read;
        int i = 0;
        int m1454f = m1454f();
        byte[] bArr = new byte[m1454f];
        while (i < m1454f && (read = this.f5857e.read(bArr, i, m1454f - i)) != -1) {
            i += read;
        }
        return bArr;
    }

    /* renamed from: u */
    public C0876k m1439u() {
        return new C0876k(m1440t());
    }

    /* renamed from: v */
    public short m1438v() {
        return this.f5857e.readShort();
    }

    /* renamed from: a */
    public void m1467a(String str) {
        if (m1438v() != 12345) {
            C0831ad.m1648g("Mark wasn't read for:" + str);
            if (GameEngine.getInstance().m1209Z()) {
                throw new RuntimeException("Mark wasn't read for:" + str);
            }
        }
    }

    /* renamed from: w */
    public InputStream m1437w() {
        return this.f5857e;
    }

    /* renamed from: b */
    public void m1460b(String str) {
        m1466a(str, false);
    }

    /* renamed from: x */
    public String m1436x() {
        return m1464a(false, false);
    }

    /* renamed from: a */
    public void m1466a(String str, boolean z) {
        m1465a(str, z, false);
    }

    /* renamed from: a */
    public void m1465a(String str, boolean z, boolean z2) {
        if (this.f5859b < 11) {
            GameEngine.PrintLog("Skipping start block:" + str);
            return;
        }
        String m1464a = m1464a(z, z2);
        if (!m1464a.equals(str)) {
            GameEngine.m1144b("InputNetStream:endBlock", "Name does not match: expected:" + str + " , got:" + m1464a);
        }
    }

    /* renamed from: c */
    public byte[] m1458c(String str) {
        String readUTF = this.f5857e.readUTF();
        if (!readUTF.equals(str)) {
            GameEngine.m1144b("getBlockRaw", "Name does not match: expected:" + str + " , got:" + readUTF);
        }
        return m1440t();
    }

    /* renamed from: a */
    public String m1464a(boolean z, boolean z2) {
        if (this.f5859b < 11) {
            GameEngine.PrintLog("Skipping start block: startBlockAndGetName()");
            return "<skipped>";
        }
        String readUTF = this.f5857e.readUTF();
        C0877l c0877l = new C0877l(m1440t(), z, z2);
        c0877l.f5861a = readUTF;
        this.f5858f.add(c0877l);
        this.f5857e = ((C0877l) this.f5858f.getLast()).f5863c;
        return readUTF;
    }

    /* renamed from: d */
    public void m1456d(String str) {
        if (this.f5859b < 11) {
            GameEngine.PrintLog("Skipping end block:" + str);
            return;
        }
        C0877l c0877l = (C0877l) this.f5858f.removeLast();
        if (!c0877l.f5861a.equals(str)) {
            GameEngine.m1144b("InputNetStream:endBlock", "Name does not match: expected" + str + " ," + c0877l.f5861a);
        }
        if (this.f5858f.isEmpty()) {
            this.f5857e = this.f5856d;
        } else {
            this.f5857e = ((C0877l) this.f5858f.getLast()).f5863c;
        }
    }

    /* renamed from: y */
    public PointF m1435y() {
        if (!m1455e()) {
            return null;
        }
        PointF pointF = new PointF();
        pointF.x = m1453g();
        pointF.y = m1453g();
        return pointF;
    }
}
