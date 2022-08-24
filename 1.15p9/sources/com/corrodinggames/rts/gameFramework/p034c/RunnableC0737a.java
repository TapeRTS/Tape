package com.corrodinggames.rts.gameFramework.p034c;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/a.class */
public class RunnableC0737a implements Runnable {

    /* renamed from: e */
    public static float f4620e;

    /* renamed from: h */
    public ServerSocket f4621h;

    /* renamed from: a */
    public static boolean f4622a = false;

    /* renamed from: b */
    public static boolean f4623b = false;

    /* renamed from: c */
    public static boolean f4624c = false;

    /* renamed from: d */
    public static boolean f4625d = false;

    /* renamed from: g */
    public static boolean f4626g = true;

    /* renamed from: j */
    static ArrayList f4627j = new ArrayList();

    /* renamed from: f */
    boolean f4628f = true;

    /* renamed from: i */
    public boolean f4629i = true;

    /* renamed from: a */
    public static void m2585a() {
        if (!f4622a) {
            return;
        }
        GameEngine.PrintLog("-----");
        GameEngine.PrintLog("-----");
        GameEngine.PrintLog("----- Debug Active ----");
        GameEngine.PrintLog("-----");
        GameEngine.PrintLog("-----");
        GameEngine.f6200aV = true;
        GameEngine.m1228A().mo5695r();
        new RunnableC0737a().m2582b();
    }

    /* renamed from: b */
    public void m2582b() {
        if (f4623b) {
            m2584a(5677, VariableScope.nullOrMissingString);
        }
        GameEngine.m1228A().f6282ea.m761a(new RunnableC0739c(this));
    }

    /* renamed from: a */
    public void m2584a(int i, String str) {
        try {
            f4626g = true;
            GameEngine.f6198aT = true;
            GameEngine.PrintLog(VariableScope.nullOrMissingString);
            GameEngine.PrintLog("----- createDebugSocket ----");
            GameEngine.PrintLog("port: " + i);
            GameEngine.PrintLog("password: " + str);
            GameEngine.PrintLog("------------------");
            GameEngine.PrintLog(VariableScope.nullOrMissingString);
            if (i != -1) {
                this.f4621h = new ServerSocket(i);
                new Thread(this).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private RunnableC0737a() {
    }

    public void run() {
        while (this.f4629i) {
            try {
                Socket accept = this.f4621h.accept();
                try {
                    accept.setTcpNoDelay(true);
                    new Thread(new RunnableC0738b(this, accept)).run();
                } catch (IOException e) {
                    GameEngine.PrintLog("Got IOException on debug connection");
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: a */
    public static String m2583a(String str) {
        int indexOf = str.indexOf(" ");
        if (indexOf == -1) {
            indexOf = str.length();
        }
        String lowerCase = str.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
        if (indexOf != -1 && str.length() >= indexOf + 1) {
            str.substring(indexOf + 1).split(" ");
        }
        if (lowerCase.equalsIgnoreCase("ping")) {
            return "pong";
        }
        if (lowerCase.equalsIgnoreCase("script") || lowerCase.equalsIgnoreCase("function") || lowerCase.equalsIgnoreCase("functionNoTimeout")) {
            return "todo";
        }
        return "unknown command";
    }
}
