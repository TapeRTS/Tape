package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.p003os.Handler;
import android.p003os.Looper;
import android.support.p004v4.app.ActivityCompat;
import android.support.p004v4.content.ContextCompat;
import android.widget.Toast;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.appFramework.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/c.class */
public class C0090c {

    /* renamed from: a */
    static Handler f421a;

    /* renamed from: b */
    static volatile Context f422b;

    /* renamed from: c */
    public static final EnumC0095e f423c = EnumC0095e.dynamicDefault;

    /* renamed from: d */
    public static EnumC0095e f424d = f423c;

    /* renamed from: a */
    public static int m6974a(String str) {
        String[] split;
        String str2 = null;
        if (str != null) {
            str2 = CommonUtils.m2244k(str);
        }
        if (str2 != null) {
            Matcher matcher = Pattern.compile("^ *\\[([^\\]]*)\\].*").matcher(str2);
            if (matcher.matches()) {
                for (String str3 : matcher.group(1).split(";")) {
                    if (str3.startsWith("p") && str3.length() >= 2) {
                        String substring = str3.substring(1);
                        try {
                            return Integer.parseInt(substring);
                        } catch (NumberFormatException e) {
                            GameEngine.PrintLog("getNumberOfPlayersInMap: NumberFormatException:" + substring);
                            return -1;
                        }
                    }
                }
            }
        }
        GameEngine.PrintLog("getNumberOfPlayersInMap: fail to match:" + str2);
        return -1;
    }

    /* renamed from: b */
    public static String m6971b(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(File.separator)) {
            String[] split = str.split(Pattern.quote(File.separator));
            str = split[split.length - 1];
        }
        if (str.contains("/")) {
            String[] split2 = str.split("/");
            str = split2[split2.length - 1];
        }
        String str2 = null;
        if (0 == 0) {
            Matcher matcher = Pattern.compile("^l\\d*;\\[.*\\](.+)\\.tmx").matcher(str);
            if (matcher.matches()) {
                str2 = matcher.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher2 = Pattern.compile("^l\\d*;(.+)\\.tmx").matcher(str);
            if (matcher2.matches()) {
                str2 = matcher2.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher3 = Pattern.compile("^ *\\[.*\\](.+)\\.tmx").matcher(str);
            if (matcher3.matches()) {
                str2 = matcher3.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher4 = Pattern.compile("(.*)\\.tmx").matcher(str);
            if (matcher4.matches()) {
                str2 = matcher4.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            str2 = str;
        }
        String replace = str2.replace('_', ' ');
        if (replace.endsWith(".rwsave")) {
            replace = replace.replace(".rwsave", VariableScope.nullOrMissingString);
        }
        return replace;
    }

    /* renamed from: c */
    public static String m6969c(String str) {
        return str.replace(".tmx", VariableScope.nullOrMissingString) + "_map.png";
    }

    /* renamed from: c */
    private static void m6970c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            activity.m7364a().getDecorView().setSystemUiVisibility(5894);
        }
    }

    /* renamed from: d */
    private static void m6968d(Activity activity) {
    }

    /* renamed from: a */
    public static void m6975a(Runnable runnable) {
        if (f421a == null) {
            f421a = new Handler(Looper.m7145b());
        }
        f421a.m7155a(runnable);
    }

    /* renamed from: a */
    public static Context m6984a() {
        if (f422b == null) {
            throw new RuntimeException("ApplicationContext==null");
        }
        return f422b;
    }

    /* renamed from: a */
    public static void m6983a(Activity activity) {
        if (f422b == null) {
            f422b = activity.mo7344g();
        }
    }

    /* renamed from: a */
    public static void m6977a(Context context) {
        if (f422b == null) {
            f422b = context.mo7344g();
        }
    }

    /* renamed from: a */
    public static void m6978a(Activity activity, boolean z, boolean z2) {
        m6983a(activity);
        if (z2) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine != null && gameEngine.f6109bQ.immersiveFullScreen) {
                m6970c(activity);
            }
        } else {
            m6968d(activity);
        }
        GameEngine gameEngine2 = GameEngine.getInstance();
        if (gameEngine2 != null) {
            gameEngine2.m1177aa();
        }
        if (z) {
            activity.m7364a().setBackgroundDrawable(null);
        }
    }

    /* renamed from: a */
    public static void m6979a(Activity activity, boolean z) {
        if (z) {
            activity.m7362a(0, 0);
        }
    }

    /* renamed from: a */
    public static boolean m6981a(Activity activity, Runnable runnable) {
        GameEngine.getInstance();
        if (m6980a(activity, runnable, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m6980a(Activity activity, Runnable runnable, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if ((!z && gameEngine.f6109bQ.hasSelectedAStorageType) || Build.VERSION.SDK_INT < 19) {
            return false;
        }
        DialogInterface$OnClickListenerC00911 dialogInterface$OnClickListenerC00911 = new DialogInterface$OnClickListenerC00911(gameEngine, runnable);
        DialogInterface$OnClickListenerC00922 dialogInterface$OnClickListenerC00922 = new DialogInterface$OnClickListenerC00922(activity, gameEngine, runnable);
        String m1886a = C0820a.m1886a("menus.mods.androidStorageSetupTitle", new Object[0]);
        String m1886a2 = C0820a.m1886a("menus.mods.androidStorageSetupMessage", new Object[0]);
        String m1886a3 = C0820a.m1886a("menus.mods.androidStorageSetupInternal", new Object[0]);
        new AlertDialog.Builder(activity).setIcon(17301543).setTitle(m1886a).setMessage(m1886a2).setPositiveButton(m1886a3, dialogInterface$OnClickListenerC00911).setNeutralButton(C0820a.m1886a("menus.mods.androidStorageSetupExternal", new Object[0]), dialogInterface$OnClickListenerC00922).show();
        GameEngine.PrintLog("Showing storage setup");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.c$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/c$1.class */
    public final class DialogInterface$OnClickListenerC00911 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GameEngine f425a;

        /* renamed from: b */
        final /* synthetic */ Runnable f426b;

        DialogInterface$OnClickListenerC00911(GameEngine gameEngine, Runnable runnable) {
            this.f425a = gameEngine;
            this.f426b = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f425a.f6109bQ.storageType = 1;
            this.f425a.f6109bQ.hasSelectedAStorageType = true;
            C0750a.m2458b();
            this.f425a.f6109bQ.save();
            if (this.f426b != null) {
                this.f426b.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.c$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/c$2.class */
    public final class DialogInterface$OnClickListenerC00922 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f427a;

        /* renamed from: b */
        final /* synthetic */ GameEngine f428b;

        /* renamed from: c */
        final /* synthetic */ Runnable f429c;

        DialogInterface$OnClickListenerC00922(Activity activity, GameEngine gameEngine, Runnable runnable) {
            this.f427a = activity;
            this.f428b = gameEngine;
            this.f429c = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!C0750a.m2459a(true).f4865b) {
                GameEngine.PrintLog("Storage setup: Not using SAF, not showing setup folder popup");
                if (C0090c.m6973b(this.f427a)) {
                    this.f428b.f6109bQ.storageType = 2;
                    this.f428b.f6109bQ.hasSelectedAStorageType = true;
                    C0750a.m2458b();
                    this.f428b.f6109bQ.save();
                }
            } else if (this.f427a instanceof ActivityC0133s) {
                GameEngine.PrintLog("Storage setup: Already on settings page");
                ((ActivityC0133s) this.f427a).m6896l();
            } else {
                Intent intent = new Intent(this.f427a, ActivityC0133s.class);
                intent.putExtra("mode", "setupExternalFolder");
                C0090c.m6976a(intent);
                this.f427a.mo7353a(intent);
                if (this.f427a instanceof ActivityC0089b) {
                    if (this.f429c != null) {
                        ((ActivityC0089b) this.f427a).m6985a(new RunnableC00931());
                        return;
                    }
                    return;
                }
                GameEngine.m1145b("context not instance CommonActivity");
            }
        }

        /* renamed from: com.corrodinggames.rts.appFramework.c$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/c$2$1.class */
        class RunnableC00931 implements Runnable {
            RunnableC00931() {
            }

            public void run() {
                if (DialogInterface$OnClickListenerC00922.this.f428b.f6109bQ.hasSelectedAStorageType) {
                    DialogInterface$OnClickListenerC00922.this.f429c.run();
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m6972b(Context context) {
        if (GameEngine.f6199aU || !C0750a.m2446f() || Build.VERSION.SDK_INT < 23 || ContextCompat.m7117a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m6973b(Activity activity) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!GameEngine.f6199aU && C0750a.m2446f() && Build.VERSION.SDK_INT >= 23) {
            if (gameEngine.m1180aC() == null) {
            }
            if (ContextCompat.m7117a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                gameEngine.f6109bQ.hadStoragePermissionInPast = true;
                GameEngine.PrintLog("File Permission is granted");
                return true;
            }
            GameEngine.PrintLog("Permission is revoked");
            ActivityCompat.m7118a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m6976a(Intent intent) {
        intent.addFlags(65536);
    }

    /* renamed from: a */
    public static void m6982a(Activity activity, int i, boolean z, String str, Uri uri) {
        GameEngine.PrintLog("Show folder chooser. Write:" + z);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(64);
        intent.addFlags(1);
        if (z) {
            intent.addFlags(2);
        }
        if (uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        try {
            activity.m7360a(Intent.createChooser(intent, str), i);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(activity, "Failed to open file list. Please install a File Manager.", 0).show();
        }
    }
}
