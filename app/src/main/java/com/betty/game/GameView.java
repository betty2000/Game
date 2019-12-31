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
    private float posX, posY = 400;
    Dog dog;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (dog == null) {
            dog = new Dog(this);
        }
        super.onDraw(canvas);
        Log.d("Game", "onDrew:" + getWidth() + "," + getHeight());
        Paint paint = new Paint();
        Paint paint0 = new Paint();
        paint0.setColor(0);
        canvas.drawLine(400, 0, 0, 600, paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dog);
        canvas.drawBitmap(bitmap, posX, posY, paint);
    }


    public void moveDown() {
        if (dog.getY() < getHeight() - 150) {
            dog.setDirection(Dog.DIRECTION_DOWN);
            invalidate();
        }
    }

    public void moveUp() {
        if (dog.getY() > 50) {
            dog.setDirection(Dog.DIRECTION_UP);
            invalidate();
        }
    }

    public void moveRight() {
        if (dog.getX() < getWidth() - 150) {
            dog.setDirection(Dog.DIRECTION_RIGHT);
            invalidate();
        }
    }

    public void moveLeft() {
        if (dog.getX() > 50) {
            dog.setDirection(Dog.DIRECTION_LEFT);
            invalidate();
        }
    }
}