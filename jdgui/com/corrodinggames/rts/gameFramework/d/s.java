/*     */ package com.corrodinggames.rts.gameFramework.d;
/*     */ 
/*     */ import android.content.Intent;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.view.ActionProvider;
/*     */ import android.view.ContextMenu;
/*     */ import android.view.MenuItem;
/*     */ import android.view.SubMenu;
/*     */ import android.view.View;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class s
/*     */   implements MenuItem
/*     */ {
/*     */   CharSequence a;
/*     */   Drawable b;
/*     */   int c;
/*     */   
/*     */   public MenuItem setTitle(CharSequence paramCharSequence) {
/*  23 */     this.a = paramCharSequence;
/*  24 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getTitle() {
/*  30 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setIcon(Drawable paramDrawable) {
/*  37 */     this.b = paramDrawable;
/*  38 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setIcon(int paramInt) {
/*  44 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable getIcon() {
/*  50 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getItemId() {
/*  57 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem a(int paramInt) {
/*  63 */     this.c = paramInt;
/*  64 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean collapseActionView() {
/*  75 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean expandActionView() {
/*  81 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ActionProvider getActionProvider() {
/*  87 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public View getActionView() {
/*  93 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public char getAlphabeticShortcut() {
/*  99 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGroupId() {
/* 105 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Intent getIntent() {
/* 113 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ContextMenu.ContextMenuInfo getMenuInfo() {
/* 121 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public char getNumericShortcut() {
/* 127 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrder() {
/* 133 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SubMenu getSubMenu() {
/* 139 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getTitleCondensed() {
/* 145 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasSubMenu() {
/* 151 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isActionViewExpanded() {
/* 157 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCheckable() {
/* 163 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isChecked() {
/* 169 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEnabled() {
/* 175 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isVisible() {
/* 181 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setActionProvider(ActionProvider paramActionProvider) {
/* 187 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setActionView(View paramView) {
/* 193 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setActionView(int paramInt) {
/* 199 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setAlphabeticShortcut(char paramChar) {
/* 205 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setCheckable(boolean paramBoolean) {
/* 211 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setChecked(boolean paramBoolean) {
/* 217 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setEnabled(boolean paramBoolean) {
/* 223 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setIntent(Intent paramIntent) {
/* 231 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setNumericShortcut(char paramChar) {
/* 237 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
/* 243 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
/* 250 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setShortcut(char paramChar1, char paramChar2) {
/* 256 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShowAsAction(int paramInt) {
/* 262 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setShowAsActionFlags(int paramInt) {
/* 268 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setTitle(int paramInt) {
/* 275 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
/* 281 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MenuItem setVisible(boolean paramBoolean) {
/* 287 */     throw new RuntimeException("not Implemented");
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */