package org.learn.java.patterns.prototype;

public class Circle extends Shape {
    private final int radius;

    Circle() {
        super(0, 0, "red");
        this.radius = 1;
    }

    Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
