package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.awt.Toolkit;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.SlickException;

/* renamed from: com.corrodinggames.rts.java.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/i.class */
class RunnableC0911i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Main f6078a;

    RunnableC0911i(Main main) {
        this.f6078a = main;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0789l.m702ag();
        try {
            this.f6078a.f5862k.start();
        } catch (SlickException e) {
            if (!"Failed to initialise the LWJGL display".equals(e.getMessage())) {
                throw new RuntimeException((Throwable) e);
            }
            AbstractC0789l.m714a("Error starting display", (Throwable) e);
            String str = "\nFailed to get opengl version";
            try {
                System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
                Display.setDisplayMode(new DisplayMode(100, 100));
                Display.create();
                String glGetString = GL11.glGetString(7938);
                Display.destroy();
                AbstractC0789l.m670d("OpenGL version: " + glGetString);
                str = "\nOpenGL version detected: " + glGetString;
                if (glGetString.startsWith("1.0") || glGetString.startsWith("1.1")) {
                    str = str + "\n---\nOpenGL 1.1 is over 20 years old you might be using a fallback microsoft driver. Try updating your graphics drivers from the manufacturer.";
                }
            } catch (Exception e2) {
                AbstractC0789l.m714a("Failed to get opengl info", (Throwable) e2);
            }
            Toolkit.getDefaultToolkit();
            Sys.alert("Error", "Failed to create display." + str);
            System.exit(1);
        }
        AbstractC0789l.m670d("Game stopped running shutting down");
        AbstractC0789l.m638u().f5526bI.m386a("lastgame");
        this.f6078a.m369a(true);
    }
}
