package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/c.class */
class C0820c extends Throwable {

    /* renamed from: a */
    final /* synthetic */ C0819b f5743a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C0820c(C0819b bVar, C0820c cVar) {
        super(r1, cVar);
        String str;
        this.f5743a = bVar;
        str = bVar.f5741a;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = this.f5743a.f5742b;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}
