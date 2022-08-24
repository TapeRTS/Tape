package com.corrodinggames.rts.java;

import org.newdawn.slick.Font;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.java.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/f.class */
public class C1174f {

    /* renamed from: a */
    int f7202a;

    /* renamed from: b */
    boolean f7203b;

    /* renamed from: c */
    boolean f7204c;

    /* renamed from: d */
    Font f7205d;

    /* renamed from: e */
    int f7206e;

    /* renamed from: f */
    String[] f7207f = new String[30];

    /* renamed from: g */
    final /* synthetic */ C1173e f7208g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1174f(C1173e c1173e) {
        this.f7208g = c1173e;
    }

    /* renamed from: a */
    public C1174f clone() {
        C1174f c1174f = new C1174f(this.f7208g);
        c1174f.f7202a = this.f7202a;
        c1174f.f7203b = this.f7203b;
        c1174f.f7204c = this.f7204c;
        return c1174f;
    }

    public String toString() {
        return "FontKey:(size:" + this.f7202a + ",  bold:" + this.f7203b + " fallback:" + this.f7204c + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m118a(String str) {
        if (str == null || !C1173e.m182a(str)) {
            return true;
        }
        for (int i = 0; i < this.f7207f.length; i++) {
            String str2 = this.f7207f[i];
            if (str2 != null && str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m117b(String str) {
        this.f7207f[this.f7206e] = str;
        this.f7206e++;
        if (this.f7206e >= this.f7207f.length) {
            this.f7206e = 0;
        }
    }
}
