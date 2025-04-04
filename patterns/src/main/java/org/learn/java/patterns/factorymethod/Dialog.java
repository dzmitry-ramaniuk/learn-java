package org.learn.java.patterns.factorymethod;

public abstract class Dialog {
    void render() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();

    }

    abstract Button createButton();
}
