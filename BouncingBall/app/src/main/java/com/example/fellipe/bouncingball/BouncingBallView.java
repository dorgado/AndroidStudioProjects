package com.example.fellipe.bouncingball;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by Fellipe on 21/05/2016.
 */
public class BouncingBallView extends ImageView{

    private Ball ball;
    private int speedX = 5;
    private int speedY = 5;

    public BouncingBallView(Context context) {
        super(context);
        ball = new Ball();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        ball.randomizeColor();
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        ball.move(speedX, speedY);
        checkBorderCollision();
        canvas.drawCircle(ball.getX(),ball.getY(),ball.getRadius(),ball.getPaint());

        invalidate();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        ball.setX(getWidth()/2);
        ball.setY(getHeight()/2);
    }

    /**
     * Verifica colisão da bola com os limites da View. Quando colide com o limite da view inverte
     * o valor da speed referente a horientação da colisão
     */
    private void checkBorderCollision() {
        if((ball.getX()+ball.getRadius()) > getRight() || (ball.getX()-ball.getRadius()) < getLeft()) {
            speedX = -speedX;
        }
        if((ball.getY()+ball.getRadius()) > getBottom() || (ball.getY()-ball.getRadius()) < getTop()){
            speedY = -speedY;
        }
    }
}
