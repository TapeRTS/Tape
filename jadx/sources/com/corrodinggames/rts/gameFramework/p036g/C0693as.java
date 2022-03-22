package com.corrodinggames.rts.gameFramework.p036g;

import java.io.IOException;
import java.util.TimerTask;

/* renamed from: com.corrodinggames.rts.gameFramework.g.as */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/as.class */
class C0693as extends TimerTask {

    /* renamed from: c */
    private final Hcat_Multiplaye f4895c;

    /* renamed from: a */
    public boolean f4896a = true;

    /* renamed from: b */
    public long f4897b = 0;

    C0693as(Hcat_Multiplaye adVar) {
        this.f4895c = adVar;
    }

    public void run() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f4895c.f4694aD != 0 && (currentTimeMillis > this.f4895c.f4694aD + 5 || currentTimeMillis < this.f4895c.f4694aD)) {
                this.f4895c.f4694aD = 0L;
                this.f4895c.m1385I();
            }
            if (currentTimeMillis > this.f4897b + 1000 || currentTimeMillis < this.f4897b) {
                this.f4897b = currentTimeMillis;
                if (this.f4896a) {
                    C0690ap apVar = new C0690ap();
                    apVar.m1197a(System.currentTimeMillis());
                    apVar.m1175c(0);
                    this.f4895c.m1257g(apVar.m1181b(108));
                } else {
                    this.f4895c.m1386H();
                }
                this.f4896a = !this.f4896a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
