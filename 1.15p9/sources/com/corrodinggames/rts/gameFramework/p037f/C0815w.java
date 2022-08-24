package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;

/* renamed from: com.corrodinggames.rts.gameFramework.f.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/w.class */
public class C0815w extends C0817y {

    /* renamed from: a */
    public Paint f5377a;

    /* renamed from: b */
    public int f5378b;

    /* renamed from: c */
    final /* synthetic */ C0813u f5379c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815w(C0813u c0813u, String str, Paint paint) {
        super(c0813u, str);
        this.f5379c = c0813u;
        this.f5378b = 0;
        this.f5377a = paint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815w(C0813u c0813u, String str, Paint paint, int i) {
        super(c0813u, str);
        this.f5379c = c0813u;
        this.f5378b = 0;
        this.f5377a = paint;
        this.f5378b = i;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0817y
    /* renamed from: b */
    public Paint mo1893b(Paint paint) {
        if (this.f5377a == null) {
            if (this.f5378b != 0) {
                C0813u.f5372f.m6498a(paint);
                C0813u.f5372f.m6481b(this.f5378b);
                return C0813u.f5372f;
            }
            return paint;
        } else if (this.f5378b != 0) {
            C0813u.f5372f.m6498a(this.f5377a);
            C0813u.f5372f.m6481b(this.f5378b);
            return C0813u.f5372f;
        } else {
            return this.f5377a;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0817y
    /* renamed from: a */
    public C0815w mo1892b(String str) {
        return new C0815w(this.f5379c, str, this.f5377a, this.f5378b);
    }
}
