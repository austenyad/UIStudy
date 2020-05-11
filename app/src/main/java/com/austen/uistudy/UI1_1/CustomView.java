package com.austen.uistudy.UI1_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author : austenYang
 * date: 2020/5/11 18:40
 * company: 普华集团
 * description: 描述
 */
public class CustomView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

        // 设置 绘制颜色
        mPaint.setColor(Color.BLACK);
        // 设置 线条宽度
        // mPaint.setStrokeWidth(300);
        // 设置文字大小
        mPaint.setTextSize(20);
        // 设置抗锯齿开关
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        canvas.drawCircle(300, 300, 79, mPaint);
//        canvas.drawColor(Color.BLACK);

        canvas.drawColor(Color.parseColor("#88880000"));
    }
}
