package com.corrodinggames.rts.p008a;

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
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.EnumC0803s;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;

/* renamed from: com.corrodinggames.rts.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/e.class */
public class ActivityC0069e extends ActivityC0066b {

    /* renamed from: c */
    ProgressDialog f384c;

    /* renamed from: b */
    final Handler f385b = new Handler(Looper.m4405b());

    /* renamed from: d */
    boolean f386d = true;

    /* renamed from: a */
    static /* synthetic */ void m4282a(ActivityC0069e eVar, String str) {
        eVar.m4276d(str);
    }

    /* renamed from: b */
    static /* synthetic */ void m4280b(ActivityC0069e eVar, String str) {
        eVar.m4275e(str);
    }

    /* renamed from: a */
    static /* synthetic */ void m4283a(ActivityC0069e eVar) {
        eVar.m4272l();
    }

    /* renamed from: b */
    public void mo4239b() {
        AbstractC0789l.m683d("IngameActivity: finish");
        super.mo4239b();
        C0067c.m4294a(this, true);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C0067c.m4293a(this, false, true);
        }
    }

    /* renamed from: a */
    public boolean mo4620a(Menu menu) {
        super.mo4620a(menu);
        menu.clear();
        AbstractC0789l u = AbstractC0789l.m651u();
        menu.add(0, 12, 0, C0652a.m1589a("menus.ingame.save", new Object[0])).setIcon(17301582);
        if (u.f5465be && !AbstractC0789l.f5560aJ) {
            menu.add(0, 18, 0, C0652a.m1589a("menus.ingame.exportMap", new Object[0])).setIcon(17301582);
        }
        menu.add(0, 2, 0, C0652a.m1589a("menus.ingame.settings", new Object[0])).setIcon(17301577);
        if (!u.m767G()) {
        }
        if (u.f5490bJ.m1995h()) {
            menu.add(0, 22, 0, C0652a.m1589a("menus.ingame.hideInterface", new Object[0])).setIcon(17301584);
        }
        if (u.m767G()) {
            menu.add(0, 13, 0, C0652a.m1589a("menus.ingame.chat", new Object[0])).setIcon(17301584);
            menu.add(0, 14, 0, C0652a.m1589a("menus.ingame.players", new Object[0])).setIcon(17301661);
            if (u.f5486bF.f4664A && C0796a.m645a().m637e()) {
                menu.add(0, 17, 0, C0652a.m1589a("menus.ingame.steam_reinvite", new Object[0])).setIcon(17301584);
            }
            boolean z = false;
            if (u.f5464bb != null && u.f5464bb.f1247w) {
                z = true;
            }
            if (!z && !u.f5613cX) {
                menu.add(0, 19, 0, C0652a.m1589a("menus.ingame.surrender", new Object[0])).setIcon(17301552);
            }
            menu.add(0, 10, 0, C0652a.m1589a("menus.ingame.disconnect", new Object[0])).setIcon(17301552);
        } else {
            if (!(u.f5493bM == null || u.f5493bM.f5376h == null)) {
                menu.add(0, 11, 0, C0652a.m1589a("menus.ingame.briefing", new Object[0])).setIcon(17301659);
            }
            menu.add(0, 15, 0, C0652a.m1589a("menus.ingame.exitGame", new Object[0])).setIcon(17301552);
        }
        if (u == null || !u.f5479by.allowGameRecording) {
            return true;
        }
        if (!u.f5581aY) {
            menu.add(0, 9, 0, "Start Recording");
            return true;
        }
        menu.add(0, 9, 0, "Stop Recording");
        return true;
    }

    /* renamed from: c */
    public void m4279c(int i) {
        AbstractC0789l.m683d("outer selectMenuOption: " + i);
        this.f385b.m4415a(new RunnableC00701(i));
    }

    /* renamed from: com.corrodinggames.rts.a.e$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$1.class */
    class RunnableC00701 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f387a;

        RunnableC00701(int i) {
            this.f387a = i;
        }

        public void run() {
            AbstractC0789l.m683d("inner selectMenuOption: " + this.f387a);
            ActivityC0069e.this.m4277d(this.f387a);
        }
    }

    /* renamed from: d */
    public void m4277d(int i) {
        switch (i) {
            case 2:
                m4622a(new Intent(m4616i(), ActivityC0102q.class), 0);
                return;
            case 3:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Skip?").setMessage("Are you sure you want to skip this level?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC00837()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 4:
                AbstractC0789l.m651u().f5591bO = !AbstractC0789l.m651u().f5591bO;
                return;
            case 5:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Restart?").setMessage("Are you sure you want to restart this level?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC00848()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 6:
                AbstractC0789l u = AbstractC0789l.m651u();
                u.f5578aV = !u.f5578aV;
                return;
            case 7:
            case 8:
            case 17:
            default:
                return;
            case 9:
                AbstractC0789l u2 = AbstractC0789l.m651u();
                if (!u2.f5581aY) {
                    u2.f5581aY = true;
                    return;
                } else {
                    u2.f5581aY = false;
                    return;
                }
            case 10:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Disconnect?").setMessage("Are you sure you want to disconnect, and end this game?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC007110()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 11:
                AbstractC0789l u3 = AbstractC0789l.m651u();
                if (u3.f5493bM != null && u3.f5493bM.f5376h != null) {
                    u3.m730a("Briefing", u3.f5493bM.f5376h);
                    return;
                }
                return;
            case 12:
                if (C0067c.m4289b(this)) {
                    m4275e(null);
                    return;
                }
                return;
            case 13:
                m4281a(false);
                return;
            case 14:
                AbstractC0789l u4 = AbstractC0789l.m651u();
                if (u4.f5486bF != null) {
                    u4.f5486bF.m1392B();
                    return;
                }
                return;
            case 15:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Exit?").setMessage("Are you sure you want to exit this game?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC007211()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 16:
                m4281a(true);
                return;
            case 18:
                if (C0067c.m4289b(this)) {
                    m4276d((String) null);
                    return;
                }
                return;
            case 19:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Disconnect?").setMessage("Are you sure you want to surrender this game?").setPositiveButton("Surrender", new DialogInterface$OnClickListenerC00859()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 20:
                mo4239b();
                return;
            case 21:
                mo4239b();
                return;
            case 22:
                AbstractC0789l u5 = AbstractC0789l.m651u();
                u5.f5525cB = true;
                u5.f5481bA.f4363p = false;
                return;
        }
    }

    /* renamed from: com.corrodinggames.rts.a.e$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$7.class */
    class DialogInterface$OnClickListenerC00837 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC00837() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC0789l.m651u().f5617db = true;
        }
    }

    /* renamed from: com.corrodinggames.rts.a.e$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$8.class */
    class DialogInterface$OnClickListenerC00848 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC00848() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC0789l u = AbstractC0789l.m651u();
            u.m769E();
            u.m723a(true, EnumC0803s.f5652b);
            u.m771C();
        }
    }

    /* renamed from: com.corrodinggames.rts.a.e$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$9.class */
    class DialogInterface$OnClickListenerC00859 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC00859() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC0789l.m651u().f5486bF.m1243k("-surrender");
        }
    }

    /* renamed from: com.corrodinggames.rts.a.e$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$10.class */
    class DialogInterface$OnClickListenerC007110 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC007110() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC0789l.m651u().f5486bF.m1295b("exited");
            ActivityC0069e.this.mo4239b();
        }
    }

    /* renamed from: com.corrodinggames.rts.a.e$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$11.class */
    class DialogInterface$OnClickListenerC007211 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC007211() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ActivityC0069e.this.mo4239b();
        }
    }

    /* renamed from: a */
    private void m4281a(boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (!z) {
            builder.setTitle("Send Message");
        } else {
            builder.setTitle("Send Team Message");
        }
        View inflate = LayoutInflater.from(this).inflate(C0063R.layout.alert_chat, (ViewGroup) null);
        builder.setView(inflate);
        TextView textView = (TextView) inflate.findViewById(C0063R.C0064id.chat_messages);
        EditText editText = (EditText) inflate.findViewById(C0063R.C0064id.chat_text);
        textView.setText(u.f5486bF.f4765aL.m1416a());
        editText.setText("");
        editText.requestFocus();
        builder.setPositiveButton(z ? "Send Team" : "Send", new DialogInterface$OnClickListenerC007312(editText, z));
        builder.setNeutralButton("Send & Ping Map", new DialogInterface$OnClickListenerC007413(editText, z));
        builder.setNegativeButton("Cancel", new DialogInterface$OnClickListenerC007514());
        builder.show();
    }

    /* renamed from: com.corrodinggames.rts.a.e$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$12.class */
    class DialogInterface$OnClickListenerC007312 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f391a;

        /* renamed from: b */
        final /* synthetic */ boolean f392b;

        DialogInterface$OnClickListenerC007312(EditText editText, boolean z) {
            this.f391a = editText;
            this.f392b = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f391a.getText().toString();
            AbstractC0789l u = AbstractC0789l.m651u();
            if (!obj.trim().equals("")) {
                if (this.f392b) {
                    u.f5486bF.m1245j(obj);
                } else {
                    u.f5486bF.m1243k(obj);
                }
            }
            u.f5481bA.f4363p = false;
        }
    }

    /* renamed from: com.corrodinggames.rts.a.e$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$13.class */
    class DialogInterface$OnClickListenerC007413 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f394a;

        /* renamed from: b */
        final /* synthetic */ boolean f395b;

        DialogInterface$OnClickListenerC007413(EditText editText, boolean z) {
            this.f394a = editText;
            this.f395b = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f394a.getText().toString();
            AbstractC0789l u = AbstractC0789l.m651u();
            if (!obj.trim().equals("")) {
                if (this.f395b) {
                    u.f5486bF.m1245j(obj);
                } else {
                    u.f5486bF.m1243k(obj);
                }
            }
            u.f5481bA.f4363p = false;
            u.f5481bA.m1811G();
        }
    }

    /* renamed from: com.corrodinggames.rts.a.e$14 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$14.class */
    class DialogInterface$OnClickListenerC007514 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC007514() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: d */
    private void m4276d(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Export Map");
        builder.setMessage("Enter a name to export the map as");
        EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(("New " + u.m719ac() + " (" + C0654f.m1543a("d MMM yyyy").replace(".", "") + " " + C0654f.m1543a("HH.mm.ss") + ")").replace("  ", " "));
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC00762(editText, u));
        builder.setNegativeButton("Cancel", new DialogInterface$OnClickListenerC00783());
        builder.show();
    }

    /* renamed from: com.corrodinggames.rts.a.e$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$2.class */
    class DialogInterface$OnClickListenerC00762 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f398a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0789l f399b;

        DialogInterface$OnClickListenerC00762(EditText editText, AbstractC0789l lVar) {
            this.f398a = editText;
            this.f399b = lVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f398a.getText().toString();
            if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityC0069e.this);
                builder.setTitle("Bad Map Name");
                builder.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC00771(obj));
                builder.show();
                return;
            }
            this.f399b.f5474bt.m4006a(this.f399b.f5529cS, "/SD/rustedWarfare/maps/" + obj + ".tmx");
        }

        /* renamed from: com.corrodinggames.rts.a.e$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$2$1.class */
        class DialogInterface$OnClickListenerC00771 implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f401a;

            DialogInterface$OnClickListenerC00771(String str) {
                this.f401a = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityC0069e.m4282a(ActivityC0069e.this, this.f401a);
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.a.e$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$3.class */
    class DialogInterface$OnClickListenerC00783 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC00783() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: e */
    private void m4275e(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Save Game");
        builder.setMessage("Enter a name to save the game under");
        EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(u.m719ac() + " (" + C0654f.m1543a("d MMM yyyy").replace(".", "") + " " + C0654f.m1543a("HH.mm.ss") + ")");
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC00794(editText));
        builder.setNegativeButton("Cancel", new DialogInterface$OnClickListenerC00815());
        builder.show();
    }

    /* renamed from: com.corrodinggames.rts.a.e$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$4.class */
    class DialogInterface$OnClickListenerC00794 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f404a;

        DialogInterface$OnClickListenerC00794(EditText editText) {
            this.f404a = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f404a.getText().toString();
            if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityC0069e.this);
                builder.setTitle("Bad Save Name");
                builder.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC00801(obj));
                builder.show();
                return;
            }
            ActivityC0069e.this.m4278c(obj);
        }

        /* renamed from: com.corrodinggames.rts.a.e$4$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$4$1.class */
        class DialogInterface$OnClickListenerC00801 implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f406a;

            DialogInterface$OnClickListenerC00801(String str) {
                this.f406a = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityC0069e.m4280b(ActivityC0069e.this, this.f406a);
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.a.e$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$5.class */
    class DialogInterface$OnClickListenerC00815 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC00815() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: c */
    public void m4278c(String str) {
        m4625a(0);
        RunnableC0086f fVar = new RunnableC0086f(this);
        fVar.f413a = str;
        new Thread(fVar).start();
    }

    /* renamed from: com.corrodinggames.rts.a.e$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/e$6.class */
    class RunnableC00826 implements Runnable {
        RunnableC00826() {
        }

        public void run() {
            ActivityC0069e.m4283a(ActivityC0069e.this);
        }
    }

    /* renamed from: j */
    public void m4274j() {
        this.f385b.m4415a(new RunnableC00826());
    }

    /* renamed from: l */
    private void m4272l() {
        try {
            mo4615a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.corrodinggames.rts")));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(mo4607g(), "Failed to open Android Market", 0).show();
        }
    }

    /* renamed from: k */
    public void m4273k() {
    }
}
