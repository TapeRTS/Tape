package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.appFramework.C0116m;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.C0847m;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p007a.RunnableC0068a;
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
public class C1027u extends BasicGame {

    /* renamed from: a */
    GameContainer f6682a;

    /* renamed from: b */
    Main main;

    /* renamed from: c */
    GameWindowDisplay f6684c;

    /* renamed from: d */
    C0847m f6685d;

    /* renamed from: e */
    GameEngine f6686e;

    /* renamed from: f */
    C1006d f6687f;

    /* renamed from: m */
    C1025s f6688m;

    /* renamed from: n */
    C1025s f6689n;

    /* renamed from: o */
    boolean f6690o;

    /* renamed from: t */
    int f6691t;

    /* renamed from: v */
    boolean f6692v;

    /* renamed from: w */
    float f6693w;

    /* renamed from: x */
    float f6694x;

    /* renamed from: E */
    int f6674E;

    /* renamed from: F */
    int f6675F;

    /* renamed from: G */
    int f6676G;

    /* renamed from: H */
    int f6677H;

    /* renamed from: I */
    boolean f6678I;

    /* renamed from: J */
    boolean f6679J;

    /* renamed from: R */
    long f6680R;

    /* renamed from: U */
    int f6681U;

    /* renamed from: g */
    boolean f6695g = false;

    /* renamed from: h */
    Object f6696h = new Object();

    /* renamed from: i */
    boolean noDisplay = false;

    /* renamed from: j */
    boolean noSound = false;

    /* renamed from: k */
    boolean noMusic = false;

    /* renamed from: l */
    boolean f6700l = false;

    /* renamed from: p */
    boolean f6701p = false;

    /* renamed from: q */
    boolean f6702q = false;

    /* renamed from: r */
    boolean f6703r = false;

    /* renamed from: s */
    boolean f6704s = false;

    /* renamed from: u */
    boolean f6705u = false;

    /* renamed from: y */
    boolean f6706y = false;

    /* renamed from: V */
    private boolean[] f6707V = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP];

    /* renamed from: z */
    int f6708z = 0;

    /* renamed from: A */
    float f6709A = 0.0f;

    /* renamed from: B */
    float f6710B = 0.0f;

    /* renamed from: C */
    int f6711C = 0;

    /* renamed from: D */
    int f6712D = 0;

    /* renamed from: K */
    float f6713K = 0.0f;

    /* renamed from: L */
    int f6714L = 0;

    /* renamed from: M */
    String f6715M = VariableScope.nullOrMissingString;

    /* renamed from: N */
    String f6716N = VariableScope.nullOrMissingString;

    /* renamed from: O */
    float f6717O = 1.0f;

    /* renamed from: P */
    int f6718P = 100;

    /* renamed from: Q */
    int f6719Q = 100;

    /* renamed from: S */
    float f6720S = 0.0f;

    /* renamed from: T */
    float f6721T = 0.0f;

    public C1027u(String str) {
        super(str);
    }

    public boolean closeRequested() {
        if (!this.noDisplay && !RunnableC0068a.m4492a() && this.f6684c != null && !this.f6684c.isFullscreen()) {
            ScriptEngine.getInstance().addScriptToQueue("askQuitGame();");
            return false;
        }
        return true;
    }

    public void init(GameContainer gameContainer) {
        this.f6682a = gameContainer;
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
        this.f6688m = C1009e.m160b(R.drawable.logo, true);
        this.f6689n = C1009e.m160b(R.drawable.pointer, true);
        gameContainer.setMouseCursor(this.f6689n.mo72B(), 0, 0);
        this.f6680R = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m40a() {
        this.f6686e = GameEngine.getInstance();
        if (this.f6682a.isVSyncRequested() != this.f6686e.curSettings.renderVsync) {
            this.f6682a.setVSync(this.f6686e.curSettings.renderVsync);
        }
        if (this.f6686e.curSettings.highRefreshRate) {
            this.f6682a.setTargetFrameRate(300);
        } else {
            this.f6682a.setTargetFrameRate(120);
        }
        boolean z = false;
        if (this.f6686e.curSettings.enableMouseCapture && ((!this.f6686e.curSettings.slick2dFullScreen || this.f6686e.f5859cT) && !this.f6686e.f5818as && !this.f6686e.mo880a(false) && this.f6686e.gameRunning)) {
            z = true;
        }
        if (z != this.f6692v) {
            GameEngine.PrintLOG("Grabbing mouse:" + z);
            this.f6692v = z;
            if (!this.f6705u) {
                this.f6682a.setMouseGrabbed(this.f6692v);
            }
            if (this.f6692v) {
            }
            if (!this.f6692v) {
                Mouse.setCursorPosition((int) (this.f6693w * this.f6717O), (int) (Display.getHeight() - (this.f6694x * this.f6717O)));
            }
            GameEngine.f5804aR = this.f6692v;
        }
        this.f6682a.setSmoothDeltas(this.f6686e.curSettings.renderSmoothDelta);
        if (this.f6690o != Display.isActive()) {
            this.f6690o = Display.isActive();
            if (this.f6690o) {
                m21f();
            }
        }
    }

    /* renamed from: b */
    public void m29b() {
        if (this.f6701p) {
            GameEngine.LogTrace("loadingStartedThreaded");
            return;
        }
        this.f6701p = true;
        m25c();
    }

    /* renamed from: c */
    public void m25c() {
        if (this.f6702q) {
            GameEngine.LogTrace("loadingStartedNonThreaded");
            return;
        }
        this.f6702q = true;
        if (this.main == null) {
            this.main = new Main();
        }
        this.main.m383h();
        if (GameEngine.sandbox) {
            GameEngine.PrintLOG("switching to sandbox");
            ScriptEngine.getInstance().addScriptToQueue("open('sandboxOptions.rml', 'maps/skirmish/[z;p10]Crossing Large (10p).tmx'); loadConfigAndStartNewSandbox('maps/skirmish/[z;p10]Crossing Large (10p).tmx');");
        }
        this.f6703r = true;
    }

    /* renamed from: a */
    public void m35a(C1006d c1006d) {
        GameEngine.log("SlickContainer:setup");
        this.f6686e = GameEngine.getInstance();
        this.f6687f = c1006d;
        this.f6687f.f6545d = new C0116m();
        this.f6687f.f6543a = this.f6682a.getWidth();
        this.f6687f.f6544b = this.f6682a.getHeight();
        this.f6686e.mo848b(this.f6687f.f6543a, this.f6687f.f6544b);
        this.f6685d = new C0847m();
    }

    public void update(GameContainer gameContainer, int i) {
        this.f6691t = i;
    }

    /* renamed from: a */
    public int m39a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        GameEngine.PrintLOG("Unknown mouse button:" + i);
        return 0;
    }

    /* renamed from: a */
    public void m37a(int i, int i2, boolean z) {
        int i3;
        int i4;
        if (this.f6706y) {
            GameEngine.PrintLOG("mouseGrab:m:" + z + ",newX:" + i + ",newY:" + i2);
        }
        if (!this.f6692v) {
            this.f6693w = (int) (i / this.f6717O);
            this.f6694x = (int) (i2 / this.f6717O);
            return;
        }
        if (z) {
            if (this.f6705u) {
                i4 = i - this.f6718P;
                i3 = i2 - this.f6719Q;
            } else {
                i4 = i;
                i3 = i2;
            }
            this.f6693w += i4 / this.f6717O;
            this.f6694x += i3 / this.f6717O;
        } else {
            this.f6693w = (int) (i / this.f6717O);
            this.f6694x = (int) (i2 / this.f6717O);
        }
        if (this.f6693w < 0.0f) {
            this.f6693w = 0.0f;
        }
        if (this.f6694x < 0.0f) {
            this.f6694x = 0.0f;
        }
        if (this.f6687f != null) {
            if (this.f6693w > this.f6687f.mo238h() - 1) {
                this.f6693w = this.f6687f.mo238h() - 1;
            }
            if (this.f6694x > this.f6687f.mo237i() - 1) {
                this.f6694x = this.f6687f.mo237i() - 1;
                return;
            }
            return;
        }
        GameEngine.PrintLOG("processMouseGrab gameView==null");
    }

    public void mousePressed(int i, int i2, int i3) {
        int m39a;
        m37a(i2, i3, false);
        if (m23d()) {
            this.main.f6392p.mouseMove((int) this.f6693w, (int) this.f6694x, 0);
            this.main.f6392p.processMouseButtonDown(0, 0);
        } else if (this.f6687f != null && (m39a = m39a(i)) != 0) {
            this.f6687f.f6545d.m4406a(this.f6693w, this.f6694x, true, m39a);
        }
    }

    public void mouseDragged(int i, int i2, int i3, int i4) {
        m37a(i3, i4, true);
        if (m23d()) {
            this.main.f6392p.mouseMove((int) this.f6693w, (int) this.f6694x, 0);
        } else if (this.f6687f != null) {
            this.f6687f.f6545d.m4407a(this.f6693w, this.f6694x);
        }
    }

    public void mouseMoved(int i, int i2, int i3, int i4) {
        m37a(i3, i4, true);
        if (m23d()) {
            this.main.f6392p.mouseMove((int) this.f6693w, (int) this.f6694x, 0);
        } else if (this.f6687f != null) {
            this.f6687f.f6545d.m4407a(this.f6693w, this.f6694x);
        }
    }

    public void mouseReleased(int i, int i2, int i3) {
        int m39a;
        m37a(i2, i3, false);
        if (m23d()) {
            this.main.f6392p.processMouseButtonUp(0, 0);
        } else if (this.f6687f != null && (m39a = m39a(i)) != 0) {
            this.f6687f.f6545d.m4406a(this.f6693w, this.f6694x, false, m39a);
        }
    }

    public void mouseWheelMoved(int i) {
        if (m23d()) {
            this.main.f6392p.processMouseWheel((-(i / 120)) * 2, 0);
        } else if (this.f6686e != null) {
            this.f6686e.m811k(i);
        }
    }

    /* renamed from: d */
    boolean m23d() {
        if (this.main != null && this.main.f6392p != null && !this.main.f6392p.m4511b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m28b(int i) {
        if (i >= this.f6707V.length || i < 0) {
            return false;
        }
        return this.f6707V[i];
    }

    /* renamed from: e */
    public int m22e() {
        int i = 0;
        if (m28b(42) || m28b(54)) {
            i = 0 + 2;
        }
        if (m28b(29) || m28b(157)) {
            i++;
        }
        if (m28b(56) || m28b(184)) {
            i += 4;
        }
        return i;
    }

    /* renamed from: a */
    public void m36a(int i, boolean z) {
        if (i >= this.f6707V.length || i < 0) {
            return;
        }
        this.f6707V[i] = z;
    }

    /* renamed from: f */
    public void m21f() {
        for (int i = 0; i < this.f6707V.length; i++) {
            if (this.f6707V[i]) {
                m24c(i);
            }
        }
    }

    public void keyPressed(int i, char c) {
        m36a(i, true);
        if (this.main.f6387i == null) {
            GameEngine.PrintLOG("keyPressed: guiEngine==null");
        } else {
            this.main.f6387i.m4539a(i, c);
        }
    }

    /* renamed from: c */
    public void m24c(int i) {
        keyReleased(i, (char) 0);
    }

    public void keyReleased(int i, char c) {
        m36a(i, false);
        if (m23d()) {
            Integer m703c = SlickToAndroidKeycodes.m703c(i);
            if (m703c != null) {
                this.main.f6392p.processKeyUp(m703c.intValue(), m22e());
            } else if (!Character.isISOControl(c)) {
            }
        }
        if (this.f6686e != null) {
            this.f6686e.m847b(SlickToAndroidKeycodes.m705b(i), false);
        }
    }

    /* renamed from: a */
    public void m38a(int i, int i2) {
        this.f6674E = i;
        this.f6675F = i2;
        m20g();
    }

    /* renamed from: g */
    public void m20g() {
        if (this.f6700l || this.noDisplay) {
            return;
        }
        try {
            boolean z = this.f6686e.curSettings.slick2dFullScreen;
            boolean z2 = this.f6686e.curSettings.slick2dBorderless;
            if (z2) {
                z = true;
            }
            int i = this.f6674E;
            int i2 = this.f6675F;
            if (z) {
                i = this.f6684c.getScreenWidth();
                i2 = this.f6684c.getScreenHeight();
                String str = this.f6686e.curSettings.slick2dFullScreenResolution;
                if (str == null) {
                    GameEngine.PrintLOG("fullScreenResolutionString is null");
                    str = "native";
                }
                if (!str.equals("native")) {
                    String[] split = str.split("x");
                    if (split.length != 2) {
                        GameEngine.log("Unknown resolution format:" + str);
                    } else {
                        Integer m1623l = CommonUtils.m1623l(split[0]);
                        Integer m1623l2 = CommonUtils.m1623l(split[1]);
                        if (m1623l == null || m1623l2 == null) {
                            GameEngine.log("Bad resolution int:" + str);
                        } else {
                            i = m1623l.intValue();
                            i2 = m1623l2.intValue();
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
            float f2 = f * this.f6686e.curSettings.uiRenderScale;
            GameEngine.PrintLOG("uiRenderScale:" + this.f6686e.curSettings.uiRenderScale);
            if (this.f6678I == z && this.f6679J == z2 && this.f6674E == this.f6676G && this.f6675F == this.f6677H && CommonUtils.roughlyEqual(f2, this.f6717O)) {
                return;
            }
            int i3 = i;
            int i4 = i2;
            boolean z3 = this.f6679J != z2;
            this.f6717O = f2;
            this.f6676G = this.f6674E;
            this.f6677H = this.f6675F;
            this.f6678I = z;
            this.f6679J = z2;
            boolean z4 = false;
            if (z2 && z) {
                z4 = true;
            }
            System.setProperty("org.lwjgl.opengl.Window.undecorated", z4 ? "true" : "false");
            if (z) {
                GameEngine.PrintLOG("screen: " + this.f6684c.getScreenWidth() + ", " + this.f6684c.getScreenHeight());
                GameEngine.PrintLOG("container: " + this.f6682a.getWidth() + ", " + this.f6682a.getHeight());
                if (z2) {
                    this.f6684c.setDisplayMode(i3, i4, false);
                } else {
                    this.f6684c.setDisplayMode(i3, i4, true);
                }
            } else {
                boolean z5 = false;
                if (this.f6684c.isFullscreen()) {
                    z5 = true;
                }
                if (z3) {
                    z5 = true;
                    if (i3 > 2 && i4 > 2) {
                        this.f6684c.setDisplayMode(i3 - 1, i4 - 1, false);
                    }
                }
                if (z5) {
                    this.f6684c.setDisplayMode(i3, i4, false);
                    Display.setResizable(false);
                    Display.setResizable(true);
                } else {
                    SGL sgl = Renderer.get();
                    sgl.initDisplay(i3, i4);
                    sgl.enterOrtho(i3, i4);
                    Field declaredField = GameContainer.class.getDeclaredField("width");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f6684c, Integer.valueOf(i3));
                    Field declaredField2 = GameContainer.class.getDeclaredField("height");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.f6684c, Integer.valueOf(i4));
                }
            }
            this.f6718P = Display.getWidth() / 2;
            this.f6719Q = Display.getHeight() / 2;
            int i5 = (int) (i3 / this.f6717O);
            int i6 = (int) (i4 / this.f6717O);
            if (this.f6687f != null) {
                this.f6687f.f6543a = i5;
                this.f6687f.f6544b = i6;
            } else {
                GameEngine.PrintLOG("setResolution: gameView=null");
            }
            if (this.f6686e != null) {
                this.f6686e.mo848b(i5, i6);
                this.f6686e.m910T();
            } else {
                GameEngine.PrintLOG("setResolution: game=null");
            }
            if (this.main != null && this.main.f6392p != null) {
                this.main.f6392p.setDimensions(i5, i6);
            } else {
                GameEngine.PrintLOG("setResolution: main.libRocket=null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m33a(String str, boolean z) {
        if (!str.startsWith("Loading units ")) {
            GameEngine.PrintLOG("--Now loading:" + str);
        }
        if (z) {
            this.f6716N = this.f6715M;
            this.f6715M = str;
        }
        Graphics m289a = this.f6684c.m289a();
        m32a((GameContainer) this.f6684c, m289a);
        this.f6684c.m288a(m289a);
    }

    /* renamed from: a */
    public void m32a(GameContainer gameContainer, Graphics graphics) {
        this.f6713K += this.f6691t;
        this.f6714L++;
        graphics.setColor(Color.black);
        graphics.clear();
        if (this.f6688m != null) {
            graphics.drawImage(this.f6688m.mo72B(), (Display.getWidth() / 2) - (this.f6688m.width / 2), (Display.getHeight() / 2) - (this.f6688m.height / 2));
        }
        String str = "Loading";
        for (int i = 0; i <= this.f6714L % 4; i++) {
            str = str + ".";
        }
        String m1647e = CommonUtils.m1647e("    " + str, 17);
        int width = graphics.getFont().getWidth(m1647e);
        int height = Display.getHeight() - 70;
        graphics.setColor(Color.white);
        graphics.drawString(m1647e, (Display.getWidth() / 2) - (width / 2), height);
        graphics.setColor(new Color(1.0f, 1.0f, 1.0f, 0.6f));
        graphics.drawString(this.f6715M, (Display.getWidth() / 2) - (graphics.getFont().getWidth(this.f6715M) / 2), height + 20);
    }

    /* renamed from: a */
    public void m34a(C1009e c1009e) {
        c1009e.mo135j();
        c1009e.mo224a(this.f6717O, this.f6717O);
    }

    /* renamed from: b */
    public void m27b(C1009e c1009e) {
        c1009e.mo134k();
    }

    /* renamed from: a */
    public void m30a(Graphics graphics, float f) {
        graphics.pushTransform();
        graphics.scale(f, f);
    }

    /* renamed from: a */
    public void m31a(Graphics graphics) {
        graphics.popTransform();
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        long currentTimeMillis = System.currentTimeMillis();
        float f = ((float) (currentTimeMillis - this.f6680R)) * 0.060000002f;
        int i = (int) (currentTimeMillis - this.f6680R);
        this.f6680R = currentTimeMillis;
        if (this.f6692v && this.f6705u && gameContainer.hasFocus()) {
            Mouse.setCursorPosition(this.f6718P, this.f6719Q);
        }
        if (!this.f6703r) {
            m32a(gameContainer, graphics);
            if (!this.f6704s) {
                this.f6704s = true;
            } else if (!this.f6701p) {
                m29b();
            }
        } else if (this.f6686e == null) {
            GameEngine.log("render: game==null");
        } else {
            m40a();
            float f2 = this.f6691t * 0.060000002f;
            int width = Display.getWidth();
            int height = Display.getHeight();
            if (width != this.f6676G || height != this.f6677H) {
                if (this.f6711C != width || this.f6712D != height) {
                    this.f6711C = width;
                    this.f6712D = height;
                    this.f6710B = 0.0f;
                }
                this.f6710B += f2;
                this.f6709A += f2;
                if (this.f6709A > 300.0f || this.f6710B > 20.0f || this.f6709A > 0.0f) {
                    this.f6709A = 0.0f;
                    this.f6710B = 0.0f;
                    m38a(width, height);
                }
            }
            float f3 = this.f6717O;
            this.main.m401a(f2);
            if (this.f6686e.curSettings.liveReloading) {
                this.f6708z++;
                if (this.f6708z > 30) {
                    this.f6708z = 0;
                    if (C1025s.f6655w != null) {
                        Iterator it = C1025s.f6655w.iterator();
                        while (it.hasNext()) {
                            ((C1025s) it.next()).mo44s();
                        }
                    }
                    if (!this.f6686e.m820h(48)) {
                        this.main.f6392p.detectChangesAndReload();
                    }
                }
            }
            boolean z = false;
            C1009e c1009e = null;
            if (!this.f6686e.f5950bG) {
                graphics.setColor(Color.gray);
                graphics.resetTransform();
                graphics.clearClip();
                graphics.clear();
                if (!m23d() && !this.f6686e.f5952bI) {
                    this.f6681U++;
                    if (this.f6681U > 100) {
                        this.f6681U = 0;
                        GameEngine.PrintLOG("Fail safe menu");
                        com.corrodinggames.librocket.Main.m4540a().showMainMenu();
                    }
                }
            } else {
                this.f6681U = 0;
            }
            boolean m2379a = this.f6686e.f5833bT.f3962ae.m2379a();
            if (this.f6686e.f5950bG) {
                graphics.resetTransform();
                if (!this.f6686e.f5981dv) {
                    graphics.clearClip();
                    graphics.clear();
                }
                graphics.setColor(Color.black);
                if (!GameEngine.noResources) {
                    c1009e = (C1009e) this.f6686e.graphics;
                    if (c1009e != null) {
                        c1009e.f6564f = graphics;
                        c1009e.f6598K = this.f6717O;
                        z = true;
                        m34a(c1009e);
                    }
                }
                boolean z2 = this.f6686e.f5857cR;
                if (m2379a) {
                    this.f6686e.f5857cR = true;
                }
                this.f6686e.mo850b(f2, this.f6691t);
                if (m2379a) {
                    this.f6686e.f5857cR = z2;
                }
                this.f6691t = 0;
                if (!GameEngine.noResources && z) {
                    m27b(c1009e);
                }
            } else {
                this.f6686e.musicController.m2358a(f2);
            }
            m30a(graphics, f3);
            SteamEngine.m718a().mo281a(0.0f);
            this.main.f6392p.f362c.update(f2);
            if (!this.main.f6392p.m4511b()) {
                this.main.f6392p.m228a(graphics);
                this.main.f6392p.update();
                this.main.f6392p.render();
                this.main.f6392p.f362c.checkForErrors();
                this.main.f6392p.debug = false;
            }
            this.main.f6392p.postUpdate();
            m31a(graphics);
            if (this.noDisplay) {
                graphics.clear();
            }
            if (this.f6692v && !m2379a && !this.f6686e.f5859cT) {
                graphics.drawImage(this.f6689n.mo72B(), this.f6693w * this.f6717O, this.f6694x * this.f6717O);
            }
            if (m2379a) {
                m26b(graphics);
            }
            if (this.main.f6394u) {
                this.main.f6395v++;
                if (this.main.f6395v > 2) {
                    this.main.f6394u = false;
                    this.main.f6395v = 0;
                    GameEngine.PrintLOG("Saving settings (queued)");
                    this.f6686e.curSettings.save();
                }
            }
        }
    }

    /* renamed from: b */
    public void m26b(Graphics graphics) {
        try {
            GameEngine.PrintLOG("Saving screenshot");
            File file = new File("screenshots");
            if (!file.exists()) {
                file.mkdir();
            }
            final String str = "screenshot_" + CommonUtils.SimpleDateFormatStr("d MMM yyyy HH.mm.ss") + ".png";
            Image image = new Image(this.f6684c.getWidth(), this.f6684c.getHeight());
            graphics.copyArea(image, 0, 0);
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageOut.write(image, "png", byteArrayOutputStream);
            GameEngine.m823f(null, "Saving screenshot: " + str);
            new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.u.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream("screenshots" + File.separator + str);
                        fileOutputStream.write(byteArrayOutputStream.toByteArray());
                        fileOutputStream.close();
                        GameEngine.PrintLOG("Screenshot saved: " + str);
                    } catch (Exception e) {
                        e.printStackTrace();
                        GameEngine.m805n("Failed to write screenshot:" + e.getMessage());
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
            GameEngine.m805n("Failed to take screenshot:" + e.getMessage());
        }
    }
}