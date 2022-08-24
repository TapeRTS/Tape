package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.p003os.Handler;
import android.p003os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC1063s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;

/* renamed from: com.corrodinggames.rts.appFramework.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g.class */
public class ActivityC0097g extends ActivityC0089b {

    /* renamed from: c */
    InterfaceC0096f f438c;

    /* renamed from: e */
    ProgressDialog f439e;

    /* renamed from: d */
    final Handler f440d = new Handler(Looper.m7145b());

    /* renamed from: f */
    boolean f441f = true;

    /* renamed from: a */
    static /* synthetic */ void m6946a(ActivityC0097g activityC0097g, String str) {
        activityC0097g.m6939f(str);
    }

    /* renamed from: b */
    static /* synthetic */ void m6944b(ActivityC0097g activityC0097g, String str) {
        activityC0097g.m6940e(str);
    }

    /* renamed from: a */
    static /* synthetic */ void m6947a(ActivityC0097g activityC0097g) {
        activityC0097g.m6936n();
    }

    /* renamed from: b */
    public void mo6929b() {
        GameEngine.PrintLog("IngameActivity: finish");
        super.mo6929b();
        C0090c.m6979a((Activity) this, true);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C0090c.m6978a((Activity) this, false, true);
        }
        this.f438c.mo6964a(z);
    }

    /* renamed from: a */
    public boolean mo7358a(Menu menu) {
        super.mo7358a(menu);
        menu.clear();
        GameEngine gameEngine = GameEngine.getInstance();
        menu.add(0, 12, 0, C0820a.m1886a("menus.ingame.save", new Object[0])).setIcon(17301582);
        if (gameEngine.f6094bv && !GameEngine.f6204aZ) {
            menu.add(0, 18, 0, C0820a.m1886a("menus.ingame.exportMap", new Object[0])).setIcon(17301582);
        }
        menu.add(0, 2, 0, C0820a.m1886a("menus.ingame.settings", new Object[0])).setIcon(17301577);
        if (!gameEngine.m1222M()) {
        }
        if (gameEngine.f6120cb != null && gameEngine.f6120cb.m2635h()) {
            menu.add(0, 22, 0, C0820a.m1886a("menus.ingame.hideInterface", new Object[0])).setIcon(17301584);
        }
        if (gameEngine.m1222M()) {
            menu.add(0, 13, 0, C0820a.m1886a("menus.ingame.chat", new Object[0])).setIcon(17301584);
            menu.add(0, 14, 0, C0820a.m1886a("menus.ingame.players", new Object[0])).setIcon(17301661);
            if (gameEngine.networkEngine.f5485C && C1058a.m786a().m778e()) {
                menu.add(0, 17, 0, C0820a.m1886a("menus.ingame.steam_reinvite", new Object[0])).setIcon(17301584);
            }
            boolean z = false;
            if (gameEngine.f6093bs != null && gameEngine.f6093bs.f1329F) {
                z = true;
            }
            if (!z && !gameEngine.f6261dp) {
                menu.add(0, 19, 0, C0820a.m1886a("menus.ingame.surrender", new Object[0])).setIcon(17301552);
            }
            if (!gameEngine.networkEngine.f5485C) {
                menu.add(0, 10, 0, C0820a.m1886a("menus.ingame.disconnect", new Object[0])).setIcon(17301552);
            } else {
                menu.add(0, 10, 0, C0820a.m1886a("menus.ingame.exitGame", new Object[0])).setIcon(17301552);
            }
        } else {
            if (gameEngine.f6123ce != null && gameEngine.f6123ce.f6659h != null) {
                menu.add(0, 11, 0, C0820a.m1886a("menus.ingame.briefing", new Object[0])).setIcon(17301659);
            }
            menu.add(0, 15, 0, C0820a.m1886a("menus.ingame.exitGame", new Object[0])).setIcon(17301552);
        }
        if (gameEngine != null && gameEngine.f6109bQ.allowGameRecording) {
            if (!gameEngine.f6228bo) {
                menu.add(0, 9, 0, "Start Recording");
                return true;
            }
            menu.add(0, 9, 0, "Stop Recording");
            return true;
        }
        return true;
    }

    /* renamed from: c */
    public void m6943c(int i) {
        GameEngine.PrintLog("outer selectMenuOption: " + i);
        this.f440d.m7155a(new RunnableC00981(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$1.class */
    public class RunnableC00981 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f442a;

        RunnableC00981(int i) {
            this.f442a = i;
        }

        public void run() {
            GameEngine.PrintLog("inner selectMenuOption: " + this.f442a);
            ActivityC0097g.this.m6942d(this.f442a);
        }
    }

    /* renamed from: d */
    public void m6942d(int i) {
        switch (i) {
            case 2:
                m7360a(new Intent(m7354k(), ActivityC0133s.class), 0);
                return;
            case 3:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Skip?").setMessage("Are you sure you want to skip this level?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC01159()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 4:
                GameEngine.getInstance().f6239cg = !GameEngine.getInstance().f6239cg;
                return;
            case 5:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Restart?").setMessage("Are you sure you want to restart this level?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC009910()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 6:
                GameEngine gameEngine = GameEngine.getInstance();
                gameEngine.f6225bl = !gameEngine.f6225bl;
                return;
            case 7:
            case 8:
            case 17:
            default:
                return;
            case 9:
                GameEngine gameEngine2 = GameEngine.getInstance();
                if (!gameEngine2.f6228bo) {
                    gameEngine2.f6228bo = true;
                    return;
                } else {
                    gameEngine2.f6228bo = false;
                    return;
                }
            case 10:
                GameEngine gameEngine3 = GameEngine.getInstance();
                String m1886a = C0820a.m1886a("menus.ingame.multiplayerClose.titleDisconnect", new Object[0]);
                String m1886a2 = C0820a.m1886a("menus.ingame.multiplayerClose.messageDisconnect", new Object[0]);
                String m1886a3 = C0820a.m1886a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]);
                if (gameEngine3.networkEngine.f5485C) {
                    m1886a = C0820a.m1886a("menus.ingame.multiplayerClose.title", new Object[0]);
                    m1886a2 = C0820a.m1886a("menus.ingame.multiplayerClose.messageEndGame", new Object[0]);
                    m1886a3 = C0820a.m1886a("menus.ingame.exitGame", new Object[0]);
                }
                AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setIcon(17301543).setTitle(m1886a).setMessage(m1886a2).setPositiveButton(m1886a3, new DialogInterface$OnClickListenerC010213()).setNegativeButton(C0820a.m1886a("menus.common.back", new Object[0]), (DialogInterface.OnClickListener) null);
                if (gameEngine3.networkEngine.f5485C) {
                    negativeButton.setNeutralButton(C0820a.m1886a("menus.ingame.multiplayerClose.returnToBattleroom", new Object[0]), new DialogInterface$OnClickListenerC010314());
                }
                negativeButton.show();
                return;
            case 11:
                GameEngine gameEngine4 = GameEngine.getInstance();
                if (gameEngine4.f6123ce != null && gameEngine4.f6123ce.f6659h != null) {
                    gameEngine4.m1191a("Briefing", gameEngine4.f6123ce.f6659h);
                    return;
                }
                return;
            case 12:
                RunnableC010011 runnableC010011 = new RunnableC010011(this);
                if (!C0090c.m6981a(this, runnableC010011)) {
                    runnableC010011.run();
                    return;
                }
                return;
            case 13:
                m6945a(false);
                return;
            case 14:
                GameEngine gameEngine5 = GameEngine.getInstance();
                if (gameEngine5.networkEngine != null) {
                    gameEngine5.networkEngine.m1795H();
                    return;
                }
                return;
            case 15:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Exit?").setMessage("Are you sure you want to exit this game?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC010415()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 16:
                m6945a(true);
                return;
            case 18:
                if (C0090c.m6973b((Activity) this)) {
                    m6940e(null);
                    return;
                }
                return;
            case 19:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Disconnect?").setMessage("Are you sure you want to surrender this game?").setPositiveButton("Surrender", new DialogInterface$OnClickListenerC010112()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 20:
                mo6929b();
                return;
            case 21:
                mo6929b();
                ActivityC0122n.m6910o();
                ActivityC0122n.m6912m();
                return;
            case 22:
                GameEngine gameEngine6 = GameEngine.getInstance();
                gameEngine6.f6155cT = true;
                gameEngine6.f6111bS.f5201p = false;
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$9.class */
    public class DialogInterface$OnClickListenerC01159 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC01159() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GameEngine.getInstance().f6265dt = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$10.class */
    public class DialogInterface$OnClickListenerC009910 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC009910() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.m1224K();
            gameEngine.m1184a(true, EnumC1063s.f6734b);
            gameEngine.m1226I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$11.class */
    public class RunnableC010011 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f445a;

        RunnableC010011(Activity activity) {
            this.f445a = activity;
        }

        public void run() {
            if (C0090c.m6973b(this.f445a)) {
                ActivityC0097g.m6946a(ActivityC0097g.this, (String) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$12.class */
    public class DialogInterface$OnClickListenerC010112 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC010112() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GameEngine.getInstance().networkEngine.m1628m("-surrender");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$13.class */
    public class DialogInterface$OnClickListenerC010213 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC010213() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GameEngine.getInstance().networkEngine.m1690b("exited");
            ActivityC0097g.this.mo6929b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$14 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$14.class */
    public class DialogInterface$OnClickListenerC010314 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC010314() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GameEngine.PrintLog("Returning to battleroom clicked.");
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.networkEngine.m1722ag();
            gameEngine.f6111bS.f5201p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$15 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$15.class */
    public class DialogInterface$OnClickListenerC010415 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC010415() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ActivityC0097g.this.mo6929b();
        }
    }

    /* renamed from: a */
    private void m6945a(boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (!z) {
            builder.setTitle("Send Message");
        } else {
            builder.setTitle("Send Team Message");
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.alert_chat, (ViewGroup) null);
        builder.setView(inflate);
        TextView textView = (TextView) inflate.findViewById(R.C0068id.chat_messages);
        EditText editText = (EditText) inflate.findViewById(R.C0068id.chat_text);
        textView.setText(gameEngine.networkEngine.f5599aS.m1817a());
        editText.setText(VariableScope.nullOrMissingString);
        editText.requestFocus();
        builder.setPositiveButton(z ? "Send Team" : "Send", new DialogInterface$OnClickListenerC010516(editText, z));
        builder.setNeutralButton("Send & Ping Map", new DialogInterface$OnClickListenerC01062(editText, z));
        builder.setNegativeButton("Cancel", new DialogInterface$OnClickListenerC01073());
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$16 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$16.class */
    public class DialogInterface$OnClickListenerC010516 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f451a;

        /* renamed from: b */
        final /* synthetic */ boolean f452b;

        DialogInterface$OnClickListenerC010516(EditText editText, boolean z) {
            this.f451a = editText;
            this.f452b = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f451a.getText().toString();
            GameEngine gameEngine = GameEngine.getInstance();
            if (!obj.trim().equals(VariableScope.nullOrMissingString)) {
                if (this.f452b) {
                    gameEngine.networkEngine.m1630l(obj);
                } else {
                    gameEngine.networkEngine.m1628m(obj);
                }
            }
            gameEngine.f6111bS.f5201p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$2.class */
    public class DialogInterface$OnClickListenerC01062 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f454a;

        /* renamed from: b */
        final /* synthetic */ boolean f455b;

        DialogInterface$OnClickListenerC01062(EditText editText, boolean z) {
            this.f454a = editText;
            this.f455b = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f454a.getText().toString();
            GameEngine gameEngine = GameEngine.getInstance();
            if (!obj.trim().equals(VariableScope.nullOrMissingString)) {
                if (this.f455b) {
                    gameEngine.networkEngine.m1630l(obj);
                } else {
                    gameEngine.networkEngine.m1628m(obj);
                }
            }
            gameEngine.f6111bS.f5201p = false;
            gameEngine.f6111bS.m2071H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$3.class */
    public class DialogInterface$OnClickListenerC01073 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC01073() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: e */
    private void m6940e(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Export Map");
        builder.setMessage("Enter a name to export the map as");
        EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(("New " + gameEngine.m1167ak() + " (" + CommonUtils.m2336a("d MMM yyyy").replace(".", VariableScope.nullOrMissingString) + " " + CommonUtils.m2336a("HH.mm.ss") + ")").replace("  ", " "));
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC01084(editText, gameEngine));
        builder.setNegativeButton("Cancel", new DialogInterface$OnClickListenerC01105());
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$4.class */
    public class DialogInterface$OnClickListenerC01084 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f458a;

        /* renamed from: b */
        final /* synthetic */ GameEngine f459b;

        DialogInterface$OnClickListenerC01084(EditText editText, GameEngine gameEngine) {
            this.f458a = editText;
            this.f459b = gameEngine;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f458a.getText().toString();
            if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityC0097g.this);
                builder.setTitle("Bad Map Name");
                builder.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC01091(obj));
                builder.show();
                return;
            }
            this.f459b.f6104bL.m6627a(this.f459b.f6159dk, "/SD/rustedWarfare/maps/" + obj + ".tmx");
        }

        /* renamed from: com.corrodinggames.rts.appFramework.g$4$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$4$1.class */
        class DialogInterface$OnClickListenerC01091 implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f461a;

            DialogInterface$OnClickListenerC01091(String str) {
                this.f461a = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityC0097g.m6944b(ActivityC0097g.this, this.f461a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$5.class */
    public class DialogInterface$OnClickListenerC01105 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC01105() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: f */
    private void m6939f(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Save Game");
        builder.setMessage("Enter a name to save the game under");
        EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(gameEngine.m1167ak() + " (" + CommonUtils.m2336a("d MMM yyyy").replace(".", VariableScope.nullOrMissingString) + " " + CommonUtils.m2336a("HH.mm.ss") + ")");
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC01116(editText));
        builder.setNegativeButton("Cancel", new DialogInterface$OnClickListenerC01137());
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$6.class */
    public class DialogInterface$OnClickListenerC01116 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f464a;

        DialogInterface$OnClickListenerC01116(EditText editText) {
            this.f464a = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f464a.getText().toString();
            if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityC0097g.this);
                builder.setTitle("Bad Save Name");
                builder.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC01121(obj));
                builder.show();
                return;
            }
            ActivityC0097g.this.m6941d(obj);
        }

        /* renamed from: com.corrodinggames.rts.appFramework.g$6$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$6$1.class */
        class DialogInterface$OnClickListenerC01121 implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f466a;

            DialogInterface$OnClickListenerC01121(String str) {
                this.f466a = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityC0097g.m6946a(ActivityC0097g.this, this.f466a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$7.class */
    public class DialogInterface$OnClickListenerC01137 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC01137() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: d */
    public void m6941d(String str) {
        m7363a(0);
        RunnableC0116h runnableC0116h = new RunnableC0116h(this);
        runnableC0116h.f471a = str;
        new Thread(runnableC0116h).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$8.class */
    public class RunnableC01148 implements Runnable {
        RunnableC01148() {
        }

        public void run() {
            ActivityC0097g.m6947a(ActivityC0097g.this);
        }
    }

    /* renamed from: l */
    public void m6938l() {
        this.f440d.m7155a(new RunnableC01148());
    }

    /* renamed from: n */
    private void m6936n() {
        try {
            mo7353a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.corrodinggames.rts")));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(mo7344g(), "Failed to open Android Market", 0).show();
        }
    }

    /* renamed from: m */
    public void m6937m() {
    }
}
