package com.corrodinggames.rts.appFramework;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ListView;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/ExpandedListView.class */
public class ExpandedListView extends ListView {
    private int old_count = 0;
    private ViewGroup.LayoutParams params;

    public ExpandedListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void calculateListHeight() {
        if (getCount() != this.old_count) {
            this.old_count = getCount();
            this.params = getLayoutParams();
            this.params.height = getCount() * (this.old_count > 0 ? getChildAt(0).getHeight() : 0);
            setLayoutParams(this.params);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        calculateListHeight();
        super.onDraw(canvas);
    }
}
