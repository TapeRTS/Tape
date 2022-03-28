package com.corrodinggames.rts.gameFramework.gui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.ActiveUnit;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.land.Hovercraft;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommandController;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EffectEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/InterfaceEngine.class */
public final class InterfaceEngine {
    BattleInterface battleInterface;
    public Paint creditTextPaint;
    Paint displayTextBackgroundPaint;
    Paint displayTextBackgroundPaintBorder;
    Paint displayTextCountPaint;
    Paint displayTextPaint;
    Paint displayTextTitlePaint;
    boolean gameTouchOnBattlefield;
    public Unit lastSingleSelectedUnit;
    public float lastSingleSelectedUnit_timer;
    public MessageInterface messageInterface;
    public int numberOfSelectedUnits;
    public UnitType orderBuilding;
    public float orderBuildingLastClickX;
    public float orderBuildingLastClickY;
    public float orderBuildingPreviewDelay;
    public boolean orderBuildingPreviewShow;
    public float orderBuildingPreviewX;
    public float orderBuildingPreviewY;
    public Unit.SpecialAction orderBuildingSpecialAction;
    public Unit orderBuildingSrc;
    public Paint selectPaint;
    public Paint smallTextPaint;
    public boolean touchOverInterfaceButton;
    float gameTouchTimer = 0.0f;
    float gameTouchLastX = 0.0f;
    float gameTouchLastY = 0.0f;
    boolean gameTouchLast = false;
    boolean gameTouching = false;
    boolean gameTouchStartedOnMap = false;
    float gameTouchStartX = 0.0f;
    float gameTouchStartY = 0.0f;
    float gameTouchScrollX = 0.0f;
    float gameTouchScrollY = 0.0f;
    float gameTouchScrollXSpeed = 0.0f;
    float gameTouchScrollYSpeed = 0.0f;
    boolean gameTouchMoved = false;
    boolean gameTouchClick = false;
    boolean gameTouchPress = false;
    public float blockTouchDelay = 0.0f;
    BitmapOrTexture button_no = null;
    BitmapOrTexture button_yes = null;
    BitmapOrTexture button_add = null;
    BitmapOrTexture button_subtract = null;
    BitmapOrTexture background_tiled = null;
    ArrayList<String> displayTextLines = new ArrayList<>();
    Rect tempRect = new Rect();
    Rect _tempRect2 = new Rect();
    Rect _rect = new Rect();
    Rect _rect2 = new Rect();
    Paint _paint = new Paint();
    Paint _blankPaint = new Paint();

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/InterfaceEngine$ButtonIds.class */
    public enum ButtonIds {
        none,
        zoomButton,
        unselectAllButton
    }

    public boolean addButton(int i, int i2, int i3, int i4, String str, ButtonIds buttonIds, boolean z) {
        return addButton(i, i2, i3, i4, str, buttonIds, z, Color.argb((int) NetworkEngine.PACKET_SEND_CHAT_TO_SERVER, 100, 100, 100));
    }

    public boolean addButton(int i, int i2, int i3, int i4, String str, ButtonIds buttonIds, boolean z, int i5) {
        drawButton(i, i2, i3, i4, str, i5);
        return getButtonState(i, i2, i3, i4, buttonIds, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addSelectedToCommand(CommandController.Command command) {
        GameEngine instance = GameEngine.getInstance();
        Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject next = it.next();
            if (next instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) next;
                if (orderableUnit.selected && instance.playerTeam == orderableUnit.team) {
                    command.addUnit(orderableUnit);
                }
            }
        }
    }

    public boolean canTransportSelectedUnits(Unit unit) {
        boolean z;
        if (numberOfUnitsSelected() == 0) {
            z = false;
        } else {
            GameEngine instance = GameEngine.getInstance();
            Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                GameObject next = it.next();
                if (next instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) next;
                    if (orderableUnit.selected && orderableUnit.team == instance.playerTeam && unit.canBeTransported(orderableUnit)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public void catchTouch() {
        this.gameTouchClick = false;
        this.gameTouchPress = false;
        this.gameTouching = false;
    }

    public boolean doPickActions(Unit unit) {
        boolean z;
        GameEngine instance = GameEngine.getInstance();
        if (unit.team == instance.playerTeam) {
            if (unit.team == instance.playerTeam) {
                if ((unit instanceof Building) && ((unit.hp < unit.maxHp || unit.built < 1.0f) && numberOfUnitsSelected() != 0)) {
                    boolean z2 = true;
                    Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
                    while (it.hasNext()) {
                        GameObject next = it.next();
                        if (next instanceof ActiveUnit) {
                            OrderableUnit orderableUnit = (OrderableUnit) next;
                            if (orderableUnit.selected && !(orderableUnit instanceof Builder)) {
                                z2 = false;
                            }
                        }
                    }
                    if (z2) {
                        giveRepairOrder(unit);
                        z = true;
                    }
                }
                if ((unit instanceof Hovercraft) && canTransportSelectedUnits(unit)) {
                    giveLoadIntoOrder(unit);
                    z = true;
                }
            }
            z = false;
        } else if (hasAttackingUnitsSelected()) {
            giveAttackOrder(unit);
            z = true;
        } else {
            selectNone();
            unit.selected = true;
            this.numberOfSelectedUnits++;
            z = true;
        }
        return z;
    }

    public void draw(float f) {
        GameEngine instance = GameEngine.getInstance();
        this._rect.set((int) (instance.screenWidth - instance.sidebarWidth), 0, (int) instance.screenWidth, (int) instance.screenHeight);
        instance.graphics.tileImage(this.background_tiled, this._rect, null);
        this._paint.reset();
        this._paint.setColor(Color.argb(255, 0, 0, 0));
        this._paint.setStyle(Paint.Style.STROKE);
        instance.graphics.getCanvas().drawRect(this._rect, this._paint);
        instance.graphics.drawText("$" + String.valueOf(instance.playerTeam.credits), (instance.screenWidth - instance.sidebarWidth) - 60.0f, 20.0f, this.creditTextPaint);
    }

    public void drawButton(int i, int i2, int i3, int i4, String str, int i5) {
        GameEngine instance = GameEngine.getInstance();
        this._rect.set(i, i2, i + i3, i2 + i4);
        this._paint.reset();
        this._paint.setColor(i5);
        instance.graphics.getCanvas().drawRect(this._rect, this._paint);
        this._paint.setColor(Color.argb(255, 0, 0, 0));
        this._paint.setStyle(Paint.Style.STROKE);
        this._paint.setStrokeWidth(1.0f);
        instance.graphics.getCanvas().drawRect(this._rect, this._paint);
        this._paint.reset();
        instance.graphics.drawText(str, this._rect.centerX(), this._rect.centerY() + 5, this.smallTextPaint);
    }

    public boolean drawSpecialActionInfoBox(Unit.SpecialAction specialAction, boolean z, Unit unit) {
        boolean z2;
        int queueCount;
        GameEngine instance = GameEngine.getInstance();
        String infoBoxText = specialAction.getInfoBoxText();
        if (infoBoxText != null) {
            this.tempRect.left = 20;
            this.tempRect.right = (int) ((instance.screenWidth - instance.sidebarWidth) - 20);
            this.tempRect.top = z ? (int) (instance.halfScreenHeight - 40.0f) : 60;
            this.tempRect.bottom = this.tempRect.top;
            prepareTextBox(infoBoxText, this.tempRect, this.displayTextPaint);
            this._tempRect2.set(this.tempRect);
            this._tempRect2.top -= 20;
            this._tempRect2.bottom += 15;
            if (unit != null) {
                this._tempRect2.bottom += 70;
            }
            instance.graphics.drawRect(this._tempRect2, this.displayTextBackgroundPaintBorder);
            instance.graphics.drawRect(this._tempRect2, this.displayTextBackgroundPaint);
            drawTextBox(this.tempRect, this.displayTextTitlePaint, this.displayTextPaint);
            if (!(unit == null || (queueCount = specialAction.queueCount(unit)) == -1)) {
                instance.graphics.drawText(new StringBuilder().append(queueCount).toString(), this._tempRect2.centerX(), this._tempRect2.bottom - 30, this.displayTextCountPaint);
                int centerX = (this._tempRect2.centerX() - 50) - 40;
                int i = this._tempRect2.bottom - 60;
                this._rect2.set(centerX, i, centerX + 50, i + 50);
                instance.graphics.drawImage(this.button_add, this._rect2.left, this._rect2.top, (Paint) null);
                boolean z3 = false;
                if (this.gameTouchClick) {
                    z3 = false;
                    if (!this.gameTouchMoved) {
                        z3 = false;
                        if (this._rect2.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
                            this.gameTouchClick = false;
                            z3 = true;
                        }
                    }
                }
                int centerX2 = this._tempRect2.centerX() + 40;
                int i2 = this._tempRect2.bottom - 60;
                this._rect2.set(centerX2, i2, centerX2 + 50, i2 + 50);
                instance.graphics.drawImage(this.button_subtract, this._rect2.left, this._rect2.top, (Paint) null);
                boolean z4 = false;
                if (this.gameTouchClick) {
                    z4 = false;
                    if (!this.gameTouchMoved) {
                        z4 = false;
                        if (this._rect2.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
                            this.gameTouchClick = false;
                            z4 = true;
                        }
                    }
                }
                if (z3) {
                    instance.audio.playSound(AudioEngine.interface_click, 0.5f);
                    CommandController.Command createNewCommand = instance.commandController.createNewCommand(instance.playerTeam);
                    addSelectedToCommand(createNewCommand);
                    createNewCommand.setSpecialAction(specialAction.getIndex());
                }
                if (z4) {
                    instance.audio.playSound(AudioEngine.interface_click, 0.5f);
                    CommandController.Command createNewCommand2 = instance.commandController.createNewCommand(instance.playerTeam);
                    addSelectedToCommand(createNewCommand2);
                    createNewCommand2.stopOrUndo = true;
                    createNewCommand2.setSpecialAction(specialAction.getIndex());
                }
                if (!z3 && !z4 && this.gameTouchClick && !this.gameTouchMoved && !this._tempRect2.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
                    z2 = true;
                    return z2;
                }
            }
        }
        z2 = false;
        return z2;
    }

    public void drawTextBox(Rect rect, Paint paint, Paint paint2) {
        GameEngine instance = GameEngine.getInstance();
        int i = 0;
        Iterator<String> it = this.displayTextLines.iterator();
        while (it.hasNext()) {
            instance.graphics.drawText(it.next(), rect.centerX(), rect.top + (i * 20), i == 0 ? paint : paint2);
            i++;
        }
    }

    public void finaliseBoxSelect() {
    }

    public boolean getButtonState(int i, int i2, int i3, int i4, ButtonIds buttonIds, boolean z) {
        this._rect.set(i, i2, i + i3, i2 + i4);
        return ((z && this.gameTouching) || this.gameTouchClick) && this._rect.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY);
    }

    public boolean getPressButtonState(int i, int i2, int i3, int i4, ButtonIds buttonIds) {
        this._rect.set(i, i2, i + i3, i2 + i4);
        return this.gameTouchPress && this._rect.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY);
    }

    public Unit getUnitAtPoint(float f, float f2) {
        GameEngine instance = GameEngine.getInstance();
        Unit unit = null;
        float f3 = -1.0f;
        float f4 = 10.0f / instance.viewpointZoom;
        Iterator<Unit> it = Unit.fastUnitList.iterator();
        while (it.hasNext()) {
            Unit next = it.next();
            if (!next.dead && next.transportedBy == null) {
                float distanceSq = CommonUtils.distanceSq(f, f2, next.x, next.y);
                float f5 = next.radius + f4;
                if (distanceSq < f5 * f5 && (unit == null || distanceSq < f3)) {
                    unit = next;
                    f3 = distanceSq;
                }
            }
        }
        if (!(unit == null || unit.team == instance.playerTeam || unit.notInFogOfWarForPlayer())) {
            unit = null;
        }
        return unit;
    }

    public void giveAttackOrder(Unit unit) {
        GameEngine instance = GameEngine.getInstance();
        CommandController.Command createNewCommand = instance.commandController.createNewCommand(instance.playerTeam);
        addSelectedToCommand(createNewCommand);
        createNewCommand.setAttackWaypoint(unit);
        instance.audio.playSound(AudioEngine.interface_move, 0.2f);
        EffectEngine.EffectObject emitEffect = instance.effects.emitEffect(unit.x, unit.y, 0.0f, EffectEngine.EffectType.custom, true);
        if (emitEffect != null) {
            emitEffect.frameIndex = 9;
            emitEffect.timer = 25.0f;
            emitEffect.startTimer = emitEffect.timer;
            emitEffect.fadeOut = true;
            emitEffect.startingAlpha = 2.0f;
        }
    }

    public void giveLoadIntoOrder(Unit unit) {
        GameEngine instance = GameEngine.getInstance();
        CommandController.Command createNewCommand = instance.commandController.createNewCommand(instance.playerTeam);
        addSelectedToCommand(createNewCommand);
        createNewCommand.setLoadIntoWaypoint(unit);
        instance.audio.playSound(AudioEngine.interface_move, 0.2f);
        EffectEngine.EffectObject emitEffect = instance.effects.emitEffect(unit.x, unit.y, 0.0f, EffectEngine.EffectType.custom, true);
        if (emitEffect != null) {
            emitEffect.frameIndex = 11;
            emitEffect.timer = 25.0f;
            emitEffect.startTimer = emitEffect.timer;
            emitEffect.fadeOut = true;
            emitEffect.startingAlpha = 2.0f;
        }
    }

    public void giveMoveOrder(float f, float f2) {
        GameEngine instance = GameEngine.getInstance();
        CommandController.Command createNewCommand = instance.commandController.createNewCommand(instance.playerTeam);
        addSelectedToCommand(createNewCommand);
        createNewCommand.setMoveWaypoint(f, f2);
        instance.audio.playSound(AudioEngine.interface_move, 0.2f);
        EffectEngine.EffectObject emitEffect = instance.effects.emitEffect(f, f2, 0.0f, EffectEngine.EffectType.custom, true);
        if (emitEffect != null) {
            emitEffect.frameIndex = 8;
            emitEffect.timer = 25.0f;
            emitEffect.startTimer = emitEffect.timer;
            emitEffect.fadeOut = true;
            emitEffect.startingAlpha = 2.0f;
        }
    }

    public void giveRepairOrder(Unit unit) {
        GameEngine instance = GameEngine.getInstance();
        CommandController.Command createNewCommand = instance.commandController.createNewCommand(instance.playerTeam);
        addSelectedToCommand(createNewCommand);
        createNewCommand.setRepairWaypoint(unit);
        instance.audio.playSound(AudioEngine.interface_move, 0.2f);
        EffectEngine.EffectObject emitEffect = instance.effects.emitEffect(unit.x, unit.y, 0.0f, EffectEngine.EffectType.custom, true);
        if (emitEffect != null) {
            emitEffect.frameIndex = 10;
            emitEffect.timer = 25.0f;
            emitEffect.startTimer = emitEffect.timer;
            emitEffect.fadeOut = true;
            emitEffect.startingAlpha = 2.0f;
        }
    }

    public boolean hasAttackingUnitsSelected() {
        boolean z;
        if (numberOfUnitsSelected() == 0) {
            z = false;
        } else {
            GameEngine instance = GameEngine.getInstance();
            Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                GameObject next = it.next();
                if (next instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) next;
                    if (orderableUnit.selected && orderableUnit.team == instance.playerTeam && orderableUnit.canAttack()) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public boolean hasCommandableUnitsSelected() {
        boolean z;
        if (numberOfUnitsSelected() == 0) {
            z = false;
        } else {
            GameEngine instance = GameEngine.getInstance();
            Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                GameObject next = it.next();
                if (next instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) next;
                    if (orderableUnit.selected && orderableUnit.team == instance.playerTeam) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public boolean hasMovingUnitsSelected() {
        boolean z;
        if (numberOfUnitsSelected() == 0) {
            z = false;
        } else {
            GameEngine instance = GameEngine.getInstance();
            Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                GameObject next = it.next();
                if (next instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) next;
                    if (orderableUnit.selected && orderableUnit.team == instance.playerTeam && orderableUnit.canMove()) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public void init(Context context) {
        GameEngine instance = GameEngine.getInstance();
        this.battleInterface = new BattleInterface(instance, this);
        this.messageInterface = new MessageInterface(instance, this);
        this.button_no = instance.graphics.loadImage(R.drawable.button_no);
        this.button_yes = instance.graphics.loadImage(R.drawable.button_yes);
        this.button_add = instance.graphics.loadImage(R.drawable.button_add);
        this.button_subtract = instance.graphics.loadImage(R.drawable.button_subtract);
        this.background_tiled = instance.graphics.loadImage(R.drawable.metal_dark, false);
        this.selectPaint = new Paint();
        this.creditTextPaint = new Paint();
        this.creditTextPaint.setARGB(255, 0, 240, 0);
        this.creditTextPaint.setAntiAlias(true);
        this.creditTextPaint.setSubpixelText(true);
        this.creditTextPaint.setTextSize(18.0f);
        this.creditTextPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        this.smallTextPaint = new Paint();
        this.smallTextPaint.setARGB(255, 30, 240, 30);
        this.smallTextPaint.setTextAlign(Paint.Align.CENTER);
        this.smallTextPaint.setSubpixelText(true);
        this.smallTextPaint.setAntiAlias(true);
        this.displayTextPaint = new Paint();
        this.displayTextPaint.setTextAlign(Paint.Align.CENTER);
        this.displayTextPaint.setTextSize(16.0f);
        this.displayTextPaint.setAntiAlias(true);
        this.displayTextPaint.setSubpixelText(true);
        this.displayTextPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        this.displayTextTitlePaint = new Paint();
        this.displayTextTitlePaint.set(this.displayTextPaint);
        this.displayTextTitlePaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        this.displayTextCountPaint = new Paint();
        this.displayTextCountPaint.setTextAlign(Paint.Align.CENTER);
        this.displayTextCountPaint.setTextSize(24.0f);
        this.displayTextCountPaint.setAntiAlias(true);
        this.displayTextCountPaint.setSubpixelText(true);
        this.displayTextCountPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        this.displayTextBackgroundPaint = new Paint();
        this.displayTextBackgroundPaint.setColor(-1);
        this.displayTextBackgroundPaint.setAlpha(210);
        this.displayTextBackgroundPaintBorder = new Paint();
        this.displayTextBackgroundPaintBorder.setColor(-7829368);
        this.displayTextBackgroundPaintBorder.setAlpha(240);
        this.displayTextBackgroundPaintBorder.setStyle(Paint.Style.STROKE);
        this.displayTextBackgroundPaintBorder.setStrokeWidth(1.0f);
        this.smallTextPaint.setTextSize((int) ((12.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
        this.smallTextPaint.setAntiAlias(true);
    }

    public int numberOfUnitsSelected() {
        return this.numberOfSelectedUnits;
    }

    public void postUpdate(float f) {
        float f2;
        float f3;
        Point emptyResPool;
        GameEngine instance = GameEngine.getInstance();
        this.orderBuildingPreviewDelay = CommonUtils.toZero(this.orderBuildingPreviewDelay, f);
        this._rect.set((int) (instance.screenWidth - instance.sidebarWidth), 0, (int) instance.screenWidth, (int) instance.screenHeight);
        if ((this.gameTouchClick || this.gameTouching) && this._rect.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
            this.touchOverInterfaceButton = true;
        }
        this.battleInterface.zoomInterface(f);
        this.battleInterface.boxSelectInterface(f);
        this.lastSingleSelectedUnit_timer += f;
        if (!this.battleInterface.specialActionInterface(f)) {
            this.battleInterface.selectedUnitsInterface(f);
        }
        if (this.orderBuilding != null) {
            if (this.orderBuildingSpecialAction != null) {
                drawSpecialActionInfoBox(this.orderBuildingSpecialAction, false, null);
            }
            float f4 = this.gameTouchLastX / instance.viewpointZoom;
            float f5 = this.gameTouchLastY / instance.viewpointZoom;
            boolean z = false;
            boolean z2 = false;
            if (this.orderBuildingPreviewShow) {
                int i = (((int) instance.screenHeight) - 10) - 100;
                this._rect2.set(10, i, 10 + 100, i + 100);
                instance.graphics.drawImage(this.button_yes, this._rect2.left, this._rect2.top, (Paint) null);
                boolean z3 = false;
                if (this.gameTouchClick) {
                    z3 = false;
                    if (!this.gameTouchMoved) {
                        z3 = false;
                        if (this._rect2.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
                            this.gameTouchClick = false;
                            z3 = true;
                        }
                    }
                }
                this._rect2.set(100 + 20, i, 100 + NetworkEngine.PACKET_START_GAME, i + 100);
                instance.graphics.drawImage(this.button_no, this._rect2.left, this._rect2.top, (Paint) null);
                z2 = false;
                z = z3;
                if (this.gameTouchClick) {
                    z2 = false;
                    z = z3;
                    if (!this.gameTouchMoved) {
                        z2 = false;
                        z = z3;
                        if (this._rect2.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
                            this.gameTouchClick = false;
                            z2 = true;
                            z = z3;
                        }
                    }
                }
            }
            if (this.gameTouchClick && !this.gameTouchMoved) {
                this.orderBuildingPreviewShow = true;
                this.orderBuildingPreviewX = f4;
                this.orderBuildingPreviewY = f5;
            }
            if (this.orderBuildingPreviewShow) {
                Building building = (Building) Unit.getSharedObjectFromUnitType(this.orderBuilding);
                instance.map.snapToGrid(this.orderBuildingPreviewX + instance.viewpointX_rounded, this.orderBuildingPreviewY + instance.viewpointY_rounded);
                building.x = instance.map.returnX;
                building.y = instance.map.returnY;
                if (this.orderBuilding == UnitType.extractor && (emptyResPool = InterfaceHelpers.getEmptyResPool((int) building.x, (int) building.y, 4)) != null) {
                    building.x = emptyResPool.x;
                    building.y = emptyResPool.y;
                }
                float f6 = building.x;
                instance.map.getClass();
                building.x = f6 + 10.0f;
                float f7 = building.y;
                instance.map.getClass();
                building.y = f7 + 10.0f;
                building.setTeam(this.orderBuildingSrc.team);
                building.preview = true;
                instance.graphics.getCanvas().save();
                instance.setViewpointZoom(instance.graphics.getCanvas());
                boolean canBeBuiltHere = building.canBeBuiltHere();
                building.previewValidSpot = canBeBuiltHere;
                building.drawUnder(0.0f);
                building.draw(0.0f);
                building.drawOver(0.0f);
                instance.graphics.getCanvas().restore();
                boolean z4 = z;
                if (this.gameTouchClick) {
                    z4 = z;
                    if (!this.gameTouchMoved) {
                        float f8 = building.x;
                        float f9 = building.y;
                        instance.map.snapToGrid(this.orderBuildingLastClickX + instance.viewpointX_rounded, this.orderBuildingLastClickY + instance.viewpointY_rounded);
                        int i2 = instance.map.returnX;
                        instance.map.getClass();
                        float f10 = i2 + 10;
                        int i3 = instance.map.returnY;
                        instance.map.getClass();
                        float f11 = i3 + 10;
                        z4 = z;
                        if (Math.abs(f10 - f8) < 15.0f) {
                            z4 = z;
                            if (Math.abs(f11 - f9) < 15.0f) {
                                z4 = z;
                                if (this.orderBuildingPreviewDelay != 0.0f) {
                                    this.gameTouchClick = false;
                                    z4 = true;
                                }
                            }
                        }
                        this.orderBuildingPreviewDelay = 40.0f;
                        this.orderBuildingLastClickX = f4;
                        this.orderBuildingLastClickY = f5;
                    }
                }
                if (z4) {
                    if (!canBeBuiltHere) {
                        instance.audio.playSound(AudioEngine.interface_error, 0.8f);
                    } else {
                        float f12 = building.x;
                        float f13 = building.y;
                        CommandController.Command createNewCommand = instance.commandController.createNewCommand(instance.playerTeam);
                        addSelectedToCommand(createNewCommand);
                        createNewCommand.setBuildWaypoint(f12, f13, this.orderBuilding);
                        this.orderBuildingSpecialAction = null;
                        this.orderBuildingPreviewShow = false;
                        this.orderBuilding = null;
                        this.orderBuildingSrc = null;
                        this.blockTouchDelay = 5.0f;
                        instance.map.resetBufferLayers();
                        selectNone();
                    }
                }
                if (z2) {
                    this.orderBuildingSpecialAction = null;
                    this.orderBuildingPreviewShow = false;
                    this.orderBuilding = null;
                    this.orderBuildingSrc = null;
                    instance.map.resetBufferLayers();
                }
            }
        }
        if (!this.gameTouchMoved) {
            Point convertScreenToMap = instance.minimapHandler.convertScreenToMap(this.gameTouchLastX, this.gameTouchLastY);
            if (convertScreenToMap != null) {
                f2 = convertScreenToMap.x;
                f3 = convertScreenToMap.y;
            } else {
                f2 = (this.gameTouchLastX / instance.viewpointZoom) + instance.viewpointX_rounded;
                f3 = (this.gameTouchLastY / instance.viewpointZoom) + instance.viewpointY_rounded;
            }
            boolean z5 = false;
            if (convertScreenToMap != null) {
                z5 = false;
                if (this.gameTouchStartedOnMap) {
                    if (numberOfUnitsSelected() == 0) {
                        instance.centerViewpointAtPoint(f2, f3);
                        z5 = true;
                    } else {
                        z5 = false;
                        if (this.gameTouchTimer > 20.0f) {
                            instance.centerViewpointAtPoint(f2, f3);
                            z5 = true;
                        }
                    }
                }
            }
            if ((this.gameTouchOnBattlefield || convertScreenToMap != null) && !z5 && this.orderBuilding == null && this.gameTouchClick) {
                if (this.gameTouchTimer > 20.0f) {
                    selectNone();
                    selectInRadius(f2, f3, Math.min(this.gameTouchTimer * 1.5f, 180.0f) / instance.viewpointZoom);
                    finaliseBoxSelect();
                } else {
                    Unit unit = null;
                    if (convertScreenToMap == null) {
                        unit = getUnitAtPoint(f2, f3);
                    }
                    if (unit == null) {
                        if (hasMovingUnitsSelected()) {
                            giveMoveOrder(f2, f3);
                        }
                    } else if (!doPickActions(unit)) {
                        if (this.lastSingleSelectedUnit != unit || this.lastSingleSelectedUnit_timer >= 40.0f) {
                            selectNone();
                            unit.selected = true;
                            this.numberOfSelectedUnits++;
                            this.lastSingleSelectedUnit = unit;
                            this.lastSingleSelectedUnit_timer = 0.0f;
                        } else {
                            selectNone();
                            selectAllOfSameTypeOnScreen(unit);
                        }
                    }
                }
            }
        }
        if (this.orderBuilding == null && this.gameTouching && !this.gameTouchMoved && !this.gameTouchStartedOnMap && !this.touchOverInterfaceButton) {
            this.selectPaint.setStyle(Paint.Style.FILL);
            this.selectPaint.setStrokeWidth(1.0f);
            if (this.gameTouchTimer > 20.0f) {
                float min = Math.min(this.gameTouchTimer * 1.5f, 180.0f);
                this.selectPaint.setARGB(100, 0, 255, 0);
                instance.graphics.getCanvas().drawCircle(this.gameTouchLastX, this.gameTouchLastY, min, this.selectPaint);
                this.selectPaint.setStyle(Paint.Style.STROKE);
                this.selectPaint.setStrokeWidth(1.0f);
                this.selectPaint.setARGB(200, 0, 255, 0);
                instance.graphics.getCanvas().drawCircle(this.gameTouchLastX, this.gameTouchLastY, min, this.selectPaint);
            }
        }
        this.messageInterface.showMessages(f);
        if (!this.gameTouching) {
            this.gameTouchTimer = 0.0f;
            this.gameTouchMoved = false;
        }
        this.gameTouchLast = this.gameTouching;
    }

    public void prepareTextBox(String str, Rect rect, Paint paint) {
        int breakText;
        int i;
        this.displayTextLines.clear();
        int i2 = 0;
        while (i2 < str.length() && (breakText = this.displayTextPaint.breakText(str, i2, str.length(), true, rect.width() - 5, null)) != 0) {
            int indexOf = str.indexOf("\n", i2 + 1);
            if (indexOf == -1 || indexOf >= i2 + breakText) {
                i = breakText;
                if (i2 + breakText < str.length()) {
                    int lastIndexOf = str.substring(i2, i2 + breakText).lastIndexOf(" ");
                    i = breakText;
                    if (lastIndexOf != -1) {
                        i = breakText;
                        if (lastIndexOf != 0) {
                            i = lastIndexOf;
                        }
                    }
                }
            } else {
                i = indexOf - i2;
            }
            this.displayTextLines.add(str.substring(i2, i2 + i).replaceAll("(\\n)", ""));
            i2 += i;
        }
        rect.bottom = rect.top + ((this.displayTextLines.size() - 1) * 20);
    }

    public void selectAllOfSameTypeOnScreen(Unit unit) {
        this.lastSingleSelectedUnit = null;
        Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject next = it.next();
            if (next instanceof ActiveUnit) {
                ActiveUnit activeUnit = (ActiveUnit) next;
                if (!activeUnit.dead && activeUnit.transportedBy == null && activeUnit.team == unit.team && activeUnit.isOnScreen() && activeUnit.getClass() == unit.getClass()) {
                    activeUnit.selected = true;
                    this.numberOfSelectedUnits++;
                }
            }
        }
    }

    public void selectInRadius(float f, float f2, float f3) {
        GameEngine instance = GameEngine.getInstance();
        Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject next = it.next();
            if (next instanceof ActiveUnit) {
                ActiveUnit activeUnit = (ActiveUnit) next;
                if (!activeUnit.dead && activeUnit.transportedBy == null && activeUnit.team == instance.playerTeam && CommonUtils.distanceSq(f, f2, activeUnit.x, activeUnit.y) < f3 * f3) {
                    activeUnit.selected = true;
                    this.numberOfSelectedUnits++;
                }
            }
        }
    }

    public void selectNone() {
        this.lastSingleSelectedUnit = null;
        Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject next = it.next();
            if (next instanceof ActiveUnit) {
                ((ActiveUnit) next).selected = false;
            }
        }
        this.numberOfSelectedUnits = 0;
    }

    public void unselectUnit(Unit unit) {
        if (unit.selected) {
            unit.selected = false;
            this.numberOfSelectedUnits--;
        }
    }

    public void update(float f) {
        GameEngine instance = GameEngine.getInstance();
        this.blockTouchDelay = CommonUtils.toZero(this.blockTouchDelay, f);
        this.gameTouchScrollXSpeed = CommonUtils.limit(this.gameTouchScrollXSpeed, 30.0f);
        this.gameTouchScrollYSpeed = CommonUtils.limit(this.gameTouchScrollYSpeed, 30.0f);
        float distance = CommonUtils.distance(0.0f, 0.0f, this.gameTouchScrollXSpeed, this.gameTouchScrollYSpeed);
        float direction = CommonUtils.getDirection(0.0f, 0.0f, this.gameTouchScrollXSpeed, this.gameTouchScrollYSpeed);
        float zero = CommonUtils.toZero(distance, f);
        this.gameTouchScrollXSpeed = (float) (Math.cos(Math.toRadians(direction)) * zero);
        this.gameTouchScrollYSpeed = (float) (Math.sin(Math.toRadians(direction)) * zero);
        if (!this.gameTouching) {
            instance.viewpointX += this.gameTouchScrollXSpeed * f;
            instance.viewpointY += this.gameTouchScrollYSpeed * f;
        }
        this.touchOverInterfaceButton = false;
        this.gameTouching = instance.isTouching() && instance.touchActive[0] && this.blockTouchDelay == 0.0f;
        if (instance.isTouching() && instance.getNumTouchPoints() > 1) {
            this.gameTouching = false;
            this.gameTouchLast = false;
            this.gameTouchMoved = false;
            this.gameTouchTimer = 0.0f;
        }
        this.gameTouchClick = false;
        if (!this.gameTouching && this.gameTouchLast) {
            this.gameTouchClick = true;
        }
        this.gameTouchPress = false;
        if (this.gameTouching && !this.gameTouchLast) {
            this.gameTouchPress = true;
        }
        if (this.gameTouching) {
            this.gameTouchTimer += f;
            this.gameTouchLastX = instance.getTouchX(0);
            this.gameTouchLastY = instance.getTouchY(0);
            this.gameTouchOnBattlefield = this.gameTouchLastX < instance.screenWidth - instance.sidebarWidth;
            if (!this.gameTouchLast) {
                this.gameTouchMoved = false;
                this.gameTouchStartX = this.gameTouchLastX;
                this.gameTouchStartY = this.gameTouchLastY;
                this.gameTouchScrollX = this.gameTouchLastX;
                this.gameTouchScrollY = this.gameTouchLastY;
                this.gameTouchStartedOnMap = instance.minimapHandler.convertScreenToMap(this.gameTouchLastX, this.gameTouchLastY) != null;
            }
            this.gameTouchLast = true;
        }
        if (this.gameTouching && this.gameTouchTimer < 20.0f) {
            float distanceSq = CommonUtils.distanceSq(this.gameTouchStartX, this.gameTouchStartY, this.gameTouchLastX, this.gameTouchLastY);
            if (!this.gameTouchStartedOnMap && !this.gameTouchMoved && distanceSq > 400.0f) {
                this.gameTouchMoved = true;
                this.gameTouchScrollX = this.gameTouchLastX;
                this.gameTouchScrollY = this.gameTouchLastY;
            }
        }
        if (this.gameTouchMoved) {
            SettingsEngine settingsEngine = instance.settings;
            float f2 = (((this.gameTouchScrollX - this.gameTouchLastX) * settingsEngine.scrollSpeed) / instance.viewpointZoom) / f;
            float f3 = (((this.gameTouchScrollY - this.gameTouchLastY) * settingsEngine.scrollSpeed) / instance.viewpointZoom) / f;
            if (CommonUtils.distance(0.0f, 0.0f, f2, f3) > 50.0f) {
                this.gameTouchScrollXSpeed = 0.7f * f2;
                this.gameTouchScrollYSpeed = 0.7f * f3;
            }
            instance.viewpointX += 2.0f * f2;
            instance.viewpointY += 2.0f * f3;
            this.gameTouchScrollX = this.gameTouchLastX;
            this.gameTouchScrollY = this.gameTouchLastY;
        }
    }
}
