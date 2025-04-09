package org.learn.java.patterns.prototype;

public class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle() {
        super(0, 0, "blue");
        this.width = 1;
        this.height = 1;
    }

    Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
