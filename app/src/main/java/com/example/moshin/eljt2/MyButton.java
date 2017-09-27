package com.example.moshin.eljt2;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Moshin on 26/9/2017.
 */

public class MyButton extends Button {
    public MyButton(Context context) {
        super(context);
        setBackground();
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackground();
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setBackground();
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setBackground();
    }

    private void setBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0xFF006DE8);
        gradientDrawable.setCornerRadius(10);
        gradientDrawable.setStroke(1,0xFFFFFFFF);
        gradientDrawable.setGradientRadius(5);
        gradientDrawable.setSize(100,100);
        this.setBackgroundDrawable(gradientDrawable);
    }
}
