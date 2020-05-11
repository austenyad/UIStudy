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
 * Date       : 2020/5/11 22:19
 */
class PathView extends View {
    public PathView(Context context) {
        this(context,null);
    }

    public PathView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public PathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }


    Paint paint = new Paint();
    Path path = new Path();

    {
        paint.setColor(Color.BLACK);
        path.addArc(200,200,400,400,-255,255);
        path.arcTo(400,200,600,400,-180,255,false);
        path.lineTo(400,542);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawPath(path,paint); // 绘制出 path 描述的图形（心形），大功告成
    }
}
