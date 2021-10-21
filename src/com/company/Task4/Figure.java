package com.company.Task4;

public  class Figure implements Figures{
    public int  CentreX;
    public int CenterY;

    public  int getCentreX(){
        return CentreX;
    }

    public  int getCenterY(){
        return CenterY;
    }
    public  String toString(){
       return String.format(" (%d, %d) ", getCentreX(), getCenterY());
    }

}
