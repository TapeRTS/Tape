package com.corrodinggames.rts.gameFramework.p045m;

/* renamed from: com.corrodinggames.rts.gameFramework.m.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/e.class */
public enum EnumC1037e {
    f6640a { // from class: com.corrodinggames.rts.gameFramework.m.e.1
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "objective";
        }
    },
    f6641b { // from class: com.corrodinggames.rts.gameFramework.m.e.4
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "move";
        }
    },
    f6642c { // from class: com.corrodinggames.rts.gameFramework.m.e.5
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "changeCredits";
        }
    },
    f6643d { // from class: com.corrodinggames.rts.gameFramework.m.e.6
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "teamTags";
        }
    },
    f6644e { // from class: com.corrodinggames.rts.gameFramework.m.e.7
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "unitAdd";
        }
    },
    f6645f { // from class: com.corrodinggames.rts.gameFramework.m.e.8
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "unitRemove";
        }
    },
    f6646g { // from class: com.corrodinggames.rts.gameFramework.m.e.9
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "mapText";
        }
    },
    f6647h { // from class: com.corrodinggames.rts.gameFramework.m.e.10
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "moveCamera";
        }
    },
    f6648i { // from class: com.corrodinggames.rts.gameFramework.m.e.11
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "unitDetect";
        }
    },
    f6649j { // from class: com.corrodinggames.rts.gameFramework.m.e.2
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "teamTagDetect";
        }
    },
    f6650k { // from class: com.corrodinggames.rts.gameFramework.m.e.3
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo827a() {
            return "basic";
        }
    };

    /* renamed from: a */
    public abstract String mo827a();

    /* renamed from: a */
    public static EnumC1037e m828a(String str) {
        EnumC1037e[] values;
        for (EnumC1037e enumC1037e : values()) {
            if (enumC1037e.mo827a().equalsIgnoreCase(str)) {
                return enumC1037e;
            }
        }
        return null;
    }
}
