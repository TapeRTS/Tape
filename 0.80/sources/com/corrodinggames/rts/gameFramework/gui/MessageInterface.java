package com.corrodinggames.rts.gameFramework.gui;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/MessageInterface.class */
public class MessageInterface {
    GameEngine game;
    InterfaceEngine interfaceEngine;
    Paint messageTextPaint;
    ArrayList<MessageItem> messages = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/MessageInterface$MessageItem.class */
    public class MessageItem {
        String message;
        String player;
        long startTime;

        MessageItem() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageInterface(GameEngine gameEngine, InterfaceEngine interfaceEngine) {
        this.interfaceEngine = interfaceEngine;
        this.game = gameEngine;
        init();
    }

    public void addMessage(String str, String str2) {
        MessageItem messageItem = new MessageItem();
        messageItem.player = str;
        messageItem.message = str2;
        messageItem.startTime = System.currentTimeMillis();
        this.messages.add(messageItem);
    }

    public void init() {
        this.messageTextPaint = new Paint();
        this.messageTextPaint.setARGB(255, 255, 255, 255);
        this.messageTextPaint.setAntiAlias(true);
        this.messageTextPaint.setSubpixelText(true);
        this.messageTextPaint.setTextSize(18.0f);
        this.messageTextPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
    }

    public void showMessages(float f) {
        Iterator<MessageItem> it = this.messages.iterator();
        while (it.hasNext()) {
            if (it.next().startTime + 9000 < System.currentTimeMillis()) {
                it.remove();
            }
        }
        int i = 55;
        Iterator<MessageItem> it2 = this.messages.iterator();
        while (it2.hasNext()) {
            MessageItem next = it2.next();
            this.game.graphics.drawText((next.player == null || next.player.equals("")) ? next.message : String.valueOf(next.player) + ": " + next.message, 20, i, this.messageTextPaint);
            i += 20;
        }
    }
}
