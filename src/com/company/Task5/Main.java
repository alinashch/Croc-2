package com.company.Task5;



public class Main {
    public static void main(String[] args) {
        Annotation[] annotations = new Annotation[]{
                new Annotation(new Circle(100, 100, 10), "Tree"),
                new Annotation(new Rectangle(100, 100, 150, 200), "Car")
        };
        AnnotatedImage AnnotatedImage = new AnnotatedImage(" ", annotations);

        System.out.println(AnnotatedImage.findByLabel("Tree"));
        System.out.println(AnnotatedImage.findByPoint(150, 150));

        System.out.println();
        annotations[0].getFigure().move(200,200);
        annotations[1].getFigure().move(100,100);
        for (Annotation annotation : AnnotatedImage.getAnnotations()) {
            System.out.println(annotation);
        }

        }

}
