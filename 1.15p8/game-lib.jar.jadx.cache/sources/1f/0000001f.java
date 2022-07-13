package com.corrodinggames.rts.gameFramework.path;

import android.graphics.Paint;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.i.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/k.class */
public class C0824k {

    /* renamed from: a */
    private PathEngine f5522a;

    /* renamed from: e */
    protected int f5523e;

    /* renamed from: f */
    protected static int f5518f;

    /* renamed from: g */
    public int f5524g;

    /* renamed from: h */
    protected short f5525h;

    /* renamed from: i */
    protected short f5526i;

    /* renamed from: j */
    protected Float f5527j;

    /* renamed from: k */
    protected boolean f5528k;

    /* renamed from: l */
    protected short f5529l;

    /* renamed from: m */
    protected short f5530m;

    /* renamed from: n */
    protected short f5531n;

    /* renamed from: o */
    protected MovementType f5532o;

    /* renamed from: p */
    public boolean f5533p;

    /* renamed from: q */
    public int f5534q;

    /* renamed from: r */
    public boolean f5535r;

    /* renamed from: s */
    public float f5536s;

    /* renamed from: t */
    public float f5537t;

    /* renamed from: u */
    public boolean f5538u;

    /* renamed from: v */
    protected boolean f5539v;

    /* renamed from: w */
    protected boolean f5540w;

    /* renamed from: x */
    protected LinkedList f5541x;

    /* renamed from: y */
    public byte[] f5542y;

    /* renamed from: z */
    public byte[] f5543z;

    /* renamed from: A */
    public byte[] f5519A;

    /* renamed from: B */
    public short[] f5520B;

    /* renamed from: C */
    public byte[] f5521C;

    public C0824k(PathEngine pathEngine, boolean z) {
        this.f5522a = pathEngine;
        if (z) {
            int i = f5518f;
            f5518f = i + 1;
            this.f5523e = i;
        }
        this.f5524g = GameEngine.getInstance().frameNumber;
    }

    /* renamed from: a */
    public void m1119a(OutputNetStream outputNetStream) {
        int i;
        if (this.f5541x == null) {
            outputNetStream.writeBoolean(false);
            return;
        }
        outputNetStream.writeBoolean(true);
        outputNetStream.mo1258a("p", true);
        outputNetStream.writeInt(this.f5541x.size());
        if (this.f5541x.size() != 0) {
            C0829p c0829p = (C0829p) this.f5541x.get(0);
            outputNetStream.mo1257a(c0829p.f5619a);
            outputNetStream.mo1257a(c0829p.f5620b);
            for (int i2 = 1; i2 < this.f5541x.size(); i2++) {
                C0829p c0829p2 = (C0829p) this.f5541x.get(i2);
                int i3 = c0829p2.f5619a - c0829p.f5619a;
                int i4 = c0829p2.f5620b - c0829p.f5620b;
                boolean z = CommonUtils.absi(i3) > 1 || CommonUtils.absi(i4) > 1;
                if (z) {
                    GameEngine.PrintLOG("writeOutCompressedPath: out of range:" + i3 + "," + i4);
                    i = 128;
                } else {
                    i = i3 + 1 + ((i4 + 1) << 2);
                }
                outputNetStream.writeByte(i);
                if (z) {
                    outputNetStream.mo1257a(c0829p2.f5619a);
                    outputNetStream.mo1257a(c0829p2.f5620b);
                }
                c0829p = c0829p2;
            }
        }
        outputNetStream.endBlock("p");
    }

    /* renamed from: a */
    public void m1118a(InputNetStream inputNetStream) {
        if (!inputNetStream.readBoolean()) {
            this.f5541x = null;
            return;
        }
        inputNetStream.m1240a("p", true);
        int readInt = inputNetStream.readInt();
        if (readInt > 160000 || readInt < 0) {
            GameEngine.PrintLOG("readInCompressedPath: Path too big at:" + readInt);
            readInt = -1;
        }
        if (readInt != -1) {
            this.f5538u = true;
            if (this.f5541x == null) {
                this.f5541x = new LinkedList();
            }
            this.f5541x.clear();
        }
        if (readInt > 0) {
            short m1212v = inputNetStream.m1212v();
            short m1212v2 = inputNetStream.m1212v();
            this.f5541x.add(new C0829p(m1212v, m1212v2));
            for (int i = 1; i < readInt; i++) {
                byte readByte = inputNetStream.readByte();
                if (readByte < 128) {
                    int i2 = (readByte & 3) - 1;
                    int i3 = ((readByte & 12) >> 2) - 1;
                    if (CommonUtils.absi(i2) > 1 || CommonUtils.absi(i3) > 1) {
                        GameEngine.PrintLOG("readInCompressedPath: out of range but shouldn't be:" + i2 + "," + i3 + " for: " + ((int) readByte));
                    }
                    m1212v = (short) (m1212v + i2);
                    m1212v2 = (short) (m1212v2 + i3);
                    this.f5541x.add(new C0829p(m1212v, m1212v2));
                } else {
                    GameEngine.PrintLOG("readInCompressedPath: out of range unpack:" + ((int) m1212v) + "," + ((int) m1212v2));
                    m1212v = inputNetStream.m1212v();
                    m1212v2 = inputNetStream.m1212v();
                    this.f5541x.add(new C0829p(m1212v, m1212v2));
                }
            }
        }
        inputNetStream.m1230d("p");
    }

    /* renamed from: e */
    public void m1112e() {
        C0822i m1104a = this.f5522a.m1104a(this.f5532o);
        if (m1104a == null) {
            throw new RuntimeException("Could not get costs for:" + this.f5532o.toString());
        }
        this.f5542y = m1104a.f5504d;
        this.f5543z = m1104a.f5505e;
        this.f5519A = m1104a.f5506f;
        this.f5520B = m1104a.f5507g;
        this.f5521C = m1104a.f5510j;
    }

    /* renamed from: f */
    public void m1111f() {
        this.f5542y = null;
        this.f5543z = null;
        this.f5519A = null;
        this.f5520B = null;
        this.f5521C = null;
    }

    /* renamed from: a */
    public void m1120a(MovementType movementType, short s, short s2, Float f, boolean z) {
        if (movementType == null) {
            throw new RuntimeException("MovementType is null");
        }
        this.f5532o = movementType;
        this.f5525h = s;
        this.f5526i = s2;
        this.f5527j = f;
        this.f5528k = z;
        if (this.f5525h < 0) {
            this.f5525h = (short) 0;
        }
        if (this.f5526i < 0) {
            this.f5526i = (short) 0;
        }
        if (this.f5525h > this.f5522a.f5564s - 1) {
            this.f5525h = (short) (this.f5522a.f5564s - 1);
        }
        if (this.f5526i > this.f5522a.f5565t - 1) {
            this.f5526i = (short) (this.f5522a.f5565t - 1);
        }
        if (this.f5522a.m1104a(movementType) == null) {
            throw new RuntimeException("Could not get costs for:" + movementType.toString());
        }
    }

    /* renamed from: a */
    public void m1115a(short s, short s2, short s3) {
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s > this.f5522a.f5564s - 1) {
            s = (short) (this.f5522a.f5564s - 1);
        }
        if (s2 > this.f5522a.f5565t - 1) {
            s2 = (short) (this.f5522a.f5565t - 1);
        }
        this.f5529l = s;
        this.f5530m = s2;
        this.f5531n = s3;
    }

    /* renamed from: b */
    public boolean mo1114b() {
        return false;
    }

    /* renamed from: a */
    public boolean mo1117a(C0824k c0824k) {
        return this == c0824k;
    }

    /* renamed from: a */
    public AbstractC0816c mo1121a(Unit unit) {
        return null;
    }

    /* renamed from: a */
    public LinkedList mo1122a() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.networked || gameEngine.replayEngine.m2303g()) {
            if (this.f5538u) {
                return this.f5541x;
            }
            return null;
        }
        return this.f5541x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1113c() {
        return this.f5541x != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m1116a(LinkedList linkedList) {
        this.f5541x = linkedList;
    }

    /* renamed from: g */
    public void m1110g() {
        GameEngine gameEngine = GameEngine.getInstance();
        Map map = gameEngine.map;
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.m4717a(100, 0, 100, 0);
        gameEngine.graphics.mo219a(((this.f5529l * map.pixel_Width) + map.f792p) - GameEngine.getInstance().f5878ct, ((this.f5530m * map.pixel_Height) + map.f793q) - GameEngine.getInstance().f5879cu, this.f5531n * map.pixel_Width, paint);
        paint.m4717a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0, 0, 255);
        gameEngine.graphics.mo221a(((this.f5525h * map.pixel_Width) + map.f792p) - GameEngine.getInstance().f5878ct, ((this.f5526i * map.pixel_Height) + map.f793q) - GameEngine.getInstance().f5879cu, ((this.f5529l * map.pixel_Width) + map.f792p) - GameEngine.getInstance().f5878ct, ((this.f5530m * map.pixel_Height) + map.f793q) - GameEngine.getInstance().f5879cu, paint);
    }

    /* renamed from: h */
    public void m1109h() {
        if (this.f5541x != null) {
            GameEngine gameEngine = GameEngine.getInstance();
            Map map = gameEngine.map;
            if (this.f5541x.size() >= 1) {
                for (int i = 1; i < this.f5541x.size(); i++) {
                    C0829p c0829p = (C0829p) this.f5541x.get(i);
                    C0829p c0829p2 = (C0829p) this.f5541x.get(i - 1);
                    Paint paint = new Paint();
                    paint.m4717a(255, 0, 255, 0);
                    paint.setStrokeWidth(2.0f);
                    gameEngine.graphics.mo221a(((c0829p.f5619a * map.pixel_Width) + map.f792p) - GameEngine.getInstance().f5878ct, ((c0829p.f5620b * map.pixel_Height) + map.f793q) - GameEngine.getInstance().f5879cu, ((c0829p2.f5619a * map.pixel_Width) + map.f792p) - GameEngine.getInstance().f5878ct, ((c0829p2.f5620b * map.pixel_Height) + map.f793q) - GameEngine.getInstance().f5879cu, paint);
                }
            }
        }
    }
}