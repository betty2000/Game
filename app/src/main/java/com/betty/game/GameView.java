package com.betty.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
float posX,posY = 400;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    Log.d("Game", "onDrew:", +getWidth() + "," + getHeight());
    Paint paint = new Paint();
    Paint paint0 = new Paint();
    paint0.setColor(0);
    canvas.drawLine(400,0,0,600,paint);
     Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.dog;
     canvas.drawBitmap(bitmap,posX,posY,paint);
}