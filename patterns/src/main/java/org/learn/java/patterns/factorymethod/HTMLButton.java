package org.learn.java.patterns.factorymethod;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a HTML Button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicking a HTML Button");
    }
}
