package com.company;

import java.util.Arrays;

public class Point3D extends Point2D{
public float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String getXYZ(){
        float[] arr = {x,y,z};
        return Arrays.toString(arr);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", XYZ="+this.getXYZ()+
                '}';
    }
}
