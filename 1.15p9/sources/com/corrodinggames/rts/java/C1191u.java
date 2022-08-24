package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.appFramework.C0121m;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.C0193j;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0943n;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.RunnableC0069a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.imageout.ImageOut;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

/* renamed from: com.corrodinggames.rts.java.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/u.class */
public class C1191u extends BasicGame {

    /* renamed from: a */
    GameContainer f7271a;

    /* renamed from: b */
    Main f7272b;

    /* renamed from: c */
    C1152b f7273c;

    /* renamed from: d */
    C0943n f7274d;

    /* renamed from: e */
    GameEngine f7275e;

    /* renamed from: f */
    C1170d f7276f;

    /* renamed from: g */
    boolean f7277g;

    /* renamed from: h */
    Object f7278h;

    /* renamed from: i */
    boolean f7279i;

    /* renamed from: j */
    boolean f7280j;

    /* renamed from: k */
    boolean f7281k;

    /* renamed from: l */
    boolean f7282l;

    /* renamed from: m */
    C1189s f7283m;

    /* renamed from: n */
    C1189s f7284n;

    /* renamed from: o */
    boolean f7285o;

    /* renamed from: p */
    boolean f7286p;

    /* renamed from: q */
    boolean f7287q;

    /* renamed from: r */
    boolean f7288r;

    /* renamed from: s */
    boolean f7289s;

    /* renamed from: t */
    int f7290t;

    /* renamed from: u */
    boolean f7291u;

    /* renamed from: v */
    boolean f7292v;

    /* renamed from: w */
    float f7293w;

    /* renamed from: x */
    float f7294x;

    /* renamed from: y */
    boolean f7295y;

    /* renamed from: X */
    private boolean[] f7296X;

    /* renamed from: z */
    int f7297z;

    /* renamed from: A */
    float f7298A;

    /* renamed from: B */
    float f7299B;

    /* renamed from: C */
    int f7300C;

    /* renamed from: D */
    int f7301D;

    /* renamed from: E */
    int f7302E;

    /* renamed from: F */
    int f7303F;

    /* renamed from: G */
    int f7304G;

    /* renamed from: H */
    int f7305H;

    /* renamed from: I */
    boolean f7306I;

    /* renamed from: J */
    boolean f7307J;

    /* renamed from: K */
    float f7308K;

    /* renamed from: L */
    int f7309L;

    /* renamed from: M */
    String f7310M;

    /* renamed from: N */
    String f7311N;

    /* renamed from: O */
    long f7312O;

    /* renamed from: P */
    float f7313P;

    /* renamed from: Q */
    int f7314Q;

    /* renamed from: R */
    int f7315R;

    /* renamed from: S */
    long f7316S;

    /* renamed from: T */
    float f7317T;

    /* renamed from: U */
    float f7318U;

    /* renamed from: V */
    int f7319V;

    /* renamed from: W */
    C0193j f7320W;

    public C1191u(String str) {
        super(str);
        this.f7277g = false;
        this.f7278h = new Object();
        this.f7279i = false;
        this.f7280j = false;
        this.f7281k = false;
        this.f7282l = false;
        this.f7286p = false;
        this.f7287q = false;
        this.f7288r = false;
        this.f7289s = false;
        this.f7291u = false;
        this.f7295y = false;
        this.f7296X = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP];
        this.f7297z = 0;
        this.f7298A = 0.0f;
        this.f7299B = 0.0f;
        this.f7300C = 0;
        this.f7301D = 0;
        this.f7308K = 0.0f;
        this.f7309L = 0;
        this.f7310M = VariableScope.nullOrMissingString;
        this.f7311N = VariableScope.nullOrMissingString;
        this.f7312O = -9999L;
        this.f7313P = 1.0f;
        this.f7314Q = 100;
        this.f7315R = 100;
        this.f7317T = 0.0f;
        this.f7318U = 0.0f;
    }

    public boolean closeRequested() {
        if (!this.f7279i && !RunnableC0069a.m7033a() && this.f7273c != null && !this.f7273c.isFullscreen()) {
            ScriptEngine.getInstance().addScriptToQueue("askQuitGame();");
            return false;
        }
        return true;
    }

    public void init(GameContainer gameContainer) {
        this.f7271a = gameContainer;
        gameContainer.setAlwaysRender(true);
        gameContainer.setForceExit(true);
        gameContainer.setShowFPS(false);
        gameContainer.setTargetFrameRate(300);
        if (GameEngine.noBackground) {
            gameContainer.setShowFPS(true);
            gameContainer.setTargetFrameRate(30);
        }
        gameContainer.setIcons(new String[]{"res/drawable/icon_window.png", "res/drawable/icon_window128.png", "res/drawable/icon_window24.png", "res/drawable/icon_window16.png"});
        gameContainer.setUpdateOnlyWhenVisible(false);
        gameContainer.getInput().enableKeyRepeat();
        this.f7283m = C1173e.m170b(R.drawable.logo, true);
        this.f7284n = C1173e.m170b(R.drawable.pointer, true);
        gameContainer.setMouseCursor(this.f7284n.mo418C(), 0, 0);
        this.f7316S = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m46a() {
        this.f7275e = GameEngine.getInstance();
        if (this.f7271a.isVSyncRequested() != this.f7275e.f6109bQ.renderVsync) {
            this.f7271a.setVSync(this.f7275e.f6109bQ.renderVsync);
        }
        if (this.f7275e.f6109bQ.highRefreshRate) {
            this.f7271a.setTargetFrameRate(300);
        } else {
            this.f7271a.setTargetFrameRate(120);
        }
        boolean z = false;
        if (this.f7275e.f6109bQ.enableMouseCapture && ((!this.f7275e.f6109bQ.slick2dFullScreen || this.f7275e.f6155cT) && !this.f7275e.f6075aq && !this.f7275e.m1185a(false) && this.f7275e.f6229bq)) {
            z = true;
        }
        if (z != this.f7292v) {
            GameEngine.PrintLog("Grabbing mouse:" + z);
            this.f7292v = z;
            if (!this.f7291u) {
                this.f7271a.setMouseGrabbed(this.f7292v);
            }
            if (this.f7292v) {
            }
            if (!this.f7292v) {
                Mouse.setCursorPosition((int) (this.f7293w * this.f7313P), (int) (Display.getHeight() - (this.f7294x * this.f7313P)));
            }
            GameEngine.f6087aR = this.f7292v;
        }
        this.f7271a.setSmoothDeltas(this.f7275e.f6109bQ.renderSmoothDelta);
        if (this.f7285o != Display.isActive()) {
            this.f7285o = Display.isActive();
            if (this.f7285o) {
                m27f();
            }
        }
    }

    /* renamed from: b */
    public void m34b() {
        if (this.f7286p) {
            GameEngine.m1120g("loadingStartedThreaded");
            return;
        }
        this.f7286p = true;
        m31c();
    }

    /* renamed from: c */
    public void m31c() {
        if (this.f7287q) {
            GameEngine.m1120g("loadingStartedNonThreaded");
            return;
        }
        this.f7287q = true;
        if (this.f7272b == null) {
            this.f7272b = new Main();
        }
        this.f7272b.m421h();
        if (GameEngine.f6190aI) {
            GameEngine.PrintLog("switching to sandbox");
            ScriptEngine.getInstance().addScriptToQueue("open('sandboxOptions.rml', 'maps/skirmish/[z;p10]Crossing Large (10p).tmx'); loadConfigAndStartNewSandbox('maps/skirmish/[z;p10]Crossing Large (10p).tmx');");
        }
        this.f7288r = true;
    }

    /* renamed from: a */
    public void m41a(C1170d c1170d) {
        GameEngine.m1145b("SlickContainer:setup");
        this.f7275e = GameEngine.getInstance();
        this.f7276f = c1170d;
        this.f7276f.f7141d = new C0121m();
        this.f7276f.f7139a = this.f7271a.getWidth();
        this.f7276f.f7140b = this.f7271a.getHeight();
        this.f7275e.m1148b(this.f7276f.f7139a, this.f7276f.f7140b);
        this.f7274d = new C0943n();
    }

    public void update(GameContainer gameContainer, int i) {
        this.f7290t = i;
    }

    /* renamed from: a */
    public int m45a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        GameEngine.PrintLog("Unknown mouse button:" + i);
        return 0;
    }

    /* renamed from: a */
    public void m43a(int i, int i2, boolean z) {
        int i3;
        int i4;
        if (this.f7295y) {
            GameEngine.PrintLog("mouseGrab:m:" + z + ",newX:" + i + ",newY:" + i2);
        }
        if (!this.f7292v) {
            this.f7293w = (int) (i / this.f7313P);
            this.f7294x = (int) (i2 / this.f7313P);
            return;
        }
        if (z) {
            if (this.f7291u) {
                i3 = i - this.f7314Q;
                i4 = i2 - this.f7315R;
            } else {
                i3 = i;
                i4 = i2;
            }
            this.f7293w += i3 / this.f7313P;
            this.f7294x += i4 / this.f7313P;
        } else {
            this.f7293w = (int) (i / this.f7313P);
            this.f7294x = (int) (i2 / this.f7313P);
        }
        if (this.f7293w < 0.0f) {
            this.f7293w = 0.0f;
        }
        if (this.f7294x < 0.0f) {
            this.f7294x = 0.0f;
        }
        if (this.f7276f != null) {
            if (this.f7293w > this.f7276f.m241o() - 1) {
                this.f7293w = this.f7276f.m241o() - 1;
            }
            if (this.f7294x > this.f7276f.m240p() - 1) {
                this.f7294x = this.f7276f.m240p() - 1;
                return;
            }
            return;
        }
        GameEngine.PrintLog("processMouseGrab gameView==null");
    }

    public void mousePressed(int i, int i2, int i3) {
        int m45a;
        m43a(i2, i3, false);
        if (m29d()) {
            this.f7272b.f6975p.mouseMove((int) this.f7293w, (int) this.f7294x, 0);
            this.f7272b.f6975p.processMouseButtonDown(0, 0);
        } else if (this.f7276f != null && (m45a = m45a(i)) != 0) {
            this.f7276f.f7141d.m6922a(this.f7293w, this.f7294x, true, m45a);
        }
    }

    public void mouseDragged(int i, int i2, int i3, int i4) {
        m43a(i3, i4, true);
        if (m29d()) {
            this.f7272b.f6975p.mouseMove((int) this.f7293w, (int) this.f7294x, 0);
        } else if (this.f7276f != null) {
            this.f7276f.f7141d.m6923a(this.f7293w, this.f7294x);
        }
    }

    public void mouseMoved(int i, int i2, int i3, int i4) {
        m43a(i3, i4, true);
        if (m29d()) {
            this.f7272b.f6975p.mouseMove((int) this.f7293w, (int) this.f7294x, 0);
        } else if (this.f7276f != null) {
            this.f7276f.f7141d.m6923a(this.f7293w, this.f7294x);
        }
    }

    public void mouseReleased(int i, int i2, int i3) {
        int m45a;
        m43a(i2, i3, false);
        if (m29d()) {
            this.f7272b.f6975p.processMouseButtonUp(0, 0);
        } else if (this.f7276f != null && (m45a = m45a(i)) != 0) {
            this.f7276f.f7141d.m6922a(this.f7293w, this.f7294x, false, m45a);
        }
    }

    public void mouseWheelMoved(int i) {
        if (m29d()) {
            this.f7272b.f6975p.processMouseWheel((-(i / 120)) * 2, 0);
        } else if (this.f7275e != null) {
            this.f7275e.m1112k(i);
        }
    }

    /* renamed from: d */
    boolean m29d() {
        if (this.f7272b != null && this.f7272b.f6975p != null && !this.f7272b.f6975p.m7053b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m33b(int i) {
        if (i >= this.f7296X.length || i < 0) {
            return false;
        }
        return this.f7296X[i];
    }

    /* renamed from: e */
    public int m28e() {
        int i = 0;
        if (m33b(42) || m33b(54)) {
            i = 0 + 2;
        }
        if (m33b(29) || m33b(157)) {
            i++;
        }
        if (m33b(56) || m33b(184)) {
            i += 4;
        }
        return i;
    }

    /* renamed from: a */
    public void m42a(int i, boolean z) {
        if (i >= this.f7296X.length || i < 0) {
            return;
        }
        this.f7296X[i] = z;
    }

    /* renamed from: f */
    public void m27f() {
        for (int i = 0; i < this.f7296X.length; i++) {
            if (this.f7296X[i]) {
                m30c(i);
            }
        }
    }

    public void keyPressed(int i, char c) {
        m42a(i, true);
        if (this.f7272b.f6969i == null) {
            GameEngine.PrintLog("keyPressed: guiEngine==null");
        } else {
            this.f7272b.f6969i.m7082a(i, c);
        }
    }

    /* renamed from: c */
    public void m30c(int i) {
        keyReleased(i, (char) 0);
    }

    public void keyReleased(int i, char c) {
        m42a(i, false);
        if (m29d()) {
            Integer m757c = SlickToAndroidKeycodes.m757c(i);
            if (m757c != null) {
                this.f7272b.f6975p.processKeyUp(m757c.intValue(), m28e());
            } else if (!Character.isISOControl(c)) {
            }
        }
        if (this.f7275e != null) {
            this.f7275e.m1147b(SlickToAndroidKeycodes.m759b(i), false);
        }
    }

    /* renamed from: a */
    public void m44a(int i, int i2) {
        this.f7302E = i;
        this.f7303F = i2;
        m26g();
    }

    /* renamed from: g */
    public void m26g() {
        if (this.f7282l || this.f7279i) {
            return;
        }
        try {
            boolean z = this.f7275e.f6109bQ.slick2dFullScreen;
            boolean z2 = this.f7275e.f6109bQ.slick2dBorderless;
            if (z2) {
                z = true;
            }
            int i = this.f7302E;
            int i2 = this.f7303F;
            if (z) {
                i = this.f7273c.getScreenWidth();
                i2 = this.f7273c.getScreenHeight();
                String str = this.f7275e.f6109bQ.slick2dFullScreenResolution;
                if (str == null) {
                    GameEngine.PrintLog("fullScreenResolutionString is null");
                    str = "native";
                }
                if (!str.equals("native")) {
                    String[] split = str.split("x");
                    if (split.length != 2) {
                        GameEngine.m1145b("Unknown resolution format:" + str);
                    } else {
                        Integer m2243l = CommonUtils.m2243l(split[0]);
                        Integer m2243l2 = CommonUtils.m2243l(split[1]);
                        if (m2243l == null || m2243l2 == null) {
                            GameEngine.m1145b("Bad resolution int:" + str);
                        } else {
                            i = m2243l.intValue();
                            i2 = m2243l2.intValue();
                        }
                    }
                }
            }
            float f = 1.0f;
            if (i > 3360.0f || i2 > 1890.0f) {
                f = 2.0f;
            } else if (i > 2688.0f || i2 > 1512.0f) {
                f = 1.5f;
            }
            float f2 = f * this.f7275e.f6109bQ.uiRenderScale;
            GameEngine.PrintLog("uiRenderScale:" + this.f7275e.f6109bQ.uiRenderScale);
            if (this.f7306I == z && this.f7307J == z2 && this.f7302E == this.f7304G && this.f7303F == this.f7305H && CommonUtils.m2253h(f2, this.f7313P)) {
                return;
            }
            int i3 = i;
            int i4 = i2;
            boolean z3 = this.f7307J != z2;
            this.f7313P = f2;
            this.f7304G = this.f7302E;
            this.f7305H = this.f7303F;
            this.f7306I = z;
            this.f7307J = z2;
            boolean z4 = false;
            if (z2 && z) {
                z4 = true;
            }
            System.setProperty("org.lwjgl.opengl.Window.undecorated", z4 ? "true" : "false");
            if (z) {
                GameEngine.PrintLog("screen: " + this.f7273c.getScreenWidth() + ", " + this.f7273c.getScreenHeight());
                GameEngine.PrintLog("container: " + this.f7271a.getWidth() + ", " + this.f7271a.getHeight());
                if (z2) {
                    this.f7273c.setDisplayMode(i3, i4, false);
                } else {
                    this.f7273c.setDisplayMode(i3, i4, true);
                }
            } else {
                boolean z5 = false;
                if (this.f7273c.isFullscreen()) {
                    z5 = true;
                }
                if (z3) {
                    z5 = true;
                    if (i3 > 2 && i4 > 2) {
                        this.f7273c.setDisplayMode(i3 - 1, i4 - 1, false);
                    }
                }
                if (z5) {
                    this.f7273c.setDisplayMode(i3, i4, false);
                    Display.setResizable(false);
                    Display.setResizable(true);
                } else {
                    SGL sgl = Renderer.get();
                    sgl.initDisplay(i3, i4);
                    sgl.enterOrtho(i3, i4);
                    Field declaredField = GameContainer.class.getDeclaredField("width");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f7273c, Integer.valueOf(i3));
                    Field declaredField2 = GameContainer.class.getDeclaredField("height");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.f7273c, Integer.valueOf(i4));
                }
            }
            this.f7314Q = Display.getWidth() / 2;
            this.f7315R = Display.getHeight() / 2;
            int i5 = (int) (i3 / this.f7313P);
            int i6 = (int) (i4 / this.f7313P);
            if (this.f7276f != null) {
                this.f7276f.f7139a = i5;
                this.f7276f.f7140b = i6;
            } else {
                GameEngine.PrintLog("setResolution: gameView=null");
            }
            if (this.f7275e != null) {
                this.f7275e.m1148b(i5, i6);
                this.f7275e.m1212W();
            } else {
                GameEngine.PrintLog("setResolution: game=null");
            }
            if (this.f7272b != null && this.f7272b.f6975p != null) {
                this.f7272b.f6975p.setDimensionsWrap(i5, i6);
            } else {
                GameEngine.PrintLog("setResolution: main.libRocket=null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m39a(String str, boolean z) {
        boolean z2 = true;
        if (!str.startsWith("Loading units ")) {
            GameEngine.PrintLog("--Now loading:" + str);
            z2 = false;
        }
        if (z) {
            this.f7311N = this.f7310M;
            this.f7310M = str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z2 && currentTimeMillis < this.f7312O + 10) {
            return;
        }
        this.f7312O = currentTimeMillis;
        Graphics m307a = this.f7273c.m307a();
        m38a((GameContainer) this.f7273c, m307a);
        this.f7273c.m306a(m307a);
    }

    /* renamed from: a */
    public void m38a(GameContainer gameContainer, Graphics graphics) {
        this.f7308K += this.f7290t;
        this.f7309L++;
        graphics.setColor(Color.black);
        graphics.clear();
        if (this.f7283m != null) {
            graphics.drawImage(this.f7283m.mo418C(), (Display.getWidth() / 2) - (this.f7283m.f6396p / 2), (Display.getHeight() / 2) - (this.f7283m.f6397q / 2));
        }
        String str = "Loading";
        for (int i = 0; i <= this.f7309L % 4; i++) {
            str = str + ".";
        }
        String m2268e = CommonUtils.m2268e("    " + str, 17);
        int width = graphics.getFont().getWidth(m2268e);
        int height = Display.getHeight() - 70;
        graphics.setColor(Color.white);
        graphics.drawString(m2268e, (Display.getWidth() / 2) - (width / 2), height);
        graphics.setColor(new Color(1.0f, 1.0f, 1.0f, 0.6f));
        graphics.drawString(this.f7310M, (Display.getWidth() / 2) - (graphics.getFont().getWidth(this.f7310M) / 2), height + 20);
    }

    /* renamed from: a */
    public void m40a(C1173e c1173e) {
        c1173e.mo878k();
        c1173e.mo935a(this.f7313P, this.f7313P);
    }

    /* renamed from: b */
    public void m32b(C1173e c1173e) {
        c1173e.mo877l();
    }

    /* renamed from: a */
    public void m36a(Graphics graphics, float f) {
        graphics.pushTransform();
        graphics.scale(f, f);
    }

    /* renamed from: a */
    public void m37a(Graphics graphics) {
        graphics.popTransform();
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        long currentTimeMillis = System.currentTimeMillis();
        float f = ((float) (currentTimeMillis - this.f7316S)) * 0.060000002f;
        int i = (int) (currentTimeMillis - this.f7316S);
        this.f7316S = currentTimeMillis;
        if (this.f7292v && this.f7291u && gameContainer.hasFocus()) {
            Mouse.setCursorPosition(this.f7314Q, this.f7315R);
        }
        if (!this.f7288r) {
            m38a(gameContainer, graphics);
            if (!this.f7289s) {
                this.f7289s = true;
            } else if (!this.f7286p) {
                m34b();
            }
        } else if (this.f7275e == null) {
            GameEngine.m1145b("render: game==null");
        } else {
            m46a();
            float f2 = this.f7290t * 0.060000002f;
            int width = Display.getWidth();
            int height = Display.getHeight();
            if (width != this.f7304G || height != this.f7305H) {
                if (this.f7300C != width || this.f7301D != height) {
                    this.f7300C = width;
                    this.f7301D = height;
                    this.f7299B = 0.0f;
                }
                this.f7299B += f2;
                this.f7298A += f2;
                if (this.f7298A > 300.0f || this.f7299B > 20.0f || this.f7298A > 0.0f) {
                    this.f7298A = 0.0f;
                    this.f7299B = 0.0f;
                    m44a(width, height);
                }
            }
            float f3 = this.f7313P;
            this.f7272b.m439a(f2);
            if (this.f7275e.f6109bQ.liveReloading) {
                this.f7297z++;
                if (this.f7297z > 30) {
                    this.f7297z = 0;
                    if (C1189s.f7250y != null) {
                        Iterator it = C1189s.f7250y.iterator();
                        while (it.hasNext()) {
                            ((C1189s) it.next()).mo391t();
                        }
                    }
                    if (!this.f7275e.m1119h(48)) {
                        this.f7272b.f6975p.detectChangesAndReload();
                    }
                }
            }
            boolean z = false;
            C1173e c1173e = null;
            if (!this.f7275e.f6236bG) {
                graphics.setColor(Color.gray);
                graphics.resetTransform();
                graphics.clearClip();
                graphics.clear();
                if (!m29d() && !this.f7275e.f6238bI) {
                    this.f7319V++;
                    if (this.f7319V > 100) {
                        this.f7319V = 0;
                        GameEngine.PrintLog("Fail safe menu");
                        AbstractC0043a.m7083a().m7077b();
                    }
                }
            } else {
                this.f7319V = 0;
            }
            boolean m2958a = this.f7275e.f6112bT.f4133ae.m2958a();
            boolean z2 = this.f7275e.f6225bl && this.f7275e.f6112bT.f4134af.m2958a();
            if (z2) {
                m2958a = true;
            }
            if (this.f7275e.f6236bG) {
                graphics.resetTransform();
                if (!this.f7275e.f6266du) {
                    graphics.clearClip();
                    graphics.clear();
                }
                graphics.setColor(Color.black);
                if (!GameEngine.f6080aB) {
                    c1173e = (C1173e) this.f7275e.graphics;
                    if (c1173e != null) {
                        c1173e.f7153f = graphics;
                        c1173e.f7195L = this.f7313P;
                        z = true;
                        m40a(c1173e);
                    }
                }
                boolean z3 = this.f7275e.f6153cR;
                if (m2958a) {
                    this.f7275e.f6153cR = true;
                }
                this.f7275e.m1205a(f2, this.f7290t);
                if (m2958a) {
                    this.f7275e.f6153cR = z3;
                }
                this.f7290t = 0;
                if (!GameEngine.f6080aB && z) {
                    m32b(c1173e);
                }
            } else {
                this.f7275e.f6106bN.m2932a(f2);
            }
            m36a(graphics, f3);
            C1058a.m786a().m785a(0.0f);
            this.f7272b.f6975p.f365c.update(f2);
            if (!this.f7272b.f6975p.m7053b()) {
                this.f7272b.f6975p.m238a(graphics);
                this.f7272b.f6975p.update();
                this.f7272b.f6975p.render();
                this.f7272b.f6975p.f365c.checkForErrors();
                this.f7272b.f6975p.debug = false;
            }
            this.f7272b.f6975p.postUpdate();
            m37a(graphics);
            if (this.f7279i) {
                graphics.clear();
            }
            if (this.f7292v && !m2958a && !this.f7275e.f6155cT) {
                graphics.drawImage(this.f7284n.mo418C(), this.f7293w * this.f7313P, this.f7294x * this.f7313P);
            }
            if (m2958a) {
                m35a(graphics, z2);
            }
            if (this.f7272b.f6977u) {
                this.f7272b.f6978v++;
                if (this.f7272b.f6978v > 2) {
                    this.f7272b.f6977u = false;
                    this.f7272b.f6978v = 0;
                    GameEngine.PrintLog("Saving settings (queued)");
                    this.f7275e.f6109bQ.save();
                }
            }
        }
    }

    /* renamed from: a */
    public void m35a(Graphics graphics, boolean z) {
        C1170d c1170d = this.f7276f;
        int i = 10;
        int i2 = 10;
        if (c1170d != null) {
            i = c1170d.f7139a;
            i2 = c1170d.f7140b;
        }
        try {
            try {
                GameEngine.PrintLog("Saving screenshot");
                File file = new File("screenshots");
                if (!file.exists()) {
                    file.mkdir();
                }
                String str = "screenshot_" + CommonUtils.m2336a("d MMM yyyy HH.mm.ss") + ".png";
                String str2 = "screenshots" + File.separator + str;
                if (!z) {
                    Image image = new Image(this.f7273c.getWidth(), this.f7273c.getHeight());
                    graphics.copyArea(image, 0, 0);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ImageOut.write(image, "png", byteArrayOutputStream);
                    GameEngine.m1122f(null, "Saving screenshot: " + str);
                    new Thread(new RunnableC11921(str2, byteArrayOutputStream, str)).start();
                    if (c1170d == null) {
                        return;
                    }
                    c1170d.f7139a = i;
                    c1170d.f7140b = i2;
                    return;
                }
                if (this.f7320W == null) {
                    this.f7320W = new C0193j();
                }
                int i3 = (int) (c1170d.f7139a * 2.0f);
                int i4 = (int) (c1170d.f7140b * 2.0f);
                InterfaceC1027y interfaceC1027y = this.f7275e.graphics;
                this.f7320W.m6437a(interfaceC1027y, i3, i4, 0);
                C0191i c0191i = (C0191i) this.f7275e;
                boolean z2 = this.f7275e.f6153cR;
                c0191i.m6481a(this.f7320W);
                this.f7275e.f6153cR = true;
                try {
                    this.f7275e.graphics.mo894b(android.graphics.Color.m7283a(0, 0, 0));
                    c1170d.mo6961b(true);
                    c0191i.m6471b(i3, i4);
                    c0191i.m6455j();
                    c0191i.m6486a(0.0f, 0);
                    c0191i.m6471b(i, i2);
                    c0191i.m6455j();
                    c0191i.m6470b(this.f7320W);
                    this.f7275e.f6153cR = z2;
                    interfaceC1027y.mo907a(this.f7320W.f1278a, new File(str2));
                    GameEngine.m1122f(null, "Saving large screenshot: " + str);
                    if (c1170d == null) {
                        return;
                    }
                    c1170d.f7139a = i;
                    c1170d.f7140b = i2;
                } catch (Throwable th) {
                    c0191i.m6470b(this.f7320W);
                    this.f7275e.f6153cR = z2;
                    throw th;
                }
            } catch (Throwable th2) {
                if (c1170d != null) {
                    c1170d.f7139a = i;
                    c1170d.f7140b = i2;
                }
                throw th2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            GameEngine.m1106n("Failed to take screenshot:" + e.getMessage());
            if (c1170d == null) {
                return;
            }
            c1170d.f7139a = i;
            c1170d.f7140b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.java.u$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/u$1.class */
    public class RunnableC11921 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f7321a;

        /* renamed from: b */
        final /* synthetic */ ByteArrayOutputStream f7322b;

        /* renamed from: c */
        final /* synthetic */ String f7323c;

        RunnableC11921(String str, ByteArrayOutputStream byteArrayOutputStream, String str2) {
            this.f7321a = str;
            this.f7322b = byteArrayOutputStream;
            this.f7323c = str2;
        }

        public void run() {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f7321a);
                fileOutputStream.write(this.f7322b.toByteArray());
                fileOutputStream.close();
                GameEngine.PrintLog("Screenshot saved: " + this.f7323c);
            } catch (Exception e) {
                e.printStackTrace();
                GameEngine.m1106n("Failed to write screenshot:" + e.getMessage());
            }
        }
    }
}
