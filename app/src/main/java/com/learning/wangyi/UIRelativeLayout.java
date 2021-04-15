package com.learning.wangyi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class UIRelativeLayout extends RelativeLayout {
    boolean isFirstIn = true;

    public UIRelativeLayout(Context context) {
        this(context,null);
    }

    public UIRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs,0);
    }

    public UIRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        //如果不是第一次进入，而是重新测绘，则不需要进行缩放
        if(isFirstIn) {
            float scaleX = UIUtils.getInstance().getHorizontalScaleValue();
            float scaleY = UIUtils.getInstance().getVerticalScaleValue();

            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = getChildAt(i);
                LayoutParams params = (LayoutParams) child.getLayoutParams();
                params.width = (int) (params.width * scaleX);
                params.height = (int) (params.height * scaleY);
                params.leftMargin = (int) (params.leftMargin * scaleX);
                params.rightMargin = (int) (params.rightMargin * scaleX);
                params.topMargin = (int) (params.topMargin * scaleY);
                params.bottomMargin = (int) (params.bottomMargin * scaleY);
            }

            isFirstIn = false;
        }
    }
}
