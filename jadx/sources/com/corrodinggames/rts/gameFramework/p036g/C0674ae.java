package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.g.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/ae.class */
public class C0674ae {

    /* renamed from: b */
    public String f4801b;

    /* renamed from: c */
    public int f4802c;

    /* renamed from: d */
    public boolean f4803d;

    /* renamed from: a */
    public void mo1222a(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f4803d) {
            try {
                C0690ap apVar = new C0690ap();
                apVar.m1175c(1);
                apVar.mo1109a(this.f4802c);
                apVar.m1174c(str);
                u.f5486bF.m1278d(apVar.m1181b(118));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (u.f5486bF.f4664A) {
            AbstractC0789l.m732a("Cannot enter a password when we are a server");
        } else {
            u.f5486bF.f4654m = str;
            u.f5486bF.m1378P();
        }
    }

    /* renamed from: a */
    public void mo1223a() {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5486bF.m1295b("exited password");
        u.f5486bF.m1390D();
    }
}
