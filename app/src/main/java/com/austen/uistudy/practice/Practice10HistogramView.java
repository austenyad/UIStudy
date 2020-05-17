package com.austen.uistudy.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.austen.uistudy.utils.Util;

import androidx.annotation.Nullable;

public class Practice10HistogramView extends View {

    private static final String TAG = "Practice10HistogramView";
    private final        Paint  mPaint;
    private final        int    mScreenWidth;


    private float xAxisWidth  = 870;
    private float yAxisHeight = 600;
    private float oX          = 180;
    private float oY          = 700;

    private float gap    = 30;
    private float gWidth = 90;
    private int   froyoH = 700;
    private int   count  = 7;

    private String[] str = new String[]{
            "Froyo", "GB", "ICS", "JB", "Kitkat", "L", "M"
    };


    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mScreenWidth = Util.getScreenWidth();
        mPaint.setColor(Color.WHITE);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        // x 轴
        canvas.drawLine(oX, oY, oX + xAxisWidth, oY, mPaint);

        // y 轴
        canvas.drawLine(oX, oY, oX, oY - yAxisHeight, mPaint);

        mPaint.setColor(Color.GREEN);


        for (int i = 0; i < count; i++) {
            canvas.drawRect(oX + gap * (i + 1) + gWidth * i,
                    (float) (oY - (froyoH * Math.random())),
                    oX + gap * (i + 1) + gWidth * (i + 1),
                    oY, mPaint);
        }

        for (int i = 0; i < str.length; i++) {

            mPaint.setColor(Color.WHITE);
            mPaint.setTextSize(26);

            float measureText = mPaint.measureText(str[i]);

            canvas.drawText(str[i],
                    oX + gap * (i + 1) + gWidth * i + gWidth / 2 - measureText / 2,
                    oY + 30, mPaint);


        }
        //        // Froyo
        //        canvas.drawRect(oX + gap,
        //                oY - froyoH,
        //                oX + gap + gWidth,
        //                oY, mPaint);
        //
        //
        //        // GB
        //        canvas.drawRect(oX + gap * 2 + gWidth,
        //                oY - 200,
        //                oX + gap * 2 + gWidth * 2,
        //                oY, mPaint);
        //
        //
        //        //ICS
        //        canvas.drawRect(oX + gap * 3 + gWidth * 2,
        //                oY - 500,
        //                oX + gap * 3 + gWidth * 3,
        //                oY, mPaint);
        //
        //        //JB
        //
        //        canvas.drawRect(oX + gap * 4 + gWidth * 3,
        //                oY - 300,
        //                oX + gap * 4 + gWidth * 4,
        //                oY, mPaint);
        //
        //        // KitKat
        //
        //        canvas.drawRect(oX + gap * 5 + gWidth * 4,
        //                oY - 40,
        //                oX + gap * 5 + gWidth * 5,
        //                oY, mPaint);
        //
        //
        //        // L
        //        canvas.drawRect(oX + gap * 6 + gWidth * 5,
        //                oY - 100,
        //                oX + gap * 6 + gWidth * 6,
        //                oY, mPaint);
        //
        //
        //        canvas.drawRect(oX + gap * 6 + gWidth * 6 + gap,
        //                oY - 69,
        //                oX + gap * 6 + gWidth * 6 + gap + gWidth,
        //                oY, mPaint);


        //        mPaint.setColor(Color.WHITE);
        //        mPaint.setTextSize(26);
        //
        //        float froyo = mPaint.measureText("Froyo");
        //
        //        canvas.drawText("Froyo", oX + gap + gWidth / 2 - froyo / 2, oY + 30, mPaint);
        //
        //
        //        canvas.drawText("GB", oX + gap + gWidth / 2 - froyo / 2, oY + 30, mPaint);
    }


}
