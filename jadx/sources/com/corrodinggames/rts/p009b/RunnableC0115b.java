package com.corrodinggames.rts.p009b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/b/b.class */
public class RunnableC0115b implements Runnable {

    /* renamed from: a */
    Socket f502a;

    /* renamed from: b */
    final /* synthetic */ RunnableC0103a f503b;

    public RunnableC0115b(RunnableC0103a aVar, Socket socket) {
        this.f503b = aVar;
        this.f502a = socket;
    }

    @Override // java.lang.Runnable
    public void run() {
        String readLine;
        try {
            try {
                PrintWriter printWriter = new PrintWriter(this.f502a.getOutputStream(), true);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f502a.getInputStream()));
                while (this.f503b.f481b && (readLine = bufferedReader.readLine()) != null) {
                    printWriter.print(RunnableC0103a.m3901b(readLine));
                    printWriter.flush();
                }
                try {
                    this.f502a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                try {
                    this.f502a.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        } catch (Throwable th) {
            try {
                this.f502a.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }
}
