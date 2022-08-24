package com.corrodinggames.rts.gameFramework.p034c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.gameFramework.c.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/b.class */
public class RunnableC0738b implements Runnable {

    /* renamed from: a */
    Socket f4630a;

    /* renamed from: b */
    final /* synthetic */ RunnableC0737a f4631b;

    public RunnableC0738b(RunnableC0737a runnableC0737a, Socket socket) {
        this.f4631b = runnableC0737a;
        this.f4630a = socket;
    }

    @Override // java.lang.Runnable
    public void run() {
        String readLine;
        try {
            try {
                PrintWriter printWriter = new PrintWriter(this.f4630a.getOutputStream(), true);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f4630a.getInputStream()));
                while (this.f4631b.f4629i && (readLine = bufferedReader.readLine()) != null) {
                    printWriter.print(RunnableC0737a.m2583a(readLine));
                    printWriter.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    this.f4630a.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            try {
                this.f4630a.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }
}
