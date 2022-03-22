/*      */ package com.corrodinggames.rts.a;
/*      */ 
/*      */ import android.app.AlertDialog;
/*      */ import android.app.ProgressDialog;
/*      */ import android.content.ActivityNotFoundException;
/*      */ import android.content.Context;
/*      */ import android.content.Intent;
/*      */ import android.net.Uri;
/*      */ import android.os.Handler;
/*      */ import android.os.Looper;
/*      */ import android.view.LayoutInflater;
/*      */ import android.view.Menu;
/*      */ import android.view.View;
/*      */ import android.widget.EditText;
/*      */ import android.widget.TextView;
/*      */ import android.widget.Toast;
/*      */ import com.corrodinggames.rts.R;
/*      */ import com.corrodinggames.rts.gameFramework.e.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.l.a;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class e
/*      */   extends b
/*      */ {
/*      */   public void b() {
/*  141 */     l.d("IngameActivity: finish");
/*      */     
/*  143 */     super.b();
/*  144 */     c.a(this, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onWindowFocusChanged(boolean paramBoolean) {
/*  211 */     super.onWindowFocusChanged(paramBoolean);
/*  212 */     if (paramBoolean)
/*      */     {
/*  214 */       c.a(this, false, true);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(Menu paramMenu) {
/*  296 */     super.a(paramMenu);
/*      */     
/*  298 */     paramMenu.clear();
/*      */ 
/*      */     
/*  301 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  313 */     paramMenu.add(0, 12, 0, a.a("menus.ingame.save", new Object[0]))
/*      */       
/*  315 */       .setIcon(17301582);
/*      */ 
/*      */ 
/*      */     
/*  319 */     if (l.be)
/*      */     {
/*      */       
/*  322 */       if (!l.aJ)
/*      */       {
/*      */         
/*  325 */         paramMenu.add(0, 18, 0, a.a("menus.ingame.exportMap", new Object[0]))
/*      */           
/*  327 */           .setIcon(17301582);
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  335 */     paramMenu.add(0, 2, 0, a.a("menus.ingame.settings", new Object[0]))
/*      */       
/*  337 */       .setIcon(17301577);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  342 */     if (!l.G());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  360 */     if (l.bJ.h())
/*      */     {
/*  362 */       paramMenu.add(0, 22, 0, a.a("menus.ingame.hideInterface", new Object[0]))
/*  363 */         .setIcon(17301584);
/*      */     }
/*      */ 
/*      */     
/*  367 */     if (l.G()) {
/*      */ 
/*      */       
/*  370 */       paramMenu.add(0, 13, 0, a.a("menus.ingame.chat", new Object[0]))
/*  371 */         .setIcon(17301584);
/*      */ 
/*      */       
/*  374 */       paramMenu.add(0, 14, 0, a.a("menus.ingame.players", new Object[0]))
/*  375 */         .setIcon(17301661);
/*      */ 
/*      */       
/*  378 */       if (l.bF.A)
/*      */       {
/*      */ 
/*      */         
/*  382 */         if (a.a().e())
/*      */         {
/*  384 */           paramMenu.add(0, 17, 0, a.a("menus.ingame.steam_reinvite", new Object[0]))
/*  385 */             .setIcon(17301584);
/*      */         }
/*      */       }
/*      */ 
/*      */       
/*  390 */       boolean bool = false;
/*      */       
/*  392 */       if (l.bb != null)
/*      */       {
/*  394 */         if (l.bb.w)
/*      */         {
/*  396 */           bool = true;
/*      */         }
/*      */       }
/*      */       
/*  400 */       if (!bool && !l.cX)
/*      */       {
/*      */         
/*  403 */         paramMenu.add(0, 19, 0, a.a("menus.ingame.surrender", new Object[0]))
/*  404 */           .setIcon(17301552);
/*      */       }
/*      */       
/*  407 */       paramMenu.add(0, 10, 0, a.a("menus.ingame.disconnect", new Object[0]))
/*  408 */         .setIcon(17301552);
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/*  415 */       if (l.bM != null)
/*      */       {
/*  417 */         if (l.bM.h != null)
/*      */         {
/*  419 */           paramMenu.add(0, 11, 0, a.a("menus.ingame.briefing", new Object[0]))
/*  420 */             .setIcon(17301659);
/*      */         }
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  427 */       paramMenu.add(0, 15, 0, a.a("menus.ingame.exitGame", new Object[0]))
/*  428 */         .setIcon(17301552);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  454 */     if (l != null)
/*      */     {
/*  456 */       if (l.by.allowGameRecording)
/*      */       {
/*  458 */         if (!l.aY) {
/*      */           
/*  460 */           paramMenu.add(0, 9, 0, "Start Recording");
/*      */         
/*      */         }
/*      */         else {
/*      */ 
/*      */           
/*  466 */           paramMenu.add(0, 9, 0, "Stop Recording");
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  474 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  487 */   final Handler b = new Handler(Looper.b());
/*      */   
/*      */   ProgressDialog c;
/*      */   
/*      */   public void c(int paramInt) {
/*  492 */     l.d("outer selectMenuOption: " + paramInt);
/*      */     
/*  494 */     e$1 e$1 = new e$1(this, paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  504 */     this.b.a(e$1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void d(int paramInt) {
/*      */     Intent intent;
/*      */     l l;
/*  511 */     switch (paramInt) {
/*      */       case 4:
/*  513 */         (l.u()).bO = !(l.u()).bO;
/*      */         break;
/*      */ 
/*      */ 
/*      */       
/*      */       case 2:
/*  519 */         intent = new Intent(i(), q.class);
/*  520 */         a(intent, 0);
/*      */         break;
/*      */ 
/*      */       
/*      */       case 3:
/*  525 */         (new AlertDialog.Builder((Context)this))
/*  526 */           .setIcon(17301543)
/*  527 */           .setTitle("Skip?")
/*  528 */           .setMessage("Are you sure you want to skip this level?")
/*  529 */           .setPositiveButton("Yes", new e$7(this))
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  537 */           .setNegativeButton("No", null)
/*  538 */           .show();
/*      */         break;
/*      */ 
/*      */ 
/*      */       
/*      */       case 6:
/*  544 */         l = l.u();
/*  545 */         l.aV = !l.aV;
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 5:
/*  554 */         (new AlertDialog.Builder((Context)this))
/*  555 */           .setIcon(17301543)
/*  556 */           .setTitle("Restart?")
/*  557 */           .setMessage("Are you sure you want to restart this level?")
/*  558 */           .setPositiveButton("Yes", new e$8(this))
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  571 */           .setNegativeButton("No", null)
/*  572 */           .show();
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 12:
/*  581 */         if (c.b(this))
/*      */         {
/*  583 */           e((String)null);
/*      */         }
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 18:
/*  592 */         if (c.b(this))
/*      */         {
/*  594 */           d((String)null);
/*      */         }
/*      */         break;
/*      */ 
/*      */ 
/*      */       
/*      */       case 9:
/*  601 */         l = l.u();
/*      */         
/*  603 */         if (!l.aY) {
/*      */           
/*  605 */           l.aY = true;
/*      */           
/*      */           break;
/*      */         } 
/*  609 */         l.aY = false;
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 19:
/*  617 */         (new AlertDialog.Builder((Context)this))
/*  618 */           .setIcon(17301543)
/*  619 */           .setTitle("Disconnect?")
/*  620 */           .setMessage("Are you sure you want to surrender this game?")
/*  621 */           .setPositiveButton("Surrender", new e$9(this))
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  634 */           .setNegativeButton("No", null)
/*  635 */           .show();
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 10:
/*  644 */         (new AlertDialog.Builder((Context)this))
/*  645 */           .setIcon(17301543)
/*  646 */           .setTitle("Disconnect?")
/*  647 */           .setMessage("Are you sure you want to disconnect, and end this game?")
/*  648 */           .setPositiveButton("Yes", new e$10(this))
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  662 */           .setNegativeButton("No", null)
/*  663 */           .show();
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 15:
/*  670 */         (new AlertDialog.Builder((Context)this))
/*  671 */           .setIcon(17301543)
/*  672 */           .setTitle("Exit?")
/*  673 */           .setMessage("Are you sure you want to exit this game?")
/*  674 */           .setPositiveButton("Yes", new e$11(this))
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  682 */           .setNegativeButton("No", null)
/*  683 */           .show();
/*      */         break;
/*      */ 
/*      */ 
/*      */       
/*      */       case 11:
/*  689 */         l = l.u();
/*      */         
/*  691 */         if (l.bM != null)
/*      */         {
/*  693 */           if (l.bM.h != null)
/*      */           {
/*  695 */             l.a("Briefing", l.bM.h);
/*      */           }
/*      */         }
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 13:
/*  704 */         a(false);
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 16:
/*  713 */         a(true);
/*      */         break;
/*      */ 
/*      */ 
/*      */       
/*      */       case 14:
/*  719 */         l = l.u();
/*      */         
/*  721 */         if (l.bF != null)
/*      */         {
/*  723 */           l.bF.B();
/*      */         }
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 20:
/*  731 */         b();
/*      */         break;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       case 21:
/*  738 */         b();
/*      */         break;
/*      */ 
/*      */ 
/*      */       
/*      */       case 22:
/*  744 */         l = l.u();
/*  745 */         l.cB = true;
/*      */         
/*  747 */         l.bA.p = false;
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(boolean paramBoolean) {
/*  958 */     l l = l.u();
/*      */     
/*  960 */     AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
/*      */     
/*  962 */     if (!paramBoolean) {
/*      */       
/*  964 */       builder.setTitle("Send Message");
/*      */     }
/*      */     else {
/*      */       
/*  968 */       builder.setTitle("Send Team Message");
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  980 */     LayoutInflater layoutInflater = LayoutInflater.from((Context)this);
/*  981 */     View view = layoutInflater.inflate(R.layout.alert_chat, null);
/*      */     
/*  983 */     builder.setView(view);
/*      */     
/*  985 */     TextView textView = (TextView)view.findViewById(R.id.chat_messages);
/*  986 */     EditText editText = (EditText)view.findViewById(R.id.chat_text);
/*      */     
/*  988 */     textView.setText(l.bF.aL.a());
/*  989 */     editText.setText("");
/*  990 */     editText.requestFocus();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  998 */     builder.setPositiveButton(paramBoolean ? "Send Team" : "Send", new e$12(this, editText, paramBoolean));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1022 */     builder.setNeutralButton("Send & Ping Map", new e$13(this, editText, paramBoolean));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1050 */     builder.setNegativeButton("Cancel", new e$14(this));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1056 */     builder.show();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void d(String paramString) {
/* 1070 */     l l = l.u();
/*      */     
/* 1072 */     AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
/*      */     
/* 1074 */     builder.setTitle("Export Map");
/* 1075 */     builder.setMessage("Enter a name to export the map as");
/*      */ 
/*      */     
/* 1078 */     EditText editText = new EditText((Context)this);
/*      */ 
/*      */ 
/*      */     
/* 1082 */     if (paramString == null) {
/*      */       
/* 1084 */       String str1 = f.a("d MMM yyyy");
/* 1085 */       str1 = str1.replace(".", "");
/*      */       
/* 1087 */       String str2 = "New " + l.ac() + " (" + str1 + " " + f.a("HH.mm.ss") + ")";
/*      */       
/* 1089 */       str2 = str2.replace("  ", " ");
/*      */       
/* 1091 */       editText.setText(str2);
/*      */     }
/*      */     else {
/*      */       
/* 1095 */       editText.setText(paramString);
/*      */     } 
/*      */     
/* 1098 */     builder.setView((View)editText);
/*      */     
/* 1100 */     builder.setPositiveButton("Ok", new e$2(this, editText, l));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1136 */     builder.setNegativeButton("Cancel", new e$3(this));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1142 */     builder.show();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void e(String paramString) {
/* 1151 */     l l = l.u();
/*      */     
/* 1153 */     AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
/*      */     
/* 1155 */     builder.setTitle("Save Game");
/* 1156 */     builder.setMessage("Enter a name to save the game under");
/*      */ 
/*      */     
/* 1159 */     EditText editText = new EditText((Context)this);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1164 */     if (paramString == null) {
/*      */       
/* 1166 */       String str = f.a("d MMM yyyy");
/* 1167 */       str = str.replace(".", "");
/*      */       
/* 1169 */       editText.setText(l.ac() + " (" + str + " " + f.a("HH.mm.ss") + ")");
/*      */     }
/*      */     else {
/*      */       
/* 1173 */       editText.setText(paramString);
/*      */     } 
/*      */ 
/*      */     
/* 1177 */     builder.setView((View)editText);
/*      */     
/* 1179 */     builder.setPositiveButton("Ok", new e$4(this, editText));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1209 */     builder.setNegativeButton("Cancel", new e$5(this));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1215 */     builder.show();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(String paramString) {
/* 1247 */     a(0);
/*      */ 
/*      */     
/* 1250 */     f f = new f(this);
/* 1251 */     f.a = paramString;
/*      */     
/* 1253 */     (new Thread(f)).start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean d = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void j() {
/* 1347 */     e$6 e$6 = new e$6(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1355 */     this.b.a(e$6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void l() {
/*      */     try {
/* 1363 */       Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.corrodinggames.rts"));
/* 1364 */       a(intent);
/*      */     }
/* 1366 */     catch (ActivityNotFoundException activityNotFoundException) {
/*      */       
/* 1368 */       String str = "Failed to open Android Market";
/* 1369 */       boolean bool = false;
/* 1370 */       Toast toast = Toast.makeText(g(), str, bool);
/* 1371 */       toast.show();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void k() {}
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\a\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */