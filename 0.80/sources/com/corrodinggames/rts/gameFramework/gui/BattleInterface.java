package com.corrodinggames.rts.gameFramework.gui;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.ActiveUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommandController;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.gui.InterfaceEngine;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/BattleInterface.class */
public class BattleInterface {
    GameEngine game;
    boolean holdingZoom;
    float holdingZoomStartTouchY;
    InterfaceEngine interfaceEngine;
    Unit.SpecialAction specialActionPopup_action;
    Unit specialActionPopup_unit;
    Paint unitSelectedTextPaint;
    static Paint button_zoom_paint = new Paint();
    static PorterDuffColorFilter button_zoom_colorFilter = new PorterDuffColorFilter(Color.rgb(200, 255, 200), PorterDuff.Mode.MULTIPLY);
    public Rect boxSelectRect = new Rect();
    Paint boxSelectPaint = new Paint();
    public boolean boxSelectWasActive = false;
    Paint _paint = new Paint();
    Rect _rect = new Rect();
    Rect _rect2 = new Rect();
    BitmapOrTexture button_zoom = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BattleInterface(GameEngine gameEngine, InterfaceEngine interfaceEngine) {
        this.interfaceEngine = interfaceEngine;
        this.game = gameEngine;
        init();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void boxSelectInterface(float f) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        if (this.game.isTouching() && this.game.getNumTouchPoints() == 2 && this.interfaceEngine.orderBuilding == null) {
            this.boxSelectRect.left = (int) this.game.getTouchX(0);
            this.boxSelectRect.top = (int) this.game.getTouchY(0);
            this.boxSelectRect.right = (int) this.game.getTouchX(1);
            this.boxSelectRect.bottom = (int) this.game.getTouchY(1);
            CommonUtils.fixRect(this.boxSelectRect);
            this.boxSelectPaint.setColor(Color.argb(255, 0, 255, 0));
            this.boxSelectPaint.setStyle(Paint.Style.STROKE);
            this.boxSelectPaint.setStrokeWidth(1.0f);
            this.game.graphics.getCanvas().drawRect(this.boxSelectRect, this.boxSelectPaint);
            if (Math.abs(this.boxSelectRect.left - this.boxSelectRect.right) <= 2 || Math.abs(this.boxSelectRect.top - this.boxSelectRect.bottom) <= 2) {
                this.boxSelectWasActive = false;
            } else {
                this.boxSelectWasActive = true;
            }
        }
        if (this.boxSelectWasActive && !this.game.isTouching()) {
            this.boxSelectWasActive = false;
            this.boxSelectRect.bottom = (int) (rect.bottom / this.game.viewpointZoom);
            this.boxSelectRect.top = (int) (rect2.top / this.game.viewpointZoom);
            this.boxSelectRect.left = (int) (rect3.left / this.game.viewpointZoom);
            this.boxSelectRect.right = (int) (rect4.right / this.game.viewpointZoom);
            this.boxSelectRect.offset(this.game.viewpointXAsInt, this.game.viewpointYAsInt);
            this.interfaceEngine.blockTouchDelay = 4.0f;
            this.interfaceEngine.selectNone();
            Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
            while (it.hasNext()) {
                GameObject next = it.next();
                if (next instanceof ActiveUnit) {
                    ActiveUnit activeUnit = (ActiveUnit) next;
                    if (!activeUnit.dead && activeUnit.transportedBy == null && activeUnit.team == this.game.playerTeam && this.boxSelectRect.contains((int) activeUnit.x, (int) activeUnit.y)) {
                        activeUnit.selected = true;
                        this.interfaceEngine.numberOfSelectedUnits++;
                    }
                }
            }
            this.interfaceEngine.finaliseBoxSelect();
        }
    }

    public void init() {
        this.button_zoom = this.game.graphics.loadImage(R.drawable.zoom_button);
        button_zoom_paint.setARGB(255, 30, 30, 30);
        button_zoom_paint.setColorFilter(button_zoom_colorFilter);
        this.unitSelectedTextPaint = new Paint();
        this.unitSelectedTextPaint.setARGB(255, 255, 255, 255);
        this.unitSelectedTextPaint.setTextAlign(Paint.Align.LEFT);
        this.unitSelectedTextPaint.setSubpixelText(true);
        this.unitSelectedTextPaint.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void selectedUnitsInterface(float f) {
        UnitType[] values;
        int i;
        if (this.interfaceEngine.numberOfSelectedUnits > 0) {
            float limit = CommonUtils.limit(this.game.screenHeight / 12.0f, 30.0f, 50.0f);
            if (this.interfaceEngine.addButton((int) ((this.game.screenWidth - this.game.minimapHandler.screenXSize) + 2.0f), this.game.minimapHandler.getBottomEdge() + 2, (int) (this.game.minimapHandler.screenXSize - 4.0f), (int) limit, "Unselect All", InterfaceEngine.ButtonIds.unselectAllButton, false)) {
                this.interfaceEngine.selectNone();
            }
            int[] iArr = new int[UnitType.values().length];
            Iterator<Unit> it = Unit.fastUnitList.iterator();
            while (it.hasNext()) {
                Unit next = it.next();
                if (next.selected && next.team == this.game.playerTeam) {
                    int ordinal = next.getUnitType().ordinal();
                    iArr[ordinal] = iArr[ordinal] + 1;
                }
            }
            float bottomEdge = this.game.minimapHandler.getBottomEdge() + limit + 30.0f;
            float f2 = this.game.screenWidth;
            float f3 = this.game.sidebarWidth;
            for (UnitType unitType : UnitType.values()) {
                bottomEdge = bottomEdge;
                if (iArr[unitType.ordinal()] > 0) {
                    if (this.interfaceEngine.addButton((int) ((f2 - f3) + 10.0f), (int) bottomEdge, ((int) this.game.sidebarWidth) - 20, 30, String.valueOf(i) + "x " + unitType.getText(), InterfaceEngine.ButtonIds.none, false, Color.argb(50, 100, 100, 100))) {
                        Iterator<Unit> it2 = Unit.fastUnitList.iterator();
                        while (it2.hasNext()) {
                            Unit next2 = it2.next();
                            if (next2.selected && next2.team == this.game.playerTeam && next2.getUnitType() != unitType) {
                                this.interfaceEngine.unselectUnit(next2);
                            }
                        }
                    }
                    bottomEdge += 35.0f;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean specialActionInterface(float f) {
        boolean z;
        Unit unit = null;
        Iterator<Unit> it = Unit.fastUnitList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Unit next = it.next();
            if (next.selected && next.team == this.game.playerTeam) {
                if (unit == null) {
                    unit = next;
                } else if (unit.getUnitType() != next.getUnitType()) {
                    unit = null;
                    break;
                }
            }
        }
        boolean z2 = false;
        if (unit != null) {
            int numSpecialActions = unit.numSpecialActions();
            z2 = false;
            if (numSpecialActions > 0) {
                float limit = CommonUtils.limit(this.game.screenHeight / 12.0f, 30.0f, 50.0f);
                float f2 = this.game.minimapHandler.screenXSize;
                float bottomEdge = this.game.minimapHandler.getBottomEdge() + 2;
                z2 = true;
                for (int i = 0; i < numSpecialActions; i++) {
                    Unit.SpecialAction specialAction = unit.getSpecialAction(i);
                    this._rect.left = (int) ((this.game.screenWidth - f2) + 2.0f);
                    this._rect.right = (int) (this.game.screenWidth - 2.0f);
                    this._rect.top = (int) ((i * (limit + 2.0f)) + bottomEdge);
                    this._rect.bottom = (int) (this._rect.top + limit);
                    this._paint.reset();
                    boolean specialActionActive = unit.getSpecialActionActive(i);
                    if (specialActionActive) {
                        this._paint.setColor(Color.argb((int) NetworkEngine.PACKET_SEND_CHAT_TO_SERVER, 100, 100, 100));
                    } else {
                        this._paint.setColor(Color.argb(100, 170, 100, 100));
                    }
                    this.game.graphics.getCanvas().drawRect(this._rect, this._paint);
                    this._paint.setColor(Color.argb(255, 0, 0, 0));
                    this._paint.setStyle(Paint.Style.STROKE);
                    this._paint.setStrokeWidth(1.0f);
                    this.game.graphics.getCanvas().drawRect(this._rect, this._paint);
                    this._paint.reset();
                    String buttonText = specialAction.getButtonText(unit);
                    this.interfaceEngine.smallTextPaint.getTextBounds(buttonText, 0, buttonText.length(), this._rect2);
                    this.game.graphics.drawText(buttonText, this._rect.exactCenterX(), this._rect.exactCenterY(), this.interfaceEngine.smallTextPaint);
                    if ((this.interfaceEngine.gameTouchClick || this.interfaceEngine.gameTouching) && this._rect.contains((int) this.interfaceEngine.gameTouchLastX, (int) this.interfaceEngine.gameTouchLastY) && this.interfaceEngine.gameTouchClick) {
                        this.interfaceEngine.gameTouchClick = false;
                        if (specialAction.getCreatedUnitType() == null) {
                            if (!specialAction.showPopupWindow()) {
                                z = true;
                            } else {
                                z = false;
                                if (this.specialActionPopup_unit == unit) {
                                    z = false;
                                    if (this.specialActionPopup_action == specialAction) {
                                        z = true;
                                    }
                                }
                                this.specialActionPopup_unit = unit;
                                this.specialActionPopup_action = specialAction;
                            }
                            if (z) {
                                if (!specialActionActive) {
                                    this.game.audio.playSound(AudioEngine.interface_error, 0.8f);
                                } else {
                                    this.game.audio.playSound(AudioEngine.interface_click, 0.5f);
                                    CommandController.Command createNewCommand = this.game.commandController.createNewCommand(this.game.playerTeam);
                                    this.interfaceEngine.addSelectedToCommand(createNewCommand);
                                    createNewCommand.setSpecialAction(specialAction.getIndex());
                                }
                            }
                        } else if (!specialActionActive) {
                            this.game.audio.playSound(AudioEngine.interface_error, 0.8f);
                        } else {
                            this.game.audio.playSound(AudioEngine.interface_click, 0.5f);
                            this.interfaceEngine.orderBuildingSrc = unit;
                            this.interfaceEngine.orderBuildingSpecialAction = specialAction;
                            this.interfaceEngine.orderBuilding = specialAction.getCreatedUnitType();
                            this.interfaceEngine.orderBuildingPreviewDelay = 0.0f;
                            this.interfaceEngine.orderBuildingLastClickX = -99.0f;
                            this.interfaceEngine.orderBuildingLastClickY = -99.0f;
                            if (!this.interfaceEngine.orderBuildingPreviewShow) {
                                this.interfaceEngine.orderBuildingPreviewX = this.game.halfViewpointWidth;
                                this.interfaceEngine.orderBuildingPreviewY = this.game.halfViewpointHeight;
                            }
                            this.interfaceEngine.orderBuildingPreviewShow = true;
                            this.game.map.addBuildingGridToBuffer();
                        }
                    }
                }
            }
        }
        if (unit == null || unit != this.specialActionPopup_unit) {
            this.specialActionPopup_unit = null;
        } else if (this.interfaceEngine.drawSpecialActionInfoBox(this.specialActionPopup_action, true, this.specialActionPopup_unit)) {
            this.specialActionPopup_unit = null;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zoomInterface(float f) {
        int i = (int) this.game.halfScreenHeight;
        if (this.holdingZoom) {
            this._rect.set(50 - 4, i - 50, 50 + 4, i + 50);
            this._paint.reset();
            this._paint.setColor(Color.argb(255, 0, 0, 0));
            this.game.graphics.getCanvas().drawRect(this._rect, this._paint);
        }
        int i2 = this.game.changeViewpointZoomTo > 1.0f ? (int) (i - ((this.game.changeViewpointZoomTo - 1.0f) * 6.0f)) : (int) (i + (((1.0f / this.game.changeViewpointZoomTo) - 1.0f) * 15.0f));
        this._rect.set(50 - 30, i2 - 20, 50 + 30, i2 + 20);
        if (!this.holdingZoom) {
            button_zoom_paint.setARGB(200, 255, 255, 255);
        } else {
            button_zoom_paint.setARGB(255, 255, 255, 255);
        }
        this.game.graphics.drawImage(this.button_zoom, this._rect.left, this._rect.top, button_zoom_paint);
        if (!this.holdingZoom && this.interfaceEngine.getPressButtonState(this._rect.left, this._rect.top, this._rect.width(), this._rect.height(), InterfaceEngine.ButtonIds.zoomButton)) {
            this.holdingZoom = true;
            this.holdingZoomStartTouchY = this.interfaceEngine.gameTouchLastY;
        }
        if (!this.interfaceEngine.gameTouching) {
            this.holdingZoom = false;
        }
        if (this.holdingZoom) {
            this.interfaceEngine.catchTouch();
            float f2 = this.interfaceEngine.gameTouchLastY - this.holdingZoomStartTouchY;
            float f3 = f2;
            if (f2 > 90.0f) {
                f3 = 90.0f;
            }
            float f4 = f3;
            if (f3 < -90.0f) {
                f4 = -90.0f;
            }
            if (f4 > 2.0f) {
                boolean z = false;
                if (this.game.changeViewpointZoomTo * this.game.map.getWidthInPixels() < this.game.viewpointWidthUnscaled) {
                    z = false;
                    if (this.game.changeViewpointZoomTo * this.game.map.getHeightInPixels() < this.game.viewpointHeightUnscaled) {
                        z = true;
                    }
                }
                if (!z) {
                    this.game.changeViewpointZoomTo -= (5.0E-4f * CommonUtils.abs(f4)) * f;
                }
            } else if (f4 < -2.0f) {
                this.game.changeViewpointZoomTo += 5.0E-4f * CommonUtils.abs(f4) * f;
                if (this.game.changeViewpointZoomTo > 3.0f) {
                    this.game.changeViewpointZoomTo = 3.0f;
                }
            }
        }
    }
}
