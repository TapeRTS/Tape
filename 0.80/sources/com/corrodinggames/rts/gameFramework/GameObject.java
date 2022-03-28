package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GameObject.class */
public abstract class GameObject extends SyncedObject {
    public static final String TAG = "ProjectPlatformer";
    static ConcurrentLinkedQueue<GameObject> gameObjectList = new ConcurrentLinkedQueue<>();
    public static ArrayList<GameObject> fastGameObjectList = new ArrayList<>();
    public boolean deleted = false;
    public boolean bakedToBackground = false;
    public int drawLayer = 2;
    public long id = GameEngine.getInstance().network.getNextUnitId();

    public GameObject() {
        gameObjectList.add(this);
        fastGameObjectList.add(this);
    }

    public static GameObject getFromId(long j) {
        GameObject gameObject;
        if (j != -1) {
            Iterator<GameObject> it = fastGameObjectList.iterator();
            while (true) {
                if (it.hasNext()) {
                    gameObject = it.next();
                    if (gameObject.id == j) {
                        break;
                    }
                } else {
                    NetworkEngine.reportDesync("getFromId:" + j + " was not found");
                    gameObject = null;
                    break;
                }
            }
        } else {
            gameObject = null;
        }
        return gameObject;
    }

    public static ConcurrentLinkedQueue<GameObject> getGameObjectList() {
        return gameObjectList;
    }

    public static OrderableUnit getOrderableUnitFromId(long j) {
        return (OrderableUnit) getFromId(j);
    }

    public static Unit getUnitFromId(long j) {
        return (Unit) getFromId(j);
    }

    public abstract void draw(float f);

    public abstract boolean drawIcon(float f);

    public abstract void drawInterface(float f);

    public abstract void drawOver(float f);

    public abstract void drawUnder(float f);

    public void remove() {
        gameObjectList.remove(this);
        fastGameObjectList.remove(this);
        this.deleted = true;
    }

    public void setDrawLayer(int i) {
        this.drawLayer = i;
    }

    public abstract void update(float f);
}
