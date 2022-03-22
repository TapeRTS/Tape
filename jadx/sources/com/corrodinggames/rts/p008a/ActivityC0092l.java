package com.corrodinggames.rts.p008a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.p003os.Handler;
import android.p003os.Message;
import android.widget.EditText;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.EnumC0803s;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0674ae;
import com.corrodinggames.rts.gameFramework.p036g.EnumC0679ai;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/l.class */
public class ActivityC0092l extends ActivityC0066b {

    /* renamed from: b */
    public static ActivityC0092l f452b;

    /* renamed from: c */
    final Handler f453c;

    /* renamed from: d */
    public static boolean f454d = false;

    /* renamed from: e */
    public boolean f455e;

    /* renamed from: h */
    private Handler f456h;

    /* renamed from: i */
    private Runnable f457i;

    /* renamed from: j */
    private Runnable f458j;

    /* renamed from: f */
    static C0674ae f459f;

    /* renamed from: g */
    static AlertDialog f460g;

    /* renamed from: j */
    public static boolean m4176j() {
        if (f452b == null) {
            return false;
        }
        return f452b.f455e;
    }

    /* renamed from: c */
    public static void m4177c(String str) {
        ActivityC0092l lVar = f452b;
        if (lVar != null) {
            Message a = lVar.f456h.m4345a();
            a.m4319d().putString("text", str);
            lVar.f456h.m4337c(a);
        }
    }

    /* renamed from: a */
    public static void m4178a(String str, final String str2) {
        if (f452b != null) {
            f452b.f453c.m4341a(new Runnable() { // from class: com.corrodinggames.rts.a.l.1
                @Override // java.lang.Runnable
                public void run() {
                    ActivityC0092l.this.mo4165b();
                    if (str2 != null) {
                    }
                }
            });
        }
    }

    /* renamed from: k */
    public static void m4175k() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF != null) {
            u.f5486bF.m1385G();
            u.f5486bF.f4726c.mo363c();
        }
        if (!AbstractC0789l.f5556aF) {
            if (u.f5486bF != null && u.f5486bF.isGameStart_Hcat) {
                return;
            }
            if (f452b != null) {
                f452b.f453c.m4341a(f452b.f457i);
            } else {
                AbstractC0789l.m695b("MultiplayerBattleroomActivity:updateUI() lastLoaded==null");
            }
        }
    }

    /* renamed from: l */
    public static void m4174l() {
        if (f452b != null) {
            f452b.f453c.m4341a(f452b.f458j);
            f454d = false;
            return;
        }
        AbstractC0789l.m695b("MultiplayerBattleroomActivity:startGame() lastLoaded==null");
        AbstractC0789l.m761M();
        f454d = true;
    }

    /* renamed from: m */
    public static void m4173m() {
        C0097m mVar = new C0097m("Starting unit count");
        C0097m mVar2 = new C0097m("Total unit HP");
        C0097m mVar3 = new C0097m("Team Credits");
        Iterator it = AbstractC0171m.m3730c().iterator();
        while (it.hasNext()) {
            AbstractC0171m mVar4 = (AbstractC0171m) it.next();
            int i = 0;
            int i2 = 0;
            AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
            int size = AbstractC0210af.f1473bj.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0210af afVar = a[i3];
                if (afVar.f1441bB == mVar4) {
                    i++;
                    i2 = (int) (i2 + afVar.f1450bY);
                }
            }
            if (i != 0) {
                mVar.m4170a(mVar4, i);
                mVar2.m4170a(mVar4, i2);
                mVar3.m4170a(mVar4, mVar4.money);
            }
        }
        if (!mVar.m4171a()) {
            mVar2.m4171a();
        }
        mVar3.m4171a();
    }

    /* renamed from: n */
    public static void m4172n() {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5530cT = null;
        if (u.f5486bF.f4763aH.f4810a == EnumC0679ai.f4826c) {
            if (!u.f5486bF.f4664A) {
                u.f5489bI.m387a(u.f5486bF.f4696aJ, true, false, false);
                u.f5481bA.f4278e.m1685a(null, "Note: Game was started from a saved game.");
            } else {
                u.f5489bI.m380b(u.f5486bF.f4763aH.f4811b, true);
            }
            m4173m();
        } else if (u.f5486bF.f4763aH.f4810a == EnumC0679ai.f4825b) {
            if (!u.f5486bF.f4664A) {
                u.f5529cS = "";
                u.f5530cT = u.f5486bF.f4697aK;
                u.mo723a(true, EnumC0803s.f5652b);
                u.f5481bA.f4278e.m1685a(null, "Note: Game was started from a custom map on server.");
            } else {
                u.f5529cS = u.f5486bF.f4764aI;
                u.mo723a(true, EnumC0803s.f5652b);
            }
            m4173m();
        } else {
            u.f5529cS = u.f5486bF.f4764aI;
            u.mo723a(true, EnumC0803s.f5652b);
        }
    }

    /* renamed from: a */
    public static void m4179a(final C0674ae aeVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(AbstractC0789l.m651u().m705aq());
        CharSequence charSequence = "Password Required";
        String str = "This server requires a password to join";
        if (aeVar.f4801b != null) {
            charSequence = "Server Question";
            str = C0652a.m1573c(aeVar.f4801b);
        }
        builder.setTitle(charSequence);
        builder.setMessage(str);
        final EditText editText = new EditText(builder.getContext());
        builder.setView(editText);
        builder.setPositiveButton("Submit", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.a.l.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                aeVar.mo1219a(editText.getText().toString());
                ActivityC0092l.f459f = null;
                ActivityC0092l.f460g = null;
            }
        });
        builder.setNegativeButton("Disconnect", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.a.l.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                C0674ae.this.mo1220a();
                ActivityC0092l.f459f = null;
                ActivityC0092l.f460g = null;
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.corrodinggames.rts.a.l.4
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                C0674ae.this.mo1220a();
                ActivityC0092l.f459f = null;
                ActivityC0092l.f460g = null;
            }
        });
        AlertDialog alertDialog = f460g;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        AlertDialog show = builder.show();
        f459f = aeVar;
        f460g = show;
    }
}
