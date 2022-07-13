package com.corrodinggames.rts.game.map;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Tree;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p017b.C0383i;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.mission.MissionEngine;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.AbstractC0914af;
import com.corrodinggames.rts.gameFramework.utility.C0913ae;
import com.corrodinggames.rts.gameFramework.utility.C0936j;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.locks.ReentrantLock;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: com.corrodinggames.rts.game.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/b.class */
public final class Map {

    /* renamed from: f */
    static boolean f766f;

    /* renamed from: l */
    public static C0175h f767l;

    /* renamed from: m */
    public static C0175h f768m;

    /* renamed from: n */
    public int pixel_Width;

    /* renamed from: o */
    public int pixel_Height;

    /* renamed from: p */
    public int f792p;

    /* renamed from: q */
    public int f793q;

    /* renamed from: r */
    public float f794r;

    /* renamed from: s */
    public float f795s;

    /* renamed from: w */
    public MapLayer f796w;

    /* renamed from: B */
    public int mapWidth;

    /* renamed from: C */
    public int mapHeight;

    /* renamed from: I */
    public static BitmapOrTexture f764I;

    /* renamed from: J */
    public static Graphics f765J;

    /* renamed from: K */
    public byte[][] f771K;

    /* renamed from: L */
    public byte[][] f772L;

    /* renamed from: O */
    public ObjectGroup objectGroup_triggers;

    /* renamed from: P */
    public int returnX;

    /* renamed from: Q */
    public int returnY;

    /* renamed from: S */
    public boolean f776S;

    /* renamed from: T */
    public boolean f777T;

    /* renamed from: U */
    public int f778U;

    /* renamed from: V */
    public int f779V;

    /* renamed from: X */
    Paint f780X;

    /* renamed from: Y */
    Paint f781Y;

    /* renamed from: Z */
    Paint f782Z;

    /* renamed from: aa */
    Paint f783aa;

    /* renamed from: ab */
    Paint f784ab;

    /* renamed from: ac */
    Paint f785ac;

    /* renamed from: ad */
    float f786ad;

    /* renamed from: ak */
    long f787ak;

    /* renamed from: al */
    float f788al;

    /* renamed from: am */
    float f789am;

    /* renamed from: a */
    static final boolean f797a = false;

    /* renamed from: b */
    static final boolean f798b = false;

    /* renamed from: c */
    static final boolean f799c = false;

    /* renamed from: d */
    public static boolean f800d = false;

    /* renamed from: e */
    static ReentrantLock f801e = new ReentrantLock();

    /* renamed from: g */
    static Paint f802g = new Paint();

    /* renamed from: h */
    static Paint f803h = new Paint();

    /* renamed from: i */
    static Paint f804i = new Paint();

    /* renamed from: j */
    static Paint f805j = new Paint();

    /* renamed from: G */
    public static boolean f806G = false;

    /* renamed from: H */
    public static boolean f807H = false;

    /* renamed from: ag */
    public static C0170c f808ag = new C0170c();

    /* renamed from: k */
    boolean[] f809k = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];

    /* renamed from: t */
    public ArrayList f810t = new ArrayList();

    /* renamed from: u */
    public MapLayer mainLayer = null;

    /* renamed from: v */
    public MapLayer mainLayer2 = null;

    /* renamed from: x */
    public MapLayer objectLayer = null;

    /* renamed from: y */
    public ArrayList f814y = new ArrayList();

    /* renamed from: z */
    public ArrayList resPools = new ArrayList();

    /* renamed from: an */
    private int f816an = 1;

    /* renamed from: A */
    public MapTile[] f817A = new MapTile[0];

    /* renamed from: D */
    public boolean f818D = true;

    /* renamed from: E */
    public boolean f819E = false;

    /* renamed from: F */
    public boolean f820F = false;

    /* renamed from: M */
    Rect f821M = new Rect();

    /* renamed from: N */
    protected ArrayList objectGroups = new ArrayList();

    /* renamed from: R */
    public PointF f823R = new PointF();

    /* renamed from: W */
    float f824W = 0.0f;

    /* renamed from: ae */
    float f825ae = 1.0f;

    /* renamed from: af */
    int f826af = 0;

    /* renamed from: ah */
    Paint f827ah = new Paint();

    /* renamed from: ai */
    Rect f828ai = new Rect();

    /* renamed from: aj */
    Rect f829aj = new Rect();

    /* renamed from: a */
    public static void m4170a() {
        if (f766f) {
            return;
        }
        f801e.lock();
    }

    /* renamed from: b */
    public static void m4136b() {
        if (f766f) {
            return;
        }
        f801e.unlock();
    }

    /* renamed from: c */
    public static void m4128c() {
        GameEngine gameEngine = GameEngine.getInstance();
        f802g.m4717a(150, 255, 255, 255);
        f802g.setStyle(Paint.Style.f217b);
        f802g.setStrokeWidth(1.0f);
        gameEngine.m892a(f802g, 16.0f);
        f803h.m4717a(150, 255, 0, 0);
        f803h.setStyle(Paint.Style.f217b);
        f803h.setStrokeWidth(1.0f);
        f804i.m4717a(150, 0, 255, 0);
        f804i.setStyle(Paint.Style.f217b);
        f804i.setStrokeWidth(1.0f);
        f805j.m4717a(150, 255, 0, 0);
        long tookTime = C0651bl.getTookTime();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.fog_smooth);
        f764I = gameEngine.graphics.mo161b(((20 + 2) * 16) + 1, ((20 + 2) * 16) + 1, true);
        f764I.f5665m = true;
        f765J = gameEngine.graphics.mo199a(f764I);
        BitmapOrTexture mo161b = gameEngine.graphics.mo161b(20 + 1, 20 + 1, true);
        Graphics mo199a = gameEngine.graphics.mo199a(mo161b);
        m4138a(m4132b(1), 2, 5, true, mo161b, mo199a, loadImage);
        m4138a(m4132b(2), 0, 5, true, mo161b, mo199a, loadImage);
        m4138a(m4132b(4), 0, 3, true, mo161b, mo199a, loadImage);
        m4138a(m4132b(8), 2, 3, true, mo161b, mo199a, loadImage);
        m4138a(m4159a(16, 1, 2), 1, 0, true, mo161b, mo199a, loadImage);
        m4138a(m4159a(32, 2, 4), 2, 1, true, mo161b, mo199a, loadImage);
        m4138a(m4159a(64, 8, 4), 1, 2, true, mo161b, mo199a, loadImage);
        m4138a(m4159a(-128, 1, 8), 0, 1, true, mo161b, mo199a, loadImage);
        m4138a(m4159a(16 + 32, 2, 1, 4), 2, 0, true, mo161b, mo199a, loadImage);
        m4138a(m4159a(32 + 64, 4, 8, 2), 2, 2, true, mo161b, mo199a, loadImage);
        m4138a(m4159a(64 - 128, 8, 4, 1), 0, 2, true, mo161b, mo199a, loadImage);
        m4138a(m4159a((-128) + 16, 1, 8, 2), 0, 0, true, mo161b, mo199a, loadImage);
        m4137a(m4132b(1 + 2), m4139a(2, 5, 0, 5), true, mo161b, mo199a, loadImage);
        m4137a(m4132b(2 + 4), m4139a(0, 5, 0, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4132b(4 + 8), m4139a(0, 3, 2, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4132b(8 + 1), m4139a(2, 3, 2, 5), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(16 + 32 + 64, 1, 2, 4, 8), m4139a(2, 0, 2, 2), true, mo161b, mo199a, loadImage);
        m4137a(m4159a((32 + 64) - 128, 1, 2, 4, 8), m4139a(2, 2, 0, 2), true, mo161b, mo199a, loadImage);
        m4137a(m4159a((64 - 128) + 16, 1, 2, 4, 8), m4139a(0, 2, 0, 0), true, mo161b, mo199a, loadImage);
        m4137a(m4159a((-128) + 16 + 32, 1, 2, 4, 8), m4139a(0, 0, 2, 0), true, mo161b, mo199a, loadImage);
        m4137a(m4132b(16 + 64), m4139a(1, 0, 1, 2), true, mo161b, mo199a, loadImage);
        m4137a(m4132b((-128) + 32), m4139a(0, 1, 2, 1), true, mo161b, mo199a, loadImage);
        m4137a(m4132b(1 + 4), m4139a(2, 5, 0, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4132b(2 + 8), m4139a(0, 5, 2, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(16 + 4, 2, 1), m4139a(1, 0, 0, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(64 + 2, 4, 8), m4139a(1, 2, 0, 5), true, mo161b, mo199a, loadImage);
        m4137a(m4159a((-128) + 2, 1, 8), m4139a(0, 1, 0, 5), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(32 + 1, 2, 4), m4139a(2, 1, 2, 5), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(16 + 8, 2, 1), m4139a(1, 0, 2, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(64 + 1, 4, 8), m4139a(1, 2, 2, 5), true, mo161b, mo199a, loadImage);
        m4137a(m4159a((-128) + 4, 1, 8), m4139a(0, 1, 0, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(32 + 8, 2, 4), m4139a(2, 1, 2, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(16 + 4 + 8, 2, 1), m4139a(1, 0, 0, 3, 2, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(64 + 2 + 1, 4, 8), m4139a(1, 2, 0, 5, 2, 5), true, mo161b, mo199a, loadImage);
        m4137a(m4159a((-128) + 2 + 4, 1, 8), m4139a(0, 1, 2, 5, 2, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4159a(32 + 1 + 8, 2, 4), m4139a(2, 1, 0, 5, 0, 3), true, mo161b, mo199a, loadImage);
        m4137a(m4132b(-1), m4139a(1, 4), true, mo161b, mo199a, loadImage);
        f765J.mo130o();
        f765J.mo129p();
        f765J = null;
        mo199a.mo129p();
        C0651bl.m2274a("smoothFog load took:", tookTime);
        f806G = gameEngine.curSettings.softFogFading;
        if (GameEngine.isNonDedicatedServer() && Build.VERSION.SDK_INT > 26) {
            long maxMemory = Runtime.getRuntime().maxMemory() / 1048576;
            GameEngine.PrintLOG("MaxHeapSizeInMB:" + maxMemory);
            if (maxMemory > 200) {
                GameEngine.PrintLOG("enabling softFades");
                f806G = true;
            }
        }
        f767l = new C0175h(1.0f, false);
        f767l.m4068a();
        f768m = new C0175h(0.5f, false);
        f768m.m4068a();
    }

    /* renamed from: b */
    private static int[] m4132b(int i) {
        return new int[]{i};
    }

    /* renamed from: a */
    private static int[] m4159a(int i, int... iArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        if (iArr.length == 1) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
        } else if (iArr.length == 2) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
        } else if (iArr.length == 3) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
        } else if (iArr.length == 4) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[2] + iArr[3]));
        } else {
            throw new RuntimeException("unhandled:" + iArr.length);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private static int[] m4139a(int... iArr) {
        return iArr;
    }

    /* renamed from: a */
    private static void m4138a(int[] iArr, int i, int i2, boolean z, BitmapOrTexture bitmapOrTexture, Graphics graphics, BitmapOrTexture bitmapOrTexture2) {
        m4137a(iArr, m4139a(i, i2), z, bitmapOrTexture, graphics, bitmapOrTexture2);
    }

    /* renamed from: a */
    private static void m4137a(int[] iArr, int[] iArr2, boolean z, BitmapOrTexture bitmapOrTexture, Graphics graphics, BitmapOrTexture bitmapOrTexture2) {
        if (z) {
            graphics.mo131n();
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        rect.set(0, 0, 20, 20);
        for (int i = 0; i < iArr2.length; i += 2) {
            int i2 = iArr2[i + 0] * 20;
            int i3 = iArr2[i + 1] * 20;
            rect2.set(i2, i3, i2 + 20, i3 + 20);
            graphics.mo191a(bitmapOrTexture2, rect2, rect, (Paint) null);
            rect4.set(rect2.right - 1, rect2.top, rect2.right, rect2.bottom);
            rect3.set(rect.right, rect.top, rect.right + 1, rect.bottom);
            graphics.mo191a(bitmapOrTexture2, rect4, rect3, (Paint) null);
            rect4.set(rect2.left, rect2.bottom - 1, rect2.right, rect2.bottom);
            rect3.set(rect.left, rect.bottom, rect.right, rect.bottom + 1);
            graphics.mo191a(bitmapOrTexture2, rect4, rect3, (Paint) null);
        }
        graphics.mo130o();
        for (int i4 : iArr) {
            m4160a(i4 + 128, bitmapOrTexture);
        }
    }

    /* renamed from: a */
    public static void m4160a(int i, BitmapOrTexture bitmapOrTexture) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        rect2.set(0, 0, 20, 20);
        m4161a(i, rect);
        C0175h.m4060a(f765J, bitmapOrTexture, rect2, rect, (Paint) null);
    }

    /* renamed from: a */
    public static void m4161a(int i, Rect rect) {
        int i2 = ((i % 16) * (20 + 2)) + 1;
        int i3 = (((int) (i * 0.0625f)) * (20 + 2)) + 1;
        rect.left = i2;
        rect.top = i3;
        rect.right = i2 + 20;
        rect.bottom = i3 + 20;
    }

    /* renamed from: a */
    public final short m4156a(MapTile mapTile) {
        if (this.f816an >= this.f817A.length) {
            MapTile[] mapTileArr = new MapTile[CommonUtils.mini(this.f817A.length + 100, 32767)];
            System.arraycopy(this.f817A, 0, mapTileArr, 0, this.f817A.length);
            this.f817A = mapTileArr;
        }
        int i = this.f816an;
        if (this.f816an < 32766) {
            this.f816an++;
        } else {
            GameEngine.log("Max unique tile limit reached at: " + this.f816an);
        }
        this.f817A[i] = mapTile;
        return (short) i;
    }

    /* renamed from: a */
    public final MapTile m4140a(short s) {
        return this.f817A[s];
    }

    /* renamed from: a */
    public MapTile m4155a(MapTile mapTile, int i, int i2) {
        int length;
        if (mapTile.f904m != null && (((i * 13) + (i2 * 1313)) % (mapTile.f904m.length + 1)) - 1 >= 0) {
            return mapTile.f904m[length];
        }
        return mapTile;
    }

    /* renamed from: a */
    public boolean m4166a(float f, float f2, Team team) {
        if (this.f818D) {
            int i = (int) (f * this.f794r);
            int i2 = (int) (f2 * this.f795s);
            if (team.fogOfWar_map != null && isInMap(i, i2) && team.fogOfWar_map[i][i2] >= 5) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m4163a(int i, int i2, Team team) {
        if (this.f818D && team.fogOfWar_map != null && isInMap(i, i2) && team.fogOfWar_map[i][i2] >= 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m4168a(float f, float f2) {
        this.returnX = (int) (f * this.f794r);
        this.returnY = (int) (f2 * this.f795s);
    }

    /* renamed from: a */
    public void fromGrid(int i, int i2) {
        this.returnX = i * this.pixel_Width;
        this.returnY = i2 * this.pixel_Height;
    }

    /* renamed from: b */
    public void m4131b(int i, int i2) {
        this.returnX = (i * this.pixel_Width) + this.f792p;
        this.returnY = (i2 * this.pixel_Height) + this.f793q;
    }

    /* renamed from: a */
    public PointF m4158a(Point point) {
        this.f823R.set(point.game * this.pixel_Width, point.y * this.pixel_Height);
        return this.f823R;
    }

    /* renamed from: b */
    public void m4134b(float f, float f2) {
        m4168a(f, f2);
        fromGrid(this.returnX, this.returnY);
    }

    /* renamed from: a */
    public float m4169a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > getWidthInPixels()) {
            f = getWidthInPixels();
        }
        return f;
    }

    /* renamed from: b */
    public float m4135b(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > getHeightInPixels()) {
            f = getHeightInPixels();
        }
        return f;
    }

    /* renamed from: c */
    public final boolean isInMap(int i, int i2) {
        return i >= 0 && i < this.mapWidth && i2 >= 0 && i2 < this.mapHeight;
    }

    /* renamed from: c */
    public MapTile m4126c(float f, float f2) {
        int indexX = (int) (f * this.f794r);
        int i = (int) (f2 * this.f795s);
        if (indexX < 0 || indexX >= this.mapWidth || i < 0 || i >= this.mapHeight) {
            return null;
        }
        return this.mainLayer.tiles(indexX, i);
    }

    /* renamed from: d */
    public MapTile getTileFromMainLayer(int i, int i2) {
        if (!isInMap(i, i2)) {
            return null;
        }
        return this.mainLayer.tiles(i, i2);
    }

    /* renamed from: e */
    public MapTile getTileFromObjectLayer(int i, int i2) {
        if (!isInMap(i, i2) || this.objectLayer == null) {
            return null;
        }
        return this.objectLayer.tiles(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4157a(RectF rectF) {
        if (GameEngine.m795y()) {
            rectF.left *= this.pixel_Width / 20;
            rectF.right *= this.pixel_Width / 20;
            rectF.top *= this.pixel_Height / 20;
            rectF.bottom *= this.pixel_Height / 20;
        }
    }

    public Map() {
        this.pixel_Width = 20;
        this.pixel_Height = 20;
        if (GameEngine.m795y()) {
            this.pixel_Width = 60;
            this.pixel_Height = 60;
        }
        this.f792p = this.pixel_Width / 2;
        this.f793q = this.pixel_Height / 2;
        this.f794r = 1.0f / this.pixel_Width;
        this.f795s = 1.0f / this.pixel_Height;
        this.f780X = new UniquePaint();
        this.f780X.m4717a(100, 255, 0, 0);
        this.f780X.mo934b(16.0f);
        this.f781Y = new UniquePaint();
        this.f781Y.setStyle(Paint.Style.f217b);
        this.f781Y.setStrokeWidth(1.0f);
        this.f781Y.m4717a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0);
        this.f782Z = new UniquePaint();
        this.f782Z.setStyle(Paint.Style.f217b);
        this.f782Z.setStrokeWidth(1.0f);
        this.f782Z.m4717a(100, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 0);
        this.f783aa = new UniquePaint();
        this.f783aa.setStyle(Paint.Style.f217b);
        this.f783aa.setStrokeWidth(1.0f);
        this.f783aa.m4717a(255, 175, 0, 0);
        this.f784ab = new UniquePaint();
        this.f784ab.m4717a(155, 175, 0, 0);
        this.f785ac = new UniquePaint();
        this.f785ac.m4710a(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: a */
    public static void m4145a(String str, OutputNetStream outputNetStream) {
        InputStream m4130b = m4130b(str);
        if (m4130b == null) {
            throw new IOException("writeMapStream: Could not find map:" + str);
        }
        int m4146a = (int) m4146a(str);
        if (m4146a == -1) {
            new IOException("writeMapStream: Failed to get map size");
        }
        if (m4146a == 0) {
            new IOException("writeMapStream: Got empty map size");
        }
        GameEngine.PrintLOG("Sending map stream of size: " + m4146a);
        outputNetStream.writeStream(m4130b, m4146a);
    }

    /* renamed from: a */
    public static long m4146a(String str) {
        String str2 = VariableScope.nullOrMissingString + str;
        String m2162e = C0670a.m2162e(str2);
        AbstractC0914af m594a = C0913ae.m594a(m2162e);
        if (m594a != null && !m2162e.endsWith(".rwmod")) {
            long mo587a = m594a.mo587a(m2162e, false);
            if (mo587a == -1) {
            }
            return mo587a;
        } else if (C0670a.m2166c(str2)) {
            try {
                return GameEngine.getInstance().f5935ao.mo4796d().m4781b(m2162e).getLength();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return new File(m2162e).length();
        }
    }

    /* renamed from: b */
    public static InputStream m4130b(String str) {
        InputStream m4119d;
        InputStream m4119d2 = m4119d(str);
        if (m4119d2 == null && (m4119d = m4119d(str.replace(".tmx", VariableScope.nullOrMissingString) + "_moved")) != null) {
            String trim = CommonUtils.m1720a(m4119d).trim();
            GameEngine.PrintLOG("Found moved map at:" + trim);
            m4119d2 = m4119d(trim);
        }
        return m4119d2;
    }

    /* renamed from: c */
    public static String m4124c(String str) {
        if (str == null) {
            return null;
        }
        return C0670a.m2162e(str);
    }

    /* renamed from: d */
    public static InputStream m4119d(String str) {
        String m4124c = m4124c(VariableScope.nullOrMissingString + str);
        GameEngine.PrintLOG("Mapfile: " + m4124c);
        return C0670a.m2156j(m4124c);
    }

    /* renamed from: a */
    public void m4141a(Document document, OutputStream outputStream) {
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        newTransformer.setOutputProperty("indent", "yes");
        newTransformer.transform(new DOMSource(document), new StreamResult(outputStream));
    }

    /* renamed from: a */
    public void m4148a(InputStream inputStream, OutputStream outputStream) {
        float f;
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(false);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        newDocumentBuilder.setEntityResolver(new EntityResolver() { // from class: com.corrodinggames.rts.game.b.b.1
            @Override // org.xml.sax.EntityResolver
            public InputSource resolveEntity(String str, String str2) {
                return new InputSource(new ByteArrayInputStream(new byte[0]));
            }
        });
        Document parse = newDocumentBuilder.parse(inputStream);
        Element documentElement = parse.getDocumentElement();
        String attribute = documentElement.getAttribute("orientation");
        if (!attribute.equals("orthogonal")) {
            throw new C0173f("Only orthogonal maps are supported, found: " + attribute);
        }
        NodeList elementsByTagName = documentElement.getElementsByTagName("SOMETHING");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
        }
        NodeList elementsByTagName2 = documentElement.getElementsByTagName("layer");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName2.item(i2);
            if ("units".equalsIgnoreCase(element2.getAttribute("name"))) {
                element2.getParentNode().removeChild(element2);
            }
        }
        NodeList elementsByTagName3 = documentElement.getElementsByTagName("objectgroup");
        for (int i3 = 0; i3 < elementsByTagName3.getLength(); i3++) {
            Element element3 = (Element) elementsByTagName3.item(i3);
            if ("UnitObjects".equalsIgnoreCase(element3.getAttribute("name"))) {
                element3.getParentNode().removeChild(element3);
            }
        }
        Element createElement = parse.createElement("objectgroup");
        createElement.setAttribute("name", "UnitObjects");
        Iterator it = Unit.m3767bE().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if ((unit instanceof Unit) && (!(unit instanceof Tree) || !((Tree) unit).f1603bE)) {
                if (!unit.dead && !unit.mo1773u()) {
                    C0383i m3735dj = unit.m3735dj();
                    if (unit.f1630cF != null && m3735dj != null) {
                        if (!m3735dj.f2325D) {
                        }
                    } else {
                        Element createElement2 = parse.createElement("object");
                        int i4 = 20;
                        if (20 < unit.radius) {
                            i4 = (int) unit.radius;
                        }
                        createElement2.setAttribute("name", unit.getUnitType().mo3087i() + " (t:" + unit.team.teamID + ")");
                        createElement2.setAttribute("x", VariableScope.nullOrMissingString + (unit.x - (i4 / 2)));
                        createElement2.setAttribute("y", VariableScope.nullOrMissingString + (unit.y - (i4 / 2)));
                        createElement2.setAttribute("width", VariableScope.nullOrMissingString + i4);
                        createElement2.setAttribute("height", VariableScope.nullOrMissingString + i4);
                        if (unit.mo2975bH()) {
                            f = unit.direction;
                        } else {
                            f = unit.direction + 90.0f;
                        }
                        createElement2.setAttribute("rotation", VariableScope.nullOrMissingString + f);
                        Integer m4152a = m4152a(unit.getUnitType());
                        if (m4152a != null) {
                            createElement2.setAttribute("gid", VariableScope.nullOrMissingString + m4152a);
                        }
                        Element createElement3 = parse.createElement("properties");
                        Element createElement4 = parse.createElement("property");
                        createElement4.setAttribute("name", "unit");
                        createElement4.setAttribute("value", unit.getUnitType().mo3087i());
                        createElement3.appendChild(createElement4);
                        Element createElement5 = parse.createElement("property");
                        createElement5.setAttribute("name", "team");
                        createElement5.setAttribute("value", VariableScope.nullOrMissingString + unit.team.teamID);
                        createElement3.appendChild(createElement5);
                        createElement2.appendChild(createElement3);
                        createElement.appendChild(createElement2);
                    }
                }
            }
        }
        documentElement.appendChild(createElement);
        m4141a(parse, outputStream);
    }

    /* renamed from: a */
    public boolean m4144a(String str, String str2) {
        GameEngine game = GameEngine.getInstance();
        try {
            m4129b(str, str2);
            game.interfaceEngine.messageInterface.m1810a(null, "Map exported.");
            return true;
        } catch (C0173f e) {
            game.showMessageBox("Error exporting map", "Failed to export map. error: " + e.getMessage());
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            game.showMessageBox("Error exporting map", "Failed to export map. IO error: " + e2.getMessage());
            return false;
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
            game.showMessageBox("Error exporting map", "Failed to export map. Class not found: " + e3.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public void m4129b(String str, String str2) {
        GameEngine.PrintLOG(" --- Saving map:" + str + " to: " + str2);
        InputStream m4130b = m4130b(str);
        if (m4130b == null) {
            throw new IOException("Could not find orginal map: " + str);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(m4130b);
        String m2162e = C0670a.m2162e(str2);
        File parentFile = new File(m2162e).getParentFile();
        if (!C0670a.m2158h(parentFile.getAbsolutePath())) {
            C0670a.m2155k(parentFile.getAbsolutePath());
        }
        if (!C0670a.m2160f(parentFile.getAbsolutePath())) {
            GameEngine.log("Save Map: Could not create parent directory");
        }
        try {
            OutputStream m2169b = C0670a.m2169b(m2162e, false);
            if (m2169b == null) {
                throw new IOException("Failed to get save target:" + m2162e);
            }
            try {
                m4148a(bufferedInputStream, m2169b);
                try {
                    m2169b.close();
                    bufferedInputStream.close();
                    m4130b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                throw new IOException(e2);
            } catch (ParserConfigurationException e3) {
                throw new IOException(e3);
            } catch (TransformerException e4) {
                throw new IOException(e4);
            } catch (SAXException e5) {
                throw new IOException(e5);
            }
        } catch (FileNotFoundException e6) {
            throw new IOException("Failed to open save target:" + m2162e);
        }
    }

    /* renamed from: a */
    public void m4142a(String str, boolean z) {
        GameEngine.PrintLOG(" --- Loading map ---");
        InputStream m4130b = m4130b(str);
        if (m4130b == null) {
            throw new C0173f("Could not find map: " + C0670a.m2164d(m4124c(str)));
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(m4130b);
        m4147a(bufferedInputStream, z);
        try {
            bufferedInputStream.close();
            m4130b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m4147a(InputStream inputStream, boolean z) {
        int m4062a;
        NodeList elementsByTagName;
        this.resPools.clear();
        f767l.m4059b();
        f768m.m4059b();
        try {
            GameEngine.PrintLOG("---- Loading map data ----");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setValidating(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(new EntityResolver() { // from class: com.corrodinggames.rts.game.b.b.2
                @Override // org.xml.sax.EntityResolver
                public InputSource resolveEntity(String str, String str2) {
                    return new InputSource(new ByteArrayInputStream(new byte[0]));
                }
            });
            Element documentElement = newDocumentBuilder.parse(inputStream).getDocumentElement();
            String attribute = documentElement.getAttribute("orientation");
            if (!attribute.equals("orthogonal")) {
                throw new C0173f("Only orthogonal maps are supported, found: " + attribute);
            }
            int parseInt = Integer.parseInt(documentElement.getAttribute("width"));
            int parseInt2 = Integer.parseInt(documentElement.getAttribute("height"));
            this.mapWidth = parseInt;
            this.mapHeight = parseInt2;
            StringBuilder map_info = new StringBuilder().append("Map size: ").append(this.mapWidth).append(", ").append(this.mapHeight);
            GameEngine.PrintLOG(map_info.toString());
            this.f789am = 150.0f;
            if (this.f818D) {
                GameEngine.PrintLOG("Setting up team fog..");
                for (int i = 0; i < Team.playerNumMax; i++) {
                    Team team = Team.getTeam(i);
                    if (team != null) {
                        team.fogWidth = this.mapWidth;
                        team.fogHeight = this.mapHeight;
                        team.fogOfWar_map = new byte[this.mapWidth][this.mapHeight];
                        for (int i2 = 0; i2 < this.mapWidth; i2++) {
                            for (int i3 = 0; i3 < this.mapHeight; i3++) {
                                team.fogOfWar_map[i2][i3] = 10;
                            }
                        }
                    }
                }
            } else {
                GameEngine.PrintLOG("No team fog on this map..");
                for (int i4 = 0; i4 < Team.playerNumMax; i4++) {
                    Team team2 = Team.getTeam(i4);
                    if (team2 != null) {
                        team2.fogOfWar_map = null;
                    }
                }
            }
            Element element = (Element) documentElement.getElementsByTagName("properties").item(0);
            if (element != null && (elementsByTagName = element.getElementsByTagName("property")) != null) {
                Properties properties = new Properties();
                for (int i5 = 0; i5 < elementsByTagName.getLength(); i5++) {
                    Element element2 = (Element) elementsByTagName.item(i5);
                    properties.setProperty(element2.getAttribute("name"), element2.getAttribute("value"));
                }
            }
            TileSet tileSet = null;
            NodeList elementsByTagName2 = documentElement.getElementsByTagName("tileset");
            for (short s = 0; s < elementsByTagName2.getLength(); s = (short) (s + 1)) {
                TileSet tileSet2 = new TileSet(this, (Element) elementsByTagName2.item(s));
                tileSet2.f938m = s;
                if (tileSet != null) {
                    tileSet.m4045c(tileSet2.firstGID - 1);
                }
                tileSet = tileSet2;
                this.f810t.add(tileSet2);
            }
            NodeList elementsByTagName3 = documentElement.getElementsByTagName("layer");
            for (int i6 = 0; i6 < elementsByTagName3.getLength(); i6++) {
                Element element3 = (Element) elementsByTagName3.item(i6);
                String attribute2 = element3.getAttribute("name");
                if (!"set".equalsIgnoreCase(attribute2) && !"set-disabled".equalsIgnoreCase(attribute2)) {
                    MapLayer mapLayer = new MapLayer(this, element3);
                    mapLayer.f877j = i6;
                    this.f814y.add(mapLayer);
                }
            }
            Iterator it = this.f814y.iterator();
            while (it.hasNext()) {
                MapLayer mapLayer2 = (MapLayer) it.next();
                if (mapLayer2.f885r) {
                    this.mainLayer = mapLayer2;
                }
                if (mapLayer2.name.equalsIgnoreCase("grounddetails")) {
                    this.mainLayer2 = mapLayer2;
                }
                if (mapLayer2.name.equalsIgnoreCase("Items") || mapLayer2.name.equalsIgnoreCase("Objects")) {
                    this.objectLayer = mapLayer2;
                }
                if (mapLayer2.name.equalsIgnoreCase("PathingOverride")) {
                    this.f796w = mapLayer2;
                }
            }
            if (this.mainLayer == null) {
                throw new C0173f("'Ground' layer was not found in map, this layer is required");
            }
            if (this.f817A == null || this.f817A.length == 0) {
                throw new C0173f("Invalid map, no tiles have been set");
            }
            if (!GameEngine.m795y() && !GameEngine.m794z()) {
                for (int i7 = 0; i7 < this.mapWidth; i7++) {
                    for (int i8 = 0; i8 < this.mapHeight; i8++) {
                        if (this.mainLayer.tiles(i7, i8) == null) {
                            throw new C0173f("An empty tile on the Ground layer at " + i7 + "," + i8 + " all tiles must be filled");
                        }
                    }
                }
            }
            if (this.objectLayer == null) {
                throw new C0173f("'Items' layer was not found in map, this layer is required");
            }
            NodeList elementsByTagName4 = documentElement.getElementsByTagName("objectgroup");
            for (int i9 = 0; i9 < elementsByTagName4.getLength(); i9++) {
                ObjectGroup objectGroup = new ObjectGroup((Element) elementsByTagName4.item(i9), this);
                objectGroup.a = i9;
                this.objectGroups.add(objectGroup);
            }
            TileSet.m4055a();
            Iterator it2 = this.f810t.iterator();
            while (it2.hasNext()) {
                TileSet tileSet3 = (TileSet) it2.next();
                if (tileSet3.f945p) {
                    tileSet3.m4046c();
                }
            }
            TileSet.m4049b();
            int i10 = 0;
            while (i10 <= 1) {
                Iterator it3 = this.f814y.iterator();
                while (it3.hasNext()) {
                    MapLayer mapLayer3 = (MapLayer) it3.next();
                    if ((mapLayer3 == this.mainLayer) == (i10 == 0)) {
                        mapLayer3.f890w = false;
                        if (mapLayer3.f886s) {
                            for (int i11 = 0; i11 < this.mapWidth; i11++) {
                                for (int i12 = 0; i12 < this.mapHeight; i12++) {
                                    MapTile tiles = mapLayer3.tiles(i11, i12);
                                    if (tiles != null && tiles.f894c == -2) {
                                        tiles.f894c = f767l.m4062a(tiles.f892a, tiles.f893b);
                                        if (tiles.f894c >= 0 && (m4062a = f768m.m4062a(tiles.f892a, tiles.f893b)) != tiles.f894c) {
                                            throw new RuntimeException("Meta index mismatch: " + m4062a + " vs " + tiles.f894c);
                                        }
                                        if (tiles.f894c < 0) {
                                            mapLayer3.f890w = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i10++;
            }
            f767l.m4057c();
            f768m.m4057c();
            this.objectGroup_triggers = getObjectGroupByName("triggers");
            GroupObject groupObject = null;
            if (this.objectGroup_triggers != null) {
                groupObject = this.objectGroup_triggers.getGroupObjectByName("map_info");
            }
            boolean z2 = false;
            boolean z3 = false;
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.f5866ce = null;
            String str = null;
            String str2 = null;
            if (groupObject != null) {
                String property = groupObject.getProperty("type");
                str2 = groupObject.getProperty("fog");
                if ("mission".equalsIgnoreCase(property) || "survival".equalsIgnoreCase(property) || "challenge".equalsIgnoreCase(property) || "skirmish".equalsIgnoreCase(property)) {
                    str = property;
                } else {
                    GameEngine.log("Unknown map type:" + property);
                }
            } else {
                GameEngine.log("Map type not found on mapInfo");
            }
            if (str == null) {
                GameEngine.log("Defaulting to skirmish map type");
                str = "skirmish";
            } else {
                GameEngine.log("Map type: " + str);
            }
            gameEngine.f5866ce = new MissionEngine();
            gameEngine.f5866ce.m746a(z);
            if (str2 != null && !VariableScope.nullOrMissingString.equals(str2)) {
                if (!str2.equalsIgnoreCase("none")) {
                    z2 = true;
                    if (str2.equalsIgnoreCase("los")) {
                        z3 = true;
                    } else if (!str2.equalsIgnoreCase("map")) {
                        GameEngine.PrintLOG("Unknown map fog type: " + str2);
                    }
                }
            } else if (GameEngine.isPC() && !gameEngine.isNetworked()) {
                z2 = true;
                if (str != null && str.equalsIgnoreCase("skirmish")) {
                    z3 = true;
                }
            }
            if (!z2) {
                this.f818D = false;
            }
            if (z2 && z3) {
                this.f819E = true;
            }
            this.f776S = true;
        } catch (IOException e) {
            throw new C0173f("Failed to parse map", e);
        } catch (ParserConfigurationException e2) {
            throw new RuntimeException("Failed to parse map", e2);
        } catch (SAXException e3) {
            GameEngine.PrintLOG(" --- SAXException: Failed to parse map - " + e3.getMessage() + " ---");
            try {
                GameEngine.PrintLOG("available:" + inputStream.available());
                inputStream.reset();
                GameEngine.PrintLOG("after reset:" + inputStream.available());
            } catch (IOException e4) {
                GameEngine.PrintLOG("-- error writing debug info --");
                e4.printStackTrace();
            }
            throw new C0173f("Failed to parse map - " + e3.getMessage(), e3);
        }
    }

    /* renamed from: d */
    public void m4122d() {
    }

    /* renamed from: a */
    public void m4154a(ScorchMark scorchMark) {
        if (GameEngine.isDedicatedServer && !GameEngine.isPC_Device) {
            return;
        }
        f808ag.m4097a(scorchMark);
    }

    /* renamed from: a */
    public void m4151a(OrderableUnit orderableUnit, int i, int i2, int i3, int i4, int i5, int i6, Graphics graphics, boolean z, int i7) {
        GameEngine gameEngine = GameEngine.getInstance();
        Map map = gameEngine.map;
        UnitType mo2734i = gameEngine.interfaceEngine.f4672W.mo2734i();
        MovementType mo3075o = mo2734i.mo3075o();
        for (int i8 = i; i8 <= i3; i8++) {
            for (int i9 = i2; i9 <= i4; i9++) {
                boolean m2979a = Building.m2979a(orderableUnit, mo2734i, mo3075o, i8, i9, i7);
                int i10 = (i8 * map.pixel_Width) - i5;
                int i11 = (i9 * map.pixel_Height) - i6;
                this.f828ai.set(i10, i11, (i10 + map.pixel_Width) - 1, (i11 + map.pixel_Height) - 1);
                if (z) {
                    if (m2979a) {
                        graphics.drawRect(this.f828ai, map.f782Z);
                    } else {
                        graphics.drawRect(this.f828ai, map.f784ab);
                        graphics.drawRect(this.f828ai, map.f783aa);
                    }
                } else if (m2979a) {
                    graphics.drawRect(this.f828ai, map.f781Y);
                } else {
                    graphics.drawRect(this.f828ai, map.f783aa);
                }
            }
        }
    }

    /* renamed from: e */
    public static void m4117e() {
        f808ag.m4088d();
    }

    /* renamed from: c */
    public void m4127c(float f) {
        f808ag.m4103a(f);
    }

    /* renamed from: f */
    public void m4113f() {
        f808ag.m4092c();
    }

    /* renamed from: d */
    public void m4121d(float f) {
        GameEngine game = GameEngine.getInstance();
        boolean isNonDedicatedServer = GameEngine.isNonDedicatedServer();
        if (isNonDedicatedServer) {
            game.graphics.mo174a(f801e);
        }
        m4127c(f);
        if (isNonDedicatedServer) {
            game.graphics.mo152b(f801e);
        }
        if (this.f777T) {
            new Rect();
            Rect rect = new Rect();
            int i = this.f778U * this.pixel_Width;
            int i2 = this.f779V * this.pixel_Height;
            rect.set(i, i2, i + this.pixel_Width, i2 + this.pixel_Height);
            rect.m4666a(-GameEngine.getInstance().f5878ct, -GameEngine.getInstance().f5879cu);
        }
    }

    /* renamed from: e */
    public void m4116e(float f) {
        GameEngine.getInstance();
        m4112f(f);
    }

    /* renamed from: g */
    public void m4110g() {
        Iterator it = this.f810t.iterator();
        while (it.hasNext()) {
            ((TileSet) it.next()).m4044d();
        }
        this.f810t.clear();
        Iterator it2 = this.f814y.iterator();
        while (it2.hasNext()) {
            ((MapLayer) it2.next()).m4073b();
        }
        this.f814y.clear();
        this.objectGroups.clear();
        this.objectGroup_triggers = null;
        f808ag.m4092c();
    }

    /* renamed from: a */
    public TileSet m4165a(int i) {
        for (int i2 = 0; i2 < this.f810t.size(); i2++) {
            TileSet tileSet = (TileSet) this.f810t.get(i2);
            if (tileSet.m4043d(i)) {
                return tileSet;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Integer m4152a(UnitType unitType) {
        String mo3087i = unitType.mo3087i();
        Integer m4123c = m4123c("unit", mo3087i);
        if (m4123c == null) {
            m4123c = m4123c("customUnit", mo3087i);
        }
        return m4123c;
    }

    /* renamed from: c */
    public Integer m4123c(String str, String str2) {
        for (int i = 0; i < this.f810t.size(); i++) {
            Integer m4047b = ((TileSet) this.f810t.get(i)).m4047b(str, str2);
            if (m4047b != null) {
                return m4047b;
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000e */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.corrodinggames.rts.game.map.ObjectGroup getObjectGroupByName(java.lang.String r4) {
        /*
            r3 = this;
            r0 = r3
            java.util.ArrayList r0 = r0.objectGroups
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L8:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2b
            r0 = r5
            java.lang.Object r0 = r0.next()
            com.corrodinggames.rts.game.b.i r0 = (com.corrodinggames.rts.game.map.ObjectGroup) r0
            r6 = r0
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.name
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L28
            r0 = r6
            return r0
        L28:
            goto L8
        L2b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.map.Map.getObjectGroupByName(java.lang.String):com.corrodinggames.rts.game.b.i");
    }

    /* renamed from: h */
    public float getWidthInPixels() {
        return this.mapWidth * this.pixel_Width;
    }

    /* renamed from: i */
    public float getHeightInPixels() {
        return this.mapHeight * this.pixel_Height;
    }

    /* renamed from: a */
    public void m4167a(float f, float f2, int i, Team team, boolean z) {
        MissionEngine missionEngine;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f818D) {
            long j = 0;
            if (f797a) {
                j = C0651bl.getTookTime();
            }
            boolean z2 = true;
            boolean z3 = team.f1284B;
            if (!gameEngine.m857au() && (missionEngine = gameEngine.f5866ce) != null && !missionEngine.m756a() && !missionEngine.m745b()) {
                z2 = false;
            }
            if (!z2) {
                m4133b(f, f2, i, team, z);
            } else {
                for (int i2 = 0; i2 < Team.playerNumMax; i2++) {
                    Team team2 = Team.getTeam(i2);
                    if (team2 != null && (team2 == team || (!team2.f1333t && (team2.m3913d(team) || z3)))) {
                        m4133b(f, f2, i, team2, z);
                    }
                }
            }
            if (f797a) {
                long game = j;
                this.f787ak += C0651bl.getTookTime() - game;
            }
        }
    }

    /* renamed from: a */
    public byte m4162a(int i, int i2, byte[][] bArr, byte b) {
        byte b2 = 0;
        int i3 = this.mapWidth;
        int i4 = this.mapHeight;
        if (i >= 1) {
            if (bArr[i - 1][i2] >= b) {
                b2 = (byte) (0 - 128);
            }
            if (i2 >= 1 && bArr[i - 1][i2 - 1] >= b) {
                b2 = (byte) (b2 + 1);
            }
            if (i2 < i4 - 1 && bArr[i - 1][i2 + 1] >= b) {
                b2 = (byte) (b2 + 8);
            }
        }
        if (i2 >= 1) {
            if (bArr[i][i2 - 1] >= b) {
                b2 = (byte) (b2 + 16);
            }
            if (i < i3 - 1 && bArr[i + 1][i2 - 1] >= b) {
                b2 = (byte) (b2 + 2);
            }
        }
        if (i < i3 - 1 && bArr[i + 1][i2] >= b) {
            b2 = (byte) (b2 + 32);
        }
        if (i2 < i4 - 1) {
            if (bArr[i][i2 + 1] >= b) {
                b2 = (byte) (b2 + 64);
            }
            if (i < i3 - 1 && bArr[i + 1][i2 + 1] >= b) {
                b2 = (byte) (b2 + 4);
            }
        }
        if (b2 == Byte.MAX_VALUE) {
            b2 = -1;
        }
        return b2;
    }

    /* renamed from: j */
    public void m4106j() {
        m4105k();
        for (int i = 0; i < this.mapWidth; i++) {
            for (int i2 = 0; i2 < this.mapHeight; i2++) {
                this.f771K[i][i2] = 0;
                this.f772L[i][i2] = 0;
            }
        }
    }

    /* renamed from: f */
    public void m4111f(int i, int i2) {
        this.f771K[i][i2] = 0;
        this.f772L[i][i2] = 0;
    }

    /* renamed from: g */
    public void m4109g(int i, int i2) {
        int i3 = i - 1;
        int i4 = i2 - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i + 1;
        int i6 = i2 + 1;
        if (i5 > this.mapWidth - 1) {
            i5 = this.mapWidth - 1;
        }
        if (i6 > this.mapHeight - 1) {
            i6 = this.mapHeight - 1;
        }
        for (int i7 = i3; i7 <= i5; i7++) {
            for (int i8 = i4; i8 <= i6; i8++) {
                if (this.f771K[i7][i8] != 0) {
                    this.f771K[i7][i8] = Byte.MAX_VALUE;
                }
                if (this.f772L[i7][i8] != 0) {
                    this.f772L[i7][i8] = Byte.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: k */
    public void m4105k() {
        boolean z = false;
        if (this.f771K == null) {
            z = true;
        } else if (this.f771K.length != this.mapWidth || this.f771K[0].length != this.mapHeight) {
            GameEngine.PrintLOG("smoothFog_cache: Size mismatch");
            z = true;
        }
        if (z) {
            GameEngine.PrintLOG("Building smoothFog_cache");
            this.f771K = new byte[this.mapWidth][this.mapHeight];
            this.f772L = new byte[this.mapWidth][this.mapHeight];
            for (int i = 0; i < this.mapWidth; i++) {
                for (int i2 = 0; i2 < this.mapHeight; i2++) {
                    this.f771K[i][i2] = Byte.MAX_VALUE;
                    this.f772L[i][i2] = Byte.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: b */
    public void m4133b(float f, float f2, int i, Team team, boolean z) {
        byte b;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f818D && team.fogOfWar_map != null) {
            m4105k();
            float f3 = (i - 5) * (i - 5);
            float f4 = (i - 3) * (i - 3);
            float f5 = i * i;
            float f6 = (1.0f / (f5 - f4)) * 10.0f;
            m4168a(f, f2);
            int i2 = this.returnX;
            int i3 = this.returnY;
            float f7 = f * this.f794r;
            float f8 = f2 * this.f795s;
            byte[][] bArr = team.fogOfWar_map;
            int i4 = i - 1;
            int i5 = i2 - i4;
            int i6 = i3 - i4;
            if (i5 < 0) {
                i5 = 0;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            int i7 = i2 + i4;
            int i8 = i3 + i4;
            if (i7 > this.mapWidth - 1) {
                i7 = this.mapWidth - 1;
            }
            if (i8 > this.mapHeight - 1) {
                i8 = this.mapHeight - 1;
            }
            C0170c c0170c = f808ag;
            boolean z2 = false;
            boolean m3885n = team.m3885n();
            for (int i9 = i5; i9 <= i7; i9++) {
                for (int i10 = i6; i10 <= i8; i10++) {
                    byte b2 = bArr[i9][i10];
                    if (b2 != 0) {
                        float distanceSq = CommonUtils.distanceSq(f7, f8, i9, i10);
                        if (distanceSq <= f4) {
                            if (b2 > 0) {
                                bArr[i9][i10] = 0;
                                if (m3885n) {
                                    c0170c.m4098a(i9, i10, true);
                                    z2 = true;
                                    if (distanceSq <= f3 && z) {
                                        m4111f(i9, i10);
                                    } else {
                                        m4109g(i9, i10);
                                    }
                                }
                            }
                        } else if (distanceSq <= f5 && b2 > (b = (byte) ((distanceSq - f4) * f6))) {
                            bArr[i9][i10] = b;
                            if (m3885n) {
                                c0170c.m4098a(i9, i10, true);
                                z2 = true;
                                m4109g(i9, i10);
                            }
                        }
                    }
                }
            }
            if (z2) {
                gameEngine.f5836bW.f4874O = true;
            }
        }
    }

    /* renamed from: f */
    public void m4112f(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (f797a) {
            this.f788al += f;
            if (this.f788al > 60.0f) {
                this.f788al = 0.0f;
                if (this.f787ak > 0) {
                    GameEngine.PrintLOG("seeThoughFogOfWarTimes: " + C0651bl.m2271b(this.f787ak));
                    this.f787ak = 0L;
                }
                if (this.f787ak < 0) {
                    GameEngine.PrintLOG("seeThoughFogOfWarTimes negative: " + C0651bl.m2271b(this.f787ak));
                    this.f787ak = 0L;
                }
            }
        }
        if (this.f818D && this.f819E) {
            m4105k();
            this.f789am += f;
            if (this.f789am > 260.0f) {
                this.f789am = 0.0f;
                GameObject[] m501a = Unit.fastGameObjectList.m501a();
                int size = GameObject.fastGameObjectList.size();
                boolean z = false;
                for (int i = 0; i < Team.playerNumMax; i++) {
                    Team team = Team.getTeam(i);
                    if (team != null && !team.f1286D) {
                        z = true;
                        for (int i2 = 0; i2 < size; i2++) {
                            GameObject gameObject = m501a[i2];
                            if (gameObject instanceof OrderableUnit) {
                                OrderableUnit orderableUnit = (OrderableUnit) gameObject;
                                if (orderableUnit.mo2975bH()) {
                                    orderableUnit.m3731g(team);
                                }
                            }
                        }
                        if (team.fogOfWar_map == null) {
                            GameEngine.log("fogOfWar_map==null for:" + i);
                        }
                        boolean z2 = false;
                        boolean m3885n = team.m3885n();
                        byte[][] bArr = team.fogOfWar_map;
                        byte[][] bArr2 = this.f772L;
                        for (int i3 = 0; i3 < this.mapWidth; i3++) {
                            for (int i4 = 0; i4 < this.mapHeight; i4++) {
                                if (bArr[i3][i4] < 5) {
                                    bArr[i3][i4] = 5;
                                    if (m3885n) {
                                        f808ag.m4098a(i3, i4, true);
                                        z2 = true;
                                        bArr2[i3][i4] = Byte.MAX_VALUE;
                                    }
                                }
                            }
                        }
                        if (z2) {
                            gameEngine.f5836bW.f4874O = true;
                        }
                    }
                }
                for (int i5 = 0; i5 < size; i5++) {
                    GameObject gameObject2 = m501a[i5];
                    if (gameObject2 instanceof OrderableUnit) {
                        OrderableUnit orderableUnit2 = (OrderableUnit) gameObject2;
                        if (!orderableUnit2.dead) {
                            orderableUnit2.mo2491c(false);
                        }
                    }
                }
                if (z) {
                    for (int i6 = 0; i6 < size; i6++) {
                        GameObject gameObject3 = m501a[i6];
                        if (gameObject3 instanceof OrderableUnit) {
                            OrderableUnit orderableUnit3 = (OrderableUnit) gameObject3;
                            if (orderableUnit3.mo2975bH()) {
                                orderableUnit3.m3747cT();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m4150a(OutputNetStream outputNetStream) {
        outputNetStream.writeBoolean(false);
    }

    /* renamed from: a */
    public void m4149a(InputNetStream inputNetStream) {
        if (inputNetStream.readBoolean()) {
            int readInt = inputNetStream.readInt();
            int readInt2 = inputNetStream.readInt();
            for (int i = 0; i < readInt; i++) {
                for (int i2 = 0; i2 < readInt2; i2++) {
                    inputNetStream.readByte();
                }
            }
        }
    }

    /* renamed from: a */
    private InputStream m4143a(String str, String str2, int i) {
        String[] split = str2.split("/");
        if (split.length >= i) {
            String str3 = VariableScope.nullOrMissingString;
            boolean z = true;
            for (int length = split.length - i; length < split.length; length++) {
                if (!z) {
                    str3 = str3 + "/";
                }
                z = false;
                str3 = str3 + split[length];
            }
            return C0670a.m2157i(str + str3);
        }
        return null;
    }

    /* renamed from: d */
    public InputStream m4118d(String str, String str2) {
        C0936j m2157i = C0670a.m2157i(str + str2);
        if (m2157i == null) {
            m2157i = m4143a(str, str2, 3);
        }
        if (m2157i == null) {
            m2157i = m4143a(str, str2, 2);
        }
        if (m2157i == null) {
            m2157i = m4143a(str, str2, 1);
        }
        if (m2157i == null) {
            throw new IOException("File could not be found:" + str + str2);
        }
        return m2157i;
    }

    /* renamed from: a */
    public boolean m4153a(Team team, int i, int i2) {
        if (!this.f820F && this.f818D && team.fogOfWar_map != null && isInMap(i, i2) && team.fogOfWar_map[i][i2] == 10) {
            return false;
        }
        return true;
    }
}