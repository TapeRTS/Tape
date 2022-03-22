package com.corrodinggames.rts.gameFramework.utility;

import java.io.IOException;
import java.io.Reader;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/l.class */
public class C0834l extends Reader {

    /* renamed from: a */
    private Reader f5772a;

    /* renamed from: b */
    private char[] f5773b;

    /* renamed from: c */
    private int f5774c;

    /* renamed from: d */
    private int f5775d;

    /* renamed from: e */
    private int f5776e;

    /* renamed from: f */
    private int f5777f;

    public C0834l(Reader reader) {
        this(reader, 8192);
    }

    public C0834l(Reader reader, int i) {
        super(reader);
        this.f5776e = -1;
        this.f5777f = -1;
        if (i <= 0) {
            throw new IllegalArgumentException("size <= 0");
        }
        this.f5772a = reader;
        this.f5773b = new char[i];
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (!m492c()) {
                this.f5772a.close();
                this.f5773b = null;
            }
        }
    }

    /* renamed from: b */
    private int m493b() {
        if (this.f5776e == -1 || this.f5774c - this.f5776e >= this.f5777f) {
            int read = this.f5772a.read(this.f5773b, 0, this.f5773b.length);
            if (read > 0) {
                this.f5776e = -1;
                this.f5774c = 0;
                this.f5775d = read;
            }
            return read;
        }
        if (this.f5776e == 0 && this.f5777f > this.f5773b.length) {
            int length = this.f5773b.length * 2;
            if (length > this.f5777f) {
                length = this.f5777f;
            }
            char[] cArr = new char[length];
            System.arraycopy(this.f5773b, 0, cArr, 0, this.f5773b.length);
            this.f5773b = cArr;
        } else if (this.f5776e > 0) {
            System.arraycopy(this.f5773b, this.f5776e, this.f5773b, 0, this.f5773b.length - this.f5776e);
            this.f5774c -= this.f5776e;
            this.f5775d -= this.f5776e;
            this.f5776e = 0;
        }
        int read2 = this.f5772a.read(this.f5773b, this.f5774c, this.f5773b.length - this.f5774c);
        if (read2 != -1) {
            this.f5775d += read2;
        }
        return read2;
    }

    /* renamed from: c */
    private boolean m492c() {
        return this.f5773b == null;
    }

    @Override // java.io.Reader
    public void mark(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        synchronized (this.lock) {
            m491d();
            this.f5777f = i;
            this.f5776e = this.f5774c;
        }
    }

    /* renamed from: d */
    private void m491d() {
        if (m492c()) {
            throw new IOException("BufferedReader is closed");
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        synchronized (this.lock) {
            m491d();
            if (this.f5774c >= this.f5775d && m493b() == -1) {
                return -1;
            }
            char[] cArr = this.f5773b;
            int i = this.f5774c;
            this.f5774c = i + 1;
            return cArr[i];
        }
    }

    /* renamed from: a */
    public static void m494a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        int i3;
        synchronized (this.lock) {
            m491d();
            m494a(cArr.length, i, i2);
            int i4 = i2;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                int i5 = this.f5775d - this.f5774c;
                if (i5 > 0) {
                    int i6 = i5 >= i4 ? i4 : i5;
                    System.arraycopy(this.f5773b, this.f5774c, cArr, i, i6);
                    this.f5774c += i6;
                    i += i6;
                    i4 -= i6;
                }
                if (i4 == 0 || (i4 < i2 && !this.f5772a.ready())) {
                    break;
                } else if ((this.f5776e == -1 || this.f5774c - this.f5776e >= this.f5777f) && i4 >= this.f5773b.length) {
                    int read = this.f5772a.read(cArr, i, i4);
                    if (read > 0) {
                        i4 -= read;
                        this.f5776e = -1;
                    }
                } else if (m493b() == -1) {
                    break;
                }
            }
            int i7 = i2 - i4;
            i3 = (i7 > 0 || i7 == i2) ? i7 : -1;
        }
        return i3;
    }

    /* renamed from: a */
    public String m495a() {
        synchronized (this.lock) {
            m491d();
            if (this.f5774c == this.f5775d && m493b() == -1) {
                return null;
            }
            for (int i = this.f5774c; i < this.f5775d; i++) {
                char c = this.f5773b[i];
                if (c <= '\r') {
                    if (c == '\n') {
                        String str = new String(this.f5773b, this.f5774c, i - this.f5774c);
                        this.f5774c = i + 1;
                        return str;
                    } else if (c == '\r') {
                        String str2 = new String(this.f5773b, this.f5774c, i - this.f5774c);
                        this.f5774c = i + 1;
                        if ((this.f5774c < this.f5775d || m493b() != -1) && this.f5773b[this.f5774c] == '\n') {
                            this.f5774c++;
                        }
                        return str2;
                    }
                }
            }
            char c2 = 0;
            StringBuilder sb = new StringBuilder(80);
            sb.append(this.f5773b, this.f5774c, this.f5775d - this.f5774c);
            while (true) {
                this.f5774c = this.f5775d;
                if (c2 == '\n') {
                    return sb.toString();
                } else if (m493b() == -1) {
                    return (sb.length() > 0 || c2 != 0) ? sb.toString() : null;
                } else {
                    for (int i2 = this.f5774c; i2 < this.f5775d; i2++) {
                        char c3 = this.f5773b[i2];
                        if (c2 == 0) {
                            if (c3 == '\n' || c3 == '\r') {
                                c2 = c3;
                            }
                        } else if (c2 == '\r' && c3 == '\n') {
                            if (i2 > this.f5774c) {
                                sb.append(this.f5773b, this.f5774c, (i2 - this.f5774c) - 1);
                            }
                            this.f5774c = i2 + 1;
                            return sb.toString();
                        } else {
                            if (i2 > this.f5774c) {
                                sb.append(this.f5773b, this.f5774c, (i2 - this.f5774c) - 1);
                            }
                            this.f5774c = i2;
                            return sb.toString();
                        }
                    }
                    if (c2 == 0) {
                        sb.append(this.f5773b, this.f5774c, this.f5775d - this.f5774c);
                    } else {
                        sb.append(this.f5773b, this.f5774c, (this.f5775d - this.f5774c) - 1);
                    }
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    @Override // java.io.Reader
    public boolean ready() {
        boolean z;
        synchronized (this.lock) {
            m491d();
            z = this.f5775d - this.f5774c > 0 || this.f5772a.ready();
        }
        return z;
    }

    @Override // java.io.Reader
    public void reset() {
        synchronized (this.lock) {
            m491d();
            if (this.f5776e == -1) {
                throw new IOException("Invalid mark");
            }
            this.f5774c = this.f5776e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [long] */
    /* JADX WARN: Type inference failed for: r12v1, types: [long] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        synchronized (this.lock) {
            m491d();
            if (j < 1) {
                return 0L;
            }
            if (this.f5775d - this.f5774c >= j) {
                this.f5774c = (int) (this.f5774c + j);
                return j;
            }
            this.f5774c = this.f5775d;
            ?? r12 = this.f5775d - this.f5774c;
            while ((r12 == true ? 1L : 0L) < j) {
                if (m493b() == -1) {
                    return r12;
                }
                if (this.f5775d - this.f5774c >= j - r12) {
                    this.f5774c = (int) (this.f5774c + (j - r12));
                    return j;
                }
                r12 += this.f5775d - this.f5774c;
                this.f5774c = this.f5775d;
            }
            return j;
        }
    }
}
