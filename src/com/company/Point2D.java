package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Point2D {
public float x =0.0f;
public float y =0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x ,float y){
        this.x = x;
        this.y = y;
    }
    public String getXY(){
        float[] array={x,y};
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", XY="+this.getXY() +
                '}';
    }
}
