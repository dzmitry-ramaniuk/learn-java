package org.learn.java.patterns.abstractfactory;

public class Application {
    private GuiFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        this.factory = factory;
    }

    void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    void paint() {
        button.paint();
        checkbox.paint();
    }
}
