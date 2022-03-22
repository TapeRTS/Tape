package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.g.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/d.class */
final class RunnableC0700d implements Runnable {

    /* renamed from: a */
    Boolean f4959a;

    /* renamed from: b */
    final /* synthetic */ C0698c f4960b;

    private RunnableC0700d(C0698c cVar) {
        this.f4960b = cVar;
        this.f4959a = true;
    }

    public void run() {
        AbstractC0789l.m715ag();
        Thread.currentThread().setName("ReceiveWorker-" + this.f4960b.m1118f());
        try {
            m1114a();
        } catch (EOFException e) {
            this.f4960b.m1128a("network:ReceiveWorker: EOF reading packet", e);
        } catch (IOException e2) {
            if (!this.f4960b.f4948a) {
                e2.printStackTrace();
            }
            this.f4960b.m1122c("network:ReceiveWorker: " + e2.getMessage());
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
            this.f4960b.m1122c("network:ReceiveWorker OutOfMemoryError: " + e3.getMessage());
        }
        C0698c.m1130a(this.f4960b, true, false);
    }

    /* renamed from: a */
    void m1114a() {
        DataInputStream dataInputStream = new DataInputStream(this.f4960b.f4917d.getInputStream());
        while (this.f4959a.booleanValue() && !this.f4960b.f4948a && !this.f4960b.f4917d.isClosed()) {
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            if (readInt > 20000000) {
                this.f4960b.m1125b("readData(): new packet of type:" + readInt2 + " has size of:" + readInt);
            }
            if (readInt > 10000) {
                int i = 50000000;
                if (C0698c.m1131a(this.f4960b).f4664A) {
                    i = 1000000;
                }
                if (!this.f4960b.f4925n) {
                    i = 10000;
                }
                if (readInt > i) {
                    this.f4960b.m1125b("Requested packet too large rejecting (max:" + i + ")");
                    return;
                }
            }
            if (readInt < 0) {
                this.f4960b.m1125b("Requested packet negative size:" + readInt + " rejecting");
                return;
            }
            C0692ar arVar = new C0692ar(readInt2);
            arVar.f4891c = new byte[readInt];
            this.f4960b.f4947Q = 0;
            this.f4960b.f4946P = readInt;
            int i2 = 0;
            arVar.f4893a = this.f4960b;
            while (i2 < readInt && !this.f4960b.f4948a) {
                int read = dataInputStream.read(arVar.f4891c, i2, readInt - i2);
                if (read == -1) {
                    this.f4960b.m1125b("we got to the end of the stream?!?");
                    return;
                }
                i2 += read;
                this.f4960b.f4941K++;
                this.f4960b.f4947Q = i2;
            }
            this.f4960b.f4946P = 0;
            this.f4960b.f4947Q = 0;
            if (!this.f4960b.f4948a) {
                if (arVar.f4890b > 100) {
                    C0698c.m1131a(this.f4960b).m1286c(arVar);
                } else {
                    C0698c.m1131a(this.f4960b).f4767aW.add(arVar);
                }
            }
        }
    }
}
