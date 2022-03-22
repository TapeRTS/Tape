package com.corrodinggames.rts.gameFramework.p036g;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.g.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/l.class */
public class C0708l {

    /* renamed from: a */
    public String f5011a;

    /* renamed from: b */
    public ByteArrayInputStream f5012b;

    /* renamed from: c */
    public DataInputStream f5013c;

    public C0708l(byte[] bArr, boolean z, boolean z2) {
        BufferedInputStream bufferedInputStream;
        this.f5012b = new ByteArrayInputStream(bArr);
        if (z) {
            bufferedInputStream = new BufferedInputStream(new GZIPInputStream(this.f5012b));
        } else {
            bufferedInputStream = this.f5012b;
        }
        this.f5013c = new DataInputStream(bufferedInputStream);
    }
}
