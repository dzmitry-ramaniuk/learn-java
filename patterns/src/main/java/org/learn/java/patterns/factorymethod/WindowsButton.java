package org.learn.java.patterns.factorymethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Window Button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicking a Window Button");
    }
}
