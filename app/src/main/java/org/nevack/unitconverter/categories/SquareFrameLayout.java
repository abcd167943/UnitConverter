package org.nevack.unitconverter.categories;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SquareFrameLayout extends FrameLayout{
    public SquareFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = width * 3 / 4;

        heightMeasureSpec = MeasureSpec.makeMeasureSpec(height,
                MeasureSpec.getMode(widthMeasureSpec));

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
