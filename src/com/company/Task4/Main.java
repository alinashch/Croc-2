package com.company.Task4;

public class Main {

    public static void main(String[] args) {
        Annotation [] annotations = new Annotation[]{
                new Annotation(new Circle(100, 100, 10), "Tree") ,
                new Annotation(new Rectangle(100, 100, 150, 200), "Car")
        };
        AnnotatedImage AnnotatedImage=new AnnotatedImage(" ", annotations);
        for (Annotation annotation : AnnotatedImage.getAnnotations()) {
            System.out.println(annotation);
        }
    }
}
