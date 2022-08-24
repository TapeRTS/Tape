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
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.zip.DataFormatException;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ar.class */
public class C0859ar {

    /* renamed from: b */
    ByteArrayOutputStream f5723b;

    /* renamed from: c */
    DataOutputStream f5724c;

    /* renamed from: a */
    private DataOutputStream f5725a;

    /* renamed from: e */
    private LinkedList f5726e;

    /* renamed from: d */
    public int f5727d;

    /* renamed from: a */
    public void m1580a() {
        ListIterator listIterator = this.f5726e.listIterator(this.f5726e.size());
        while (listIterator.hasPrevious()) {
            ((C0860as) listIterator.previous()).m1545a();
        }
        this.f5724c.flush();
        if (this.f5723b != null) {
            this.f5723b.flush();
        }
    }

    /* renamed from: b */
    void m1561b() {
        this.f5725a = this.f5724c;
    }

    public C0859ar(int i) {
        this();
        this.f5727d = i;
    }

    public C0859ar() {
        this.f5726e = new LinkedList();
        this.f5727d = 999999;
        this.f5723b = new ByteArrayOutputStream();
        this.f5724c = new DataOutputStream(this.f5723b);
        m1561b();
    }

    public C0859ar(DataOutputStream dataOutputStream) {
        this.f5726e = new LinkedList();
        this.f5727d = 999999;
        this.f5724c = dataOutputStream;
        m1561b();
    }

    /* renamed from: b */
    public C0861at m1560b(int i) {
        return m1578a(i, -1);
    }

    /* renamed from: a */
    public C0861at m1578a(int i, int i2) {
        try {
            m1580a();
            C0861at c0861at = new C0861at(i);
            c0861at.f5735c = this.f5723b.toByteArray();
            c0861at.f5738d = i2;
            return c0861at;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public String m1555c() {
        try {
            m1580a();
            return this.f5723b.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public byte[] m1552d() {
        try {
            m1580a();
            return this.f5723b.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void m1554c(int i) {
        this.f5725a.writeByte(i);
    }

    /* renamed from: a */
    public void mo1482a(boolean z) {
        this.f5725a.writeBoolean(z);
    }

    /* renamed from: a */
    public void mo1487a(int i) {
        this.f5725a.writeInt(i);
    }

    /* renamed from: a */
    public void mo1488a(float f) {
        this.f5725a.writeFloat(f);
    }

    /* renamed from: a */
    public void m1579a(double d) {
        this.f5725a.writeDouble(d);
    }

    /* renamed from: a */
    public void m1577a(long j) {
        this.f5725a.writeLong(j);
    }

    /* renamed from: b */
    public void m1557b(String str) {
        mo1482a(str != null);
        if (str != null) {
            m1553c(str);
        }
    }

    /* renamed from: a */
    public void m1563a(Integer num) {
        mo1482a(num != null);
        if (num != null) {
            mo1487a(num.intValue());
        }
    }

    /* renamed from: c */
    public void m1553c(String str) {
        this.f5725a.writeUTF(str);
    }

    /* renamed from: a */
    public void m1573a(C0448g c0448g) {
        if (c0448g == null) {
            this.f5725a.writeUTF(VariableScope.nullOrMissingString);
        }
        this.f5725a.writeUTF(c0448g.toString());
    }

    /* renamed from: a */
    public void m1568a(AbstractC1120w abstractC1120w) {
        if (abstractC1120w == null) {
            this.f5725a.writeLong(-1L);
        } else {
            this.f5725a.writeLong(abstractC1120w.f6945ed);
        }
    }

    /* renamed from: b */
    public void m1558b(AbstractC1120w abstractC1120w) {
        if (abstractC1120w != null && !abstractC1120w.f6946ef) {
            this.f5725a.writeLong(abstractC1120w.f6945ed);
        } else {
            this.f5725a.writeLong(-1L);
        }
    }

    /* renamed from: a */
    public void m1569a(C1101m c1101m) {
        if (c1101m == null) {
            mo1487a(0);
            return;
        }
        mo1487a(c1101m.size());
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            m1558b((AbstractC1120w) it.next());
        }
    }

    /* renamed from: b */
    public void m1559b(Unit unit) {
        if (unit != null && !unit.f6946ef && !unit.isDead) {
            m1568a((AbstractC1120w) unit);
        } else {
            m1568a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void mo1486a(Unit unit) {
        if (unit != null && !unit.f6946ef) {
            m1568a((AbstractC1120w) unit);
        } else {
            m1568a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void m1572a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y != null && !abstractC0623y.f6946ef) {
            m1568a((AbstractC1120w) abstractC0623y);
        } else {
            m1568a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void m1576a(PointF pointF) {
        mo1482a(pointF != null);
        if (pointF != null) {
            mo1488a(pointF.x);
            mo1488a(pointF.y);
        }
    }

    /* renamed from: a */
    public void m1564a(Enum r4) {
        if (r4 == null) {
            this.f5725a.writeInt(-1);
        } else {
            this.f5725a.writeInt(r4.ordinal());
        }
    }

    /* renamed from: a */
    public void m1574a(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            this.f5725a.writeInt(-1);
        } else if (interfaceC0303as instanceof C0453l) {
            this.f5725a.writeInt(-2);
            m1553c(((C0453l) interfaceC0303as).f2920L);
        } else {
            this.f5725a.writeInt(((UnitType) interfaceC0303as).ordinal());
        }
    }

    /* renamed from: a */
    public void m1571a(Connection connection) {
        if (connection == null) {
            this.f5725a.writeInt(0);
        } else {
            this.f5725a.writeInt(connection.f5760c);
        }
    }

    /* renamed from: a */
    public void m1575a(Team team) {
        this.f5725a.writeByte(team.f1305k);
    }

    /* renamed from: a */
    public void m1566a(File file) {
        C1098j m2466a = C0750a.m2466a(file);
        if (m2466a == null) {
            throw new IOException("Failed to read save file data");
        }
        try {
            m1565a(m2466a, (int) file.length());
            if (m2466a != null) {
                m2466a.close();
            }
        } catch (Throwable th) {
            if (m2466a != null) {
                m2466a.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void m1570a(C0876k c0876k) {
        InputStream m1437w = c0876k.m1437w();
        try {
            m1437w.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        m1565a(m1437w, m1437w.available());
    }

    /* renamed from: a */
    public void m1565a(InputStream inputStream, int i) {
        int i2 = 0;
        mo1487a(i);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                if (i2 + read > i) {
                    int i3 = i - i2;
                    if (i3 < 0) {
                        C0831ad.m1648g("writeStream: bytesTillFull is " + i3);
                        return;
                    } else {
                        this.f5725a.write(bArr, 0, i3);
                        return;
                    }
                }
                this.f5725a.write(bArr, 0, read);
                i2 += read;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m1567a(ByteArrayOutputStream byteArrayOutputStream) {
        mo1487a(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.f5725a);
    }

    /* renamed from: a */
    public void m1562a(byte[] bArr) {
        mo1487a(bArr.length);
        this.f5725a.write(bArr);
    }

    /* renamed from: b */
    public void m1556b(byte[] bArr) {
        this.f5725a.write(bArr);
    }

    /* renamed from: a */
    public void mo1483a(short s) {
        this.f5725a.writeShort(s);
    }

    /* renamed from: e */
    public void m1550e() {
        mo1483a((short) 12345);
    }

    /* renamed from: d */
    public void m1551d(String str) {
    }

    /* renamed from: f */
    public boolean m1548f() {
        return false;
    }

    /* renamed from: e */
    public void m1549e(String str) {
        mo1484a(str, false);
    }

    /* renamed from: a */
    public void mo1484a(String str, boolean z) {
        C0860as c0860as = new C0860as(z);
        c0860as.f5730c = str;
        this.f5726e.add(c0860as);
        this.f5725a = ((C0860as) this.f5726e.getLast()).f5731e;
    }

    /* renamed from: a */
    public void mo1485a(String str) {
        C0860as c0860as = (C0860as) this.f5726e.removeLast();
        if (!c0860as.f5730c.equals(str)) {
            GameEngine.m1144b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + c0860as.f5730c);
        }
        c0860as.m1545a();
        if (this.f5726e.isEmpty()) {
            this.f5725a = this.f5724c;
        } else {
            this.f5725a = ((C0860as) this.f5726e.getLast()).f5731e;
        }
        this.f5725a.writeUTF(c0860as.f5730c);
        m1567a(c0860as.f5733d);
        try {
            c0860as.m1544b();
        } catch (Exception e) {
            if (e instanceof DataFormatException) {
                if (!GameEngine.f6204aZ) {
                    GameEngine.m1145b("DataFormatException error calling streamBlock.close() (this is expected on android 4.4)");
                    return;
                }
                return;
            }
            GameEngine.m1145b("Error calling streamBlock.close() to clean up memory");
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public int m1547g() {
        return this.f5727d;
    }

    /* renamed from: h */
    public void m1546h() {
        this.f5724c = null;
        this.f5725a = null;
        try {
            if (this.f5723b != null) {
                this.f5723b.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f5723b = null;
    }
}
