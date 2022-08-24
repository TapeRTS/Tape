package com.corrodinggames.rts.gameFramework.p041i;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.corrodinggames.rts.gameFramework.i.av */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/av.class */
public class C0863av extends C0859ar {

    /* renamed from: a */
    ByteArrayOutputStream f5742a;

    /* renamed from: e */
    PrintStream f5743e;

    /* renamed from: f */
    private PrintStream f5744f;

    /* renamed from: g */
    private LinkedList f5745g;

    /* renamed from: a */
    public void m1543a() {
        ListIterator listIterator = this.f5745g.listIterator(this.f5745g.size());
        while (listIterator.hasPrevious()) {
            ((C0864aw) listIterator.previous()).m1516a();
        }
        this.f5743e.flush();
        if (this.f5742a != null) {
            this.f5742a.flush();
        }
    }

    /* renamed from: b */
    void m1529b() {
        this.f5744f = this.f5743e;
    }

    public C0863av() {
        this.f5745g = new LinkedList();
        this.f5742a = new ByteArrayOutputStream();
        this.f5743e = new PrintStream(this.f5742a);
        m1529b();
    }

    public C0863av(PrintStream printStream) {
        this.f5745g = new LinkedList();
        this.f5743e = printStream;
        m1529b();
    }

    /* renamed from: b */
    public C0861at m1528b(int i) {
        return m1542a(i, -1);
    }

    /* renamed from: a */
    public C0861at m1542a(int i, int i2) {
        try {
            m1543a();
            C0861at c0861at = new C0861at(i);
            c0861at.f5735c = this.f5742a.toByteArray();
            c0861at.f5738d = i2;
            return c0861at;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public String m1524c() {
        try {
            m1543a();
            return this.f5742a.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public byte[] m1521d() {
        try {
            m1543a();
            return this.f5742a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void m1523c(int i) {
        this.f5744f.println(i);
    }

    /* renamed from: a */
    public void mo1482a(boolean z) {
        this.f5744f.println(z);
    }

    /* renamed from: a */
    public void mo1487a(int i) {
        this.f5744f.println("#int:");
        this.f5744f.println(i);
    }

    /* renamed from: a */
    public void mo1488a(float f) {
        this.f5744f.println("#writeFloat");
        this.f5744f.println(f);
    }

    /* renamed from: a */
    public void m1541a(long j) {
        this.f5744f.println("#writeLong");
        this.f5744f.println(j);
    }

    /* renamed from: b */
    public void m1525b(String str) {
        mo1482a(str != null);
        if (str != null) {
            m1522c(str);
        }
    }

    /* renamed from: c */
    public void m1522c(String str) {
        this.f5744f.println(str);
    }

    /* renamed from: a */
    public void m1535a(AbstractC1120w abstractC1120w) {
        this.f5744f.println("#writeGameObject:");
        if (abstractC1120w == null) {
            this.f5744f.println(-1);
        } else {
            this.f5744f.println(abstractC1120w.f6945ed);
        }
    }

    /* renamed from: b */
    public void m1526b(AbstractC1120w abstractC1120w) {
        this.f5744f.println("#writeExistingGameObject:");
        if (abstractC1120w != null && !abstractC1120w.f6946ef) {
            this.f5744f.println(abstractC1120w.f6945ed);
        } else {
            this.f5744f.println(-1);
        }
    }

    /* renamed from: b */
    public void m1527b(Unit unit) {
        if (unit != null && !unit.f6946ef && !unit.isDead) {
            m1535a((AbstractC1120w) unit);
        } else {
            m1535a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void mo1486a(Unit unit) {
        if (unit != null && !unit.f6946ef) {
            m1535a((AbstractC1120w) unit);
        } else {
            m1535a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void m1537a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y != null && !abstractC0623y.f6946ef) {
            m1535a((AbstractC1120w) abstractC0623y);
        } else {
            m1535a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void m1540a(PointF pointF) {
        this.f5744f.println("#PointF:");
        mo1482a(pointF != null);
        if (pointF != null) {
            mo1488a(pointF.x);
            mo1488a(pointF.y);
        }
    }

    /* renamed from: a */
    public void m1531a(Enum r5) {
        if (r5 == null) {
            this.f5744f.println("#Enum: null");
            this.f5744f.println(-1);
            return;
        }
        this.f5744f.println("#Enum:" + r5.getClass().getSimpleName() + " : " + r5.toString());
        this.f5744f.println(r5.ordinal());
    }

    /* renamed from: a */
    public void m1538a(InterfaceC0303as interfaceC0303as) {
        this.f5744f.println("#unitType:");
        if (interfaceC0303as == null) {
            this.f5744f.println(-1);
        } else if (interfaceC0303as instanceof C0453l) {
            this.f5744f.println(-2);
            m1522c(((C0453l) interfaceC0303as).f2920L);
        } else {
            this.f5744f.println(((UnitType) interfaceC0303as).ordinal());
        }
    }

    /* renamed from: a */
    public void m1536a(Connection connection) {
        if (connection == null) {
            this.f5744f.println(0);
        } else {
            this.f5744f.println(connection.f5760c);
        }
    }

    /* renamed from: a */
    public void m1539a(Team team) {
        this.f5744f.println("#team:");
        this.f5744f.println(team.f1305k);
    }

    /* renamed from: a */
    public void m1533a(File file) {
        C1098j m2466a = C0750a.m2466a(file);
        try {
            m1532a(m2466a, (int) file.length());
        } finally {
            m2466a.close();
        }
    }

    /* renamed from: a */
    public void m1532a(InputStream inputStream, int i) {
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
                        this.f5744f.write(bArr, 0, i3);
                        return;
                    }
                }
                this.f5744f.write(bArr, 0, read);
                i2 += read;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m1534a(ByteArrayOutputStream byteArrayOutputStream) {
        mo1487a(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.f5744f);
    }

    /* renamed from: a */
    public void m1530a(byte[] bArr) {
        mo1487a(bArr.length);
        this.f5744f.write(bArr);
    }

    /* renamed from: a */
    public void mo1483a(short s) {
        this.f5744f.println("#writeShort");
        this.f5744f.println((int) s);
    }

    /* renamed from: e */
    public void m1519e() {
        this.f5744f.println("#writeMark:");
        mo1483a((short) 12345);
    }

    /* renamed from: d */
    public void m1520d(String str) {
        this.f5744f.println("#writeIfDebugOnly: " + str);
    }

    /* renamed from: f */
    public boolean m1517f() {
        return true;
    }

    /* renamed from: e */
    public void m1518e(String str) {
        mo1484a(str, false);
    }

    /* renamed from: a */
    public void mo1484a(String str, boolean z) {
        C0864aw c0864aw = new C0864aw(z);
        c0864aw.f5747b = str;
        this.f5745g.add(c0864aw);
        this.f5744f = ((C0864aw) this.f5745g.getLast()).f5748d;
    }

    /* renamed from: a */
    public void mo1485a(String str) {
        C0864aw c0864aw = (C0864aw) this.f5745g.removeLast();
        if (!c0864aw.f5747b.equals(str)) {
            GameEngine.m1144b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + c0864aw.f5747b);
        }
        c0864aw.m1516a();
        if (this.f5745g.isEmpty()) {
            this.f5744f = this.f5743e;
        } else {
            this.f5744f = ((C0864aw) this.f5745g.getLast()).f5748d;
        }
        String str2 = VariableScope.nullOrMissingString;
        String str3 = VariableScope.nullOrMissingString;
        for (int i = 0; i < this.f5745g.size(); i++) {
            str2 = str2 + ">";
            str3 = str3 + "<";
        }
        this.f5744f.println(str2 + ">>>> Start of block: " + c0864aw.f5747b);
        m1534a(c0864aw.f5750c);
        this.f5744f.println(str3 + "<<<< End of block: " + c0864aw.f5747b);
        c0864aw.m1515b();
    }
}
