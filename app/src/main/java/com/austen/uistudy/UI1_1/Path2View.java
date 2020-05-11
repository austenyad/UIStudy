package com.austen.uistudy.UI1_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * Description:
 * Copyright  : Copyright (c) 2018
 * Company    : Nothing
 * Author     : austen
 * Date       : 2020/5/11 22:56
 */
class Path2View extends View {
    public Path2View(Context context) {
        this(context, null);
    }

    public Path2View(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public Path2View(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private Path path = new Path();

    {
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
//        path.addCircle(300, 300, 200, Path.Direction.CW);
//        path.addCircle(500, 300, 200, Path.Direction.CCW);


        path.lineTo(100,100);
        path.moveTo(200,100);
        path.lineTo(200,0);


    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        
         canvas.drawPath(path,paint);
    }
}
