package com.company.Task4;

public class Annotation {
    private Figure Figure;
    private String String;
    public Annotation(Figure Figure,String String){
        this.Figure=Figure;
        this.String=String;
    }
    public Figure getFigure(){
        return Figure;
    }
    public String getString(){
        return String;
    }
    @Override
    public String toString(){
        return getFigure().toString()+ ":"+ getString();
    }
}
