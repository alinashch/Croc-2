package com.company.Task5;

public  class Figure implements Figures , Movable{
    public int  CentreX;
    public int CenterY;

    @Override
    public  int getCentreX(){
        return CentreX;
    }
    @Override
    public  int getCenterY(){

        return CenterY;
    }
    @Override
    public  String toString(){
        return String.format(" (%d, %d) ", getCentreX(), getCenterY());
    }

    public boolean calculateTheArea(int x, int y){
        return false;
    }

    @Override
    public void move(int dx, int dy) {

    }
}
