package com.corrodinggames.rts.appFramework;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/WrappingLayout.class */
public class WrappingLayout extends ViewGroup {
    static final /* synthetic */ boolean $assertionsDisabled;
    private int line_height;

    static {
        $assertionsDisabled = !WrappingLayout.class.desiredAssertionStatus();
    }

    public WrappingLayout(Context context) {
        super(context);
    }

    public WrappingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.LayoutParams;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(1, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            paddingLeft = paddingLeft;
            paddingTop = paddingTop;
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                childAt.getLayoutParams();
                int i6 = paddingLeft;
                paddingTop = paddingTop;
                if (paddingLeft + measuredWidth > i3 - i) {
                    i6 = getPaddingLeft();
                    paddingTop += this.line_height;
                }
                childAt.layout(i6, paddingTop, i6 + measuredWidth, paddingTop + measuredHeight);
                paddingLeft = i6 + measuredWidth;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        if ($assertionsDisabled || View.MeasureSpec.getMode(i) != 0) {
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
            int childCount = getChildCount();
            int i4 = 0;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                i4 = i4;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
                if (childAt.getVisibility() != 8) {
                    childAt.getLayoutParams();
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    int measuredWidth = childAt.getMeasuredWidth();
                    i4 = Math.max(i4, childAt.getMeasuredHeight());
                    int i6 = paddingLeft;
                    paddingTop = paddingTop;
                    if (paddingLeft + measuredWidth > size) {
                        i6 = getPaddingLeft();
                        paddingTop += i4;
                    }
                    paddingLeft = i6 + measuredWidth;
                }
            }
            this.line_height = i4;
            if (View.MeasureSpec.getMode(i2) == 0) {
                i3 = paddingTop + i4;
            } else {
                i3 = size2;
                if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
                    i3 = size2;
                    if (paddingTop + i4 < size2) {
                        i3 = paddingTop + i4;
                    }
                }
            }
            setMeasuredDimension(size, i3);
            return;
        }
        throw new AssertionError();
    }
}
