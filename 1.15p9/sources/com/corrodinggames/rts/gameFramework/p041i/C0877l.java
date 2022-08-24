package com.corrodinggames.rts.gameFramework.p041i;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.i.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/l.class */
public class C0877l {

    /* renamed from: a */
    public String f5861a;

    /* renamed from: b */
    public ByteArrayInputStream f5862b;

    /* renamed from: c */
    public DataInputStream f5863c;

    public C0877l(byte[] bArr, boolean z, boolean z2) {
        InputStream inputStream;
        this.f5862b = new ByteArrayInputStream(bArr);
        if (z) {
            inputStream = new BufferedInputStream(new GZIPInputStream(this.f5862b));
        } else {
            inputStream = this.f5862b;
        }
        this.f5863c = new DataInputStream(inputStream);
    }
}
