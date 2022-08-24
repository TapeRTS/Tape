package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/j.class */
public class C1098j extends InputStream {

    /* renamed from: a */
    InputStream f6876a;

    /* renamed from: b */
    String f6877b;

    /* renamed from: c */
    String f6878c;

    /* renamed from: d */
    boolean f6879d;

    /* renamed from: e */
    String f6880e;

    /* renamed from: a */
    public boolean m562a() {
        if (this.f6876a instanceof FileInputStream) {
            return true;
        }
        if (!GameEngine.m1151au() && this.f6878c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public FileDescriptor m561b() {
        if (this.f6876a instanceof FileInputStream) {
            return ((FileInputStream) this.f6876a).getFD();
        }
        if (!GameEngine.m1151au() && this.f6878c != null) {
            return C0090c.m6223a().mo6586d().m6571b(this.f6878c).getFileDescriptor();
        }
        throw new RuntimeException("AssetInputStream: unexpected stream for: " + this.f6877b);
    }

    private C1098j() {
    }

    public C1098j(InputStream inputStream, String str, String str2) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.f6876a = inputStream;
        this.f6877b = str;
        this.f6878c = str2;
        this.f6880e = GameEngine.m1209T();
    }

    public C1098j(FileInputStream fileInputStream, String str) {
        if (fileInputStream == null) {
            throw new FileNotFoundException();
        }
        this.f6876a = fileInputStream;
        this.f6877b = str;
        this.f6880e = GameEngine.m1209T();
    }

    public C1098j(InputStream inputStream, String str) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.f6876a = inputStream;
        this.f6877b = str;
        this.f6880e = GameEngine.m1209T();
    }

    /* renamed from: c */
    public long m560c() {
        if (!GameEngine.m1151au()) {
            return -1L;
        }
        if (this.f6877b == null) {
            return -2L;
        }
        return new File(this.f6877b).lastModified();
    }

    /* renamed from: d */
    public String m559d() {
        return this.f6877b;
    }

    public int available() {
        return this.f6876a.available();
    }

    public void close() {
        this.f6879d = true;
        this.f6876a.close();
    }

    protected void finalize() {
        if (!this.f6879d) {
            GameEngine.m1139b("AssetInputStream was finalized with being closed");
            GameEngine.m1139b(this.f6880e);
        }
    }

    public boolean equals(Object obj) {
        return this.f6876a.equals(obj);
    }

    public int hashCode() {
        return this.f6876a.hashCode();
    }

    public void mark(int i) {
        this.f6876a.mark(i);
    }

    public boolean markSupported() {
        return this.f6876a.markSupported();
    }

    public int read() {
        return this.f6876a.read();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.f6876a.read(bArr, i, i2);
    }

    public int read(byte[] bArr) {
        return this.f6876a.read(bArr);
    }

    public void reset() {
        this.f6876a.reset();
    }

    public long skip(long j) {
        return this.f6876a.skip(j);
    }

    public String toString() {
        return this.f6876a.toString();
    }
}
