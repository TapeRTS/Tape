/*      */ package com.corrodinggames.rts.java;
/*      */ 
/*      */ import com.corrodinggames.librocket.a;
/*      */ import com.corrodinggames.librocket.scripts.ScriptEngine;
/*      */ import com.corrodinggames.rts.R;
/*      */ import com.corrodinggames.rts.a.k;
/*      */ import com.corrodinggames.rts.b.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.j.j;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.l.a;
/*      */ import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.File;
/*      */ import java.lang.reflect.Field;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.newdawn.slick.BasicGame;
/*      */ import org.newdawn.slick.Color;
/*      */ import org.newdawn.slick.GameContainer;
/*      */ import org.newdawn.slick.Graphics;
/*      */ import org.newdawn.slick.Image;
/*      */ import org.newdawn.slick.imageout.ImageOut;
/*      */ import org.newdawn.slick.opengl.renderer.Renderer;
/*      */ import org.newdawn.slick.opengl.renderer.SGL;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class t
/*      */   extends BasicGame
/*      */ {
/*      */   GameContainer a;
/*      */   Main b;
/*      */   b c;
/*      */   j d;
/*      */   l e;
/*      */   d f;
/*      */   boolean g = false;
/*   64 */   Object h = new Object();
/*      */   boolean i = false;
/*      */   boolean j = false;
/*      */   boolean k = false;
/*      */   boolean l = false;
/*      */   r m;
/*      */   r n;
/*      */   boolean o; boolean p; boolean q; boolean r; boolean s; int t; boolean u; boolean v; float w; float x; boolean y; private boolean[] V; int z; float A; float B; int C; int D; int E; int F; int G; int H; boolean I; boolean J; float K; int L; String M; String N; float O; int P; int Q; long R; float S; float T; int U; public boolean closeRequested() { if (this.i) return true;  if (a.a()) return true;  if (this.c != null && !this.c.isFullscreen()) { ScriptEngine.getInstance().addScriptToQueue("askQuitGame();"); return false; }  return true; } public void init(GameContainer paramGameContainer) { this.a = paramGameContainer; paramGameContainer.setAlwaysRender(true); paramGameContainer.setForceExit(true); paramGameContainer.setShowFPS(false); paramGameContainer.setTargetFrameRate(300); if (l.as) { paramGameContainer.setShowFPS(true); paramGameContainer.setTargetFrameRate(30); }  paramGameContainer.setIcons(new String[] { "res/drawable/icon_window.png", "res/drawable/icon_window128.png", "res/drawable/icon_window24.png", "res/drawable/icon_window16.png" }); paramGameContainer.setUpdateOnlyWhenVisible(false); paramGameContainer.getInput().enableKeyRepeat(); this.m = e.b(R.drawable.logo, true); this.n = e.b(R.drawable.pointer, true); paramGameContainer.setMouseCursor(this.n.z(), 0, 0); this.R = System.currentTimeMillis(); } public void a() { this.e = l.u(); if (this.a.isVSyncRequested() != this.e.by.renderVsync) this.a.setVSync(this.e.by.renderVsync);  if (this.e.by.highRefreshRate) { this.a.setTargetFrameRate(300); } else { this.a.setTargetFrameRate(120); }  boolean bool = false; if (this.e.by.enableMouseCapture && (!this.e.by.slick2dFullScreen || this.e.cB)) if (!this.e.al && !this.e.a(false) && this.e.ba) bool = true;   if (bool != this.v) { l.d("Grabbing mouse:" + bool); this.v = bool; if (!this.u)
/*      */         this.a.setMouseGrabbed(this.v);  if (this.v); if (!this.v)
/*      */         Mouse.setCursorPosition((int)(this.w * this.O), (int)(Display.getHeight() - this.x * this.O));  l.aD = this.v; }  this.a.setSmoothDeltas(this.e.by.renderSmoothDelta); if (this.o != Display.isActive()) { this.o = Display.isActive(); if (this.o)
/*      */         f();  }  } public void b() { if (this.p) { l.f("loadingStartedThreaded"); return; }  this.p = true; c(); } public void c() { if (this.q) { l.f("loadingStartedNonThreaded"); return; }  this.q = true; if (this.b == null)
/*   75 */       this.b = new Main();  this.b.h(); if (l.aA) { l.d("switching to sandbox"); ScriptEngine.getInstance().addScriptToQueue("open('sandboxOptions.rml', 'maps/skirmish/[z;p10]Crossing Large (10p).tmx'); loadConfigAndStartNewSandbox('maps/skirmish/[z;p10]Crossing Large (10p).tmx');"); }  this.r = true; } public void a(d paramd) { l.b("SlickContainer:setup"); this.e = l.u(); this.f = paramd; this.f.d = new k(); this.f.a = this.a.getWidth(); this.f.b = this.a.getHeight(); this.e.b(this.f.a, this.f.b); this.d = new j(); } public void update(GameContainer paramGameContainer, int paramInt) { this.t = paramInt; } public t(String paramString) { super(paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  242 */     this.p = false;
/*      */     
/*  244 */     this.q = false;
/*  245 */     this.r = false;
/*      */     
/*  247 */     this.s = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  358 */     this.u = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  370 */     this.y = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  559 */     this.V = new boolean[224];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  696 */     this.z = 0;
/*      */     
/*  698 */     this.A = 0.0F;
/*  699 */     this.B = 0.0F;
/*  700 */     this.C = 0;
/*  701 */     this.D = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1107 */     this.K = 0.0F;
/* 1108 */     this.L = 0;
/* 1109 */     this.M = "";
/* 1110 */     this.N = "";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1191 */     this.O = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1207 */     this.P = 100;
/* 1208 */     this.Q = 100;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1214 */     this.S = 0.0F;
/* 1215 */     this.T = 0.0F; }
/*      */   public int a(int paramInt) { if (paramInt == 0) return 1;  if (paramInt == 1) return 2;  if (paramInt == 2) return 3;  l.d("Unknown mouse button:" + paramInt); return 0; }
/*      */   public void a(int paramInt1, int paramInt2, boolean paramBoolean) { if (this.y)
/*      */       l.d("mouseGrab:m:" + paramBoolean + ",newX:" + paramInt1 + ",newY:" + paramInt2);  if (!this.v) { this.w = (int)(paramInt1 / this.O); this.x = (int)(paramInt2 / this.O); } else { if (paramBoolean) { int i, k; if (this.u) { i = paramInt1 - this.P; k = paramInt2 - this.Q; } else { i = paramInt1; k = paramInt2; }  this.w += i / this.O; this.x += k / this.O; } else { this.w = (int)(paramInt1 / this.O); this.x = (int)(paramInt2 / this.O); }  if (this.w < 0.0F)
/*      */         this.w = 0.0F;  if (this.x < 0.0F)
/*      */         this.x = 0.0F;  if (this.f != null) { if (this.w > (this.f.h() - 1))
/*      */           this.w = (this.f.h() - 1);  if (this.x > (this.f.i() - 1))
/*      */           this.x = (this.f.i() - 1);  } else { l.d("processMouseGrab gameView==null"); }  }  }
/*      */   public void mousePressed(int paramInt1, int paramInt2, int paramInt3) { a(paramInt2, paramInt3, false); if (d()) { this.b.p.mouseMove((int)this.w, (int)this.x, 0); this.b.p.processMouseButtonDown(0, 0); return; }  if (this.f != null) { int i = a(paramInt1); if (i != 0)
/*      */         this.f.d.a(this.w, this.x, true, i);  return; }  }
/*      */   public void mouseDragged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { a(paramInt3, paramInt4, true); if (d()) { this.b.p.mouseMove((int)this.w, (int)this.x, 0); return; }  if (this.f != null) { this.f.d.a(this.w, this.x); return; }  }
/*      */   public void mouseMoved(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { a(paramInt3, paramInt4, true); if (d()) { this.b.p.mouseMove((int)this.w, (int)this.x, 0); return; }  if (this.f != null) { this.f.d.a(this.w, this.x); return; }  }
/*      */   public void mouseReleased(int paramInt1, int paramInt2, int paramInt3) { a(paramInt2, paramInt3, false); if (d()) { this.b.p.processMouseButtonUp(0, 0); return; }  if (this.f != null) { int i = a(paramInt1); if (i != 0)
/*      */         this.f.d.a(this.w, this.x, false, i);  return; }  }
/* 1229 */   public void mouseWheelMoved(int paramInt) { if (d()) { this.b.p.processMouseWheel(-(paramInt / 120) * 2, 0); return; }  if (this.e != null) { this.e.k(paramInt); return; }  } public void render(GameContainer paramGameContainer, Graphics paramGraphics) { long l1 = System.currentTimeMillis();
/*      */     
/* 1231 */     float f1 = (float)(l1 - this.R) * 0.060000002F;
/* 1232 */     int i = (int)(l1 - this.R);
/*      */     
/* 1234 */     this.R = l1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1242 */     if (this.v && this.u)
/*      */     {
/*      */ 
/*      */       
/* 1246 */       if (paramGameContainer.hasFocus())
/*      */       {
/*      */         
/* 1249 */         Mouse.setCursorPosition(this.P, this.Q);
/*      */       }
/*      */     }
/*      */ 
/*      */     
/* 1254 */     if (!this.r) {
/*      */       
/* 1256 */       a(paramGameContainer, paramGraphics);
/*      */       
/* 1258 */       if (!this.s) {
/*      */         
/* 1260 */         this.s = true;
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/* 1265 */       if (!this.p)
/*      */       {
/* 1267 */         b();
/*      */       }
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1273 */     if (this.e == null) {
/*      */       
/* 1275 */       l.b("render: game==null");
/*      */       
/*      */       return;
/*      */     } 
/* 1279 */     a();
/*      */ 
/*      */     
/* 1282 */     float f2 = this.t * 0.060000002F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1293 */     int k = Display.getWidth();
/* 1294 */     int m = Display.getHeight();
/*      */ 
/*      */     
/* 1297 */     if (k != this.G || m != this.H) {
/*      */ 
/*      */       
/* 1300 */       if (this.C != k || this.D != m) {
/*      */         
/* 1302 */         this.C = k;
/* 1303 */         this.D = m;
/*      */         
/* 1305 */         this.B = 0.0F;
/*      */       } 
/*      */       
/* 1308 */       this.B += f2;
/* 1309 */       this.A += f2;
/*      */       
/* 1311 */       if (this.A > 300.0F || this.B > 20.0F || this.A > 0.0F) {
/*      */         
/* 1313 */         this.A = 0.0F;
/* 1314 */         this.B = 0.0F;
/*      */         
/* 1316 */         a(k, m);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1326 */     this.b.a(f2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1332 */     if (this.e.by.liveReloading) {
/*      */       
/* 1334 */       this.z++;
/* 1335 */       if (this.z > 30) {
/*      */         
/* 1337 */         this.z = 0;
/* 1338 */         if (r.s != null)
/*      */         {
/* 1340 */           for (r r1 : r.s)
/*      */           {
/* 1342 */             r1.s();
/*      */           }
/*      */         }
/*      */         
/* 1346 */         if (!this.e.h(48))
/*      */         {
/* 1348 */           this.b.p.detectChangesAndReload();
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1355 */     if (!this.e.bp) {
/*      */       
/* 1357 */       paramGraphics.setColor(Color.gray);
/*      */       
/* 1359 */       paramGraphics.resetTransform();
/* 1360 */       paramGraphics.clearClip();
/*      */       
/* 1362 */       paramGraphics.clear();
/*      */       
/* 1364 */       a(paramGraphics);
/*      */       
/* 1366 */       if (!d() && !this.e.br)
/*      */       {
/* 1368 */         this.U++;
/* 1369 */         if (this.U > 100)
/*      */         {
/* 1371 */           this.U = 0;
/* 1372 */           l.d("Fail safe menu");
/* 1373 */           a.a().b();
/*      */         }
/*      */       
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1381 */       this.U = 0;
/*      */     } 
/*      */     
/* 1384 */     boolean bool = this.e.bB.ae.a();
/*      */ 
/*      */ 
/*      */     
/* 1388 */     if (this.e.bp) {
/*      */       
/* 1390 */       paramGraphics.resetTransform();
/*      */ 
/*      */       
/* 1393 */       if (!this.e.dc) {
/*      */         
/* 1395 */         paramGraphics.clearClip();
/* 1396 */         paramGraphics.clear();
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1401 */       a(paramGraphics);
/*      */ 
/*      */       
/* 1404 */       paramGraphics.setColor(Color.black);
/*      */       
/* 1406 */       if (!l.av) {
/*      */         
/* 1408 */         e e = (e)this.e.bw;
/* 1409 */         e.e = paramGraphics;
/*      */         
/* 1411 */         e.C = this.O;
/*      */       } 
/*      */       
/* 1414 */       boolean bool1 = this.e.cz;
/*      */       
/* 1416 */       if (bool)
/*      */       {
/* 1418 */         this.e.cz = true;
/*      */       }
/*      */       
/* 1421 */       this.e.b(f2, this.t);
/*      */ 
/*      */       
/* 1424 */       if (bool)
/*      */       {
/* 1426 */         this.e.cz = bool1;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1433 */       this.t = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1465 */       this.e.bv.a(f2);
/*      */     } 
/*      */ 
/*      */     
/* 1469 */     a.a().a(0.0F);
/*      */     
/* 1471 */     this.b.p.c.update(f2);
/*      */     
/* 1473 */     if (!this.b.p.b()) {
/*      */       
/* 1475 */       this.b.p.a(paramGraphics);
/*      */       
/* 1477 */       this.b.p.update();
/*      */       
/* 1479 */       this.b.p.render();
/*      */ 
/*      */       
/* 1482 */       this.b.p.c.checkForErrors();
/*      */       
/* 1484 */       this.b.p.debug = false;
/*      */     } 
/*      */     
/* 1487 */     this.b.p.postUpdate();
/*      */ 
/*      */ 
/*      */     
/* 1491 */     if (this.i)
/*      */     {
/* 1493 */       paramGraphics.clear();
/*      */     }
/*      */ 
/*      */     
/* 1497 */     b(paramGraphics);
/*      */     
/* 1499 */     if (this.v && !bool)
/*      */     {
/*      */       
/* 1502 */       if (!this.e.cB)
/*      */       {
/* 1504 */         paramGraphics.drawImage(this.n.z(), this.w * this.O, this.x * this.O);
/*      */       }
/*      */     }
/*      */ 
/*      */     
/* 1509 */     if (bool)
/*      */     {
/* 1511 */       c(paramGraphics);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1516 */     if (this.b.u)
/*      */     
/* 1518 */     { this.b.v++;
/* 1519 */       if (this.b.v > 2)
/*      */       
/* 1521 */       { this.b.u = false;
/* 1522 */         this.b.v = 0;
/*      */         
/* 1524 */         l.d("Saving settings (queued)");
/* 1525 */         this.e.by.save(); }  }  } boolean d() { if (this.b != null && this.b.p != null && !this.b.p.b())
/*      */       return true;  return false; }
/*      */   public boolean b(int paramInt) { if (paramInt >= this.V.length || paramInt < 0)
/*      */       return false;  return this.V[paramInt]; }
/*      */   public int e() { byte b1 = 0; if (b(42) || b(54))
/*      */       b1 += true;  if (b(29) || b(157))
/*      */       b1++;  if (b(56) || b(184))
/*      */       b1 += 4;  return b1; }
/*      */   public void a(int paramInt, boolean paramBoolean) { if (paramInt >= this.V.length || paramInt < 0)
/*      */       return;  this.V[paramInt] = paramBoolean; }
/*      */   public void f() { for (byte b1 = 0; b1 < this.V.length; b1++) { if (this.V[b1])
/*      */         c(b1);  }  }
/*      */   public void keyPressed(int paramInt, char paramChar) { a(paramInt, true); if (this.b.i == null) { l.d("keyPressed: guiEngine==null"); return; }  this.b.i.a(paramInt, paramChar); }
/*      */   public void c(int paramInt) { keyReleased(paramInt, false); }
/* 1539 */   public void c(Graphics paramGraphics) { try { l.d("Saving screenshot");
/*      */       
/* 1541 */       String str1 = "screenshots";
/* 1542 */       File file = new File("screenshots");
/*      */       
/* 1544 */       if (!file.exists())
/*      */       {
/* 1546 */         file.mkdir();
/*      */       }
/* 1548 */       String str2 = "screenshot_" + f.a("d MMM yyyy HH.mm.ss") + ".png";
/*      */       
/* 1550 */       Image image = new Image(this.c.getWidth(), this.c.getHeight());
/* 1551 */       paramGraphics.copyArea(image, 0, 0);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1556 */       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/*      */ 
/*      */       
/* 1559 */       ImageOut.write(image, "png", byteArrayOutputStream);
/*      */ 
/*      */       
/* 1562 */       l.f(null, "Saving screenshot: " + str2);
/*      */ 
/*      */       
/* 1565 */       t$1 t$1 = new t$1(this, str2, byteArrayOutputStream);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1600 */       Thread thread = new Thread(t$1);
/* 1601 */       thread.start();
/*      */ 
/*      */ 
/*      */       
/*      */        }
/*      */     
/* 1607 */     catch (Exception exception)
/*      */     
/* 1609 */     { exception.printStackTrace();
/* 1610 */       l.m("Failed to take screenshot:" + exception.getMessage());
/*      */       return; }
/*      */      }
/*      */ 
/*      */   
/*      */   public void keyReleased(int paramInt, char paramChar) {
/*      */     a(paramInt, false);
/*      */     if (d()) {
/*      */       Integer integer = SlickToAndroidKeycodes.c(paramInt);
/*      */       if (integer != null) {
/*      */         this.b.p.processKeyUp(integer.intValue(), e());
/*      */       } else if (!Character.isISOControl(paramChar)) {
/*      */       
/*      */       } 
/*      */     } 
/*      */     if (this.e != null) {
/*      */       this.e.b(SlickToAndroidKeycodes.b(paramInt), false);
/*      */       return;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2) {
/*      */     this.E = paramInt1;
/*      */     this.F = paramInt2;
/*      */     g();
/*      */   }
/*      */   
/*      */   public void g() {
/*      */     if (this.l)
/*      */       return; 
/*      */     if (this.i)
/*      */       return; 
/*      */     try {
/*      */       boolean bool1 = this.e.by.slick2dFullScreen;
/*      */       boolean bool2 = this.e.by.slick2dBorderless;
/*      */       if (bool2)
/*      */         bool1 = true; 
/*      */       int i = this.E;
/*      */       int k = this.F;
/*      */       if (bool1) {
/*      */         i = this.c.getScreenWidth();
/*      */         k = this.c.getScreenHeight();
/*      */         String str = this.e.by.slick2dFullScreenResolution;
/*      */         if (str == null) {
/*      */           l.d("fullScreenResolutionString is null");
/*      */           str = "native";
/*      */         } 
/*      */         if (!str.equals("native")) {
/*      */           String[] arrayOfString = str.split("x");
/*      */           if (arrayOfString.length != 2) {
/*      */             l.b("Unknown resolution format:" + str);
/*      */           } else {
/*      */             Integer integer1 = f.l(arrayOfString[0]);
/*      */             Integer integer2 = f.l(arrayOfString[1]);
/*      */             if (integer1 == null || integer2 == null) {
/*      */               l.b("Bad resolution int:" + str);
/*      */             } else {
/*      */               i = integer1.intValue();
/*      */               k = integer2.intValue();
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       float f = 1.0F;
/*      */       if (i > 3360.0F || k > 1890.0F) {
/*      */         f = 2.0F;
/*      */       } else if (i > 2688.0F || k > 1512.0F) {
/*      */         f = 1.5F;
/*      */       } 
/*      */       f *= this.e.by.uiRenderScale;
/*      */       l.d("uiRenderScale:" + this.e.by.uiRenderScale);
/*      */       if (this.I == bool1 && this.J == bool2 && this.E == this.G && this.F == this.H && f.h(f, this.O))
/*      */         return; 
/*      */       int m = i;
/*      */       int n = k;
/*      */       boolean bool3 = (this.J != bool2) ? true : false;
/*      */       this.O = f;
/*      */       this.G = this.E;
/*      */       this.H = this.F;
/*      */       this.I = bool1;
/*      */       this.J = bool2;
/*      */       boolean bool4 = false;
/*      */       if (bool2 && bool1)
/*      */         bool4 = true; 
/*      */       System.setProperty("org.lwjgl.opengl.Window.undecorated", bool4 ? "true" : "false");
/*      */       if (bool1) {
/*      */         l.d("screen: " + this.c.getScreenWidth() + ", " + this.c.getScreenHeight());
/*      */         l.d("container: " + this.a.getWidth() + ", " + this.a.getHeight());
/*      */         if (bool2) {
/*      */           this.c.setDisplayMode(m, n, false);
/*      */         } else {
/*      */           this.c.setDisplayMode(m, n, true);
/*      */         } 
/*      */       } else {
/*      */         boolean bool = false;
/*      */         if (this.c.isFullscreen())
/*      */           bool = true; 
/*      */         if (bool3) {
/*      */           bool = true;
/*      */           if (m > 2 && n > 2)
/*      */             this.c.setDisplayMode(m - 1, n - 1, false); 
/*      */         } 
/*      */         if (bool) {
/*      */           this.c.setDisplayMode(m, n, false);
/*      */           Display.setResizable(false);
/*      */           Display.setResizable(true);
/*      */         } else {
/*      */           SGL sGL = Renderer.get();
/*      */           sGL.initDisplay(m, n);
/*      */           sGL.enterOrtho(m, n);
/*      */           Field field1 = GameContainer.class.getDeclaredField("width");
/*      */           field1.setAccessible(true);
/*      */           field1.set(this.c, Integer.valueOf(m));
/*      */           Field field2 = GameContainer.class.getDeclaredField("height");
/*      */           field2.setAccessible(true);
/*      */           field2.set(this.c, Integer.valueOf(n));
/*      */         } 
/*      */       } 
/*      */       this.P = Display.getWidth() / 2;
/*      */       this.Q = Display.getHeight() / 2;
/*      */       int i1 = (int)(m / this.O);
/*      */       int i2 = (int)(n / this.O);
/*      */       if (this.f != null) {
/*      */         this.f.a = i1;
/*      */         this.f.b = i2;
/*      */       } else {
/*      */         l.d("setResolution: gameView=null");
/*      */       } 
/*      */       if (this.e != null) {
/*      */         this.e.b(i1, i2);
/*      */         this.e.P();
/*      */       } else {
/*      */         l.d("setResolution: game=null");
/*      */       } 
/*      */       if (this.b != null && this.b.p != null) {
/*      */         this.b.p.setDimensions(i1, i2);
/*      */       } else {
/*      */         l.d("setResolution: main.libRocket=null");
/*      */       } 
/*      */     } catch (Exception exception) {
/*      */       exception.printStackTrace();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(String paramString, boolean paramBoolean) {
/*      */     if (!paramString.startsWith("Loading units "))
/*      */       l.d("--Now loading:" + paramString); 
/*      */     if (paramBoolean) {
/*      */       this.N = this.M;
/*      */       this.M = paramString;
/*      */     } 
/*      */     Graphics graphics = this.c.a();
/*      */     a((GameContainer)this.c, graphics);
/*      */     this.c.a(graphics);
/*      */   }
/*      */   
/*      */   public void a(GameContainer paramGameContainer, Graphics paramGraphics) {
/*      */     this.K += this.t;
/*      */     this.L++;
/*      */     paramGraphics.setColor(Color.black);
/*      */     paramGraphics.clear();
/*      */     if (this.m != null)
/*      */       paramGraphics.drawImage(this.m.z(), (Display.getWidth() / 2 - this.m.k / 2), (Display.getHeight() / 2 - this.m.l / 2)); 
/*      */     String str = "Loading";
/*      */     int i = this.L % 4;
/*      */     int k;
/*      */     for (k = 0; k <= i; k++)
/*      */       str = str + "."; 
/*      */     str = f.e("    " + str, 17);
/*      */     k = paramGraphics.getFont().getWidth(str);
/*      */     int m = Display.getHeight() - 70;
/*      */     paramGraphics.setColor(Color.white);
/*      */     paramGraphics.drawString(str, (Display.getWidth() / 2 - k / 2), m);
/*      */     paramGraphics.setColor(new Color(1.0F, 1.0F, 1.0F, 0.6F));
/*      */     k = paramGraphics.getFont().getWidth(this.M);
/*      */     paramGraphics.drawString(this.M, (Display.getWidth() / 2 - k / 2), (m + 20));
/*      */   }
/*      */   
/*      */   public void a(Graphics paramGraphics) {
/*      */     paramGraphics.pushTransform();
/*      */     paramGraphics.scale(this.O, this.O);
/*      */   }
/*      */   
/*      */   public void b(Graphics paramGraphics) {
/*      */     paramGraphics.popTransform();
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */