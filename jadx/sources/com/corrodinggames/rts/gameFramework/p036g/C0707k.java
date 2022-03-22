package com.corrodinggames.rts.gameFramework.p036g;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.g.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/k.class */
public class C0707k {

    /* renamed from: a */
    ByteArrayInputStream f5005a;

    /* renamed from: d */
    private DataInputStream f5006d;

    /* renamed from: e */
    private DataInputStream f5007e;

    /* renamed from: f */
    private LinkedList f5008f = new LinkedList();

    /* renamed from: b */
    int f5009b = 999999;

    /* renamed from: c */
    int f5010c = 999999;

    /* renamed from: a */
    void m1094a() {
        this.f5007e = this.f5006d;
    }

    public C0707k(C0692ar arVar) {
        this.f5005a = new ByteArrayInputStream(arVar.f4891c);
        this.f5006d = new DataInputStream(this.f5005a);
        m1094a();
    }

    public C0707k(DataInputStream dataInputStream) {
        this.f5006d = dataInputStream;
        m1094a();
    }

    public C0707k(String str) {
        this.f5005a = new ByteArrayInputStream(str.getBytes());
        this.f5006d = new DataInputStream(this.f5005a);
        m1094a();
    }

    public C0707k(byte[] bArr) {
        this.f5005a = new ByteArrayInputStream(bArr);
        this.f5006d = new DataInputStream(this.f5005a);
        m1094a();
    }

    /* renamed from: a */
    public void m1093a(int i) {
        this.f5009b = i;
    }

    /* renamed from: b */
    public int m1085b() {
        return this.f5009b;
    }

    /* renamed from: b */
    public void m1084b(int i) {
        this.f5010c = i;
    }

    /* renamed from: c */
    public int m1081c() {
        return this.f5010c;
    }

    /* renamed from: d */
    public byte m1079d() {
        return this.f5007e.readByte();
    }

    /* renamed from: e */
    public boolean m1077e() {
        return this.f5007e.readBoolean();
    }

    /* renamed from: f */
    public int m1076f() {
        return this.f5007e.readInt();
    }

    /* renamed from: g */
    public float m1075g() {
        return this.f5007e.readFloat();
    }

    /* renamed from: h */
    public double m1074h() {
        return this.f5007e.readDouble();
    }

    /* renamed from: i */
    public long m1073i() {
        return this.f5007e.readLong();
    }

    /* renamed from: j */
    public String m1072j() {
        if (!m1077e()) {
            return null;
        }
        return m1071k();
    }

    /* renamed from: k */
    public String m1071k() {
        return this.f5007e.readUTF();
    }

    /* renamed from: l */
    public C0364h m1070l() {
        String readUTF = this.f5007e.readUTF();
        if (readUTF.equals("")) {
            return null;
        }
        return C0364h.m3111c(readUTF);
    }

    /* renamed from: m */
    public long m1069m() {
        return this.f5007e.readLong();
    }

    /* renamed from: a */
    public AbstractC0854w m1090a(Class cls) {
        return AbstractC0854w.m402a(this.f5007e.readLong(), cls, false);
    }

    /* renamed from: a */
    public void m1091a(C0835m mVar, Class cls) {
        int f = m1076f();
        for (int i = 0; i < f; i++) {
            AbstractC0854w a = m1090a(cls);
            if (a != null) {
                mVar.add(a);
            }
        }
    }

    /* renamed from: n */
    public AbstractC0210af m1068n() {
        return m1092a(EnumC0709m.f5015b);
    }

    /* renamed from: a */
    public AbstractC0210af m1092a(EnumC0709m mVar) {
        return AbstractC0854w.m401a(this.f5007e.readLong(), mVar == EnumC0709m.f5014a);
    }

    /* renamed from: o */
    public AbstractC0515r m1067o() {
        return AbstractC0854w.m397b(this.f5007e.readLong(), false);
    }

    /* renamed from: b */
    public Enum m1083b(Class cls) {
        int readInt = this.f5007e.readInt();
        if (readInt == -1) {
            return null;
        }
        Object[] enumConstants = cls.getEnumConstants();
        if (readInt >= 0 && readInt < enumConstants.length) {
            return (Enum) enumConstants[readInt];
        }
        Hcat_Multiplaye.m1261f("readEnum:" + readInt + " is out of range for " + cls.toString());
        return null;
    }

    /* renamed from: p */
    public AbstractC0268al m1066p() {
        int readInt = this.f5007e.readInt();
        if (readInt == -1) {
            return null;
        }
        if (readInt == -2) {
            String k = m1071k();
            C0368l l = C0368l.m2912l(k);
            if (l == null) {
                Hcat_Multiplaye.m1261f("readUnitType: Could not find customUnitMetadata:" + k);
            }
            AbstractC0268al c = C0368l.m2933c(l);
            if (c != null) {
                if (c instanceof C0368l) {
                    l = (C0368l) c;
                } else {
                    AbstractC0789l.m695b("replacement not a custom unit:" + c.mo3494i());
                }
            }
            return l;
        }
        Object[] enumConstants = EnumC0215ak.class.getEnumConstants();
        if (readInt >= 0 && readInt < enumConstants.length) {
            return (EnumC0215ak) enumConstants[readInt];
        }
        Hcat_Multiplaye.m1261f("readUnitType:" + readInt + " is out of range for UnitType");
        return null;
    }

    /* renamed from: q */
    public AbstractC0171m m1065q() {
        return AbstractC0171m.m3740n(this.f5007e.readByte());
    }

    /* renamed from: r */
    public byte[] m1064r() {
        int read;
        int i = 0;
        int f = m1076f();
        byte[] bArr = new byte[f];
        while (i < f && (read = this.f5007e.read(bArr, i, f - i)) != -1) {
            i += read;
        }
        return bArr;
    }

    /* renamed from: s */
    public C0707k m1063s() {
        return new C0707k(m1064r());
    }

    /* renamed from: t */
    public short m1062t() {
        return this.f5007e.readShort();
    }

    /* renamed from: a */
    public void m1089a(String str) {
        if (m1062t() != 12345) {
            Hcat_Multiplaye.m1261f("Mark wasn't read for:" + str);
        }
    }

    /* renamed from: u */
    public InputStream m1061u() {
        return this.f5007e;
    }

    /* renamed from: b */
    public void m1082b(String str) {
        m1088a(str, false);
    }

    /* renamed from: v */
    public String m1060v() {
        return m1086a(false, false);
    }

    /* renamed from: a */
    public void m1088a(String str, boolean z) {
        m1087a(str, z, false);
    }

    /* renamed from: a */
    public void m1087a(String str, boolean z, boolean z2) {
        if (this.f5009b < 11) {
            AbstractC0789l.m683d("Skipping start block:" + str);
            return;
        }
        String a = m1086a(z, z2);
        if (!a.equals(str)) {
            AbstractC0789l.m694b("InputNetStream:endBlock", "Name does not match: expected:" + str + " , got:" + a);
        }
    }

    /* renamed from: c */
    public byte[] m1080c(String str) {
        String readUTF = this.f5007e.readUTF();
        if (!readUTF.equals(str)) {
            AbstractC0789l.m694b("getBlockRaw", "Name does not match: expected:" + str + " , got:" + readUTF);
        }
        return m1064r();
    }

    /* renamed from: a */
    public String m1086a(boolean z, boolean z2) {
        if (this.f5009b < 11) {
            AbstractC0789l.m683d("Skipping start block: startBlockAndGetName()");
            return "<skipped>";
        }
        String readUTF = this.f5007e.readUTF();
        C0708l lVar = new C0708l(m1064r(), z, z2);
        lVar.f5011a = readUTF;
        this.f5008f.add(lVar);
        this.f5007e = ((C0708l) this.f5008f.getLast()).f5013c;
        return readUTF;
    }

    /* renamed from: d */
    public void m1078d(String str) {
        if (this.f5009b < 11) {
            AbstractC0789l.m683d("Skipping end block:" + str);
            return;
        }
        C0708l lVar = (C0708l) this.f5008f.removeLast();
        if (!lVar.f5011a.equals(str)) {
            AbstractC0789l.m694b("InputNetStream:endBlock", "Name does not match: expected" + str + " ," + lVar.f5011a);
        }
        if (this.f5008f.isEmpty()) {
            this.f5007e = this.f5006d;
        } else {
            this.f5007e = ((C0708l) this.f5008f.getLast()).f5013c;
        }
    }

    /* renamed from: w */
    public PointF m1059w() {
        if (!m1077e()) {
            return null;
        }
        PointF pointF = new PointF();
        pointF.f224a = m1075g();
        pointF.f225b = m1075g();
        return pointF;
    }
}
