package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.g.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/aq.class */
public class C0691aq {

    /* renamed from: a */
    public GZIPOutputStream f4884a;

    /* renamed from: b */
    public BufferedOutputStream f4885b;

    /* renamed from: c */
    public String f4886c;

    /* renamed from: e */
    public DataOutputStream f4888e;

    /* renamed from: f */
    public boolean f4889f = false;

    /* renamed from: d */
    public ByteArrayOutputStream f4887d = new ByteArrayOutputStream();

    /* renamed from: a */
    public void m1152a() {
        this.f4888e.flush();
        if (this.f4885b != null) {
            this.f4885b.flush();
        }
        if (this.f4884a != null) {
            this.f4884a.finish();
        }
    }

    /* renamed from: b */
    public void m1151b() {
        if (!this.f4889f) {
            this.f4888e.close();
        } else {
            AbstractC0789l.m663f("TODO: Cannot yet close wrapped stream");
        }
    }

    public C0691aq(boolean z) {
        BufferedOutputStream bufferedOutputStream;
        if (z) {
            this.f4884a = new GZIPOutputStream(this.f4887d);
            this.f4885b = new BufferedOutputStream(this.f4884a);
            bufferedOutputStream = this.f4885b;
        } else {
            bufferedOutputStream = this.f4887d;
        }
        this.f4888e = new DataOutputStream(bufferedOutputStream);
    }
}
