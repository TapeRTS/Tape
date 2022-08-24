package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.Connection;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/d.class */
public final class RunnableC0869d implements Runnable {

    /* renamed from: a */
    Boolean f5808a;

    /* renamed from: b */
    final /* synthetic */ Connection f5809b;

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC0869d(Connection connection) {
        this.f5809b = connection;
        this.f5808a = true;
    }

    /* synthetic */ RunnableC0869d(Connection connection, Connection.C08681 c08681) {
        this(connection);
    }

    public void run() {
        String message;
        GameEngine.m1156ap();
        Thread.currentThread().setName("ReceiveWorker-" + this.f5809b.m1490g());
        try {
            m1486a();
        } catch (EOFException e) {
            this.f5809b.m1501a("network:ReceiveWorker: EOF reading packet", e);
        } catch (IOException e2) {
            if (!this.f5809b.f5797a) {
                e2.printStackTrace();
            }
            if (GameEngine.f6204aZ && (e2 instanceof SocketException) && !this.f5809b.f5797a) {
                GameEngine m1228A = GameEngine.m1228A();
                if (!m1228A.networkEngine.f5485C && m1228A.networkEngine.f5533bm && (message = e2.getMessage()) != null && message.contains("EBADF")) {
                    m1228A.m1110i("Warning: This disconnect likely due to iOS removing sockets of background apps. Avoid minimising the game in multiplayer. Note: Games can be rejoined.");
                }
            }
            this.f5809b.m1495c("network:ReceiveWorker: " + e2.getMessage());
        } catch (OutOfMemoryError e3) {
            GameEngine.m1130c(e3);
            this.f5809b.m1495c("network:ReceiveWorker OutOfMemoryError: " + e3.getMessage());
        }
        Connection.m1503a(this.f5809b, true, false);
    }

    /* renamed from: a */
    void m1486a() {
        DataInputStream dataInputStream = new DataInputStream(this.f5809b.f5761d.getInputStream());
        while (this.f5808a.booleanValue() && !this.f5809b.f5797a && !this.f5809b.f5761d.isClosed()) {
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            if (readInt > 20000000) {
                this.f5809b.m1497b("readData(): new packet of type:" + readInt2 + " has size of:" + readInt);
            }
            if (readInt > 10000) {
                int i = 50000000;
                if (Connection.m1504a(this.f5809b).f5485C) {
                    i = 1000000;
                }
                if (!this.f5809b.f5771p) {
                    i = 10000;
                }
                if (readInt > i) {
                    this.f5809b.m1497b("Requested packet too large rejecting (max:" + i + ")");
                    return;
                }
            }
            if (readInt < 0) {
                this.f5809b.m1497b("Requested packet negative size:" + readInt + " rejecting");
                return;
            }
            C0861at c0861at = new C0861at(readInt2);
            c0861at.f5735c = new byte[readInt];
            this.f5809b.f5796V = 0;
            this.f5809b.f5795U = readInt;
            int i2 = 0;
            c0861at.f5737a = this.f5809b;
            while (i2 < readInt && !this.f5809b.f5797a) {
                int read = dataInputStream.read(c0861at.f5735c, i2, readInt - i2);
                if (read == -1) {
                    this.f5809b.m1497b("we got to the end of the stream?!?");
                    return;
                }
                i2 += read;
                this.f5809b.f5790P++;
                this.f5809b.f5796V = i2;
            }
            this.f5809b.f5795U = 0;
            this.f5809b.f5796V = 0;
            if (!this.f5809b.f5797a) {
                if (c0861at.f5734b > 100) {
                    Connection.m1504a(this.f5809b).m1675c(c0861at);
                } else {
                    Connection.m1504a(this.f5809b).f5601bd.add(c0861at);
                }
            }
        }
    }
}
