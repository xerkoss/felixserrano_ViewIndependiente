package com.felixserrano.viewindependiente;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    private ShapeDrawable figura;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        figura = new ShapeDrawable(new OvalShape());
        figura.getPaint().setColor(0xff0000ff);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        figura.setBounds(0,0,w,h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        figura.draw(canvas);
    }
}
