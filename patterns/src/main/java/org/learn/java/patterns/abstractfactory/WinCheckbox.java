package org.learn.java.patterns.abstractfactory;

public class WinCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Windows Checkbox");
    }
}
