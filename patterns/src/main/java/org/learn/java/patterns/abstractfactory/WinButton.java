package org.learn.java.patterns.abstractfactory;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
