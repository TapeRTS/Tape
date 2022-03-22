package com.corrodinggames.rts.gameFramework.p036g;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.corrodinggames.rts.gameFramework.g.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/at.class */
public class C0694at extends C0690ap {

    /* renamed from: a */
    ByteArrayOutputStream f4898a;

    /* renamed from: e */
    PrintStream f4899e;

    /* renamed from: f */
    private PrintStream f4900f;

    /* renamed from: g */
    private LinkedList f4901g;

    /* renamed from: a */
    public void m1164a() {
        ListIterator listIterator = this.f4901g.listIterator(this.f4901g.size());
        while (listIterator.hasPrevious()) {
            ((C0695au) listIterator.previous()).m1137a();
        }
        this.f4899e.flush();
        if (this.f4898a != null) {
            this.f4898a.flush();
        }
    }

    /* renamed from: b */
    void m1150b() {
        this.f4900f = this.f4899e;
    }

    public C0694at() {
        this.f4901g = new LinkedList();
        this.f4898a = new ByteArrayOutputStream();
        this.f4899e = new PrintStream(this.f4898a);
        m1150b();
    }

    public C0694at(PrintStream printStream) {
        this.f4901g = new LinkedList();
        this.f4899e = printStream;
        m1150b();
    }

    /* renamed from: b */
    public C0692ar m1149b(int i) {
        return m1163a(i, -1);
    }

    /* renamed from: a */
    public C0692ar m1163a(int i, int i2) {
        try {
            m1164a();
            C0692ar arVar = new C0692ar(i);
            arVar.f4891c = this.f4898a.toByteArray();
            arVar.f4894d = i2;
            return arVar;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public String m1145c() {
        try {
            m1164a();
            return this.f4898a.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public byte[] m1142d() {
        try {
            m1164a();
            return this.f4898a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void m1144c(int i) {
        this.f4900f.println(i);
    }

    /* renamed from: a */
    public void mo1104a(boolean z) {
        this.f4900f.println(z);
    }

    /* renamed from: a */
    public void mo1109a(int i) {
        this.f4900f.println("#int:");
        this.f4900f.println(i);
    }

    /* renamed from: a */
    public void mo1110a(float f) {
        this.f4900f.println("#writeFloat");
        this.f4900f.println(f);
    }

    /* renamed from: a */
    public void m1162a(long j) {
        this.f4900f.println("#writeLong");
        this.f4900f.println(j);
    }

    /* renamed from: b */
    public void m1146b(String str) {
        mo1104a(str != null);
        if (str != null) {
            m1143c(str);
        }
    }

    /* renamed from: c */
    public void m1143c(String str) {
        this.f4900f.println(str);
    }

    /* renamed from: a */
    public void m1156a(AbstractC0854w wVar) {
        this.f4900f.println("#writeGameObject:");
        if (wVar == null) {
            this.f4900f.println(-1);
        } else {
            this.f4900f.println(wVar.f5835dA);
        }
    }

    /* renamed from: b */
    public void m1147b(AbstractC0854w wVar) {
        this.f4900f.println("#writeExistingGameObject:");
        if (wVar == null || wVar.f5836dC) {
            this.f4900f.println(-1);
        } else {
            this.f4900f.println(wVar.f5835dA);
        }
    }

    /* renamed from: b */
    public void m1148b(AbstractC0210af afVar) {
        if (afVar == null || afVar.f5836dC || afVar.f1520bz) {
            m1156a((AbstractC0854w) null);
        } else {
            m1156a((AbstractC0854w) afVar);
        }
    }

    /* renamed from: a */
    public void mo1108a(AbstractC0210af afVar) {
        if (afVar == null || afVar.f5836dC) {
            m1156a((AbstractC0854w) null);
        } else {
            m1156a((AbstractC0854w) afVar);
        }
    }

    /* renamed from: a */
    public void m1158a(AbstractC0515r rVar) {
        if (rVar == null || rVar.f5836dC) {
            m1156a((AbstractC0854w) null);
        } else {
            m1156a((AbstractC0854w) rVar);
        }
    }

    /* renamed from: a */
    public void m1161a(PointF pointF) {
        this.f4900f.println("#PointF:");
        mo1104a(pointF != null);
        if (pointF != null) {
            mo1110a(pointF.f224a);
            mo1110a(pointF.f225b);
        }
    }

    /* renamed from: a */
    public void m1152a(Enum r5) {
        if (r5 == null) {
            this.f4900f.println("#Enum: null");
            this.f4900f.println(-1);
            return;
        }
        this.f4900f.println("#Enum:" + r5.getClass().getSimpleName() + " : " + r5.toString());
        this.f4900f.println(r5.ordinal());
    }

    /* renamed from: a */
    public void m1159a(AbstractC0268al alVar) {
        this.f4900f.println("#unitType:");
        if (alVar == null) {
            this.f4900f.println(-1);
        } else if (alVar instanceof C0368l) {
            this.f4900f.println(-2);
            m1143c(((C0368l) alVar).f2498E);
        } else {
            this.f4900f.println(((EnumC0215ak) alVar).ordinal());
        }
    }

    /* renamed from: a */
    public void m1157a(C0698c cVar) {
        if (cVar == null) {
            this.f4900f.println(0);
        } else {
            this.f4900f.println(cVar.f4916c);
        }
    }

    /* renamed from: a */
    public void m1160a(AbstractC0171m mVar) {
        this.f4900f.println("#team:");
        this.f4900f.println(mVar.f1230i);
    }

    /* renamed from: a */
    public void m1154a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            m1153a(fileInputStream, (int) file.length());
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    public void m1153a(InputStream inputStream, int i) {
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
                    this.f4900f.write(bArr, 0, i3);
                    return;
                }
            } else {
                this.f4900f.write(bArr, 0, read);
                i2 += read;
            }
        }
    }

    /* renamed from: a */
    public void m1155a(ByteArrayOutputStream byteArrayOutputStream) {
        mo1109a(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.f4900f);
    }

    /* renamed from: a */
    public void m1151a(byte[] bArr) {
        mo1109a(bArr.length);
        this.f4900f.write(bArr);
    }

    /* renamed from: a */
    public void mo1105a(short s) {
        this.f4900f.println("#writeShort");
        this.f4900f.println((int) s);
    }

    /* renamed from: e */
    public void m1140e() {
        this.f4900f.println("#writeMark:");
        mo1105a((short) 12345);
    }

    /* renamed from: d */
    public void m1141d(String str) {
        this.f4900f.println("#writeIfDebugOnly: " + str);
    }

    /* renamed from: f */
    public boolean m1138f() {
        return true;
    }

    /* renamed from: e */
    public void m1139e(String str) {
        mo1106a(str, false);
    }

    /* renamed from: a */
    public void mo1106a(String str, boolean z) {
        C0695au auVar = new C0695au(z);
        auVar.f4903b = str;
        this.f4901g.add(auVar);
        this.f4900f = ((C0695au) this.f4901g.getLast()).f4904d;
    }

    /* renamed from: a */
    public void mo1107a(String str) {
        C0695au auVar = (C0695au) this.f4901g.removeLast();
        if (!auVar.f4903b.equals(str)) {
            AbstractC0789l.m694b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + auVar.f4903b);
        }
        auVar.m1137a();
        if (this.f4901g.isEmpty()) {
            this.f4900f = this.f4899e;
        } else {
            this.f4900f = ((C0695au) this.f4901g.getLast()).f4904d;
        }
        String str2 = "";
        String str3 = "";
        for (int i = 0; i < this.f4901g.size(); i++) {
            str2 = str2 + ">";
            str3 = str3 + "<";
        }
        this.f4900f.println(str2 + ">>>> Start of block: " + auVar.f4903b);
        m1155a(auVar.f4906c);
        this.f4900f.println(str3 + "<<<< End of block: " + auVar.f4903b);
        auVar.m1136b();
    }
}
