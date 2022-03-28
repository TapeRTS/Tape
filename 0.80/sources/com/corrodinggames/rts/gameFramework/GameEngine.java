package com.corrodinggames.rts.gameFramework;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Toast;
import com.corrodinggames.rts.appFramework.GameView;
import com.corrodinggames.rts.appFramework.MultiTouchController;
import com.corrodinggames.rts.game.CharacterController;
import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.gameFramework.RenderedObject;
import com.corrodinggames.rts.gameFramework.StateEngine;
import com.corrodinggames.rts.gameFramework.gui.InterfaceEngine;
import com.corrodinggames.rts.gameFramework.gui.MinimapHandler;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GameEngine.class */
public final class GameEngine {
    public static final String TAG = "RustedWarfare";
    static GameEngine gameEngine = null;
    public static final boolean liteVersion = true;
    public AudioEngine audio;
    Paint basePaint;
    public Paint bigTextPaint;
    public CollisionEngine collision;
    public CommandController commandController;
    public Context context;
    public StateEngine.LevelState currentLevelState;
    public String currentMapPath;
    Paint debugPaint;
    Paint debugPaint2;
    public String displayText;
    Paint displayTextBackgroundPaint;
    Paint displayTextBackgroundPaintBorder;
    public Paint displayTextPaint;
    public EffectEngine effects;
    Paint fadedAction;
    Paint fpsPaint;
    public GameView gameView;
    public GraphicsEngine graphics;
    public GroupController groupController;
    public float halfScreenHeight;
    public float halfScreenWidth;
    public float halfViewpointHeight;
    public float halfViewpointWidth;
    public InterfaceEngine interfaceEngine;
    public int levelTime;
    public Map map;
    public MinimapHandler minimapHandler;
    public MissionEngine mission;
    public MusicController music;
    public NetworkEngine network;
    public String nextMessageBoxText;
    public String nextMessageBoxTitle;
    public String nextToastMessage;
    public int onscreenActionX;
    public int onscreenActionY;
    public float onscreendactionFadedDelay;
    public int onscreendpadx;
    public int onscreendpady;
    public PathEngine path;
    public boolean pausedGame;
    public Team playerTeam;
    public boolean safeToRun;
    public float screenHeight;
    public float screenWidth;
    public Canvas screenshot_saver_canvas;
    int screenshot_saver_nextIndex;
    String screenshot_saver_path;
    public SettingsEngine settings;
    public float sidebarWidth;
    public StateEngine state;
    public StatsHandler stats;
    CharacterController tempCharacterController;
    public Context topContext;
    public float viewpointHeight;
    public float viewpointHeightUnscaled;
    public float viewpointWidth;
    public float viewpointWidthUnscaled;
    public float viewpointX;
    public int viewpointXAsInt;
    public float viewpointX_rounded;
    public float viewpointY;
    public int viewpointYAsInt;
    public float viewpointY_rounded;
    public Paint winTextPaint;
    public boolean debugTempMode = false;
    public boolean doTrace = false;
    public boolean gameRunning = false;
    public boolean screenshot_saver = false;
    ScreenshotRunnable[] screenshot_saver_runnable = new ScreenshotRunnable[4];
    public boolean traceActive = false;
    public boolean lookAroundMode = false;
    public Rect viewpointRectUnscaled = new Rect();
    public Rect viewpointRect = new Rect();
    public RectF viewpointRectF = new RectF();
    public Rect viewpointDrawCheckGlobalRect = new Rect();
    public float changeViewpointZoomTo = 1.0f;
    public float viewpointZoom = 1.0f;
    public float checkDeadUnitCountDelay = 500.0f;
    GameThread gameThread = null;
    public ConcurrentLinkedQueue<Runnable> preUpdateRunnableQueue = new ConcurrentLinkedQueue<>();
    int frameSampleTime = 0;
    int frameSamplesCollected = 0;
    int lastFps = 0;
    public String lastFpsString = "0fps";
    public float trackPadXSpeed = 0.0f;
    public float trackPadYSpeed = 0.0f;
    public boolean trackPadAction = false;
    public boolean levelComplete = false;
    public float levelCompleteTimer = 0.0f;
    public boolean gotoNextLevel = false;
    public boolean levelLoaded = false;
    Rect tempRect = new Rect();
    public ArrayList<String> displayTextLines = new ArrayList<>();
    public Paint tempPaint = new Paint();
    public int frameNumber = 0;
    public boolean inited = false;
    float updateTime = 0.0f;
    Matrix tempMatrix = new Matrix();
    public boolean[] touchActive = new boolean[10];
    public ArrayList<Rect> debugRects = new ArrayList<>();
    public ArrayList<Rect> debugRects2 = new ArrayList<>();
    protected ConcurrentLinkedQueue<GameEvent> eventQueue = new ConcurrentLinkedQueue<>();
    private boolean[] keyState = new boolean[KeyEvent.getMaxKeyCode()];
    private boolean[] keyStatePressed = new boolean[KeyEvent.getMaxKeyCode()];
    final Handler uiHandler = new Handler();
    private Runnable showToastRunnable = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.GameEngine.1
        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(GameEngine.this.context, GameEngine.this.nextToastMessage, 1).show();
        }
    };
    private Runnable showMessageBoxRunnable = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.GameEngine.2
        @Override // java.lang.Runnable
        public void run() {
            new AlertDialog.Builder(GameEngine.this.context).setIcon(17301543).setTitle(GameEngine.this.nextMessageBoxTitle).setMessage(GameEngine.this.nextMessageBoxText).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.corrodinggames.rts.gameFramework.GameEngine.2.2
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    GameEngine.this.pausedGame = false;
                }
            }).setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.gameFramework.GameEngine.2.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    GameEngine.this.pausedGame = false;
                }
            }).show();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GameEngine$GameEvent.class */
    public class GameEvent {
        long eventTime = System.currentTimeMillis();

        public GameEvent() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GameEngine$KeyGameEvent.class */
    public class KeyGameEvent extends GameEvent {
        public int keyCode;
        public KeyEvent msg;
        public boolean up;

        public KeyGameEvent(int i, boolean z, KeyEvent keyEvent) {
            super();
            this.keyCode = i;
            this.msg = keyEvent;
            this.up = z;
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GameEngine$LoadCallback.class */
    public static abstract class LoadCallback {
        public abstract void action();
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GameEngine$ScreenshotRunnable.class */
    class ScreenshotRunnable implements Runnable {
        public Bitmap bitmap;
        public int frame;
        public boolean free = true;
        public Thread thread;

        ScreenshotRunnable() {
        }

        public void bitmapFree() {
            synchronized (this) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(String.valueOf(GameEngine.this.screenshot_saver_path) + "image_" + String.format("%07d", Integer.valueOf(this.frame)) + ".jpg"));
                    this.bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public GameEngine(Context context) {
        Log.e(TAG, "GameEngine:GameEngine()");
        if (gameEngine != null) {
            throw new RuntimeException("gameEngine already created");
        }
        this.context = context;
        gameEngine = this;
    }

    public static String getFilename(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        return str.substring(lastIndexOf == -1 ? 0 : lastIndexOf + 1);
    }

    public static String getFilepath(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        int i = lastIndexOf;
        if (lastIndexOf == -1) {
            i = str.length();
        }
        return str.substring(0, i);
    }

    public static GameEngine getInstance() {
        return gameEngine;
    }

    public static GameEngine getInstanceOrCreateAndLoad(Context context) {
        GameEngine gameEngine2;
        synchronized (GameEngine.class) {
            try {
                if (gameEngine != null) {
                    gameEngine.context = context;
                    gameEngine2 = gameEngine;
                } else {
                    gameEngine = new GameEngine(context);
                    gameEngine.init(context);
                    gameEngine2 = gameEngine;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gameEngine2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.corrodinggames.rts.gameFramework.GameEngine$1BackgroundGameLoad] */
    public static void getInstanceOrCreateAndLoadThreaded(final Context context, final LoadCallback loadCallback) {
        synchronized (GameEngine.class) {
            try {
                if (gameEngine != null) {
                    gameEngine.context = context;
                    if (loadCallback != null) {
                        loadCallback.action();
                    }
                } else {
                    gameEngine = new GameEngine(context);
                    new Thread() { // from class: com.corrodinggames.rts.gameFramework.GameEngine.1BackgroundGameLoad
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            GameEngine.gameEngine.init(context);
                            if (loadCallback != null) {
                                loadCallback.action();
                            }
                        }
                    }.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Integer getMapLevel(String str) {
        Integer num;
        String filename = getFilename(str);
        Log.d(TAG, "getMapLevel for :" + str + " file:" + filename);
        Matcher matcher = Pattern.compile("^l(\\d*);.*").matcher(filename);
        if (matcher.matches()) {
            Log.d(TAG, "getMapLevel:" + str + ":" + Integer.parseInt(matcher.group(1)));
            num = Integer.valueOf(Integer.parseInt(matcher.group(1)));
        } else {
            num = null;
        }
        return num;
    }

    public static String getNextMapLevel(String str) {
        String substring;
        String str2;
        int i = 0;
        Integer mapLevel = getMapLevel(str);
        if (mapLevel != null) {
            int lastIndexOf = str.lastIndexOf("/");
            int i2 = lastIndexOf;
            if (lastIndexOf == -1) {
                i2 = str.length();
            }
            String[] listDir = listDir(str.substring(0, i2), true);
            int length = listDir.length;
            while (true) {
                if (i < length) {
                    String str3 = listDir[i];
                    Integer mapLevel2 = getMapLevel(str3);
                    if (mapLevel2 != null && mapLevel2.intValue() > mapLevel.intValue()) {
                        str2 = String.valueOf(substring) + "/" + str3;
                        break;
                    }
                    i++;
                } else {
                    str2 = null;
                    break;
                }
            }
        } else {
            str2 = null;
        }
        return str2;
    }

    public static String[] listDir(String str, boolean z) {
        String[] list;
        String[] strArr;
        if (str.startsWith("/SD/rusted_warfare_maps")) {
            File file = new File(Environment.getExternalStorageDirectory() + "/rusted_warfare_maps/" + str.substring("/SD/rusted_warfare_maps".length()));
            if (file == null || !file.exists()) {
                strArr = null;
                return strArr;
            }
            list = file.list();
        } else {
            try {
                list = getInstance().context.getAssets().list(str);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            for (String str2 : list) {
                if (str2.toLowerCase().endsWith(".tmx")) {
                    arrayList.add(str2);
                }
            }
        } else {
            for (String str3 : list) {
                arrayList.add(str3);
            }
        }
        strArr = (String[]) arrayList.toArray(new String[0]);
        return strArr;
    }

    public static void log(String str, String str2) {
        Log.d(TAG, String.valueOf(str) + ":" + str2);
    }

    public void alert(String str, int i) {
        this.nextToastMessage = str;
        this.uiHandler.post(this.showToastRunnable);
    }

    public void centerViewpointAtPoint(float f, float f2) {
        moveViewpoint(f - this.halfViewpointWidth, f2 - this.halfViewpointHeight);
    }

    public boolean doKeyDown(int i, KeyEvent keyEvent) {
        this.eventQueue.add(new KeyGameEvent(i, false, keyEvent));
        return true;
    }

    public boolean doKeyUp(int i, KeyEvent keyEvent) {
        this.eventQueue.add(new KeyGameEvent(i, true, keyEvent));
        return true;
    }

    public void drawAll(Canvas canvas, float f) {
        this.graphics.setCanvas(canvas);
        this.graphics.setRenderer(this.gameView.renderer);
        if (this.gotoNextLevel) {
            this.graphics.drawColor(Color.rgb(0, 0, 0));
            this.graphics.drawText("Loading..", this.halfScreenWidth, this.halfScreenHeight, this.bigTextPaint);
            return;
        }
        drawAllGame(canvas, f);
        drawAllGUI(canvas, f);
        this.graphics.endFrame();
    }

    public void drawAllGUI(Canvas canvas, float f) {
        this.interfaceEngine.draw(f);
        this.minimapHandler.draw(f);
        if (this.mission != null) {
            this.mission.draw(f);
        }
        if (this.levelComplete) {
            this.graphics.drawText("Victory!", this.halfScreenWidth, this.halfScreenHeight, this.winTextPaint);
        }
        if (this.settings.showFps) {
            this.graphics.drawText(this.lastFpsString, 25.0f, 25.0f, this.fpsPaint);
        }
        if (this.lookAroundMode) {
            this.graphics.drawText("Look Mode", this.halfScreenWidth, this.halfScreenHeight, this.bigTextPaint);
        }
    }

    public void drawAllGame(Canvas canvas, float f) {
        canvas.save();
        canvas.clipRect(this.viewpointRectUnscaled, Region.Op.REPLACE);
        if (this.viewpointRect.left < 0 || this.viewpointRect.top < 0 || this.viewpointRect.right > this.map.getWidthInPixels() || this.viewpointRect.bottom > this.map.getHeightInPixels()) {
            this.graphics.drawColor(Color.rgb(0, 0, 0));
        }
        if (this.map != null) {
            this.map.drawMain(f);
        }
        setViewpointZoom(canvas);
        canvas.clipRect(this.viewpointRect, Region.Op.REPLACE);
        this.effects.draw(f, 1);
        if (isDrawingIcons()) {
            for (int i = 0; i <= 4; i++) {
                Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
                while (it.hasNext()) {
                    GameObject next = it.next();
                    if (next.drawLayer == i && !next.drawIcon(f)) {
                        next.draw(f);
                    }
                }
            }
            Iterator<GameObject> it2 = GameObject.fastGameObjectList.iterator();
            while (it2.hasNext()) {
                it2.next().drawOver(f);
            }
        } else {
            Iterator<GameObject> it3 = GameObject.fastGameObjectList.iterator();
            while (it3.hasNext()) {
                it3.next().drawUnder(f);
            }
            Iterator<GameObject> it4 = GameObject.fastGameObjectList.iterator();
            while (it4.hasNext()) {
                it4.next().drawInterface(f);
            }
            for (int i2 = 0; i2 <= 4; i2++) {
                Iterator<GameObject> it5 = GameObject.fastGameObjectList.iterator();
                while (it5.hasNext()) {
                    GameObject next2 = it5.next();
                    if (next2.drawLayer == i2) {
                        next2.draw(f);
                    }
                }
            }
            Iterator<GameObject> it6 = GameObject.fastGameObjectList.iterator();
            while (it6.hasNext()) {
                it6.next().drawOver(f);
            }
        }
        this.effects.draw(f, 2);
        canvas.restore();
    }

    protected void finalize() throws Throwable {
        Log.e(TAG, "GameEngine:finalize()");
        super.finalize();
    }

    public String getCurrentMapFilePath() {
        return this.currentMapPath;
    }

    public GameView getGameView() {
        return this.gameView;
    }

    public boolean[] getKeyState() {
        return this.keyState;
    }

    public int getNumTouchPoints() {
        return this.gameView.currTouchPoint.getNumTouchPoints();
    }

    public MultiTouchController.PointInfo getPointInfo() {
        return this.gameView.currTouchPoint;
    }

    public GameThread getThread() {
        return this.gameThread;
    }

    public float getTouchX(int i) {
        return this.gameView.currTouchPoint.getXs()[i];
    }

    public float getTouchY(int i) {
        return this.gameView.currTouchPoint.getYs()[i];
    }

    public void init(Context context) {
        synchronized (this) {
            Log.e(TAG, "GameEngine:init()");
            if (this.inited) {
                Log.e(TAG, "GameEngine init has already been called");
            } else {
                System.gc();
                this.tempCharacterController = new CharacterController.PlayerController();
                this.settings = SettingsEngine.getInstance(context);
                this.basePaint = new Paint();
                this.fpsPaint = new Paint();
                this.fpsPaint.setARGB(255, 255, 255, 255);
                this.fpsPaint.setTextSize(16.0f);
                this.fpsPaint.setAntiAlias(true);
                this.debugPaint = new Paint();
                this.debugPaint.setARGB(100, 255, 0, 0);
                this.debugPaint.setTextSize(16.0f);
                this.debugPaint2 = new Paint();
                this.debugPaint2.setARGB(100, 0, 255, 0);
                this.debugPaint2.setTextSize(16.0f);
                this.displayTextPaint = new Paint();
                this.displayTextPaint.setTextAlign(Paint.Align.CENTER);
                this.displayTextPaint.setTextSize(16.0f);
                this.displayTextPaint.setAntiAlias(true);
                this.displayTextPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
                this.bigTextPaint = new Paint();
                this.bigTextPaint.setARGB(255, 230, 255, 230);
                this.bigTextPaint.setTextSize(18.0f);
                this.bigTextPaint.setAntiAlias(true);
                this.bigTextPaint.setTextAlign(Paint.Align.CENTER);
                this.winTextPaint = new Paint();
                this.winTextPaint.setTextSize(28.0f);
                this.winTextPaint.setAntiAlias(true);
                this.winTextPaint.setTextAlign(Paint.Align.CENTER);
                this.winTextPaint.setARGB(255, 0, 255, 0);
                this.displayTextBackgroundPaint = new Paint();
                this.displayTextBackgroundPaint.setColor(-1);
                this.displayTextBackgroundPaint.setAlpha(100);
                this.displayTextBackgroundPaintBorder = new Paint();
                this.displayTextBackgroundPaintBorder.setColor(-7829368);
                this.displayTextBackgroundPaintBorder.setAlpha(240);
                this.displayTextBackgroundPaintBorder.setStyle(Paint.Style.STROKE);
                this.displayTextBackgroundPaintBorder.setStrokeWidth(1.0f);
                AudioEngine.load();
                this.audio = new AudioEngine();
                this.audio.init(context);
                this.music = new MusicController();
                this.music.init(context);
                this.graphics = new GraphicsEngine();
                this.graphics.init(context);
                this.effects = new EffectEngine();
                this.effects.init(context);
                this.minimapHandler = new MinimapHandler();
                this.minimapHandler.init(context);
                this.path = new PathEngine();
                this.groupController = new GroupController();
                this.collision = new CollisionEngine();
                this.interfaceEngine = new InterfaceEngine();
                this.interfaceEngine.init(context);
                this.state = StateEngine.getInstance(context);
                this.network = new NetworkEngine();
                this.network.load();
                this.stats = new StatsHandler();
                this.commandController = new CommandController();
                Map.load();
                ScorchMark.load();
                Unit.loadAllUnits();
                Unit.loadSharedUnitTypeList();
                this.fadedAction = new Paint();
                this.fadedAction.setARGB(50, 255, 255, 255);
                System.gc();
                this.inited = true;
            }
        }
    }

    public boolean isDrawingIcons() {
        return !this.settings.showUnitIcons ? false : ((double) this.viewpointZoom) < 0.4d;
    }

    public boolean isMission() {
        return this.mission != null;
    }

    public boolean isNetworkGameActive() {
        return this.network == null ? false : this.network.networked;
    }

    public boolean isSurvival() {
        return this.mission != null && this.mission.survival;
    }

    public boolean isTouching() {
        return this.gameView.currTouchPoint == null ? false : this.gameView.currTouchPoint.isDown();
    }

    public void loadNewMap() {
        removeAll();
        System.gc();
        this.levelLoaded = false;
        this.lookAroundMode = false;
        this.frameNumber = 0;
        this.network.startNewLevel();
        this.levelComplete = false;
        this.levelCompleteTimer = 0.0f;
        this.gotoNextLevel = false;
        this.changeViewpointZoomTo = 1.0f;
        if (!this.network.networked) {
            this.playerTeam = new Player(0);
            new AI(1);
            new AI(2);
            new AI(3);
            new AI(4);
            new AI(5);
            new AI(6);
            new AI(7);
        } else {
            this.playerTeam = Team.getTeam(this.network.localPlayerTeamId);
            if (this.playerTeam == null) {
                throw new RuntimeException("cannot find player's team:" + this.network.localPlayerTeamId);
            }
        }
        this.mission = null;
        this.map = new Map();
        this.map.loadMap(getCurrentMapFilePath());
        if (!this.map.mapLoaded) {
            Log.d(TAG, "map did not load, returning");
            return;
        }
        moveViewpoint(0.0f, 0.0f);
        int i = 0;
        boolean z = false;
        Iterator<Unit> it = Unit.fastLiveUnitList.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            int i2 = i + 1;
            i = i2;
            if (next.team == this.playerTeam) {
                i = i2;
                if (next instanceof CommandCenter) {
                    centerViewpointAtPoint(next.x, next.y);
                    z = true;
                    i = i2;
                }
            }
        }
        if (!z) {
            Iterator<Unit> it2 = Unit.fastLiveUnitList.iterator();
            while (it2.hasNext()) {
                Unit next2 = it2.next();
                if (next2.team == this.playerTeam) {
                    centerViewpointAtPoint(next2.x, next2.y);
                }
            }
        }
        Log.d(TAG, "there are " + i + " units on this map");
        this.currentLevelState = StateEngine.getInstance(this.context).getLevelState(getCurrentMapFilePath());
        this.path.setMap(this.map);
        this.minimapHandler.setMap(this.map);
        this.commandController.clearAndSetup();
        this.music.startNew();
        this.stats.startNew();
        Object[] array = GameObject.getGameObjectList().toArray();
        Arrays.sort(array, new RenderedObject.RenderedObjectComparator());
        GameObject.getGameObjectList().clear();
        for (Object obj : array) {
            GameObject.getGameObjectList().add((GameObject) obj);
        }
        Iterator<Unit> it3 = Unit.fastLiveUnitList.iterator();
        while (it3.hasNext()) {
            Unit next3 = it3.next();
            if (next3 instanceof OrderableUnit) {
                ((OrderableUnit) next3).seeThoughFogOfWar();
            }
        }
        this.currentLevelState.attempted = true;
        this.state.saveToFile(this.context);
        this.levelTime = 0;
        this.levelLoaded = true;
        if (!this.settings.hasPlayedGameOrSeenHelp) {
            this.settings.hasPlayedGameOrSeenHelp = true;
            this.settings.save();
        }
        System.gc();
        Log.v(TAG, "getNativeHeapSize" + String.valueOf(Debug.getNativeHeapSize()));
        Log.v(TAG, "getNativeHeapAllocatedSize" + String.valueOf(Debug.getNativeHeapAllocatedSize()));
        Log.v(TAG, "getNativeHeapFreeSize" + String.valueOf(Debug.getNativeHeapFreeSize()));
        Log.v(TAG, "Runtime.getRuntime().maxMemory()" + String.valueOf(Runtime.getRuntime().maxMemory()));
        if (this.gameThread != null) {
            this.gameThread.resetDeltaTimer();
        }
        this.updateTime = 0.0f;
    }

    public void moveViewpoint(float f, float f2) {
        this.viewpointX = f;
        this.viewpointY = f2;
        this.viewpointXAsInt = (int) this.viewpointX;
        this.viewpointYAsInt = (int) this.viewpointY;
        this.viewpointX_rounded = ((int) (this.viewpointX * this.viewpointZoom)) / this.viewpointZoom;
        this.viewpointY_rounded = ((int) (this.viewpointY * this.viewpointZoom)) / this.viewpointZoom;
        this.viewpointDrawCheckGlobalRect.set((int) (this.viewpointX - 90), (int) (this.viewpointY - 90), (int) (this.viewpointX + this.viewpointWidth + 90), (int) (this.viewpointY + this.viewpointHeight + 90));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.screenWidth = i;
        this.screenHeight = i2;
        updateScreenValues();
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        this.trackPadXSpeed += motionEvent.getX();
        this.trackPadYSpeed += motionEvent.getY();
        return motionEvent.getAction() == 0 ? false : motionEvent.getAction() != 1;
    }

    public void removeAll() {
        this.gameRunning = false;
        Iterator<GameObject> it = GameObject.getGameObjectList().iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        this.music.pause();
        this.effects.removeAll();
        if (this.map != null) {
            this.map.remove();
            this.map = null;
        }
        if (this.mission != null) {
            this.mission = null;
        }
    }

    public void setKeyState(boolean[] zArr) {
        this.keyState = zArr;
    }

    public void setRunning() {
        Log.e(TAG, "Trying to start thread");
        this.music.unPause();
        if (this.gameThread == null) {
            this.gameThread = new GameThread();
            this.gameThread.setRunning(true);
            this.gameThread.start();
            this.gameThread.setPriority(10);
        }
    }

    public void setStopped() {
        Log.e(TAG, "Trying to stop thread");
        if (this.gameThread == null) {
            Log.e(TAG, "gameThread already null");
            return;
        }
        this.music.pause();
        this.gameThread.setRunning(false);
        boolean z = true;
        while (z) {
            try {
                this.gameThread.join();
                z = false;
            } catch (InterruptedException e) {
            }
        }
        Log.e(TAG, "thread stop");
        this.gameThread = null;
        if (this.doTrace) {
            Debug.stopMethodTracing();
        }
    }

    public void setUndoViewpointZoom(Canvas canvas) {
        if (this.viewpointZoom != 1.0f) {
            canvas.scale(1.0f / this.viewpointZoom, 1.0f / this.viewpointZoom);
        }
    }

    public void setViewpointZoom(Canvas canvas) {
        if (this.viewpointZoom != 1.0f) {
            canvas.scale(this.viewpointZoom, this.viewpointZoom);
        }
    }

    public void showMessageBox(String str, String str2) {
        this.pausedGame = true;
        this.nextMessageBoxTitle = str;
        this.nextMessageBoxText = str2;
        this.uiHandler.post(this.showMessageBoxRunnable);
    }

    public void stopAndClose() {
        this.gameView.inGameActivity.finish();
    }

    public void unloadAllAndFree() {
        setStopped();
        removeAll();
        gameEngine.inited = false;
        gameEngine = null;
        System.gc();
    }

    public void unloadMap() {
        setStopped();
        removeAll();
        this.levelLoaded = false;
    }

    public void updateAllGame(float f) {
        Team[] teamArr;
        this.network.updateFrameStep(f);
        this.commandController.issueCommands();
        this.frameNumber++;
        if (this.map != null) {
            this.map.update(f);
        }
        Iterator<GameObject> it = GameObject.getGameObjectList().iterator();
        while (it.hasNext()) {
            it.next().update(f);
        }
        this.checkDeadUnitCountDelay = CommonUtils.toZero(this.checkDeadUnitCountDelay, f);
        if (this.checkDeadUnitCountDelay == 0.0f) {
            this.checkDeadUnitCountDelay = 500.0f;
            int i = 0;
            Iterator<Unit> it2 = Unit.fastUnitList.iterator();
            while (it2.hasNext()) {
                if (it2.next().dead) {
                    i++;
                }
            }
            if (i > 60) {
                Iterator<GameObject> it3 = GameObject.getGameObjectList().iterator();
                while (it3.hasNext()) {
                    GameObject next = it3.next();
                    if (next instanceof Unit) {
                        Unit unit = (Unit) next;
                        if (unit.dead && unit.dead_time < this.levelTime - 30000 && i > 60) {
                            unit.remove();
                            i--;
                        }
                    }
                }
            }
        }
        for (Team team : Team.teamList) {
            if (team != null) {
                team.update(f);
            }
        }
        this.effects.update(f);
        if (this.mission != null) {
            this.mission.update(f);
        }
        this.groupController.update(f);
        this.minimapHandler.update(f);
    }

    public void updateAndDrawAll(float f, int i) {
        while (this.preUpdateRunnableQueue.peek() != null) {
            this.preUpdateRunnableQueue.poll().run();
        }
        if (!this.levelLoaded) {
            Log.e(TAG, "game running without a loaded level!!!");
            stopAndClose();
            return;
        }
        this.gameRunning = true;
        if (this.changeViewpointZoomTo != this.viewpointZoom) {
            this.viewpointZoom = this.changeViewpointZoomTo;
            updateScreenValues();
        }
        float f2 = f;
        if (f > 2.0f) {
            f2 = 2.0f;
        }
        float f3 = f2;
        if (f2 < 0.0f) {
            f3 = 0.0f;
        }
        if (this.pausedGame) {
            f3 = 0.0f;
        }
        if (this.settings.showFps) {
            this.frameSampleTime += i;
            this.frameSamplesCollected++;
            if (this.frameSamplesCollected == 10) {
                if (this.frameSampleTime == 0) {
                    this.frameSampleTime = 1;
                }
                this.lastFps = 10000 / this.frameSampleTime;
                this.frameSampleTime = 0;
                this.frameSamplesCollected = 0;
                this.lastFpsString = String.valueOf(this.lastFps) + "fps";
            }
        }
        this.levelTime += i;
        updateKeyState();
        for (int i2 = 0; i2 < this.touchActive.length; i2++) {
            this.touchActive[i2] = true;
        }
        if (this.levelComplete) {
            this.levelCompleteTimer += f3;
            if (this.levelCompleteTimer > 350.0f) {
                this.gotoNextLevel = true;
            }
        }
        this.trackPadXSpeed = CommonUtils.toZero(this.trackPadXSpeed, 0.1f * f3);
        this.trackPadYSpeed = CommonUtils.toZero(this.trackPadYSpeed, 0.1f * f3);
        this.trackPadXSpeed = CommonUtils.limit(this.trackPadXSpeed, 5.0f);
        this.trackPadYSpeed = CommonUtils.limit(this.trackPadYSpeed, 5.0f);
        this.interfaceEngine.update(f3);
        if (this.viewpointX < 0.0f) {
            this.viewpointX = 0.0f;
        }
        if (this.viewpointY < 0.0f) {
            this.viewpointY = 0.0f;
        }
        if (this.viewpointX > this.map.getWidthInPixels() - this.viewpointWidth) {
            this.viewpointX = this.map.getWidthInPixels() - this.viewpointWidth;
        }
        if (this.viewpointY > this.map.getHeightInPixels() - this.viewpointHeight) {
            this.viewpointY = this.map.getHeightInPixels() - this.viewpointHeight;
        }
        if (this.viewpointWidth > this.map.getWidthInPixels()) {
            this.viewpointX = (this.map.getWidthInPixels() / 2.0f) - (this.viewpointWidth / 2.0f);
        }
        if (this.viewpointHeight > this.map.getHeightInPixels()) {
            this.viewpointY = (this.map.getHeightInPixels() / 2.0f) - (this.viewpointHeight / 2.0f);
        }
        moveViewpoint(this.viewpointX, this.viewpointY);
        if (this.network.networked) {
            this.network.update(f3);
            if (!this.network.skipGameUpdates) {
                this.updateTime += f3;
                while (this.updateTime > 2.0f) {
                    this.updateTime -= 2.0f;
                    this.network.updateCheckFrame(2);
                    if (this.network.skipGameUpdates) {
                        break;
                    }
                    updateAllGame(2.0f);
                }
                if (!this.network.server) {
                    if (this.network.needsToSpeedUp) {
                        if (this.frameNumber > this.network.currentBlockingFrame - 6) {
                            this.network.addDebugText("we have back within frame range");
                            this.network.needsToSpeedUp = false;
                        }
                    } else if (this.frameNumber < (this.network.currentBlockingFrame - this.network.stepSize) - 10) {
                        this.network.addDebugText("we are out of frame range");
                        this.network.needsToSpeedUp = true;
                    }
                    if (this.network.needsToSpeedUp) {
                        this.network.updateCheckFrame(2);
                        if (!this.network.skipGameUpdates) {
                            updateAllGame(2.0f);
                        }
                    }
                }
            }
        } else if (!this.pausedGame) {
            updateAllGame(f3);
        }
        this.music.update(f3);
        if (this.graphics.use3d) {
            drawAll(null, f3);
            this.interfaceEngine.postUpdate(f3);
        } else {
            Canvas canvas = null;
            try {
                Canvas lockCanvas = this.gameView.getSurfaceHolder().lockCanvas();
                Canvas canvas2 = lockCanvas;
                if (this.screenshot_saver) {
                    if (this.screenshot_saver_canvas == null) {
                        for (int i3 = 0; i3 < this.screenshot_saver_runnable.length; i3++) {
                            this.screenshot_saver_runnable[i3] = new ScreenshotRunnable();
                            this.screenshot_saver_runnable[i3].bitmap = Bitmap.createBitmap(this.gameView.getWidth(), this.gameView.getHeight(), Bitmap.Config.RGB_565);
                        }
                        this.screenshot_saver_canvas = new Canvas();
                        this.screenshot_saver_nextIndex = 0;
                        this.screenshot_saver_path = "/sdcard/rds_screens/" + System.currentTimeMillis() + "/";
                        new File(this.screenshot_saver_path).mkdirs();
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    ScreenshotRunnable screenshotRunnable = this.screenshot_saver_runnable[this.screenshot_saver_nextIndex];
                    if (screenshotRunnable.thread != null && screenshotRunnable.thread.isAlive()) {
                        screenshotRunnable.thread.setPriority(10);
                    }
                    screenshotRunnable.bitmapFree();
                    log("screenshot", "bitmapFree took:" + (System.currentTimeMillis() - currentTimeMillis));
                    this.screenshot_saver_canvas.setBitmap(this.screenshot_saver_runnable[this.screenshot_saver_nextIndex].bitmap);
                    canvas2 = this.screenshot_saver_canvas;
                } else {
                    this.screenshot_saver_canvas = null;
                }
                drawAll(canvas2, f3);
                this.interfaceEngine.postUpdate(f3);
                if (this.screenshot_saver) {
                    ScreenshotRunnable screenshotRunnable2 = this.screenshot_saver_runnable[this.screenshot_saver_nextIndex];
                    screenshotRunnable2.frame = this.frameNumber;
                    screenshotRunnable2.thread = new Thread(screenshotRunnable2);
                    screenshotRunnable2.thread.start();
                    lockCanvas.drawBitmap(screenshotRunnable2.bitmap, 0.0f, 0.0f, (Paint) null);
                    this.screenshot_saver_nextIndex++;
                    if (this.screenshot_saver_nextIndex >= this.screenshot_saver_runnable.length) {
                        canvas = lockCanvas;
                        this.screenshot_saver_nextIndex = 0;
                    }
                }
                if (lockCanvas != null) {
                    this.gameView.getSurfaceHolder().unlockCanvasAndPost(lockCanvas);
                }
            } catch (Throwable th) {
                if (canvas != null) {
                    this.gameView.getSurfaceHolder().unlockCanvasAndPost(canvas);
                }
                throw th;
            }
        }
        if (this.gotoNextLevel) {
            this.gotoNextLevel = false;
            String str = null;
            if (getMapLevel(this.currentMapPath) != null) {
                str = getNextMapLevel(this.currentMapPath);
            }
            if (str != null) {
                this.currentMapPath = str;
                loadNewMap();
            } else {
                this.levelLoaded = false;
                this.gameView.inGameActivity.finish();
            }
        }
        if (this.doTrace && !this.traceActive) {
            Debug.startMethodTracing("lukeTrace", 21000000);
            this.traceActive = true;
        }
    }

    void updateKeyState() {
        while (true) {
            GameEvent poll = this.eventQueue.poll();
            if (poll != null) {
                if (poll instanceof KeyGameEvent) {
                    KeyGameEvent keyGameEvent = (KeyGameEvent) poll;
                    this.keyState[keyGameEvent.keyCode] = !keyGameEvent.up;
                    this.keyStatePressed[keyGameEvent.keyCode] = !keyGameEvent.up;
                }
            } else {
                return;
            }
        }
    }

    public void updateScreenValues() {
        this.halfScreenWidth = this.screenWidth / 2.0f;
        this.halfScreenHeight = this.screenHeight / 2.0f;
        this.sidebarWidth = (int) (this.screenHeight / 3.0f);
        this.sidebarWidth = CommonUtils.limit(this.sidebarWidth, 60.0f, 250.0f);
        float f = this.viewpointX;
        float f2 = this.halfViewpointWidth;
        float f3 = this.viewpointY;
        float f4 = this.halfViewpointHeight;
        this.viewpointWidthUnscaled = (this.screenWidth - this.sidebarWidth) + 1.0f;
        this.viewpointHeightUnscaled = this.screenHeight;
        this.viewpointWidth = this.viewpointWidthUnscaled / this.viewpointZoom;
        this.viewpointHeight = this.viewpointHeightUnscaled / this.viewpointZoom;
        this.halfViewpointWidth = this.viewpointWidth / 2.0f;
        this.halfViewpointHeight = this.viewpointHeight / 2.0f;
        this.viewpointRectUnscaled.set(0, 0, (int) this.viewpointWidthUnscaled, (int) this.viewpointHeightUnscaled);
        this.viewpointRect.set(0, 0, ((int) this.viewpointWidth) + 1, ((int) this.viewpointHeight) + 1);
        this.viewpointRectF.set(0.0f, 0.0f, this.viewpointWidth + 1.0f, this.viewpointHeight + 1.0f);
        moveViewpoint((f + f2) - this.halfViewpointWidth, (f3 + f4) - this.halfViewpointHeight);
    }

    public boolean wasKeyPressed(int i) {
        boolean z;
        if (!this.keyState[i] || !this.keyStatePressed[i]) {
            z = false;
        } else {
            this.keyStatePressed[i] = false;
            z = true;
        }
        return z;
    }
}
