package org.learn.java.patterns.prototype;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}
