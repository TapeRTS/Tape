package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.CollisionEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/PhysicalObject.class */
public abstract class PhysicalObject extends RenderedObject {
    public CollisionEngine.CollisionType cType;
    public int collisionId;
    public int halfObjectHeight;
    public int halfObjectWidth;
    public int objectHeight;
    public int objectWidth;

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void remove() {
        super.remove();
    }
}
