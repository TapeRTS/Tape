package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p039j.C0753j;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.C0091k;
import com.corrodinggames.rts.p009b.RunnableC0103a;
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

/* renamed from: com.corrodinggames.rts.java.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/t.class */
public class C0922t extends BasicGame {

    /* renamed from: a */
    GameContainer f6126a;

    /* renamed from: b */
    Main f6127b;

    /* renamed from: c */
    C0886b f6128c;

    /* renamed from: d */
    C0753j f6129d;

    /* renamed from: e */
    AbstractC0789l f6130e;

    /* renamed from: f */
    C0902d f6131f;

    /* renamed from: m */
    C0920r f6138m;

    /* renamed from: n */
    C0920r f6139n;

    /* renamed from: o */
    boolean f6140o;

    /* renamed from: t */
    int f6145t;

    /* renamed from: v */
    boolean f6147v;

    /* renamed from: w */
    float f6148w;

    /* renamed from: x */
    float f6149x;

    /* renamed from: E */
    int f6157E;

    /* renamed from: F */
    int f6158F;

    /* renamed from: G */
    int f6159G;

    /* renamed from: H */
    int f6160H;

    /* renamed from: I */
    boolean f6161I;

    /* renamed from: J */
    boolean f6162J;

    /* renamed from: R */
    long f6170R;

    /* renamed from: U */
    int f6173U;

    /* renamed from: g */
    boolean f6132g = false;

    /* renamed from: h */
    Object f6133h = new Object();

    /* renamed from: i */
    boolean f6134i = false;

    /* renamed from: j */
    boolean f6135j = false;

    /* renamed from: k */
    boolean f6136k = false;

    /* renamed from: l */
    boolean f6137l = false;

    /* renamed from: p */
    boolean f6141p = false;

    /* renamed from: q */
    boolean f6142q = false;

    /* renamed from: r */
    boolean f6143r = false;

    /* renamed from: s */
    boolean f6144s = false;

    /* renamed from: u */
    boolean f6146u = false;

    /* renamed from: y */
    boolean f6150y = false;

    /* renamed from: V */
    private boolean[] f6151V = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP];

    /* renamed from: z */
    int f6152z = 0;

    /* renamed from: A */
    float f6153A = 0.0f;

    /* renamed from: B */
    float f6154B = 0.0f;

    /* renamed from: C */
    int f6155C = 0;

    /* renamed from: D */
    int f6156D = 0;

    /* renamed from: K */
    float f6163K = 0.0f;

    /* renamed from: L */
    int f6164L = 0;

    /* renamed from: M */
    String f6165M = "";

    /* renamed from: N */
    String f6166N = "";

    /* renamed from: O */
    float f6167O = 1.0f;

    /* renamed from: P */
    int f6168P = 100;

    /* renamed from: Q */
    int f6169Q = 100;

    /* renamed from: S */
    float f6171S = 0.0f;

    /* renamed from: T */
    float f6172T = 0.0f;

    public C0922t(String str) {
        super(str);
    }

    public boolean closeRequested() {
        if (this.f6134i || RunnableC0103a.m3905a() || this.f6128c == null || this.f6128c.isFullscreen()) {
            return true;
        }
        ScriptEngine.getInstance().addScriptToQueue("askQuitGame();");
        return false;
    }

    public void init(GameContainer gameContainer) {
        this.f6126a = gameContainer;
        gameContainer.setAlwaysRender(true);
        gameContainer.setForceExit(true);
        gameContainer.setShowFPS(false);
        gameContainer.setTargetFrameRate(300);
        if (AbstractC0789l.f5458as) {
            gameContainer.setShowFPS(true);
            gameContainer.setTargetFrameRate(30);
        }
        gameContainer.setIcons(new String[]{"res/drawable/icon_window.png", "res/drawable/icon_window128.png", "res/drawable/icon_window24.png", "res/drawable/icon_window16.png"});
        gameContainer.setUpdateOnlyWhenVisible(false);
        gameContainer.getInput().enableKeyRepeat();
        this.f6138m = C0905e.m144b(C0063R.drawable.logo, true);
        this.f6139n = C0905e.m144b(C0063R.drawable.pointer, true);
        gameContainer.setMouseCursor(this.f6139n.mo40z(), 0, 0);
        this.f6170R = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m38a() {
        this.f6130e = AbstractC0789l.m638u();
        if (this.f6126a.isVSyncRequested() != this.f6130e.f5516by.renderVsync) {
            this.f6126a.setVSync(this.f6130e.f5516by.renderVsync);
        }
        if (this.f6130e.f5516by.highRefreshRate) {
            this.f6126a.setTargetFrameRate(300);
        } else {
            this.f6126a.setTargetFrameRate(120);
        }
        boolean z = false;
        if (this.f6130e.f5516by.enableMouseCapture && ((!this.f6130e.f5516by.slick2dFullScreen || this.f6130e.f5571cB) && !this.f6130e.f5451al && !this.f6130e.mo711a(false) && this.f6130e.f5492ba)) {
            z = true;
        }
        if (z != this.f6147v) {
            AbstractC0789l.m670d("Grabbing mouse:" + z);
            this.f6147v = z;
            if (!this.f6146u) {
                this.f6126a.setMouseGrabbed(this.f6147v);
            }
            if (this.f6147v) {
            }
            if (!this.f6147v) {
                Mouse.setCursorPosition((int) (this.f6148w * this.f6167O), (int) (Display.getHeight() - (this.f6149x * this.f6167O)));
            }
            AbstractC0789l.f5469aD = this.f6147v;
        }
        this.f6126a.setSmoothDeltas(this.f6130e.f5516by.renderSmoothDelta);
        if (this.f6140o != Display.isActive()) {
            this.f6140o = Display.isActive();
            if (this.f6140o) {
                m21f();
            }
        }
    }

    /* renamed from: b */
    public void m29b() {
        if (this.f6141p) {
            AbstractC0789l.m663f("loadingStartedThreaded");
            return;
        }
        this.f6141p = true;
        m26c();
    }

    /* renamed from: c */
    public void m26c() {
        if (this.f6142q) {
            AbstractC0789l.m663f("loadingStartedNonThreaded");
            return;
        }
        this.f6142q = true;
        if (this.f6127b == null) {
            this.f6127b = new Main();
        }
        this.f6127b.m358h();
        if (AbstractC0789l.f5466aA) {
            AbstractC0789l.m670d("switching to sandbox");
            ScriptEngine.getInstance().addScriptToQueue("open('sandboxOptions.rml', 'maps/skirmish/[z;p10]Crossing Large (10p).tmx'); loadConfigAndStartNewSandbox('maps/skirmish/[z;p10]Crossing Large (10p).tmx');");
        }
        this.f6143r = true;
    }

    /* renamed from: a */
    public void m33a(C0902d dVar) {
        AbstractC0789l.m682b("SlickContainer:setup");
        this.f6130e = AbstractC0789l.m638u();
        this.f6131f = dVar;
        this.f6131f.f6016d = new C0091k();
        this.f6131f.f6013a = this.f6126a.getWidth();
        this.f6131f.f6014b = this.f6126a.getHeight();
        this.f6130e.mo685b(this.f6131f.f6013a, this.f6131f.f6014b);
        this.f6129d = new C0753j();
    }

    public void update(GameContainer gameContainer, int i) {
        this.f6145t = i;
    }

    /* renamed from: a */
    public int m37a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        AbstractC0789l.m670d("Unknown mouse button:" + i);
        return 0;
    }

    /* renamed from: a */
    public void m35a(int i, int i2, boolean z) {
        int i3;
        int i4;
        if (this.f6150y) {
            AbstractC0789l.m670d("mouseGrab:m:" + z + ",newX:" + i + ",newY:" + i2);
        }
        if (!this.f6147v) {
            this.f6148w = (int) (i / this.f6167O);
            this.f6149x = (int) (i2 / this.f6167O);
            return;
        }
        if (z) {
            if (this.f6146u) {
                i4 = i - this.f6168P;
                i3 = i2 - this.f6169Q;
            } else {
                i4 = i;
                i3 = i2;
            }
            this.f6148w += i4 / this.f6167O;
            this.f6149x += i3 / this.f6167O;
        } else {
            this.f6148w = (int) (i / this.f6167O);
            this.f6149x = (int) (i2 / this.f6167O);
        }
        if (this.f6148w < 0.0f) {
            this.f6148w = 0.0f;
        }
        if (this.f6149x < 0.0f) {
            this.f6149x = 0.0f;
        }
        if (this.f6131f != null) {
            if (this.f6148w > this.f6131f.mo214h() - 1) {
                this.f6148w = this.f6131f.mo214h() - 1;
            }
            if (this.f6149x > this.f6131f.mo213i() - 1) {
                this.f6149x = this.f6131f.mo213i() - 1;
                return;
            }
            return;
        }
        AbstractC0789l.m670d("processMouseGrab gameView==null");
    }

    public void mousePressed(int i, int i2, int i3) {
        int a;
        m35a(i2, i3, false);
        if (m23d()) {
            this.f6127b.f5867p.mouseMove((int) this.f6148w, (int) this.f6149x, 0);
            this.f6127b.f5867p.processMouseButtonDown(0, 0);
        } else if (this.f6131f != null && (a = m37a(i)) != 0) {
            this.f6131f.f6016d.m3929a(this.f6148w, this.f6149x, true, a);
        }
    }

    public void mouseDragged(int i, int i2, int i3, int i4) {
        m35a(i3, i4, true);
        if (m23d()) {
            this.f6127b.f5867p.mouseMove((int) this.f6148w, (int) this.f6149x, 0);
        } else if (this.f6131f != null) {
            this.f6131f.f6016d.m3930a(this.f6148w, this.f6149x);
        }
    }

    public void mouseMoved(int i, int i2, int i3, int i4) {
        m35a(i3, i4, true);
        if (m23d()) {
            this.f6127b.f5867p.mouseMove((int) this.f6148w, (int) this.f6149x, 0);
        } else if (this.f6131f != null) {
            this.f6131f.f6016d.m3930a(this.f6148w, this.f6149x);
        }
    }

    public void mouseReleased(int i, int i2, int i3) {
        int a;
        m35a(i2, i3, false);
        if (m23d()) {
            this.f6127b.f5867p.processMouseButtonUp(0, 0);
        } else if (this.f6131f != null && (a = m37a(i)) != 0) {
            this.f6131f.f6016d.m3929a(this.f6148w, this.f6149x, false, a);
        }
    }

    public void mouseWheelMoved(int i) {
        if (m23d()) {
            this.f6127b.f5867p.processMouseWheel((-(i / 120)) * 2, 0);
        } else if (this.f6130e != null) {
            this.f6130e.m649k(i);
        }
    }

    /* renamed from: d */
    boolean m23d() {
        if (this.f6127b == null || this.f6127b.f5867p == null || this.f6127b.f5867p.m3981b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m28b(int i) {
        if (i >= this.f6151V.length || i < 0) {
            return false;
        }
        return this.f6151V[i];
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
    public void m34a(int i, boolean z) {
        if (i < this.f6151V.length && i >= 0) {
            this.f6151V[i] = z;
        }
    }

    /* renamed from: f */
    public void m21f() {
        for (int i = 0; i < this.f6151V.length; i++) {
            if (this.f6151V[i]) {
                m25c(i);
            }
        }
    }

    public void keyPressed(int i, char c) {
        m34a(i, true);
        if (this.f6127b.f5860i == null) {
            AbstractC0789l.m670d("keyPressed: guiEngine==null");
        } else {
            this.f6127b.f5860i.m4009a(i, c);
        }
    }

    /* renamed from: c */
    public void m25c(int i) {
        keyReleased(i, (char) 0);
    }

    public void keyReleased(int i, char c) {
        m34a(i, false);
        if (m23d()) {
            Integer c2 = SlickToAndroidKeycodes.m617c(i);
            if (c2 != null) {
                this.f6127b.f5867p.processKeyUp(c2.intValue(), m22e());
            } else if (!Character.isISOControl(c)) {
            }
        }
        if (this.f6130e != null) {
            this.f6130e.m684b(SlickToAndroidKeycodes.m619b(i), false);
        }
    }

    /* renamed from: a */
    public void m36a(int i, int i2) {
        this.f6157E = i;
        this.f6158F = i2;
        m20g();
    }

    /* renamed from: g */
    public void m20g() {
        if (!this.f6137l && !this.f6134i) {
            try {
                boolean z = this.f6130e.f5516by.slick2dFullScreen;
                boolean z2 = this.f6130e.f5516by.slick2dBorderless;
                if (z2) {
                    z = true;
                }
                int i = this.f6157E;
                int i2 = this.f6158F;
                if (z) {
                    i = this.f6128c.getScreenWidth();
                    i2 = this.f6128c.getScreenHeight();
                    String str = this.f6130e.f5516by.slick2dFullScreenResolution;
                    if (str == null) {
                        AbstractC0789l.m670d("fullScreenResolutionString is null");
                        str = "native";
                    }
                    if (!str.equals("native")) {
                        String[] split = str.split("x");
                        if (split.length != 2) {
                            AbstractC0789l.m682b("Unknown resolution format:" + str);
                        } else {
                            Integer l = C0654f.m1415l(split[0]);
                            Integer l2 = C0654f.m1415l(split[1]);
                            if (l == null || l2 == null) {
                                AbstractC0789l.m682b("Bad resolution int:" + str);
                            } else {
                                i = l.intValue();
                                i2 = l2.intValue();
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
                float f2 = f * this.f6130e.f5516by.uiRenderScale;
                AbstractC0789l.m670d("uiRenderScale:" + this.f6130e.f5516by.uiRenderScale);
                if (this.f6161I != z || this.f6162J != z2 || this.f6157E != this.f6159G || this.f6158F != this.f6160H || !C0654f.m1424h(f2, this.f6167O)) {
                    boolean z3 = this.f6162J != z2;
                    this.f6167O = f2;
                    this.f6159G = this.f6157E;
                    this.f6160H = this.f6158F;
                    this.f6161I = z;
                    this.f6162J = z2;
                    boolean z4 = false;
                    if (z2 && z) {
                        z4 = true;
                    }
                    System.setProperty("org.lwjgl.opengl.Window.undecorated", z4 ? "true" : "false");
                    if (z) {
                        AbstractC0789l.m670d("screen: " + this.f6128c.getScreenWidth() + ", " + this.f6128c.getScreenHeight());
                        AbstractC0789l.m670d("container: " + this.f6126a.getWidth() + ", " + this.f6126a.getHeight());
                        if (z2) {
                            this.f6128c.setDisplayMode(i, i2, false);
                        } else {
                            this.f6128c.setDisplayMode(i, i2, true);
                        }
                    } else {
                        boolean z5 = false;
                        if (this.f6128c.isFullscreen()) {
                            z5 = true;
                        }
                        if (z3) {
                            z5 = true;
                            if (i > 2 && i2 > 2) {
                                this.f6128c.setDisplayMode(i - 1, i2 - 1, false);
                            }
                        }
                        if (z5) {
                            this.f6128c.setDisplayMode(i, i2, false);
                            Display.setResizable(false);
                            Display.setResizable(true);
                        } else {
                            SGL sgl = Renderer.get();
                            sgl.initDisplay(i, i2);
                            sgl.enterOrtho(i, i2);
                            Field declaredField = GameContainer.class.getDeclaredField("width");
                            declaredField.setAccessible(true);
                            declaredField.set(this.f6128c, Integer.valueOf(i));
                            Field declaredField2 = GameContainer.class.getDeclaredField("height");
                            declaredField2.setAccessible(true);
                            declaredField2.set(this.f6128c, Integer.valueOf(i2));
                        }
                    }
                    this.f6168P = Display.getWidth() / 2;
                    this.f6169Q = Display.getHeight() / 2;
                    int i3 = (int) (i / this.f6167O);
                    int i4 = (int) (i2 / this.f6167O);
                    if (this.f6131f != null) {
                        this.f6131f.f6013a = i3;
                        this.f6131f.f6014b = i4;
                    } else {
                        AbstractC0789l.m670d("setResolution: gameView=null");
                    }
                    if (this.f6130e != null) {
                        this.f6130e.mo685b(i3, i4);
                        this.f6130e.m745P();
                    } else {
                        AbstractC0789l.m670d("setResolution: game=null");
                    }
                    if (this.f6127b == null || this.f6127b.f5867p == null) {
                        AbstractC0789l.m670d("setResolution: main.libRocket=null");
                    } else {
                        this.f6127b.f5867p.setDimensions(i3, i4);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m32a(String str, boolean z) {
        if (!str.startsWith("Loading units ")) {
            AbstractC0789l.m670d("--Now loading:" + str);
        }
        if (z) {
            this.f6166N = this.f6165M;
            this.f6165M = str;
        }
        Graphics a = this.f6128c.m264a();
        m31a((GameContainer) this.f6128c, a);
        this.f6128c.m263a(a);
    }

    /* renamed from: a */
    public void m31a(GameContainer gameContainer, Graphics graphics) {
        this.f6163K += this.f6145t;
        this.f6164L++;
        graphics.setColor(Color.black);
        graphics.clear();
        if (this.f6138m != null) {
            graphics.drawImage(this.f6138m.mo40z(), (Display.getWidth() / 2) - (this.f6138m.f5245k / 2), (Display.getHeight() / 2) - (this.f6138m.f5246l / 2));
        }
        String str = "Loading";
        for (int i = 0; i <= this.f6164L % 4; i++) {
            str = str + ".";
        }
        String e = C0654f.m1436e("    " + str, 17);
        int width = graphics.getFont().getWidth(e);
        int height = Display.getHeight() - 70;
        graphics.setColor(Color.white);
        graphics.drawString(e, (Display.getWidth() / 2) - (width / 2), height);
        graphics.setColor(new Color(1.0f, 1.0f, 1.0f, 0.6f));
        graphics.drawString(this.f6165M, (Display.getWidth() / 2) - (graphics.getFont().getWidth(this.f6165M) / 2), height + 20);
    }

    /* renamed from: a */
    public void m30a(Graphics graphics) {
        graphics.pushTransform();
        graphics.scale(this.f6167O, this.f6167O);
    }

    /* renamed from: b */
    public void m27b(Graphics graphics) {
        graphics.popTransform();
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        long currentTimeMillis = System.currentTimeMillis();
        float f = ((float) (currentTimeMillis - this.f6170R)) * 0.060000002f;
        int i = (int) (currentTimeMillis - this.f6170R);
        this.f6170R = currentTimeMillis;
        if (this.f6147v && this.f6146u && gameContainer.hasFocus()) {
            Mouse.setCursorPosition(this.f6168P, this.f6169Q);
        }
        if (!this.f6143r) {
            m31a(gameContainer, graphics);
            if (!this.f6144s) {
                this.f6144s = true;
            } else if (!this.f6141p) {
                m29b();
            }
        } else if (this.f6130e == null) {
            AbstractC0789l.m682b("render: game==null");
        } else {
            m38a();
            float f2 = this.f6145t * 0.060000002f;
            int width = Display.getWidth();
            int height = Display.getHeight();
            if (!(width == this.f6159G && height == this.f6160H)) {
                if (!(this.f6155C == width && this.f6156D == height)) {
                    this.f6155C = width;
                    this.f6156D = height;
                    this.f6154B = 0.0f;
                }
                this.f6154B += f2;
                this.f6153A += f2;
                if (this.f6153A > 300.0f || this.f6154B > 20.0f || this.f6153A > 0.0f) {
                    this.f6153A = 0.0f;
                    this.f6154B = 0.0f;
                    m36a(width, height);
                }
            }
            this.f6127b.m376a(f2);
            if (this.f6130e.f5516by.liveReloading) {
                this.f6152z++;
                if (this.f6152z > 30) {
                    this.f6152z = 0;
                    if (C0920r.f6105s != null) {
                        Iterator it = C0920r.f6105s.iterator();
                        while (it.hasNext()) {
                            ((C0920r) it.next()).mo43s();
                        }
                    }
                    if (!this.f6130e.m658h(48)) {
                        this.f6127b.f5867p.detectChangesAndReload();
                    }
                }
            }
            if (!this.f6130e.f5507bp) {
                graphics.setColor(Color.gray);
                graphics.resetTransform();
                graphics.clearClip();
                graphics.clear();
                m30a(graphics);
                if (!m23d() && !this.f6130e.f5509br) {
                    this.f6173U++;
                    if (this.f6173U > 100) {
                        this.f6173U = 0;
                        AbstractC0789l.m670d("Fail safe menu");
                        AbstractC0043a.m4010a().m4004b();
                    }
                }
            } else {
                this.f6173U = 0;
            }
            boolean a = this.f6130e.f5519bB.f3664ae.m2080a();
            if (this.f6130e.f5507bp) {
                graphics.resetTransform();
                if (!this.f6130e.f5598dc) {
                    graphics.clearClip();
                    graphics.clear();
                }
                m30a(graphics);
                graphics.setColor(Color.black);
                if (!AbstractC0789l.f5461av) {
                    C0905e eVar = (C0905e) this.f6130e.f5514bw;
                    eVar.f6030e = graphics;
                    eVar.f6055C = this.f6167O;
                }
                boolean z = this.f6130e.f5569cz;
                if (a) {
                    this.f6130e.f5569cz = true;
                }
                this.f6130e.mo687b(f2, this.f6145t);
                if (a) {
                    this.f6130e.f5569cz = z;
                }
                this.f6145t = 0;
            } else {
                this.f6130e.f5513bv.m2061a(f2);
            }
            C0796a.m632a().mo256a(0.0f);
            this.f6127b.f5867p.f355c.update(f2);
            if (!this.f6127b.f5867p.m3981b()) {
                this.f6127b.f5867p.m204a(graphics);
                this.f6127b.f5867p.update();
                this.f6127b.f5867p.render();
                this.f6127b.f5867p.f355c.checkForErrors();
                this.f6127b.f5867p.debug = false;
            }
            this.f6127b.f5867p.postUpdate();
            if (this.f6134i) {
                graphics.clear();
            }
            m27b(graphics);
            if (this.f6147v && !a && !this.f6130e.f5571cB) {
                graphics.drawImage(this.f6139n.mo40z(), this.f6148w * this.f6167O, this.f6149x * this.f6167O);
            }
            if (a) {
                m24c(graphics);
            }
            if (this.f6127b.f5872u) {
                this.f6127b.f5873v++;
                if (this.f6127b.f5873v > 2) {
                    this.f6127b.f5872u = false;
                    this.f6127b.f5873v = 0;
                    AbstractC0789l.m670d("Saving settings (queued)");
                    this.f6130e.f5516by.save();
                }
            }
        }
    }

    /* renamed from: c */
    public void m24c(Graphics graphics) {
        try {
            AbstractC0789l.m670d("Saving screenshot");
            File file = new File("screenshots");
            if (!file.exists()) {
                file.mkdir();
            }
            final String str = "screenshot_" + C0654f.m1490a("d MMM yyyy HH.mm.ss") + ".png";
            Image image = new Image(this.f6128c.getWidth(), this.f6128c.getHeight());
            graphics.copyArea(image, 0, 0);
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageOut.write(image, "png", byteArrayOutputStream);
            AbstractC0789l.m662f(null, "Saving screenshot: " + str);
            new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.t.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream("screenshots" + File.separator + str);
                        fileOutputStream.write(byteArrayOutputStream.toByteArray());
                        fileOutputStream.close();
                        AbstractC0789l.m670d("Screenshot saved: " + str);
                    } catch (Exception e) {
                        e.printStackTrace();
                        AbstractC0789l.m644m("Failed to write screenshot:" + e.getMessage());
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
            AbstractC0789l.m644m("Failed to take screenshot:" + e.getMessage());
        }
    }
}
