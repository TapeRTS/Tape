package com.corrodinggames.rts.gameFramework.gui;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/PopupWindow.class */
public class PopupWindow {
    String message;
    ArrayList<Option> options = new ArrayList<>();
    Rect _tempRect = new Rect();
    Paint textPaint = new Paint();

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/PopupWindow$Option.class */
    public abstract class Option {
        public Option() {
        }

        abstract String click();

        abstract String getText();
    }

    PopupWindow() {
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint.setTextSize(16.0f);
        this.textPaint.setAntiAlias(true);
        this.textPaint.setSubpixelText(true);
        this.textPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
    }

    public void draw() {
        GameEngine instance = GameEngine.getInstance();
        this._tempRect.left = (int) (instance.halfScreenWidth - 90);
        this._tempRect.right = (int) (instance.halfScreenWidth + 90);
        this._tempRect.top = (int) (instance.halfScreenHeight - 40.0f);
        this._tempRect.bottom = this._tempRect.top;
        instance.interfaceEngine.prepareTextBox(this.message, this._tempRect, this.textPaint);
        this._tempRect.bottom += 50;
        instance.graphics.drawRect(this._tempRect, instance.interfaceEngine.displayTextBackgroundPaintBorder);
        instance.graphics.drawRect(this._tempRect, instance.interfaceEngine.displayTextBackgroundPaint);
        instance.interfaceEngine.drawTextBox(this._tempRect, this.textPaint, this.textPaint);
    }
}
