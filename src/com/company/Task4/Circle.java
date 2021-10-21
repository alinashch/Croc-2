package com.company.Task4;

public class Circle extends  Figure  {
    private int R;
    public Circle( int CenterX, int CenterY , int R){
        this.CentreX=CenterX;
        this.CenterY=CenterY;
        this.R=R;

    }
    public int getR(){
        return R;
    }
    @Override
    public int getCentreX() {
        return CentreX;
    }

    @Override
    public int getCenterY() {
         return CenterY;
    }
    @Override
    public String toString(){
        return String.format("C (%d, %d) %d", getCentreX(), getCenterY(), getR());
    }

}
