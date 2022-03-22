package com.corrodinggames.rts.game;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.corrodinggames.rts.game.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/j.class */
class RunnableC0168j implements Runnable {

    /* renamed from: a */
    public Bitmap f1208a;

    /* renamed from: b */
    public int f1209b;

    /* renamed from: c */
    public boolean f1210c = true;

    /* renamed from: d */
    public Thread f1211d;

    /* renamed from: e */
    final /* synthetic */ C0166i f1212e;

    RunnableC0168j(C0166i iVar) {
        this.f1212e = iVar;
    }

    /* renamed from: a */
    public synchronized void m3539a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f1212e.f1158j + "image_" + String.format("%07d", Integer.valueOf(this.f1209b)) + ".jpg"));
                this.f1208a.m4253a(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                this.f1212e.f5490aY = false;
                this.f1212e.m718a("Error saving jpg, recording has stopped. Is there free space remaining on the SD card?", 1);
            }
        }
    }
}
