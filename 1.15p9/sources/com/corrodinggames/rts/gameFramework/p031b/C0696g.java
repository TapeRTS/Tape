package com.corrodinggames.rts.gameFramework.p031b;

/* renamed from: com.corrodinggames.rts.gameFramework.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/g.class */
public class C0696g extends C0670a {

    /* renamed from: a */
    private float f4368a;

    /* renamed from: a */
    public void m2782a(float f) {
        this.f4368a = f;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.C0670a, com.corrodinggames.rts.gameFramework.p031b.InterfaceC0697h
    /* renamed from: a */
    public String mo2781a() {
        return "uniform mat4 uMatrix;\nuniform mat4 uProjection;\nattribute vec2 aPosition;\nvarying vec2 vDrawRegionCoord;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uProjection * uMatrix * pos;\n  vDrawRegionCoord = pos.xy;\n}\n";
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.C0670a, com.corrodinggames.rts.gameFramework.p031b.InterfaceC0697h
    /* renamed from: b */
    public String mo2780b() {
        return "precision mediump float;\nvarying vec2 vDrawRegionCoord;\nuniform vec4 uColor;\nuniform float lineWidth;\nvoid main() {\n  float dx = vDrawRegionCoord.x - 0.5;\n  float dy = vDrawRegionCoord.y - 0.5;\n  float powVal = dx*dx + dy*dy; \n  float subRadius = 0.5 - lineWidth; \n  if(powVal >= subRadius * subRadius && powVal <= 0.5 * 0.5) {\n    gl_FragColor = uColor;\n  } else {\n    gl_FragColor = vec4(0, 0, 0, 0);\n  }\n \n}\n";
    }
}
