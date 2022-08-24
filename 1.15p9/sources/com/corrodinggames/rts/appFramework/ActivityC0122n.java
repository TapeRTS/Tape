package com.corrodinggames.rts.appFramework;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.p003os.Handler;
import android.p003os.Message;
import android.text.Spanned;
import android.widget.EditText;
import android.widget.TextView;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.EnumC1063s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0841ae;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.appFramework.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n.class */
public class ActivityC0122n extends ActivityC0089b {

    /* renamed from: c */
    public static ActivityC0122n f513c;

    /* renamed from: d */
    boolean f514d;

    /* renamed from: e */
    final Handler f515e;

    /* renamed from: f */
    public static boolean f516f = false;

    /* renamed from: g */
    public boolean f517g;

    /* renamed from: h */
    TextView f518h;

    /* renamed from: k */
    private Handler f519k;

    /* renamed from: l */
    private Runnable f520l;

    /* renamed from: m */
    private Runnable f521m;

    /* renamed from: i */
    static C0841ae f522i;

    /* renamed from: j */
    static AlertDialog f523j;

    /* renamed from: l */
    public static boolean m6913l() {
        if (f513c == null) {
            return false;
        }
        return f513c.f517g;
    }

    /* renamed from: m */
    public static void m6912m() {
        if (f513c != null) {
            f513c.f515e.m7155a(new RunnableC01231());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$1.class */
    public final class RunnableC01231 implements Runnable {
        RunnableC01231() {
        }

        public void run() {
            ActivityC0122n.this.m6911n();
        }
    }

    /* renamed from: d */
    public static void m6914d(String str) {
        ActivityC0122n activityC0122n = f513c;
        if (activityC0122n == null) {
            return;
        }
        Message m7159a = activityC0122n.f519k.m7159a();
        m7159a.m7133d().putString("text", str);
        activityC0122n.f519k.m7151c(m7159a);
    }

    /* renamed from: n */
    void m6911n() {
        if (!this.f514d) {
            GameEngine.m1145b("addMessageToChatLogInternal: !onCreateFinished");
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        Spanned m1811b = gameEngine.networkEngine.f5599aS.m1811b(true);
        if (this.f518h == null) {
            throw new RuntimeException("chatLog==null");
        }
        if (m1811b == null) {
            throw new RuntimeException("chatLogHTML==null");
        }
        try {
            this.f518h.clearFocus();
            this.f518h.setTextKeepState(m1811b);
        } catch (NullPointerException e) {
            GameEngine.m1188a("chatLog.setText error", (Throwable) e);
            gameEngine.m1192a("chatLog.setText error", 1);
        }
    }

    /* renamed from: a */
    public static void m6915a(String str, String str2) {
        if (f513c != null) {
            f513c.f515e.m7155a(new RunnableC01242(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$2.class */
    public final class RunnableC01242 implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f526b;

        RunnableC01242(String str) {
            this.f526b = str;
        }

        public void run() {
            ActivityC0122n.this.mo6929b();
            if (this.f526b != null) {
            }
        }
    }

    /* renamed from: o */
    public static void m6910o() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine != null) {
            gameEngine.networkEngine.m1788O();
            gameEngine.networkEngine.f5556d.mo426c();
        }
        if (GameEngine.f6199aU) {
            return;
        }
        if (gameEngine.networkEngine != null && gameEngine.networkEngine.f5533bm) {
            return;
        }
        if (f513c != null) {
            f513c.f515e.m7155a(f513c.f520l);
        } else {
            GameEngine.m1145b("MultiplayerBattleroomActivity:updateUI() lastLoaded==null");
        }
    }

    /* renamed from: p */
    public static void m6909p() {
        if (f513c != null) {
            f513c.f515e.m7155a(f513c.f521m);
            f516f = false;
            return;
        }
        GameEngine.m1145b("MultiplayerBattleroomActivity:startGame() lastLoaded==null");
        GameEngine.m1216S();
        f516f = true;
    }

    /* renamed from: q */
    public static void m6908q() {
        C0128o c0128o = new C0128o("Starting unit count");
        C0128o c0128o2 = new C0128o("Total unit HP");
        C0128o c0128o3 = new C0128o("Team Credits");
        Iterator it = Team.m6358c().iterator();
        while (it.hasNext()) {
            Team team = (Team) it.next();
            int i = 0;
            int i2 = 0;
            Unit[] m523a = Unit.f1589bD.m523a();
            int size = Unit.f1589bD.size();
            for (int i3 = 0; i3 < size; i3++) {
                Unit unit = m523a[i3];
                if (unit.team == team) {
                    i++;
                    i2 = (int) (i2 + unit.f1631cs);
                }
            }
            if (i != 0) {
                c0128o.m6905a(team, i);
                c0128o2.m6905a(team, i2);
                c0128o3.m6905a(team, (int) team.f1309o);
            }
        }
        if (!c0128o.m6906a()) {
            c0128o2.m6906a();
        }
        c0128o3.m6906a();
    }

    /* renamed from: r */
    public static void m6907r() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6160dl = null;
        if (gameEngine.networkEngine.f5597aO.f5648a == EnumC0846ai.f5665c) {
            if (!gameEngine.networkEngine.f5485C) {
                gameEngine.f6119ca.m452a(gameEngine.networkEngine.f5518aQ, true, false, false);
                gameEngine.f6111bS.f5107e.m1952a(null, "Note: Game was started from a saved game.");
            } else {
                gameEngine.f6119ca.m442c(gameEngine.networkEngine.f5597aO.f5649b, true);
            }
            m6908q();
        } else if (gameEngine.networkEngine.f5597aO.f5648a == EnumC0846ai.f5664b) {
            if (!gameEngine.networkEngine.f5485C) {
                gameEngine.f6159dk = VariableScope.nullOrMissingString;
                gameEngine.f6160dl = gameEngine.networkEngine.f5519aR;
                gameEngine.m1184a(true, EnumC1063s.f6734b);
                gameEngine.f6111bS.f5107e.m1952a(null, "Note: Game was started from a custom map on server.");
            } else {
                gameEngine.f6159dk = gameEngine.networkEngine.f5598aP;
                gameEngine.m1184a(true, EnumC1063s.f6734b);
            }
            m6908q();
        } else {
            gameEngine.f6159dk = gameEngine.networkEngine.f5598aP;
            gameEngine.m1184a(true, EnumC1063s.f6734b);
        }
    }

    /* renamed from: a */
    public static void m6916a(C0841ae c0841ae) {
        AlertDialog.Builder builder = new AlertDialog.Builder(GameEngine.getInstance().m1180aC());
        String str = "Password Required";
        String str2 = "This server requires a password to join";
        if (c0841ae.f5635b != null) {
            str = "Server Question";
            str2 = C0820a.m1882c(c0841ae.f5635b);
        }
        if (c0841ae.f5638e != null) {
            str = c0841ae.f5638e;
        }
        builder.setTitle(str);
        builder.setMessage(str2);
        EditText editText = new EditText(builder.getContext());
        builder.setView(editText);
        if (c0841ae.f5635b != null) {
            editText.setHint("Enter text...");
        } else {
            editText.setHint("Enter password...");
        }
        builder.setPositiveButton(c0841ae.f5639f != null ? c0841ae.f5639f : "Submit", new DialogInterface$OnClickListenerC01253(editText, c0841ae));
        builder.setNegativeButton(c0841ae.f5640g != null ? c0841ae.f5640g : "Disconnect", new DialogInterface$OnClickListenerC01264(c0841ae));
        builder.setOnCancelListener(new DialogInterface$OnCancelListenerC01275(c0841ae));
        AlertDialog alertDialog = f523j;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        AlertDialog show = builder.show();
        f522i = c0841ae;
        f523j = show;
        editText.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$3.class */
    public final class DialogInterface$OnClickListenerC01253 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f527a;

        /* renamed from: b */
        final /* synthetic */ C0841ae f528b;

        DialogInterface$OnClickListenerC01253(EditText editText, C0841ae c0841ae) {
            this.f527a = editText;
            this.f528b = c0841ae;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f528b.m1605a(this.f527a.getText().toString());
            ActivityC0122n.f522i = null;
            ActivityC0122n.f523j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$4.class */
    public final class DialogInterface$OnClickListenerC01264 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0841ae f529a;

        DialogInterface$OnClickListenerC01264(C0841ae c0841ae) {
            this.f529a = c0841ae;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f529a.m1606a();
            ActivityC0122n.f522i = null;
            ActivityC0122n.f523j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$5.class */
    public final class DialogInterface$OnCancelListenerC01275 implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C0841ae f530a;

        DialogInterface$OnCancelListenerC01275(C0841ae c0841ae) {
            this.f530a = c0841ae;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f530a.m1606a();
            ActivityC0122n.f522i = null;
            ActivityC0122n.f523j = null;
        }
    }
}
