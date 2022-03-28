package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/CollisionEngine.class */
public class CollisionEngine {
    public static final byte coll_all = 1;
    public static final byte coll_basic = 3;
    public static final byte coll_basicJumpThough = 4;
    public static final byte coll_box = 13;
    public static final byte coll_button = 35;
    public static final byte coll_character = 10;
    public static final byte coll_characterHeadCheck = 11;
    public static final byte coll_characterOnly = 40;
    public static final byte coll_key = 21;
    public static final byte coll_movable = 60;
    public static final byte coll_noCollide = 2;
    public static final byte coll_tileCliff = 54;
    public static final byte coll_tileGround = 50;
    public static final byte coll_tileWater = 52;
    public static final byte coll_unitGround = 45;
    public CollisionType tileCliff;
    public CollisionType tileGround;
    ArrayList<CollisionType> collisionTypeList = new ArrayList<>();
    public CollisionType all = getCollisionType((byte) 1);
    public CollisionType noCollide = getCollisionType((byte) 2);
    public CollisionType basic = getCollisionType((byte) 3);
    public CollisionType basicJumpThough = getCollisionType((byte) 4);
    public CollisionType character = getCollisionType((byte) 10);
    public CollisionType characterHeadCheck = getCollisionType((byte) 11);
    public CollisionType box = getCollisionType((byte) 13);
    public CollisionType key = getCollisionType((byte) 21);
    public CollisionType button = getCollisionType((byte) 35);
    public CollisionType characterOnly = getCollisionType((byte) 40);
    public CollisionType unitGround = getCollisionType((byte) 45);
    public CollisionType tileWater = getCollisionType((byte) 52);
    public CollisionType movable = getCollisionType((byte) 60);

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/CollisionEngine$CollisionType.class */
    public static strict class CollisionType {
        HashMap<Byte, CollisionType> collidesWith = new HashMap<>();
        public byte id;

        public void addCollision(CollisionType collisionType) {
            this.collidesWith.put(Byte.valueOf(collisionType.id), collisionType);
        }

        public boolean getCollidesWith(CollisionType collisionType) {
            return collisionType == null ? false : this.collidesWith.containsKey(Byte.valueOf(collisionType.id));
        }

        public void remove() {
            this.collidesWith.clear();
            this.id = (byte) 0;
        }
    }

    public CollisionEngine() {
        CollisionType collisionType = this.all;
        collisionType.addCollision(collisionType);
        collisionType.addCollision(getCollisionType((byte) 3));
        collisionType.addCollision(getCollisionType((byte) 4));
        collisionType.addCollision(getCollisionType((byte) 10));
        collisionType.addCollision(getCollisionType((byte) 11));
        collisionType.addCollision(getCollisionType((byte) 13));
        collisionType.addCollision(getCollisionType((byte) 21));
        this.unitGround.addCollision(getCollisionType((byte) 52));
        CollisionType collisionType2 = this.movable;
        collisionType2.addCollision(collisionType2);
        collisionType2.addCollision(getCollisionType((byte) 3));
        collisionType2.addCollision(getCollisionType((byte) 4));
        collisionType2.addCollision(getCollisionType((byte) 10));
        collisionType2.addCollision(getCollisionType((byte) 11));
        collisionType2.addCollision(getCollisionType((byte) 13));
        collisionType2.addCollision(getCollisionType((byte) 21));
        CollisionType collisionType3 = getCollisionType((byte) 10);
        collisionType3.addCollision(getCollisionType((byte) 3));
        collisionType3.addCollision(getCollisionType((byte) 4));
        collisionType3.addCollision(getCollisionType((byte) 10));
        collisionType3.addCollision(getCollisionType((byte) 13));
        collisionType3.addCollision(getCollisionType((byte) 40));
        CollisionType collisionType4 = getCollisionType((byte) 11);
        collisionType4.addCollision(getCollisionType((byte) 3));
        collisionType4.addCollision(getCollisionType((byte) 10));
        collisionType4.addCollision(getCollisionType((byte) 13));
        collisionType4.addCollision(getCollisionType((byte) 40));
        CollisionType collisionType5 = getCollisionType((byte) 3);
        collisionType5.addCollision(getCollisionType((byte) 3));
        collisionType5.addCollision(getCollisionType((byte) 4));
        collisionType5.addCollision(getCollisionType((byte) 10));
        collisionType5.addCollision(getCollisionType((byte) 13));
        CollisionType collisionType6 = getCollisionType((byte) 4);
        collisionType6.addCollision(getCollisionType((byte) 3));
        collisionType6.addCollision(getCollisionType((byte) 4));
        collisionType6.addCollision(getCollisionType((byte) 10));
        collisionType6.addCollision(getCollisionType((byte) 13));
        CollisionType collisionType7 = getCollisionType((byte) 13);
        collisionType7.addCollision(getCollisionType((byte) 3));
        collisionType7.addCollision(getCollisionType((byte) 4));
        collisionType7.addCollision(getCollisionType((byte) 10));
        collisionType7.addCollision(getCollisionType((byte) 13));
        CollisionType collisionType8 = getCollisionType((byte) 21);
        collisionType8.addCollision(getCollisionType((byte) 3));
        collisionType8.addCollision(getCollisionType((byte) 4));
        collisionType8.addCollision(getCollisionType((byte) 10));
        collisionType8.addCollision(getCollisionType((byte) 13));
        CollisionType collisionType9 = this.button;
        collisionType9.addCollision(getCollisionType((byte) 10));
        collisionType9.addCollision(getCollisionType((byte) 13));
    }

    public CollisionType getCollisionType(byte b) {
        CollisionType collisionType;
        Iterator<CollisionType> it = this.collisionTypeList.iterator();
        while (true) {
            if (it.hasNext()) {
                collisionType = it.next();
                if (collisionType.id == b) {
                    break;
                }
            } else {
                collisionType = new CollisionType();
                collisionType.id = b;
                this.collisionTypeList.add(collisionType);
                break;
            }
        }
        return collisionType;
    }
}
