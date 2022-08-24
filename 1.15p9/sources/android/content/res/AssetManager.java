package android.content.res;

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: game-lib.jar:android/content/res/AssetManager.class */
public final class AssetManager {

    /* renamed from: b */
    private static final Object f117b = new Object();

    /* renamed from: a */
    static AssetManager f118a = null;

    /* renamed from: c */
    private final long[] f119c = new long[2];

    /* renamed from: d */
    private int f120d = 1;

    /* renamed from: e */
    private boolean f121e = true;

    private final native ParcelFileDescriptor openAssetFd(String str, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void destroyAsset(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int readAssetChar(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int readAsset(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long seekAsset(int i, long j, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long getAssetRemainingLength(int i);

    /* renamed from: a */
    public final InputStream m6574a(String str) {
        return m6573a(str, 2);
    }

    /* renamed from: a */
    public final InputStream m6573a(String str, int i) {
        FileInputStream fileInputStream;
        synchronized (this) {
            if (!this.f121e) {
                throw new RuntimeException("Assetmanager has been closed");
            }
            fileInputStream = new FileInputStream("assets/" + str);
        }
        return fileInputStream;
    }

    /* renamed from: b */
    public final AssetFileDescriptor m6571b(String str) {
        synchronized (this) {
            if (!this.f121e) {
                throw new RuntimeException("Assetmanager has been closed");
            }
            ParcelFileDescriptor openAssetFd = openAssetFd(str, this.f119c);
            if (openAssetFd != null) {
                return new AssetFileDescriptor(openAssetFd, this.f119c[0], this.f119c[1]);
            }
            throw new FileNotFoundException("Asset file: " + str);
        }
    }

    /* renamed from: c */
    public final String[] m6569c(String str) {
        return new String[0];
    }

    protected void finalize() {
        try {
            m6579a();
        } finally {
            super.finalize();
        }
    }

    /* loaded from: game-lib.jar:android/content/res/AssetManager$AssetInputStream.class */
    public final class AssetInputStream extends InputStream {

        /* renamed from: b */
        private int f122b;

        /* renamed from: c */
        private long f123c;

        /* renamed from: d */
        private long f124d;

        /* renamed from: a */
        final /* synthetic */ AssetManager f125a;

        @Override // java.io.InputStream
        public final int read() {
            return this.f125a.readAssetChar(this.f122b);
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int available() {
            long assetRemainingLength = this.f125a.getAssetRemainingLength(this.f122b);
            if (assetRemainingLength > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) assetRemainingLength;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (this.f125a) {
                if (this.f122b != 0) {
                    this.f125a.destroyAsset(this.f122b);
                    this.f122b = 0;
                    this.f125a.m6578a(hashCode());
                }
            }
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.f124d = this.f125a.seekAsset(this.f122b, 0L, 0);
        }

        @Override // java.io.InputStream
        public final void reset() {
            this.f125a.seekAsset(this.f122b, this.f124d, -1);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr) {
            return this.f125a.readAsset(this.f122b, bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            return this.f125a.readAsset(this.f122b, bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            long seekAsset = this.f125a.seekAsset(this.f122b, 0L, 0);
            if (seekAsset + j > this.f123c) {
                j = this.f123c - seekAsset;
            }
            if (j > 0) {
                this.f125a.seekAsset(this.f122b, j, 0);
            }
            return j;
        }

        protected void finalize() {
            close();
        }
    }

    /* renamed from: a */
    private final void m6579a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m6578a(int i) {
        this.f120d--;
        if (this.f120d == 0) {
            m6579a();
        }
    }
}
