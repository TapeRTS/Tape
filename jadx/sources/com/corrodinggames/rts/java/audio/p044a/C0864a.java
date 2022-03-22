package com.corrodinggames.rts.java.audio.p044a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/a.class */
public class C0864a {

    /* renamed from: a */
    protected InputStream f5885a;

    /* renamed from: b */
    protected File f5886b;

    /* renamed from: c */
    protected String f5887c;

    public C0864a(String str) {
        this.f5886b = new File(str);
        this.f5887c = this.f5886b.getName();
    }

    public C0864a(InputStream inputStream, String str) {
        this.f5885a = inputStream;
        this.f5887c = str;
        if (this.f5885a == null) {
            throw new RuntimeException("inputStream==null");
        }
    }

    /* renamed from: a */
    public InputStream m344a() {
        if (this.f5885a != null) {
            return this.f5885a;
        }
        try {
            return new FileInputStream(this.f5886b);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public String m343b() {
        String str = this.f5887c;
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
    }
}
