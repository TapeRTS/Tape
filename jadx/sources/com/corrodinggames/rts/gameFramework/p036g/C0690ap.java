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
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.zip.DataFormatException;

/* renamed from: com.corrodinggames.rts.gameFramework.g.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/ap.class */
public class C0690ap {

    /* renamed from: b */
    ByteArrayOutputStream f4879b;

    /* renamed from: c */
    DataOutputStream f4880c;

    /* renamed from: a */
    private DataOutputStream f4881a;

    /* renamed from: e */
    private LinkedList f4882e;

    /* renamed from: d */
    public int f4883d;

    /* renamed from: a */
    public void m1200a() {
        ListIterator listIterator = this.f4882e.listIterator(this.f4882e.size());
        while (listIterator.hasPrevious()) {
            ((C0691aq) listIterator.previous()).m1166a();
        }
        this.f4880c.flush();
        if (this.f4879b != null) {
            this.f4879b.flush();
        }
    }

    /* renamed from: b */
    void m1182b() {
        this.f4881a = this.f4880c;
    }

    public C0690ap(int i) {
        this();
        this.f4883d = i;
    }

    public C0690ap() {
        this.f4882e = new LinkedList();
        this.f4883d = 999999;
        this.f4879b = new ByteArrayOutputStream();
        this.f4880c = new DataOutputStream(this.f4879b);
        m1182b();
    }

    public C0690ap(DataOutputStream dataOutputStream) {
        this.f4882e = new LinkedList();
        this.f4883d = 999999;
        this.f4880c = dataOutputStream;
        m1182b();
    }

    /* renamed from: b */
    public C0692ar m1181b(int i) {
        return m1198a(i, -1);
    }

    /* renamed from: a */
    public C0692ar m1198a(int i, int i2) {
        try {
            m1200a();
            C0692ar arVar = new C0692ar(i);
            arVar.f4891c = this.f4879b.toByteArray();
            arVar.f4894d = i2;
            return arVar;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public String m1176c() {
        try {
            m1200a();
            return this.f4879b.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public byte[] m1173d() {
        try {
            m1200a();
            return this.f4879b.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void m1175c(int i) {
        this.f4881a.writeByte(i);
    }

    /* renamed from: a */
    public void mo1104a(boolean z) {
        this.f4881a.writeBoolean(z);
    }

    /* renamed from: a */
    public void mo1109a(int i) {
        this.f4881a.writeInt(i);
    }

    /* renamed from: a */
    public void mo1110a(float f) {
        this.f4881a.writeFloat(f);
    }

    /* renamed from: a */
    public void m1199a(double d) {
        this.f4881a.writeDouble(d);
    }

    /* renamed from: a */
    public void m1197a(long j) {
        this.f4881a.writeLong(j);
    }

    /* renamed from: b */
    public void m1178b(String str) {
        mo1104a(str != null);
        if (str != null) {
            m1174c(str);
        }
    }

    /* renamed from: c */
    public void m1174c(String str) {
        this.f4881a.writeUTF(str);
    }

    /* renamed from: a */
    public void m1193a(C0364h hVar) {
        if (hVar == null) {
            this.f4881a.writeUTF("");
        }
        this.f4881a.writeUTF(hVar.toString());
    }

    /* renamed from: a */
    public void m1188a(AbstractC0854w wVar) {
        if (wVar == null) {
            this.f4881a.writeLong(-1L);
        } else {
            this.f4881a.writeLong(wVar.f5835dA);
        }
    }

    /* renamed from: b */
    public void m1179b(AbstractC0854w wVar) {
        if (wVar == null || wVar.f5836dC) {
            this.f4881a.writeLong(-1L);
        } else {
            this.f4881a.writeLong(wVar.f5835dA);
        }
    }

    /* renamed from: a */
    public void m1189a(C0835m mVar) {
        if (mVar == null) {
            mo1109a(0);
            return;
        }
        mo1109a(mVar.size());
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            m1179b((AbstractC0854w) it.next());
        }
    }

    /* renamed from: b */
    public void m1180b(AbstractC0210af afVar) {
        if (afVar == null || afVar.f5836dC || afVar.f1520bz) {
            m1188a((AbstractC0854w) null);
        } else {
            m1188a((AbstractC0854w) afVar);
        }
    }

    /* renamed from: a */
    public void mo1108a(AbstractC0210af afVar) {
        if (afVar == null || afVar.f5836dC) {
            m1188a((AbstractC0854w) null);
        } else {
            m1188a((AbstractC0854w) afVar);
        }
    }

    /* renamed from: a */
    public void m1192a(AbstractC0515r rVar) {
        if (rVar == null || rVar.f5836dC) {
            m1188a((AbstractC0854w) null);
        } else {
            m1188a((AbstractC0854w) rVar);
        }
    }

    /* renamed from: a */
    public void m1196a(PointF pointF) {
        mo1104a(pointF != null);
        if (pointF != null) {
            mo1110a(pointF.f224a);
            mo1110a(pointF.f225b);
        }
    }

    /* renamed from: a */
    public void m1184a(Enum r4) {
        if (r4 == null) {
            this.f4881a.writeInt(-1);
        } else {
            this.f4881a.writeInt(r4.ordinal());
        }
    }

    /* renamed from: a */
    public void m1194a(AbstractC0268al alVar) {
        if (alVar == null) {
            this.f4881a.writeInt(-1);
        } else if (alVar instanceof C0368l) {
            this.f4881a.writeInt(-2);
            m1174c(((C0368l) alVar).f2498E);
        } else {
            this.f4881a.writeInt(((EnumC0215ak) alVar).ordinal());
        }
    }

    /* renamed from: a */
    public void m1191a(C0698c cVar) {
        if (cVar == null) {
            this.f4881a.writeInt(0);
        } else {
            this.f4881a.writeInt(cVar.f4916c);
        }
    }

    /* renamed from: a */
    public void m1195a(AbstractC0171m mVar) {
        this.f4881a.writeByte(mVar.f1230i);
    }

    /* renamed from: a */
    public void m1186a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            m1185a(fileInputStream, (int) file.length());
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    public void m1190a(C0707k kVar) {
        InputStream u = kVar.m1061u();
        try {
            u.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        m1185a(u, u.available());
    }

    /* renamed from: a */
    public void m1185a(InputStream inputStream, int i) {
        int i2 = 0;
        mo1109a(i);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read == -1) {
                return;
            }
            if (i2 + read > i) {
                int i3 = i - i2;
                if (i3 < 0) {
                    Hcat_Multiplaye.m1261f("writeStream: bytesTillFull is " + i3);
                    return;
                } else {
                    this.f4881a.write(bArr, 0, i3);
                    return;
                }
            } else {
                this.f4881a.write(bArr, 0, read);
                i2 += read;
            }
        }
    }

    /* renamed from: a */
    public void m1187a(ByteArrayOutputStream byteArrayOutputStream) {
        mo1109a(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.f4881a);
    }

    /* renamed from: a */
    public void m1183a(byte[] bArr) {
        mo1109a(bArr.length);
        this.f4881a.write(bArr);
    }

    /* renamed from: b */
    public void m1177b(byte[] bArr) {
        this.f4881a.write(bArr);
    }

    /* renamed from: a */
    public void mo1105a(short s) {
        this.f4881a.writeShort(s);
    }

    /* renamed from: e */
    public void m1171e() {
        mo1105a((short) 12345);
    }

    /* renamed from: d */
    public void m1172d(String str) {
    }

    /* renamed from: f */
    public boolean m1169f() {
        return false;
    }

    /* renamed from: e */
    public void m1170e(String str) {
        mo1106a(str, false);
    }

    /* renamed from: a */
    public void mo1106a(String str, boolean z) {
        C0691aq aqVar = new C0691aq(z);
        aqVar.f4886c = str;
        this.f4882e.add(aqVar);
        this.f4881a = ((C0691aq) this.f4882e.getLast()).f4887e;
    }

    /* renamed from: a */
    public void mo1107a(String str) {
        C0691aq aqVar = (C0691aq) this.f4882e.removeLast();
        if (!aqVar.f4886c.equals(str)) {
            AbstractC0789l.m694b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + aqVar.f4886c);
        }
        aqVar.m1166a();
        if (this.f4882e.isEmpty()) {
            this.f4881a = this.f4880c;
        } else {
            this.f4881a = ((C0691aq) this.f4882e.getLast()).f4887e;
        }
        this.f4881a.writeUTF(aqVar.f4886c);
        m1187a(aqVar.f4889d);
        try {
            aqVar.m1165b();
        } catch (Exception e) {
            if (!(e instanceof DataFormatException)) {
                AbstractC0789l.m695b("Error calling streamBlock.close() to clean up memory");
                e.printStackTrace();
            } else if (!AbstractC0789l.f5560aJ) {
                AbstractC0789l.m695b("DataFormatException error calling streamBlock.close() (this is expected on android 4.4)");
            }
        }
    }

    /* renamed from: g */
    public int m1168g() {
        return this.f4883d;
    }

    /* renamed from: h */
    public void m1167h() {
        this.f4880c = null;
        this.f4881a = null;
        try {
            if (this.f4879b != null) {
                this.f4879b.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f4879b = null;
    }
}
