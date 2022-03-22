package android.content.res;

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: game-lib.jar:android/content/res/AssetManager.class */
public final class AssetManager {

    /* renamed from: b */
    private static final Object f118b = new Object();

    /* renamed from: a */
    static AssetManager f119a = null;

    /* renamed from: c */
    private final long[] f120c = new long[2];

    /* renamed from: d */
    private int f121d = 1;

    /* renamed from: e */
    private boolean f122e = true;

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
    public final InputStream m4267a(String str) {
        return m4266a(str, 2);
    }

    /* renamed from: a */
    public final InputStream m4266a(String str, int i) {
        FileInputStream fileInputStream;
        synchronized (this) {
            if (!this.f122e) {
                throw new RuntimeException("Assetmanager has been closed");
            }
            fileInputStream = new FileInputStream("assets/" + str);
        }
        return fileInputStream;
    }

    /* renamed from: b */
    public final AssetFileDescriptor m4264b(String str) {
        synchronized (this) {
            if (!this.f122e) {
                throw new RuntimeException("Assetmanager has been closed");
            }
            ParcelFileDescriptor openAssetFd = openAssetFd(str, this.f120c);
            if (openAssetFd != null) {
                return new AssetFileDescriptor(openAssetFd, this.f120c[0], this.f120c[1]);
            }
            throw new FileNotFoundException("Asset file: " + str);
        }
    }

    /* renamed from: c */
    public final String[] m4262c(String str) {
        return new String[0];
    }

    protected void finalize() {
        try {
            m4272a();
        } finally {
            super.finalize();
        }
    }

    /* loaded from: game-lib.jar:android/content/res/AssetManager$AssetInputStream.class */
    public final class AssetInputStream extends InputStream {

        /* renamed from: b */
        private int f123b;

        /* renamed from: c */
        private long f124c;

        /* renamed from: d */
        private long f125d;

        /* renamed from: a */
        final /* synthetic */ AssetManager f126a;

        @Override // java.io.InputStream
        public final int read() {
            return this.f126a.readAssetChar(this.f123b);
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int available() {
            long assetRemainingLength = this.f126a.getAssetRemainingLength(this.f123b);
            if (assetRemainingLength > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) assetRemainingLength;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (this.f126a) {
                if (this.f123b != 0) {
                    this.f126a.destroyAsset(this.f123b);
                    this.f123b = 0;
                    this.f126a.m4271a(hashCode());
                }
            }
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.f125d = this.f126a.seekAsset(this.f123b, 0L, 0);
        }

        @Override // java.io.InputStream
        public final void reset() {
            this.f126a.seekAsset(this.f123b, this.f125d, -1);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr) {
            return this.f126a.readAsset(this.f123b, bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            return this.f126a.readAsset(this.f123b, bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            long seekAsset = this.f126a.seekAsset(this.f123b, 0L, 0);
            if (seekAsset + j > this.f124c) {
                j = this.f124c - seekAsset;
            }
            if (j > 0) {
                this.f126a.seekAsset(this.f123b, j, 0);
            }
            return j;
        }

        protected void finalize() {
            close();
        }
    }

    /* renamed from: a */
    private final void m4272a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m4271a(int i) {
        this.f121d--;
        if (this.f121d == 0) {
            m4272a();
        }
    }
}
