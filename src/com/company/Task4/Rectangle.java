package com.company.Task4;

public class Rectangle extends Figure {
    private  int X2;
    private int Y2;
    public Rectangle(int CenterX, int CenterY, int X2, int Y2){
        this.CentreX=CenterX;
        this.CenterY=CenterY;
        this.X2=X2;
        this.Y2=Y2;
    }
    @Override
    public int getCentreX() {
     return CentreX;
    }

    @Override
    public int getCenterY() {
        return CenterY;
    }
    public int getX2(){
        return X2;
    }
    public int getY2(){
        return Y2;
    }
    @Override
    public String toString(){
        return String.format("R (%d, %d),(%d, %d)", getCentreX(), getCenterY(), getX2(), getY2());
    }
}
