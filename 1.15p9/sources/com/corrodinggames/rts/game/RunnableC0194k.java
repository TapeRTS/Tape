package com.corrodinggames.rts.game;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/k.class */
public class RunnableC0194k implements Runnable {

    /* renamed from: a */
    public Bitmap f1285a;

    /* renamed from: b */
    public int f1286b;

    /* renamed from: c */
    final /* synthetic */ C0191i f1287c;

    public void run() {
        synchronized (this) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f1287c.f1223h + "image_" + String.format("%07d", Integer.valueOf(this.f1286b)) + ".jpg"));
                this.f1285a.m6560a(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                this.f1287c.f6228bo = false;
                this.f1287c.m1186a("Error saving jpg, recording has stopped. Is there free space remaining on the SD card?", 1);
            }
        }
    }
}
