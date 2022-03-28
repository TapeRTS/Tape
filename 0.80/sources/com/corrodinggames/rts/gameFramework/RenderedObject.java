package com.corrodinggames.rts.gameFramework;

import java.util.Comparator;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/RenderedObject.class */
public abstract class RenderedObject extends GameObject {
    public float x;
    public float y;
    public float height = 0.0f;
    public int drawOrder = 0;

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/RenderedObject$RenderedObjectComparator.class */
    public static class RenderedObjectComparator implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return (!(obj instanceof RenderedObject) || !(obj2 instanceof RenderedObject)) ? 0 : ((RenderedObject) obj).drawOrder - ((RenderedObject) obj2).drawOrder;
        }
    }
}
