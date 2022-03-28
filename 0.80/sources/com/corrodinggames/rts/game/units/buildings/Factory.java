package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/Factory.class */
public abstract class Factory extends Building {
    float queueBuilt;
    LinkedList<BuildQueueItem> buildQueue = new LinkedList<>();
    Rect _dst = new Rect();
    Rect _src = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/Factory$BuildQueueItem.class */
    public class BuildQueueItem {
        int amount;
        float buildSpeed;
        int type;

        BuildQueueItem() {
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/game/units/buildings/Factory$SpecialQueueAction.class */
    public static abstract class SpecialQueueAction extends Unit.SpecialAction {
        public float getBuildSpeed() {
            return 0.01f;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public boolean queueAble() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public int queueCount(Unit unit) {
            return ((Factory) unit).getItemCountInQueue(getIndex());
        }

        @Override // com.corrodinggames.rts.game.units.Unit.SpecialAction
        public boolean showPopupWindow() {
            return true;
        }
    }

    public BuildQueueItem addItemToQueue(SpecialQueueAction specialQueueAction) {
        BuildQueueItem buildQueueItem = new BuildQueueItem();
        buildQueueItem.type = specialQueueAction.getIndex();
        buildQueueItem.amount = 1;
        buildQueueItem.buildSpeed = specialQueueAction.getBuildSpeed();
        this.buildQueue.add(buildQueueItem);
        return buildQueueItem;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public boolean canAttack() {
        return false;
    }

    public abstract void completeQueueItem(BuildQueueItem buildQueueItem);

    @Override // com.corrodinggames.rts.game.units.buildings.Building, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
        super.draw(f);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public void fireProjectile(Unit unit) {
        throw new RuntimeException("Unit cannot shoot");
    }

    public int getItemCountInQueue(int i) {
        int i2 = 0;
        Iterator<BuildQueueItem> it = this.buildQueue.iterator();
        while (it.hasNext()) {
            BuildQueueItem next = it.next();
            if (next.type == i) {
                i2 += next.amount;
            }
        }
        return i2;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getMaxAttackRange() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public float getSecBar() {
        return (!isActive() || queueEmpty()) ? super.getSecBar() : this.queueBuilt;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getShootDelay() {
        return 0.0f;
    }

    public int getSpecialActionFor(UnitType unitType) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    public float getTurrentTurnSpeed() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    public void giveSpecialActionOrder(Unit.SpecialAction specialAction, boolean z) {
        if (specialAction instanceof SpecialQueueAction) {
            SpecialQueueAction specialQueueAction = (SpecialQueueAction) specialAction;
            if (!z) {
                if (specialAction.isActive(this) && this.team.tryToBuy(specialQueueAction.getPrice())) {
                    addItemToQueue(specialQueueAction);
                }
            } else if (removeItemInQueue(specialQueueAction)) {
                this.team.credits += specialQueueAction.getPrice();
            }
        }
    }

    public boolean queueEmpty() {
        return this.buildQueue.size() == 0;
    }

    public boolean removeItemInQueue(SpecialQueueAction specialQueueAction) {
        boolean z;
        ListIterator<BuildQueueItem> listIterator = this.buildQueue.listIterator(this.buildQueue.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().type == specialQueueAction.getIndex()) {
                    listIterator.remove();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        super.update(f);
        if (isActive() && !this.dead) {
            if (!queueEmpty()) {
                BuildQueueItem buildQueueItem = this.buildQueue.get(0);
                this.queueBuilt += buildQueueItem.buildSpeed * f;
                if (this.queueBuilt > 1.0f) {
                    this.queueBuilt = 0.0f;
                    completeQueueItem(buildQueueItem);
                    buildQueueItem.amount--;
                    if (buildQueueItem.amount <= 0) {
                        this.buildQueue.remove(0);
                        return;
                    }
                    return;
                }
                return;
            }
            this.queueBuilt = 0.0f;
        }
    }
}
