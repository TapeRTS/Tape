package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.p008a.C0067c;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/j.class */
public class C0832j extends InputStream {

    /* renamed from: a */
    InputStream f5768a;

    /* renamed from: b */
    String f5769b;

    /* renamed from: c */
    String f5770c;

    /* renamed from: a */
    public boolean m499a() {
        if (this.f5768a instanceof FileInputStream) {
            return true;
        }
        if (AbstractC0789l.m697al() || this.f5770c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public FileDescriptor m498b() {
        if (this.f5768a instanceof FileInputStream) {
            return ((FileInputStream) this.f5768a).getFD();
        }
        if (!AbstractC0789l.m697al() && this.f5770c != null) {
            return C0067c.m3963a().mo4277d().m4264b(this.f5770c).getFileDescriptor();
        }
        throw new RuntimeException("AssetInputStream: unexpected stream for: " + this.f5769b);
    }

    private C0832j() {
    }

    public C0832j(InputStream inputStream, String str, String str2) {
        this.f5768a = inputStream;
        this.f5769b = str;
        this.f5770c = str2;
    }

    public C0832j(FileInputStream fileInputStream, String str) {
        this.f5768a = fileInputStream;
        this.f5769b = str;
    }

    public C0832j(InputStream inputStream, String str) {
        this.f5768a = inputStream;
        this.f5769b = str;
    }

    /* renamed from: c */
    public long m497c() {
        if (!AbstractC0789l.m697al()) {
            return -1L;
        }
        if (this.f5769b == null) {
            return -2L;
        }
        return new File(this.f5769b).lastModified();
    }

    /* renamed from: d */
    public String m496d() {
        return this.f5769b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f5768a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5768a.close();
    }

    public boolean equals(Object obj) {
        return this.f5768a.equals(obj);
    }

    public int hashCode() {
        return this.f5768a.hashCode();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f5768a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f5768a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f5768a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.f5768a.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.f5768a.read(bArr);
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f5768a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f5768a.skip(j);
    }

    public String toString() {
        return this.f5768a.toString();
    }
}
