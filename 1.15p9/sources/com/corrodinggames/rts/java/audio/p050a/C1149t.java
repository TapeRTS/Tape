package com.corrodinggames.rts.java.audio.p050a;

import java.io.ByteArrayOutputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/t.class */
public class C1149t extends ByteArrayOutputStream {
    public C1149t(int i) {
        super(i);
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized byte[] toByteArray() {
        return this.count == this.buf.length ? this.buf : super.toByteArray();
    }
}
