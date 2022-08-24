package com.corrodinggames.rts.gameFramework.p036e;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.e.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/h.class */
public class C0757h {

    /* renamed from: a */
    public InputStream f4881a;

    public C0757h(InputStream inputStream) {
        this.f4881a = inputStream;
    }

    /* renamed from: a */
    public void m2371a() {
        try {
            if (this.f4881a != null) {
                this.f4881a.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
