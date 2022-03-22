package com.corrodinggames.rts.java.audio.p044a;

import java.io.ByteArrayOutputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/t.class */
public class C0883t extends ByteArrayOutputStream {
    public C0883t(int i) {
        super(i);
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized byte[] toByteArray() {
        return this.count == this.buf.length ? this.buf : super.toByteArray();
    }
}
