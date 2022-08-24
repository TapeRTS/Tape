package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: com.corrodinggames.rts.gameFramework.i.aw */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/aw.class */
public class C0864aw {

    /* renamed from: a */
    public BufferedOutputStream f5746a;

    /* renamed from: b */
    public String f5747b;

    /* renamed from: d */
    public PrintStream f5748d;

    /* renamed from: e */
    public boolean f5749e = false;

    /* renamed from: c */
    public ByteArrayOutputStream f5750c = new ByteArrayOutputStream();

    /* renamed from: a */
    public void m1510a() {
        this.f5748d.flush();
        if (this.f5746a != null) {
            this.f5746a.flush();
        }
    }

    /* renamed from: b */
    public void m1509b() {
        if (!this.f5749e) {
            this.f5748d.close();
        } else {
            GameEngine.m1114g("TODO: Cannot yet close wrapped stream");
        }
    }

    public C0864aw(boolean z) {
        OutputStream outputStream;
        if (z) {
            this.f5746a = new BufferedOutputStream(this.f5750c);
            outputStream = this.f5746a;
        } else {
            outputStream = this.f5750c;
        }
        this.f5748d = new PrintStream(outputStream);
    }
}
