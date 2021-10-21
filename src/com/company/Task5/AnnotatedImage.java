package com.company.Task5;

public class AnnotatedImage {
    private final String imagePath;
    private final Annotation [] annotations;
    public AnnotatedImage(String imagePath,Annotation[] annotations ){
        this.imagePath=imagePath;
        this.annotations=annotations;
    }

    public Annotation[] getAnnotations(){
        return this.annotations;
    }

    public Annotation findByPoint(int x, int y){
        for (Annotation annotation : annotations){
            if(annotation.getFigure().calculateTheArea(x, y)){
                return annotation;
            }
        }
        return null;
    }

    public Annotation findByLabel( String label){
        for (Annotation annotation : annotations){
            if(annotation.getString().contains(label)){
                return annotation;
            }
        }
        return null;
    }

}
