package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/f.class */
public class C0678f {
    /* renamed from: a */
    public static int m2840a(int i, int i2, EnumC0671a[] enumC0671aArr) {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, i);
            GLES20.glAttachShader(glCreateProgram, i2);
            for (EnumC0671a enumC0671a : enumC0671aArr) {
                GLES20.glBindAttribLocation(glCreateProgram, enumC0671a.m2874a(), enumC0671a.m2873b());
            }
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                Log.m6352a("Utilities", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                glCreateProgram = 0;
            }
        }
        if (glCreateProgram == 0) {
            throw new RuntimeException("Error creating program.");
        }
        return glCreateProgram;
    }

    /* renamed from: a */
    public static int m2839a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                Log.m6352a("Utilities", "Shader fail info: " + GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        if (glCreateShader == 0) {
            throw new RuntimeException("Error creating shader " + i);
        }
        return glCreateShader;
    }
}
