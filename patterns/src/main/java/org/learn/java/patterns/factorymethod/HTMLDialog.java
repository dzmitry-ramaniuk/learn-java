package org.learn.java.patterns.factorymethod;

public class HTMLDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
