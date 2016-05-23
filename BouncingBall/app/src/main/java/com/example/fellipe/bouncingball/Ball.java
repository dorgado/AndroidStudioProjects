package com.example.fellipe.bouncingball;

import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;
import java.util.RandomAccess;

/**
 * Created by Fellipe on 21/05/2016.
 */
public class Ball {

    public static int RADIUS_100 = 100;

    private int x;
    private int y;
    private int radius;
    private Paint paint;

    public Ball(){
        radius = RADIUS_100;
        randomizeColor();
    }

    /**
     * Adiciona pixels no X e no Y atual da bola.
     * @param addX Quantidade de pixels que será adicionada na posição x
     * @param addY Quantidade de pixels que será adicionada na posição y
     */
    public void move(int addX, int addY){
        this.x += addX;
        this.y += addY;
    }

    /**
     * Modifica a cor da bola para uma cor randômica
     */
    public void randomizeColor(){
        Random r = new Random();
        paint.setColor(Color.rgb(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

}
