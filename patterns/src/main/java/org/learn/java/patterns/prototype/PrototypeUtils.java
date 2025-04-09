package org.learn.java.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeUtils {

    private List<Shape> shapes = new ArrayList<>();

    public void configure() {
        Circle circle = new Circle();
        shapes.add(circle);

        Circle circle2 = (Circle) circle.clone();
        shapes.add(circle2);

        Rectangle rectangle = new Rectangle();
        shapes.add(rectangle);
    }

    public List<Shape> copyShapes() {
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        return shapesCopy;
    }
}
