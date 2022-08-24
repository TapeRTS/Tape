package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.i.as */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/as.class */
public class C0860as {

    /* renamed from: a */
    public GZIPOutputStream f5728a;

    /* renamed from: b */
    public BufferedOutputStream f5729b;

    /* renamed from: c */
    public String f5730c;

    /* renamed from: e */
    public DataOutputStream f5732e;

    /* renamed from: f */
    public boolean f5733f = false;

    /* renamed from: d */
    public ByteArrayOutputStream f5731d = new ByteArrayOutputStream();

    /* renamed from: a */
    public void m1539a() {
        this.f5732e.flush();
        if (this.f5729b != null) {
            this.f5729b.flush();
        }
        if (this.f5728a != null) {
            this.f5728a.finish();
        }
    }

    /* renamed from: b */
    public void m1538b() {
        if (!this.f5733f) {
            this.f5732e.close();
        } else {
            GameEngine.m1114g("TODO: Cannot yet close wrapped stream");
        }
    }

    public C0860as(boolean z) {
        OutputStream outputStream;
        if (z) {
            this.f5728a = new GZIPOutputStream(this.f5731d);
            this.f5729b = new BufferedOutputStream(this.f5728a);
            outputStream = this.f5729b;
        } else {
            outputStream = this.f5731d;
        }
        this.f5732e = new DataOutputStream(outputStream);
    }
}
