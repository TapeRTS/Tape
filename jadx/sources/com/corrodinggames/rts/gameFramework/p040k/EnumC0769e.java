package com.corrodinggames.rts.gameFramework.p040k;

/* renamed from: com.corrodinggames.rts.gameFramework.k.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/e.class */
public enum EnumC0769e {
    objective { // from class: com.corrodinggames.rts.gameFramework.k.e.1
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "objective";
        }
    },
    event_move { // from class: com.corrodinggames.rts.gameFramework.k.e.4
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "move";
        }
    },
    event_changeCredits { // from class: com.corrodinggames.rts.gameFramework.k.e.5
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "changeCredits";
        }
    },
    event_teamTags { // from class: com.corrodinggames.rts.gameFramework.k.e.6
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "teamTags";
        }
    },
    event_unitAdd { // from class: com.corrodinggames.rts.gameFramework.k.e.7
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "unitAdd";
        }
    },
    event_unitRemove { // from class: com.corrodinggames.rts.gameFramework.k.e.8
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "unitRemove";
        }
    },
    mapText { // from class: com.corrodinggames.rts.gameFramework.k.e.9
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "mapText";
        }
    },
    moveCamera { // from class: com.corrodinggames.rts.gameFramework.k.e.10
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "moveCamera";
        }
    },
    trigger_unitDetect { // from class: com.corrodinggames.rts.gameFramework.k.e.11
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "unitDetect";
        }
    },
    trigger_teamTagDetect { // from class: com.corrodinggames.rts.gameFramework.k.e.2
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "teamTagDetect";
        }
    },
    trigger_basic { // from class: com.corrodinggames.rts.gameFramework.k.e.3
        @Override // com.corrodinggames.rts.gameFramework.p040k.EnumC0769e
        /* renamed from: a */
        public String mo798a() {
            return "basic";
        }
    };

    /* renamed from: a */
    public abstract String mo798a();

    /* renamed from: a */
    public static EnumC0769e m799a(String str) {
        EnumC0769e[] values;
        for (EnumC0769e eVar : values()) {
            if (eVar.mo798a().equalsIgnoreCase(str)) {
                return eVar;
            }
        }
        return null;
    }
}
