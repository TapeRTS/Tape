package com.corrodinggames.rts.game;

import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/game/CharacterController.class */
public abstract class CharacterController {
    int walking = 0;
    boolean jump = false;
    boolean action = false;
    boolean down = false;

    /* loaded from: classes.jar:com/corrodinggames/rts/game/CharacterController$NPCController.class */
    static class NPCController extends CharacterController {
        float timer = 30.0f;
        int mode = 0;

        NPCController() {
        }

        @Override // com.corrodinggames.rts.game.CharacterController
        public void update(float f) {
            this.timer -= f;
            if (this.timer < 0.0f) {
                this.timer = 60.0f;
                this.mode++;
            }
            this.walking = 0;
            if (this.mode == 2) {
                this.walking = 1;
            }
            if (this.mode == 4) {
                this.walking = -1;
            }
            if (this.mode == 5) {
                this.mode = 0;
            }
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/game/CharacterController$PlayerController.class */
    public static class PlayerController extends CharacterController {
        @Override // com.corrodinggames.rts.game.CharacterController
        public void update(float f) {
            boolean[] keyState = GameEngine.getInstance().getKeyState();
            this.walking = 0;
            this.jump = false;
            this.action = false;
            this.down = false;
            GameEngine instance = GameEngine.getInstance();
            if (!instance.map.mapEditorOn) {
                if (keyState[instance.settings.keyRight] || instance.trackPadXSpeed > 0.2d) {
                    this.walking = 1;
                }
                if (keyState[instance.settings.keyLeft] || instance.trackPadXSpeed < -0.2d) {
                    this.walking = -1;
                }
                if (instance.settings.onscreenControls && instance.isTouching()) {
                    for (int i = 0; i < instance.getNumTouchPoints(); i++) {
                        int touchX = (int) instance.getTouchX(i);
                        int touchY = (int) instance.getTouchY(i);
                        Rect rect = new Rect(130, 0, 240, 180);
                        rect.offset(instance.onscreendpadx, instance.onscreendpady);
                        Rect rect2 = new Rect(0, 0, 70, 180);
                        rect2.offset(instance.onscreendpadx, instance.onscreendpady);
                        Rect rect3 = new Rect(0, 0, 200, 68);
                        rect3.offset(instance.onscreendpadx, instance.onscreendpady);
                        Rect rect4 = new Rect(0, NetworkEngine.PACKET_SEND_CHAT_TO_SERVER, 200, 200);
                        rect4.offset(instance.onscreendpadx, instance.onscreendpady);
                        Rect rect5 = new Rect(-10, -10, 100, 100);
                        rect5.offset(instance.onscreenActionX, instance.onscreenActionY);
                        if (rect.contains(touchX, touchY)) {
                            this.walking = 1;
                            instance.touchActive[i] = false;
                        }
                        if (rect2.contains(touchX, touchY)) {
                            this.walking = -1;
                            instance.touchActive[i] = false;
                        }
                        if (rect3.contains(touchX, touchY)) {
                            this.jump = true;
                            instance.touchActive[i] = false;
                        }
                        if (rect4.contains(touchX, touchY)) {
                            this.down = true;
                            instance.touchActive[i] = false;
                        }
                        if (rect5.contains(touchX, touchY)) {
                            this.action = true;
                            instance.touchActive[i] = false;
                        }
                    }
                }
                if (keyState[instance.settings.keyJump] || instance.trackPadYSpeed < -0.3d) {
                    this.jump = true;
                }
                if (keyState[instance.settings.keyAction] || instance.trackPadAction) {
                    this.action = true;
                }
                if (keyState[instance.settings.keyDown] || instance.trackPadYSpeed > 0.3d) {
                    this.down = true;
                }
            }
        }
    }

    public int getWalking() {
        return this.walking;
    }

    public boolean isAction() {
        return this.action;
    }

    public boolean isDown() {
        return this.down;
    }

    public boolean isJump() {
        return this.jump;
    }

    public void setAction(boolean z) {
        this.action = z;
    }

    public void setJump(boolean z) {
        this.jump = z;
    }

    public void setWalking(int i) {
        this.walking = i;
    }

    public abstract void update(float f);
}
