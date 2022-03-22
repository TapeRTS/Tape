package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* renamed from: com.corrodinggames.rts.gameFramework.g.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/au.class */
public class C0695au {

    /* renamed from: a */
    public BufferedOutputStream f4902a;

    /* renamed from: b */
    public String f4903b;

    /* renamed from: d */
    public PrintStream f4905d;

    /* renamed from: e */
    public boolean f4906e = false;

    /* renamed from: c */
    public ByteArrayOutputStream f4904c = new ByteArrayOutputStream();

    /* renamed from: a */
    public void m1123a() {
        this.f4905d.flush();
        if (this.f4902a != null) {
            this.f4902a.flush();
        }
    }

    /* renamed from: b */
    public void m1122b() {
        if (!this.f4906e) {
            this.f4905d.close();
        } else {
            AbstractC0789l.m663f("TODO: Cannot yet close wrapped stream");
        }
    }

    public C0695au(boolean z) {
        BufferedOutputStream bufferedOutputStream;
        if (z) {
            this.f4902a = new BufferedOutputStream(this.f4904c);
            bufferedOutputStream = this.f4902a;
        } else {
            bufferedOutputStream = this.f4904c;
        }
        this.f4905d = new PrintStream(bufferedOutputStream);
    }
}
