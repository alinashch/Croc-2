package com.company.Task5;

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
    public boolean calculateTheArea(int x, int y){
        if(Math.abs(CentreX-x)* Math.abs(CentreX-x) + Math.abs(CenterY-y)* Math.abs(CenterY-y) <=R*R ){
            return true;
        }
        return false;
    }
    @Override
    public void move(int dx, int  dy){
        CentreX+=dx;
        CenterY+=dy;
    }
}
