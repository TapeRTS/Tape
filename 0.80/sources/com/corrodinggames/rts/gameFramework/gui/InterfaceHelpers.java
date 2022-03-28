package com.corrodinggames.rts.gameFramework.gui;

import android.graphics.Point;
import com.corrodinggames.rts.game.map.MapTile;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/gui/InterfaceHelpers.class */
public class InterfaceHelpers {
    static Point _pointReturn = new Point();

    public static Point getEmptyResPool(int i, int i2, int i3) {
        Point point;
        MapTile tileFromObjectLayer;
        GameEngine instance = GameEngine.getInstance();
        instance.map.toGrid(i, i2);
        int i4 = instance.map.returnX;
        int i5 = instance.map.returnY;
        int i6 = i4 - i3;
        loop0: while (true) {
            if (i6 > i4 + i3) {
                point = null;
                break;
            }
            for (int i7 = i5 - i3; i7 <= i5 + i3; i7++) {
                if (instance.map.isInMap(i6, i7) && (tileFromObjectLayer = instance.map.getTileFromObjectLayer(i6, i7)) != null && tileFromObjectLayer.resPool && Building.getBuilding(i6, i7) == null) {
                    instance.map.fromGrid(i6, i7);
                    _pointReturn.set(instance.map.returnX, instance.map.returnY);
                    point = _pointReturn;
                    break loop0;
                }
            }
            i6++;
        }
        return point;
    }
}
