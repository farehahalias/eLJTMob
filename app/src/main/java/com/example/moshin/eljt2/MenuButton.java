package com.example.moshin.eljt2;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Moshin on 26/9/2017.
 */

public class MenuButton extends Button {
    public MenuButton(Context context) {
        super(context);
        setBackground();
    }

    public MenuButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackground();
    }

    public MenuButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setBackground();
    }

    public MenuButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setBackground();
    }

    private void setBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0xFF5b8140);
        gradientDrawable.setCornerRadius(5);
        gradientDrawable.setStroke(1,0xFFFFFFFF);
        gradientDrawable.setGradientRadius(5);
        gradientDrawable.setSize(100,120);
        this.setBackgroundDrawable(gradientDrawable);
    }
}
