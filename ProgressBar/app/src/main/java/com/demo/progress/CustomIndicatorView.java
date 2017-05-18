package com.demo.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hariharan on 18-05-2017.
 */

public class CustomIndicatorView extends View {
    Paint paintDash;
    DashPathEffect dashPath;

    public CustomIndicatorView(Context context) {
        super(context);
        setupPaint();
    }

    private void setupPaint() {
        paintDash = new Paint();
        paintDash.setColor(Color.parseColor("#E0E0E0"));
        dashPath = new DashPathEffect(new float[]{10,10}, (float)25.0);
        paintDash.setPathEffect(dashPath);
        paintDash.setStyle(Paint.Style.STROKE);
        paintDash.setStrokeWidth(8);

    }

    public CustomIndicatorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setupPaint();
    }

    public CustomIndicatorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setupPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
       // super.onDraw(canvas);
        canvas.drawCircle(100, 100, 42, paintDash);




    }
}
