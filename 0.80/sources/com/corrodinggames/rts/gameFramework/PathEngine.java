package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.map.MapTile;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.Building;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/PathEngine.class */
public final class PathEngine {
    public MapCosts MovementType_AIR;
    public MapCosts MovementType_HOVER;
    public MapCosts MovementType_LAND;
    public MapCosts MovementType_NONE;
    public MapCosts MovementType_WATER;
    int costLimit;
    byte[][] currentConnectedNodeDir;
    short[][] currentConnectedNodeX;
    short[][] currentConnectedNodeY;
    int[][] currentCosts;
    MapCosts currentMapCosts;
    short endSize;
    short endX;
    short endY;
    short height;
    PoolNode[] liveNodePool;
    Map map;
    int poolInIndex;
    int poolOutIndex;
    short startX;
    short startY;
    short width;
    boolean logging = true;
    int minCost = 5;
    ArrayList<MapCosts> movementCostsList = new ArrayList<>();
    LinkedList<Node> foundPathBackwards = new LinkedList<>();
    public LinkedList<Node> foundPath = new LinkedList<>();
    public Paint linePaint = new Paint();
    Node currentNode = new Node();
    final int scale = 10;
    final int scaleD = 14;
    Node checkNode = new Node();
    Node tempNode = new Node();
    Node _temp = new Node();
    Paint tempPaint = new Paint();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/PathEngine$MapCosts.class */
    public final strict class MapCosts {
        public short[][] buildingCosts;
        public short[][] mapCosts;
        public short[][] objectCosts;
        public int objectLastUpdateFrame = -99;
        Unit.MovementType type;

        MapCosts(Unit.MovementType movementType, int i, int i2) {
            this.type = movementType;
            this.mapCosts = new short[i][i2];
            this.buildingCosts = new short[i][i2];
            this.objectCosts = new short[i][i2];
            PathEngine.this.movementCostsList.add(this);
        }

        void updateAll() {
            updateMapCosts();
            updateBuildingCosts();
            updateUnitCosts();
        }

        public void updateBuildingCosts() {
            for (int i = 0; i < PathEngine.this.width; i++) {
                for (int i2 = 0; i2 < PathEngine.this.height; i2++) {
                    this.buildingCosts[i][i2] = (short) 0;
                }
            }
            Iterator<Unit> it = Unit.fastUnitList.iterator();
            while (it.hasNext()) {
                Unit next = it.next();
                if ((next instanceof Building) && !next.dead) {
                    Building building = (Building) next;
                    PathEngine.this.map.toGrid(next.x, next.y);
                    int i3 = PathEngine.this.map.returnX;
                    int i4 = PathEngine.this.map.returnY;
                    Rect rect = building.footprint;
                    for (int i5 = i3 + rect.left; i5 <= rect.right + i3; i5++) {
                        for (int i6 = i4 + rect.top; i6 <= rect.bottom + i4; i6++) {
                            if (PathEngine.this.map.isInMap(i5, i6)) {
                                this.buildingCosts[i5][i6] = (short) (-1);
                            }
                        }
                    }
                }
            }
        }

        void updateMapCosts() {
            MapTile tileFromObjectLayer;
            for (int i = 0; i < PathEngine.this.width; i++) {
                for (int i2 = 0; i2 < PathEngine.this.height; i2++) {
                    this.mapCosts[i][i2] = (short) 0;
                    if (this.type.equals(Unit.MovementType.LAND)) {
                        if (PathEngine.this.map.mainLayer.tiles[i][i2].water || PathEngine.this.map.mainLayer.tiles[i][i2].cliff || PathEngine.this.map.mainLayer.tiles[i][i2].largeCliff) {
                            this.mapCosts[i][i2] = (short) (-1);
                        }
                    } else if (this.type.equals(Unit.MovementType.WATER)) {
                        if (!PathEngine.this.map.mainLayer.tiles[i][i2].water) {
                            this.mapCosts[i][i2] = (short) (-1);
                        }
                    } else if (this.type.equals(Unit.MovementType.HOVER) && PathEngine.this.map.mainLayer.tiles[i][i2].largeCliff) {
                        this.mapCosts[i][i2] = (short) (-1);
                    }
                    if ((this.type.equals(Unit.MovementType.LAND) || this.type.equals(Unit.MovementType.HOVER) || this.type.equals(Unit.MovementType.WATER)) && (tileFromObjectLayer = PathEngine.this.map.getTileFromObjectLayer(i, i2)) != null) {
                        if (this.type.equals(Unit.MovementType.LAND) && tileFromObjectLayer.resPool) {
                            this.mapCosts[i][i2] = (short) (-1);
                        }
                        if (this.mapCosts[i][i2] == 0) {
                            this.mapCosts[i][i2] = tileFromObjectLayer.pathCost;
                        }
                    }
                }
            }
        }

        public void updateUnitCosts() {
            short[] sArr;
            short[] sArr2;
            for (int i = 0; i < PathEngine.this.width; i++) {
                for (int i2 = 0; i2 < PathEngine.this.height; i2++) {
                    this.objectCosts[i][i2] = (short) 0;
                }
            }
            Iterator<Unit> it = Unit.fastUnitList.iterator();
            while (it.hasNext()) {
                Unit next = it.next();
                if (!(next instanceof Building) && !next.moving && !next.dead && !next.isFlying() && next.transportedBy == null) {
                    PathEngine.this.map.toGrid(next.x, next.y);
                    int i3 = PathEngine.this.map.returnX;
                    int i4 = PathEngine.this.map.returnY;
                    float f = next.radius + 5.0f;
                    float f2 = next.radius + 10.0f;
                    for (int i5 = i3 - 2; i5 <= i3 + 2; i5++) {
                        for (int i6 = i4 - 2; i6 <= i4 + 2; i6++) {
                            if (PathEngine.this.map.isInMap(i5, i6)) {
                                PathEngine.this.map.fromGrid(i5, i6);
                                int i7 = PathEngine.this.map.returnX;
                                PathEngine.this.map.getClass();
                                float f3 = i7 + 10;
                                int i8 = PathEngine.this.map.returnY;
                                PathEngine.this.map.getClass();
                                float distanceSq = CommonUtils.distanceSq(f3, i8 + 10, next.x, next.y);
                                if (distanceSq < f * f) {
                                    this.objectCosts[i5][i6] = (short) (sArr2[i6] + 60);
                                } else if (distanceSq < f2 * f2) {
                                    this.objectCosts[i5][i6] = (short) (sArr[i6] + 20);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/PathEngine$Node.class */
    public final strict class Node {
        public short x;
        public short y;

        public Node() {
        }

        public Node(Node node) {
            set(node);
        }

        public Node(short s, short s2) {
            set(s, s2);
        }

        public final Node getConnectedNode() {
            return PathEngine.this.currentCosts[this.x][this.y] < PathEngine.this.minCost ? null : PathEngine.this.currentConnectedNodeX[this.x][this.y] == -1 ? null : new Node(PathEngine.this.currentConnectedNodeX[this.x][this.y], PathEngine.this.currentConnectedNodeY[this.x][this.y]);
        }

        public final int getCurrentCost() {
            return PathEngine.this.currentCosts[this.x][this.y];
        }

        public final int getMapCost() {
            MapCosts mapCosts = PathEngine.this.currentMapCosts;
            return (mapCosts.mapCosts[this.x][this.y] == -1 || mapCosts.buildingCosts[this.x][this.y] == -1 || mapCosts.objectCosts[this.x][this.y] == -1) ? -1 : mapCosts.mapCosts[this.x][this.y] + mapCosts.buildingCosts[this.x][this.y] + mapCosts.objectCosts[this.x][this.y];
        }

        public final int getQuickDistance(int i, int i2) {
            int i3 = i - this.x;
            int i4 = i2 - this.y;
            if (i3 <= 0) {
                i3 = -i3;
            }
            if (i4 <= 0) {
                i4 = -i4;
            }
            return i3 + i4;
        }

        public final Node set(Node node) {
            this.x = node.x;
            this.y = node.y;
            return this;
        }

        public final Node set(PoolNode poolNode) {
            this.x = poolNode.x;
            this.y = poolNode.y;
            return this;
        }

        public final Node set(short s, short s2) {
            this.x = s;
            this.y = s2;
            return this;
        }

        public final void setConnectedNode(Node node) {
            PathEngine.this.currentConnectedNodeX[this.x][this.y] = node.x;
            PathEngine.this.currentConnectedNodeY[this.x][this.y] = node.y;
        }

        public final void setCurrentCost(int i) {
            PathEngine.this.currentCosts[this.x][this.y] = i;
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/PathEngine$PoolNode.class */
    public final strict class PoolNode {
        public boolean active;
        public short x;
        public short y;

        public PoolNode() {
        }

        public final int getQuickDistance(int i, int i2) {
            int i3 = i - this.x;
            int i4 = i2 - this.y;
            if (i3 <= 0) {
                i3 = -i3;
            }
            if (i4 <= 0) {
                i4 = -i4;
            }
            return i3 + i4;
        }

        public final void set(short s, short s2) {
            this.x = s;
            this.y = s2;
        }
    }

    final void addToLivePool(short s, short s2) {
        PoolNode poolNode = this.liveNodePool[this.poolInIndex];
        poolNode.set(s, s2);
        poolNode.active = true;
        this.poolInIndex++;
        if (this.poolInIndex >= this.liveNodePool.length) {
            this.poolInIndex = 0;
        }
        if (this.poolOutIndex == this.poolInIndex) {
            Log.e(GameEngine.TAG, "add to pool overlapping");
        }
    }

    public void drawAll() {
        Node node;
        Node connectedNode;
        GameEngine instance = GameEngine.getInstance();
        this.linePaint.setARGB(255, 255, 0, 0);
        this.linePaint.setStrokeWidth(2.0f);
        for (short s = 0; s < this.width; s = (short) (s + 1)) {
            for (short s2 = 0; s2 < this.height && (node = new Node(s, s2)) != null && (connectedNode = node.getConnectedNode()) != null; s2 = (short) (s2 + 1)) {
                short s3 = node.x;
                this.map.getClass();
                int i = GameEngine.getInstance().viewpointXAsInt;
                short s4 = node.y;
                this.map.getClass();
                int i2 = GameEngine.getInstance().viewpointYAsInt;
                short s5 = connectedNode.x;
                this.map.getClass();
                int i3 = GameEngine.getInstance().viewpointXAsInt;
                short s6 = connectedNode.y;
                this.map.getClass();
                instance.graphics.getCanvas().drawLine((s3 * 20) - i, (s4 * 20) - i2, (s5 * 20) - i3, (s6 * 20) - GameEngine.getInstance().viewpointYAsInt, this.linePaint);
            }
        }
    }

    public void drawCosts() {
        GameEngine instance = GameEngine.getInstance();
        new Rect();
        Rect rect = new Rect();
        float f = instance.viewpointX_rounded;
        float f2 = instance.viewpointY_rounded;
        float f3 = instance.viewpointWidth;
        float f4 = instance.viewpointHeight;
        MapTile[][] mapTileArr = instance.map.mainLayer.tiles;
        this.map.getClass();
        int i = (int) ((0.05f * f) - 1.0f);
        int i2 = i;
        if (i < 0) {
            i2 = 0;
        }
        this.map.getClass();
        int i3 = (int) ((0.05f * f2) - 1.0f);
        int i4 = i3;
        if (i3 < 0) {
            i4 = 0;
        }
        this.map.getClass();
        int i5 = (int) (((f + f3) * 0.05f) + 1.0f);
        int i6 = i5;
        if (i5 > this.width - 1) {
            i6 = this.width - 1;
        }
        this.map.getClass();
        int i7 = (int) (((f2 + f4) * 0.05f) + 1.0f);
        int i8 = i7;
        if (i7 > this.height - 1) {
            i8 = this.height - 1;
        }
        while (i2 < i6 + 1) {
            while (i4 < i8 + 1) {
                if (mapTileArr[i2][i4] != null) {
                    this.map.getClass();
                    int i9 = i2 * 20;
                    this.map.getClass();
                    int i10 = i4 * 20;
                    this.map.getClass();
                    this.map.getClass();
                    rect.set(i9, i10, i9 + 20, i10 + 20);
                    rect.offset((int) (-f), (int) (-f2));
                    short s = this.currentMapCosts.mapCosts[i2][i4];
                    short s2 = this.currentMapCosts.buildingCosts[i2][i4];
                    short s3 = this.currentMapCosts.objectCosts[i2][i4];
                    this.tempPaint.setARGB(128, s == -1 ? 255 : s * 2, s2 == -1 ? 255 : s2 * 2, s3 == -1 ? 255 : s3 * 2);
                    instance.graphics.getCanvas().drawRect(rect, this.tempPaint);
                }
                i4++;
            }
            i2++;
        }
    }

    public void drawPath() {
        GameEngine instance = GameEngine.getInstance();
        this.linePaint.setARGB(255, 0, 255, 0);
        this.linePaint.setStrokeWidth(2.0f);
        Node node = new Node(this.endX, this.endY);
        Node node2 = node;
        if (node != null) {
            while (true) {
                short s = node2.x;
                this.map.getClass();
                this.map.getClass();
                int i = GameEngine.getInstance().viewpointXAsInt;
                short s2 = node2.y;
                this.map.getClass();
                this.map.getClass();
                int i2 = GameEngine.getInstance().viewpointYAsInt;
                node2 = node2.getConnectedNode();
                if (node2 != null) {
                    short s3 = node2.x;
                    this.map.getClass();
                    this.map.getClass();
                    int i3 = GameEngine.getInstance().viewpointXAsInt;
                    short s4 = node2.y;
                    this.map.getClass();
                    this.map.getClass();
                    instance.graphics.getCanvas().drawLine(((s * 20) + 10) - i, ((s2 * 20) + 10) - i2, ((s3 * 20) + 10) - i3, ((s4 * 20) + 10) - GameEngine.getInstance().viewpointYAsInt, this.linePaint);
                } else {
                    return;
                }
            }
        }
    }

    public void findPath() {
        int i;
        int i2;
        int mapCost;
        int i3;
        int currentCost;
        Node node;
        Node node2;
        Node node3;
        Node node4;
        Node node5;
        Node node6;
        Node node7;
        Node node8;
        Node node9;
        Node node10;
        Node node11;
        Node node12;
        GameEngine instance = GameEngine.getInstance();
        if (this.logging) {
            Log.e(GameEngine.TAG, "starting path for:" + this.currentMapCosts.type.toString());
        }
        long time = new Date().getTime();
        if (this.startX == this.endX && this.startY == this.endY) {
            if (this.logging) {
                Log.e(GameEngine.TAG, "no point pathing when start=end");
            }
            this.foundPath.clear();
        } else if (this.currentMapCosts.type.equals(Unit.MovementType.NONE)) {
            if (this.logging) {
                Log.e(GameEngine.TAG, "no point pathing for none");
            }
            this.foundPath.clear();
        } else {
            if (this.currentMapCosts.objectLastUpdateFrame < instance.frameNumber + 20) {
                this.currentMapCosts.objectLastUpdateFrame = instance.frameNumber;
                this.currentMapCosts.updateUnitCosts();
            }
            this.costLimit = -1;
            int i4 = this.endX;
            int i5 = this.endY;
            short s = this.endSize;
            boolean z = true;
            int i6 = this.endX - this.endSize;
            while (true) {
                short s2 = (short) i6;
                if (s2 >= this.endX + this.endSize) {
                    break;
                }
                int i7 = this.endY - this.endSize;
                while (true) {
                    short s3 = (short) i7;
                    if (s3 >= this.endY + this.endSize) {
                        break;
                    }
                    if (new Node(this.endX, this.endY).getMapCost() != -1) {
                        z = false;
                    }
                    i7 = s3 + 1;
                }
                i6 = s2 + 1;
            }
            int i8 = i4;
            int i9 = i5;
            int i10 = 0;
            if (z) {
                float f = -1.0f;
                short s4 = (short) (this.endX - 9);
                int i11 = i5;
                int i12 = i4;
                while (s4 < this.endX + 9) {
                    int i13 = i12;
                    for (short s5 = (short) (this.endY - 9); s5 < this.endY + 9; s5 = (short) (s5 + 1)) {
                        f = f;
                        i13 = i13;
                        i11 = i11;
                        if (s4 >= 0) {
                            if (s4 >= this.width) {
                                i11 = i11;
                                i13 = i13;
                                f = f;
                            } else {
                                f = f;
                                i13 = i13;
                                i11 = i11;
                                if (s5 >= 0) {
                                    f = f;
                                    i13 = i13;
                                    i11 = i11;
                                    if (s5 < this.height) {
                                        f = f;
                                        i13 = i13;
                                        i11 = i11;
                                        if (getMapCost(s4, s5) != -1) {
                                            float distanceSq = CommonUtils.distanceSq(s4, s5, this.endX, this.endY);
                                            if (f != -1.0f) {
                                                f = f;
                                                i13 = i13;
                                                i11 = i11;
                                                if (distanceSq >= f) {
                                                }
                                            }
                                            f = distanceSq;
                                            i13 = s4;
                                            i11 = s5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    s4 = (short) (s4 + 1);
                    i12 = i13;
                }
                int i14 = i12;
                int i15 = i11;
                if (f == -1.0f) {
                    short s6 = 0;
                    while (s6 < this.width) {
                        int i16 = i12;
                        for (short s7 = 0; s7 < this.height; s7 = (short) (s7 + 1)) {
                            f = f;
                            i16 = i16;
                            i11 = i11;
                            if (getMapCost(s6, s7) != -1) {
                                float distanceSq2 = CommonUtils.distanceSq(s6, s7, this.endX, this.endY);
                                if (f != -1.0f) {
                                    f = f;
                                    i16 = i16;
                                    i11 = i11;
                                    if (distanceSq2 >= f) {
                                    }
                                }
                                f = distanceSq2;
                                i16 = s6;
                                i11 = s7;
                            }
                        }
                        s6 = (short) (s6 + 1);
                        i12 = i16;
                    }
                    i15 = i11;
                    i14 = i12;
                }
                i8 = i14;
                i9 = i15;
                i10 = 0;
                if (this.logging) {
                    Log.e(GameEngine.TAG, "fakeNode search was:" + (new Date().getTime() - time));
                    i10 = 0;
                    i9 = i15;
                    i8 = i14;
                }
            }
            while (true) {
                int i17 = i10 + 1;
                PoolNode removeLastFromPool = (this.costLimit != -1 || i17 >= 310) ? removeLastFromPool() : removeClosestFromPool(i8, i9);
                if (removeLastFromPool == null) {
                    break;
                }
                Node node13 = this.currentNode.set(removeLastFromPool);
                int currentCost2 = node13.getCurrentCost();
                byte b = this.currentConnectedNodeDir[node13.x][node13.y];
                if (b == -1) {
                    i2 = 0;
                    i = 7;
                } else {
                    i2 = (byte) (b - 2);
                    i = (byte) (b + 2);
                }
                while (true) {
                    i10 = i17;
                    if (i2 <= i) {
                        this.checkNode.set(node13);
                        int i18 = i2;
                        if (i2 > 7) {
                            i18 = (byte) (i2 - 8);
                        }
                        int i19 = i18;
                        if (i18 < 0) {
                            i19 = (byte) (i18 + 8);
                        }
                        if (i19 == 0) {
                            this.checkNode.x = (short) (node12.x + 1);
                        }
                        if (i19 == 1) {
                            this.checkNode.x = (short) (node10.x + 1);
                            this.checkNode.y = (short) (node11.y + 1);
                        }
                        if (i19 == 2) {
                            this.checkNode.y = (short) (node9.y + 1);
                        }
                        if (i19 == 3) {
                            this.checkNode.y = (short) (node7.y + 1);
                            this.checkNode.x = (short) (node8.x - 1);
                        }
                        if (i19 == 4) {
                            this.checkNode.x = (short) (node6.x - 1);
                        }
                        if (i19 == 5) {
                            this.checkNode.x = (short) (node4.x - 1);
                            this.checkNode.y = (short) (node5.y - 1);
                        }
                        if (i19 == 6) {
                            this.checkNode.y = (short) (node3.y - 1);
                        }
                        if (i19 == 7) {
                            this.checkNode.y = (short) (node.y - 1);
                            this.checkNode.x = (short) (node2.x + 1);
                        }
                        if (this.checkNode.x >= 0 && this.checkNode.x < this.width && this.checkNode.y >= 0 && this.checkNode.y < this.height && (mapCost = this.checkNode.getMapCost()) != -1) {
                            if (this.checkNode.x == node13.x || this.checkNode.y == node13.y) {
                                i3 = mapCost + 10 + currentCost2 + 1;
                            } else if (!(getMapCostAt(this.checkNode.x, node13.y) == -1 || getMapCostAt(node13.x, this.checkNode.y) == -1)) {
                                i3 = mapCost + 14 + currentCost2 + 1;
                            }
                            int i20 = i3;
                            if (b != -1) {
                                i20 = i3;
                                if (b != i19) {
                                    i20 = i3 + turnCost(b, i19);
                                }
                            }
                            if ((this.costLimit == -1 || i20 + (this.checkNode.getQuickDistance(i8, i9) * 10) < this.costLimit - 11) && ((currentCost = this.checkNode.getCurrentCost()) < this.minCost || i20 < currentCost)) {
                                this.checkNode.setCurrentCost(i20);
                                this.checkNode.setConnectedNode(node13);
                                this.currentConnectedNodeDir[this.checkNode.x][this.checkNode.y] = (byte) i19;
                                if (this.checkNode.x == i8 && this.checkNode.y == i9) {
                                    this.costLimit = this.checkNode.getCurrentCost();
                                }
                                addToLivePool(this.checkNode.x, this.checkNode.y);
                            }
                        }
                        i2 = (byte) (i2 + 1);
                    }
                }
            }
            if (this.logging) {
                Log.e(GameEngine.TAG, "grid path done in:" + (new Date().getTime() - time));
            }
            new Date().getTime();
            Node node14 = new Node(this.endX, this.endY);
            int i21 = this.endX;
            int i22 = this.endY;
            if (node14.getCurrentCost() < this.minCost) {
                if (this.logging) {
                    Log.e(GameEngine.TAG, "could not find end node");
                }
                long time2 = new Date().getTime();
                float f2 = -1.0f;
                for (int i23 = 0; i23 < this.width; i23++) {
                    for (int i24 = 0; i24 < this.height; i24++) {
                        f2 = f2;
                        i21 = i21;
                        i22 = i22;
                        if (this.currentCosts[i23][i24] > this.minCost) {
                            float distanceSq3 = CommonUtils.distanceSq(i23, i24, this.endX, this.endY);
                            if (f2 != -1.0f) {
                                f2 = f2;
                                i21 = i21;
                                i22 = i22;
                                if (distanceSq3 >= f2) {
                                }
                            }
                            f2 = distanceSq3;
                            i21 = i23;
                            i22 = i24;
                        }
                    }
                }
                if (this.logging) {
                    Log.e(GameEngine.TAG, "got closest node in:" + (new Date().getTime() - time2));
                }
                this.endX = (short) i21;
                this.endY = (short) i22;
            }
            this.foundPathBackwards.clear();
            node14.set(this.endX, this.endY);
            this.foundPathBackwards.add(node14);
            while (true) {
                Node connectedNode = node14.getConnectedNode();
                if (connectedNode == null) {
                    break;
                }
                this.foundPathBackwards.add(node14);
                node14 = connectedNode;
            }
            this.foundPathBackwards.clear();
            Node node15 = new Node(this.endX, this.endY);
            this.foundPathBackwards.add(node15);
            while (true) {
                Node connectedNode2 = node15.getConnectedNode();
                if (connectedNode2 == null) {
                    break;
                }
                this.foundPathBackwards.add(node15);
                node15 = connectedNode2;
            }
            this.foundPath.clear();
            Iterator<Node> it = this.foundPathBackwards.iterator();
            while (it.hasNext()) {
                this.foundPath.addFirst(it.next());
            }
            if (this.foundPath.size() > 0) {
                this.foundPath.remove(0);
            }
        }
    }

    final int getMapCost(short s, short s2) {
        this._temp.set(s, s2);
        return this._temp.getMapCost();
    }

    public final int getMapCostAt(int i, int i2) {
        MapCosts mapCosts = this.currentMapCosts;
        return (mapCosts.mapCosts[i][i2] == -1 || mapCosts.buildingCosts[i][i2] == -1 || mapCosts.objectCosts[i][i2] == -1) ? -1 : mapCosts.mapCosts[i][i2] + mapCosts.buildingCosts[i][i2] + mapCosts.objectCosts[i][i2];
    }

    MapCosts getMapCosts(Unit.MovementType movementType) {
        MapCosts mapCosts;
        Iterator<MapCosts> it = this.movementCostsList.iterator();
        while (true) {
            if (it.hasNext()) {
                MapCosts next = it.next();
                if (next.type.equals(movementType)) {
                    mapCosts = next;
                    break;
                }
            } else {
                mapCosts = null;
                break;
            }
        }
        return mapCosts;
    }

    public boolean isTileImpassable(Unit.MovementType movementType, int i, int i2) {
        return isTileImpassable(getMapCosts(movementType), i, i2);
    }

    public boolean isTileImpassable(MapCosts mapCosts, int i, int i2) {
        return !this.map.isInMap(i, i2) ? true : mapCosts.mapCosts[i][i2] == -1 || mapCosts.buildingCosts[i][i2] == -1 || mapCosts.objectCosts[i][i2] == -1;
    }

    final PoolNode removeClosestFromPool(int i, int i2) {
        PoolNode poolNode;
        if (this.poolOutIndex == this.poolInIndex) {
            poolNode = null;
        } else {
            int i3 = -1;
            int i4 = -1;
            for (int i5 = this.poolOutIndex; i5 < this.poolInIndex; i5++) {
                PoolNode poolNode2 = this.liveNodePool[i5];
                i3 = i3;
                i4 = i4;
                if (poolNode2.active) {
                    int quickDistance = poolNode2.getQuickDistance(i, i2);
                    if (i3 != -1) {
                        i3 = i3;
                        i4 = i4;
                        if (quickDistance >= i3) {
                        }
                    }
                    i3 = quickDistance;
                    i4 = i5;
                }
            }
            if (i4 == -1) {
                poolNode = null;
            } else {
                poolNode = this.liveNodePool[i4];
                poolNode.active = false;
            }
        }
        return poolNode;
    }

    final PoolNode removeLastFromPool() {
        PoolNode poolNode;
        while (true) {
            if (this.poolOutIndex != this.poolInIndex) {
                poolNode = this.liveNodePool[this.poolOutIndex];
                this.poolOutIndex++;
                if (this.poolOutIndex >= this.liveNodePool.length) {
                    this.poolOutIndex = 0;
                }
                if (poolNode != null) {
                    if (poolNode.active) {
                        break;
                    }
                } else {
                    poolNode = null;
                    break;
                }
            } else {
                poolNode = null;
                break;
            }
        }
        return poolNode;
    }

    final void resetPool() {
        this.poolInIndex = 0;
        this.poolOutIndex = 0;
    }

    final void runForNode(Node node, int i, int i2) {
    }

    public void setEnd(short s, short s2, short s3) {
        if (this.logging) {
            Log.e(GameEngine.TAG, "path end is:" + ((int) s) + "," + ((int) s2));
        }
        short s4 = s;
        if (s < 0) {
            s4 = 0;
        }
        short s5 = s2;
        if (s2 < 0) {
            s5 = 0;
        }
        short s6 = s4;
        if (s4 > this.width - 1) {
            s6 = (short) (this.width - 1);
        }
        short s7 = s5;
        if (s5 > this.height - 1) {
            s7 = (short) (this.height - 1);
        }
        this.endX = s6;
        this.endY = s7;
        this.endSize = s3;
        this.currentConnectedNodeDir[this.endX][this.endY] = (byte) (-1);
        this.currentConnectedNodeX[this.endX][this.endY] = (short) (-1);
        this.currentConnectedNodeY[this.endX][this.endY] = (short) (-1);
    }

    public void setMap(Map map) {
        this.currentMapCosts = null;
        this.movementCostsList.clear();
        this.map = map;
        this.width = map.mainLayer.width;
        this.height = map.mainLayer.height;
        this.currentCosts = new int[this.width][this.height];
        this.MovementType_NONE = new MapCosts(Unit.MovementType.NONE, this.width, this.height);
        this.MovementType_NONE.updateAll();
        this.MovementType_LAND = new MapCosts(Unit.MovementType.LAND, this.width, this.height);
        this.MovementType_LAND.updateAll();
        this.MovementType_WATER = new MapCosts(Unit.MovementType.WATER, this.width, this.height);
        this.MovementType_WATER.updateAll();
        this.MovementType_AIR = new MapCosts(Unit.MovementType.AIR, this.width, this.height);
        this.MovementType_AIR.updateAll();
        this.MovementType_HOVER = new MapCosts(Unit.MovementType.HOVER, this.width, this.height);
        this.MovementType_HOVER.updateAll();
        this.currentConnectedNodeX = new short[this.width][this.height];
        this.currentConnectedNodeY = new short[this.width][this.height];
        this.currentConnectedNodeDir = new byte[this.width][this.height];
        this.liveNodePool = new PoolNode[3000];
        for (int i = 0; i < this.liveNodePool.length; i++) {
            this.liveNodePool[i] = new PoolNode();
        }
        startNew();
    }

    public void setSrc(Unit.MovementType movementType, short s, short s2) {
        if (movementType == null) {
            throw new RuntimeException("MovementType is null");
        }
        if (this.logging) {
            Log.e(GameEngine.TAG, "path start is:" + ((int) s) + "," + ((int) s2));
        }
        this.startX = s;
        this.startY = s2;
        if (this.startX < 0) {
            this.startX = (short) 0;
        }
        if (this.startY < 0) {
            this.startY = (short) 0;
        }
        if (this.startX > this.width - 1) {
            this.startX = (short) (this.width - 1);
        }
        if (this.startY > this.height - 1) {
            this.startY = (short) (this.height - 1);
        }
        this.currentMapCosts = getMapCosts(movementType);
        if (this.currentMapCosts == null) {
            throw new RuntimeException("Could not get costs for:" + movementType.toString());
        }
        this.currentCosts[this.startX][this.startY] = this.minCost;
        this.currentConnectedNodeDir[this.startX][this.startY] = (byte) (-1);
        this.currentConnectedNodeX[this.startX][this.startY] = (short) (-1);
        this.currentConnectedNodeY[this.startX][this.startY] = (short) (-1);
        addToLivePool(this.startX, this.startY);
    }

    public void startNew() {
        resetPool();
        this.minCost += (this.width * this.height) + 1;
        if (this.minCost > Integer.MAX_VALUE - ((this.width * this.height) + 1) || this.minCost < 0) {
            this.minCost = 5;
            for (int i = 0; i < this.width; i++) {
                for (int i2 = 0; i2 < this.height; i2++) {
                    this.currentCosts[i][i2] = -1;
                }
            }
        }
    }

    public int turnCost(int i, int i2) {
        int i3;
        if (i == i2) {
            i3 = 0;
        } else {
            int abs = Math.abs(i - i2);
            int i4 = abs;
            if (abs > 4) {
                i4 = 8 - abs;
            }
            i3 = i4 == 1 ? 4 : i4 == 2 ? 21 : 25;
        }
        return i3;
    }

    public void updateAllBuildingCosts() {
        Iterator<MapCosts> it = this.movementCostsList.iterator();
        while (it.hasNext()) {
            it.next().updateBuildingCosts();
        }
    }
}
