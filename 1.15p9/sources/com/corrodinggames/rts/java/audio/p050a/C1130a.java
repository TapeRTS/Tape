package com.corrodinggames.rts.java.audio.p050a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/a.class */
public class C1130a {

    /* renamed from: a */
    protected InputStream f6997a;

    /* renamed from: b */
    protected File f6998b;

    /* renamed from: c */
    protected String f6999c;

    public C1130a(String str) {
        this.f6998b = new File(str);
        this.f6999c = this.f6998b.getName();
    }

    public C1130a(InputStream inputStream, String str) {
        this.f6997a = inputStream;
        this.f6999c = str;
        if (this.f6997a == null) {
            throw new RuntimeException("inputStream==null");
        }
    }

    /* renamed from: a */
    public InputStream m381a() {
        if (this.f6997a != null) {
            return this.f6997a;
        }
        try {
            return new FileInputStream(this.f6998b);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public String m380b() {
        String str = this.f6999c;
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? VariableScope.nullOrMissingString : str.substring(lastIndexOf + 1);
    }
}
