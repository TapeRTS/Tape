/*     */ package com.corrodinggames.rts.gameFramework.d;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Intent;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.Menu;
/*     */ import android.view.MenuItem;
/*     */ import android.view.SubMenu;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ public class r
/*     */   implements Menu
/*     */ {
/*  15 */   public ArrayList a = new ArrayList();
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem add(CharSequence paramCharSequence) {
/*  20 */     s s = new s();
/*  21 */     s.setTitle(paramCharSequence);
/*  22 */     this.a.add(s);
/*  23 */     return s;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem add(int paramInt) {
/*  29 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
/*  35 */     s s = new s();
/*  36 */     s.setTitle(paramCharSequence);
/*  37 */     s.a(paramInt2);
/*  38 */     this.a.add(s);
/*  39 */     return s;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  45 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem) {
/*  53 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SubMenu addSubMenu(CharSequence paramCharSequence) {
/*  59 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SubMenu addSubMenu(int paramInt) {
/*  65 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
/*  71 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  77 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/*  83 */     this.a.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem getItem(int paramInt) {
/*  89 */     return this.a.get(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/*  95 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem findItem(int paramInt) {
/* 101 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasVisibleItems() {
/* 109 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent) {
/* 115 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean performIdentifierAction(int paramInt1, int paramInt2) {
/* 121 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
/* 127 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeGroup(int paramInt) {
/* 133 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeItem(int paramInt) {
/* 139 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
/* 145 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGroupEnabled(int paramInt, boolean paramBoolean) {
/* 151 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGroupVisible(int paramInt, boolean paramBoolean) {
/* 157 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQwertyMode(boolean paramBoolean) {
/* 163 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/* 169 */     return this.a.size();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */