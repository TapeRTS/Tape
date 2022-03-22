/*      */ package com.corrodinggames.rts.gameFramework;
/*      */ 
/*      */ import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Locale;
/*      */ import java.util.Properties;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ac
/*      */ {
/*      */   public ac() {
/*   87 */     this.l = a("Debug Left");
/*   88 */     this.m = a("Debug Right");
/*      */     
/*   90 */     this.n = b("Camera Up");
/*   91 */     this.o = b("Camera Down");
/*   92 */     this.p = b("Camera Left");
/*   93 */     this.q = b("Camera Right");
/*      */ 
/*      */     
/*   96 */     this.r = b("Zoom In");
/*   97 */     this.s = b("Zoom Out");
/*      */ 
/*      */ 
/*      */     
/*  101 */     this.t = b("Send Chat");
/*  102 */     this.u = b("Send Team Chat");
/*      */     
/*  104 */     this.v = b("Ping Map");
/*      */ 
/*      */     
/*  107 */     this.w = b("Show Menu");
/*      */     
/*  109 */     this.x = b("Save Game");
/*      */ 
/*      */ 
/*      */     
/*  113 */     this.y = b("Deselect units");
/*  114 */     this.z = b("Go to notification");
/*      */     
/*  116 */     this.A = b("Select Whole Army");
/*      */     
/*  118 */     this.B = b("Select Command Center");
/*      */     
/*  120 */     this.C = b("Cycle Builders");
/*      */     
/*  122 */     this.D = b("Cycle Extractors");
/*      */ 
/*      */     
/*  125 */     this.E = b("Cycle Upgradable Fabricators");
/*      */     
/*  127 */     this.F = b("Cycle Land Factories");
/*      */     
/*  129 */     this.G = b("Cycle Air Factories");
/*      */     
/*  131 */     this.H = b("Next Music Track");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  136 */     this.I = c("Game Speed (Single player)");
/*      */     
/*  138 */     this.J = b("Slower");
/*  139 */     this.K = b("Faster");
/*  140 */     this.L = b("Pause Game");
/*      */ 
/*      */ 
/*      */     
/*  144 */     this.M = c("Unit Actions");
/*      */     
/*  146 */     this.N = b("Attack Move");
/*      */     
/*  148 */     this.O = b("Stop");
/*      */ 
/*      */     
/*  151 */     this.P = b("Guard Unit");
/*  152 */     this.Q = b("Patrol");
/*      */     
/*  154 */     this.R = b("Reclaim");
/*      */     
/*  156 */     this.S = b("Action - Upgrade");
/*      */     
/*  158 */     this.T = b("Action - Set Rally");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  165 */     this.U = a("Debug Editor");
/*      */ 
/*      */ 
/*      */     
/*  169 */     this.V = a("Debug Pause");
/*      */     
/*  171 */     this.W = a("Debug Slow");
/*      */     
/*  173 */     this.X = a("Debug HideInterface");
/*      */     
/*  175 */     this.Y = a("Debug HideInterface Temp");
/*      */     
/*  177 */     this.Z = a("Debug InvincibleUnits");
/*      */     
/*  179 */     this.aa = a("debugPrintSelectedUnit");
/*      */     
/*  181 */     this.ab = a("debugDevModeSwitch");
/*      */     
/*  183 */     this.ac = a("debugAIViewSwitch");
/*      */     
/*  185 */     this.ad = a("debugMapSwitch");
/*      */ 
/*      */     
/*  188 */     this.ae = a("Debug Take Screenshot");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  219 */     this.n.a("UP").a("NUMPAD8");
/*  220 */     this.o.a("DOWN").a("NUMPAD2");
/*  221 */     this.p.a("LEFT").a("NUMPAD4");
/*  222 */     this.q.a("RIGHT").a("NUMPAD6");
/*      */ 
/*      */     
/*  225 */     this.l.a("F5");
/*  226 */     this.m.a("F6");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  231 */     this.x.a("CTRL+S");
/*      */     
/*  233 */     this.t.a("ENTER").a("T");
/*      */     
/*  235 */     this.u.a("SHIFT+ENTER").a("Y");
/*      */     
/*  237 */     this.v.a("CTRL+M").a("CTRL+P");
/*      */ 
/*      */     
/*  240 */     this.w.a("ESCAPE").a("F10");
/*      */ 
/*      */     
/*  243 */     this.y.a("SPACE");
/*  244 */     this.z.a("CTRL+SPACE");
/*      */     
/*  246 */     this.A.a("CTRL+A");
/*      */     
/*  248 */     this.C.a("CTRL+B");
/*      */     
/*  250 */     this.D.a("CTRL+E");
/*      */     
/*  252 */     this.E.a("CTRL+F");
/*      */     
/*  254 */     this.F.a("CTRL+L");
/*  255 */     this.G.a("CTRL+K");
/*      */     
/*  257 */     this.B.a("CTRL+C");
/*      */     
/*  259 */     this.H.a("CTRL+N");
/*      */     
/*  261 */     this.N.a("A");
/*      */ 
/*      */ 
/*      */     
/*  265 */     this.P.a("G");
/*      */     
/*  267 */     this.Q.a("P");
/*      */ 
/*      */     
/*  270 */     this.S.a("U");
/*  271 */     this.T.a("R");
/*      */     
/*  273 */     this.U.a("CTRL+SHIFT+E");
/*      */     
/*  275 */     this.V.a("CTRL+SHIFT+P");
/*      */     
/*  277 */     this.W.a("CTRL+SHIFT+S");
/*      */     
/*  279 */     this.X.a("CTRL+SHIFT+H");
/*      */     
/*  281 */     this.Y.a("CTRL+H");
/*      */     
/*  283 */     this.Z.a("CTRL+SHIFT+I");
/*      */     
/*  285 */     this.aa.a("CTRL+SHIFT+L");
/*      */     
/*  287 */     this.ab.a("CTRL+SHIFT+D");
/*      */     
/*  289 */     this.ac.a("SHIFT+F3");
/*      */     
/*  291 */     this.ad.a("SHIFT+F4");
/*      */     
/*  293 */     this.ae.a("CTRL+SHIFT+ALT+S");
/*      */     
/*  295 */     this.J.a("minus").a("NUMPADSUBTRACT");
/*  296 */     this.K.a("equals").a("NUMPADADD");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  303 */     int[] arrayOfInt = { 54, 52, 31, 50, 30, 42, 41, 38, 39, 40, 37, 43 };
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  308 */     this.af = new ad[10]; byte b;
/*  309 */     for (b = 0; b < this.af.length; b++) {
/*      */       
/*  311 */       this.af[b] = b("unit action " + (b + 1));
/*  312 */       this.af[b].b(arrayOfInt[b]);
/*      */     } 
/*      */ 
/*      */     
/*  316 */     this.ag = c("Unit Groups");
/*      */     
/*  318 */     this.aj = new ad[10];
/*  319 */     for (b = 0; b < this.aj.length; b++) {
/*      */       
/*  321 */       this.aj[b] = b("create group " + (b + 1));
/*      */ 
/*      */       
/*  324 */       int i = a((b == 9) ? 0 : (b + 1));
/*  325 */       boolean bool = true;
/*  326 */       this.aj[b].a(i, 0, bool, false);
/*      */     } 
/*      */ 
/*      */     
/*  330 */     this.ah = new ad[10];
/*  331 */     for (b = 0; b < this.ah.length; b++) {
/*      */       
/*  333 */       this.ah[b] = b("select group " + (b + 1));
/*      */       
/*  335 */       int i = a((b == 9) ? 0 : (b + 1));
/*  336 */       this.ah[b].b(i);
/*      */     } 
/*      */     
/*  339 */     this.ai = new ad[10];
/*  340 */     for (b = 0; b < this.ai.length; b++) {
/*      */       
/*  342 */       this.ai[b] = b("Add group to selection " + (b + 1));
/*      */       
/*  344 */       int i = a((b == 9) ? 0 : (b + 1));
/*  345 */       byte b1 = 2;
/*  346 */       this.ai[b].a(i, 0, b1, false);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1347 */     this.al = new Properties();
/*      */     
/* 1349 */     this.am = 0;
/* 1350 */     this.an = 0;
/*      */   }
/*      */   public static aj a = new al();
/*      */   
/*      */   public void b() {
/* 1355 */     if (b.a() != this.an) {
/*      */       
/* 1357 */       this.an = b.a();
/*      */       
/* 1359 */       l.d("Number of controllers changed, now:" + this.an);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static ai b = new ai();
/*      */   
/*      */   public ad c;
/*      */   
/*      */   public ad d;
/*      */   
/*      */   public ad e;
/*      */   public ad f;
/*      */   public ad g;
/*      */   public ad h;
/*      */   public ad i;
/*      */   public ad j;
/*      */   public ad k;
/*      */   public ad l;
/*      */   public ad m;
/*      */   public ad n;
/*      */   public ad o;
/*      */   public ad p;
/*      */   public ad q;
/*      */   public ad r;
/*      */   public ad s;
/*      */   public ad t;
/*      */   public ad u;
/*      */   public ad v;
/*      */   public ad w;
/*      */   public ad x;
/*      */   public ad y;
/*      */   public ad z;
/*      */   public ad A;
/*      */   public ad B;
/*      */   public ad C;
/*      */   public ad D;
/*      */   public ad E;
/*      */   public ad F;
/*      */   public ad G;
/*      */   public ad H;
/*      */   public ae I;
/*      */   public ad J;
/*      */   public ad K;
/*      */   public ad L;
/*      */   public ae M;
/*      */   public ad N;
/*      */   public ad O;
/*      */   public ad P;
/*      */   public ad Q;
/*      */   public ad R;
/*      */   public ad S;
/*      */   public ad T;
/*      */   public ad U;
/*      */   public ad V;
/*      */   public ad W;
/*      */   public ad X;
/*      */   public ad Y;
/*      */   public ad Z;
/*      */   public ad aa;
/*      */   public ad ab;
/*      */   
/*      */   public static int d(String paramString) {
/* 1422 */     if (paramString.equalsIgnoreCase("CLEARED"))
/*      */     {
/* 1424 */       return 0;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1429 */     return SlickToAndroidKeycodes.a(paramString);
/*      */   }
/*      */   
/*      */   public ad ac;
/*      */   public ad ad;
/*      */   public ad ae;
/*      */   public ad[] af;
/*      */   public ae ag;
/*      */   public ad[] ah;
/*      */   public ad[] ai;
/*      */   public ad[] aj;
/*      */   public ArrayList ak;
/*      */   Properties al;
/*      */   int am;
/*      */   int an;
/*      */   
/*      */   public int a(int paramInt) {
/*      */     if (paramInt >= 10)
/*      */       throw new RuntimeException("number:" + paramInt + " too high"); 
/*      */     if (paramInt == 0)
/*      */       return 7; 
/*      */     return 8 + paramInt - 1;
/*      */   }
/*      */   
/*      */   public ad a(String paramString) {
/*      */     if (this.ak == null)
/*      */       this.ak = new ArrayList(); 
/*      */     ad ad1 = new ad();
/*      */     ad1.a = paramString;
/*      */     ad1.b = false;
/*      */     this.ak.add(ad1);
/*      */     return ad1;
/*      */   }
/*      */   
/*      */   public ad b(String paramString) {
/*      */     if (this.ak == null)
/*      */       this.ak = new ArrayList(); 
/*      */     ad ad1 = new ad();
/*      */     ad1.a = paramString;
/*      */     ad1.b = true;
/*      */     this.ak.add(ad1);
/*      */     return ad1;
/*      */   }
/*      */   
/*      */   public ae c(String paramString) {
/*      */     if (this.ak == null)
/*      */       this.ak = new ArrayList(); 
/*      */     ae ae1 = new ae();
/*      */     ae1.a = paramString;
/*      */     ae1.b = true;
/*      */     this.ak.add(ae1);
/*      */     return ae1;
/*      */   }
/*      */   
/*      */   public void a(String paramString1, String paramString2) {
/*      */     paramString1 = paramString1.toLowerCase(Locale.ENGLISH).trim();
/*      */     ad ad1 = null;
/*      */     for (ad ad2 : this.ak) {
/*      */       if (ad2.a != null)
/*      */         if (ad2.e().equals(paramString1))
/*      */           ad1 = ad2;  
/*      */     } 
/*      */     if (ad1 == null) {
/*      */       l.b("loadKey: could not find:" + paramString1);
/*      */       return;
/*      */     } 
/*      */     String[] arrayOfString = paramString2.split(",");
/*      */     for (byte b = 0; b <= 1; b++) {
/*      */       if (b >= arrayOfString.length)
/*      */         break; 
/*      */       String str = arrayOfString[b];
/*      */       if (!str.equalsIgnoreCase("DEFAULT")) {
/*      */         ad1.a(str, b);
/*      */         if (ad1.c.size() > b && ad1.c.get(b) != null) {
/*      */           ((af)ad1.c.get(b)).d = true;
/*      */         } else {
/*      */           l.f("out of range");
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public String a(ad paramad) {
/*      */     String str = "";
/*      */     boolean bool = true;
/*      */     for (af af : paramad.c) {
/*      */       if (bool) {
/*      */         bool = false;
/*      */       } else {
/*      */         str = str + ",";
/*      */       } 
/*      */       if (af.d) {
/*      */         if (af.d()) {
/*      */           str = str + "CLEARED";
/*      */           continue;
/*      */         } 
/*      */         str = str + af.c();
/*      */         continue;
/*      */       } 
/*      */       str = str + "DEFAULT";
/*      */     } 
/*      */     return str;
/*      */   }
/*      */   
/*      */   public void a() {
/*      */     this.c = a("shoot");
/*      */     this.d = a("move up");
/*      */     this.e = a("move down");
/*      */     this.f = a("move left");
/*      */     this.g = a("move right");
/*      */     this.h = a("aim up");
/*      */     this.i = a("aim down");
/*      */     this.j = a("aim left");
/*      */     this.k = a("aim right");
/*      */     boolean bool1 = false;
/*      */     this.c.a(bool1, "enter", -1);
/*      */     this.c.a(bool1, "space", -1);
/*      */     this.d.a(bool1, "w", -1);
/*      */     this.e.a(bool1, "s", -1);
/*      */     this.f.a(bool1, "a", -1);
/*      */     this.g.a(bool1, "d", -1);
/*      */     this.h.a(bool1, "UP", -1);
/*      */     this.i.a(bool1, "DOWN", -1);
/*      */     this.j.a(bool1, "LEFT", -1);
/*      */     this.k.a(bool1, "RIGHT", -1);
/*      */     l.d("getControllerCount:" + b.a());
/*      */     boolean bool2 = true;
/*      */     this.d.b(bool1, bool2, 0, true);
/*      */     this.e.b(bool1, bool2, 0, false);
/*      */     this.f.b(bool1, bool2, 1, true);
/*      */     this.g.b(bool1, bool2, 1, false);
/*      */     this.h.b(bool1, bool2, 2, true);
/*      */     this.i.b(bool1, bool2, 2, false);
/*      */     this.j.b(bool1, bool2, 3, true);
/*      */     this.k.b(bool1, bool2, 3, false);
/*      */     this.c.b(bool1, bool2, 4, true);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */