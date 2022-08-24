package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ai.class */
class C0689ai implements Cloneable {

    /* renamed from: a */
    public boolean f4343a;

    /* renamed from: b */
    public Bitmap.Config f4344b;

    /* renamed from: c */
    public int f4345c;

    private C0689ai() {
    }

    public int hashCode() {
        int hashCode = this.f4344b.hashCode() ^ this.f4345c;
        return this.f4343a ? hashCode : -hashCode;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0689ai)) {
            return false;
        }
        C0689ai c0689ai = (C0689ai) obj;
        return this.f4343a == c0689ai.f4343a && this.f4344b == c0689ai.f4344b && this.f4345c == c0689ai.f4345c;
    }

    /* renamed from: a */
    public C0689ai clone() {
        try {
            return (C0689ai) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
